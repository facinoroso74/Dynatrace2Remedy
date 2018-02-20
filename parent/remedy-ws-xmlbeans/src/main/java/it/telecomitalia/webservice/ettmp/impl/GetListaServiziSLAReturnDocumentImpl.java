/*
 * An XML document type.
 * Localname: get_ListaServiziSLAReturn
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaServiziSLAReturnDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaServiziSLAReturn(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaServiziSLAReturnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaServiziSLAReturnDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaServiziSLAReturnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
