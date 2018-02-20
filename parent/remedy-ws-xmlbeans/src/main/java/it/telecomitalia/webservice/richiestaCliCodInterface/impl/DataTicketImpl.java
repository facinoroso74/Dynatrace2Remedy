/*
 * XML Type:  DataTicket
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface.impl;
/**
 * An XML DataTicket(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class DataTicketImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket
{
    private static final long serialVersionUID = 1L;
    
    public DataTicketImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIVOTT$0 = 
        new javax.xml.namespace.QName("", "IdentificativoTT");
    private static final javax.xml.namespace.QName OGGETTOTT$2 = 
        new javax.xml.namespace.QName("", "OggettoTT");
    private static final javax.xml.namespace.QName TIPOOGGETTO$4 = 
        new javax.xml.namespace.QName("", "Tipo_oggetto");
    private static final javax.xml.namespace.QName DATAORASEGNALAZIONE$6 = 
        new javax.xml.namespace.QName("", "DataOraSegnalazione");
    private static final javax.xml.namespace.QName GRUPPORESPONSABILE$8 = 
        new javax.xml.namespace.QName("", "GruppoResponsabile");
    private static final javax.xml.namespace.QName OPERATORERESPONSABILE$10 = 
        new javax.xml.namespace.QName("", "OperatoreResponsabile");
    private static final javax.xml.namespace.QName GRUPPOCOMPETENTE$12 = 
        new javax.xml.namespace.QName("", "GruppoCompetente");
    private static final javax.xml.namespace.QName OPERATORECOMPETENTE$14 = 
        new javax.xml.namespace.QName("", "OperatoreCompetente");
    private static final javax.xml.namespace.QName IDHCW$16 = 
        new javax.xml.namespace.QName("", "IdHCW");
    private static final javax.xml.namespace.QName TIPOTT$18 = 
        new javax.xml.namespace.QName("", "TipoTT");
    private static final javax.xml.namespace.QName STATO$20 = 
        new javax.xml.namespace.QName("", "Stato");
    
    
    /**
     * Gets the "IdentificativoTT" element
     */
    public java.lang.String getIdentificativoTT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICATIVOTT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdentificativoTT" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT xgetIdentificativoTT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT)get_store().find_element_user(IDENTIFICATIVOTT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IdentificativoTT" element
     */
    public void setIdentificativoTT(java.lang.String identificativoTT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFICATIVOTT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFICATIVOTT$0);
            }
            target.setStringValue(identificativoTT);
        }
    }
    
    /**
     * Sets (as xml) the "IdentificativoTT" element
     */
    public void xsetIdentificativoTT(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT identificativoTT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT)get_store().find_element_user(IDENTIFICATIVOTT$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT)get_store().add_element_user(IDENTIFICATIVOTT$0);
            }
            target.set(identificativoTT);
        }
    }
    
    /**
     * Gets the "OggettoTT" element
     */
    public java.lang.String getOggettoTT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OGGETTOTT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OggettoTT" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT xgetOggettoTT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT)get_store().find_element_user(OGGETTOTT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OggettoTT" element
     */
    public void setOggettoTT(java.lang.String oggettoTT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OGGETTOTT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OGGETTOTT$2);
            }
            target.setStringValue(oggettoTT);
        }
    }
    
    /**
     * Sets (as xml) the "OggettoTT" element
     */
    public void xsetOggettoTT(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT oggettoTT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT)get_store().find_element_user(OGGETTOTT$2, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT)get_store().add_element_user(OGGETTOTT$2);
            }
            target.set(oggettoTT);
        }
    }
    
    /**
     * Gets the "Tipo_oggetto" element
     */
    public java.lang.String getTipoOggetto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOGGETTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Tipo_oggetto" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto xgetTipoOggetto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto)get_store().find_element_user(TIPOOGGETTO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Tipo_oggetto" element
     */
    public void setTipoOggetto(java.lang.String tipoOggetto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOOGGETTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOOGGETTO$4);
            }
            target.setStringValue(tipoOggetto);
        }
    }
    
    /**
     * Sets (as xml) the "Tipo_oggetto" element
     */
    public void xsetTipoOggetto(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto tipoOggetto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto)get_store().find_element_user(TIPOOGGETTO$4, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto)get_store().add_element_user(TIPOOGGETTO$4);
            }
            target.set(tipoOggetto);
        }
    }
    
    /**
     * Gets the "DataOraSegnalazione" element
     */
    public java.util.Calendar getDataOraSegnalazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAORASEGNALAZIONE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataOraSegnalazione" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione xgetDataOraSegnalazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione)get_store().find_element_user(DATAORASEGNALAZIONE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataOraSegnalazione" element
     */
    public void setDataOraSegnalazione(java.util.Calendar dataOraSegnalazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAORASEGNALAZIONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAORASEGNALAZIONE$6);
            }
            target.setCalendarValue(dataOraSegnalazione);
        }
    }
    
    /**
     * Sets (as xml) the "DataOraSegnalazione" element
     */
    public void xsetDataOraSegnalazione(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione dataOraSegnalazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione)get_store().find_element_user(DATAORASEGNALAZIONE$6, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione)get_store().add_element_user(DATAORASEGNALAZIONE$6);
            }
            target.set(dataOraSegnalazione);
        }
    }
    
    /**
     * Gets the "GruppoResponsabile" element
     */
    public java.lang.String getGruppoResponsabile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUPPORESPONSABILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GruppoResponsabile" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile xgetGruppoResponsabile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile)get_store().find_element_user(GRUPPORESPONSABILE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GruppoResponsabile" element
     */
    public void setGruppoResponsabile(java.lang.String gruppoResponsabile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUPPORESPONSABILE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRUPPORESPONSABILE$8);
            }
            target.setStringValue(gruppoResponsabile);
        }
    }
    
    /**
     * Sets (as xml) the "GruppoResponsabile" element
     */
    public void xsetGruppoResponsabile(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile gruppoResponsabile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile)get_store().find_element_user(GRUPPORESPONSABILE$8, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile)get_store().add_element_user(GRUPPORESPONSABILE$8);
            }
            target.set(gruppoResponsabile);
        }
    }
    
    /**
     * Gets the "OperatoreResponsabile" element
     */
    public java.lang.String getOperatoreResponsabile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORERESPONSABILE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperatoreResponsabile" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile xgetOperatoreResponsabile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile)get_store().find_element_user(OPERATORERESPONSABILE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OperatoreResponsabile" element
     */
    public void setOperatoreResponsabile(java.lang.String operatoreResponsabile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORERESPONSABILE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATORERESPONSABILE$10);
            }
            target.setStringValue(operatoreResponsabile);
        }
    }
    
    /**
     * Sets (as xml) the "OperatoreResponsabile" element
     */
    public void xsetOperatoreResponsabile(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile operatoreResponsabile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile)get_store().find_element_user(OPERATORERESPONSABILE$10, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile)get_store().add_element_user(OPERATORERESPONSABILE$10);
            }
            target.set(operatoreResponsabile);
        }
    }
    
    /**
     * Gets the "GruppoCompetente" element
     */
    public java.lang.String getGruppoCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUPPOCOMPETENTE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GruppoCompetente" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente xgetGruppoCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente)get_store().find_element_user(GRUPPOCOMPETENTE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "GruppoCompetente" element
     */
    public boolean isSetGruppoCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRUPPOCOMPETENTE$12) != 0;
        }
    }
    
    /**
     * Sets the "GruppoCompetente" element
     */
    public void setGruppoCompetente(java.lang.String gruppoCompetente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUPPOCOMPETENTE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRUPPOCOMPETENTE$12);
            }
            target.setStringValue(gruppoCompetente);
        }
    }
    
    /**
     * Sets (as xml) the "GruppoCompetente" element
     */
    public void xsetGruppoCompetente(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente gruppoCompetente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente)get_store().find_element_user(GRUPPOCOMPETENTE$12, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente)get_store().add_element_user(GRUPPOCOMPETENTE$12);
            }
            target.set(gruppoCompetente);
        }
    }
    
    /**
     * Unsets the "GruppoCompetente" element
     */
    public void unsetGruppoCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRUPPOCOMPETENTE$12, 0);
        }
    }
    
    /**
     * Gets the "OperatoreCompetente" element
     */
    public java.lang.String getOperatoreCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORECOMPETENTE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OperatoreCompetente" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente xgetOperatoreCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente)get_store().find_element_user(OPERATORECOMPETENTE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "OperatoreCompetente" element
     */
    public boolean isSetOperatoreCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATORECOMPETENTE$14) != 0;
        }
    }
    
    /**
     * Sets the "OperatoreCompetente" element
     */
    public void setOperatoreCompetente(java.lang.String operatoreCompetente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORECOMPETENTE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATORECOMPETENTE$14);
            }
            target.setStringValue(operatoreCompetente);
        }
    }
    
    /**
     * Sets (as xml) the "OperatoreCompetente" element
     */
    public void xsetOperatoreCompetente(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente operatoreCompetente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente)get_store().find_element_user(OPERATORECOMPETENTE$14, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente)get_store().add_element_user(OPERATORECOMPETENTE$14);
            }
            target.set(operatoreCompetente);
        }
    }
    
    /**
     * Unsets the "OperatoreCompetente" element
     */
    public void unsetOperatoreCompetente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATORECOMPETENTE$14, 0);
        }
    }
    
    /**
     * Gets the "IdHCW" element
     */
    public java.lang.String getIdHCW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDHCW$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdHCW" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW xgetIdHCW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW)get_store().find_element_user(IDHCW$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "IdHCW" element
     */
    public boolean isSetIdHCW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDHCW$16) != 0;
        }
    }
    
    /**
     * Sets the "IdHCW" element
     */
    public void setIdHCW(java.lang.String idHCW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDHCW$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDHCW$16);
            }
            target.setStringValue(idHCW);
        }
    }
    
    /**
     * Sets (as xml) the "IdHCW" element
     */
    public void xsetIdHCW(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW idHCW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW)get_store().find_element_user(IDHCW$16, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW)get_store().add_element_user(IDHCW$16);
            }
            target.set(idHCW);
        }
    }
    
    /**
     * Unsets the "IdHCW" element
     */
    public void unsetIdHCW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDHCW$16, 0);
        }
    }
    
    /**
     * Gets the "TipoTT" element
     */
    public java.lang.String getTipoTT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOTT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoTT" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT xgetTipoTT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT)get_store().find_element_user(TIPOTT$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TipoTT" element
     */
    public void setTipoTT(java.lang.String tipoTT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOTT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOTT$18);
            }
            target.setStringValue(tipoTT);
        }
    }
    
    /**
     * Sets (as xml) the "TipoTT" element
     */
    public void xsetTipoTT(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT tipoTT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT)get_store().find_element_user(TIPOTT$18, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT)get_store().add_element_user(TIPOTT$18);
            }
            target.set(tipoTT);
        }
    }
    
    /**
     * Gets the "Stato" element
     */
    public java.lang.String getStato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Stato" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato xgetStato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato)get_store().find_element_user(STATO$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Stato" element
     */
    public void setStato(java.lang.String stato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATO$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATO$20);
            }
            target.setStringValue(stato);
        }
    }
    
    /**
     * Sets (as xml) the "Stato" element
     */
    public void xsetStato(it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato stato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato)get_store().find_element_user(STATO$20, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato)get_store().add_element_user(STATO$20);
            }
            target.set(stato);
        }
    }
    /**
     * An XML IdentificativoTT(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$IdentificativoTT.
     */
    public static class IdentificativoTTImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdentificativoTT
    {
        private static final long serialVersionUID = 1L;
        
        public IdentificativoTTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IdentificativoTTImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML OggettoTT(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$OggettoTT.
     */
    public static class OggettoTTImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OggettoTT
    {
        private static final long serialVersionUID = 1L;
        
        public OggettoTTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OggettoTTImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Tipo_oggetto(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$TipoOggetto.
     */
    public static class TipoOggettoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoOggetto
    {
        private static final long serialVersionUID = 1L;
        
        public TipoOggettoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TipoOggettoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML DataOraSegnalazione(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$DataOraSegnalazione.
     */
    public static class DataOraSegnalazioneImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.DataOraSegnalazione
    {
        private static final long serialVersionUID = 1L;
        
        public DataOraSegnalazioneImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DataOraSegnalazioneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML GruppoResponsabile(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$GruppoResponsabile.
     */
    public static class GruppoResponsabileImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoResponsabile
    {
        private static final long serialVersionUID = 1L;
        
        public GruppoResponsabileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GruppoResponsabileImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML OperatoreResponsabile(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$OperatoreResponsabile.
     */
    public static class OperatoreResponsabileImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreResponsabile
    {
        private static final long serialVersionUID = 1L;
        
        public OperatoreResponsabileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OperatoreResponsabileImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML GruppoCompetente(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$GruppoCompetente.
     */
    public static class GruppoCompetenteImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.GruppoCompetente
    {
        private static final long serialVersionUID = 1L;
        
        public GruppoCompetenteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GruppoCompetenteImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML OperatoreCompetente(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$OperatoreCompetente.
     */
    public static class OperatoreCompetenteImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.OperatoreCompetente
    {
        private static final long serialVersionUID = 1L;
        
        public OperatoreCompetenteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OperatoreCompetenteImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML IdHCW(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$IdHCW.
     */
    public static class IdHCWImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.IdHCW
    {
        private static final long serialVersionUID = 1L;
        
        public IdHCWImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IdHCWImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML TipoTT(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$TipoTT.
     */
    public static class TipoTTImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.TipoTT
    {
        private static final long serialVersionUID = 1L;
        
        public TipoTTImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TipoTTImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Stato(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket$Stato.
     */
    public static class StatoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.richiestaCliCodInterface.DataTicket.Stato
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
