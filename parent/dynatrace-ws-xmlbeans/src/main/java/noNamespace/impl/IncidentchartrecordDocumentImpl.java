/*
 * An XML document type.
 * Localname: incidentchartrecord
 * Namespace: 
 * Java type: noNamespace.IncidentchartrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one incidentchartrecord(@) element.
 *
 * This is a complex type.
 */
public class IncidentchartrecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentchartrecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentchartrecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTCHARTRECORD$0 = 
        new javax.xml.namespace.QName("", "incidentchartrecord");
    
    
    /**
     * Gets the "incidentchartrecord" element
     */
    public noNamespace.IncidentchartrecordDocument.Incidentchartrecord getIncidentchartrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
            target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "incidentchartrecord" element
     */
    public void setIncidentchartrecord(noNamespace.IncidentchartrecordDocument.Incidentchartrecord incidentchartrecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
            target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, 0);
            if (target == null)
            {
                target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().add_element_user(INCIDENTCHARTRECORD$0);
            }
            target.set(incidentchartrecord);
        }
    }
    
    /**
     * Appends and returns a new empty "incidentchartrecord" element
     */
    public noNamespace.IncidentchartrecordDocument.Incidentchartrecord addNewIncidentchartrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
            target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().add_element_user(INCIDENTCHARTRECORD$0);
            return target;
        }
    }
    /**
     * An XML incidentchartrecord(@).
     *
     * This is a complex type.
     */
    public static class IncidentchartrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentchartrecordDocument.Incidentchartrecord
    {
        private static final long serialVersionUID = 1L;
        
        public IncidentchartrecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTCHARTRECORD$0 = 
            new javax.xml.namespace.QName("", "incidentchartrecord");
        private static final javax.xml.namespace.QName RULE$2 = 
            new javax.xml.namespace.QName("", "rule");
        private static final javax.xml.namespace.QName SEVERITY$4 = 
            new javax.xml.namespace.QName("", "severity");
        private static final javax.xml.namespace.QName START$6 = 
            new javax.xml.namespace.QName("", "start");
        private static final javax.xml.namespace.QName END$8 = 
            new javax.xml.namespace.QName("", "end");
        private static final javax.xml.namespace.QName DURATION$10 = 
            new javax.xml.namespace.QName("", "duration");
        private static final javax.xml.namespace.QName SYSTEMPROFILE$12 = 
            new javax.xml.namespace.QName("", "systemprofile");
        private static final javax.xml.namespace.QName MESSAGE$14 = 
            new javax.xml.namespace.QName("", "message");
        private static final javax.xml.namespace.QName DESCRIPTION$16 = 
            new javax.xml.namespace.QName("", "description");
        
        
        /**
         * Gets array of all "incidentchartrecord" elements
         */
        public noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] getIncidentchartrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCIDENTCHARTRECORD$0, targetList);
                noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] result = new noNamespace.IncidentchartrecordDocument.Incidentchartrecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "incidentchartrecord" element
         */
        public noNamespace.IncidentchartrecordDocument.Incidentchartrecord getIncidentchartrecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "incidentchartrecord" element
         */
        public int sizeOfIncidentchartrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTCHARTRECORD$0);
            }
        }
        
        /**
         * Sets array of all "incidentchartrecord" element
         */
        public void setIncidentchartrecordArray(noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] incidentchartrecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(incidentchartrecordArray, INCIDENTCHARTRECORD$0);
            }
        }
        
        /**
         * Sets ith "incidentchartrecord" element
         */
        public void setIncidentchartrecordArray(int i, noNamespace.IncidentchartrecordDocument.Incidentchartrecord incidentchartrecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(incidentchartrecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "incidentchartrecord" element
         */
        public noNamespace.IncidentchartrecordDocument.Incidentchartrecord insertNewIncidentchartrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().insert_element_user(INCIDENTCHARTRECORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "incidentchartrecord" element
         */
        public noNamespace.IncidentchartrecordDocument.Incidentchartrecord addNewIncidentchartrecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().add_element_user(INCIDENTCHARTRECORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "incidentchartrecord" element
         */
        public void removeIncidentchartrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTCHARTRECORD$0, i);
            }
        }
        
        /**
         * Gets the "rule" attribute
         */
        public java.lang.String getRule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rule" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RULE$2);
                return target;
            }
        }
        
        /**
         * True if has "rule" attribute
         */
        public boolean isSetRule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RULE$2) != null;
            }
        }
        
        /**
         * Sets the "rule" attribute
         */
        public void setRule(java.lang.String rule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RULE$2);
                }
                target.setStringValue(rule);
            }
        }
        
        /**
         * Sets (as xml) the "rule" attribute
         */
        public void xsetRule(org.apache.xmlbeans.XmlString rule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RULE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RULE$2);
                }
                target.set(rule);
            }
        }
        
        /**
         * Unsets the "rule" attribute
         */
        public void unsetRule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RULE$2);
            }
        }
        
        /**
         * Gets the "severity" attribute
         */
        public java.lang.String getSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "severity" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEVERITY$4);
                return target;
            }
        }
        
        /**
         * True if has "severity" attribute
         */
        public boolean isSetSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SEVERITY$4) != null;
            }
        }
        
        /**
         * Sets the "severity" attribute
         */
        public void setSeverity(java.lang.String severity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEVERITY$4);
                }
                target.setStringValue(severity);
            }
        }
        
        /**
         * Sets (as xml) the "severity" attribute
         */
        public void xsetSeverity(org.apache.xmlbeans.XmlString severity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEVERITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEVERITY$4);
                }
                target.set(severity);
            }
        }
        
        /**
         * Unsets the "severity" attribute
         */
        public void unsetSeverity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SEVERITY$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$6);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(START$6);
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
                return get_store().find_attribute_user(START$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$6);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(START$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(START$6);
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
                get_store().remove_attribute(START$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$8);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(END$8);
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
                return get_store().find_attribute_user(END$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$8);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(END$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(END$8);
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
                get_store().remove_attribute(END$8);
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
         * Gets the "systemprofile" attribute
         */
        public java.lang.String getSystemprofile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$12);
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
                return get_store().find_attribute_user(SYSTEMPROFILE$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEMPROFILE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYSTEMPROFILE$12);
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
                get_store().remove_attribute(SYSTEMPROFILE$12);
            }
        }
        
        /**
         * Gets the "message" attribute
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "message" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$14);
                return target;
            }
        }
        
        /**
         * True if has "message" attribute
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MESSAGE$14) != null;
            }
        }
        
        /**
         * Sets the "message" attribute
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$14);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "message" attribute
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGE$14);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "message" attribute
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MESSAGE$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$16);
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
                return get_store().find_attribute_user(DESCRIPTION$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$16);
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
                get_store().remove_attribute(DESCRIPTION$16);
            }
        }
    }
}
