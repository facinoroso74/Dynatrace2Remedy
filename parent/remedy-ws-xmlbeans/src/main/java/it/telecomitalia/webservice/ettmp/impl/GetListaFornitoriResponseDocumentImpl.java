/*
 * An XML document type.
 * Localname: get_ListaFornitoriResponse
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaFornitoriResponse(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaFornitoriResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaFornitoriResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTAFORNITORIRESPONSE$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaFornitoriResponse");
    
    
    /**
     * Gets the "get_ListaFornitoriResponse" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse getGetListaFornitoriResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse)get_store().find_element_user(GETLISTAFORNITORIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get_ListaFornitoriResponse" element
     */
    public void setGetListaFornitoriResponse(it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse getListaFornitoriResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse)get_store().find_element_user(GETLISTAFORNITORIRESPONSE$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse)get_store().add_element_user(GETLISTAFORNITORIRESPONSE$0);
            }
            target.set(getListaFornitoriResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "get_ListaFornitoriResponse" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse addNewGetListaFornitoriResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse)get_store().add_element_user(GETLISTAFORNITORIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML get_ListaFornitoriResponse(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class GetListaFornitoriResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaFornitoriResponseDocument.GetListaFornitoriResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListaFornitoriResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTAFORNITORIRETURN$0 = 
            new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaFornitoriReturn");
        
        
        /**
         * Gets the "get_ListaFornitoriReturn" element
         */
        public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType getGetListaFornitoriReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType)get_store().find_element_user(GETLISTAFORNITORIRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "get_ListaFornitoriReturn" element
         */
        public void setGetListaFornitoriReturn(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType getListaFornitoriReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType)get_store().find_element_user(GETLISTAFORNITORIRETURN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType)get_store().add_element_user(GETLISTAFORNITORIRETURN$0);
                }
                target.set(getListaFornitoriReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "get_ListaFornitoriReturn" element
         */
        public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType addNewGetListaFornitoriReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType)get_store().add_element_user(GETLISTAFORNITORIRETURN$0);
                return target;
            }
        }
    }
}
