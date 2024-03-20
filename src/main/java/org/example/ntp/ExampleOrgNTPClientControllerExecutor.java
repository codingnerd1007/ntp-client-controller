package org.example.ntp;

import com.google.common.base.Strings;
import org.apache.commons.net.util.SubnetUtils;
import org.example.ntp.util.ExampleOrgSSHUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;

public class ExampleOrgNTPClientControllerExecutor
{
    private static final Logger logger = LoggerFactory.getLogger(ExampleOrgNTPClientControllerExecutor.class);
    public static void main(String[] args)
    {
        HashMap<String, ExampleOrgSSHUtil> sshMap = null;

        try
        {
            String currentHostIp = ExampleOrgNTPClientControllerHelper.getHostNetworkDetails();

            if (!Strings.isNullOrEmpty(currentHostIp))
            {
                logger.info("current hosts' ip : " + currentHostIp);

                List<String> allHosts = ExampleOrgNTPClientControllerHelper.getReachableHosts(currentHostIp);

                if (allHosts != null && !allHosts.isEmpty())
                {
                    List<String> sshHosts = ExampleOrgNTPClientControllerHelper.removeBlackListedHosts(allHosts);

                    logger.info("Total ssh hosts : " + sshHosts.size());

                    sshMap = ExampleOrgNTPClientControllerHelper.createSSHSession(sshHosts.toArray(new String[0]));

                    if (sshMap!=null && !sshMap.isEmpty())
                    {

                    }
                }
                else
                {
                    logger.warn("unable to get current hosts' ip details");
                }
            }

            else
            {
                logger.warn("unable to get current hosts' ip details");
            }



        }
        catch(Exception exception)
        {
            logger.error("", exception);
        }
        finally {
            logger.info("Killing ssh connections");
            if (sshMap!=null)
            {
                for(ExampleOrgSSHUtil sshUtil : sshMap.values())
                {
                    try {

                        if (sshUtil!=null)
                            sshUtil.close();
                    }
                    catch (Exception exception)
                    {

                    }
                }
            }
            logger.info("Execution completed");

            System.exit(0);
        }

    }

}
