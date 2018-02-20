/*
 * XML Type:  prepare_ListaAssetReturn
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML prepare_ListaAssetReturn(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class PrepareListaAssetReturnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.PrepareListaAssetReturn
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaAssetReturnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARDINALITAITEM$0 = 
        new javax.xml.namespace.QName("", "CardinalitaItem");
    private static final javax.xml.namespace.QName NUMEROITEMPERPAGINA$2 = 
        new javax.xml.namespace.QName("", "NumeroItemPerPagina");
    private static final javax.xml.namespace.QName REQUESTID$4 = 
        new javax.xml.namespace.QName("", "RequestID");
    private static final javax.xml.namespace.QName TOTALEPAGINE$6 = 
        new javax.xml.namespace.QName("", "TotalePagine");
    
    
    /**
     * Gets the "CardinalitaItem" attribute
     */
    public java.lang.String getCardinalitaItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITAITEM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardinalitaItem" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCardinalitaItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARDINALITAITEM$0);
            return target;
        }
    }
    
    /**
     * Sets the "CardinalitaItem" attribute
     */
    public void setCardinalitaItem(java.lang.String cardinalitaItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITAITEM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDINALITAITEM$0);
            }
            target.setStringValue(cardinalitaItem);
        }
    }
    
    /**
     * Sets (as xml) the "CardinalitaItem" attribute
     */
    public void xsetCardinalitaItem(org.apache.xmlbeans.XmlString cardinalitaItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARDINALITAITEM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CARDINALITAITEM$0);
            }
            target.set(cardinalitaItem);
        }
    }
    
    /**
     * Gets the "NumeroItemPerPagina" attribute
     */
    public java.lang.String getNumeroItemPerPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMEROITEMPERPAGINA$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroItemPerPagina" attribute
     */
    public org.apache.xmlbeans.XmlString xgetNumeroItemPerPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMEROITEMPERPAGINA$2);
            return target;
        }
    }
    
    /**
     * Sets the "NumeroItemPerPagina" attribute
     */
    public void setNumeroItemPerPagina(java.lang.String numeroItemPerPagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMEROITEMPERPAGINA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMEROITEMPERPAGINA$2);
            }
            target.setStringValue(numeroItemPerPagina);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroItemPerPagina" attribute
     */
    public void xsetNumeroItemPerPagina(org.apache.xmlbeans.XmlString numeroItemPerPagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMEROITEMPERPAGINA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NUMEROITEMPERPAGINA$2);
            }
            target.set(numeroItemPerPagina);
        }
    }
    
    /**
     * Gets the "RequestID" attribute
     */
    public java.lang.String getRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTID$4);
            return target;
        }
    }
    
    /**
     * Sets the "RequestID" attribute
     */
    public void setRequestID(java.lang.String requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTID$4);
            }
            target.setStringValue(requestID);
        }
    }
    
    /**
     * Sets (as xml) the "RequestID" attribute
     */
    public void xsetRequestID(org.apache.xmlbeans.XmlString requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUESTID$4);
            }
            target.set(requestID);
        }
    }
    
    /**
     * Gets the "TotalePagine" attribute
     */
    public java.lang.String getTotalePagine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALEPAGINE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalePagine" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTotalePagine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOTALEPAGINE$6);
            return target;
        }
    }
    
    /**
     * Sets the "TotalePagine" attribute
     */
    public void setTotalePagine(java.lang.String totalePagine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALEPAGINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALEPAGINE$6);
            }
            target.setStringValue(totalePagine);
        }
    }
    
    /**
     * Sets (as xml) the "TotalePagine" attribute
     */
    public void xsetTotalePagine(org.apache.xmlbeans.XmlString totalePagine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOTALEPAGINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOTALEPAGINE$6);
            }
            target.set(totalePagine);
        }
    }
}
