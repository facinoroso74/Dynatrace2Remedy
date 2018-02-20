/*
 * An XML document type.
 * Localname: useractionsdashlet
 * Namespace: 
 * Java type: noNamespace.UseractionsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one useractionsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface UseractionsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseractionsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("useractionsdashletea70doctype");
    
    /**
     * Gets the "useractionsdashlet" element
     */
    noNamespace.UseractionsdashletDocument.Useractionsdashlet getUseractionsdashlet();
    
    /**
     * Sets the "useractionsdashlet" element
     */
    void setUseractionsdashlet(noNamespace.UseractionsdashletDocument.Useractionsdashlet useractionsdashlet);
    
    /**
     * Appends and returns a new empty "useractionsdashlet" element
     */
    noNamespace.UseractionsdashletDocument.Useractionsdashlet addNewUseractionsdashlet();
    
    /**
     * An XML useractionsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Useractionsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Useractionsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("useractionsdashletab8delemtype");
        
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
         * Gets the "useractions" element
         */
        noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions getUseractions();
        
        /**
         * True if has "useractions" element
         */
        boolean isSetUseractions();
        
        /**
         * Sets the "useractions" element
         */
        void setUseractions(noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions useractions);
        
        /**
         * Appends and returns a new empty "useractions" element
         */
        noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions addNewUseractions();
        
        /**
         * Unsets the "useractions" element
         */
        void unsetUseractions();
        
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
         * An XML useractions(@).
         *
         * This is a complex type.
         */
        public interface Useractions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Useractions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("useractionscd5belemtype");
            
            /**
             * Gets array of all "useraction" elements
             */
            noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction[] getUseractionArray();
            
            /**
             * Gets ith "useraction" element
             */
            noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction getUseractionArray(int i);
            
            /**
             * Returns number of "useraction" element
             */
            int sizeOfUseractionArray();
            
            /**
             * Sets array of all "useraction" element
             */
            void setUseractionArray(noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction[] useractionArray);
            
            /**
             * Sets ith "useraction" element
             */
            void setUseractionArray(int i, noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction useraction);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "useraction" element
             */
            noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction insertNewUseraction(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "useraction" element
             */
            noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction addNewUseraction();
            
            /**
             * Removes the ith "useraction" element
             */
            void removeUseraction(int i);
            
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
             * An XML useraction(@).
             *
             * This is a complex type.
             */
            public interface Useraction extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Useraction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("useraction28a8elemtype");
                
                /**
                 * Gets array of all "useraction" elements
                 */
                noNamespace.UseractionDocument.Useraction[] getUseractionArray();
                
                /**
                 * Gets ith "useraction" element
                 */
                noNamespace.UseractionDocument.Useraction getUseractionArray(int i);
                
                /**
                 * Returns number of "useraction" element
                 */
                int sizeOfUseractionArray();
                
                /**
                 * Sets array of all "useraction" element
                 */
                void setUseractionArray(noNamespace.UseractionDocument.Useraction[] useractionArray);
                
                /**
                 * Sets ith "useraction" element
                 */
                void setUseractionArray(int i, noNamespace.UseractionDocument.Useraction useraction);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "useraction" element
                 */
                noNamespace.UseractionDocument.Useraction insertNewUseraction(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "useraction" element
                 */
                noNamespace.UseractionDocument.Useraction addNewUseraction();
                
                /**
                 * Removes the ith "useraction" element
                 */
                void removeUseraction(int i);
                
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
                 * Gets the "responsetimesum" attribute
                 */
                double getResponsetimesum();
                
                /**
                 * Gets (as xml) the "responsetimesum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponsetimesum();
                
                /**
                 * True if has "responsetimesum" attribute
                 */
                boolean isSetResponsetimesum();
                
                /**
                 * Sets the "responsetimesum" attribute
                 */
                void setResponsetimesum(double responsetimesum);
                
                /**
                 * Sets (as xml) the "responsetimesum" attribute
                 */
                void xsetResponsetimesum(org.apache.xmlbeans.XmlDouble responsetimesum);
                
                /**
                 * Unsets the "responsetimesum" attribute
                 */
                void unsetResponsetimesum();
                
                /**
                 * Gets the "responsetimeavg" attribute
                 */
                double getResponsetimeavg();
                
                /**
                 * Gets (as xml) the "responsetimeavg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponsetimeavg();
                
                /**
                 * True if has "responsetimeavg" attribute
                 */
                boolean isSetResponsetimeavg();
                
                /**
                 * Sets the "responsetimeavg" attribute
                 */
                void setResponsetimeavg(double responsetimeavg);
                
                /**
                 * Sets (as xml) the "responsetimeavg" attribute
                 */
                void xsetResponsetimeavg(org.apache.xmlbeans.XmlDouble responsetimeavg);
                
                /**
                 * Unsets the "responsetimeavg" attribute
                 */
                void unsetResponsetimeavg();
                
                /**
                 * Gets the "domloadtotal" attribute
                 */
                double getDomloadtotal();
                
                /**
                 * Gets (as xml) the "domloadtotal" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDomloadtotal();
                
                /**
                 * True if has "domloadtotal" attribute
                 */
                boolean isSetDomloadtotal();
                
                /**
                 * Sets the "domloadtotal" attribute
                 */
                void setDomloadtotal(double domloadtotal);
                
                /**
                 * Sets (as xml) the "domloadtotal" attribute
                 */
                void xsetDomloadtotal(org.apache.xmlbeans.XmlDouble domloadtotal);
                
                /**
                 * Unsets the "domloadtotal" attribute
                 */
                void unsetDomloadtotal();
                
                /**
                 * Gets the "domloadavg" attribute
                 */
                double getDomloadavg();
                
                /**
                 * Gets (as xml) the "domloadavg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDomloadavg();
                
                /**
                 * True if has "domloadavg" attribute
                 */
                boolean isSetDomloadavg();
                
                /**
                 * Sets the "domloadavg" attribute
                 */
                void setDomloadavg(double domloadavg);
                
                /**
                 * Sets (as xml) the "domloadavg" attribute
                 */
                void xsetDomloadavg(org.apache.xmlbeans.XmlDouble domloadavg);
                
                /**
                 * Unsets the "domloadavg" attribute
                 */
                void unsetDomloadavg();
                
                /**
                 * Gets the "actiontype" attribute
                 */
                java.lang.String getActiontype();
                
                /**
                 * Gets (as xml) the "actiontype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetActiontype();
                
                /**
                 * True if has "actiontype" attribute
                 */
                boolean isSetActiontype();
                
                /**
                 * Sets the "actiontype" attribute
                 */
                void setActiontype(java.lang.String actiontype);
                
                /**
                 * Sets (as xml) the "actiontype" attribute
                 */
                void xsetActiontype(org.apache.xmlbeans.XmlString actiontype);
                
                /**
                 * Unsets the "actiontype" attribute
                 */
                void unsetActiontype();
                
                /**
                 * Gets the "pagetitle" attribute
                 */
                java.lang.String getPagetitle();
                
                /**
                 * Gets (as xml) the "pagetitle" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPagetitle();
                
                /**
                 * True if has "pagetitle" attribute
                 */
                boolean isSetPagetitle();
                
                /**
                 * Sets the "pagetitle" attribute
                 */
                void setPagetitle(java.lang.String pagetitle);
                
                /**
                 * Sets (as xml) the "pagetitle" attribute
                 */
                void xsetPagetitle(org.apache.xmlbeans.XmlString pagetitle);
                
                /**
                 * Unsets the "pagetitle" attribute
                 */
                void unsetPagetitle();
                
                /**
                 * Gets the "url" attribute
                 */
                java.lang.String getUrl();
                
                /**
                 * Gets (as xml) the "url" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUrl();
                
                /**
                 * True if has "url" attribute
                 */
                boolean isSetUrl();
                
                /**
                 * Sets the "url" attribute
                 */
                void setUrl(java.lang.String url);
                
                /**
                 * Sets (as xml) the "url" attribute
                 */
                void xsetUrl(org.apache.xmlbeans.XmlString url);
                
                /**
                 * Unsets the "url" attribute
                 */
                void unsetUrl();
                
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
                 * Gets the "path" attribute
                 */
                java.lang.String getPath();
                
                /**
                 * Gets (as xml) the "path" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPath();
                
                /**
                 * True if has "path" attribute
                 */
                boolean isSetPath();
                
                /**
                 * Sets the "path" attribute
                 */
                void setPath(java.lang.String path);
                
                /**
                 * Sets (as xml) the "path" attribute
                 */
                void xsetPath(org.apache.xmlbeans.XmlString path);
                
                /**
                 * Unsets the "path" attribute
                 */
                void unsetPath();
                
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
                 * Gets the "clientip" attribute
                 */
                java.lang.String getClientip();
                
                /**
                 * Gets (as xml) the "clientip" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClientip();
                
                /**
                 * True if has "clientip" attribute
                 */
                boolean isSetClientip();
                
                /**
                 * Sets the "clientip" attribute
                 */
                void setClientip(java.lang.String clientip);
                
                /**
                 * Sets (as xml) the "clientip" attribute
                 */
                void xsetClientip(org.apache.xmlbeans.XmlString clientip);
                
                /**
                 * Unsets the "clientip" attribute
                 */
                void unsetClientip();
                
                /**
                 * Gets the "useragent" attribute
                 */
                java.lang.String getUseragent();
                
                /**
                 * Gets (as xml) the "useragent" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUseragent();
                
                /**
                 * True if has "useragent" attribute
                 */
                boolean isSetUseragent();
                
                /**
                 * Sets the "useragent" attribute
                 */
                void setUseragent(java.lang.String useragent);
                
                /**
                 * Sets (as xml) the "useragent" attribute
                 */
                void xsetUseragent(org.apache.xmlbeans.XmlString useragent);
                
                /**
                 * Unsets the "useragent" attribute
                 */
                void unsetUseragent();
                
                /**
                 * Gets the "visitor" attribute
                 */
                java.lang.String getVisitor();
                
                /**
                 * Gets (as xml) the "visitor" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVisitor();
                
                /**
                 * True if has "visitor" attribute
                 */
                boolean isSetVisitor();
                
                /**
                 * Sets the "visitor" attribute
                 */
                void setVisitor(java.lang.String visitor);
                
                /**
                 * Sets (as xml) the "visitor" attribute
                 */
                void xsetVisitor(org.apache.xmlbeans.XmlString visitor);
                
                /**
                 * Unsets the "visitor" attribute
                 */
                void unsetVisitor();
                
                /**
                 * Gets the "pageid" attribute
                 */
                double getPageid();
                
                /**
                 * Gets (as xml) the "pageid" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPageid();
                
                /**
                 * True if has "pageid" attribute
                 */
                boolean isSetPageid();
                
                /**
                 * Sets the "pageid" attribute
                 */
                void setPageid(double pageid);
                
                /**
                 * Sets (as xml) the "pageid" attribute
                 */
                void xsetPageid(org.apache.xmlbeans.XmlDouble pageid);
                
                /**
                 * Unsets the "pageid" attribute
                 */
                void unsetPageid();
                
                /**
                 * Gets the "frameid" attribute
                 */
                double getFrameid();
                
                /**
                 * Gets (as xml) the "frameid" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetFrameid();
                
                /**
                 * True if has "frameid" attribute
                 */
                boolean isSetFrameid();
                
                /**
                 * Sets the "frameid" attribute
                 */
                void setFrameid(double frameid);
                
                /**
                 * Sets (as xml) the "frameid" attribute
                 */
                void xsetFrameid(org.apache.xmlbeans.XmlDouble frameid);
                
                /**
                 * Unsets the "frameid" attribute
                 */
                void unsetFrameid();
                
                /**
                 * Gets the "starttime" attribute
                 */
                java.lang.String getStarttime();
                
                /**
                 * Gets (as xml) the "starttime" attribute
                 */
                org.apache.xmlbeans.XmlString xgetStarttime();
                
                /**
                 * True if has "starttime" attribute
                 */
                boolean isSetStarttime();
                
                /**
                 * Sets the "starttime" attribute
                 */
                void setStarttime(java.lang.String starttime);
                
                /**
                 * Sets (as xml) the "starttime" attribute
                 */
                void xsetStarttime(org.apache.xmlbeans.XmlString starttime);
                
                /**
                 * Unsets the "starttime" attribute
                 */
                void unsetStarttime();
                
                /**
                 * Gets the "clienterrors" attribute
                 */
                java.lang.String getClienterrors();
                
                /**
                 * Gets (as xml) the "clienterrors" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClienterrors();
                
                /**
                 * True if has "clienterrors" attribute
                 */
                boolean isSetClienterrors();
                
                /**
                 * Sets the "clienterrors" attribute
                 */
                void setClienterrors(java.lang.String clienterrors);
                
                /**
                 * Sets (as xml) the "clienterrors" attribute
                 */
                void xsetClienterrors(org.apache.xmlbeans.XmlString clienterrors);
                
                /**
                 * Unsets the "clienterrors" attribute
                 */
                void unsetClienterrors();
                
                /**
                 * Gets the "failedactions" attribute
                 */
                java.lang.String getFailedactions();
                
                /**
                 * Gets (as xml) the "failedactions" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFailedactions();
                
                /**
                 * True if has "failedactions" attribute
                 */
                boolean isSetFailedactions();
                
                /**
                 * Sets the "failedactions" attribute
                 */
                void setFailedactions(java.lang.String failedactions);
                
                /**
                 * Sets (as xml) the "failedactions" attribute
                 */
                void xsetFailedactions(org.apache.xmlbeans.XmlString failedactions);
                
                /**
                 * Unsets the "failedactions" attribute
                 */
                void unsetFailedactions();
                
                /**
                 * Gets the "requestssum" attribute
                 */
                java.math.BigInteger getRequestssum();
                
                /**
                 * Gets (as xml) the "requestssum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRequestssum();
                
                /**
                 * True if has "requestssum" attribute
                 */
                boolean isSetRequestssum();
                
                /**
                 * Sets the "requestssum" attribute
                 */
                void setRequestssum(java.math.BigInteger requestssum);
                
                /**
                 * Sets (as xml) the "requestssum" attribute
                 */
                void xsetRequestssum(org.apache.xmlbeans.XmlInteger requestssum);
                
                /**
                 * Unsets the "requestssum" attribute
                 */
                void unsetRequestssum();
                
                /**
                 * Gets the "requestsperactionavg" attribute
                 */
                java.math.BigInteger getRequestsperactionavg();
                
                /**
                 * Gets (as xml) the "requestsperactionavg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRequestsperactionavg();
                
                /**
                 * True if has "requestsperactionavg" attribute
                 */
                boolean isSetRequestsperactionavg();
                
                /**
                 * Sets the "requestsperactionavg" attribute
                 */
                void setRequestsperactionavg(java.math.BigInteger requestsperactionavg);
                
                /**
                 * Sets (as xml) the "requestsperactionavg" attribute
                 */
                void xsetRequestsperactionavg(org.apache.xmlbeans.XmlInteger requestsperactionavg);
                
                /**
                 * Unsets the "requestsperactionavg" attribute
                 */
                void unsetRequestsperactionavg();
                
                /**
                 * Gets the "requestsizesum" attribute
                 */
                java.lang.String getRequestsizesum();
                
                /**
                 * Gets (as xml) the "requestsizesum" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRequestsizesum();
                
                /**
                 * True if has "requestsizesum" attribute
                 */
                boolean isSetRequestsizesum();
                
                /**
                 * Sets the "requestsizesum" attribute
                 */
                void setRequestsizesum(java.lang.String requestsizesum);
                
                /**
                 * Sets (as xml) the "requestsizesum" attribute
                 */
                void xsetRequestsizesum(org.apache.xmlbeans.XmlString requestsizesum);
                
                /**
                 * Unsets the "requestsizesum" attribute
                 */
                void unsetRequestsizesum();
                
                /**
                 * Gets the "requestsizeavg" attribute
                 */
                java.lang.String getRequestsizeavg();
                
                /**
                 * Gets (as xml) the "requestsizeavg" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRequestsizeavg();
                
                /**
                 * True if has "requestsizeavg" attribute
                 */
                boolean isSetRequestsizeavg();
                
                /**
                 * Sets the "requestsizeavg" attribute
                 */
                void setRequestsizeavg(java.lang.String requestsizeavg);
                
                /**
                 * Sets (as xml) the "requestsizeavg" attribute
                 */
                void xsetRequestsizeavg(org.apache.xmlbeans.XmlString requestsizeavg);
                
                /**
                 * Unsets the "requestsizeavg" attribute
                 */
                void unsetRequestsizeavg();
                
                /**
                 * Gets the "responsesizesum" attribute
                 */
                java.lang.String getResponsesizesum();
                
                /**
                 * Gets (as xml) the "responsesizesum" attribute
                 */
                org.apache.xmlbeans.XmlString xgetResponsesizesum();
                
                /**
                 * True if has "responsesizesum" attribute
                 */
                boolean isSetResponsesizesum();
                
                /**
                 * Sets the "responsesizesum" attribute
                 */
                void setResponsesizesum(java.lang.String responsesizesum);
                
                /**
                 * Sets (as xml) the "responsesizesum" attribute
                 */
                void xsetResponsesizesum(org.apache.xmlbeans.XmlString responsesizesum);
                
                /**
                 * Unsets the "responsesizesum" attribute
                 */
                void unsetResponsesizesum();
                
                /**
                 * Gets the "responsesizeavg" attribute
                 */
                java.lang.String getResponsesizeavg();
                
                /**
                 * Gets (as xml) the "responsesizeavg" attribute
                 */
                org.apache.xmlbeans.XmlString xgetResponsesizeavg();
                
                /**
                 * True if has "responsesizeavg" attribute
                 */
                boolean isSetResponsesizeavg();
                
                /**
                 * Sets the "responsesizeavg" attribute
                 */
                void setResponsesizeavg(java.lang.String responsesizeavg);
                
                /**
                 * Sets (as xml) the "responsesizeavg" attribute
                 */
                void xsetResponsesizeavg(org.apache.xmlbeans.XmlString responsesizeavg);
                
                /**
                 * Unsets the "responsesizeavg" attribute
                 */
                void unsetResponsesizeavg();
                
                /**
                 * Gets the "apdexzone" attribute
                 */
                java.lang.String getApdexzone();
                
                /**
                 * Gets (as xml) the "apdexzone" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApdexzone();
                
                /**
                 * True if has "apdexzone" attribute
                 */
                boolean isSetApdexzone();
                
                /**
                 * Sets the "apdexzone" attribute
                 */
                void setApdexzone(java.lang.String apdexzone);
                
                /**
                 * Sets (as xml) the "apdexzone" attribute
                 */
                void xsetApdexzone(org.apache.xmlbeans.XmlString apdexzone);
                
                /**
                 * Unsets the "apdexzone" attribute
                 */
                void unsetApdexzone();
                
                /**
                 * Gets the "apdex" attribute
                 */
                java.lang.String getApdex();
                
                /**
                 * Gets (as xml) the "apdex" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApdex();
                
                /**
                 * True if has "apdex" attribute
                 */
                boolean isSetApdex();
                
                /**
                 * Sets the "apdex" attribute
                 */
                void setApdex(java.lang.String apdex);
                
                /**
                 * Sets (as xml) the "apdex" attribute
                 */
                void xsetApdex(org.apache.xmlbeans.XmlString apdex);
                
                /**
                 * Unsets the "apdex" attribute
                 */
                void unsetApdex();
                
                /**
                 * Gets the "visitcount" attribute
                 */
                java.math.BigInteger getVisitcount();
                
                /**
                 * Gets (as xml) the "visitcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetVisitcount();
                
                /**
                 * True if has "visitcount" attribute
                 */
                boolean isSetVisitcount();
                
                /**
                 * Sets the "visitcount" attribute
                 */
                void setVisitcount(java.math.BigInteger visitcount);
                
                /**
                 * Sets (as xml) the "visitcount" attribute
                 */
                void xsetVisitcount(org.apache.xmlbeans.XmlInteger visitcount);
                
                /**
                 * Unsets the "visitcount" attribute
                 */
                void unsetVisitcount();
                
                /**
                 * Gets the "networktime" attribute
                 */
                double getNetworktime();
                
                /**
                 * Gets (as xml) the "networktime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetNetworktime();
                
                /**
                 * True if has "networktime" attribute
                 */
                boolean isSetNetworktime();
                
                /**
                 * Sets the "networktime" attribute
                 */
                void setNetworktime(double networktime);
                
                /**
                 * Sets (as xml) the "networktime" attribute
                 */
                void xsetNetworktime(org.apache.xmlbeans.XmlDouble networktime);
                
                /**
                 * Unsets the "networktime" attribute
                 */
                void unsetNetworktime();
                
                /**
                 * Gets the "servertime" attribute
                 */
                double getServertime();
                
                /**
                 * Gets (as xml) the "servertime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetServertime();
                
                /**
                 * True if has "servertime" attribute
                 */
                boolean isSetServertime();
                
                /**
                 * Sets the "servertime" attribute
                 */
                void setServertime(double servertime);
                
                /**
                 * Sets (as xml) the "servertime" attribute
                 */
                void xsetServertime(org.apache.xmlbeans.XmlDouble servertime);
                
                /**
                 * Unsets the "servertime" attribute
                 */
                void unsetServertime();
                
                /**
                 * Gets the "endtoend" attribute
                 */
                java.lang.String getEndtoend();
                
                /**
                 * Gets (as xml) the "endtoend" attribute
                 */
                org.apache.xmlbeans.XmlString xgetEndtoend();
                
                /**
                 * True if has "endtoend" attribute
                 */
                boolean isSetEndtoend();
                
                /**
                 * Sets the "endtoend" attribute
                 */
                void setEndtoend(java.lang.String endtoend);
                
                /**
                 * Sets (as xml) the "endtoend" attribute
                 */
                void xsetEndtoend(org.apache.xmlbeans.XmlString endtoend);
                
                /**
                 * Unsets the "endtoend" attribute
                 */
                void unsetEndtoend();
                
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
                 * Gets the "devicename" attribute
                 */
                java.lang.String getDevicename();
                
                /**
                 * Gets (as xml) the "devicename" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDevicename();
                
                /**
                 * True if has "devicename" attribute
                 */
                boolean isSetDevicename();
                
                /**
                 * Sets the "devicename" attribute
                 */
                void setDevicename(java.lang.String devicename);
                
                /**
                 * Sets (as xml) the "devicename" attribute
                 */
                void xsetDevicename(org.apache.xmlbeans.XmlString devicename);
                
                /**
                 * Unsets the "devicename" attribute
                 */
                void unsetDevicename();
                
                /**
                 * Gets the "mobileappname" attribute
                 */
                java.lang.String getMobileappname();
                
                /**
                 * Gets (as xml) the "mobileappname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMobileappname();
                
                /**
                 * True if has "mobileappname" attribute
                 */
                boolean isSetMobileappname();
                
                /**
                 * Sets the "mobileappname" attribute
                 */
                void setMobileappname(java.lang.String mobileappname);
                
                /**
                 * Sets (as xml) the "mobileappname" attribute
                 */
                void xsetMobileappname(org.apache.xmlbeans.XmlString mobileappname);
                
                /**
                 * Unsets the "mobileappname" attribute
                 */
                void unsetMobileappname();
                
                /**
                 * Gets the "mobileappid" attribute
                 */
                java.lang.String getMobileappid();
                
                /**
                 * Gets (as xml) the "mobileappid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMobileappid();
                
                /**
                 * True if has "mobileappid" attribute
                 */
                boolean isSetMobileappid();
                
                /**
                 * Sets the "mobileappid" attribute
                 */
                void setMobileappid(java.lang.String mobileappid);
                
                /**
                 * Sets (as xml) the "mobileappid" attribute
                 */
                void xsetMobileappid(org.apache.xmlbeans.XmlString mobileappid);
                
                /**
                 * Unsets the "mobileappid" attribute
                 */
                void unsetMobileappid();
                
                /**
                 * Gets the "screenresolution" attribute
                 */
                java.lang.String getScreenresolution();
                
                /**
                 * Gets (as xml) the "screenresolution" attribute
                 */
                org.apache.xmlbeans.XmlString xgetScreenresolution();
                
                /**
                 * True if has "screenresolution" attribute
                 */
                boolean isSetScreenresolution();
                
                /**
                 * Sets the "screenresolution" attribute
                 */
                void setScreenresolution(java.lang.String screenresolution);
                
                /**
                 * Sets (as xml) the "screenresolution" attribute
                 */
                void xsetScreenresolution(org.apache.xmlbeans.XmlString screenresolution);
                
                /**
                 * Unsets the "screenresolution" attribute
                 */
                void unsetScreenresolution();
                
                /**
                 * Gets the "connectiontype" attribute
                 */
                java.lang.String getConnectiontype();
                
                /**
                 * Gets (as xml) the "connectiontype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetConnectiontype();
                
                /**
                 * True if has "connectiontype" attribute
                 */
                boolean isSetConnectiontype();
                
                /**
                 * Sets the "connectiontype" attribute
                 */
                void setConnectiontype(java.lang.String connectiontype);
                
                /**
                 * Sets (as xml) the "connectiontype" attribute
                 */
                void xsetConnectiontype(org.apache.xmlbeans.XmlString connectiontype);
                
                /**
                 * Unsets the "connectiontype" attribute
                 */
                void unsetConnectiontype();
                
                /**
                 * Gets the "carrier" attribute
                 */
                java.lang.String getCarrier();
                
                /**
                 * Gets (as xml) the "carrier" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCarrier();
                
                /**
                 * True if has "carrier" attribute
                 */
                boolean isSetCarrier();
                
                /**
                 * Sets the "carrier" attribute
                 */
                void setCarrier(java.lang.String carrier);
                
                /**
                 * Sets (as xml) the "carrier" attribute
                 */
                void xsetCarrier(org.apache.xmlbeans.XmlString carrier);
                
                /**
                 * Unsets the "carrier" attribute
                 */
                void unsetCarrier();
                
                /**
                 * Gets the "gpslocation" attribute
                 */
                java.lang.String getGpslocation();
                
                /**
                 * Gets (as xml) the "gpslocation" attribute
                 */
                org.apache.xmlbeans.XmlString xgetGpslocation();
                
                /**
                 * True if has "gpslocation" attribute
                 */
                boolean isSetGpslocation();
                
                /**
                 * Sets the "gpslocation" attribute
                 */
                void setGpslocation(java.lang.String gpslocation);
                
                /**
                 * Sets (as xml) the "gpslocation" attribute
                 */
                void xsetGpslocation(org.apache.xmlbeans.XmlString gpslocation);
                
                /**
                 * Unsets the "gpslocation" attribute
                 */
                void unsetGpslocation();
                
                /**
                 * Gets the "appversion" attribute
                 */
                java.lang.String getAppversion();
                
                /**
                 * Gets (as xml) the "appversion" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAppversion();
                
                /**
                 * True if has "appversion" attribute
                 */
                boolean isSetAppversion();
                
                /**
                 * Sets the "appversion" attribute
                 */
                void setAppversion(java.lang.String appversion);
                
                /**
                 * Sets (as xml) the "appversion" attribute
                 */
                void xsetAppversion(org.apache.xmlbeans.XmlString appversion);
                
                /**
                 * Unsets the "appversion" attribute
                 */
                void unsetAppversion();
                
                /**
                 * Gets the "appbuild" attribute
                 */
                java.lang.String getAppbuild();
                
                /**
                 * Gets (as xml) the "appbuild" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAppbuild();
                
                /**
                 * True if has "appbuild" attribute
                 */
                boolean isSetAppbuild();
                
                /**
                 * Sets the "appbuild" attribute
                 */
                void setAppbuild(java.lang.String appbuild);
                
                /**
                 * Sets (as xml) the "appbuild" attribute
                 */
                void xsetAppbuild(org.apache.xmlbeans.XmlString appbuild);
                
                /**
                 * Unsets the "appbuild" attribute
                 */
                void unsetAppbuild();
                
                /**
                 * Gets the "manufacturer" attribute
                 */
                java.lang.String getManufacturer();
                
                /**
                 * Gets (as xml) the "manufacturer" attribute
                 */
                org.apache.xmlbeans.XmlString xgetManufacturer();
                
                /**
                 * True if has "manufacturer" attribute
                 */
                boolean isSetManufacturer();
                
                /**
                 * Sets the "manufacturer" attribute
                 */
                void setManufacturer(java.lang.String manufacturer);
                
                /**
                 * Sets (as xml) the "manufacturer" attribute
                 */
                void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer);
                
                /**
                 * Unsets the "manufacturer" attribute
                 */
                void unsetManufacturer();
                
                /**
                 * Gets the "modelid" attribute
                 */
                java.lang.String getModelid();
                
                /**
                 * Gets (as xml) the "modelid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetModelid();
                
                /**
                 * True if has "modelid" attribute
                 */
                boolean isSetModelid();
                
                /**
                 * Sets the "modelid" attribute
                 */
                void setModelid(java.lang.String modelid);
                
                /**
                 * Sets (as xml) the "modelid" attribute
                 */
                void xsetModelid(org.apache.xmlbeans.XmlString modelid);
                
                /**
                 * Unsets the "modelid" attribute
                 */
                void unsetModelid();
                
                /**
                 * Gets the "cpu" attribute
                 */
                java.lang.String getCpu();
                
                /**
                 * Gets (as xml) the "cpu" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCpu();
                
                /**
                 * True if has "cpu" attribute
                 */
                boolean isSetCpu();
                
                /**
                 * Sets the "cpu" attribute
                 */
                void setCpu(java.lang.String cpu);
                
                /**
                 * Sets (as xml) the "cpu" attribute
                 */
                void xsetCpu(org.apache.xmlbeans.XmlString cpu);
                
                /**
                 * Unsets the "cpu" attribute
                 */
                void unsetCpu();
                
                /**
                 * Gets the "rooted" attribute
                 */
                java.lang.String getRooted();
                
                /**
                 * Gets (as xml) the "rooted" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRooted();
                
                /**
                 * True if has "rooted" attribute
                 */
                boolean isSetRooted();
                
                /**
                 * Sets the "rooted" attribute
                 */
                void setRooted(java.lang.String rooted);
                
                /**
                 * Sets (as xml) the "rooted" attribute
                 */
                void xsetRooted(org.apache.xmlbeans.XmlString rooted);
                
                /**
                 * Unsets the "rooted" attribute
                 */
                void unsetRooted();
                
                /**
                 * Gets the "adkversion" attribute
                 */
                java.lang.String getAdkversion();
                
                /**
                 * Gets (as xml) the "adkversion" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAdkversion();
                
                /**
                 * True if has "adkversion" attribute
                 */
                boolean isSetAdkversion();
                
                /**
                 * Sets the "adkversion" attribute
                 */
                void setAdkversion(java.lang.String adkversion);
                
                /**
                 * Sets (as xml) the "adkversion" attribute
                 */
                void xsetAdkversion(org.apache.xmlbeans.XmlString adkversion);
                
                /**
                 * Unsets the "adkversion" attribute
                 */
                void unsetAdkversion();
                
                /**
                 * Gets the "orientation" attribute
                 */
                java.lang.String getOrientation();
                
                /**
                 * Gets (as xml) the "orientation" attribute
                 */
                org.apache.xmlbeans.XmlString xgetOrientation();
                
                /**
                 * True if has "orientation" attribute
                 */
                boolean isSetOrientation();
                
                /**
                 * Sets the "orientation" attribute
                 */
                void setOrientation(java.lang.String orientation);
                
                /**
                 * Sets (as xml) the "orientation" attribute
                 */
                void xsetOrientation(org.apache.xmlbeans.XmlString orientation);
                
                /**
                 * Unsets the "orientation" attribute
                 */
                void unsetOrientation();
                
                /**
                 * Gets the "signalstrength" attribute
                 */
                java.lang.String getSignalstrength();
                
                /**
                 * Gets (as xml) the "signalstrength" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSignalstrength();
                
                /**
                 * True if has "signalstrength" attribute
                 */
                boolean isSetSignalstrength();
                
                /**
                 * Sets the "signalstrength" attribute
                 */
                void setSignalstrength(java.lang.String signalstrength);
                
                /**
                 * Sets (as xml) the "signalstrength" attribute
                 */
                void xsetSignalstrength(org.apache.xmlbeans.XmlString signalstrength);
                
                /**
                 * Unsets the "signalstrength" attribute
                 */
                void unsetSignalstrength();
                
                /**
                 * Gets the "networktechnology" attribute
                 */
                java.lang.String getNetworktechnology();
                
                /**
                 * Gets (as xml) the "networktechnology" attribute
                 */
                org.apache.xmlbeans.XmlString xgetNetworktechnology();
                
                /**
                 * True if has "networktechnology" attribute
                 */
                boolean isSetNetworktechnology();
                
                /**
                 * Sets the "networktechnology" attribute
                 */
                void setNetworktechnology(java.lang.String networktechnology);
                
                /**
                 * Sets (as xml) the "networktechnology" attribute
                 */
                void xsetNetworktechnology(org.apache.xmlbeans.XmlString networktechnology);
                
                /**
                 * Unsets the "networktechnology" attribute
                 */
                void unsetNetworktechnology();
                
                /**
                 * Gets the "sourcetitle" attribute
                 */
                java.lang.String getSourcetitle();
                
                /**
                 * Gets (as xml) the "sourcetitle" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSourcetitle();
                
                /**
                 * True if has "sourcetitle" attribute
                 */
                boolean isSetSourcetitle();
                
                /**
                 * Sets the "sourcetitle" attribute
                 */
                void setSourcetitle(java.lang.String sourcetitle);
                
                /**
                 * Sets (as xml) the "sourcetitle" attribute
                 */
                void xsetSourcetitle(org.apache.xmlbeans.XmlString sourcetitle);
                
                /**
                 * Unsets the "sourcetitle" attribute
                 */
                void unsetSourcetitle();
                
                /**
                 * Gets the "sourceurl" attribute
                 */
                java.lang.String getSourceurl();
                
                /**
                 * Gets (as xml) the "sourceurl" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSourceurl();
                
                /**
                 * True if has "sourceurl" attribute
                 */
                boolean isSetSourceurl();
                
                /**
                 * Sets the "sourceurl" attribute
                 */
                void setSourceurl(java.lang.String sourceurl);
                
                /**
                 * Sets (as xml) the "sourceurl" attribute
                 */
                void xsetSourceurl(org.apache.xmlbeans.XmlString sourceurl);
                
                /**
                 * Unsets the "sourceurl" attribute
                 */
                void unsetSourceurl();
                
                /**
                 * Gets the "viewduration" attribute
                 */
                java.lang.String getViewduration();
                
                /**
                 * Gets (as xml) the "viewduration" attribute
                 */
                org.apache.xmlbeans.XmlString xgetViewduration();
                
                /**
                 * True if has "viewduration" attribute
                 */
                boolean isSetViewduration();
                
                /**
                 * Sets the "viewduration" attribute
                 */
                void setViewduration(java.lang.String viewduration);
                
                /**
                 * Sets (as xml) the "viewduration" attribute
                 */
                void xsetViewduration(org.apache.xmlbeans.XmlString viewduration);
                
                /**
                 * Unsets the "viewduration" attribute
                 */
                void unsetViewduration();
                
                /**
                 * Gets the "performancemetric" attribute
                 */
                java.lang.String getPerformancemetric();
                
                /**
                 * Gets (as xml) the "performancemetric" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPerformancemetric();
                
                /**
                 * True if has "performancemetric" attribute
                 */
                boolean isSetPerformancemetric();
                
                /**
                 * Sets the "performancemetric" attribute
                 */
                void setPerformancemetric(java.lang.String performancemetric);
                
                /**
                 * Sets (as xml) the "performancemetric" attribute
                 */
                void xsetPerformancemetric(org.apache.xmlbeans.XmlString performancemetric);
                
                /**
                 * Unsets the "performancemetric" attribute
                 */
                void unsetPerformancemetric();
                
                /**
                 * Gets the "performancemetricvalue" attribute
                 */
                java.math.BigInteger getPerformancemetricvalue();
                
                /**
                 * Gets (as xml) the "performancemetricvalue" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPerformancemetricvalue();
                
                /**
                 * True if has "performancemetricvalue" attribute
                 */
                boolean isSetPerformancemetricvalue();
                
                /**
                 * Sets the "performancemetricvalue" attribute
                 */
                void setPerformancemetricvalue(java.math.BigInteger performancemetricvalue);
                
                /**
                 * Sets (as xml) the "performancemetricvalue" attribute
                 */
                void xsetPerformancemetricvalue(org.apache.xmlbeans.XmlInteger performancemetricvalue);
                
                /**
                 * Unsets the "performancemetricvalue" attribute
                 */
                void unsetPerformancemetricvalue();
                
                /**
                 * Gets the "performancemetricthreshold" attribute
                 */
                java.math.BigInteger getPerformancemetricthreshold();
                
                /**
                 * Gets (as xml) the "performancemetricthreshold" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPerformancemetricthreshold();
                
                /**
                 * True if has "performancemetricthreshold" attribute
                 */
                boolean isSetPerformancemetricthreshold();
                
                /**
                 * Sets the "performancemetricthreshold" attribute
                 */
                void setPerformancemetricthreshold(java.math.BigInteger performancemetricthreshold);
                
                /**
                 * Sets (as xml) the "performancemetricthreshold" attribute
                 */
                void xsetPerformancemetricthreshold(org.apache.xmlbeans.XmlInteger performancemetricthreshold);
                
                /**
                 * Unsets the "performancemetricthreshold" attribute
                 */
                void unsetPerformancemetricthreshold();
                
                /**
                 * Gets the "performancemetricfactor" attribute
                 */
                java.math.BigInteger getPerformancemetricfactor();
                
                /**
                 * Gets (as xml) the "performancemetricfactor" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPerformancemetricfactor();
                
                /**
                 * True if has "performancemetricfactor" attribute
                 */
                boolean isSetPerformancemetricfactor();
                
                /**
                 * Sets the "performancemetricfactor" attribute
                 */
                void setPerformancemetricfactor(java.math.BigInteger performancemetricfactor);
                
                /**
                 * Sets (as xml) the "performancemetricfactor" attribute
                 */
                void xsetPerformancemetricfactor(org.apache.xmlbeans.XmlInteger performancemetricfactor);
                
                /**
                 * Unsets the "performancemetricfactor" attribute
                 */
                void unsetPerformancemetricfactor();
                
                /**
                 * Gets the "performancemetricfactorreason" attribute
                 */
                java.lang.String getPerformancemetricfactorreason();
                
                /**
                 * Gets (as xml) the "performancemetricfactorreason" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPerformancemetricfactorreason();
                
                /**
                 * True if has "performancemetricfactorreason" attribute
                 */
                boolean isSetPerformancemetricfactorreason();
                
                /**
                 * Sets the "performancemetricfactorreason" attribute
                 */
                void setPerformancemetricfactorreason(java.lang.String performancemetricfactorreason);
                
                /**
                 * Sets (as xml) the "performancemetricfactorreason" attribute
                 */
                void xsetPerformancemetricfactorreason(org.apache.xmlbeans.XmlString performancemetricfactorreason);
                
                /**
                 * Unsets the "performancemetricfactorreason" attribute
                 */
                void unsetPerformancemetricfactorreason();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction newInstance() {
                      return (noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions.Useraction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions newInstance() {
                  return (noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.UseractionsdashletDocument.Useractionsdashlet.Useractions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.UseractionsdashletDocument.Useractionsdashlet newInstance() {
              return (noNamespace.UseractionsdashletDocument.Useractionsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.UseractionsdashletDocument.Useractionsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.UseractionsdashletDocument.Useractionsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.UseractionsdashletDocument newInstance() {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.UseractionsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.UseractionsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.UseractionsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.UseractionsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.UseractionsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.UseractionsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.UseractionsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.UseractionsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.UseractionsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.UseractionsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.UseractionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
