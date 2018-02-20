/*
 * An XML document type.
 * Localname: licenseoverview
 * Namespace: 
 * Java type: noNamespace.LicenseoverviewDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one licenseoverview(@) element.
 *
 * This is a complex type.
 */
public interface LicenseoverviewDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LicenseoverviewDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("licenseoverview7721doctype");
    
    /**
     * Gets the "licenseoverview" element
     */
    noNamespace.LicenseoverviewDocument.Licenseoverview getLicenseoverview();
    
    /**
     * Sets the "licenseoverview" element
     */
    void setLicenseoverview(noNamespace.LicenseoverviewDocument.Licenseoverview licenseoverview);
    
    /**
     * Appends and returns a new empty "licenseoverview" element
     */
    noNamespace.LicenseoverviewDocument.Licenseoverview addNewLicenseoverview();
    
    /**
     * An XML licenseoverview(@).
     *
     * This is a complex type.
     */
    public interface Licenseoverview extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Licenseoverview.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("licenseoverview0ad7elemtype");
        
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
        noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset getRecordset();
        
        /**
         * True if has "recordset" element
         */
        boolean isSetRecordset();
        
        /**
         * Sets the "recordset" element
         */
        void setRecordset(noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset recordset);
        
        /**
         * Appends and returns a new empty "recordset" element
         */
        noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset addNewRecordset();
        
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
         * An XML recordset(@).
         *
         * This is a complex type.
         */
        public interface Recordset extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Recordset.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("recordsetc944elemtype");
            
            /**
             * Gets array of all "record" elements
             */
            noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record[] getRecordArray();
            
            /**
             * Gets ith "record" element
             */
            noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record getRecordArray(int i);
            
            /**
             * Returns number of "record" element
             */
            int sizeOfRecordArray();
            
            /**
             * Sets array of all "record" element
             */
            void setRecordArray(noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record[] recordArray);
            
            /**
             * Sets ith "record" element
             */
            void setRecordArray(int i, noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record record);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "record" element
             */
            noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record insertNewRecord(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "record" element
             */
            noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record addNewRecord();
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Record.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("record2c21elemtype");
                
                /**
                 * Gets the "technology" attribute
                 */
                java.lang.String getTechnology();
                
                /**
                 * Gets (as xml) the "technology" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTechnology();
                
                /**
                 * True if has "technology" attribute
                 */
                boolean isSetTechnology();
                
                /**
                 * Sets the "technology" attribute
                 */
                void setTechnology(java.lang.String technology);
                
                /**
                 * Sets (as xml) the "technology" attribute
                 */
                void xsetTechnology(org.apache.xmlbeans.XmlString technology);
                
                /**
                 * Unsets the "technology" attribute
                 */
                void unsetTechnology();
                
                /**
                 * Gets the "licensecount" attribute
                 */
                java.math.BigInteger getLicensecount();
                
                /**
                 * Gets (as xml) the "licensecount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetLicensecount();
                
                /**
                 * True if has "licensecount" attribute
                 */
                boolean isSetLicensecount();
                
                /**
                 * Sets the "licensecount" attribute
                 */
                void setLicensecount(java.math.BigInteger licensecount);
                
                /**
                 * Sets (as xml) the "licensecount" attribute
                 */
                void xsetLicensecount(org.apache.xmlbeans.XmlInteger licensecount);
                
                /**
                 * Unsets the "licensecount" attribute
                 */
                void unsetLicensecount();
                
                /**
                 * Gets the "unit" attribute
                 */
                java.lang.String getUnit();
                
                /**
                 * Gets (as xml) the "unit" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUnit();
                
                /**
                 * True if has "unit" attribute
                 */
                boolean isSetUnit();
                
                /**
                 * Sets the "unit" attribute
                 */
                void setUnit(java.lang.String unit);
                
                /**
                 * Sets (as xml) the "unit" attribute
                 */
                void xsetUnit(org.apache.xmlbeans.XmlString unit);
                
                /**
                 * Unsets the "unit" attribute
                 */
                void unsetUnit();
                
                /**
                 * Gets the "connectedagents" attribute
                 */
                java.math.BigInteger getConnectedagents();
                
                /**
                 * Gets (as xml) the "connectedagents" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetConnectedagents();
                
                /**
                 * True if has "connectedagents" attribute
                 */
                boolean isSetConnectedagents();
                
                /**
                 * Sets the "connectedagents" attribute
                 */
                void setConnectedagents(java.math.BigInteger connectedagents);
                
                /**
                 * Sets (as xml) the "connectedagents" attribute
                 */
                void xsetConnectedagents(org.apache.xmlbeans.XmlInteger connectedagents);
                
                /**
                 * Unsets the "connectedagents" attribute
                 */
                void unsetConnectedagents();
                
                /**
                 * Gets the "remainingvolume" attribute
                 */
                java.math.BigInteger getRemainingvolume();
                
                /**
                 * Gets (as xml) the "remainingvolume" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRemainingvolume();
                
                /**
                 * True if has "remainingvolume" attribute
                 */
                boolean isSetRemainingvolume();
                
                /**
                 * Sets the "remainingvolume" attribute
                 */
                void setRemainingvolume(java.math.BigInteger remainingvolume);
                
                /**
                 * Sets (as xml) the "remainingvolume" attribute
                 */
                void xsetRemainingvolume(org.apache.xmlbeans.XmlInteger remainingvolume);
                
                /**
                 * Unsets the "remainingvolume" attribute
                 */
                void unsetRemainingvolume();
                
                /**
                 * Gets the "ok" attribute
                 */
                java.math.BigInteger getOk();
                
                /**
                 * Gets (as xml) the "ok" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetOk();
                
                /**
                 * True if has "ok" attribute
                 */
                boolean isSetOk();
                
                /**
                 * Sets the "ok" attribute
                 */
                void setOk(java.math.BigInteger ok);
                
                /**
                 * Sets (as xml) the "ok" attribute
                 */
                void xsetOk(org.apache.xmlbeans.XmlInteger ok);
                
                /**
                 * Unsets the "ok" attribute
                 */
                void unsetOk();
                
                /**
                 * Gets the "consumptionbased" attribute
                 */
                java.math.BigInteger getConsumptionbased();
                
                /**
                 * Gets (as xml) the "consumptionbased" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetConsumptionbased();
                
                /**
                 * True if has "consumptionbased" attribute
                 */
                boolean isSetConsumptionbased();
                
                /**
                 * Sets the "consumptionbased" attribute
                 */
                void setConsumptionbased(java.math.BigInteger consumptionbased);
                
                /**
                 * Sets (as xml) the "consumptionbased" attribute
                 */
                void xsetConsumptionbased(org.apache.xmlbeans.XmlInteger consumptionbased);
                
                /**
                 * Unsets the "consumptionbased" attribute
                 */
                void unsetConsumptionbased();
                
                /**
                 * Gets the "weight" attribute
                 */
                double getWeight();
                
                /**
                 * Gets (as xml) the "weight" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetWeight();
                
                /**
                 * True if has "weight" attribute
                 */
                boolean isSetWeight();
                
                /**
                 * Sets the "weight" attribute
                 */
                void setWeight(double weight);
                
                /**
                 * Sets (as xml) the "weight" attribute
                 */
                void xsetWeight(org.apache.xmlbeans.XmlDouble weight);
                
                /**
                 * Unsets the "weight" attribute
                 */
                void unsetWeight();
                
                /**
                 * Gets the "notok" attribute
                 */
                java.math.BigInteger getNotok();
                
                /**
                 * Gets (as xml) the "notok" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetNotok();
                
                /**
                 * True if has "notok" attribute
                 */
                boolean isSetNotok();
                
                /**
                 * Sets the "notok" attribute
                 */
                void setNotok(java.math.BigInteger notok);
                
                /**
                 * Sets (as xml) the "notok" attribute
                 */
                void xsetNotok(org.apache.xmlbeans.XmlInteger notok);
                
                /**
                 * Unsets the "notok" attribute
                 */
                void unsetNotok();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record newInstance() {
                      return (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset newInstance() {
                  return (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.LicenseoverviewDocument.Licenseoverview newInstance() {
              return (noNamespace.LicenseoverviewDocument.Licenseoverview) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.LicenseoverviewDocument.Licenseoverview newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.LicenseoverviewDocument.Licenseoverview) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.LicenseoverviewDocument newInstance() {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.LicenseoverviewDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.LicenseoverviewDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.LicenseoverviewDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.LicenseoverviewDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.LicenseoverviewDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.LicenseoverviewDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.LicenseoverviewDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.LicenseoverviewDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.LicenseoverviewDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.LicenseoverviewDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.LicenseoverviewDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
