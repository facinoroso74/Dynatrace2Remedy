/*
 * XML Type:  RichiestaCliCod_InType
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface.impl;
/**
 * An XML RichiestaCliCod_InType(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class RichiestaCliCodInTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType
{
    private static final long serialVersionUID = 1L;
    
    public RichiestaCliCodInTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDRICHIESTA$0 = 
        new javax.xml.namespace.QName("", "IdRichiesta");
    private static final javax.xml.namespace.QName TIPOOPERAZIONE$2 = 
        new javax.xml.namespace.QName("", "TipoOperazione");
    private static final javax.xml.namespace.QName SYSREQ$4 = 
        new javax.xml.namespace.QName("", "SysReq");
    private static final javax.xml.namespace.QName DATAOPERAZIONE$6 = 
        new javax.xml.namespace.QName("", "DataOperazione");
    private static final javax.xml.namespace.QName CUSTOMERID$8 = 
        new javax.xml.namespace.QName("", "CUSTOMER_ID");
    private static final javax.xml.namespace.QName CODFISCALE$10 = 
        new javax.xml.namespace.QName("", "CODFISCALE");
    private static final javax.xml.namespace.QName DATAINIZIO$12 = 
        new javax.xml.namespace.QName("", "DataInizio");
    private static final javax.xml.namespace.QName DATAFINE$14 = 
        new javax.xml.namespace.QName("", "DataFine");
    
    
    /**
     * Gets the "IdRichiesta" element
     */
    public int getIdRichiesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDRICHIESTA$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdRichiesta" element
     */
    public org.apache.xmlbeans.XmlInt xgetIdRichiesta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDRICHIESTA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IdRichiesta" element
     */
    public void setIdRichiesta(int idRichiesta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDRICHIESTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDRICHIESTA$0);
            }
            target.setIntValue(idRichiesta);
        }
    }
    
    /**
     * Sets (as xml) the "IdRichiesta" element
     */
    public void xsetIdRichiesta(org.apache.xmlbeans.XmlInt idRichiesta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IDRICHIESTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IDRICHIESTA$0);
            }
            target.set(idRichiesta);
        }
    }
    
    /**
     * Gets the "TipoOperazione" element
     */
    public java.lang.String getTipoOperazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoOperazione" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione xgetTipoOperazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TipoOperazione" element
     */
    public void setTipoOperazione(java.lang.String tipoOperazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOOPERAZIONE$2);
            }
            target.setStringValue(tipoOperazione);
        }
    }
    
    /**
     * Sets (as xml) the "TipoOperazione" element
     */
    public void xsetTipoOperazione(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione tipoOperazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione)get_store().add_element_user(TIPOOPERAZIONE$2);
            }
            target.set(tipoOperazione);
        }
    }
    
    /**
     * Gets the "SysReq" element
     */
    public java.lang.String getSysReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSREQ$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SysReq" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq xgetSysReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq)get_store().find_element_user(SYSREQ$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SysReq" element
     */
    public void setSysReq(java.lang.String sysReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSREQ$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSREQ$4);
            }
            target.setStringValue(sysReq);
        }
    }
    
    /**
     * Sets (as xml) the "SysReq" element
     */
    public void xsetSysReq(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq sysReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq)get_store().find_element_user(SYSREQ$4, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq)get_store().add_element_user(SYSREQ$4);
            }
            target.set(sysReq);
        }
    }
    
    /**
     * Gets the "DataOperazione" element
     */
    public java.util.Calendar getDataOperazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAOPERAZIONE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataOperazione" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataOperazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAOPERAZIONE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataOperazione" element
     */
    public void setDataOperazione(java.util.Calendar dataOperazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAOPERAZIONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAOPERAZIONE$6);
            }
            target.setCalendarValue(dataOperazione);
        }
    }
    
    /**
     * Sets (as xml) the "DataOperazione" element
     */
    public void xsetDataOperazione(org.apache.xmlbeans.XmlDateTime dataOperazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAOPERAZIONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAOPERAZIONE$6);
            }
            target.set(dataOperazione);
        }
    }
    
    /**
     * Gets the "CUSTOMER_ID" element
     */
    public java.lang.String getCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CUSTOMER_ID" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID xgetCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID)get_store().find_element_user(CUSTOMERID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "CUSTOMER_ID" element
     */
    public boolean isSetCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERID$8) != 0;
        }
    }
    
    /**
     * Sets the "CUSTOMER_ID" element
     */
    public void setCUSTOMERID(java.lang.String customerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$8);
            }
            target.setStringValue(customerid);
        }
    }
    
    /**
     * Sets (as xml) the "CUSTOMER_ID" element
     */
    public void xsetCUSTOMERID(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID customerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID)get_store().find_element_user(CUSTOMERID$8, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID)get_store().add_element_user(CUSTOMERID$8);
            }
            target.set(customerid);
        }
    }
    
    /**
     * Unsets the "CUSTOMER_ID" element
     */
    public void unsetCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERID$8, 0);
        }
    }
    
    /**
     * Gets the "CODFISCALE" element
     */
    public java.lang.String getCODFISCALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODFISCALE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CODFISCALE" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE xgetCODFISCALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE)get_store().find_element_user(CODFISCALE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "CODFISCALE" element
     */
    public boolean isSetCODFISCALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODFISCALE$10) != 0;
        }
    }
    
    /**
     * Sets the "CODFISCALE" element
     */
    public void setCODFISCALE(java.lang.String codfiscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODFISCALE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODFISCALE$10);
            }
            target.setStringValue(codfiscale);
        }
    }
    
    /**
     * Sets (as xml) the "CODFISCALE" element
     */
    public void xsetCODFISCALE(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE codfiscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE)get_store().find_element_user(CODFISCALE$10, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE)get_store().add_element_user(CODFISCALE$10);
            }
            target.set(codfiscale);
        }
    }
    
    /**
     * Unsets the "CODFISCALE" element
     */
    public void unsetCODFISCALE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODFISCALE$10, 0);
        }
    }
    
    /**
     * Gets the "DataInizio" element
     */
    public java.util.Calendar getDataInizio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINIZIO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataInizio" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataInizio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINIZIO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataInizio" element
     */
    public boolean isSetDataInizio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINIZIO$12) != 0;
        }
    }
    
    /**
     * Sets the "DataInizio" element
     */
    public void setDataInizio(java.util.Calendar dataInizio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINIZIO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINIZIO$12);
            }
            target.setCalendarValue(dataInizio);
        }
    }
    
    /**
     * Sets (as xml) the "DataInizio" element
     */
    public void xsetDataInizio(org.apache.xmlbeans.XmlDateTime dataInizio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAINIZIO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAINIZIO$12);
            }
            target.set(dataInizio);
        }
    }
    
    /**
     * Unsets the "DataInizio" element
     */
    public void unsetDataInizio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINIZIO$12, 0);
        }
    }
    
    /**
     * Gets the "DataFine" element
     */
    public java.util.Calendar getDataFine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFINE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataFine" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataFine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAFINE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataFine" element
     */
    public boolean isSetDataFine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFINE$14) != 0;
        }
    }
    
    /**
     * Sets the "DataFine" element
     */
    public void setDataFine(java.util.Calendar dataFine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFINE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFINE$14);
            }
            target.setCalendarValue(dataFine);
        }
    }
    
    /**
     * Sets (as xml) the "DataFine" element
     */
    public void xsetDataFine(org.apache.xmlbeans.XmlDateTime dataFine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAFINE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAFINE$14);
            }
            target.set(dataFine);
        }
    }
    
    /**
     * Unsets the "DataFine" element
     */
    public void unsetDataFine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFINE$14, 0);
        }
    }
    /**
     * An XML TipoOperazione(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$TipoOperazione.
     */
    public static class TipoOperazioneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione
    {
        private static final long serialVersionUID = 1L;
        
        public TipoOperazioneImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TipoOperazioneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML SysReq(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$SysReq.
     */
    public static class SysReqImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq
    {
        private static final long serialVersionUID = 1L;
        
        public SysReqImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SysReqImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CUSTOMER_ID(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$CUSTOMERID.
     */
    public static class CUSTOMERIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID
    {
        private static final long serialVersionUID = 1L;
        
        public CUSTOMERIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CUSTOMERIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CODFISCALE(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$CODFISCALE.
     */
    public static class CODFISCALEImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE
    {
        private static final long serialVersionUID = 1L;
        
        public CODFISCALEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CODFISCALEImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
