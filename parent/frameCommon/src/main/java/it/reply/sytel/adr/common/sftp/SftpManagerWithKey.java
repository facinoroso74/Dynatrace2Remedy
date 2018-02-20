package it.reply.sytel.adr.common.sftp;


import java.util.List;

import com.jcraft.jsch.SftpException;

public interface SftpManagerWithKey {

	
	public void connect(String user, String host,int port,String password);
	public void connectWithKey(String user, String host,int port,String privateKey);
	
	public List<String> getRemoteFiles(String directorySource,String directoryDest,String fileTappo,String encoding) throws SftpException;
	
	public void deleteFile(String fileName);
	
	public void disconnect(String user);
	
	public boolean isFileExist(String filePath);
	
	public void put(String filesToSendAbsolutePath, String directorySource);
	
}
