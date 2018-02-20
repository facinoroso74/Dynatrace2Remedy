/*
 * An XML document type.
 * Localname: get_ListaAssetResponse
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaAssetResponse(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaAssetResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaAssetResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTAASSETRESPONSE$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaAssetResponse");
    
    
    /**
     * Gets the "get_ListaAssetResponse" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse getGetListaAssetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse)get_store().find_element_user(GETLISTAASSETRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get_ListaAssetResponse" element
     */
    public void setGetListaAssetResponse(it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse getListaAssetResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse)get_store().find_element_user(GETLISTAASSETRESPONSE$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse)get_store().add_element_user(GETLISTAASSETRESPONSE$0);
            }
            target.set(getListaAssetResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "get_ListaAssetResponse" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse addNewGetListaAssetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse)get_store().add_element_user(GETLISTAASSETRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML get_ListaAssetResponse(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class GetListaAssetResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListaAssetResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTAASSETRETURN$0 = 
            new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaAssetReturn");
        
        
        /**
         * Gets the "get_ListaAssetReturn" element
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn getGetListaAssetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn)get_store().find_element_user(GETLISTAASSETRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "get_ListaAssetReturn" element
         */
        public void setGetListaAssetReturn(it.telecomitalia.webservice.ettmp.GetListaAssetReturn getListaAssetReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn)get_store().find_element_user(GETLISTAASSETRETURN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn)get_store().add_element_user(GETLISTAASSETRETURN$0);
                }
                target.set(getListaAssetReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "get_ListaAssetReturn" element
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn addNewGetListaAssetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn)get_store().add_element_user(GETLISTAASSETRETURN$0);
                return target;
            }
        }
    }
}
