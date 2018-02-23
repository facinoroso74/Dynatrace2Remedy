/*
 * XML Type:  StatusType
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.StatusType
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP;


/**
 * An XML StatusType(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is an atomic type that is a restriction of hpdIncidentInterfaceCreateWSVIP.StatusType.
 */
public interface StatusType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB217844AB0D42AE46ACCA764F5D4FBB6").resolveHandle("statustype998etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NEW = Enum.forString("New");
    static final Enum ASSIGNED = Enum.forString("Assigned");
    static final Enum IN_PROGRESS = Enum.forString("In Progress");
    static final Enum PENDING = Enum.forString("Pending");
    static final Enum RESOLVED = Enum.forString("Resolved");
    static final Enum CLOSED = Enum.forString("Closed");
    static final Enum CANCELLED = Enum.forString("Cancelled");
    
    static final int INT_NEW = Enum.INT_NEW;
    static final int INT_ASSIGNED = Enum.INT_ASSIGNED;
    static final int INT_IN_PROGRESS = Enum.INT_IN_PROGRESS;
    static final int INT_PENDING = Enum.INT_PENDING;
    static final int INT_RESOLVED = Enum.INT_RESOLVED;
    static final int INT_CLOSED = Enum.INT_CLOSED;
    static final int INT_CANCELLED = Enum.INT_CANCELLED;
    
    /**
     * Enumeration value class for hpdIncidentInterfaceCreateWSVIP.StatusType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NEW
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
        
        static final int INT_NEW = 1;
        static final int INT_ASSIGNED = 2;
        static final int INT_IN_PROGRESS = 3;
        static final int INT_PENDING = 4;
        static final int INT_RESOLVED = 5;
        static final int INT_CLOSED = 6;
        static final int INT_CANCELLED = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("New", INT_NEW),
                new Enum("Assigned", INT_ASSIGNED),
                new Enum("In Progress", INT_IN_PROGRESS),
                new Enum("Pending", INT_PENDING),
                new Enum("Resolved", INT_RESOLVED),
                new Enum("Closed", INT_CLOSED),
                new Enum("Cancelled", INT_CANCELLED),
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
        public static hpdIncidentInterfaceCreateWSVIP.StatusType newValue(java.lang.Object obj) {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) type.newValue( obj ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType newInstance() {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceCreateWSVIP.StatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceCreateWSVIP.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
