/*
 * An XML document type.
 * Localname: prepare_ListaServiziSLAReturn
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAReturnDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one prepare_ListaServiziSLAReturn(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class PrepareListaServiziSLAReturnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAReturnDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaServiziSLAReturnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREPARELISTASERVIZISLARETURN$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "prepare_ListaServiziSLAReturn");
    
    
    /**
     * Gets the "prepare_ListaServiziSLAReturn" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType getPrepareListaServiziSLAReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType)get_store().find_element_user(PREPARELISTASERVIZISLARETURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prepare_ListaServiziSLAReturn" element
     */
    public void setPrepareListaServiziSLAReturn(it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType prepareListaServiziSLAReturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType)get_store().find_element_user(PREPARELISTASERVIZISLARETURN$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType)get_store().add_element_user(PREPARELISTASERVIZISLARETURN$0);
            }
            target.set(prepareListaServiziSLAReturn);
        }
    }
    
    /**
     * Appends and returns a new empty "prepare_ListaServiziSLAReturn" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType addNewPrepareListaServiziSLAReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAOutType)get_store().add_element_user(PREPARELISTASERVIZISLARETURN$0);
            return target;
        }
    }
}
