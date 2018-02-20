/*
 * An XML document type.
 * Localname: prepare_ListaAsset
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one prepare_ListaAsset(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class PrepareListaAssetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaAssetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREPARELISTAASSET$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "prepare_ListaAsset");
    
    
    /**
     * Gets the "prepare_ListaAsset" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset getPrepareListaAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset)get_store().find_element_user(PREPARELISTAASSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prepare_ListaAsset" element
     */
    public void setPrepareListaAsset(it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset prepareListaAsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset)get_store().find_element_user(PREPARELISTAASSET$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset)get_store().add_element_user(PREPARELISTAASSET$0);
            }
            target.set(prepareListaAsset);
        }
    }
    
    /**
     * Appends and returns a new empty "prepare_ListaAsset" element
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset addNewPrepareListaAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset)get_store().add_element_user(PREPARELISTAASSET$0);
            return target;
        }
    }
    /**
     * An XML prepare_ListaAsset(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class PrepareListaAssetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaAssetDocument.PrepareListaAsset
    {
        private static final long serialVersionUID = 1L;
        
        public PrepareListaAssetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PREPARELISTAASSETIN$0 = 
            new javax.xml.namespace.QName("", "prepare_ListaAsset_In");
        
        
        /**
         * Gets the "prepare_ListaAsset_In" element
         */
        public it.telecomitalia.webservice.ettmp.PrepareListaAssetInType getPrepareListaAssetIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaAssetInType target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType)get_store().find_element_user(PREPARELISTAASSETIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "prepare_ListaAsset_In" element
         */
        public void setPrepareListaAssetIn(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType prepareListaAssetIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaAssetInType target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType)get_store().find_element_user(PREPARELISTAASSETIN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType)get_store().add_element_user(PREPARELISTAASSETIN$0);
                }
                target.set(prepareListaAssetIn);
            }
        }
        
        /**
         * Appends and returns a new empty "prepare_ListaAsset_In" element
         */
        public it.telecomitalia.webservice.ettmp.PrepareListaAssetInType addNewPrepareListaAssetIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.PrepareListaAssetInType target = null;
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType)get_store().add_element_user(PREPARELISTAASSETIN$0);
                return target;
            }
        }
    }
}
