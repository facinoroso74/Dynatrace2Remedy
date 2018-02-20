/*
 * An XML document type.
 * Localname: admdashlet
 * Namespace: 
 * Java type: noNamespace.AdmdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one admdashlet(@) element.
 *
 * This is a complex type.
 */
public interface AdmdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdmdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("admdashlet8a98doctype");
    
    /**
     * Gets the "admdashlet" element
     */
    noNamespace.AdmdashletDocument.Admdashlet getAdmdashlet();
    
    /**
     * Sets the "admdashlet" element
     */
    void setAdmdashlet(noNamespace.AdmdashletDocument.Admdashlet admdashlet);
    
    /**
     * Appends and returns a new empty "admdashlet" element
     */
    noNamespace.AdmdashletDocument.Admdashlet addNewAdmdashlet();
    
    /**
     * An XML admdashlet(@).
     *
     * This is a complex type.
     */
    public interface Admdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Admdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("admdashlet3a8delemtype");
        
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
         * Gets the "adm" element
         */
        noNamespace.AdmdashletDocument.Admdashlet.Adm getAdm();
        
        /**
         * True if has "adm" element
         */
        boolean isSetAdm();
        
        /**
         * Sets the "adm" element
         */
        void setAdm(noNamespace.AdmdashletDocument.Admdashlet.Adm adm);
        
        /**
         * Appends and returns a new empty "adm" element
         */
        noNamespace.AdmdashletDocument.Admdashlet.Adm addNewAdm();
        
        /**
         * Unsets the "adm" element
         */
        void unsetAdm();
        
        /**
         * Gets the "adm_links" element
         */
        noNamespace.AdmdashletDocument.Admdashlet.AdmLinks getAdmLinks();
        
        /**
         * True if has "adm_links" element
         */
        boolean isSetAdmLinks();
        
        /**
         * Sets the "adm_links" element
         */
        void setAdmLinks(noNamespace.AdmdashletDocument.Admdashlet.AdmLinks admLinks);
        
        /**
         * Appends and returns a new empty "adm_links" element
         */
        noNamespace.AdmdashletDocument.Admdashlet.AdmLinks addNewAdmLinks();
        
        /**
         * Unsets the "adm_links" element
         */
        void unsetAdmLinks();
        
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
         * An XML adm(@).
         *
         * This is a complex type.
         */
        public interface Adm extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Adm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("adm7833elemtype");
            
            /**
             * Gets array of all "agent" elements
             */
            noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent[] getAgentArray();
            
            /**
             * Gets ith "agent" element
             */
            noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent getAgentArray(int i);
            
            /**
             * Returns number of "agent" element
             */
            int sizeOfAgentArray();
            
            /**
             * Sets array of all "agent" element
             */
            void setAgentArray(noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent[] agentArray);
            
            /**
             * Sets ith "agent" element
             */
            void setAgentArray(int i, noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent agent);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "agent" element
             */
            noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent insertNewAgent(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "agent" element
             */
            noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent addNewAgent();
            
            /**
             * Removes the ith "agent" element
             */
            void removeAgent(int i);
            
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
             * An XML agent(@).
             *
             * This is a complex type.
             */
            public interface Agent extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Agent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("agentc1b4elemtype");
                
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
                 * Gets the "group" attribute
                 */
                java.lang.String getGroup();
                
                /**
                 * Gets (as xml) the "group" attribute
                 */
                org.apache.xmlbeans.XmlString xgetGroup();
                
                /**
                 * True if has "group" attribute
                 */
                boolean isSetGroup();
                
                /**
                 * Sets the "group" attribute
                 */
                void setGroup(java.lang.String group);
                
                /**
                 * Sets (as xml) the "group" attribute
                 */
                void xsetGroup(org.apache.xmlbeans.XmlString group);
                
                /**
                 * Unsets the "group" attribute
                 */
                void unsetGroup();
                
                /**
                 * Gets the "technology" attribute
                 */
                java.lang.String getTechnology();
                
                /**
                 * Gets (as xml) the "technology" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTechnology();
                
                /**
                 * True if has "technology" attribute
                 */
                boolean isSetTechnology();
                
                /**
                 * Sets the "technology" attribute
                 */
                void setTechnology(java.lang.String technology);
                
                /**
                 * Sets (as xml) the "technology" attribute
                 */
                void xsetTechnology(org.apache.xmlbeans.XmlString technology);
                
                /**
                 * Unsets the "technology" attribute
                 */
                void unsetTechnology();
                
                /**
                 * Gets the "response_avg" attribute
                 */
                double getResponseAvg();
                
                /**
                 * Gets (as xml) the "response_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseAvg();
                
                /**
                 * True if has "response_avg" attribute
                 */
                boolean isSetResponseAvg();
                
                /**
                 * Sets the "response_avg" attribute
                 */
                void setResponseAvg(double responseAvg);
                
                /**
                 * Sets (as xml) the "response_avg" attribute
                 */
                void xsetResponseAvg(org.apache.xmlbeans.XmlDouble responseAvg);
                
                /**
                 * Unsets the "response_avg" attribute
                 */
                void unsetResponseAvg();
                
                /**
                 * Gets the "response_min" attribute
                 */
                double getResponseMin();
                
                /**
                 * Gets (as xml) the "response_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseMin();
                
                /**
                 * True if has "response_min" attribute
                 */
                boolean isSetResponseMin();
                
                /**
                 * Sets the "response_min" attribute
                 */
                void setResponseMin(double responseMin);
                
                /**
                 * Sets (as xml) the "response_min" attribute
                 */
                void xsetResponseMin(org.apache.xmlbeans.XmlDouble responseMin);
                
                /**
                 * Unsets the "response_min" attribute
                 */
                void unsetResponseMin();
                
                /**
                 * Gets the "response_max" attribute
                 */
                double getResponseMax();
                
                /**
                 * Gets (as xml) the "response_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseMax();
                
                /**
                 * True if has "response_max" attribute
                 */
                boolean isSetResponseMax();
                
                /**
                 * Sets the "response_max" attribute
                 */
                void setResponseMax(double responseMax);
                
                /**
                 * Sets (as xml) the "response_max" attribute
                 */
                void xsetResponseMax(org.apache.xmlbeans.XmlDouble responseMax);
                
                /**
                 * Unsets the "response_max" attribute
                 */
                void unsetResponseMax();
                
                /**
                 * Gets the "response_sum" attribute
                 */
                double getResponseSum();
                
                /**
                 * Gets (as xml) the "response_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseSum();
                
                /**
                 * True if has "response_sum" attribute
                 */
                boolean isSetResponseSum();
                
                /**
                 * Sets the "response_sum" attribute
                 */
                void setResponseSum(double responseSum);
                
                /**
                 * Sets (as xml) the "response_sum" attribute
                 */
                void xsetResponseSum(org.apache.xmlbeans.XmlDouble responseSum);
                
                /**
                 * Unsets the "response_sum" attribute
                 */
                void unsetResponseSum();
                
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
                 * Gets the "exec_cpu_avg" attribute
                 */
                double getExecCpuAvg();
                
                /**
                 * Gets (as xml) the "exec_cpu_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecCpuAvg();
                
                /**
                 * True if has "exec_cpu_avg" attribute
                 */
                boolean isSetExecCpuAvg();
                
                /**
                 * Sets the "exec_cpu_avg" attribute
                 */
                void setExecCpuAvg(double execCpuAvg);
                
                /**
                 * Sets (as xml) the "exec_cpu_avg" attribute
                 */
                void xsetExecCpuAvg(org.apache.xmlbeans.XmlDouble execCpuAvg);
                
                /**
                 * Unsets the "exec_cpu_avg" attribute
                 */
                void unsetExecCpuAvg();
                
                /**
                 * Gets the "exec_cpu_min" attribute
                 */
                double getExecCpuMin();
                
                /**
                 * Gets (as xml) the "exec_cpu_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecCpuMin();
                
                /**
                 * True if has "exec_cpu_min" attribute
                 */
                boolean isSetExecCpuMin();
                
                /**
                 * Sets the "exec_cpu_min" attribute
                 */
                void setExecCpuMin(double execCpuMin);
                
                /**
                 * Sets (as xml) the "exec_cpu_min" attribute
                 */
                void xsetExecCpuMin(org.apache.xmlbeans.XmlDouble execCpuMin);
                
                /**
                 * Unsets the "exec_cpu_min" attribute
                 */
                void unsetExecCpuMin();
                
                /**
                 * Gets the "exec_cpu_max" attribute
                 */
                double getExecCpuMax();
                
                /**
                 * Gets (as xml) the "exec_cpu_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecCpuMax();
                
                /**
                 * True if has "exec_cpu_max" attribute
                 */
                boolean isSetExecCpuMax();
                
                /**
                 * Sets the "exec_cpu_max" attribute
                 */
                void setExecCpuMax(double execCpuMax);
                
                /**
                 * Sets (as xml) the "exec_cpu_max" attribute
                 */
                void xsetExecCpuMax(org.apache.xmlbeans.XmlDouble execCpuMax);
                
                /**
                 * Unsets the "exec_cpu_max" attribute
                 */
                void unsetExecCpuMax();
                
                /**
                 * Gets the "exec_cpu_sum" attribute
                 */
                double getExecCpuSum();
                
                /**
                 * Gets (as xml) the "exec_cpu_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecCpuSum();
                
                /**
                 * True if has "exec_cpu_sum" attribute
                 */
                boolean isSetExecCpuSum();
                
                /**
                 * Sets the "exec_cpu_sum" attribute
                 */
                void setExecCpuSum(double execCpuSum);
                
                /**
                 * Sets (as xml) the "exec_cpu_sum" attribute
                 */
                void xsetExecCpuSum(org.apache.xmlbeans.XmlDouble execCpuSum);
                
                /**
                 * Unsets the "exec_cpu_sum" attribute
                 */
                void unsetExecCpuSum();
                
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
                 * Gets the "db_avg" attribute
                 */
                double getDbAvg();
                
                /**
                 * Gets (as xml) the "db_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDbAvg();
                
                /**
                 * True if has "db_avg" attribute
                 */
                boolean isSetDbAvg();
                
                /**
                 * Sets the "db_avg" attribute
                 */
                void setDbAvg(double dbAvg);
                
                /**
                 * Sets (as xml) the "db_avg" attribute
                 */
                void xsetDbAvg(org.apache.xmlbeans.XmlDouble dbAvg);
                
                /**
                 * Unsets the "db_avg" attribute
                 */
                void unsetDbAvg();
                
                /**
                 * Gets the "db_min" attribute
                 */
                double getDbMin();
                
                /**
                 * Gets (as xml) the "db_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDbMin();
                
                /**
                 * True if has "db_min" attribute
                 */
                boolean isSetDbMin();
                
                /**
                 * Sets the "db_min" attribute
                 */
                void setDbMin(double dbMin);
                
                /**
                 * Sets (as xml) the "db_min" attribute
                 */
                void xsetDbMin(org.apache.xmlbeans.XmlDouble dbMin);
                
                /**
                 * Unsets the "db_min" attribute
                 */
                void unsetDbMin();
                
                /**
                 * Gets the "db_max" attribute
                 */
                double getDbMax();
                
                /**
                 * Gets (as xml) the "db_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDbMax();
                
                /**
                 * True if has "db_max" attribute
                 */
                boolean isSetDbMax();
                
                /**
                 * Sets the "db_max" attribute
                 */
                void setDbMax(double dbMax);
                
                /**
                 * Sets (as xml) the "db_max" attribute
                 */
                void xsetDbMax(org.apache.xmlbeans.XmlDouble dbMax);
                
                /**
                 * Unsets the "db_max" attribute
                 */
                void unsetDbMax();
                
                /**
                 * Gets the "db_sum" attribute
                 */
                double getDbSum();
                
                /**
                 * Gets (as xml) the "db_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDbSum();
                
                /**
                 * True if has "db_sum" attribute
                 */
                boolean isSetDbSum();
                
                /**
                 * Sets the "db_sum" attribute
                 */
                void setDbSum(double dbSum);
                
                /**
                 * Sets (as xml) the "db_sum" attribute
                 */
                void xsetDbSum(org.apache.xmlbeans.XmlDouble dbSum);
                
                /**
                 * Unsets the "db_sum" attribute
                 */
                void unsetDbSum();
                
                /**
                 * Gets the "acq_avg" attribute
                 */
                double getAcqAvg();
                
                /**
                 * Gets (as xml) the "acq_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetAcqAvg();
                
                /**
                 * True if has "acq_avg" attribute
                 */
                boolean isSetAcqAvg();
                
                /**
                 * Sets the "acq_avg" attribute
                 */
                void setAcqAvg(double acqAvg);
                
                /**
                 * Sets (as xml) the "acq_avg" attribute
                 */
                void xsetAcqAvg(org.apache.xmlbeans.XmlDouble acqAvg);
                
                /**
                 * Unsets the "acq_avg" attribute
                 */
                void unsetAcqAvg();
                
                /**
                 * Gets the "acq_min" attribute
                 */
                double getAcqMin();
                
                /**
                 * Gets (as xml) the "acq_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetAcqMin();
                
                /**
                 * True if has "acq_min" attribute
                 */
                boolean isSetAcqMin();
                
                /**
                 * Sets the "acq_min" attribute
                 */
                void setAcqMin(double acqMin);
                
                /**
                 * Sets (as xml) the "acq_min" attribute
                 */
                void xsetAcqMin(org.apache.xmlbeans.XmlDouble acqMin);
                
                /**
                 * Unsets the "acq_min" attribute
                 */
                void unsetAcqMin();
                
                /**
                 * Gets the "acq_max" attribute
                 */
                double getAcqMax();
                
                /**
                 * Gets (as xml) the "acq_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetAcqMax();
                
                /**
                 * True if has "acq_max" attribute
                 */
                boolean isSetAcqMax();
                
                /**
                 * Sets the "acq_max" attribute
                 */
                void setAcqMax(double acqMax);
                
                /**
                 * Sets (as xml) the "acq_max" attribute
                 */
                void xsetAcqMax(org.apache.xmlbeans.XmlDouble acqMax);
                
                /**
                 * Unsets the "acq_max" attribute
                 */
                void unsetAcqMax();
                
                /**
                 * Gets the "acq_sum" attribute
                 */
                double getAcqSum();
                
                /**
                 * Gets (as xml) the "acq_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetAcqSum();
                
                /**
                 * True if has "acq_sum" attribute
                 */
                boolean isSetAcqSum();
                
                /**
                 * Sets the "acq_sum" attribute
                 */
                void setAcqSum(double acqSum);
                
                /**
                 * Sets (as xml) the "acq_sum" attribute
                 */
                void xsetAcqSum(org.apache.xmlbeans.XmlDouble acqSum);
                
                /**
                 * Unsets the "acq_sum" attribute
                 */
                void unsetAcqSum();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent newInstance() {
                      return (noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.AdmdashletDocument.Admdashlet.Adm newInstance() {
                  return (noNamespace.AdmdashletDocument.Admdashlet.Adm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.AdmdashletDocument.Admdashlet.Adm newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.AdmdashletDocument.Admdashlet.Adm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML adm_links(@).
         *
         * This is a complex type.
         */
        public interface AdmLinks extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdmLinks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("admlinksd4edelemtype");
            
            /**
             * Gets array of all "agent" elements
             */
            noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent[] getAgentArray();
            
            /**
             * Gets ith "agent" element
             */
            noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent getAgentArray(int i);
            
            /**
             * Returns number of "agent" element
             */
            int sizeOfAgentArray();
            
            /**
             * Sets array of all "agent" element
             */
            void setAgentArray(noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent[] agentArray);
            
            /**
             * Sets ith "agent" element
             */
            void setAgentArray(int i, noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent agent);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "agent" element
             */
            noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent insertNewAgent(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "agent" element
             */
            noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent addNewAgent();
            
            /**
             * Removes the ith "agent" element
             */
            void removeAgent(int i);
            
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
             * An XML agent(@).
             *
             * This is a complex type.
             */
            public interface Agent extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Agent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("agent39aeelemtype");
                
                /**
                 * Gets the "from" attribute
                 */
                java.lang.String getFrom();
                
                /**
                 * Gets (as xml) the "from" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFrom();
                
                /**
                 * True if has "from" attribute
                 */
                boolean isSetFrom();
                
                /**
                 * Sets the "from" attribute
                 */
                void setFrom(java.lang.String from);
                
                /**
                 * Sets (as xml) the "from" attribute
                 */
                void xsetFrom(org.apache.xmlbeans.XmlString from);
                
                /**
                 * Unsets the "from" attribute
                 */
                void unsetFrom();
                
                /**
                 * Gets the "group" attribute
                 */
                java.lang.String getGroup();
                
                /**
                 * Gets (as xml) the "group" attribute
                 */
                org.apache.xmlbeans.XmlString xgetGroup();
                
                /**
                 * True if has "group" attribute
                 */
                boolean isSetGroup();
                
                /**
                 * Sets the "group" attribute
                 */
                void setGroup(java.lang.String group);
                
                /**
                 * Sets (as xml) the "group" attribute
                 */
                void xsetGroup(org.apache.xmlbeans.XmlString group);
                
                /**
                 * Unsets the "group" attribute
                 */
                void unsetGroup();
                
                /**
                 * Gets the "to" attribute
                 */
                java.lang.String getTo();
                
                /**
                 * Gets (as xml) the "to" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTo();
                
                /**
                 * True if has "to" attribute
                 */
                boolean isSetTo();
                
                /**
                 * Sets the "to" attribute
                 */
                void setTo(java.lang.String to);
                
                /**
                 * Sets (as xml) the "to" attribute
                 */
                void xsetTo(org.apache.xmlbeans.XmlString to);
                
                /**
                 * Unsets the "to" attribute
                 */
                void unsetTo();
                
                /**
                 * Gets the "remoting_count" attribute
                 */
                java.math.BigInteger getRemotingCount();
                
                /**
                 * Gets (as xml) the "remoting_count" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRemotingCount();
                
                /**
                 * True if has "remoting_count" attribute
                 */
                boolean isSetRemotingCount();
                
                /**
                 * Sets the "remoting_count" attribute
                 */
                void setRemotingCount(java.math.BigInteger remotingCount);
                
                /**
                 * Sets (as xml) the "remoting_count" attribute
                 */
                void xsetRemotingCount(org.apache.xmlbeans.XmlInteger remotingCount);
                
                /**
                 * Unsets the "remoting_count" attribute
                 */
                void unsetRemotingCount();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent newInstance() {
                      return (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.AdmdashletDocument.Admdashlet.AdmLinks newInstance() {
                  return (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.AdmdashletDocument.Admdashlet.AdmLinks newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.AdmdashletDocument.Admdashlet newInstance() {
              return (noNamespace.AdmdashletDocument.Admdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.AdmdashletDocument.Admdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.AdmdashletDocument.Admdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.AdmdashletDocument newInstance() {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.AdmdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.AdmdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.AdmdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.AdmdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.AdmdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.AdmdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.AdmdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.AdmdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.AdmdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.AdmdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.AdmdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.AdmdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.AdmdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.AdmdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.AdmdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.AdmdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.AdmdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.AdmdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
