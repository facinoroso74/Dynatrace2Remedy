/*
 * An XML document type.
 * Localname: visitsdashlet
 * Namespace: 
 * Java type: noNamespace.VisitsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one visitsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface VisitsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VisitsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("visitsdashletefe8doctype");
    
    /**
     * Gets the "visitsdashlet" element
     */
    noNamespace.VisitsdashletDocument.Visitsdashlet getVisitsdashlet();
    
    /**
     * Sets the "visitsdashlet" element
     */
    void setVisitsdashlet(noNamespace.VisitsdashletDocument.Visitsdashlet visitsdashlet);
    
    /**
     * Appends and returns a new empty "visitsdashlet" element
     */
    noNamespace.VisitsdashletDocument.Visitsdashlet addNewVisitsdashlet();
    
    /**
     * An XML visitsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Visitsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Visitsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("visitsdashletd425elemtype");
        
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
         * Gets the "visits" element
         */
        noNamespace.VisitsdashletDocument.Visitsdashlet.Visits getVisits();
        
        /**
         * True if has "visits" element
         */
        boolean isSetVisits();
        
        /**
         * Sets the "visits" element
         */
        void setVisits(noNamespace.VisitsdashletDocument.Visitsdashlet.Visits visits);
        
        /**
         * Appends and returns a new empty "visits" element
         */
        noNamespace.VisitsdashletDocument.Visitsdashlet.Visits addNewVisits();
        
        /**
         * Unsets the "visits" element
         */
        void unsetVisits();
        
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
         * An XML visits(@).
         *
         * This is a complex type.
         */
        public interface Visits extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Visits.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("visitse539elemtype");
            
            /**
             * Gets array of all "visit" elements
             */
            noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit[] getVisitArray();
            
            /**
             * Gets ith "visit" element
             */
            noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit getVisitArray(int i);
            
            /**
             * Returns number of "visit" element
             */
            int sizeOfVisitArray();
            
            /**
             * Sets array of all "visit" element
             */
            void setVisitArray(noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit[] visitArray);
            
            /**
             * Sets ith "visit" element
             */
            void setVisitArray(int i, noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit visit);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "visit" element
             */
            noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit insertNewVisit(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "visit" element
             */
            noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit addNewVisit();
            
            /**
             * Removes the ith "visit" element
             */
            void removeVisit(int i);
            
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
             * An XML visit(@).
             *
             * This is a complex type.
             */
            public interface Visit extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Visit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("visit7952elemtype");
                
                /**
                 * Gets array of all "visit" elements
                 */
                noNamespace.VisitDocument.Visit[] getVisitArray();
                
                /**
                 * Gets ith "visit" element
                 */
                noNamespace.VisitDocument.Visit getVisitArray(int i);
                
                /**
                 * Returns number of "visit" element
                 */
                int sizeOfVisitArray();
                
                /**
                 * Sets array of all "visit" element
                 */
                void setVisitArray(noNamespace.VisitDocument.Visit[] visitArray);
                
                /**
                 * Sets ith "visit" element
                 */
                void setVisitArray(int i, noNamespace.VisitDocument.Visit visit);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "visit" element
                 */
                noNamespace.VisitDocument.Visit insertNewVisit(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "visit" element
                 */
                noNamespace.VisitDocument.Visit addNewVisit();
                
                /**
                 * Removes the ith "visit" element
                 */
                void removeVisit(int i);
                
                /**
                 * Gets the "header" attribute
                 */
                java.lang.String getHeader();
                
                /**
                 * Gets (as xml) the "header" attribute
                 */
                org.apache.xmlbeans.XmlString xgetHeader();
                
                /**
                 * True if has "header" attribute
                 */
                boolean isSetHeader();
                
                /**
                 * Sets the "header" attribute
                 */
                void setHeader(java.lang.String header);
                
                /**
                 * Sets (as xml) the "header" attribute
                 */
                void xsetHeader(org.apache.xmlbeans.XmlString header);
                
                /**
                 * Unsets the "header" attribute
                 */
                void unsetHeader();
                
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
                 * Gets the "userexperience" attribute
                 */
                java.lang.String getUserexperience();
                
                /**
                 * Gets (as xml) the "userexperience" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUserexperience();
                
                /**
                 * True if has "userexperience" attribute
                 */
                boolean isSetUserexperience();
                
                /**
                 * Sets the "userexperience" attribute
                 */
                void setUserexperience(java.lang.String userexperience);
                
                /**
                 * Sets (as xml) the "userexperience" attribute
                 */
                void xsetUserexperience(org.apache.xmlbeans.XmlString userexperience);
                
                /**
                 * Unsets the "userexperience" attribute
                 */
                void unsetUserexperience();
                
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
                 * Gets the "pageactioncount" attribute
                 */
                java.math.BigInteger getPageactioncount();
                
                /**
                 * Gets (as xml) the "pageactioncount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPageactioncount();
                
                /**
                 * True if has "pageactioncount" attribute
                 */
                boolean isSetPageactioncount();
                
                /**
                 * Sets the "pageactioncount" attribute
                 */
                void setPageactioncount(java.math.BigInteger pageactioncount);
                
                /**
                 * Sets (as xml) the "pageactioncount" attribute
                 */
                void xsetPageactioncount(org.apache.xmlbeans.XmlInteger pageactioncount);
                
                /**
                 * Unsets the "pageactioncount" attribute
                 */
                void unsetPageactioncount();
                
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
                 * Gets the "clienttype" attribute
                 */
                java.lang.String getClienttype();
                
                /**
                 * Gets (as xml) the "clienttype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClienttype();
                
                /**
                 * True if has "clienttype" attribute
                 */
                boolean isSetClienttype();
                
                /**
                 * Sets the "clienttype" attribute
                 */
                void setClienttype(java.lang.String clienttype);
                
                /**
                 * Sets (as xml) the "clienttype" attribute
                 */
                void xsetClienttype(org.apache.xmlbeans.XmlString clienttype);
                
                /**
                 * Unsets the "clienttype" attribute
                 */
                void unsetClienttype();
                
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
                 * Gets the "continent" attribute
                 */
                java.lang.String getContinent();
                
                /**
                 * Gets (as xml) the "continent" attribute
                 */
                org.apache.xmlbeans.XmlString xgetContinent();
                
                /**
                 * True if has "continent" attribute
                 */
                boolean isSetContinent();
                
                /**
                 * Sets the "continent" attribute
                 */
                void setContinent(java.lang.String continent);
                
                /**
                 * Sets (as xml) the "continent" attribute
                 */
                void xsetContinent(org.apache.xmlbeans.XmlString continent);
                
                /**
                 * Unsets the "continent" attribute
                 */
                void unsetContinent();
                
                /**
                 * Gets the "country" attribute
                 */
                java.lang.String getCountry();
                
                /**
                 * Gets (as xml) the "country" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCountry();
                
                /**
                 * True if has "country" attribute
                 */
                boolean isSetCountry();
                
                /**
                 * Sets the "country" attribute
                 */
                void setCountry(java.lang.String country);
                
                /**
                 * Sets (as xml) the "country" attribute
                 */
                void xsetCountry(org.apache.xmlbeans.XmlString country);
                
                /**
                 * Unsets the "country" attribute
                 */
                void unsetCountry();
                
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
                 * Gets the "lastmodified" attribute
                 */
                java.lang.String getLastmodified();
                
                /**
                 * Gets (as xml) the "lastmodified" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLastmodified();
                
                /**
                 * True if has "lastmodified" attribute
                 */
                boolean isSetLastmodified();
                
                /**
                 * Sets the "lastmodified" attribute
                 */
                void setLastmodified(java.lang.String lastmodified);
                
                /**
                 * Sets (as xml) the "lastmodified" attribute
                 */
                void xsetLastmodified(org.apache.xmlbeans.XmlString lastmodified);
                
                /**
                 * Unsets the "lastmodified" attribute
                 */
                void unsetLastmodified();
                
                /**
                 * Gets the "duration" attribute
                 */
                java.lang.String getDuration();
                
                /**
                 * Gets (as xml) the "duration" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDuration();
                
                /**
                 * True if has "duration" attribute
                 */
                boolean isSetDuration();
                
                /**
                 * Sets the "duration" attribute
                 */
                void setDuration(java.lang.String duration);
                
                /**
                 * Sets (as xml) the "duration" attribute
                 */
                void xsetDuration(org.apache.xmlbeans.XmlString duration);
                
                /**
                 * Unsets the "duration" attribute
                 */
                void unsetDuration();
                
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
                 * Gets the "lastactionfailed" attribute
                 */
                java.lang.String getLastactionfailed();
                
                /**
                 * Gets (as xml) the "lastactionfailed" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLastactionfailed();
                
                /**
                 * True if has "lastactionfailed" attribute
                 */
                boolean isSetLastactionfailed();
                
                /**
                 * Sets the "lastactionfailed" attribute
                 */
                void setLastactionfailed(java.lang.String lastactionfailed);
                
                /**
                 * Sets (as xml) the "lastactionfailed" attribute
                 */
                void xsetLastactionfailed(org.apache.xmlbeans.XmlString lastactionfailed);
                
                /**
                 * Unsets the "lastactionfailed" attribute
                 */
                void unsetLastactionfailed();
                
                /**
                 * Gets the "bounce" attribute
                 */
                java.lang.String getBounce();
                
                /**
                 * Gets (as xml) the "bounce" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBounce();
                
                /**
                 * True if has "bounce" attribute
                 */
                boolean isSetBounce();
                
                /**
                 * Sets the "bounce" attribute
                 */
                void setBounce(java.lang.String bounce);
                
                /**
                 * Sets (as xml) the "bounce" attribute
                 */
                void xsetBounce(org.apache.xmlbeans.XmlString bounce);
                
                /**
                 * Unsets the "bounce" attribute
                 */
                void unsetBounce();
                
                /**
                 * Gets the "osfamily" attribute
                 */
                java.lang.String getOsfamily();
                
                /**
                 * Gets (as xml) the "osfamily" attribute
                 */
                org.apache.xmlbeans.XmlString xgetOsfamily();
                
                /**
                 * True if has "osfamily" attribute
                 */
                boolean isSetOsfamily();
                
                /**
                 * Sets the "osfamily" attribute
                 */
                void setOsfamily(java.lang.String osfamily);
                
                /**
                 * Sets (as xml) the "osfamily" attribute
                 */
                void xsetOsfamily(org.apache.xmlbeans.XmlString osfamily);
                
                /**
                 * Unsets the "osfamily" attribute
                 */
                void unsetOsfamily();
                
                /**
                 * Gets the "osname" attribute
                 */
                java.lang.String getOsname();
                
                /**
                 * Gets (as xml) the "osname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetOsname();
                
                /**
                 * True if has "osname" attribute
                 */
                boolean isSetOsname();
                
                /**
                 * Sets the "osname" attribute
                 */
                void setOsname(java.lang.String osname);
                
                /**
                 * Sets (as xml) the "osname" attribute
                 */
                void xsetOsname(org.apache.xmlbeans.XmlString osname);
                
                /**
                 * Unsets the "osname" attribute
                 */
                void unsetOsname();
                
                /**
                 * Gets the "userid" attribute
                 */
                java.lang.String getUserid();
                
                /**
                 * Gets (as xml) the "userid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUserid();
                
                /**
                 * True if has "userid" attribute
                 */
                boolean isSetUserid();
                
                /**
                 * Sets the "userid" attribute
                 */
                void setUserid(java.lang.String userid);
                
                /**
                 * Sets (as xml) the "userid" attribute
                 */
                void xsetUserid(org.apache.xmlbeans.XmlString userid);
                
                /**
                 * Unsets the "userid" attribute
                 */
                void unsetUserid();
                
                /**
                 * Gets the "bandwith" attribute
                 */
                java.lang.String getBandwith();
                
                /**
                 * Gets (as xml) the "bandwith" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBandwith();
                
                /**
                 * True if has "bandwith" attribute
                 */
                boolean isSetBandwith();
                
                /**
                 * Sets the "bandwith" attribute
                 */
                void setBandwith(java.lang.String bandwith);
                
                /**
                 * Sets (as xml) the "bandwith" attribute
                 */
                void xsetBandwith(org.apache.xmlbeans.XmlString bandwith);
                
                /**
                 * Unsets the "bandwith" attribute
                 */
                void unsetBandwith();
                
                /**
                 * Gets the "conversion" attribute
                 */
                java.lang.String getConversion();
                
                /**
                 * Gets (as xml) the "conversion" attribute
                 */
                org.apache.xmlbeans.XmlString xgetConversion();
                
                /**
                 * True if has "conversion" attribute
                 */
                boolean isSetConversion();
                
                /**
                 * Sets the "conversion" attribute
                 */
                void setConversion(java.lang.String conversion);
                
                /**
                 * Sets (as xml) the "conversion" attribute
                 */
                void xsetConversion(org.apache.xmlbeans.XmlString conversion);
                
                /**
                 * Unsets the "conversion" attribute
                 */
                void unsetConversion();
                
                /**
                 * Gets the "transactions" attribute
                 */
                java.lang.String getTransactions();
                
                /**
                 * Gets (as xml) the "transactions" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTransactions();
                
                /**
                 * True if has "transactions" attribute
                 */
                boolean isSetTransactions();
                
                /**
                 * Sets the "transactions" attribute
                 */
                void setTransactions(java.lang.String transactions);
                
                /**
                 * Sets (as xml) the "transactions" attribute
                 */
                void xsetTransactions(org.apache.xmlbeans.XmlString transactions);
                
                /**
                 * Unsets the "transactions" attribute
                 */
                void unsetTransactions();
                
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
                 * Gets the "sessionid" attribute
                 */
                java.lang.String getSessionid();
                
                /**
                 * Gets (as xml) the "sessionid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSessionid();
                
                /**
                 * True if has "sessionid" attribute
                 */
                boolean isSetSessionid();
                
                /**
                 * Sets the "sessionid" attribute
                 */
                void setSessionid(java.lang.String sessionid);
                
                /**
                 * Sets (as xml) the "sessionid" attribute
                 */
                void xsetSessionid(org.apache.xmlbeans.XmlString sessionid);
                
                /**
                 * Unsets the "sessionid" attribute
                 */
                void unsetSessionid();
                
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
                 * Gets the "applicationname" attribute
                 */
                java.lang.String getApplicationname();
                
                /**
                 * Gets (as xml) the "applicationname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApplicationname();
                
                /**
                 * True if has "applicationname" attribute
                 */
                boolean isSetApplicationname();
                
                /**
                 * Sets the "applicationname" attribute
                 */
                void setApplicationname(java.lang.String applicationname);
                
                /**
                 * Sets (as xml) the "applicationname" attribute
                 */
                void xsetApplicationname(org.apache.xmlbeans.XmlString applicationname);
                
                /**
                 * Unsets the "applicationname" attribute
                 */
                void unsetApplicationname();
                
                /**
                 * Gets the "applicationid" attribute
                 */
                java.lang.String getApplicationid();
                
                /**
                 * Gets (as xml) the "applicationid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApplicationid();
                
                /**
                 * True if has "applicationid" attribute
                 */
                boolean isSetApplicationid();
                
                /**
                 * Sets the "applicationid" attribute
                 */
                void setApplicationid(java.lang.String applicationid);
                
                /**
                 * Sets (as xml) the "applicationid" attribute
                 */
                void xsetApplicationid(org.apache.xmlbeans.XmlString applicationid);
                
                /**
                 * Unsets the "applicationid" attribute
                 */
                void unsetApplicationid();
                
                /**
                 * Gets the "resolution" attribute
                 */
                java.lang.String getResolution();
                
                /**
                 * Gets (as xml) the "resolution" attribute
                 */
                org.apache.xmlbeans.XmlString xgetResolution();
                
                /**
                 * True if has "resolution" attribute
                 */
                boolean isSetResolution();
                
                /**
                 * Sets the "resolution" attribute
                 */
                void setResolution(java.lang.String resolution);
                
                /**
                 * Sets (as xml) the "resolution" attribute
                 */
                void xsetResolution(org.apache.xmlbeans.XmlString resolution);
                
                /**
                 * Unsets the "resolution" attribute
                 */
                void unsetResolution();
                
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
                 * Gets the "streammediatype" attribute
                 */
                java.lang.String getStreammediatype();
                
                /**
                 * Gets (as xml) the "streammediatype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetStreammediatype();
                
                /**
                 * True if has "streammediatype" attribute
                 */
                boolean isSetStreammediatype();
                
                /**
                 * Sets the "streammediatype" attribute
                 */
                void setStreammediatype(java.lang.String streammediatype);
                
                /**
                 * Sets (as xml) the "streammediatype" attribute
                 */
                void xsetStreammediatype(org.apache.xmlbeans.XmlString streammediatype);
                
                /**
                 * Unsets the "streammediatype" attribute
                 */
                void unsetStreammediatype();
                
                /**
                 * Gets the "streamcount" attribute
                 */
                java.math.BigInteger getStreamcount();
                
                /**
                 * Gets (as xml) the "streamcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetStreamcount();
                
                /**
                 * True if has "streamcount" attribute
                 */
                boolean isSetStreamcount();
                
                /**
                 * Sets the "streamcount" attribute
                 */
                void setStreamcount(java.math.BigInteger streamcount);
                
                /**
                 * Sets (as xml) the "streamcount" attribute
                 */
                void xsetStreamcount(org.apache.xmlbeans.XmlInteger streamcount);
                
                /**
                 * Unsets the "streamcount" attribute
                 */
                void unsetStreamcount();
                
                /**
                 * Gets the "audiostreamcount" attribute
                 */
                java.math.BigInteger getAudiostreamcount();
                
                /**
                 * Gets (as xml) the "audiostreamcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetAudiostreamcount();
                
                /**
                 * True if has "audiostreamcount" attribute
                 */
                boolean isSetAudiostreamcount();
                
                /**
                 * Sets the "audiostreamcount" attribute
                 */
                void setAudiostreamcount(java.math.BigInteger audiostreamcount);
                
                /**
                 * Sets (as xml) the "audiostreamcount" attribute
                 */
                void xsetAudiostreamcount(org.apache.xmlbeans.XmlInteger audiostreamcount);
                
                /**
                 * Unsets the "audiostreamcount" attribute
                 */
                void unsetAudiostreamcount();
                
                /**
                 * Gets the "videostreamcount" attribute
                 */
                java.math.BigInteger getVideostreamcount();
                
                /**
                 * Gets (as xml) the "videostreamcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetVideostreamcount();
                
                /**
                 * True if has "videostreamcount" attribute
                 */
                boolean isSetVideostreamcount();
                
                /**
                 * Sets the "videostreamcount" attribute
                 */
                void setVideostreamcount(java.math.BigInteger videostreamcount);
                
                /**
                 * Sets (as xml) the "videostreamcount" attribute
                 */
                void xsetVideostreamcount(org.apache.xmlbeans.XmlInteger videostreamcount);
                
                /**
                 * Unsets the "videostreamcount" attribute
                 */
                void unsetVideostreamcount();
                
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
                 * Gets the "convertedby" attribute
                 */
                java.lang.String getConvertedby();
                
                /**
                 * Gets (as xml) the "convertedby" attribute
                 */
                org.apache.xmlbeans.XmlString xgetConvertedby();
                
                /**
                 * True if has "convertedby" attribute
                 */
                boolean isSetConvertedby();
                
                /**
                 * Sets the "convertedby" attribute
                 */
                void setConvertedby(java.lang.String convertedby);
                
                /**
                 * Sets (as xml) the "convertedby" attribute
                 */
                void xsetConvertedby(org.apache.xmlbeans.XmlString convertedby);
                
                /**
                 * Unsets the "convertedby" attribute
                 */
                void unsetConvertedby();
                
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
                 * Gets the "region" attribute
                 */
                java.lang.String getRegion();
                
                /**
                 * Gets (as xml) the "region" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRegion();
                
                /**
                 * True if has "region" attribute
                 */
                boolean isSetRegion();
                
                /**
                 * Sets the "region" attribute
                 */
                void setRegion(java.lang.String region);
                
                /**
                 * Sets (as xml) the "region" attribute
                 */
                void xsetRegion(org.apache.xmlbeans.XmlString region);
                
                /**
                 * Unsets the "region" attribute
                 */
                void unsetRegion();
                
                /**
                 * Gets the "city" attribute
                 */
                java.lang.String getCity();
                
                /**
                 * Gets (as xml) the "city" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCity();
                
                /**
                 * True if has "city" attribute
                 */
                boolean isSetCity();
                
                /**
                 * Sets the "city" attribute
                 */
                void setCity(java.lang.String city);
                
                /**
                 * Sets (as xml) the "city" attribute
                 */
                void xsetCity(org.apache.xmlbeans.XmlString city);
                
                /**
                 * Unsets the "city" attribute
                 */
                void unsetCity();
                
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
                 * Gets the "crashed" attribute
                 */
                java.lang.String getCrashed();
                
                /**
                 * Gets (as xml) the "crashed" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCrashed();
                
                /**
                 * True if has "crashed" attribute
                 */
                boolean isSetCrashed();
                
                /**
                 * Sets the "crashed" attribute
                 */
                void setCrashed(java.lang.String crashed);
                
                /**
                 * Sets (as xml) the "crashed" attribute
                 */
                void xsetCrashed(org.apache.xmlbeans.XmlString crashed);
                
                /**
                 * Unsets the "crashed" attribute
                 */
                void unsetCrashed();
                
                /**
                 * Gets the "userexperiencereason" attribute
                 */
                java.lang.String getUserexperiencereason();
                
                /**
                 * Gets (as xml) the "userexperiencereason" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUserexperiencereason();
                
                /**
                 * True if has "userexperiencereason" attribute
                 */
                boolean isSetUserexperiencereason();
                
                /**
                 * Sets the "userexperiencereason" attribute
                 */
                void setUserexperiencereason(java.lang.String userexperiencereason);
                
                /**
                 * Sets (as xml) the "userexperiencereason" attribute
                 */
                void xsetUserexperiencereason(org.apache.xmlbeans.XmlString userexperiencereason);
                
                /**
                 * Unsets the "userexperiencereason" attribute
                 */
                void unsetUserexperiencereason();
                
                /**
                 * Gets the "landingpagetitle" attribute
                 */
                java.lang.String getLandingpagetitle();
                
                /**
                 * Gets (as xml) the "landingpagetitle" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLandingpagetitle();
                
                /**
                 * True if has "landingpagetitle" attribute
                 */
                boolean isSetLandingpagetitle();
                
                /**
                 * Sets the "landingpagetitle" attribute
                 */
                void setLandingpagetitle(java.lang.String landingpagetitle);
                
                /**
                 * Sets (as xml) the "landingpagetitle" attribute
                 */
                void xsetLandingpagetitle(org.apache.xmlbeans.XmlString landingpagetitle);
                
                /**
                 * Unsets the "landingpagetitle" attribute
                 */
                void unsetLandingpagetitle();
                
                /**
                 * Gets the "landingpageresponsetime" attribute
                 */
                java.lang.String getLandingpageresponsetime();
                
                /**
                 * Gets (as xml) the "landingpageresponsetime" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLandingpageresponsetime();
                
                /**
                 * True if has "landingpageresponsetime" attribute
                 */
                boolean isSetLandingpageresponsetime();
                
                /**
                 * Sets the "landingpageresponsetime" attribute
                 */
                void setLandingpageresponsetime(java.lang.String landingpageresponsetime);
                
                /**
                 * Sets (as xml) the "landingpageresponsetime" attribute
                 */
                void xsetLandingpageresponsetime(org.apache.xmlbeans.XmlString landingpageresponsetime);
                
                /**
                 * Unsets the "landingpageresponsetime" attribute
                 */
                void unsetLandingpageresponsetime();
                
                /**
                 * Gets the "landingpagefailed" attribute
                 */
                java.lang.String getLandingpagefailed();
                
                /**
                 * Gets (as xml) the "landingpagefailed" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLandingpagefailed();
                
                /**
                 * True if has "landingpagefailed" attribute
                 */
                boolean isSetLandingpagefailed();
                
                /**
                 * Sets the "landingpagefailed" attribute
                 */
                void setLandingpagefailed(java.lang.String landingpagefailed);
                
                /**
                 * Sets (as xml) the "landingpagefailed" attribute
                 */
                void xsetLandingpagefailed(org.apache.xmlbeans.XmlString landingpagefailed);
                
                /**
                 * Unsets the "landingpagefailed" attribute
                 */
                void unsetLandingpagefailed();
                
                /**
                 * Gets the "exitpagetitle" attribute
                 */
                java.lang.String getExitpagetitle();
                
                /**
                 * Gets (as xml) the "exitpagetitle" attribute
                 */
                org.apache.xmlbeans.XmlString xgetExitpagetitle();
                
                /**
                 * True if has "exitpagetitle" attribute
                 */
                boolean isSetExitpagetitle();
                
                /**
                 * Sets the "exitpagetitle" attribute
                 */
                void setExitpagetitle(java.lang.String exitpagetitle);
                
                /**
                 * Sets (as xml) the "exitpagetitle" attribute
                 */
                void xsetExitpagetitle(org.apache.xmlbeans.XmlString exitpagetitle);
                
                /**
                 * Unsets the "exitpagetitle" attribute
                 */
                void unsetExitpagetitle();
                
                /**
                 * Gets the "exitpageresponsetime" attribute
                 */
                java.lang.String getExitpageresponsetime();
                
                /**
                 * Gets (as xml) the "exitpageresponsetime" attribute
                 */
                org.apache.xmlbeans.XmlString xgetExitpageresponsetime();
                
                /**
                 * True if has "exitpageresponsetime" attribute
                 */
                boolean isSetExitpageresponsetime();
                
                /**
                 * Sets the "exitpageresponsetime" attribute
                 */
                void setExitpageresponsetime(java.lang.String exitpageresponsetime);
                
                /**
                 * Sets (as xml) the "exitpageresponsetime" attribute
                 */
                void xsetExitpageresponsetime(org.apache.xmlbeans.XmlString exitpageresponsetime);
                
                /**
                 * Unsets the "exitpageresponsetime" attribute
                 */
                void unsetExitpageresponsetime();
                
                /**
                 * Gets the "exitpagefailed" attribute
                 */
                java.lang.String getExitpagefailed();
                
                /**
                 * Gets (as xml) the "exitpagefailed" attribute
                 */
                org.apache.xmlbeans.XmlString xgetExitpagefailed();
                
                /**
                 * True if has "exitpagefailed" attribute
                 */
                boolean isSetExitpagefailed();
                
                /**
                 * Sets the "exitpagefailed" attribute
                 */
                void setExitpagefailed(java.lang.String exitpagefailed);
                
                /**
                 * Sets (as xml) the "exitpagefailed" attribute
                 */
                void xsetExitpagefailed(org.apache.xmlbeans.XmlString exitpagefailed);
                
                /**
                 * Unsets the "exitpagefailed" attribute
                 */
                void unsetExitpagefailed();
                
                /**
                 * Gets the "visittags" attribute
                 */
                java.lang.String getVisittags();
                
                /**
                 * Gets (as xml) the "visittags" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVisittags();
                
                /**
                 * True if has "visittags" attribute
                 */
                boolean isSetVisittags();
                
                /**
                 * Sets the "visittags" attribute
                 */
                void setVisittags(java.lang.String visittags);
                
                /**
                 * Sets (as xml) the "visittags" attribute
                 */
                void xsetVisittags(org.apache.xmlbeans.XmlString visittags);
                
                /**
                 * Unsets the "visittags" attribute
                 */
                void unsetVisittags();
                
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
                 * Gets the "endreason" attribute
                 */
                java.lang.String getEndreason();
                
                /**
                 * Gets (as xml) the "endreason" attribute
                 */
                org.apache.xmlbeans.XmlString xgetEndreason();
                
                /**
                 * True if has "endreason" attribute
                 */
                boolean isSetEndreason();
                
                /**
                 * Sets the "endreason" attribute
                 */
                void setEndreason(java.lang.String endreason);
                
                /**
                 * Sets (as xml) the "endreason" attribute
                 */
                void xsetEndreason(org.apache.xmlbeans.XmlString endreason);
                
                /**
                 * Unsets the "endreason" attribute
                 */
                void unsetEndreason();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit newInstance() {
                      return (noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.VisitsdashletDocument.Visitsdashlet.Visits.Visit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.VisitsdashletDocument.Visitsdashlet.Visits newInstance() {
                  return (noNamespace.VisitsdashletDocument.Visitsdashlet.Visits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.VisitsdashletDocument.Visitsdashlet.Visits newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.VisitsdashletDocument.Visitsdashlet.Visits) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.VisitsdashletDocument.Visitsdashlet newInstance() {
              return (noNamespace.VisitsdashletDocument.Visitsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.VisitsdashletDocument.Visitsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.VisitsdashletDocument.Visitsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.VisitsdashletDocument newInstance() {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.VisitsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.VisitsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.VisitsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.VisitsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.VisitsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.VisitsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.VisitsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.VisitsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.VisitsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.VisitsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.VisitsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
