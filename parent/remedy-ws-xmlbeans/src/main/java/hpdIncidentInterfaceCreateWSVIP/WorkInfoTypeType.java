/*
 * XML Type:  Work_Info_TypeType
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP;


/**
 * An XML Work_Info_TypeType(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is an atomic type that is a restriction of hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType.
 */
public interface WorkInfoTypeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkInfoTypeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB217844AB0D42AE46ACCA764F5D4FBB6").resolveHandle("workinfotypetype2099type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CUSTOMER_INBOUND = Enum.forString("----- Customer Inbound -----");
    static final Enum CUSTOMER_COMMUNICATION = Enum.forString("Customer Communication");
    static final Enum CUSTOMER_FOLLOW_UP = Enum.forString("Customer Follow-up");
    static final Enum CUSTOMER_STATUS_UPDATE = Enum.forString("Customer Status Update");
    static final Enum CUSTOMER_OUTBOUND = Enum.forString("----- Customer Outbound -----");
    static final Enum CLOSURE_FOLLOW_UP = Enum.forString("Closure Follow Up");
    static final Enum DETAIL_CLARIFICATION = Enum.forString("Detail Clarification");
    static final Enum GENERAL_INFORMATION = Enum.forString("General Information");
    static final Enum RESOLUTION_COMMUNICATIONS = Enum.forString("Resolution Communications");
    static final Enum SATISFACTION_SURVEY = Enum.forString("Satisfaction Survey");
    static final Enum STATUS_UPDATE = Enum.forString("Status Update");
    static final Enum GENERAL = Enum.forString("----- General -----");
    static final Enum INCIDENT_TASK_ACTION = Enum.forString("Incident Task / Action");
    static final Enum PROBLEM_SCRIPT = Enum.forString("Problem Script");
    static final Enum WORKING_LOG = Enum.forString("Working Log");
    static final Enum EMAIL_SYSTEM = Enum.forString("Email System");
    static final Enum PAGING_SYSTEM = Enum.forString("Paging System");
    static final Enum BMC_IMPACT_MANAGER_UPDATE = Enum.forString("BMC Impact Manager Update");
    
    static final int INT_CUSTOMER_INBOUND = Enum.INT_CUSTOMER_INBOUND;
    static final int INT_CUSTOMER_COMMUNICATION = Enum.INT_CUSTOMER_COMMUNICATION;
    static final int INT_CUSTOMER_FOLLOW_UP = Enum.INT_CUSTOMER_FOLLOW_UP;
    static final int INT_CUSTOMER_STATUS_UPDATE = Enum.INT_CUSTOMER_STATUS_UPDATE;
    static final int INT_CUSTOMER_OUTBOUND = Enum.INT_CUSTOMER_OUTBOUND;
    static final int INT_CLOSURE_FOLLOW_UP = Enum.INT_CLOSURE_FOLLOW_UP;
    static final int INT_DETAIL_CLARIFICATION = Enum.INT_DETAIL_CLARIFICATION;
    static final int INT_GENERAL_INFORMATION = Enum.INT_GENERAL_INFORMATION;
    static final int INT_RESOLUTION_COMMUNICATIONS = Enum.INT_RESOLUTION_COMMUNICATIONS;
    static final int INT_SATISFACTION_SURVEY = Enum.INT_SATISFACTION_SURVEY;
    static final int INT_STATUS_UPDATE = Enum.INT_STATUS_UPDATE;
    static final int INT_GENERAL = Enum.INT_GENERAL;
    static final int INT_INCIDENT_TASK_ACTION = Enum.INT_INCIDENT_TASK_ACTION;
    static final int INT_PROBLEM_SCRIPT = Enum.INT_PROBLEM_SCRIPT;
    static final int INT_WORKING_LOG = Enum.INT_WORKING_LOG;
    static final int INT_EMAIL_SYSTEM = Enum.INT_EMAIL_SYSTEM;
    static final int INT_PAGING_SYSTEM = Enum.INT_PAGING_SYSTEM;
    static final int INT_BMC_IMPACT_MANAGER_UPDATE = Enum.INT_BMC_IMPACT_MANAGER_UPDATE;
    
    /**
     * Enumeration value class for hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CUSTOMER_INBOUND
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
        
        static final int INT_CUSTOMER_INBOUND = 1;
        static final int INT_CUSTOMER_COMMUNICATION = 2;
        static final int INT_CUSTOMER_FOLLOW_UP = 3;
        static final int INT_CUSTOMER_STATUS_UPDATE = 4;
        static final int INT_CUSTOMER_OUTBOUND = 5;
        static final int INT_CLOSURE_FOLLOW_UP = 6;
        static final int INT_DETAIL_CLARIFICATION = 7;
        static final int INT_GENERAL_INFORMATION = 8;
        static final int INT_RESOLUTION_COMMUNICATIONS = 9;
        static final int INT_SATISFACTION_SURVEY = 10;
        static final int INT_STATUS_UPDATE = 11;
        static final int INT_GENERAL = 12;
        static final int INT_INCIDENT_TASK_ACTION = 13;
        static final int INT_PROBLEM_SCRIPT = 14;
        static final int INT_WORKING_LOG = 15;
        static final int INT_EMAIL_SYSTEM = 16;
        static final int INT_PAGING_SYSTEM = 17;
        static final int INT_BMC_IMPACT_MANAGER_UPDATE = 18;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("----- Customer Inbound -----", INT_CUSTOMER_INBOUND),
                new Enum("Customer Communication", INT_CUSTOMER_COMMUNICATION),
                new Enum("Customer Follow-up", INT_CUSTOMER_FOLLOW_UP),
                new Enum("Customer Status Update", INT_CUSTOMER_STATUS_UPDATE),
                new Enum("----- Customer Outbound -----", INT_CUSTOMER_OUTBOUND),
                new Enum("Closure Follow Up", INT_CLOSURE_FOLLOW_UP),
                new Enum("Detail Clarification", INT_DETAIL_CLARIFICATION),
                new Enum("General Information", INT_GENERAL_INFORMATION),
                new Enum("Resolution Communications", INT_RESOLUTION_COMMUNICATIONS),
                new Enum("Satisfaction Survey", INT_SATISFACTION_SURVEY),
                new Enum("Status Update", INT_STATUS_UPDATE),
                new Enum("----- General -----", INT_GENERAL),
                new Enum("Incident Task / Action", INT_INCIDENT_TASK_ACTION),
                new Enum("Problem Script", INT_PROBLEM_SCRIPT),
                new Enum("Working Log", INT_WORKING_LOG),
                new Enum("Email System", INT_EMAIL_SYSTEM),
                new Enum("Paging System", INT_PAGING_SYSTEM),
                new Enum("BMC Impact Manager Update", INT_BMC_IMPACT_MANAGER_UPDATE),
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
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType newValue(java.lang.Object obj) {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) type.newValue( obj ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType newInstance() {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
