/*
 * An XML document type.
 * Localname: textandmeasure
 * Namespace: 
 * Java type: noNamespace.TextandmeasureDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one textandmeasure(@) element.
 *
 * This is a complex type.
 */
public interface TextandmeasureDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TextandmeasureDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("textandmeasure6d4ddoctype");
    
    /**
     * Gets the "textandmeasure" element
     */
    noNamespace.TextandmeasureDocument.Textandmeasure getTextandmeasure();
    
    /**
     * Sets the "textandmeasure" element
     */
    void setTextandmeasure(noNamespace.TextandmeasureDocument.Textandmeasure textandmeasure);
    
    /**
     * Appends and returns a new empty "textandmeasure" element
     */
    noNamespace.TextandmeasureDocument.Textandmeasure addNewTextandmeasure();
    
    /**
     * An XML textandmeasure(@).
     *
     * This is a complex type.
     */
    public interface Textandmeasure extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Textandmeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("textandmeasurea82delemtype");
        
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
         * Gets the "textmeasurecontent" element
         */
        java.lang.String getTextmeasurecontent();
        
        /**
         * Gets (as xml) the "textmeasurecontent" element
         */
        org.apache.xmlbeans.XmlString xgetTextmeasurecontent();
        
        /**
         * Sets the "textmeasurecontent" element
         */
        void setTextmeasurecontent(java.lang.String textmeasurecontent);
        
        /**
         * Sets (as xml) the "textmeasurecontent" element
         */
        void xsetTextmeasurecontent(org.apache.xmlbeans.XmlString textmeasurecontent);
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.TextandmeasureDocument.Textandmeasure newInstance() {
              return (noNamespace.TextandmeasureDocument.Textandmeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.TextandmeasureDocument.Textandmeasure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.TextandmeasureDocument.Textandmeasure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.TextandmeasureDocument newInstance() {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.TextandmeasureDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.TextandmeasureDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.TextandmeasureDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.TextandmeasureDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.TextandmeasureDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.TextandmeasureDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.TextandmeasureDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.TextandmeasureDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TextandmeasureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TextandmeasureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TextandmeasureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
