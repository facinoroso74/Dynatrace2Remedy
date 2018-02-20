/*
 * XML Type:  prepare_ListaServiziSLA_In_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML prepare_ListaServiziSLA_In_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class PrepareListaServiziSLAInTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaServiziSLAInTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDCLIENTE$0 = 
        new javax.xml.namespace.QName("", "IdCliente");
    private static final javax.xml.namespace.QName IDLOTTO$2 = 
        new javax.xml.namespace.QName("", "IdLotto");
    
    
    /**
     * Gets the "IdCliente" attribute
     */
    public java.math.BigInteger getIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$0);
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
            return get_store().find_attribute_user(IDCLIENTE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCLIENTE$0);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDCLIENTE$0);
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
            get_store().remove_attribute(IDCLIENTE$0);
        }
    }
    
    /**
     * Gets the "IdLotto" attribute
     */
    public java.lang.String getIdLotto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLOTTO$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdLotto" attribute
     */
    public it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto xgetIdLotto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto)get_store().find_attribute_user(IDLOTTO$2);
            return target;
        }
    }
    
    /**
     * True if has "IdLotto" attribute
     */
    public boolean isSetIdLotto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDLOTTO$2) != null;
        }
    }
    
    /**
     * Sets the "IdLotto" attribute
     */
    public void setIdLotto(java.lang.String idLotto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLOTTO$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDLOTTO$2);
            }
            target.setStringValue(idLotto);
        }
    }
    
    /**
     * Sets (as xml) the "IdLotto" attribute
     */
    public void xsetIdLotto(it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto idLotto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto target = null;
            target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto)get_store().find_attribute_user(IDLOTTO$2);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto)get_store().add_attribute_user(IDLOTTO$2);
            }
            target.set(idLotto);
        }
    }
    
    /**
     * Unsets the "IdLotto" attribute
     */
    public void unsetIdLotto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDLOTTO$2);
        }
    }
    /**
     * An XML IdLotto(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType$IdLotto.
     */
    public static class IdLottoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.PrepareListaServiziSLAInType.IdLotto
    {
        private static final long serialVersionUID = 1L;
        
        public IdLottoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IdLottoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
