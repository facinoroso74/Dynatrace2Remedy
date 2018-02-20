/*
 * XML Type:  ListaAsset_In_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ListaAssetInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp;


/**
 * An XML ListaAsset_In_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface ListaAssetInType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListaAssetInType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("listaassetintypee806type");
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType newInstance() {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.ListaAssetInType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.ListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
