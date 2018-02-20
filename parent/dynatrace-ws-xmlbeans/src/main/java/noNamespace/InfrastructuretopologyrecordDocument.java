/*
 * An XML document type.
 * Localname: infrastructuretopologyrecord
 * Namespace: 
 * Java type: noNamespace.InfrastructuretopologyrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one infrastructuretopologyrecord(@) element.
 *
 * This is a complex type.
 */
public interface InfrastructuretopologyrecordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InfrastructuretopologyrecordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("infrastructuretopologyrecord54dcdoctype");
    
    /**
     * Gets the "infrastructuretopologyrecord" element
     */
    noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord getInfrastructuretopologyrecord();
    
    /**
     * Sets the "infrastructuretopologyrecord" element
     */
    void setInfrastructuretopologyrecord(noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord infrastructuretopologyrecord);
    
    /**
     * Appends and returns a new empty "infrastructuretopologyrecord" element
     */
    noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord addNewInfrastructuretopologyrecord();
    
    /**
     * An XML infrastructuretopologyrecord(@).
     *
     * This is a complex type.
     */
    public interface Infrastructuretopologyrecord extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Infrastructuretopologyrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("infrastructuretopologyrecord0c8delemtype");
        
        /**
         * Gets array of all "infrastructuretopologyrecord" elements
         */
        noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] getInfrastructuretopologyrecordArray();
        
        /**
         * Gets ith "infrastructuretopologyrecord" element
         */
        noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord getInfrastructuretopologyrecordArray(int i);
        
        /**
         * Returns number of "infrastructuretopologyrecord" element
         */
        int sizeOfInfrastructuretopologyrecordArray();
        
        /**
         * Sets array of all "infrastructuretopologyrecord" element
         */
        void setInfrastructuretopologyrecordArray(noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] infrastructuretopologyrecordArray);
        
        /**
         * Sets ith "infrastructuretopologyrecord" element
         */
        void setInfrastructuretopologyrecordArray(int i, noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord infrastructuretopologyrecord);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "infrastructuretopologyrecord" element
         */
        noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord insertNewInfrastructuretopologyrecord(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "infrastructuretopologyrecord" element
         */
        noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord addNewInfrastructuretopologyrecord();
        
        /**
         * Removes the ith "infrastructuretopologyrecord" element
         */
        void removeInfrastructuretopologyrecord(int i);
        
        /**
         * Gets the "structure" attribute
         */
        java.lang.String getStructure();
        
        /**
         * Gets (as xml) the "structure" attribute
         */
        org.apache.xmlbeans.XmlString xgetStructure();
        
        /**
         * True if has "structure" attribute
         */
        boolean isSetStructure();
        
        /**
         * Sets the "structure" attribute
         */
        void setStructure(java.lang.String structure);
        
        /**
         * Sets (as xml) the "structure" attribute
         */
        void xsetStructure(org.apache.xmlbeans.XmlString structure);
        
        /**
         * Unsets the "structure" attribute
         */
        void unsetStructure();
        
        /**
         * Gets the "healthhistory" attribute
         */
        java.lang.String getHealthhistory();
        
        /**
         * Gets (as xml) the "healthhistory" attribute
         */
        org.apache.xmlbeans.XmlString xgetHealthhistory();
        
        /**
         * True if has "healthhistory" attribute
         */
        boolean isSetHealthhistory();
        
        /**
         * Sets the "healthhistory" attribute
         */
        void setHealthhistory(java.lang.String healthhistory);
        
        /**
         * Sets (as xml) the "healthhistory" attribute
         */
        void xsetHealthhistory(org.apache.xmlbeans.XmlString healthhistory);
        
        /**
         * Unsets the "healthhistory" attribute
         */
        void unsetHealthhistory();
        
        /**
         * Gets the "details" attribute
         */
        java.lang.String getDetails();
        
        /**
         * Gets (as xml) the "details" attribute
         */
        org.apache.xmlbeans.XmlString xgetDetails();
        
        /**
         * True if has "details" attribute
         */
        boolean isSetDetails();
        
        /**
         * Sets the "details" attribute
         */
        void setDetails(java.lang.String details);
        
        /**
         * Sets (as xml) the "details" attribute
         */
        void xsetDetails(org.apache.xmlbeans.XmlString details);
        
        /**
         * Unsets the "details" attribute
         */
        void unsetDetails();
        
        /**
         * Gets the "status" attribute
         */
        java.lang.String getStatus();
        
        /**
         * Gets (as xml) the "status" attribute
         */
        org.apache.xmlbeans.XmlString xgetStatus();
        
        /**
         * True if has "status" attribute
         */
        boolean isSetStatus();
        
        /**
         * Sets the "status" attribute
         */
        void setStatus(java.lang.String status);
        
        /**
         * Sets (as xml) the "status" attribute
         */
        void xsetStatus(org.apache.xmlbeans.XmlString status);
        
        /**
         * Unsets the "status" attribute
         */
        void unsetStatus();
        
        /**
         * Gets the "assignees" attribute
         */
        java.lang.String getAssignees();
        
        /**
         * Gets (as xml) the "assignees" attribute
         */
        org.apache.xmlbeans.XmlString xgetAssignees();
        
        /**
         * True if has "assignees" attribute
         */
        boolean isSetAssignees();
        
        /**
         * Sets the "assignees" attribute
         */
        void setAssignees(java.lang.String assignees);
        
        /**
         * Sets (as xml) the "assignees" attribute
         */
        void xsetAssignees(org.apache.xmlbeans.XmlString assignees);
        
        /**
         * Unsets the "assignees" attribute
         */
        void unsetAssignees();
        
        /**
         * Gets the "labels" attribute
         */
        java.lang.String getLabels();
        
        /**
         * Gets (as xml) the "labels" attribute
         */
        org.apache.xmlbeans.XmlString xgetLabels();
        
        /**
         * True if has "labels" attribute
         */
        boolean isSetLabels();
        
        /**
         * Sets the "labels" attribute
         */
        void setLabels(java.lang.String labels);
        
        /**
         * Sets (as xml) the "labels" attribute
         */
        void xsetLabels(org.apache.xmlbeans.XmlString labels);
        
        /**
         * Unsets the "labels" attribute
         */
        void unsetLabels();
        
        /**
         * Gets the "os" attribute
         */
        java.lang.String getOs();
        
        /**
         * Gets (as xml) the "os" attribute
         */
        org.apache.xmlbeans.XmlString xgetOs();
        
        /**
         * True if has "os" attribute
         */
        boolean isSetOs();
        
        /**
         * Sets the "os" attribute
         */
        void setOs(java.lang.String os);
        
        /**
         * Sets (as xml) the "os" attribute
         */
        void xsetOs(org.apache.xmlbeans.XmlString os);
        
        /**
         * Unsets the "os" attribute
         */
        void unsetOs();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord newInstance() {
              return (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.InfrastructuretopologyrecordDocument newInstance() {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.InfrastructuretopologyrecordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.InfrastructuretopologyrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.InfrastructuretopologyrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.InfrastructuretopologyrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
