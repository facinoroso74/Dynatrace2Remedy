/*
 * XML Type:  Reported_SourceType
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.ReportedSourceType
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP;


/**
 * An XML Reported_SourceType(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is an atomic type that is a restriction of hpdIncidentInterfaceCreateWSVIP.ReportedSourceType.
 */
public interface ReportedSourceType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportedSourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC94DE3C1C87C3132C5C133020159CC7").resolveHandle("reportedsourcetype04d1type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DIRECT_INPUT = Enum.forString("Direct Input");
    static final Enum EMAIL = Enum.forString("Email");
    static final Enum EXTERNAL_ESCALATION = Enum.forString("External Escalation");
    static final Enum FAX = Enum.forString("Fax");
    static final Enum SELF_SERVICE = Enum.forString("Self Service");
    static final Enum SYSTEMS_MANAGEMENT = Enum.forString("Systems Management");
    static final Enum PHONE = Enum.forString("Phone");
    static final Enum VOICE_MAIL = Enum.forString("Voice Mail");
    static final Enum WALK_IN = Enum.forString("Walk In");
    static final Enum WEB = Enum.forString("Web");
    static final Enum OTHER = Enum.forString("Other");
    static final Enum BMC_IMPACT_MANAGER_EVENT = Enum.forString("BMC Impact Manager Event");
    
    static final int INT_DIRECT_INPUT = Enum.INT_DIRECT_INPUT;
    static final int INT_EMAIL = Enum.INT_EMAIL;
    static final int INT_EXTERNAL_ESCALATION = Enum.INT_EXTERNAL_ESCALATION;
    static final int INT_FAX = Enum.INT_FAX;
    static final int INT_SELF_SERVICE = Enum.INT_SELF_SERVICE;
    static final int INT_SYSTEMS_MANAGEMENT = Enum.INT_SYSTEMS_MANAGEMENT;
    static final int INT_PHONE = Enum.INT_PHONE;
    static final int INT_VOICE_MAIL = Enum.INT_VOICE_MAIL;
    static final int INT_WALK_IN = Enum.INT_WALK_IN;
    static final int INT_WEB = Enum.INT_WEB;
    static final int INT_OTHER = Enum.INT_OTHER;
    static final int INT_BMC_IMPACT_MANAGER_EVENT = Enum.INT_BMC_IMPACT_MANAGER_EVENT;
    
    /**
     * Enumeration value class for hpdIncidentInterfaceCreateWSVIP.ReportedSourceType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DIRECT_INPUT
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_DIRECT_INPUT = 1;
        static final int INT_EMAIL = 2;
        static final int INT_EXTERNAL_ESCALATION = 3;
        static final int INT_FAX = 4;
        static final int INT_SELF_SERVICE = 5;
        static final int INT_SYSTEMS_MANAGEMENT = 6;
        static final int INT_PHONE = 7;
        static final int INT_VOICE_MAIL = 8;
        static final int INT_WALK_IN = 9;
        static final int INT_WEB = 10;
        static final int INT_OTHER = 11;
        static final int INT_BMC_IMPACT_MANAGER_EVENT = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Direct Input", INT_DIRECT_INPUT),
                new Enum("Email", INT_EMAIL),
                new Enum("External Escalation", INT_EXTERNAL_ESCALATION),
                new Enum("Fax", INT_FAX),
                new Enum("Self Service", INT_SELF_SERVICE),
                new Enum("Systems Management", INT_SYSTEMS_MANAGEMENT),
                new Enum("Phone", INT_PHONE),
                new Enum("Voice Mail", INT_VOICE_MAIL),
                new Enum("Walk In", INT_WALK_IN),
                new Enum("Web", INT_WEB),
                new Enum("Other", INT_OTHER),
                new Enum("BMC Impact Manager Event", INT_BMC_IMPACT_MANAGER_EVENT),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType newValue(java.lang.Object obj) {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) type.newValue( obj ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType newInstance() {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.ReportedSourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
