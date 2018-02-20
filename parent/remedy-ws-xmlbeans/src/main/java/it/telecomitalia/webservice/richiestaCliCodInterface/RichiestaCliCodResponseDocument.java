/*
 * An XML document type.
 * Localname: RichiestaCliCodResponse
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface;


/**
 * A document containing one RichiestaCliCodResponse(@RichiestaCliCodInterface.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public interface RichiestaCliCodResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RichiestaCliCodResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("richiestaclicodresponse5c04doctype");
    
    /**
     * Gets the "RichiestaCliCodResponse" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse getRichiestaCliCodResponse();
    
    /**
     * Sets the "RichiestaCliCodResponse" element
     */
    void setRichiestaCliCodResponse(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse richiestaCliCodResponse);
    
    /**
     * Appends and returns a new empty "RichiestaCliCodResponse" element
     */
    it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse addNewRichiestaCliCodResponse();
    
    /**
     * An XML RichiestaCliCodResponse(@RichiestaCliCodInterface.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public interface RichiestaCliCodResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RichiestaCliCodResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s283687F27391F1364BA8658ED04D1A34").resolveHandle("richiestaclicodresponse9937elemtype");
        
        /**
         * Gets the "RichiestaCliCodOUT" element
         */
        it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType getRichiestaCliCodOUT();
        
        /**
         * True if has "RichiestaCliCodOUT" element
         */
        boolean isSetRichiestaCliCodOUT();
        
        /**
         * Sets the "RichiestaCliCodOUT" element
         */
        void setRichiestaCliCodOUT(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType richiestaCliCodOUT);
        
        /**
         * Appends and returns a new empty "RichiestaCliCodOUT" element
         */
        it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType addNewRichiestaCliCodOUT();
        
        /**
         * Unsets the "RichiestaCliCodOUT" element
         */
        void unsetRichiestaCliCodOUT();
        
        /**
         * Gets the "RichiestaCliCodFault" element
         */
        it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault getRichiestaCliCodFault();
        
        /**
         * True if has "RichiestaCliCodFault" element
         */
        boolean isSetRichiestaCliCodFault();
        
        /**
         * Sets the "RichiestaCliCodFault" element
         */
        void setRichiestaCliCodFault(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault richiestaCliCodFault);
        
        /**
         * Appends and returns a new empty "RichiestaCliCodFault" element
         */
        it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault addNewRichiestaCliCodFault();
        
        /**
         * Unsets the "RichiestaCliCodFault" element
         */
        void unsetRichiestaCliCodFault();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse newInstance() {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument newInstance() {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
