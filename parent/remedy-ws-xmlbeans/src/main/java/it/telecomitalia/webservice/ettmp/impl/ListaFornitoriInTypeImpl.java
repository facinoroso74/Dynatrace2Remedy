/*
 * XML Type:  ListaFornitori_In_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ListaFornitoriInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML ListaFornitori_In_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class ListaFornitoriInTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaFornitoriInType
{
    private static final long serialVersionUID = 1L;
    
    public ListaFornitoriInTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APP$0 = 
        new javax.xml.namespace.QName("", "app");
    
    
    /**
     * Gets the "app" attribute
     */
    public java.lang.String getApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APP$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "app" attribute
     */
    public org.apache.xmlbeans.XmlString xgetApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APP$0);
            return target;
        }
    }
    
    /**
     * True if has "app" attribute
     */
    public boolean isSetApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APP$0) != null;
        }
    }
    
    /**
     * Sets the "app" attribute
     */
    public void setApp(java.lang.String app)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APP$0);
            }
            target.setStringValue(app);
        }
    }
    
    /**
     * Sets (as xml) the "app" attribute
     */
    public void xsetApp(org.apache.xmlbeans.XmlString app)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APP$0);
            }
            target.set(app);
        }
    }
    
    /**
     * Unsets the "app" attribute
     */
    public void unsetApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APP$0);
        }
    }
}
