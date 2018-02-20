/*
 * An XML document type.
 * Localname: errortype
 * Namespace: 
 * Java type: noNamespace.ErrortypeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one errortype(@) element.
 *
 * This is a complex type.
 */
public interface ErrortypeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrortypeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errortype8ce9doctype");
    
    /**
     * Gets the "errortype" element
     */
    noNamespace.ErrortypeDocument.Errortype getErrortype();
    
    /**
     * Sets the "errortype" element
     */
    void setErrortype(noNamespace.ErrortypeDocument.Errortype errortype);
    
    /**
     * Appends and returns a new empty "errortype" element
     */
    noNamespace.ErrortypeDocument.Errortype addNewErrortype();
    
    /**
     * An XML errortype(@).
     *
     * This is a complex type.
     */
    public interface Errortype extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errortype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errortype4ba7elemtype");
        
        /**
         * Gets array of all "errortype" elements
         */
        noNamespace.ErrortypeDocument.Errortype[] getErrortypeArray();
        
        /**
         * Gets ith "errortype" element
         */
        noNamespace.ErrortypeDocument.Errortype getErrortypeArray(int i);
        
        /**
         * Returns number of "errortype" element
         */
        int sizeOfErrortypeArray();
        
        /**
         * Sets array of all "errortype" element
         */
        void setErrortypeArray(noNamespace.ErrortypeDocument.Errortype[] errortypeArray);
        
        /**
         * Sets ith "errortype" element
         */
        void setErrortypeArray(int i, noNamespace.ErrortypeDocument.Errortype errortype);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "errortype" element
         */
        noNamespace.ErrortypeDocument.Errortype insertNewErrortype(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "errortype" element
         */
        noNamespace.ErrortypeDocument.Errortype addNewErrortype();
        
        /**
         * Removes the ith "errortype" element
         */
        void removeErrortype(int i);
        
        /**
         * Gets the "errortype" attribute
         */
        java.lang.String getErrortype2();
        
        /**
         * Gets (as xml) the "errortype" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrortype2();
        
        /**
         * True if has "errortype" attribute
         */
        boolean isSetErrortype2();
        
        /**
         * Sets the "errortype" attribute
         */
        void setErrortype2(java.lang.String errortype2);
        
        /**
         * Sets (as xml) the "errortype" attribute
         */
        void xsetErrortype2(org.apache.xmlbeans.XmlString errortype2);
        
        /**
         * Unsets the "errortype" attribute
         */
        void unsetErrortype2();
        
        /**
         * Gets the "errorcount" attribute
         */
        java.lang.String getErrorcount();
        
        /**
         * Gets (as xml) the "errorcount" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorcount();
        
        /**
         * True if has "errorcount" attribute
         */
        boolean isSetErrorcount();
        
        /**
         * Sets the "errorcount" attribute
         */
        void setErrorcount(java.lang.String errorcount);
        
        /**
         * Sets (as xml) the "errorcount" attribute
         */
        void xsetErrorcount(org.apache.xmlbeans.XmlString errorcount);
        
        /**
         * Unsets the "errorcount" attribute
         */
        void unsetErrorcount();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ErrortypeDocument.Errortype newInstance() {
              return (noNamespace.ErrortypeDocument.Errortype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ErrortypeDocument.Errortype newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ErrortypeDocument.Errortype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ErrortypeDocument newInstance() {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ErrortypeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ErrortypeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ErrortypeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ErrortypeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ErrortypeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ErrortypeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ErrortypeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ErrortypeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ErrortypeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ErrortypeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ErrortypeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ErrortypeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ErrortypeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ErrortypeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ErrortypeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ErrortypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ErrortypeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ErrortypeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
