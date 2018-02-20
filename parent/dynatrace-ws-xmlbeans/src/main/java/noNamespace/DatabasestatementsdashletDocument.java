/*
 * An XML document type.
 * Localname: databasestatementsdashlet
 * Namespace: 
 * Java type: noNamespace.DatabasestatementsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one databasestatementsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface DatabasestatementsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabasestatementsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasestatementsdashlet1971doctype");
    
    /**
     * Gets the "databasestatementsdashlet" element
     */
    noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet getDatabasestatementsdashlet();
    
    /**
     * Sets the "databasestatementsdashlet" element
     */
    void setDatabasestatementsdashlet(noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet databasestatementsdashlet);
    
    /**
     * Appends and returns a new empty "databasestatementsdashlet" element
     */
    noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet addNewDatabasestatementsdashlet();
    
    /**
     * An XML databasestatementsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Databasestatementsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Databasestatementsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasestatementsdashletcab7elemtype");
        
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
         * Gets the "databasehotspots" element
         */
        noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots getDatabasehotspots();
        
        /**
         * True if has "databasehotspots" element
         */
        boolean isSetDatabasehotspots();
        
        /**
         * Sets the "databasehotspots" element
         */
        void setDatabasehotspots(noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots databasehotspots);
        
        /**
         * Appends and returns a new empty "databasehotspots" element
         */
        noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots addNewDatabasehotspots();
        
        /**
         * Unsets the "databasehotspots" element
         */
        void unsetDatabasehotspots();
        
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
         * An XML databasehotspots(@).
         *
         * This is a complex type.
         */
        public interface Databasehotspots extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Databasehotspots.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasehotspots4a42elemtype");
            
            /**
             * Gets array of all "databasehotspot" elements
             */
            noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot[] getDatabasehotspotArray();
            
            /**
             * Gets ith "databasehotspot" element
             */
            noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot getDatabasehotspotArray(int i);
            
            /**
             * Returns number of "databasehotspot" element
             */
            int sizeOfDatabasehotspotArray();
            
            /**
             * Sets array of all "databasehotspot" element
             */
            void setDatabasehotspotArray(noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot[] databasehotspotArray);
            
            /**
             * Sets ith "databasehotspot" element
             */
            void setDatabasehotspotArray(int i, noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot databasehotspot);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "databasehotspot" element
             */
            noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot insertNewDatabasehotspot(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "databasehotspot" element
             */
            noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot addNewDatabasehotspot();
            
            /**
             * Removes the ith "databasehotspot" element
             */
            void removeDatabasehotspot(int i);
            
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
             * An XML databasehotspot(@).
             *
             * This is a complex type.
             */
            public interface Databasehotspot extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Databasehotspot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasehotspotf2d2elemtype");
                
                /**
                 * Gets array of all "databasehotspot" elements
                 */
                noNamespace.DatabasehotspotDocument.Databasehotspot[] getDatabasehotspotArray();
                
                /**
                 * Gets ith "databasehotspot" element
                 */
                noNamespace.DatabasehotspotDocument.Databasehotspot getDatabasehotspotArray(int i);
                
                /**
                 * Returns number of "databasehotspot" element
                 */
                int sizeOfDatabasehotspotArray();
                
                /**
                 * Sets array of all "databasehotspot" element
                 */
                void setDatabasehotspotArray(noNamespace.DatabasehotspotDocument.Databasehotspot[] databasehotspotArray);
                
                /**
                 * Sets ith "databasehotspot" element
                 */
                void setDatabasehotspotArray(int i, noNamespace.DatabasehotspotDocument.Databasehotspot databasehotspot);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "databasehotspot" element
                 */
                noNamespace.DatabasehotspotDocument.Databasehotspot insertNewDatabasehotspot(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "databasehotspot" element
                 */
                noNamespace.DatabasehotspotDocument.Databasehotspot addNewDatabasehotspot();
                
                /**
                 * Removes the ith "databasehotspot" element
                 */
                void removeDatabasehotspot(int i);
                
                /**
                 * Gets the "methodname" attribute
                 */
                java.lang.String getMethodname();
                
                /**
                 * Gets (as xml) the "methodname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMethodname();
                
                /**
                 * True if has "methodname" attribute
                 */
                boolean isSetMethodname();
                
                /**
                 * Sets the "methodname" attribute
                 */
                void setMethodname(java.lang.String methodname);
                
                /**
                 * Sets (as xml) the "methodname" attribute
                 */
                void xsetMethodname(org.apache.xmlbeans.XmlString methodname);
                
                /**
                 * Unsets the "methodname" attribute
                 */
                void unsetMethodname();
                
                /**
                 * Gets the "contribution" attribute
                 */
                java.lang.String getContribution();
                
                /**
                 * Gets (as xml) the "contribution" attribute
                 */
                org.apache.xmlbeans.XmlString xgetContribution();
                
                /**
                 * True if has "contribution" attribute
                 */
                boolean isSetContribution();
                
                /**
                 * Sets the "contribution" attribute
                 */
                void setContribution(java.lang.String contribution);
                
                /**
                 * Sets (as xml) the "contribution" attribute
                 */
                void xsetContribution(org.apache.xmlbeans.XmlString contribution);
                
                /**
                 * Unsets the "contribution" attribute
                 */
                void unsetContribution();
                
                /**
                 * Gets the "aggregatedcount" attribute
                 */
                java.math.BigInteger getAggregatedcount();
                
                /**
                 * Gets (as xml) the "aggregatedcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetAggregatedcount();
                
                /**
                 * True if has "aggregatedcount" attribute
                 */
                boolean isSetAggregatedcount();
                
                /**
                 * Sets the "aggregatedcount" attribute
                 */
                void setAggregatedcount(java.math.BigInteger aggregatedcount);
                
                /**
                 * Sets (as xml) the "aggregatedcount" attribute
                 */
                void xsetAggregatedcount(org.apache.xmlbeans.XmlInteger aggregatedcount);
                
                /**
                 * Unsets the "aggregatedcount" attribute
                 */
                void unsetAggregatedcount();
                
                /**
                 * Gets the "avgexectime" attribute
                 */
                double getAvgexectime();
                
                /**
                 * Gets (as xml) the "avgexectime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetAvgexectime();
                
                /**
                 * True if has "avgexectime" attribute
                 */
                boolean isSetAvgexectime();
                
                /**
                 * Sets the "avgexectime" attribute
                 */
                void setAvgexectime(double avgexectime);
                
                /**
                 * Sets (as xml) the "avgexectime" attribute
                 */
                void xsetAvgexectime(org.apache.xmlbeans.XmlDouble avgexectime);
                
                /**
                 * Unsets the "avgexectime" attribute
                 */
                void unsetAvgexectime();
                
                /**
                 * Gets the "minexectime" attribute
                 */
                double getMinexectime();
                
                /**
                 * Gets (as xml) the "minexectime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetMinexectime();
                
                /**
                 * True if has "minexectime" attribute
                 */
                boolean isSetMinexectime();
                
                /**
                 * Sets the "minexectime" attribute
                 */
                void setMinexectime(double minexectime);
                
                /**
                 * Sets (as xml) the "minexectime" attribute
                 */
                void xsetMinexectime(org.apache.xmlbeans.XmlDouble minexectime);
                
                /**
                 * Unsets the "minexectime" attribute
                 */
                void unsetMinexectime();
                
                /**
                 * Gets the "maxexectime" attribute
                 */
                double getMaxexectime();
                
                /**
                 * Gets (as xml) the "maxexectime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetMaxexectime();
                
                /**
                 * True if has "maxexectime" attribute
                 */
                boolean isSetMaxexectime();
                
                /**
                 * Sets the "maxexectime" attribute
                 */
                void setMaxexectime(double maxexectime);
                
                /**
                 * Sets (as xml) the "maxexectime" attribute
                 */
                void xsetMaxexectime(org.apache.xmlbeans.XmlDouble maxexectime);
                
                /**
                 * Unsets the "maxexectime" attribute
                 */
                void unsetMaxexectime();
                
                /**
                 * Gets the "exectime" attribute
                 */
                double getExectime();
                
                /**
                 * Gets (as xml) the "exectime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExectime();
                
                /**
                 * True if has "exectime" attribute
                 */
                boolean isSetExectime();
                
                /**
                 * Sets the "exectime" attribute
                 */
                void setExectime(double exectime);
                
                /**
                 * Sets (as xml) the "exectime" attribute
                 */
                void xsetExectime(org.apache.xmlbeans.XmlDouble exectime);
                
                /**
                 * Unsets the "exectime" attribute
                 */
                void unsetExectime();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot newInstance() {
                      return (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots newInstance() {
                  return (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet newInstance() {
              return (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.DatabasestatementsdashletDocument newInstance() {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.DatabasestatementsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.DatabasestatementsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.DatabasestatementsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DatabasestatementsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DatabasestatementsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DatabasestatementsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
