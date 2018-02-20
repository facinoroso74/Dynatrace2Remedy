/*
 * An XML document type.
 * Localname: get_ListaServiziSLAResponse
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaServiziSLAResponse(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaServiziSLAResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaServiziSLAResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTASERVIZISLARESPONSE$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaServiziSLAResponse");
    
    
    /**
     * Gets the "get_ListaServiziSLAResponse" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse getGetListaServiziSLAResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse)get_store().find_element_user(GETLISTASERVIZISLARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get_ListaServiziSLAResponse" element
     */
    public void setGetListaServiziSLAResponse(it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse getListaServiziSLAResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse)get_store().find_element_user(GETLISTASERVIZISLARESPONSE$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse)get_store().add_element_user(GETLISTASERVIZISLARESPONSE$0);
            }
            target.set(getListaServiziSLAResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "get_ListaServiziSLAResponse" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse addNewGetListaServiziSLAResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse)get_store().add_element_user(GETLISTASERVIZISLARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML get_ListaServiziSLAResponse(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class GetListaServiziSLAResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaServiziSLAResponseDocument.GetListaServiziSLAResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListaServiziSLAResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLISTASERVIZISLARETURN$0 = 
            new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaServiziSLAReturn");
        
        
        /**
         * Gets the "get_ListaServiziSLAReturn" element
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType getGetListaServiziSLAReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType)get_store().find_element_user(GETLISTASERVIZISLARETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "get_ListaServiziSLAReturn" element
         */
        public void setGetListaServiziSLAReturn(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType getListaServiziSLAReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType)get_store().find_element_user(GETLISTASERVIZISLARETURN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType)get_store().add_element_user(GETLISTASERVIZISLARETURN$0);
                }
                target.set(getListaServiziSLAReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "get_ListaServiziSLAReturn" element
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType addNewGetListaServiziSLAReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType)get_store().add_element_user(GETLISTASERVIZISLARETURN$0);
                return target;
            }
        }
    }
}
