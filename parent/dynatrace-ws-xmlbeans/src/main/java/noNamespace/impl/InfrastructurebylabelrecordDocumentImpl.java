/*
 * An XML document type.
 * Localname: infrastructurebylabelrecord
 * Namespace: 
 * Java type: noNamespace.InfrastructurebylabelrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one infrastructurebylabelrecord(@) element.
 *
 * This is a complex type.
 */
public class InfrastructurebylabelrecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructurebylabelrecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public InfrastructurebylabelrecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFRASTRUCTUREBYLABELRECORD$0 = 
        new javax.xml.namespace.QName("", "infrastructurebylabelrecord");
    
    
    /**
     * Gets the "infrastructurebylabelrecord" element
     */
    public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord getInfrastructurebylabelrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
            target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "infrastructurebylabelrecord" element
     */
    public void setInfrastructurebylabelrecord(noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord infrastructurebylabelrecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
            target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, 0);
            if (target == null)
            {
                target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().add_element_user(INFRASTRUCTUREBYLABELRECORD$0);
            }
            target.set(infrastructurebylabelrecord);
        }
    }
    
    /**
     * Appends and returns a new empty "infrastructurebylabelrecord" element
     */
    public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord addNewInfrastructurebylabelrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
            target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().add_element_user(INFRASTRUCTUREBYLABELRECORD$0);
            return target;
        }
    }
    /**
     * An XML infrastructurebylabelrecord(@).
     *
     * This is a complex type.
     */
    public static class InfrastructurebylabelrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord
    {
        private static final long serialVersionUID = 1L;
        
        public InfrastructurebylabelrecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INFRASTRUCTUREBYLABELRECORD$0 = 
            new javax.xml.namespace.QName("", "infrastructurebylabelrecord");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName HEALTHHISTORY$4 = 
            new javax.xml.namespace.QName("", "healthhistory");
        private static final javax.xml.namespace.QName DETAILS$6 = 
            new javax.xml.namespace.QName("", "details");
        private static final javax.xml.namespace.QName STATUS$8 = 
            new javax.xml.namespace.QName("", "status");
        private static final javax.xml.namespace.QName ASSIGNEES$10 = 
            new javax.xml.namespace.QName("", "assignees");
        private static final javax.xml.namespace.QName SITE$12 = 
            new javax.xml.namespace.QName("", "site");
        private static final javax.xml.namespace.QName HOSTGROUP$14 = 
            new javax.xml.namespace.QName("", "hostgroup");
        private static final javax.xml.namespace.QName OS$16 = 
            new javax.xml.namespace.QName("", "os");
        
        
        /**
         * Gets array of all "infrastructurebylabelrecord" elements
         */
        public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[] getInfrastructurebylabelrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INFRASTRUCTUREBYLABELRECORD$0, targetList);
                noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[] result = new noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "infrastructurebylabelrecord" element
         */
        public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord getInfrastructurebylabelrecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "infrastructurebylabelrecord" element
         */
        public int sizeOfInfrastructurebylabelrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFRASTRUCTUREBYLABELRECORD$0);
            }
        }
        
        /**
         * Sets array of all "infrastructurebylabelrecord" element
         */
        public void setInfrastructurebylabelrecordArray(noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[] infrastructurebylabelrecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(infrastructurebylabelrecordArray, INFRASTRUCTUREBYLABELRECORD$0);
            }
        }
        
        /**
         * Sets ith "infrastructurebylabelrecord" element
         */
        public void setInfrastructurebylabelrecordArray(int i, noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord infrastructurebylabelrecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(infrastructurebylabelrecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "infrastructurebylabelrecord" element
         */
        public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord insertNewInfrastructurebylabelrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().insert_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "infrastructurebylabelrecord" element
         */
        public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord addNewInfrastructurebylabelrecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().add_element_user(INFRASTRUCTUREBYLABELRECORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "infrastructurebylabelrecord" element
         */
        public void removeInfrastructurebylabelrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFRASTRUCTUREBYLABELRECORD$0, i);
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
         * Gets the "site" attribute
         */
        public java.lang.String getSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "site" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$12);
                return target;
            }
        }
        
        /**
         * True if has "site" attribute
         */
        public boolean isSetSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SITE$12) != null;
            }
        }
        
        /**
         * Sets the "site" attribute
         */
        public void setSite(java.lang.String site)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SITE$12);
                }
                target.setStringValue(site);
            }
        }
        
        /**
         * Sets (as xml) the "site" attribute
         */
        public void xsetSite(org.apache.xmlbeans.XmlString site)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SITE$12);
                }
                target.set(site);
            }
        }
        
        /**
         * Unsets the "site" attribute
         */
        public void unsetSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SITE$12);
            }
        }
        
        /**
         * Gets the "hostgroup" attribute
         */
        public java.lang.String getHostgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUP$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hostgroup" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHostgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUP$14);
                return target;
            }
        }
        
        /**
         * True if has "hostgroup" attribute
         */
        public boolean isSetHostgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HOSTGROUP$14) != null;
            }
        }
        
        /**
         * Sets the "hostgroup" attribute
         */
        public void setHostgroup(java.lang.String hostgroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUP$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTGROUP$14);
                }
                target.setStringValue(hostgroup);
            }
        }
        
        /**
         * Sets (as xml) the "hostgroup" attribute
         */
        public void xsetHostgroup(org.apache.xmlbeans.XmlString hostgroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUP$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTGROUP$14);
                }
                target.set(hostgroup);
            }
        }
        
        /**
         * Unsets the "hostgroup" attribute
         */
        public void unsetHostgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HOSTGROUP$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$16);
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
                return get_store().find_attribute_user(OS$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OS$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OS$16);
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
                get_store().remove_attribute(OS$16);
            }
        }
    }
}
