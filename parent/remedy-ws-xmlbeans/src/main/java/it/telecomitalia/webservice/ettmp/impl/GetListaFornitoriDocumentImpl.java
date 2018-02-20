/*
 * An XML document type.
 * Localname: get_ListaFornitori
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaFornitoriDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaFornitori(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaFornitoriDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaFornitoriDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaFornitoriDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTAFORNITORI$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaFornitori");
    
    
    /**
     * Gets the "get_ListaFornitori" element
     */
    public it.telecomitalia.webservice.ettmp.ListaFornitoriInType getGetListaFornitori()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaFornitoriInType target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaFornitoriInType)get_store().find_element_user(GETLISTAFORNITORI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get_ListaFornitori" element
     */
    public void setGetListaFornitori(it.telecomitalia.webservice.ettmp.ListaFornitoriInType getListaFornitori)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaFornitoriInType target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaFornitoriInType)get_store().find_element_user(GETLISTAFORNITORI$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.ListaFornitoriInType)get_store().add_element_user(GETLISTAFORNITORI$0);
            }
            target.set(getListaFornitori);
        }
    }
    
    /**
     * Appends and returns a new empty "get_ListaFornitori" element
     */
    public it.telecomitalia.webservice.ettmp.ListaFornitoriInType addNewGetListaFornitori()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaFornitoriInType target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaFornitoriInType)get_store().add_element_user(GETLISTAFORNITORI$0);
            return target;
        }
    }
}
