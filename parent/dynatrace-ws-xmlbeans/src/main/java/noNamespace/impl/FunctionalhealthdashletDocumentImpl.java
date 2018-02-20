/*
 * An XML document type.
 * Localname: functionalhealthdashlet
 * Namespace: 
 * Java type: noNamespace.FunctionalhealthdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one functionalhealthdashlet(@) element.
 *
 * This is a complex type.
 */
public class FunctionalhealthdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public FunctionalhealthdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNCTIONALHEALTHDASHLET$0 = 
        new javax.xml.namespace.QName("", "functionalhealthdashlet");
    
    
    /**
     * Gets the "functionalhealthdashlet" element
     */
    public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet getFunctionalhealthdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet target = null;
            target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().find_element_user(FUNCTIONALHEALTHDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "functionalhealthdashlet" element
     */
    public void setFunctionalhealthdashlet(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet functionalhealthdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet target = null;
            target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().find_element_user(FUNCTIONALHEALTHDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().add_element_user(FUNCTIONALHEALTHDASHLET$0);
            }
            target.set(functionalhealthdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "functionalhealthdashlet" element
     */
    public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet addNewFunctionalhealthdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet target = null;
            target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().add_element_user(FUNCTIONALHEALTHDASHLET$0);
            return target;
        }
    }
    /**
     * An XML functionalhealthdashlet(@).
     *
     * This is a complex type.
     */
    public static class FunctionalhealthdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public FunctionalhealthdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName HEALTH$4 = 
            new javax.xml.namespace.QName("", "health");
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
         * Gets array of all "health" elements
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health[] getHealthArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HEALTH$4, targetList);
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health[] result = new noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "health" element
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health getHealthArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health)get_store().find_element_user(HEALTH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "health" element
         */
        public int sizeOfHealthArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEALTH$4);
            }
        }
        
        /**
         * Sets array of all "health" element
         */
        public void setHealthArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health[] healthArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(healthArray, HEALTH$4);
            }
        }
        
        /**
         * Sets ith "health" element
         */
        public void setHealthArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health health)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health)get_store().find_element_user(HEALTH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(health);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "health" element
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health insertNewHealth(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health)get_store().insert_element_user(HEALTH$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "health" element
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health addNewHealth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health)get_store().add_element_user(HEALTH$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "health" element
         */
        public void removeHealth(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEALTH$4, i);
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
         * An XML health(@).
         *
         * This is a complex type.
         */
        public static class HealthImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health
        {
            private static final long serialVersionUID = 1L;
            
            public HealthImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEASUREMENT$0 = 
                new javax.xml.namespace.QName("", "measurement");
            private static final javax.xml.namespace.QName ERRORHOTSPOTSBYAPPLICATION$2 = 
                new javax.xml.namespace.QName("", "errorhotspotsbyapplication");
            private static final javax.xml.namespace.QName ERRORHOTSPOTS$4 = 
                new javax.xml.namespace.QName("", "errorhotspots");
            private static final javax.xml.namespace.QName STARTDATE$6 = 
                new javax.xml.namespace.QName("", "startdate");
            private static final javax.xml.namespace.QName ENDDATE$8 = 
                new javax.xml.namespace.QName("", "enddate");
            private static final javax.xml.namespace.QName TYPE$10 = 
                new javax.xml.namespace.QName("", "type");
            
            
            /**
             * Gets array of all "measurement" elements
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement[] getMeasurementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEASUREMENT$0, targetList);
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement[] result = new noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "measurement" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement getMeasurementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "measurement" element
             */
            public int sizeOfMeasurementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEASUREMENT$0);
                }
            }
            
            /**
             * Sets array of all "measurement" element
             */
            public void setMeasurementArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement[] measurementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(measurementArray, MEASUREMENT$0);
                }
            }
            
            /**
             * Sets ith "measurement" element
             */
            public void setMeasurementArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement measurement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(measurement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "measurement" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement insertNewMeasurement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "measurement" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement addNewMeasurement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement)get_store().add_element_user(MEASUREMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "measurement" element
             */
            public void removeMeasurement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEASUREMENT$0, i);
                }
            }
            
            /**
             * Gets array of all "errorhotspotsbyapplication" elements
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication[] getErrorhotspotsbyapplicationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ERRORHOTSPOTSBYAPPLICATION$2, targetList);
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication[] result = new noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "errorhotspotsbyapplication" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication getErrorhotspotsbyapplicationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication)get_store().find_element_user(ERRORHOTSPOTSBYAPPLICATION$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "errorhotspotsbyapplication" element
             */
            public int sizeOfErrorhotspotsbyapplicationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ERRORHOTSPOTSBYAPPLICATION$2);
                }
            }
            
            /**
             * Sets array of all "errorhotspotsbyapplication" element
             */
            public void setErrorhotspotsbyapplicationArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication[] errorhotspotsbyapplicationArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(errorhotspotsbyapplicationArray, ERRORHOTSPOTSBYAPPLICATION$2);
                }
            }
            
            /**
             * Sets ith "errorhotspotsbyapplication" element
             */
            public void setErrorhotspotsbyapplicationArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication errorhotspotsbyapplication)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication)get_store().find_element_user(ERRORHOTSPOTSBYAPPLICATION$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(errorhotspotsbyapplication);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "errorhotspotsbyapplication" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication insertNewErrorhotspotsbyapplication(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication)get_store().insert_element_user(ERRORHOTSPOTSBYAPPLICATION$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "errorhotspotsbyapplication" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication addNewErrorhotspotsbyapplication()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication)get_store().add_element_user(ERRORHOTSPOTSBYAPPLICATION$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "errorhotspotsbyapplication" element
             */
            public void removeErrorhotspotsbyapplication(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ERRORHOTSPOTSBYAPPLICATION$2, i);
                }
            }
            
            /**
             * Gets array of all "errorhotspots" elements
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots[] getErrorhotspotsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ERRORHOTSPOTS$4, targetList);
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots[] result = new noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "errorhotspots" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots getErrorhotspotsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots)get_store().find_element_user(ERRORHOTSPOTS$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "errorhotspots" element
             */
            public int sizeOfErrorhotspotsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ERRORHOTSPOTS$4);
                }
            }
            
            /**
             * Sets array of all "errorhotspots" element
             */
            public void setErrorhotspotsArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots[] errorhotspotsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(errorhotspotsArray, ERRORHOTSPOTS$4);
                }
            }
            
            /**
             * Sets ith "errorhotspots" element
             */
            public void setErrorhotspotsArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots errorhotspots)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots)get_store().find_element_user(ERRORHOTSPOTS$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(errorhotspots);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "errorhotspots" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots insertNewErrorhotspots(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots)get_store().insert_element_user(ERRORHOTSPOTS$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "errorhotspots" element
             */
            public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots addNewErrorhotspots()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots target = null;
                    target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots)get_store().add_element_user(ERRORHOTSPOTS$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "errorhotspots" element
             */
            public void removeErrorhotspots(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ERRORHOTSPOTS$4, i);
                }
            }
            
            /**
             * Gets the "startdate" attribute
             */
            public java.lang.String getStartdate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "startdate" attribute
             */
            public org.apache.xmlbeans.XmlString xgetStartdate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$6);
                    return target;
                }
            }
            
            /**
             * True if has "startdate" attribute
             */
            public boolean isSetStartdate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(STARTDATE$6) != null;
                }
            }
            
            /**
             * Sets the "startdate" attribute
             */
            public void setStartdate(java.lang.String startdate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$6);
                    }
                    target.setStringValue(startdate);
                }
            }
            
            /**
             * Sets (as xml) the "startdate" attribute
             */
            public void xsetStartdate(org.apache.xmlbeans.XmlString startdate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTDATE$6);
                    }
                    target.set(startdate);
                }
            }
            
            /**
             * Unsets the "startdate" attribute
             */
            public void unsetStartdate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(STARTDATE$6);
                }
            }
            
            /**
             * Gets the "enddate" attribute
             */
            public java.lang.String getEnddate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "enddate" attribute
             */
            public org.apache.xmlbeans.XmlString xgetEnddate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$8);
                    return target;
                }
            }
            
            /**
             * True if has "enddate" attribute
             */
            public boolean isSetEnddate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ENDDATE$8) != null;
                }
            }
            
            /**
             * Sets the "enddate" attribute
             */
            public void setEnddate(java.lang.String enddate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$8);
                    }
                    target.setStringValue(enddate);
                }
            }
            
            /**
             * Sets (as xml) the "enddate" attribute
             */
            public void xsetEnddate(org.apache.xmlbeans.XmlString enddate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDDATE$8);
                    }
                    target.set(enddate);
                }
            }
            
            /**
             * Unsets the "enddate" attribute
             */
            public void unsetEnddate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ENDDATE$8);
                }
            }
            
            /**
             * Gets the "type" attribute
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public org.apache.xmlbeans.XmlString xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
                    return target;
                }
            }
            
            /**
             * True if has "type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$10) != null;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(java.lang.String type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
                    }
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(org.apache.xmlbeans.XmlString type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$10);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$10);
                }
            }
            /**
             * An XML measurement(@).
             *
             * This is a complex type.
             */
            public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Measurement
            {
                private static final long serialVersionUID = 1L;
                
                public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TIMESTAMP$0 = 
                    new javax.xml.namespace.QName("", "timestamp");
                private static final javax.xml.namespace.QName VALUE$2 = 
                    new javax.xml.namespace.QName("", "value");
                private static final javax.xml.namespace.QName SUCCESSRATE$4 = 
                    new javax.xml.namespace.QName("", "successrate");
                private static final javax.xml.namespace.QName ERRORRATE$6 = 
                    new javax.xml.namespace.QName("", "errorrate");
                private static final javax.xml.namespace.QName TRANSACTIONCOUNT$8 = 
                    new javax.xml.namespace.QName("", "transactioncount");
                
                
                /**
                 * Gets the "timestamp" attribute
                 */
                public java.util.Calendar getTimestamp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$0);
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
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$0);
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$0);
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
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$0);
                      }
                      target.set(timestamp);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
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
                      return get_store().find_attribute_user(VALUE$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$2);
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
                      get_store().remove_attribute(VALUE$2);
                    }
                }
                
                /**
                 * Gets the "successrate" attribute
                 */
                public double getSuccessrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUCCESSRATE$4);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "successrate" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSuccessrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUCCESSRATE$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "successrate" attribute
                 */
                public boolean isSetSuccessrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUCCESSRATE$4) != null;
                    }
                }
                
                /**
                 * Sets the "successrate" attribute
                 */
                public void setSuccessrate(double successrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUCCESSRATE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUCCESSRATE$4);
                      }
                      target.setDoubleValue(successrate);
                    }
                }
                
                /**
                 * Sets (as xml) the "successrate" attribute
                 */
                public void xsetSuccessrate(org.apache.xmlbeans.XmlDouble successrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUCCESSRATE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUCCESSRATE$4);
                      }
                      target.set(successrate);
                    }
                }
                
                /**
                 * Unsets the "successrate" attribute
                 */
                public void unsetSuccessrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUCCESSRATE$4);
                    }
                }
                
                /**
                 * Gets the "errorrate" attribute
                 */
                public double getErrorrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORRATE$6);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "errorrate" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetErrorrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ERRORRATE$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "errorrate" attribute
                 */
                public boolean isSetErrorrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORRATE$6) != null;
                    }
                }
                
                /**
                 * Sets the "errorrate" attribute
                 */
                public void setErrorrate(double errorrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORRATE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORRATE$6);
                      }
                      target.setDoubleValue(errorrate);
                    }
                }
                
                /**
                 * Sets (as xml) the "errorrate" attribute
                 */
                public void xsetErrorrate(org.apache.xmlbeans.XmlDouble errorrate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ERRORRATE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ERRORRATE$6);
                      }
                      target.set(errorrate);
                    }
                }
                
                /**
                 * Unsets the "errorrate" attribute
                 */
                public void unsetErrorrate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORRATE$6);
                    }
                }
                
                /**
                 * Gets the "transactioncount" attribute
                 */
                public double getTransactioncount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONCOUNT$8);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "transactioncount" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTransactioncount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TRANSACTIONCOUNT$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "transactioncount" attribute
                 */
                public boolean isSetTransactioncount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TRANSACTIONCOUNT$8) != null;
                    }
                }
                
                /**
                 * Sets the "transactioncount" attribute
                 */
                public void setTransactioncount(double transactioncount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONCOUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSACTIONCOUNT$8);
                      }
                      target.setDoubleValue(transactioncount);
                    }
                }
                
                /**
                 * Sets (as xml) the "transactioncount" attribute
                 */
                public void xsetTransactioncount(org.apache.xmlbeans.XmlDouble transactioncount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TRANSACTIONCOUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TRANSACTIONCOUNT$8);
                      }
                      target.set(transactioncount);
                    }
                }
                
                /**
                 * Unsets the "transactioncount" attribute
                 */
                public void unsetTransactioncount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TRANSACTIONCOUNT$8);
                    }
                }
            }
            /**
             * An XML errorhotspotsbyapplication(@).
             *
             * This is a complex type.
             */
            public static class ErrorhotspotsbyapplicationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication
            {
                private static final long serialVersionUID = 1L;
                
                public ErrorhotspotsbyapplicationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MEASUREMENT$0 = 
                    new javax.xml.namespace.QName("", "measurement");
                
                
                /**
                 * Gets array of all "measurement" elements
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement[] getMeasurementArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(MEASUREMENT$0, targetList);
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement[] result = new noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "measurement" element
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement getMeasurementArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "measurement" element
                 */
                public int sizeOfMeasurementArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MEASUREMENT$0);
                    }
                }
                
                /**
                 * Sets array of all "measurement" element
                 */
                public void setMeasurementArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement[] measurementArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(measurementArray, MEASUREMENT$0);
                    }
                }
                
                /**
                 * Sets ith "measurement" element
                 */
                public void setMeasurementArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement measurement)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(measurement);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement insertNewMeasurement(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measurement" element
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement addNewMeasurement()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement)get_store().add_element_user(MEASUREMENT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "measurement" element
                 */
                public void removeMeasurement(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MEASUREMENT$0, i);
                    }
                }
                /**
                 * An XML measurement(@).
                 *
                 * This is a complex type.
                 */
                public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspotsbyapplication.Measurement
                {
                    private static final long serialVersionUID = 1L;
                    
                    public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName HOTSPOT$0 = 
                      new javax.xml.namespace.QName("", "hotspot");
                    private static final javax.xml.namespace.QName VALUE$2 = 
                      new javax.xml.namespace.QName("", "value");
                    
                    
                    /**
                     * Gets the "hotspot" attribute
                     */
                    public java.lang.String getHotspot()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOTSPOT$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "hotspot" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetHotspot()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOTSPOT$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "hotspot" attribute
                     */
                    public void setHotspot(java.lang.String hotspot)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOTSPOT$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOTSPOT$0);
                        }
                        target.setStringValue(hotspot);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "hotspot" attribute
                     */
                    public void xsetHotspot(org.apache.xmlbeans.XmlString hotspot)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOTSPOT$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOTSPOT$0);
                        }
                        target.set(hotspot);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
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
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
                        return target;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
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
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$2);
                        }
                        target.set(value);
                      }
                    }
                }
            }
            /**
             * An XML errorhotspots(@).
             *
             * This is a complex type.
             */
            public static class ErrorhotspotsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots
            {
                private static final long serialVersionUID = 1L;
                
                public ErrorhotspotsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MEASUREMENT$0 = 
                    new javax.xml.namespace.QName("", "measurement");
                
                
                /**
                 * Gets array of all "measurement" elements
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement[] getMeasurementArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(MEASUREMENT$0, targetList);
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement[] result = new noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "measurement" element
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement getMeasurementArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "measurement" element
                 */
                public int sizeOfMeasurementArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MEASUREMENT$0);
                    }
                }
                
                /**
                 * Sets array of all "measurement" element
                 */
                public void setMeasurementArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement[] measurementArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(measurementArray, MEASUREMENT$0);
                    }
                }
                
                /**
                 * Sets ith "measurement" element
                 */
                public void setMeasurementArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement measurement)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(measurement);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement insertNewMeasurement(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measurement" element
                 */
                public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement addNewMeasurement()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement target = null;
                      target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement)get_store().add_element_user(MEASUREMENT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "measurement" element
                 */
                public void removeMeasurement(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MEASUREMENT$0, i);
                    }
                }
                /**
                 * An XML measurement(@).
                 *
                 * This is a complex type.
                 */
                public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet.Health.Errorhotspots.Measurement
                {
                    private static final long serialVersionUID = 1L;
                    
                    public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName HOTSPOT$0 = 
                      new javax.xml.namespace.QName("", "hotspot");
                    private static final javax.xml.namespace.QName VALUE$2 = 
                      new javax.xml.namespace.QName("", "value");
                    
                    
                    /**
                     * Gets the "hotspot" attribute
                     */
                    public java.lang.String getHotspot()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOTSPOT$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "hotspot" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetHotspot()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOTSPOT$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "hotspot" attribute
                     */
                    public void setHotspot(java.lang.String hotspot)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOTSPOT$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOTSPOT$0);
                        }
                        target.setStringValue(hotspot);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "hotspot" attribute
                     */
                    public void xsetHotspot(org.apache.xmlbeans.XmlString hotspot)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOTSPOT$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOTSPOT$0);
                        }
                        target.set(hotspot);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
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
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
                        return target;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
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
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$2);
                        }
                        target.set(value);
                      }
                    }
                }
            }
        }
    }
}
