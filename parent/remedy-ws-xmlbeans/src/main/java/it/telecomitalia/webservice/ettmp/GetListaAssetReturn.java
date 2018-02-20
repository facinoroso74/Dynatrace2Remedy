/*
 * XML Type:  get_ListaAssetReturn
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaAssetReturn
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp;


/**
 * An XML get_ListaAssetReturn(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface GetListaAssetReturn extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListaAssetReturn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("getlistaassetreturn564atype");
    
    /**
     * Gets array of all "DatiAsset" elements
     */
    it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset[] getDatiAssetArray();
    
    /**
     * Gets ith "DatiAsset" element
     */
    it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset getDatiAssetArray(int i);
    
    /**
     * Returns number of "DatiAsset" element
     */
    int sizeOfDatiAssetArray();
    
    /**
     * Sets array of all "DatiAsset" element
     */
    void setDatiAssetArray(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset[] datiAssetArray);
    
    /**
     * Sets ith "DatiAsset" element
     */
    void setDatiAssetArray(int i, it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset datiAsset);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiAsset" element
     */
    it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset insertNewDatiAsset(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiAsset" element
     */
    it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset addNewDatiAsset();
    
    /**
     * Removes the ith "DatiAsset" element
     */
    void removeDatiAsset(int i);
    
    /**
     * Gets the "Cardinalita" attribute
     */
    java.math.BigInteger getCardinalita();
    
    /**
     * Gets (as xml) the "Cardinalita" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCardinalita();
    
    /**
     * Sets the "Cardinalita" attribute
     */
    void setCardinalita(java.math.BigInteger cardinalita);
    
    /**
     * Sets (as xml) the "Cardinalita" attribute
     */
    void xsetCardinalita(org.apache.xmlbeans.XmlInteger cardinalita);
    
    /**
     * Gets the "IdCliente" attribute
     */
    java.math.BigInteger getIdCliente();
    
    /**
     * Gets (as xml) the "IdCliente" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetIdCliente();
    
    /**
     * True if has "IdCliente" attribute
     */
    boolean isSetIdCliente();
    
    /**
     * Sets the "IdCliente" attribute
     */
    void setIdCliente(java.math.BigInteger idCliente);
    
    /**
     * Sets (as xml) the "IdCliente" attribute
     */
    void xsetIdCliente(org.apache.xmlbeans.XmlInteger idCliente);
    
    /**
     * Unsets the "IdCliente" attribute
     */
    void unsetIdCliente();
    
    /**
     * Gets the "Pagina" attribute
     */
    java.math.BigInteger getPagina();
    
    /**
     * Gets (as xml) the "Pagina" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetPagina();
    
    /**
     * Sets the "Pagina" attribute
     */
    void setPagina(java.math.BigInteger pagina);
    
    /**
     * Sets (as xml) the "Pagina" attribute
     */
    void xsetPagina(org.apache.xmlbeans.XmlInteger pagina);
    
    /**
     * Gets the "RequestID" attribute
     */
    java.math.BigInteger getRequestID();
    
    /**
     * Gets (as xml) the "RequestID" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetRequestID();
    
    /**
     * Sets the "RequestID" attribute
     */
    void setRequestID(java.math.BigInteger requestID);
    
    /**
     * Sets (as xml) the "RequestID" attribute
     */
    void xsetRequestID(org.apache.xmlbeans.XmlInteger requestID);
    
    /**
     * An XML DatiAsset(@).
     *
     * This is a complex type.
     */
    public interface DatiAsset extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiAsset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("datiassetaad0elemtype");
        
        /**
         * Gets array of all "ListaServizi" elements
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi[] getListaServiziArray();
        
        /**
         * Gets ith "ListaServizi" element
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi getListaServiziArray(int i);
        
        /**
         * Returns number of "ListaServizi" element
         */
        int sizeOfListaServiziArray();
        
        /**
         * Sets array of all "ListaServizi" element
         */
        void setListaServiziArray(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi[] listaServiziArray);
        
        /**
         * Sets ith "ListaServizi" element
         */
        void setListaServiziArray(int i, it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi listaServizi);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ListaServizi" element
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi insertNewListaServizi(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ListaServizi" element
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi addNewListaServizi();
        
        /**
         * Removes the ith "ListaServizi" element
         */
        void removeListaServizi(int i);
        
        /**
         * Gets the "CardinalitaListaServizi" attribute
         */
        java.math.BigInteger getCardinalitaListaServizi();
        
        /**
         * Gets (as xml) the "CardinalitaListaServizi" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetCardinalitaListaServizi();
        
        /**
         * Sets the "CardinalitaListaServizi" attribute
         */
        void setCardinalitaListaServizi(java.math.BigInteger cardinalitaListaServizi);
        
        /**
         * Sets (as xml) the "CardinalitaListaServizi" attribute
         */
        void xsetCardinalitaListaServizi(org.apache.xmlbeans.XmlInteger cardinalitaListaServizi);
        
        /**
         * Gets the "IdAsset" attribute
         */
        java.math.BigInteger getIdAsset();
        
        /**
         * Gets (as xml) the "IdAsset" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetIdAsset();
        
        /**
         * Sets the "IdAsset" attribute
         */
        void setIdAsset(java.math.BigInteger idAsset);
        
        /**
         * Sets (as xml) the "IdAsset" attribute
         */
        void xsetIdAsset(org.apache.xmlbeans.XmlInteger idAsset);
        
        /**
         * Gets the "AssetNumber" attribute
         */
        java.lang.String getAssetNumber();
        
        /**
         * Gets (as xml) the "AssetNumber" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber xgetAssetNumber();
        
        /**
         * Sets the "AssetNumber" attribute
         */
        void setAssetNumber(java.lang.String assetNumber);
        
        /**
         * Sets (as xml) the "AssetNumber" attribute
         */
        void xsetAssetNumber(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber assetNumber);
        
        /**
         * Gets the "Categoria" attribute
         */
        java.lang.String getCategoria();
        
        /**
         * Gets (as xml) the "Categoria" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria xgetCategoria();
        
        /**
         * True if has "Categoria" attribute
         */
        boolean isSetCategoria();
        
        /**
         * Sets the "Categoria" attribute
         */
        void setCategoria(java.lang.String categoria);
        
        /**
         * Sets (as xml) the "Categoria" attribute
         */
        void xsetCategoria(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria categoria);
        
        /**
         * Unsets the "Categoria" attribute
         */
        void unsetCategoria();
        
        /**
         * Gets the "Tipologia" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia.Enum getTipologia();
        
        /**
         * Gets (as xml) the "Tipologia" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia xgetTipologia();
        
        /**
         * Sets the "Tipologia" attribute
         */
        void setTipologia(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia.Enum tipologia);
        
        /**
         * Sets (as xml) the "Tipologia" attribute
         */
        void xsetTipologia(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia tipologia);
        
        /**
         * Gets the "SerialNumber" attribute
         */
        java.lang.String getSerialNumber();
        
        /**
         * Gets (as xml) the "SerialNumber" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber xgetSerialNumber();
        
        /**
         * True if has "SerialNumber" attribute
         */
        boolean isSetSerialNumber();
        
        /**
         * Sets the "SerialNumber" attribute
         */
        void setSerialNumber(java.lang.String serialNumber);
        
        /**
         * Sets (as xml) the "SerialNumber" attribute
         */
        void xsetSerialNumber(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber serialNumber);
        
        /**
         * Unsets the "SerialNumber" attribute
         */
        void unsetSerialNumber();
        
        /**
         * Gets the "Marca" attribute
         */
        java.lang.String getMarca();
        
        /**
         * Gets (as xml) the "Marca" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca xgetMarca();
        
        /**
         * True if has "Marca" attribute
         */
        boolean isSetMarca();
        
        /**
         * Sets the "Marca" attribute
         */
        void setMarca(java.lang.String marca);
        
        /**
         * Sets (as xml) the "Marca" attribute
         */
        void xsetMarca(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca marca);
        
        /**
         * Unsets the "Marca" attribute
         */
        void unsetMarca();
        
        /**
         * Gets the "Modello" attribute
         */
        java.lang.String getModello();
        
        /**
         * Gets (as xml) the "Modello" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello xgetModello();
        
        /**
         * True if has "Modello" attribute
         */
        boolean isSetModello();
        
        /**
         * Sets the "Modello" attribute
         */
        void setModello(java.lang.String modello);
        
        /**
         * Sets (as xml) the "Modello" attribute
         */
        void xsetModello(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello modello);
        
        /**
         * Unsets the "Modello" attribute
         */
        void unsetModello();
        
        /**
         * Gets the "IPAddress" attribute
         */
        java.lang.String getIPAddress();
        
        /**
         * Gets (as xml) the "IPAddress" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress xgetIPAddress();
        
        /**
         * True if has "IPAddress" attribute
         */
        boolean isSetIPAddress();
        
        /**
         * Sets the "IPAddress" attribute
         */
        void setIPAddress(java.lang.String ipAddress);
        
        /**
         * Sets (as xml) the "IPAddress" attribute
         */
        void xsetIPAddress(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress ipAddress);
        
        /**
         * Unsets the "IPAddress" attribute
         */
        void unsetIPAddress();
        
        /**
         * Gets the "IdSede" attribute
         */
        java.math.BigInteger getIdSede();
        
        /**
         * Gets (as xml) the "IdSede" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetIdSede();
        
        /**
         * Sets the "IdSede" attribute
         */
        void setIdSede(java.math.BigInteger idSede);
        
        /**
         * Sets (as xml) the "IdSede" attribute
         */
        void xsetIdSede(org.apache.xmlbeans.XmlInteger idSede);
        
        /**
         * Gets the "Sede" attribute
         */
        java.lang.String getSede();
        
        /**
         * Gets (as xml) the "Sede" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede xgetSede();
        
        /**
         * Sets the "Sede" attribute
         */
        void setSede(java.lang.String sede);
        
        /**
         * Sets (as xml) the "Sede" attribute
         */
        void xsetSede(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede sede);
        
        /**
         * Gets the "Citta" attribute
         */
        java.lang.String getCitta();
        
        /**
         * Gets (as xml) the "Citta" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta xgetCitta();
        
        /**
         * Sets the "Citta" attribute
         */
        void setCitta(java.lang.String citta);
        
        /**
         * Sets (as xml) the "Citta" attribute
         */
        void xsetCitta(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta citta);
        
        /**
         * Gets the "Provincia" attribute
         */
        java.lang.String getProvincia();
        
        /**
         * Gets (as xml) the "Provincia" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia xgetProvincia();
        
        /**
         * Sets the "Provincia" attribute
         */
        void setProvincia(java.lang.String provincia);
        
        /**
         * Sets (as xml) the "Provincia" attribute
         */
        void xsetProvincia(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia provincia);
        
        /**
         * Gets the "Indirizzo" attribute
         */
        java.lang.String getIndirizzo();
        
        /**
         * Gets (as xml) the "Indirizzo" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo xgetIndirizzo();
        
        /**
         * Sets the "Indirizzo" attribute
         */
        void setIndirizzo(java.lang.String indirizzo);
        
        /**
         * Sets (as xml) the "Indirizzo" attribute
         */
        void xsetIndirizzo(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo indirizzo);
        
        /**
         * Gets the "Ubic_Corpo" attribute
         */
        java.lang.String getUbicCorpo();
        
        /**
         * Gets (as xml) the "Ubic_Corpo" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo xgetUbicCorpo();
        
        /**
         * True if has "Ubic_Corpo" attribute
         */
        boolean isSetUbicCorpo();
        
        /**
         * Sets the "Ubic_Corpo" attribute
         */
        void setUbicCorpo(java.lang.String ubicCorpo);
        
        /**
         * Sets (as xml) the "Ubic_Corpo" attribute
         */
        void xsetUbicCorpo(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo ubicCorpo);
        
        /**
         * Unsets the "Ubic_Corpo" attribute
         */
        void unsetUbicCorpo();
        
        /**
         * Gets the "Ubic_Ala" attribute
         */
        java.lang.String getUbicAla();
        
        /**
         * Gets (as xml) the "Ubic_Ala" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla xgetUbicAla();
        
        /**
         * True if has "Ubic_Ala" attribute
         */
        boolean isSetUbicAla();
        
        /**
         * Sets the "Ubic_Ala" attribute
         */
        void setUbicAla(java.lang.String ubicAla);
        
        /**
         * Sets (as xml) the "Ubic_Ala" attribute
         */
        void xsetUbicAla(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla ubicAla);
        
        /**
         * Unsets the "Ubic_Ala" attribute
         */
        void unsetUbicAla();
        
        /**
         * Gets the "Ubic_Piano" attribute
         */
        java.lang.String getUbicPiano();
        
        /**
         * Gets (as xml) the "Ubic_Piano" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano xgetUbicPiano();
        
        /**
         * True if has "Ubic_Piano" attribute
         */
        boolean isSetUbicPiano();
        
        /**
         * Sets the "Ubic_Piano" attribute
         */
        void setUbicPiano(java.lang.String ubicPiano);
        
        /**
         * Sets (as xml) the "Ubic_Piano" attribute
         */
        void xsetUbicPiano(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano ubicPiano);
        
        /**
         * Unsets the "Ubic_Piano" attribute
         */
        void unsetUbicPiano();
        
        /**
         * Gets the "Ubic_Stanza-Isola" attribute
         */
        java.lang.String getUbicStanzaIsola();
        
        /**
         * Gets (as xml) the "Ubic_Stanza-Isola" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola xgetUbicStanzaIsola();
        
        /**
         * True if has "Ubic_Stanza-Isola" attribute
         */
        boolean isSetUbicStanzaIsola();
        
        /**
         * Sets the "Ubic_Stanza-Isola" attribute
         */
        void setUbicStanzaIsola(java.lang.String ubicStanzaIsola);
        
        /**
         * Sets (as xml) the "Ubic_Stanza-Isola" attribute
         */
        void xsetUbicStanzaIsola(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola ubicStanzaIsola);
        
        /**
         * Unsets the "Ubic_Stanza-Isola" attribute
         */
        void unsetUbicStanzaIsola();
        
        /**
         * Gets the "TelSede" attribute
         */
        java.lang.String getTelSede();
        
        /**
         * Gets (as xml) the "TelSede" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede xgetTelSede();
        
        /**
         * True if has "TelSede" attribute
         */
        boolean isSetTelSede();
        
        /**
         * Sets the "TelSede" attribute
         */
        void setTelSede(java.lang.String telSede);
        
        /**
         * Sets (as xml) the "TelSede" attribute
         */
        void xsetTelSede(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede telSede);
        
        /**
         * Unsets the "TelSede" attribute
         */
        void unsetTelSede();
        
        /**
         * Gets the "IdFornitore" attribute
         */
        java.math.BigInteger getIdFornitore();
        
        /**
         * Gets (as xml) the "IdFornitore" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetIdFornitore();
        
        /**
         * Sets the "IdFornitore" attribute
         */
        void setIdFornitore(java.math.BigInteger idFornitore);
        
        /**
         * Sets (as xml) the "IdFornitore" attribute
         */
        void xsetIdFornitore(org.apache.xmlbeans.XmlInteger idFornitore);
        
        /**
         * Gets the "IdLotto" attribute
         */
        java.lang.String getIdLotto();
        
        /**
         * Gets (as xml) the "IdLotto" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto xgetIdLotto();
        
        /**
         * Sets the "IdLotto" attribute
         */
        void setIdLotto(java.lang.String idLotto);
        
        /**
         * Sets (as xml) the "IdLotto" attribute
         */
        void xsetIdLotto(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto idLotto);
        
        /**
         * Gets the "TGU_Connettivita" attribute
         */
        java.lang.String getTGUConnettivita();
        
        /**
         * Gets (as xml) the "TGU_Connettivita" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita xgetTGUConnettivita();
        
        /**
         * True if has "TGU_Connettivita" attribute
         */
        boolean isSetTGUConnettivita();
        
        /**
         * Sets the "TGU_Connettivita" attribute
         */
        void setTGUConnettivita(java.lang.String tguConnettivita);
        
        /**
         * Sets (as xml) the "TGU_Connettivita" attribute
         */
        void xsetTGUConnettivita(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita tguConnettivita);
        
        /**
         * Unsets the "TGU_Connettivita" attribute
         */
        void unsetTGUConnettivita();
        
        /**
         * Gets the "Stato" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato.Enum getStato();
        
        /**
         * Gets (as xml) the "Stato" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato xgetStato();
        
        /**
         * Sets the "Stato" attribute
         */
        void setStato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato.Enum stato);
        
        /**
         * Sets (as xml) the "Stato" attribute
         */
        void xsetStato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato stato);
        
        /**
         * Gets the "ConsistenzaDato" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato.Enum getConsistenzaDato();
        
        /**
         * Gets (as xml) the "ConsistenzaDato" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato xgetConsistenzaDato();
        
        /**
         * Sets the "ConsistenzaDato" attribute
         */
        void setConsistenzaDato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato.Enum consistenzaDato);
        
        /**
         * Sets (as xml) the "ConsistenzaDato" attribute
         */
        void xsetConsistenzaDato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato consistenzaDato);
        
        /**
         * Gets the "IdCliente" attribute
         */
        java.math.BigInteger getIdCliente();
        
        /**
         * Gets (as xml) the "IdCliente" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetIdCliente();
        
        /**
         * Sets the "IdCliente" attribute
         */
        void setIdCliente(java.math.BigInteger idCliente);
        
        /**
         * Sets (as xml) the "IdCliente" attribute
         */
        void xsetIdCliente(org.apache.xmlbeans.XmlInteger idCliente);
        
        /**
         * Gets the "IpGestione" attribute
         */
        java.lang.String getIpGestione();
        
        /**
         * Gets (as xml) the "IpGestione" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione xgetIpGestione();
        
        /**
         * True if has "IpGestione" attribute
         */
        boolean isSetIpGestione();
        
        /**
         * Sets the "IpGestione" attribute
         */
        void setIpGestione(java.lang.String ipGestione);
        
        /**
         * Sets (as xml) the "IpGestione" attribute
         */
        void xsetIpGestione(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione ipGestione);
        
        /**
         * Unsets the "IpGestione" attribute
         */
        void unsetIpGestione();
        
        /**
         * Gets the "IpPrivato" attribute
         */
        java.lang.String getIpPrivato();
        
        /**
         * Gets (as xml) the "IpPrivato" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato xgetIpPrivato();
        
        /**
         * True if has "IpPrivato" attribute
         */
        boolean isSetIpPrivato();
        
        /**
         * Sets the "IpPrivato" attribute
         */
        void setIpPrivato(java.lang.String ipPrivato);
        
        /**
         * Sets (as xml) the "IpPrivato" attribute
         */
        void xsetIpPrivato(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato ipPrivato);
        
        /**
         * Unsets the "IpPrivato" attribute
         */
        void unsetIpPrivato();
        
        /**
         * Gets the "Hostname" attribute
         */
        java.lang.String getHostname();
        
        /**
         * Gets (as xml) the "Hostname" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname xgetHostname();
        
        /**
         * True if has "Hostname" attribute
         */
        boolean isSetHostname();
        
        /**
         * Sets the "Hostname" attribute
         */
        void setHostname(java.lang.String hostname);
        
        /**
         * Sets (as xml) the "Hostname" attribute
         */
        void xsetHostname(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname hostname);
        
        /**
         * Unsets the "Hostname" attribute
         */
        void unsetHostname();
        
        /**
         * Gets the "TipoGettoneBase" attribute
         */
        java.lang.String getTipoGettoneBase();
        
        /**
         * Gets (as xml) the "TipoGettoneBase" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase xgetTipoGettoneBase();
        
        /**
         * Sets the "TipoGettoneBase" attribute
         */
        void setTipoGettoneBase(java.lang.String tipoGettoneBase);
        
        /**
         * Sets (as xml) the "TipoGettoneBase" attribute
         */
        void xsetTipoGettoneBase(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase tipoGettoneBase);
        
        /**
         * Gets the "GettoniBase" attribute
         */
        java.lang.String getGettoniBase();
        
        /**
         * Gets (as xml) the "GettoniBase" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase xgetGettoniBase();
        
        /**
         * Sets the "GettoniBase" attribute
         */
        void setGettoniBase(java.lang.String gettoniBase);
        
        /**
         * Sets (as xml) the "GettoniBase" attribute
         */
        void xsetGettoniBase(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase gettoniBase);
        
        /**
         * Gets the "GettoniBaseDispAsset" attribute
         */
        java.lang.String getGettoniBaseDispAsset();
        
        /**
         * Gets (as xml) the "GettoniBaseDispAsset" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset xgetGettoniBaseDispAsset();
        
        /**
         * True if has "GettoniBaseDispAsset" attribute
         */
        boolean isSetGettoniBaseDispAsset();
        
        /**
         * Sets the "GettoniBaseDispAsset" attribute
         */
        void setGettoniBaseDispAsset(java.lang.String gettoniBaseDispAsset);
        
        /**
         * Sets (as xml) the "GettoniBaseDispAsset" attribute
         */
        void xsetGettoniBaseDispAsset(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset gettoniBaseDispAsset);
        
        /**
         * Unsets the "GettoniBaseDispAsset" attribute
         */
        void unsetGettoniBaseDispAsset();
        
        /**
         * Gets the "TipoGettoneOpzionale" attribute
         */
        java.lang.String getTipoGettoneOpzionale();
        
        /**
         * Gets (as xml) the "TipoGettoneOpzionale" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale xgetTipoGettoneOpzionale();
        
        /**
         * Sets the "TipoGettoneOpzionale" attribute
         */
        void setTipoGettoneOpzionale(java.lang.String tipoGettoneOpzionale);
        
        /**
         * Sets (as xml) the "TipoGettoneOpzionale" attribute
         */
        void xsetTipoGettoneOpzionale(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale tipoGettoneOpzionale);
        
        /**
         * Gets the "GettoniOpz" attribute
         */
        java.lang.String getGettoniOpz();
        
        /**
         * Gets (as xml) the "GettoniOpz" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz xgetGettoniOpz();
        
        /**
         * Sets the "GettoniOpz" attribute
         */
        void setGettoniOpz(java.lang.String gettoniOpz);
        
        /**
         * Sets (as xml) the "GettoniOpz" attribute
         */
        void xsetGettoniOpz(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz gettoniOpz);
        
        /**
         * Gets the "GettoniOpzDispAsset" attribute
         */
        java.lang.String getGettoniOpzDispAsset();
        
        /**
         * Gets (as xml) the "GettoniOpzDispAsset" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset xgetGettoniOpzDispAsset();
        
        /**
         * True if has "GettoniOpzDispAsset" attribute
         */
        boolean isSetGettoniOpzDispAsset();
        
        /**
         * Sets the "GettoniOpzDispAsset" attribute
         */
        void setGettoniOpzDispAsset(java.lang.String gettoniOpzDispAsset);
        
        /**
         * Sets (as xml) the "GettoniOpzDispAsset" attribute
         */
        void xsetGettoniOpzDispAsset(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset gettoniOpzDispAsset);
        
        /**
         * Unsets the "GettoniOpzDispAsset" attribute
         */
        void unsetGettoniOpzDispAsset();
        
        /**
         * Gets the "TipoGettoneOpzionaleApp" attribute
         */
        java.lang.String getTipoGettoneOpzionaleApp();
        
        /**
         * Gets (as xml) the "TipoGettoneOpzionaleApp" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp xgetTipoGettoneOpzionaleApp();
        
        /**
         * Sets the "TipoGettoneOpzionaleApp" attribute
         */
        void setTipoGettoneOpzionaleApp(java.lang.String tipoGettoneOpzionaleApp);
        
        /**
         * Sets (as xml) the "TipoGettoneOpzionaleApp" attribute
         */
        void xsetTipoGettoneOpzionaleApp(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp tipoGettoneOpzionaleApp);
        
        /**
         * Gets the "GettoniOpzApp" attribute
         */
        java.lang.String getGettoniOpzApp();
        
        /**
         * Gets (as xml) the "GettoniOpzApp" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp xgetGettoniOpzApp();
        
        /**
         * Sets the "GettoniOpzApp" attribute
         */
        void setGettoniOpzApp(java.lang.String gettoniOpzApp);
        
        /**
         * Sets (as xml) the "GettoniOpzApp" attribute
         */
        void xsetGettoniOpzApp(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp gettoniOpzApp);
        
        /**
         * Gets the "GettoniOpzAppDispAsset" attribute
         */
        java.lang.String getGettoniOpzAppDispAsset();
        
        /**
         * Gets (as xml) the "GettoniOpzAppDispAsset" attribute
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset xgetGettoniOpzAppDispAsset();
        
        /**
         * True if has "GettoniOpzAppDispAsset" attribute
         */
        boolean isSetGettoniOpzAppDispAsset();
        
        /**
         * Sets the "GettoniOpzAppDispAsset" attribute
         */
        void setGettoniOpzAppDispAsset(java.lang.String gettoniOpzAppDispAsset);
        
        /**
         * Sets (as xml) the "GettoniOpzAppDispAsset" attribute
         */
        void xsetGettoniOpzAppDispAsset(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset gettoniOpzAppDispAsset);
        
        /**
         * Unsets the "GettoniOpzAppDispAsset" attribute
         */
        void unsetGettoniOpzAppDispAsset();
        
        /**
         * An XML ListaServizi(@).
         *
         * This is a complex type.
         */
        public interface ListaServizi extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListaServizi.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("listaservizide85elemtype");
            
            /**
             * Gets the "NomeServizio" attribute
             */
            java.lang.String getNomeServizio();
            
            /**
             * Gets (as xml) the "NomeServizio" attribute
             */
            it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio xgetNomeServizio();
            
            /**
             * Sets the "NomeServizio" attribute
             */
            void setNomeServizio(java.lang.String nomeServizio);
            
            /**
             * Sets (as xml) the "NomeServizio" attribute
             */
            void xsetNomeServizio(it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio nomeServizio);
            
            /**
             * Gets the "IdServizio" attribute
             */
            java.math.BigInteger getIdServizio();
            
            /**
             * Gets (as xml) the "IdServizio" attribute
             */
            org.apache.xmlbeans.XmlInteger xgetIdServizio();
            
            /**
             * Sets the "IdServizio" attribute
             */
            void setIdServizio(java.math.BigInteger idServizio);
            
            /**
             * Sets (as xml) the "IdServizio" attribute
             */
            void xsetIdServizio(org.apache.xmlbeans.XmlInteger idServizio);
            
            /**
             * An XML NomeServizio(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$ListaServizi$NomeServizio.
             */
            public interface NomeServizio extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NomeServizio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("nomeservizioc32battrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio newValue(java.lang.Object obj) {
                      return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio) type.newValue( obj ); }
                    
                    public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio newInstance() {
                      return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi.NomeServizio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ListaServizi) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML AssetNumber(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$AssetNumber.
         */
        public interface AssetNumber extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssetNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("assetnumber7acfattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.AssetNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Categoria(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Categoria.
         */
        public interface Categoria extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Categoria.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("categoriabf35attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Categoria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Tipologia(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Tipologia.
         */
        public interface Tipologia extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tipologia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("tipologia2ce0attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SD = Enum.forString("SD");
            static final Enum COMPONENTE_DI_SD = Enum.forString("componente di SD");
            
            static final int INT_SD = Enum.INT_SD;
            static final int INT_COMPONENTE_DI_SD = Enum.INT_COMPONENTE_DI_SD;
            
            /**
             * Enumeration value class for it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Tipologia.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SD
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_SD = 1;
                static final int INT_COMPONENTE_DI_SD = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("SD", INT_SD),
                      new Enum("componente di SD", INT_COMPONENTE_DI_SD),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Tipologia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML SerialNumber(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$SerialNumber.
         */
        public interface SerialNumber extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SerialNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("serialnumber5c53attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.SerialNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Marca(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Marca.
         */
        public interface Marca extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Marca.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("marcad1ccattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Marca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Modello(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Modello.
         */
        public interface Modello extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Modello.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("modello809cattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Modello) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML IPAddress(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IPAddress.
         */
        public interface IPAddress extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IPAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("ipaddress73bbattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IPAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Sede(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Sede.
         */
        public interface Sede extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sede.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("sedeca1dattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Sede) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Citta(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Citta.
         */
        public interface Citta extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Citta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("citta9fadattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Citta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Provincia(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Provincia.
         */
        public interface Provincia extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Provincia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("provinciab0fbattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Provincia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Indirizzo(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Indirizzo.
         */
        public interface Indirizzo extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Indirizzo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("indirizzo0bdaattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Indirizzo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Ubic_Corpo(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicCorpo.
         */
        public interface UbicCorpo extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UbicCorpo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("ubiccorpo2da3attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicCorpo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Ubic_Ala(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicAla.
         */
        public interface UbicAla extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UbicAla.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("ubicala33b2attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicAla) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Ubic_Piano(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicPiano.
         */
        public interface UbicPiano extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UbicPiano.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("ubicpiano00dfattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicPiano) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Ubic_Stanza-Isola(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$UbicStanzaIsola.
         */
        public interface UbicStanzaIsola extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UbicStanzaIsola.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("ubicstanzaisolabd0eattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.UbicStanzaIsola) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TelSede(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TelSede.
         */
        public interface TelSede extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TelSede.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("telsede4b3aattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TelSede) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML IdLotto(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IdLotto.
         */
        public interface IdLotto extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdLotto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("idlottoe0f7attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IdLotto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TGU_Connettivita(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TGUConnettivita.
         */
        public interface TGUConnettivita extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TGUConnettivita.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("tguconnettivitab4e3attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TGUConnettivita) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Stato(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Stato.
         */
        public interface Stato extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Stato.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("statofacdattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum INSTALLATO = Enum.forString("Installato");
            
            static final int INT_INSTALLATO = Enum.INT_INSTALLATO;
            
            /**
             * Enumeration value class for it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Stato.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INSTALLATO
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_INSTALLATO = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Installato", INT_INSTALLATO),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Stato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ConsistenzaDato(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$ConsistenzaDato.
         */
        public interface ConsistenzaDato extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsistenzaDato.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("consistenzadato2007attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PENDING = Enum.forString("Pending");
            static final Enum PENDING_SU_COMPONENTE_DI_2_LIVELLO = Enum.forString("Pending su componente di 2 livello");
            static final Enum AGGIORNATO = Enum.forString("Aggiornato");
            static final Enum DA_RICONCILIARE = Enum.forString("Da Riconciliare");
            
            static final int INT_PENDING = Enum.INT_PENDING;
            static final int INT_PENDING_SU_COMPONENTE_DI_2_LIVELLO = Enum.INT_PENDING_SU_COMPONENTE_DI_2_LIVELLO;
            static final int INT_AGGIORNATO = Enum.INT_AGGIORNATO;
            static final int INT_DA_RICONCILIARE = Enum.INT_DA_RICONCILIARE;
            
            /**
             * Enumeration value class for it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$ConsistenzaDato.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PENDING
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_PENDING = 1;
                static final int INT_PENDING_SU_COMPONENTE_DI_2_LIVELLO = 2;
                static final int INT_AGGIORNATO = 3;
                static final int INT_DA_RICONCILIARE = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Pending", INT_PENDING),
                      new Enum("Pending su componente di 2 livello", INT_PENDING_SU_COMPONENTE_DI_2_LIVELLO),
                      new Enum("Aggiornato", INT_AGGIORNATO),
                      new Enum("Da Riconciliare", INT_DA_RICONCILIARE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.ConsistenzaDato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML IpGestione(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IpGestione.
         */
        public interface IpGestione extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IpGestione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("ipgestionee78dattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpGestione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML IpPrivato(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$IpPrivato.
         */
        public interface IpPrivato extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IpPrivato.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("ipprivato19e2attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.IpPrivato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Hostname(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$Hostname.
         */
        public interface Hostname extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hostname.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("hostnamea63dattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.Hostname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TipoGettoneBase(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TipoGettoneBase.
         */
        public interface TipoGettoneBase extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoGettoneBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("tipogettonebase11c3attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GettoniBase(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniBase.
         */
        public interface GettoniBase extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GettoniBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("gettonibase64ebattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GettoniBaseDispAsset(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniBaseDispAsset.
         */
        public interface GettoniBaseDispAsset extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GettoniBaseDispAsset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("gettonibasedispasset86ffattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniBaseDispAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TipoGettoneOpzionale(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TipoGettoneOpzionale.
         */
        public interface TipoGettoneOpzionale extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoGettoneOpzionale.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("tipogettoneopzionale7ff9attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GettoniOpz(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpz.
         */
        public interface GettoniOpz extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GettoniOpz.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("gettoniopzbc63attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpz) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GettoniOpzDispAsset(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpzDispAsset.
         */
        public interface GettoniOpzDispAsset extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GettoniOpzDispAsset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("gettoniopzdispasset1687attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzDispAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TipoGettoneOpzionaleApp(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$TipoGettoneOpzionaleApp.
         */
        public interface TipoGettoneOpzionaleApp extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoGettoneOpzionaleApp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("tipogettoneopzionaleappde1eattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.TipoGettoneOpzionaleApp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GettoniOpzApp(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpzApp.
         */
        public interface GettoniOpzApp extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GettoniOpzApp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("gettoniopzapp5174attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzApp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML GettoniOpzAppDispAsset(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.GetListaAssetReturn$DatiAsset$GettoniOpzAppDispAsset.
         */
        public interface GettoniOpzAppDispAsset extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GettoniOpzAppDispAsset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("gettoniopzappdispasseta496attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset newInstance() {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset.GettoniOpzAppDispAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset newInstance() {
              return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn.DatiAsset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn newInstance() {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetReturn parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetReturn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
