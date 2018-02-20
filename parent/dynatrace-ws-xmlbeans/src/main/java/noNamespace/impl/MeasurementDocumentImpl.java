/*
 * An XML document type.
 * Localname: measurement
 * Namespace: 
 * Java type: noNamespace.MeasurementDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one measurement(@) element.
 *
 * This is a complex type.
 */
public class MeasurementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MeasurementDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasurementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREMENT$0 = 
        new javax.xml.namespace.QName("", "measurement");
    
    
    /**
     * Gets the "measurement" element
     */
    public noNamespace.MeasurementDocument.Measurement getMeasurement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MeasurementDocument.Measurement target = null;
            target = (noNamespace.MeasurementDocument.Measurement)get_store().find_element_user(MEASUREMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "measurement" element
     */
    public void setMeasurement(noNamespace.MeasurementDocument.Measurement measurement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MeasurementDocument.Measurement target = null;
            target = (noNamespace.MeasurementDocument.Measurement)get_store().find_element_user(MEASUREMENT$0, 0);
            if (target == null)
            {
                target = (noNamespace.MeasurementDocument.Measurement)get_store().add_element_user(MEASUREMENT$0);
            }
            target.set(measurement);
        }
    }
    
    /**
     * Appends and returns a new empty "measurement" element
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
     * An XML measurement(@).
     *
     * This is a complex type.
     */
    public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MeasurementDocument.Measurement
    {
        private static final long serialVersionUID = 1L;
        
        public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TIMESTAMP$0 = 
            new javax.xml.namespace.QName("", "timestamp");
        private static final javax.xml.namespace.QName AVG$2 = 
            new javax.xml.namespace.QName("", "avg");
        private static final javax.xml.namespace.QName MIN$4 = 
            new javax.xml.namespace.QName("", "min");
        private static final javax.xml.namespace.QName MAX$6 = 
            new javax.xml.namespace.QName("", "max");
        private static final javax.xml.namespace.QName SUM$8 = 
            new javax.xml.namespace.QName("", "sum");
        private static final javax.xml.namespace.QName COUNT$10 = 
            new javax.xml.namespace.QName("", "count");
        
        
        /**
         * Gets the "timestamp" attribute
         */
        public java.math.BigInteger getTimestamp()
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TIMESTAMP$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TIMESTAMP$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TIMESTAMP$0);
                }
                target.set(timestamp);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$2);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$2);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVG$2);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AVG$2);
                }
                target.set(avg);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$4);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$4);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$4);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MIN$4);
                }
                target.set(min);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$6);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$6);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$6);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAX$6);
                }
                target.set(max);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$8);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$8);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUM$8);
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
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUM$8);
                }
                target.set(sum);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$10);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$10);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$10);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$10);
                }
                target.set(count);
            }
        }
    }
}
