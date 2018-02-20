/*
 * XML Type:  RichiestaCliCodFault
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface;


/**
 * An XML RichiestaCliCodFault(@RichiestaCliCodInterface.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface RichiestaCliCodFault extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RichiestaCliCodFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("richiestaclicodfaultd681type");
    
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
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione xgetTipoOperazione();
    
    /**
     * Sets the "TipoOperazione" element
     */
    void setTipoOperazione(java.lang.String tipoOperazione);
    
    /**
     * Sets (as xml) the "TipoOperazione" element
     */
    void xsetTipoOperazione(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione tipoOperazione);
    
    /**
     * Gets the "SysReq" element
     */
    java.lang.String getSysReq();
    
    /**
     * Gets (as xml) the "SysReq" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq xgetSysReq();
    
    /**
     * Sets the "SysReq" element
     */
    void setSysReq(java.lang.String sysReq);
    
    /**
     * Sets (as xml) the "SysReq" element
     */
    void xsetSysReq(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq sysReq);
    
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
     * Gets the "CodiceErrore" element
     */
    java.lang.String getCodiceErrore();
    
    /**
     * Gets (as xml) the "CodiceErrore" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore xgetCodiceErrore();
    
    /**
     * Sets the "CodiceErrore" element
     */
    void setCodiceErrore(java.lang.String codiceErrore);
    
    /**
     * Sets (as xml) the "CodiceErrore" element
     */
    void xsetCodiceErrore(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore codiceErrore);
    
    /**
     * Gets the "DescrizioneErrore" element
     */
    java.lang.String getDescrizioneErrore();
    
    /**
     * Gets (as xml) the "DescrizioneErrore" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore xgetDescrizioneErrore();
    
    /**
     * Sets the "DescrizioneErrore" element
     */
    void setDescrizioneErrore(java.lang.String descrizioneErrore);
    
    /**
     * Sets (as xml) the "DescrizioneErrore" element
     */
    void xsetDescrizioneErrore(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore descrizioneErrore);
    
    /**
     * An XML TipoOperazione(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$TipoOperazione.
     */
    public interface TipoOperazione extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TipoOperazione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("tipooperazioneec65elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.TipoOperazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML SysReq(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$SysReq.
     */
    public interface SysReq extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SysReq.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("sysreq5e3eelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.SysReq) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML CodiceErrore(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$CodiceErrore.
     */
    public interface CodiceErrore extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodiceErrore.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("codiceerroref27delemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.CodiceErrore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML DescrizioneErrore(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault$DescrizioneErrore.
     */
    public interface DescrizioneErrore extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescrizioneErrore.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("descrizioneerrorefa69elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault.DescrizioneErrore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault newInstance() {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
