/*
 * An XML document type.
 * Localname: errortype
 * Namespace: 
 * Java type: noNamespace.ErrortypeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one errortype(@) element.
 *
 * This is a complex type.
 */
public class ErrortypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrortypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrortypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORTYPE$0 = 
        new javax.xml.namespace.QName("", "errortype");
    
    
    /**
     * Gets the "errortype" element
     */
    public noNamespace.ErrortypeDocument.Errortype getErrortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrortypeDocument.Errortype target = null;
            target = (noNamespace.ErrortypeDocument.Errortype)get_store().find_element_user(ERRORTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errortype" element
     */
    public void setErrortype(noNamespace.ErrortypeDocument.Errortype errortype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrortypeDocument.Errortype target = null;
            target = (noNamespace.ErrortypeDocument.Errortype)get_store().find_element_user(ERRORTYPE$0, 0);
            if (target == null)
            {
                target = (noNamespace.ErrortypeDocument.Errortype)get_store().add_element_user(ERRORTYPE$0);
            }
            target.set(errortype);
        }
    }
    
    /**
     * Appends and returns a new empty "errortype" element
     */
    public noNamespace.ErrortypeDocument.Errortype addNewErrortype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrortypeDocument.Errortype target = null;
            target = (noNamespace.ErrortypeDocument.Errortype)get_store().add_element_user(ERRORTYPE$0);
            return target;
        }
    }
    /**
     * An XML errortype(@).
     *
     * This is a complex type.
     */
    public static class ErrortypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrortypeDocument.Errortype
    {
        private static final long serialVersionUID = 1L;
        
        public ErrortypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERRORTYPE$0 = 
            new javax.xml.namespace.QName("", "errortype");
        private static final javax.xml.namespace.QName ERRORTYPE2$2 = 
            new javax.xml.namespace.QName("", "errortype");
        private static final javax.xml.namespace.QName ERRORCOUNT$4 = 
            new javax.xml.namespace.QName("", "errorcount");
        
        
        /**
         * Gets array of all "errortype" elements
         */
        public noNamespace.ErrortypeDocument.Errortype[] getErrortypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ERRORTYPE2$2, targetList);
                noNamespace.ErrortypeDocument.Errortype[] result = new noNamespace.ErrortypeDocument.Errortype[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "errortype" element
         */
        public noNamespace.ErrortypeDocument.Errortype getErrortypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrortypeDocument.Errortype target = null;
                target = (noNamespace.ErrortypeDocument.Errortype)get_store().find_element_user(ERRORTYPE2$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "errortype" element
         */
        public int sizeOfErrortypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORTYPE2$2);
            }
        }
        
        /**
         * Sets array of all "errortype" element
         */
        public void setErrortypeArray(noNamespace.ErrortypeDocument.Errortype[] errortypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(errortypeArray, ERRORTYPE2$2);
            }
        }
        
        /**
         * Sets ith "errortype" element
         */
        public void setErrortypeArray(int i, noNamespace.ErrortypeDocument.Errortype errortype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrortypeDocument.Errortype target = null;
                target = (noNamespace.ErrortypeDocument.Errortype)get_store().find_element_user(ERRORTYPE2$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(errortype);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "errortype" element
         */
        public noNamespace.ErrortypeDocument.Errortype insertNewErrortype(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrortypeDocument.Errortype target = null;
                target = (noNamespace.ErrortypeDocument.Errortype)get_store().insert_element_user(ERRORTYPE2$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "errortype" element
         */
        public noNamespace.ErrortypeDocument.Errortype addNewErrortype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrortypeDocument.Errortype target = null;
                target = (noNamespace.ErrortypeDocument.Errortype)get_store().add_element_user(ERRORTYPE2$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "errortype" element
         */
        public void removeErrortype(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORTYPE2$2, i);
            }
        }
        
        /**
         * Gets the "errortype" attribute
         */
        public java.lang.String getErrortype2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORTYPE2$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "errortype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetErrortype2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORTYPE2$2);
                return target;
            }
        }
        
        /**
         * True if has "errortype" attribute
         */
        public boolean isSetErrortype2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORTYPE2$2) != null;
            }
        }
        
        /**
         * Sets the "errortype" attribute
         */
        public void setErrortype2(java.lang.String errortype2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORTYPE2$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORTYPE2$2);
                }
                target.setStringValue(errortype2);
            }
        }
        
        /**
         * Sets (as xml) the "errortype" attribute
         */
        public void xsetErrortype2(org.apache.xmlbeans.XmlString errortype2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORTYPE2$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORTYPE2$2);
                }
                target.set(errortype2);
            }
        }
        
        /**
         * Unsets the "errortype" attribute
         */
        public void unsetErrortype2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORTYPE2$2);
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
    }
}
