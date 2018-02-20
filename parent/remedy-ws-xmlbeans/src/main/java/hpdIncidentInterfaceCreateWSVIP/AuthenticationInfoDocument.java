/*
 * An XML document type.
 * Localname: AuthenticationInfo
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP;


/**
 * A document containing one AuthenticationInfo(@urn:HPD_IncidentInterface_Create_WS_VIP) element.
 *
 * This is a complex type.
 */
public interface AuthenticationInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthenticationInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC94DE3C1C87C3132C5C133020159CC7").resolveHandle("authenticationinfobd98doctype");
    
    /**
     * Gets the "AuthenticationInfo" element
     */
    hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo getAuthenticationInfo();
    
    /**
     * Sets the "AuthenticationInfo" element
     */
    void setAuthenticationInfo(hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo authenticationInfo);
    
    /**
     * Appends and returns a new empty "AuthenticationInfo" element
     */
    hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo addNewAuthenticationInfo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument newInstance() {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}