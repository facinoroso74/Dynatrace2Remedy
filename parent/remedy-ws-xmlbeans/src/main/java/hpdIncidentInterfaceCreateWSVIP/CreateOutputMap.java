/*
 * XML Type:  CreateOutputMap
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.CreateOutputMap
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP;


/**
 * An XML CreateOutputMap(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is a complex type.
 */
public interface CreateOutputMap extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateOutputMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB217844AB0D42AE46ACCA764F5D4FBB6").resolveHandle("createoutputmapf44ftype");
    
    /**
     * Gets the "Incident_Number" element
     */
    java.lang.String getIncidentNumber();
    
    /**
     * Gets (as xml) the "Incident_Number" element
     */
    org.apache.xmlbeans.XmlString xgetIncidentNumber();
    
    /**
     * Sets the "Incident_Number" element
     */
    void setIncidentNumber(java.lang.String incidentNumber);
    
    /**
     * Sets (as xml) the "Incident_Number" element
     */
    void xsetIncidentNumber(org.apache.xmlbeans.XmlString incidentNumber);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap newInstance() {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.CreateOutputMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
