/*
 * XML Type:  ElencoFornitori_Out_Type
 * Namespace: ettmp.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.ettmp.impl;
/**
 * An XML ElencoFornitori_Out_Type(@ettmp.webservice.telecomitalia.it).
 *
 * This is a complex type.
 */
public class ElencoFornitoriOutTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType
{
    private static final long serialVersionUID = 1L;
    
    public ElencoFornitoriOutTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIFORNITORE$0 = 
        new javax.xml.namespace.QName("", "DatiFornitore");
    private static final javax.xml.namespace.QName CARDINALITA$2 = 
        new javax.xml.namespace.QName("", "Cardinalita");
    
    
    /**
     * Gets array of all "DatiFornitore" elements
     */
    public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore[] getDatiFornitoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIFORNITORE$0, targetList);
            it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore[] result = new it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiFornitore" element
     */
    public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore getDatiFornitoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore target = null;
            target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore)get_store().find_element_user(DATIFORNITORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiFornitore" element
     */
    public int sizeOfDatiFornitoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIFORNITORE$0);
        }
    }
    
    /**
     * Sets array of all "DatiFornitore" element
     */
    public void setDatiFornitoreArray(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore[] datiFornitoreArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(datiFornitoreArray, DATIFORNITORE$0);
        }
    }
    
    /**
     * Sets ith "DatiFornitore" element
     */
    public void setDatiFornitoreArray(int i, it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore datiFornitore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore target = null;
            target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore)get_store().find_element_user(DATIFORNITORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(datiFornitore);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiFornitore" element
     */
    public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore insertNewDatiFornitore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore target = null;
            target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore)get_store().insert_element_user(DATIFORNITORE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiFornitore" element
     */
    public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore addNewDatiFornitore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore target = null;
            target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore)get_store().add_element_user(DATIFORNITORE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiFornitore" element
     */
    public void removeDatiFornitore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIFORNITORE$0, i);
        }
    }
    
    /**
     * Gets the "Cardinalita" attribute
     */
    public java.math.BigInteger getCardinalita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITA$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Cardinalita" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCardinalita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITA$2);
            return target;
        }
    }
    
    /**
     * Sets the "Cardinalita" attribute
     */
    public void setCardinalita(java.math.BigInteger cardinalita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARDINALITA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARDINALITA$2);
            }
            target.setBigIntegerValue(cardinalita);
        }
    }
    
    /**
     * Sets (as xml) the "Cardinalita" attribute
     */
    public void xsetCardinalita(org.apache.xmlbeans.XmlInteger cardinalita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CARDINALITA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CARDINALITA$2);
            }
            target.set(cardinalita);
        }
    }
    /**
     * An XML DatiFornitore(@).
     *
     * This is a complex type.
     */
    public static class DatiFornitoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore
    {
        private static final long serialVersionUID = 1L;
        
        public DatiFornitoreImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDFORNITORE$0 = 
            new javax.xml.namespace.QName("", "IdFornitore");
        private static final javax.xml.namespace.QName CODAFOR$2 = 
            new javax.xml.namespace.QName("", "CodAfor");
        private static final javax.xml.namespace.QName NOME$4 = 
            new javax.xml.namespace.QName("", "Nome");
        private static final javax.xml.namespace.QName TIPOLOGIA$6 = 
            new javax.xml.namespace.QName("", "Tipologia");
        private static final javax.xml.namespace.QName REFERENTE$8 = 
            new javax.xml.namespace.QName("", "Referente");
        
        
        /**
         * Gets the "IdFornitore" attribute
         */
        public java.math.BigInteger getIdFornitore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDFORNITORE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "IdFornitore" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetIdFornitore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDFORNITORE$0);
                return target;
            }
        }
        
        /**
         * Sets the "IdFornitore" attribute
         */
        public void setIdFornitore(java.math.BigInteger idFornitore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDFORNITORE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDFORNITORE$0);
                }
                target.setBigIntegerValue(idFornitore);
            }
        }
        
        /**
         * Sets (as xml) the "IdFornitore" attribute
         */
        public void xsetIdFornitore(org.apache.xmlbeans.XmlInteger idFornitore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(IDFORNITORE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(IDFORNITORE$0);
                }
                target.set(idFornitore);
            }
        }
        
        /**
         * Gets the "CodAfor" attribute
         */
        public java.lang.String getCodAfor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODAFOR$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CodAfor" attribute
         */
        public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor xgetCodAfor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor)get_store().find_attribute_user(CODAFOR$2);
                return target;
            }
        }
        
        /**
         * Sets the "CodAfor" attribute
         */
        public void setCodAfor(java.lang.String codAfor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODAFOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODAFOR$2);
                }
                target.setStringValue(codAfor);
            }
        }
        
        /**
         * Sets (as xml) the "CodAfor" attribute
         */
        public void xsetCodAfor(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor codAfor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor)get_store().find_attribute_user(CODAFOR$2);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor)get_store().add_attribute_user(CODAFOR$2);
                }
                target.set(codAfor);
            }
        }
        
        /**
         * Gets the "Nome" attribute
         */
        public java.lang.String getNome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Nome" attribute
         */
        public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome xgetNome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome)get_store().find_attribute_user(NOME$4);
                return target;
            }
        }
        
        /**
         * Sets the "Nome" attribute
         */
        public void setNome(java.lang.String nome)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOME$4);
                }
                target.setStringValue(nome);
            }
        }
        
        /**
         * Sets (as xml) the "Nome" attribute
         */
        public void xsetNome(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome nome)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome)get_store().find_attribute_user(NOME$4);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome)get_store().add_attribute_user(NOME$4);
                }
                target.set(nome);
            }
        }
        
        /**
         * Gets the "Tipologia" attribute
         */
        public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia.Enum getTipologia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOLOGIA$6);
                if (target == null)
                {
                    return null;
                }
                return (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Tipologia" attribute
         */
        public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia xgetTipologia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia)get_store().find_attribute_user(TIPOLOGIA$6);
                return target;
            }
        }
        
        /**
         * Sets the "Tipologia" attribute
         */
        public void setTipologia(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia.Enum tipologia)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIPOLOGIA$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIPOLOGIA$6);
                }
                target.setEnumValue(tipologia);
            }
        }
        
        /**
         * Sets (as xml) the "Tipologia" attribute
         */
        public void xsetTipologia(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia tipologia)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia)get_store().find_attribute_user(TIPOLOGIA$6);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia)get_store().add_attribute_user(TIPOLOGIA$6);
                }
                target.set(tipologia);
            }
        }
        
        /**
         * Gets the "Referente" attribute
         */
        public java.lang.String getReferente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENTE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Referente" attribute
         */
        public it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente xgetReferente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente)get_store().find_attribute_user(REFERENTE$8);
                return target;
            }
        }
        
        /**
         * True if has "Referente" attribute
         */
        public boolean isSetReferente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REFERENTE$8) != null;
            }
        }
        
        /**
         * Sets the "Referente" attribute
         */
        public void setReferente(java.lang.String referente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REFERENTE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REFERENTE$8);
                }
                target.setStringValue(referente);
            }
        }
        
        /**
         * Sets (as xml) the "Referente" attribute
         */
        public void xsetReferente(it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente referente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente target = null;
                target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente)get_store().find_attribute_user(REFERENTE$8);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente)get_store().add_attribute_user(REFERENTE$8);
                }
                target.set(referente);
            }
        }
        
        /**
         * Unsets the "Referente" attribute
         */
        public void unsetReferente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REFERENTE$8);
            }
        }
        /**
         * An XML CodAfor(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$CodAfor.
         */
        public static class CodAforImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.CodAfor
        {
            private static final long serialVersionUID = 1L;
            
            public CodAforImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CodAforImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Nome(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$Nome.
         */
        public static class NomeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Nome
        {
            private static final long serialVersionUID = 1L;
            
            public NomeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NomeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Tipologia(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$Tipologia.
         */
        public static class TipologiaImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Tipologia
        {
            private static final long serialVersionUID = 1L;
            
            public TipologiaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TipologiaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML Referente(@).
         *
         * This is an atomic type that is a restriction of it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType$DatiFornitore$Referente.
         */
        public static class ReferenteImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements it.telecomitalia.webservice.ettmp.ElencoFornitoriOutType.DatiFornitore.Referente
        {
            private static final long serialVersionUID = 1L;
            
            public ReferenteImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ReferenteImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
