/*
 * An XML document type.
 * Localname: apibreakdowndashlet
 * Namespace: 
 * Java type: noNamespace.ApibreakdowndashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one apibreakdowndashlet(@) element.
 *
 * This is a complex type.
 */
public interface ApibreakdowndashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApibreakdowndashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("apibreakdowndashlet2509doctype");
    
    /**
     * Gets the "apibreakdowndashlet" element
     */
    noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet getApibreakdowndashlet();
    
    /**
     * Sets the "apibreakdowndashlet" element
     */
    void setApibreakdowndashlet(noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet apibreakdowndashlet);
    
    /**
     * Appends and returns a new empty "apibreakdowndashlet" element
     */
    noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet addNewApibreakdowndashlet();
    
    /**
     * An XML apibreakdowndashlet(@).
     *
     * This is a complex type.
     */
    public interface Apibreakdowndashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Apibreakdowndashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("apibreakdowndashletad27elemtype");
        
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
         * Gets the "apis" element
         */
        noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis getApis();
        
        /**
         * True if has "apis" element
         */
        boolean isSetApis();
        
        /**
         * Sets the "apis" element
         */
        void setApis(noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis apis);
        
        /**
         * Appends and returns a new empty "apis" element
         */
        noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis addNewApis();
        
        /**
         * Unsets the "apis" element
         */
        void unsetApis();
        
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
         * An XML apis(@).
         *
         * This is a complex type.
         */
        public interface Apis extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Apis.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("apis19ccelemtype");
            
            /**
             * Gets array of all "api" elements
             */
            noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api[] getApiArray();
            
            /**
             * Gets ith "api" element
             */
            noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api getApiArray(int i);
            
            /**
             * Returns number of "api" element
             */
            int sizeOfApiArray();
            
            /**
             * Sets array of all "api" element
             */
            void setApiArray(noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api[] apiArray);
            
            /**
             * Sets ith "api" element
             */
            void setApiArray(int i, noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api api);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "api" element
             */
            noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api insertNewApi(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "api" element
             */
            noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api addNewApi();
            
            /**
             * Removes the ith "api" element
             */
            void removeApi(int i);
            
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
             * An XML api(@).
             *
             * This is a complex type.
             */
            public interface Api extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Api.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("api4b76elemtype");
                
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
                 * Gets the "suspension_avg" attribute
                 */
                double getSuspensionAvg();
                
                /**
                 * Gets (as xml) the "suspension_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSuspensionAvg();
                
                /**
                 * True if has "suspension_avg" attribute
                 */
                boolean isSetSuspensionAvg();
                
                /**
                 * Sets the "suspension_avg" attribute
                 */
                void setSuspensionAvg(double suspensionAvg);
                
                /**
                 * Sets (as xml) the "suspension_avg" attribute
                 */
                void xsetSuspensionAvg(org.apache.xmlbeans.XmlDouble suspensionAvg);
                
                /**
                 * Unsets the "suspension_avg" attribute
                 */
                void unsetSuspensionAvg();
                
                /**
                 * Gets the "suspension_min" attribute
                 */
                double getSuspensionMin();
                
                /**
                 * Gets (as xml) the "suspension_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSuspensionMin();
                
                /**
                 * True if has "suspension_min" attribute
                 */
                boolean isSetSuspensionMin();
                
                /**
                 * Sets the "suspension_min" attribute
                 */
                void setSuspensionMin(double suspensionMin);
                
                /**
                 * Sets (as xml) the "suspension_min" attribute
                 */
                void xsetSuspensionMin(org.apache.xmlbeans.XmlDouble suspensionMin);
                
                /**
                 * Unsets the "suspension_min" attribute
                 */
                void unsetSuspensionMin();
                
                /**
                 * Gets the "suspension_max" attribute
                 */
                double getSuspensionMax();
                
                /**
                 * Gets (as xml) the "suspension_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSuspensionMax();
                
                /**
                 * True if has "suspension_max" attribute
                 */
                boolean isSetSuspensionMax();
                
                /**
                 * Sets the "suspension_max" attribute
                 */
                void setSuspensionMax(double suspensionMax);
                
                /**
                 * Sets (as xml) the "suspension_max" attribute
                 */
                void xsetSuspensionMax(org.apache.xmlbeans.XmlDouble suspensionMax);
                
                /**
                 * Unsets the "suspension_max" attribute
                 */
                void unsetSuspensionMax();
                
                /**
                 * Gets the "suspension_sum" attribute
                 */
                double getSuspensionSum();
                
                /**
                 * Gets (as xml) the "suspension_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSuspensionSum();
                
                /**
                 * True if has "suspension_sum" attribute
                 */
                boolean isSetSuspensionSum();
                
                /**
                 * Sets the "suspension_sum" attribute
                 */
                void setSuspensionSum(double suspensionSum);
                
                /**
                 * Sets (as xml) the "suspension_sum" attribute
                 */
                void xsetSuspensionSum(org.apache.xmlbeans.XmlDouble suspensionSum);
                
                /**
                 * Unsets the "suspension_sum" attribute
                 */
                void unsetSuspensionSum();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api newInstance() {
                      return (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis newInstance() {
                  return (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet newInstance() {
              return (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ApibreakdowndashletDocument newInstance() {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ApibreakdowndashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ApibreakdowndashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ApibreakdowndashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ApibreakdowndashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ApibreakdowndashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ApibreakdowndashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
