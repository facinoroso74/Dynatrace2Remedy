/*
 * An XML document type.
 * Localname: enduserpurepathsdashlet
 * Namespace: 
 * Java type: noNamespace.EnduserpurepathsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one enduserpurepathsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface EnduserpurepathsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnduserpurepathsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("enduserpurepathsdashlet4620doctype");
    
    /**
     * Gets the "enduserpurepathsdashlet" element
     */
    noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet getEnduserpurepathsdashlet();
    
    /**
     * Sets the "enduserpurepathsdashlet" element
     */
    void setEnduserpurepathsdashlet(noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet enduserpurepathsdashlet);
    
    /**
     * Appends and returns a new empty "enduserpurepathsdashlet" element
     */
    noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet addNewEnduserpurepathsdashlet();
    
    /**
     * An XML enduserpurepathsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Enduserpurepathsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Enduserpurepathsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("enduserpurepathsdashlet6115elemtype");
        
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
        noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths getPurepaths();
        
        /**
         * True if has "purepaths" element
         */
        boolean isSetPurepaths();
        
        /**
         * Sets the "purepaths" element
         */
        void setPurepaths(noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths purepaths);
        
        /**
         * Appends and returns a new empty "purepaths" element
         */
        noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths addNewPurepaths();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Purepaths.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("purepaths4787elemtype");
            
            /**
             * Gets array of all "purepath" elements
             */
            noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath[] getPurepathArray();
            
            /**
             * Gets ith "purepath" element
             */
            noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath getPurepathArray(int i);
            
            /**
             * Returns number of "purepath" element
             */
            int sizeOfPurepathArray();
            
            /**
             * Sets array of all "purepath" element
             */
            void setPurepathArray(noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath[] purepathArray);
            
            /**
             * Sets ith "purepath" element
             */
            void setPurepathArray(int i, noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath purepath);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "purepath" element
             */
            noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath insertNewPurepath(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "purepath" element
             */
            noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath addNewPurepath();
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Purepath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("purepath5930elemtype");
                
                /**
                 * Gets array of all "uemnode" elements
                 */
                noNamespace.UemnodeDocument.Uemnode[] getUemnodeArray();
                
                /**
                 * Gets ith "uemnode" element
                 */
                noNamespace.UemnodeDocument.Uemnode getUemnodeArray(int i);
                
                /**
                 * Returns number of "uemnode" element
                 */
                int sizeOfUemnodeArray();
                
                /**
                 * Sets array of all "uemnode" element
                 */
                void setUemnodeArray(noNamespace.UemnodeDocument.Uemnode[] uemnodeArray);
                
                /**
                 * Sets ith "uemnode" element
                 */
                void setUemnodeArray(int i, noNamespace.UemnodeDocument.Uemnode uemnode);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "uemnode" element
                 */
                noNamespace.UemnodeDocument.Uemnode insertNewUemnode(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "uemnode" element
                 */
                noNamespace.UemnodeDocument.Uemnode addNewUemnode();
                
                /**
                 * Removes the ith "uemnode" element
                 */
                void removeUemnode(int i);
                
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
                java.math.BigInteger getExec();
                
                /**
                 * Gets (as xml) the "exec" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetExec();
                
                /**
                 * True if has "exec" attribute
                 */
                boolean isSetExec();
                
                /**
                 * Sets the "exec" attribute
                 */
                void setExec(java.math.BigInteger exec);
                
                /**
                 * Sets (as xml) the "exec" attribute
                 */
                void xsetExec(org.apache.xmlbeans.XmlInteger exec);
                
                /**
                 * Unsets the "exec" attribute
                 */
                void unsetExec();
                
                /**
                 * Gets the "compare_baseline" attribute
                 */
                java.lang.String getCompareBaseline();
                
                /**
                 * Gets (as xml) the "compare_baseline" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCompareBaseline();
                
                /**
                 * True if has "compare_baseline" attribute
                 */
                boolean isSetCompareBaseline();
                
                /**
                 * Sets the "compare_baseline" attribute
                 */
                void setCompareBaseline(java.lang.String compareBaseline);
                
                /**
                 * Sets (as xml) the "compare_baseline" attribute
                 */
                void xsetCompareBaseline(org.apache.xmlbeans.XmlString compareBaseline);
                
                /**
                 * Unsets the "compare_baseline" attribute
                 */
                void unsetCompareBaseline();
                
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
                 * Gets the "requests" attribute
                 */
                java.math.BigInteger getRequests();
                
                /**
                 * Gets (as xml) the "requests" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRequests();
                
                /**
                 * True if has "requests" attribute
                 */
                boolean isSetRequests();
                
                /**
                 * Sets the "requests" attribute
                 */
                void setRequests(java.math.BigInteger requests);
                
                /**
                 * Sets (as xml) the "requests" attribute
                 */
                void xsetRequests(org.apache.xmlbeans.XmlInteger requests);
                
                /**
                 * Unsets the "requests" attribute
                 */
                void unsetRequests();
                
                /**
                 * Gets the "errors" attribute
                 */
                java.math.BigInteger getErrors();
                
                /**
                 * Gets (as xml) the "errors" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetErrors();
                
                /**
                 * True if has "errors" attribute
                 */
                boolean isSetErrors();
                
                /**
                 * Sets the "errors" attribute
                 */
                void setErrors(java.math.BigInteger errors);
                
                /**
                 * Sets (as xml) the "errors" attribute
                 */
                void xsetErrors(org.apache.xmlbeans.XmlInteger errors);
                
                /**
                 * Unsets the "errors" attribute
                 */
                void unsetErrors();
                
                /**
                 * Gets the "location" attribute
                 */
                java.lang.String getLocation();
                
                /**
                 * Gets (as xml) the "location" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLocation();
                
                /**
                 * True if has "location" attribute
                 */
                boolean isSetLocation();
                
                /**
                 * Sets the "location" attribute
                 */
                void setLocation(java.lang.String location);
                
                /**
                 * Sets (as xml) the "location" attribute
                 */
                void xsetLocation(org.apache.xmlbeans.XmlString location);
                
                /**
                 * Unsets the "location" attribute
                 */
                void unsetLocation();
                
                /**
                 * Gets the "browser" attribute
                 */
                java.lang.String getBrowser();
                
                /**
                 * Gets (as xml) the "browser" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBrowser();
                
                /**
                 * True if has "browser" attribute
                 */
                boolean isSetBrowser();
                
                /**
                 * Sets the "browser" attribute
                 */
                void setBrowser(java.lang.String browser);
                
                /**
                 * Sets (as xml) the "browser" attribute
                 */
                void xsetBrowser(org.apache.xmlbeans.XmlString browser);
                
                /**
                 * Unsets the "browser" attribute
                 */
                void unsetBrowser();
                
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
                 * Gets the "networkduration" attribute
                 */
                double getNetworkduration();
                
                /**
                 * Gets (as xml) the "networkduration" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetNetworkduration();
                
                /**
                 * True if has "networkduration" attribute
                 */
                boolean isSetNetworkduration();
                
                /**
                 * Sets the "networkduration" attribute
                 */
                void setNetworkduration(double networkduration);
                
                /**
                 * Sets (as xml) the "networkduration" attribute
                 */
                void xsetNetworkduration(org.apache.xmlbeans.XmlDouble networkduration);
                
                /**
                 * Unsets the "networkduration" attribute
                 */
                void unsetNetworkduration();
                
                /**
                 * Gets the "serverduration" attribute
                 */
                double getServerduration();
                
                /**
                 * Gets (as xml) the "serverduration" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetServerduration();
                
                /**
                 * True if has "serverduration" attribute
                 */
                boolean isSetServerduration();
                
                /**
                 * Sets the "serverduration" attribute
                 */
                void setServerduration(double serverduration);
                
                /**
                 * Sets (as xml) the "serverduration" attribute
                 */
                void xsetServerduration(org.apache.xmlbeans.XmlDouble serverduration);
                
                /**
                 * Unsets the "serverduration" attribute
                 */
                void unsetServerduration();
                
                /**
                 * Gets the "response_time" attribute
                 */
                java.lang.String getResponseTime();
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                org.apache.xmlbeans.XmlString xgetResponseTime();
                
                /**
                 * True if has "response_time" attribute
                 */
                boolean isSetResponseTime();
                
                /**
                 * Sets the "response_time" attribute
                 */
                void setResponseTime(java.lang.String responseTime);
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                void xsetResponseTime(org.apache.xmlbeans.XmlString responseTime);
                
                /**
                 * Unsets the "response_time" attribute
                 */
                void unsetResponseTime();
                
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
                 * Gets the "browser_errors" attribute
                 */
                java.math.BigInteger getBrowserErrors();
                
                /**
                 * Gets (as xml) the "browser_errors" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBrowserErrors();
                
                /**
                 * True if has "browser_errors" attribute
                 */
                boolean isSetBrowserErrors();
                
                /**
                 * Sets the "browser_errors" attribute
                 */
                void setBrowserErrors(java.math.BigInteger browserErrors);
                
                /**
                 * Sets (as xml) the "browser_errors" attribute
                 */
                void xsetBrowserErrors(org.apache.xmlbeans.XmlInteger browserErrors);
                
                /**
                 * Unsets the "browser_errors" attribute
                 */
                void unsetBrowserErrors();
                
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
                 * Gets the "bandwidth" attribute
                 */
                java.lang.String getBandwidth();
                
                /**
                 * Gets (as xml) the "bandwidth" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBandwidth();
                
                /**
                 * True if has "bandwidth" attribute
                 */
                boolean isSetBandwidth();
                
                /**
                 * Sets the "bandwidth" attribute
                 */
                void setBandwidth(java.lang.String bandwidth);
                
                /**
                 * Sets (as xml) the "bandwidth" attribute
                 */
                void xsetBandwidth(org.apache.xmlbeans.XmlString bandwidth);
                
                /**
                 * Unsets the "bandwidth" attribute
                 */
                void unsetBandwidth();
                
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
                 * Gets the "domain" attribute
                 */
                java.lang.String getDomain();
                
                /**
                 * Gets (as xml) the "domain" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDomain();
                
                /**
                 * True if has "domain" attribute
                 */
                boolean isSetDomain();
                
                /**
                 * Sets the "domain" attribute
                 */
                void setDomain(java.lang.String domain);
                
                /**
                 * Sets (as xml) the "domain" attribute
                 */
                void xsetDomain(org.apache.xmlbeans.XmlString domain);
                
                /**
                 * Unsets the "domain" attribute
                 */
                void unsetDomain();
                
                /**
                 * Gets the "purepath_user_experience" attribute
                 */
                java.lang.String getPurepathUserExperience();
                
                /**
                 * Gets (as xml) the "purepath_user_experience" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPurepathUserExperience();
                
                /**
                 * True if has "purepath_user_experience" attribute
                 */
                boolean isSetPurepathUserExperience();
                
                /**
                 * Sets the "purepath_user_experience" attribute
                 */
                void setPurepathUserExperience(java.lang.String purepathUserExperience);
                
                /**
                 * Sets (as xml) the "purepath_user_experience" attribute
                 */
                void xsetPurepathUserExperience(org.apache.xmlbeans.XmlString purepathUserExperience);
                
                /**
                 * Unsets the "purepath_user_experience" attribute
                 */
                void unsetPurepathUserExperience();
                
                /**
                 * Gets the "action_group" attribute
                 */
                java.lang.String getActionGroup();
                
                /**
                 * Gets (as xml) the "action_group" attribute
                 */
                org.apache.xmlbeans.XmlString xgetActionGroup();
                
                /**
                 * True if has "action_group" attribute
                 */
                boolean isSetActionGroup();
                
                /**
                 * Sets the "action_group" attribute
                 */
                void setActionGroup(java.lang.String actionGroup);
                
                /**
                 * Sets (as xml) the "action_group" attribute
                 */
                void xsetActionGroup(org.apache.xmlbeans.XmlString actionGroup);
                
                /**
                 * Unsets the "action_group" attribute
                 */
                void unsetActionGroup();
                
                /**
                 * Gets the "baseline" attribute
                 */
                double getBaseline();
                
                /**
                 * Gets (as xml) the "baseline" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetBaseline();
                
                /**
                 * True if has "baseline" attribute
                 */
                boolean isSetBaseline();
                
                /**
                 * Sets the "baseline" attribute
                 */
                void setBaseline(double baseline);
                
                /**
                 * Sets (as xml) the "baseline" attribute
                 */
                void xsetBaseline(org.apache.xmlbeans.XmlDouble baseline);
                
                /**
                 * Unsets the "baseline" attribute
                 */
                void unsetBaseline();
                
                /**
                 * Gets the "perf_metric" attribute
                 */
                java.lang.String getPerfMetric();
                
                /**
                 * Gets (as xml) the "perf_metric" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPerfMetric();
                
                /**
                 * True if has "perf_metric" attribute
                 */
                boolean isSetPerfMetric();
                
                /**
                 * Sets the "perf_metric" attribute
                 */
                void setPerfMetric(java.lang.String perfMetric);
                
                /**
                 * Sets (as xml) the "perf_metric" attribute
                 */
                void xsetPerfMetric(org.apache.xmlbeans.XmlString perfMetric);
                
                /**
                 * Unsets the "perf_metric" attribute
                 */
                void unsetPerfMetric();
                
                /**
                 * Gets the "perf_metric_value" attribute
                 */
                double getPerfMetricValue();
                
                /**
                 * Gets (as xml) the "perf_metric_value" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPerfMetricValue();
                
                /**
                 * True if has "perf_metric_value" attribute
                 */
                boolean isSetPerfMetricValue();
                
                /**
                 * Sets the "perf_metric_value" attribute
                 */
                void setPerfMetricValue(double perfMetricValue);
                
                /**
                 * Sets (as xml) the "perf_metric_value" attribute
                 */
                void xsetPerfMetricValue(org.apache.xmlbeans.XmlDouble perfMetricValue);
                
                /**
                 * Unsets the "perf_metric_value" attribute
                 */
                void unsetPerfMetricValue();
                
                /**
                 * Gets the "ux_threshold_factor_reason" attribute
                 */
                java.lang.String getUxThresholdFactorReason();
                
                /**
                 * Gets (as xml) the "ux_threshold_factor_reason" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUxThresholdFactorReason();
                
                /**
                 * True if has "ux_threshold_factor_reason" attribute
                 */
                boolean isSetUxThresholdFactorReason();
                
                /**
                 * Sets the "ux_threshold_factor_reason" attribute
                 */
                void setUxThresholdFactorReason(java.lang.String uxThresholdFactorReason);
                
                /**
                 * Sets (as xml) the "ux_threshold_factor_reason" attribute
                 */
                void xsetUxThresholdFactorReason(org.apache.xmlbeans.XmlString uxThresholdFactorReason);
                
                /**
                 * Unsets the "ux_threshold_factor_reason" attribute
                 */
                void unsetUxThresholdFactorReason();
                
                /**
                 * Gets the "ux_threshold_factor" attribute
                 */
                double getUxThresholdFactor();
                
                /**
                 * Gets (as xml) the "ux_threshold_factor" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetUxThresholdFactor();
                
                /**
                 * True if has "ux_threshold_factor" attribute
                 */
                boolean isSetUxThresholdFactor();
                
                /**
                 * Sets the "ux_threshold_factor" attribute
                 */
                void setUxThresholdFactor(double uxThresholdFactor);
                
                /**
                 * Sets (as xml) the "ux_threshold_factor" attribute
                 */
                void xsetUxThresholdFactor(org.apache.xmlbeans.XmlDouble uxThresholdFactor);
                
                /**
                 * Unsets the "ux_threshold_factor" attribute
                 */
                void unsetUxThresholdFactor();
                
                /**
                 * Gets the "visually_complete_time" attribute
                 */
                java.math.BigInteger getVisuallyCompleteTime();
                
                /**
                 * Gets (as xml) the "visually_complete_time" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetVisuallyCompleteTime();
                
                /**
                 * True if has "visually_complete_time" attribute
                 */
                boolean isSetVisuallyCompleteTime();
                
                /**
                 * Sets the "visually_complete_time" attribute
                 */
                void setVisuallyCompleteTime(java.math.BigInteger visuallyCompleteTime);
                
                /**
                 * Sets (as xml) the "visually_complete_time" attribute
                 */
                void xsetVisuallyCompleteTime(org.apache.xmlbeans.XmlInteger visuallyCompleteTime);
                
                /**
                 * Unsets the "visually_complete_time" attribute
                 */
                void unsetVisuallyCompleteTime();
                
                /**
                 * Gets the "speed_index" attribute
                 */
                java.math.BigInteger getSpeedIndex();
                
                /**
                 * Gets (as xml) the "speed_index" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSpeedIndex();
                
                /**
                 * True if has "speed_index" attribute
                 */
                boolean isSetSpeedIndex();
                
                /**
                 * Sets the "speed_index" attribute
                 */
                void setSpeedIndex(java.math.BigInteger speedIndex);
                
                /**
                 * Sets (as xml) the "speed_index" attribute
                 */
                void xsetSpeedIndex(org.apache.xmlbeans.XmlInteger speedIndex);
                
                /**
                 * Unsets the "speed_index" attribute
                 */
                void unsetSpeedIndex();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath newInstance() {
                      return (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths newInstance() {
                  return (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet newInstance() {
              return (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.EnduserpurepathsdashletDocument newInstance() {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.EnduserpurepathsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.EnduserpurepathsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.EnduserpurepathsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.EnduserpurepathsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
