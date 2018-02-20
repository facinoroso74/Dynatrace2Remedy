/*
 * An XML document type.
 * Localname: clienterrorsdashlet
 * Namespace: 
 * Java type: noNamespace.ClienterrorsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one clienterrorsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface ClienterrorsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClienterrorsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("clienterrorsdashlet3c7adoctype");
    
    /**
     * Gets the "clienterrorsdashlet" element
     */
    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet getClienterrorsdashlet();
    
    /**
     * Sets the "clienterrorsdashlet" element
     */
    void setClienterrorsdashlet(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet clienterrorsdashlet);
    
    /**
     * Appends and returns a new empty "clienterrorsdashlet" element
     */
    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet addNewClienterrorsdashlet();
    
    /**
     * An XML clienterrorsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Clienterrorsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Clienterrorsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("clienterrorsdashlet4149elemtype");
        
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
         * Gets the "errortypes" element
         */
        noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes getErrortypes();
        
        /**
         * True if has "errortypes" element
         */
        boolean isSetErrortypes();
        
        /**
         * Sets the "errortypes" element
         */
        void setErrortypes(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes errortypes);
        
        /**
         * Appends and returns a new empty "errortypes" element
         */
        noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes addNewErrortypes();
        
        /**
         * Unsets the "errortypes" element
         */
        void unsetErrortypes();
        
        /**
         * Gets the "clienterrors" element
         */
        noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors getClienterrors();
        
        /**
         * True if has "clienterrors" element
         */
        boolean isSetClienterrors();
        
        /**
         * Sets the "clienterrors" element
         */
        void setClienterrors(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors clienterrors);
        
        /**
         * Appends and returns a new empty "clienterrors" element
         */
        noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors addNewClienterrors();
        
        /**
         * Unsets the "clienterrors" element
         */
        void unsetClienterrors();
        
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
         * An XML errortypes(@).
         *
         * This is a complex type.
         */
        public interface Errortypes extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errortypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errortypes05c6elemtype");
            
            /**
             * Gets array of all "errortype" elements
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype[] getErrortypeArray();
            
            /**
             * Gets ith "errortype" element
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype getErrortypeArray(int i);
            
            /**
             * Returns number of "errortype" element
             */
            int sizeOfErrortypeArray();
            
            /**
             * Sets array of all "errortype" element
             */
            void setErrortypeArray(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype[] errortypeArray);
            
            /**
             * Sets ith "errortype" element
             */
            void setErrortypeArray(int i, noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype errortype);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "errortype" element
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype insertNewErrortype(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "errortype" element
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype addNewErrortype();
            
            /**
             * Removes the ith "errortype" element
             */
            void removeErrortype(int i);
            
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
             * An XML errortype(@).
             *
             * This is a complex type.
             */
            public interface Errortype extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errortype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errortype23c8elemtype");
                
                /**
                 * Gets array of all "errortype" elements
                 */
                noNamespace.ErrortypeDocument.Errortype[] getErrortypeArray();
                
                /**
                 * Gets ith "errortype" element
                 */
                noNamespace.ErrortypeDocument.Errortype getErrortypeArray(int i);
                
                /**
                 * Returns number of "errortype" element
                 */
                int sizeOfErrortypeArray();
                
                /**
                 * Sets array of all "errortype" element
                 */
                void setErrortypeArray(noNamespace.ErrortypeDocument.Errortype[] errortypeArray);
                
                /**
                 * Sets ith "errortype" element
                 */
                void setErrortypeArray(int i, noNamespace.ErrortypeDocument.Errortype errortype);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "errortype" element
                 */
                noNamespace.ErrortypeDocument.Errortype insertNewErrortype(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "errortype" element
                 */
                noNamespace.ErrortypeDocument.Errortype addNewErrortype();
                
                /**
                 * Removes the ith "errortype" element
                 */
                void removeErrortype(int i);
                
                /**
                 * Gets the "errortype" attribute
                 */
                java.lang.String getErrortype2();
                
                /**
                 * Gets (as xml) the "errortype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetErrortype2();
                
                /**
                 * True if has "errortype" attribute
                 */
                boolean isSetErrortype2();
                
                /**
                 * Sets the "errortype" attribute
                 */
                void setErrortype2(java.lang.String errortype2);
                
                /**
                 * Sets (as xml) the "errortype" attribute
                 */
                void xsetErrortype2(org.apache.xmlbeans.XmlString errortype2);
                
                /**
                 * Unsets the "errortype" attribute
                 */
                void unsetErrortype2();
                
                /**
                 * Gets the "errorcount" attribute
                 */
                java.lang.String getErrorcount();
                
                /**
                 * Gets (as xml) the "errorcount" attribute
                 */
                org.apache.xmlbeans.XmlString xgetErrorcount();
                
                /**
                 * True if has "errorcount" attribute
                 */
                boolean isSetErrorcount();
                
                /**
                 * Sets the "errorcount" attribute
                 */
                void setErrorcount(java.lang.String errorcount);
                
                /**
                 * Sets (as xml) the "errorcount" attribute
                 */
                void xsetErrorcount(org.apache.xmlbeans.XmlString errorcount);
                
                /**
                 * Unsets the "errorcount" attribute
                 */
                void unsetErrorcount();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype newInstance() {
                      return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes newInstance() {
                  return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML clienterrors(@).
         *
         * This is a complex type.
         */
        public interface Clienterrors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Clienterrors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("clienterrors23cbelemtype");
            
            /**
             * Gets array of all "clienterror" elements
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror[] getClienterrorArray();
            
            /**
             * Gets ith "clienterror" element
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror getClienterrorArray(int i);
            
            /**
             * Returns number of "clienterror" element
             */
            int sizeOfClienterrorArray();
            
            /**
             * Sets array of all "clienterror" element
             */
            void setClienterrorArray(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror[] clienterrorArray);
            
            /**
             * Sets ith "clienterror" element
             */
            void setClienterrorArray(int i, noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror clienterror);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "clienterror" element
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror insertNewClienterror(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "clienterror" element
             */
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror addNewClienterror();
            
            /**
             * Removes the ith "clienterror" element
             */
            void removeClienterror(int i);
            
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
             * An XML clienterror(@).
             *
             * This is a complex type.
             */
            public interface Clienterror extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Clienterror.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("clienterror7a92elemtype");
                
                /**
                 * Gets array of all "clienterror" elements
                 */
                noNamespace.ClienterrorDocument.Clienterror[] getClienterrorArray();
                
                /**
                 * Gets ith "clienterror" element
                 */
                noNamespace.ClienterrorDocument.Clienterror getClienterrorArray(int i);
                
                /**
                 * Returns number of "clienterror" element
                 */
                int sizeOfClienterrorArray();
                
                /**
                 * Sets array of all "clienterror" element
                 */
                void setClienterrorArray(noNamespace.ClienterrorDocument.Clienterror[] clienterrorArray);
                
                /**
                 * Sets ith "clienterror" element
                 */
                void setClienterrorArray(int i, noNamespace.ClienterrorDocument.Clienterror clienterror);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "clienterror" element
                 */
                noNamespace.ClienterrorDocument.Clienterror insertNewClienterror(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "clienterror" element
                 */
                noNamespace.ClienterrorDocument.Clienterror addNewClienterror();
                
                /**
                 * Removes the ith "clienterror" element
                 */
                void removeClienterror(int i);
                
                /**
                 * Gets the "errormessage" attribute
                 */
                java.lang.String getErrormessage();
                
                /**
                 * Gets (as xml) the "errormessage" attribute
                 */
                org.apache.xmlbeans.XmlString xgetErrormessage();
                
                /**
                 * True if has "errormessage" attribute
                 */
                boolean isSetErrormessage();
                
                /**
                 * Sets the "errormessage" attribute
                 */
                void setErrormessage(java.lang.String errormessage);
                
                /**
                 * Sets (as xml) the "errormessage" attribute
                 */
                void xsetErrormessage(org.apache.xmlbeans.XmlString errormessage);
                
                /**
                 * Unsets the "errormessage" attribute
                 */
                void unsetErrormessage();
                
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
                 * Gets the "webpagetitle" attribute
                 */
                java.lang.String getWebpagetitle();
                
                /**
                 * Gets (as xml) the "webpagetitle" attribute
                 */
                org.apache.xmlbeans.XmlString xgetWebpagetitle();
                
                /**
                 * True if has "webpagetitle" attribute
                 */
                boolean isSetWebpagetitle();
                
                /**
                 * Sets the "webpagetitle" attribute
                 */
                void setWebpagetitle(java.lang.String webpagetitle);
                
                /**
                 * Sets (as xml) the "webpagetitle" attribute
                 */
                void xsetWebpagetitle(org.apache.xmlbeans.XmlString webpagetitle);
                
                /**
                 * Unsets the "webpagetitle" attribute
                 */
                void unsetWebpagetitle();
                
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
                 * Gets the "hostname" attribute
                 */
                java.lang.String getHostname();
                
                /**
                 * Gets (as xml) the "hostname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetHostname();
                
                /**
                 * True if has "hostname" attribute
                 */
                boolean isSetHostname();
                
                /**
                 * Sets the "hostname" attribute
                 */
                void setHostname(java.lang.String hostname);
                
                /**
                 * Sets (as xml) the "hostname" attribute
                 */
                void xsetHostname(org.apache.xmlbeans.XmlString hostname);
                
                /**
                 * Unsets the "hostname" attribute
                 */
                void unsetHostname();
                
                /**
                 * Gets the "serverpath" attribute
                 */
                java.lang.String getServerpath();
                
                /**
                 * Gets (as xml) the "serverpath" attribute
                 */
                org.apache.xmlbeans.XmlString xgetServerpath();
                
                /**
                 * True if has "serverpath" attribute
                 */
                boolean isSetServerpath();
                
                /**
                 * Sets the "serverpath" attribute
                 */
                void setServerpath(java.lang.String serverpath);
                
                /**
                 * Sets (as xml) the "serverpath" attribute
                 */
                void xsetServerpath(org.apache.xmlbeans.XmlString serverpath);
                
                /**
                 * Unsets the "serverpath" attribute
                 */
                void unsetServerpath();
                
                /**
                 * Gets the "querystring" attribute
                 */
                java.lang.String getQuerystring();
                
                /**
                 * Gets (as xml) the "querystring" attribute
                 */
                org.apache.xmlbeans.XmlString xgetQuerystring();
                
                /**
                 * True if has "querystring" attribute
                 */
                boolean isSetQuerystring();
                
                /**
                 * Sets the "querystring" attribute
                 */
                void setQuerystring(java.lang.String querystring);
                
                /**
                 * Sets (as xml) the "querystring" attribute
                 */
                void xsetQuerystring(org.apache.xmlbeans.XmlString querystring);
                
                /**
                 * Unsets the "querystring" attribute
                 */
                void unsetQuerystring();
                
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
                 * Gets the "pageid" attribute
                 */
                java.lang.String getPageid();
                
                /**
                 * Gets (as xml) the "pageid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPageid();
                
                /**
                 * True if has "pageid" attribute
                 */
                boolean isSetPageid();
                
                /**
                 * Sets the "pageid" attribute
                 */
                void setPageid(java.lang.String pageid);
                
                /**
                 * Sets (as xml) the "pageid" attribute
                 */
                void xsetPageid(org.apache.xmlbeans.XmlString pageid);
                
                /**
                 * Unsets the "pageid" attribute
                 */
                void unsetPageid();
                
                /**
                 * Gets the "frameid" attribute
                 */
                java.lang.String getFrameid();
                
                /**
                 * Gets (as xml) the "frameid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFrameid();
                
                /**
                 * True if has "frameid" attribute
                 */
                boolean isSetFrameid();
                
                /**
                 * Sets the "frameid" attribute
                 */
                void setFrameid(java.lang.String frameid);
                
                /**
                 * Sets (as xml) the "frameid" attribute
                 */
                void xsetFrameid(org.apache.xmlbeans.XmlString frameid);
                
                /**
                 * Unsets the "frameid" attribute
                 */
                void unsetFrameid();
                
                /**
                 * Gets the "time" attribute
                 */
                java.lang.String getTime();
                
                /**
                 * Gets (as xml) the "time" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTime();
                
                /**
                 * True if has "time" attribute
                 */
                boolean isSetTime();
                
                /**
                 * Sets the "time" attribute
                 */
                void setTime(java.lang.String time);
                
                /**
                 * Sets (as xml) the "time" attribute
                 */
                void xsetTime(org.apache.xmlbeans.XmlString time);
                
                /**
                 * Unsets the "time" attribute
                 */
                void unsetTime();
                
                /**
                 * Gets the "error" attribute
                 */
                java.lang.String getError();
                
                /**
                 * Gets (as xml) the "error" attribute
                 */
                org.apache.xmlbeans.XmlString xgetError();
                
                /**
                 * True if has "error" attribute
                 */
                boolean isSetError();
                
                /**
                 * Sets the "error" attribute
                 */
                void setError(java.lang.String error);
                
                /**
                 * Sets (as xml) the "error" attribute
                 */
                void xsetError(org.apache.xmlbeans.XmlString error);
                
                /**
                 * Unsets the "error" attribute
                 */
                void unsetError();
                
                /**
                 * Gets the "file" attribute
                 */
                java.lang.String getFile();
                
                /**
                 * Gets (as xml) the "file" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFile();
                
                /**
                 * True if has "file" attribute
                 */
                boolean isSetFile();
                
                /**
                 * Sets the "file" attribute
                 */
                void setFile(java.lang.String file);
                
                /**
                 * Sets (as xml) the "file" attribute
                 */
                void xsetFile(org.apache.xmlbeans.XmlString file);
                
                /**
                 * Unsets the "file" attribute
                 */
                void unsetFile();
                
                /**
                 * Gets the "line" attribute
                 */
                java.math.BigInteger getLine();
                
                /**
                 * Gets (as xml) the "line" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetLine();
                
                /**
                 * True if has "line" attribute
                 */
                boolean isSetLine();
                
                /**
                 * Sets the "line" attribute
                 */
                void setLine(java.math.BigInteger line);
                
                /**
                 * Sets (as xml) the "line" attribute
                 */
                void xsetLine(org.apache.xmlbeans.XmlInteger line);
                
                /**
                 * Unsets the "line" attribute
                 */
                void unsetLine();
                
                /**
                 * Gets the "crashsessionid" attribute
                 */
                java.lang.String getCrashsessionid();
                
                /**
                 * Gets (as xml) the "crashsessionid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCrashsessionid();
                
                /**
                 * True if has "crashsessionid" attribute
                 */
                boolean isSetCrashsessionid();
                
                /**
                 * Sets the "crashsessionid" attribute
                 */
                void setCrashsessionid(java.lang.String crashsessionid);
                
                /**
                 * Sets (as xml) the "crashsessionid" attribute
                 */
                void xsetCrashsessionid(org.apache.xmlbeans.XmlString crashsessionid);
                
                /**
                 * Unsets the "crashsessionid" attribute
                 */
                void unsetCrashsessionid();
                
                /**
                 * Gets the "crashtimestamp" attribute
                 */
                java.lang.String getCrashtimestamp();
                
                /**
                 * Gets (as xml) the "crashtimestamp" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCrashtimestamp();
                
                /**
                 * True if has "crashtimestamp" attribute
                 */
                boolean isSetCrashtimestamp();
                
                /**
                 * Sets the "crashtimestamp" attribute
                 */
                void setCrashtimestamp(java.lang.String crashtimestamp);
                
                /**
                 * Sets (as xml) the "crashtimestamp" attribute
                 */
                void xsetCrashtimestamp(org.apache.xmlbeans.XmlString crashtimestamp);
                
                /**
                 * Unsets the "crashtimestamp" attribute
                 */
                void unsetCrashtimestamp();
                
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
                 * Gets the "batterypercentage" attribute
                 */
                java.lang.String getBatterypercentage();
                
                /**
                 * Gets (as xml) the "batterypercentage" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBatterypercentage();
                
                /**
                 * True if has "batterypercentage" attribute
                 */
                boolean isSetBatterypercentage();
                
                /**
                 * Sets the "batterypercentage" attribute
                 */
                void setBatterypercentage(java.lang.String batterypercentage);
                
                /**
                 * Sets (as xml) the "batterypercentage" attribute
                 */
                void xsetBatterypercentage(org.apache.xmlbeans.XmlString batterypercentage);
                
                /**
                 * Unsets the "batterypercentage" attribute
                 */
                void unsetBatterypercentage();
                
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
                 * Gets the "devicemanufacturer" attribute
                 */
                java.lang.String getDevicemanufacturer();
                
                /**
                 * Gets (as xml) the "devicemanufacturer" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDevicemanufacturer();
                
                /**
                 * True if has "devicemanufacturer" attribute
                 */
                boolean isSetDevicemanufacturer();
                
                /**
                 * Sets the "devicemanufacturer" attribute
                 */
                void setDevicemanufacturer(java.lang.String devicemanufacturer);
                
                /**
                 * Sets (as xml) the "devicemanufacturer" attribute
                 */
                void xsetDevicemanufacturer(org.apache.xmlbeans.XmlString devicemanufacturer);
                
                /**
                 * Unsets the "devicemanufacturer" attribute
                 */
                void unsetDevicemanufacturer();
                
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
                 * Gets the "deviceos" attribute
                 */
                java.lang.String getDeviceos();
                
                /**
                 * Gets (as xml) the "deviceos" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDeviceos();
                
                /**
                 * True if has "deviceos" attribute
                 */
                boolean isSetDeviceos();
                
                /**
                 * Sets the "deviceos" attribute
                 */
                void setDeviceos(java.lang.String deviceos);
                
                /**
                 * Sets (as xml) the "deviceos" attribute
                 */
                void xsetDeviceos(org.apache.xmlbeans.XmlString deviceos);
                
                /**
                 * Unsets the "deviceos" attribute
                 */
                void unsetDeviceos();
                
                /**
                 * Gets the "physicalmemory" attribute
                 */
                java.lang.String getPhysicalmemory();
                
                /**
                 * Gets (as xml) the "physicalmemory" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPhysicalmemory();
                
                /**
                 * True if has "physicalmemory" attribute
                 */
                boolean isSetPhysicalmemory();
                
                /**
                 * Sets the "physicalmemory" attribute
                 */
                void setPhysicalmemory(java.lang.String physicalmemory);
                
                /**
                 * Sets (as xml) the "physicalmemory" attribute
                 */
                void xsetPhysicalmemory(org.apache.xmlbeans.XmlString physicalmemory);
                
                /**
                 * Unsets the "physicalmemory" attribute
                 */
                void unsetPhysicalmemory();
                
                /**
                 * Gets the "runningprocesscount" attribute
                 */
                java.lang.String getRunningprocesscount();
                
                /**
                 * Gets (as xml) the "runningprocesscount" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRunningprocesscount();
                
                /**
                 * True if has "runningprocesscount" attribute
                 */
                boolean isSetRunningprocesscount();
                
                /**
                 * Sets the "runningprocesscount" attribute
                 */
                void setRunningprocesscount(java.lang.String runningprocesscount);
                
                /**
                 * Sets (as xml) the "runningprocesscount" attribute
                 */
                void xsetRunningprocesscount(org.apache.xmlbeans.XmlString runningprocesscount);
                
                /**
                 * Unsets the "runningprocesscount" attribute
                 */
                void unsetRunningprocesscount();
                
                /**
                 * Gets the "memoryfreepercentage" attribute
                 */
                java.lang.String getMemoryfreepercentage();
                
                /**
                 * Gets (as xml) the "memoryfreepercentage" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMemoryfreepercentage();
                
                /**
                 * True if has "memoryfreepercentage" attribute
                 */
                boolean isSetMemoryfreepercentage();
                
                /**
                 * Sets the "memoryfreepercentage" attribute
                 */
                void setMemoryfreepercentage(java.lang.String memoryfreepercentage);
                
                /**
                 * Sets (as xml) the "memoryfreepercentage" attribute
                 */
                void xsetMemoryfreepercentage(org.apache.xmlbeans.XmlString memoryfreepercentage);
                
                /**
                 * Unsets the "memoryfreepercentage" attribute
                 */
                void unsetMemoryfreepercentage();
                
                /**
                 * Gets the "applicationbuildversion" attribute
                 */
                java.lang.String getApplicationbuildversion();
                
                /**
                 * Gets (as xml) the "applicationbuildversion" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApplicationbuildversion();
                
                /**
                 * True if has "applicationbuildversion" attribute
                 */
                boolean isSetApplicationbuildversion();
                
                /**
                 * Sets the "applicationbuildversion" attribute
                 */
                void setApplicationbuildversion(java.lang.String applicationbuildversion);
                
                /**
                 * Sets (as xml) the "applicationbuildversion" attribute
                 */
                void xsetApplicationbuildversion(org.apache.xmlbeans.XmlString applicationbuildversion);
                
                /**
                 * Unsets the "applicationbuildversion" attribute
                 */
                void unsetApplicationbuildversion();
                
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
                 * Gets the "column" attribute
                 */
                java.math.BigInteger getColumn();
                
                /**
                 * Gets (as xml) the "column" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetColumn();
                
                /**
                 * True if has "column" attribute
                 */
                boolean isSetColumn();
                
                /**
                 * Sets the "column" attribute
                 */
                void setColumn(java.math.BigInteger column);
                
                /**
                 * Sets (as xml) the "column" attribute
                 */
                void xsetColumn(org.apache.xmlbeans.XmlInteger column);
                
                /**
                 * Unsets the "column" attribute
                 */
                void unsetColumn();
                
                /**
                 * Gets the "stack" attribute
                 */
                java.lang.String getStack();
                
                /**
                 * Gets (as xml) the "stack" attribute
                 */
                org.apache.xmlbeans.XmlString xgetStack();
                
                /**
                 * True if has "stack" attribute
                 */
                boolean isSetStack();
                
                /**
                 * Sets the "stack" attribute
                 */
                void setStack(java.lang.String stack);
                
                /**
                 * Sets (as xml) the "stack" attribute
                 */
                void xsetStack(org.apache.xmlbeans.XmlString stack);
                
                /**
                 * Unsets the "stack" attribute
                 */
                void unsetStack();
                
                /**
                 * Gets the "code" attribute
                 */
                java.math.BigInteger getCode();
                
                /**
                 * Gets (as xml) the "code" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetCode();
                
                /**
                 * True if has "code" attribute
                 */
                boolean isSetCode();
                
                /**
                 * Sets the "code" attribute
                 */
                void setCode(java.math.BigInteger code);
                
                /**
                 * Sets (as xml) the "code" attribute
                 */
                void xsetCode(org.apache.xmlbeans.XmlInteger code);
                
                /**
                 * Unsets the "code" attribute
                 */
                void unsetCode();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror newInstance() {
                      return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors newInstance() {
                  return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet newInstance() {
              return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ClienterrorsdashletDocument newInstance() {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ClienterrorsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ClienterrorsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ClienterrorsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ClienterrorsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ClienterrorsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ClienterrorsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
