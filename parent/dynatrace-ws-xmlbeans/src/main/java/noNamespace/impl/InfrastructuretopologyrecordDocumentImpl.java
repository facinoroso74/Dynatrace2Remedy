/*
 * An XML document type.
 * Localname: infrastructuretopologyrecord
 * Namespace: 
 * Java type: noNamespace.InfrastructuretopologyrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one infrastructuretopologyrecord(@) element.
 *
 * This is a complex type.
 */
public class InfrastructuretopologyrecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructuretopologyrecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public InfrastructuretopologyrecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFRASTRUCTURETOPOLOGYRECORD$0 = 
        new javax.xml.namespace.QName("", "infrastructuretopologyrecord");
    
    
    /**
     * Gets the "infrastructuretopologyrecord" element
     */
    public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord getInfrastructuretopologyrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
            target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "infrastructuretopologyrecord" element
     */
    public void setInfrastructuretopologyrecord(noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord infrastructuretopologyrecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
            target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, 0);
            if (target == null)
            {
                target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().add_element_user(INFRASTRUCTURETOPOLOGYRECORD$0);
            }
            target.set(infrastructuretopologyrecord);
        }
    }
    
    /**
     * Appends and returns a new empty "infrastructuretopologyrecord" element
     */
    public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord addNewInfrastructuretopologyrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
            target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().add_element_user(INFRASTRUCTURETOPOLOGYRECORD$0);
            return target;
        }
    }
    /**
     * An XML infrastructuretopologyrecord(@).
     *
     * This is a complex type.
     */
    public static class InfrastructuretopologyrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord
    {
        private static final long serialVersionUID = 1L;
        
        public InfrastructuretopologyrecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INFRASTRUCTURETOPOLOGYRECORD$0 = 
            new javax.xml.namespace.QName("", "infrastructuretopologyrecord");
        private static final javax.xml.namespace.QName STRUCTURE$2 = 
            new javax.xml.namespace.QName("", "structure");
        private static final javax.xml.namespace.QName HEALTHHISTORY$4 = 
            new javax.xml.namespace.QName("", "healthhistory");
        private static final javax.xml.namespace.QName DETAILS$6 = 
            new javax.xml.namespace.QName("", "details");
        private static final javax.xml.namespace.QName STATUS$8 = 
            new javax.xml.namespace.QName("", "status");
        private static final javax.xml.namespace.QName ASSIGNEES$10 = 
            new javax.xml.namespace.QName("", "assignees");
        private static final javax.xml.namespace.QName LABELS$12 = 
            new javax.xml.namespace.QName("", "labels");
        private static final javax.xml.namespace.QName OS$14 = 
            new javax.xml.namespace.QName("", "os");
        
        
        /**
         * Gets array of all "infrastructuretopologyrecord" elements
         */
        public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] getInfrastructuretopologyrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INFRASTRUCTURETOPOLOGYRECORD$0, targetList);
                noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] result = new noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "infrastructuretopologyrecord" element
         */
        public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord getInfrastructuretopologyrecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "infrastructuretopologyrecord" element
         */
        public int sizeOfInfrastructuretopologyrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFRASTRUCTURETOPOLOGYRECORD$0);
            }
        }
        
        /**
         * Sets array of all "infrastructuretopologyrecord" element
         */
        public void setInfrastructuretopologyrecordArray(noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] infrastructuretopologyrecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(infrastructuretopologyrecordArray, INFRASTRUCTURETOPOLOGYRECORD$0);
            }
        }
        
        /**
         * Sets ith "infrastructuretopologyrecord" element
         */
        public void setInfrastructuretopologyrecordArray(int i, noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord infrastructuretopologyrecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(infrastructuretopologyrecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "infrastructuretopologyrecord" element
         */
        public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord insertNewInfrastructuretopologyrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().insert_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "infrastructuretopologyrecord" element
         */
        public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord addNewInfrastructuretopologyrecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().add_element_user(INFRASTRUCTURETOPOLOGYRECORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "infrastructuretopologyrecord" element
         */
        public void removeInfrastructuretopologyrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFRASTRUCTURETOPOLOGYRECORD$0, i);
            }
        }
        
        /**
         * Gets the "structure" attribute
         */
        public java.lang.String getStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "structure" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURE$2);
                return target;
            }
        }
        
        /**
         * True if has "structure" attribute
         */
        public boolean isSetStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STRUCTURE$2) != null;
            }
        }
        
        /**
         * Sets the "structure" attribute
         */
        public void setStructure(java.lang.String structure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTURE$2);
                }
                target.setStringValue(structure);
            }
        }
        
        /**
         * Sets (as xml) the "structure" attribute
         */
        public void xsetStructure(org.apache.xmlbeans.XmlString structure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRUCTURE$2);
                }
                target.set(structure);
            }
        }
        
        /**
         * Unsets the "structure" attribute
         */
        public void unsetStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STRUCTURE$2);
            }
        }
        
        /**
         * Gets the "healthhistory" attribute
         */
        public java.lang.String getHealthhistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "healthhistory" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHealthhistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                return target;
            }
        }
        
        /**
         * True if has "healthhistory" attribute
         */
        public boolean isSetHealthhistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEALTHHISTORY$4) != null;
            }
        }
        
        /**
         * Sets the "healthhistory" attribute
         */
        public void setHealthhistory(java.lang.String healthhistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTHHISTORY$4);
                }
                target.setStringValue(healthhistory);
            }
        }
        
        /**
         * Sets (as xml) the "healthhistory" attribute
         */
        public void xsetHealthhistory(org.apache.xmlbeans.XmlString healthhistory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTHHISTORY$4);
                }
                target.set(healthhistory);
            }
        }
        
        /**
         * Unsets the "healthhistory" attribute
         */
        public void unsetHealthhistory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEALTHHISTORY$4);
            }
        }
        
        /**
         * Gets the "details" attribute
         */
        public java.lang.String getDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILS$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "details" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAILS$6);
                return target;
            }
        }
        
        /**
         * True if has "details" attribute
         */
        public boolean isSetDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DETAILS$6) != null;
            }
        }
        
        /**
         * Sets the "details" attribute
         */
        public void setDetails(java.lang.String details)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAILS$6);
                }
                target.setStringValue(details);
            }
        }
        
        /**
         * Sets (as xml) the "details" attribute
         */
        public void xsetDetails(org.apache.xmlbeans.XmlString details)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAILS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DETAILS$6);
                }
                target.set(details);
            }
        }
        
        /**
         * Unsets the "details" attribute
         */
        public void unsetDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DETAILS$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
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
                return get_store().find_attribute_user(STATUS$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$8);
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
                get_store().remove_attribute(STATUS$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$10);
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
                return get_store().find_attribute_user(ASSIGNEES$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNEES$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ASSIGNEES$10);
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
                get_store().remove_attribute(ASSIGNEES$10);
            }
        }
        
        /**
         * Gets the "labels" attribute
         */
        public java.lang.String getLabels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "labels" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$12);
                return target;
            }
        }
        
        /**
         * True if has "labels" attribute
         */
        public boolean isSetLabels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABELS$12) != null;
            }
        }
        
        /**
         * Sets the "labels" attribute
         */
        public void setLabels(java.lang.String labels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABELS$12);
                }
                target.setStringValue(labels);
            }
        }
        
        /**
         * Sets (as xml) the "labels" attribute
         */
        public void xsetLabels(org.apache.xmlbeans.XmlString labels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABELS$12);
                }
                target.set(labels);
            }
        }
        
        /**
         * Unsets the "labels" attribute
         */
        public void unsetLabels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABELS$12);
            }
        }
        
        /**
         * Gets the "os" attribute
         */
        public java.lang.String getOs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "os" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$14);
                return target;
            }
        }
        
        /**
         * True if has "os" attribute
         */
        public boolean isSetOs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OS$14) != null;
            }
        }
        
        /**
         * Sets the "os" attribute
         */
        public void setOs(java.lang.String os)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OS$14);
                }
                target.setStringValue(os);
            }
        }
        
        /**
         * Sets (as xml) the "os" attribute
         */
        public void xsetOs(org.apache.xmlbeans.XmlString os)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OS$14);
                }
                target.set(os);
            }
        }
        
        /**
         * Unsets the "os" attribute
         */
        public void unsetOs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OS$14);
            }
        }
    }
}
