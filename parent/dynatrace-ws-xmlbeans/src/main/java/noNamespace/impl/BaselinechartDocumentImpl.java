/*
 * An XML document type.
 * Localname: baselinechart
 * Namespace: 
 * Java type: noNamespace.BaselinechartDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one baselinechart(@) element.
 *
 * This is a complex type.
 */
public class BaselinechartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BaselinechartDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaselinechartDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASELINECHART$0 = 
        new javax.xml.namespace.QName("", "baselinechart");
    
    
    /**
     * Gets the "baselinechart" element
     */
    public noNamespace.BaselinechartDocument.Baselinechart getBaselinechart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BaselinechartDocument.Baselinechart target = null;
            target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().find_element_user(BASELINECHART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baselinechart" element
     */
    public void setBaselinechart(noNamespace.BaselinechartDocument.Baselinechart baselinechart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BaselinechartDocument.Baselinechart target = null;
            target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().find_element_user(BASELINECHART$0, 0);
            if (target == null)
            {
                target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().add_element_user(BASELINECHART$0);
            }
            target.set(baselinechart);
        }
    }
    
    /**
     * Appends and returns a new empty "baselinechart" element
     */
    public noNamespace.BaselinechartDocument.Baselinechart addNewBaselinechart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BaselinechartDocument.Baselinechart target = null;
            target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().add_element_user(BASELINECHART$0);
            return target;
        }
    }
    /**
     * An XML baselinechart(@).
     *
     * This is a complex type.
     */
    public static class BaselinechartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BaselinechartDocument.Baselinechart
    {
        private static final long serialVersionUID = 1L;
        
        public BaselinechartImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName CHART$4 = 
            new javax.xml.namespace.QName("", "chart");
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
         * Gets the "chart" element
         */
        public noNamespace.BaselinechartDocument.Baselinechart.Chart getChart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BaselinechartDocument.Baselinechart.Chart target = null;
                target = (noNamespace.BaselinechartDocument.Baselinechart.Chart)get_store().find_element_user(CHART$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "chart" element
         */
        public void setChart(noNamespace.BaselinechartDocument.Baselinechart.Chart chart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BaselinechartDocument.Baselinechart.Chart target = null;
                target = (noNamespace.BaselinechartDocument.Baselinechart.Chart)get_store().find_element_user(CHART$4, 0);
                if (target == null)
                {
                    target = (noNamespace.BaselinechartDocument.Baselinechart.Chart)get_store().add_element_user(CHART$4);
                }
                target.set(chart);
            }
        }
        
        /**
         * Appends and returns a new empty "chart" element
         */
        public noNamespace.BaselinechartDocument.Baselinechart.Chart addNewChart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BaselinechartDocument.Baselinechart.Chart target = null;
                target = (noNamespace.BaselinechartDocument.Baselinechart.Chart)get_store().add_element_user(CHART$4);
                return target;
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
         * An XML chart(@).
         *
         * This is a complex type.
         */
        public static class ChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BaselinechartDocument.Baselinechart.Chart
        {
            private static final long serialVersionUID = 1L;
            
            public ChartImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RECORD$0 = 
                new javax.xml.namespace.QName("", "record");
            
            
            /**
             * Gets array of all "record" elements
             */
            public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record[] getRecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RECORD$0, targetList);
                    noNamespace.BaselinechartDocument.Baselinechart.Chart.Record[] result = new noNamespace.BaselinechartDocument.Baselinechart.Chart.Record[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "record" element
             */
            public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record getRecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BaselinechartDocument.Baselinechart.Chart.Record target = null;
                    target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record)get_store().find_element_user(RECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "record" element
             */
            public int sizeOfRecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RECORD$0);
                }
            }
            
            /**
             * Sets array of all "record" element
             */
            public void setRecordArray(noNamespace.BaselinechartDocument.Baselinechart.Chart.Record[] recordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(recordArray, RECORD$0);
                }
            }
            
            /**
             * Sets ith "record" element
             */
            public void setRecordArray(int i, noNamespace.BaselinechartDocument.Baselinechart.Chart.Record record)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BaselinechartDocument.Baselinechart.Chart.Record target = null;
                    target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record)get_store().find_element_user(RECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(record);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "record" element
             */
            public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record insertNewRecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BaselinechartDocument.Baselinechart.Chart.Record target = null;
                    target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record)get_store().insert_element_user(RECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "record" element
             */
            public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record addNewRecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.BaselinechartDocument.Baselinechart.Chart.Record target = null;
                    target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record)get_store().add_element_user(RECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "record" element
             */
            public void removeRecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RECORD$0, i);
                }
            }
            /**
             * An XML record(@).
             *
             * This is a complex type.
             */
            public static class RecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BaselinechartDocument.Baselinechart.Chart.Record
            {
                private static final long serialVersionUID = 1L;
                
                public RecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MEASUREMENT$0 = 
                    new javax.xml.namespace.QName("", "measurement");
                
                
                /**
                 * Gets array of all "measurement" elements
                 */
                public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement[] getMeasurementArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(MEASUREMENT$0, targetList);
                      noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement[] result = new noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "measurement" element
                 */
                public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement getMeasurementArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement target = null;
                      target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                public void setMeasurementArray(noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement[] measurementArray)
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
                public void setMeasurementArray(int i, noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement measurement)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement target = null;
                      target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement insertNewMeasurement(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement target = null;
                      target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "measurement" element
                 */
                public noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement addNewMeasurement()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement target = null;
                      target = (noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement)get_store().add_element_user(MEASUREMENT$0);
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
                public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BaselinechartDocument.Baselinechart.Chart.Record.Measurement
                {
                    private static final long serialVersionUID = 1L;
                    
                    public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName ACTUAL$0 = 
                      new javax.xml.namespace.QName("", "actual");
                    private static final javax.xml.namespace.QName OBSERVATIONS$2 = 
                      new javax.xml.namespace.QName("", "observations");
                    private static final javax.xml.namespace.QName TIMESTAMP$4 = 
                      new javax.xml.namespace.QName("", "timestamp");
                    private static final javax.xml.namespace.QName EXPECTED$6 = 
                      new javax.xml.namespace.QName("", "expected");
                    private static final javax.xml.namespace.QName LOWER$8 = 
                      new javax.xml.namespace.QName("", "lower");
                    private static final javax.xml.namespace.QName UPPER$10 = 
                      new javax.xml.namespace.QName("", "upper");
                    
                    
                    /**
                     * Gets the "actual" attribute
                     */
                    public double getActual()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUAL$0);
                        if (target == null)
                        {
                          return 0.0;
                        }
                        return target.getDoubleValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "actual" attribute
                     */
                    public org.apache.xmlbeans.XmlDouble xgetActual()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACTUAL$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "actual" attribute
                     */
                    public void setActual(double actual)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUAL$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTUAL$0);
                        }
                        target.setDoubleValue(actual);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "actual" attribute
                     */
                    public void xsetActual(org.apache.xmlbeans.XmlDouble actual)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACTUAL$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ACTUAL$0);
                        }
                        target.set(actual);
                      }
                    }
                    
                    /**
                     * Gets the "observations" attribute
                     */
                    public java.math.BigInteger getObservations()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBSERVATIONS$2);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "observations" attribute
                     */
                    public org.apache.xmlbeans.XmlInteger xgetObservations()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBSERVATIONS$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "observations" attribute
                     */
                    public void setObservations(java.math.BigInteger observations)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBSERVATIONS$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBSERVATIONS$2);
                        }
                        target.setBigIntegerValue(observations);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "observations" attribute
                     */
                    public void xsetObservations(org.apache.xmlbeans.XmlInteger observations)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBSERVATIONS$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBSERVATIONS$2);
                        }
                        target.set(observations);
                      }
                    }
                    
                    /**
                     * Gets the "timestamp" attribute
                     */
                    public java.math.BigInteger getTimestamp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$4);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "timestamp" attribute
                     */
                    public org.apache.xmlbeans.XmlInteger xgetTimestamp()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TIMESTAMP$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "timestamp" attribute
                     */
                    public void setTimestamp(java.math.BigInteger timestamp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$4);
                        }
                        target.setBigIntegerValue(timestamp);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "timestamp" attribute
                     */
                    public void xsetTimestamp(org.apache.xmlbeans.XmlInteger timestamp)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TIMESTAMP$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TIMESTAMP$4);
                        }
                        target.set(timestamp);
                      }
                    }
                    
                    /**
                     * Gets the "expected" attribute
                     */
                    public double getExpected()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTED$6);
                        if (target == null)
                        {
                          return 0.0;
                        }
                        return target.getDoubleValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "expected" attribute
                     */
                    public org.apache.xmlbeans.XmlDouble xgetExpected()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXPECTED$6);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "expected" attribute
                     */
                    public boolean isSetExpected()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(EXPECTED$6) != null;
                      }
                    }
                    
                    /**
                     * Sets the "expected" attribute
                     */
                    public void setExpected(double expected)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTED$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPECTED$6);
                        }
                        target.setDoubleValue(expected);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "expected" attribute
                     */
                    public void xsetExpected(org.apache.xmlbeans.XmlDouble expected)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXPECTED$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXPECTED$6);
                        }
                        target.set(expected);
                      }
                    }
                    
                    /**
                     * Unsets the "expected" attribute
                     */
                    public void unsetExpected()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(EXPECTED$6);
                      }
                    }
                    
                    /**
                     * Gets the "lower" attribute
                     */
                    public double getLower()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOWER$8);
                        if (target == null)
                        {
                          return 0.0;
                        }
                        return target.getDoubleValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "lower" attribute
                     */
                    public org.apache.xmlbeans.XmlDouble xgetLower()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOWER$8);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "lower" attribute
                     */
                    public boolean isSetLower()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(LOWER$8) != null;
                      }
                    }
                    
                    /**
                     * Sets the "lower" attribute
                     */
                    public void setLower(double lower)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOWER$8);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOWER$8);
                        }
                        target.setDoubleValue(lower);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "lower" attribute
                     */
                    public void xsetLower(org.apache.xmlbeans.XmlDouble lower)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LOWER$8);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LOWER$8);
                        }
                        target.set(lower);
                      }
                    }
                    
                    /**
                     * Unsets the "lower" attribute
                     */
                    public void unsetLower()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(LOWER$8);
                      }
                    }
                    
                    /**
                     * Gets the "upper" attribute
                     */
                    public double getUpper()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPPER$10);
                        if (target == null)
                        {
                          return 0.0;
                        }
                        return target.getDoubleValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "upper" attribute
                     */
                    public org.apache.xmlbeans.XmlDouble xgetUpper()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(UPPER$10);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "upper" attribute
                     */
                    public boolean isSetUpper()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(UPPER$10) != null;
                      }
                    }
                    
                    /**
                     * Sets the "upper" attribute
                     */
                    public void setUpper(double upper)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPPER$10);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPPER$10);
                        }
                        target.setDoubleValue(upper);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "upper" attribute
                     */
                    public void xsetUpper(org.apache.xmlbeans.XmlDouble upper)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(UPPER$10);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(UPPER$10);
                        }
                        target.set(upper);
                      }
                    }
                    
                    /**
                     * Unsets the "upper" attribute
                     */
                    public void unsetUpper()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(UPPER$10);
                      }
                    }
                }
            }
        }
    }
}
