/*
 * An XML document type.
 * Localname: statustaskmonitorrecord
 * Namespace: 
 * Java type: noNamespace.StatustaskmonitorrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one statustaskmonitorrecord(@) element.
 *
 * This is a complex type.
 */
public interface StatustaskmonitorrecordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatustaskmonitorrecordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("statustaskmonitorrecord3a7bdoctype");
    
    /**
     * Gets the "statustaskmonitorrecord" element
     */
    noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord getStatustaskmonitorrecord();
    
    /**
     * Sets the "statustaskmonitorrecord" element
     */
    void setStatustaskmonitorrecord(noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord statustaskmonitorrecord);
    
    /**
     * Appends and returns a new empty "statustaskmonitorrecord" element
     */
    noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord addNewStatustaskmonitorrecord();
    
    /**
     * An XML statustaskmonitorrecord(@).
     *
     * This is a complex type.
     */
    public interface Statustaskmonitorrecord extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Statustaskmonitorrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("statustaskmonitorrecord3e0belemtype");
        
        /**
         * Gets array of all "statustaskmonitorrecord" elements
         */
        noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[] getStatustaskmonitorrecordArray();
        
        /**
         * Gets ith "statustaskmonitorrecord" element
         */
        noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord getStatustaskmonitorrecordArray(int i);
        
        /**
         * Returns number of "statustaskmonitorrecord" element
         */
        int sizeOfStatustaskmonitorrecordArray();
        
        /**
         * Sets array of all "statustaskmonitorrecord" element
         */
        void setStatustaskmonitorrecordArray(noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[] statustaskmonitorrecordArray);
        
        /**
         * Sets ith "statustaskmonitorrecord" element
         */
        void setStatustaskmonitorrecordArray(int i, noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord statustaskmonitorrecord);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "statustaskmonitorrecord" element
         */
        noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord insertNewStatustaskmonitorrecord(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "statustaskmonitorrecord" element
         */
        noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord addNewStatustaskmonitorrecord();
        
        /**
         * Removes the ith "statustaskmonitorrecord" element
         */
        void removeStatustaskmonitorrecord(int i);
        
        /**
         * Gets the "header" attribute
         */
        java.lang.String getHeader();
        
        /**
         * Gets (as xml) the "header" attribute
         */
        org.apache.xmlbeans.XmlString xgetHeader();
        
        /**
         * True if has "header" attribute
         */
        boolean isSetHeader();
        
        /**
         * Sets the "header" attribute
         */
        void setHeader(java.lang.String header);
        
        /**
         * Sets (as xml) the "header" attribute
         */
        void xsetHeader(org.apache.xmlbeans.XmlString header);
        
        /**
         * Unsets the "header" attribute
         */
        void unsetHeader();
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
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
         * Gets the "lastrun" attribute
         */
        java.util.Calendar getLastrun();
        
        /**
         * Gets (as xml) the "lastrun" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetLastrun();
        
        /**
         * True if has "lastrun" attribute
         */
        boolean isSetLastrun();
        
        /**
         * Sets the "lastrun" attribute
         */
        void setLastrun(java.util.Calendar lastrun);
        
        /**
         * Sets (as xml) the "lastrun" attribute
         */
        void xsetLastrun(org.apache.xmlbeans.XmlDateTime lastrun);
        
        /**
         * Unsets the "lastrun" attribute
         */
        void unsetLastrun();
        
        /**
         * Gets the "lastrunresult" attribute
         */
        java.lang.String getLastrunresult();
        
        /**
         * Gets (as xml) the "lastrunresult" attribute
         */
        org.apache.xmlbeans.XmlString xgetLastrunresult();
        
        /**
         * True if has "lastrunresult" attribute
         */
        boolean isSetLastrunresult();
        
        /**
         * Sets the "lastrunresult" attribute
         */
        void setLastrunresult(java.lang.String lastrunresult);
        
        /**
         * Sets (as xml) the "lastrunresult" attribute
         */
        void xsetLastrunresult(org.apache.xmlbeans.XmlString lastrunresult);
        
        /**
         * Unsets the "lastrunresult" attribute
         */
        void unsetLastrunresult();
        
        /**
         * Gets the "nextrun" attribute
         */
        java.util.Calendar getNextrun();
        
        /**
         * Gets (as xml) the "nextrun" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetNextrun();
        
        /**
         * True if has "nextrun" attribute
         */
        boolean isSetNextrun();
        
        /**
         * Sets the "nextrun" attribute
         */
        void setNextrun(java.util.Calendar nextrun);
        
        /**
         * Sets (as xml) the "nextrun" attribute
         */
        void xsetNextrun(org.apache.xmlbeans.XmlDateTime nextrun);
        
        /**
         * Unsets the "nextrun" attribute
         */
        void unsetNextrun();
        
        /**
         * Gets the "currentrun" attribute
         */
        java.lang.String getCurrentrun();
        
        /**
         * Gets (as xml) the "currentrun" attribute
         */
        org.apache.xmlbeans.XmlString xgetCurrentrun();
        
        /**
         * True if has "currentrun" attribute
         */
        boolean isSetCurrentrun();
        
        /**
         * Sets the "currentrun" attribute
         */
        void setCurrentrun(java.lang.String currentrun);
        
        /**
         * Sets (as xml) the "currentrun" attribute
         */
        void xsetCurrentrun(org.apache.xmlbeans.XmlString currentrun);
        
        /**
         * Unsets the "currentrun" attribute
         */
        void unsetCurrentrun();
        
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
         * Gets the "schedule" attribute
         */
        java.lang.String getSchedule();
        
        /**
         * Gets (as xml) the "schedule" attribute
         */
        org.apache.xmlbeans.XmlString xgetSchedule();
        
        /**
         * True if has "schedule" attribute
         */
        boolean isSetSchedule();
        
        /**
         * Sets the "schedule" attribute
         */
        void setSchedule(java.lang.String schedule);
        
        /**
         * Sets (as xml) the "schedule" attribute
         */
        void xsetSchedule(org.apache.xmlbeans.XmlString schedule);
        
        /**
         * Unsets the "schedule" attribute
         */
        void unsetSchedule();
        
        /**
         * Gets the "target" attribute
         */
        java.lang.String getTarget();
        
        /**
         * Gets (as xml) the "target" attribute
         */
        org.apache.xmlbeans.XmlString xgetTarget();
        
        /**
         * True if has "target" attribute
         */
        boolean isSetTarget();
        
        /**
         * Sets the "target" attribute
         */
        void setTarget(java.lang.String target);
        
        /**
         * Sets (as xml) the "target" attribute
         */
        void xsetTarget(org.apache.xmlbeans.XmlString target);
        
        /**
         * Unsets the "target" attribute
         */
        void unsetTarget();
        
        /**
         * Gets the "pluginstate" attribute
         */
        java.lang.String getPluginstate();
        
        /**
         * Gets (as xml) the "pluginstate" attribute
         */
        org.apache.xmlbeans.XmlString xgetPluginstate();
        
        /**
         * True if has "pluginstate" attribute
         */
        boolean isSetPluginstate();
        
        /**
         * Sets the "pluginstate" attribute
         */
        void setPluginstate(java.lang.String pluginstate);
        
        /**
         * Sets (as xml) the "pluginstate" attribute
         */
        void xsetPluginstate(org.apache.xmlbeans.XmlString pluginstate);
        
        /**
         * Unsets the "pluginstate" attribute
         */
        void unsetPluginstate();
        
        /**
         * Gets the "businesshours" attribute
         */
        java.lang.String getBusinesshours();
        
        /**
         * Gets (as xml) the "businesshours" attribute
         */
        org.apache.xmlbeans.XmlString xgetBusinesshours();
        
        /**
         * True if has "businesshours" attribute
         */
        boolean isSetBusinesshours();
        
        /**
         * Sets the "businesshours" attribute
         */
        void setBusinesshours(java.lang.String businesshours);
        
        /**
         * Sets (as xml) the "businesshours" attribute
         */
        void xsetBusinesshours(org.apache.xmlbeans.XmlString businesshours);
        
        /**
         * Unsets the "businesshours" attribute
         */
        void unsetBusinesshours();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord newInstance() {
              return (noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.StatustaskmonitorrecordDocument newInstance() {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.StatustaskmonitorrecordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.StatustaskmonitorrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.StatustaskmonitorrecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.StatustaskmonitorrecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
