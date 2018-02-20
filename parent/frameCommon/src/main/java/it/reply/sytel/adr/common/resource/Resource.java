package it.reply.sytel.adr.common.resource;

import java.io.InputStream;

public interface Resource {
    
    /**
     * return the configuration into xml
     * the implementation of this interface
     * knows where get the configuration
     * @return
     */
    public InputStream getConfFromClassLoader();
    
    public String getFileName();
    public void setFileName(String fileName);
}

