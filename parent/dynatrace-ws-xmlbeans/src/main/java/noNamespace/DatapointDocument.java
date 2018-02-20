/*
 * An XML document type.
 * Localname: datapoint
 * Namespace: 
 * Java type: noNamespace.DatapointDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one datapoint(@) element.
 *
 * This is a complex type.
 */
public interface DatapointDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatapointDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("datapoint0fcddoctype");
    
    /**
     * Gets the "datapoint" element
     */
    noNamespace.DatapointDocument.Datapoint getDatapoint();
    
    /**
     * Sets the "datapoint" element
     */
    void setDatapoint(noNamespace.DatapointDocument.Datapoint datapoint);
    
    /**
     * Appends and returns a new empty "datapoint" element
     */
    noNamespace.DatapointDocument.Datapoint addNewDatapoint();
    
    /**
     * An XML datapoint(@).
     *
     * This is a complex type.
     */
    public interface Datapoint extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Datapoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("datapoint1b6felemtype");
        
        /**
         * Gets array of all "datapoint" elements
         */
        noNamespace.DatapointDocument.Datapoint[] getDatapointArray();
        
        /**
         * Gets ith "datapoint" element
         */
        noNamespace.DatapointDocument.Datapoint getDatapointArray(int i);
        
        /**
         * Returns number of "datapoint" element
         */
        int sizeOfDatapointArray();
        
        /**
         * Sets array of all "datapoint" element
         */
        void setDatapointArray(noNamespace.DatapointDocument.Datapoint[] datapointArray);
        
        /**
         * Sets ith "datapoint" element
         */
        void setDatapointArray(int i, noNamespace.DatapointDocument.Datapoint datapoint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "datapoint" element
         */
        noNamespace.DatapointDocument.Datapoint insertNewDatapoint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "datapoint" element
         */
        noNamespace.DatapointDocument.Datapoint addNewDatapoint();
        
        /**
         * Removes the ith "datapoint" element
         */
        void removeDatapoint(int i);
        
        /**
         * Gets the "country" attribute
         */
        java.lang.String getCountry();
        
        /**
         * Gets (as xml) the "country" attribute
         */
        org.apache.xmlbeans.XmlString xgetCountry();
        
        /**
         * True if has "country" attribute
         */
        boolean isSetCountry();
        
        /**
         * Sets the "country" attribute
         */
        void setCountry(java.lang.String country);
        
        /**
         * Sets (as xml) the "country" attribute
         */
        void xsetCountry(org.apache.xmlbeans.XmlString country);
        
        /**
         * Unsets the "country" attribute
         */
        void unsetCountry();
        
        /**
         * Gets the "total" attribute
         */
        java.math.BigInteger getTotal();
        
        /**
         * Gets (as xml) the "total" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetTotal();
        
        /**
         * True if has "total" attribute
         */
        boolean isSetTotal();
        
        /**
         * Sets the "total" attribute
         */
        void setTotal(java.math.BigInteger total);
        
        /**
         * Sets (as xml) the "total" attribute
         */
        void xsetTotal(org.apache.xmlbeans.XmlInteger total);
        
        /**
         * Unsets the "total" attribute
         */
        void unsetTotal();
        
        /**
         * Gets the "satisfied" attribute
         */
        java.math.BigInteger getSatisfied();
        
        /**
         * Gets (as xml) the "satisfied" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSatisfied();
        
        /**
         * True if has "satisfied" attribute
         */
        boolean isSetSatisfied();
        
        /**
         * Sets the "satisfied" attribute
         */
        void setSatisfied(java.math.BigInteger satisfied);
        
        /**
         * Sets (as xml) the "satisfied" attribute
         */
        void xsetSatisfied(org.apache.xmlbeans.XmlInteger satisfied);
        
        /**
         * Unsets the "satisfied" attribute
         */
        void unsetSatisfied();
        
        /**
         * Gets the "tolerating" attribute
         */
        java.math.BigInteger getTolerating();
        
        /**
         * Gets (as xml) the "tolerating" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetTolerating();
        
        /**
         * True if has "tolerating" attribute
         */
        boolean isSetTolerating();
        
        /**
         * Sets the "tolerating" attribute
         */
        void setTolerating(java.math.BigInteger tolerating);
        
        /**
         * Sets (as xml) the "tolerating" attribute
         */
        void xsetTolerating(org.apache.xmlbeans.XmlInteger tolerating);
        
        /**
         * Unsets the "tolerating" attribute
         */
        void unsetTolerating();
        
        /**
         * Gets the "frustrated" attribute
         */
        java.math.BigInteger getFrustrated();
        
        /**
         * Gets (as xml) the "frustrated" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetFrustrated();
        
        /**
         * True if has "frustrated" attribute
         */
        boolean isSetFrustrated();
        
        /**
         * Sets the "frustrated" attribute
         */
        void setFrustrated(java.math.BigInteger frustrated);
        
        /**
         * Sets (as xml) the "frustrated" attribute
         */
        void xsetFrustrated(org.apache.xmlbeans.XmlInteger frustrated);
        
        /**
         * Unsets the "frustrated" attribute
         */
        void unsetFrustrated();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.DatapointDocument.Datapoint newInstance() {
              return (noNamespace.DatapointDocument.Datapoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.DatapointDocument.Datapoint newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.DatapointDocument.Datapoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.DatapointDocument newInstance() {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.DatapointDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.DatapointDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.DatapointDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.DatapointDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.DatapointDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.DatapointDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.DatapointDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.DatapointDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.DatapointDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.DatapointDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.DatapointDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.DatapointDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.DatapointDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.DatapointDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.DatapointDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DatapointDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DatapointDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DatapointDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
