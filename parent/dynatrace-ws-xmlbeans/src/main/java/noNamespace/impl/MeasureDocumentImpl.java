/*
 * An XML document type.
 * Localname: measure
 * Namespace: 
 * Java type: noNamespace.MeasureDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one measure(@) element.
 *
 * This is a complex type.
 */
public class MeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURE$0 = 
        new javax.xml.namespace.QName("", "measure");
    
    
    /**
     * Gets the "measure" element
     */
    public noNamespace.MeasureDocument.Measure getMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MeasureDocument.Measure target = null;
            target = (noNamespace.MeasureDocument.Measure)get_store().find_element_user(MEASURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "measure" element
     */
    public void setMeasure(noNamespace.MeasureDocument.Measure measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MeasureDocument.Measure target = null;
            target = (noNamespace.MeasureDocument.Measure)get_store().find_element_user(MEASURE$0, 0);
            if (target == null)
            {
                target = (noNamespace.MeasureDocument.Measure)get_store().add_element_user(MEASURE$0);
            }
            target.set(measure);
        }
    }
    
    /**
     * Appends and returns a new empty "measure" element
     */
    public noNamespace.MeasureDocument.Measure addNewMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MeasureDocument.Measure target = null;
            target = (noNamespace.MeasureDocument.Measure)get_store().add_element_user(MEASURE$0);
            return target;
        }
    }
    /**
     * An XML measure(@).
     *
     * This is a complex type.
     */
    public static class MeasureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MeasureDocument.Measure
    {
        private static final long serialVersionUID = 1L;
        
        public MeasureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEASUREMENT$0 = 
            new javax.xml.namespace.QName("", "measurement");
        private static final javax.xml.namespace.QName MEASURE$2 = 
            new javax.xml.namespace.QName("", "measure");
        private static final javax.xml.namespace.QName MEASURE2$4 = 
            new javax.xml.namespace.QName("", "measure");
        private static final javax.xml.namespace.QName AGENTHOST$6 = 
            new javax.xml.namespace.QName("", "agenthost");
        private static final javax.xml.namespace.QName AGENTGROUP$8 = 
            new javax.xml.namespace.QName("", "agentgroup");
        private static final javax.xml.namespace.QName COLOR$10 = 
            new javax.xml.namespace.QName("", "color");
        private static final javax.xml.namespace.QName AGGREGATION$12 = 
            new javax.xml.namespace.QName("", "aggregation");
        private static final javax.xml.namespace.QName AVG$14 = 
            new javax.xml.namespace.QName("", "avg");
        private static final javax.xml.namespace.QName UNIT$16 = 
            new javax.xml.namespace.QName("", "unit");
        private static final javax.xml.namespace.QName MIN$18 = 
            new javax.xml.namespace.QName("", "min");
        private static final javax.xml.namespace.QName MAX$20 = 
            new javax.xml.namespace.QName("", "max");
        private static final javax.xml.namespace.QName SUM$22 = 
            new javax.xml.namespace.QName("", "sum");
        private static final javax.xml.namespace.QName LASTVALUE$24 = 
            new javax.xml.namespace.QName("", "lastvalue");
        private static final javax.xml.namespace.QName COUNT$26 = 
            new javax.xml.namespace.QName("", "count");
        private static final javax.xml.namespace.QName SYSTEMPROFILE$28 = 
            new javax.xml.namespace.QName("", "systemprofile");
        private static final javax.xml.namespace.QName THRESHOLDS$30 = 
            new javax.xml.namespace.QName("", "thresholds");
        private static final javax.xml.namespace.QName RATE$32 = 
            new javax.xml.namespace.QName("", "rate");
        private static final javax.xml.namespace.QName SCALE$34 = 
            new javax.xml.namespace.QName("", "scale");
        private static final javax.xml.namespace.QName DRAWINGORDER$36 = 
            new javax.xml.namespace.QName("", "drawingorder");
        private static final javax.xml.namespace.QName PARENT$38 = 
            new javax.xml.namespace.QName("", "parent");
        private static final javax.xml.namespace.QName APPLICATION$40 = 
            new javax.xml.namespace.QName("", "application");
        private static final javax.xml.namespace.QName SPLITTING$42 = 
            new javax.xml.namespace.QName("", "splitting");
        
        
        /**
         * Gets array of all "measurement" elements
         */
        public noNamespace.MeasurementDocument.Measurement[] getMeasurementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEASUREMENT$0, targetList);
                noNamespace.MeasurementDocument.Measurement[] result = new noNamespace.MeasurementDocument.Measurement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "measurement" element
         */
        public noNamespace.MeasurementDocument.Measurement getMeasurementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasurementDocument.Measurement target = null;
                target = (noNamespace.MeasurementDocument.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
        public void setMeasurementArray(noNamespace.MeasurementDocument.Measurement[] measurementArray)
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
        public void setMeasurementArray(int i, noNamespace.MeasurementDocument.Measurement measurement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasurementDocument.Measurement target = null;
                target = (noNamespace.MeasurementDocument.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
        public noNamespace.MeasurementDocument.Measurement insertNewMeasurement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasurementDocument.Measurement target = null;
                target = (noNamespace.MeasurementDocument.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "measurement" element
         */
        public noNamespace.MeasurementDocument.Measurement addNewMeasurement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasurementDocument.Measurement target = null;
                target = (noNamespace.MeasurementDocument.Measurement)get_store().add_element_user(MEASUREMENT$0);
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
         * Gets array of all "measure" elements
         */
        public noNamespace.MeasureDocument.Measure[] getMeasureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEASURE2$4, targetList);
                noNamespace.MeasureDocument.Measure[] result = new noNamespace.MeasureDocument.Measure[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "measure" element
         */
        public noNamespace.MeasureDocument.Measure getMeasureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasureDocument.Measure target = null;
                target = (noNamespace.MeasureDocument.Measure)get_store().find_element_user(MEASURE2$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "measure" element
         */
        public int sizeOfMeasureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEASURE2$4);
            }
        }
        
        /**
         * Sets array of all "measure" element
         */
        public void setMeasureArray(noNamespace.MeasureDocument.Measure[] measureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(measureArray, MEASURE2$4);
            }
        }
        
        /**
         * Sets ith "measure" element
         */
        public void setMeasureArray(int i, noNamespace.MeasureDocument.Measure measure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasureDocument.Measure target = null;
                target = (noNamespace.MeasureDocument.Measure)get_store().find_element_user(MEASURE2$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(measure);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "measure" element
         */
        public noNamespace.MeasureDocument.Measure insertNewMeasure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasureDocument.Measure target = null;
                target = (noNamespace.MeasureDocument.Measure)get_store().insert_element_user(MEASURE2$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "measure" element
         */
        public noNamespace.MeasureDocument.Measure addNewMeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MeasureDocument.Measure target = null;
                target = (noNamespace.MeasureDocument.Measure)get_store().add_element_user(MEASURE2$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "measure" element
         */
        public void removeMeasure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEASURE2$4, i);
            }
        }
        
        /**
         * Gets the "measure" attribute
         */
        public java.lang.String getMeasure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURE2$4);
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
        public org.apache.xmlbeans.XmlString xgetMeasure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASURE2$4);
                return target;
            }
        }
        
        /**
         * True if has "measure" attribute
         */
        public boolean isSetMeasure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEASURE2$4) != null;
            }
        }
        
        /**
         * Sets the "measure" attribute
         */
        public void setMeasure2(java.lang.String measure2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURE2$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASURE2$4);
                }
                target.setStringValue(measure2);
            }
        }
        
        /**
         * Sets (as xml) the "measure" attribute
         */
        public void xsetMeasure2(org.apache.xmlbeans.XmlString measure2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASURE2$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEASURE2$4);
                }
                target.set(measure2);
            }
        }
        
        /**
         * Unsets the "measure" attribute
         */
        public void unsetMeasure2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEASURE2$4);
            }
        }
        
        /**
         * Gets the "agenthost" attribute
         */
        public java.lang.String getAgenthost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTHOST$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "agenthost" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAgenthost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTHOST$6);
                return target;
            }
        }
        
        /**
         * True if has "agenthost" attribute
         */
        public boolean isSetAgenthost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AGENTHOST$6) != null;
            }
        }
        
        /**
         * Sets the "agenthost" attribute
         */
        public void setAgenthost(java.lang.String agenthost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTHOST$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTHOST$6);
                }
                target.setStringValue(agenthost);
            }
        }
        
        /**
         * Sets (as xml) the "agenthost" attribute
         */
        public void xsetAgenthost(org.apache.xmlbeans.XmlString agenthost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTHOST$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTHOST$6);
                }
                target.set(agenthost);
            }
        }
        
        /**
         * Unsets the "agenthost" attribute
         */
        public void unsetAgenthost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AGENTHOST$6);
            }
        }
        
        /**
         * Gets the "agentgroup" attribute
         */
        public java.lang.String getAgentgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTGROUP$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "agentgroup" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAgentgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTGROUP$8);
                return target;
            }
        }
        
        /**
         * True if has "agentgroup" attribute
         */
        public boolean isSetAgentgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AGENTGROUP$8) != null;
            }
        }
        
        /**
         * Sets the "agentgroup" attribute
         */
        public void setAgentgroup(java.lang.String agentgroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTGROUP$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTGROUP$8);
                }
                target.setStringValue(agentgroup);
            }
        }
        
        /**
         * Sets (as xml) the "agentgroup" attribute
         */
        public void xsetAgentgroup(org.apache.xmlbeans.XmlString agentgroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTGROUP$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTGROUP$8);
                }
                target.set(agentgroup);
            }
        }
        
        /**
         * Unsets the "agentgroup" attribute
         */
        public void unsetAgentgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AGENTGROUP$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLOR$10);
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
                return get_store().find_attribute_user(COLOR$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLOR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLOR$10);
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
                get_store().remove_attribute(COLOR$10);
            }
        }
        
        /**
         * Gets the "aggregation" attribute
         */
        public java.lang.String getAggregation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATION$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "aggregation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAggregation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGGREGATION$12);
                return target;
            }
        }
        
        /**
         * True if has "aggregation" attribute
         */
        public boolean isSetAggregation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AGGREGATION$12) != null;
            }
        }
        
        /**
         * Sets the "aggregation" attribute
         */
        public void setAggregation(java.lang.String aggregation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATION$12);
                }
                target.setStringValue(aggregation);
            }
        }
        
        /**
         * Sets (as xml) the "aggregation" attribute
         */
        public void xsetAggregation(org.apache.xmlbeans.XmlString aggregation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGGREGATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGGREGATION$12);
                }
                target.set(aggregation);
            }
        }
        
        /**
         * Unsets the "aggregation" attribute
         */
        public void unsetAggregation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AGGREGATION$12);
            }
        }
        
        /**
         * Gets the "avg" attribute
         */
        public double getAvg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "avg" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAvg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$14);
                return target;
            }
        }
        
        /**
         * True if has "avg" attribute
         */
        public boolean isSetAvg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AVG$14) != null;
            }
        }
        
        /**
         * Sets the "avg" attribute
         */
        public void setAvg(double avg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVG$14);
                }
                target.setDoubleValue(avg);
            }
        }
        
        /**
         * Sets (as xml) the "avg" attribute
         */
        public void xsetAvg(org.apache.xmlbeans.XmlDouble avg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AVG$14);
                }
                target.set(avg);
            }
        }
        
        /**
         * Unsets the "avg" attribute
         */
        public void unsetAvg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AVG$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$16);
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
                return get_store().find_attribute_user(UNIT$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIT$16);
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
                get_store().remove_attribute(UNIT$16);
            }
        }
        
        /**
         * Gets the "min" attribute
         */
        public double getMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "min" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$18);
                return target;
            }
        }
        
        /**
         * True if has "min" attribute
         */
        public boolean isSetMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MIN$18) != null;
            }
        }
        
        /**
         * Sets the "min" attribute
         */
        public void setMin(double min)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$18);
                }
                target.setDoubleValue(min);
            }
        }
        
        /**
         * Sets (as xml) the "min" attribute
         */
        public void xsetMin(org.apache.xmlbeans.XmlDouble min)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MIN$18);
                }
                target.set(min);
            }
        }
        
        /**
         * Unsets the "min" attribute
         */
        public void unsetMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MIN$18);
            }
        }
        
        /**
         * Gets the "max" attribute
         */
        public double getMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "max" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$20);
                return target;
            }
        }
        
        /**
         * True if has "max" attribute
         */
        public boolean isSetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAX$20) != null;
            }
        }
        
        /**
         * Sets the "max" attribute
         */
        public void setMax(double max)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$20);
                }
                target.setDoubleValue(max);
            }
        }
        
        /**
         * Sets (as xml) the "max" attribute
         */
        public void xsetMax(org.apache.xmlbeans.XmlDouble max)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAX$20);
                }
                target.set(max);
            }
        }
        
        /**
         * Unsets the "max" attribute
         */
        public void unsetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAX$20);
            }
        }
        
        /**
         * Gets the "sum" attribute
         */
        public double getSum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "sum" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$22);
                return target;
            }
        }
        
        /**
         * True if has "sum" attribute
         */
        public boolean isSetSum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUM$22) != null;
            }
        }
        
        /**
         * Sets the "sum" attribute
         */
        public void setSum(double sum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUM$22);
                }
                target.setDoubleValue(sum);
            }
        }
        
        /**
         * Sets (as xml) the "sum" attribute
         */
        public void xsetSum(org.apache.xmlbeans.XmlDouble sum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUM$22);
                }
                target.set(sum);
            }
        }
        
        /**
         * Unsets the "sum" attribute
         */
        public void unsetSum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUM$22);
            }
        }
        
        /**
         * Gets the "lastvalue" attribute
         */
        public double getLastvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTVALUE$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastvalue" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetLastvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LASTVALUE$24);
                return target;
            }
        }
        
        /**
         * True if has "lastvalue" attribute
         */
        public boolean isSetLastvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASTVALUE$24) != null;
            }
        }
        
        /**
         * Sets the "lastvalue" attribute
         */
        public void setLastvalue(double lastvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTVALUE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTVALUE$24);
                }
                target.setDoubleValue(lastvalue);
            }
        }
        
        /**
         * Sets (as xml) the "lastvalue" attribute
         */
        public void xsetLastvalue(org.apache.xmlbeans.XmlDouble lastvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LASTVALUE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LASTVALUE$24);
                }
                target.set(lastvalue);
            }
        }
        
        /**
         * Unsets the "lastvalue" attribute
         */
        public void unsetLastvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASTVALUE$24);
            }
        }
        
        /**
         * Gets the "count" attribute
         */
        public java.math.BigInteger getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$26);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "count" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$26);
                return target;
            }
        }
        
        /**
         * True if has "count" attribute
         */
        public boolean isSetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNT$26) != null;
            }
        }
        
        /**
         * Sets the "count" attribute
         */
        public void setCount(java.math.BigInteger count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$26);
                }
                target.setBigIntegerValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "count" attribute
         */
        public void xsetCount(org.apache.xmlbeans.XmlInteger count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$26);
                }
                target.set(count);
            }
        }
        
        /**
         * Unsets the "count" attribute
         */
        public void unsetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNT$26);
            }
        }
        
        /**
         * Gets the "systemprofile" attribute
         */
        public java.lang.String getSystemprofile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "systemprofile" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSystemprofile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$28);
                return target;
            }
        }
        
        /**
         * True if has "systemprofile" attribute
         */
        public boolean isSetSystemprofile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SYSTEMPROFILE$28) != null;
            }
        }
        
        /**
         * Sets the "systemprofile" attribute
         */
        public void setSystemprofile(java.lang.String systemprofile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEMPROFILE$28);
                }
                target.setStringValue(systemprofile);
            }
        }
        
        /**
         * Sets (as xml) the "systemprofile" attribute
         */
        public void xsetSystemprofile(org.apache.xmlbeans.XmlString systemprofile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYSTEMPROFILE$28);
                }
                target.set(systemprofile);
            }
        }
        
        /**
         * Unsets the "systemprofile" attribute
         */
        public void unsetSystemprofile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SYSTEMPROFILE$28);
            }
        }
        
        /**
         * Gets the "thresholds" attribute
         */
        public java.lang.String getThresholds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRESHOLDS$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "thresholds" attribute
         */
        public org.apache.xmlbeans.XmlString xgetThresholds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THRESHOLDS$30);
                return target;
            }
        }
        
        /**
         * True if has "thresholds" attribute
         */
        public boolean isSetThresholds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THRESHOLDS$30) != null;
            }
        }
        
        /**
         * Sets the "thresholds" attribute
         */
        public void setThresholds(java.lang.String thresholds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRESHOLDS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THRESHOLDS$30);
                }
                target.setStringValue(thresholds);
            }
        }
        
        /**
         * Sets (as xml) the "thresholds" attribute
         */
        public void xsetThresholds(org.apache.xmlbeans.XmlString thresholds)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THRESHOLDS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(THRESHOLDS$30);
                }
                target.set(thresholds);
            }
        }
        
        /**
         * Unsets the "thresholds" attribute
         */
        public void unsetThresholds()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THRESHOLDS$30);
            }
        }
        
        /**
         * Gets the "rate" attribute
         */
        public java.lang.String getRate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RATE$32);
                return target;
            }
        }
        
        /**
         * True if has "rate" attribute
         */
        public boolean isSetRate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RATE$32) != null;
            }
        }
        
        /**
         * Sets the "rate" attribute
         */
        public void setRate(java.lang.String rate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RATE$32);
                }
                target.setStringValue(rate);
            }
        }
        
        /**
         * Sets (as xml) the "rate" attribute
         */
        public void xsetRate(org.apache.xmlbeans.XmlString rate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RATE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RATE$32);
                }
                target.set(rate);
            }
        }
        
        /**
         * Unsets the "rate" attribute
         */
        public void unsetRate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RATE$32);
            }
        }
        
        /**
         * Gets the "scale" attribute
         */
        public java.lang.String getScale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "scale" attribute
         */
        public org.apache.xmlbeans.XmlString xgetScale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCALE$34);
                return target;
            }
        }
        
        /**
         * True if has "scale" attribute
         */
        public boolean isSetScale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCALE$34) != null;
            }
        }
        
        /**
         * Sets the "scale" attribute
         */
        public void setScale(java.lang.String scale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALE$34);
                }
                target.setStringValue(scale);
            }
        }
        
        /**
         * Sets (as xml) the "scale" attribute
         */
        public void xsetScale(org.apache.xmlbeans.XmlString scale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCALE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCALE$34);
                }
                target.set(scale);
            }
        }
        
        /**
         * Unsets the "scale" attribute
         */
        public void unsetScale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCALE$34);
            }
        }
        
        /**
         * Gets the "drawingorder" attribute
         */
        public java.math.BigInteger getDrawingorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAWINGORDER$36);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "drawingorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetDrawingorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DRAWINGORDER$36);
                return target;
            }
        }
        
        /**
         * True if has "drawingorder" attribute
         */
        public boolean isSetDrawingorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DRAWINGORDER$36) != null;
            }
        }
        
        /**
         * Sets the "drawingorder" attribute
         */
        public void setDrawingorder(java.math.BigInteger drawingorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAWINGORDER$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAWINGORDER$36);
                }
                target.setBigIntegerValue(drawingorder);
            }
        }
        
        /**
         * Sets (as xml) the "drawingorder" attribute
         */
        public void xsetDrawingorder(org.apache.xmlbeans.XmlInteger drawingorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DRAWINGORDER$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DRAWINGORDER$36);
                }
                target.set(drawingorder);
            }
        }
        
        /**
         * Unsets the "drawingorder" attribute
         */
        public void unsetDrawingorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DRAWINGORDER$36);
            }
        }
        
        /**
         * Gets the "parent" attribute
         */
        public java.lang.String getParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parent" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENT$38);
                return target;
            }
        }
        
        /**
         * True if has "parent" attribute
         */
        public boolean isSetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARENT$38) != null;
            }
        }
        
        /**
         * Sets the "parent" attribute
         */
        public void setParent(java.lang.String parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENT$38);
                }
                target.setStringValue(parent);
            }
        }
        
        /**
         * Sets (as xml) the "parent" attribute
         */
        public void xsetParent(org.apache.xmlbeans.XmlString parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENT$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARENT$38);
                }
                target.set(parent);
            }
        }
        
        /**
         * Unsets the "parent" attribute
         */
        public void unsetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARENT$38);
            }
        }
        
        /**
         * Gets the "application" attribute
         */
        public java.lang.String getApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "application" attribute
         */
        public org.apache.xmlbeans.XmlString xgetApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$40);
                return target;
            }
        }
        
        /**
         * True if has "application" attribute
         */
        public boolean isSetApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLICATION$40) != null;
            }
        }
        
        /**
         * Sets the "application" attribute
         */
        public void setApplication(java.lang.String application)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATION$40);
                }
                target.setStringValue(application);
            }
        }
        
        /**
         * Sets (as xml) the "application" attribute
         */
        public void xsetApplication(org.apache.xmlbeans.XmlString application)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATION$40);
                }
                target.set(application);
            }
        }
        
        /**
         * Unsets the "application" attribute
         */
        public void unsetApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLICATION$40);
            }
        }
        
        /**
         * Gets the "splitting" attribute
         */
        public java.lang.String getSplitting()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPLITTING$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "splitting" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSplitting()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPLITTING$42);
                return target;
            }
        }
        
        /**
         * True if has "splitting" attribute
         */
        public boolean isSetSplitting()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPLITTING$42) != null;
            }
        }
        
        /**
         * Sets the "splitting" attribute
         */
        public void setSplitting(java.lang.String splitting)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPLITTING$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPLITTING$42);
                }
                target.setStringValue(splitting);
            }
        }
        
        /**
         * Sets (as xml) the "splitting" attribute
         */
        public void xsetSplitting(org.apache.xmlbeans.XmlString splitting)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SPLITTING$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SPLITTING$42);
                }
                target.set(splitting);
            }
        }
        
        /**
         * Unsets the "splitting" attribute
         */
        public void unsetSplitting()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPLITTING$42);
            }
        }
    }
}
