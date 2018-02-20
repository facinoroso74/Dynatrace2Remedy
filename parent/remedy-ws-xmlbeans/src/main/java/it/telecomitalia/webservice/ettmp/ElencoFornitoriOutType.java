/*
 * XML Type:  ElencoFornitori_Out_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp;


/**
 * An XML ElencoFornitori_Out_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface ElencoFornitoriOutType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ElencoFornitoriOutType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("elencofornitoriouttypead94type");
    
    /**
     * Gets array of all "DatiFornitore" elements
     */
    it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore[] getDatiFornitoreArray();
    
    /**
     * Gets ith "DatiFornitore" element
     */
    it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore getDatiFornitoreArray(int i);
    
    /**
     * Returns number of "DatiFornitore" element
     */
    int sizeOfDatiFornitoreArray();
    
    /**
     * Sets array of all "DatiFornitore" element
     */
    void setDatiFornitoreArray(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore[] datiFornitoreArray);
    
    /**
     * Sets ith "DatiFornitore" element
     */
    void setDatiFornitoreArray(int i, it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore datiFornitore);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiFornitore" element
     */
    it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore insertNewDatiFornitore(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiFornitore" element
     */
    it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore addNewDatiFornitore();
    
    /**
     * Removes the ith "DatiFornitore" element
     */
    void removeDatiFornitore(int i);
    
    /**
     * Gets the "Cardinalita" attribute
     */
    java.math.BigInteger getCardinalita();
    
    /**
     * Gets (as xml) the "Cardinalita" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCardinalita();
    
    /**
     * Sets the "Cardinalita" attribute
     */
    void setCardinalita(java.math.BigInteger cardinalita);
    
    /**
     * Sets (as xml) the "Cardinalita" attribute
     */
    void xsetCardinalita(org.apache.xmlbeans.XmlInteger cardinalita);
    
    /**
     * An XML DatiFornitore(@).
     *
     * This is a complex type.
     */
    public interface DatiFornitore extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiFornitore.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("datifornitoree018elemtype");
        
        /**
         * Gets the "IdFornitore" attribute
         */
        java.math.BigInteger getIdFornitore();
        
        /**
         * Gets (as xml) the "IdFornitore" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetIdFornitore();
        
        /**
         * Sets the "IdFornitore" attribute
         */
        void setIdFornitore(java.math.BigInteger idFornitore);
        
        /**
         * Sets (as xml) the "IdFornitore" attribute
         */
        void xsetIdFornitore(org.apache.xmlbeans.XmlInteger idFornitore);
        
        /**
         * Gets the "CodAfor" attribute
         */
        java.lang.String getCodAfor();
        
        /**
         * Gets (as xml) the "CodAfor" attribute
         */
        it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor xgetCodAfor();
        
        /**
         * Sets the "CodAfor" attribute
         */
        void setCodAfor(java.lang.String codAfor);
        
        /**
         * Sets (as xml) the "CodAfor" attribute
         */
        void xsetCodAfor(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor codAfor);
        
        /**
         * Gets the "Nome" attribute
         */
        java.lang.String getNome();
        
        /**
         * Gets (as xml) the "Nome" attribute
         */
        it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome xgetNome();
        
        /**
         * Sets the "Nome" attribute
         */
        void setNome(java.lang.String nome);
        
        /**
         * Sets (as xml) the "Nome" attribute
         */
        void xsetNome(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome nome);
        
        /**
         * Gets the "Tipologia" attribute
         */
        it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia.Enum getTipologia();
        
        /**
         * Gets (as xml) the "Tipologia" attribute
         */
        it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia xgetTipologia();
        
        /**
         * Sets the "Tipologia" attribute
         */
        void setTipologia(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia.Enum tipologia);
        
        /**
         * Sets (as xml) the "Tipologia" attribute
         */
        void xsetTipologia(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia tipologia);
        
        /**
         * Gets the "Referente" attribute
         */
        java.lang.String getReferente();
        
        /**
         * Gets (as xml) the "Referente" attribute
         */
        it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente xgetReferente();
        
        /**
         * True if has "Referente" attribute
         */
        boolean isSetReferente();
        
        /**
         * Sets the "Referente" attribute
         */
        void setReferente(java.lang.String referente);
        
        /**
         * Sets (as xml) the "Referente" attribute
         */
        void xsetReferente(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente referente);
        
        /**
         * Unsets the "Referente" attribute
         */
        void unsetReferente();
        
        /**
         * An XML CodAfor(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$CodAfor.
         */
        public interface CodAfor extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodAfor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("codafor9a70attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Nome(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$Nome.
         */
        public interface Nome extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Nome.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("nomea35fattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Tipologia(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$Tipologia.
         */
        public interface Tipologia extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tipologia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("tipologia5228attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum FORNITORE_DI_MANODOPERA = Enum.forString("FornitoreDiManodopera");
            static final Enum FORNITORE_DI_GARANZIA = Enum.forString("FornitoreDiGaranzia");
            static final Enum TECNICO_ESTERNO = Enum.forString("TecnicoEsterno");
            static final Enum TECNICO_TELECOM = Enum.forString("TecnicoTelecom");
            
            static final int INT_FORNITORE_DI_MANODOPERA = Enum.INT_FORNITORE_DI_MANODOPERA;
            static final int INT_FORNITORE_DI_GARANZIA = Enum.INT_FORNITORE_DI_GARANZIA;
            static final int INT_TECNICO_ESTERNO = Enum.INT_TECNICO_ESTERNO;
            static final int INT_TECNICO_TELECOM = Enum.INT_TECNICO_TELECOM;
            
            /**
             * Enumeration value class for it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$Tipologia.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_FORNITORE_DI_MANODOPERA
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
                
                static final int INT_FORNITORE_DI_MANODOPERA = 1;
                static final int INT_FORNITORE_DI_GARANZIA = 2;
                static final int INT_TECNICO_ESTERNO = 3;
                static final int INT_TECNICO_TELECOM = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("FornitoreDiManodopera", INT_FORNITORE_DI_MANODOPERA),
                      new Enum("FornitoreDiGaranzia", INT_FORNITORE_DI_GARANZIA),
                      new Enum("TecnicoEsterno", INT_TECNICO_ESTERNO),
                      new Enum("TecnicoTelecom", INT_TECNICO_TELECOM),
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
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Referente(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$Referente.
         */
        public interface Referente extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Referente.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("referenteceb6attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore newInstance() {
              return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType newInstance() {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
