/*
 * XML Type:  RichiestaCliCod_OutType
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface;


/**
 * An XML RichiestaCliCod_OutType(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface RichiestaCliCodOutType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RichiestaCliCodOutType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("richiestaclicodouttypeb50ctype");
    
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
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione xgetTipoOperazione();
    
    /**
     * Sets the "TipoOperazione" element
     */
    void setTipoOperazione(java.lang.String tipoOperazione);
    
    /**
     * Sets (as xml) the "TipoOperazione" element
     */
    void xsetTipoOperazione(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione tipoOperazione);
    
    /**
     * Gets the "SysReq" element
     */
    java.lang.String getSysReq();
    
    /**
     * Gets (as xml) the "SysReq" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq xgetSysReq();
    
    /**
     * Sets the "SysReq" element
     */
    void setSysReq(java.lang.String sysReq);
    
    /**
     * Sets (as xml) the "SysReq" element
     */
    void xsetSysReq(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq sysReq);
    
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
     * Gets the "NUM_CLI" element
     */
    java.lang.String getNUMCLI();
    
    /**
     * Gets (as xml) the "NUM_CLI" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI xgetNUMCLI();
    
    /**
     * True if has "NUM_CLI" element
     */
    boolean isSetNUMCLI();
    
    /**
     * Sets the "NUM_CLI" element
     */
    void setNUMCLI(java.lang.String numcli);
    
    /**
     * Sets (as xml) the "NUM_CLI" element
     */
    void xsetNUMCLI(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI numcli);
    
    /**
     * Unsets the "NUM_CLI" element
     */
    void unsetNUMCLI();
    
    /**
     * Gets the "NUM_CLI_COD" element
     */
    java.lang.String getNUMCLICOD();
    
    /**
     * Gets (as xml) the "NUM_CLI_COD" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD xgetNUMCLICOD();
    
    /**
     * Sets the "NUM_CLI_COD" element
     */
    void setNUMCLICOD(java.lang.String numclicod);
    
    /**
     * Sets (as xml) the "NUM_CLI_COD" element
     */
    void xsetNUMCLICOD(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD numclicod);
    
    /**
     * Gets array of all "ClientiTrovati" elements
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType[] getClientiTrovatiArray();
    
    /**
     * Gets ith "ClientiTrovati" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType getClientiTrovatiArray(int i);
    
    /**
     * Returns number of "ClientiTrovati" element
     */
    int sizeOfClientiTrovatiArray();
    
    /**
     * Sets array of all "ClientiTrovati" element
     */
    void setClientiTrovatiArray(it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType[] clientiTrovatiArray);
    
    /**
     * Sets ith "ClientiTrovati" element
     */
    void setClientiTrovatiArray(int i, it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType clientiTrovati);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientiTrovati" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType insertNewClientiTrovati(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClientiTrovati" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.ClientiTrovatiType addNewClientiTrovati();
    
    /**
     * Removes the ith "ClientiTrovati" element
     */
    void removeClientiTrovati(int i);
    
    /**
     * An XML TipoOperazione(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$TipoOperazione.
     */
    public interface TipoOperazione extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoOperazione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("tipooperazione24a8elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.TipoOperazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SysReq(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$SysReq.
     */
    public interface SysReq extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SysReq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("sysreqb82felemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.SysReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML NUM_CLI(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$NUMCLI.
     */
    public interface NUMCLI extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NUMCLI.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("numcli3589elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLI) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML NUM_CLI_COD(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType$NUMCLICOD.
     */
    public interface NUMCLICOD extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NUMCLICOD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("numclicodfb50elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType.NUMCLICOD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType newInstance() {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
