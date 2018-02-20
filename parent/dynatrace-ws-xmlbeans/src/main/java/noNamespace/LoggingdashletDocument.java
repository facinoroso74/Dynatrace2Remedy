/*
 * An XML document type.
 * Localname: loggingdashlet
 * Namespace: 
 * Java type: noNamespace.LoggingdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one loggingdashlet(@) element.
 *
 * This is a complex type.
 */
public interface LoggingdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoggingdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("loggingdashlet6dc3doctype");
    
    /**
     * Gets the "loggingdashlet" element
     */
    noNamespace.LoggingdashletDocument.Loggingdashlet getLoggingdashlet();
    
    /**
     * Sets the "loggingdashlet" element
     */
    void setLoggingdashlet(noNamespace.LoggingdashletDocument.Loggingdashlet loggingdashlet);
    
    /**
     * Appends and returns a new empty "loggingdashlet" element
     */
    noNamespace.LoggingdashletDocument.Loggingdashlet addNewLoggingdashlet();
    
    /**
     * An XML loggingdashlet(@).
     *
     * This is a complex type.
     */
    public interface Loggingdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Loggingdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("loggingdashlete2edelemtype");
        
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
         * Gets the "logs" element
         */
        noNamespace.LoggingdashletDocument.Loggingdashlet.Logs getLogs();
        
        /**
         * True if has "logs" element
         */
        boolean isSetLogs();
        
        /**
         * Sets the "logs" element
         */
        void setLogs(noNamespace.LoggingdashletDocument.Loggingdashlet.Logs logs);
        
        /**
         * Appends and returns a new empty "logs" element
         */
        noNamespace.LoggingdashletDocument.Loggingdashlet.Logs addNewLogs();
        
        /**
         * Unsets the "logs" element
         */
        void unsetLogs();
        
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
         * An XML logs(@).
         *
         * This is a complex type.
         */
        public interface Logs extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Logs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("logs6068elemtype");
            
            /**
             * Gets array of all "log" elements
             */
            noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log[] getLogArray();
            
            /**
             * Gets ith "log" element
             */
            noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log getLogArray(int i);
            
            /**
             * Returns number of "log" element
             */
            int sizeOfLogArray();
            
            /**
             * Sets array of all "log" element
             */
            void setLogArray(noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log[] logArray);
            
            /**
             * Sets ith "log" element
             */
            void setLogArray(int i, noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log log);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "log" element
             */
            noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log insertNewLog(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "log" element
             */
            noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log addNewLog();
            
            /**
             * Removes the ith "log" element
             */
            void removeLog(int i);
            
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
             * An XML log(@).
             *
             * This is a complex type.
             */
            public interface Log extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Log.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("log6ca8elemtype");
                
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
                 * Gets the "severity" attribute
                 */
                java.lang.String getSeverity();
                
                /**
                 * Gets (as xml) the "severity" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSeverity();
                
                /**
                 * True if has "severity" attribute
                 */
                boolean isSetSeverity();
                
                /**
                 * Sets the "severity" attribute
                 */
                void setSeverity(java.lang.String severity);
                
                /**
                 * Sets (as xml) the "severity" attribute
                 */
                void xsetSeverity(org.apache.xmlbeans.XmlString severity);
                
                /**
                 * Unsets the "severity" attribute
                 */
                void unsetSeverity();
                
                /**
                 * Gets the "message" attribute
                 */
                java.lang.String getMessage();
                
                /**
                 * Gets (as xml) the "message" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMessage();
                
                /**
                 * True if has "message" attribute
                 */
                boolean isSetMessage();
                
                /**
                 * Sets the "message" attribute
                 */
                void setMessage(java.lang.String message);
                
                /**
                 * Sets (as xml) the "message" attribute
                 */
                void xsetMessage(org.apache.xmlbeans.XmlString message);
                
                /**
                 * Unsets the "message" attribute
                 */
                void unsetMessage();
                
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
                 * Gets the "class" attribute
                 */
                java.lang.String getClass1();
                
                /**
                 * Gets (as xml) the "class" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClass1();
                
                /**
                 * True if has "class" attribute
                 */
                boolean isSetClass1();
                
                /**
                 * Sets the "class" attribute
                 */
                void setClass1(java.lang.String class1);
                
                /**
                 * Sets (as xml) the "class" attribute
                 */
                void xsetClass1(org.apache.xmlbeans.XmlString class1);
                
                /**
                 * Unsets the "class" attribute
                 */
                void unsetClass1();
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log newInstance() {
                      return (noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.LoggingdashletDocument.Loggingdashlet.Logs.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.LoggingdashletDocument.Loggingdashlet.Logs newInstance() {
                  return (noNamespace.LoggingdashletDocument.Loggingdashlet.Logs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.LoggingdashletDocument.Loggingdashlet.Logs newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.LoggingdashletDocument.Loggingdashlet.Logs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.LoggingdashletDocument.Loggingdashlet newInstance() {
              return (noNamespace.LoggingdashletDocument.Loggingdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.LoggingdashletDocument.Loggingdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.LoggingdashletDocument.Loggingdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.LoggingdashletDocument newInstance() {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.LoggingdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.LoggingdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.LoggingdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.LoggingdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.LoggingdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.LoggingdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.LoggingdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.LoggingdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.LoggingdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.LoggingdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.LoggingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
