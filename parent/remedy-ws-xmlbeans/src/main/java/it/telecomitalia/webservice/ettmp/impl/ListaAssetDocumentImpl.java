/*
 * An XML document type.
 * Localname: ListaAsset
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ListaAssetDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one ListaAsset(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class ListaAssetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaAssetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListaAssetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTAASSET$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "ListaAsset");
    
    
    /**
     * Gets the "ListaAsset" element
     */
    public it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset getListaAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset)get_store().find_element_user(LISTAASSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListaAsset" element
     */
    public void setListaAsset(it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset listaAsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset)get_store().find_element_user(LISTAASSET$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset)get_store().add_element_user(LISTAASSET$0);
            }
            target.set(listaAsset);
        }
    }
    
    /**
     * Appends and returns a new empty "ListaAsset" element
     */
    public it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset addNewListaAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset)get_store().add_element_user(LISTAASSET$0);
            return target;
        }
    }
    /**
     * An XML ListaAsset(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class ListaAssetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaAssetDocument.ListaAsset
    {
        private static final long serialVersionUID = 1L;
        
        public ListaAssetImpl(org.apache.xmlbeans.SchemaType sType)
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
