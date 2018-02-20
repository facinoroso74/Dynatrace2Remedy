/*
 * An XML document type.
 * Localname: error
 * Namespace: 
 * Java type: noNamespace.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one error(@) element.
 *
 * This is a complex type.
 */
public interface ErrorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("error2d2fdoctype");
    
    /**
     * Gets the "error" element
     */
    noNamespace.ErrorDocument.Error getError();
    
    /**
     * Sets the "error" element
     */
    void setError(noNamespace.ErrorDocument.Error error);
    
    /**
     * Appends and returns a new empty "error" element
     */
    noNamespace.ErrorDocument.Error addNewError();
    
    /**
     * An XML error(@).
     *
     * This is a complex type.
     */
    public interface Error extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Error.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("error85b3elemtype");
        
        /**
         * Gets array of all "error" elements
         */
        noNamespace.ErrorDocument.Error[] getErrorArray();
        
        /**
         * Gets ith "error" element
         */
        noNamespace.ErrorDocument.Error getErrorArray(int i);
        
        /**
         * Returns number of "error" element
         */
        int sizeOfErrorArray();
        
        /**
         * Sets array of all "error" element
         */
        void setErrorArray(noNamespace.ErrorDocument.Error[] errorArray);
        
        /**
         * Sets ith "error" element
         */
        void setErrorArray(int i, noNamespace.ErrorDocument.Error error);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "error" element
         */
        noNamespace.ErrorDocument.Error insertNewError(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "error" element
         */
        noNamespace.ErrorDocument.Error addNewError();
        
        /**
         * Removes the ith "error" element
         */
        void removeError(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
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
         * Gets the "error_affected_transaction_count" attribute
         */
        java.lang.String getErrorAffectedTransactionCount();
        
        /**
         * Gets (as xml) the "error_affected_transaction_count" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorAffectedTransactionCount();
        
        /**
         * True if has "error_affected_transaction_count" attribute
         */
        boolean isSetErrorAffectedTransactionCount();
        
        /**
         * Sets the "error_affected_transaction_count" attribute
         */
        void setErrorAffectedTransactionCount(java.lang.String errorAffectedTransactionCount);
        
        /**
         * Sets (as xml) the "error_affected_transaction_count" attribute
         */
        void xsetErrorAffectedTransactionCount(org.apache.xmlbeans.XmlString errorAffectedTransactionCount);
        
        /**
         * Unsets the "error_affected_transaction_count" attribute
         */
        void unsetErrorAffectedTransactionCount();
        
        /**
         * Gets the "error_affected_pageaction_count" attribute
         */
        java.lang.String getErrorAffectedPageactionCount();
        
        /**
         * Gets (as xml) the "error_affected_pageaction_count" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorAffectedPageactionCount();
        
        /**
         * True if has "error_affected_pageaction_count" attribute
         */
        boolean isSetErrorAffectedPageactionCount();
        
        /**
         * Sets the "error_affected_pageaction_count" attribute
         */
        void setErrorAffectedPageactionCount(java.lang.String errorAffectedPageactionCount);
        
        /**
         * Sets (as xml) the "error_affected_pageaction_count" attribute
         */
        void xsetErrorAffectedPageactionCount(org.apache.xmlbeans.XmlString errorAffectedPageactionCount);
        
        /**
         * Unsets the "error_affected_pageaction_count" attribute
         */
        void unsetErrorAffectedPageactionCount();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ErrorDocument.Error newInstance() {
              return (noNamespace.ErrorDocument.Error) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ErrorDocument.Error newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ErrorDocument.Error) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ErrorDocument newInstance() {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ErrorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ErrorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ErrorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ErrorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ErrorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ErrorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ErrorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ErrorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ErrorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ErrorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ErrorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ErrorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ErrorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ErrorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ErrorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ErrorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ErrorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
