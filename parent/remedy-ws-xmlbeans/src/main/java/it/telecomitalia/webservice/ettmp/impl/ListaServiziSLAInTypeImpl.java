/*
 * XML Type:  ListaServiziSLA_In_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ListaServiziSLAInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML ListaServiziSLA_In_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class ListaServiziSLAInTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaServiziSLAInType
{
    private static final long serialVersionUID = 1L;
    
    public ListaServiziSLAInTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTID$0 = 
        new javax.xml.namespace.QName("", "RequestID");
    private static final javax.xml.namespace.QName PAGINA$2 = 
        new javax.xml.namespace.QName("", "Pagina");
    
    
    /**
     * Gets the "RequestID" attribute
     */
    public java.math.BigInteger getRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestID" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$0);
            return target;
        }
    }
    
    /**
     * Sets the "RequestID" attribute
     */
    public void setRequestID(java.math.BigInteger requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTID$0);
            }
            target.setBigIntegerValue(requestID);
        }
    }
    
    /**
     * Sets (as xml) the "RequestID" attribute
     */
    public void xsetRequestID(org.apache.xmlbeans.XmlInteger requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTID$0);
            }
            target.set(requestID);
        }
    }
    
    /**
     * Gets the "Pagina" attribute
     */
    public java.math.BigInteger getPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINA$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Pagina" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGINA$2);
            return target;
        }
    }
    
    /**
     * Sets the "Pagina" attribute
     */
    public void setPagina(java.math.BigInteger pagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINA$2);
            }
            target.setBigIntegerValue(pagina);
        }
    }
    
    /**
     * Sets (as xml) the "Pagina" attribute
     */
    public void xsetPagina(org.apache.xmlbeans.XmlInteger pagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGINA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PAGINA$2);
            }
            target.set(pagina);
        }
    }
}
