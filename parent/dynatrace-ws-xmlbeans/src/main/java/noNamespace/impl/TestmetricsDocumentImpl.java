/*
 * An XML document type.
 * Localname: testmetrics
 * Namespace: 
 * Java type: noNamespace.TestmetricsDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one testmetrics(@) element.
 *
 * This is a complex type.
 */
public class TestmetricsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestmetricsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestmetricsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTMETRICS$0 = 
        new javax.xml.namespace.QName("", "testmetrics");
    
    
    /**
     * Gets the "testmetrics" element
     */
    public noNamespace.TestmetricsDocument.Testmetrics getTestmetrics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestmetricsDocument.Testmetrics target = null;
            target = (noNamespace.TestmetricsDocument.Testmetrics)get_store().find_element_user(TESTMETRICS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testmetrics" element
     */
    public void setTestmetrics(noNamespace.TestmetricsDocument.Testmetrics testmetrics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TestmetricsDocument.Testmetrics target = null;
            target = (noNamespace.TestmetricsDocument.Testmetrics)get_store().find_element_user(TESTMETRICS$0, 0);
            if (target == null)
            {
                target = (noNamespace.TestmetricsDocument.Testmetrics)get_store().add_element_user(TESTMETRICS$0);
            }
            target.set(testmetrics);
        }
    }
    
    /**
     * Appends and returns a new empty "testmetrics" element
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
     * An XML testmetrics(@).
     *
     * This is a complex type.
     */
    public static class TestmetricsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestmetricsDocument.Testmetrics
    {
        private static final long serialVersionUID = 1L;
        
        public TestmetricsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TESTMETRIC$0 = 
            new javax.xml.namespace.QName("", "testmetric");
        private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
            new javax.xml.namespace.QName("", "structuretype");
        
        
        /**
         * Gets array of all "testmetric" elements
         */
        public noNamespace.TestmetricsDocument.Testmetrics.Testmetric[] getTestmetricArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TESTMETRIC$0, targetList);
                noNamespace.TestmetricsDocument.Testmetrics.Testmetric[] result = new noNamespace.TestmetricsDocument.Testmetrics.Testmetric[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "testmetric" element
         */
        public noNamespace.TestmetricsDocument.Testmetrics.Testmetric getTestmetricArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestmetricsDocument.Testmetrics.Testmetric target = null;
                target = (noNamespace.TestmetricsDocument.Testmetrics.Testmetric)get_store().find_element_user(TESTMETRIC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "testmetric" element
         */
        public int sizeOfTestmetricArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTMETRIC$0);
            }
        }
        
        /**
         * Sets array of all "testmetric" element
         */
        public void setTestmetricArray(noNamespace.TestmetricsDocument.Testmetrics.Testmetric[] testmetricArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(testmetricArray, TESTMETRIC$0);
            }
        }
        
        /**
         * Sets ith "testmetric" element
         */
        public void setTestmetricArray(int i, noNamespace.TestmetricsDocument.Testmetrics.Testmetric testmetric)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestmetricsDocument.Testmetrics.Testmetric target = null;
                target = (noNamespace.TestmetricsDocument.Testmetrics.Testmetric)get_store().find_element_user(TESTMETRIC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(testmetric);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testmetric" element
         */
        public noNamespace.TestmetricsDocument.Testmetrics.Testmetric insertNewTestmetric(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestmetricsDocument.Testmetrics.Testmetric target = null;
                target = (noNamespace.TestmetricsDocument.Testmetrics.Testmetric)get_store().insert_element_user(TESTMETRIC$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testmetric" element
         */
        public noNamespace.TestmetricsDocument.Testmetrics.Testmetric addNewTestmetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestmetricsDocument.Testmetrics.Testmetric target = null;
                target = (noNamespace.TestmetricsDocument.Testmetrics.Testmetric)get_store().add_element_user(TESTMETRIC$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "testmetric" element
         */
        public void removeTestmetric(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTMETRIC$0, i);
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
         * An XML testmetric(@).
         *
         * This is a complex type.
         */
        public static class TestmetricImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TestmetricsDocument.Testmetrics.Testmetric
        {
            private static final long serialVersionUID = 1L;
            
            public TestmetricImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TESTRUN$0 = 
                new javax.xml.namespace.QName("", "testrun");
            private static final javax.xml.namespace.QName VIOLATIONPERCENT$2 = 
                new javax.xml.namespace.QName("", "violationpercent");
            private static final javax.xml.namespace.QName VIOLATEDABOVE$4 = 
                new javax.xml.namespace.QName("", "violatedabove");
            private static final javax.xml.namespace.QName TESTNAME$6 = 
                new javax.xml.namespace.QName("", "testname");
            private static final javax.xml.namespace.QName SHORTTESTNAME$8 = 
                new javax.xml.namespace.QName("", "shorttestname");
            private static final javax.xml.namespace.QName METRICGROUP$10 = 
                new javax.xml.namespace.QName("", "metricgroup");
            private static final javax.xml.namespace.QName MEASURE$12 = 
                new javax.xml.namespace.QName("", "measure");
            private static final javax.xml.namespace.QName PLATFORM$14 = 
                new javax.xml.namespace.QName("", "platform");
            private static final javax.xml.namespace.QName HIGH$16 = 
                new javax.xml.namespace.QName("", "high");
            private static final javax.xml.namespace.QName LAST$18 = 
                new javax.xml.namespace.QName("", "last");
            private static final javax.xml.namespace.QName UNIT$20 = 
                new javax.xml.namespace.QName("", "unit");
            private static final javax.xml.namespace.QName VOLATILITY$22 = 
                new javax.xml.namespace.QName("", "volatility");
            private static final javax.xml.namespace.QName FAILED$24 = 
                new javax.xml.namespace.QName("", "failed");
            private static final javax.xml.namespace.QName HOST$26 = 
                new javax.xml.namespace.QName("", "host");
            private static final javax.xml.namespace.QName LOW$28 = 
                new javax.xml.namespace.QName("", "low");
            private static final javax.xml.namespace.QName VALIDRUNS$30 = 
                new javax.xml.namespace.QName("", "validruns");
            private static final javax.xml.namespace.QName CLASS1$32 = 
                new javax.xml.namespace.QName("", "class");
            private static final javax.xml.namespace.QName PACKAGE$34 = 
                new javax.xml.namespace.QName("", "package");
            private static final javax.xml.namespace.QName VIOLATEDBELOW$36 = 
                new javax.xml.namespace.QName("", "violatedbelow");
            private static final javax.xml.namespace.QName COLOR$38 = 
                new javax.xml.namespace.QName("", "color");
            private static final javax.xml.namespace.QName STATUS$40 = 
                new javax.xml.namespace.QName("", "status");
            private static final javax.xml.namespace.QName LASTRUN$42 = 
                new javax.xml.namespace.QName("", "lastrun");
            private static final javax.xml.namespace.QName AGENT$44 = 
                new javax.xml.namespace.QName("", "agent");
            private static final javax.xml.namespace.QName COLLECTOR$46 = 
                new javax.xml.namespace.QName("", "collector");
            private static final javax.xml.namespace.QName ASSIGNEES$48 = 
                new javax.xml.namespace.QName("", "assignees");
            private static final javax.xml.namespace.QName TREND$50 = 
                new javax.xml.namespace.QName("", "trend");
            
            
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
             * Gets the "violationpercent" attribute
             */
            public java.lang.String getViolationpercent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONPERCENT$2);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIOLATIONPERCENT$2);
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
                    return get_store().find_attribute_user(VIOLATIONPERCENT$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONPERCENT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONPERCENT$2);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIOLATIONPERCENT$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIOLATIONPERCENT$2);
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
                    get_store().remove_attribute(VIOLATIONPERCENT$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDABOVE$4);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDABOVE$4);
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
                    return get_store().find_attribute_user(VIOLATEDABOVE$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDABOVE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATEDABOVE$4);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDABOVE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIOLATEDABOVE$4);
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
                    get_store().remove_attribute(VIOLATEDABOVE$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTNAME$6);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTNAME$6);
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
                    return get_store().find_attribute_user(TESTNAME$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTNAME$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TESTNAME$6);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTNAME$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TESTNAME$6);
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
                    get_store().remove_attribute(TESTNAME$6);
                }
            }
            
            /**
             * Gets the "shorttestname" attribute
             */
            public java.lang.String getShorttestname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTTESTNAME$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "shorttestname" attribute
             */
            public org.apache.xmlbeans.XmlString xgetShorttestname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTTESTNAME$8);
                    return target;
                }
            }
            
            /**
             * True if has "shorttestname" attribute
             */
            public boolean isSetShorttestname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(SHORTTESTNAME$8) != null;
                }
            }
            
            /**
             * Sets the "shorttestname" attribute
             */
            public void setShorttestname(java.lang.String shorttestname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHORTTESTNAME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHORTTESTNAME$8);
                    }
                    target.setStringValue(shorttestname);
                }
            }
            
            /**
             * Sets (as xml) the "shorttestname" attribute
             */
            public void xsetShorttestname(org.apache.xmlbeans.XmlString shorttestname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHORTTESTNAME$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SHORTTESTNAME$8);
                    }
                    target.set(shorttestname);
                }
            }
            
            /**
             * Unsets the "shorttestname" attribute
             */
            public void unsetShorttestname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(SHORTTESTNAME$8);
                }
            }
            
            /**
             * Gets the "metricgroup" attribute
             */
            public java.lang.String getMetricgroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METRICGROUP$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "metricgroup" attribute
             */
            public org.apache.xmlbeans.XmlString xgetMetricgroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METRICGROUP$10);
                    return target;
                }
            }
            
            /**
             * True if has "metricgroup" attribute
             */
            public boolean isSetMetricgroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(METRICGROUP$10) != null;
                }
            }
            
            /**
             * Sets the "metricgroup" attribute
             */
            public void setMetricgroup(java.lang.String metricgroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METRICGROUP$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METRICGROUP$10);
                    }
                    target.setStringValue(metricgroup);
                }
            }
            
            /**
             * Sets (as xml) the "metricgroup" attribute
             */
            public void xsetMetricgroup(org.apache.xmlbeans.XmlString metricgroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METRICGROUP$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METRICGROUP$10);
                    }
                    target.set(metricgroup);
                }
            }
            
            /**
             * Unsets the "metricgroup" attribute
             */
            public void unsetMetricgroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(METRICGROUP$10);
                }
            }
            
            /**
             * Gets the "measure" attribute
             */
            public java.lang.String getMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURE$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "measure" attribute
             */
            public org.apache.xmlbeans.XmlString xgetMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASURE$12);
                    return target;
                }
            }
            
            /**
             * True if has "measure" attribute
             */
            public boolean isSetMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MEASURE$12) != null;
                }
            }
            
            /**
             * Sets the "measure" attribute
             */
            public void setMeasure(java.lang.String measure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASURE$12);
                    }
                    target.setStringValue(measure);
                }
            }
            
            /**
             * Sets (as xml) the "measure" attribute
             */
            public void xsetMeasure(org.apache.xmlbeans.XmlString measure)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASURE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEASURE$12);
                    }
                    target.set(measure);
                }
            }
            
            /**
             * Unsets the "measure" attribute
             */
            public void unsetMeasure()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MEASURE$12);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$14);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$14);
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
                    return get_store().find_attribute_user(PLATFORM$14) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$14);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORM$14);
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
                    get_store().remove_attribute(PLATFORM$14);
                }
            }
            
            /**
             * Gets the "high" attribute
             */
            public double getHigh()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGH$16);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "high" attribute
             */
            public org.apache.xmlbeans.XmlDouble xgetHigh()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HIGH$16);
                    return target;
                }
            }
            
            /**
             * True if has "high" attribute
             */
            public boolean isSetHigh()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(HIGH$16) != null;
                }
            }
            
            /**
             * Sets the "high" attribute
             */
            public void setHigh(double high)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGH$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIGH$16);
                    }
                    target.setDoubleValue(high);
                }
            }
            
            /**
             * Sets (as xml) the "high" attribute
             */
            public void xsetHigh(org.apache.xmlbeans.XmlDouble high)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(HIGH$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(HIGH$16);
                    }
                    target.set(high);
                }
            }
            
            /**
             * Unsets the "high" attribute
             */
            public void unsetHigh()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(HIGH$16);
                }
            }
            
            /**
             * Gets the "last" attribute
             */
            public double getLast()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST$18);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "last" attribute
             */
            public org.apache.xmlbeans.XmlDouble xgetLast()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LAST$18);
                    return target;
                }
            }
            
            /**
             * True if has "last" attribute
             */
            public boolean isSetLast()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LAST$18) != null;
                }
            }
            
            /**
             * Sets the "last" attribute
             */
            public void setLast(double last)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LAST$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LAST$18);
                    }
                    target.setDoubleValue(last);
                }
            }
            
            /**
             * Sets (as xml) the "last" attribute
             */
            public void xsetLast(org.apache.xmlbeans.XmlDouble last)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LAST$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LAST$18);
                    }
                    target.set(last);
                }
            }
            
            /**
             * Unsets the "last" attribute
             */
            public void unsetLast()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LAST$18);
                }
            }
            
            /**
             * Gets the "unit" attribute
             */
            public java.lang.String getUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$20);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "unit" attribute
             */
            public org.apache.xmlbeans.XmlString xgetUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$20);
                    return target;
                }
            }
            
            /**
             * True if has "unit" attribute
             */
            public boolean isSetUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(UNIT$20) != null;
                }
            }
            
            /**
             * Sets the "unit" attribute
             */
            public void setUnit(java.lang.String unit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$20);
                    }
                    target.setStringValue(unit);
                }
            }
            
            /**
             * Sets (as xml) the "unit" attribute
             */
            public void xsetUnit(org.apache.xmlbeans.XmlString unit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIT$20);
                    }
                    target.set(unit);
                }
            }
            
            /**
             * Unsets the "unit" attribute
             */
            public void unsetUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(UNIT$20);
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
             * Gets the "failed" attribute
             */
            public java.math.BigInteger getFailed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILED$24);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FAILED$24);
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
                    return get_store().find_attribute_user(FAILED$24) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILED$24);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILED$24);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FAILED$24);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(FAILED$24);
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
                    get_store().remove_attribute(FAILED$24);
                }
            }
            
            /**
             * Gets the "host" attribute
             */
            public java.lang.String getHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$26);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "host" attribute
             */
            public org.apache.xmlbeans.XmlString xgetHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$26);
                    return target;
                }
            }
            
            /**
             * True if has "host" attribute
             */
            public boolean isSetHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(HOST$26) != null;
                }
            }
            
            /**
             * Sets the "host" attribute
             */
            public void setHost(java.lang.String host)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$26);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOST$26);
                    }
                    target.setStringValue(host);
                }
            }
            
            /**
             * Sets (as xml) the "host" attribute
             */
            public void xsetHost(org.apache.xmlbeans.XmlString host)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$26);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOST$26);
                    }
                    target.set(host);
                }
            }
            
            /**
             * Unsets the "host" attribute
             */
            public void unsetHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(HOST$26);
                }
            }
            
            /**
             * Gets the "low" attribute
             */
            public double getLow()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOW$28);
                    if (target == null)
                    {
                      return 0.0;
                    }
                    return target.getDoubleValue();
                }
            }
            
            /**
             * Gets (as xml) the "low" attribute
             */
            public org.apache.xmlbeans.XmlDouble xgetLow()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOW$28);
                    return target;
                }
            }
            
            /**
             * True if has "low" attribute
             */
            public boolean isSetLow()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LOW$28) != null;
                }
            }
            
            /**
             * Sets the "low" attribute
             */
            public void setLow(double low)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOW$28);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOW$28);
                    }
                    target.setDoubleValue(low);
                }
            }
            
            /**
             * Sets (as xml) the "low" attribute
             */
            public void xsetLow(org.apache.xmlbeans.XmlDouble low)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDouble target = null;
                    target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOW$28);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOW$28);
                    }
                    target.set(low);
                }
            }
            
            /**
             * Unsets the "low" attribute
             */
            public void unsetLow()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LOW$28);
                }
            }
            
            /**
             * Gets the "validruns" attribute
             */
            public java.math.BigInteger getValidruns()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDRUNS$30);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "validruns" attribute
             */
            public org.apache.xmlbeans.XmlInteger xgetValidruns()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VALIDRUNS$30);
                    return target;
                }
            }
            
            /**
             * True if has "validruns" attribute
             */
            public boolean isSetValidruns()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDRUNS$30) != null;
                }
            }
            
            /**
             * Sets the "validruns" attribute
             */
            public void setValidruns(java.math.BigInteger validruns)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDRUNS$30);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDRUNS$30);
                    }
                    target.setBigIntegerValue(validruns);
                }
            }
            
            /**
             * Sets (as xml) the "validruns" attribute
             */
            public void xsetValidruns(org.apache.xmlbeans.XmlInteger validruns)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VALIDRUNS$30);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VALIDRUNS$30);
                    }
                    target.set(validruns);
                }
            }
            
            /**
             * Unsets the "validruns" attribute
             */
            public void unsetValidruns()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDRUNS$30);
                }
            }
            
            /**
             * Gets the "class" attribute
             */
            public java.lang.String getClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$32);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "class" attribute
             */
            public org.apache.xmlbeans.XmlString xgetClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$32);
                    return target;
                }
            }
            
            /**
             * True if has "class" attribute
             */
            public boolean isSetClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CLASS1$32) != null;
                }
            }
            
            /**
             * Sets the "class" attribute
             */
            public void setClass1(java.lang.String class1)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$32);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$32);
                    }
                    target.setStringValue(class1);
                }
            }
            
            /**
             * Sets (as xml) the "class" attribute
             */
            public void xsetClass1(org.apache.xmlbeans.XmlString class1)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$32);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$32);
                    }
                    target.set(class1);
                }
            }
            
            /**
             * Unsets the "class" attribute
             */
            public void unsetClass1()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CLASS1$32);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$34);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$34);
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
                    return get_store().find_attribute_user(PACKAGE$34) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$34);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$34);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGE$34);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PACKAGE$34);
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
                    get_store().remove_attribute(PACKAGE$34);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDBELOW$36);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDBELOW$36);
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
                    return get_store().find_attribute_user(VIOLATEDBELOW$36) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATEDBELOW$36);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATEDBELOW$36);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIOLATEDBELOW$36);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIOLATEDBELOW$36);
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
                    get_store().remove_attribute(VIOLATEDBELOW$36);
                }
            }
            
            /**
             * Gets the "color" attribute
             */
            public java.lang.String getColor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$38);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "color" attribute
             */
            public org.apache.xmlbeans.XmlString xgetColor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLOR$38);
                    return target;
                }
            }
            
            /**
             * True if has "color" attribute
             */
            public boolean isSetColor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(COLOR$38) != null;
                }
            }
            
            /**
             * Sets the "color" attribute
             */
            public void setColor(java.lang.String color)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$38);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$38);
                    }
                    target.setStringValue(color);
                }
            }
            
            /**
             * Sets (as xml) the "color" attribute
             */
            public void xsetColor(org.apache.xmlbeans.XmlString color)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLOR$38);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLOR$38);
                    }
                    target.set(color);
                }
            }
            
            /**
             * Unsets the "color" attribute
             */
            public void unsetColor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(COLOR$38);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$40);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$40);
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
                    return get_store().find_attribute_user(STATUS$40) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$40);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$40);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$40);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$40);
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
                    get_store().remove_attribute(STATUS$40);
                }
            }
            
            /**
             * Gets the "lastrun" attribute
             */
            public java.lang.String getLastrun()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUN$42);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "lastrun" attribute
             */
            public org.apache.xmlbeans.XmlString xgetLastrun()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTRUN$42);
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
                    return get_store().find_attribute_user(LASTRUN$42) != null;
                }
            }
            
            /**
             * Sets the "lastrun" attribute
             */
            public void setLastrun(java.lang.String lastrun)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUN$42);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTRUN$42);
                    }
                    target.setStringValue(lastrun);
                }
            }
            
            /**
             * Sets (as xml) the "lastrun" attribute
             */
            public void xsetLastrun(org.apache.xmlbeans.XmlString lastrun)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTRUN$42);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTRUN$42);
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
                    get_store().remove_attribute(LASTRUN$42);
                }
            }
            
            /**
             * Gets the "agent" attribute
             */
            public java.lang.String getAgent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$44);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "agent" attribute
             */
            public org.apache.xmlbeans.XmlString xgetAgent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$44);
                    return target;
                }
            }
            
            /**
             * True if has "agent" attribute
             */
            public boolean isSetAgent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(AGENT$44) != null;
                }
            }
            
            /**
             * Sets the "agent" attribute
             */
            public void setAgent(java.lang.String agent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$44);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$44);
                    }
                    target.setStringValue(agent);
                }
            }
            
            /**
             * Sets (as xml) the "agent" attribute
             */
            public void xsetAgent(org.apache.xmlbeans.XmlString agent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$44);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$44);
                    }
                    target.set(agent);
                }
            }
            
            /**
             * Unsets the "agent" attribute
             */
            public void unsetAgent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(AGENT$44);
                }
            }
            
            /**
             * Gets the "collector" attribute
             */
            public java.lang.String getCollector()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLECTOR$46);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "collector" attribute
             */
            public org.apache.xmlbeans.XmlString xgetCollector()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLLECTOR$46);
                    return target;
                }
            }
            
            /**
             * True if has "collector" attribute
             */
            public boolean isSetCollector()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(COLLECTOR$46) != null;
                }
            }
            
            /**
             * Sets the "collector" attribute
             */
            public void setCollector(java.lang.String collector)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLECTOR$46);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLECTOR$46);
                    }
                    target.setStringValue(collector);
                }
            }
            
            /**
             * Sets (as xml) the "collector" attribute
             */
            public void xsetCollector(org.apache.xmlbeans.XmlString collector)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLLECTOR$46);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLLECTOR$46);
                    }
                    target.set(collector);
                }
            }
            
            /**
             * Unsets the "collector" attribute
             */
            public void unsetCollector()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(COLLECTOR$46);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$48);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$48);
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
                    return get_store().find_attribute_user(ASSIGNEES$48) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$48);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNEES$48);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$48);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ASSIGNEES$48);
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
                    get_store().remove_attribute(ASSIGNEES$48);
                }
            }
            
            /**
             * Gets the "trend" attribute
             */
            public java.lang.String getTrend()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TREND$50);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "trend" attribute
             */
            public org.apache.xmlbeans.XmlString xgetTrend()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TREND$50);
                    return target;
                }
            }
            
            /**
             * True if has "trend" attribute
             */
            public boolean isSetTrend()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TREND$50) != null;
                }
            }
            
            /**
             * Sets the "trend" attribute
             */
            public void setTrend(java.lang.String trend)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TREND$50);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TREND$50);
                    }
                    target.setStringValue(trend);
                }
            }
            
            /**
             * Sets (as xml) the "trend" attribute
             */
            public void xsetTrend(org.apache.xmlbeans.XmlString trend)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TREND$50);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TREND$50);
                    }
                    target.set(trend);
                }
            }
            
            /**
             * Unsets the "trend" attribute
             */
            public void unsetTrend()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TREND$50);
                }
            }
        }
    }
}
