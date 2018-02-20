package it.reply.sytel.adr.common.file.imp;

import java.io.File;

import it.reply.sytel.adr.common.file.FileUtils;
import it.reply.sytel.adr.common.file.exc.FileUtilsException;

public class FileUtilsImpl implements FileUtils {

	@Override
	public void moveFile(String source, String dest) throws FileUtilsException {

	   File afile =new File(source);
	   File afileDest =new File(dest);
	   
	   if(afileDest.exists())
		  afileDest.delete();
	   
 	   if(!afile.renameTo(new File(dest)))
 		   throw new FileUtilsException("Exception on moving the file:["+source+"] to file:["+dest+"]"); 
 	   
 	   
	}

}
