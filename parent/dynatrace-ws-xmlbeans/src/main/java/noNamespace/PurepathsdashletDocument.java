/*
 * An XML document type.
 * Localname: purepathsdashlet
 * Namespace: 
 * Java type: noNamespace.PurepathsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one purepathsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface PurepathsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PurepathsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("purepathsdashlet3a0cdoctype");
    
    /**
     * Gets the "purepathsdashlet" element
     */
    noNamespace.PurepathsdashletDocument.Purepathsdashlet getPurepathsdashlet();
    
    /**
     * Sets the "purepathsdashlet" element
     */
    void setPurepathsdashlet(noNamespace.PurepathsdashletDocument.Purepathsdashlet purepathsdashlet);
    
    /**
     * Appends and returns a new empty "purepathsdashlet" element
     */
    noNamespace.PurepathsdashletDocument.Purepathsdashlet addNewPurepathsdashlet();
    
    /**
     * An XML purepathsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Purepathsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Purepathsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("purepathsdashlet318delemtype");
        
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
         * Gets the "purepaths" element
         */
        noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths getPurepaths();
        
        /**
         * True if has "purepaths" element
         */
        boolean isSetPurepaths();
        
        /**
         * Sets the "purepaths" element
         */
        void setPurepaths(noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths purepaths);
        
        /**
         * Appends and returns a new empty "purepaths" element
         */
        noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths addNewPurepaths();
        
        /**
         * Unsets the "purepaths" element
         */
        void unsetPurepaths();
        
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
         * An XML purepaths(@).
         *
         * This is a complex type.
         */
        public interface Purepaths extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Purepaths.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("purepaths677felemtype");
            
            /**
             * Gets array of all "purepath" elements
             */
            noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath[] getPurepathArray();
            
            /**
             * Gets ith "purepath" element
             */
            noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath getPurepathArray(int i);
            
            /**
             * Returns number of "purepath" element
             */
            int sizeOfPurepathArray();
            
            /**
             * Sets array of all "purepath" element
             */
            void setPurepathArray(noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath[] purepathArray);
            
            /**
             * Sets ith "purepath" element
             */
            void setPurepathArray(int i, noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath purepath);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "purepath" element
             */
            noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath insertNewPurepath(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "purepath" element
             */
            noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath addNewPurepath();
            
            /**
             * Removes the ith "purepath" element
             */
            void removePurepath(int i);
            
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
             * An XML purepath(@).
             *
             * This is a complex type.
             */
            public interface Purepath extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Purepath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("purepatha4e8elemtype");
                
                /**
                 * Gets array of all "node" elements
                 */
                noNamespace.NodeDocument.Node[] getNodeArray();
                
                /**
                 * Gets ith "node" element
                 */
                noNamespace.NodeDocument.Node getNodeArray(int i);
                
                /**
                 * Returns number of "node" element
                 */
                int sizeOfNodeArray();
                
                /**
                 * Sets array of all "node" element
                 */
                void setNodeArray(noNamespace.NodeDocument.Node[] nodeArray);
                
                /**
                 * Sets ith "node" element
                 */
                void setNodeArray(int i, noNamespace.NodeDocument.Node node);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "node" element
                 */
                noNamespace.NodeDocument.Node insertNewNode(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "node" element
                 */
                noNamespace.NodeDocument.Node addNewNode();
                
                /**
                 * Removes the ith "node" element
                 */
                void removeNode(int i);
                
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
                 * Gets the "businesstransactions" attribute
                 */
                java.lang.String getBusinesstransactions();
                
                /**
                 * Gets (as xml) the "businesstransactions" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBusinesstransactions();
                
                /**
                 * True if has "businesstransactions" attribute
                 */
                boolean isSetBusinesstransactions();
                
                /**
                 * Sets the "businesstransactions" attribute
                 */
                void setBusinesstransactions(java.lang.String businesstransactions);
                
                /**
                 * Sets (as xml) the "businesstransactions" attribute
                 */
                void xsetBusinesstransactions(org.apache.xmlbeans.XmlString businesstransactions);
                
                /**
                 * Unsets the "businesstransactions" attribute
                 */
                void unsetBusinesstransactions();
                
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
                 * Gets the "node_count" attribute
                 */
                java.math.BigInteger getNodeCount();
                
                /**
                 * Gets (as xml) the "node_count" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetNodeCount();
                
                /**
                 * True if has "node_count" attribute
                 */
                boolean isSetNodeCount();
                
                /**
                 * Sets the "node_count" attribute
                 */
                void setNodeCount(java.math.BigInteger nodeCount);
                
                /**
                 * Sets (as xml) the "node_count" attribute
                 */
                void xsetNodeCount(org.apache.xmlbeans.XmlInteger nodeCount);
                
                /**
                 * Unsets the "node_count" attribute
                 */
                void unsetNodeCount();
                
                /**
                 * Gets the "exec" attribute
                 */
                double getExec();
                
                /**
                 * Gets (as xml) the "exec" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExec();
                
                /**
                 * True if has "exec" attribute
                 */
                boolean isSetExec();
                
                /**
                 * Sets the "exec" attribute
                 */
                void setExec(double exec);
                
                /**
                 * Sets (as xml) the "exec" attribute
                 */
                void xsetExec(org.apache.xmlbeans.XmlDouble exec);
                
                /**
                 * Unsets the "exec" attribute
                 */
                void unsetExec();
                
                /**
                 * Gets the "cpu" attribute
                 */
                double getCpu();
                
                /**
                 * Gets (as xml) the "cpu" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpu();
                
                /**
                 * True if has "cpu" attribute
                 */
                boolean isSetCpu();
                
                /**
                 * Sets the "cpu" attribute
                 */
                void setCpu(double cpu);
                
                /**
                 * Sets (as xml) the "cpu" attribute
                 */
                void xsetCpu(org.apache.xmlbeans.XmlDouble cpu);
                
                /**
                 * Unsets the "cpu" attribute
                 */
                void unsetCpu();
                
                /**
                 * Gets the "sync" attribute
                 */
                double getSync();
                
                /**
                 * Gets (as xml) the "sync" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSync();
                
                /**
                 * True if has "sync" attribute
                 */
                boolean isSetSync();
                
                /**
                 * Sets the "sync" attribute
                 */
                void setSync(double sync);
                
                /**
                 * Sets (as xml) the "sync" attribute
                 */
                void xsetSync(org.apache.xmlbeans.XmlDouble sync);
                
                /**
                 * Unsets the "sync" attribute
                 */
                void unsetSync();
                
                /**
                 * Gets the "wait" attribute
                 */
                double getWait();
                
                /**
                 * Gets (as xml) the "wait" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWait();
                
                /**
                 * True if has "wait" attribute
                 */
                boolean isSetWait();
                
                /**
                 * Sets the "wait" attribute
                 */
                void setWait(double wait);
                
                /**
                 * Sets (as xml) the "wait" attribute
                 */
                void xsetWait(org.apache.xmlbeans.XmlDouble wait);
                
                /**
                 * Unsets the "wait" attribute
                 */
                void unsetWait();
                
                /**
                 * Gets the "suspension" attribute
                 */
                double getSuspension();
                
                /**
                 * Gets (as xml) the "suspension" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSuspension();
                
                /**
                 * True if has "suspension" attribute
                 */
                boolean isSetSuspension();
                
                /**
                 * Sets the "suspension" attribute
                 */
                void setSuspension(double suspension);
                
                /**
                 * Sets (as xml) the "suspension" attribute
                 */
                void xsetSuspension(org.apache.xmlbeans.XmlDouble suspension);
                
                /**
                 * Unsets the "suspension" attribute
                 */
                void unsetSuspension();
                
                /**
                 * Gets the "descheduled" attribute
                 */
                double getDescheduled();
                
                /**
                 * Gets (as xml) the "descheduled" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDescheduled();
                
                /**
                 * True if has "descheduled" attribute
                 */
                boolean isSetDescheduled();
                
                /**
                 * Sets the "descheduled" attribute
                 */
                void setDescheduled(double descheduled);
                
                /**
                 * Sets (as xml) the "descheduled" attribute
                 */
                void xsetDescheduled(org.apache.xmlbeans.XmlDouble descheduled);
                
                /**
                 * Unsets the "descheduled" attribute
                 */
                void unsetDescheduled();
                
                /**
                 * Gets the "start" attribute
                 */
                java.lang.String getStart();
                
                /**
                 * Gets (as xml) the "start" attribute
                 */
                org.apache.xmlbeans.XmlString xgetStart();
                
                /**
                 * True if has "start" attribute
                 */
                boolean isSetStart();
                
                /**
                 * Sets the "start" attribute
                 */
                void setStart(java.lang.String start);
                
                /**
                 * Sets (as xml) the "start" attribute
                 */
                void xsetStart(org.apache.xmlbeans.XmlString start);
                
                /**
                 * Unsets the "start" attribute
                 */
                void unsetStart();
                
                /**
                 * Gets the "agentid" attribute
                 */
                java.lang.String getAgentid();
                
                /**
                 * Gets (as xml) the "agentid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgentid();
                
                /**
                 * True if has "agentid" attribute
                 */
                boolean isSetAgentid();
                
                /**
                 * Sets the "agentid" attribute
                 */
                void setAgentid(java.lang.String agentid);
                
                /**
                 * Sets (as xml) the "agentid" attribute
                 */
                void xsetAgentid(org.apache.xmlbeans.XmlString agentid);
                
                /**
                 * Unsets the "agentid" attribute
                 */
                void unsetAgentid();
                
                /**
                 * Gets the "tagid" attribute
                 */
                java.math.BigInteger getTagid();
                
                /**
                 * Gets (as xml) the "tagid" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetTagid();
                
                /**
                 * True if has "tagid" attribute
                 */
                boolean isSetTagid();
                
                /**
                 * Sets the "tagid" attribute
                 */
                void setTagid(java.math.BigInteger tagid);
                
                /**
                 * Sets (as xml) the "tagid" attribute
                 */
                void xsetTagid(org.apache.xmlbeans.XmlInteger tagid);
                
                /**
                 * Unsets the "tagid" attribute
                 */
                void unsetTagid();
                
                /**
                 * Gets the "skippedevents" attribute
                 */
                java.math.BigInteger getSkippedevents();
                
                /**
                 * Gets (as xml) the "skippedevents" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSkippedevents();
                
                /**
                 * True if has "skippedevents" attribute
                 */
                boolean isSetSkippedevents();
                
                /**
                 * Sets the "skippedevents" attribute
                 */
                void setSkippedevents(java.math.BigInteger skippedevents);
                
                /**
                 * Sets (as xml) the "skippedevents" attribute
                 */
                void xsetSkippedevents(org.apache.xmlbeans.XmlInteger skippedevents);
                
                /**
                 * Unsets the "skippedevents" attribute
                 */
                void unsetSkippedevents();
                
                /**
                 * Gets the "internal_state" attribute
                 */
                java.lang.String getInternalState();
                
                /**
                 * Gets (as xml) the "internal_state" attribute
                 */
                org.apache.xmlbeans.XmlString xgetInternalState();
                
                /**
                 * True if has "internal_state" attribute
                 */
                boolean isSetInternalState();
                
                /**
                 * Sets the "internal_state" attribute
                 */
                void setInternalState(java.lang.String internalState);
                
                /**
                 * Sets (as xml) the "internal_state" attribute
                 */
                void xsetInternalState(org.apache.xmlbeans.XmlString internalState);
                
                /**
                 * Unsets the "internal_state" attribute
                 */
                void unsetInternalState();
                
                /**
                 * Gets the "extended_record_count" attribute
                 */
                java.lang.String getExtendedRecordCount();
                
                /**
                 * Gets (as xml) the "extended_record_count" attribute
                 */
                org.apache.xmlbeans.XmlString xgetExtendedRecordCount();
                
                /**
                 * True if has "extended_record_count" attribute
                 */
                boolean isSetExtendedRecordCount();
                
                /**
                 * Sets the "extended_record_count" attribute
                 */
                void setExtendedRecordCount(java.lang.String extendedRecordCount);
                
                /**
                 * Sets (as xml) the "extended_record_count" attribute
                 */
                void xsetExtendedRecordCount(org.apache.xmlbeans.XmlString extendedRecordCount);
                
                /**
                 * Unsets the "extended_record_count" attribute
                 */
                void unsetExtendedRecordCount();
                
                /**
                 * Gets the "root_path_thread_name" attribute
                 */
                java.lang.String getRootPathThreadName();
                
                /**
                 * Gets (as xml) the "root_path_thread_name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRootPathThreadName();
                
                /**
                 * True if has "root_path_thread_name" attribute
                 */
                boolean isSetRootPathThreadName();
                
                /**
                 * Sets the "root_path_thread_name" attribute
                 */
                void setRootPathThreadName(java.lang.String rootPathThreadName);
                
                /**
                 * Sets (as xml) the "root_path_thread_name" attribute
                 */
                void xsetRootPathThreadName(org.apache.xmlbeans.XmlString rootPathThreadName);
                
                /**
                 * Unsets the "root_path_thread_name" attribute
                 */
                void unsetRootPathThreadName();
                
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
                 * Gets the "breakdown" attribute
                 */
                java.lang.String getBreakdown();
                
                /**
                 * Gets (as xml) the "breakdown" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBreakdown();
                
                /**
                 * True if has "breakdown" attribute
                 */
                boolean isSetBreakdown();
                
                /**
                 * Sets the "breakdown" attribute
                 */
                void setBreakdown(java.lang.String breakdown);
                
                /**
                 * Sets (as xml) the "breakdown" attribute
                 */
                void xsetBreakdown(org.apache.xmlbeans.XmlString breakdown);
                
                /**
                 * Unsets the "breakdown" attribute
                 */
                void unsetBreakdown();
                
                /**
                 * Gets the "execsum" attribute
                 */
                double getExecsum();
                
                /**
                 * Gets (as xml) the "execsum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecsum();
                
                /**
                 * True if has "execsum" attribute
                 */
                boolean isSetExecsum();
                
                /**
                 * Sets the "execsum" attribute
                 */
                void setExecsum(double execsum);
                
                /**
                 * Sets (as xml) the "execsum" attribute
                 */
                void xsetExecsum(org.apache.xmlbeans.XmlDouble execsum);
                
                /**
                 * Unsets the "execsum" attribute
                 */
                void unsetExecsum();
                
                /**
                 * Gets the "response_time" attribute
                 */
                double getResponseTime();
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTime();
                
                /**
                 * True if has "response_time" attribute
                 */
                boolean isSetResponseTime();
                
                /**
                 * Sets the "response_time" attribute
                 */
                void setResponseTime(double responseTime);
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                void xsetResponseTime(org.apache.xmlbeans.XmlDouble responseTime);
                
                /**
                 * Unsets the "response_time" attribute
                 */
                void unsetResponseTime();
                
                /**
                 * Gets the "visitid" attribute
                 */
                java.lang.String getVisitid();
                
                /**
                 * Gets (as xml) the "visitid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVisitid();
                
                /**
                 * True if has "visitid" attribute
                 */
                boolean isSetVisitid();
                
                /**
                 * Sets the "visitid" attribute
                 */
                void setVisitid(java.lang.String visitid);
                
                /**
                 * Sets (as xml) the "visitid" attribute
                 */
                void xsetVisitid(org.apache.xmlbeans.XmlString visitid);
                
                /**
                 * Unsets the "visitid" attribute
                 */
                void unsetVisitid();
                
                /**
                 * Gets the "uplinks" attribute
                 */
                java.lang.String getUplinks();
                
                /**
                 * Gets (as xml) the "uplinks" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUplinks();
                
                /**
                 * True if has "uplinks" attribute
                 */
                boolean isSetUplinks();
                
                /**
                 * Sets the "uplinks" attribute
                 */
                void setUplinks(java.lang.String uplinks);
                
                /**
                 * Sets (as xml) the "uplinks" attribute
                 */
                void xsetUplinks(org.apache.xmlbeans.XmlString uplinks);
                
                /**
                 * Unsets the "uplinks" attribute
                 */
                void unsetUplinks();
                
                /**
                 * Gets the "endtime" attribute
                 */
                java.lang.String getEndtime();
                
                /**
                 * Gets (as xml) the "endtime" attribute
                 */
                org.apache.xmlbeans.XmlString xgetEndtime();
                
                /**
                 * True if has "endtime" attribute
                 */
                boolean isSetEndtime();
                
                /**
                 * Sets the "endtime" attribute
                 */
                void setEndtime(java.lang.String endtime);
                
                /**
                 * Sets (as xml) the "endtime" attribute
                 */
                void xsetEndtime(org.apache.xmlbeans.XmlString endtime);
                
                /**
                 * Unsets the "endtime" attribute
                 */
                void unsetEndtime();
                
                /**
                 * Gets the "web_request_response_time" attribute
                 */
                double getWebRequestResponseTime();
                
                /**
                 * Gets (as xml) the "web_request_response_time" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTime();
                
                /**
                 * True if has "web_request_response_time" attribute
                 */
                boolean isSetWebRequestResponseTime();
                
                /**
                 * Sets the "web_request_response_time" attribute
                 */
                void setWebRequestResponseTime(double webRequestResponseTime);
                
                /**
                 * Sets (as xml) the "web_request_response_time" attribute
                 */
                void xsetWebRequestResponseTime(org.apache.xmlbeans.XmlDouble webRequestResponseTime);
                
                /**
                 * Unsets the "web_request_response_time" attribute
                 */
                void unsetWebRequestResponseTime();
                
                /**
                 * Gets the "client_ip" attribute
                 */
                java.lang.String getClientIp();
                
                /**
                 * Gets (as xml) the "client_ip" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClientIp();
                
                /**
                 * True if has "client_ip" attribute
                 */
                boolean isSetClientIp();
                
                /**
                 * Sets the "client_ip" attribute
                 */
                void setClientIp(java.lang.String clientIp);
                
                /**
                 * Sets (as xml) the "client_ip" attribute
                 */
                void xsetClientIp(org.apache.xmlbeans.XmlString clientIp);
                
                /**
                 * Unsets the "client_ip" attribute
                 */
                void unsetClientIp();
                
                /**
                 * Gets the "cross_server_tag" attribute
                 */
                java.lang.String getCrossServerTag();
                
                /**
                 * Gets (as xml) the "cross_server_tag" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCrossServerTag();
                
                /**
                 * True if has "cross_server_tag" attribute
                 */
                boolean isSetCrossServerTag();
                
                /**
                 * Sets the "cross_server_tag" attribute
                 */
                void setCrossServerTag(java.lang.String crossServerTag);
                
                /**
                 * Sets (as xml) the "cross_server_tag" attribute
                 */
                void xsetCrossServerTag(org.apache.xmlbeans.XmlString crossServerTag);
                
                /**
                 * Unsets the "cross_server_tag" attribute
                 */
                void unsetCrossServerTag();
                
                /**
                 * Gets the "detected_problem_patterns" attribute
                 */
                java.lang.String getDetectedProblemPatterns();
                
                /**
                 * Gets (as xml) the "detected_problem_patterns" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDetectedProblemPatterns();
                
                /**
                 * True if has "detected_problem_patterns" attribute
                 */
                boolean isSetDetectedProblemPatterns();
                
                /**
                 * Sets the "detected_problem_patterns" attribute
                 */
                void setDetectedProblemPatterns(java.lang.String detectedProblemPatterns);
                
                /**
                 * Sets (as xml) the "detected_problem_patterns" attribute
                 */
                void xsetDetectedProblemPatterns(org.apache.xmlbeans.XmlString detectedProblemPatterns);
                
                /**
                 * Unsets the "detected_problem_patterns" attribute
                 */
                void unsetDetectedProblemPatterns();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath newInstance() {
                      return (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths newInstance() {
                  return (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.PurepathsdashletDocument.Purepathsdashlet newInstance() {
              return (noNamespace.PurepathsdashletDocument.Purepathsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.PurepathsdashletDocument.Purepathsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.PurepathsdashletDocument.Purepathsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.PurepathsdashletDocument newInstance() {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.PurepathsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.PurepathsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.PurepathsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.PurepathsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.PurepathsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.PurepathsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.PurepathsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.PurepathsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.PurepathsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.PurepathsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.PurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
