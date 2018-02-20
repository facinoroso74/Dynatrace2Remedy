/*
 * An XML document type.
 * Localname: ListaAsset_In
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ListaAssetInDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * A document containing one ListaAsset_In(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class ListaAssetInDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaAssetInDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListaAssetInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTAASSETIN$0 = 
        new javax.xml.namespace.QName("ettmp.webservice.telecomitalia.it", "ListaAsset_In");
    
    
    /**
     * Gets the "ListaAsset_In" element
     */
    public it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn getListaAssetIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn)get_store().find_element_user(LISTAASSETIN$0, 0);
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
    public void setListaAssetIn(it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn listaAssetIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn)get_store().find_element_user(LISTAASSETIN$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn)get_store().add_element_user(LISTAASSETIN$0);
            }
            target.set(listaAssetIn);
        }
    }
    
    /**
     * Appends and returns a new empty "ListaAsset_In" element
     */
    public it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn addNewListaAssetIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn)get_store().add_element_user(LISTAASSETIN$0);
            return target;
        }
    }
    /**
     * An XML ListaAsset_In(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class ListaAssetInImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaAssetInDocument.ListaAssetIn
    {
        private static final long serialVersionUID = 1L;
        
        public ListaAssetInImpl(org.apache.xmlbeans.SchemaType sType)
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
