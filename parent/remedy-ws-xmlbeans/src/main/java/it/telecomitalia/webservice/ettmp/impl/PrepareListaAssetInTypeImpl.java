/*
 * XML Type:  prepare_ListaAsset_In_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML prepare_ListaAsset_In_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class PrepareListaAssetInTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaAssetInType
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaAssetInTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDASSET$0 = 
        new javax.xml.namespace.QName("", "IdAsset");
    private static final javax.xml.namespace.QName CATEGORIA$2 = 
        new javax.xml.namespace.QName("", "Categoria");
    private static final javax.xml.namespace.QName STATO$4 = 
        new javax.xml.namespace.QName("", "Stato");
    private static final javax.xml.namespace.QName IDCLIENTE$6 = 
        new javax.xml.namespace.QName("", "IdCliente");
    
    
    /**
     * Gets the "IdAsset" attribute
     */
    public java.math.BigInteger getIdAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDASSET$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdAsset" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetIdAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDASSET$0);
            return target;
        }
    }
    
    /**
     * True if has "IdAsset" attribute
     */
    public boolean isSetIdAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDASSET$0) != null;
        }
    }
    
    /**
     * Sets the "IdAsset" attribute
     */
    public void setIdAsset(java.math.BigInteger idAsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDASSET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDASSET$0);
            }
            target.setBigIntegerValue(idAsset);
        }
    }
    
    /**
     * Sets (as xml) the "IdAsset" attribute
     */
    public void xsetIdAsset(org.apache.xmlbeans.XmlInteger idAsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDASSET$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDASSET$0);
            }
            target.set(idAsset);
        }
    }
    
    /**
     * Unsets the "IdAsset" attribute
     */
    public void unsetIdAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDASSET$0);
        }
    }
    
    /**
     * Gets the "Categoria" attribute
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria.Enum getCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORIA$2);
            if (target == null)
            {
                return null;
            }
            return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Categoria" attribute
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria xgetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria)get_store().find_attribute_user(CATEGORIA$2);
            return target;
        }
    }
    
    /**
     * True if has "Categoria" attribute
     */
    public boolean isSetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATEGORIA$2) != null;
        }
    }
    
    /**
     * Sets the "Categoria" attribute
     */
    public void setCategoria(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria.Enum categoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORIA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORIA$2);
            }
            target.setEnumValue(categoria);
        }
    }
    
    /**
     * Sets (as xml) the "Categoria" attribute
     */
    public void xsetCategoria(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria categoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria)get_store().find_attribute_user(CATEGORIA$2);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria)get_store().add_attribute_user(CATEGORIA$2);
            }
            target.set(categoria);
        }
    }
    
    /**
     * Unsets the "Categoria" attribute
     */
    public void unsetCategoria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATEGORIA$2);
        }
    }
    
    /**
     * Gets the "Stato" attribute
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato.Enum getStato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATO$4);
            if (target == null)
            {
                return null;
            }
            return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Stato" attribute
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato xgetStato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato)get_store().find_attribute_user(STATO$4);
            return target;
        }
    }
    
    /**
     * Sets the "Stato" attribute
     */
    public void setStato(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato.Enum stato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATO$4);
            }
            target.setEnumValue(stato);
        }
    }
    
    /**
     * Sets (as xml) the "Stato" attribute
     */
    public void xsetStato(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato stato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato)get_store().find_attribute_user(STATO$4);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato)get_store().add_attribute_user(STATO$4);
            }
            target.set(stato);
        }
    }
    
    /**
     * Gets the "IdCliente" attribute
     */
    public java.math.BigInteger getIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdCliente" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$6);
            return target;
        }
    }
    
    /**
     * True if has "IdCliente" attribute
     */
    public boolean isSetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDCLIENTE$6) != null;
        }
    }
    
    /**
     * Sets the "IdCliente" attribute
     */
    public void setIdCliente(java.math.BigInteger idCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCLIENTE$6);
            }
            target.setBigIntegerValue(idCliente);
        }
    }
    
    /**
     * Sets (as xml) the "IdCliente" attribute
     */
    public void xsetIdCliente(org.apache.xmlbeans.XmlInteger idCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDCLIENTE$6);
            }
            target.set(idCliente);
        }
    }
    
    /**
     * Unsets the "IdCliente" attribute
     */
    public void unsetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDCLIENTE$6);
        }
    }
    /**
     * An XML Categoria(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.PrepareListaAssetInType$Categoria.
     */
    public static class CategoriaImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria
    {
        private static final long serialVersionUID = 1L;
        
        public CategoriaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CategoriaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Stato(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.PrepareListaAssetInType$Stato.
     */
    public static class StatoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato
    {
        private static final long serialVersionUID = 1L;
        
        public StatoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StatoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
