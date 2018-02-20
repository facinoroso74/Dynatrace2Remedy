/*
 * An XML document type.
 * Localname: error
 * Namespace: 
 * Java type: noNamespace.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one error(@) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("", "error");
    
    
    /**
     * Gets the "error" element
     */
    public noNamespace.ErrorDocument.Error getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrorDocument.Error target = null;
            target = (noNamespace.ErrorDocument.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(noNamespace.ErrorDocument.Error error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrorDocument.Error target = null;
            target = (noNamespace.ErrorDocument.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (noNamespace.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "error" element
     */
    public noNamespace.ErrorDocument.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrorDocument.Error target = null;
            target = (noNamespace.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    /**
     * An XML error(@).
     *
     * This is a complex type.
     */
    public static class ErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrorDocument.Error
    {
        private static final long serialVersionUID = 1L;
        
        public ErrorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERROR$0 = 
            new javax.xml.namespace.QName("", "error");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ERRORCOUNT$4 = 
            new javax.xml.namespace.QName("", "errorcount");
        private static final javax.xml.namespace.QName ERRORAFFECTEDTRANSACTIONCOUNT$6 = 
            new javax.xml.namespace.QName("", "error_affected_transaction_count");
        private static final javax.xml.namespace.QName ERRORAFFECTEDPAGEACTIONCOUNT$8 = 
            new javax.xml.namespace.QName("", "error_affected_pageaction_count");
        
        
        /**
         * Gets array of all "error" elements
         */
        public noNamespace.ErrorDocument.Error[] getErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ERROR$0, targetList);
                noNamespace.ErrorDocument.Error[] result = new noNamespace.ErrorDocument.Error[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "error" element
         */
        public noNamespace.ErrorDocument.Error getErrorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrorDocument.Error target = null;
                target = (noNamespace.ErrorDocument.Error)get_store().find_element_user(ERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "error" element
         */
        public int sizeOfErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERROR$0);
            }
        }
        
        /**
         * Sets array of all "error" element
         */
        public void setErrorArray(noNamespace.ErrorDocument.Error[] errorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(errorArray, ERROR$0);
            }
        }
        
        /**
         * Sets ith "error" element
         */
        public void setErrorArray(int i, noNamespace.ErrorDocument.Error error)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrorDocument.Error target = null;
                target = (noNamespace.ErrorDocument.Error)get_store().find_element_user(ERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(error);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "error" element
         */
        public noNamespace.ErrorDocument.Error insertNewError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrorDocument.Error target = null;
                target = (noNamespace.ErrorDocument.Error)get_store().insert_element_user(ERROR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "error" element
         */
        public noNamespace.ErrorDocument.Error addNewError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrorDocument.Error target = null;
                target = (noNamespace.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "error" element
         */
        public void removeError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERROR$0, i);
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
         * Gets the "errorcount" attribute
         */
        public java.lang.String getErrorcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCOUNT$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "errorcount" attribute
         */
        public org.apache.xmlbeans.XmlString xgetErrorcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCOUNT$4);
                return target;
            }
        }
        
        /**
         * True if has "errorcount" attribute
         */
        public boolean isSetErrorcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORCOUNT$4) != null;
            }
        }
        
        /**
         * Sets the "errorcount" attribute
         */
        public void setErrorcount(java.lang.String errorcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCOUNT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORCOUNT$4);
                }
                target.setStringValue(errorcount);
            }
        }
        
        /**
         * Sets (as xml) the "errorcount" attribute
         */
        public void xsetErrorcount(org.apache.xmlbeans.XmlString errorcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCOUNT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORCOUNT$4);
                }
                target.set(errorcount);
            }
        }
        
        /**
         * Unsets the "errorcount" attribute
         */
        public void unsetErrorcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORCOUNT$4);
            }
        }
        
        /**
         * Gets the "error_affected_transaction_count" attribute
         */
        public java.lang.String getErrorAffectedTransactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "error_affected_transaction_count" attribute
         */
        public org.apache.xmlbeans.XmlString xgetErrorAffectedTransactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                return target;
            }
        }
        
        /**
         * True if has "error_affected_transaction_count" attribute
         */
        public boolean isSetErrorAffectedTransactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6) != null;
            }
        }
        
        /**
         * Sets the "error_affected_transaction_count" attribute
         */
        public void setErrorAffectedTransactionCount(java.lang.String errorAffectedTransactionCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                }
                target.setStringValue(errorAffectedTransactionCount);
            }
        }
        
        /**
         * Sets (as xml) the "error_affected_transaction_count" attribute
         */
        public void xsetErrorAffectedTransactionCount(org.apache.xmlbeans.XmlString errorAffectedTransactionCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                }
                target.set(errorAffectedTransactionCount);
            }
        }
        
        /**
         * Unsets the "error_affected_transaction_count" attribute
         */
        public void unsetErrorAffectedTransactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORAFFECTEDTRANSACTIONCOUNT$6);
            }
        }
        
        /**
         * Gets the "error_affected_pageaction_count" attribute
         */
        public java.lang.String getErrorAffectedPageactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "error_affected_pageaction_count" attribute
         */
        public org.apache.xmlbeans.XmlString xgetErrorAffectedPageactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                return target;
            }
        }
        
        /**
         * True if has "error_affected_pageaction_count" attribute
         */
        public boolean isSetErrorAffectedPageactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8) != null;
            }
        }
        
        /**
         * Sets the "error_affected_pageaction_count" attribute
         */
        public void setErrorAffectedPageactionCount(java.lang.String errorAffectedPageactionCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                }
                target.setStringValue(errorAffectedPageactionCount);
            }
        }
        
        /**
         * Sets (as xml) the "error_affected_pageaction_count" attribute
         */
        public void xsetErrorAffectedPageactionCount(org.apache.xmlbeans.XmlString errorAffectedPageactionCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                }
                target.set(errorAffectedPageactionCount);
            }
        }
        
        /**
         * Unsets the "error_affected_pageaction_count" attribute
         */
        public void unsetErrorAffectedPageactionCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORAFFECTEDPAGEACTIONCOUNT$8);
            }
        }
    }
}
