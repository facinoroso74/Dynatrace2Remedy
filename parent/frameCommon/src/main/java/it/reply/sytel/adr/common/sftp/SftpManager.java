package it.reply.sytel.adr.common.sftp;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.jboss.resource.security.SecureIdentityLoginModule;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.sftp.exc.FtpException;

public class SftpManager {

	private Logger log = EtlLogger.getLogger(getClass());
	private String systemName;
	private String userName;
	private String password;
	
	private HashMap<String, String> propertiesSystem = new HashMap<String, String>();
	
	JschFtpClient jschFtpClient = null;
	
	public SftpManager(String systemName){
		this.systemName=systemName;
	}

	public void loadProperties(String propertiesFileName){

		try {
			
			log.info("Loading Properties File Name "+propertiesFileName+"...");
			
			if(log.isInfoEnabled())
				log.info("Loading properties configuration for COM ...");
			
			ResourceBundle resourceBundle = ResourceBundle.getBundle(propertiesFileName);
			
			Enumeration<String> keys = resourceBundle.getKeys();
			
			while (keys.hasMoreElements()) {
				
				String key = (keys.nextElement().toString()).trim();
				String property = (resourceBundle.getString(key)).trim();
				propertiesSystem.put(key, property);
				
			}
			
			this.userName = propertiesSystem.get("username");
			this.password = decrypt(propertiesSystem.get("password"));
			
			

			log.info("Loading Properties File Name "+propertiesFileName+"... DONE");
			
		} catch (Exception e) {
			throw new FtpException("Exception on Loading Properties File Name:["+propertiesFileName+"] systemName:["+systemName+"]",e);
		}
	}
	
	
	private String decrypt(String password) {
		try {
			Method privateStringMethod = SecureIdentityLoginModule.class.getDeclaredMethod("decode", String.class);
			privateStringMethod.setAccessible(true);
		
			char[] returnValue = (char[])privateStringMethod.invoke(new SecureIdentityLoginModule(), password);
			    
			return String.valueOf(returnValue);
		
		} catch (Exception e) {
			throw new FtpException("Exception on decrypting the password:["+password+"] systemName:["+systemName+"]");
		}
		
	}
	
	public void getRemoteFiles(){
		try{
			jschFtpClient = new JschFtpClient();
			jschFtpClient.init(propertiesSystem.get("host"), 22, this.userName, this.password);
			
			String tappoFileRemote = propertiesSystem.get("remote_tappo");
			String tappoFileLocal = propertiesSystem.get("local_tappo");
			
			existTappo(tappoFileRemote, tappoFileLocal);
			
			String remoteFileString = propertiesSystem.get("remote_files");
			String localFileString = propertiesSystem.get("local_files");
			
			String[] remoteFile = remoteFileString.split(";");
			String[] localFile = localFileString.split(";");
			
			if (remoteFile.length != localFile.length) {
				log.error("Trovati " + remoteFile.length + " file remoti e " + localFile.length + " file locali - rivedere la configurazione");
				throw new FtpException("Exception on checking the configuration file properties. SystemName:["+systemName+"]");
				
			}
			
			for (int i = 0; i < remoteFile.length; i++) {
				jschFtpClient.get(remoteFile[i], localFile[i], this.userName);
			}
			
		}catch (Exception e) {
			throw new FtpException("Exception on getting the file From system:["+this.systemName+"]",e);
		}finally{
			if(jschFtpClient!=null)
				jschFtpClient.close();
		}
	}
	

	private void existTappo(String tappofileRemote,String tappoFileLocal) {
		
		try {
					
			if(log.isInfoEnabled())
				log.info("Checking file tappo ...");
			
			jschFtpClient.get(tappofileRemote, tappoFileLocal, this.userName);
			
			if(log.isInfoEnabled())
				log.info("Checking file tappo DONE");
			
			
			
		} catch (Exception e) {
			throw new FtpException("Exception on checking the Remote File tappo [" + tappofileRemote + "] systemName:["+systemName+"]",e);
		}
	}
	
	public static void main(String[] args) {
		String propertiesFileName="sftp_asset";
		SftpManager sftpManager=new SftpManager("ASSET");
		sftpManager.loadProperties(propertiesFileName);
		sftpManager.getRemoteFiles();
	}
	
	
}
