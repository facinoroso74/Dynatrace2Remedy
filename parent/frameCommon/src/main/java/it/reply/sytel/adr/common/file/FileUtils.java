package it.reply.sytel.adr.common.file;

import it.reply.sytel.adr.common.file.exc.FileUtilsException;

public interface FileUtils {

	public void moveFile(String source,String dest) throws FileUtilsException;
}
