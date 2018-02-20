package it.reply.sytel.adr.common.sftp.impl;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.jboss.resource.security.SecureIdentityLoginModule;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.sftp.JschFtpClient;

public class SftpManager {
	
	private Logger log = EtlLogger.getLogger(getClass());
	
	private String filenameCOM = "sftp_com";
	private String filenameASSET = "sftp_asset";
	
	private String usernameCOM;
	private String passwordCOM;
	private String usernameASSET;
	private String passwordASSET;
	
	private HashMap<String, String> propertiesCOM = new HashMap<String, String>();
	private HashMap<String, String> propertiesASSET = new HashMap<String, String>();
	
	private JschFtpClient clientCOM;
	private JschFtpClient clientASSET;

	public SftpManager() {
		init();
	}

	public boolean getFiles() {
		boolean state = existTappo() && getFilesFromCOM() && getFilesFromASSET();
		clientCOM.close();
		clientASSET.close();
		return state;
	}

	private void init() {
		
		try {
			
			log.info("Init SFTP manager");
			
			ResourceBundle comRB = ResourceBundle.getBundle(filenameCOM);
			ResourceBundle assetRB = ResourceBundle.getBundle(filenameASSET);
			
			Enumeration<String> comKey = comRB.getKeys();
			Enumeration<String> assetKey = assetRB.getKeys();
	
			while (comKey.hasMoreElements()) {
				String key = (comKey.nextElement().toString()).trim();
				String property = (comRB.getString(key)).trim();

				try {
					propertiesCOM.put(key, property);
				} catch (Exception ee) {
					log.error("Errore caricamento file [" + filenameCOM + "] - ex: " + ee.toString());
				}
			}

			log.info("Caricamento properties per COM completato");
			
			while (assetKey.hasMoreElements()) {
				String key = (assetKey.nextElement().toString()).trim();
				String property = (assetRB.getString(key)).trim();

				try {
					propertiesASSET.put(key, property);
				} catch (Exception ee) {
					log.error("Errore caricamento file [" + filenameASSET+ "] - ex: " + ee.toString());
				}
			}
			
			log.info("Caricamento properties per ASSET completato");
			
			usernameCOM = propertiesCOM.get("username");
			passwordCOM = decrypt(propertiesCOM.get("password"));
			
			clientCOM = new JschFtpClient();
			clientCOM.init(propertiesCOM.get("host"), 22, usernameCOM, passwordCOM);

			usernameASSET = propertiesASSET.get("username");
			passwordASSET = decrypt(propertiesASSET.get("password"));
			
			clientASSET = new JschFtpClient();
			clientASSET.init(propertiesASSET.get("host"), 22, usernameASSET, passwordASSET);

		} catch (Exception e) {
			log.error("Errore caricamento file - ex: " + e.toString());
		}
	}
	
	private boolean existTappo() {
		
		String tappoFileAssetRemote = propertiesASSET.get("remote_tappo");
		String tappoFileCOMRemote = propertiesCOM.get("remote_tappo");
		
		String tappoFileAssetLocal = propertiesASSET.get("local_tappo");
		String tappoFileCOMLocal = propertiesCOM.get("local_tappo");
		
		try {
			clientCOM.get(tappoFileCOMRemote, tappoFileCOMLocal, usernameCOM);
			log.info("Controllo del file tappo per COM completato");
		} catch (Exception e) {
			log.error("File tappo di COM [" + tappoFileCOMRemote + "] inesistente - exc: " + e);
			return false;
		}
		
		try {
			clientASSET.get(tappoFileAssetRemote, tappoFileAssetLocal, usernameASSET);
			log.info("Controllo del file tappo per ASSET completato");
		} catch (Exception e) {
			log.error("File tappo di ASSET [" + tappoFileAssetRemote + "] inesistente - exc: " + e);
			return false;
		}
		return true;
	}
	
	private boolean getFilesFromCOM() {
		if(log.isDebugEnabled())
			log.info("Inizializzazione download dei file da COM");
		
		String remoteFileString = propertiesCOM.get("remote_files");
		String localFileString = propertiesCOM.get("local_files");
		
		String[] remoteFile = remoteFileString.split(";");
		String[] localFile = localFileString.split(";");
		if (remoteFile.length != localFile.length) {
			
			log.error("Trovati " + remoteFile.length + " file remoti e " + localFile.length + " file locali - rivedere la configurazione di COM");
			return false;
			
		} else {
			for (int i = 0; i < remoteFile.length; i++) {
				try {
					if(log.isInfoEnabled())
						log.info("Download del file " + remoteFile[i] + " in " + localFile[i]);
					
					clientCOM.get(remoteFile[i], localFile[i], usernameCOM);
				
				} catch (Exception e) {
					if(log.isInfoEnabled())
						log.info("Errore durante il download del file " + remoteFile[i]);
					return false;
				}
			}
		}
		return true;
	}

	private boolean getFilesFromASSET() {
		if(log.isDebugEnabled())
			log.info("Inizializzazione download dei file da ASSET");
		
		String remoteFileString = propertiesASSET.get("remote_files");
		String localFileString = propertiesASSET.get("local_files");
		
		String[] remoteFile = remoteFileString.split(";");
		String[] localFile = localFileString.split(";");
		if (remoteFile.length != localFile.length) {
			log.error("Trovati " + remoteFile.length + " file remoti e " + localFile.length + " file locali - rivedere la configurazione di ASSET");
			return false;
		} else {
			for (int i = 0; i < remoteFile.length; i++) {
				try {
					if(log.isInfoEnabled())
						log.info("Download del file " + remoteFile[i] + " in " + localFile[i]);
					clientASSET.get(remoteFile[i], localFile[i], usernameASSET);
				} catch (Exception e) {
					if(log.isInfoEnabled())
						log.info("Errore durante il download del file " + remoteFile[i]);
					return false;
				}
			}
		}
		return true;
	}
	
//	public static void main(String[] args) {
//		SftpManager s = new SftpManager();
//		s.getFiles();
//	    System.out.println("Download completo");
//	}
	
	private String decrypt(String password) {
		try {
			Method privateStringMethod = SecureIdentityLoginModule.class.getDeclaredMethod("decode", String.class);
			privateStringMethod.setAccessible(true);
		
			char[] returnValue = (char[])privateStringMethod.invoke(new SecureIdentityLoginModule(), password);
			    
			return String.valueOf(returnValue);
		} catch (Exception e) {
			log.error("Errore durante il decrypt della password");
		}
		return null;
	}
	
}
