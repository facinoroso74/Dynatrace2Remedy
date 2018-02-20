/*
 * An XML document type.
 * Localname: processdashlet
 * Namespace: 
 * Java type: noNamespace.ProcessdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one processdashlet(@) element.
 *
 * This is a complex type.
 */
public interface ProcessdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("processdashlet88b3doctype");
    
    /**
     * Gets the "processdashlet" element
     */
    noNamespace.ProcessdashletDocument.Processdashlet getProcessdashlet();
    
    /**
     * Sets the "processdashlet" element
     */
    void setProcessdashlet(noNamespace.ProcessdashletDocument.Processdashlet processdashlet);
    
    /**
     * Appends and returns a new empty "processdashlet" element
     */
    noNamespace.ProcessdashletDocument.Processdashlet addNewProcessdashlet();
    
    /**
     * An XML processdashlet(@).
     *
     * This is a complex type.
     */
    public interface Processdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Processdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("processdashlet20edelemtype");
        
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
         * Gets array of all "process" elements
         */
        noNamespace.ProcessdashletDocument.Processdashlet.Process[] getProcessArray();
        
        /**
         * Gets ith "process" element
         */
        noNamespace.ProcessdashletDocument.Processdashlet.Process getProcessArray(int i);
        
        /**
         * Returns number of "process" element
         */
        int sizeOfProcessArray();
        
        /**
         * Sets array of all "process" element
         */
        void setProcessArray(noNamespace.ProcessdashletDocument.Processdashlet.Process[] processArray);
        
        /**
         * Sets ith "process" element
         */
        void setProcessArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process process);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "process" element
         */
        noNamespace.ProcessdashletDocument.Processdashlet.Process insertNewProcess(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "process" element
         */
        noNamespace.ProcessdashletDocument.Processdashlet.Process addNewProcess();
        
        /**
         * Removes the ith "process" element
         */
        void removeProcess(int i);
        
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
         * An XML process(@).
         *
         * This is a complex type.
         */
        public interface Process extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Process.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("process5118elemtype");
            
            /**
             * Gets array of all "chart" elements
             */
            noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart[] getChartArray();
            
            /**
             * Gets ith "chart" element
             */
            noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart getChartArray(int i);
            
            /**
             * Returns number of "chart" element
             */
            int sizeOfChartArray();
            
            /**
             * Sets array of all "chart" element
             */
            void setChartArray(noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart[] chartArray);
            
            /**
             * Sets ith "chart" element
             */
            void setChartArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart chart);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "chart" element
             */
            noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart insertNewChart(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "chart" element
             */
            noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart addNewChart();
            
            /**
             * Removes the ith "chart" element
             */
            void removeChart(int i);
            
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
             * Gets the "host" attribute
             */
            java.lang.String getHost();
            
            /**
             * Gets (as xml) the "host" attribute
             */
            org.apache.xmlbeans.XmlString xgetHost();
            
            /**
             * True if has "host" attribute
             */
            boolean isSetHost();
            
            /**
             * Sets the "host" attribute
             */
            void setHost(java.lang.String host);
            
            /**
             * Sets (as xml) the "host" attribute
             */
            void xsetHost(org.apache.xmlbeans.XmlString host);
            
            /**
             * Unsets the "host" attribute
             */
            void unsetHost();
            
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
             * Gets the "instrumentationstate" attribute
             */
            java.lang.String getInstrumentationstate();
            
            /**
             * Gets (as xml) the "instrumentationstate" attribute
             */
            org.apache.xmlbeans.XmlString xgetInstrumentationstate();
            
            /**
             * True if has "instrumentationstate" attribute
             */
            boolean isSetInstrumentationstate();
            
            /**
             * Sets the "instrumentationstate" attribute
             */
            void setInstrumentationstate(java.lang.String instrumentationstate);
            
            /**
             * Sets (as xml) the "instrumentationstate" attribute
             */
            void xsetInstrumentationstate(org.apache.xmlbeans.XmlString instrumentationstate);
            
            /**
             * Unsets the "instrumentationstate" attribute
             */
            void unsetInstrumentationstate();
            
            /**
             * Gets the "uptime" attribute
             */
            java.lang.String getUptime();
            
            /**
             * Gets (as xml) the "uptime" attribute
             */
            org.apache.xmlbeans.XmlString xgetUptime();
            
            /**
             * True if has "uptime" attribute
             */
            boolean isSetUptime();
            
            /**
             * Sets the "uptime" attribute
             */
            void setUptime(java.lang.String uptime);
            
            /**
             * Sets (as xml) the "uptime" attribute
             */
            void xsetUptime(org.apache.xmlbeans.XmlString uptime);
            
            /**
             * Unsets the "uptime" attribute
             */
            void unsetUptime();
            
            /**
             * Gets the "health" attribute
             */
            java.lang.String getHealth();
            
            /**
             * Gets (as xml) the "health" attribute
             */
            org.apache.xmlbeans.XmlString xgetHealth();
            
            /**
             * True if has "health" attribute
             */
            boolean isSetHealth();
            
            /**
             * Sets the "health" attribute
             */
            void setHealth(java.lang.String health);
            
            /**
             * Sets (as xml) the "health" attribute
             */
            void xsetHealth(org.apache.xmlbeans.XmlString health);
            
            /**
             * Unsets the "health" attribute
             */
            void unsetHealth();
            
            /**
             * An XML chart(@).
             *
             * This is a complex type.
             */
            public interface Chart extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Chart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("chartd472elemtype");
                
                /**
                 * Gets array of all "series" elements
                 */
                noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series[] getSeriesArray();
                
                /**
                 * Gets ith "series" element
                 */
                noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series getSeriesArray(int i);
                
                /**
                 * Returns number of "series" element
                 */
                int sizeOfSeriesArray();
                
                /**
                 * Sets array of all "series" element
                 */
                void setSeriesArray(noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series[] seriesArray);
                
                /**
                 * Sets ith "series" element
                 */
                void setSeriesArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series series);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "series" element
                 */
                noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series insertNewSeries(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "series" element
                 */
                noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series addNewSeries();
                
                /**
                 * Removes the ith "series" element
                 */
                void removeSeries(int i);
                
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
                 * Gets the "startdate" attribute
                 */
                java.lang.String getStartdate();
                
                /**
                 * Gets (as xml) the "startdate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetStartdate();
                
                /**
                 * True if has "startdate" attribute
                 */
                boolean isSetStartdate();
                
                /**
                 * Sets the "startdate" attribute
                 */
                void setStartdate(java.lang.String startdate);
                
                /**
                 * Sets (as xml) the "startdate" attribute
                 */
                void xsetStartdate(org.apache.xmlbeans.XmlString startdate);
                
                /**
                 * Unsets the "startdate" attribute
                 */
                void unsetStartdate();
                
                /**
                 * Gets the "enddate" attribute
                 */
                java.lang.String getEnddate();
                
                /**
                 * Gets (as xml) the "enddate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetEnddate();
                
                /**
                 * True if has "enddate" attribute
                 */
                boolean isSetEnddate();
                
                /**
                 * Sets the "enddate" attribute
                 */
                void setEnddate(java.lang.String enddate);
                
                /**
                 * Sets (as xml) the "enddate" attribute
                 */
                void xsetEnddate(org.apache.xmlbeans.XmlString enddate);
                
                /**
                 * Unsets the "enddate" attribute
                 */
                void unsetEnddate();
                
                /**
                 * An XML series(@).
                 *
                 * This is a complex type.
                 */
                public interface Series extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Series.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("series6bf5elemtype");
                    
                    /**
                     * Gets array of all "measurement" elements
                     */
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement[] getMeasurementArray();
                    
                    /**
                     * Gets ith "measurement" element
                     */
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement getMeasurementArray(int i);
                    
                    /**
                     * Returns number of "measurement" element
                     */
                    int sizeOfMeasurementArray();
                    
                    /**
                     * Sets array of all "measurement" element
                     */
                    void setMeasurementArray(noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement[] measurementArray);
                    
                    /**
                     * Sets ith "measurement" element
                     */
                    void setMeasurementArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement measurement);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                     */
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement insertNewMeasurement(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "measurement" element
                     */
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement addNewMeasurement();
                    
                    /**
                     * Removes the ith "measurement" element
                     */
                    void removeMeasurement(int i);
                    
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
                     * Gets the "datasetnumber" attribute
                     */
                    java.lang.String getDatasetnumber();
                    
                    /**
                     * Gets (as xml) the "datasetnumber" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetDatasetnumber();
                    
                    /**
                     * True if has "datasetnumber" attribute
                     */
                    boolean isSetDatasetnumber();
                    
                    /**
                     * Sets the "datasetnumber" attribute
                     */
                    void setDatasetnumber(java.lang.String datasetnumber);
                    
                    /**
                     * Sets (as xml) the "datasetnumber" attribute
                     */
                    void xsetDatasetnumber(org.apache.xmlbeans.XmlString datasetnumber);
                    
                    /**
                     * Unsets the "datasetnumber" attribute
                     */
                    void unsetDatasetnumber();
                    
                    /**
                     * Gets the "seriesnumber" attribute
                     */
                    java.lang.String getSeriesnumber();
                    
                    /**
                     * Gets (as xml) the "seriesnumber" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetSeriesnumber();
                    
                    /**
                     * True if has "seriesnumber" attribute
                     */
                    boolean isSetSeriesnumber();
                    
                    /**
                     * Sets the "seriesnumber" attribute
                     */
                    void setSeriesnumber(java.lang.String seriesnumber);
                    
                    /**
                     * Sets (as xml) the "seriesnumber" attribute
                     */
                    void xsetSeriesnumber(org.apache.xmlbeans.XmlString seriesnumber);
                    
                    /**
                     * Unsets the "seriesnumber" attribute
                     */
                    void unsetSeriesnumber();
                    
                    /**
                     * An XML measurement(@).
                     *
                     * This is a complex type.
                     */
                    public interface Measurement extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurementeabdelemtype");
                      
                      /**
                       * Gets the "timestamp" attribute
                       */
                      java.util.Calendar getTimestamp();
                      
                      /**
                       * Gets (as xml) the "timestamp" attribute
                       */
                      org.apache.xmlbeans.XmlDateTime xgetTimestamp();
                      
                      /**
                       * Sets the "timestamp" attribute
                       */
                      void setTimestamp(java.util.Calendar timestamp);
                      
                      /**
                       * Sets (as xml) the "timestamp" attribute
                       */
                      void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp);
                      
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
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement newInstance() {
                          return (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series newInstance() {
                        return (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart newInstance() {
                      return (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ProcessdashletDocument.Processdashlet.Process newInstance() {
                  return (noNamespace.ProcessdashletDocument.Processdashlet.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ProcessdashletDocument.Processdashlet.Process newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ProcessdashletDocument.Processdashlet.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ProcessdashletDocument.Processdashlet newInstance() {
              return (noNamespace.ProcessdashletDocument.Processdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ProcessdashletDocument.Processdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ProcessdashletDocument.Processdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ProcessdashletDocument newInstance() {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ProcessdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ProcessdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ProcessdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ProcessdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ProcessdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ProcessdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ProcessdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ProcessdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ProcessdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ProcessdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ProcessdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
