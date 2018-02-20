/*
 * An XML document type.
 * Localname: webservicesdashlet
 * Namespace: 
 * Java type: noNamespace.WebservicesdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one webservicesdashlet(@) element.
 *
 * This is a complex type.
 */
public interface WebservicesdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebservicesdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webservicesdashletf990doctype");
    
    /**
     * Gets the "webservicesdashlet" element
     */
    noNamespace.WebservicesdashletDocument.Webservicesdashlet getWebservicesdashlet();
    
    /**
     * Sets the "webservicesdashlet" element
     */
    void setWebservicesdashlet(noNamespace.WebservicesdashletDocument.Webservicesdashlet webservicesdashlet);
    
    /**
     * Appends and returns a new empty "webservicesdashlet" element
     */
    noNamespace.WebservicesdashletDocument.Webservicesdashlet addNewWebservicesdashlet();
    
    /**
     * An XML webservicesdashlet(@).
     *
     * This is a complex type.
     */
    public interface Webservicesdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webservicesdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webservicesdashlet5f8delemtype");
        
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
         * Gets the "webservices" element
         */
        noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices getWebservices();
        
        /**
         * True if has "webservices" element
         */
        boolean isSetWebservices();
        
        /**
         * Sets the "webservices" element
         */
        void setWebservices(noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices webservices);
        
        /**
         * Appends and returns a new empty "webservices" element
         */
        noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices addNewWebservices();
        
        /**
         * Unsets the "webservices" element
         */
        void unsetWebservices();
        
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
         * An XML webservices(@).
         *
         * This is a complex type.
         */
        public interface Webservices extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webservices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webservices1e3belemtype");
            
            /**
             * Gets array of all "webservice" elements
             */
            noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice[] getWebserviceArray();
            
            /**
             * Gets ith "webservice" element
             */
            noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice getWebserviceArray(int i);
            
            /**
             * Returns number of "webservice" element
             */
            int sizeOfWebserviceArray();
            
            /**
             * Sets array of all "webservice" element
             */
            void setWebserviceArray(noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice[] webserviceArray);
            
            /**
             * Sets ith "webservice" element
             */
            void setWebserviceArray(int i, noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice webservice);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "webservice" element
             */
            noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice insertNewWebservice(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "webservice" element
             */
            noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice addNewWebservice();
            
            /**
             * Removes the ith "webservice" element
             */
            void removeWebservice(int i);
            
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
             * An XML webservice(@).
             *
             * This is a complex type.
             */
            public interface Webservice extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webservice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webservicec8a8elemtype");
                
                /**
                 * Gets the "platform" attribute
                 */
                java.lang.String getPlatform();
                
                /**
                 * Gets (as xml) the "platform" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPlatform();
                
                /**
                 * True if has "platform" attribute
                 */
                boolean isSetPlatform();
                
                /**
                 * Sets the "platform" attribute
                 */
                void setPlatform(java.lang.String platform);
                
                /**
                 * Sets (as xml) the "platform" attribute
                 */
                void xsetPlatform(org.apache.xmlbeans.XmlString platform);
                
                /**
                 * Unsets the "platform" attribute
                 */
                void unsetPlatform();
                
                /**
                 * Gets the "side" attribute
                 */
                java.lang.String getSide();
                
                /**
                 * Gets (as xml) the "side" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSide();
                
                /**
                 * True if has "side" attribute
                 */
                boolean isSetSide();
                
                /**
                 * Sets the "side" attribute
                 */
                void setSide(java.lang.String side);
                
                /**
                 * Sets (as xml) the "side" attribute
                 */
                void xsetSide(org.apache.xmlbeans.XmlString side);
                
                /**
                 * Unsets the "side" attribute
                 */
                void unsetSide();
                
                /**
                 * Gets the "endpoint" attribute
                 */
                java.lang.String getEndpoint();
                
                /**
                 * Gets (as xml) the "endpoint" attribute
                 */
                org.apache.xmlbeans.XmlString xgetEndpoint();
                
                /**
                 * True if has "endpoint" attribute
                 */
                boolean isSetEndpoint();
                
                /**
                 * Sets the "endpoint" attribute
                 */
                void setEndpoint(java.lang.String endpoint);
                
                /**
                 * Sets (as xml) the "endpoint" attribute
                 */
                void xsetEndpoint(org.apache.xmlbeans.XmlString endpoint);
                
                /**
                 * Unsets the "endpoint" attribute
                 */
                void unsetEndpoint();
                
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
                 * Gets the "total_avg" attribute
                 */
                double getTotalAvg();
                
                /**
                 * Gets (as xml) the "total_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalAvg();
                
                /**
                 * True if has "total_avg" attribute
                 */
                boolean isSetTotalAvg();
                
                /**
                 * Sets the "total_avg" attribute
                 */
                void setTotalAvg(double totalAvg);
                
                /**
                 * Sets (as xml) the "total_avg" attribute
                 */
                void xsetTotalAvg(org.apache.xmlbeans.XmlDouble totalAvg);
                
                /**
                 * Unsets the "total_avg" attribute
                 */
                void unsetTotalAvg();
                
                /**
                 * Gets the "total_min" attribute
                 */
                double getTotalMin();
                
                /**
                 * Gets (as xml) the "total_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalMin();
                
                /**
                 * True if has "total_min" attribute
                 */
                boolean isSetTotalMin();
                
                /**
                 * Sets the "total_min" attribute
                 */
                void setTotalMin(double totalMin);
                
                /**
                 * Sets (as xml) the "total_min" attribute
                 */
                void xsetTotalMin(org.apache.xmlbeans.XmlDouble totalMin);
                
                /**
                 * Unsets the "total_min" attribute
                 */
                void unsetTotalMin();
                
                /**
                 * Gets the "total_max" attribute
                 */
                double getTotalMax();
                
                /**
                 * Gets (as xml) the "total_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalMax();
                
                /**
                 * True if has "total_max" attribute
                 */
                boolean isSetTotalMax();
                
                /**
                 * Sets the "total_max" attribute
                 */
                void setTotalMax(double totalMax);
                
                /**
                 * Sets (as xml) the "total_max" attribute
                 */
                void xsetTotalMax(org.apache.xmlbeans.XmlDouble totalMax);
                
                /**
                 * Unsets the "total_max" attribute
                 */
                void unsetTotalMax();
                
                /**
                 * Gets the "total_sum" attribute
                 */
                double getTotalSum();
                
                /**
                 * Gets (as xml) the "total_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalSum();
                
                /**
                 * True if has "total_sum" attribute
                 */
                boolean isSetTotalSum();
                
                /**
                 * Sets the "total_sum" attribute
                 */
                void setTotalSum(double totalSum);
                
                /**
                 * Sets (as xml) the "total_sum" attribute
                 */
                void xsetTotalSum(org.apache.xmlbeans.XmlDouble totalSum);
                
                /**
                 * Unsets the "total_sum" attribute
                 */
                void unsetTotalSum();
                
                /**
                 * Gets the "latency_avg" attribute
                 */
                double getLatencyAvg();
                
                /**
                 * Gets (as xml) the "latency_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencyAvg();
                
                /**
                 * True if has "latency_avg" attribute
                 */
                boolean isSetLatencyAvg();
                
                /**
                 * Sets the "latency_avg" attribute
                 */
                void setLatencyAvg(double latencyAvg);
                
                /**
                 * Sets (as xml) the "latency_avg" attribute
                 */
                void xsetLatencyAvg(org.apache.xmlbeans.XmlDouble latencyAvg);
                
                /**
                 * Unsets the "latency_avg" attribute
                 */
                void unsetLatencyAvg();
                
                /**
                 * Gets the "latency_min" attribute
                 */
                double getLatencyMin();
                
                /**
                 * Gets (as xml) the "latency_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencyMin();
                
                /**
                 * True if has "latency_min" attribute
                 */
                boolean isSetLatencyMin();
                
                /**
                 * Sets the "latency_min" attribute
                 */
                void setLatencyMin(double latencyMin);
                
                /**
                 * Sets (as xml) the "latency_min" attribute
                 */
                void xsetLatencyMin(org.apache.xmlbeans.XmlDouble latencyMin);
                
                /**
                 * Unsets the "latency_min" attribute
                 */
                void unsetLatencyMin();
                
                /**
                 * Gets the "latency_max" attribute
                 */
                double getLatencyMax();
                
                /**
                 * Gets (as xml) the "latency_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencyMax();
                
                /**
                 * True if has "latency_max" attribute
                 */
                boolean isSetLatencyMax();
                
                /**
                 * Sets the "latency_max" attribute
                 */
                void setLatencyMax(double latencyMax);
                
                /**
                 * Sets (as xml) the "latency_max" attribute
                 */
                void xsetLatencyMax(org.apache.xmlbeans.XmlDouble latencyMax);
                
                /**
                 * Unsets the "latency_max" attribute
                 */
                void unsetLatencyMax();
                
                /**
                 * Gets the "latency_sum" attribute
                 */
                double getLatencySum();
                
                /**
                 * Gets (as xml) the "latency_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencySum();
                
                /**
                 * True if has "latency_sum" attribute
                 */
                boolean isSetLatencySum();
                
                /**
                 * Sets the "latency_sum" attribute
                 */
                void setLatencySum(double latencySum);
                
                /**
                 * Sets (as xml) the "latency_sum" attribute
                 */
                void xsetLatencySum(org.apache.xmlbeans.XmlDouble latencySum);
                
                /**
                 * Unsets the "latency_sum" attribute
                 */
                void unsetLatencySum();
                
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
                 * Gets the "request_size_avg" attribute
                 */
                java.math.BigInteger getRequestSizeAvg();
                
                /**
                 * Gets (as xml) the "request_size_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRequestSizeAvg();
                
                /**
                 * True if has "request_size_avg" attribute
                 */
                boolean isSetRequestSizeAvg();
                
                /**
                 * Sets the "request_size_avg" attribute
                 */
                void setRequestSizeAvg(java.math.BigInteger requestSizeAvg);
                
                /**
                 * Sets (as xml) the "request_size_avg" attribute
                 */
                void xsetRequestSizeAvg(org.apache.xmlbeans.XmlInteger requestSizeAvg);
                
                /**
                 * Unsets the "request_size_avg" attribute
                 */
                void unsetRequestSizeAvg();
                
                /**
                 * Gets the "request_size_min" attribute
                 */
                java.math.BigInteger getRequestSizeMin();
                
                /**
                 * Gets (as xml) the "request_size_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRequestSizeMin();
                
                /**
                 * True if has "request_size_min" attribute
                 */
                boolean isSetRequestSizeMin();
                
                /**
                 * Sets the "request_size_min" attribute
                 */
                void setRequestSizeMin(java.math.BigInteger requestSizeMin);
                
                /**
                 * Sets (as xml) the "request_size_min" attribute
                 */
                void xsetRequestSizeMin(org.apache.xmlbeans.XmlInteger requestSizeMin);
                
                /**
                 * Unsets the "request_size_min" attribute
                 */
                void unsetRequestSizeMin();
                
                /**
                 * Gets the "request_size_max" attribute
                 */
                java.math.BigInteger getRequestSizeMax();
                
                /**
                 * Gets (as xml) the "request_size_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRequestSizeMax();
                
                /**
                 * True if has "request_size_max" attribute
                 */
                boolean isSetRequestSizeMax();
                
                /**
                 * Sets the "request_size_max" attribute
                 */
                void setRequestSizeMax(java.math.BigInteger requestSizeMax);
                
                /**
                 * Sets (as xml) the "request_size_max" attribute
                 */
                void xsetRequestSizeMax(org.apache.xmlbeans.XmlInteger requestSizeMax);
                
                /**
                 * Unsets the "request_size_max" attribute
                 */
                void unsetRequestSizeMax();
                
                /**
                 * Gets the "request_size_sum" attribute
                 */
                java.math.BigInteger getRequestSizeSum();
                
                /**
                 * Gets (as xml) the "request_size_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRequestSizeSum();
                
                /**
                 * True if has "request_size_sum" attribute
                 */
                boolean isSetRequestSizeSum();
                
                /**
                 * Sets the "request_size_sum" attribute
                 */
                void setRequestSizeSum(java.math.BigInteger requestSizeSum);
                
                /**
                 * Sets (as xml) the "request_size_sum" attribute
                 */
                void xsetRequestSizeSum(org.apache.xmlbeans.XmlInteger requestSizeSum);
                
                /**
                 * Unsets the "request_size_sum" attribute
                 */
                void unsetRequestSizeSum();
                
                /**
                 * Gets the "response_size_avg" attribute
                 */
                java.math.BigInteger getResponseSizeAvg();
                
                /**
                 * Gets (as xml) the "response_size_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetResponseSizeAvg();
                
                /**
                 * True if has "response_size_avg" attribute
                 */
                boolean isSetResponseSizeAvg();
                
                /**
                 * Sets the "response_size_avg" attribute
                 */
                void setResponseSizeAvg(java.math.BigInteger responseSizeAvg);
                
                /**
                 * Sets (as xml) the "response_size_avg" attribute
                 */
                void xsetResponseSizeAvg(org.apache.xmlbeans.XmlInteger responseSizeAvg);
                
                /**
                 * Unsets the "response_size_avg" attribute
                 */
                void unsetResponseSizeAvg();
                
                /**
                 * Gets the "response_size_min" attribute
                 */
                java.math.BigInteger getResponseSizeMin();
                
                /**
                 * Gets (as xml) the "response_size_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetResponseSizeMin();
                
                /**
                 * True if has "response_size_min" attribute
                 */
                boolean isSetResponseSizeMin();
                
                /**
                 * Sets the "response_size_min" attribute
                 */
                void setResponseSizeMin(java.math.BigInteger responseSizeMin);
                
                /**
                 * Sets (as xml) the "response_size_min" attribute
                 */
                void xsetResponseSizeMin(org.apache.xmlbeans.XmlInteger responseSizeMin);
                
                /**
                 * Unsets the "response_size_min" attribute
                 */
                void unsetResponseSizeMin();
                
                /**
                 * Gets the "response_size_max" attribute
                 */
                java.math.BigInteger getResponseSizeMax();
                
                /**
                 * Gets (as xml) the "response_size_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetResponseSizeMax();
                
                /**
                 * True if has "response_size_max" attribute
                 */
                boolean isSetResponseSizeMax();
                
                /**
                 * Sets the "response_size_max" attribute
                 */
                void setResponseSizeMax(java.math.BigInteger responseSizeMax);
                
                /**
                 * Sets (as xml) the "response_size_max" attribute
                 */
                void xsetResponseSizeMax(org.apache.xmlbeans.XmlInteger responseSizeMax);
                
                /**
                 * Unsets the "response_size_max" attribute
                 */
                void unsetResponseSizeMax();
                
                /**
                 * Gets the "response_size_sum" attribute
                 */
                java.math.BigInteger getResponseSizeSum();
                
                /**
                 * Gets (as xml) the "response_size_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetResponseSizeSum();
                
                /**
                 * True if has "response_size_sum" attribute
                 */
                boolean isSetResponseSizeSum();
                
                /**
                 * Sets the "response_size_sum" attribute
                 */
                void setResponseSizeSum(java.math.BigInteger responseSizeSum);
                
                /**
                 * Sets (as xml) the "response_size_sum" attribute
                 */
                void xsetResponseSizeSum(org.apache.xmlbeans.XmlInteger responseSizeSum);
                
                /**
                 * Unsets the "response_size_sum" attribute
                 */
                void unsetResponseSizeSum();
                
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
                 * Gets the "application_id" attribute
                 */
                java.lang.String getApplicationId();
                
                /**
                 * Gets (as xml) the "application_id" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApplicationId();
                
                /**
                 * True if has "application_id" attribute
                 */
                boolean isSetApplicationId();
                
                /**
                 * Sets the "application_id" attribute
                 */
                void setApplicationId(java.lang.String applicationId);
                
                /**
                 * Sets (as xml) the "application_id" attribute
                 */
                void xsetApplicationId(org.apache.xmlbeans.XmlString applicationId);
                
                /**
                 * Unsets the "application_id" attribute
                 */
                void unsetApplicationId();
                
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
                    public static noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice newInstance() {
                      return (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices newInstance() {
                  return (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.WebservicesdashletDocument.Webservicesdashlet newInstance() {
              return (noNamespace.WebservicesdashletDocument.Webservicesdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.WebservicesdashletDocument.Webservicesdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.WebservicesdashletDocument.Webservicesdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.WebservicesdashletDocument newInstance() {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.WebservicesdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.WebservicesdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.WebservicesdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.WebservicesdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.WebservicesdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.WebservicesdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.WebservicesdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.WebservicesdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.WebservicesdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.WebservicesdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.WebservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
