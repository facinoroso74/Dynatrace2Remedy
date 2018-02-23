/*
 * An XML document type.
 * Localname: HelpDesk_Submit_Service
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP;


/**
 * A document containing one HelpDesk_Submit_Service(@urn:HPD_IncidentInterface_Create_WS_VIP) element.
 *
 * This is a complex type.
 */
public interface HelpDeskSubmitServiceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HelpDeskSubmitServiceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB217844AB0D42AE46ACCA764F5D4FBB6").resolveHandle("helpdesksubmitservice3133doctype");
    
    /**
     * Gets the "HelpDesk_Submit_Service" element
     */
    hpdIncidentInterfaceCreateWSVIP.CreateInputMap getHelpDeskSubmitService();
    
    /**
     * Sets the "HelpDesk_Submit_Service" element
     */
    void setHelpDeskSubmitService(hpdIncidentInterfaceCreateWSVIP.CreateInputMap helpDeskSubmitService);
    
    /**
     * Appends and returns a new empty "HelpDesk_Submit_Service" element
     */
    hpdIncidentInterfaceCreateWSVIP.CreateInputMap addNewHelpDeskSubmitService();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument newInstance() {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
