/*
 * An XML document type.
 * Localname: datapoint
 * Namespace: 
 * Java type: noNamespace.DatapointDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one datapoint(@) element.
 *
 * This is a complex type.
 */
public class DatapointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatapointDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatapointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPOINT$0 = 
        new javax.xml.namespace.QName("", "datapoint");
    
    
    /**
     * Gets the "datapoint" element
     */
    public noNamespace.DatapointDocument.Datapoint getDatapoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatapointDocument.Datapoint target = null;
            target = (noNamespace.DatapointDocument.Datapoint)get_store().find_element_user(DATAPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datapoint" element
     */
    public void setDatapoint(noNamespace.DatapointDocument.Datapoint datapoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatapointDocument.Datapoint target = null;
            target = (noNamespace.DatapointDocument.Datapoint)get_store().find_element_user(DATAPOINT$0, 0);
            if (target == null)
            {
                target = (noNamespace.DatapointDocument.Datapoint)get_store().add_element_user(DATAPOINT$0);
            }
            target.set(datapoint);
        }
    }
    
    /**
     * Appends and returns a new empty "datapoint" element
     */
    public noNamespace.DatapointDocument.Datapoint addNewDatapoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatapointDocument.Datapoint target = null;
            target = (noNamespace.DatapointDocument.Datapoint)get_store().add_element_user(DATAPOINT$0);
            return target;
        }
    }
    /**
     * An XML datapoint(@).
     *
     * This is a complex type.
     */
    public static class DatapointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatapointDocument.Datapoint
    {
        private static final long serialVersionUID = 1L;
        
        public DatapointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATAPOINT$0 = 
            new javax.xml.namespace.QName("", "datapoint");
        private static final javax.xml.namespace.QName COUNTRY$2 = 
            new javax.xml.namespace.QName("", "country");
        private static final javax.xml.namespace.QName TOTAL$4 = 
            new javax.xml.namespace.QName("", "total");
        private static final javax.xml.namespace.QName SATISFIED$6 = 
            new javax.xml.namespace.QName("", "satisfied");
        private static final javax.xml.namespace.QName TOLERATING$8 = 
            new javax.xml.namespace.QName("", "tolerating");
        private static final javax.xml.namespace.QName FRUSTRATED$10 = 
            new javax.xml.namespace.QName("", "frustrated");
        
        
        /**
         * Gets array of all "datapoint" elements
         */
        public noNamespace.DatapointDocument.Datapoint[] getDatapointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATAPOINT$0, targetList);
                noNamespace.DatapointDocument.Datapoint[] result = new noNamespace.DatapointDocument.Datapoint[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "datapoint" element
         */
        public noNamespace.DatapointDocument.Datapoint getDatapointArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatapointDocument.Datapoint target = null;
                target = (noNamespace.DatapointDocument.Datapoint)get_store().find_element_user(DATAPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "datapoint" element
         */
        public int sizeOfDatapointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAPOINT$0);
            }
        }
        
        /**
         * Sets array of all "datapoint" element
         */
        public void setDatapointArray(noNamespace.DatapointDocument.Datapoint[] datapointArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(datapointArray, DATAPOINT$0);
            }
        }
        
        /**
         * Sets ith "datapoint" element
         */
        public void setDatapointArray(int i, noNamespace.DatapointDocument.Datapoint datapoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatapointDocument.Datapoint target = null;
                target = (noNamespace.DatapointDocument.Datapoint)get_store().find_element_user(DATAPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(datapoint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "datapoint" element
         */
        public noNamespace.DatapointDocument.Datapoint insertNewDatapoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatapointDocument.Datapoint target = null;
                target = (noNamespace.DatapointDocument.Datapoint)get_store().insert_element_user(DATAPOINT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "datapoint" element
         */
        public noNamespace.DatapointDocument.Datapoint addNewDatapoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatapointDocument.Datapoint target = null;
                target = (noNamespace.DatapointDocument.Datapoint)get_store().add_element_user(DATAPOINT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "datapoint" element
         */
        public void removeDatapoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAPOINT$0, i);
            }
        }
        
        /**
         * Gets the "country" attribute
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "country" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$2);
                return target;
            }
        }
        
        /**
         * True if has "country" attribute
         */
        public boolean isSetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNTRY$2) != null;
            }
        }
        
        /**
         * Sets the "country" attribute
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRY$2);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "country" attribute
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRY$2);
                }
                target.set(country);
            }
        }
        
        /**
         * Unsets the "country" attribute
         */
        public void unsetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNTRY$2);
            }
        }
        
        /**
         * Gets the "total" attribute
         */
        public java.math.BigInteger getTotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTAL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "total" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetTotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTAL$4);
                return target;
            }
        }
        
        /**
         * True if has "total" attribute
         */
        public boolean isSetTotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOTAL$4) != null;
            }
        }
        
        /**
         * Sets the "total" attribute
         */
        public void setTotal(java.math.BigInteger total)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTAL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTAL$4);
                }
                target.setBigIntegerValue(total);
            }
        }
        
        /**
         * Sets (as xml) the "total" attribute
         */
        public void xsetTotal(org.apache.xmlbeans.XmlInteger total)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTAL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOTAL$4);
                }
                target.set(total);
            }
        }
        
        /**
         * Unsets the "total" attribute
         */
        public void unsetTotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOTAL$4);
            }
        }
        
        /**
         * Gets the "satisfied" attribute
         */
        public java.math.BigInteger getSatisfied()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SATISFIED$6);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "satisfied" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSatisfied()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SATISFIED$6);
                return target;
            }
        }
        
        /**
         * True if has "satisfied" attribute
         */
        public boolean isSetSatisfied()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SATISFIED$6) != null;
            }
        }
        
        /**
         * Sets the "satisfied" attribute
         */
        public void setSatisfied(java.math.BigInteger satisfied)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SATISFIED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SATISFIED$6);
                }
                target.setBigIntegerValue(satisfied);
            }
        }
        
        /**
         * Sets (as xml) the "satisfied" attribute
         */
        public void xsetSatisfied(org.apache.xmlbeans.XmlInteger satisfied)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SATISFIED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SATISFIED$6);
                }
                target.set(satisfied);
            }
        }
        
        /**
         * Unsets the "satisfied" attribute
         */
        public void unsetSatisfied()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SATISFIED$6);
            }
        }
        
        /**
         * Gets the "tolerating" attribute
         */
        public java.math.BigInteger getTolerating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOLERATING$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "tolerating" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetTolerating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOLERATING$8);
                return target;
            }
        }
        
        /**
         * True if has "tolerating" attribute
         */
        public boolean isSetTolerating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOLERATING$8) != null;
            }
        }
        
        /**
         * Sets the "tolerating" attribute
         */
        public void setTolerating(java.math.BigInteger tolerating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOLERATING$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOLERATING$8);
                }
                target.setBigIntegerValue(tolerating);
            }
        }
        
        /**
         * Sets (as xml) the "tolerating" attribute
         */
        public void xsetTolerating(org.apache.xmlbeans.XmlInteger tolerating)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOLERATING$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOLERATING$8);
                }
                target.set(tolerating);
            }
        }
        
        /**
         * Unsets the "tolerating" attribute
         */
        public void unsetTolerating()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOLERATING$8);
            }
        }
        
        /**
         * Gets the "frustrated" attribute
         */
        public java.math.BigInteger getFrustrated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRUSTRATED$10);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "frustrated" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetFrustrated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FRUSTRATED$10);
                return target;
            }
        }
        
        /**
         * True if has "frustrated" attribute
         */
        public boolean isSetFrustrated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FRUSTRATED$10) != null;
            }
        }
        
        /**
         * Sets the "frustrated" attribute
         */
        public void setFrustrated(java.math.BigInteger frustrated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRUSTRATED$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRUSTRATED$10);
                }
                target.setBigIntegerValue(frustrated);
            }
        }
        
        /**
         * Sets (as xml) the "frustrated" attribute
         */
        public void xsetFrustrated(org.apache.xmlbeans.XmlInteger frustrated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FRUSTRATED$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(FRUSTRATED$10);
                }
                target.set(frustrated);
            }
        }
        
        /**
         * Unsets the "frustrated" attribute
         */
        public void unsetFrustrated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FRUSTRATED$10);
            }
        }
    }
}
