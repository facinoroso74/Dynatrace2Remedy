/*
 * An XML document type.
 * Localname: dynamicmeasurematrixrecord
 * Namespace: 
 * Java type: noNamespace.DynamicmeasurematrixrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one dynamicmeasurematrixrecord(@) element.
 *
 * This is a complex type.
 */
public interface DynamicmeasurematrixrecordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DynamicmeasurematrixrecordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("dynamicmeasurematrixrecord4c4adoctype");
    
    /**
     * Gets the "dynamicmeasurematrixrecord" element
     */
    noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecord();
    
    /**
     * Sets the "dynamicmeasurematrixrecord" element
     */
    void setDynamicmeasurematrixrecord(noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord);
    
    /**
     * Appends and returns a new empty "dynamicmeasurematrixrecord" element
     */
    noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord();
    
    /**
     * An XML dynamicmeasurematrixrecord(@).
     *
     * This is a complex type.
     */
    public interface Dynamicmeasurematrixrecord extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dynamicmeasurematrixrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("dynamicmeasurematrixrecord63cdelemtype");
        
        /**
         * Gets array of all "dynamicmeasurematrixrecord" elements
         */
        noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] getDynamicmeasurematrixrecordArray();
        
        /**
         * Gets ith "dynamicmeasurematrixrecord" element
         */
        noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecordArray(int i);
        
        /**
         * Returns number of "dynamicmeasurematrixrecord" element
         */
        int sizeOfDynamicmeasurematrixrecordArray();
        
        /**
         * Sets array of all "dynamicmeasurematrixrecord" element
         */
        void setDynamicmeasurematrixrecordArray(noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] dynamicmeasurematrixrecordArray);
        
        /**
         * Sets ith "dynamicmeasurematrixrecord" element
         */
        void setDynamicmeasurematrixrecordArray(int i, noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dynamicmeasurematrixrecord" element
         */
        noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord insertNewDynamicmeasurematrixrecord(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dynamicmeasurematrixrecord" element
         */
        noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord();
        
        /**
         * Removes the ith "dynamicmeasurematrixrecord" element
         */
        void removeDynamicmeasurematrixrecord(int i);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord newInstance() {
              return (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.DynamicmeasurematrixrecordDocument newInstance() {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DynamicmeasurematrixrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DynamicmeasurematrixrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
