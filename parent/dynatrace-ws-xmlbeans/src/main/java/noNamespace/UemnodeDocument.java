/*
 * An XML document type.
 * Localname: uemnode
 * Namespace: 
 * Java type: noNamespace.UemnodeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one uemnode(@) element.
 *
 * This is a complex type.
 */
public interface UemnodeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UemnodeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("uemnode68c6doctype");
    
    /**
     * Gets the "uemnode" element
     */
    noNamespace.UemnodeDocument.Uemnode getUemnode();
    
    /**
     * Sets the "uemnode" element
     */
    void setUemnode(noNamespace.UemnodeDocument.Uemnode uemnode);
    
    /**
     * Appends and returns a new empty "uemnode" element
     */
    noNamespace.UemnodeDocument.Uemnode addNewUemnode();
    
    /**
     * An XML uemnode(@).
     *
     * This is a complex type.
     */
    public interface Uemnode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Uemnode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("uemnode5ae1elemtype");
        
        /**
         * Gets array of all "attachment" elements
         */
        noNamespace.AttachmentDocument.Attachment[] getAttachmentArray();
        
        /**
         * Gets ith "attachment" element
         */
        noNamespace.AttachmentDocument.Attachment getAttachmentArray(int i);
        
        /**
         * Returns number of "attachment" element
         */
        int sizeOfAttachmentArray();
        
        /**
         * Sets array of all "attachment" element
         */
        void setAttachmentArray(noNamespace.AttachmentDocument.Attachment[] attachmentArray);
        
        /**
         * Sets ith "attachment" element
         */
        void setAttachmentArray(int i, noNamespace.AttachmentDocument.Attachment attachment);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attachment" element
         */
        noNamespace.AttachmentDocument.Attachment insertNewAttachment(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attachment" element
         */
        noNamespace.AttachmentDocument.Attachment addNewAttachment();
        
        /**
         * Removes the ith "attachment" element
         */
        void removeAttachment(int i);
        
        /**
         * Gets array of all "uemnode" elements
         */
        noNamespace.UemnodeDocument.Uemnode[] getUemnodeArray();
        
        /**
         * Gets ith "uemnode" element
         */
        noNamespace.UemnodeDocument.Uemnode getUemnodeArray(int i);
        
        /**
         * Returns number of "uemnode" element
         */
        int sizeOfUemnodeArray();
        
        /**
         * Sets array of all "uemnode" element
         */
        void setUemnodeArray(noNamespace.UemnodeDocument.Uemnode[] uemnodeArray);
        
        /**
         * Sets ith "uemnode" element
         */
        void setUemnodeArray(int i, noNamespace.UemnodeDocument.Uemnode uemnode);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "uemnode" element
         */
        noNamespace.UemnodeDocument.Uemnode insertNewUemnode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "uemnode" element
         */
        noNamespace.UemnodeDocument.Uemnode addNewUemnode();
        
        /**
         * Removes the ith "uemnode" element
         */
        void removeUemnode(int i);
        
        /**
         * Gets the "node" attribute
         */
        java.lang.String getNode();
        
        /**
         * Gets (as xml) the "node" attribute
         */
        org.apache.xmlbeans.XmlString xgetNode();
        
        /**
         * True if has "node" attribute
         */
        boolean isSetNode();
        
        /**
         * Sets the "node" attribute
         */
        void setNode(java.lang.String node);
        
        /**
         * Sets (as xml) the "node" attribute
         */
        void xsetNode(org.apache.xmlbeans.XmlString node);
        
        /**
         * Unsets the "node" attribute
         */
        void unsetNode();
        
        /**
         * Gets the "detail" attribute
         */
        java.lang.String getDetail();
        
        /**
         * Gets (as xml) the "detail" attribute
         */
        org.apache.xmlbeans.XmlString xgetDetail();
        
        /**
         * True if has "detail" attribute
         */
        boolean isSetDetail();
        
        /**
         * Sets the "detail" attribute
         */
        void setDetail(java.lang.String detail);
        
        /**
         * Sets (as xml) the "detail" attribute
         */
        void xsetDetail(org.apache.xmlbeans.XmlString detail);
        
        /**
         * Unsets the "detail" attribute
         */
        void unsetDetail();
        
        /**
         * Gets the "exectotaltime" attribute
         */
        double getExectotaltime();
        
        /**
         * Gets (as xml) the "exectotaltime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetExectotaltime();
        
        /**
         * True if has "exectotaltime" attribute
         */
        boolean isSetExectotaltime();
        
        /**
         * Sets the "exectotaltime" attribute
         */
        void setExectotaltime(double exectotaltime);
        
        /**
         * Sets (as xml) the "exectotaltime" attribute
         */
        void xsetExectotaltime(org.apache.xmlbeans.XmlDouble exectotaltime);
        
        /**
         * Unsets the "exectotaltime" attribute
         */
        void unsetExectotaltime();
        
        /**
         * Gets the "elapsedtime" attribute
         */
        double getElapsedtime();
        
        /**
         * Gets (as xml) the "elapsedtime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetElapsedtime();
        
        /**
         * True if has "elapsedtime" attribute
         */
        boolean isSetElapsedtime();
        
        /**
         * Sets the "elapsedtime" attribute
         */
        void setElapsedtime(double elapsedtime);
        
        /**
         * Sets (as xml) the "elapsedtime" attribute
         */
        void xsetElapsedtime(org.apache.xmlbeans.XmlDouble elapsedtime);
        
        /**
         * Unsets the "elapsedtime" attribute
         */
        void unsetElapsedtime();
        
        /**
         * Gets the "api" attribute
         */
        java.lang.String getApi();
        
        /**
         * Gets (as xml) the "api" attribute
         */
        org.apache.xmlbeans.XmlString xgetApi();
        
        /**
         * True if has "api" attribute
         */
        boolean isSetApi();
        
        /**
         * Sets the "api" attribute
         */
        void setApi(java.lang.String api);
        
        /**
         * Sets (as xml) the "api" attribute
         */
        void xsetApi(org.apache.xmlbeans.XmlString api);
        
        /**
         * Unsets the "api" attribute
         */
        void unsetApi();
        
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
         * Gets the "level" attribute
         */
        java.math.BigInteger getLevel();
        
        /**
         * Gets (as xml) the "level" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetLevel();
        
        /**
         * True if has "level" attribute
         */
        boolean isSetLevel();
        
        /**
         * Sets the "level" attribute
         */
        void setLevel(java.math.BigInteger level);
        
        /**
         * Sets (as xml) the "level" attribute
         */
        void xsetLevel(org.apache.xmlbeans.XmlInteger level);
        
        /**
         * Unsets the "level" attribute
         */
        void unsetLevel();
        
        /**
         * Gets the "entryhopcount" attribute
         */
        java.math.BigInteger getEntryhopcount();
        
        /**
         * Gets (as xml) the "entryhopcount" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetEntryhopcount();
        
        /**
         * True if has "entryhopcount" attribute
         */
        boolean isSetEntryhopcount();
        
        /**
         * Sets the "entryhopcount" attribute
         */
        void setEntryhopcount(java.math.BigInteger entryhopcount);
        
        /**
         * Sets (as xml) the "entryhopcount" attribute
         */
        void xsetEntryhopcount(org.apache.xmlbeans.XmlInteger entryhopcount);
        
        /**
         * Unsets the "entryhopcount" attribute
         */
        void unsetEntryhopcount();
        
        /**
         * Gets the "exithopcount" attribute
         */
        java.math.BigInteger getExithopcount();
        
        /**
         * Gets (as xml) the "exithopcount" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetExithopcount();
        
        /**
         * True if has "exithopcount" attribute
         */
        boolean isSetExithopcount();
        
        /**
         * Sets the "exithopcount" attribute
         */
        void setExithopcount(java.math.BigInteger exithopcount);
        
        /**
         * Sets (as xml) the "exithopcount" attribute
         */
        void xsetExithopcount(org.apache.xmlbeans.XmlInteger exithopcount);
        
        /**
         * Unsets the "exithopcount" attribute
         */
        void unsetExithopcount();
        
        /**
         * Gets the "error_state" attribute
         */
        java.lang.String getErrorState();
        
        /**
         * Gets (as xml) the "error_state" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorState();
        
        /**
         * True if has "error_state" attribute
         */
        boolean isSetErrorState();
        
        /**
         * Sets the "error_state" attribute
         */
        void setErrorState(java.lang.String errorState);
        
        /**
         * Sets (as xml) the "error_state" attribute
         */
        void xsetErrorState(org.apache.xmlbeans.XmlString errorState);
        
        /**
         * Unsets the "error_state" attribute
         */
        void unsetErrorState();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.UemnodeDocument.Uemnode newInstance() {
              return (noNamespace.UemnodeDocument.Uemnode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.UemnodeDocument.Uemnode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.UemnodeDocument.Uemnode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.UemnodeDocument newInstance() {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.UemnodeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.UemnodeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.UemnodeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.UemnodeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.UemnodeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.UemnodeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.UemnodeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.UemnodeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.UemnodeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.UemnodeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.UemnodeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.UemnodeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.UemnodeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.UemnodeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.UemnodeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.UemnodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.UemnodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.UemnodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
