/*
 * An XML document type.
 * Localname: incidentoverviewrecord
 * Namespace: 
 * Java type: noNamespace.IncidentoverviewrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one incidentoverviewrecord(@) element.
 *
 * This is a complex type.
 */
public interface IncidentoverviewrecordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentoverviewrecordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("incidentoverviewrecord8015doctype");
    
    /**
     * Gets the "incidentoverviewrecord" element
     */
    noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord getIncidentoverviewrecord();
    
    /**
     * Sets the "incidentoverviewrecord" element
     */
    void setIncidentoverviewrecord(noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord);
    
    /**
     * Appends and returns a new empty "incidentoverviewrecord" element
     */
    noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord addNewIncidentoverviewrecord();
    
    /**
     * An XML incidentoverviewrecord(@).
     *
     * This is a complex type.
     */
    public interface Incidentoverviewrecord extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Incidentoverviewrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("incidentoverviewrecord582delemtype");
        
        /**
         * Gets array of all "incidentoverviewrecord" elements
         */
        noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] getIncidentoverviewrecordArray();
        
        /**
         * Gets ith "incidentoverviewrecord" element
         */
        noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord getIncidentoverviewrecordArray(int i);
        
        /**
         * Returns number of "incidentoverviewrecord" element
         */
        int sizeOfIncidentoverviewrecordArray();
        
        /**
         * Sets array of all "incidentoverviewrecord" element
         */
        void setIncidentoverviewrecordArray(noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] incidentoverviewrecordArray);
        
        /**
         * Sets ith "incidentoverviewrecord" element
         */
        void setIncidentoverviewrecordArray(int i, noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "incidentoverviewrecord" element
         */
        noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord insertNewIncidentoverviewrecord(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "incidentoverviewrecord" element
         */
        noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord addNewIncidentoverviewrecord();
        
        /**
         * Removes the ith "incidentoverviewrecord" element
         */
        void removeIncidentoverviewrecord(int i);
        
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
         * Gets the "heatfield" attribute
         */
        java.lang.String getHeatfield();
        
        /**
         * Gets (as xml) the "heatfield" attribute
         */
        org.apache.xmlbeans.XmlString xgetHeatfield();
        
        /**
         * True if has "heatfield" attribute
         */
        boolean isSetHeatfield();
        
        /**
         * Sets the "heatfield" attribute
         */
        void setHeatfield(java.lang.String heatfield);
        
        /**
         * Sets (as xml) the "heatfield" attribute
         */
        void xsetHeatfield(org.apache.xmlbeans.XmlString heatfield);
        
        /**
         * Unsets the "heatfield" attribute
         */
        void unsetHeatfield();
        
        /**
         * Gets the "state" attribute
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
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
         * Gets the "source" attribute
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "source" attribute
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * True if has "source" attribute
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" attribute
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "source" attribute
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Unsets the "source" attribute
         */
        void unsetSource();
        
        /**
         * Gets the "session" attribute
         */
        java.lang.String getSession();
        
        /**
         * Gets (as xml) the "session" attribute
         */
        org.apache.xmlbeans.XmlString xgetSession();
        
        /**
         * True if has "session" attribute
         */
        boolean isSetSession();
        
        /**
         * Sets the "session" attribute
         */
        void setSession(java.lang.String session);
        
        /**
         * Sets (as xml) the "session" attribute
         */
        void xsetSession(org.apache.xmlbeans.XmlString session);
        
        /**
         * Unsets the "session" attribute
         */
        void unsetSession();
        
        /**
         * Gets the "confirmed_by" attribute
         */
        java.lang.String getConfirmedBy();
        
        /**
         * Gets (as xml) the "confirmed_by" attribute
         */
        org.apache.xmlbeans.XmlString xgetConfirmedBy();
        
        /**
         * True if has "confirmed_by" attribute
         */
        boolean isSetConfirmedBy();
        
        /**
         * Sets the "confirmed_by" attribute
         */
        void setConfirmedBy(java.lang.String confirmedBy);
        
        /**
         * Sets (as xml) the "confirmed_by" attribute
         */
        void xsetConfirmedBy(org.apache.xmlbeans.XmlString confirmedBy);
        
        /**
         * Unsets the "confirmed_by" attribute
         */
        void unsetConfirmedBy();
        
        /**
         * Gets the "confirmation" attribute
         */
        java.lang.String getConfirmation();
        
        /**
         * Gets (as xml) the "confirmation" attribute
         */
        org.apache.xmlbeans.XmlString xgetConfirmation();
        
        /**
         * True if has "confirmation" attribute
         */
        boolean isSetConfirmation();
        
        /**
         * Sets the "confirmation" attribute
         */
        void setConfirmation(java.lang.String confirmation);
        
        /**
         * Sets (as xml) the "confirmation" attribute
         */
        void xsetConfirmation(org.apache.xmlbeans.XmlString confirmation);
        
        /**
         * Unsets the "confirmation" attribute
         */
        void unsetConfirmation();
        
        /**
         * Gets the "sensitivity" attribute
         */
        java.lang.String getSensitivity();
        
        /**
         * Gets (as xml) the "sensitivity" attribute
         */
        org.apache.xmlbeans.XmlString xgetSensitivity();
        
        /**
         * True if has "sensitivity" attribute
         */
        boolean isSetSensitivity();
        
        /**
         * Sets the "sensitivity" attribute
         */
        void setSensitivity(java.lang.String sensitivity);
        
        /**
         * Sets (as xml) the "sensitivity" attribute
         */
        void xsetSensitivity(org.apache.xmlbeans.XmlString sensitivity);
        
        /**
         * Unsets the "sensitivity" attribute
         */
        void unsetSensitivity();
        
        /**
         * Gets the "conditions" attribute
         */
        java.lang.String getConditions();
        
        /**
         * Gets (as xml) the "conditions" attribute
         */
        org.apache.xmlbeans.XmlString xgetConditions();
        
        /**
         * True if has "conditions" attribute
         */
        boolean isSetConditions();
        
        /**
         * Sets the "conditions" attribute
         */
        void setConditions(java.lang.String conditions);
        
        /**
         * Sets (as xml) the "conditions" attribute
         */
        void xsetConditions(org.apache.xmlbeans.XmlString conditions);
        
        /**
         * Unsets the "conditions" attribute
         */
        void unsetConditions();
        
        /**
         * Gets the "thresholds" attribute
         */
        java.lang.String getThresholds();
        
        /**
         * Gets (as xml) the "thresholds" attribute
         */
        org.apache.xmlbeans.XmlString xgetThresholds();
        
        /**
         * True if has "thresholds" attribute
         */
        boolean isSetThresholds();
        
        /**
         * Sets the "thresholds" attribute
         */
        void setThresholds(java.lang.String thresholds);
        
        /**
         * Sets (as xml) the "thresholds" attribute
         */
        void xsetThresholds(org.apache.xmlbeans.XmlString thresholds);
        
        /**
         * Unsets the "thresholds" attribute
         */
        void unsetThresholds();
        
        /**
         * Gets the "actions" attribute
         */
        java.lang.String getActions();
        
        /**
         * Gets (as xml) the "actions" attribute
         */
        org.apache.xmlbeans.XmlString xgetActions();
        
        /**
         * True if has "actions" attribute
         */
        boolean isSetActions();
        
        /**
         * Sets the "actions" attribute
         */
        void setActions(java.lang.String actions);
        
        /**
         * Sets (as xml) the "actions" attribute
         */
        void xsetActions(org.apache.xmlbeans.XmlString actions);
        
        /**
         * Unsets the "actions" attribute
         */
        void unsetActions();
        
        /**
         * Gets the "measures" attribute
         */
        java.lang.String getMeasures();
        
        /**
         * Gets (as xml) the "measures" attribute
         */
        org.apache.xmlbeans.XmlString xgetMeasures();
        
        /**
         * True if has "measures" attribute
         */
        boolean isSetMeasures();
        
        /**
         * Sets the "measures" attribute
         */
        void setMeasures(java.lang.String measures);
        
        /**
         * Sets (as xml) the "measures" attribute
         */
        void xsetMeasures(org.apache.xmlbeans.XmlString measures);
        
        /**
         * Unsets the "measures" attribute
         */
        void unsetMeasures();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord newInstance() {
              return (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.IncidentoverviewrecordDocument newInstance() {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.IncidentoverviewrecordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.IncidentoverviewrecordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.IncidentoverviewrecordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.IncidentoverviewrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.IncidentoverviewrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.IncidentoverviewrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
