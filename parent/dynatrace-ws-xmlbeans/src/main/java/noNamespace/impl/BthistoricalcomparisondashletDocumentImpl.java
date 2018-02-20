/*
 * An XML document type.
 * Localname: bthistoricalcomparisondashlet
 * Namespace: 
 * Java type: noNamespace.BthistoricalcomparisondashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one bthistoricalcomparisondashlet(@) element.
 *
 * This is a complex type.
 */
public class BthistoricalcomparisondashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BthistoricalcomparisondashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public BthistoricalcomparisondashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BTHISTORICALCOMPARISONDASHLET$0 = 
        new javax.xml.namespace.QName("", "bthistoricalcomparisondashlet");
    
    
    /**
     * Gets the "bthistoricalcomparisondashlet" element
     */
    public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet getBthistoricalcomparisondashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet target = null;
            target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().find_element_user(BTHISTORICALCOMPARISONDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bthistoricalcomparisondashlet" element
     */
    public void setBthistoricalcomparisondashlet(noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet bthistoricalcomparisondashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet target = null;
            target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().find_element_user(BTHISTORICALCOMPARISONDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().add_element_user(BTHISTORICALCOMPARISONDASHLET$0);
            }
            target.set(bthistoricalcomparisondashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "bthistoricalcomparisondashlet" element
     */
    public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet addNewBthistoricalcomparisondashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet target = null;
            target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().add_element_user(BTHISTORICALCOMPARISONDASHLET$0);
            return target;
        }
    }
    /**
     * An XML bthistoricalcomparisondashlet(@).
     *
     * This is a complex type.
     */
    public static class BthistoricalcomparisondashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet
    {
        private static final long serialVersionUID = 1L;
        
        public BthistoricalcomparisondashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName TRANSACTIONHOTSPOTS$4 = 
            new javax.xml.namespace.QName("", "transactionhotspots");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("", "description");
        
        
        /**
         * Gets the "source" element
         */
        public noNamespace.SourceType getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$0) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(noNamespace.SourceType source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    target = (noNamespace.SourceType)get_store().add_element_user(SOURCE$0);
                }
                target.set(source);
            }
        }
        
        /**
         * Appends and returns a new empty "source" element
         */
        public noNamespace.SourceType addNewSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().add_element_user(SOURCE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$0, 0);
            }
        }
        
        /**
         * Gets the "comparesource" element
         */
        public noNamespace.SourceType getComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(COMPARESOURCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "comparesource" element
         */
        public boolean isSetComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPARESOURCE$2) != 0;
            }
        }
        
        /**
         * Sets the "comparesource" element
         */
        public void setComparesource(noNamespace.SourceType comparesource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(COMPARESOURCE$2, 0);
                if (target == null)
                {
                    target = (noNamespace.SourceType)get_store().add_element_user(COMPARESOURCE$2);
                }
                target.set(comparesource);
            }
        }
        
        /**
         * Appends and returns a new empty "comparesource" element
         */
        public noNamespace.SourceType addNewComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().add_element_user(COMPARESOURCE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "comparesource" element
         */
        public void unsetComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPARESOURCE$2, 0);
            }
        }
        
        /**
         * Gets array of all "transactionhotspots" elements
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots[] getTransactionhotspotsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRANSACTIONHOTSPOTS$4, targetList);
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots[] result = new noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "transactionhotspots" element
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots getTransactionhotspotsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots)get_store().find_element_user(TRANSACTIONHOTSPOTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "transactionhotspots" element
         */
        public int sizeOfTransactionhotspotsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSACTIONHOTSPOTS$4);
            }
        }
        
        /**
         * Sets array of all "transactionhotspots" element
         */
        public void setTransactionhotspotsArray(noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots[] transactionhotspotsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(transactionhotspotsArray, TRANSACTIONHOTSPOTS$4);
            }
        }
        
        /**
         * Sets ith "transactionhotspots" element
         */
        public void setTransactionhotspotsArray(int i, noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots transactionhotspots)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots)get_store().find_element_user(TRANSACTIONHOTSPOTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(transactionhotspots);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "transactionhotspots" element
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots insertNewTransactionhotspots(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots)get_store().insert_element_user(TRANSACTIONHOTSPOTS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "transactionhotspots" element
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots addNewTransactionhotspots()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots)get_store().add_element_user(TRANSACTIONHOTSPOTS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "transactionhotspots" element
         */
        public void removeTransactionhotspots(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSACTIONHOTSPOTS$4, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "description" attribute
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                return target;
            }
        }
        
        /**
         * True if has "description" attribute
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESCRIPTION$8) != null;
            }
        }
        
        /**
         * Sets the "description" attribute
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$8);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" attribute
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$8);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" attribute
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESCRIPTION$8);
            }
        }
        /**
         * An XML transactionhotspots(@).
         *
         * This is a complex type.
         */
        public static class TransactionhotspotsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots
        {
            private static final long serialVersionUID = 1L;
            
            public TransactionhotspotsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TRANSACTIONHOTSPOT$0 = 
                new javax.xml.namespace.QName("", "transactionhotspot");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            private static final javax.xml.namespace.QName NAME$4 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName STARTTIMESTAMP$6 = 
                new javax.xml.namespace.QName("", "starttimestamp");
            private static final javax.xml.namespace.QName ENDTIMESTAMP$8 = 
                new javax.xml.namespace.QName("", "endtimestamp");
            
            
            /**
             * Gets array of all "transactionhotspot" elements
             */
            public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot[] getTransactionhotspotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(TRANSACTIONHOTSPOT$0, targetList);
                    noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot[] result = new noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "transactionhotspot" element
             */
            public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot getTransactionhotspotArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot target = null;
                    target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "transactionhotspot" element
             */
            public int sizeOfTransactionhotspotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TRANSACTIONHOTSPOT$0);
                }
            }
            
            /**
             * Sets array of all "transactionhotspot" element
             */
            public void setTransactionhotspotArray(noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot[] transactionhotspotArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(transactionhotspotArray, TRANSACTIONHOTSPOT$0);
                }
            }
            
            /**
             * Sets ith "transactionhotspot" element
             */
            public void setTransactionhotspotArray(int i, noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot transactionhotspot)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot target = null;
                    target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(transactionhotspot);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "transactionhotspot" element
             */
            public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot insertNewTransactionhotspot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot target = null;
                    target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot)get_store().insert_element_user(TRANSACTIONHOTSPOT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "transactionhotspot" element
             */
            public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot addNewTransactionhotspot()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot target = null;
                    target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot)get_store().add_element_user(TRANSACTIONHOTSPOT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "transactionhotspot" element
             */
            public void removeTransactionhotspot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TRANSACTIONHOTSPOT$0, i);
                }
            }
            
            /**
             * Gets the "structuretype" attribute
             */
            public java.lang.String getStructuretype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "structuretype" attribute
             */
            public org.apache.xmlbeans.XmlString xgetStructuretype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURETYPE$2);
                    return target;
                }
            }
            
            /**
             * Sets the "structuretype" attribute
             */
            public void setStructuretype(java.lang.String structuretype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTURETYPE$2);
                    }
                    target.setStringValue(structuretype);
                }
            }
            
            /**
             * Sets (as xml) the "structuretype" attribute
             */
            public void xsetStructuretype(org.apache.xmlbeans.XmlString structuretype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRUCTURETYPE$2);
                    }
                    target.set(structuretype);
                }
            }
            
            /**
             * Gets the "name" attribute
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                    return target;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Gets the "starttimestamp" attribute
             */
            public long getStarttimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIMESTAMP$6);
                    if (target == null)
                    {
                      return 0L;
                    }
                    return target.getLongValue();
                }
            }
            
            /**
             * Gets (as xml) the "starttimestamp" attribute
             */
            public org.apache.xmlbeans.XmlLong xgetStarttimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(STARTTIMESTAMP$6);
                    return target;
                }
            }
            
            /**
             * Sets the "starttimestamp" attribute
             */
            public void setStarttimestamp(long starttimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIMESTAMP$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIMESTAMP$6);
                    }
                    target.setLongValue(starttimestamp);
                }
            }
            
            /**
             * Sets (as xml) the "starttimestamp" attribute
             */
            public void xsetStarttimestamp(org.apache.xmlbeans.XmlLong starttimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(STARTTIMESTAMP$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(STARTTIMESTAMP$6);
                    }
                    target.set(starttimestamp);
                }
            }
            
            /**
             * Gets the "endtimestamp" attribute
             */
            public long getEndtimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIMESTAMP$8);
                    if (target == null)
                    {
                      return 0L;
                    }
                    return target.getLongValue();
                }
            }
            
            /**
             * Gets (as xml) the "endtimestamp" attribute
             */
            public org.apache.xmlbeans.XmlLong xgetEndtimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ENDTIMESTAMP$8);
                    return target;
                }
            }
            
            /**
             * Sets the "endtimestamp" attribute
             */
            public void setEndtimestamp(long endtimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIMESTAMP$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTIMESTAMP$8);
                    }
                    target.setLongValue(endtimestamp);
                }
            }
            
            /**
             * Sets (as xml) the "endtimestamp" attribute
             */
            public void xsetEndtimestamp(org.apache.xmlbeans.XmlLong endtimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLong target = null;
                    target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(ENDTIMESTAMP$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(ENDTIMESTAMP$8);
                    }
                    target.set(endtimestamp);
                }
            }
            /**
             * An XML transactionhotspot(@).
             *
             * This is a complex type.
             */
            public static class TransactionhotspotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet.Transactionhotspots.Transactionhotspot
            {
                private static final long serialVersionUID = 1L;
                
                public TransactionhotspotImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TRANSACTIONHOTSPOT$0 = 
                    new javax.xml.namespace.QName("", "transactionhotspot");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName COUNT$4 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName COUNTPERDAY$6 = 
                    new javax.xml.namespace.QName("", "countperday");
                private static final javax.xml.namespace.QName INCIDENTS$8 = 
                    new javax.xml.namespace.QName("", "incidents");
                private static final javax.xml.namespace.QName INCIDENTSPERDAY$10 = 
                    new javax.xml.namespace.QName("", "incidentsperday");
                private static final javax.xml.namespace.QName INCIDENTRATE$12 = 
                    new javax.xml.namespace.QName("", "incidentrate");
                private static final javax.xml.namespace.QName VIOLATIONS$14 = 
                    new javax.xml.namespace.QName("", "violations");
                private static final javax.xml.namespace.QName VIOLATIONSPERDAY$16 = 
                    new javax.xml.namespace.QName("", "violationsperday");
                private static final javax.xml.namespace.QName VIOLATIONRATE$18 = 
                    new javax.xml.namespace.QName("", "violationrate");
                private static final javax.xml.namespace.QName STATE$20 = 
                    new javax.xml.namespace.QName("", "state");
                private static final javax.xml.namespace.QName ERRORPERCENTAGE$22 = 
                    new javax.xml.namespace.QName("", "errorpercentage");
                
                
                /**
                 * Gets array of all "transactionhotspot" elements
                 */
                public noNamespace.TransactionhotspotDocument.Transactionhotspot[] getTransactionhotspotArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TRANSACTIONHOTSPOT$0, targetList);
                      noNamespace.TransactionhotspotDocument.Transactionhotspot[] result = new noNamespace.TransactionhotspotDocument.Transactionhotspot[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "transactionhotspot" element
                 */
                public noNamespace.TransactionhotspotDocument.Transactionhotspot getTransactionhotspotArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                      target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "transactionhotspot" element
                 */
                public int sizeOfTransactionhotspotArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TRANSACTIONHOTSPOT$0);
                    }
                }
                
                /**
                 * Sets array of all "transactionhotspot" element
                 */
                public void setTransactionhotspotArray(noNamespace.TransactionhotspotDocument.Transactionhotspot[] transactionhotspotArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(transactionhotspotArray, TRANSACTIONHOTSPOT$0);
                    }
                }
                
                /**
                 * Sets ith "transactionhotspot" element
                 */
                public void setTransactionhotspotArray(int i, noNamespace.TransactionhotspotDocument.Transactionhotspot transactionhotspot)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                      target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(transactionhotspot);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "transactionhotspot" element
                 */
                public noNamespace.TransactionhotspotDocument.Transactionhotspot insertNewTransactionhotspot(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                      target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().insert_element_user(TRANSACTIONHOTSPOT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "transactionhotspot" element
                 */
                public noNamespace.TransactionhotspotDocument.Transactionhotspot addNewTransactionhotspot()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                      target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().add_element_user(TRANSACTIONHOTSPOT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "transactionhotspot" element
                 */
                public void removeTransactionhotspot(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TRANSACTIONHOTSPOT$0, i);
                    }
                }
                
                /**
                 * Gets the "name" attribute
                 */
                public java.lang.String getName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "name" attribute
                 */
                public boolean isSetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAME$2) != null;
                    }
                }
                
                /**
                 * Sets the "name" attribute
                 */
                public void setName(java.lang.String name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                      }
                      target.setStringValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                public void xsetName(org.apache.xmlbeans.XmlString name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Unsets the "name" attribute
                 */
                public void unsetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAME$2);
                    }
                }
                
                /**
                 * Gets the "count" attribute
                 */
                public double getCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "count" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNT$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "count" attribute
                 */
                public boolean isSetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COUNT$4) != null;
                    }
                }
                
                /**
                 * Sets the "count" attribute
                 */
                public void setCount(double count)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$4);
                      }
                      target.setDoubleValue(count);
                    }
                }
                
                /**
                 * Sets (as xml) the "count" attribute
                 */
                public void xsetCount(org.apache.xmlbeans.XmlDouble count)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COUNT$4);
                      }
                      target.set(count);
                    }
                }
                
                /**
                 * Unsets the "count" attribute
                 */
                public void unsetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COUNT$4);
                    }
                }
                
                /**
                 * Gets the "countperday" attribute
                 */
                public double getCountperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTPERDAY$6);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "countperday" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCountperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNTPERDAY$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "countperday" attribute
                 */
                public boolean isSetCountperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COUNTPERDAY$6) != null;
                    }
                }
                
                /**
                 * Sets the "countperday" attribute
                 */
                public void setCountperday(double countperday)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTPERDAY$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTPERDAY$6);
                      }
                      target.setDoubleValue(countperday);
                    }
                }
                
                /**
                 * Sets (as xml) the "countperday" attribute
                 */
                public void xsetCountperday(org.apache.xmlbeans.XmlDouble countperday)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNTPERDAY$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COUNTPERDAY$6);
                      }
                      target.set(countperday);
                    }
                }
                
                /**
                 * Unsets the "countperday" attribute
                 */
                public void unsetCountperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COUNTPERDAY$6);
                    }
                }
                
                /**
                 * Gets the "incidents" attribute
                 */
                public double getIncidents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTS$8);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "incidents" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetIncidents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTS$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "incidents" attribute
                 */
                public boolean isSetIncidents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INCIDENTS$8) != null;
                    }
                }
                
                /**
                 * Sets the "incidents" attribute
                 */
                public void setIncidents(double incidents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTS$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCIDENTS$8);
                      }
                      target.setDoubleValue(incidents);
                    }
                }
                
                /**
                 * Sets (as xml) the "incidents" attribute
                 */
                public void xsetIncidents(org.apache.xmlbeans.XmlDouble incidents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTS$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCIDENTS$8);
                      }
                      target.set(incidents);
                    }
                }
                
                /**
                 * Unsets the "incidents" attribute
                 */
                public void unsetIncidents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INCIDENTS$8);
                    }
                }
                
                /**
                 * Gets the "incidentsperday" attribute
                 */
                public double getIncidentsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "incidentsperday" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetIncidentsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "incidentsperday" attribute
                 */
                public boolean isSetIncidentsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INCIDENTSPERDAY$10) != null;
                    }
                }
                
                /**
                 * Sets the "incidentsperday" attribute
                 */
                public void setIncidentsperday(double incidentsperday)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCIDENTSPERDAY$10);
                      }
                      target.setDoubleValue(incidentsperday);
                    }
                }
                
                /**
                 * Sets (as xml) the "incidentsperday" attribute
                 */
                public void xsetIncidentsperday(org.apache.xmlbeans.XmlDouble incidentsperday)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCIDENTSPERDAY$10);
                      }
                      target.set(incidentsperday);
                    }
                }
                
                /**
                 * Unsets the "incidentsperday" attribute
                 */
                public void unsetIncidentsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INCIDENTSPERDAY$10);
                    }
                }
                
                /**
                 * Gets the "incidentrate" attribute
                 */
                public double getIncidentrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTRATE$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "incidentrate" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetIncidentrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTRATE$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "incidentrate" attribute
                 */
                public boolean isSetIncidentrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INCIDENTRATE$12) != null;
                    }
                }
                
                /**
                 * Sets the "incidentrate" attribute
                 */
                public void setIncidentrate(double incidentrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTRATE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCIDENTRATE$12);
                      }
                      target.setDoubleValue(incidentrate);
                    }
                }
                
                /**
                 * Sets (as xml) the "incidentrate" attribute
                 */
                public void xsetIncidentrate(org.apache.xmlbeans.XmlDouble incidentrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTRATE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCIDENTRATE$12);
                      }
                      target.set(incidentrate);
                    }
                }
                
                /**
                 * Unsets the "incidentrate" attribute
                 */
                public void unsetIncidentrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INCIDENTRATE$12);
                    }
                }
                
                /**
                 * Gets the "violations" attribute
                 */
                public double getViolations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONS$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "violations" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetViolations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONS$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "violations" attribute
                 */
                public boolean isSetViolations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIOLATIONS$14) != null;
                    }
                }
                
                /**
                 * Sets the "violations" attribute
                 */
                public void setViolations(double violations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONS$14);
                      }
                      target.setDoubleValue(violations);
                    }
                }
                
                /**
                 * Sets (as xml) the "violations" attribute
                 */
                public void xsetViolations(org.apache.xmlbeans.XmlDouble violations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VIOLATIONS$14);
                      }
                      target.set(violations);
                    }
                }
                
                /**
                 * Unsets the "violations" attribute
                 */
                public void unsetViolations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIOLATIONS$14);
                    }
                }
                
                /**
                 * Gets the "violationsperday" attribute
                 */
                public double getViolationsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "violationsperday" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetViolationsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "violationsperday" attribute
                 */
                public boolean isSetViolationsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIOLATIONSPERDAY$16) != null;
                    }
                }
                
                /**
                 * Sets the "violationsperday" attribute
                 */
                public void setViolationsperday(double violationsperday)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONSPERDAY$16);
                      }
                      target.setDoubleValue(violationsperday);
                    }
                }
                
                /**
                 * Sets (as xml) the "violationsperday" attribute
                 */
                public void xsetViolationsperday(org.apache.xmlbeans.XmlDouble violationsperday)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VIOLATIONSPERDAY$16);
                      }
                      target.set(violationsperday);
                    }
                }
                
                /**
                 * Unsets the "violationsperday" attribute
                 */
                public void unsetViolationsperday()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIOLATIONSPERDAY$16);
                    }
                }
                
                /**
                 * Gets the "violationrate" attribute
                 */
                public double getViolationrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONRATE$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "violationrate" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetViolationrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONRATE$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "violationrate" attribute
                 */
                public boolean isSetViolationrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIOLATIONRATE$18) != null;
                    }
                }
                
                /**
                 * Sets the "violationrate" attribute
                 */
                public void setViolationrate(double violationrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONRATE$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONRATE$18);
                      }
                      target.setDoubleValue(violationrate);
                    }
                }
                
                /**
                 * Sets (as xml) the "violationrate" attribute
                 */
                public void xsetViolationrate(org.apache.xmlbeans.XmlDouble violationrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONRATE$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VIOLATIONRATE$18);
                      }
                      target.set(violationrate);
                    }
                }
                
                /**
                 * Unsets the "violationrate" attribute
                 */
                public void unsetViolationrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIOLATIONRATE$18);
                    }
                }
                
                /**
                 * Gets the "state" attribute
                 */
                public java.lang.String getState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "state" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "state" attribute
                 */
                public boolean isSetState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATE$20) != null;
                    }
                }
                
                /**
                 * Sets the "state" attribute
                 */
                public void setState(java.lang.String state)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$20);
                      }
                      target.setStringValue(state);
                    }
                }
                
                /**
                 * Sets (as xml) the "state" attribute
                 */
                public void xsetState(org.apache.xmlbeans.XmlString state)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATE$20);
                      }
                      target.set(state);
                    }
                }
                
                /**
                 * Unsets the "state" attribute
                 */
                public void unsetState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATE$20);
                    }
                }
                
                /**
                 * Gets the "errorpercentage" attribute
                 */
                public double getErrorpercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "errorpercentage" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetErrorpercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "errorpercentage" attribute
                 */
                public boolean isSetErrorpercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORPERCENTAGE$22) != null;
                    }
                }
                
                /**
                 * Sets the "errorpercentage" attribute
                 */
                public void setErrorpercentage(double errorpercentage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORPERCENTAGE$22);
                      }
                      target.setDoubleValue(errorpercentage);
                    }
                }
                
                /**
                 * Sets (as xml) the "errorpercentage" attribute
                 */
                public void xsetErrorpercentage(org.apache.xmlbeans.XmlDouble errorpercentage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ERRORPERCENTAGE$22);
                      }
                      target.set(errorpercentage);
                    }
                }
                
                /**
                 * Unsets the "errorpercentage" attribute
                 */
                public void unsetErrorpercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORPERCENTAGE$22);
                    }
                }
            }
        }
    }
}
