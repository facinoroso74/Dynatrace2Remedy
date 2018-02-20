/*
 * XML Type:  get_ListaAssetReturn
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaAssetReturn
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML get_ListaAssetReturn(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class GetListaAssetReturnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn
{
    private static final long serialVersionUID = 1L;
    
    public GetListaAssetReturnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIASSET$0 = 
        new javax.xml.namespace.QName("", "DatiAsset");
    private static final javax.xml.namespace.QName CARDINALITA$2 = 
        new javax.xml.namespace.QName("", "Cardinalita");
    private static final javax.xml.namespace.QName IDCLIENTE$4 = 
        new javax.xml.namespace.QName("", "IdCliente");
    private static final javax.xml.namespace.QName PAGINA$6 = 
        new javax.xml.namespace.QName("", "Pagina");
    private static final javax.xml.namespace.QName REQUESTID$8 = 
        new javax.xml.namespace.QName("", "RequestID");
    
    
    /**
     * Gets array of all "DatiAsset" elements
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset[] getDatiAssetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIASSET$0, targetList);
            it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset[] result = new it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiAsset" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset getDatiAssetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset)get_store().find_element_user(DATIASSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiAsset" element
     */
    public int sizeOfDatiAssetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIASSET$0);
        }
    }
    
    /**
     * Sets array of all "DatiAsset" element
     */
    public void setDatiAssetArray(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset[] datiAssetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(datiAssetArray, DATIASSET$0);
        }
    }
    
    /**
     * Sets ith "DatiAsset" element
     */
    public void setDatiAssetArray(int i, it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset datiAsset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset)get_store().find_element_user(DATIASSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(datiAsset);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiAsset" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset insertNewDatiAsset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset)get_store().insert_element_user(DATIASSET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiAsset" element
     */
    public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset addNewDatiAsset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset target = null;
            target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset)get_store().add_element_user(DATIASSET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiAsset" element
     */
    public void removeDatiAsset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIASSET$0, i);
        }
    }
    
    /**
     * Gets the "Cardinalita" attribute
     */
    public java.math.BigInteger getCardinalita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITA$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Cardinalita" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCardinalita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITA$2);
            return target;
        }
    }
    
    /**
     * Sets the "Cardinalita" attribute
     */
    public void setCardinalita(java.math.BigInteger cardinalita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDINALITA$2);
            }
            target.setBigIntegerValue(cardinalita);
        }
    }
    
    /**
     * Sets (as xml) the "Cardinalita" attribute
     */
    public void xsetCardinalita(org.apache.xmlbeans.XmlInteger cardinalita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CARDINALITA$2);
            }
            target.set(cardinalita);
        }
    }
    
    /**
     * Gets the "IdCliente" attribute
     */
    public java.math.BigInteger getIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$4);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$4);
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
            return get_store().find_attribute_user(IDCLIENTE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCLIENTE$4);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDCLIENTE$4);
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
            get_store().remove_attribute(IDCLIENTE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINA$6);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGINA$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINA$6);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGINA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PAGINA$6);
            }
            target.set(pagina);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$8);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTID$8);
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
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTID$8);
            }
            target.set(requestID);
        }
    }
    /**
     * An XML DatiAsset(@).
     *
     * This is a complex type.
     */
    public static class DatiAssetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset
    {
        private static final long serialVersionUID = 1L;
        
        public DatiAssetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTASERVIZI$0 = 
            new javax.xml.namespace.QName("", "ListaServizi");
        private static final javax.xml.namespace.QName CARDINALITALISTASERVIZI$2 = 
            new javax.xml.namespace.QName("", "CardinalitaListaServizi");
        private static final javax.xml.namespace.QName IDASSET$4 = 
            new javax.xml.namespace.QName("", "IdAsset");
        private static final javax.xml.namespace.QName ASSETNUMBER$6 = 
            new javax.xml.namespace.QName("", "AssetNumber");
        private static final javax.xml.namespace.QName CATEGORIA$8 = 
            new javax.xml.namespace.QName("", "Categoria");
        private static final javax.xml.namespace.QName TIPOLOGIA$10 = 
            new javax.xml.namespace.QName("", "Tipologia");
        private static final javax.xml.namespace.QName SERIALNUMBER$12 = 
            new javax.xml.namespace.QName("", "SerialNumber");
        private static final javax.xml.namespace.QName MARCA$14 = 
            new javax.xml.namespace.QName("", "Marca");
        private static final javax.xml.namespace.QName MODELLO$16 = 
            new javax.xml.namespace.QName("", "Modello");
        private static final javax.xml.namespace.QName IPADDRESS$18 = 
            new javax.xml.namespace.QName("", "IPAddress");
        private static final javax.xml.namespace.QName IDSEDE$20 = 
            new javax.xml.namespace.QName("", "IdSede");
        private static final javax.xml.namespace.QName SEDE$22 = 
            new javax.xml.namespace.QName("", "Sede");
        private static final javax.xml.namespace.QName CITTA$24 = 
            new javax.xml.namespace.QName("", "Citta");
        private static final javax.xml.namespace.QName PROVINCIA$26 = 
            new javax.xml.namespace.QName("", "Provincia");
        private static final javax.xml.namespace.QName INDIRIZZO$28 = 
            new javax.xml.namespace.QName("", "Indirizzo");
        private static final javax.xml.namespace.QName UBICCORPO$30 = 
            new javax.xml.namespace.QName("", "Ubic_Corpo");
        private static final javax.xml.namespace.QName UBICALA$32 = 
            new javax.xml.namespace.QName("", "Ubic_Ala");
        private static final javax.xml.namespace.QName UBICPIANO$34 = 
            new javax.xml.namespace.QName("", "Ubic_Piano");
        private static final javax.xml.namespace.QName UBICSTANZAISOLA$36 = 
            new javax.xml.namespace.QName("", "Ubic_Stanza-Isola");
        private static final javax.xml.namespace.QName TELSEDE$38 = 
            new javax.xml.namespace.QName("", "TelSede");
        private static final javax.xml.namespace.QName IDFORNITORE$40 = 
            new javax.xml.namespace.QName("", "IdFornitore");
        private static final javax.xml.namespace.QName IDLOTTO$42 = 
            new javax.xml.namespace.QName("", "IdLotto");
        private static final javax.xml.namespace.QName TGUCONNETTIVITA$44 = 
            new javax.xml.namespace.QName("", "TGU_Connettivita");
        private static final javax.xml.namespace.QName STATO$46 = 
            new javax.xml.namespace.QName("", "Stato");
        private static final javax.xml.namespace.QName CONSISTENZADATO$48 = 
            new javax.xml.namespace.QName("", "ConsistenzaDato");
        private static final javax.xml.namespace.QName IDCLIENTE$50 = 
            new javax.xml.namespace.QName("", "IdCliente");
        private static final javax.xml.namespace.QName IPGESTIONE$52 = 
            new javax.xml.namespace.QName("", "IpGestione");
        private static final javax.xml.namespace.QName IPPRIVATO$54 = 
            new javax.xml.namespace.QName("", "IpPrivato");
        private static final javax.xml.namespace.QName HOSTNAME$56 = 
            new javax.xml.namespace.QName("", "Hostname");
        private static final javax.xml.namespace.QName TIPOGETTONEBASE$58 = 
            new javax.xml.namespace.QName("", "TipoGettoneBase");
        private static final javax.xml.namespace.QName GETTONIBASE$60 = 
            new javax.xml.namespace.QName("", "GettoniBase");
        private static final javax.xml.namespace.QName GETTONIBASEDISPASSET$62 = 
            new javax.xml.namespace.QName("", "GettoniBaseDispAsset");
        private static final javax.xml.namespace.QName TIPOGETTONEOPZIONALE$64 = 
            new javax.xml.namespace.QName("", "TipoGettoneOpzionale");
        private static final javax.xml.namespace.QName GETTONIOPZ$66 = 
            new javax.xml.namespace.QName("", "GettoniOpz");
        private static final javax.xml.namespace.QName GETTONIOPZDISPASSET$68 = 
            new javax.xml.namespace.QName("", "GettoniOpzDispAsset");
        private static final javax.xml.namespace.QName TIPOGETTONEOPZIONALEAPP$70 = 
            new javax.xml.namespace.QName("", "TipoGettoneOpzionaleApp");
        private static final javax.xml.namespace.QName GETTONIOPZAPP$72 = 
            new javax.xml.namespace.QName("", "GettoniOpzApp");
        private static final javax.xml.namespace.QName GETTONIOPZAPPDISPASSET$74 = 
            new javax.xml.namespace.QName("", "GettoniOpzAppDispAsset");
        
        
        /**
         * Gets array of all "ListaServizi" elements
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi[] getListaServiziArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LISTASERVIZI$0, targetList);
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi[] result = new it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ListaServizi" element
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi getListaServiziArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi)get_store().find_element_user(LISTASERVIZI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ListaServizi" element
         */
        public int sizeOfListaServiziArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTASERVIZI$0);
            }
        }
        
        /**
         * Sets array of all "ListaServizi" element
         */
        public void setListaServiziArray(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi[] listaServiziArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(listaServiziArray, LISTASERVIZI$0);
            }
        }
        
        /**
         * Sets ith "ListaServizi" element
         */
        public void setListaServiziArray(int i, it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi listaServizi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi)get_store().find_element_user(LISTASERVIZI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(listaServizi);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ListaServizi" element
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi insertNewListaServizi(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi)get_store().insert_element_user(LISTASERVIZI$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ListaServizi" element
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi addNewListaServizi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi)get_store().add_element_user(LISTASERVIZI$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ListaServizi" element
         */
        public void removeListaServizi(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTASERVIZI$0, i);
            }
        }
        
        /**
         * Gets the "CardinalitaListaServizi" attribute
         */
        public java.math.BigInteger getCardinalitaListaServizi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITALISTASERVIZI$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "CardinalitaListaServizi" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCardinalitaListaServizi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITALISTASERVIZI$2);
                return target;
            }
        }
        
        /**
         * Sets the "CardinalitaListaServizi" attribute
         */
        public void setCardinalitaListaServizi(java.math.BigInteger cardinalitaListaServizi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITALISTASERVIZI$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDINALITALISTASERVIZI$2);
                }
                target.setBigIntegerValue(cardinalitaListaServizi);
            }
        }
        
        /**
         * Sets (as xml) the "CardinalitaListaServizi" attribute
         */
        public void xsetCardinalitaListaServizi(org.apache.xmlbeans.XmlInteger cardinalitaListaServizi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITALISTASERVIZI$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CARDINALITALISTASERVIZI$2);
                }
                target.set(cardinalitaListaServizi);
            }
        }
        
        /**
         * Gets the "IdAsset" attribute
         */
        public java.math.BigInteger getIdAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDASSET$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "IdAsset" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetIdAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDASSET$4);
                return target;
            }
        }
        
        /**
         * Sets the "IdAsset" attribute
         */
        public void setIdAsset(java.math.BigInteger idAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDASSET$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDASSET$4);
                }
                target.setBigIntegerValue(idAsset);
            }
        }
        
        /**
         * Sets (as xml) the "IdAsset" attribute
         */
        public void xsetIdAsset(org.apache.xmlbeans.XmlInteger idAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDASSET$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDASSET$4);
                }
                target.set(idAsset);
            }
        }
        
        /**
         * Gets the "AssetNumber" attribute
         */
        public java.lang.String getAssetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSETNUMBER$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AssetNumber" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber xgetAssetNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber)get_store().find_attribute_user(ASSETNUMBER$6);
                return target;
            }
        }
        
        /**
         * Sets the "AssetNumber" attribute
         */
        public void setAssetNumber(java.lang.String assetNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSETNUMBER$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSETNUMBER$6);
                }
                target.setStringValue(assetNumber);
            }
        }
        
        /**
         * Sets (as xml) the "AssetNumber" attribute
         */
        public void xsetAssetNumber(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber assetNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber)get_store().find_attribute_user(ASSETNUMBER$6);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber)get_store().add_attribute_user(ASSETNUMBER$6);
                }
                target.set(assetNumber);
            }
        }
        
        /**
         * Gets the "Categoria" attribute
         */
        public java.lang.String getCategoria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORIA$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Categoria" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria xgetCategoria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria)get_store().find_attribute_user(CATEGORIA$8);
                return target;
            }
        }
        
        /**
         * True if has "Categoria" attribute
         */
        public boolean isSetCategoria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CATEGORIA$8) != null;
            }
        }
        
        /**
         * Sets the "Categoria" attribute
         */
        public void setCategoria(java.lang.String categoria)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORIA$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORIA$8);
                }
                target.setStringValue(categoria);
            }
        }
        
        /**
         * Sets (as xml) the "Categoria" attribute
         */
        public void xsetCategoria(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria categoria)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria)get_store().find_attribute_user(CATEGORIA$8);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria)get_store().add_attribute_user(CATEGORIA$8);
                }
                target.set(categoria);
            }
        }
        
        /**
         * Unsets the "Categoria" attribute
         */
        public void unsetCategoria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CATEGORIA$8);
            }
        }
        
        /**
         * Gets the "Tipologia" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia.Enum getTipologia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOLOGIA$10);
                if (target == null)
                {
                    return null;
                }
                return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Tipologia" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia xgetTipologia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia)get_store().find_attribute_user(TIPOLOGIA$10);
                return target;
            }
        }
        
        /**
         * Sets the "Tipologia" attribute
         */
        public void setTipologia(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia.Enum tipologia)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOLOGIA$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIPOLOGIA$10);
                }
                target.setEnumValue(tipologia);
            }
        }
        
        /**
         * Sets (as xml) the "Tipologia" attribute
         */
        public void xsetTipologia(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia tipologia)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia)get_store().find_attribute_user(TIPOLOGIA$10);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia)get_store().add_attribute_user(TIPOLOGIA$10);
                }
                target.set(tipologia);
            }
        }
        
        /**
         * Gets the "SerialNumber" attribute
         */
        public java.lang.String getSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALNUMBER$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SerialNumber" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber xgetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber)get_store().find_attribute_user(SERIALNUMBER$12);
                return target;
            }
        }
        
        /**
         * True if has "SerialNumber" attribute
         */
        public boolean isSetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SERIALNUMBER$12) != null;
            }
        }
        
        /**
         * Sets the "SerialNumber" attribute
         */
        public void setSerialNumber(java.lang.String serialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALNUMBER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALNUMBER$12);
                }
                target.setStringValue(serialNumber);
            }
        }
        
        /**
         * Sets (as xml) the "SerialNumber" attribute
         */
        public void xsetSerialNumber(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber serialNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber)get_store().find_attribute_user(SERIALNUMBER$12);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber)get_store().add_attribute_user(SERIALNUMBER$12);
                }
                target.set(serialNumber);
            }
        }
        
        /**
         * Unsets the "SerialNumber" attribute
         */
        public void unsetSerialNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SERIALNUMBER$12);
            }
        }
        
        /**
         * Gets the "Marca" attribute
         */
        public java.lang.String getMarca()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARCA$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Marca" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca xgetMarca()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca)get_store().find_attribute_user(MARCA$14);
                return target;
            }
        }
        
        /**
         * True if has "Marca" attribute
         */
        public boolean isSetMarca()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MARCA$14) != null;
            }
        }
        
        /**
         * Sets the "Marca" attribute
         */
        public void setMarca(java.lang.String marca)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARCA$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARCA$14);
                }
                target.setStringValue(marca);
            }
        }
        
        /**
         * Sets (as xml) the "Marca" attribute
         */
        public void xsetMarca(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca marca)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca)get_store().find_attribute_user(MARCA$14);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca)get_store().add_attribute_user(MARCA$14);
                }
                target.set(marca);
            }
        }
        
        /**
         * Unsets the "Marca" attribute
         */
        public void unsetMarca()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MARCA$14);
            }
        }
        
        /**
         * Gets the "Modello" attribute
         */
        public java.lang.String getModello()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELLO$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Modello" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello xgetModello()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello)get_store().find_attribute_user(MODELLO$16);
                return target;
            }
        }
        
        /**
         * True if has "Modello" attribute
         */
        public boolean isSetModello()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MODELLO$16) != null;
            }
        }
        
        /**
         * Sets the "Modello" attribute
         */
        public void setModello(java.lang.String modello)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELLO$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODELLO$16);
                }
                target.setStringValue(modello);
            }
        }
        
        /**
         * Sets (as xml) the "Modello" attribute
         */
        public void xsetModello(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello modello)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello)get_store().find_attribute_user(MODELLO$16);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello)get_store().add_attribute_user(MODELLO$16);
                }
                target.set(modello);
            }
        }
        
        /**
         * Unsets the "Modello" attribute
         */
        public void unsetModello()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MODELLO$16);
            }
        }
        
        /**
         * Gets the "IPAddress" attribute
         */
        public java.lang.String getIPAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IPAddress" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress xgetIPAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress)get_store().find_attribute_user(IPADDRESS$18);
                return target;
            }
        }
        
        /**
         * True if has "IPAddress" attribute
         */
        public boolean isSetIPAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IPADDRESS$18) != null;
            }
        }
        
        /**
         * Sets the "IPAddress" attribute
         */
        public void setIPAddress(java.lang.String ipAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IPADDRESS$18);
                }
                target.setStringValue(ipAddress);
            }
        }
        
        /**
         * Sets (as xml) the "IPAddress" attribute
         */
        public void xsetIPAddress(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress ipAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress)get_store().find_attribute_user(IPADDRESS$18);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress)get_store().add_attribute_user(IPADDRESS$18);
                }
                target.set(ipAddress);
            }
        }
        
        /**
         * Unsets the "IPAddress" attribute
         */
        public void unsetIPAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IPADDRESS$18);
            }
        }
        
        /**
         * Gets the "IdSede" attribute
         */
        public java.math.BigInteger getIdSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSEDE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "IdSede" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetIdSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDSEDE$20);
                return target;
            }
        }
        
        /**
         * Sets the "IdSede" attribute
         */
        public void setIdSede(java.math.BigInteger idSede)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSEDE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDSEDE$20);
                }
                target.setBigIntegerValue(idSede);
            }
        }
        
        /**
         * Sets (as xml) the "IdSede" attribute
         */
        public void xsetIdSede(org.apache.xmlbeans.XmlInteger idSede)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDSEDE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDSEDE$20);
                }
                target.set(idSede);
            }
        }
        
        /**
         * Gets the "Sede" attribute
         */
        public java.lang.String getSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEDE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Sede" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede xgetSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede)get_store().find_attribute_user(SEDE$22);
                return target;
            }
        }
        
        /**
         * Sets the "Sede" attribute
         */
        public void setSede(java.lang.String sede)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEDE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEDE$22);
                }
                target.setStringValue(sede);
            }
        }
        
        /**
         * Sets (as xml) the "Sede" attribute
         */
        public void xsetSede(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede sede)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede)get_store().find_attribute_user(SEDE$22);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede)get_store().add_attribute_user(SEDE$22);
                }
                target.set(sede);
            }
        }
        
        /**
         * Gets the "Citta" attribute
         */
        public java.lang.String getCitta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITTA$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Citta" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta xgetCitta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta)get_store().find_attribute_user(CITTA$24);
                return target;
            }
        }
        
        /**
         * Sets the "Citta" attribute
         */
        public void setCitta(java.lang.String citta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITTA$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CITTA$24);
                }
                target.setStringValue(citta);
            }
        }
        
        /**
         * Sets (as xml) the "Citta" attribute
         */
        public void xsetCitta(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta citta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta)get_store().find_attribute_user(CITTA$24);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta)get_store().add_attribute_user(CITTA$24);
                }
                target.set(citta);
            }
        }
        
        /**
         * Gets the "Provincia" attribute
         */
        public java.lang.String getProvincia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVINCIA$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Provincia" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia xgetProvincia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia)get_store().find_attribute_user(PROVINCIA$26);
                return target;
            }
        }
        
        /**
         * Sets the "Provincia" attribute
         */
        public void setProvincia(java.lang.String provincia)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROVINCIA$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROVINCIA$26);
                }
                target.setStringValue(provincia);
            }
        }
        
        /**
         * Sets (as xml) the "Provincia" attribute
         */
        public void xsetProvincia(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia provincia)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia)get_store().find_attribute_user(PROVINCIA$26);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia)get_store().add_attribute_user(PROVINCIA$26);
                }
                target.set(provincia);
            }
        }
        
        /**
         * Gets the "Indirizzo" attribute
         */
        public java.lang.String getIndirizzo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDIRIZZO$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Indirizzo" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo xgetIndirizzo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo)get_store().find_attribute_user(INDIRIZZO$28);
                return target;
            }
        }
        
        /**
         * Sets the "Indirizzo" attribute
         */
        public void setIndirizzo(java.lang.String indirizzo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDIRIZZO$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDIRIZZO$28);
                }
                target.setStringValue(indirizzo);
            }
        }
        
        /**
         * Sets (as xml) the "Indirizzo" attribute
         */
        public void xsetIndirizzo(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo indirizzo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo)get_store().find_attribute_user(INDIRIZZO$28);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo)get_store().add_attribute_user(INDIRIZZO$28);
                }
                target.set(indirizzo);
            }
        }
        
        /**
         * Gets the "Ubic_Corpo" attribute
         */
        public java.lang.String getUbicCorpo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICCORPO$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ubic_Corpo" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo xgetUbicCorpo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo)get_store().find_attribute_user(UBICCORPO$30);
                return target;
            }
        }
        
        /**
         * True if has "Ubic_Corpo" attribute
         */
        public boolean isSetUbicCorpo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UBICCORPO$30) != null;
            }
        }
        
        /**
         * Sets the "Ubic_Corpo" attribute
         */
        public void setUbicCorpo(java.lang.String ubicCorpo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICCORPO$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UBICCORPO$30);
                }
                target.setStringValue(ubicCorpo);
            }
        }
        
        /**
         * Sets (as xml) the "Ubic_Corpo" attribute
         */
        public void xsetUbicCorpo(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo ubicCorpo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo)get_store().find_attribute_user(UBICCORPO$30);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo)get_store().add_attribute_user(UBICCORPO$30);
                }
                target.set(ubicCorpo);
            }
        }
        
        /**
         * Unsets the "Ubic_Corpo" attribute
         */
        public void unsetUbicCorpo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UBICCORPO$30);
            }
        }
        
        /**
         * Gets the "Ubic_Ala" attribute
         */
        public java.lang.String getUbicAla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICALA$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ubic_Ala" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla xgetUbicAla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla)get_store().find_attribute_user(UBICALA$32);
                return target;
            }
        }
        
        /**
         * True if has "Ubic_Ala" attribute
         */
        public boolean isSetUbicAla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UBICALA$32) != null;
            }
        }
        
        /**
         * Sets the "Ubic_Ala" attribute
         */
        public void setUbicAla(java.lang.String ubicAla)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICALA$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UBICALA$32);
                }
                target.setStringValue(ubicAla);
            }
        }
        
        /**
         * Sets (as xml) the "Ubic_Ala" attribute
         */
        public void xsetUbicAla(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla ubicAla)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla)get_store().find_attribute_user(UBICALA$32);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla)get_store().add_attribute_user(UBICALA$32);
                }
                target.set(ubicAla);
            }
        }
        
        /**
         * Unsets the "Ubic_Ala" attribute
         */
        public void unsetUbicAla()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UBICALA$32);
            }
        }
        
        /**
         * Gets the "Ubic_Piano" attribute
         */
        public java.lang.String getUbicPiano()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICPIANO$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ubic_Piano" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano xgetUbicPiano()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano)get_store().find_attribute_user(UBICPIANO$34);
                return target;
            }
        }
        
        /**
         * True if has "Ubic_Piano" attribute
         */
        public boolean isSetUbicPiano()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UBICPIANO$34) != null;
            }
        }
        
        /**
         * Sets the "Ubic_Piano" attribute
         */
        public void setUbicPiano(java.lang.String ubicPiano)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICPIANO$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UBICPIANO$34);
                }
                target.setStringValue(ubicPiano);
            }
        }
        
        /**
         * Sets (as xml) the "Ubic_Piano" attribute
         */
        public void xsetUbicPiano(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano ubicPiano)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano)get_store().find_attribute_user(UBICPIANO$34);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano)get_store().add_attribute_user(UBICPIANO$34);
                }
                target.set(ubicPiano);
            }
        }
        
        /**
         * Unsets the "Ubic_Piano" attribute
         */
        public void unsetUbicPiano()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UBICPIANO$34);
            }
        }
        
        /**
         * Gets the "Ubic_Stanza-Isola" attribute
         */
        public java.lang.String getUbicStanzaIsola()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICSTANZAISOLA$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ubic_Stanza-Isola" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola xgetUbicStanzaIsola()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola)get_store().find_attribute_user(UBICSTANZAISOLA$36);
                return target;
            }
        }
        
        /**
         * True if has "Ubic_Stanza-Isola" attribute
         */
        public boolean isSetUbicStanzaIsola()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UBICSTANZAISOLA$36) != null;
            }
        }
        
        /**
         * Sets the "Ubic_Stanza-Isola" attribute
         */
        public void setUbicStanzaIsola(java.lang.String ubicStanzaIsola)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBICSTANZAISOLA$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UBICSTANZAISOLA$36);
                }
                target.setStringValue(ubicStanzaIsola);
            }
        }
        
        /**
         * Sets (as xml) the "Ubic_Stanza-Isola" attribute
         */
        public void xsetUbicStanzaIsola(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola ubicStanzaIsola)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola)get_store().find_attribute_user(UBICSTANZAISOLA$36);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola)get_store().add_attribute_user(UBICSTANZAISOLA$36);
                }
                target.set(ubicStanzaIsola);
            }
        }
        
        /**
         * Unsets the "Ubic_Stanza-Isola" attribute
         */
        public void unsetUbicStanzaIsola()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UBICSTANZAISOLA$36);
            }
        }
        
        /**
         * Gets the "TelSede" attribute
         */
        public java.lang.String getTelSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TELSEDE$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TelSede" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede xgetTelSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede)get_store().find_attribute_user(TELSEDE$38);
                return target;
            }
        }
        
        /**
         * True if has "TelSede" attribute
         */
        public boolean isSetTelSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TELSEDE$38) != null;
            }
        }
        
        /**
         * Sets the "TelSede" attribute
         */
        public void setTelSede(java.lang.String telSede)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TELSEDE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TELSEDE$38);
                }
                target.setStringValue(telSede);
            }
        }
        
        /**
         * Sets (as xml) the "TelSede" attribute
         */
        public void xsetTelSede(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede telSede)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede)get_store().find_attribute_user(TELSEDE$38);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede)get_store().add_attribute_user(TELSEDE$38);
                }
                target.set(telSede);
            }
        }
        
        /**
         * Unsets the "TelSede" attribute
         */
        public void unsetTelSede()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TELSEDE$38);
            }
        }
        
        /**
         * Gets the "IdFornitore" attribute
         */
        public java.math.BigInteger getIdFornitore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDFORNITORE$40);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "IdFornitore" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetIdFornitore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDFORNITORE$40);
                return target;
            }
        }
        
        /**
         * Sets the "IdFornitore" attribute
         */
        public void setIdFornitore(java.math.BigInteger idFornitore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDFORNITORE$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDFORNITORE$40);
                }
                target.setBigIntegerValue(idFornitore);
            }
        }
        
        /**
         * Sets (as xml) the "IdFornitore" attribute
         */
        public void xsetIdFornitore(org.apache.xmlbeans.XmlInteger idFornitore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDFORNITORE$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDFORNITORE$40);
                }
                target.set(idFornitore);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLOTTO$42);
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
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto xgetIdLotto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto)get_store().find_attribute_user(IDLOTTO$42);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLOTTO$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDLOTTO$42);
                }
                target.setStringValue(idLotto);
            }
        }
        
        /**
         * Sets (as xml) the "IdLotto" attribute
         */
        public void xsetIdLotto(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto idLotto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto)get_store().find_attribute_user(IDLOTTO$42);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto)get_store().add_attribute_user(IDLOTTO$42);
                }
                target.set(idLotto);
            }
        }
        
        /**
         * Gets the "TGU_Connettivita" attribute
         */
        public java.lang.String getTGUConnettivita()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TGUCONNETTIVITA$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TGU_Connettivita" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita xgetTGUConnettivita()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita)get_store().find_attribute_user(TGUCONNETTIVITA$44);
                return target;
            }
        }
        
        /**
         * True if has "TGU_Connettivita" attribute
         */
        public boolean isSetTGUConnettivita()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TGUCONNETTIVITA$44) != null;
            }
        }
        
        /**
         * Sets the "TGU_Connettivita" attribute
         */
        public void setTGUConnettivita(java.lang.String tguConnettivita)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TGUCONNETTIVITA$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TGUCONNETTIVITA$44);
                }
                target.setStringValue(tguConnettivita);
            }
        }
        
        /**
         * Sets (as xml) the "TGU_Connettivita" attribute
         */
        public void xsetTGUConnettivita(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita tguConnettivita)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita)get_store().find_attribute_user(TGUCONNETTIVITA$44);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita)get_store().add_attribute_user(TGUCONNETTIVITA$44);
                }
                target.set(tguConnettivita);
            }
        }
        
        /**
         * Unsets the "TGU_Connettivita" attribute
         */
        public void unsetTGUConnettivita()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TGUCONNETTIVITA$44);
            }
        }
        
        /**
         * Gets the "Stato" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato.Enum getStato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATO$46);
                if (target == null)
                {
                    return null;
                }
                return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Stato" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato xgetStato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato)get_store().find_attribute_user(STATO$46);
                return target;
            }
        }
        
        /**
         * Sets the "Stato" attribute
         */
        public void setStato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato.Enum stato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATO$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATO$46);
                }
                target.setEnumValue(stato);
            }
        }
        
        /**
         * Sets (as xml) the "Stato" attribute
         */
        public void xsetStato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato stato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato)get_store().find_attribute_user(STATO$46);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato)get_store().add_attribute_user(STATO$46);
                }
                target.set(stato);
            }
        }
        
        /**
         * Gets the "ConsistenzaDato" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato.Enum getConsistenzaDato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSISTENZADATO$48);
                if (target == null)
                {
                    return null;
                }
                return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ConsistenzaDato" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato xgetConsistenzaDato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato)get_store().find_attribute_user(CONSISTENZADATO$48);
                return target;
            }
        }
        
        /**
         * Sets the "ConsistenzaDato" attribute
         */
        public void setConsistenzaDato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato.Enum consistenzaDato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSISTENZADATO$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSISTENZADATO$48);
                }
                target.setEnumValue(consistenzaDato);
            }
        }
        
        /**
         * Sets (as xml) the "ConsistenzaDato" attribute
         */
        public void xsetConsistenzaDato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato consistenzaDato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato)get_store().find_attribute_user(CONSISTENZADATO$48);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato)get_store().add_attribute_user(CONSISTENZADATO$48);
                }
                target.set(consistenzaDato);
            }
        }
        
        /**
         * Gets the "IdCliente" attribute
         */
        public java.math.BigInteger getIdCliente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$50);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$50);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCLIENTE$50);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDCLIENTE$50);
                }
                target.set(idCliente);
            }
        }
        
        /**
         * Gets the "IpGestione" attribute
         */
        public java.lang.String getIpGestione()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPGESTIONE$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IpGestione" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione xgetIpGestione()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione)get_store().find_attribute_user(IPGESTIONE$52);
                return target;
            }
        }
        
        /**
         * True if has "IpGestione" attribute
         */
        public boolean isSetIpGestione()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IPGESTIONE$52) != null;
            }
        }
        
        /**
         * Sets the "IpGestione" attribute
         */
        public void setIpGestione(java.lang.String ipGestione)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPGESTIONE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IPGESTIONE$52);
                }
                target.setStringValue(ipGestione);
            }
        }
        
        /**
         * Sets (as xml) the "IpGestione" attribute
         */
        public void xsetIpGestione(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione ipGestione)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione)get_store().find_attribute_user(IPGESTIONE$52);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione)get_store().add_attribute_user(IPGESTIONE$52);
                }
                target.set(ipGestione);
            }
        }
        
        /**
         * Unsets the "IpGestione" attribute
         */
        public void unsetIpGestione()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IPGESTIONE$52);
            }
        }
        
        /**
         * Gets the "IpPrivato" attribute
         */
        public java.lang.String getIpPrivato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPPRIVATO$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IpPrivato" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato xgetIpPrivato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato)get_store().find_attribute_user(IPPRIVATO$54);
                return target;
            }
        }
        
        /**
         * True if has "IpPrivato" attribute
         */
        public boolean isSetIpPrivato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IPPRIVATO$54) != null;
            }
        }
        
        /**
         * Sets the "IpPrivato" attribute
         */
        public void setIpPrivato(java.lang.String ipPrivato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPPRIVATO$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IPPRIVATO$54);
                }
                target.setStringValue(ipPrivato);
            }
        }
        
        /**
         * Sets (as xml) the "IpPrivato" attribute
         */
        public void xsetIpPrivato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato ipPrivato)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato)get_store().find_attribute_user(IPPRIVATO$54);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato)get_store().add_attribute_user(IPPRIVATO$54);
                }
                target.set(ipPrivato);
            }
        }
        
        /**
         * Unsets the "IpPrivato" attribute
         */
        public void unsetIpPrivato()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IPPRIVATO$54);
            }
        }
        
        /**
         * Gets the "Hostname" attribute
         */
        public java.lang.String getHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$56);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Hostname" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname xgetHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname)get_store().find_attribute_user(HOSTNAME$56);
                return target;
            }
        }
        
        /**
         * True if has "Hostname" attribute
         */
        public boolean isSetHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HOSTNAME$56) != null;
            }
        }
        
        /**
         * Sets the "Hostname" attribute
         */
        public void setHostname(java.lang.String hostname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$56);
                }
                target.setStringValue(hostname);
            }
        }
        
        /**
         * Sets (as xml) the "Hostname" attribute
         */
        public void xsetHostname(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname hostname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname)get_store().find_attribute_user(HOSTNAME$56);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname)get_store().add_attribute_user(HOSTNAME$56);
                }
                target.set(hostname);
            }
        }
        
        /**
         * Unsets the "Hostname" attribute
         */
        public void unsetHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HOSTNAME$56);
            }
        }
        
        /**
         * Gets the "TipoGettoneBase" attribute
         */
        public java.lang.String getTipoGettoneBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOGETTONEBASE$58);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TipoGettoneBase" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase xgetTipoGettoneBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase)get_store().find_attribute_user(TIPOGETTONEBASE$58);
                return target;
            }
        }
        
        /**
         * Sets the "TipoGettoneBase" attribute
         */
        public void setTipoGettoneBase(java.lang.String tipoGettoneBase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOGETTONEBASE$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIPOGETTONEBASE$58);
                }
                target.setStringValue(tipoGettoneBase);
            }
        }
        
        /**
         * Sets (as xml) the "TipoGettoneBase" attribute
         */
        public void xsetTipoGettoneBase(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase tipoGettoneBase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase)get_store().find_attribute_user(TIPOGETTONEBASE$58);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase)get_store().add_attribute_user(TIPOGETTONEBASE$58);
                }
                target.set(tipoGettoneBase);
            }
        }
        
        /**
         * Gets the "GettoniBase" attribute
         */
        public java.lang.String getGettoniBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIBASE$60);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GettoniBase" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase xgetGettoniBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase)get_store().find_attribute_user(GETTONIBASE$60);
                return target;
            }
        }
        
        /**
         * Sets the "GettoniBase" attribute
         */
        public void setGettoniBase(java.lang.String gettoniBase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIBASE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTONIBASE$60);
                }
                target.setStringValue(gettoniBase);
            }
        }
        
        /**
         * Sets (as xml) the "GettoniBase" attribute
         */
        public void xsetGettoniBase(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase gettoniBase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase)get_store().find_attribute_user(GETTONIBASE$60);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase)get_store().add_attribute_user(GETTONIBASE$60);
                }
                target.set(gettoniBase);
            }
        }
        
        /**
         * Gets the "GettoniBaseDispAsset" attribute
         */
        public java.lang.String getGettoniBaseDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIBASEDISPASSET$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GettoniBaseDispAsset" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset xgetGettoniBaseDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset)get_store().find_attribute_user(GETTONIBASEDISPASSET$62);
                return target;
            }
        }
        
        /**
         * True if has "GettoniBaseDispAsset" attribute
         */
        public boolean isSetGettoniBaseDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GETTONIBASEDISPASSET$62) != null;
            }
        }
        
        /**
         * Sets the "GettoniBaseDispAsset" attribute
         */
        public void setGettoniBaseDispAsset(java.lang.String gettoniBaseDispAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIBASEDISPASSET$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTONIBASEDISPASSET$62);
                }
                target.setStringValue(gettoniBaseDispAsset);
            }
        }
        
        /**
         * Sets (as xml) the "GettoniBaseDispAsset" attribute
         */
        public void xsetGettoniBaseDispAsset(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset gettoniBaseDispAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset)get_store().find_attribute_user(GETTONIBASEDISPASSET$62);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset)get_store().add_attribute_user(GETTONIBASEDISPASSET$62);
                }
                target.set(gettoniBaseDispAsset);
            }
        }
        
        /**
         * Unsets the "GettoniBaseDispAsset" attribute
         */
        public void unsetGettoniBaseDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GETTONIBASEDISPASSET$62);
            }
        }
        
        /**
         * Gets the "TipoGettoneOpzionale" attribute
         */
        public java.lang.String getTipoGettoneOpzionale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOGETTONEOPZIONALE$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TipoGettoneOpzionale" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale xgetTipoGettoneOpzionale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale)get_store().find_attribute_user(TIPOGETTONEOPZIONALE$64);
                return target;
            }
        }
        
        /**
         * Sets the "TipoGettoneOpzionale" attribute
         */
        public void setTipoGettoneOpzionale(java.lang.String tipoGettoneOpzionale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOGETTONEOPZIONALE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIPOGETTONEOPZIONALE$64);
                }
                target.setStringValue(tipoGettoneOpzionale);
            }
        }
        
        /**
         * Sets (as xml) the "TipoGettoneOpzionale" attribute
         */
        public void xsetTipoGettoneOpzionale(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale tipoGettoneOpzionale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale)get_store().find_attribute_user(TIPOGETTONEOPZIONALE$64);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale)get_store().add_attribute_user(TIPOGETTONEOPZIONALE$64);
                }
                target.set(tipoGettoneOpzionale);
            }
        }
        
        /**
         * Gets the "GettoniOpz" attribute
         */
        public java.lang.String getGettoniOpz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZ$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GettoniOpz" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz xgetGettoniOpz()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz)get_store().find_attribute_user(GETTONIOPZ$66);
                return target;
            }
        }
        
        /**
         * Sets the "GettoniOpz" attribute
         */
        public void setGettoniOpz(java.lang.String gettoniOpz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZ$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTONIOPZ$66);
                }
                target.setStringValue(gettoniOpz);
            }
        }
        
        /**
         * Sets (as xml) the "GettoniOpz" attribute
         */
        public void xsetGettoniOpz(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz gettoniOpz)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz)get_store().find_attribute_user(GETTONIOPZ$66);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz)get_store().add_attribute_user(GETTONIOPZ$66);
                }
                target.set(gettoniOpz);
            }
        }
        
        /**
         * Gets the "GettoniOpzDispAsset" attribute
         */
        public java.lang.String getGettoniOpzDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZDISPASSET$68);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GettoniOpzDispAsset" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset xgetGettoniOpzDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset)get_store().find_attribute_user(GETTONIOPZDISPASSET$68);
                return target;
            }
        }
        
        /**
         * True if has "GettoniOpzDispAsset" attribute
         */
        public boolean isSetGettoniOpzDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GETTONIOPZDISPASSET$68) != null;
            }
        }
        
        /**
         * Sets the "GettoniOpzDispAsset" attribute
         */
        public void setGettoniOpzDispAsset(java.lang.String gettoniOpzDispAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZDISPASSET$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTONIOPZDISPASSET$68);
                }
                target.setStringValue(gettoniOpzDispAsset);
            }
        }
        
        /**
         * Sets (as xml) the "GettoniOpzDispAsset" attribute
         */
        public void xsetGettoniOpzDispAsset(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset gettoniOpzDispAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset)get_store().find_attribute_user(GETTONIOPZDISPASSET$68);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset)get_store().add_attribute_user(GETTONIOPZDISPASSET$68);
                }
                target.set(gettoniOpzDispAsset);
            }
        }
        
        /**
         * Unsets the "GettoniOpzDispAsset" attribute
         */
        public void unsetGettoniOpzDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GETTONIOPZDISPASSET$68);
            }
        }
        
        /**
         * Gets the "TipoGettoneOpzionaleApp" attribute
         */
        public java.lang.String getTipoGettoneOpzionaleApp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOGETTONEOPZIONALEAPP$70);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TipoGettoneOpzionaleApp" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp xgetTipoGettoneOpzionaleApp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp)get_store().find_attribute_user(TIPOGETTONEOPZIONALEAPP$70);
                return target;
            }
        }
        
        /**
         * Sets the "TipoGettoneOpzionaleApp" attribute
         */
        public void setTipoGettoneOpzionaleApp(java.lang.String tipoGettoneOpzionaleApp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOGETTONEOPZIONALEAPP$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIPOGETTONEOPZIONALEAPP$70);
                }
                target.setStringValue(tipoGettoneOpzionaleApp);
            }
        }
        
        /**
         * Sets (as xml) the "TipoGettoneOpzionaleApp" attribute
         */
        public void xsetTipoGettoneOpzionaleApp(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp tipoGettoneOpzionaleApp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp)get_store().find_attribute_user(TIPOGETTONEOPZIONALEAPP$70);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp)get_store().add_attribute_user(TIPOGETTONEOPZIONALEAPP$70);
                }
                target.set(tipoGettoneOpzionaleApp);
            }
        }
        
        /**
         * Gets the "GettoniOpzApp" attribute
         */
        public java.lang.String getGettoniOpzApp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZAPP$72);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GettoniOpzApp" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp xgetGettoniOpzApp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp)get_store().find_attribute_user(GETTONIOPZAPP$72);
                return target;
            }
        }
        
        /**
         * Sets the "GettoniOpzApp" attribute
         */
        public void setGettoniOpzApp(java.lang.String gettoniOpzApp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZAPP$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTONIOPZAPP$72);
                }
                target.setStringValue(gettoniOpzApp);
            }
        }
        
        /**
         * Sets (as xml) the "GettoniOpzApp" attribute
         */
        public void xsetGettoniOpzApp(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp gettoniOpzApp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp)get_store().find_attribute_user(GETTONIOPZAPP$72);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp)get_store().add_attribute_user(GETTONIOPZAPP$72);
                }
                target.set(gettoniOpzApp);
            }
        }
        
        /**
         * Gets the "GettoniOpzAppDispAsset" attribute
         */
        public java.lang.String getGettoniOpzAppDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZAPPDISPASSET$74);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GettoniOpzAppDispAsset" attribute
         */
        public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset xgetGettoniOpzAppDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset)get_store().find_attribute_user(GETTONIOPZAPPDISPASSET$74);
                return target;
            }
        }
        
        /**
         * True if has "GettoniOpzAppDispAsset" attribute
         */
        public boolean isSetGettoniOpzAppDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GETTONIOPZAPPDISPASSET$74) != null;
            }
        }
        
        /**
         * Sets the "GettoniOpzAppDispAsset" attribute
         */
        public void setGettoniOpzAppDispAsset(java.lang.String gettoniOpzAppDispAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETTONIOPZAPPDISPASSET$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETTONIOPZAPPDISPASSET$74);
                }
                target.setStringValue(gettoniOpzAppDispAsset);
            }
        }
        
        /**
         * Sets (as xml) the "GettoniOpzAppDispAsset" attribute
         */
        public void xsetGettoniOpzAppDispAsset(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset gettoniOpzAppDispAsset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset target = null;
                target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset)get_store().find_attribute_user(GETTONIOPZAPPDISPASSET$74);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset)get_store().add_attribute_user(GETTONIOPZAPPDISPASSET$74);
                }
                target.set(gettoniOpzAppDispAsset);
            }
        }
        
        /**
         * Unsets the "GettoniOpzAppDispAsset" attribute
         */
        public void unsetGettoniOpzAppDispAsset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GETTONIOPZAPPDISPASSET$74);
            }
        }
        /**
         * An XML ListaServizi(@).
         *
         * This is a complex type.
         */
        public static class ListaServiziImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi
        {
            private static final long serialVersionUID = 1L;
            
            public ListaServiziImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NOMESERVIZIO$0 = 
                new javax.xml.namespace.QName("", "NomeServizio");
            private static final javax.xml.namespace.QName IDSERVIZIO$2 = 
                new javax.xml.namespace.QName("", "IdServizio");
            
            
            /**
             * Gets the "NomeServizio" attribute
             */
            public java.lang.String getNomeServizio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMESERVIZIO$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NomeServizio" attribute
             */
            public it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio xgetNomeServizio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio target = null;
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio)get_store().find_attribute_user(NOMESERVIZIO$0);
                    return target;
                }
            }
            
            /**
             * Sets the "NomeServizio" attribute
             */
            public void setNomeServizio(java.lang.String nomeServizio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMESERVIZIO$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOMESERVIZIO$0);
                    }
                    target.setStringValue(nomeServizio);
                }
            }
            
            /**
             * Sets (as xml) the "NomeServizio" attribute
             */
            public void xsetNomeServizio(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio nomeServizio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio target = null;
                    target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio)get_store().find_attribute_user(NOMESERVIZIO$0);
                    if (target == null)
                    {
                      target = (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio)get_store().add_attribute_user(NOMESERVIZIO$0);
                    }
                    target.set(nomeServizio);
                }
            }
            
            /**
             * Gets the "IdServizio" attribute
             */
            public java.math.BigInteger getIdServizio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSERVIZIO$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "IdServizio" attribute
             */
            public org.apache.xmlbeans.XmlInteger xgetIdServizio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDSERVIZIO$2);
                    return target;
                }
            }
            
            /**
             * Sets the "IdServizio" attribute
             */
            public void setIdServizio(java.math.BigInteger idServizio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSERVIZIO$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDSERVIZIO$2);
                    }
                    target.setBigIntegerValue(idServizio);
                }
            }
            
            /**
             * Sets (as xml) the "IdServizio" attribute
             */
            public void xsetIdServizio(org.apache.xmlbeans.XmlInteger idServizio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDSERVIZIO$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDSERVIZIO$2);
                    }
                    target.set(idServizio);
                }
            }
            /**
             * An XML NomeServizio(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$ListaServizi$NomeServizio.
             */
            public static class NomeServizioImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio
            {
                private static final long serialVersionUID = 1L;
                
                public NomeServizioImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NomeServizioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML AssetNumber(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$AssetNumber.
         */
        public static class AssetNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber
        {
            private static final long serialVersionUID = 1L;
            
            public AssetNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AssetNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Categoria(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Categoria.
         */
        public static class CategoriaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria
        {
            private static final long serialVersionUID = 1L;
            
            public CategoriaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CategoriaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Tipologia(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Tipologia.
         */
        public static class TipologiaImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia
        {
            private static final long serialVersionUID = 1L;
            
            public TipologiaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TipologiaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML SerialNumber(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$SerialNumber.
         */
        public static class SerialNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber
        {
            private static final long serialVersionUID = 1L;
            
            public SerialNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SerialNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Marca(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Marca.
         */
        public static class MarcaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca
        {
            private static final long serialVersionUID = 1L;
            
            public MarcaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MarcaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Modello(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Modello.
         */
        public static class ModelloImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello
        {
            private static final long serialVersionUID = 1L;
            
            public ModelloImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ModelloImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML IPAddress(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IPAddress.
         */
        public static class IPAddressImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress
        {
            private static final long serialVersionUID = 1L;
            
            public IPAddressImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IPAddressImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Sede(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Sede.
         */
        public static class SedeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede
        {
            private static final long serialVersionUID = 1L;
            
            public SedeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SedeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Citta(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Citta.
         */
        public static class CittaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta
        {
            private static final long serialVersionUID = 1L;
            
            public CittaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CittaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Provincia(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Provincia.
         */
        public static class ProvinciaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia
        {
            private static final long serialVersionUID = 1L;
            
            public ProvinciaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ProvinciaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Indirizzo(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Indirizzo.
         */
        public static class IndirizzoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo
        {
            private static final long serialVersionUID = 1L;
            
            public IndirizzoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IndirizzoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Ubic_Corpo(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicCorpo.
         */
        public static class UbicCorpoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo
        {
            private static final long serialVersionUID = 1L;
            
            public UbicCorpoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UbicCorpoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Ubic_Ala(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicAla.
         */
        public static class UbicAlaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla
        {
            private static final long serialVersionUID = 1L;
            
            public UbicAlaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UbicAlaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Ubic_Piano(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicPiano.
         */
        public static class UbicPianoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano
        {
            private static final long serialVersionUID = 1L;
            
            public UbicPianoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UbicPianoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Ubic_Stanza-Isola(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicStanzaIsola.
         */
        public static class UbicStanzaIsolaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola
        {
            private static final long serialVersionUID = 1L;
            
            public UbicStanzaIsolaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UbicStanzaIsolaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML TelSede(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TelSede.
         */
        public static class TelSedeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede
        {
            private static final long serialVersionUID = 1L;
            
            public TelSedeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TelSedeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML IdLotto(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IdLotto.
         */
        public static class IdLottoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto
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
        /**
         * An XML TGU_Connettivita(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TGUConnettivita.
         */
        public static class TGUConnettivitaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita
        {
            private static final long serialVersionUID = 1L;
            
            public TGUConnettivitaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TGUConnettivitaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Stato(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Stato.
         */
        public static class StatoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato
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
        /**
         * An XML ConsistenzaDato(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$ConsistenzaDato.
         */
        public static class ConsistenzaDatoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato
        {
            private static final long serialVersionUID = 1L;
            
            public ConsistenzaDatoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ConsistenzaDatoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML IpGestione(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IpGestione.
         */
        public static class IpGestioneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione
        {
            private static final long serialVersionUID = 1L;
            
            public IpGestioneImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IpGestioneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML IpPrivato(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IpPrivato.
         */
        public static class IpPrivatoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato
        {
            private static final long serialVersionUID = 1L;
            
            public IpPrivatoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IpPrivatoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Hostname(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Hostname.
         */
        public static class HostnameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname
        {
            private static final long serialVersionUID = 1L;
            
            public HostnameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected HostnameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML TipoGettoneBase(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TipoGettoneBase.
         */
        public static class TipoGettoneBaseImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase
        {
            private static final long serialVersionUID = 1L;
            
            public TipoGettoneBaseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TipoGettoneBaseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML GettoniBase(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniBase.
         */
        public static class GettoniBaseImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase
        {
            private static final long serialVersionUID = 1L;
            
            public GettoniBaseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GettoniBaseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML GettoniBaseDispAsset(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniBaseDispAsset.
         */
        public static class GettoniBaseDispAssetImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset
        {
            private static final long serialVersionUID = 1L;
            
            public GettoniBaseDispAssetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GettoniBaseDispAssetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML TipoGettoneOpzionale(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TipoGettoneOpzionale.
         */
        public static class TipoGettoneOpzionaleImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale
        {
            private static final long serialVersionUID = 1L;
            
            public TipoGettoneOpzionaleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TipoGettoneOpzionaleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML GettoniOpz(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpz.
         */
        public static class GettoniOpzImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz
        {
            private static final long serialVersionUID = 1L;
            
            public GettoniOpzImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GettoniOpzImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML GettoniOpzDispAsset(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpzDispAsset.
         */
        public static class GettoniOpzDispAssetImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset
        {
            private static final long serialVersionUID = 1L;
            
            public GettoniOpzDispAssetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GettoniOpzDispAssetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML TipoGettoneOpzionaleApp(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TipoGettoneOpzionaleApp.
         */
        public static class TipoGettoneOpzionaleAppImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp
        {
            private static final long serialVersionUID = 1L;
            
            public TipoGettoneOpzionaleAppImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TipoGettoneOpzionaleAppImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML GettoniOpzApp(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpzApp.
         */
        public static class GettoniOpzAppImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp
        {
            private static final long serialVersionUID = 1L;
            
            public GettoniOpzAppImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GettoniOpzAppImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML GettoniOpzAppDispAsset(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpzAppDispAsset.
         */
        public static class GettoniOpzAppDispAssetImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset
        {
            private static final long serialVersionUID = 1L;
            
            public GettoniOpzAppDispAssetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GettoniOpzAppDispAssetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
