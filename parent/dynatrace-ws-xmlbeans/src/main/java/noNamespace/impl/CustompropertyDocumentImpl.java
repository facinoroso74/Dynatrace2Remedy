/*
 * An XML document type.
 * Localname: customproperty
 * Namespace: 
 * Java type: noNamespace.CustompropertyDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one customproperty(@) element.
 *
 * This is a complex type.
 */
public class CustompropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CustompropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustompropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMPROPERTY$0 = 
        new javax.xml.namespace.QName("", "customproperty");
    
    
    /**
     * Gets the "customproperty" element
     */
    public noNamespace.CustompropertyDocument.Customproperty getCustomproperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CustompropertyDocument.Customproperty target = null;
            target = (noNamespace.CustompropertyDocument.Customproperty)get_store().find_element_user(CUSTOMPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "customproperty" element
     */
    public void setCustomproperty(noNamespace.CustompropertyDocument.Customproperty customproperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CustompropertyDocument.Customproperty target = null;
            target = (noNamespace.CustompropertyDocument.Customproperty)get_store().find_element_user(CUSTOMPROPERTY$0, 0);
            if (target == null)
            {
                target = (noNamespace.CustompropertyDocument.Customproperty)get_store().add_element_user(CUSTOMPROPERTY$0);
            }
            target.set(customproperty);
        }
    }
    
    /**
     * Appends and returns a new empty "customproperty" element
     */
    public noNamespace.CustompropertyDocument.Customproperty addNewCustomproperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CustompropertyDocument.Customproperty target = null;
            target = (noNamespace.CustompropertyDocument.Customproperty)get_store().add_element_user(CUSTOMPROPERTY$0);
            return target;
        }
    }
    /**
     * An XML customproperty(@).
     *
     * This is a complex type.
     */
    public static class CustompropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CustompropertyDocument.Customproperty
    {
        private static final long serialVersionUID = 1L;
        
        public CustompropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUSTOMPROPERTY$0 = 
            new javax.xml.namespace.QName("", "customproperty");
        private static final javax.xml.namespace.QName KEY$2 = 
            new javax.xml.namespace.QName("", "key");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets array of all "customproperty" elements
         */
        public noNamespace.CustompropertyDocument.Customproperty[] getCustompropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CUSTOMPROPERTY$0, targetList);
                noNamespace.CustompropertyDocument.Customproperty[] result = new noNamespace.CustompropertyDocument.Customproperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "customproperty" element
         */
        public noNamespace.CustompropertyDocument.Customproperty getCustompropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CustompropertyDocument.Customproperty target = null;
                target = (noNamespace.CustompropertyDocument.Customproperty)get_store().find_element_user(CUSTOMPROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "customproperty" element
         */
        public int sizeOfCustompropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CUSTOMPROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "customproperty" element
         */
        public void setCustompropertyArray(noNamespace.CustompropertyDocument.Customproperty[] custompropertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(custompropertyArray, CUSTOMPROPERTY$0);
            }
        }
        
        /**
         * Sets ith "customproperty" element
         */
        public void setCustompropertyArray(int i, noNamespace.CustompropertyDocument.Customproperty customproperty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CustompropertyDocument.Customproperty target = null;
                target = (noNamespace.CustompropertyDocument.Customproperty)get_store().find_element_user(CUSTOMPROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(customproperty);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "customproperty" element
         */
        public noNamespace.CustompropertyDocument.Customproperty insertNewCustomproperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CustompropertyDocument.Customproperty target = null;
                target = (noNamespace.CustompropertyDocument.Customproperty)get_store().insert_element_user(CUSTOMPROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "customproperty" element
         */
        public noNamespace.CustompropertyDocument.Customproperty addNewCustomproperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CustompropertyDocument.Customproperty target = null;
                target = (noNamespace.CustompropertyDocument.Customproperty)get_store().add_element_user(CUSTOMPROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "customproperty" element
         */
        public void removeCustomproperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CUSTOMPROPERTY$0, i);
            }
        }
        
        /**
         * Gets the "key" attribute
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "key" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$2);
                return target;
            }
        }
        
        /**
         * True if has "key" attribute
         */
        public boolean isSetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KEY$2) != null;
            }
        }
        
        /**
         * Sets the "key" attribute
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$2);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "key" attribute
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$2);
                }
                target.set(key);
            }
        }
        
        /**
         * Unsets the "key" attribute
         */
        public void unsetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KEY$2);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$4) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$4);
            }
        }
    }
}
