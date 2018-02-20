/*
 * An XML document type.
 * Localname: prepare_ListaAssetResponse
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one prepare_ListaAssetResponse(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class PrepareListaAssetResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaAssetResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREPARELISTAASSETRESPONSE$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "prepare_ListaAssetResponse");
    
    
    /**
     * Gets the "prepare_ListaAssetResponse" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse getPrepareListaAssetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse)get_store().find_element_user(PREPARELISTAASSETRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prepare_ListaAssetResponse" element
     */
    public void setPrepareListaAssetResponse(it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse prepareListaAssetResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse)get_store().find_element_user(PREPARELISTAASSETRESPONSE$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse)get_store().add_element_user(PREPARELISTAASSETRESPONSE$0);
            }
            target.set(prepareListaAssetResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "prepare_ListaAssetResponse" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse addNewPrepareListaAssetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse)get_store().add_element_user(PREPARELISTAASSETRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML prepare_ListaAssetResponse(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class PrepareListaAssetResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaAssetResponseDocument.PrepareListaAssetResponse
    {
        private static final long serialVersionUID = 1L;
        
        public PrepareListaAssetResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PREPARELISTAASSETRETURN$0 = 
            new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "prepare_ListaAssetReturn");
        
        
        /**
         * Gets the "prepare_ListaAssetReturn" element
         */
        public it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn getPrepareListaAssetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn)get_store().find_element_user(PREPARELISTAASSETRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "prepare_ListaAssetReturn" element
         */
        public void setPrepareListaAssetReturn(it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn prepareListaAssetReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn)get_store().find_element_user(PREPARELISTAASSETRETURN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn)get_store().add_element_user(PREPARELISTAASSETRETURN$0);
                }
                target.set(prepareListaAssetReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "prepare_ListaAssetReturn" element
         */
        public it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn addNewPrepareListaAssetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn)get_store().add_element_user(PREPARELISTAASSETRETURN$0);
                return target;
            }
        }
    }
}
