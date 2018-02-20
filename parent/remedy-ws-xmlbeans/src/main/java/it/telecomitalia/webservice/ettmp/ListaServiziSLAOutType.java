/*
 * XML Type:  ListaServiziSLA_Out_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp;


/**
 * An XML ListaServiziSLA_Out_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public interface ListaServiziSLAOutType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListaServiziSLAOutType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("listaservizislaouttype3da5type");
    
    /**
     * Gets array of all "ListaSLA" elements
     */
    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA[] getListaSLAArray();
    
    /**
     * Gets ith "ListaSLA" element
     */
    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA getListaSLAArray(int i);
    
    /**
     * Returns number of "ListaSLA" element
     */
    int sizeOfListaSLAArray();
    
    /**
     * Sets array of all "ListaSLA" element
     */
    void setListaSLAArray(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA[] listaSLAArray);
    
    /**
     * Sets ith "ListaSLA" element
     */
    void setListaSLAArray(int i, it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA listaSLA);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ListaSLA" element
     */
    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA insertNewListaSLA(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ListaSLA" element
     */
    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA addNewListaSLA();
    
    /**
     * Removes the ith "ListaSLA" element
     */
    void removeListaSLA(int i);
    
    /**
     * Gets the "CardinalitaListaSLA" attribute
     */
    java.math.BigInteger getCardinalitaListaSLA();
    
    /**
     * Gets (as xml) the "CardinalitaListaSLA" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetCardinalitaListaSLA();
    
    /**
     * Sets the "CardinalitaListaSLA" attribute
     */
    void setCardinalitaListaSLA(java.math.BigInteger cardinalitaListaSLA);
    
    /**
     * Sets (as xml) the "CardinalitaListaSLA" attribute
     */
    void xsetCardinalitaListaSLA(org.apache.xmlbeans.XmlInteger cardinalitaListaSLA);
    
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
     * Gets the "Pagina" attribute
     */
    java.math.BigInteger getPagina();
    
    /**
     * Gets (as xml) the "Pagina" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetPagina();
    
    /**
     * Sets the "Pagina" attribute
     */
    void setPagina(java.math.BigInteger pagina);
    
    /**
     * Sets (as xml) the "Pagina" attribute
     */
    void xsetPagina(org.apache.xmlbeans.XmlInteger pagina);
    
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
     * An XML ListaSLA(@).
     *
     * This is a complex type.
     */
    public interface ListaSLA extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListaSLA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("listasla3df4elemtype");
        
        /**
         * Gets array of all "ListaGiorni" elements
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni[] getListaGiorniArray();
        
        /**
         * Gets ith "ListaGiorni" element
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni getListaGiorniArray(int i);
        
        /**
         * Returns number of "ListaGiorni" element
         */
        int sizeOfListaGiorniArray();
        
        /**
         * Sets array of all "ListaGiorni" element
         */
        void setListaGiorniArray(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni[] listaGiorniArray);
        
        /**
         * Sets ith "ListaGiorni" element
         */
        void setListaGiorniArray(int i, it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni listaGiorni);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ListaGiorni" element
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni insertNewListaGiorni(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ListaGiorni" element
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni addNewListaGiorni();
        
        /**
         * Removes the ith "ListaGiorni" element
         */
        void removeListaGiorni(int i);
        
        /**
         * Gets the "IdServizio" attribute
         */
        java.math.BigInteger getIdServizio();
        
        /**
         * Gets (as xml) the "IdServizio" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetIdServizio();
        
        /**
         * Sets the "IdServizio" attribute
         */
        void setIdServizio(java.math.BigInteger idServizio);
        
        /**
         * Sets (as xml) the "IdServizio" attribute
         */
        void xsetIdServizio(org.apache.xmlbeans.XmlInteger idServizio);
        
        /**
         * Gets the "NomeProfilo" attribute
         */
        java.lang.String getNomeProfilo();
        
        /**
         * Gets (as xml) the "NomeProfilo" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo xgetNomeProfilo();
        
        /**
         * Sets the "NomeProfilo" attribute
         */
        void setNomeProfilo(java.lang.String nomeProfilo);
        
        /**
         * Sets (as xml) the "NomeProfilo" attribute
         */
        void xsetNomeProfilo(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo nomeProfilo);
        
        /**
         * Gets the "ProfiloOfferta" attribute
         */
        java.lang.String getProfiloOfferta();
        
        /**
         * Gets (as xml) the "ProfiloOfferta" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta xgetProfiloOfferta();
        
        /**
         * Sets the "ProfiloOfferta" attribute
         */
        void setProfiloOfferta(java.lang.String profiloOfferta);
        
        /**
         * Sets (as xml) the "ProfiloOfferta" attribute
         */
        void xsetProfiloOfferta(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta profiloOfferta);
        
        /**
         * Gets the "NomeServizio" attribute
         */
        java.lang.String getNomeServizio();
        
        /**
         * Gets (as xml) the "NomeServizio" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio xgetNomeServizio();
        
        /**
         * Sets the "NomeServizio" attribute
         */
        void setNomeServizio(java.lang.String nomeServizio);
        
        /**
         * Sets (as xml) the "NomeServizio" attribute
         */
        void xsetNomeServizio(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio nomeServizio);
        
        /**
         * Gets the "Categoria" attribute
         */
        java.lang.String getCategoria();
        
        /**
         * Gets (as xml) the "Categoria" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria xgetCategoria();
        
        /**
         * Sets the "Categoria" attribute
         */
        void setCategoria(java.lang.String categoria);
        
        /**
         * Sets (as xml) the "Categoria" attribute
         */
        void xsetCategoria(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria categoria);
        
        /**
         * Gets the "CodiceServizio" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio.Enum getCodiceServizio();
        
        /**
         * Gets (as xml) the "CodiceServizio" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio xgetCodiceServizio();
        
        /**
         * Sets the "CodiceServizio" attribute
         */
        void setCodiceServizio(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio.Enum codiceServizio);
        
        /**
         * Sets (as xml) the "CodiceServizio" attribute
         */
        void xsetCodiceServizio(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio codiceServizio);
        
        /**
         * Gets the "FinestraTemporaleErogazione" attribute
         */
        java.lang.String getFinestraTemporaleErogazione();
        
        /**
         * Gets (as xml) the "FinestraTemporaleErogazione" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione xgetFinestraTemporaleErogazione();
        
        /**
         * Sets the "FinestraTemporaleErogazione" attribute
         */
        void setFinestraTemporaleErogazione(java.lang.String finestraTemporaleErogazione);
        
        /**
         * Sets (as xml) the "FinestraTemporaleErogazione" attribute
         */
        void xsetFinestraTemporaleErogazione(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione finestraTemporaleErogazione);
        
        /**
         * Gets the "TempoRipristino" attribute
         */
        java.lang.String getTempoRipristino();
        
        /**
         * Gets (as xml) the "TempoRipristino" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino xgetTempoRipristino();
        
        /**
         * Sets the "TempoRipristino" attribute
         */
        void setTempoRipristino(java.lang.String tempoRipristino);
        
        /**
         * Sets (as xml) the "TempoRipristino" attribute
         */
        void xsetTempoRipristino(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino tempoRipristino);
        
        /**
         * Gets the "TempoRipristino1" attribute
         */
        java.lang.String getTempoRipristino1();
        
        /**
         * Gets (as xml) the "TempoRipristino1" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 xgetTempoRipristino1();
        
        /**
         * Sets the "TempoRipristino1" attribute
         */
        void setTempoRipristino1(java.lang.String tempoRipristino1);
        
        /**
         * Sets (as xml) the "TempoRipristino1" attribute
         */
        void xsetTempoRipristino1(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 tempoRipristino1);
        
        /**
         * Gets the "CardinalitaListaGiorni" attribute
         */
        java.math.BigInteger getCardinalitaListaGiorni();
        
        /**
         * Gets (as xml) the "CardinalitaListaGiorni" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetCardinalitaListaGiorni();
        
        /**
         * Sets the "CardinalitaListaGiorni" attribute
         */
        void setCardinalitaListaGiorni(java.math.BigInteger cardinalitaListaGiorni);
        
        /**
         * Sets (as xml) the "CardinalitaListaGiorni" attribute
         */
        void xsetCardinalitaListaGiorni(org.apache.xmlbeans.XmlInteger cardinalitaListaGiorni);
        
        /**
         * Gets the "IdLotto" attribute
         */
        java.lang.String getIdLotto();
        
        /**
         * Gets (as xml) the "IdLotto" attribute
         */
        it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto xgetIdLotto();
        
        /**
         * True if has "IdLotto" attribute
         */
        boolean isSetIdLotto();
        
        /**
         * Sets the "IdLotto" attribute
         */
        void setIdLotto(java.lang.String idLotto);
        
        /**
         * Sets (as xml) the "IdLotto" attribute
         */
        void xsetIdLotto(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto idLotto);
        
        /**
         * Unsets the "IdLotto" attribute
         */
        void unsetIdLotto();
        
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
         * An XML ListaGiorni(@).
         *
         * This is a complex type.
         */
        public interface ListaGiorni extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListaGiorni.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("listagiorni6b73elemtype");
            
            /**
             * Gets the "Giorno" attribute
             */
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno.Enum getGiorno();
            
            /**
             * Gets (as xml) the "Giorno" attribute
             */
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno xgetGiorno();
            
            /**
             * Sets the "Giorno" attribute
             */
            void setGiorno(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno.Enum giorno);
            
            /**
             * Sets (as xml) the "Giorno" attribute
             */
            void xsetGiorno(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno giorno);
            
            /**
             * Gets the "InizioAccoglienza" attribute
             */
            java.lang.String getInizioAccoglienza();
            
            /**
             * Gets (as xml) the "InizioAccoglienza" attribute
             */
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza xgetInizioAccoglienza();
            
            /**
             * Sets the "InizioAccoglienza" attribute
             */
            void setInizioAccoglienza(java.lang.String inizioAccoglienza);
            
            /**
             * Sets (as xml) the "InizioAccoglienza" attribute
             */
            void xsetInizioAccoglienza(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza inizioAccoglienza);
            
            /**
             * Gets the "FineAccoglienza" attribute
             */
            java.lang.String getFineAccoglienza();
            
            /**
             * Gets (as xml) the "FineAccoglienza" attribute
             */
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza xgetFineAccoglienza();
            
            /**
             * Sets the "FineAccoglienza" attribute
             */
            void setFineAccoglienza(java.lang.String fineAccoglienza);
            
            /**
             * Sets (as xml) the "FineAccoglienza" attribute
             */
            void xsetFineAccoglienza(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza fineAccoglienza);
            
            /**
             * Gets the "InizioLavorazione" attribute
             */
            java.lang.String getInizioLavorazione();
            
            /**
             * Gets (as xml) the "InizioLavorazione" attribute
             */
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione xgetInizioLavorazione();
            
            /**
             * Sets the "InizioLavorazione" attribute
             */
            void setInizioLavorazione(java.lang.String inizioLavorazione);
            
            /**
             * Sets (as xml) the "InizioLavorazione" attribute
             */
            void xsetInizioLavorazione(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione inizioLavorazione);
            
            /**
             * Gets the "FineLavorazione" attribute
             */
            java.lang.String getFineLavorazione();
            
            /**
             * Gets (as xml) the "FineLavorazione" attribute
             */
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione xgetFineLavorazione();
            
            /**
             * Sets the "FineLavorazione" attribute
             */
            void setFineLavorazione(java.lang.String fineLavorazione);
            
            /**
             * Sets (as xml) the "FineLavorazione" attribute
             */
            void xsetFineLavorazione(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione fineLavorazione);
            
            /**
             * An XML Giorno(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$Giorno.
             */
            public interface Giorno extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Giorno.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("giornobcf9attrtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum LUN = Enum.forString("LUN");
                static final Enum MAR = Enum.forString("MAR");
                static final Enum MER = Enum.forString("MER");
                static final Enum GIO = Enum.forString("GIO");
                static final Enum VEN = Enum.forString("VEN");
                static final Enum SAB = Enum.forString("SAB");
                static final Enum DOM = Enum.forString("DOM");
                
                static final int INT_LUN = Enum.INT_LUN;
                static final int INT_MAR = Enum.INT_MAR;
                static final int INT_MER = Enum.INT_MER;
                static final int INT_GIO = Enum.INT_GIO;
                static final int INT_VEN = Enum.INT_VEN;
                static final int INT_SAB = Enum.INT_SAB;
                static final int INT_DOM = Enum.INT_DOM;
                
                /**
                 * Enumeration value class for it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$Giorno.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_LUN
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
                    
                    static final int INT_LUN = 1;
                    static final int INT_MAR = 2;
                    static final int INT_MER = 3;
                    static final int INT_GIO = 4;
                    static final int INT_VEN = 5;
                    static final int INT_SAB = 6;
                    static final int INT_DOM = 7;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("LUN", INT_LUN),
                        new Enum("MAR", INT_MAR),
                        new Enum("MER", INT_MER),
                        new Enum("GIO", INT_GIO),
                        new Enum("VEN", INT_VEN),
                        new Enum("SAB", INT_SAB),
                        new Enum("DOM", INT_DOM),
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
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno newValue(java.lang.Object obj) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno) type.newValue( obj ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno newInstance() {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML InizioAccoglienza(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$InizioAccoglienza.
             */
            public interface InizioAccoglienza extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InizioAccoglienza.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("inizioaccoglienzaeac5attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza newValue(java.lang.Object obj) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza) type.newValue( obj ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza newInstance() {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML FineAccoglienza(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$FineAccoglienza.
             */
            public interface FineAccoglienza extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FineAccoglienza.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("fineaccoglienza4287attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza newValue(java.lang.Object obj) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza) type.newValue( obj ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza newInstance() {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML InizioLavorazione(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$InizioLavorazione.
             */
            public interface InizioLavorazione extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InizioLavorazione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("iniziolavorazionea539attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione newValue(java.lang.Object obj) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione) type.newValue( obj ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione newInstance() {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML FineLavorazione(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$FineLavorazione.
             */
            public interface FineLavorazione extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FineLavorazione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("finelavorazionefcfbattrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione newValue(java.lang.Object obj) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione) type.newValue( obj ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione newInstance() {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML NomeProfilo(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$NomeProfilo.
         */
        public interface NomeProfilo extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NomeProfilo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("nomeprofilo1696attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ProfiloOfferta(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ProfiloOfferta.
         */
        public interface ProfiloOfferta extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProfiloOfferta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("profiloofferta1bcaattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML NomeServizio(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$NomeServizio.
         */
        public interface NomeServizio extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NomeServizio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("nomeservizio6b9aattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Categoria(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$Categoria.
         */
        public interface Categoria extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Categoria.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("categoria936fattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML CodiceServizio(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$CodiceServizio.
         */
        public interface CodiceServizio extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodiceServizio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("codiceservizio1b94attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum X = Enum.forString("-");
            static final Enum X_26 = Enum.forString("26");
            static final Enum X_37 = Enum.forString("37");
            static final Enum X_38 = Enum.forString("38");
            
            static final int INT_X = Enum.INT_X;
            static final int INT_X_26 = Enum.INT_X_26;
            static final int INT_X_37 = Enum.INT_X_37;
            static final int INT_X_38 = Enum.INT_X_38;
            
            /**
             * Enumeration value class for it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$CodiceServizio.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_X
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
                
                static final int INT_X = 1;
                static final int INT_X_26 = 2;
                static final int INT_X_37 = 3;
                static final int INT_X_38 = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("-", INT_X),
                      new Enum("26", INT_X_26),
                      new Enum("37", INT_X_37),
                      new Enum("38", INT_X_38),
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
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML FinestraTemporaleErogazione(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$FinestraTemporaleErogazione.
         */
        public interface FinestraTemporaleErogazione extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinestraTemporaleErogazione.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("finestratemporaleerogazione8550attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TempoRipristino(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$TempoRipristino.
         */
        public interface TempoRipristino extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TempoRipristino.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("temporipristinoca90attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML TempoRipristino1(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$TempoRipristino1.
         */
        public interface TempoRipristino1 extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TempoRipristino1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("temporipristino13391attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML IdLotto(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$IdLotto.
         */
        public interface IdLotto extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdLotto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD8AFAE8D99A5C4FA0CAE6DF34A1B997").resolveHandle("idlotto026dattrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto newValue(java.lang.Object obj) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto) type.newValue( obj ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto newInstance() {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA newInstance() {
              return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType newInstance() {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
