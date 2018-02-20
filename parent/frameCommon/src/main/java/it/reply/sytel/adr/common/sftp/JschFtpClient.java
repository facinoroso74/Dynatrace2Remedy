package it.reply.sytel.adr.common.sftp;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.UserInfo;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.sftp.exc.FtpException;


public class JschFtpClient {

	private Logger log = EtlLogger.getLogger(getClass());
    private ChannelSftp channelSftp;
    private String id;
    private String homeDir;
    private String localHomeDir;
//    private String session;
    
    private Session session;
    

	public void init(String host,int port,String user,String password) throws FtpException{
        try {
            
            /* Getting initialization parameters */           
            
            JSch jsch = new JSch();

            //JSch.setLogger(new JschLogger());

            session = jsch.getSession(user, host, port);
            UserInfo ui = new JschUserInfo(password, null);
            session.setUserInfo(ui);

            /*
             * Creating session jsch. A jsch session is bound to a Socket and a
             * SSHD demon
             */
            session.connect();
            Channel channel = session.openChannel("sftp");

            /*
             * Creating channel jsch. A jsch channel is bound to a sftp server
             * within SSH session
             */
            channel.connect();

            channelSftp = (ChannelSftp)channel;

            homeDir = channelSftp.pwd();
            localHomeDir = channelSftp.lpwd();

            if(log.isDebugEnabled())
            	log.debug("SFTP connection enabled with host:["+host+"]");
            
        }catch (Exception e) {
        	log.error("SFTP initializiation jsch connection with host:["+host+"]", e);
            throw new FtpException("Exception initializing jsch connection", e);
        }
    }
    


    public void cd(String newFolder, String utenza) throws FtpException {
        try {
            if (log.isDebugEnabled())
                log.debug("[Utenza:"+utenza+"] Changing directory to '" + newFolder + "'");
            channelSftp.cd(newFolder);
        }
        catch (SftpException se) {
        	log.error("[Utenza:"+utenza+"] Error Changing directory to '" + newFolder + "'", se);
            throw new FtpException("Error Changing directory to '" + newFolder + "'", se);
        }
    }

    public void cd(String utenza) throws FtpException {
        try {
            if (log.isDebugEnabled())
                log.debug("[Utenza:"+utenza+"] Changing directory to home directory: '" + homeDir + "'");

            channelSftp.cd(homeDir);
        }
        catch (SftpException se) {
        	log.error("[Utenza:"+utenza+"] Error Changing directory to home directory: '" + homeDir + "'", se);
            throw new FtpException("Error Changing directory to home directory: '" + homeDir + "'", se);
        }
    }


 
    public void put(String localFile, String remoteFile, String utenza) throws FtpException {
        try {
            if (log.isDebugEnabled()) {
                log.debug("[Utenza:"+utenza+"] Putting local file '" + localFile + "' to remote file '" + remoteFile + "'");
            }
            channelSftp.put(localFile, remoteFile);
        }
        catch (Exception e) {
        	log.error("[Utenza:"+utenza+"] Error putting local file '" + localFile + "' to remote file '" + remoteFile + "'", e);
            throw new FtpException("Error putting local file '" + localFile + "' to remote file '" + remoteFile + "'", e);
        }
    }
    
    public void get(String remoteFile, String localFile, String utenza) throws FtpException {
        try {
            if (log.isDebugEnabled()) {
                log.debug("[User:"+utenza+"] Getting remote file '" + remoteFile + "' to local file '" + localFile + "'");
            }
            channelSftp.get(remoteFile, localFile);
        }
        catch (Exception e) {
        	log.error("[User:"+utenza+"] Error getting remote file '" + remoteFile + "' to local file '" + localFile + "'", e);
            throw new FtpException("Error getting remote file '" + remoteFile + "' to local file '" + localFile + "'", e);
        }
    }

    public void mv(String oldFile, String newFile) throws FtpException {
        try {
            if (log.isDebugEnabled()) {
                log.debug("Moving remote file '" + oldFile + "' to '" + newFile + "'");
            }
            channelSftp.rename(oldFile, newFile);
        }
        catch (Exception e) {
        	log.error("Error moving remote file '" + oldFile + "' to '" + newFile + "'", e);
            throw new FtpException("Error moving remote file '" + oldFile + "' to '" + newFile + "'", e);
        }
    }
    
    public void rm(String file) throws FtpException {
        try {
            if (log.isDebugEnabled()) {
                log.debug("Removing remote file '" + file + "'");
            }
            channelSftp.rm(file);
        }
        catch (Exception e) {
        	log.error("Error removing remote file '" + file + "'", e);
            throw new FtpException("Error removing remote file '" + file + "'", e);
        }
    }


    public String pwd() throws FtpException {
        String pwdPath;
        try {
            pwdPath = channelSftp.pwd();
        }
        catch (Exception e) {
        	log.error("Error in pwd", e);
            throw new FtpException("Error in pwd", e);
        }
        return pwdPath;
    }


    public void reset(String utenza) throws FtpException
    {
        cd(utenza);
        lcd(utenza);
    }

    public void cleanUp(String utenza) {
        if (channelSftp != null) {
            try {
                channelSftp.disconnect();
            }
            catch (Throwable e) {
                log.debug("[Utenza:"+utenza+"] Error disconnecting channel", e);
            }
            try {
                channelSftp.getSession().disconnect();
            }
            catch (Throwable e) {
                log.debug("[Utenza:"+utenza+"] Error disconnecting session", e);
            }
        }
    }

    public String lpwd() throws FtpException {
        String lpwdPath;
        try {
            lpwdPath = channelSftp.lpwd();
        }
        catch (Exception e) {
        	log.error("Error in lpwd", e);
            throw new FtpException("Error in lpwd", e);
        }
        return lpwdPath;
    }

    public void lcd(String newFolder) throws FtpException {
        try {
            if (log.isDebugEnabled())
                log.debug("Changing local directory to '" + newFolder + "'");

            channelSftp.lcd(newFolder);
        }
        catch (SftpException se) {
        	log.error("Error Changing local directory to '" + newFolder + "'", se);
            throw new FtpException("Error Changing local directory to '" + newFolder + "'", se);
        }
    }

    public void lcd() throws FtpException {
        try {
            if (log.isDebugEnabled())
                log.debug("Changing local directory to home directory: '" + localHomeDir + "'");

            channelSftp.lcd(localHomeDir);
        }
        catch (SftpException se) {
        	log.error("Error Changing local directory to home directory: '" + localHomeDir + "'", se);
            throw new FtpException("Error Changing local directory to home directory: '" + localHomeDir + "'", se);
        }
    }
    
    public void close() {
        if (log.isDebugEnabled())
            log.debug("Disconnect session and exit");
        session.disconnect();
        channelSftp.exit();
    }

}