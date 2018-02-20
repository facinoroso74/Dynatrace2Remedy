/*
 * An XML document type.
 * Localname: webrequestsdashlet
 * Namespace: 
 * Java type: noNamespace.WebrequestsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one webrequestsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface WebrequestsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebrequestsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webrequestsdashletab6adoctype");
    
    /**
     * Gets the "webrequestsdashlet" element
     */
    noNamespace.WebrequestsdashletDocument.Webrequestsdashlet getWebrequestsdashlet();
    
    /**
     * Sets the "webrequestsdashlet" element
     */
    void setWebrequestsdashlet(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet webrequestsdashlet);
    
    /**
     * Appends and returns a new empty "webrequestsdashlet" element
     */
    noNamespace.WebrequestsdashletDocument.Webrequestsdashlet addNewWebrequestsdashlet();
    
    /**
     * An XML webrequestsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Webrequestsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webrequestsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webrequestsdashletebcdelemtype");
        
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
         * Gets the "grouping" element
         */
        noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping getGrouping();
        
        /**
         * True if has "grouping" element
         */
        boolean isSetGrouping();
        
        /**
         * Sets the "grouping" element
         */
        void setGrouping(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping grouping);
        
        /**
         * Appends and returns a new empty "grouping" element
         */
        noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping addNewGrouping();
        
        /**
         * Unsets the "grouping" element
         */
        void unsetGrouping();
        
        /**
         * Gets the "webrequests" element
         */
        noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests getWebrequests();
        
        /**
         * True if has "webrequests" element
         */
        boolean isSetWebrequests();
        
        /**
         * Sets the "webrequests" element
         */
        void setWebrequests(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests webrequests);
        
        /**
         * Appends and returns a new empty "webrequests" element
         */
        noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests addNewWebrequests();
        
        /**
         * Unsets the "webrequests" element
         */
        void unsetWebrequests();
        
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
         * An XML grouping(@).
         *
         * This is a complex type.
         */
        public interface Grouping extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Grouping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("groupinga89celemtype");
            
            /**
             * Gets the "groupedby" attribute
             */
            java.lang.String getGroupedby();
            
            /**
             * Gets (as xml) the "groupedby" attribute
             */
            org.apache.xmlbeans.XmlString xgetGroupedby();
            
            /**
             * Sets the "groupedby" attribute
             */
            void setGroupedby(java.lang.String groupedby);
            
            /**
             * Sets (as xml) the "groupedby" attribute
             */
            void xsetGroupedby(org.apache.xmlbeans.XmlString groupedby);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping newInstance() {
                  return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML webrequests(@).
         *
         * This is a complex type.
         */
        public interface Webrequests extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webrequests.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webrequests5a61elemtype");
            
            /**
             * Gets array of all "webrequest" elements
             */
            noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest[] getWebrequestArray();
            
            /**
             * Gets ith "webrequest" element
             */
            noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest getWebrequestArray(int i);
            
            /**
             * Returns number of "webrequest" element
             */
            int sizeOfWebrequestArray();
            
            /**
             * Sets array of all "webrequest" element
             */
            void setWebrequestArray(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest[] webrequestArray);
            
            /**
             * Sets ith "webrequest" element
             */
            void setWebrequestArray(int i, noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest webrequest);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "webrequest" element
             */
            noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest insertNewWebrequest(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "webrequest" element
             */
            noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest addNewWebrequest();
            
            /**
             * Removes the ith "webrequest" element
             */
            void removeWebrequest(int i);
            
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
             * An XML webrequest(@).
             *
             * This is a complex type.
             */
            public interface Webrequest extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webrequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("webrequestdaa8elemtype");
                
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
                 * Gets the "uri" attribute
                 */
                java.lang.String getUri();
                
                /**
                 * Gets (as xml) the "uri" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUri();
                
                /**
                 * True if has "uri" attribute
                 */
                boolean isSetUri();
                
                /**
                 * Sets the "uri" attribute
                 */
                void setUri(java.lang.String uri);
                
                /**
                 * Sets (as xml) the "uri" attribute
                 */
                void xsetUri(org.apache.xmlbeans.XmlString uri);
                
                /**
                 * Unsets the "uri" attribute
                 */
                void unsetUri();
                
                /**
                 * Gets the "query" attribute
                 */
                java.lang.String getQuery();
                
                /**
                 * Gets (as xml) the "query" attribute
                 */
                org.apache.xmlbeans.XmlString xgetQuery();
                
                /**
                 * True if has "query" attribute
                 */
                boolean isSetQuery();
                
                /**
                 * Sets the "query" attribute
                 */
                void setQuery(java.lang.String query);
                
                /**
                 * Sets (as xml) the "query" attribute
                 */
                void xsetQuery(org.apache.xmlbeans.XmlString query);
                
                /**
                 * Unsets the "query" attribute
                 */
                void unsetQuery();
                
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
                 * Gets the "servlet_name" attribute
                 */
                java.lang.String getServletName();
                
                /**
                 * Gets (as xml) the "servlet_name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetServletName();
                
                /**
                 * True if has "servlet_name" attribute
                 */
                boolean isSetServletName();
                
                /**
                 * Sets the "servlet_name" attribute
                 */
                void setServletName(java.lang.String servletName);
                
                /**
                 * Sets (as xml) the "servlet_name" attribute
                 */
                void xsetServletName(org.apache.xmlbeans.XmlString servletName);
                
                /**
                 * Unsets the "servlet_name" attribute
                 */
                void unsetServletName();
                
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
                 * Gets the "sent_avg" attribute
                 */
                java.math.BigInteger getSentAvg();
                
                /**
                 * Gets (as xml) the "sent_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSentAvg();
                
                /**
                 * True if has "sent_avg" attribute
                 */
                boolean isSetSentAvg();
                
                /**
                 * Sets the "sent_avg" attribute
                 */
                void setSentAvg(java.math.BigInteger sentAvg);
                
                /**
                 * Sets (as xml) the "sent_avg" attribute
                 */
                void xsetSentAvg(org.apache.xmlbeans.XmlInteger sentAvg);
                
                /**
                 * Unsets the "sent_avg" attribute
                 */
                void unsetSentAvg();
                
                /**
                 * Gets the "sent_min" attribute
                 */
                java.math.BigInteger getSentMin();
                
                /**
                 * Gets (as xml) the "sent_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSentMin();
                
                /**
                 * True if has "sent_min" attribute
                 */
                boolean isSetSentMin();
                
                /**
                 * Sets the "sent_min" attribute
                 */
                void setSentMin(java.math.BigInteger sentMin);
                
                /**
                 * Sets (as xml) the "sent_min" attribute
                 */
                void xsetSentMin(org.apache.xmlbeans.XmlInteger sentMin);
                
                /**
                 * Unsets the "sent_min" attribute
                 */
                void unsetSentMin();
                
                /**
                 * Gets the "sent_max" attribute
                 */
                java.math.BigInteger getSentMax();
                
                /**
                 * Gets (as xml) the "sent_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSentMax();
                
                /**
                 * True if has "sent_max" attribute
                 */
                boolean isSetSentMax();
                
                /**
                 * Sets the "sent_max" attribute
                 */
                void setSentMax(java.math.BigInteger sentMax);
                
                /**
                 * Sets (as xml) the "sent_max" attribute
                 */
                void xsetSentMax(org.apache.xmlbeans.XmlInteger sentMax);
                
                /**
                 * Unsets the "sent_max" attribute
                 */
                void unsetSentMax();
                
                /**
                 * Gets the "sent_sum" attribute
                 */
                java.math.BigInteger getSentSum();
                
                /**
                 * Gets (as xml) the "sent_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSentSum();
                
                /**
                 * True if has "sent_sum" attribute
                 */
                boolean isSetSentSum();
                
                /**
                 * Sets the "sent_sum" attribute
                 */
                void setSentSum(java.math.BigInteger sentSum);
                
                /**
                 * Sets (as xml) the "sent_sum" attribute
                 */
                void xsetSentSum(org.apache.xmlbeans.XmlInteger sentSum);
                
                /**
                 * Unsets the "sent_sum" attribute
                 */
                void unsetSentSum();
                
                /**
                 * Gets the "rcvd_avg" attribute
                 */
                java.math.BigInteger getRcvdAvg();
                
                /**
                 * Gets (as xml) the "rcvd_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRcvdAvg();
                
                /**
                 * True if has "rcvd_avg" attribute
                 */
                boolean isSetRcvdAvg();
                
                /**
                 * Sets the "rcvd_avg" attribute
                 */
                void setRcvdAvg(java.math.BigInteger rcvdAvg);
                
                /**
                 * Sets (as xml) the "rcvd_avg" attribute
                 */
                void xsetRcvdAvg(org.apache.xmlbeans.XmlInteger rcvdAvg);
                
                /**
                 * Unsets the "rcvd_avg" attribute
                 */
                void unsetRcvdAvg();
                
                /**
                 * Gets the "rcvd_min" attribute
                 */
                java.math.BigInteger getRcvdMin();
                
                /**
                 * Gets (as xml) the "rcvd_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRcvdMin();
                
                /**
                 * True if has "rcvd_min" attribute
                 */
                boolean isSetRcvdMin();
                
                /**
                 * Sets the "rcvd_min" attribute
                 */
                void setRcvdMin(java.math.BigInteger rcvdMin);
                
                /**
                 * Sets (as xml) the "rcvd_min" attribute
                 */
                void xsetRcvdMin(org.apache.xmlbeans.XmlInteger rcvdMin);
                
                /**
                 * Unsets the "rcvd_min" attribute
                 */
                void unsetRcvdMin();
                
                /**
                 * Gets the "rcvd_max" attribute
                 */
                java.math.BigInteger getRcvdMax();
                
                /**
                 * Gets (as xml) the "rcvd_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRcvdMax();
                
                /**
                 * True if has "rcvd_max" attribute
                 */
                boolean isSetRcvdMax();
                
                /**
                 * Sets the "rcvd_max" attribute
                 */
                void setRcvdMax(java.math.BigInteger rcvdMax);
                
                /**
                 * Sets (as xml) the "rcvd_max" attribute
                 */
                void xsetRcvdMax(org.apache.xmlbeans.XmlInteger rcvdMax);
                
                /**
                 * Unsets the "rcvd_max" attribute
                 */
                void unsetRcvdMax();
                
                /**
                 * Gets the "rcvd_sum" attribute
                 */
                java.math.BigInteger getRcvdSum();
                
                /**
                 * Gets (as xml) the "rcvd_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRcvdSum();
                
                /**
                 * True if has "rcvd_sum" attribute
                 */
                boolean isSetRcvdSum();
                
                /**
                 * Sets the "rcvd_sum" attribute
                 */
                void setRcvdSum(java.math.BigInteger rcvdSum);
                
                /**
                 * Sets (as xml) the "rcvd_sum" attribute
                 */
                void xsetRcvdSum(org.apache.xmlbeans.XmlInteger rcvdSum);
                
                /**
                 * Unsets the "rcvd_sum" attribute
                 */
                void unsetRcvdSum();
                
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
                 * Gets the "agent_group" attribute
                 */
                java.lang.String getAgentGroup();
                
                /**
                 * Gets (as xml) the "agent_group" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgentGroup();
                
                /**
                 * True if has "agent_group" attribute
                 */
                boolean isSetAgentGroup();
                
                /**
                 * Sets the "agent_group" attribute
                 */
                void setAgentGroup(java.lang.String agentGroup);
                
                /**
                 * Sets (as xml) the "agent_group" attribute
                 */
                void xsetAgentGroup(org.apache.xmlbeans.XmlString agentGroup);
                
                /**
                 * Unsets the "agent_group" attribute
                 */
                void unsetAgentGroup();
                
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
                 * Gets the "web_request_response_time_avg" attribute
                 */
                double getWebRequestResponseTimeAvg();
                
                /**
                 * Gets (as xml) the "web_request_response_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeAvg();
                
                /**
                 * True if has "web_request_response_time_avg" attribute
                 */
                boolean isSetWebRequestResponseTimeAvg();
                
                /**
                 * Sets the "web_request_response_time_avg" attribute
                 */
                void setWebRequestResponseTimeAvg(double webRequestResponseTimeAvg);
                
                /**
                 * Sets (as xml) the "web_request_response_time_avg" attribute
                 */
                void xsetWebRequestResponseTimeAvg(org.apache.xmlbeans.XmlDouble webRequestResponseTimeAvg);
                
                /**
                 * Unsets the "web_request_response_time_avg" attribute
                 */
                void unsetWebRequestResponseTimeAvg();
                
                /**
                 * Gets the "web_request_response_time_min" attribute
                 */
                double getWebRequestResponseTimeMin();
                
                /**
                 * Gets (as xml) the "web_request_response_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeMin();
                
                /**
                 * True if has "web_request_response_time_min" attribute
                 */
                boolean isSetWebRequestResponseTimeMin();
                
                /**
                 * Sets the "web_request_response_time_min" attribute
                 */
                void setWebRequestResponseTimeMin(double webRequestResponseTimeMin);
                
                /**
                 * Sets (as xml) the "web_request_response_time_min" attribute
                 */
                void xsetWebRequestResponseTimeMin(org.apache.xmlbeans.XmlDouble webRequestResponseTimeMin);
                
                /**
                 * Unsets the "web_request_response_time_min" attribute
                 */
                void unsetWebRequestResponseTimeMin();
                
                /**
                 * Gets the "web_request_response_time_max" attribute
                 */
                double getWebRequestResponseTimeMax();
                
                /**
                 * Gets (as xml) the "web_request_response_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeMax();
                
                /**
                 * True if has "web_request_response_time_max" attribute
                 */
                boolean isSetWebRequestResponseTimeMax();
                
                /**
                 * Sets the "web_request_response_time_max" attribute
                 */
                void setWebRequestResponseTimeMax(double webRequestResponseTimeMax);
                
                /**
                 * Sets (as xml) the "web_request_response_time_max" attribute
                 */
                void xsetWebRequestResponseTimeMax(org.apache.xmlbeans.XmlDouble webRequestResponseTimeMax);
                
                /**
                 * Unsets the "web_request_response_time_max" attribute
                 */
                void unsetWebRequestResponseTimeMax();
                
                /**
                 * Gets the "web_request_response_time_sum" attribute
                 */
                double getWebRequestResponseTimeSum();
                
                /**
                 * Gets (as xml) the "web_request_response_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeSum();
                
                /**
                 * True if has "web_request_response_time_sum" attribute
                 */
                boolean isSetWebRequestResponseTimeSum();
                
                /**
                 * Sets the "web_request_response_time_sum" attribute
                 */
                void setWebRequestResponseTimeSum(double webRequestResponseTimeSum);
                
                /**
                 * Sets (as xml) the "web_request_response_time_sum" attribute
                 */
                void xsetWebRequestResponseTimeSum(org.apache.xmlbeans.XmlDouble webRequestResponseTimeSum);
                
                /**
                 * Unsets the "web_request_response_time_sum" attribute
                 */
                void unsetWebRequestResponseTimeSum();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest newInstance() {
                      return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests newInstance() {
                  return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet newInstance() {
              return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.WebrequestsdashletDocument.Webrequestsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.WebrequestsdashletDocument newInstance() {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.WebrequestsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.WebrequestsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.WebrequestsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.WebrequestsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.WebrequestsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.WebrequestsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
