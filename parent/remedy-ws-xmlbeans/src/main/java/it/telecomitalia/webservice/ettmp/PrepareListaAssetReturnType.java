/*
 * XML Type:  prepare_ListaAsset_Return_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp;


/**
 * An XML prepare_ListaAsset_Return_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType.
 */
public interface PrepareListaAssetReturnType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrepareListaAssetReturnType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6AC8A1960730EDE592EF8139D9BF949E").resolveHandle("preparelistaassetreturntypea153type");
    
    /**
     * Gets the "CardinalitaItem" attribute
     */
    java.math.BigInteger getCardinalitaItem();
    
    /**
     * Gets (as xml) the "CardinalitaItem" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCardinalitaItem();
    
    /**
     * Sets the "CardinalitaItem" attribute
     */
    void setCardinalitaItem(java.math.BigInteger cardinalitaItem);
    
    /**
     * Sets (as xml) the "CardinalitaItem" attribute
     */
    void xsetCardinalitaItem(org.apache.xmlbeans.XmlInteger cardinalitaItem);
    
    /**
     * Gets the "NumeroItemPerPagina" attribute
     */
    java.math.BigInteger getNumeroItemPerPagina();
    
    /**
     * Gets (as xml) the "NumeroItemPerPagina" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetNumeroItemPerPagina();
    
    /**
     * Sets the "NumeroItemPerPagina" attribute
     */
    void setNumeroItemPerPagina(java.math.BigInteger numeroItemPerPagina);
    
    /**
     * Sets (as xml) the "NumeroItemPerPagina" attribute
     */
    void xsetNumeroItemPerPagina(org.apache.xmlbeans.XmlInteger numeroItemPerPagina);
    
    /**
     * Gets the "RequestID" attribute
     */
    java.math.BigInteger getRequestID();
    
    /**
     * Gets (as xml) the "RequestID" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetRequestID();
    
    /**
     * Sets the "RequestID" attribute
     */
    void setRequestID(java.math.BigInteger requestID);
    
    /**
     * Sets (as xml) the "RequestID" attribute
     */
    void xsetRequestID(org.apache.xmlbeans.XmlInteger requestID);
    
    /**
     * Gets the "TotalePagine" attribute
     */
    java.math.BigInteger getTotalePagine();
    
    /**
     * Gets (as xml) the "TotalePagine" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetTotalePagine();
    
    /**
     * Sets the "TotalePagine" attribute
     */
    void setTotalePagine(java.math.BigInteger totalePagine);
    
    /**
     * Sets (as xml) the "TotalePagine" attribute
     */
    void xsetTotalePagine(org.apache.xmlbeans.XmlInteger totalePagine);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType newInstance() {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetReturnType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
