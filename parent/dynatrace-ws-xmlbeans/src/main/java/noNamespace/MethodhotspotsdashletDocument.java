/*
 * An XML document type.
 * Localname: methodhotspotsdashlet
 * Namespace: 
 * Java type: noNamespace.MethodhotspotsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one methodhotspotsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface MethodhotspotsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MethodhotspotsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("methodhotspotsdashlet976bdoctype");
    
    /**
     * Gets the "methodhotspotsdashlet" element
     */
    noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet getMethodhotspotsdashlet();
    
    /**
     * Sets the "methodhotspotsdashlet" element
     */
    void setMethodhotspotsdashlet(noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet methodhotspotsdashlet);
    
    /**
     * Appends and returns a new empty "methodhotspotsdashlet" element
     */
    noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet addNewMethodhotspotsdashlet();
    
    /**
     * An XML methodhotspotsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Methodhotspotsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Methodhotspotsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("methodhotspotsdashlet1c2belemtype");
        
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
         * Gets the "recordset" element
         */
        noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset getRecordset();
        
        /**
         * True if has "recordset" element
         */
        boolean isSetRecordset();
        
        /**
         * Sets the "recordset" element
         */
        void setRecordset(noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset recordset);
        
        /**
         * Appends and returns a new empty "recordset" element
         */
        noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset addNewRecordset();
        
        /**
         * Unsets the "recordset" element
         */
        void unsetRecordset();
        
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
         * An XML recordset(@).
         *
         * This is a complex type.
         */
        public interface Recordset extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Recordset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("recordset9f18elemtype");
            
            /**
             * Gets array of all "record" elements
             */
            noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record[] getRecordArray();
            
            /**
             * Gets ith "record" element
             */
            noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record getRecordArray(int i);
            
            /**
             * Returns number of "record" element
             */
            int sizeOfRecordArray();
            
            /**
             * Sets array of all "record" element
             */
            void setRecordArray(noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record[] recordArray);
            
            /**
             * Sets ith "record" element
             */
            void setRecordArray(int i, noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record record);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "record" element
             */
            noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record insertNewRecord(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "record" element
             */
            noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record addNewRecord();
            
            /**
             * Removes the ith "record" element
             */
            void removeRecord(int i);
            
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
             * An XML record(@).
             *
             * This is a complex type.
             */
            public interface Record extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Record.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("record9e75elemtype");
                
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
                 * Gets the "execTime" attribute
                 */
                double getExecTime();
                
                /**
                 * Gets (as xml) the "execTime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecTime();
                
                /**
                 * True if has "execTime" attribute
                 */
                boolean isSetExecTime();
                
                /**
                 * Sets the "execTime" attribute
                 */
                void setExecTime(double execTime);
                
                /**
                 * Sets (as xml) the "execTime" attribute
                 */
                void xsetExecTime(org.apache.xmlbeans.XmlDouble execTime);
                
                /**
                 * Unsets the "execTime" attribute
                 */
                void unsetExecTime();
                
                /**
                 * Gets the "cpuTime" attribute
                 */
                double getCpuTime();
                
                /**
                 * Gets (as xml) the "cpuTime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuTime();
                
                /**
                 * True if has "cpuTime" attribute
                 */
                boolean isSetCpuTime();
                
                /**
                 * Sets the "cpuTime" attribute
                 */
                void setCpuTime(double cpuTime);
                
                /**
                 * Sets (as xml) the "cpuTime" attribute
                 */
                void xsetCpuTime(org.apache.xmlbeans.XmlDouble cpuTime);
                
                /**
                 * Unsets the "cpuTime" attribute
                 */
                void unsetCpuTime();
                
                /**
                 * Gets the "syncTime" attribute
                 */
                double getSyncTime();
                
                /**
                 * Gets (as xml) the "syncTime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSyncTime();
                
                /**
                 * True if has "syncTime" attribute
                 */
                boolean isSetSyncTime();
                
                /**
                 * Sets the "syncTime" attribute
                 */
                void setSyncTime(double syncTime);
                
                /**
                 * Sets (as xml) the "syncTime" attribute
                 */
                void xsetSyncTime(org.apache.xmlbeans.XmlDouble syncTime);
                
                /**
                 * Unsets the "syncTime" attribute
                 */
                void unsetSyncTime();
                
                /**
                 * Gets the "waitTime" attribute
                 */
                double getWaitTime();
                
                /**
                 * Gets (as xml) the "waitTime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWaitTime();
                
                /**
                 * True if has "waitTime" attribute
                 */
                boolean isSetWaitTime();
                
                /**
                 * Sets the "waitTime" attribute
                 */
                void setWaitTime(double waitTime);
                
                /**
                 * Sets (as xml) the "waitTime" attribute
                 */
                void xsetWaitTime(org.apache.xmlbeans.XmlDouble waitTime);
                
                /**
                 * Unsets the "waitTime" attribute
                 */
                void unsetWaitTime();
                
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
                 * Gets the "apis" attribute
                 */
                java.lang.String getApis();
                
                /**
                 * Gets (as xml) the "apis" attribute
                 */
                org.apache.xmlbeans.XmlString xgetApis();
                
                /**
                 * True if has "apis" attribute
                 */
                boolean isSetApis();
                
                /**
                 * Sets the "apis" attribute
                 */
                void setApis(java.lang.String apis);
                
                /**
                 * Sets (as xml) the "apis" attribute
                 */
                void xsetApis(org.apache.xmlbeans.XmlString apis);
                
                /**
                 * Unsets the "apis" attribute
                 */
                void unsetApis();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record newInstance() {
                      return (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset newInstance() {
                  return (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet newInstance() {
              return (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.MethodhotspotsdashletDocument newInstance() {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.MethodhotspotsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.MethodhotspotsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.MethodhotspotsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.MethodhotspotsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.MethodhotspotsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.MethodhotspotsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
