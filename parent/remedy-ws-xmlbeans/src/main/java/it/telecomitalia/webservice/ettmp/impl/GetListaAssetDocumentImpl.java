/*
 * An XML document type.
 * Localname: get_ListaAsset
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaAssetDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one get_ListaAsset(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class GetListaAssetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaAssetDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListaAssetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTAASSET$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "get_ListaAsset");
    
    
    /**
     * Gets the "get_ListaAsset" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset getGetListaAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset)get_store().find_element_user(GETLISTAASSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get_ListaAsset" element
     */
    public void setGetListaAsset(it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset getListaAsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset)get_store().find_element_user(GETLISTAASSET$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset)get_store().add_element_user(GETLISTAASSET$0);
            }
            target.set(getListaAsset);
        }
    }
    
    /**
     * Appends and returns a new empty "get_ListaAsset" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset addNewGetListaAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset)get_store().add_element_user(GETLISTAASSET$0);
            return target;
        }
    }
    /**
     * An XML get_ListaAsset(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class GetListaAssetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaAssetDocument.GetListaAsset
    {
        private static final long serialVersionUID = 1L;
        
        public GetListaAssetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTAASSETIN$0 = 
            new javax.xml.namespace.QName("", "ListaAsset_In");
        
        
        /**
         * Gets the "ListaAsset_In" element
         */
        public it.telecomitalia.webservice.ettmp.ListaAssetInType getListaAssetIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaAssetInType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaAssetInType)get_store().find_element_user(LISTAASSETIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListaAsset_In" element
         */
        public void setListaAssetIn(it.telecomitalia.webservice.ettmp.ListaAssetInType listaAssetIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaAssetInType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaAssetInType)get_store().find_element_user(LISTAASSETIN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaAssetInType)get_store().add_element_user(LISTAASSETIN$0);
                }
                target.set(listaAssetIn);
            }
        }
        
        /**
         * Appends and returns a new empty "ListaAsset_In" element
         */
        public it.telecomitalia.webservice.ettmp.ListaAssetInType addNewListaAssetIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaAssetInType target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaAssetInType)get_store().add_element_user(LISTAASSETIN$0);
                return target;
            }
        }
    }
}
