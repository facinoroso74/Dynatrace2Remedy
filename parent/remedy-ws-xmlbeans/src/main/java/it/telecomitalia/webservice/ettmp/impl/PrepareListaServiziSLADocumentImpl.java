/*
 * An XML document type.
 * Localname: prepare_ListaServiziSLA
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one prepare_ListaServiziSLA(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class PrepareListaServiziSLADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaServiziSLADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREPARELISTASERVIZISLA$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "prepare_ListaServiziSLA");
    
    
    /**
     * Gets the "prepare_ListaServiziSLA" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA getPrepareListaServiziSLA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA)get_store().find_element_user(PREPARELISTASERVIZISLA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prepare_ListaServiziSLA" element
     */
    public void setPrepareListaServiziSLA(it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA prepareListaServiziSLA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA)get_store().find_element_user(PREPARELISTASERVIZISLA$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA)get_store().add_element_user(PREPARELISTASERVIZISLA$0);
            }
            target.set(prepareListaServiziSLA);
        }
    }
    
    /**
     * Appends and returns a new empty "prepare_ListaServiziSLA" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA addNewPrepareListaServiziSLA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA)get_store().add_element_user(PREPARELISTASERVIZISLA$0);
            return target;
        }
    }
    /**
     * An XML prepare_ListaServiziSLA(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class PrepareListaServiziSLAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaServiziSLADocument.PrepareListaServiziSLA
    {
        private static final long serialVersionUID = 1L;
        
        public PrepareListaServiziSLAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PREPARELISTASERVIZISLAIN$0 = 
            new javax.xml.namespace.QName("", "prepare_ListaServiziSLA_In");
        
        
        /**
         * Gets the "prepare_ListaServiziSLA_In" element
         */
        public it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType getPrepareListaServiziSLAIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType)get_store().find_element_user(PREPARELISTASERVIZISLAIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "prepare_ListaServiziSLA_In" element
         */
        public void setPrepareListaServiziSLAIn(it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType prepareListaServiziSLAIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType)get_store().find_element_user(PREPARELISTASERVIZISLAIN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType)get_store().add_element_user(PREPARELISTASERVIZISLAIN$0);
                }
                target.set(prepareListaServiziSLAIn);
            }
        }
        
        /**
         * Appends and returns a new empty "prepare_ListaServiziSLA_In" element
         */
        public it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType addNewPrepareListaServiziSLAIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType)get_store().add_element_user(PREPARELISTASERVIZISLAIN$0);
                return target;
            }
        }
    }
}
