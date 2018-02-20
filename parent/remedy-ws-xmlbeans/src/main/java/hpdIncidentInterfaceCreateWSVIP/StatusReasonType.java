/*
 * XML Type:  Status_ReasonType
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.StatusReasonType
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP;


/**
 * An XML Status_ReasonType(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is an atomic type that is a restriction of hpdIncidentInterfaceCreateWSVIP.StatusReasonType.
 */
public interface StatusReasonType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusReasonType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC94DE3C1C87C3132C5C133020159CC7").resolveHandle("statusreasontype45bbtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INFRASTRUCTURE_CHANGE_CREATED = Enum.forString("Infrastructure Change Created");
    static final Enum LOCAL_SITE_ACTION_REQUIRED = Enum.forString("Local Site Action Required");
    static final Enum PURCHASE_ORDER_APPROVAL = Enum.forString("Purchase Order Approval");
    static final Enum REGISTRATION_APPROVAL = Enum.forString("Registration Approval");
    static final Enum SUPPLIER_DELIVERY = Enum.forString("Supplier Delivery");
    static final Enum SUPPORT_CONTACT_HOLD = Enum.forString("Support Contact Hold");
    static final Enum THIRD_PARTY_VENDOR_ACTION_REQD = Enum.forString("Third Party Vendor Action Reqd");
    static final Enum CLIENT_ACTION_REQUIRED = Enum.forString("Client Action Required");
    static final Enum INFRASTRUCTURE_CHANGE = Enum.forString("Infrastructure Change");
    static final Enum REQUEST = Enum.forString("Request");
    static final Enum FUTURE_ENHANCEMENT = Enum.forString("Future Enhancement");
    static final Enum PENDING_ORIGINAL_INCIDENT = Enum.forString("Pending Original Incident");
    static final Enum CLIENT_HOLD = Enum.forString("Client Hold");
    static final Enum MONITORING_INCIDENT = Enum.forString("Monitoring Incident");
    static final Enum CUSTOMER_FOLLOW_UP_REQUIRED = Enum.forString("Customer Follow-Up Required");
    static final Enum TEMPORARY_CORRECTIVE_ACTION = Enum.forString("Temporary Corrective Action");
    static final Enum NO_FURTHER_ACTION_REQUIRED = Enum.forString("No Further Action Required");
    static final Enum RESOLVED_BY_ORIGINAL_INCIDENT = Enum.forString("Resolved by Original Incident");
    static final Enum AUTOMATED_RESOLUTION_REPORTED = Enum.forString("Automated Resolution Reported");
    static final Enum NO_LONGER_A_CAUSAL_CI = Enum.forString("No longer a Causal CI");
    
    static final int INT_INFRASTRUCTURE_CHANGE_CREATED = Enum.INT_INFRASTRUCTURE_CHANGE_CREATED;
    static final int INT_LOCAL_SITE_ACTION_REQUIRED = Enum.INT_LOCAL_SITE_ACTION_REQUIRED;
    static final int INT_PURCHASE_ORDER_APPROVAL = Enum.INT_PURCHASE_ORDER_APPROVAL;
    static final int INT_REGISTRATION_APPROVAL = Enum.INT_REGISTRATION_APPROVAL;
    static final int INT_SUPPLIER_DELIVERY = Enum.INT_SUPPLIER_DELIVERY;
    static final int INT_SUPPORT_CONTACT_HOLD = Enum.INT_SUPPORT_CONTACT_HOLD;
    static final int INT_THIRD_PARTY_VENDOR_ACTION_REQD = Enum.INT_THIRD_PARTY_VENDOR_ACTION_REQD;
    static final int INT_CLIENT_ACTION_REQUIRED = Enum.INT_CLIENT_ACTION_REQUIRED;
    static final int INT_INFRASTRUCTURE_CHANGE = Enum.INT_INFRASTRUCTURE_CHANGE;
    static final int INT_REQUEST = Enum.INT_REQUEST;
    static final int INT_FUTURE_ENHANCEMENT = Enum.INT_FUTURE_ENHANCEMENT;
    static final int INT_PENDING_ORIGINAL_INCIDENT = Enum.INT_PENDING_ORIGINAL_INCIDENT;
    static final int INT_CLIENT_HOLD = Enum.INT_CLIENT_HOLD;
    static final int INT_MONITORING_INCIDENT = Enum.INT_MONITORING_INCIDENT;
    static final int INT_CUSTOMER_FOLLOW_UP_REQUIRED = Enum.INT_CUSTOMER_FOLLOW_UP_REQUIRED;
    static final int INT_TEMPORARY_CORRECTIVE_ACTION = Enum.INT_TEMPORARY_CORRECTIVE_ACTION;
    static final int INT_NO_FURTHER_ACTION_REQUIRED = Enum.INT_NO_FURTHER_ACTION_REQUIRED;
    static final int INT_RESOLVED_BY_ORIGINAL_INCIDENT = Enum.INT_RESOLVED_BY_ORIGINAL_INCIDENT;
    static final int INT_AUTOMATED_RESOLUTION_REPORTED = Enum.INT_AUTOMATED_RESOLUTION_REPORTED;
    static final int INT_NO_LONGER_A_CAUSAL_CI = Enum.INT_NO_LONGER_A_CAUSAL_CI;
    
    /**
     * Enumeration value class for hpdIncidentInterfaceCreateWSVIP.StatusReasonType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INFRASTRUCTURE_CHANGE_CREATED
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
        
        static final int INT_INFRASTRUCTURE_CHANGE_CREATED = 1;
        static final int INT_LOCAL_SITE_ACTION_REQUIRED = 2;
        static final int INT_PURCHASE_ORDER_APPROVAL = 3;
        static final int INT_REGISTRATION_APPROVAL = 4;
        static final int INT_SUPPLIER_DELIVERY = 5;
        static final int INT_SUPPORT_CONTACT_HOLD = 6;
        static final int INT_THIRD_PARTY_VENDOR_ACTION_REQD = 7;
        static final int INT_CLIENT_ACTION_REQUIRED = 8;
        static final int INT_INFRASTRUCTURE_CHANGE = 9;
        static final int INT_REQUEST = 10;
        static final int INT_FUTURE_ENHANCEMENT = 11;
        static final int INT_PENDING_ORIGINAL_INCIDENT = 12;
        static final int INT_CLIENT_HOLD = 13;
        static final int INT_MONITORING_INCIDENT = 14;
        static final int INT_CUSTOMER_FOLLOW_UP_REQUIRED = 15;
        static final int INT_TEMPORARY_CORRECTIVE_ACTION = 16;
        static final int INT_NO_FURTHER_ACTION_REQUIRED = 17;
        static final int INT_RESOLVED_BY_ORIGINAL_INCIDENT = 18;
        static final int INT_AUTOMATED_RESOLUTION_REPORTED = 19;
        static final int INT_NO_LONGER_A_CAUSAL_CI = 20;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Infrastructure Change Created", INT_INFRASTRUCTURE_CHANGE_CREATED),
                new Enum("Local Site Action Required", INT_LOCAL_SITE_ACTION_REQUIRED),
                new Enum("Purchase Order Approval", INT_PURCHASE_ORDER_APPROVAL),
                new Enum("Registration Approval", INT_REGISTRATION_APPROVAL),
                new Enum("Supplier Delivery", INT_SUPPLIER_DELIVERY),
                new Enum("Support Contact Hold", INT_SUPPORT_CONTACT_HOLD),
                new Enum("Third Party Vendor Action Reqd", INT_THIRD_PARTY_VENDOR_ACTION_REQD),
                new Enum("Client Action Required", INT_CLIENT_ACTION_REQUIRED),
                new Enum("Infrastructure Change", INT_INFRASTRUCTURE_CHANGE),
                new Enum("Request", INT_REQUEST),
                new Enum("Future Enhancement", INT_FUTURE_ENHANCEMENT),
                new Enum("Pending Original Incident", INT_PENDING_ORIGINAL_INCIDENT),
                new Enum("Client Hold", INT_CLIENT_HOLD),
                new Enum("Monitoring Incident", INT_MONITORING_INCIDENT),
                new Enum("Customer Follow-Up Required", INT_CUSTOMER_FOLLOW_UP_REQUIRED),
                new Enum("Temporary Corrective Action", INT_TEMPORARY_CORRECTIVE_ACTION),
                new Enum("No Further Action Required", INT_NO_FURTHER_ACTION_REQUIRED),
                new Enum("Resolved by Original Incident", INT_RESOLVED_BY_ORIGINAL_INCIDENT),
                new Enum("Automated Resolution Reported", INT_AUTOMATED_RESOLUTION_REPORTED),
                new Enum("No longer a Causal CI", INT_NO_LONGER_A_CAUSAL_CI),
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
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType newValue(java.lang.Object obj) {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) type.newValue( obj ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType newInstance() {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.StatusReasonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
