/*
 * An XML document type.
 * Localname: agent
 * Namespace: 
 * Java type: noNamespace.AgentDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one agent(@) element.
 *
 * This is a complex type.
 */
public interface AgentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AgentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("agent9e2cdoctype");
    
    /**
     * Gets the "agent" element
     */
    noNamespace.AgentDocument.Agent getAgent();
    
    /**
     * Sets the "agent" element
     */
    void setAgent(noNamespace.AgentDocument.Agent agent);
    
    /**
     * Appends and returns a new empty "agent" element
     */
    noNamespace.AgentDocument.Agent addNewAgent();
    
    /**
     * An XML agent(@).
     *
     * This is a complex type.
     */
    public interface Agent extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Agent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("agent1aadelemtype");
        
        /**
         * Gets array of all "agent" elements
         */
        noNamespace.AgentDocument.Agent[] getAgentArray();
        
        /**
         * Gets ith "agent" element
         */
        noNamespace.AgentDocument.Agent getAgentArray(int i);
        
        /**
         * Returns number of "agent" element
         */
        int sizeOfAgentArray();
        
        /**
         * Sets array of all "agent" element
         */
        void setAgentArray(noNamespace.AgentDocument.Agent[] agentArray);
        
        /**
         * Sets ith "agent" element
         */
        void setAgentArray(int i, noNamespace.AgentDocument.Agent agent);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "agent" element
         */
        noNamespace.AgentDocument.Agent insertNewAgent(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "agent" element
         */
        noNamespace.AgentDocument.Agent addNewAgent();
        
        /**
         * Removes the ith "agent" element
         */
        void removeAgent(int i);
        
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
         * Gets the "database_avg" attribute
         */
        double getDatabaseAvg();
        
        /**
         * Gets (as xml) the "database_avg" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDatabaseAvg();
        
        /**
         * True if has "database_avg" attribute
         */
        boolean isSetDatabaseAvg();
        
        /**
         * Sets the "database_avg" attribute
         */
        void setDatabaseAvg(double databaseAvg);
        
        /**
         * Sets (as xml) the "database_avg" attribute
         */
        void xsetDatabaseAvg(org.apache.xmlbeans.XmlDouble databaseAvg);
        
        /**
         * Unsets the "database_avg" attribute
         */
        void unsetDatabaseAvg();
        
        /**
         * Gets the "database_min" attribute
         */
        double getDatabaseMin();
        
        /**
         * Gets (as xml) the "database_min" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDatabaseMin();
        
        /**
         * True if has "database_min" attribute
         */
        boolean isSetDatabaseMin();
        
        /**
         * Sets the "database_min" attribute
         */
        void setDatabaseMin(double databaseMin);
        
        /**
         * Sets (as xml) the "database_min" attribute
         */
        void xsetDatabaseMin(org.apache.xmlbeans.XmlDouble databaseMin);
        
        /**
         * Unsets the "database_min" attribute
         */
        void unsetDatabaseMin();
        
        /**
         * Gets the "database_max" attribute
         */
        double getDatabaseMax();
        
        /**
         * Gets (as xml) the "database_max" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDatabaseMax();
        
        /**
         * True if has "database_max" attribute
         */
        boolean isSetDatabaseMax();
        
        /**
         * Sets the "database_max" attribute
         */
        void setDatabaseMax(double databaseMax);
        
        /**
         * Sets (as xml) the "database_max" attribute
         */
        void xsetDatabaseMax(org.apache.xmlbeans.XmlDouble databaseMax);
        
        /**
         * Unsets the "database_max" attribute
         */
        void unsetDatabaseMax();
        
        /**
         * Gets the "database_sum" attribute
         */
        double getDatabaseSum();
        
        /**
         * Gets (as xml) the "database_sum" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDatabaseSum();
        
        /**
         * True if has "database_sum" attribute
         */
        boolean isSetDatabaseSum();
        
        /**
         * Sets the "database_sum" attribute
         */
        void setDatabaseSum(double databaseSum);
        
        /**
         * Sets (as xml) the "database_sum" attribute
         */
        void xsetDatabaseSum(org.apache.xmlbeans.XmlDouble databaseSum);
        
        /**
         * Unsets the "database_sum" attribute
         */
        void unsetDatabaseSum();
        
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
            public static noNamespace.AgentDocument.Agent newInstance() {
              return (noNamespace.AgentDocument.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.AgentDocument.Agent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.AgentDocument.Agent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.AgentDocument newInstance() {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.AgentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.AgentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.AgentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.AgentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.AgentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.AgentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.AgentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.AgentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.AgentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.AgentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.AgentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.AgentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.AgentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.AgentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.AgentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.AgentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.AgentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.AgentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
