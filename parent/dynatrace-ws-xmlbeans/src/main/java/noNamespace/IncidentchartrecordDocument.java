/*
 * An XML document type.
 * Localname: incidentchartrecord
 * Namespace: 
 * Java type: noNamespace.IncidentchartrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one incidentchartrecord(@) element.
 *
 * This is a complex type.
 */
public interface IncidentchartrecordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentchartrecordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("incidentchartrecord9484doctype");
    
    /**
     * Gets the "incidentchartrecord" element
     */
    noNamespace.IncidentchartrecordDocument.Incidentchartrecord getIncidentchartrecord();
    
    /**
     * Sets the "incidentchartrecord" element
     */
    void setIncidentchartrecord(noNamespace.IncidentchartrecordDocument.Incidentchartrecord incidentchartrecord);
    
    /**
     * Appends and returns a new empty "incidentchartrecord" element
     */
    noNamespace.IncidentchartrecordDocument.Incidentchartrecord addNewIncidentchartrecord();
    
    /**
     * An XML incidentchartrecord(@).
     *
     * This is a complex type.
     */
    public interface Incidentchartrecord extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Incidentchartrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("incidentchartrecordedddelemtype");
        
        /**
         * Gets array of all "incidentchartrecord" elements
         */
        noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] getIncidentchartrecordArray();
        
        /**
         * Gets ith "incidentchartrecord" element
         */
        noNamespace.IncidentchartrecordDocument.Incidentchartrecord getIncidentchartrecordArray(int i);
        
        /**
         * Returns number of "incidentchartrecord" element
         */
        int sizeOfIncidentchartrecordArray();
        
        /**
         * Sets array of all "incidentchartrecord" element
         */
        void setIncidentchartrecordArray(noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] incidentchartrecordArray);
        
        /**
         * Sets ith "incidentchartrecord" element
         */
        void setIncidentchartrecordArray(int i, noNamespace.IncidentchartrecordDocument.Incidentchartrecord incidentchartrecord);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "incidentchartrecord" element
         */
        noNamespace.IncidentchartrecordDocument.Incidentchartrecord insertNewIncidentchartrecord(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "incidentchartrecord" element
         */
        noNamespace.IncidentchartrecordDocument.Incidentchartrecord addNewIncidentchartrecord();
        
        /**
         * Removes the ith "incidentchartrecord" element
         */
        void removeIncidentchartrecord(int i);
        
        /**
         * Gets the "rule" attribute
         */
        java.lang.String getRule();
        
        /**
         * Gets (as xml) the "rule" attribute
         */
        org.apache.xmlbeans.XmlString xgetRule();
        
        /**
         * True if has "rule" attribute
         */
        boolean isSetRule();
        
        /**
         * Sets the "rule" attribute
         */
        void setRule(java.lang.String rule);
        
        /**
         * Sets (as xml) the "rule" attribute
         */
        void xsetRule(org.apache.xmlbeans.XmlString rule);
        
        /**
         * Unsets the "rule" attribute
         */
        void unsetRule();
        
        /**
         * Gets the "severity" attribute
         */
        java.lang.String getSeverity();
        
        /**
         * Gets (as xml) the "severity" attribute
         */
        org.apache.xmlbeans.XmlString xgetSeverity();
        
        /**
         * True if has "severity" attribute
         */
        boolean isSetSeverity();
        
        /**
         * Sets the "severity" attribute
         */
        void setSeverity(java.lang.String severity);
        
        /**
         * Sets (as xml) the "severity" attribute
         */
        void xsetSeverity(org.apache.xmlbeans.XmlString severity);
        
        /**
         * Unsets the "severity" attribute
         */
        void unsetSeverity();
        
        /**
         * Gets the "start" attribute
         */
        java.util.Calendar getStart();
        
        /**
         * Gets (as xml) the "start" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetStart();
        
        /**
         * True if has "start" attribute
         */
        boolean isSetStart();
        
        /**
         * Sets the "start" attribute
         */
        void setStart(java.util.Calendar start);
        
        /**
         * Sets (as xml) the "start" attribute
         */
        void xsetStart(org.apache.xmlbeans.XmlDateTime start);
        
        /**
         * Unsets the "start" attribute
         */
        void unsetStart();
        
        /**
         * Gets the "end" attribute
         */
        java.util.Calendar getEnd();
        
        /**
         * Gets (as xml) the "end" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetEnd();
        
        /**
         * True if has "end" attribute
         */
        boolean isSetEnd();
        
        /**
         * Sets the "end" attribute
         */
        void setEnd(java.util.Calendar end);
        
        /**
         * Sets (as xml) the "end" attribute
         */
        void xsetEnd(org.apache.xmlbeans.XmlDateTime end);
        
        /**
         * Unsets the "end" attribute
         */
        void unsetEnd();
        
        /**
         * Gets the "duration" attribute
         */
        java.lang.String getDuration();
        
        /**
         * Gets (as xml) the "duration" attribute
         */
        org.apache.xmlbeans.XmlString xgetDuration();
        
        /**
         * True if has "duration" attribute
         */
        boolean isSetDuration();
        
        /**
         * Sets the "duration" attribute
         */
        void setDuration(java.lang.String duration);
        
        /**
         * Sets (as xml) the "duration" attribute
         */
        void xsetDuration(org.apache.xmlbeans.XmlString duration);
        
        /**
         * Unsets the "duration" attribute
         */
        void unsetDuration();
        
        /**
         * Gets the "systemprofile" attribute
         */
        java.lang.String getSystemprofile();
        
        /**
         * Gets (as xml) the "systemprofile" attribute
         */
        org.apache.xmlbeans.XmlString xgetSystemprofile();
        
        /**
         * True if has "systemprofile" attribute
         */
        boolean isSetSystemprofile();
        
        /**
         * Sets the "systemprofile" attribute
         */
        void setSystemprofile(java.lang.String systemprofile);
        
        /**
         * Sets (as xml) the "systemprofile" attribute
         */
        void xsetSystemprofile(org.apache.xmlbeans.XmlString systemprofile);
        
        /**
         * Unsets the "systemprofile" attribute
         */
        void unsetSystemprofile();
        
        /**
         * Gets the "message" attribute
         */
        java.lang.String getMessage();
        
        /**
         * Gets (as xml) the "message" attribute
         */
        org.apache.xmlbeans.XmlString xgetMessage();
        
        /**
         * True if has "message" attribute
         */
        boolean isSetMessage();
        
        /**
         * Sets the "message" attribute
         */
        void setMessage(java.lang.String message);
        
        /**
         * Sets (as xml) the "message" attribute
         */
        void xsetMessage(org.apache.xmlbeans.XmlString message);
        
        /**
         * Unsets the "message" attribute
         */
        void unsetMessage();
        
        /**
         * Gets the "description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" attribute
         */
        void unsetDescription();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.IncidentchartrecordDocument.Incidentchartrecord newInstance() {
              return (noNamespace.IncidentchartrecordDocument.Incidentchartrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.IncidentchartrecordDocument.Incidentchartrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.IncidentchartrecordDocument.Incidentchartrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.IncidentchartrecordDocument newInstance() {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.IncidentchartrecordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.IncidentchartrecordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.IncidentchartrecordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.IncidentchartrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.IncidentchartrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.IncidentchartrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
