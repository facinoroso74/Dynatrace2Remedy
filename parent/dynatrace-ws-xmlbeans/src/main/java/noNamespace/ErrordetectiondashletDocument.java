/*
 * An XML document type.
 * Localname: errordetectiondashlet
 * Namespace: 
 * Java type: noNamespace.ErrordetectiondashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one errordetectiondashlet(@) element.
 *
 * This is a complex type.
 */
public interface ErrordetectiondashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrordetectiondashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errordetectiondashlete653doctype");
    
    /**
     * Gets the "errordetectiondashlet" element
     */
    noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet getErrordetectiondashlet();
    
    /**
     * Sets the "errordetectiondashlet" element
     */
    void setErrordetectiondashlet(noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet errordetectiondashlet);
    
    /**
     * Appends and returns a new empty "errordetectiondashlet" element
     */
    noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet addNewErrordetectiondashlet();
    
    /**
     * An XML errordetectiondashlet(@).
     *
     * This is a complex type.
     */
    public interface Errordetectiondashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errordetectiondashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errordetectiondashlet81fbelemtype");
        
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
         * Gets the "errors" element
         */
        noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors getErrors();
        
        /**
         * True if has "errors" element
         */
        boolean isSetErrors();
        
        /**
         * Sets the "errors" element
         */
        void setErrors(noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors errors);
        
        /**
         * Appends and returns a new empty "errors" element
         */
        noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors addNewErrors();
        
        /**
         * Unsets the "errors" element
         */
        void unsetErrors();
        
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
         * An XML errors(@).
         *
         * This is a complex type.
         */
        public interface Errors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errors8bf2elemtype");
            
            /**
             * Gets array of all "error" elements
             */
            noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error[] getErrorArray();
            
            /**
             * Gets ith "error" element
             */
            noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error getErrorArray(int i);
            
            /**
             * Returns number of "error" element
             */
            int sizeOfErrorArray();
            
            /**
             * Sets array of all "error" element
             */
            void setErrorArray(noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error[] errorArray);
            
            /**
             * Sets ith "error" element
             */
            void setErrorArray(int i, noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error error);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "error" element
             */
            noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error insertNewError(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "error" element
             */
            noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error addNewError();
            
            /**
             * Removes the ith "error" element
             */
            void removeError(int i);
            
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
             * An XML error(@).
             *
             * This is a complex type.
             */
            public interface Error extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Error.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("errordbeeelemtype");
                
                /**
                 * Gets array of all "error" elements
                 */
                noNamespace.ErrorDocument.Error[] getErrorArray();
                
                /**
                 * Gets ith "error" element
                 */
                noNamespace.ErrorDocument.Error getErrorArray(int i);
                
                /**
                 * Returns number of "error" element
                 */
                int sizeOfErrorArray();
                
                /**
                 * Sets array of all "error" element
                 */
                void setErrorArray(noNamespace.ErrorDocument.Error[] errorArray);
                
                /**
                 * Sets ith "error" element
                 */
                void setErrorArray(int i, noNamespace.ErrorDocument.Error error);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "error" element
                 */
                noNamespace.ErrorDocument.Error insertNewError(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "error" element
                 */
                noNamespace.ErrorDocument.Error addNewError();
                
                /**
                 * Removes the ith "error" element
                 */
                void removeError(int i);
                
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
                 * Gets the "error_affected_transaction_count" attribute
                 */
                java.lang.String getErrorAffectedTransactionCount();
                
                /**
                 * Gets (as xml) the "error_affected_transaction_count" attribute
                 */
                org.apache.xmlbeans.XmlString xgetErrorAffectedTransactionCount();
                
                /**
                 * True if has "error_affected_transaction_count" attribute
                 */
                boolean isSetErrorAffectedTransactionCount();
                
                /**
                 * Sets the "error_affected_transaction_count" attribute
                 */
                void setErrorAffectedTransactionCount(java.lang.String errorAffectedTransactionCount);
                
                /**
                 * Sets (as xml) the "error_affected_transaction_count" attribute
                 */
                void xsetErrorAffectedTransactionCount(org.apache.xmlbeans.XmlString errorAffectedTransactionCount);
                
                /**
                 * Unsets the "error_affected_transaction_count" attribute
                 */
                void unsetErrorAffectedTransactionCount();
                
                /**
                 * Gets the "error_affected_pageaction_count" attribute
                 */
                java.lang.String getErrorAffectedPageactionCount();
                
                /**
                 * Gets (as xml) the "error_affected_pageaction_count" attribute
                 */
                org.apache.xmlbeans.XmlString xgetErrorAffectedPageactionCount();
                
                /**
                 * True if has "error_affected_pageaction_count" attribute
                 */
                boolean isSetErrorAffectedPageactionCount();
                
                /**
                 * Sets the "error_affected_pageaction_count" attribute
                 */
                void setErrorAffectedPageactionCount(java.lang.String errorAffectedPageactionCount);
                
                /**
                 * Sets (as xml) the "error_affected_pageaction_count" attribute
                 */
                void xsetErrorAffectedPageactionCount(org.apache.xmlbeans.XmlString errorAffectedPageactionCount);
                
                /**
                 * Unsets the "error_affected_pageaction_count" attribute
                 */
                void unsetErrorAffectedPageactionCount();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error newInstance() {
                      return (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors newInstance() {
                  return (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet newInstance() {
              return (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ErrordetectiondashletDocument newInstance() {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ErrordetectiondashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ErrordetectiondashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ErrordetectiondashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ErrordetectiondashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ErrordetectiondashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ErrordetectiondashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
