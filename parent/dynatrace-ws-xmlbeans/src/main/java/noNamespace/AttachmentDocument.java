/*
 * An XML document type.
 * Localname: attachment
 * Namespace: 
 * Java type: noNamespace.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one attachment(@) element.
 *
 * This is a complex type.
 */
public interface AttachmentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttachmentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("attachmentde5cdoctype");
    
    /**
     * Gets the "attachment" element
     */
    noNamespace.AttachmentDocument.Attachment getAttachment();
    
    /**
     * Sets the "attachment" element
     */
    void setAttachment(noNamespace.AttachmentDocument.Attachment attachment);
    
    /**
     * Appends and returns a new empty "attachment" element
     */
    noNamespace.AttachmentDocument.Attachment addNewAttachment();
    
    /**
     * An XML attachment(@).
     *
     * This is a complex type.
     */
    public interface Attachment extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Attachment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("attachment790delemtype");
        
        /**
         * Gets array of all "attachment" elements
         */
        org.apache.xmlbeans.XmlObject[] getAttachmentArray();
        
        /**
         * Gets ith "attachment" element
         */
        org.apache.xmlbeans.XmlObject getAttachmentArray(int i);
        
        /**
         * Returns number of "attachment" element
         */
        int sizeOfAttachmentArray();
        
        /**
         * Sets array of all "attachment" element
         */
        void setAttachmentArray(org.apache.xmlbeans.XmlObject[] attachmentArray);
        
        /**
         * Sets ith "attachment" element
         */
        void setAttachmentArray(int i, org.apache.xmlbeans.XmlObject attachment);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attachment" element
         */
        org.apache.xmlbeans.XmlObject insertNewAttachment(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attachment" element
         */
        org.apache.xmlbeans.XmlObject addNewAttachment();
        
        /**
         * Removes the ith "attachment" element
         */
        void removeAttachment(int i);
        
        /**
         * Gets array of all "property" elements
         */
        noNamespace.AttachmentDocument.Attachment.Property[] getPropertyArray();
        
        /**
         * Gets ith "property" element
         */
        noNamespace.AttachmentDocument.Attachment.Property getPropertyArray(int i);
        
        /**
         * Returns number of "property" element
         */
        int sizeOfPropertyArray();
        
        /**
         * Sets array of all "property" element
         */
        void setPropertyArray(noNamespace.AttachmentDocument.Attachment.Property[] propertyArray);
        
        /**
         * Sets ith "property" element
         */
        void setPropertyArray(int i, noNamespace.AttachmentDocument.Attachment.Property property);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        noNamespace.AttachmentDocument.Attachment.Property insertNewProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        noNamespace.AttachmentDocument.Attachment.Property addNewProperty();
        
        /**
         * Removes the ith "property" element
         */
        void removeProperty(int i);
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * An XML property(@).
         *
         * This is a complex type.
         */
        public interface Property extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("propertyb22eelemtype");
            
            /**
             * Gets the "key" attribute
             */
            java.lang.String getKey();
            
            /**
             * Gets (as xml) the "key" attribute
             */
            org.apache.xmlbeans.XmlString xgetKey();
            
            /**
             * True if has "key" attribute
             */
            boolean isSetKey();
            
            /**
             * Sets the "key" attribute
             */
            void setKey(java.lang.String key);
            
            /**
             * Sets (as xml) the "key" attribute
             */
            void xsetKey(org.apache.xmlbeans.XmlString key);
            
            /**
             * Unsets the "key" attribute
             */
            void unsetKey();
            
            /**
             * Gets the "value" attribute
             */
            java.lang.String getValue();
            
            /**
             * Gets (as xml) the "value" attribute
             */
            org.apache.xmlbeans.XmlString xgetValue();
            
            /**
             * True if has "value" attribute
             */
            boolean isSetValue();
            
            /**
             * Sets the "value" attribute
             */
            void setValue(java.lang.String value);
            
            /**
             * Sets (as xml) the "value" attribute
             */
            void xsetValue(org.apache.xmlbeans.XmlString value);
            
            /**
             * Unsets the "value" attribute
             */
            void unsetValue();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.AttachmentDocument.Attachment.Property newInstance() {
                  return (noNamespace.AttachmentDocument.Attachment.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.AttachmentDocument.Attachment.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.AttachmentDocument.Attachment.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.AttachmentDocument.Attachment newInstance() {
              return (noNamespace.AttachmentDocument.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.AttachmentDocument.Attachment newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.AttachmentDocument.Attachment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.AttachmentDocument newInstance() {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.AttachmentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.AttachmentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.AttachmentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.AttachmentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.AttachmentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.AttachmentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.AttachmentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.AttachmentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.AttachmentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.AttachmentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.AttachmentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.AttachmentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.AttachmentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.AttachmentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.AttachmentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.AttachmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.AttachmentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.AttachmentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
