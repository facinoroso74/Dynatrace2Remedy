/*
 * XML Type:  prepare_ListaAsset_Return_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML prepare_ListaAsset_Return_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType.
 */
public class PrepareListaAssetReturnTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType
{
    private static final long serialVersionUID = 1L;
    
    public PrepareListaAssetReturnTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected PrepareListaAssetReturnTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
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
    public java.math.BigInteger getCardinalitaItem()
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
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardinalitaItem" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCardinalitaItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITAITEM$0);
            return target;
        }
    }
    
    /**
     * Sets the "CardinalitaItem" attribute
     */
    public void setCardinalitaItem(java.math.BigInteger cardinalitaItem)
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
            target.setBigIntegerValue(cardinalitaItem);
        }
    }
    
    /**
     * Sets (as xml) the "CardinalitaItem" attribute
     */
    public void xsetCardinalitaItem(org.apache.xmlbeans.XmlInteger cardinalitaItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITAITEM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CARDINALITAITEM$0);
            }
            target.set(cardinalitaItem);
        }
    }
    
    /**
     * Gets the "NumeroItemPerPagina" attribute
     */
    public java.math.BigInteger getNumeroItemPerPagina()
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
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroItemPerPagina" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumeroItemPerPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMEROITEMPERPAGINA$2);
            return target;
        }
    }
    
    /**
     * Sets the "NumeroItemPerPagina" attribute
     */
    public void setNumeroItemPerPagina(java.math.BigInteger numeroItemPerPagina)
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
            target.setBigIntegerValue(numeroItemPerPagina);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroItemPerPagina" attribute
     */
    public void xsetNumeroItemPerPagina(org.apache.xmlbeans.XmlInteger numeroItemPerPagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMEROITEMPERPAGINA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMEROITEMPERPAGINA$2);
            }
            target.set(numeroItemPerPagina);
        }
    }
    
    /**
     * Gets the "RequestID" attribute
     */
    public java.math.BigInteger getRequestID()
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTID$4);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTID$4);
            }
            target.set(requestID);
        }
    }
    
    /**
     * Gets the "TotalePagine" attribute
     */
    public java.math.BigInteger getTotalePagine()
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
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalePagine" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalePagine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALEPAGINE$6);
            return target;
        }
    }
    
    /**
     * Sets the "TotalePagine" attribute
     */
    public void setTotalePagine(java.math.BigInteger totalePagine)
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
            target.setBigIntegerValue(totalePagine);
        }
    }
    
    /**
     * Sets (as xml) the "TotalePagine" attribute
     */
    public void xsetTotalePagine(org.apache.xmlbeans.XmlInteger totalePagine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALEPAGINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOTALEPAGINE$6);
            }
            target.set(totalePagine);
        }
    }
}
