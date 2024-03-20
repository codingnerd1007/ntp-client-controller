package org.example.ntp;

import org.example.ntp.util.ExampleOrgSSHUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleOrgNTPClientControllerHelper
{
    private static final Logger logger = LoggerFactory.getLogger(ExampleOrgNTPClientControllerHelper.class);

    AtomicInteger totalCores = new AtomicInteger();
    static String getHostNetworkDetails()
    {
        String address = null;

        try
        {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements())
            {
                NetworkInterface networkInterface = interfaces.nextElement();

                if (networkInterface.isUp())
                {
                    for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses())
                    {
                        InetAddress inetAddress = interfaceAddress.getAddress();

                        if (!inetAddress.isLinkLocalAddress() && !inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address)
                        {
                            short subnetMask = interfaceAddress.getNetworkPrefixLength();

                            address = inetAddress.getHostAddress() + "/" + subnetMask;

                            logger.info("host's ip : " + address);
                        }
                    }
                }
            }
        }
        catch (Exception exception)
        {
            logger.error("", exception);
        }

        return address;
    }

    public static List<String> getReachableHosts(String currentHostIp)
    {
        List<String> rechableIpsList = null;

        HashSet<String> reachableIps = new LinkedHashSet<>();

        try
        {
            ProcessBuilder pb = new ProcessBuilder("fping", "-a", "-q", "-g", currentHostIp);
//            pb.redirectErrorStream(true);
            Process process = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while ((line = reader.readLine()) != null)
            {
                if(!line.contains("duplicate"))
                {
                    reachableIps.add(line);
                }
            }
            // Wait for the command to finish and get the exit code
            int exitCode = process.waitFor();

            if (exitCode != 0)
            {
                logger.warn("Command execution failed with exit code " + exitCode);
            }

            logger.info("Total reachable ips : " + reachableIps.size());

            rechableIpsList = new ArrayList<>(reachableIps);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return rechableIpsList;
    }

    public static List<String> removeBlackListedHosts(List<String> allHosts)
    {
        // removed aiops load testing servers
        allHosts.remove("172.16.15.226");
        allHosts.remove("172.16.15.227");
        allHosts.remove("172.16.15.228");

        return allHosts;
    }

    public static HashMap<String,ExampleOrgSSHUtil> createSSHSession(String[] sshHosts)
    {
        HashMap<String,ExampleOrgSSHUtil> sshMap = null;

        int cores = Runtime.getRuntime().availableProcessors();

        List<Future<HashMap<String,ExampleOrgSSHUtil>>> futures = new ArrayList<>();

        ExampleOrgNTPClientControllerHelper exampleOrgNTPClientControllerHelper = new ExampleOrgNTPClientControllerHelper();

        try {
            ExecutorService executorService = Executors.newFixedThreadPool(cores);

            int chunkSize = sshHosts.length/cores;

            for (int i = 0; i < cores; i++) {
                int startIndex = i * chunkSize;
                int endIndex = (i == cores - 1) ? sshHosts.length : (i + 1) * chunkSize;
                String[] ipsToSSH = new String[endIndex - startIndex];
                System.arraycopy(sshHosts, startIndex, ipsToSSH, 0, endIndex - startIndex);

                Future<HashMap<String,ExampleOrgSSHUtil>> future = executorService.submit(new SSHExecutor(ipsToSSH, exampleOrgNTPClientControllerHelper.totalCores));
                futures.add(future);
            }

            sshMap = new HashMap<>();
            for (Future<HashMap<String,ExampleOrgSSHUtil>> future : futures) {
                try {
                    HashMap<String,ExampleOrgSSHUtil> result = future.get();
                    sshMap.putAll(result);
                } catch (Exception exception) {
                    logger.error("", exception);
                }
            }

            executorService.shutdown();

            logger.info("Total number of ssh hosts : " + sshMap.size());
            logger.info("Total available cores : " + exampleOrgNTPClientControllerHelper.totalCores);

        }
        catch (Exception exception)
        {
            logger.error("", exception);
        }

        return sshMap;
    }

    static class SSHExecutor implements Callable<HashMap<String,ExampleOrgSSHUtil>>
    {

        private String[] ipsToSSH;

        private AtomicInteger totalCores;

        public SSHExecutor(String[] ipsToSSH, AtomicInteger totalCores)
        {
            this.ipsToSSH = ipsToSSH;
            this.totalCores = totalCores;
        }

        @Override
        public HashMap<String,ExampleOrgSSHUtil> call() throws Exception
        {
            HashMap<String,ExampleOrgSSHUtil> sshMap = new HashMap<>();

            try {


                for (String ip : ipsToSSH) {
                    ExampleOrgSSHUtil sshUtil;

                    try {


                        if ((sshUtil = ExampleOrgSSHUtil.getNewSSHObject(ip, 22, "motadata", "motadata", 20)) == null) {
                            if ((sshUtil = ExampleOrgSSHUtil.getNewSSHObject(ip, 22, "root", "motadata", 20)) == null) {
                                sshUtil = ExampleOrgSSHUtil.getNewSSHObject(ip, 22, "manage", "wireless", 20);
                            }
                        }
                        if (sshUtil != null) {
                            logger.info("ssh connection established for : " + ip);
                            sshMap.put(ip, sshUtil);
                            String availableCores;
                            if ((availableCores = sshUtil.executeCommand("nproc")) != null) {
                                availableCores = availableCores.trim();

                                logger.info("available cores for : " + ip + " , cores: " + availableCores);

                                totalCores.addAndGet(Integer.parseInt(availableCores));
                            }
                        }
                    }
                    catch (Exception exception)
                    {
                        logger.error("", exception);
                    }
                }
            }
            catch (Exception exception)
            {
                logger.error("", exception);
            }
            return sshMap;
        }

    }

    public static void main(String[] args) throws Exception{
        ExampleOrgSSHUtil sshUtil = ExampleOrgSSHUtil.getNewSSHObject("localhost",22,"rahil","Mind@123", 300);

        System.out.println(sshUtil.executeCommand("java -jar /home/rahil/project/ntp/ntp-client-payload-1.0-SNAPSHOT-shaded.jar 2024-03-20T09:15:00 Asia/Kolkata 172.16.13.81"));

    }

}
