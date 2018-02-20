/*
 * XML Type:  ClientiTrovatiType
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface.impl;
/**
 * An XML ClientiTrovatiType(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class ClientiTrovatiTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType
{
    private static final long serialVersionUID = 1L;
    
    public ClientiTrovatiTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLICFISC$0 = 
        new javax.xml.namespace.QName("", "CLI_CFISC");
    private static final javax.xml.namespace.QName CUSTOMERID$2 = 
        new javax.xml.namespace.QName("", "CUSTOMER_ID");
    private static final javax.xml.namespace.QName CLIRAGSOC$4 = 
        new javax.xml.namespace.QName("", "CLI_RAGSOC");
    private static final javax.xml.namespace.QName CLICOD$6 = 
        new javax.xml.namespace.QName("", "CLI_COD");
    private static final javax.xml.namespace.QName CLIDESVID$8 = 
        new javax.xml.namespace.QName("", "CLI_DESVID");
    private static final javax.xml.namespace.QName CLIFLAGFD$10 = 
        new javax.xml.namespace.QName("", "CLI_FLAG_FD");
    private static final javax.xml.namespace.QName CODCONTRATTORIFERIMENTO$12 = 
        new javax.xml.namespace.QName("", "COD_CONTRATTO_RIFERIMENTO");
    private static final javax.xml.namespace.QName CLIDOMINIO$14 = 
        new javax.xml.namespace.QName("", "CLI_DOMINIO");
    private static final javax.xml.namespace.QName CLICATEGORIA$16 = 
        new javax.xml.namespace.QName("", "CLI_CATEGORIA");
    private static final javax.xml.namespace.QName IDCLIENTEESTERNO$18 = 
        new javax.xml.namespace.QName("", "ID_CLIENTE_ESTERNO");
    private static final javax.xml.namespace.QName CLIDESSTP$20 = 
        new javax.xml.namespace.QName("", "CLI_DESSTP");
    private static final javax.xml.namespace.QName CREATEDATE$22 = 
        new javax.xml.namespace.QName("", "CREATE_DATE");
    private static final javax.xml.namespace.QName CLIDATACREAZIONE$24 = 
        new javax.xml.namespace.QName("", "CLI_DATACREAZIONE");
    private static final javax.xml.namespace.QName CONTRATTO$26 = 
        new javax.xml.namespace.QName("", "CONTRATTO");
    private static final javax.xml.namespace.QName CLIDATAULTMOD$28 = 
        new javax.xml.namespace.QName("", "CLI_DATAULTMOD");
    private static final javax.xml.namespace.QName CRMROWIDEXTCLIENTI$30 = 
        new javax.xml.namespace.QName("", "CRM_ROWID_EXTCLIENTI");
    private static final javax.xml.namespace.QName FLAGCLICRM$32 = 
        new javax.xml.namespace.QName("", "FLAG_CLI_CRM");
    private static final javax.xml.namespace.QName FLAGCLISI$34 = 
        new javax.xml.namespace.QName("", "FLAG_CLI_SI");
    private static final javax.xml.namespace.QName CLIFLGCANC$36 = 
        new javax.xml.namespace.QName("", "CLI_FLGCANC");
    
    
    /**
     * Gets the "CLI_CFISC" element
     */
    public java.lang.String getCLICFISC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICFISC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_CFISC" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC xgetCLICFISC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC)get_store().find_element_user(CLICFISC$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_CFISC" element
     */
    public boolean isNilCLICFISC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC)get_store().find_element_user(CLICFISC$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_CFISC" element
     */
    public boolean isSetCLICFISC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLICFISC$0) != 0;
        }
    }
    
    /**
     * Sets the "CLI_CFISC" element
     */
    public void setCLICFISC(java.lang.String clicfisc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICFISC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLICFISC$0);
            }
            target.setStringValue(clicfisc);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_CFISC" element
     */
    public void xsetCLICFISC(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC clicfisc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC)get_store().find_element_user(CLICFISC$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC)get_store().add_element_user(CLICFISC$0);
            }
            target.set(clicfisc);
        }
    }
    
    /**
     * Nils the "CLI_CFISC" element
     */
    public void setNilCLICFISC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC)get_store().find_element_user(CLICFISC$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC)get_store().add_element_user(CLICFISC$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_CFISC" element
     */
    public void unsetCLICFISC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLICFISC$0, 0);
        }
    }
    
    /**
     * Gets the "CUSTOMER_ID" element
     */
    public int getCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CUSTOMER_ID" element
     */
    public org.apache.xmlbeans.XmlInt xgetCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CUSTOMER_ID" element
     */
    public boolean isNilCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null) return false;
            return target.isNil();
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
            return get_store().count_elements(CUSTOMERID$2) != 0;
        }
    }
    
    /**
     * Sets the "CUSTOMER_ID" element
     */
    public void setCUSTOMERID(int customerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$2);
            }
            target.setIntValue(customerid);
        }
    }
    
    /**
     * Sets (as xml) the "CUSTOMER_ID" element
     */
    public void xsetCUSTOMERID(org.apache.xmlbeans.XmlInt customerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CUSTOMERID$2);
            }
            target.set(customerid);
        }
    }
    
    /**
     * Nils the "CUSTOMER_ID" element
     */
    public void setNilCUSTOMERID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CUSTOMERID$2);
            }
            target.setNil();
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
            get_store().remove_element(CUSTOMERID$2, 0);
        }
    }
    
    /**
     * Gets the "CLI_RAGSOC" element
     */
    public java.lang.String getCLIRAGSOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIRAGSOC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_RAGSOC" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC xgetCLIRAGSOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC)get_store().find_element_user(CLIRAGSOC$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_RAGSOC" element
     */
    public boolean isNilCLIRAGSOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC)get_store().find_element_user(CLIRAGSOC$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_RAGSOC" element
     */
    public boolean isSetCLIRAGSOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIRAGSOC$4) != 0;
        }
    }
    
    /**
     * Sets the "CLI_RAGSOC" element
     */
    public void setCLIRAGSOC(java.lang.String cliragsoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIRAGSOC$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIRAGSOC$4);
            }
            target.setStringValue(cliragsoc);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_RAGSOC" element
     */
    public void xsetCLIRAGSOC(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC cliragsoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC)get_store().find_element_user(CLIRAGSOC$4, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC)get_store().add_element_user(CLIRAGSOC$4);
            }
            target.set(cliragsoc);
        }
    }
    
    /**
     * Nils the "CLI_RAGSOC" element
     */
    public void setNilCLIRAGSOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC)get_store().find_element_user(CLIRAGSOC$4, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC)get_store().add_element_user(CLIRAGSOC$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_RAGSOC" element
     */
    public void unsetCLIRAGSOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIRAGSOC$4, 0);
        }
    }
    
    /**
     * Gets the "CLI_COD" element
     */
    public int getCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICOD$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_COD" element
     */
    public org.apache.xmlbeans.XmlInt xgetCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLICOD$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_COD" element
     */
    public boolean isNilCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLICOD$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_COD" element
     */
    public boolean isSetCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLICOD$6) != 0;
        }
    }
    
    /**
     * Sets the "CLI_COD" element
     */
    public void setCLICOD(int clicod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICOD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLICOD$6);
            }
            target.setIntValue(clicod);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_COD" element
     */
    public void xsetCLICOD(org.apache.xmlbeans.XmlInt clicod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLICOD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CLICOD$6);
            }
            target.set(clicod);
        }
    }
    
    /**
     * Nils the "CLI_COD" element
     */
    public void setNilCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLICOD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CLICOD$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_COD" element
     */
    public void unsetCLICOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLICOD$6, 0);
        }
    }
    
    /**
     * Gets the "CLI_DESVID" element
     */
    public java.lang.String getCLIDESVID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDESVID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_DESVID" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID xgetCLIDESVID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID)get_store().find_element_user(CLIDESVID$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_DESVID" element
     */
    public boolean isNilCLIDESVID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID)get_store().find_element_user(CLIDESVID$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_DESVID" element
     */
    public boolean isSetCLIDESVID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIDESVID$8) != 0;
        }
    }
    
    /**
     * Sets the "CLI_DESVID" element
     */
    public void setCLIDESVID(java.lang.String clidesvid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDESVID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIDESVID$8);
            }
            target.setStringValue(clidesvid);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_DESVID" element
     */
    public void xsetCLIDESVID(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID clidesvid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID)get_store().find_element_user(CLIDESVID$8, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID)get_store().add_element_user(CLIDESVID$8);
            }
            target.set(clidesvid);
        }
    }
    
    /**
     * Nils the "CLI_DESVID" element
     */
    public void setNilCLIDESVID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID)get_store().find_element_user(CLIDESVID$8, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID)get_store().add_element_user(CLIDESVID$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_DESVID" element
     */
    public void unsetCLIDESVID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIDESVID$8, 0);
        }
    }
    
    /**
     * Gets the "CLI_FLAG_FD" element
     */
    public java.lang.String getCLIFLAGFD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIFLAGFD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_FLAG_FD" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD xgetCLIFLAGFD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD)get_store().find_element_user(CLIFLAGFD$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_FLAG_FD" element
     */
    public boolean isNilCLIFLAGFD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD)get_store().find_element_user(CLIFLAGFD$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_FLAG_FD" element
     */
    public boolean isSetCLIFLAGFD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIFLAGFD$10) != 0;
        }
    }
    
    /**
     * Sets the "CLI_FLAG_FD" element
     */
    public void setCLIFLAGFD(java.lang.String cliflagfd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIFLAGFD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIFLAGFD$10);
            }
            target.setStringValue(cliflagfd);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_FLAG_FD" element
     */
    public void xsetCLIFLAGFD(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD cliflagfd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD)get_store().find_element_user(CLIFLAGFD$10, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD)get_store().add_element_user(CLIFLAGFD$10);
            }
            target.set(cliflagfd);
        }
    }
    
    /**
     * Nils the "CLI_FLAG_FD" element
     */
    public void setNilCLIFLAGFD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD)get_store().find_element_user(CLIFLAGFD$10, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD)get_store().add_element_user(CLIFLAGFD$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_FLAG_FD" element
     */
    public void unsetCLIFLAGFD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIFLAGFD$10, 0);
        }
    }
    
    /**
     * Gets the "COD_CONTRATTO_RIFERIMENTO" element
     */
    public java.lang.String getCODCONTRATTORIFERIMENTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODCONTRATTORIFERIMENTO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "COD_CONTRATTO_RIFERIMENTO" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO xgetCODCONTRATTORIFERIMENTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO)get_store().find_element_user(CODCONTRATTORIFERIMENTO$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "COD_CONTRATTO_RIFERIMENTO" element
     */
    public boolean isNilCODCONTRATTORIFERIMENTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO)get_store().find_element_user(CODCONTRATTORIFERIMENTO$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "COD_CONTRATTO_RIFERIMENTO" element
     */
    public boolean isSetCODCONTRATTORIFERIMENTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODCONTRATTORIFERIMENTO$12) != 0;
        }
    }
    
    /**
     * Sets the "COD_CONTRATTO_RIFERIMENTO" element
     */
    public void setCODCONTRATTORIFERIMENTO(java.lang.String codcontrattoriferimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODCONTRATTORIFERIMENTO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODCONTRATTORIFERIMENTO$12);
            }
            target.setStringValue(codcontrattoriferimento);
        }
    }
    
    /**
     * Sets (as xml) the "COD_CONTRATTO_RIFERIMENTO" element
     */
    public void xsetCODCONTRATTORIFERIMENTO(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO codcontrattoriferimento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO)get_store().find_element_user(CODCONTRATTORIFERIMENTO$12, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO)get_store().add_element_user(CODCONTRATTORIFERIMENTO$12);
            }
            target.set(codcontrattoriferimento);
        }
    }
    
    /**
     * Nils the "COD_CONTRATTO_RIFERIMENTO" element
     */
    public void setNilCODCONTRATTORIFERIMENTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO)get_store().find_element_user(CODCONTRATTORIFERIMENTO$12, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO)get_store().add_element_user(CODCONTRATTORIFERIMENTO$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "COD_CONTRATTO_RIFERIMENTO" element
     */
    public void unsetCODCONTRATTORIFERIMENTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODCONTRATTORIFERIMENTO$12, 0);
        }
    }
    
    /**
     * Gets the "CLI_DOMINIO" element
     */
    public java.lang.String getCLIDOMINIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDOMINIO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_DOMINIO" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO xgetCLIDOMINIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO)get_store().find_element_user(CLIDOMINIO$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_DOMINIO" element
     */
    public boolean isNilCLIDOMINIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO)get_store().find_element_user(CLIDOMINIO$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_DOMINIO" element
     */
    public boolean isSetCLIDOMINIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIDOMINIO$14) != 0;
        }
    }
    
    /**
     * Sets the "CLI_DOMINIO" element
     */
    public void setCLIDOMINIO(java.lang.String clidominio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDOMINIO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIDOMINIO$14);
            }
            target.setStringValue(clidominio);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_DOMINIO" element
     */
    public void xsetCLIDOMINIO(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO clidominio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO)get_store().find_element_user(CLIDOMINIO$14, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO)get_store().add_element_user(CLIDOMINIO$14);
            }
            target.set(clidominio);
        }
    }
    
    /**
     * Nils the "CLI_DOMINIO" element
     */
    public void setNilCLIDOMINIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO)get_store().find_element_user(CLIDOMINIO$14, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO)get_store().add_element_user(CLIDOMINIO$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_DOMINIO" element
     */
    public void unsetCLIDOMINIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIDOMINIO$14, 0);
        }
    }
    
    /**
     * Gets the "CLI_CATEGORIA" element
     */
    public java.lang.String getCLICATEGORIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICATEGORIA$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_CATEGORIA" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA xgetCLICATEGORIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA)get_store().find_element_user(CLICATEGORIA$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_CATEGORIA" element
     */
    public boolean isNilCLICATEGORIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA)get_store().find_element_user(CLICATEGORIA$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_CATEGORIA" element
     */
    public boolean isSetCLICATEGORIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLICATEGORIA$16) != 0;
        }
    }
    
    /**
     * Sets the "CLI_CATEGORIA" element
     */
    public void setCLICATEGORIA(java.lang.String clicategoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLICATEGORIA$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLICATEGORIA$16);
            }
            target.setStringValue(clicategoria);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_CATEGORIA" element
     */
    public void xsetCLICATEGORIA(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA clicategoria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA)get_store().find_element_user(CLICATEGORIA$16, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA)get_store().add_element_user(CLICATEGORIA$16);
            }
            target.set(clicategoria);
        }
    }
    
    /**
     * Nils the "CLI_CATEGORIA" element
     */
    public void setNilCLICATEGORIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA)get_store().find_element_user(CLICATEGORIA$16, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA)get_store().add_element_user(CLICATEGORIA$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_CATEGORIA" element
     */
    public void unsetCLICATEGORIA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLICATEGORIA$16, 0);
        }
    }
    
    /**
     * Gets the "ID_CLIENTE_ESTERNO" element
     */
    public java.lang.String getIDCLIENTEESTERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCLIENTEESTERNO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID_CLIENTE_ESTERNO" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO xgetIDCLIENTEESTERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO)get_store().find_element_user(IDCLIENTEESTERNO$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ID_CLIENTE_ESTERNO" element
     */
    public boolean isNilIDCLIENTEESTERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO)get_store().find_element_user(IDCLIENTEESTERNO$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ID_CLIENTE_ESTERNO" element
     */
    public boolean isSetIDCLIENTEESTERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDCLIENTEESTERNO$18) != 0;
        }
    }
    
    /**
     * Sets the "ID_CLIENTE_ESTERNO" element
     */
    public void setIDCLIENTEESTERNO(java.lang.String idclienteesterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCLIENTEESTERNO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCLIENTEESTERNO$18);
            }
            target.setStringValue(idclienteesterno);
        }
    }
    
    /**
     * Sets (as xml) the "ID_CLIENTE_ESTERNO" element
     */
    public void xsetIDCLIENTEESTERNO(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO idclienteesterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO)get_store().find_element_user(IDCLIENTEESTERNO$18, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO)get_store().add_element_user(IDCLIENTEESTERNO$18);
            }
            target.set(idclienteesterno);
        }
    }
    
    /**
     * Nils the "ID_CLIENTE_ESTERNO" element
     */
    public void setNilIDCLIENTEESTERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO)get_store().find_element_user(IDCLIENTEESTERNO$18, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO)get_store().add_element_user(IDCLIENTEESTERNO$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ID_CLIENTE_ESTERNO" element
     */
    public void unsetIDCLIENTEESTERNO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDCLIENTEESTERNO$18, 0);
        }
    }
    
    /**
     * Gets the "CLI_DESSTP" element
     */
    public java.lang.String getCLIDESSTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDESSTP$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_DESSTP" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP xgetCLIDESSTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP)get_store().find_element_user(CLIDESSTP$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_DESSTP" element
     */
    public boolean isNilCLIDESSTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP)get_store().find_element_user(CLIDESSTP$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_DESSTP" element
     */
    public boolean isSetCLIDESSTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIDESSTP$20) != 0;
        }
    }
    
    /**
     * Sets the "CLI_DESSTP" element
     */
    public void setCLIDESSTP(java.lang.String clidesstp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDESSTP$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIDESSTP$20);
            }
            target.setStringValue(clidesstp);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_DESSTP" element
     */
    public void xsetCLIDESSTP(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP clidesstp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP)get_store().find_element_user(CLIDESSTP$20, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP)get_store().add_element_user(CLIDESSTP$20);
            }
            target.set(clidesstp);
        }
    }
    
    /**
     * Nils the "CLI_DESSTP" element
     */
    public void setNilCLIDESSTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP)get_store().find_element_user(CLIDESSTP$20, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP)get_store().add_element_user(CLIDESSTP$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_DESSTP" element
     */
    public void unsetCLIDESSTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIDESSTP$20, 0);
        }
    }
    
    /**
     * Gets the "CREATE_DATE" element
     */
    public java.util.Calendar getCREATEDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CREATE_DATE" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCREATEDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CREATE_DATE" element
     */
    public boolean isNilCREATEDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CREATE_DATE" element
     */
    public void setCREATEDATE(java.util.Calendar createdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDATE$22);
            }
            target.setCalendarValue(createdate);
        }
    }
    
    /**
     * Sets (as xml) the "CREATE_DATE" element
     */
    public void xsetCREATEDATE(org.apache.xmlbeans.XmlDateTime createdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDATE$22);
            }
            target.set(createdate);
        }
    }
    
    /**
     * Nils the "CREATE_DATE" element
     */
    public void setNilCREATEDATE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDATE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CLI_DATACREAZIONE" element
     */
    public java.util.Calendar getCLIDATACREAZIONE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDATACREAZIONE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_DATACREAZIONE" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCLIDATACREAZIONE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATACREAZIONE$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_DATACREAZIONE" element
     */
    public boolean isNilCLIDATACREAZIONE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATACREAZIONE$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CLI_DATACREAZIONE" element
     */
    public void setCLIDATACREAZIONE(java.util.Calendar clidatacreazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDATACREAZIONE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIDATACREAZIONE$24);
            }
            target.setCalendarValue(clidatacreazione);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_DATACREAZIONE" element
     */
    public void xsetCLIDATACREAZIONE(org.apache.xmlbeans.XmlDateTime clidatacreazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATACREAZIONE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLIDATACREAZIONE$24);
            }
            target.set(clidatacreazione);
        }
    }
    
    /**
     * Nils the "CLI_DATACREAZIONE" element
     */
    public void setNilCLIDATACREAZIONE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATACREAZIONE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLIDATACREAZIONE$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CONTRATTO" element
     */
    public java.lang.String getCONTRATTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRATTO$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CONTRATTO" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO xgetCONTRATTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO)get_store().find_element_user(CONTRATTO$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CONTRATTO" element
     */
    public boolean isNilCONTRATTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO)get_store().find_element_user(CONTRATTO$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CONTRATTO" element
     */
    public boolean isSetCONTRATTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRATTO$26) != 0;
        }
    }
    
    /**
     * Sets the "CONTRATTO" element
     */
    public void setCONTRATTO(java.lang.String contratto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRATTO$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRATTO$26);
            }
            target.setStringValue(contratto);
        }
    }
    
    /**
     * Sets (as xml) the "CONTRATTO" element
     */
    public void xsetCONTRATTO(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO contratto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO)get_store().find_element_user(CONTRATTO$26, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO)get_store().add_element_user(CONTRATTO$26);
            }
            target.set(contratto);
        }
    }
    
    /**
     * Nils the "CONTRATTO" element
     */
    public void setNilCONTRATTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO)get_store().find_element_user(CONTRATTO$26, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO)get_store().add_element_user(CONTRATTO$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CONTRATTO" element
     */
    public void unsetCONTRATTO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRATTO$26, 0);
        }
    }
    
    /**
     * Gets the "CLI_DATAULTMOD" element
     */
    public java.util.Calendar getCLIDATAULTMOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDATAULTMOD$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_DATAULTMOD" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCLIDATAULTMOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATAULTMOD$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_DATAULTMOD" element
     */
    public boolean isNilCLIDATAULTMOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATAULTMOD$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CLI_DATAULTMOD" element
     */
    public void setCLIDATAULTMOD(java.util.Calendar clidataultmod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIDATAULTMOD$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIDATAULTMOD$28);
            }
            target.setCalendarValue(clidataultmod);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_DATAULTMOD" element
     */
    public void xsetCLIDATAULTMOD(org.apache.xmlbeans.XmlDateTime clidataultmod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATAULTMOD$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLIDATAULTMOD$28);
            }
            target.set(clidataultmod);
        }
    }
    
    /**
     * Nils the "CLI_DATAULTMOD" element
     */
    public void setNilCLIDATAULTMOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLIDATAULTMOD$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLIDATAULTMOD$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "CRM_ROWID_EXTCLIENTI" element
     */
    public java.lang.String getCRMROWIDEXTCLIENTI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRMROWIDEXTCLIENTI$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CRM_ROWID_EXTCLIENTI" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI xgetCRMROWIDEXTCLIENTI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI)get_store().find_element_user(CRMROWIDEXTCLIENTI$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CRM_ROWID_EXTCLIENTI" element
     */
    public boolean isNilCRMROWIDEXTCLIENTI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI)get_store().find_element_user(CRMROWIDEXTCLIENTI$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CRM_ROWID_EXTCLIENTI" element
     */
    public boolean isSetCRMROWIDEXTCLIENTI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRMROWIDEXTCLIENTI$30) != 0;
        }
    }
    
    /**
     * Sets the "CRM_ROWID_EXTCLIENTI" element
     */
    public void setCRMROWIDEXTCLIENTI(java.lang.String crmrowidextclienti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRMROWIDEXTCLIENTI$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRMROWIDEXTCLIENTI$30);
            }
            target.setStringValue(crmrowidextclienti);
        }
    }
    
    /**
     * Sets (as xml) the "CRM_ROWID_EXTCLIENTI" element
     */
    public void xsetCRMROWIDEXTCLIENTI(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI crmrowidextclienti)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI)get_store().find_element_user(CRMROWIDEXTCLIENTI$30, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI)get_store().add_element_user(CRMROWIDEXTCLIENTI$30);
            }
            target.set(crmrowidextclienti);
        }
    }
    
    /**
     * Nils the "CRM_ROWID_EXTCLIENTI" element
     */
    public void setNilCRMROWIDEXTCLIENTI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI)get_store().find_element_user(CRMROWIDEXTCLIENTI$30, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI)get_store().add_element_user(CRMROWIDEXTCLIENTI$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CRM_ROWID_EXTCLIENTI" element
     */
    public void unsetCRMROWIDEXTCLIENTI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRMROWIDEXTCLIENTI$30, 0);
        }
    }
    
    /**
     * Gets the "FLAG_CLI_CRM" element
     */
    public java.lang.String getFLAGCLICRM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLAGCLICRM$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FLAG_CLI_CRM" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM xgetFLAGCLICRM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM)get_store().find_element_user(FLAGCLICRM$32, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FLAG_CLI_CRM" element
     */
    public boolean isNilFLAGCLICRM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM)get_store().find_element_user(FLAGCLICRM$32, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FLAG_CLI_CRM" element
     */
    public boolean isSetFLAGCLICRM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLAGCLICRM$32) != 0;
        }
    }
    
    /**
     * Sets the "FLAG_CLI_CRM" element
     */
    public void setFLAGCLICRM(java.lang.String flagclicrm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLAGCLICRM$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLAGCLICRM$32);
            }
            target.setStringValue(flagclicrm);
        }
    }
    
    /**
     * Sets (as xml) the "FLAG_CLI_CRM" element
     */
    public void xsetFLAGCLICRM(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM flagclicrm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM)get_store().find_element_user(FLAGCLICRM$32, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM)get_store().add_element_user(FLAGCLICRM$32);
            }
            target.set(flagclicrm);
        }
    }
    
    /**
     * Nils the "FLAG_CLI_CRM" element
     */
    public void setNilFLAGCLICRM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM)get_store().find_element_user(FLAGCLICRM$32, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM)get_store().add_element_user(FLAGCLICRM$32);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FLAG_CLI_CRM" element
     */
    public void unsetFLAGCLICRM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLAGCLICRM$32, 0);
        }
    }
    
    /**
     * Gets the "FLAG_CLI_SI" element
     */
    public java.lang.String getFLAGCLISI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLAGCLISI$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FLAG_CLI_SI" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI xgetFLAGCLISI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI)get_store().find_element_user(FLAGCLISI$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "FLAG_CLI_SI" element
     */
    public boolean isNilFLAGCLISI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI)get_store().find_element_user(FLAGCLISI$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FLAG_CLI_SI" element
     */
    public boolean isSetFLAGCLISI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLAGCLISI$34) != 0;
        }
    }
    
    /**
     * Sets the "FLAG_CLI_SI" element
     */
    public void setFLAGCLISI(java.lang.String flagclisi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLAGCLISI$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLAGCLISI$34);
            }
            target.setStringValue(flagclisi);
        }
    }
    
    /**
     * Sets (as xml) the "FLAG_CLI_SI" element
     */
    public void xsetFLAGCLISI(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI flagclisi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI)get_store().find_element_user(FLAGCLISI$34, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI)get_store().add_element_user(FLAGCLISI$34);
            }
            target.set(flagclisi);
        }
    }
    
    /**
     * Nils the "FLAG_CLI_SI" element
     */
    public void setNilFLAGCLISI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI)get_store().find_element_user(FLAGCLISI$34, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI)get_store().add_element_user(FLAGCLISI$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FLAG_CLI_SI" element
     */
    public void unsetFLAGCLISI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLAGCLISI$34, 0);
        }
    }
    
    /**
     * Gets the "CLI_FLGCANC" element
     */
    public java.lang.String getCLIFLGCANC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIFLGCANC$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CLI_FLGCANC" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC xgetCLIFLGCANC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC)get_store().find_element_user(CLIFLGCANC$36, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "CLI_FLGCANC" element
     */
    public boolean isNilCLIFLGCANC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC)get_store().find_element_user(CLIFLGCANC$36, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "CLI_FLGCANC" element
     */
    public boolean isSetCLIFLGCANC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIFLGCANC$36) != 0;
        }
    }
    
    /**
     * Sets the "CLI_FLGCANC" element
     */
    public void setCLIFLGCANC(java.lang.String cliflgcanc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIFLGCANC$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIFLGCANC$36);
            }
            target.setStringValue(cliflgcanc);
        }
    }
    
    /**
     * Sets (as xml) the "CLI_FLGCANC" element
     */
    public void xsetCLIFLGCANC(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC cliflgcanc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC)get_store().find_element_user(CLIFLGCANC$36, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC)get_store().add_element_user(CLIFLGCANC$36);
            }
            target.set(cliflgcanc);
        }
    }
    
    /**
     * Nils the "CLI_FLGCANC" element
     */
    public void setNilCLIFLGCANC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC)get_store().find_element_user(CLIFLGCANC$36, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC)get_store().add_element_user(CLIFLGCANC$36);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CLI_FLGCANC" element
     */
    public void unsetCLIFLGCANC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIFLGCANC$36, 0);
        }
    }
    /**
     * An XML CLI_CFISC(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLICFISC.
     */
    public static class CLICFISCImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICFISC
    {
        private static final long serialVersionUID = 1L;
        
        public CLICFISCImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLICFISCImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CLI_RAGSOC(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLIRAGSOC.
     */
    public static class CLIRAGSOCImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIRAGSOC
    {
        private static final long serialVersionUID = 1L;
        
        public CLIRAGSOCImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLIRAGSOCImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CLI_DESVID(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLIDESVID.
     */
    public static class CLIDESVIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESVID
    {
        private static final long serialVersionUID = 1L;
        
        public CLIDESVIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLIDESVIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CLI_FLAG_FD(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLIFLAGFD.
     */
    public static class CLIFLAGFDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLAGFD
    {
        private static final long serialVersionUID = 1L;
        
        public CLIFLAGFDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLIFLAGFDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML COD_CONTRATTO_RIFERIMENTO(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CODCONTRATTORIFERIMENTO.
     */
    public static class CODCONTRATTORIFERIMENTOImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CODCONTRATTORIFERIMENTO
    {
        private static final long serialVersionUID = 1L;
        
        public CODCONTRATTORIFERIMENTOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CODCONTRATTORIFERIMENTOImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CLI_DOMINIO(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLIDOMINIO.
     */
    public static class CLIDOMINIOImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDOMINIO
    {
        private static final long serialVersionUID = 1L;
        
        public CLIDOMINIOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLIDOMINIOImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CLI_CATEGORIA(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLICATEGORIA.
     */
    public static class CLICATEGORIAImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLICATEGORIA
    {
        private static final long serialVersionUID = 1L;
        
        public CLICATEGORIAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLICATEGORIAImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ID_CLIENTE_ESTERNO(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$IDCLIENTEESTERNO.
     */
    public static class IDCLIENTEESTERNOImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.IDCLIENTEESTERNO
    {
        private static final long serialVersionUID = 1L;
        
        public IDCLIENTEESTERNOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IDCLIENTEESTERNOImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CLI_DESSTP(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLIDESSTP.
     */
    public static class CLIDESSTPImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIDESSTP
    {
        private static final long serialVersionUID = 1L;
        
        public CLIDESSTPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLIDESSTPImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CONTRATTO(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CONTRATTO.
     */
    public static class CONTRATTOImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CONTRATTO
    {
        private static final long serialVersionUID = 1L;
        
        public CONTRATTOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CONTRATTOImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CRM_ROWID_EXTCLIENTI(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CRMROWIDEXTCLIENTI.
     */
    public static class CRMROWIDEXTCLIENTIImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CRMROWIDEXTCLIENTI
    {
        private static final long serialVersionUID = 1L;
        
        public CRMROWIDEXTCLIENTIImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CRMROWIDEXTCLIENTIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML FLAG_CLI_CRM(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$FLAGCLICRM.
     */
    public static class FLAGCLICRMImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLICRM
    {
        private static final long serialVersionUID = 1L;
        
        public FLAGCLICRMImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FLAGCLICRMImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML FLAG_CLI_SI(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$FLAGCLISI.
     */
    public static class FLAGCLISIImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.FLAGCLISI
    {
        private static final long serialVersionUID = 1L;
        
        public FLAGCLISIImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FLAGCLISIImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML CLI_FLGCANC(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType$CLIFLGCANC.
     */
    public static class CLIFLGCANCImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType.CLIFLGCANC
    {
        private static final long serialVersionUID = 1L;
        
        public CLIFLGCANCImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CLIFLGCANCImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
