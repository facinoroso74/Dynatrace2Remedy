/*
 * An XML document type.
 * Localname: chartdashlet
 * Namespace: 
 * Java type: noNamespace.ChartdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one chartdashlet(@) element.
 *
 * This is a complex type.
 */
public interface ChartdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChartdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("chartdashletfea4doctype");
    
    /**
     * Gets the "chartdashlet" element
     */
    noNamespace.ChartdashletDocument.Chartdashlet getChartdashlet();
    
    /**
     * Sets the "chartdashlet" element
     */
    void setChartdashlet(noNamespace.ChartdashletDocument.Chartdashlet chartdashlet);
    
    /**
     * Appends and returns a new empty "chartdashlet" element
     */
    noNamespace.ChartdashletDocument.Chartdashlet addNewChartdashlet();
    
    /**
     * An XML chartdashlet(@).
     *
     * This is a complex type.
     */
    public interface Chartdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Chartdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("chartdashlet078delemtype");
        
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
         * Gets the "measures" element
         */
        noNamespace.ChartdashletDocument.Chartdashlet.Measures getMeasures();
        
        /**
         * True if has "measures" element
         */
        boolean isSetMeasures();
        
        /**
         * Sets the "measures" element
         */
        void setMeasures(noNamespace.ChartdashletDocument.Chartdashlet.Measures measures);
        
        /**
         * Appends and returns a new empty "measures" element
         */
        noNamespace.ChartdashletDocument.Chartdashlet.Measures addNewMeasures();
        
        /**
         * Unsets the "measures" element
         */
        void unsetMeasures();
        
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
         * Gets the "showabsolutevalues" attribute
         */
        java.lang.String getShowabsolutevalues();
        
        /**
         * Gets (as xml) the "showabsolutevalues" attribute
         */
        org.apache.xmlbeans.XmlString xgetShowabsolutevalues();
        
        /**
         * Sets the "showabsolutevalues" attribute
         */
        void setShowabsolutevalues(java.lang.String showabsolutevalues);
        
        /**
         * Sets (as xml) the "showabsolutevalues" attribute
         */
        void xsetShowabsolutevalues(org.apache.xmlbeans.XmlString showabsolutevalues);
        
        /**
         * An XML measures(@).
         *
         * This is a complex type.
         */
        public interface Measures extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measures.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measures312eelemtype");
            
            /**
             * Gets array of all "measure" elements
             */
            noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure[] getMeasureArray();
            
            /**
             * Gets ith "measure" element
             */
            noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure getMeasureArray(int i);
            
            /**
             * Returns number of "measure" element
             */
            int sizeOfMeasureArray();
            
            /**
             * Sets array of all "measure" element
             */
            void setMeasureArray(noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure[] measureArray);
            
            /**
             * Sets ith "measure" element
             */
            void setMeasureArray(int i, noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure measure);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "measure" element
             */
            noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure insertNewMeasure(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "measure" element
             */
            noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure addNewMeasure();
            
            /**
             * Removes the ith "measure" element
             */
            void removeMeasure(int i);
            
            /**
             * Gets the "structuretype" attribute
             */
            java.lang.String getStructuretype();
            
            /**
             * Gets (as xml) the "structuretype" attribute
             */
            org.apache.xmlbeans.XmlString xgetStructuretype();
            
            /**
             * Sets the "structuretype" attribute
             */
            void setStructuretype(java.lang.String structuretype);
            
            /**
             * Sets (as xml) the "structuretype" attribute
             */
            void xsetStructuretype(org.apache.xmlbeans.XmlString structuretype);
            
            /**
             * An XML measure(@).
             *
             * This is a complex type.
             */
            public interface Measure extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Measure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("measure5c94elemtype");
                
                /**
                 * Gets array of all "measurement" elements
                 */
                noNamespace.MeasurementDocument.Measurement[] getMeasurementArray();
                
                /**
                 * Gets ith "measurement" element
                 */
                noNamespace.MeasurementDocument.Measurement getMeasurementArray(int i);
                
                /**
                 * Returns number of "measurement" element
                 */
                int sizeOfMeasurementArray();
                
                /**
                 * Sets array of all "measurement" element
                 */
                void setMeasurementArray(noNamespace.MeasurementDocument.Measurement[] measurementArray);
                
                /**
                 * Sets ith "measurement" element
                 */
                void setMeasurementArray(int i, noNamespace.MeasurementDocument.Measurement measurement);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                 */
                noNamespace.MeasurementDocument.Measurement insertNewMeasurement(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measurement" element
                 */
                noNamespace.MeasurementDocument.Measurement addNewMeasurement();
                
                /**
                 * Removes the ith "measurement" element
                 */
                void removeMeasurement(int i);
                
                /**
                 * Gets array of all "measure" elements
                 */
                noNamespace.MeasureDocument.Measure[] getMeasureArray();
                
                /**
                 * Gets ith "measure" element
                 */
                noNamespace.MeasureDocument.Measure getMeasureArray(int i);
                
                /**
                 * Returns number of "measure" element
                 */
                int sizeOfMeasureArray();
                
                /**
                 * Sets array of all "measure" element
                 */
                void setMeasureArray(noNamespace.MeasureDocument.Measure[] measureArray);
                
                /**
                 * Sets ith "measure" element
                 */
                void setMeasureArray(int i, noNamespace.MeasureDocument.Measure measure);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "measure" element
                 */
                noNamespace.MeasureDocument.Measure insertNewMeasure(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measure" element
                 */
                noNamespace.MeasureDocument.Measure addNewMeasure();
                
                /**
                 * Removes the ith "measure" element
                 */
                void removeMeasure(int i);
                
                /**
                 * Gets the "measure" attribute
                 */
                java.lang.String getMeasure2();
                
                /**
                 * Gets (as xml) the "measure" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMeasure2();
                
                /**
                 * True if has "measure" attribute
                 */
                boolean isSetMeasure2();
                
                /**
                 * Sets the "measure" attribute
                 */
                void setMeasure2(java.lang.String measure2);
                
                /**
                 * Sets (as xml) the "measure" attribute
                 */
                void xsetMeasure2(org.apache.xmlbeans.XmlString measure2);
                
                /**
                 * Unsets the "measure" attribute
                 */
                void unsetMeasure2();
                
                /**
                 * Gets the "agenthost" attribute
                 */
                java.lang.String getAgenthost();
                
                /**
                 * Gets (as xml) the "agenthost" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgenthost();
                
                /**
                 * True if has "agenthost" attribute
                 */
                boolean isSetAgenthost();
                
                /**
                 * Sets the "agenthost" attribute
                 */
                void setAgenthost(java.lang.String agenthost);
                
                /**
                 * Sets (as xml) the "agenthost" attribute
                 */
                void xsetAgenthost(org.apache.xmlbeans.XmlString agenthost);
                
                /**
                 * Unsets the "agenthost" attribute
                 */
                void unsetAgenthost();
                
                /**
                 * Gets the "agentgroup" attribute
                 */
                java.lang.String getAgentgroup();
                
                /**
                 * Gets (as xml) the "agentgroup" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgentgroup();
                
                /**
                 * True if has "agentgroup" attribute
                 */
                boolean isSetAgentgroup();
                
                /**
                 * Sets the "agentgroup" attribute
                 */
                void setAgentgroup(java.lang.String agentgroup);
                
                /**
                 * Sets (as xml) the "agentgroup" attribute
                 */
                void xsetAgentgroup(org.apache.xmlbeans.XmlString agentgroup);
                
                /**
                 * Unsets the "agentgroup" attribute
                 */
                void unsetAgentgroup();
                
                /**
                 * Gets the "color" attribute
                 */
                java.lang.String getColor();
                
                /**
                 * Gets (as xml) the "color" attribute
                 */
                org.apache.xmlbeans.XmlString xgetColor();
                
                /**
                 * True if has "color" attribute
                 */
                boolean isSetColor();
                
                /**
                 * Sets the "color" attribute
                 */
                void setColor(java.lang.String color);
                
                /**
                 * Sets (as xml) the "color" attribute
                 */
                void xsetColor(org.apache.xmlbeans.XmlString color);
                
                /**
                 * Unsets the "color" attribute
                 */
                void unsetColor();
                
                /**
                 * Gets the "aggregation" attribute
                 */
                java.lang.String getAggregation();
                
                /**
                 * Gets (as xml) the "aggregation" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAggregation();
                
                /**
                 * True if has "aggregation" attribute
                 */
                boolean isSetAggregation();
                
                /**
                 * Sets the "aggregation" attribute
                 */
                void setAggregation(java.lang.String aggregation);
                
                /**
                 * Sets (as xml) the "aggregation" attribute
                 */
                void xsetAggregation(org.apache.xmlbeans.XmlString aggregation);
                
                /**
                 * Unsets the "aggregation" attribute
                 */
                void unsetAggregation();
                
                /**
                 * Gets the "avg" attribute
                 */
                double getAvg();
                
                /**
                 * Gets (as xml) the "avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetAvg();
                
                /**
                 * True if has "avg" attribute
                 */
                boolean isSetAvg();
                
                /**
                 * Sets the "avg" attribute
                 */
                void setAvg(double avg);
                
                /**
                 * Sets (as xml) the "avg" attribute
                 */
                void xsetAvg(org.apache.xmlbeans.XmlDouble avg);
                
                /**
                 * Unsets the "avg" attribute
                 */
                void unsetAvg();
                
                /**
                 * Gets the "unit" attribute
                 */
                java.lang.String getUnit();
                
                /**
                 * Gets (as xml) the "unit" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUnit();
                
                /**
                 * True if has "unit" attribute
                 */
                boolean isSetUnit();
                
                /**
                 * Sets the "unit" attribute
                 */
                void setUnit(java.lang.String unit);
                
                /**
                 * Sets (as xml) the "unit" attribute
                 */
                void xsetUnit(org.apache.xmlbeans.XmlString unit);
                
                /**
                 * Unsets the "unit" attribute
                 */
                void unsetUnit();
                
                /**
                 * Gets the "min" attribute
                 */
                double getMin();
                
                /**
                 * Gets (as xml) the "min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetMin();
                
                /**
                 * True if has "min" attribute
                 */
                boolean isSetMin();
                
                /**
                 * Sets the "min" attribute
                 */
                void setMin(double min);
                
                /**
                 * Sets (as xml) the "min" attribute
                 */
                void xsetMin(org.apache.xmlbeans.XmlDouble min);
                
                /**
                 * Unsets the "min" attribute
                 */
                void unsetMin();
                
                /**
                 * Gets the "max" attribute
                 */
                double getMax();
                
                /**
                 * Gets (as xml) the "max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetMax();
                
                /**
                 * True if has "max" attribute
                 */
                boolean isSetMax();
                
                /**
                 * Sets the "max" attribute
                 */
                void setMax(double max);
                
                /**
                 * Sets (as xml) the "max" attribute
                 */
                void xsetMax(org.apache.xmlbeans.XmlDouble max);
                
                /**
                 * Unsets the "max" attribute
                 */
                void unsetMax();
                
                /**
                 * Gets the "sum" attribute
                 */
                double getSum();
                
                /**
                 * Gets (as xml) the "sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSum();
                
                /**
                 * True if has "sum" attribute
                 */
                boolean isSetSum();
                
                /**
                 * Sets the "sum" attribute
                 */
                void setSum(double sum);
                
                /**
                 * Sets (as xml) the "sum" attribute
                 */
                void xsetSum(org.apache.xmlbeans.XmlDouble sum);
                
                /**
                 * Unsets the "sum" attribute
                 */
                void unsetSum();
                
                /**
                 * Gets the "lastvalue" attribute
                 */
                double getLastvalue();
                
                /**
                 * Gets (as xml) the "lastvalue" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLastvalue();
                
                /**
                 * True if has "lastvalue" attribute
                 */
                boolean isSetLastvalue();
                
                /**
                 * Sets the "lastvalue" attribute
                 */
                void setLastvalue(double lastvalue);
                
                /**
                 * Sets (as xml) the "lastvalue" attribute
                 */
                void xsetLastvalue(org.apache.xmlbeans.XmlDouble lastvalue);
                
                /**
                 * Unsets the "lastvalue" attribute
                 */
                void unsetLastvalue();
                
                /**
                 * Gets the "count" attribute
                 */
                java.math.BigInteger getCount();
                
                /**
                 * Gets (as xml) the "count" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetCount();
                
                /**
                 * True if has "count" attribute
                 */
                boolean isSetCount();
                
                /**
                 * Sets the "count" attribute
                 */
                void setCount(java.math.BigInteger count);
                
                /**
                 * Sets (as xml) the "count" attribute
                 */
                void xsetCount(org.apache.xmlbeans.XmlInteger count);
                
                /**
                 * Unsets the "count" attribute
                 */
                void unsetCount();
                
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
                 * Gets the "rate" attribute
                 */
                java.lang.String getRate();
                
                /**
                 * Gets (as xml) the "rate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRate();
                
                /**
                 * True if has "rate" attribute
                 */
                boolean isSetRate();
                
                /**
                 * Sets the "rate" attribute
                 */
                void setRate(java.lang.String rate);
                
                /**
                 * Sets (as xml) the "rate" attribute
                 */
                void xsetRate(org.apache.xmlbeans.XmlString rate);
                
                /**
                 * Unsets the "rate" attribute
                 */
                void unsetRate();
                
                /**
                 * Gets the "scale" attribute
                 */
                java.lang.String getScale();
                
                /**
                 * Gets (as xml) the "scale" attribute
                 */
                org.apache.xmlbeans.XmlString xgetScale();
                
                /**
                 * True if has "scale" attribute
                 */
                boolean isSetScale();
                
                /**
                 * Sets the "scale" attribute
                 */
                void setScale(java.lang.String scale);
                
                /**
                 * Sets (as xml) the "scale" attribute
                 */
                void xsetScale(org.apache.xmlbeans.XmlString scale);
                
                /**
                 * Unsets the "scale" attribute
                 */
                void unsetScale();
                
                /**
                 * Gets the "drawingorder" attribute
                 */
                java.math.BigInteger getDrawingorder();
                
                /**
                 * Gets (as xml) the "drawingorder" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetDrawingorder();
                
                /**
                 * True if has "drawingorder" attribute
                 */
                boolean isSetDrawingorder();
                
                /**
                 * Sets the "drawingorder" attribute
                 */
                void setDrawingorder(java.math.BigInteger drawingorder);
                
                /**
                 * Sets (as xml) the "drawingorder" attribute
                 */
                void xsetDrawingorder(org.apache.xmlbeans.XmlInteger drawingorder);
                
                /**
                 * Unsets the "drawingorder" attribute
                 */
                void unsetDrawingorder();
                
                /**
                 * Gets the "parent" attribute
                 */
                java.lang.String getParent();
                
                /**
                 * Gets (as xml) the "parent" attribute
                 */
                org.apache.xmlbeans.XmlString xgetParent();
                
                /**
                 * True if has "parent" attribute
                 */
                boolean isSetParent();
                
                /**
                 * Sets the "parent" attribute
                 */
                void setParent(java.lang.String parent);
                
                /**
                 * Sets (as xml) the "parent" attribute
                 */
                void xsetParent(org.apache.xmlbeans.XmlString parent);
                
                /**
                 * Unsets the "parent" attribute
                 */
                void unsetParent();
                
                /**
                 * Gets the "application" attribute
                 */
                java.lang.String getApplication();
                
                /**
                 * Gets (as xml) the "application" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApplication();
                
                /**
                 * True if has "application" attribute
                 */
                boolean isSetApplication();
                
                /**
                 * Sets the "application" attribute
                 */
                void setApplication(java.lang.String application);
                
                /**
                 * Sets (as xml) the "application" attribute
                 */
                void xsetApplication(org.apache.xmlbeans.XmlString application);
                
                /**
                 * Unsets the "application" attribute
                 */
                void unsetApplication();
                
                /**
                 * Gets the "splitting" attribute
                 */
                java.lang.String getSplitting();
                
                /**
                 * Gets (as xml) the "splitting" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSplitting();
                
                /**
                 * True if has "splitting" attribute
                 */
                boolean isSetSplitting();
                
                /**
                 * Sets the "splitting" attribute
                 */
                void setSplitting(java.lang.String splitting);
                
                /**
                 * Sets (as xml) the "splitting" attribute
                 */
                void xsetSplitting(org.apache.xmlbeans.XmlString splitting);
                
                /**
                 * Unsets the "splitting" attribute
                 */
                void unsetSplitting();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure newInstance() {
                      return (noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ChartdashletDocument.Chartdashlet.Measures.Measure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ChartdashletDocument.Chartdashlet.Measures newInstance() {
                  return (noNamespace.ChartdashletDocument.Chartdashlet.Measures) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ChartdashletDocument.Chartdashlet.Measures newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ChartdashletDocument.Chartdashlet.Measures) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ChartdashletDocument.Chartdashlet newInstance() {
              return (noNamespace.ChartdashletDocument.Chartdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ChartdashletDocument.Chartdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ChartdashletDocument.Chartdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ChartdashletDocument newInstance() {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ChartdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ChartdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ChartdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ChartdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ChartdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ChartdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ChartdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ChartdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ChartdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ChartdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ChartdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ChartdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ChartdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ChartdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ChartdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ChartdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ChartdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ChartdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
