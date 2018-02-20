package it.reply.sytel.adr.common.crypto;

import java.lang.reflect.Method;

import org.jboss.resource.security.SecureIdentityLoginModule;

import it.reply.sytel.adr.common.crypto.imp.CryptoException;

public class CryptoUtility {
	
	public static String decrypt(String password) throws CryptoException {
		try {
			Method privateStringMethod = SecureIdentityLoginModule.class.getDeclaredMethod("decode", String.class);
			privateStringMethod.setAccessible(true);
		
			char[] returnValue = (char[])privateStringMethod.invoke(new SecureIdentityLoginModule(), password);
			    
			return String.valueOf(returnValue);
				
			
		} catch (Exception e) {
			throw new CryptoException("Exception on decrypting the password:["+password+"]",e);
		}
		
	}
	
	
	public static String encrypt(String password) throws CryptoException {
		try {
			
			Method privateStringMethod = SecureIdentityLoginModule.class.getDeclaredMethod("encode", String.class);
			privateStringMethod.setAccessible(true);
		
			String returnValue = (String)privateStringMethod.invoke(new SecureIdentityLoginModule(), password);
			    
			return returnValue;
			
		} catch (Exception e) {
			throw new CryptoException("Exception on decrypting the password:["+password+"]",e);
		}
		
	}
	
}
