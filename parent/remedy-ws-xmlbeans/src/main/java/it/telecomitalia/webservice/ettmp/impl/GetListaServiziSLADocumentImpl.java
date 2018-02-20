/*
 * An XML document type.
 * Localname: get_ListaServiziSLA
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaServiziSLA(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaServiziSLADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaServiziSLADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTASERVIZISLA$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaServiziSLA");
    
    
    /**
     * Gets the "get_ListaServiziSLA" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA getGetListaServiziSLA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA)get_store().find_element_user(GETLISTASERVIZISLA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get_ListaServiziSLA" element
     */
    public void setGetListaServiziSLA(it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA getListaServiziSLA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA)get_store().find_element_user(GETLISTASERVIZISLA$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA)get_store().add_element_user(GETLISTASERVIZISLA$0);
            }
            target.set(getListaServiziSLA);
        }
    }
    
    /**
     * Appends and returns a new empty "get_ListaServiziSLA" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA addNewGetListaServiziSLA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA)get_store().add_element_user(GETLISTASERVIZISLA$0);
            return target;
        }
    }
    /**
     * An XML get_ListaServiziSLA(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class GetListaServiziSLAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaServiziSLADocument.GetListaServiziSLA
    {
        private static final long serialVersionUID = 1L;
        
        public GetListaServiziSLAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTASERVIZISLAIN$0 = 
            new javax.xml.namespace.QName("", "ListaServiziSLA_In");
        
        
        /**
         * Gets the "ListaServiziSLA_In" element
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAInType getListaServiziSLAIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAInType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAInType)get_store().find_element_user(LISTASERVIZISLAIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListaServiziSLA_In" element
         */
        public void setListaServiziSLAIn(it.telecomitalia.webservice.ettmp.ListaServiziSLAInType listaServiziSLAIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAInType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAInType)get_store().find_element_user(LISTASERVIZISLAIN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAInType)get_store().add_element_user(LISTASERVIZISLAIN$0);
                }
                target.set(listaServiziSLAIn);
            }
        }
        
        /**
         * Appends and returns a new empty "ListaServiziSLA_In" element
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAInType addNewListaServiziSLAIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAInType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAInType)get_store().add_element_user(LISTASERVIZISLAIN$0);
                return target;
            }
        }
    }
}
