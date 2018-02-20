/*
 * An XML document type.
 * Localname: incidentoverviewrecord
 * Namespace: 
 * Java type: noNamespace.IncidentoverviewrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one incidentoverviewrecord(@) element.
 *
 * This is a complex type.
 */
public class IncidentoverviewrecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentoverviewrecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentoverviewrecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTOVERVIEWRECORD$0 = 
        new javax.xml.namespace.QName("", "incidentoverviewrecord");
    
    
    /**
     * Gets the "incidentoverviewrecord" element
     */
    public noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord getIncidentoverviewrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord target = null;
            target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().find_element_user(INCIDENTOVERVIEWRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "incidentoverviewrecord" element
     */
    public void setIncidentoverviewrecord(noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord target = null;
            target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().find_element_user(INCIDENTOVERVIEWRECORD$0, 0);
            if (target == null)
            {
                target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().add_element_user(INCIDENTOVERVIEWRECORD$0);
            }
            target.set(incidentoverviewrecord);
        }
    }
    
    /**
     * Appends and returns a new empty "incidentoverviewrecord" element
     */
    public noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord addNewIncidentoverviewrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord target = null;
            target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().add_element_user(INCIDENTOVERVIEWRECORD$0);
            return target;
        }
    }
    /**
     * An XML incidentoverviewrecord(@).
     *
     * This is a complex type.
     */
    public static class IncidentoverviewrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord
    {
        private static final long serialVersionUID = 1L;
        
        public IncidentoverviewrecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTOVERVIEWRECORD$0 = 
            new javax.xml.namespace.QName("", "incidentoverviewrecord");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName HEATFIELD$4 = 
            new javax.xml.namespace.QName("", "heatfield");
        private static final javax.xml.namespace.QName STATE$6 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName START$8 = 
            new javax.xml.namespace.QName("", "start");
        private static final javax.xml.namespace.QName DURATION$10 = 
            new javax.xml.namespace.QName("", "duration");
        private static final javax.xml.namespace.QName END$12 = 
            new javax.xml.namespace.QName("", "end");
        private static final javax.xml.namespace.QName SOURCE$14 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName SESSION$16 = 
            new javax.xml.namespace.QName("", "session");
        private static final javax.xml.namespace.QName CONFIRMEDBY$18 = 
            new javax.xml.namespace.QName("", "confirmed_by");
        private static final javax.xml.namespace.QName CONFIRMATION$20 = 
            new javax.xml.namespace.QName("", "confirmation");
        private static final javax.xml.namespace.QName SENSITIVITY$22 = 
            new javax.xml.namespace.QName("", "sensitivity");
        private static final javax.xml.namespace.QName CONDITIONS$24 = 
            new javax.xml.namespace.QName("", "conditions");
        private static final javax.xml.namespace.QName THRESHOLDS$26 = 
            new javax.xml.namespace.QName("", "thresholds");
        private static final javax.xml.namespace.QName ACTIONS$28 = 
            new javax.xml.namespace.QName("", "actions");
        private static final javax.xml.namespace.QName MEASURES$30 = 
            new javax.xml.namespace.QName("", "measures");
        
        
        /**
         * Gets array of all "incidentoverviewrecord" elements
         */
        public noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] getIncidentoverviewrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCIDENTOVERVIEWRECORD$0, targetList);
                noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] result = new noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "incidentoverviewrecord" element
         */
        public noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord getIncidentoverviewrecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord target = null;
                target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().find_element_user(INCIDENTOVERVIEWRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "incidentoverviewrecord" element
         */
        public int sizeOfIncidentoverviewrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTOVERVIEWRECORD$0);
            }
        }
        
        /**
         * Sets array of all "incidentoverviewrecord" element
         */
        public void setIncidentoverviewrecordArray(noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] incidentoverviewrecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(incidentoverviewrecordArray, INCIDENTOVERVIEWRECORD$0);
            }
        }
        
        /**
         * Sets ith "incidentoverviewrecord" element
         */
        public void setIncidentoverviewrecordArray(int i, noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord target = null;
                target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().find_element_user(INCIDENTOVERVIEWRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(incidentoverviewrecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "incidentoverviewrecord" element
         */
        public noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord insertNewIncidentoverviewrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord target = null;
                target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().insert_element_user(INCIDENTOVERVIEWRECORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "incidentoverviewrecord" element
         */
        public noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord addNewIncidentoverviewrecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord target = null;
                target = (noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord)get_store().add_element_user(INCIDENTOVERVIEWRECORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "incidentoverviewrecord" element
         */
        public void removeIncidentoverviewrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTOVERVIEWRECORD$0, i);
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
         * Gets the "heatfield" attribute
         */
        public java.lang.String getHeatfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATFIELD$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "heatfield" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeatfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATFIELD$4);
                return target;
            }
        }
        
        /**
         * True if has "heatfield" attribute
         */
        public boolean isSetHeatfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEATFIELD$4) != null;
            }
        }
        
        /**
         * Sets the "heatfield" attribute
         */
        public void setHeatfield(java.lang.String heatfield)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEATFIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEATFIELD$4);
                }
                target.setStringValue(heatfield);
            }
        }
        
        /**
         * Sets (as xml) the "heatfield" attribute
         */
        public void xsetHeatfield(org.apache.xmlbeans.XmlString heatfield)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEATFIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEATFIELD$4);
                }
                target.set(heatfield);
            }
        }
        
        /**
         * Unsets the "heatfield" attribute
         */
        public void unsetHeatfield()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEATFIELD$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$6);
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
                return get_store().find_attribute_user(STATE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATE$6);
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
                get_store().remove_attribute(STATE$6);
            }
        }
        
        /**
         * Gets the "start" attribute
         */
        public java.util.Calendar getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "start" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(START$8);
                return target;
            }
        }
        
        /**
         * True if has "start" attribute
         */
        public boolean isSetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(START$8) != null;
            }
        }
        
        /**
         * Sets the "start" attribute
         */
        public void setStart(java.util.Calendar start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$8);
                }
                target.setCalendarValue(start);
            }
        }
        
        /**
         * Sets (as xml) the "start" attribute
         */
        public void xsetStart(org.apache.xmlbeans.XmlDateTime start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(START$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(START$8);
                }
                target.set(start);
            }
        }
        
        /**
         * Unsets the "start" attribute
         */
        public void unsetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(START$8);
            }
        }
        
        /**
         * Gets the "duration" attribute
         */
        public java.lang.String getDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "duration" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$10);
                return target;
            }
        }
        
        /**
         * True if has "duration" attribute
         */
        public boolean isSetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DURATION$10) != null;
            }
        }
        
        /**
         * Sets the "duration" attribute
         */
        public void setDuration(java.lang.String duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATION$10);
                }
                target.setStringValue(duration);
            }
        }
        
        /**
         * Sets (as xml) the "duration" attribute
         */
        public void xsetDuration(org.apache.xmlbeans.XmlString duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DURATION$10);
                }
                target.set(duration);
            }
        }
        
        /**
         * Unsets the "duration" attribute
         */
        public void unsetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DURATION$10);
            }
        }
        
        /**
         * Gets the "end" attribute
         */
        public java.util.Calendar getEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$12);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "end" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(END$12);
                return target;
            }
        }
        
        /**
         * True if has "end" attribute
         */
        public boolean isSetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(END$12) != null;
            }
        }
        
        /**
         * Sets the "end" attribute
         */
        public void setEnd(java.util.Calendar end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$12);
                }
                target.setCalendarValue(end);
            }
        }
        
        /**
         * Sets (as xml) the "end" attribute
         */
        public void xsetEnd(org.apache.xmlbeans.XmlDateTime end)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(END$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(END$12);
                }
                target.set(end);
            }
        }
        
        /**
         * Unsets the "end" attribute
         */
        public void unsetEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(END$12);
            }
        }
        
        /**
         * Gets the "source" attribute
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$14);
                return target;
            }
        }
        
        /**
         * True if has "source" attribute
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOURCE$14) != null;
            }
        }
        
        /**
         * Sets the "source" attribute
         */
        public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$14);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" attribute
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCE$14);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" attribute
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOURCE$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSION$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSION$16);
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
                return get_store().find_attribute_user(SESSION$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSION$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SESSION$16);
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
                get_store().remove_attribute(SESSION$16);
            }
        }
        
        /**
         * Gets the "confirmed_by" attribute
         */
        public java.lang.String getConfirmedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONFIRMEDBY$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "confirmed_by" attribute
         */
        public org.apache.xmlbeans.XmlString xgetConfirmedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONFIRMEDBY$18);
                return target;
            }
        }
        
        /**
         * True if has "confirmed_by" attribute
         */
        public boolean isSetConfirmedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONFIRMEDBY$18) != null;
            }
        }
        
        /**
         * Sets the "confirmed_by" attribute
         */
        public void setConfirmedBy(java.lang.String confirmedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONFIRMEDBY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONFIRMEDBY$18);
                }
                target.setStringValue(confirmedBy);
            }
        }
        
        /**
         * Sets (as xml) the "confirmed_by" attribute
         */
        public void xsetConfirmedBy(org.apache.xmlbeans.XmlString confirmedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONFIRMEDBY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONFIRMEDBY$18);
                }
                target.set(confirmedBy);
            }
        }
        
        /**
         * Unsets the "confirmed_by" attribute
         */
        public void unsetConfirmedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONFIRMEDBY$18);
            }
        }
        
        /**
         * Gets the "confirmation" attribute
         */
        public java.lang.String getConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONFIRMATION$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "confirmation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONFIRMATION$20);
                return target;
            }
        }
        
        /**
         * True if has "confirmation" attribute
         */
        public boolean isSetConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONFIRMATION$20) != null;
            }
        }
        
        /**
         * Sets the "confirmation" attribute
         */
        public void setConfirmation(java.lang.String confirmation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONFIRMATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONFIRMATION$20);
                }
                target.setStringValue(confirmation);
            }
        }
        
        /**
         * Sets (as xml) the "confirmation" attribute
         */
        public void xsetConfirmation(org.apache.xmlbeans.XmlString confirmation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONFIRMATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONFIRMATION$20);
                }
                target.set(confirmation);
            }
        }
        
        /**
         * Unsets the "confirmation" attribute
         */
        public void unsetConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONFIRMATION$20);
            }
        }
        
        /**
         * Gets the "sensitivity" attribute
         */
        public java.lang.String getSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENSITIVITY$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sensitivity" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SENSITIVITY$22);
                return target;
            }
        }
        
        /**
         * True if has "sensitivity" attribute
         */
        public boolean isSetSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SENSITIVITY$22) != null;
            }
        }
        
        /**
         * Sets the "sensitivity" attribute
         */
        public void setSensitivity(java.lang.String sensitivity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENSITIVITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENSITIVITY$22);
                }
                target.setStringValue(sensitivity);
            }
        }
        
        /**
         * Sets (as xml) the "sensitivity" attribute
         */
        public void xsetSensitivity(org.apache.xmlbeans.XmlString sensitivity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SENSITIVITY$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SENSITIVITY$22);
                }
                target.set(sensitivity);
            }
        }
        
        /**
         * Unsets the "sensitivity" attribute
         */
        public void unsetSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SENSITIVITY$22);
            }
        }
        
        /**
         * Gets the "conditions" attribute
         */
        public java.lang.String getConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITIONS$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "conditions" attribute
         */
        public org.apache.xmlbeans.XmlString xgetConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONDITIONS$24);
                return target;
            }
        }
        
        /**
         * True if has "conditions" attribute
         */
        public boolean isSetConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONDITIONS$24) != null;
            }
        }
        
        /**
         * Sets the "conditions" attribute
         */
        public void setConditions(java.lang.String conditions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONDITIONS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONDITIONS$24);
                }
                target.setStringValue(conditions);
            }
        }
        
        /**
         * Sets (as xml) the "conditions" attribute
         */
        public void xsetConditions(org.apache.xmlbeans.XmlString conditions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONDITIONS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONDITIONS$24);
                }
                target.set(conditions);
            }
        }
        
        /**
         * Unsets the "conditions" attribute
         */
        public void unsetConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONDITIONS$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRESHOLDS$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THRESHOLDS$26);
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
                return get_store().find_attribute_user(THRESHOLDS$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRESHOLDS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THRESHOLDS$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THRESHOLDS$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(THRESHOLDS$26);
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
                get_store().remove_attribute(THRESHOLDS$26);
            }
        }
        
        /**
         * Gets the "actions" attribute
         */
        public java.lang.String getActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "actions" attribute
         */
        public org.apache.xmlbeans.XmlString xgetActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONS$28);
                return target;
            }
        }
        
        /**
         * True if has "actions" attribute
         */
        public boolean isSetActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ACTIONS$28) != null;
            }
        }
        
        /**
         * Sets the "actions" attribute
         */
        public void setActions(java.lang.String actions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONS$28);
                }
                target.setStringValue(actions);
            }
        }
        
        /**
         * Sets (as xml) the "actions" attribute
         */
        public void xsetActions(org.apache.xmlbeans.XmlString actions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTIONS$28);
                }
                target.set(actions);
            }
        }
        
        /**
         * Unsets the "actions" attribute
         */
        public void unsetActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ACTIONS$28);
            }
        }
        
        /**
         * Gets the "measures" attribute
         */
        public java.lang.String getMeasures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURES$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "measures" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMeasures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASURES$30);
                return target;
            }
        }
        
        /**
         * True if has "measures" attribute
         */
        public boolean isSetMeasures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEASURES$30) != null;
            }
        }
        
        /**
         * Sets the "measures" attribute
         */
        public void setMeasures(java.lang.String measures)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASURES$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASURES$30);
                }
                target.setStringValue(measures);
            }
        }
        
        /**
         * Sets (as xml) the "measures" attribute
         */
        public void xsetMeasures(org.apache.xmlbeans.XmlString measures)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASURES$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEASURES$30);
                }
                target.set(measures);
            }
        }
        
        /**
         * Unsets the "measures" attribute
         */
        public void unsetMeasures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEASURES$30);
            }
        }
    }
}
