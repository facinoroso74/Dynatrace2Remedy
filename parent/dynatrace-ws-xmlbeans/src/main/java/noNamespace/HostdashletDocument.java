/*
 * An XML document type.
 * Localname: hostdashlet
 * Namespace: 
 * Java type: noNamespace.HostdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one hostdashlet(@) element.
 *
 * This is a complex type.
 */
public interface HostdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("hostdashletb088doctype");
    
    /**
     * Gets the "hostdashlet" element
     */
    noNamespace.HostdashletDocument.Hostdashlet getHostdashlet();
    
    /**
     * Sets the "hostdashlet" element
     */
    void setHostdashlet(noNamespace.HostdashletDocument.Hostdashlet hostdashlet);
    
    /**
     * Appends and returns a new empty "hostdashlet" element
     */
    noNamespace.HostdashletDocument.Hostdashlet addNewHostdashlet();
    
    /**
     * An XML hostdashlet(@).
     *
     * This is a complex type.
     */
    public interface Hostdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hostdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("hostdashlet98e5elemtype");
        
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
         * Gets array of all "host" elements
         */
        noNamespace.HostdashletDocument.Hostdashlet.Host[] getHostArray();
        
        /**
         * Gets ith "host" element
         */
        noNamespace.HostdashletDocument.Hostdashlet.Host getHostArray(int i);
        
        /**
         * Returns number of "host" element
         */
        int sizeOfHostArray();
        
        /**
         * Sets array of all "host" element
         */
        void setHostArray(noNamespace.HostdashletDocument.Hostdashlet.Host[] hostArray);
        
        /**
         * Sets ith "host" element
         */
        void setHostArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host host);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "host" element
         */
        noNamespace.HostdashletDocument.Hostdashlet.Host insertNewHost(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "host" element
         */
        noNamespace.HostdashletDocument.Hostdashlet.Host addNewHost();
        
        /**
         * Removes the ith "host" element
         */
        void removeHost(int i);
        
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
         * An XML host(@).
         *
         * This is a complex type.
         */
        public interface Host extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Host.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("host7f19elemtype");
            
            /**
             * Gets array of all "charts" elements
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts[] getChartsArray();
            
            /**
             * Gets ith "charts" element
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts getChartsArray(int i);
            
            /**
             * Returns number of "charts" element
             */
            int sizeOfChartsArray();
            
            /**
             * Sets array of all "charts" element
             */
            void setChartsArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts[] chartsArray);
            
            /**
             * Sets ith "charts" element
             */
            void setChartsArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts charts);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "charts" element
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts insertNewCharts(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "charts" element
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts addNewCharts();
            
            /**
             * Removes the ith "charts" element
             */
            void removeCharts(int i);
            
            /**
             * Gets array of all "processes" elements
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Processes[] getProcessesArray();
            
            /**
             * Gets ith "processes" element
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Processes getProcessesArray(int i);
            
            /**
             * Returns number of "processes" element
             */
            int sizeOfProcessesArray();
            
            /**
             * Sets array of all "processes" element
             */
            void setProcessesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Processes[] processesArray);
            
            /**
             * Sets ith "processes" element
             */
            void setProcessesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Processes processes);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "processes" element
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Processes insertNewProcesses(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "processes" element
             */
            noNamespace.HostdashletDocument.Hostdashlet.Host.Processes addNewProcesses();
            
            /**
             * Removes the ith "processes" element
             */
            void removeProcesses(int i);
            
            /**
             * Gets the "hostname" attribute
             */
            java.lang.String getHostname();
            
            /**
             * Gets (as xml) the "hostname" attribute
             */
            org.apache.xmlbeans.XmlString xgetHostname();
            
            /**
             * Sets the "hostname" attribute
             */
            void setHostname(java.lang.String hostname);
            
            /**
             * Sets (as xml) the "hostname" attribute
             */
            void xsetHostname(org.apache.xmlbeans.XmlString hostname);
            
            /**
             * Gets the "os" attribute
             */
            java.lang.String getOs();
            
            /**
             * Gets (as xml) the "os" attribute
             */
            org.apache.xmlbeans.XmlString xgetOs();
            
            /**
             * Sets the "os" attribute
             */
            void setOs(java.lang.String os);
            
            /**
             * Sets (as xml) the "os" attribute
             */
            void xsetOs(org.apache.xmlbeans.XmlString os);
            
            /**
             * Gets the "osarchitecture" attribute
             */
            java.lang.String getOsarchitecture();
            
            /**
             * Gets (as xml) the "osarchitecture" attribute
             */
            org.apache.xmlbeans.XmlString xgetOsarchitecture();
            
            /**
             * Sets the "osarchitecture" attribute
             */
            void setOsarchitecture(java.lang.String osarchitecture);
            
            /**
             * Sets (as xml) the "osarchitecture" attribute
             */
            void xsetOsarchitecture(org.apache.xmlbeans.XmlString osarchitecture);
            
            /**
             * Gets the "version" attribute
             */
            java.lang.String getVersion();
            
            /**
             * Gets (as xml) the "version" attribute
             */
            org.apache.xmlbeans.XmlString xgetVersion();
            
            /**
             * Sets the "version" attribute
             */
            void setVersion(java.lang.String version);
            
            /**
             * Sets (as xml) the "version" attribute
             */
            void xsetVersion(org.apache.xmlbeans.XmlString version);
            
            /**
             * Gets the "applicationprocesses" attribute
             */
            java.math.BigInteger getApplicationprocesses();
            
            /**
             * Gets (as xml) the "applicationprocesses" attribute
             */
            org.apache.xmlbeans.XmlInteger xgetApplicationprocesses();
            
            /**
             * Sets the "applicationprocesses" attribute
             */
            void setApplicationprocesses(java.math.BigInteger applicationprocesses);
            
            /**
             * Sets (as xml) the "applicationprocesses" attribute
             */
            void xsetApplicationprocesses(org.apache.xmlbeans.XmlInteger applicationprocesses);
            
            /**
             * Gets the "webservers" attribute
             */
            java.lang.String getWebservers();
            
            /**
             * Gets (as xml) the "webservers" attribute
             */
            org.apache.xmlbeans.XmlString xgetWebservers();
            
            /**
             * Sets the "webservers" attribute
             */
            void setWebservers(java.lang.String webservers);
            
            /**
             * Sets (as xml) the "webservers" attribute
             */
            void xsetWebservers(org.apache.xmlbeans.XmlString webservers);
            
            /**
             * Gets the "ipaddress" attribute
             */
            java.lang.String getIpaddress();
            
            /**
             * Gets (as xml) the "ipaddress" attribute
             */
            org.apache.xmlbeans.XmlString xgetIpaddress();
            
            /**
             * Sets the "ipaddress" attribute
             */
            void setIpaddress(java.lang.String ipaddress);
            
            /**
             * Sets (as xml) the "ipaddress" attribute
             */
            void xsetIpaddress(org.apache.xmlbeans.XmlString ipaddress);
            
            /**
             * Gets the "cpucores" attribute
             */
            java.lang.String getCpucores();
            
            /**
             * Gets (as xml) the "cpucores" attribute
             */
            org.apache.xmlbeans.XmlString xgetCpucores();
            
            /**
             * Sets the "cpucores" attribute
             */
            void setCpucores(java.lang.String cpucores);
            
            /**
             * Sets (as xml) the "cpucores" attribute
             */
            void xsetCpucores(org.apache.xmlbeans.XmlString cpucores);
            
            /**
             * Gets the "physicalmemory" attribute
             */
            java.lang.String getPhysicalmemory();
            
            /**
             * Gets (as xml) the "physicalmemory" attribute
             */
            org.apache.xmlbeans.XmlString xgetPhysicalmemory();
            
            /**
             * Sets the "physicalmemory" attribute
             */
            void setPhysicalmemory(java.lang.String physicalmemory);
            
            /**
             * Sets (as xml) the "physicalmemory" attribute
             */
            void xsetPhysicalmemory(org.apache.xmlbeans.XmlString physicalmemory);
            
            /**
             * Gets the "virtualized" attribute
             */
            java.lang.String getVirtualized();
            
            /**
             * Gets (as xml) the "virtualized" attribute
             */
            org.apache.xmlbeans.XmlString xgetVirtualized();
            
            /**
             * True if has "virtualized" attribute
             */
            boolean isSetVirtualized();
            
            /**
             * Sets the "virtualized" attribute
             */
            void setVirtualized(java.lang.String virtualized);
            
            /**
             * Sets (as xml) the "virtualized" attribute
             */
            void xsetVirtualized(org.apache.xmlbeans.XmlString virtualized);
            
            /**
             * Unsets the "virtualized" attribute
             */
            void unsetVirtualized();
            
            /**
             * Gets the "cloud" attribute
             */
            java.lang.String getCloud();
            
            /**
             * Gets (as xml) the "cloud" attribute
             */
            org.apache.xmlbeans.XmlString xgetCloud();
            
            /**
             * True if has "cloud" attribute
             */
            boolean isSetCloud();
            
            /**
             * Sets the "cloud" attribute
             */
            void setCloud(java.lang.String cloud);
            
            /**
             * Sets (as xml) the "cloud" attribute
             */
            void xsetCloud(org.apache.xmlbeans.XmlString cloud);
            
            /**
             * Unsets the "cloud" attribute
             */
            void unsetCloud();
            
            /**
             * An XML charts(@).
             *
             * This is a complex type.
             */
            public interface Charts extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Charts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("chartse298elemtype");
                
                /**
                 * Gets array of all "chart" elements
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart[] getChartArray();
                
                /**
                 * Gets ith "chart" element
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart getChartArray(int i);
                
                /**
                 * Returns number of "chart" element
                 */
                int sizeOfChartArray();
                
                /**
                 * Sets array of all "chart" element
                 */
                void setChartArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart[] chartArray);
                
                /**
                 * Sets ith "chart" element
                 */
                void setChartArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart chart);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "chart" element
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart insertNewChart(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "chart" element
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart addNewChart();
                
                /**
                 * Removes the ith "chart" element
                 */
                void removeChart(int i);
                
                /**
                 * An XML chart(@).
                 *
                 * This is a complex type.
                 */
                public interface Chart extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Chart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("chart65f2elemtype");
                    
                    /**
                     * Gets array of all "series" elements
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series[] getSeriesArray();
                    
                    /**
                     * Gets ith "series" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series getSeriesArray(int i);
                    
                    /**
                     * Returns number of "series" element
                     */
                    int sizeOfSeriesArray();
                    
                    /**
                     * Sets array of all "series" element
                     */
                    void setSeriesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series[] seriesArray);
                    
                    /**
                     * Sets ith "series" element
                     */
                    void setSeriesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series series);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "series" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series insertNewSeries(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "series" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series addNewSeries();
                    
                    /**
                     * Removes the ith "series" element
                     */
                    void removeSeries(int i);
                    
                    /**
                     * Gets array of all "nic" elements
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic[] getNicArray();
                    
                    /**
                     * Gets ith "nic" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic getNicArray(int i);
                    
                    /**
                     * Returns number of "nic" element
                     */
                    int sizeOfNicArray();
                    
                    /**
                     * Sets array of all "nic" element
                     */
                    void setNicArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic[] nicArray);
                    
                    /**
                     * Sets ith "nic" element
                     */
                    void setNicArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic nic);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "nic" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic insertNewNic(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "nic" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic addNewNic();
                    
                    /**
                     * Removes the ith "nic" element
                     */
                    void removeNic(int i);
                    
                    /**
                     * Gets array of all "disks" elements
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks[] getDisksArray();
                    
                    /**
                     * Gets ith "disks" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks getDisksArray(int i);
                    
                    /**
                     * Returns number of "disks" element
                     */
                    int sizeOfDisksArray();
                    
                    /**
                     * Sets array of all "disks" element
                     */
                    void setDisksArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks[] disksArray);
                    
                    /**
                     * Sets ith "disks" element
                     */
                    void setDisksArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks disks);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "disks" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks insertNewDisks(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "disks" element
                     */
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks addNewDisks();
                    
                    /**
                     * Removes the ith "disks" element
                     */
                    void removeDisks(int i);
                    
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
                     * Gets the "startdate" attribute
                     */
                    java.util.Calendar getStartdate();
                    
                    /**
                     * Gets (as xml) the "startdate" attribute
                     */
                    org.apache.xmlbeans.XmlDateTime xgetStartdate();
                    
                    /**
                     * Sets the "startdate" attribute
                     */
                    void setStartdate(java.util.Calendar startdate);
                    
                    /**
                     * Sets (as xml) the "startdate" attribute
                     */
                    void xsetStartdate(org.apache.xmlbeans.XmlDateTime startdate);
                    
                    /**
                     * Gets the "enddate" attribute
                     */
                    java.util.Calendar getEnddate();
                    
                    /**
                     * Gets (as xml) the "enddate" attribute
                     */
                    org.apache.xmlbeans.XmlDateTime xgetEnddate();
                    
                    /**
                     * Sets the "enddate" attribute
                     */
                    void setEnddate(java.util.Calendar enddate);
                    
                    /**
                     * Sets (as xml) the "enddate" attribute
                     */
                    void xsetEnddate(org.apache.xmlbeans.XmlDateTime enddate);
                    
                    /**
                     * Gets the "health" attribute
                     */
                    java.lang.String getHealth();
                    
                    /**
                     * Gets (as xml) the "health" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetHealth();
                    
                    /**
                     * Sets the "health" attribute
                     */
                    void setHealth(java.lang.String health);
                    
                    /**
                     * Sets (as xml) the "health" attribute
                     */
                    void xsetHealth(org.apache.xmlbeans.XmlString health);
                    
                    /**
                     * An XML series(@).
                     *
                     * This is a complex type.
                     */
                    public interface Series extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Series.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("seriesfd75elemtype");
                      
                      /**
                       * Gets array of all "measurement" elements
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement[] getMeasurementArray();
                      
                      /**
                       * Gets ith "measurement" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement getMeasurementArray(int i);
                      
                      /**
                       * Returns number of "measurement" element
                       */
                      int sizeOfMeasurementArray();
                      
                      /**
                       * Sets array of all "measurement" element
                       */
                      void setMeasurementArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement[] measurementArray);
                      
                      /**
                       * Sets ith "measurement" element
                       */
                      void setMeasurementArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement measurement);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement insertNewMeasurement(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "measurement" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement addNewMeasurement();
                      
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
                       * Sets the "name" attribute
                       */
                      void setName(java.lang.String name);
                      
                      /**
                       * Sets (as xml) the "name" attribute
                       */
                      void xsetName(org.apache.xmlbeans.XmlString name);
                      
                      /**
                       * Gets the "datasetnumber" attribute
                       */
                      java.math.BigInteger getDatasetnumber();
                      
                      /**
                       * Gets (as xml) the "datasetnumber" attribute
                       */
                      org.apache.xmlbeans.XmlInteger xgetDatasetnumber();
                      
                      /**
                       * Sets the "datasetnumber" attribute
                       */
                      void setDatasetnumber(java.math.BigInteger datasetnumber);
                      
                      /**
                       * Sets (as xml) the "datasetnumber" attribute
                       */
                      void xsetDatasetnumber(org.apache.xmlbeans.XmlInteger datasetnumber);
                      
                      /**
                       * Gets the "seriesnumber" attribute
                       */
                      java.math.BigInteger getSeriesnumber();
                      
                      /**
                       * Gets (as xml) the "seriesnumber" attribute
                       */
                      org.apache.xmlbeans.XmlInteger xgetSeriesnumber();
                      
                      /**
                       * Sets the "seriesnumber" attribute
                       */
                      void setSeriesnumber(java.math.BigInteger seriesnumber);
                      
                      /**
                       * Sets (as xml) the "seriesnumber" attribute
                       */
                      void xsetSeriesnumber(org.apache.xmlbeans.XmlInteger seriesnumber);
                      
                      /**
                       * An XML measurement(@).
                       *
                       * This is a complex type.
                       */
                      public interface Measurement extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurement7c3delemtype");
                        
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
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement newInstance() {
                            return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series newInstance() {
                          return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML nic(@).
                     *
                     * This is a complex type.
                     */
                    public interface Nic extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Nic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("nic1e76elemtype");
                      
                      /**
                       * Gets array of all "series" elements
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series[] getSeriesArray();
                      
                      /**
                       * Gets ith "series" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series getSeriesArray(int i);
                      
                      /**
                       * Returns number of "series" element
                       */
                      int sizeOfSeriesArray();
                      
                      /**
                       * Sets array of all "series" element
                       */
                      void setSeriesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series[] seriesArray);
                      
                      /**
                       * Sets ith "series" element
                       */
                      void setSeriesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series series);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "series" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series insertNewSeries(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "series" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series addNewSeries();
                      
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
                       * Sets the "name" attribute
                       */
                      void setName(java.lang.String name);
                      
                      /**
                       * Sets (as xml) the "name" attribute
                       */
                      void xsetName(org.apache.xmlbeans.XmlString name);
                      
                      /**
                       * Gets the "bandwidth" attribute
                       */
                      java.lang.String getBandwidth();
                      
                      /**
                       * Gets (as xml) the "bandwidth" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetBandwidth();
                      
                      /**
                       * Sets the "bandwidth" attribute
                       */
                      void setBandwidth(java.lang.String bandwidth);
                      
                      /**
                       * Sets (as xml) the "bandwidth" attribute
                       */
                      void xsetBandwidth(org.apache.xmlbeans.XmlString bandwidth);
                      
                      /**
                       * An XML series(@).
                       *
                       * This is a complex type.
                       */
                      public interface Series extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Series.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("seriesc7b9elemtype");
                        
                        /**
                         * Gets array of all "measurement" elements
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement[] getMeasurementArray();
                        
                        /**
                         * Gets ith "measurement" element
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement getMeasurementArray(int i);
                        
                        /**
                         * Returns number of "measurement" element
                         */
                        int sizeOfMeasurementArray();
                        
                        /**
                         * Sets array of all "measurement" element
                         */
                        void setMeasurementArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement[] measurementArray);
                        
                        /**
                         * Sets ith "measurement" element
                         */
                        void setMeasurementArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement measurement);
                        
                        /**
                         * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement insertNewMeasurement(int i);
                        
                        /**
                         * Appends and returns a new empty value (as xml) as the last "measurement" element
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement addNewMeasurement();
                        
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
                         * Sets the "name" attribute
                         */
                        void setName(java.lang.String name);
                        
                        /**
                         * Sets (as xml) the "name" attribute
                         */
                        void xsetName(org.apache.xmlbeans.XmlString name);
                        
                        /**
                         * Gets the "datasetnumber" attribute
                         */
                        java.math.BigInteger getDatasetnumber();
                        
                        /**
                         * Gets (as xml) the "datasetnumber" attribute
                         */
                        org.apache.xmlbeans.XmlInteger xgetDatasetnumber();
                        
                        /**
                         * Sets the "datasetnumber" attribute
                         */
                        void setDatasetnumber(java.math.BigInteger datasetnumber);
                        
                        /**
                         * Sets (as xml) the "datasetnumber" attribute
                         */
                        void xsetDatasetnumber(org.apache.xmlbeans.XmlInteger datasetnumber);
                        
                        /**
                         * Gets the "seriesnumber" attribute
                         */
                        java.math.BigInteger getSeriesnumber();
                        
                        /**
                         * Gets (as xml) the "seriesnumber" attribute
                         */
                        org.apache.xmlbeans.XmlInteger xgetSeriesnumber();
                        
                        /**
                         * Sets the "seriesnumber" attribute
                         */
                        void setSeriesnumber(java.math.BigInteger seriesnumber);
                        
                        /**
                         * Sets (as xml) the "seriesnumber" attribute
                         */
                        void xsetSeriesnumber(org.apache.xmlbeans.XmlInteger seriesnumber);
                        
                        /**
                         * An XML measurement(@).
                         *
                         * This is a complex type.
                         */
                        public interface Measurement extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurement1081elemtype");
                          
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
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement newInstance() {
                              return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series newInstance() {
                            return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic newInstance() {
                          return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML disks(@).
                     *
                     * This is a complex type.
                     */
                    public interface Disks extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Disks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("disks21e4elemtype");
                      
                      /**
                       * Gets array of all "series" elements
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series[] getSeriesArray();
                      
                      /**
                       * Gets ith "series" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series getSeriesArray(int i);
                      
                      /**
                       * Returns number of "series" element
                       */
                      int sizeOfSeriesArray();
                      
                      /**
                       * Sets array of all "series" element
                       */
                      void setSeriesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series[] seriesArray);
                      
                      /**
                       * Sets ith "series" element
                       */
                      void setSeriesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series series);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "series" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series insertNewSeries(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "series" element
                       */
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series addNewSeries();
                      
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
                       * Sets the "name" attribute
                       */
                      void setName(java.lang.String name);
                      
                      /**
                       * Sets (as xml) the "name" attribute
                       */
                      void xsetName(org.apache.xmlbeans.XmlString name);
                      
                      /**
                       * Gets the "totalspace" attribute
                       */
                      java.lang.String getTotalspace();
                      
                      /**
                       * Gets (as xml) the "totalspace" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetTotalspace();
                      
                      /**
                       * Sets the "totalspace" attribute
                       */
                      void setTotalspace(java.lang.String totalspace);
                      
                      /**
                       * Sets (as xml) the "totalspace" attribute
                       */
                      void xsetTotalspace(org.apache.xmlbeans.XmlString totalspace);
                      
                      /**
                       * Gets the "freespace" attribute
                       */
                      java.lang.String getFreespace();
                      
                      /**
                       * Gets (as xml) the "freespace" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetFreespace();
                      
                      /**
                       * Sets the "freespace" attribute
                       */
                      void setFreespace(java.lang.String freespace);
                      
                      /**
                       * Sets (as xml) the "freespace" attribute
                       */
                      void xsetFreespace(org.apache.xmlbeans.XmlString freespace);
                      
                      /**
                       * Gets the "usedspace" attribute
                       */
                      java.lang.String getUsedspace();
                      
                      /**
                       * Gets (as xml) the "usedspace" attribute
                       */
                      org.apache.xmlbeans.XmlString xgetUsedspace();
                      
                      /**
                       * Sets the "usedspace" attribute
                       */
                      void setUsedspace(java.lang.String usedspace);
                      
                      /**
                       * Sets (as xml) the "usedspace" attribute
                       */
                      void xsetUsedspace(org.apache.xmlbeans.XmlString usedspace);
                      
                      /**
                       * An XML series(@).
                       *
                       * This is a complex type.
                       */
                      public interface Series extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Series.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("series8667elemtype");
                        
                        /**
                         * Gets array of all "measurement" elements
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement[] getMeasurementArray();
                        
                        /**
                         * Gets ith "measurement" element
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement getMeasurementArray(int i);
                        
                        /**
                         * Returns number of "measurement" element
                         */
                        int sizeOfMeasurementArray();
                        
                        /**
                         * Sets array of all "measurement" element
                         */
                        void setMeasurementArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement[] measurementArray);
                        
                        /**
                         * Sets ith "measurement" element
                         */
                        void setMeasurementArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement measurement);
                        
                        /**
                         * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement insertNewMeasurement(int i);
                        
                        /**
                         * Appends and returns a new empty value (as xml) as the last "measurement" element
                         */
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement addNewMeasurement();
                        
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
                         * Sets the "name" attribute
                         */
                        void setName(java.lang.String name);
                        
                        /**
                         * Sets (as xml) the "name" attribute
                         */
                        void xsetName(org.apache.xmlbeans.XmlString name);
                        
                        /**
                         * Gets the "datasetnumber" attribute
                         */
                        java.math.BigInteger getDatasetnumber();
                        
                        /**
                         * Gets (as xml) the "datasetnumber" attribute
                         */
                        org.apache.xmlbeans.XmlInteger xgetDatasetnumber();
                        
                        /**
                         * Sets the "datasetnumber" attribute
                         */
                        void setDatasetnumber(java.math.BigInteger datasetnumber);
                        
                        /**
                         * Sets (as xml) the "datasetnumber" attribute
                         */
                        void xsetDatasetnumber(org.apache.xmlbeans.XmlInteger datasetnumber);
                        
                        /**
                         * Gets the "seriesnumber" attribute
                         */
                        java.math.BigInteger getSeriesnumber();
                        
                        /**
                         * Gets (as xml) the "seriesnumber" attribute
                         */
                        org.apache.xmlbeans.XmlInteger xgetSeriesnumber();
                        
                        /**
                         * Sets the "seriesnumber" attribute
                         */
                        void setSeriesnumber(java.math.BigInteger seriesnumber);
                        
                        /**
                         * Sets (as xml) the "seriesnumber" attribute
                         */
                        void xsetSeriesnumber(org.apache.xmlbeans.XmlInteger seriesnumber);
                        
                        /**
                         * An XML measurement(@).
                         *
                         * This is a complex type.
                         */
                        public interface Measurement extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurementbd2felemtype");
                          
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
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement newInstance() {
                              return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series newInstance() {
                            return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks newInstance() {
                          return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart newInstance() {
                        return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts newInstance() {
                      return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.HostdashletDocument.Hostdashlet.Host.Charts newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML processes(@).
             *
             * This is a complex type.
             */
            public interface Processes extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Processes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("processes0ea0elemtype");
                
                /**
                 * Gets array of all "process" elements
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process[] getProcessArray();
                
                /**
                 * Gets ith "process" element
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process getProcessArray(int i);
                
                /**
                 * Returns number of "process" element
                 */
                int sizeOfProcessArray();
                
                /**
                 * Sets array of all "process" element
                 */
                void setProcessArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process[] processArray);
                
                /**
                 * Sets ith "process" element
                 */
                void setProcessArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process process);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "process" element
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process insertNewProcess(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "process" element
                 */
                noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process addNewProcess();
                
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
                 * An XML process(@).
                 *
                 * This is a complex type.
                 */
                public interface Process extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Process.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("processbc55elemtype");
                    
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
                     * Gets the "health" attribute
                     */
                    java.lang.String getHealth();
                    
                    /**
                     * Gets (as xml) the "health" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetHealth();
                    
                    /**
                     * Sets the "health" attribute
                     */
                    void setHealth(java.lang.String health);
                    
                    /**
                     * Sets (as xml) the "health" attribute
                     */
                    void xsetHealth(org.apache.xmlbeans.XmlString health);
                    
                    /**
                     * Gets the "cpu" attribute
                     */
                    java.lang.String getCpu();
                    
                    /**
                     * Gets (as xml) the "cpu" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetCpu();
                    
                    /**
                     * True if has "cpu" attribute
                     */
                    boolean isSetCpu();
                    
                    /**
                     * Sets the "cpu" attribute
                     */
                    void setCpu(java.lang.String cpu);
                    
                    /**
                     * Sets (as xml) the "cpu" attribute
                     */
                    void xsetCpu(org.apache.xmlbeans.XmlString cpu);
                    
                    /**
                     * Unsets the "cpu" attribute
                     */
                    void unsetCpu();
                    
                    /**
                     * Gets the "memory" attribute
                     */
                    java.lang.String getMemory();
                    
                    /**
                     * Gets (as xml) the "memory" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetMemory();
                    
                    /**
                     * True if has "memory" attribute
                     */
                    boolean isSetMemory();
                    
                    /**
                     * Sets the "memory" attribute
                     */
                    void setMemory(java.lang.String memory);
                    
                    /**
                     * Sets (as xml) the "memory" attribute
                     */
                    void xsetMemory(org.apache.xmlbeans.XmlString memory);
                    
                    /**
                     * Unsets the "memory" attribute
                     */
                    void unsetMemory();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process newInstance() {
                        return (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.HostdashletDocument.Hostdashlet.Host.Processes newInstance() {
                      return (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.HostdashletDocument.Hostdashlet.Host.Processes newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.HostdashletDocument.Hostdashlet.Host newInstance() {
                  return (noNamespace.HostdashletDocument.Hostdashlet.Host) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.HostdashletDocument.Hostdashlet.Host newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.HostdashletDocument.Hostdashlet.Host) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.HostdashletDocument.Hostdashlet newInstance() {
              return (noNamespace.HostdashletDocument.Hostdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.HostdashletDocument.Hostdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.HostdashletDocument.Hostdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.HostdashletDocument newInstance() {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.HostdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.HostdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.HostdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.HostdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.HostdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.HostdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.HostdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.HostdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.HostdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.HostdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.HostdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.HostdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.HostdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.HostdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.HostdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.HostdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.HostdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.HostdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
