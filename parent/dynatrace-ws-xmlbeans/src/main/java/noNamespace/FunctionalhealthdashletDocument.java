/*
 * An XML document type.
 * Localname: functionalhealthdashlet
 * Namespace: 
 * Java type: noNamespace.FunctionalhealthdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one functionalhealthdashlet(@) element.
 *
 * This is a complex type.
 */
public interface FunctionalhealthdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FunctionalhealthdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("functionalhealthdashletc1b1doctype");
    
    /**
     * Gets the "functionalhealthdashlet" element
     */
    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet getFunctionalhealthdashlet();
    
    /**
     * Sets the "functionalhealthdashlet" element
     */
    void setFunctionalhealthdashlet(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet functionalhealthdashlet);
    
    /**
     * Appends and returns a new empty "functionalhealthdashlet" element
     */
    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet addNewFunctionalhealthdashlet();
    
    /**
     * An XML functionalhealthdashlet(@).
     *
     * This is a complex type.
     */
    public interface Functionalhealthdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Functionalhealthdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("functionalhealthdashlet14f7elemtype");
        
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
         * Gets array of all "health" elements
         */
        noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health[] getHealthArray();
        
        /**
         * Gets ith "health" element
         */
        noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health getHealthArray(int i);
        
        /**
         * Returns number of "health" element
         */
        int sizeOfHealthArray();
        
        /**
         * Sets array of all "health" element
         */
        void setHealthArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health[] healthArray);
        
        /**
         * Sets ith "health" element
         */
        void setHealthArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health health);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "health" element
         */
        noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health insertNewHealth(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "health" element
         */
        noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health addNewHealth();
        
        /**
         * Removes the ith "health" element
         */
        void removeHealth(int i);
        
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
         * An XML health(@).
         *
         * This is a complex type.
         */
        public interface Health extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Health.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("healthf7dfelemtype");
            
            /**
             * Gets array of all "measurement" elements
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement[] getMeasurementArray();
            
            /**
             * Gets ith "measurement" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement getMeasurementArray(int i);
            
            /**
             * Returns number of "measurement" element
             */
            int sizeOfMeasurementArray();
            
            /**
             * Sets array of all "measurement" element
             */
            void setMeasurementArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement[] measurementArray);
            
            /**
             * Sets ith "measurement" element
             */
            void setMeasurementArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement measurement);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "measurement" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement insertNewMeasurement(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "measurement" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement addNewMeasurement();
            
            /**
             * Removes the ith "measurement" element
             */
            void removeMeasurement(int i);
            
            /**
             * Gets array of all "errorhotspotsbyapplication" elements
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication[] getErrorhotspotsbyapplicationArray();
            
            /**
             * Gets ith "errorhotspotsbyapplication" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication getErrorhotspotsbyapplicationArray(int i);
            
            /**
             * Returns number of "errorhotspotsbyapplication" element
             */
            int sizeOfErrorhotspotsbyapplicationArray();
            
            /**
             * Sets array of all "errorhotspotsbyapplication" element
             */
            void setErrorhotspotsbyapplicationArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication[] errorhotspotsbyapplicationArray);
            
            /**
             * Sets ith "errorhotspotsbyapplication" element
             */
            void setErrorhotspotsbyapplicationArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication errorhotspotsbyapplication);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "errorhotspotsbyapplication" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication insertNewErrorhotspotsbyapplication(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "errorhotspotsbyapplication" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication addNewErrorhotspotsbyapplication();
            
            /**
             * Removes the ith "errorhotspotsbyapplication" element
             */
            void removeErrorhotspotsbyapplication(int i);
            
            /**
             * Gets array of all "errorhotspots" elements
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots[] getErrorhotspotsArray();
            
            /**
             * Gets ith "errorhotspots" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots getErrorhotspotsArray(int i);
            
            /**
             * Returns number of "errorhotspots" element
             */
            int sizeOfErrorhotspotsArray();
            
            /**
             * Sets array of all "errorhotspots" element
             */
            void setErrorhotspotsArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots[] errorhotspotsArray);
            
            /**
             * Sets ith "errorhotspots" element
             */
            void setErrorhotspotsArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots errorhotspots);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "errorhotspots" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots insertNewErrorhotspots(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "errorhotspots" element
             */
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots addNewErrorhotspots();
            
            /**
             * Removes the ith "errorhotspots" element
             */
            void removeErrorhotspots(int i);
            
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
             * An XML measurement(@).
             *
             * This is a complex type.
             */
            public interface Measurement extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurement76a7elemtype");
                
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
                 * Gets the "successrate" attribute
                 */
                double getSuccessrate();
                
                /**
                 * Gets (as xml) the "successrate" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSuccessrate();
                
                /**
                 * True if has "successrate" attribute
                 */
                boolean isSetSuccessrate();
                
                /**
                 * Sets the "successrate" attribute
                 */
                void setSuccessrate(double successrate);
                
                /**
                 * Sets (as xml) the "successrate" attribute
                 */
                void xsetSuccessrate(org.apache.xmlbeans.XmlDouble successrate);
                
                /**
                 * Unsets the "successrate" attribute
                 */
                void unsetSuccessrate();
                
                /**
                 * Gets the "errorrate" attribute
                 */
                double getErrorrate();
                
                /**
                 * Gets (as xml) the "errorrate" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetErrorrate();
                
                /**
                 * True if has "errorrate" attribute
                 */
                boolean isSetErrorrate();
                
                /**
                 * Sets the "errorrate" attribute
                 */
                void setErrorrate(double errorrate);
                
                /**
                 * Sets (as xml) the "errorrate" attribute
                 */
                void xsetErrorrate(org.apache.xmlbeans.XmlDouble errorrate);
                
                /**
                 * Unsets the "errorrate" attribute
                 */
                void unsetErrorrate();
                
                /**
                 * Gets the "transactioncount" attribute
                 */
                double getTransactioncount();
                
                /**
                 * Gets (as xml) the "transactioncount" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTransactioncount();
                
                /**
                 * True if has "transactioncount" attribute
                 */
                boolean isSetTransactioncount();
                
                /**
                 * Sets the "transactioncount" attribute
                 */
                void setTransactioncount(double transactioncount);
                
                /**
                 * Sets (as xml) the "transactioncount" attribute
                 */
                void xsetTransactioncount(org.apache.xmlbeans.XmlDouble transactioncount);
                
                /**
                 * Unsets the "transactioncount" attribute
                 */
                void unsetTransactioncount();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement newInstance() {
                      return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML errorhotspotsbyapplication(@).
             *
             * This is a complex type.
             */
            public interface Errorhotspotsbyapplication extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errorhotspotsbyapplication.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errorhotspotsbyapplicationc366elemtype");
                
                /**
                 * Gets array of all "measurement" elements
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement[] getMeasurementArray();
                
                /**
                 * Gets ith "measurement" element
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement getMeasurementArray(int i);
                
                /**
                 * Returns number of "measurement" element
                 */
                int sizeOfMeasurementArray();
                
                /**
                 * Sets array of all "measurement" element
                 */
                void setMeasurementArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement[] measurementArray);
                
                /**
                 * Sets ith "measurement" element
                 */
                void setMeasurementArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement measurement);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement insertNewMeasurement(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measurement" element
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement addNewMeasurement();
                
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurement199eelemtype");
                    
                    /**
                     * Gets the "hotspot" attribute
                     */
                    java.lang.String getHotspot();
                    
                    /**
                     * Gets (as xml) the "hotspot" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetHotspot();
                    
                    /**
                     * Sets the "hotspot" attribute
                     */
                    void setHotspot(java.lang.String hotspot);
                    
                    /**
                     * Sets (as xml) the "hotspot" attribute
                     */
                    void xsetHotspot(org.apache.xmlbeans.XmlString hotspot);
                    
                    /**
                     * Gets the "value" attribute
                     */
                    double getValue();
                    
                    /**
                     * Gets (as xml) the "value" attribute
                     */
                    org.apache.xmlbeans.XmlDouble xgetValue();
                    
                    /**
                     * Sets the "value" attribute
                     */
                    void setValue(double value);
                    
                    /**
                     * Sets (as xml) the "value" attribute
                     */
                    void xsetValue(org.apache.xmlbeans.XmlDouble value);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement newInstance() {
                        return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication newInstance() {
                      return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML errorhotspots(@).
             *
             * This is a complex type.
             */
            public interface Errorhotspots extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errorhotspots.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errorhotspots9cd7elemtype");
                
                /**
                 * Gets array of all "measurement" elements
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement[] getMeasurementArray();
                
                /**
                 * Gets ith "measurement" element
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement getMeasurementArray(int i);
                
                /**
                 * Returns number of "measurement" element
                 */
                int sizeOfMeasurementArray();
                
                /**
                 * Sets array of all "measurement" element
                 */
                void setMeasurementArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement[] measurementArray);
                
                /**
                 * Sets ith "measurement" element
                 */
                void setMeasurementArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement measurement);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement insertNewMeasurement(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measurement" element
                 */
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement addNewMeasurement();
                
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measurement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measurement8b9felemtype");
                    
                    /**
                     * Gets the "hotspot" attribute
                     */
                    java.lang.String getHotspot();
                    
                    /**
                     * Gets (as xml) the "hotspot" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetHotspot();
                    
                    /**
                     * Sets the "hotspot" attribute
                     */
                    void setHotspot(java.lang.String hotspot);
                    
                    /**
                     * Sets (as xml) the "hotspot" attribute
                     */
                    void xsetHotspot(org.apache.xmlbeans.XmlString hotspot);
                    
                    /**
                     * Gets the "value" attribute
                     */
                    double getValue();
                    
                    /**
                     * Gets (as xml) the "value" attribute
                     */
                    org.apache.xmlbeans.XmlDouble xgetValue();
                    
                    /**
                     * Sets the "value" attribute
                     */
                    void setValue(double value);
                    
                    /**
                     * Sets (as xml) the "value" attribute
                     */
                    void xsetValue(org.apache.xmlbeans.XmlDouble value);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement newInstance() {
                        return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots newInstance() {
                      return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health newInstance() {
                  return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet newInstance() {
              return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.FunctionalhealthdashletDocument newInstance() {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.FunctionalhealthdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.FunctionalhealthdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.FunctionalhealthdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.FunctionalhealthdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.FunctionalhealthdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.FunctionalhealthdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
