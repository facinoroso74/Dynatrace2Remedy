package it.reply.sytel.adr.common.sftp.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.UserInfo;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.sftp.JschUserInfo;
import it.reply.sytel.adr.common.sftp.SftpManagerWithKey;
import it.reply.sytel.adr.common.sftp.exc.FtpException;
import it.reply.sytel.adr.common.sftp.exc.SftpManagerException;

public class SftpManagerWithKeyImpl implements SftpManagerWithKey {

	private Session session;
	private ChannelSftp channelSftp;
	private String homeDir;
	private String localHomeDir;
	    
	private Logger log = EtlLogger.getLogger(getClass());
	
	@Override
	public void connectWithKey(String user, String host, int port,String privateKey) {
		 try {
			    
			 	if(log.isDebugEnabled())
	            	log.debug("SFTP connection  to host:["+host+"] with private key:["+privateKey+"]");
			 
	            /* Getting initialization parameters */           
	            
	            JSch jsch = new JSch();
	            //JSch.setLogger(new JschLogger());
	            
//	            UserInfo ui = new JschUserInfo(password, null);
//	            session.setUserInfo(ui);
	            
	            jsch.addIdentity(privateKey);
	            /*
	             * Creating session jsch. A jsch session is bound to a Socket and a
	             * SSHD demon
	             */
	            session = jsch.getSession(user, host, port);
		           
	            java.util.Properties config = new java.util.Properties();
	            config.put("StrictHostKeyChecking", "no");
	            session.setConfig(config);
	            
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
	
	@Override
	public void connect(String user, String host,int port,String password) {
		
		 try {
			 
			 	if(log.isDebugEnabled()){
	            	log.debug("SFTP connection  to host:["+host+"] with basc authentication...");
	            	log.debug("user:["+user+"] host:["+host+"] port:["+port+"]");
			 	}
	            
	            JSch jsch = new JSch();

	            //JSch.setLogger(new JschLogger());

	            session = jsch.getSession(user, host, port);
	            UserInfo ui = new JschUserInfo(password, null);
	            session.setUserInfo(ui);
   
	            session.connect();
	            Channel channel = session.openChannel("sftp");

	            /*
	             * Creating channel jsch. A jsch channel is bound to a sftp server
	             * within SSH session
	             */
	            channel.connect();

	            channelSftp = (ChannelSftp)channel;

	            homeDir = channelSftp.pwd();
	            
	            if(log.isDebugEnabled())
	            	log.debug("homeDir:["+homeDir+"]");
	            
	            localHomeDir = channelSftp.lpwd();
	            
	            if(log.isDebugEnabled())
	            	log.debug("localHomeDir:["+localHomeDir+"]");
	            
	            if(log.isDebugEnabled())
	            	log.debug("SFTP connection enabled with host:["+host+"]");
	            
	        }catch (Exception e) {
	        	log.error("SFTP initializiation jsch connection with host:["+host+"]", e);
	            throw new FtpException("Exception initializing jsch connection", e);
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
	
	public boolean isFileExist(String filePath){
		try {
		
			Vector<String> fileVector = (Vector<String>)channelSftp.ls(filePath);
			if(fileVector.size()==0)
				return false;
			return true;
		} catch (SftpException e) {
			return false;
			//throw new SftpManagerException("Exception on checking the file:["+filePath+"] Exception:["+e.getClass()+"]", e);
		}
		
	}
	
	private void downloadSingleFile(ChannelSftp.LsEntry singlefile,List<String> remoteFileDonwloaded,String directorySource,String directoryDest,String fileTappo){
		
		try{
			if(log.isInfoEnabled())
				log.info("downloading the singlefile:["+singlefile.getFilename()+"] to Directory:["+directoryDest+"]...");
			
			
			String fileToDownload = directorySource+"/"+singlefile.getFilename(); 
			if(!singlefile.getAttrs().isDir() && !singlefile.getFilename().equals(fileTappo)){
				channelSftp.get(fileToDownload,  directoryDest+"/"+singlefile.getFilename());
				remoteFileDonwloaded.add(fileToDownload);
			}
			
			if(log.isInfoEnabled())
				log.info("downloading the singlefile:["+singlefile.getFilename()+"] to Directory:["+directoryDest+"]... DONE");
			
		}catch(Exception e){
			throw new FtpException("Exception on downloading the remote file:[" + singlefile.getFilename() + "] longName:[" +singlefile.getLongname() + "] to directoryDest:["+directoryDest+"]", e); 
		}
		
		
	}
	
	@Override
	public List<String> getRemoteFiles(String directorySource,String directoryDest,String fileTappo,String encoding) throws SftpException {
		
		List<String> remoteFileDonwloaded = new ArrayList<String>(); 
		
		
		
		if(log.isDebugEnabled()){
			log.debug("donwloading the file from directory:["+directorySource+"]...");
			log.debug("Encoding used:["+encoding+"]");
		}
		
		channelSftp.setFilenameEncoding(encoding);
		
		
		Vector<ChannelSftp.LsEntry> files = (Vector<ChannelSftp.LsEntry>)channelSftp.ls(directorySource);
		
		if(log.isDebugEnabled())
			log.debug("number file:["+files.size()+"]...");
		
		for (Iterator<ChannelSftp.LsEntry> iterator = files.iterator(); iterator.hasNext();) {
			
			ChannelSftp.LsEntry singlefile = (ChannelSftp.LsEntry) iterator.next();
			
//			if(log.isDebugEnabled())
//				log.debug("downloading the singlefile:["+singlefile.getFilename()+"]...");
//			
//			String fileToDownload = directorySource+"/"+singlefile.getFilename(); 
//			if(!singlefile.getAttrs().isDir() && !singlefile.getFilename().equals(fileTappo)){
//				channelSftp.get(fileToDownload,  directoryDest+"/"+singlefile.getFilename());
//				remoteFileDonwloaded.add(fileToDownload);
//			}
//			
//			if(log.isDebugEnabled())
//				log.debug("downloading the singlefile:["+singlefile.getFilename()+"]...");
			
			downloadSingleFile(singlefile, remoteFileDonwloaded, directorySource, directoryDest, fileTappo);
			
		}
		
		if(log.isInfoEnabled())
			log.info("donwloaded the file:["+directorySource+"]...DONE");
		
		return remoteFileDonwloaded;
	}

	@Override
	public void deleteFile(String fileName) {
		try {
			channelSftp.rm(fileName);
		} catch (SftpException e) {
			throw new SftpManagerException("Exception on removing the file:["+fileName+"]");
		}
	}

	@Override
	public void disconnect(String user) {
		cleanUp(user);
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
	
	@Override
	public void put(String filesToSendAbsolutePath, String directorySource) {
		try {
			channelSftp.put(filesToSendAbsolutePath, directorySource);
		} catch (SftpException e) {
			throw new SftpManagerException("Exception on putting the file:["+filesToSendAbsolutePath+"] into remote directory:["+directorySource+"]",e);
		}
	}


	public static void main(String[] args) {
		
		SftpManagerWithKeyImpl sftpKey = new SftpManagerWithKeyImpl();
		
		String user="jboss";
		String password="jboss";
		String host="10.21.90.208";
		int port=22;
		String filePath="/home/jboss/prova.txt";
		String dirSource="/home/jboss/PROVASFTP";
		String dirDest="D:/ConvergenzaTopTrunk/trunk/src/etlCommon/src/main/resources";
		
		try{
			
			System.out.println("connecting...");
			sftpKey.connect(user, host, port,password);
			System.out.println(sftpKey.isFileExist(filePath));
			System.out.println("connecting... DONE");
			
			//sftpKey.getRemoteFiles(dirSource, dirDest,"");
			
			File fileToSend = new File("D:/ConvergenzaTopSviluppo/trunk/src/etlCommon/src/main/resources/sftp_asset.properties");
			sftpKey.put(fileToSend.getAbsolutePath(), dirSource);
			System.out.println("tutto ok");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("closing ...");
			sftpKey.cleanUp(user);
			System.out.println("closing ...DONE");
		}
		
		
	}
	
}
