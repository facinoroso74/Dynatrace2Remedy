/*
 * An XML document type.
 * Localname: prepare_ListaAssetReturn
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one prepare_ListaAssetReturn(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class PrepareListaAssetReturnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaAssetReturnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
