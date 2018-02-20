/*
 * XML Type:  ListaServiziSLA_Out_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML ListaServiziSLA_Out_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class ListaServiziSLAOutTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType
{
    private static final long serialVersionUID = 1L;
    
    public ListaServiziSLAOutTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTASLA$0 = 
        new javax.xml.namespace.QName("", "ListaSLA");
    private static final javax.xml.namespace.QName CARDINALITALISTASLA$2 = 
        new javax.xml.namespace.QName("", "CardinalitaListaSLA");
    private static final javax.xml.namespace.QName IDCLIENTE$4 = 
        new javax.xml.namespace.QName("", "IdCliente");
    private static final javax.xml.namespace.QName PAGINA$6 = 
        new javax.xml.namespace.QName("", "Pagina");
    private static final javax.xml.namespace.QName REQUESTID$8 = 
        new javax.xml.namespace.QName("", "RequestID");
    
    
    /**
     * Gets array of all "ListaSLA" elements
     */
    public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA[] getListaSLAArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LISTASLA$0, targetList);
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA[] result = new it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ListaSLA" element
     */
    public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA getListaSLAArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA)get_store().find_element_user(LISTASLA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ListaSLA" element
     */
    public int sizeOfListaSLAArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTASLA$0);
        }
    }
    
    /**
     * Sets array of all "ListaSLA" element
     */
    public void setListaSLAArray(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA[] listaSLAArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listaSLAArray, LISTASLA$0);
        }
    }
    
    /**
     * Sets ith "ListaSLA" element
     */
    public void setListaSLAArray(int i, it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA listaSLA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA)get_store().find_element_user(LISTASLA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listaSLA);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ListaSLA" element
     */
    public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA insertNewListaSLA(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA)get_store().insert_element_user(LISTASLA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ListaSLA" element
     */
    public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA addNewListaSLA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA target = null;
            target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA)get_store().add_element_user(LISTASLA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ListaSLA" element
     */
    public void removeListaSLA(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTASLA$0, i);
        }
    }
    
    /**
     * Gets the "CardinalitaListaSLA" attribute
     */
    public java.math.BigInteger getCardinalitaListaSLA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITALISTASLA$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "CardinalitaListaSLA" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCardinalitaListaSLA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITALISTASLA$2);
            return target;
        }
    }
    
    /**
     * Sets the "CardinalitaListaSLA" attribute
     */
    public void setCardinalitaListaSLA(java.math.BigInteger cardinalitaListaSLA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITALISTASLA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDINALITALISTASLA$2);
            }
            target.setBigIntegerValue(cardinalitaListaSLA);
        }
    }
    
    /**
     * Sets (as xml) the "CardinalitaListaSLA" attribute
     */
    public void xsetCardinalitaListaSLA(org.apache.xmlbeans.XmlInteger cardinalitaListaSLA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITALISTASLA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CARDINALITALISTASLA$2);
            }
            target.set(cardinalitaListaSLA);
        }
    }
    
    /**
     * Gets the "IdCliente" attribute
     */
    public java.math.BigInteger getIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdCliente" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$4);
            return target;
        }
    }
    
    /**
     * True if has "IdCliente" attribute
     */
    public boolean isSetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDCLIENTE$4) != null;
        }
    }
    
    /**
     * Sets the "IdCliente" attribute
     */
    public void setIdCliente(java.math.BigInteger idCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCLIENTE$4);
            }
            target.setBigIntegerValue(idCliente);
        }
    }
    
    /**
     * Sets (as xml) the "IdCliente" attribute
     */
    public void xsetIdCliente(org.apache.xmlbeans.XmlInteger idCliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDCLIENTE$4);
            }
            target.set(idCliente);
        }
    }
    
    /**
     * Unsets the "IdCliente" attribute
     */
    public void unsetIdCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDCLIENTE$4);
        }
    }
    
    /**
     * Gets the "Pagina" attribute
     */
    public java.math.BigInteger getPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINA$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Pagina" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetPagina()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGINA$6);
            return target;
        }
    }
    
    /**
     * Sets the "Pagina" attribute
     */
    public void setPagina(java.math.BigInteger pagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINA$6);
            }
            target.setBigIntegerValue(pagina);
        }
    }
    
    /**
     * Sets (as xml) the "Pagina" attribute
     */
    public void xsetPagina(org.apache.xmlbeans.XmlInteger pagina)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGINA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PAGINA$6);
            }
            target.set(pagina);
        }
    }
    
    /**
     * Gets the "RequestID" attribute
     */
    public java.math.BigInteger getRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestID" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$8);
            return target;
        }
    }
    
    /**
     * Sets the "RequestID" attribute
     */
    public void setRequestID(java.math.BigInteger requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTID$8);
            }
            target.setBigIntegerValue(requestID);
        }
    }
    
    /**
     * Sets (as xml) the "RequestID" attribute
     */
    public void xsetRequestID(org.apache.xmlbeans.XmlInteger requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTID$8);
            }
            target.set(requestID);
        }
    }
    /**
     * An XML ListaSLA(@).
     *
     * This is a complex type.
     */
    public static class ListaSLAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA
    {
        private static final long serialVersionUID = 1L;
        
        public ListaSLAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTAGIORNI$0 = 
            new javax.xml.namespace.QName("", "ListaGiorni");
        private static final javax.xml.namespace.QName IDSERVIZIO$2 = 
            new javax.xml.namespace.QName("", "IdServizio");
        private static final javax.xml.namespace.QName NOMEPROFILO$4 = 
            new javax.xml.namespace.QName("", "NomeProfilo");
        private static final javax.xml.namespace.QName PROFILOOFFERTA$6 = 
            new javax.xml.namespace.QName("", "ProfiloOfferta");
        private static final javax.xml.namespace.QName NOMESERVIZIO$8 = 
            new javax.xml.namespace.QName("", "NomeServizio");
        private static final javax.xml.namespace.QName CATEGORIA$10 = 
            new javax.xml.namespace.QName("", "Categoria");
        private static final javax.xml.namespace.QName CODICESERVIZIO$12 = 
            new javax.xml.namespace.QName("", "CodiceServizio");
        private static final javax.xml.namespace.QName FINESTRATEMPORALEEROGAZIONE$14 = 
            new javax.xml.namespace.QName("", "FinestraTemporaleErogazione");
        private static final javax.xml.namespace.QName TEMPORIPRISTINO$16 = 
            new javax.xml.namespace.QName("", "TempoRipristino");
        private static final javax.xml.namespace.QName TEMPORIPRISTINO1$18 = 
            new javax.xml.namespace.QName("", "TempoRipristino1");
        private static final javax.xml.namespace.QName CARDINALITALISTAGIORNI$20 = 
            new javax.xml.namespace.QName("", "CardinalitaListaGiorni");
        private static final javax.xml.namespace.QName IDLOTTO$22 = 
            new javax.xml.namespace.QName("", "IdLotto");
        private static final javax.xml.namespace.QName IDCLIENTE$24 = 
            new javax.xml.namespace.QName("", "IdCliente");
        
        
        /**
         * Gets array of all "ListaGiorni" elements
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni[] getListaGiorniArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LISTAGIORNI$0, targetList);
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni[] result = new it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ListaGiorni" element
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni getListaGiorniArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni)get_store().find_element_user(LISTAGIORNI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ListaGiorni" element
         */
        public int sizeOfListaGiorniArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTAGIORNI$0);
            }
        }
        
        /**
         * Sets array of all "ListaGiorni" element
         */
        public void setListaGiorniArray(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni[] listaGiorniArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(listaGiorniArray, LISTAGIORNI$0);
            }
        }
        
        /**
         * Sets ith "ListaGiorni" element
         */
        public void setListaGiorniArray(int i, it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni listaGiorni)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni)get_store().find_element_user(LISTAGIORNI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(listaGiorni);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ListaGiorni" element
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni insertNewListaGiorni(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni)get_store().insert_element_user(LISTAGIORNI$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ListaGiorni" element
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni addNewListaGiorni()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni)get_store().add_element_user(LISTAGIORNI$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ListaGiorni" element
         */
        public void removeListaGiorni(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTAGIORNI$0, i);
            }
        }
        
        /**
         * Gets the "IdServizio" attribute
         */
        public java.math.BigInteger getIdServizio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSERVIZIO$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "IdServizio" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetIdServizio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDSERVIZIO$2);
                return target;
            }
        }
        
        /**
         * Sets the "IdServizio" attribute
         */
        public void setIdServizio(java.math.BigInteger idServizio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSERVIZIO$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDSERVIZIO$2);
                }
                target.setBigIntegerValue(idServizio);
            }
        }
        
        /**
         * Sets (as xml) the "IdServizio" attribute
         */
        public void xsetIdServizio(org.apache.xmlbeans.XmlInteger idServizio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDSERVIZIO$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDSERVIZIO$2);
                }
                target.set(idServizio);
            }
        }
        
        /**
         * Gets the "NomeProfilo" attribute
         */
        public java.lang.String getNomeProfilo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMEPROFILO$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NomeProfilo" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo xgetNomeProfilo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo)get_store().find_attribute_user(NOMEPROFILO$4);
                return target;
            }
        }
        
        /**
         * Sets the "NomeProfilo" attribute
         */
        public void setNomeProfilo(java.lang.String nomeProfilo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMEPROFILO$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOMEPROFILO$4);
                }
                target.setStringValue(nomeProfilo);
            }
        }
        
        /**
         * Sets (as xml) the "NomeProfilo" attribute
         */
        public void xsetNomeProfilo(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo nomeProfilo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo)get_store().find_attribute_user(NOMEPROFILO$4);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo)get_store().add_attribute_user(NOMEPROFILO$4);
                }
                target.set(nomeProfilo);
            }
        }
        
        /**
         * Gets the "ProfiloOfferta" attribute
         */
        public java.lang.String getProfiloOfferta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILOOFFERTA$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProfiloOfferta" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta xgetProfiloOfferta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta)get_store().find_attribute_user(PROFILOOFFERTA$6);
                return target;
            }
        }
        
        /**
         * Sets the "ProfiloOfferta" attribute
         */
        public void setProfiloOfferta(java.lang.String profiloOfferta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILOOFFERTA$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROFILOOFFERTA$6);
                }
                target.setStringValue(profiloOfferta);
            }
        }
        
        /**
         * Sets (as xml) the "ProfiloOfferta" attribute
         */
        public void xsetProfiloOfferta(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta profiloOfferta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta)get_store().find_attribute_user(PROFILOOFFERTA$6);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta)get_store().add_attribute_user(PROFILOOFFERTA$6);
                }
                target.set(profiloOfferta);
            }
        }
        
        /**
         * Gets the "NomeServizio" attribute
         */
        public java.lang.String getNomeServizio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMESERVIZIO$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NomeServizio" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio xgetNomeServizio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio)get_store().find_attribute_user(NOMESERVIZIO$8);
                return target;
            }
        }
        
        /**
         * Sets the "NomeServizio" attribute
         */
        public void setNomeServizio(java.lang.String nomeServizio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOMESERVIZIO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOMESERVIZIO$8);
                }
                target.setStringValue(nomeServizio);
            }
        }
        
        /**
         * Sets (as xml) the "NomeServizio" attribute
         */
        public void xsetNomeServizio(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio nomeServizio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio)get_store().find_attribute_user(NOMESERVIZIO$8);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio)get_store().add_attribute_user(NOMESERVIZIO$8);
                }
                target.set(nomeServizio);
            }
        }
        
        /**
         * Gets the "Categoria" attribute
         */
        public java.lang.String getCategoria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORIA$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Categoria" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria xgetCategoria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria)get_store().find_attribute_user(CATEGORIA$10);
                return target;
            }
        }
        
        /**
         * Sets the "Categoria" attribute
         */
        public void setCategoria(java.lang.String categoria)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORIA$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORIA$10);
                }
                target.setStringValue(categoria);
            }
        }
        
        /**
         * Sets (as xml) the "Categoria" attribute
         */
        public void xsetCategoria(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria categoria)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria)get_store().find_attribute_user(CATEGORIA$10);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria)get_store().add_attribute_user(CATEGORIA$10);
                }
                target.set(categoria);
            }
        }
        
        /**
         * Gets the "CodiceServizio" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio.Enum getCodiceServizio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODICESERVIZIO$12);
                if (target == null)
                {
                    return null;
                }
                return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodiceServizio" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio xgetCodiceServizio()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio)get_store().find_attribute_user(CODICESERVIZIO$12);
                return target;
            }
        }
        
        /**
         * Sets the "CodiceServizio" attribute
         */
        public void setCodiceServizio(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio.Enum codiceServizio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODICESERVIZIO$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODICESERVIZIO$12);
                }
                target.setEnumValue(codiceServizio);
            }
        }
        
        /**
         * Sets (as xml) the "CodiceServizio" attribute
         */
        public void xsetCodiceServizio(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio codiceServizio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio)get_store().find_attribute_user(CODICESERVIZIO$12);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio)get_store().add_attribute_user(CODICESERVIZIO$12);
                }
                target.set(codiceServizio);
            }
        }
        
        /**
         * Gets the "FinestraTemporaleErogazione" attribute
         */
        public java.lang.String getFinestraTemporaleErogazione()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINESTRATEMPORALEEROGAZIONE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FinestraTemporaleErogazione" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione xgetFinestraTemporaleErogazione()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione)get_store().find_attribute_user(FINESTRATEMPORALEEROGAZIONE$14);
                return target;
            }
        }
        
        /**
         * Sets the "FinestraTemporaleErogazione" attribute
         */
        public void setFinestraTemporaleErogazione(java.lang.String finestraTemporaleErogazione)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINESTRATEMPORALEEROGAZIONE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINESTRATEMPORALEEROGAZIONE$14);
                }
                target.setStringValue(finestraTemporaleErogazione);
            }
        }
        
        /**
         * Sets (as xml) the "FinestraTemporaleErogazione" attribute
         */
        public void xsetFinestraTemporaleErogazione(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione finestraTemporaleErogazione)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione)get_store().find_attribute_user(FINESTRATEMPORALEEROGAZIONE$14);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione)get_store().add_attribute_user(FINESTRATEMPORALEEROGAZIONE$14);
                }
                target.set(finestraTemporaleErogazione);
            }
        }
        
        /**
         * Gets the "TempoRipristino" attribute
         */
        public java.lang.String getTempoRipristino()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORIPRISTINO$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TempoRipristino" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino xgetTempoRipristino()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino)get_store().find_attribute_user(TEMPORIPRISTINO$16);
                return target;
            }
        }
        
        /**
         * Sets the "TempoRipristino" attribute
         */
        public void setTempoRipristino(java.lang.String tempoRipristino)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORIPRISTINO$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEMPORIPRISTINO$16);
                }
                target.setStringValue(tempoRipristino);
            }
        }
        
        /**
         * Sets (as xml) the "TempoRipristino" attribute
         */
        public void xsetTempoRipristino(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino tempoRipristino)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino)get_store().find_attribute_user(TEMPORIPRISTINO$16);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino)get_store().add_attribute_user(TEMPORIPRISTINO$16);
                }
                target.set(tempoRipristino);
            }
        }
        
        /**
         * Gets the "TempoRipristino1" attribute
         */
        public java.lang.String getTempoRipristino1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORIPRISTINO1$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TempoRipristino1" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 xgetTempoRipristino1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1)get_store().find_attribute_user(TEMPORIPRISTINO1$18);
                return target;
            }
        }
        
        /**
         * Sets the "TempoRipristino1" attribute
         */
        public void setTempoRipristino1(java.lang.String tempoRipristino1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORIPRISTINO1$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEMPORIPRISTINO1$18);
                }
                target.setStringValue(tempoRipristino1);
            }
        }
        
        /**
         * Sets (as xml) the "TempoRipristino1" attribute
         */
        public void xsetTempoRipristino1(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 tempoRipristino1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1 target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1)get_store().find_attribute_user(TEMPORIPRISTINO1$18);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1)get_store().add_attribute_user(TEMPORIPRISTINO1$18);
                }
                target.set(tempoRipristino1);
            }
        }
        
        /**
         * Gets the "CardinalitaListaGiorni" attribute
         */
        public java.math.BigInteger getCardinalitaListaGiorni()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITALISTAGIORNI$20);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "CardinalitaListaGiorni" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCardinalitaListaGiorni()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITALISTAGIORNI$20);
                return target;
            }
        }
        
        /**
         * Sets the "CardinalitaListaGiorni" attribute
         */
        public void setCardinalitaListaGiorni(java.math.BigInteger cardinalitaListaGiorni)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITALISTAGIORNI$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDINALITALISTAGIORNI$20);
                }
                target.setBigIntegerValue(cardinalitaListaGiorni);
            }
        }
        
        /**
         * Sets (as xml) the "CardinalitaListaGiorni" attribute
         */
        public void xsetCardinalitaListaGiorni(org.apache.xmlbeans.XmlInteger cardinalitaListaGiorni)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITALISTAGIORNI$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CARDINALITALISTAGIORNI$20);
                }
                target.set(cardinalitaListaGiorni);
            }
        }
        
        /**
         * Gets the "IdLotto" attribute
         */
        public java.lang.String getIdLotto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLOTTO$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IdLotto" attribute
         */
        public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto xgetIdLotto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto)get_store().find_attribute_user(IDLOTTO$22);
                return target;
            }
        }
        
        /**
         * True if has "IdLotto" attribute
         */
        public boolean isSetIdLotto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDLOTTO$22) != null;
            }
        }
        
        /**
         * Sets the "IdLotto" attribute
         */
        public void setIdLotto(java.lang.String idLotto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLOTTO$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDLOTTO$22);
                }
                target.setStringValue(idLotto);
            }
        }
        
        /**
         * Sets (as xml) the "IdLotto" attribute
         */
        public void xsetIdLotto(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto idLotto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto target = null;
                target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto)get_store().find_attribute_user(IDLOTTO$22);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto)get_store().add_attribute_user(IDLOTTO$22);
                }
                target.set(idLotto);
            }
        }
        
        /**
         * Unsets the "IdLotto" attribute
         */
        public void unsetIdLotto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDLOTTO$22);
            }
        }
        
        /**
         * Gets the "IdCliente" attribute
         */
        public java.math.BigInteger getIdCliente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$24);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "IdCliente" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetIdCliente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$24);
                return target;
            }
        }
        
        /**
         * True if has "IdCliente" attribute
         */
        public boolean isSetIdCliente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDCLIENTE$24) != null;
            }
        }
        
        /**
         * Sets the "IdCliente" attribute
         */
        public void setIdCliente(java.math.BigInteger idCliente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCLIENTE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCLIENTE$24);
                }
                target.setBigIntegerValue(idCliente);
            }
        }
        
        /**
         * Sets (as xml) the "IdCliente" attribute
         */
        public void xsetIdCliente(org.apache.xmlbeans.XmlInteger idCliente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDCLIENTE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDCLIENTE$24);
                }
                target.set(idCliente);
            }
        }
        
        /**
         * Unsets the "IdCliente" attribute
         */
        public void unsetIdCliente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDCLIENTE$24);
            }
        }
        /**
         * An XML ListaGiorni(@).
         *
         * This is a complex type.
         */
        public static class ListaGiorniImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni
        {
            private static final long serialVersionUID = 1L;
            
            public ListaGiorniImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GIORNO$0 = 
                new javax.xml.namespace.QName("", "Giorno");
            private static final javax.xml.namespace.QName INIZIOACCOGLIENZA$2 = 
                new javax.xml.namespace.QName("", "InizioAccoglienza");
            private static final javax.xml.namespace.QName FINEACCOGLIENZA$4 = 
                new javax.xml.namespace.QName("", "FineAccoglienza");
            private static final javax.xml.namespace.QName INIZIOLAVORAZIONE$6 = 
                new javax.xml.namespace.QName("", "InizioLavorazione");
            private static final javax.xml.namespace.QName FINELAVORAZIONE$8 = 
                new javax.xml.namespace.QName("", "FineLavorazione");
            
            
            /**
             * Gets the "Giorno" attribute
             */
            public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno.Enum getGiorno()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GIORNO$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Giorno" attribute
             */
            public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno xgetGiorno()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno)get_store().find_attribute_user(GIORNO$0);
                    return target;
                }
            }
            
            /**
             * Sets the "Giorno" attribute
             */
            public void setGiorno(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno.Enum giorno)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GIORNO$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GIORNO$0);
                    }
                    target.setEnumValue(giorno);
                }
            }
            
            /**
             * Sets (as xml) the "Giorno" attribute
             */
            public void xsetGiorno(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno giorno)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno)get_store().find_attribute_user(GIORNO$0);
                    if (target == null)
                    {
                      target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno)get_store().add_attribute_user(GIORNO$0);
                    }
                    target.set(giorno);
                }
            }
            
            /**
             * Gets the "InizioAccoglienza" attribute
             */
            public java.lang.String getInizioAccoglienza()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INIZIOACCOGLIENZA$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "InizioAccoglienza" attribute
             */
            public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza xgetInizioAccoglienza()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza)get_store().find_attribute_user(INIZIOACCOGLIENZA$2);
                    return target;
                }
            }
            
            /**
             * Sets the "InizioAccoglienza" attribute
             */
            public void setInizioAccoglienza(java.lang.String inizioAccoglienza)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INIZIOACCOGLIENZA$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INIZIOACCOGLIENZA$2);
                    }
                    target.setStringValue(inizioAccoglienza);
                }
            }
            
            /**
             * Sets (as xml) the "InizioAccoglienza" attribute
             */
            public void xsetInizioAccoglienza(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza inizioAccoglienza)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza)get_store().find_attribute_user(INIZIOACCOGLIENZA$2);
                    if (target == null)
                    {
                      target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza)get_store().add_attribute_user(INIZIOACCOGLIENZA$2);
                    }
                    target.set(inizioAccoglienza);
                }
            }
            
            /**
             * Gets the "FineAccoglienza" attribute
             */
            public java.lang.String getFineAccoglienza()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINEACCOGLIENZA$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "FineAccoglienza" attribute
             */
            public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza xgetFineAccoglienza()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza)get_store().find_attribute_user(FINEACCOGLIENZA$4);
                    return target;
                }
            }
            
            /**
             * Sets the "FineAccoglienza" attribute
             */
            public void setFineAccoglienza(java.lang.String fineAccoglienza)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINEACCOGLIENZA$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINEACCOGLIENZA$4);
                    }
                    target.setStringValue(fineAccoglienza);
                }
            }
            
            /**
             * Sets (as xml) the "FineAccoglienza" attribute
             */
            public void xsetFineAccoglienza(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza fineAccoglienza)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza)get_store().find_attribute_user(FINEACCOGLIENZA$4);
                    if (target == null)
                    {
                      target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza)get_store().add_attribute_user(FINEACCOGLIENZA$4);
                    }
                    target.set(fineAccoglienza);
                }
            }
            
            /**
             * Gets the "InizioLavorazione" attribute
             */
            public java.lang.String getInizioLavorazione()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INIZIOLAVORAZIONE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "InizioLavorazione" attribute
             */
            public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione xgetInizioLavorazione()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione)get_store().find_attribute_user(INIZIOLAVORAZIONE$6);
                    return target;
                }
            }
            
            /**
             * Sets the "InizioLavorazione" attribute
             */
            public void setInizioLavorazione(java.lang.String inizioLavorazione)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INIZIOLAVORAZIONE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INIZIOLAVORAZIONE$6);
                    }
                    target.setStringValue(inizioLavorazione);
                }
            }
            
            /**
             * Sets (as xml) the "InizioLavorazione" attribute
             */
            public void xsetInizioLavorazione(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione inizioLavorazione)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione)get_store().find_attribute_user(INIZIOLAVORAZIONE$6);
                    if (target == null)
                    {
                      target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione)get_store().add_attribute_user(INIZIOLAVORAZIONE$6);
                    }
                    target.set(inizioLavorazione);
                }
            }
            
            /**
             * Gets the "FineLavorazione" attribute
             */
            public java.lang.String getFineLavorazione()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINELAVORAZIONE$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "FineLavorazione" attribute
             */
            public it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione xgetFineLavorazione()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione)get_store().find_attribute_user(FINELAVORAZIONE$8);
                    return target;
                }
            }
            
            /**
             * Sets the "FineLavorazione" attribute
             */
            public void setFineLavorazione(java.lang.String fineLavorazione)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINELAVORAZIONE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINELAVORAZIONE$8);
                    }
                    target.setStringValue(fineLavorazione);
                }
            }
            
            /**
             * Sets (as xml) the "FineLavorazione" attribute
             */
            public void xsetFineLavorazione(it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione fineLavorazione)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione target = null;
                    target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione)get_store().find_attribute_user(FINELAVORAZIONE$8);
                    if (target == null)
                    {
                      target = (it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione)get_store().add_attribute_user(FINELAVORAZIONE$8);
                    }
                    target.set(fineLavorazione);
                }
            }
            /**
             * An XML Giorno(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$Giorno.
             */
            public static class GiornoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.Giorno
            {
                private static final long serialVersionUID = 1L;
                
                public GiornoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected GiornoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML InizioAccoglienza(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$InizioAccoglienza.
             */
            public static class InizioAccoglienzaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioAccoglienza
            {
                private static final long serialVersionUID = 1L;
                
                public InizioAccoglienzaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected InizioAccoglienzaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML FineAccoglienza(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$FineAccoglienza.
             */
            public static class FineAccoglienzaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineAccoglienza
            {
                private static final long serialVersionUID = 1L;
                
                public FineAccoglienzaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected FineAccoglienzaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML InizioLavorazione(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$InizioLavorazione.
             */
            public static class InizioLavorazioneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.InizioLavorazione
            {
                private static final long serialVersionUID = 1L;
                
                public InizioLavorazioneImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected InizioLavorazioneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML FineLavorazione(@).
             *
             * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ListaGiorni$FineLavorazione.
             */
            public static class FineLavorazioneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ListaGiorni.FineLavorazione
            {
                private static final long serialVersionUID = 1L;
                
                public FineLavorazioneImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected FineLavorazioneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML NomeProfilo(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$NomeProfilo.
         */
        public static class NomeProfiloImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeProfilo
        {
            private static final long serialVersionUID = 1L;
            
            public NomeProfiloImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NomeProfiloImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ProfiloOfferta(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$ProfiloOfferta.
         */
        public static class ProfiloOffertaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.ProfiloOfferta
        {
            private static final long serialVersionUID = 1L;
            
            public ProfiloOffertaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ProfiloOffertaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML NomeServizio(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$NomeServizio.
         */
        public static class NomeServizioImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.NomeServizio
        {
            private static final long serialVersionUID = 1L;
            
            public NomeServizioImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NomeServizioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Categoria(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$Categoria.
         */
        public static class CategoriaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.Categoria
        {
            private static final long serialVersionUID = 1L;
            
            public CategoriaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CategoriaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML CodiceServizio(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$CodiceServizio.
         */
        public static class CodiceServizioImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.CodiceServizio
        {
            private static final long serialVersionUID = 1L;
            
            public CodiceServizioImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CodiceServizioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML FinestraTemporaleErogazione(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$FinestraTemporaleErogazione.
         */
        public static class FinestraTemporaleErogazioneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.FinestraTemporaleErogazione
        {
            private static final long serialVersionUID = 1L;
            
            public FinestraTemporaleErogazioneImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FinestraTemporaleErogazioneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML TempoRipristino(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$TempoRipristino.
         */
        public static class TempoRipristinoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino
        {
            private static final long serialVersionUID = 1L;
            
            public TempoRipristinoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TempoRipristinoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML TempoRipristino1(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$TempoRipristino1.
         */
        public static class TempoRipristino1Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.TempoRipristino1
        {
            private static final long serialVersionUID = 1L;
            
            public TempoRipristino1Impl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TempoRipristino1Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML IdLotto(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType$ListaSLA$IdLotto.
         */
        public static class IdLottoImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ListaServiziSLAOutType.ListaSLA.IdLotto
        {
            private static final long serialVersionUID = 1L;
            
            public IdLottoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IdLottoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
