/*
 * XML Type:  RichiestaCliCod_InType
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface;


/**
 * An XML RichiestaCliCod_InType(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface RichiestaCliCodInType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RichiestaCliCodInType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("richiestaclicodintypee505type");
    
    /**
     * Gets the "IdRichiesta" element
     */
    int getIdRichiesta();
    
    /**
     * Gets (as xml) the "IdRichiesta" element
     */
    org.apache.xmlbeans.XmlInt xgetIdRichiesta();
    
    /**
     * Sets the "IdRichiesta" element
     */
    void setIdRichiesta(int idRichiesta);
    
    /**
     * Sets (as xml) the "IdRichiesta" element
     */
    void xsetIdRichiesta(org.apache.xmlbeans.XmlInt idRichiesta);
    
    /**
     * Gets the "TipoOperazione" element
     */
    java.lang.String getTipoOperazione();
    
    /**
     * Gets (as xml) the "TipoOperazione" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione xgetTipoOperazione();
    
    /**
     * Sets the "TipoOperazione" element
     */
    void setTipoOperazione(java.lang.String tipoOperazione);
    
    /**
     * Sets (as xml) the "TipoOperazione" element
     */
    void xsetTipoOperazione(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione tipoOperazione);
    
    /**
     * Gets the "SysReq" element
     */
    java.lang.String getSysReq();
    
    /**
     * Gets (as xml) the "SysReq" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq xgetSysReq();
    
    /**
     * Sets the "SysReq" element
     */
    void setSysReq(java.lang.String sysReq);
    
    /**
     * Sets (as xml) the "SysReq" element
     */
    void xsetSysReq(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq sysReq);
    
    /**
     * Gets the "DataOperazione" element
     */
    java.util.Calendar getDataOperazione();
    
    /**
     * Gets (as xml) the "DataOperazione" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataOperazione();
    
    /**
     * Sets the "DataOperazione" element
     */
    void setDataOperazione(java.util.Calendar dataOperazione);
    
    /**
     * Sets (as xml) the "DataOperazione" element
     */
    void xsetDataOperazione(org.apache.xmlbeans.XmlDateTime dataOperazione);
    
    /**
     * Gets the "CUSTOMER_ID" element
     */
    java.lang.String getCUSTOMERID();
    
    /**
     * Gets (as xml) the "CUSTOMER_ID" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID xgetCUSTOMERID();
    
    /**
     * True if has "CUSTOMER_ID" element
     */
    boolean isSetCUSTOMERID();
    
    /**
     * Sets the "CUSTOMER_ID" element
     */
    void setCUSTOMERID(java.lang.String customerid);
    
    /**
     * Sets (as xml) the "CUSTOMER_ID" element
     */
    void xsetCUSTOMERID(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID customerid);
    
    /**
     * Unsets the "CUSTOMER_ID" element
     */
    void unsetCUSTOMERID();
    
    /**
     * Gets the "CODFISCALE" element
     */
    java.lang.String getCODFISCALE();
    
    /**
     * Gets (as xml) the "CODFISCALE" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE xgetCODFISCALE();
    
    /**
     * True if has "CODFISCALE" element
     */
    boolean isSetCODFISCALE();
    
    /**
     * Sets the "CODFISCALE" element
     */
    void setCODFISCALE(java.lang.String codfiscale);
    
    /**
     * Sets (as xml) the "CODFISCALE" element
     */
    void xsetCODFISCALE(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE codfiscale);
    
    /**
     * Unsets the "CODFISCALE" element
     */
    void unsetCODFISCALE();
    
    /**
     * Gets the "DataInizio" element
     */
    java.util.Calendar getDataInizio();
    
    /**
     * Gets (as xml) the "DataInizio" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataInizio();
    
    /**
     * True if has "DataInizio" element
     */
    boolean isSetDataInizio();
    
    /**
     * Sets the "DataInizio" element
     */
    void setDataInizio(java.util.Calendar dataInizio);
    
    /**
     * Sets (as xml) the "DataInizio" element
     */
    void xsetDataInizio(org.apache.xmlbeans.XmlDateTime dataInizio);
    
    /**
     * Unsets the "DataInizio" element
     */
    void unsetDataInizio();
    
    /**
     * Gets the "DataFine" element
     */
    java.util.Calendar getDataFine();
    
    /**
     * Gets (as xml) the "DataFine" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataFine();
    
    /**
     * True if has "DataFine" element
     */
    boolean isSetDataFine();
    
    /**
     * Sets the "DataFine" element
     */
    void setDataFine(java.util.Calendar dataFine);
    
    /**
     * Sets (as xml) the "DataFine" element
     */
    void xsetDataFine(org.apache.xmlbeans.XmlDateTime dataFine);
    
    /**
     * Unsets the "DataFine" element
     */
    void unsetDataFine();
    
    /**
     * An XML TipoOperazione(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$TipoOperazione.
     */
    public interface TipoOperazione extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoOperazione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("tipooperazione11e9elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.TipoOperazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SysReq(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$SysReq.
     */
    public interface SysReq extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SysReq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("sysreq7182elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.SysReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML CUSTOMER_ID(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$CUSTOMERID.
     */
    public interface CUSTOMERID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CUSTOMERID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("customerid949delemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CUSTOMERID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML CODFISCALE(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType$CODFISCALE.
     */
    public interface CODFISCALE extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CODFISCALE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("codfiscale6c40elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType.CODFISCALE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType newInstance() {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
