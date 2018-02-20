/*
 * An XML document type.
 * Localname: testrun
 * Namespace: 
 * Java type: noNamespace.TestrunDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one testrun(@) element.
 *
 * This is a complex type.
 */
public class TestrunDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestrunDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestrunDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTRUN$0 = 
        new javax.xml.namespace.QName("", "testrun");
    
    
    /**
     * Gets the "testrun" element
     */
    public noNamespace.TestrunDocument.Testrun getTestrun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestrunDocument.Testrun target = null;
            target = (noNamespace.TestrunDocument.Testrun)get_store().find_element_user(TESTRUN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testrun" element
     */
    public void setTestrun(noNamespace.TestrunDocument.Testrun testrun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestrunDocument.Testrun target = null;
            target = (noNamespace.TestrunDocument.Testrun)get_store().find_element_user(TESTRUN$0, 0);
            if (target == null)
            {
                target = (noNamespace.TestrunDocument.Testrun)get_store().add_element_user(TESTRUN$0);
            }
            target.set(testrun);
        }
    }
    
    /**
     * Appends and returns a new empty "testrun" element
     */
    public noNamespace.TestrunDocument.Testrun addNewTestrun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestrunDocument.Testrun target = null;
            target = (noNamespace.TestrunDocument.Testrun)get_store().add_element_user(TESTRUN$0);
            return target;
        }
    }
    /**
     * An XML testrun(@).
     *
     * This is a complex type.
     */
    public static class TestrunImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestrunDocument.Testrun
    {
        private static final long serialVersionUID = 1L;
        
        public TestrunImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TESTRUN$0 = 
            new javax.xml.namespace.QName("", "testrun");
        private static final javax.xml.namespace.QName TIMESTAMP$2 = 
            new javax.xml.namespace.QName("", "timestamp");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName FAILED$6 = 
            new javax.xml.namespace.QName("", "failed");
        private static final javax.xml.namespace.QName TESTRUNINFO$8 = 
            new javax.xml.namespace.QName("", "testruninfo");
        
        
        /**
         * Gets array of all "testrun" elements
         */
        public noNamespace.TestrunDocument.Testrun[] getTestrunArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TESTRUN$0, targetList);
                noNamespace.TestrunDocument.Testrun[] result = new noNamespace.TestrunDocument.Testrun[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "testrun" element
         */
        public noNamespace.TestrunDocument.Testrun getTestrunArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestrunDocument.Testrun target = null;
                target = (noNamespace.TestrunDocument.Testrun)get_store().find_element_user(TESTRUN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "testrun" element
         */
        public int sizeOfTestrunArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTRUN$0);
            }
        }
        
        /**
         * Sets array of all "testrun" element
         */
        public void setTestrunArray(noNamespace.TestrunDocument.Testrun[] testrunArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(testrunArray, TESTRUN$0);
            }
        }
        
        /**
         * Sets ith "testrun" element
         */
        public void setTestrunArray(int i, noNamespace.TestrunDocument.Testrun testrun)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestrunDocument.Testrun target = null;
                target = (noNamespace.TestrunDocument.Testrun)get_store().find_element_user(TESTRUN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(testrun);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testrun" element
         */
        public noNamespace.TestrunDocument.Testrun insertNewTestrun(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestrunDocument.Testrun target = null;
                target = (noNamespace.TestrunDocument.Testrun)get_store().insert_element_user(TESTRUN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testrun" element
         */
        public noNamespace.TestrunDocument.Testrun addNewTestrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestrunDocument.Testrun target = null;
                target = (noNamespace.TestrunDocument.Testrun)get_store().add_element_user(TESTRUN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "testrun" element
         */
        public void removeTestrun(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTRUN$0, i);
            }
        }
        
        /**
         * Gets the "timestamp" attribute
         */
        public java.util.Calendar getTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "timestamp" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
                return target;
            }
        }
        
        /**
         * True if has "timestamp" attribute
         */
        public boolean isSetTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMESTAMP$2) != null;
            }
        }
        
        /**
         * Sets the "timestamp" attribute
         */
        public void setTimestamp(java.util.Calendar timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$2);
                }
                target.setCalendarValue(timestamp);
            }
        }
        
        /**
         * Sets (as xml) the "timestamp" attribute
         */
        public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$2);
                }
                target.set(timestamp);
            }
        }
        
        /**
         * Unsets the "timestamp" attribute
         */
        public void unsetTimestamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMESTAMP$2);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public double getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$4);
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
        public void setValue(double value)
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
                target.setDoubleValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlDouble value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$4);
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
        
        /**
         * Gets the "failed" attribute
         */
        public java.lang.String getFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILED$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "failed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILED$6);
                return target;
            }
        }
        
        /**
         * True if has "failed" attribute
         */
        public boolean isSetFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FAILED$6) != null;
            }
        }
        
        /**
         * Sets the "failed" attribute
         */
        public void setFailed(java.lang.String failed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILED$6);
                }
                target.setStringValue(failed);
            }
        }
        
        /**
         * Sets (as xml) the "failed" attribute
         */
        public void xsetFailed(org.apache.xmlbeans.XmlString failed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILED$6);
                }
                target.set(failed);
            }
        }
        
        /**
         * Unsets the "failed" attribute
         */
        public void unsetFailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FAILED$6);
            }
        }
        
        /**
         * Gets the "testruninfo" attribute
         */
        public java.lang.String getTestruninfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTRUNINFO$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "testruninfo" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTestruninfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTRUNINFO$8);
                return target;
            }
        }
        
        /**
         * True if has "testruninfo" attribute
         */
        public boolean isSetTestruninfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TESTRUNINFO$8) != null;
            }
        }
        
        /**
         * Sets the "testruninfo" attribute
         */
        public void setTestruninfo(java.lang.String testruninfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTRUNINFO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TESTRUNINFO$8);
                }
                target.setStringValue(testruninfo);
            }
        }
        
        /**
         * Sets (as xml) the "testruninfo" attribute
         */
        public void xsetTestruninfo(org.apache.xmlbeans.XmlString testruninfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTRUNINFO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TESTRUNINFO$8);
                }
                target.set(testruninfo);
            }
        }
        
        /**
         * Unsets the "testruninfo" attribute
         */
        public void unsetTestruninfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TESTRUNINFO$8);
            }
        }
    }
}
