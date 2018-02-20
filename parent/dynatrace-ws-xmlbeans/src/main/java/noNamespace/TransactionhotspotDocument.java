/*
 * An XML document type.
 * Localname: transactionhotspot
 * Namespace: 
 * Java type: noNamespace.TransactionhotspotDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one transactionhotspot(@) element.
 *
 * This is a complex type.
 */
public interface TransactionhotspotDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionhotspotDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("transactionhotspotb26adoctype");
    
    /**
     * Gets the "transactionhotspot" element
     */
    noNamespace.TransactionhotspotDocument.Transactionhotspot getTransactionhotspot();
    
    /**
     * Sets the "transactionhotspot" element
     */
    void setTransactionhotspot(noNamespace.TransactionhotspotDocument.Transactionhotspot transactionhotspot);
    
    /**
     * Appends and returns a new empty "transactionhotspot" element
     */
    noNamespace.TransactionhotspotDocument.Transactionhotspot addNewTransactionhotspot();
    
    /**
     * An XML transactionhotspot(@).
     *
     * This is a complex type.
     */
    public interface Transactionhotspot extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transactionhotspot.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("transactionhotspot4bcdelemtype");
        
        /**
         * Gets array of all "transactionhotspot" elements
         */
        noNamespace.TransactionhotspotDocument.Transactionhotspot[] getTransactionhotspotArray();
        
        /**
         * Gets ith "transactionhotspot" element
         */
        noNamespace.TransactionhotspotDocument.Transactionhotspot getTransactionhotspotArray(int i);
        
        /**
         * Returns number of "transactionhotspot" element
         */
        int sizeOfTransactionhotspotArray();
        
        /**
         * Sets array of all "transactionhotspot" element
         */
        void setTransactionhotspotArray(noNamespace.TransactionhotspotDocument.Transactionhotspot[] transactionhotspotArray);
        
        /**
         * Sets ith "transactionhotspot" element
         */
        void setTransactionhotspotArray(int i, noNamespace.TransactionhotspotDocument.Transactionhotspot transactionhotspot);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "transactionhotspot" element
         */
        noNamespace.TransactionhotspotDocument.Transactionhotspot insertNewTransactionhotspot(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "transactionhotspot" element
         */
        noNamespace.TransactionhotspotDocument.Transactionhotspot addNewTransactionhotspot();
        
        /**
         * Removes the ith "transactionhotspot" element
         */
        void removeTransactionhotspot(int i);
        
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
        double getCount();
        
        /**
         * Gets (as xml) the "count" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCount();
        
        /**
         * True if has "count" attribute
         */
        boolean isSetCount();
        
        /**
         * Sets the "count" attribute
         */
        void setCount(double count);
        
        /**
         * Sets (as xml) the "count" attribute
         */
        void xsetCount(org.apache.xmlbeans.XmlDouble count);
        
        /**
         * Unsets the "count" attribute
         */
        void unsetCount();
        
        /**
         * Gets the "countperday" attribute
         */
        double getCountperday();
        
        /**
         * Gets (as xml) the "countperday" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCountperday();
        
        /**
         * True if has "countperday" attribute
         */
        boolean isSetCountperday();
        
        /**
         * Sets the "countperday" attribute
         */
        void setCountperday(double countperday);
        
        /**
         * Sets (as xml) the "countperday" attribute
         */
        void xsetCountperday(org.apache.xmlbeans.XmlDouble countperday);
        
        /**
         * Unsets the "countperday" attribute
         */
        void unsetCountperday();
        
        /**
         * Gets the "incidents" attribute
         */
        double getIncidents();
        
        /**
         * Gets (as xml) the "incidents" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetIncidents();
        
        /**
         * True if has "incidents" attribute
         */
        boolean isSetIncidents();
        
        /**
         * Sets the "incidents" attribute
         */
        void setIncidents(double incidents);
        
        /**
         * Sets (as xml) the "incidents" attribute
         */
        void xsetIncidents(org.apache.xmlbeans.XmlDouble incidents);
        
        /**
         * Unsets the "incidents" attribute
         */
        void unsetIncidents();
        
        /**
         * Gets the "incidentsperday" attribute
         */
        double getIncidentsperday();
        
        /**
         * Gets (as xml) the "incidentsperday" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetIncidentsperday();
        
        /**
         * True if has "incidentsperday" attribute
         */
        boolean isSetIncidentsperday();
        
        /**
         * Sets the "incidentsperday" attribute
         */
        void setIncidentsperday(double incidentsperday);
        
        /**
         * Sets (as xml) the "incidentsperday" attribute
         */
        void xsetIncidentsperday(org.apache.xmlbeans.XmlDouble incidentsperday);
        
        /**
         * Unsets the "incidentsperday" attribute
         */
        void unsetIncidentsperday();
        
        /**
         * Gets the "incidentrate" attribute
         */
        double getIncidentrate();
        
        /**
         * Gets (as xml) the "incidentrate" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetIncidentrate();
        
        /**
         * True if has "incidentrate" attribute
         */
        boolean isSetIncidentrate();
        
        /**
         * Sets the "incidentrate" attribute
         */
        void setIncidentrate(double incidentrate);
        
        /**
         * Sets (as xml) the "incidentrate" attribute
         */
        void xsetIncidentrate(org.apache.xmlbeans.XmlDouble incidentrate);
        
        /**
         * Unsets the "incidentrate" attribute
         */
        void unsetIncidentrate();
        
        /**
         * Gets the "violations" attribute
         */
        double getViolations();
        
        /**
         * Gets (as xml) the "violations" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetViolations();
        
        /**
         * True if has "violations" attribute
         */
        boolean isSetViolations();
        
        /**
         * Sets the "violations" attribute
         */
        void setViolations(double violations);
        
        /**
         * Sets (as xml) the "violations" attribute
         */
        void xsetViolations(org.apache.xmlbeans.XmlDouble violations);
        
        /**
         * Unsets the "violations" attribute
         */
        void unsetViolations();
        
        /**
         * Gets the "violationsperday" attribute
         */
        double getViolationsperday();
        
        /**
         * Gets (as xml) the "violationsperday" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetViolationsperday();
        
        /**
         * True if has "violationsperday" attribute
         */
        boolean isSetViolationsperday();
        
        /**
         * Sets the "violationsperday" attribute
         */
        void setViolationsperday(double violationsperday);
        
        /**
         * Sets (as xml) the "violationsperday" attribute
         */
        void xsetViolationsperday(org.apache.xmlbeans.XmlDouble violationsperday);
        
        /**
         * Unsets the "violationsperday" attribute
         */
        void unsetViolationsperday();
        
        /**
         * Gets the "violationrate" attribute
         */
        double getViolationrate();
        
        /**
         * Gets (as xml) the "violationrate" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetViolationrate();
        
        /**
         * True if has "violationrate" attribute
         */
        boolean isSetViolationrate();
        
        /**
         * Sets the "violationrate" attribute
         */
        void setViolationrate(double violationrate);
        
        /**
         * Sets (as xml) the "violationrate" attribute
         */
        void xsetViolationrate(org.apache.xmlbeans.XmlDouble violationrate);
        
        /**
         * Unsets the "violationrate" attribute
         */
        void unsetViolationrate();
        
        /**
         * Gets the "state" attribute
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * True if has "state" attribute
         */
        boolean isSetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Unsets the "state" attribute
         */
        void unsetState();
        
        /**
         * Gets the "errorpercentage" attribute
         */
        double getErrorpercentage();
        
        /**
         * Gets (as xml) the "errorpercentage" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetErrorpercentage();
        
        /**
         * True if has "errorpercentage" attribute
         */
        boolean isSetErrorpercentage();
        
        /**
         * Sets the "errorpercentage" attribute
         */
        void setErrorpercentage(double errorpercentage);
        
        /**
         * Sets (as xml) the "errorpercentage" attribute
         */
        void xsetErrorpercentage(org.apache.xmlbeans.XmlDouble errorpercentage);
        
        /**
         * Unsets the "errorpercentage" attribute
         */
        void unsetErrorpercentage();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.TransactionhotspotDocument.Transactionhotspot newInstance() {
              return (noNamespace.TransactionhotspotDocument.Transactionhotspot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.TransactionhotspotDocument.Transactionhotspot newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.TransactionhotspotDocument.Transactionhotspot) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.TransactionhotspotDocument newInstance() {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.TransactionhotspotDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.TransactionhotspotDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.TransactionhotspotDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.TransactionhotspotDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.TransactionhotspotDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.TransactionhotspotDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.TransactionhotspotDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.TransactionhotspotDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TransactionhotspotDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TransactionhotspotDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TransactionhotspotDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
