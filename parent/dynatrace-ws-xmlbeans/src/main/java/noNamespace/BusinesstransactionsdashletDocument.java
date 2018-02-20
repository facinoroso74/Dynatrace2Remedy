/*
 * An XML document type.
 * Localname: businesstransactionsdashlet
 * Namespace: 
 * Java type: noNamespace.BusinesstransactionsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one businesstransactionsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface BusinesstransactionsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinesstransactionsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("businesstransactionsdashlet0a7bdoctype");
    
    /**
     * Gets the "businesstransactionsdashlet" element
     */
    noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet getBusinesstransactionsdashlet();
    
    /**
     * Sets the "businesstransactionsdashlet" element
     */
    void setBusinesstransactionsdashlet(noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet businesstransactionsdashlet);
    
    /**
     * Appends and returns a new empty "businesstransactionsdashlet" element
     */
    noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet addNewBusinesstransactionsdashlet();
    
    /**
     * An XML businesstransactionsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Businesstransactionsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Businesstransactionsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("businesstransactionsdashlet858belemtype");
        
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
         * Gets the "transactions" element
         */
        noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions getTransactions();
        
        /**
         * True if has "transactions" element
         */
        boolean isSetTransactions();
        
        /**
         * Sets the "transactions" element
         */
        void setTransactions(noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions transactions);
        
        /**
         * Appends and returns a new empty "transactions" element
         */
        noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions addNewTransactions();
        
        /**
         * Unsets the "transactions" element
         */
        void unsetTransactions();
        
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
         * An XML transactions(@).
         *
         * This is a complex type.
         */
        public interface Transactions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transactions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("transactions1decelemtype");
            
            /**
             * Gets array of all "transaction" elements
             */
            noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction[] getTransactionArray();
            
            /**
             * Gets ith "transaction" element
             */
            noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction getTransactionArray(int i);
            
            /**
             * Returns number of "transaction" element
             */
            int sizeOfTransactionArray();
            
            /**
             * Sets array of all "transaction" element
             */
            void setTransactionArray(noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction[] transactionArray);
            
            /**
             * Sets ith "transaction" element
             */
            void setTransactionArray(int i, noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction transaction);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "transaction" element
             */
            noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction insertNewTransaction(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "transaction" element
             */
            noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction addNewTransaction();
            
            /**
             * Removes the ith "transaction" element
             */
            void removeTransaction(int i);
            
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
             * An XML transaction(@).
             *
             * This is a complex type.
             */
            public interface Transaction extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("transactionce52elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction newInstance() {
                      return (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions newInstance() {
                  return (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet newInstance() {
              return (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.BusinesstransactionsdashletDocument newInstance() {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.BusinesstransactionsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.BusinesstransactionsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.BusinesstransactionsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.BusinesstransactionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
