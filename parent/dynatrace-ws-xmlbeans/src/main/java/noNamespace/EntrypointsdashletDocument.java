/*
 * An XML document type.
 * Localname: entrypointsdashlet
 * Namespace: 
 * Java type: noNamespace.EntrypointsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one entrypointsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface EntrypointsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntrypointsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("entrypointsdashlet9c0ddoctype");
    
    /**
     * Gets the "entrypointsdashlet" element
     */
    noNamespace.EntrypointsdashletDocument.Entrypointsdashlet getEntrypointsdashlet();
    
    /**
     * Sets the "entrypointsdashlet" element
     */
    void setEntrypointsdashlet(noNamespace.EntrypointsdashletDocument.Entrypointsdashlet entrypointsdashlet);
    
    /**
     * Appends and returns a new empty "entrypointsdashlet" element
     */
    noNamespace.EntrypointsdashletDocument.Entrypointsdashlet addNewEntrypointsdashlet();
    
    /**
     * An XML entrypointsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Entrypointsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entrypointsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("entrypointsdashletbfadelemtype");
        
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
         * Gets the "entrypoints" element
         */
        noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints getEntrypoints();
        
        /**
         * True if has "entrypoints" element
         */
        boolean isSetEntrypoints();
        
        /**
         * Sets the "entrypoints" element
         */
        void setEntrypoints(noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints entrypoints);
        
        /**
         * Appends and returns a new empty "entrypoints" element
         */
        noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints addNewEntrypoints();
        
        /**
         * Unsets the "entrypoints" element
         */
        void unsetEntrypoints();
        
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
         * Gets the "displaysource" attribute
         */
        java.lang.String getDisplaysource();
        
        /**
         * Gets (as xml) the "displaysource" attribute
         */
        org.apache.xmlbeans.XmlString xgetDisplaysource();
        
        /**
         * Sets the "displaysource" attribute
         */
        void setDisplaysource(java.lang.String displaysource);
        
        /**
         * Sets (as xml) the "displaysource" attribute
         */
        void xsetDisplaysource(org.apache.xmlbeans.XmlString displaysource);
        
        /**
         * An XML entrypoints(@).
         *
         * This is a complex type.
         */
        public interface Entrypoints extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entrypoints.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("entrypoints22beelemtype");
            
            /**
             * Gets array of all "entrypoint" elements
             */
            noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint[] getEntrypointArray();
            
            /**
             * Gets ith "entrypoint" element
             */
            noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint getEntrypointArray(int i);
            
            /**
             * Returns number of "entrypoint" element
             */
            int sizeOfEntrypointArray();
            
            /**
             * Sets array of all "entrypoint" element
             */
            void setEntrypointArray(noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint[] entrypointArray);
            
            /**
             * Sets ith "entrypoint" element
             */
            void setEntrypointArray(int i, noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint entrypoint);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "entrypoint" element
             */
            noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint insertNewEntrypoint(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "entrypoint" element
             */
            noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint addNewEntrypoint();
            
            /**
             * Removes the ith "entrypoint" element
             */
            void removeEntrypoint(int i);
            
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
             * An XML entrypoint(@).
             *
             * This is a complex type.
             */
            public interface Entrypoint extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entrypoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("entrypointa1a8elemtype");
                
                /**
                 * Gets the "point" attribute
                 */
                java.lang.String getPoint();
                
                /**
                 * Gets (as xml) the "point" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPoint();
                
                /**
                 * True if has "point" attribute
                 */
                boolean isSetPoint();
                
                /**
                 * Sets the "point" attribute
                 */
                void setPoint(java.lang.String point);
                
                /**
                 * Sets (as xml) the "point" attribute
                 */
                void xsetPoint(org.apache.xmlbeans.XmlString point);
                
                /**
                 * Unsets the "point" attribute
                 */
                void unsetPoint();
                
                /**
                 * Gets the "method" attribute
                 */
                java.lang.String getMethod();
                
                /**
                 * Gets (as xml) the "method" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMethod();
                
                /**
                 * True if has "method" attribute
                 */
                boolean isSetMethod();
                
                /**
                 * Sets the "method" attribute
                 */
                void setMethod(java.lang.String method);
                
                /**
                 * Sets (as xml) the "method" attribute
                 */
                void xsetMethod(org.apache.xmlbeans.XmlString method);
                
                /**
                 * Unsets the "method" attribute
                 */
                void unsetMethod();
                
                /**
                 * Gets the "class" attribute
                 */
                java.lang.String getClass1();
                
                /**
                 * Gets (as xml) the "class" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClass1();
                
                /**
                 * True if has "class" attribute
                 */
                boolean isSetClass1();
                
                /**
                 * Sets the "class" attribute
                 */
                void setClass1(java.lang.String class1);
                
                /**
                 * Sets (as xml) the "class" attribute
                 */
                void xsetClass1(org.apache.xmlbeans.XmlString class1);
                
                /**
                 * Unsets the "class" attribute
                 */
                void unsetClass1();
                
                /**
                 * Gets the "agent" attribute
                 */
                java.lang.String getAgent();
                
                /**
                 * Gets (as xml) the "agent" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgent();
                
                /**
                 * True if has "agent" attribute
                 */
                boolean isSetAgent();
                
                /**
                 * Sets the "agent" attribute
                 */
                void setAgent(java.lang.String agent);
                
                /**
                 * Sets (as xml) the "agent" attribute
                 */
                void xsetAgent(org.apache.xmlbeans.XmlString agent);
                
                /**
                 * Unsets the "agent" attribute
                 */
                void unsetAgent();
                
                /**
                 * Gets the "api" attribute
                 */
                java.lang.String getApi();
                
                /**
                 * Gets (as xml) the "api" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApi();
                
                /**
                 * True if has "api" attribute
                 */
                boolean isSetApi();
                
                /**
                 * Sets the "api" attribute
                 */
                void setApi(java.lang.String api);
                
                /**
                 * Sets (as xml) the "api" attribute
                 */
                void xsetApi(org.apache.xmlbeans.XmlString api);
                
                /**
                 * Unsets the "api" attribute
                 */
                void unsetApi();
                
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
                 * Gets the "exec_avg" attribute
                 */
                double getExecAvg();
                
                /**
                 * Gets (as xml) the "exec_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecAvg();
                
                /**
                 * True if has "exec_avg" attribute
                 */
                boolean isSetExecAvg();
                
                /**
                 * Sets the "exec_avg" attribute
                 */
                void setExecAvg(double execAvg);
                
                /**
                 * Sets (as xml) the "exec_avg" attribute
                 */
                void xsetExecAvg(org.apache.xmlbeans.XmlDouble execAvg);
                
                /**
                 * Unsets the "exec_avg" attribute
                 */
                void unsetExecAvg();
                
                /**
                 * Gets the "exec_min" attribute
                 */
                double getExecMin();
                
                /**
                 * Gets (as xml) the "exec_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecMin();
                
                /**
                 * True if has "exec_min" attribute
                 */
                boolean isSetExecMin();
                
                /**
                 * Sets the "exec_min" attribute
                 */
                void setExecMin(double execMin);
                
                /**
                 * Sets (as xml) the "exec_min" attribute
                 */
                void xsetExecMin(org.apache.xmlbeans.XmlDouble execMin);
                
                /**
                 * Unsets the "exec_min" attribute
                 */
                void unsetExecMin();
                
                /**
                 * Gets the "exec_max" attribute
                 */
                double getExecMax();
                
                /**
                 * Gets (as xml) the "exec_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecMax();
                
                /**
                 * True if has "exec_max" attribute
                 */
                boolean isSetExecMax();
                
                /**
                 * Sets the "exec_max" attribute
                 */
                void setExecMax(double execMax);
                
                /**
                 * Sets (as xml) the "exec_max" attribute
                 */
                void xsetExecMax(org.apache.xmlbeans.XmlDouble execMax);
                
                /**
                 * Unsets the "exec_max" attribute
                 */
                void unsetExecMax();
                
                /**
                 * Gets the "exec_sum" attribute
                 */
                double getExecSum();
                
                /**
                 * Gets (as xml) the "exec_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecSum();
                
                /**
                 * True if has "exec_sum" attribute
                 */
                boolean isSetExecSum();
                
                /**
                 * Sets the "exec_sum" attribute
                 */
                void setExecSum(double execSum);
                
                /**
                 * Sets (as xml) the "exec_sum" attribute
                 */
                void xsetExecSum(org.apache.xmlbeans.XmlDouble execSum);
                
                /**
                 * Unsets the "exec_sum" attribute
                 */
                void unsetExecSum();
                
                /**
                 * Gets the "cpu_avg" attribute
                 */
                double getCpuAvg();
                
                /**
                 * Gets (as xml) the "cpu_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuAvg();
                
                /**
                 * True if has "cpu_avg" attribute
                 */
                boolean isSetCpuAvg();
                
                /**
                 * Sets the "cpu_avg" attribute
                 */
                void setCpuAvg(double cpuAvg);
                
                /**
                 * Sets (as xml) the "cpu_avg" attribute
                 */
                void xsetCpuAvg(org.apache.xmlbeans.XmlDouble cpuAvg);
                
                /**
                 * Unsets the "cpu_avg" attribute
                 */
                void unsetCpuAvg();
                
                /**
                 * Gets the "cpu_min" attribute
                 */
                double getCpuMin();
                
                /**
                 * Gets (as xml) the "cpu_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuMin();
                
                /**
                 * True if has "cpu_min" attribute
                 */
                boolean isSetCpuMin();
                
                /**
                 * Sets the "cpu_min" attribute
                 */
                void setCpuMin(double cpuMin);
                
                /**
                 * Sets (as xml) the "cpu_min" attribute
                 */
                void xsetCpuMin(org.apache.xmlbeans.XmlDouble cpuMin);
                
                /**
                 * Unsets the "cpu_min" attribute
                 */
                void unsetCpuMin();
                
                /**
                 * Gets the "cpu_max" attribute
                 */
                double getCpuMax();
                
                /**
                 * Gets (as xml) the "cpu_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuMax();
                
                /**
                 * True if has "cpu_max" attribute
                 */
                boolean isSetCpuMax();
                
                /**
                 * Sets the "cpu_max" attribute
                 */
                void setCpuMax(double cpuMax);
                
                /**
                 * Sets (as xml) the "cpu_max" attribute
                 */
                void xsetCpuMax(org.apache.xmlbeans.XmlDouble cpuMax);
                
                /**
                 * Unsets the "cpu_max" attribute
                 */
                void unsetCpuMax();
                
                /**
                 * Gets the "cpu_sum" attribute
                 */
                double getCpuSum();
                
                /**
                 * Gets (as xml) the "cpu_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuSum();
                
                /**
                 * True if has "cpu_sum" attribute
                 */
                boolean isSetCpuSum();
                
                /**
                 * Sets the "cpu_sum" attribute
                 */
                void setCpuSum(double cpuSum);
                
                /**
                 * Sets (as xml) the "cpu_sum" attribute
                 */
                void xsetCpuSum(org.apache.xmlbeans.XmlDouble cpuSum);
                
                /**
                 * Unsets the "cpu_sum" attribute
                 */
                void unsetCpuSum();
                
                /**
                 * Gets the "sync_avg" attribute
                 */
                double getSyncAvg();
                
                /**
                 * Gets (as xml) the "sync_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSyncAvg();
                
                /**
                 * True if has "sync_avg" attribute
                 */
                boolean isSetSyncAvg();
                
                /**
                 * Sets the "sync_avg" attribute
                 */
                void setSyncAvg(double syncAvg);
                
                /**
                 * Sets (as xml) the "sync_avg" attribute
                 */
                void xsetSyncAvg(org.apache.xmlbeans.XmlDouble syncAvg);
                
                /**
                 * Unsets the "sync_avg" attribute
                 */
                void unsetSyncAvg();
                
                /**
                 * Gets the "sync_min" attribute
                 */
                double getSyncMin();
                
                /**
                 * Gets (as xml) the "sync_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSyncMin();
                
                /**
                 * True if has "sync_min" attribute
                 */
                boolean isSetSyncMin();
                
                /**
                 * Sets the "sync_min" attribute
                 */
                void setSyncMin(double syncMin);
                
                /**
                 * Sets (as xml) the "sync_min" attribute
                 */
                void xsetSyncMin(org.apache.xmlbeans.XmlDouble syncMin);
                
                /**
                 * Unsets the "sync_min" attribute
                 */
                void unsetSyncMin();
                
                /**
                 * Gets the "sync_max" attribute
                 */
                double getSyncMax();
                
                /**
                 * Gets (as xml) the "sync_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSyncMax();
                
                /**
                 * True if has "sync_max" attribute
                 */
                boolean isSetSyncMax();
                
                /**
                 * Sets the "sync_max" attribute
                 */
                void setSyncMax(double syncMax);
                
                /**
                 * Sets (as xml) the "sync_max" attribute
                 */
                void xsetSyncMax(org.apache.xmlbeans.XmlDouble syncMax);
                
                /**
                 * Unsets the "sync_max" attribute
                 */
                void unsetSyncMax();
                
                /**
                 * Gets the "sync_sum" attribute
                 */
                double getSyncSum();
                
                /**
                 * Gets (as xml) the "sync_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSyncSum();
                
                /**
                 * True if has "sync_sum" attribute
                 */
                boolean isSetSyncSum();
                
                /**
                 * Sets the "sync_sum" attribute
                 */
                void setSyncSum(double syncSum);
                
                /**
                 * Sets (as xml) the "sync_sum" attribute
                 */
                void xsetSyncSum(org.apache.xmlbeans.XmlDouble syncSum);
                
                /**
                 * Unsets the "sync_sum" attribute
                 */
                void unsetSyncSum();
                
                /**
                 * Gets the "wait_avg" attribute
                 */
                double getWaitAvg();
                
                /**
                 * Gets (as xml) the "wait_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWaitAvg();
                
                /**
                 * True if has "wait_avg" attribute
                 */
                boolean isSetWaitAvg();
                
                /**
                 * Sets the "wait_avg" attribute
                 */
                void setWaitAvg(double waitAvg);
                
                /**
                 * Sets (as xml) the "wait_avg" attribute
                 */
                void xsetWaitAvg(org.apache.xmlbeans.XmlDouble waitAvg);
                
                /**
                 * Unsets the "wait_avg" attribute
                 */
                void unsetWaitAvg();
                
                /**
                 * Gets the "wait_min" attribute
                 */
                double getWaitMin();
                
                /**
                 * Gets (as xml) the "wait_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWaitMin();
                
                /**
                 * True if has "wait_min" attribute
                 */
                boolean isSetWaitMin();
                
                /**
                 * Sets the "wait_min" attribute
                 */
                void setWaitMin(double waitMin);
                
                /**
                 * Sets (as xml) the "wait_min" attribute
                 */
                void xsetWaitMin(org.apache.xmlbeans.XmlDouble waitMin);
                
                /**
                 * Unsets the "wait_min" attribute
                 */
                void unsetWaitMin();
                
                /**
                 * Gets the "wait_max" attribute
                 */
                double getWaitMax();
                
                /**
                 * Gets (as xml) the "wait_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWaitMax();
                
                /**
                 * True if has "wait_max" attribute
                 */
                boolean isSetWaitMax();
                
                /**
                 * Sets the "wait_max" attribute
                 */
                void setWaitMax(double waitMax);
                
                /**
                 * Sets (as xml) the "wait_max" attribute
                 */
                void xsetWaitMax(org.apache.xmlbeans.XmlDouble waitMax);
                
                /**
                 * Unsets the "wait_max" attribute
                 */
                void unsetWaitMax();
                
                /**
                 * Gets the "wait_sum" attribute
                 */
                double getWaitSum();
                
                /**
                 * Gets (as xml) the "wait_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWaitSum();
                
                /**
                 * True if has "wait_sum" attribute
                 */
                boolean isSetWaitSum();
                
                /**
                 * Sets the "wait_sum" attribute
                 */
                void setWaitSum(double waitSum);
                
                /**
                 * Sets (as xml) the "wait_sum" attribute
                 */
                void xsetWaitSum(org.apache.xmlbeans.XmlDouble waitSum);
                
                /**
                 * Unsets the "wait_sum" attribute
                 */
                void unsetWaitSum();
                
                /**
                 * Gets the "error_state" attribute
                 */
                java.lang.String getErrorState();
                
                /**
                 * Gets (as xml) the "error_state" attribute
                 */
                org.apache.xmlbeans.XmlString xgetErrorState();
                
                /**
                 * True if has "error_state" attribute
                 */
                boolean isSetErrorState();
                
                /**
                 * Sets the "error_state" attribute
                 */
                void setErrorState(java.lang.String errorState);
                
                /**
                 * Sets (as xml) the "error_state" attribute
                 */
                void xsetErrorState(org.apache.xmlbeans.XmlString errorState);
                
                /**
                 * Unsets the "error_state" attribute
                 */
                void unsetErrorState();
                
                /**
                 * Gets the "failure_rate" attribute
                 */
                java.lang.String getFailureRate();
                
                /**
                 * Gets (as xml) the "failure_rate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFailureRate();
                
                /**
                 * True if has "failure_rate" attribute
                 */
                boolean isSetFailureRate();
                
                /**
                 * Sets the "failure_rate" attribute
                 */
                void setFailureRate(java.lang.String failureRate);
                
                /**
                 * Sets (as xml) the "failure_rate" attribute
                 */
                void xsetFailureRate(org.apache.xmlbeans.XmlString failureRate);
                
                /**
                 * Unsets the "failure_rate" attribute
                 */
                void unsetFailureRate();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint newInstance() {
                      return (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints newInstance() {
                  return (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.EntrypointsdashletDocument.Entrypointsdashlet newInstance() {
              return (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.EntrypointsdashletDocument.Entrypointsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.EntrypointsdashletDocument newInstance() {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.EntrypointsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.EntrypointsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.EntrypointsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.EntrypointsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.EntrypointsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.EntrypointsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
