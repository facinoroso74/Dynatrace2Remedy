/*
 * An XML document type.
 * Localname: testautomation
 * Namespace: 
 * Java type: noNamespace.TestautomationDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one testautomation(@) element.
 *
 * This is a complex type.
 */
public class TestautomationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestautomationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestautomationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTAUTOMATION$0 = 
        new javax.xml.namespace.QName("", "testautomation");
    
    
    /**
     * Gets the "testautomation" element
     */
    public noNamespace.TestautomationDocument.Testautomation getTestautomation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestautomationDocument.Testautomation target = null;
            target = (noNamespace.TestautomationDocument.Testautomation)get_store().find_element_user(TESTAUTOMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testautomation" element
     */
    public void setTestautomation(noNamespace.TestautomationDocument.Testautomation testautomation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestautomationDocument.Testautomation target = null;
            target = (noNamespace.TestautomationDocument.Testautomation)get_store().find_element_user(TESTAUTOMATION$0, 0);
            if (target == null)
            {
                target = (noNamespace.TestautomationDocument.Testautomation)get_store().add_element_user(TESTAUTOMATION$0);
            }
            target.set(testautomation);
        }
    }
    
    /**
     * Appends and returns a new empty "testautomation" element
     */
    public noNamespace.TestautomationDocument.Testautomation addNewTestautomation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestautomationDocument.Testautomation target = null;
            target = (noNamespace.TestautomationDocument.Testautomation)get_store().add_element_user(TESTAUTOMATION$0);
            return target;
        }
    }
    /**
     * An XML testautomation(@).
     *
     * This is a complex type.
     */
    public static class TestautomationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestautomationDocument.Testautomation
    {
        private static final long serialVersionUID = 1L;
        
        public TestautomationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName TESTCASES$4 = 
            new javax.xml.namespace.QName("", "testcases");
        private static final javax.xml.namespace.QName TESTRUNINFOS$6 = 
            new javax.xml.namespace.QName("", "testruninfos");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$10 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName DISPLAYSOURCE$12 = 
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
         * Gets array of all "testcases" elements
         */
        public noNamespace.TestautomationDocument.Testautomation.Testcases[] getTestcasesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TESTCASES$4, targetList);
                noNamespace.TestautomationDocument.Testautomation.Testcases[] result = new noNamespace.TestautomationDocument.Testautomation.Testcases[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "testcases" element
         */
        public noNamespace.TestautomationDocument.Testautomation.Testcases getTestcasesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation.Testcases target = null;
                target = (noNamespace.TestautomationDocument.Testautomation.Testcases)get_store().find_element_user(TESTCASES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "testcases" element
         */
        public int sizeOfTestcasesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTCASES$4);
            }
        }
        
        /**
         * Sets array of all "testcases" element
         */
        public void setTestcasesArray(noNamespace.TestautomationDocument.Testautomation.Testcases[] testcasesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(testcasesArray, TESTCASES$4);
            }
        }
        
        /**
         * Sets ith "testcases" element
         */
        public void setTestcasesArray(int i, noNamespace.TestautomationDocument.Testautomation.Testcases testcases)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation.Testcases target = null;
                target = (noNamespace.TestautomationDocument.Testautomation.Testcases)get_store().find_element_user(TESTCASES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(testcases);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testcases" element
         */
        public noNamespace.TestautomationDocument.Testautomation.Testcases insertNewTestcases(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation.Testcases target = null;
                target = (noNamespace.TestautomationDocument.Testautomation.Testcases)get_store().insert_element_user(TESTCASES$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testcases" element
         */
        public noNamespace.TestautomationDocument.Testautomation.Testcases addNewTestcases()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation.Testcases target = null;
                target = (noNamespace.TestautomationDocument.Testautomation.Testcases)get_store().add_element_user(TESTCASES$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "testcases" element
         */
        public void removeTestcases(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTCASES$4, i);
            }
        }
        
        /**
         * Gets the "testruninfos" element
         */
        public noNamespace.TestautomationDocument.Testautomation.Testruninfos getTestruninfos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation.Testruninfos target = null;
                target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos)get_store().find_element_user(TESTRUNINFOS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "testruninfos" element
         */
        public boolean isSetTestruninfos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTRUNINFOS$6) != 0;
            }
        }
        
        /**
         * Sets the "testruninfos" element
         */
        public void setTestruninfos(noNamespace.TestautomationDocument.Testautomation.Testruninfos testruninfos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation.Testruninfos target = null;
                target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos)get_store().find_element_user(TESTRUNINFOS$6, 0);
                if (target == null)
                {
                    target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos)get_store().add_element_user(TESTRUNINFOS$6);
                }
                target.set(testruninfos);
            }
        }
        
        /**
         * Appends and returns a new empty "testruninfos" element
         */
        public noNamespace.TestautomationDocument.Testautomation.Testruninfos addNewTestruninfos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation.Testruninfos target = null;
                target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos)get_store().add_element_user(TESTRUNINFOS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "testruninfos" element
         */
        public void unsetTestruninfos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTRUNINFOS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
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
                return get_store().find_attribute_user(DESCRIPTION$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$10);
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
                get_store().remove_attribute(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYSOURCE$12);
                }
                target.set(displaysource);
            }
        }
        /**
         * An XML testcases(@).
         *
         * This is a complex type.
         */
        public static class TestcasesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestautomationDocument.Testautomation.Testcases
        {
            private static final long serialVersionUID = 1L;
            
            public TestcasesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TESTCASE$0 = 
                new javax.xml.namespace.QName("", "testcase");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "testcase" elements
             */
            public noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase[] getTestcaseArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(TESTCASE$0, targetList);
                    noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase[] result = new noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "testcase" element
             */
            public noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase getTestcaseArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase)get_store().find_element_user(TESTCASE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "testcase" element
             */
            public int sizeOfTestcaseArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TESTCASE$0);
                }
            }
            
            /**
             * Sets array of all "testcase" element
             */
            public void setTestcaseArray(noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase[] testcaseArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(testcaseArray, TESTCASE$0);
                }
            }
            
            /**
             * Sets ith "testcase" element
             */
            public void setTestcaseArray(int i, noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase testcase)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase)get_store().find_element_user(TESTCASE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(testcase);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "testcase" element
             */
            public noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase insertNewTestcase(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase)get_store().insert_element_user(TESTCASE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "testcase" element
             */
            public noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase addNewTestcase()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase)get_store().add_element_user(TESTCASE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "testcase" element
             */
            public void removeTestcase(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TESTCASE$0, i);
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
             * An XML testcase(@).
             *
             * This is a complex type.
             */
            public static class TestcaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase
            {
                private static final long serialVersionUID = 1L;
                
                public TestcaseImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TESTMETRICS$0 = 
                    new javax.xml.namespace.QName("", "testmetrics");
                private static final javax.xml.namespace.QName TESTNAME$2 = 
                    new javax.xml.namespace.QName("", "testname");
                private static final javax.xml.namespace.QName STATUS$4 = 
                    new javax.xml.namespace.QName("", "status");
                private static final javax.xml.namespace.QName PREVSTATUS$6 = 
                    new javax.xml.namespace.QName("", "prevstatus");
                private static final javax.xml.namespace.QName PLATFORM$8 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName PACKAGE$10 = 
                    new javax.xml.namespace.QName("", "package");
                private static final javax.xml.namespace.QName LASTRUN$12 = 
                    new javax.xml.namespace.QName("", "lastrun");
                private static final javax.xml.namespace.QName VIOLATIONPERCENT$14 = 
                    new javax.xml.namespace.QName("", "violationpercent");
                private static final javax.xml.namespace.QName VIOLATEDABOVE$16 = 
                    new javax.xml.namespace.QName("", "violatedabove");
                private static final javax.xml.namespace.QName VIOLATEDBELOW$18 = 
                    new javax.xml.namespace.QName("", "violatedbelow");
                private static final javax.xml.namespace.QName FAILED$20 = 
                    new javax.xml.namespace.QName("", "failed");
                private static final javax.xml.namespace.QName VOLATILITY$22 = 
                    new javax.xml.namespace.QName("", "volatility");
                private static final javax.xml.namespace.QName ASSIGNEES$24 = 
                    new javax.xml.namespace.QName("", "assignees");
                
                
                /**
                 * Gets array of all "testmetrics" elements
                 */
                public noNamespace.TestmetricsDocument.Testmetrics[] getTestmetricsArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TESTMETRICS$0, targetList);
                      noNamespace.TestmetricsDocument.Testmetrics[] result = new noNamespace.TestmetricsDocument.Testmetrics[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "testmetrics" element
                 */
                public noNamespace.TestmetricsDocument.Testmetrics getTestmetricsArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TestmetricsDocument.Testmetrics target = null;
                      target = (noNamespace.TestmetricsDocument.Testmetrics)get_store().find_element_user(TESTMETRICS$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "testmetrics" element
                 */
                public int sizeOfTestmetricsArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TESTMETRICS$0);
                    }
                }
                
                /**
                 * Sets array of all "testmetrics" element
                 */
                public void setTestmetricsArray(noNamespace.TestmetricsDocument.Testmetrics[] testmetricsArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(testmetricsArray, TESTMETRICS$0);
                    }
                }
                
                /**
                 * Sets ith "testmetrics" element
                 */
                public void setTestmetricsArray(int i, noNamespace.TestmetricsDocument.Testmetrics testmetrics)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TestmetricsDocument.Testmetrics target = null;
                      target = (noNamespace.TestmetricsDocument.Testmetrics)get_store().find_element_user(TESTMETRICS$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(testmetrics);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "testmetrics" element
                 */
                public noNamespace.TestmetricsDocument.Testmetrics insertNewTestmetrics(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TestmetricsDocument.Testmetrics target = null;
                      target = (noNamespace.TestmetricsDocument.Testmetrics)get_store().insert_element_user(TESTMETRICS$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "testmetrics" element
                 */
                public noNamespace.TestmetricsDocument.Testmetrics addNewTestmetrics()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TestmetricsDocument.Testmetrics target = null;
                      target = (noNamespace.TestmetricsDocument.Testmetrics)get_store().add_element_user(TESTMETRICS$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "testmetrics" element
                 */
                public void removeTestmetrics(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TESTMETRICS$0, i);
                    }
                }
                
                /**
                 * Gets the "testname" attribute
                 */
                public java.lang.String getTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTNAME$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "testname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTNAME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "testname" attribute
                 */
                public boolean isSetTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TESTNAME$2) != null;
                    }
                }
                
                /**
                 * Sets the "testname" attribute
                 */
                public void setTestname(java.lang.String testname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTNAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TESTNAME$2);
                      }
                      target.setStringValue(testname);
                    }
                }
                
                /**
                 * Sets (as xml) the "testname" attribute
                 */
                public void xsetTestname(org.apache.xmlbeans.XmlString testname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTNAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TESTNAME$2);
                      }
                      target.set(testname);
                    }
                }
                
                /**
                 * Unsets the "testname" attribute
                 */
                public void unsetTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TESTNAME$2);
                    }
                }
                
                /**
                 * Gets the "status" attribute
                 */
                public java.lang.String getStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "status" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "status" attribute
                 */
                public boolean isSetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATUS$4) != null;
                    }
                }
                
                /**
                 * Sets the "status" attribute
                 */
                public void setStatus(java.lang.String status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$4);
                      }
                      target.setStringValue(status);
                    }
                }
                
                /**
                 * Sets (as xml) the "status" attribute
                 */
                public void xsetStatus(org.apache.xmlbeans.XmlString status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$4);
                      }
                      target.set(status);
                    }
                }
                
                /**
                 * Unsets the "status" attribute
                 */
                public void unsetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATUS$4);
                    }
                }
                
                /**
                 * Gets the "prevstatus" attribute
                 */
                public java.lang.String getPrevstatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVSTATUS$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "prevstatus" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPrevstatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREVSTATUS$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "prevstatus" attribute
                 */
                public boolean isSetPrevstatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PREVSTATUS$6) != null;
                    }
                }
                
                /**
                 * Sets the "prevstatus" attribute
                 */
                public void setPrevstatus(java.lang.String prevstatus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREVSTATUS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREVSTATUS$6);
                      }
                      target.setStringValue(prevstatus);
                    }
                }
                
                /**
                 * Sets (as xml) the "prevstatus" attribute
                 */
                public void xsetPrevstatus(org.apache.xmlbeans.XmlString prevstatus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREVSTATUS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREVSTATUS$6);
                      }
                      target.set(prevstatus);
                    }
                }
                
                /**
                 * Unsets the "prevstatus" attribute
                 */
                public void unsetPrevstatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PREVSTATUS$6);
                    }
                }
                
                /**
                 * Gets the "platform" attribute
                 */
                public java.lang.String getPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "platform" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "platform" attribute
                 */
                public boolean isSetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PLATFORM$8) != null;
                    }
                }
                
                /**
                 * Sets the "platform" attribute
                 */
                public void setPlatform(java.lang.String platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$8);
                      }
                      target.setStringValue(platform);
                    }
                }
                
                /**
                 * Sets (as xml) the "platform" attribute
                 */
                public void xsetPlatform(org.apache.xmlbeans.XmlString platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORM$8);
                      }
                      target.set(platform);
                    }
                }
                
                /**
                 * Unsets the "platform" attribute
                 */
                public void unsetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PLATFORM$8);
                    }
                }
                
                /**
                 * Gets the "package" attribute
                 */
                public java.lang.String getPackage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "package" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPackage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "package" attribute
                 */
                public boolean isSetPackage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PACKAGE$10) != null;
                    }
                }
                
                /**
                 * Sets the "package" attribute
                 */
                public void setPackage(java.lang.String xpackage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$10);
                      }
                      target.setStringValue(xpackage);
                    }
                }
                
                /**
                 * Sets (as xml) the "package" attribute
                 */
                public void xsetPackage(org.apache.xmlbeans.XmlString xpackage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PACKAGE$10);
                      }
                      target.set(xpackage);
                    }
                }
                
                /**
                 * Unsets the "package" attribute
                 */
                public void unsetPackage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PACKAGE$10);
                    }
                }
                
                /**
                 * Gets the "lastrun" attribute
                 */
                public java.util.Calendar getLastrun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUN$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "lastrun" attribute
                 */
                public org.apache.xmlbeans.XmlDateTime xgetLastrun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTRUN$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "lastrun" attribute
                 */
                public boolean isSetLastrun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LASTRUN$12) != null;
                    }
                }
                
                /**
                 * Sets the "lastrun" attribute
                 */
                public void setLastrun(java.util.Calendar lastrun)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTRUN$12);
                      }
                      target.setCalendarValue(lastrun);
                    }
                }
                
                /**
                 * Sets (as xml) the "lastrun" attribute
                 */
                public void xsetLastrun(org.apache.xmlbeans.XmlDateTime lastrun)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTRUN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(LASTRUN$12);
                      }
                      target.set(lastrun);
                    }
                }
                
                /**
                 * Unsets the "lastrun" attribute
                 */
                public void unsetLastrun()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LASTRUN$12);
                    }
                }
                
                /**
                 * Gets the "violationpercent" attribute
                 */
                public java.lang.String getViolationpercent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONPERCENT$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "violationpercent" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetViolationpercent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIOLATIONPERCENT$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "violationpercent" attribute
                 */
                public boolean isSetViolationpercent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIOLATIONPERCENT$14) != null;
                    }
                }
                
                /**
                 * Sets the "violationpercent" attribute
                 */
                public void setViolationpercent(java.lang.String violationpercent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONPERCENT$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONPERCENT$14);
                      }
                      target.setStringValue(violationpercent);
                    }
                }
                
                /**
                 * Sets (as xml) the "violationpercent" attribute
                 */
                public void xsetViolationpercent(org.apache.xmlbeans.XmlString violationpercent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIOLATIONPERCENT$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIOLATIONPERCENT$14);
                      }
                      target.set(violationpercent);
                    }
                }
                
                /**
                 * Unsets the "violationpercent" attribute
                 */
                public void unsetViolationpercent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIOLATIONPERCENT$14);
                    }
                }
                
                /**
                 * Gets the "violatedabove" attribute
                 */
                public java.math.BigInteger getViolatedabove()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDABOVE$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "violatedabove" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetViolatedabove()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDABOVE$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "violatedabove" attribute
                 */
                public boolean isSetViolatedabove()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIOLATEDABOVE$16) != null;
                    }
                }
                
                /**
                 * Sets the "violatedabove" attribute
                 */
                public void setViolatedabove(java.math.BigInteger violatedabove)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDABOVE$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATEDABOVE$16);
                      }
                      target.setBigIntegerValue(violatedabove);
                    }
                }
                
                /**
                 * Sets (as xml) the "violatedabove" attribute
                 */
                public void xsetViolatedabove(org.apache.xmlbeans.XmlInteger violatedabove)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDABOVE$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIOLATEDABOVE$16);
                      }
                      target.set(violatedabove);
                    }
                }
                
                /**
                 * Unsets the "violatedabove" attribute
                 */
                public void unsetViolatedabove()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIOLATEDABOVE$16);
                    }
                }
                
                /**
                 * Gets the "violatedbelow" attribute
                 */
                public java.math.BigInteger getViolatedbelow()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDBELOW$18);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "violatedbelow" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetViolatedbelow()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDBELOW$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "violatedbelow" attribute
                 */
                public boolean isSetViolatedbelow()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIOLATEDBELOW$18) != null;
                    }
                }
                
                /**
                 * Sets the "violatedbelow" attribute
                 */
                public void setViolatedbelow(java.math.BigInteger violatedbelow)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDBELOW$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATEDBELOW$18);
                      }
                      target.setBigIntegerValue(violatedbelow);
                    }
                }
                
                /**
                 * Sets (as xml) the "violatedbelow" attribute
                 */
                public void xsetViolatedbelow(org.apache.xmlbeans.XmlInteger violatedbelow)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDBELOW$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIOLATEDBELOW$18);
                      }
                      target.set(violatedbelow);
                    }
                }
                
                /**
                 * Unsets the "violatedbelow" attribute
                 */
                public void unsetViolatedbelow()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIOLATEDBELOW$18);
                    }
                }
                
                /**
                 * Gets the "failed" attribute
                 */
                public java.math.BigInteger getFailed()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILED$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "failed" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetFailed()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FAILED$20);
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
                      return get_store().find_attribute_user(FAILED$20) != null;
                    }
                }
                
                /**
                 * Sets the "failed" attribute
                 */
                public void setFailed(java.math.BigInteger failed)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILED$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILED$20);
                      }
                      target.setBigIntegerValue(failed);
                    }
                }
                
                /**
                 * Sets (as xml) the "failed" attribute
                 */
                public void xsetFailed(org.apache.xmlbeans.XmlInteger failed)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FAILED$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(FAILED$20);
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
                      get_store().remove_attribute(FAILED$20);
                    }
                }
                
                /**
                 * Gets the "volatility" attribute
                 */
                public java.lang.String getVolatility()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLATILITY$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "volatility" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVolatility()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VOLATILITY$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "volatility" attribute
                 */
                public boolean isSetVolatility()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VOLATILITY$22) != null;
                    }
                }
                
                /**
                 * Sets the "volatility" attribute
                 */
                public void setVolatility(java.lang.String volatility)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VOLATILITY$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VOLATILITY$22);
                      }
                      target.setStringValue(volatility);
                    }
                }
                
                /**
                 * Sets (as xml) the "volatility" attribute
                 */
                public void xsetVolatility(org.apache.xmlbeans.XmlString volatility)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VOLATILITY$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VOLATILITY$22);
                      }
                      target.set(volatility);
                    }
                }
                
                /**
                 * Unsets the "volatility" attribute
                 */
                public void unsetVolatility()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VOLATILITY$22);
                    }
                }
                
                /**
                 * Gets the "assignees" attribute
                 */
                public java.lang.String getAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "assignees" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "assignees" attribute
                 */
                public boolean isSetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ASSIGNEES$24) != null;
                    }
                }
                
                /**
                 * Sets the "assignees" attribute
                 */
                public void setAssignees(java.lang.String assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNEES$24);
                      }
                      target.setStringValue(assignees);
                    }
                }
                
                /**
                 * Sets (as xml) the "assignees" attribute
                 */
                public void xsetAssignees(org.apache.xmlbeans.XmlString assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ASSIGNEES$24);
                      }
                      target.set(assignees);
                    }
                }
                
                /**
                 * Unsets the "assignees" attribute
                 */
                public void unsetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ASSIGNEES$24);
                    }
                }
            }
        }
        /**
         * An XML testruninfos(@).
         *
         * This is a complex type.
         */
        public static class TestruninfosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestautomationDocument.Testautomation.Testruninfos
        {
            private static final long serialVersionUID = 1L;
            
            public TestruninfosImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TESTRUNINFO$0 = 
                new javax.xml.namespace.QName("", "testruninfo");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "testruninfo" elements
             */
            public noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo[] getTestruninfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(TESTRUNINFO$0, targetList);
                    noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo[] result = new noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "testruninfo" element
             */
            public noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo getTestruninfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo)get_store().find_element_user(TESTRUNINFO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "testruninfo" element
             */
            public int sizeOfTestruninfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TESTRUNINFO$0);
                }
            }
            
            /**
             * Sets array of all "testruninfo" element
             */
            public void setTestruninfoArray(noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo[] testruninfoArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(testruninfoArray, TESTRUNINFO$0);
                }
            }
            
            /**
             * Sets ith "testruninfo" element
             */
            public void setTestruninfoArray(int i, noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo testruninfo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo)get_store().find_element_user(TESTRUNINFO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(testruninfo);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "testruninfo" element
             */
            public noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo insertNewTestruninfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo)get_store().insert_element_user(TESTRUNINFO$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "testruninfo" element
             */
            public noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo addNewTestruninfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo target = null;
                    target = (noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo)get_store().add_element_user(TESTRUNINFO$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "testruninfo" element
             */
            public void removeTestruninfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TESTRUNINFO$0, i);
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
             * An XML testruninfo(@).
             *
             * This is a complex type.
             */
            public static class TestruninfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo
            {
                private static final long serialVersionUID = 1L;
                
                public TestruninfoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CUSTOMPROPERTY$0 = 
                    new javax.xml.namespace.QName("", "customproperty");
                private static final javax.xml.namespace.QName ID$2 = 
                    new javax.xml.namespace.QName("", "id");
                private static final javax.xml.namespace.QName VERSIONMAJOR$4 = 
                    new javax.xml.namespace.QName("", "versionmajor");
                private static final javax.xml.namespace.QName VERSIONMINOR$6 = 
                    new javax.xml.namespace.QName("", "versionminor");
                private static final javax.xml.namespace.QName VERSIONREVISION$8 = 
                    new javax.xml.namespace.QName("", "versionrevision");
                private static final javax.xml.namespace.QName VERSIONBUILD$10 = 
                    new javax.xml.namespace.QName("", "versionbuild");
                private static final javax.xml.namespace.QName VERSIONMILESTONE$12 = 
                    new javax.xml.namespace.QName("", "versionmilestone");
                private static final javax.xml.namespace.QName SESSION$14 = 
                    new javax.xml.namespace.QName("", "session");
                private static final javax.xml.namespace.QName MARKER$16 = 
                    new javax.xml.namespace.QName("", "marker");
                
                
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
                 * Gets the "id" attribute
                 */
                public java.lang.String getId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "id" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "id" attribute
                 */
                public boolean isSetId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ID$2) != null;
                    }
                }
                
                /**
                 * Sets the "id" attribute
                 */
                public void setId(java.lang.String id)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
                      }
                      target.setStringValue(id);
                    }
                }
                
                /**
                 * Sets (as xml) the "id" attribute
                 */
                public void xsetId(org.apache.xmlbeans.XmlString id)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
                      }
                      target.set(id);
                    }
                }
                
                /**
                 * Unsets the "id" attribute
                 */
                public void unsetId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ID$2);
                    }
                }
                
                /**
                 * Gets the "versionmajor" attribute
                 */
                public java.lang.String getVersionmajor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONMAJOR$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "versionmajor" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVersionmajor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONMAJOR$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "versionmajor" attribute
                 */
                public boolean isSetVersionmajor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VERSIONMAJOR$4) != null;
                    }
                }
                
                /**
                 * Sets the "versionmajor" attribute
                 */
                public void setVersionmajor(java.lang.String versionmajor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONMAJOR$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONMAJOR$4);
                      }
                      target.setStringValue(versionmajor);
                    }
                }
                
                /**
                 * Sets (as xml) the "versionmajor" attribute
                 */
                public void xsetVersionmajor(org.apache.xmlbeans.XmlString versionmajor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONMAJOR$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSIONMAJOR$4);
                      }
                      target.set(versionmajor);
                    }
                }
                
                /**
                 * Unsets the "versionmajor" attribute
                 */
                public void unsetVersionmajor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VERSIONMAJOR$4);
                    }
                }
                
                /**
                 * Gets the "versionminor" attribute
                 */
                public java.lang.String getVersionminor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONMINOR$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "versionminor" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVersionminor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONMINOR$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "versionminor" attribute
                 */
                public boolean isSetVersionminor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VERSIONMINOR$6) != null;
                    }
                }
                
                /**
                 * Sets the "versionminor" attribute
                 */
                public void setVersionminor(java.lang.String versionminor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONMINOR$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONMINOR$6);
                      }
                      target.setStringValue(versionminor);
                    }
                }
                
                /**
                 * Sets (as xml) the "versionminor" attribute
                 */
                public void xsetVersionminor(org.apache.xmlbeans.XmlString versionminor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONMINOR$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSIONMINOR$6);
                      }
                      target.set(versionminor);
                    }
                }
                
                /**
                 * Unsets the "versionminor" attribute
                 */
                public void unsetVersionminor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VERSIONMINOR$6);
                    }
                }
                
                /**
                 * Gets the "versionrevision" attribute
                 */
                public java.lang.String getVersionrevision()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONREVISION$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "versionrevision" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVersionrevision()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONREVISION$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "versionrevision" attribute
                 */
                public boolean isSetVersionrevision()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VERSIONREVISION$8) != null;
                    }
                }
                
                /**
                 * Sets the "versionrevision" attribute
                 */
                public void setVersionrevision(java.lang.String versionrevision)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONREVISION$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONREVISION$8);
                      }
                      target.setStringValue(versionrevision);
                    }
                }
                
                /**
                 * Sets (as xml) the "versionrevision" attribute
                 */
                public void xsetVersionrevision(org.apache.xmlbeans.XmlString versionrevision)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONREVISION$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSIONREVISION$8);
                      }
                      target.set(versionrevision);
                    }
                }
                
                /**
                 * Unsets the "versionrevision" attribute
                 */
                public void unsetVersionrevision()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VERSIONREVISION$8);
                    }
                }
                
                /**
                 * Gets the "versionbuild" attribute
                 */
                public java.lang.String getVersionbuild()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONBUILD$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "versionbuild" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVersionbuild()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONBUILD$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "versionbuild" attribute
                 */
                public boolean isSetVersionbuild()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VERSIONBUILD$10) != null;
                    }
                }
                
                /**
                 * Sets the "versionbuild" attribute
                 */
                public void setVersionbuild(java.lang.String versionbuild)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONBUILD$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONBUILD$10);
                      }
                      target.setStringValue(versionbuild);
                    }
                }
                
                /**
                 * Sets (as xml) the "versionbuild" attribute
                 */
                public void xsetVersionbuild(org.apache.xmlbeans.XmlString versionbuild)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONBUILD$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSIONBUILD$10);
                      }
                      target.set(versionbuild);
                    }
                }
                
                /**
                 * Unsets the "versionbuild" attribute
                 */
                public void unsetVersionbuild()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VERSIONBUILD$10);
                    }
                }
                
                /**
                 * Gets the "versionmilestone" attribute
                 */
                public java.lang.String getVersionmilestone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONMILESTONE$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "versionmilestone" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVersionmilestone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONMILESTONE$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "versionmilestone" attribute
                 */
                public boolean isSetVersionmilestone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VERSIONMILESTONE$12) != null;
                    }
                }
                
                /**
                 * Sets the "versionmilestone" attribute
                 */
                public void setVersionmilestone(java.lang.String versionmilestone)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONMILESTONE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONMILESTONE$12);
                      }
                      target.setStringValue(versionmilestone);
                    }
                }
                
                /**
                 * Sets (as xml) the "versionmilestone" attribute
                 */
                public void xsetVersionmilestone(org.apache.xmlbeans.XmlString versionmilestone)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSIONMILESTONE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSIONMILESTONE$12);
                      }
                      target.set(versionmilestone);
                    }
                }
                
                /**
                 * Unsets the "versionmilestone" attribute
                 */
                public void unsetVersionmilestone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VERSIONMILESTONE$12);
                    }
                }
                
                /**
                 * Gets the "session" attribute
                 */
                public java.lang.String getSession()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSION$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "session" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSession()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSION$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "session" attribute
                 */
                public boolean isSetSession()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SESSION$14) != null;
                    }
                }
                
                /**
                 * Sets the "session" attribute
                 */
                public void setSession(java.lang.String session)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSION$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSION$14);
                      }
                      target.setStringValue(session);
                    }
                }
                
                /**
                 * Sets (as xml) the "session" attribute
                 */
                public void xsetSession(org.apache.xmlbeans.XmlString session)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSION$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SESSION$14);
                      }
                      target.set(session);
                    }
                }
                
                /**
                 * Unsets the "session" attribute
                 */
                public void unsetSession()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SESSION$14);
                    }
                }
                
                /**
                 * Gets the "marker" attribute
                 */
                public java.lang.String getMarker()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARKER$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "marker" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMarker()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MARKER$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "marker" attribute
                 */
                public boolean isSetMarker()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MARKER$16) != null;
                    }
                }
                
                /**
                 * Sets the "marker" attribute
                 */
                public void setMarker(java.lang.String marker)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARKER$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARKER$16);
                      }
                      target.setStringValue(marker);
                    }
                }
                
                /**
                 * Sets (as xml) the "marker" attribute
                 */
                public void xsetMarker(org.apache.xmlbeans.XmlString marker)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MARKER$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MARKER$16);
                      }
                      target.set(marker);
                    }
                }
                
                /**
                 * Unsets the "marker" attribute
                 */
                public void unsetMarker()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MARKER$16);
                    }
                }
            }
        }
    }
}
