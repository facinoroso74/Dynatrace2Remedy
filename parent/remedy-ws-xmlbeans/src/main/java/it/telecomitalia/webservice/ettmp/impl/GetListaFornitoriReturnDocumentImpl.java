/*
 * An XML document type.
 * Localname: get_ListaFornitoriReturn
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaFornitoriReturnDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaFornitoriReturn(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaFornitoriReturnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaFornitoriReturnDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaFornitoriReturnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
