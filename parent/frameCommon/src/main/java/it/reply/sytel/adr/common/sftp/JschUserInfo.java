package it.reply.sytel.adr.common.sftp;

import com.jcraft.jsch.UserInfo;

public class JschUserInfo implements UserInfo{

	private String password;
	private String privateKeyPassfrase;

	public JschUserInfo ( String password, String privateKeyPassfrase )
	{
		this.password = password;
		this.privateKeyPassfrase = privateKeyPassfrase;
	}

	public String getPassword()
	{ 
		return password; 
	}

	public boolean promptYesNo(String str){
		
		/*
		 * TO DO:
		 * 
		 * implementare il meccanismo degli known host?
		 * 
		 */
		
		return true;
	}

	/* Meccanismo dell'SSHClient */
	
	public String getPassphrase()
	{ 
		return privateKeyPassfrase; 
	}
	
	public boolean promptPassphrase(String message)
	{ 
		return true; 
	}

	/* ------------------------- */
	
	
	public boolean promptPassword( String message ){	
		
		return true;
	}
	
	public void showMessage( String message ){
		System.out.println( message );
	}
}

