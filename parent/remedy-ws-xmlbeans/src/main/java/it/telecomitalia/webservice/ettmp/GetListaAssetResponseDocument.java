/*
 * An XML document type.
 * Localname: get_ListaAssetResponse
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp;


/**
 * A document containing one get_ListaAssetResponse(@ettmp.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public interface GetListaAssetResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListaAssetResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("getlistaassetresponsecb6bdoctype");
    
    /**
     * Gets the "get_ListaAssetResponse" element
     */
    it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse getGetListaAssetResponse();
    
    /**
     * Sets the "get_ListaAssetResponse" element
     */
    void setGetListaAssetResponse(it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse getListaAssetResponse);
    
    /**
     * Appends and returns a new empty "get_ListaAssetResponse" element
     */
    it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse addNewGetListaAssetResponse();
    
    /**
     * An XML get_ListaAssetResponse(@ettmp.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public interface GetListaAssetResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListaAssetResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("getlistaassetresponsec0b8elemtype");
        
        /**
         * Gets the "get_ListaAssetReturn" element
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn getGetListaAssetReturn();
        
        /**
         * Sets the "get_ListaAssetReturn" element
         */
        void setGetListaAssetReturn(it.telecomitalia.webservice.ettmp.GetListaAssetReturn getListaAssetReturn);
        
        /**
         * Appends and returns a new empty "get_ListaAssetReturn" element
         */
        it.telecomitalia.webservice.ettmp.GetListaAssetReturn addNewGetListaAssetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse newInstance() {
              return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument.GetListaAssetResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument newInstance() {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.GetListaAssetResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}