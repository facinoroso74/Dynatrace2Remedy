/*
 * An XML document type.
 * Localname: dynamicmeasurematrixdashlet
 * Namespace: 
 * Java type: noNamespace.DynamicmeasurematrixdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one dynamicmeasurematrixdashlet(@) element.
 *
 * This is a complex type.
 */
public interface DynamicmeasurematrixdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DynamicmeasurematrixdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("dynamicmeasurematrixdashletd070doctype");
    
    /**
     * Gets the "dynamicmeasurematrixdashlet" element
     */
    noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet getDynamicmeasurematrixdashlet();
    
    /**
     * Sets the "dynamicmeasurematrixdashlet" element
     */
    void setDynamicmeasurematrixdashlet(noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet dynamicmeasurematrixdashlet);
    
    /**
     * Appends and returns a new empty "dynamicmeasurematrixdashlet" element
     */
    noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet addNewDynamicmeasurematrixdashlet();
    
    /**
     * An XML dynamicmeasurematrixdashlet(@).
     *
     * This is a complex type.
     */
    public interface Dynamicmeasurematrixdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dynamicmeasurematrixdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("dynamicmeasurematrixdashletf6b5elemtype");
        
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
        noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset getRecordset();
        
        /**
         * True if has "recordset" element
         */
        boolean isSetRecordset();
        
        /**
         * Sets the "recordset" element
         */
        void setRecordset(noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset recordset);
        
        /**
         * Appends and returns a new empty "recordset" element
         */
        noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset addNewRecordset();
        
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
         * Gets the "showabsolutevalues" attribute
         */
        java.lang.String getShowabsolutevalues();
        
        /**
         * Gets (as xml) the "showabsolutevalues" attribute
         */
        org.apache.xmlbeans.XmlString xgetShowabsolutevalues();
        
        /**
         * Sets the "showabsolutevalues" attribute
         */
        void setShowabsolutevalues(java.lang.String showabsolutevalues);
        
        /**
         * Sets (as xml) the "showabsolutevalues" attribute
         */
        void xsetShowabsolutevalues(org.apache.xmlbeans.XmlString showabsolutevalues);
        
        /**
         * An XML recordset(@).
         *
         * This is a complex type.
         */
        public interface Recordset extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Recordset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("recordset7e22elemtype");
            
            /**
             * Gets array of all "dynamicmeasurematrixrecord" elements
             */
            noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord[] getDynamicmeasurematrixrecordArray();
            
            /**
             * Gets ith "dynamicmeasurematrixrecord" element
             */
            noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecordArray(int i);
            
            /**
             * Returns number of "dynamicmeasurematrixrecord" element
             */
            int sizeOfDynamicmeasurematrixrecordArray();
            
            /**
             * Sets array of all "dynamicmeasurematrixrecord" element
             */
            void setDynamicmeasurematrixrecordArray(noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord[] dynamicmeasurematrixrecordArray);
            
            /**
             * Sets ith "dynamicmeasurematrixrecord" element
             */
            void setDynamicmeasurematrixrecordArray(int i, noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "dynamicmeasurematrixrecord" element
             */
            noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord insertNewDynamicmeasurematrixrecord(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "dynamicmeasurematrixrecord" element
             */
            noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord();
            
            /**
             * Removes the ith "dynamicmeasurematrixrecord" element
             */
            void removeDynamicmeasurematrixrecord(int i);
            
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
             * An XML dynamicmeasurematrixrecord(@).
             *
             * This is a complex type.
             */
            public interface Dynamicmeasurematrixrecord extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dynamicmeasurematrixrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("dynamicmeasurematrixrecordf2bfelemtype");
                
                /**
                 * Gets array of all "dynamicmeasurematrixrecord" elements
                 */
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] getDynamicmeasurematrixrecordArray();
                
                /**
                 * Gets ith "dynamicmeasurematrixrecord" element
                 */
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecordArray(int i);
                
                /**
                 * Returns number of "dynamicmeasurematrixrecord" element
                 */
                int sizeOfDynamicmeasurematrixrecordArray();
                
                /**
                 * Sets array of all "dynamicmeasurematrixrecord" element
                 */
                void setDynamicmeasurematrixrecordArray(noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] dynamicmeasurematrixrecordArray);
                
                /**
                 * Sets ith "dynamicmeasurematrixrecord" element
                 */
                void setDynamicmeasurematrixrecordArray(int i, noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "dynamicmeasurematrixrecord" element
                 */
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord insertNewDynamicmeasurematrixrecord(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "dynamicmeasurematrixrecord" element
                 */
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord();
                
                /**
                 * Removes the ith "dynamicmeasurematrixrecord" element
                 */
                void removeDynamicmeasurematrixrecord(int i);
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord newInstance() {
                      return (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset newInstance() {
                  return (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet newInstance() {
              return (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.DynamicmeasurematrixdashletDocument newInstance() {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DynamicmeasurematrixdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DynamicmeasurematrixdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
