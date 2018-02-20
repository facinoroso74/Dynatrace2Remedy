/*
 * XML Type:  RichiestaCliCodFault
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface.impl;
/**
 * An XML RichiestaCliCodFault(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class RichiestaCliCodFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault
{
    private static final long serialVersionUID = 1L;
    
    public RichiestaCliCodFaultImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CODICEERRORE$8 = 
        new javax.xml.namespace.QName("", "CodiceErrore");
    private static final javax.xml.namespace.QName DESCRIZIONEERRORE$10 = 
        new javax.xml.namespace.QName("", "DescrizioneErrore");
    
    
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
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione xgetTipoOperazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
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
    public void xsetTipoOperazione(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione tipoOperazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione)get_store().add_element_user(TIPOOPERAZIONE$2);
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
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq xgetSysReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq)get_store().find_element_user(SYSREQ$4, 0);
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
    public void xsetSysReq(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq sysReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq)get_store().find_element_user(SYSREQ$4, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq)get_store().add_element_user(SYSREQ$4);
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
     * Gets the "CodiceErrore" element
     */
    public java.lang.String getCodiceErrore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEERRORE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceErrore" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore xgetCodiceErrore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore)get_store().find_element_user(CODICEERRORE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CodiceErrore" element
     */
    public void setCodiceErrore(java.lang.String codiceErrore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEERRORE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICEERRORE$8);
            }
            target.setStringValue(codiceErrore);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceErrore" element
     */
    public void xsetCodiceErrore(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore codiceErrore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore)get_store().find_element_user(CODICEERRORE$8, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore)get_store().add_element_user(CODICEERRORE$8);
            }
            target.set(codiceErrore);
        }
    }
    
    /**
     * Gets the "DescrizioneErrore" element
     */
    public java.lang.String getDescrizioneErrore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONEERRORE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DescrizioneErrore" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore xgetDescrizioneErrore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore)get_store().find_element_user(DESCRIZIONEERRORE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DescrizioneErrore" element
     */
    public void setDescrizioneErrore(java.lang.String descrizioneErrore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONEERRORE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIZIONEERRORE$10);
            }
            target.setStringValue(descrizioneErrore);
        }
    }
    
    /**
     * Sets (as xml) the "DescrizioneErrore" element
     */
    public void xsetDescrizioneErrore(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore descrizioneErrore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore)get_store().find_element_user(DESCRIZIONEERRORE$10, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore)get_store().add_element_user(DESCRIZIONEERRORE$10);
            }
            target.set(descrizioneErrore);
        }
    }
    /**
     * An XML TipoOperazione(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$TipoOperazione.
     */
    public static class TipoOperazioneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione
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
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$SysReq.
     */
    public static class SysReqImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq
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
     * An XML CodiceErrore(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$CodiceErrore.
     */
    public static class CodiceErroreImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore
    {
        private static final long serialVersionUID = 1L;
        
        public CodiceErroreImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CodiceErroreImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML DescrizioneErrore(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$DescrizioneErrore.
     */
    public static class DescrizioneErroreImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore
    {
        private static final long serialVersionUID = 1L;
        
        public DescrizioneErroreImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DescrizioneErroreImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
