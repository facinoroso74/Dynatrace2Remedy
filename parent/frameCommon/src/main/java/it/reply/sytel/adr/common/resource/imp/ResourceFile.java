package it.reply.sytel.adr.common.resource.imp;

import java.io.InputStream;

import org.apache.log4j.Logger;

import it.reply.sytel.adr.common.log.EtlLogger;
import it.reply.sytel.adr.common.resource.Resource;
import it.reply.sytel.adr.common.resource.exc.ResourceException;

public class ResourceFile implements Resource {
    
    private String fileName;
    private Logger log = EtlLogger.getLogger(getClass());
    
    public InputStream getConfFromClassLoader() throws ResourceException {
        try {
        	if(log.isDebugEnabled())
        		log.debug("getting the inputStream from fileName:["+fileName+"]");
        	InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        	//return (ClassLoader.getSystemResource(fileName).openStream());
        	if(is==null)
        		throw new ResourceException("File Not found. FileName:["+fileName+"]");
        	return is;
        	
        } catch (Exception e) {
            throw new ResourceException("Exception into loading the file:["+fileName+"]",e);
        }   
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}

