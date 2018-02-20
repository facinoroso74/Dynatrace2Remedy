/*
 * An XML document type.
 * Localname: baselinechart
 * Namespace: 
 * Java type: noNamespace.BaselinechartDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one baselinechart(@) element.
 *
 * This is a complex type.
 */
public interface BaselinechartDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaselinechartDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("baselinechart58e0doctype");
    
    /**
     * Gets the "baselinechart" element
     */
    noNamespace.BaselinechartDocument.Baselinechart getBaselinechart();
    
    /**
     * Sets the "baselinechart" element
     */
    void setBaselinechart(noNamespace.BaselinechartDocument.Baselinechart baselinechart);
    
    /**
     * Appends and returns a new empty "baselinechart" element
     */
    noNamespace.BaselinechartDocument.Baselinechart addNewBaselinechart();
    
    /**
     * An XML baselinechart(@).
     *
     * This is a complex type.
     */
    public interface Baselinechart extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Baselinechart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("baselinechartb615elemtype");
        
        /**
         * Gets the "source" element
         */
        noNamespace.SourceType getSource();
        
        /**
         * True if has "source" element
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(noNamespace.SourceType source);
        
        /**
         * Appends and returns a new empty "source" element
         */
        noNamespace.SourceType addNewSource();
        
        /**
         * Unsets the "source" element
         */
        void unsetSource();
        
        /**
         * Gets the "comparesource" element
         */
        noNamespace.SourceType getComparesource();
        
        /**
         * True if has "comparesource" element
         */
        boolean isSetComparesource();
        
        /**
         * Sets the "comparesource" element
         */
        void setComparesource(noNamespace.SourceType comparesource);
        
        /**
         * Appends and returns a new empty "comparesource" element
         */
        noNamespace.SourceType addNewComparesource();
        
        /**
         * Unsets the "comparesource" element
         */
        void unsetComparesource();
        
        /**
         * Gets the "chart" element
         */
        noNamespace.BaselinechartDocument.Baselinechart.Chart getChart();
        
        /**
         * Sets the "chart" element
         */
        void setChart(noNamespace.BaselinechartDocument.Baselinechart.Chart chart);
        
        /**
         * Appends and returns a new empty "chart" element
         */
        noNamespace.BaselinechartDocument.Baselinechart.Chart addNewChart();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
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
         * An XML chart(@).
         *
         * This is a complex type.
         */
        public interface Chart extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Chart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("chartf06felemtype");
            
            /**
             * Gets array of all "record" elements
             */
            noNamespace.BaselinechartDocument.Baselinechart.Chart.Record[] getRecordArray();
            
            /**
             * Gets ith "record" element
             */
            noNamespace.BaselinechartDocument.Baselinechart.Chart.Record getRecordArray(int i);
            
            /**
             * Returns number of "record" element
             */
            int sizeOfRecordArray();
            
            /**
             * Sets array of all "record" element
             */
            void setRecordArray(noNamespace.BaselinechartDocument.Baselinechart.Chart.Record[] recordArray);
            
            /**
             * Sets ith "record" element
             */
            void setRecordArray(int i, noNamespace.BaselinechartDocument.Baselinechart.Chart.Record record);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "record" element
             */
            noNamespace.BaselinechartDocument.Baselinechart.Chart.Record insertNewRecord(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "record" element
             */
            noNamespace.BaselinechartDocument.Baselinechart.Chart.Record addNewRecord();
            
            /**
             * Removes the ith "record" element
             */
            void removeRecord(int i);
            
            /**
             * An XML record(@).
             *
             * This is a complex type.
             */
            public interface Record extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Record.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("record804celemtype");
                
                /**
                 * Gets array of all "measurement" elements
                 */
                noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement[] getMeasurementArray();
                
                /**
                 * Gets ith "measurement" element
                 */
                noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement getMeasurementArray(int i);
                
                /**
                 * Returns number of "measurement" element
                 */
                int sizeOfMeasurementArray();
                
                /**
                 * Sets array of all "measurement" element
                 */
                void setMeasurementArray(noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement[] measurementArray);
                
                /**
                 * Sets ith "measurement" element
                 */
                void setMeasurementArray(int i, noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement measurement);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                 */
                noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement insertNewMeasurement(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measurement" element
                 */
                noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement addNewMeasurement();
                
                /**
                 * Removes the ith "measurement" element
                 */
                void removeMeasurement(int i);
                
                /**
                 * An XML measurement(@).
                 *
                 * This is a complex type.
                 */
                public interface Measurement extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurementeb14elemtype");
                    
                    /**
                     * Gets the "actual" attribute
                     */
                    double getActual();
                    
                    /**
                     * Gets (as xml) the "actual" attribute
                     */
                    org.apache.xmlbeans.XmlDouble xgetActual();
                    
                    /**
                     * Sets the "actual" attribute
                     */
                    void setActual(double actual);
                    
                    /**
                     * Sets (as xml) the "actual" attribute
                     */
                    void xsetActual(org.apache.xmlbeans.XmlDouble actual);
                    
                    /**
                     * Gets the "observations" attribute
                     */
                    java.math.BigInteger getObservations();
                    
                    /**
                     * Gets (as xml) the "observations" attribute
                     */
                    org.apache.xmlbeans.XmlInteger xgetObservations();
                    
                    /**
                     * Sets the "observations" attribute
                     */
                    void setObservations(java.math.BigInteger observations);
                    
                    /**
                     * Sets (as xml) the "observations" attribute
                     */
                    void xsetObservations(org.apache.xmlbeans.XmlInteger observations);
                    
                    /**
                     * Gets the "timestamp" attribute
                     */
                    java.math.BigInteger getTimestamp();
                    
                    /**
                     * Gets (as xml) the "timestamp" attribute
                     */
                    org.apache.xmlbeans.XmlInteger xgetTimestamp();
                    
                    /**
                     * Sets the "timestamp" attribute
                     */
                    void setTimestamp(java.math.BigInteger timestamp);
                    
                    /**
                     * Sets (as xml) the "timestamp" attribute
                     */
                    void xsetTimestamp(org.apache.xmlbeans.XmlInteger timestamp);
                    
                    /**
                     * Gets the "expected" attribute
                     */
                    double getExpected();
                    
                    /**
                     * Gets (as xml) the "expected" attribute
                     */
                    org.apache.xmlbeans.XmlDouble xgetExpected();
                    
                    /**
                     * True if has "expected" attribute
                     */
                    boolean isSetExpected();
                    
                    /**
                     * Sets the "expected" attribute
                     */
                    void setExpected(double expected);
                    
                    /**
                     * Sets (as xml) the "expected" attribute
                     */
                    void xsetExpected(org.apache.xmlbeans.XmlDouble expected);
                    
                    /**
                     * Unsets the "expected" attribute
                     */
                    void unsetExpected();
                    
                    /**
                     * Gets the "lower" attribute
                     */
                    double getLower();
                    
                    /**
                     * Gets (as xml) the "lower" attribute
                     */
                    org.apache.xmlbeans.XmlDouble xgetLower();
                    
                    /**
                     * True if has "lower" attribute
                     */
                    boolean isSetLower();
                    
                    /**
                     * Sets the "lower" attribute
                     */
                    void setLower(double lower);
                    
                    /**
                     * Sets (as xml) the "lower" attribute
                     */
                    void xsetLower(org.apache.xmlbeans.XmlDouble lower);
                    
                    /**
                     * Unsets the "lower" attribute
                     */
                    void unsetLower();
                    
                    /**
                     * Gets the "upper" attribute
                     */
                    double getUpper();
                    
                    /**
                     * Gets (as xml) the "upper" attribute
                     */
                    org.apache.xmlbeans.XmlDouble xgetUpper();
                    
                    /**
                     * True if has "upper" attribute
                     */
                    boolean isSetUpper();
                    
                    /**
                     * Sets the "upper" attribute
                     */
                    void setUpper(double upper);
                    
                    /**
                     * Sets (as xml) the "upper" attribute
                     */
                    void xsetUpper(org.apache.xmlbeans.XmlDouble upper);
                    
                    /**
                     * Unsets the "upper" attribute
                     */
                    void unsetUpper();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement newInstance() {
                        return (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.BaselinechartDocument.Baselinechart.Chart.Record newInstance() {
                      return (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.BaselinechartDocument.Baselinechart.Chart.Record newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.BaselinechartDocument.Baselinechart.Chart newInstance() {
                  return (noNamespace.BaselinechartDocument.Baselinechart.Chart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.BaselinechartDocument.Baselinechart.Chart newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.BaselinechartDocument.Baselinechart.Chart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.BaselinechartDocument.Baselinechart newInstance() {
              return (noNamespace.BaselinechartDocument.Baselinechart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.BaselinechartDocument.Baselinechart newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.BaselinechartDocument.Baselinechart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.BaselinechartDocument newInstance() {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.BaselinechartDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.BaselinechartDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.BaselinechartDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.BaselinechartDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.BaselinechartDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.BaselinechartDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.BaselinechartDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.BaselinechartDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.BaselinechartDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.BaselinechartDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.BaselinechartDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.BaselinechartDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.BaselinechartDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.BaselinechartDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.BaselinechartDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.BaselinechartDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.BaselinechartDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.BaselinechartDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
