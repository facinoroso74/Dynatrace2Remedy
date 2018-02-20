/*
 * An XML document type.
 * Localname: businesstransactionsdashlet
 * Namespace: 
 * Java type: noNamespace.BusinesstransactionsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one businesstransactionsdashlet(@) element.
 *
 * This is a complex type.
 */
public class BusinesstransactionsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BusinesstransactionsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinesstransactionsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSTRANSACTIONSDASHLET$0 = 
        new javax.xml.namespace.QName("", "businesstransactionsdashlet");
    
    
    /**
     * Gets the "businesstransactionsdashlet" element
     */
    public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet getBusinesstransactionsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet target = null;
            target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().find_element_user(BUSINESSTRANSACTIONSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businesstransactionsdashlet" element
     */
    public void setBusinesstransactionsdashlet(noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet businesstransactionsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet target = null;
            target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().find_element_user(BUSINESSTRANSACTIONSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().add_element_user(BUSINESSTRANSACTIONSDASHLET$0);
            }
            target.set(businesstransactionsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "businesstransactionsdashlet" element
     */
    public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet addNewBusinesstransactionsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet target = null;
            target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().add_element_user(BUSINESSTRANSACTIONSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML businesstransactionsdashlet(@).
     *
     * This is a complex type.
     */
    public static class BusinesstransactionsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public BusinesstransactionsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName TRANSACTIONS$4 = 
            new javax.xml.namespace.QName("", "transactions");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName DISPLAYSOURCE$10 = 
            new javax.xml.namespace.QName("", "displaysource");
        
        
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
         * Gets the "transactions" element
         */
        public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions getTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions target = null;
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions)get_store().find_element_user(TRANSACTIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "transactions" element
         */
        public boolean isSetTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSACTIONS$4) != 0;
            }
        }
        
        /**
         * Sets the "transactions" element
         */
        public void setTransactions(noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions transactions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions target = null;
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions)get_store().find_element_user(TRANSACTIONS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions)get_store().add_element_user(TRANSACTIONS$4);
                }
                target.set(transactions);
            }
        }
        
        /**
         * Appends and returns a new empty "transactions" element
         */
        public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions addNewTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions target = null;
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions)get_store().add_element_user(TRANSACTIONS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "transactions" element
         */
        public void unsetTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSACTIONS$4, 0);
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
         * Gets the "displaysource" attribute
         */
        public java.lang.String getDisplaysource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displaysource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDisplaysource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$10);
                return target;
            }
        }
        
        /**
         * Sets the "displaysource" attribute
         */
        public void setDisplaysource(java.lang.String displaysource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYSOURCE$10);
                }
                target.setStringValue(displaysource);
            }
        }
        
        /**
         * Sets (as xml) the "displaysource" attribute
         */
        public void xsetDisplaysource(org.apache.xmlbeans.XmlString displaysource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYSOURCE$10);
                }
                target.set(displaysource);
            }
        }
        /**
         * An XML transactions(@).
         *
         * This is a complex type.
         */
        public static class TransactionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions
        {
            private static final long serialVersionUID = 1L;
            
            public TransactionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TRANSACTION$0 = 
                new javax.xml.namespace.QName("", "transaction");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "transaction" elements
             */
            public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction[] getTransactionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(TRANSACTION$0, targetList);
                    noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction[] result = new noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "transaction" element
             */
            public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction getTransactionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction target = null;
                    target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction)get_store().find_element_user(TRANSACTION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "transaction" element
             */
            public int sizeOfTransactionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TRANSACTION$0);
                }
            }
            
            /**
             * Sets array of all "transaction" element
             */
            public void setTransactionArray(noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction[] transactionArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(transactionArray, TRANSACTION$0);
                }
            }
            
            /**
             * Sets ith "transaction" element
             */
            public void setTransactionArray(int i, noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction transaction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction target = null;
                    target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction)get_store().find_element_user(TRANSACTION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(transaction);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "transaction" element
             */
            public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction insertNewTransaction(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction target = null;
                    target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction)get_store().insert_element_user(TRANSACTION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "transaction" element
             */
            public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction addNewTransaction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction target = null;
                    target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction)get_store().add_element_user(TRANSACTION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "transaction" element
             */
            public void removeTransaction(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TRANSACTION$0, i);
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
             * An XML transaction(@).
             *
             * This is a complex type.
             */
            public static class TransactionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet.Transactions.Transaction
            {
                private static final long serialVersionUID = 1L;
                
                public TransactionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
    }
}
