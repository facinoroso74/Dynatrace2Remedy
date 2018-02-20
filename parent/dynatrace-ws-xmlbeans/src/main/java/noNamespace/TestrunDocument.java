/*
 * An XML document type.
 * Localname: testrun
 * Namespace: 
 * Java type: noNamespace.TestrunDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one testrun(@) element.
 *
 * This is a complex type.
 */
public interface TestrunDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestrunDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testrun8220doctype");
    
    /**
     * Gets the "testrun" element
     */
    noNamespace.TestrunDocument.Testrun getTestrun();
    
    /**
     * Sets the "testrun" element
     */
    void setTestrun(noNamespace.TestrunDocument.Testrun testrun);
    
    /**
     * Appends and returns a new empty "testrun" element
     */
    noNamespace.TestrunDocument.Testrun addNewTestrun();
    
    /**
     * An XML testrun(@).
     *
     * This is a complex type.
     */
    public interface Testrun extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testrun.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testrun2515elemtype");
        
        /**
         * Gets array of all "testrun" elements
         */
        noNamespace.TestrunDocument.Testrun[] getTestrunArray();
        
        /**
         * Gets ith "testrun" element
         */
        noNamespace.TestrunDocument.Testrun getTestrunArray(int i);
        
        /**
         * Returns number of "testrun" element
         */
        int sizeOfTestrunArray();
        
        /**
         * Sets array of all "testrun" element
         */
        void setTestrunArray(noNamespace.TestrunDocument.Testrun[] testrunArray);
        
        /**
         * Sets ith "testrun" element
         */
        void setTestrunArray(int i, noNamespace.TestrunDocument.Testrun testrun);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testrun" element
         */
        noNamespace.TestrunDocument.Testrun insertNewTestrun(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testrun" element
         */
        noNamespace.TestrunDocument.Testrun addNewTestrun();
        
        /**
         * Removes the ith "testrun" element
         */
        void removeTestrun(int i);
        
        /**
         * Gets the "timestamp" attribute
         */
        java.util.Calendar getTimestamp();
        
        /**
         * Gets (as xml) the "timestamp" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetTimestamp();
        
        /**
         * True if has "timestamp" attribute
         */
        boolean isSetTimestamp();
        
        /**
         * Sets the "timestamp" attribute
         */
        void setTimestamp(java.util.Calendar timestamp);
        
        /**
         * Sets (as xml) the "timestamp" attribute
         */
        void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp);
        
        /**
         * Unsets the "timestamp" attribute
         */
        void unsetTimestamp();
        
        /**
         * Gets the "value" attribute
         */
        double getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(double value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlDouble value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * Gets the "failed" attribute
         */
        java.lang.String getFailed();
        
        /**
         * Gets (as xml) the "failed" attribute
         */
        org.apache.xmlbeans.XmlString xgetFailed();
        
        /**
         * True if has "failed" attribute
         */
        boolean isSetFailed();
        
        /**
         * Sets the "failed" attribute
         */
        void setFailed(java.lang.String failed);
        
        /**
         * Sets (as xml) the "failed" attribute
         */
        void xsetFailed(org.apache.xmlbeans.XmlString failed);
        
        /**
         * Unsets the "failed" attribute
         */
        void unsetFailed();
        
        /**
         * Gets the "testruninfo" attribute
         */
        java.lang.String getTestruninfo();
        
        /**
         * Gets (as xml) the "testruninfo" attribute
         */
        org.apache.xmlbeans.XmlString xgetTestruninfo();
        
        /**
         * True if has "testruninfo" attribute
         */
        boolean isSetTestruninfo();
        
        /**
         * Sets the "testruninfo" attribute
         */
        void setTestruninfo(java.lang.String testruninfo);
        
        /**
         * Sets (as xml) the "testruninfo" attribute
         */
        void xsetTestruninfo(org.apache.xmlbeans.XmlString testruninfo);
        
        /**
         * Unsets the "testruninfo" attribute
         */
        void unsetTestruninfo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.TestrunDocument.Testrun newInstance() {
              return (noNamespace.TestrunDocument.Testrun) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.TestrunDocument.Testrun newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.TestrunDocument.Testrun) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.TestrunDocument newInstance() {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.TestrunDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.TestrunDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.TestrunDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.TestrunDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.TestrunDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.TestrunDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.TestrunDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.TestrunDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.TestrunDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.TestrunDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.TestrunDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.TestrunDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.TestrunDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.TestrunDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.TestrunDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TestrunDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TestrunDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TestrunDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
