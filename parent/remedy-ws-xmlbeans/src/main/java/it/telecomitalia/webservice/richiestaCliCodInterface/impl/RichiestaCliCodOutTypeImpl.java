/*
 * XML Type:  RichiestaCliCod_OutType
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface.impl;
/**
 * An XML RichiestaCliCod_OutType(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class RichiestaCliCodOutTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType
{
    private static final long serialVersionUID = 1L;
    
    public RichiestaCliCodOutTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName NUMCLI$8 = 
        new javax.xml.namespace.QName("", "NUM_CLI");
    private static final javax.xml.namespace.QName NUMCLICOD$10 = 
        new javax.xml.namespace.QName("", "NUM_CLI_COD");
    private static final javax.xml.namespace.QName CLIENTITROVATI$12 = 
        new javax.xml.namespace.QName("", "ClientiTrovati");
    
    
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
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione xgetTipoOperazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
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
    public void xsetTipoOperazione(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione tipoOperazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione)get_store().find_element_user(TIPOOPERAZIONE$2, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione)get_store().add_element_user(TIPOOPERAZIONE$2);
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
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq xgetSysReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq)get_store().find_element_user(SYSREQ$4, 0);
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
    public void xsetSysReq(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq sysReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq)get_store().find_element_user(SYSREQ$4, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq)get_store().add_element_user(SYSREQ$4);
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
     * Gets the "NUM_CLI" element
     */
    public java.lang.String getNUMCLI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMCLI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NUM_CLI" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI xgetNUMCLI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI)get_store().find_element_user(NUMCLI$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "NUM_CLI" element
     */
    public boolean isSetNUMCLI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMCLI$8) != 0;
        }
    }
    
    /**
     * Sets the "NUM_CLI" element
     */
    public void setNUMCLI(java.lang.String numcli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMCLI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMCLI$8);
            }
            target.setStringValue(numcli);
        }
    }
    
    /**
     * Sets (as xml) the "NUM_CLI" element
     */
    public void xsetNUMCLI(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI numcli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI)get_store().find_element_user(NUMCLI$8, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI)get_store().add_element_user(NUMCLI$8);
            }
            target.set(numcli);
        }
    }
    
    /**
     * Unsets the "NUM_CLI" element
     */
    public void unsetNUMCLI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMCLI$8, 0);
        }
    }
    
    /**
     * Gets the "NUM_CLI_COD" element
     */
    public java.lang.String getNUMCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMCLICOD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NUM_CLI_COD" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD xgetNUMCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD)get_store().find_element_user(NUMCLICOD$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NUM_CLI_COD" element
     */
    public void setNUMCLICOD(java.lang.String numclicod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMCLICOD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMCLICOD$10);
            }
            target.setStringValue(numclicod);
        }
    }
    
    /**
     * Sets (as xml) the "NUM_CLI_COD" element
     */
    public void xsetNUMCLICOD(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD numclicod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD)get_store().find_element_user(NUMCLICOD$10, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD)get_store().add_element_user(NUMCLICOD$10);
            }
            target.set(numclicod);
        }
    }
    
    /**
     * Gets array of all "ClientiTrovati" elements
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType[] getClientiTrovatiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIENTITROVATI$12, targetList);
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType[] result = new it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ClientiTrovati" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType getClientiTrovatiArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType)get_store().find_element_user(CLIENTITROVATI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ClientiTrovati" element
     */
    public int sizeOfClientiTrovatiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTITROVATI$12);
        }
    }
    
    /**
     * Sets array of all "ClientiTrovati" element
     */
    public void setClientiTrovatiArray(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType[] clientiTrovatiArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clientiTrovatiArray, CLIENTITROVATI$12);
        }
    }
    
    /**
     * Sets ith "ClientiTrovati" element
     */
    public void setClientiTrovatiArray(int i, it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType clientiTrovati)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType)get_store().find_element_user(CLIENTITROVATI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clientiTrovati);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientiTrovati" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType insertNewClientiTrovati(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType)get_store().insert_element_user(CLIENTITROVATI$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClientiTrovati" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType addNewClientiTrovati()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType)get_store().add_element_user(CLIENTITROVATI$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "ClientiTrovati" element
     */
    public void removeClientiTrovati(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTITROVATI$12, i);
        }
    }
    /**
     * An XML TipoOperazione(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$TipoOperazione.
     */
    public static class TipoOperazioneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione
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
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$SysReq.
     */
    public static class SysReqImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq
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
     * An XML NUM_CLI(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$NUMCLI.
     */
    public static class NUMCLIImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI
    {
        private static final long serialVersionUID = 1L;
        
        public NUMCLIImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NUMCLIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML NUM_CLI_COD(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$NUMCLICOD.
     */
    public static class NUMCLICODImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD
    {
        private static final long serialVersionUID = 1L;
        
        public NUMCLICODImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NUMCLICODImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
