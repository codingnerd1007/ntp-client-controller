package org.example.ntp.util;

//import com.google.api.client.util.Strings;
import com.google.api.client.util.Strings;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
//import com.motadata.traceorg.sdk.util.*;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: vmehta
 * Date: 08-03-2016
 * Time: 5:29 PM
 */
public class ExampleOrgSSHUtil implements ExampleOrgAbstractCommonUtil, Closeable
{

    private Session m_session = null;

    private final String m_host;

    private final int m_port;

    private final String m_userName;

    private final String m_password;

    private final String m_keyFilePath;

    private final String m_passphrase;

    private final int m_timeout;

//    private static final TraceOrgLogger _logger = new TraceOrgLogger(ExampleOrgSSHUtil.class, "SSH Util");

//    private static final TraceOrgUpgradeLogger _upgrade_logger = new TraceOrgUpgradeLogger(ExampleOrgSSHUtil.class, "SSH Util");

    public Session getSession()
    {
        return this.m_session;
    }

    public static ExampleOrgSSHUtil getSSHUtilObject(String hostAddress, int port, String username, String password, int timeOut){
        return new ExampleOrgSSHUtil(hostAddress, port, username, password, timeOut);
    }


    public static ExampleOrgSSHUtil getSSHUtilObject(String hostAddress,  String username, String password, int timeOut){
        return new ExampleOrgSSHUtil(hostAddress, username, password, timeOut);
    }

    public ExampleOrgSSHUtil(String ipAddress, String userName, String password)
    {

        this(ipAddress, 22, userName, password, null, null, 60);
    }

    public ExampleOrgSSHUtil(String ipAddress, String userName, String password, int timeout)
    {

        this(ipAddress, 22, userName, password, null, null, timeout);
    }

    public ExampleOrgSSHUtil(String ipAddress, int port, String userName, String password, int timeout)
    {

        this(ipAddress, port, userName, password, null, null, timeout);
    }

    public ExampleOrgSSHUtil(String ipAddress, int port, String userName, String password, String keyFilePath, String passphrase, int timeout)
    {

        this.m_host = ipAddress;

        this.m_port = port;

        this.m_userName = userName;

        this.m_keyFilePath = keyFilePath;

        this.m_passphrase = passphrase;

        this.m_timeout = timeout;

        this.m_password = password;
    }

    @Override
    public boolean init() throws Exception
    {

        boolean connect;

        if (m_keyFilePath != null && m_keyFilePath.trim().length() != 0)
        {
            connect = connectUsingKey();

        }
        else
        {
            connect = connect();
        }

        if (connect)
        {
            //_logger.debug("connected to " + m_host);
        }
        else
        {
            //_logger.warn("failed to connect to " + m_host);
        }

        return connect;
    }

    @Override
    public void destroy() throws Exception
    {

        disconnect();

    }

    @Override
    public boolean reInit() throws Exception
    {

        destroy();

        return init();
    }

    private boolean connect() throws Exception
    {

        //_logger.debug("checking connection with " + m_host + " and port " + m_port);

        boolean connected = false;

        JSch jsch = new JSch();

        m_session = jsch.getSession(m_userName, m_host, m_port);

        if (m_password != null && m_password.trim().length() > 0)
        {
            m_session.setPassword(m_password);
        }

        m_session.setConfig("StrictHostKeyChecking", "no");

        m_session.connect(m_timeout * 1000);

        m_session.setTimeout(m_timeout * 1000);

        if (m_session.isConnected())
        {
            connected = true;

            //_logger.debug(m_host + ":connection done");
        }
        else
        {
            //_logger.warn(m_host + ":connection failed");
        }


        return connected;
    }

    private boolean connectUsingKey() throws Exception
    {

        //_logger.debug("checking connection with " + m_host + " and port" + m_port + "");

        boolean connected = false;


        JSch jsch = new JSch();

        m_session = jsch.getSession(m_userName, m_host, m_port);

        if (m_passphrase != null)
        {
            jsch.addIdentity(m_keyFilePath, m_passphrase);
        }
        else
        {
            jsch.addIdentity(m_keyFilePath);
        }

        m_session.setConfig("StrictHostKeyChecking", "no");

        m_session.connect(m_timeout * 1000);

        m_session.setTimeout(m_timeout * 1000);


        if (m_session.isConnected())
        {
            connected = true;

            //_logger.debug(m_host + ":connection done");
        }
        else
        {
            //_logger.warn(m_host + ":connection failed");
        }

        return connected;
    }

    private void disconnect()
    {


        if (m_session != null)
        {
            m_session.disconnect();


        }

    }

    public String executeCommand(String command) throws Exception
    {
        return executeCommand(command, true);
    }

    public String executeCommand(String command, boolean wait) throws Exception
    {
        //_logger.debug(this.m_host + ":executing command " + command);

        ChannelExec channel = null;

        InputStream inputStream = null;

        StringBuilder output = new StringBuilder();

        if (this.m_session != null)
        {
            channel = (ChannelExec) this.m_session.openChannel("exec");

            channel.setCommand(command);

            channel.setInputStream(null);

            inputStream = channel.getInputStream();

            channel.connect();

            //_logger.debug(this.m_host + ":checking channel connection");

            if (channel.isConnected())
            {
                //_logger.debug(this.m_host + ":channel is currently connected");

                if (wait)
                {
                    output.append(IOUtils.toString(inputStream));

                    output.append(ExampleOrgSDKConstants.NEW_LINE);

                    //_logger.debug(this.m_host + ":command output " + output.toString());
                }
            }
            else
            {
                //_logger.warn(this.m_host + ":channel is not connected");
            }
        }
        else
        {
            //_logger.warn(this.m_host + ":session is expired");
        }

        if (inputStream != null)
        {
            inputStream.close();

            //_logger.debug(this.m_host + ":channel is closed");
        }

        if (channel != null && !channel.isClosed())
        {
            channel.disconnect();

            //_logger.debug(this.m_host + ":channel is disconnected");
        }

        return output.toString();
    }

    /**
     *
     * MOTADATA-6327 : 7.x | Auto Upgrade h2 to 2.1.214 version
     * Added this method to execute the command and also get the error stream in addition to the output stream
     *
     * @param command - comand to execute
     * @return - returens the result of the command fired
     * @throws Exception
     */
    public String executeCommandWithErrorStream(String command) throws Exception
    {
        //_logger.debug(this.m_host + ":executing command " + command);

        ChannelExec channel = null;

        InputStream inputStream = null;

        StringBuilder output = new StringBuilder();

        if (this.m_session != null)
        {
            channel = (ChannelExec) this.m_session.openChannel("exec");

            channel.setCommand(command);

            channel.setInputStream(null);

            inputStream = channel.getInputStream();

            ByteArrayOutputStream errorStream = new ByteArrayOutputStream();

            channel.setErrStream(errorStream);

            channel.connect();

            //_logger.debug(this.m_host + ":checking channel connection");

            if (channel.isConnected())
            {
                //_logger.debug(this.m_host + ":channel is currently connected");

                output.append(IOUtils.toString(inputStream));

                output.append(ExampleOrgSDKConstants.NEW_LINE);

                if(Strings.isNullOrEmpty(getStringValue(output).trim()))
                {
                    String errOutput = errorStream.toString();

                    if(!Strings.isNullOrEmpty(errOutput))
                    {
                        output.append(ExampleOrgSDKConstants.SSH_COMMAND_ERROR_STREAM).append(errOutput);
                    }
                }

                //_logger.debug(this.m_host + ":command output " + output.toString());

            }
            else
            {
                //_logger.warn(this.m_host + ":channel is not connected");
            }
        }
        else
        {
            //_logger.warn(this.m_host + ":session is expired");
        }

        if (inputStream != null)
        {
            inputStream.close();

            //_logger.debug(this.m_host + ":channel is closed");
        }

        if (channel != null && !channel.isClosed())
        {
            channel.disconnect();

            //_logger.debug(this.m_host + ":channel is disconnected");
        }

        return output.toString();
    }

    public String executeFileReadCommand(String filePath) throws Exception
    {

        ChannelSftp channel = null;

        InputStream inputStream = null;

        StringBuilder output = new StringBuilder();

        if (m_session != null)
        {
            channel = (ChannelSftp) m_session.openChannel("sftp");

            channel.connect();

            //_logger.debug(m_host + ":checking channel connection");

            if (channel.isConnected())
            {
                inputStream = channel.get(filePath);

                //_logger.debug(m_host + ":channel is currently connected");

                output.append(IOUtils.toString(inputStream));

                output.append(ExampleOrgSDKConstants.NEW_LINE);

                //_logger.debug(m_host + ":command output " + output.toString());
            }

            else
            {
                //_logger.warn(m_host + ":channel is not connected");
            }

        }

        else
        {
            //_logger.warn(m_host + ":session is expired");
        }

        if (inputStream != null)
        {
            inputStream.close();

            //_logger.debug(m_host + ":channel is closed");
        }

        if (channel != null && !channel.isClosed())
        {
            channel.disconnect();

            //_logger.debug(m_host + ":channel is disconnected");
        }

        return output.toString();
    }

    public List<String> retrieveFileNames(String filePrefix, String fileName)
    {
        ChannelSftp channelSftp = null;

        List<String> fileNames = new ArrayList<>();

        try
        {
            channelSftp = (ChannelSftp) m_session.openChannel("sftp");

            //_logger.debug("Connecting to sftp channel : " + m_host);

            channelSftp.connect();

            //_logger.debug(m_host + ":checking channel connection");

            if (channelSftp.isConnected())
            {
                //_logger.debug("Channel connected : " + m_host);

                ChannelSftp.LsEntrySelector selector = entry -> {
                    if ((!Strings.isNullOrEmpty(filePrefix) && entry.getFilename().startsWith(filePrefix))
                            || (!Strings.isNullOrEmpty(fileName) && entry.getFilename().equals(fileName))) {
                        fileNames.add(entry.getFilename());
                    }
                    return ChannelSftp.LsEntrySelector.CONTINUE;
                };

                channelSftp.ls(channelSftp.getHome(), selector);
            }
            else
            {
                //_logger.warn(m_host + ":channel is not connected");
            }
        }
        catch (Exception exception)
        {
            //_logger.debug("connection login over sftp..."+m_host+" failed");

            //_logger.error(exception);
        }
        finally
        {
            if (channelSftp != null && !channelSftp.isClosed())
            {
                channelSftp.disconnect();

                //_logger.debug("Channel is disconnected");
            }

            //_logger.debug("Server Session disconnected over sftp..."+m_host);
        }

        return fileNames;
    }

    public void deleteFile(List<String> filesToDelete)
    {
        ChannelSftp channelSftp = null;

        try
        {
            channelSftp = (ChannelSftp) m_session.openChannel("sftp");

            //_logger.debug("Connecting to sftp channel : " + m_host);

            channelSftp.connect();

            //_logger.debug(m_host + ":checking channel connection");

            if (channelSftp.isConnected())
            {
                //_logger.debug("Channel connected : " + m_host);

                for (String fileToDelete : filesToDelete)
                {
                    //_logger.info("deleting file from sftp : " + fileToDelete);

                    //_logger.debug("deleting file from sftp : " + fileToDelete);

                    channelSftp.rm(fileToDelete);
                }
            }
            else
            {
                //_logger.warn(m_host + ":channel is not connected");
            }

        }
        catch (Exception exception)
        {
            //_logger.debug("connection login over sftp..."+m_host+" failed");

            //_logger.error(exception);
        }
        finally {

            if (channelSftp != null && !channelSftp.isClosed())
            {
                channelSftp.disconnect();

                //_logger.debug("Sftp Channel is disconnected");
            }

            //_logger.debug("Server Session disconnected over sftp..."+m_host);

        }
    }

    public boolean sendFileOverSFTP(File fileToSend)
    {
        ChannelSftp channelSftp = null;

        boolean isFileUploadSuccessful=false;

        String sftpServerIp = m_host;

        try
        {
            channelSftp = (ChannelSftp) m_session.openChannel("sftp");

            channelSftp.connect();

            //_logger.debug(m_host + ":checking channel connection");

            if (channelSftp.isConnected())
            {
                InputStream inputStream = new FileInputStream(fileToSend);

                channelSftp.put(inputStream, fileToSend.getName());

                //_logger.debug("File stored : " + fileToSend);

                isFileUploadSuccessful = true;

            }
            else
            {
                //_logger.warn(m_host + ":channel is not connected");
            }
        }
        catch (Exception exception)
        {
            //_logger.debug("connection login over sftp..."+sftpServerIp+" failed");

            //_logger.error(exception);
        }
        finally
        {

            if (channelSftp != null && !channelSftp.isClosed())
            {
                channelSftp.disconnect();

                //_logger.debug("Channel is disconnected");
            }

            disconnect();

            //_logger.debug("Server Session disconnected over sftp..."+sftpServerIp);

        }
        return isFileUploadSuccessful;
    }

    public boolean sendFilesOverSFTP(List<String> filesToSend,String remoteFilePath)
    {
        ChannelSftp channelSftp = null;
        boolean isFileUploadSuccessful = false;
        String sftpServerIp = m_host;
        InputStream inputStream = null;
        try
        {
            channelSftp = (ChannelSftp) m_session.openChannel("sftp");

            channelSftp.connect();

            //_logger.debug(m_host + ":checking channel connection");

            if (channelSftp.isConnected())
            {
                for (String filePath : filesToSend)
                {
                    File file = new File(filePath);
                    inputStream = new FileInputStream(file);
                    channelSftp.put(inputStream, remoteFilePath+file.getName());
                    //_logger.debug("File stored : " + remoteFilePath+file.getName());
                }

                isFileUploadSuccessful = true;

                inputStream.close();
            }
            else
            {
                //_logger.warn(m_host + ":channel is not connected");
            }
        }
        catch (Exception exception)
        {
            //_logger.debug("connection login over sftp..." + sftpServerIp + " failed");
            //_logger.error(exception);
        }
        finally
        {
            if(channelSftp != null && !channelSftp.isClosed())
            {
                channelSftp.disconnect();

                //_logger.debug("Channel is disconnected");
            }

            disconnect();

            //_logger.debug("Server Session disconnected over sftp..." + sftpServerIp);
        }
        return isFileUploadSuccessful;
    }

    public static ExampleOrgSSHUtil getNewSSHObject(String host, int port, String userName, String password, int timeout)
    {
        //_upgrade_logger.info("SSh to host ::" + host);

        ExampleOrgSSHUtil sshUtil = null;

        try
        {
            sshUtil = new ExampleOrgSSHUtil(host, port, userName, password, timeout);

            if(!sshUtil.init())
            {
                //_upgrade_logger.info("SSH failed for the host : ["+ host +"]");

                return null;
            }

            //_upgrade_logger.info("Successful SSh to host ::" + host);
        }
        catch (Exception exception)
        {
            //_upgrade_logger.info("SSH failed for the host : ["+ host +"]");

            //_upgrade_logger.error(exception);

            sshUtil = null;
        }

        return sshUtil;
    }

//    public static void stopOrStartObserverService(String sshUserName, String sshPassword, boolean isStart)
//    {
//        ExampleOrgSSHUtil sshUtil = null;
//
//        try
//        {
//            String host = TraceOrgConfigUtil.getMotadataObserverHost();
//
//            if(!Strings.isNullOrEmpty(host))
//            {
//                sshUtil = ExampleOrgSSHUtil.getNewSSHObject(host,TraceOrgConfigUtil.getMotadataSSHPort(), sshUserName, sshPassword,TraceOrgSDKConstants.SSH_TIME_OUT);
//
//                if(sshUtil != null)
//                {
//                    if(isStart)
//                    {
//                        //_upgrade_logger.info("starting motadata-observer on host ["+host+"]");
//
//                        sshUtil.executeCommand("sudo service motadata-observer start",false);
//
//                        //_upgrade_logger.info("motadata-observer service on host ["+host+"] successfully started.");
//                    }
//                    else
//                    {
//                        //_upgrade_logger.info("stopping motadata-observer service on host ["+host+"]");
//
//                        sshUtil.executeCommand("sudo service motadata-observer stop");
//
//                        //_upgrade_logger.info("motadata-observer service on host ["+host+"] successfully stopped.");
//                    }
//                }
//            }
//        }
//        catch (Exception exception)
//        {
//            //_logger.error(exception);
//        }
//        finally
//        {
//            if(sshUtil != null)
//            {
//                try
//                {
//                    sshUtil.destroy();
//                }
//                catch (Exception exception)
//                {}
//            }
//        }
//
//    }

    /**
     * MOTADATA-6357 - Master and RPE alert-last-seen sync issue (AMC issue)
     * This method will take remote file path and local path where file needs to be downloaded from remote.
     * Then it will download file from remote to local using Jsch sftp channel.
     */
    public void executeDownloadFile(String remoteFile, String localFilePath)
    {
        ChannelSftp channel = null;

        try
        {
            if (m_session != null)
            {
                channel = (ChannelSftp) m_session.openChannel("sftp");

                channel.connect();

                //_logger.debug(m_host + ":checking channel connection");

                if (channel.isConnected())
                {
                    //_logger.debug(m_host + ":channel is currently connected");

                    channel.get(remoteFile, localFilePath);

                    //_logger.debug("Downloaded file from " + remoteFile + " to " + localFilePath);
                }
            }
        }
        catch (Exception exception)
        {
            //_logger.error(exception);
        }
        finally
        {
            if (channel != null && !channel.isClosed())
            {
                try
                {
                    channel.disconnect();

                    //_logger.debug(m_host + ":channel is disconnected");
                }
                catch (Exception ignore)
                {
                }
            }
        }
    }

    /**
     * MOTADATA-5964 - 7.7.200 | Plugin should install or update on all the connected server
     * This method take source and destination folder path
     * Then it will upload file from local to remoter using Jsch sftp channel.
     *
     * @param  sourceFilePath
     * @param  destinationFilePath
     */
    public void executeUploadFile(String sourceFilePath,String destinationFilePath)
    {
        ChannelSftp channel = null;

        try
        {
            if (m_session != null)
            {
                channel = (ChannelSftp) m_session.openChannel("sftp");

                channel.connect();

                //_logger.debug(m_host + ":checking channel connection");

                if (channel.isConnected())
                {
                    //_logger.debug("fileLocation : " + sourceFilePath);

                    if(!StringUtils.isEmpty(sourceFilePath) && !StringUtils.isEmpty(destinationFilePath))
                    {
                        try
                        {
                            //_logger.debug(m_host + ":channel is currently connected");

                            channel.mkdir(destinationFilePath);

                            //_logger.debug("Created directory : "+destinationFilePath);

                            channel.put(sourceFilePath, destinationFilePath);

                            //_logger.debug("Uploaded file from " + sourceFilePath + " to " + destinationFilePath);
                        }
                        catch (Exception exception)
                        {
                            //_logger.warn("Upload error for file transfer from " + sourceFilePath + " to " + destinationFilePath);

                            //_logger.error(exception);
                        }
                    }
                }
            }
        }
        catch (Exception exception)
        {
            //_logger.error(exception);
        }
        finally
        {
            if (channel != null && !channel.isClosed())
            {
                try
                {
                    channel.disconnect();

                    //_logger.debug(m_host + ":channel is disconnected");
                }
                catch (Exception ignore)
                {
                }
            }
        }
    }

    public static String getStringValue(Object target)
    {

        String value = null;

        if (target != null)
        {
            value = String.valueOf(target);
        }

        return value;
    }

    @Override
    public void close() throws IOException
    {
        try
        {
            this.destroy();
        }
        catch (Exception exception)
        {
            //_logger.error(exception);
        }
    }
}
