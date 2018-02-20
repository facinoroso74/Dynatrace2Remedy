/*
 * An XML document type.
 * Localname: dynamicmeasurematrixrecord
 * Namespace: 
 * Java type: noNamespace.DynamicmeasurematrixrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one dynamicmeasurematrixrecord(@) element.
 *
 * This is a complex type.
 */
public class DynamicmeasurematrixrecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DynamicmeasurematrixrecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public DynamicmeasurematrixrecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DYNAMICMEASUREMATRIXRECORD$0 = 
        new javax.xml.namespace.QName("", "dynamicmeasurematrixrecord");
    
    
    /**
     * Gets the "dynamicmeasurematrixrecord" element
     */
    public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
            target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dynamicmeasurematrixrecord" element
     */
    public void setDynamicmeasurematrixrecord(noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
            target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, 0);
            if (target == null)
            {
                target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().add_element_user(DYNAMICMEASUREMATRIXRECORD$0);
            }
            target.set(dynamicmeasurematrixrecord);
        }
    }
    
    /**
     * Appends and returns a new empty "dynamicmeasurematrixrecord" element
     */
    public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
            target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().add_element_user(DYNAMICMEASUREMATRIXRECORD$0);
            return target;
        }
    }
    /**
     * An XML dynamicmeasurematrixrecord(@).
     *
     * This is a complex type.
     */
    public static class DynamicmeasurematrixrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord
    {
        private static final long serialVersionUID = 1L;
        
        public DynamicmeasurematrixrecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DYNAMICMEASUREMATRIXRECORD$0 = 
            new javax.xml.namespace.QName("", "dynamicmeasurematrixrecord");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "dynamicmeasurematrixrecord" elements
         */
        public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] getDynamicmeasurematrixrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DYNAMICMEASUREMATRIXRECORD$0, targetList);
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] result = new noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dynamicmeasurematrixrecord" element
         */
        public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dynamicmeasurematrixrecord" element
         */
        public int sizeOfDynamicmeasurematrixrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DYNAMICMEASUREMATRIXRECORD$0);
            }
        }
        
        /**
         * Sets array of all "dynamicmeasurematrixrecord" element
         */
        public void setDynamicmeasurematrixrecordArray(noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] dynamicmeasurematrixrecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dynamicmeasurematrixrecordArray, DYNAMICMEASUREMATRIXRECORD$0);
            }
        }
        
        /**
         * Sets ith "dynamicmeasurematrixrecord" element
         */
        public void setDynamicmeasurematrixrecordArray(int i, noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dynamicmeasurematrixrecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dynamicmeasurematrixrecord" element
         */
        public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord insertNewDynamicmeasurematrixrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().insert_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dynamicmeasurematrixrecord" element
         */
        public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().add_element_user(DYNAMICMEASUREMATRIXRECORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dynamicmeasurematrixrecord" element
         */
        public void removeDynamicmeasurematrixrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DYNAMICMEASUREMATRIXRECORD$0, i);
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
    }
}
