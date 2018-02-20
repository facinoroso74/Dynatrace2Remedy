/*
 * XML Type:  prepare_ListaAsset_In_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.PrepareListaAssetInType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp;


/**
 * An XML prepare_ListaAsset_In_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface PrepareListaAssetInType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrepareListaAssetInType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("preparelistaassetintype573etype");
    
    /**
     * Gets the "IdAsset" attribute
     */
    java.math.BigInteger getIdAsset();
    
    /**
     * Gets (as xml) the "IdAsset" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetIdAsset();
    
    /**
     * True if has "IdAsset" attribute
     */
    boolean isSetIdAsset();
    
    /**
     * Sets the "IdAsset" attribute
     */
    void setIdAsset(java.math.BigInteger idAsset);
    
    /**
     * Sets (as xml) the "IdAsset" attribute
     */
    void xsetIdAsset(org.apache.xmlbeans.XmlInteger idAsset);
    
    /**
     * Unsets the "IdAsset" attribute
     */
    void unsetIdAsset();
    
    /**
     * Gets the "Categoria" attribute
     */
    it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria.Enum getCategoria();
    
    /**
     * Gets (as xml) the "Categoria" attribute
     */
    it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria xgetCategoria();
    
    /**
     * True if has "Categoria" attribute
     */
    boolean isSetCategoria();
    
    /**
     * Sets the "Categoria" attribute
     */
    void setCategoria(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria.Enum categoria);
    
    /**
     * Sets (as xml) the "Categoria" attribute
     */
    void xsetCategoria(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria categoria);
    
    /**
     * Unsets the "Categoria" attribute
     */
    void unsetCategoria();
    
    /**
     * Gets the "Stato" attribute
     */
    it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato.Enum getStato();
    
    /**
     * Gets (as xml) the "Stato" attribute
     */
    it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato xgetStato();
    
    /**
     * Sets the "Stato" attribute
     */
    void setStato(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato.Enum stato);
    
    /**
     * Sets (as xml) the "Stato" attribute
     */
    void xsetStato(it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato stato);
    
    /**
     * Gets the "IdCliente" attribute
     */
    java.math.BigInteger getIdCliente();
    
    /**
     * Gets (as xml) the "IdCliente" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetIdCliente();
    
    /**
     * True if has "IdCliente" attribute
     */
    boolean isSetIdCliente();
    
    /**
     * Sets the "IdCliente" attribute
     */
    void setIdCliente(java.math.BigInteger idCliente);
    
    /**
     * Sets (as xml) the "IdCliente" attribute
     */
    void xsetIdCliente(org.apache.xmlbeans.XmlInteger idCliente);
    
    /**
     * Unsets the "IdCliente" attribute
     */
    void unsetIdCliente();
    
    /**
     * An XML Categoria(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.PrepareListaAssetInType$Categoria.
     */
    public interface Categoria extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Categoria.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("categoriadb63attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum APPLIANCE = Enum.forString("Appliance");
        static final Enum SERVER = Enum.forString("Server");
        
        static final int INT_APPLIANCE = Enum.INT_APPLIANCE;
        static final int INT_SERVER = Enum.INT_SERVER;
        
        /**
         * Enumeration value class for it.telecomitalia.webservice.ettmp.PrepareListaAssetInType$Categoria.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_APPLIANCE
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
            
            static final int INT_APPLIANCE = 1;
            static final int INT_SERVER = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Appliance", INT_APPLIANCE),
                    new Enum("Server", INT_SERVER),
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
            public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria newInstance() {
              return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Categoria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Stato(@).
     *
     * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.PrepareListaAssetInType$Stato.
     */
    public interface Stato extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Stato.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("statoa8fbattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INSTALLATO = Enum.forString("Installato");
        
        static final int INT_INSTALLATO = Enum.INT_INSTALLATO;
        
        /**
         * Enumeration value class for it.telecomitalia.webservice.ettmp.PrepareListaAssetInType$Stato.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INSTALLATO
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
            
            static final int INT_INSTALLATO = 1;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Installato", INT_INSTALLATO),
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
            public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato newValue(java.lang.Object obj) {
              return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato) type.newValue( obj ); }
            
            public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato newInstance() {
              return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType.Stato) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType newInstance() {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.PrepareListaAssetInType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.PrepareListaAssetInType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
