/*
 * An XML document type.
 * Localname: transactionhotspot
 * Namespace: 
 * Java type: noNamespace.TransactionhotspotDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one transactionhotspot(@) element.
 *
 * This is a complex type.
 */
public class TransactionhotspotDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TransactionhotspotDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionhotspotDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONHOTSPOT$0 = 
        new javax.xml.namespace.QName("", "transactionhotspot");
    
    
    /**
     * Gets the "transactionhotspot" element
     */
    public noNamespace.TransactionhotspotDocument.Transactionhotspot getTransactionhotspot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
            target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transactionhotspot" element
     */
    public void setTransactionhotspot(noNamespace.TransactionhotspotDocument.Transactionhotspot transactionhotspot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
            target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, 0);
            if (target == null)
            {
                target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().add_element_user(TRANSACTIONHOTSPOT$0);
            }
            target.set(transactionhotspot);
        }
    }
    
    /**
     * Appends and returns a new empty "transactionhotspot" element
     */
    public noNamespace.TransactionhotspotDocument.Transactionhotspot addNewTransactionhotspot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
            target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().add_element_user(TRANSACTIONHOTSPOT$0);
            return target;
        }
    }
    /**
     * An XML transactionhotspot(@).
     *
     * This is a complex type.
     */
    public static class TransactionhotspotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TransactionhotspotDocument.Transactionhotspot
    {
        private static final long serialVersionUID = 1L;
        
        public TransactionhotspotImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TRANSACTIONHOTSPOT$0 = 
            new javax.xml.namespace.QName("", "transactionhotspot");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName COUNT$4 = 
            new javax.xml.namespace.QName("", "count");
        private static final javax.xml.namespace.QName COUNTPERDAY$6 = 
            new javax.xml.namespace.QName("", "countperday");
        private static final javax.xml.namespace.QName INCIDENTS$8 = 
            new javax.xml.namespace.QName("", "incidents");
        private static final javax.xml.namespace.QName INCIDENTSPERDAY$10 = 
            new javax.xml.namespace.QName("", "incidentsperday");
        private static final javax.xml.namespace.QName INCIDENTRATE$12 = 
            new javax.xml.namespace.QName("", "incidentrate");
        private static final javax.xml.namespace.QName VIOLATIONS$14 = 
            new javax.xml.namespace.QName("", "violations");
        private static final javax.xml.namespace.QName VIOLATIONSPERDAY$16 = 
            new javax.xml.namespace.QName("", "violationsperday");
        private static final javax.xml.namespace.QName VIOLATIONRATE$18 = 
            new javax.xml.namespace.QName("", "violationrate");
        private static final javax.xml.namespace.QName STATE$20 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName ERRORPERCENTAGE$22 = 
            new javax.xml.namespace.QName("", "errorpercentage");
        
        
        /**
         * Gets array of all "transactionhotspot" elements
         */
        public noNamespace.TransactionhotspotDocument.Transactionhotspot[] getTransactionhotspotArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRANSACTIONHOTSPOT$0, targetList);
                noNamespace.TransactionhotspotDocument.Transactionhotspot[] result = new noNamespace.TransactionhotspotDocument.Transactionhotspot[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "transactionhotspot" element
         */
        public noNamespace.TransactionhotspotDocument.Transactionhotspot getTransactionhotspotArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "transactionhotspot" element
         */
        public int sizeOfTransactionhotspotArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSACTIONHOTSPOT$0);
            }
        }
        
        /**
         * Sets array of all "transactionhotspot" element
         */
        public void setTransactionhotspotArray(noNamespace.TransactionhotspotDocument.Transactionhotspot[] transactionhotspotArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(transactionhotspotArray, TRANSACTIONHOTSPOT$0);
            }
        }
        
        /**
         * Sets ith "transactionhotspot" element
         */
        public void setTransactionhotspotArray(int i, noNamespace.TransactionhotspotDocument.Transactionhotspot transactionhotspot)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().find_element_user(TRANSACTIONHOTSPOT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(transactionhotspot);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "transactionhotspot" element
         */
        public noNamespace.TransactionhotspotDocument.Transactionhotspot insertNewTransactionhotspot(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().insert_element_user(TRANSACTIONHOTSPOT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "transactionhotspot" element
         */
        public noNamespace.TransactionhotspotDocument.Transactionhotspot addNewTransactionhotspot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TransactionhotspotDocument.Transactionhotspot target = null;
                target = (noNamespace.TransactionhotspotDocument.Transactionhotspot)get_store().add_element_user(TRANSACTIONHOTSPOT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "transactionhotspot" element
         */
        public void removeTransactionhotspot(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSACTIONHOTSPOT$0, i);
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
        
        /**
         * Gets the "count" attribute
         */
        public double getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "count" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNT$4);
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
                return get_store().find_attribute_user(COUNT$4) != null;
            }
        }
        
        /**
         * Sets the "count" attribute
         */
        public void setCount(double count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$4);
                }
                target.setDoubleValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "count" attribute
         */
        public void xsetCount(org.apache.xmlbeans.XmlDouble count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COUNT$4);
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
                get_store().remove_attribute(COUNT$4);
            }
        }
        
        /**
         * Gets the "countperday" attribute
         */
        public double getCountperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTPERDAY$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "countperday" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCountperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNTPERDAY$6);
                return target;
            }
        }
        
        /**
         * True if has "countperday" attribute
         */
        public boolean isSetCountperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNTPERDAY$6) != null;
            }
        }
        
        /**
         * Sets the "countperday" attribute
         */
        public void setCountperday(double countperday)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTPERDAY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTPERDAY$6);
                }
                target.setDoubleValue(countperday);
            }
        }
        
        /**
         * Sets (as xml) the "countperday" attribute
         */
        public void xsetCountperday(org.apache.xmlbeans.XmlDouble countperday)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(COUNTPERDAY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(COUNTPERDAY$6);
                }
                target.set(countperday);
            }
        }
        
        /**
         * Unsets the "countperday" attribute
         */
        public void unsetCountperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNTPERDAY$6);
            }
        }
        
        /**
         * Gets the "incidents" attribute
         */
        public double getIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTS$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidents" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTS$8);
                return target;
            }
        }
        
        /**
         * True if has "incidents" attribute
         */
        public boolean isSetIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCIDENTS$8) != null;
            }
        }
        
        /**
         * Sets the "incidents" attribute
         */
        public void setIncidents(double incidents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCIDENTS$8);
                }
                target.setDoubleValue(incidents);
            }
        }
        
        /**
         * Sets (as xml) the "incidents" attribute
         */
        public void xsetIncidents(org.apache.xmlbeans.XmlDouble incidents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCIDENTS$8);
                }
                target.set(incidents);
            }
        }
        
        /**
         * Unsets the "incidents" attribute
         */
        public void unsetIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCIDENTS$8);
            }
        }
        
        /**
         * Gets the "incidentsperday" attribute
         */
        public double getIncidentsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidentsperday" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetIncidentsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                return target;
            }
        }
        
        /**
         * True if has "incidentsperday" attribute
         */
        public boolean isSetIncidentsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCIDENTSPERDAY$10) != null;
            }
        }
        
        /**
         * Sets the "incidentsperday" attribute
         */
        public void setIncidentsperday(double incidentsperday)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCIDENTSPERDAY$10);
                }
                target.setDoubleValue(incidentsperday);
            }
        }
        
        /**
         * Sets (as xml) the "incidentsperday" attribute
         */
        public void xsetIncidentsperday(org.apache.xmlbeans.XmlDouble incidentsperday)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTSPERDAY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCIDENTSPERDAY$10);
                }
                target.set(incidentsperday);
            }
        }
        
        /**
         * Unsets the "incidentsperday" attribute
         */
        public void unsetIncidentsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCIDENTSPERDAY$10);
            }
        }
        
        /**
         * Gets the "incidentrate" attribute
         */
        public double getIncidentrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTRATE$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidentrate" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetIncidentrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTRATE$12);
                return target;
            }
        }
        
        /**
         * True if has "incidentrate" attribute
         */
        public boolean isSetIncidentrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCIDENTRATE$12) != null;
            }
        }
        
        /**
         * Sets the "incidentrate" attribute
         */
        public void setIncidentrate(double incidentrate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCIDENTRATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCIDENTRATE$12);
                }
                target.setDoubleValue(incidentrate);
            }
        }
        
        /**
         * Sets (as xml) the "incidentrate" attribute
         */
        public void xsetIncidentrate(org.apache.xmlbeans.XmlDouble incidentrate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCIDENTRATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCIDENTRATE$12);
                }
                target.set(incidentrate);
            }
        }
        
        /**
         * Unsets the "incidentrate" attribute
         */
        public void unsetIncidentrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCIDENTRATE$12);
            }
        }
        
        /**
         * Gets the "violations" attribute
         */
        public double getViolations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONS$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "violations" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetViolations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONS$14);
                return target;
            }
        }
        
        /**
         * True if has "violations" attribute
         */
        public boolean isSetViolations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIOLATIONS$14) != null;
            }
        }
        
        /**
         * Sets the "violations" attribute
         */
        public void setViolations(double violations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONS$14);
                }
                target.setDoubleValue(violations);
            }
        }
        
        /**
         * Sets (as xml) the "violations" attribute
         */
        public void xsetViolations(org.apache.xmlbeans.XmlDouble violations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VIOLATIONS$14);
                }
                target.set(violations);
            }
        }
        
        /**
         * Unsets the "violations" attribute
         */
        public void unsetViolations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIOLATIONS$14);
            }
        }
        
        /**
         * Gets the "violationsperday" attribute
         */
        public double getViolationsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "violationsperday" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetViolationsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                return target;
            }
        }
        
        /**
         * True if has "violationsperday" attribute
         */
        public boolean isSetViolationsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIOLATIONSPERDAY$16) != null;
            }
        }
        
        /**
         * Sets the "violationsperday" attribute
         */
        public void setViolationsperday(double violationsperday)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONSPERDAY$16);
                }
                target.setDoubleValue(violationsperday);
            }
        }
        
        /**
         * Sets (as xml) the "violationsperday" attribute
         */
        public void xsetViolationsperday(org.apache.xmlbeans.XmlDouble violationsperday)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONSPERDAY$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VIOLATIONSPERDAY$16);
                }
                target.set(violationsperday);
            }
        }
        
        /**
         * Unsets the "violationsperday" attribute
         */
        public void unsetViolationsperday()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIOLATIONSPERDAY$16);
            }
        }
        
        /**
         * Gets the "violationrate" attribute
         */
        public double getViolationrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONRATE$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "violationrate" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetViolationrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONRATE$18);
                return target;
            }
        }
        
        /**
         * True if has "violationrate" attribute
         */
        public boolean isSetViolationrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIOLATIONRATE$18) != null;
            }
        }
        
        /**
         * Sets the "violationrate" attribute
         */
        public void setViolationrate(double violationrate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIOLATIONRATE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIOLATIONRATE$18);
                }
                target.setDoubleValue(violationrate);
            }
        }
        
        /**
         * Sets (as xml) the "violationrate" attribute
         */
        public void xsetViolationrate(org.apache.xmlbeans.XmlDouble violationrate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VIOLATIONRATE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VIOLATIONRATE$18);
                }
                target.set(violationrate);
            }
        }
        
        /**
         * Unsets the "violationrate" attribute
         */
        public void unsetViolationrate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIOLATIONRATE$18);
            }
        }
        
        /**
         * Gets the "state" attribute
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.apache.xmlbeans.XmlString xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$20);
                return target;
            }
        }
        
        /**
         * True if has "state" attribute
         */
        public boolean isSetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATE$20) != null;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$20);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.apache.xmlbeans.XmlString state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATE$20);
                }
                target.set(state);
            }
        }
        
        /**
         * Unsets the "state" attribute
         */
        public void unsetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATE$20);
            }
        }
        
        /**
         * Gets the "errorpercentage" attribute
         */
        public double getErrorpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "errorpercentage" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetErrorpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                return target;
            }
        }
        
        /**
         * True if has "errorpercentage" attribute
         */
        public boolean isSetErrorpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORPERCENTAGE$22) != null;
            }
        }
        
        /**
         * Sets the "errorpercentage" attribute
         */
        public void setErrorpercentage(double errorpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORPERCENTAGE$22);
                }
                target.setDoubleValue(errorpercentage);
            }
        }
        
        /**
         * Sets (as xml) the "errorpercentage" attribute
         */
        public void xsetErrorpercentage(org.apache.xmlbeans.XmlDouble errorpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ERRORPERCENTAGE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ERRORPERCENTAGE$22);
                }
                target.set(errorpercentage);
            }
        }
        
        /**
         * Unsets the "errorpercentage" attribute
         */
        public void unsetErrorpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORPERCENTAGE$22);
            }
        }
    }
}
