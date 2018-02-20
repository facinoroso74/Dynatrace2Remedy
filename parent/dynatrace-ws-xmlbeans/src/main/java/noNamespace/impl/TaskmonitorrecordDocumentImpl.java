/*
 * An XML document type.
 * Localname: taskmonitorrecord
 * Namespace: 
 * Java type: noNamespace.TaskmonitorrecordDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one taskmonitorrecord(@) element.
 *
 * This is a complex type.
 */
public class TaskmonitorrecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TaskmonitorrecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskmonitorrecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKMONITORRECORD$0 = 
        new javax.xml.namespace.QName("", "taskmonitorrecord");
    
    
    /**
     * Gets the "taskmonitorrecord" element
     */
    public noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord getTaskmonitorrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord target = null;
            target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().find_element_user(TASKMONITORRECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taskmonitorrecord" element
     */
    public void setTaskmonitorrecord(noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord taskmonitorrecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord target = null;
            target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().find_element_user(TASKMONITORRECORD$0, 0);
            if (target == null)
            {
                target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().add_element_user(TASKMONITORRECORD$0);
            }
            target.set(taskmonitorrecord);
        }
    }
    
    /**
     * Appends and returns a new empty "taskmonitorrecord" element
     */
    public noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord addNewTaskmonitorrecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord target = null;
            target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().add_element_user(TASKMONITORRECORD$0);
            return target;
        }
    }
    /**
     * An XML taskmonitorrecord(@).
     *
     * This is a complex type.
     */
    public static class TaskmonitorrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord
    {
        private static final long serialVersionUID = 1L;
        
        public TaskmonitorrecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TASKMONITORRECORD$0 = 
            new javax.xml.namespace.QName("", "taskmonitorrecord");
        private static final javax.xml.namespace.QName HEADER$2 = 
            new javax.xml.namespace.QName("", "header");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName STATUS$8 = 
            new javax.xml.namespace.QName("", "status");
        private static final javax.xml.namespace.QName LASTRUN$10 = 
            new javax.xml.namespace.QName("", "lastrun");
        private static final javax.xml.namespace.QName LASTRUNRESULT$12 = 
            new javax.xml.namespace.QName("", "lastrunresult");
        private static final javax.xml.namespace.QName NEXTRUN$14 = 
            new javax.xml.namespace.QName("", "nextrun");
        private static final javax.xml.namespace.QName CURRENTRUN$16 = 
            new javax.xml.namespace.QName("", "currentrun");
        private static final javax.xml.namespace.QName DURATION$18 = 
            new javax.xml.namespace.QName("", "duration");
        private static final javax.xml.namespace.QName DESCRIPTION$20 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName SCHEDULE$22 = 
            new javax.xml.namespace.QName("", "schedule");
        private static final javax.xml.namespace.QName TARGET$24 = 
            new javax.xml.namespace.QName("", "target");
        private static final javax.xml.namespace.QName PLUGINSTATE$26 = 
            new javax.xml.namespace.QName("", "pluginstate");
        private static final javax.xml.namespace.QName BUSINESSHOURS$28 = 
            new javax.xml.namespace.QName("", "businesshours");
        private static final javax.xml.namespace.QName SYSTEM$30 = 
            new javax.xml.namespace.QName("", "system");
        
        
        /**
         * Gets array of all "taskmonitorrecord" elements
         */
        public noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord[] getTaskmonitorrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKMONITORRECORD$0, targetList);
                noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord[] result = new noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "taskmonitorrecord" element
         */
        public noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord getTaskmonitorrecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord target = null;
                target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().find_element_user(TASKMONITORRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "taskmonitorrecord" element
         */
        public int sizeOfTaskmonitorrecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKMONITORRECORD$0);
            }
        }
        
        /**
         * Sets array of all "taskmonitorrecord" element
         */
        public void setTaskmonitorrecordArray(noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord[] taskmonitorrecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taskmonitorrecordArray, TASKMONITORRECORD$0);
            }
        }
        
        /**
         * Sets ith "taskmonitorrecord" element
         */
        public void setTaskmonitorrecordArray(int i, noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord taskmonitorrecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord target = null;
                target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().find_element_user(TASKMONITORRECORD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(taskmonitorrecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taskmonitorrecord" element
         */
        public noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord insertNewTaskmonitorrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord target = null;
                target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().insert_element_user(TASKMONITORRECORD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taskmonitorrecord" element
         */
        public noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord addNewTaskmonitorrecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord target = null;
                target = (noNamespace.TaskmonitorrecordDocument.Taskmonitorrecord)get_store().add_element_user(TASKMONITORRECORD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "taskmonitorrecord" element
         */
        public void removeTaskmonitorrecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKMONITORRECORD$0, i);
            }
        }
        
        /**
         * Gets the "header" attribute
         */
        public java.lang.String getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "header" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADER$2);
                return target;
            }
        }
        
        /**
         * True if has "header" attribute
         */
        public boolean isSetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEADER$2) != null;
            }
        }
        
        /**
         * Sets the "header" attribute
         */
        public void setHeader(java.lang.String header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADER$2);
                }
                target.setStringValue(header);
            }
        }
        
        /**
         * Sets (as xml) the "header" attribute
         */
        public void xsetHeader(org.apache.xmlbeans.XmlString header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADER$2);
                }
                target.set(header);
            }
        }
        
        /**
         * Unsets the "header" attribute
         */
        public void unsetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEADER$2);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$4) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
                return get_store().find_attribute_user(TYPE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
                get_store().remove_attribute(TYPE$6);
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
         * Gets the "lastrun" attribute
         */
        public java.util.Calendar getLastrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUN$10);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastrun" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetLastrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTRUN$10);
                return target;
            }
        }
        
        /**
         * True if has "lastrun" attribute
         */
        public boolean isSetLastrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASTRUN$10) != null;
            }
        }
        
        /**
         * Sets the "lastrun" attribute
         */
        public void setLastrun(java.util.Calendar lastrun)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTRUN$10);
                }
                target.setCalendarValue(lastrun);
            }
        }
        
        /**
         * Sets (as xml) the "lastrun" attribute
         */
        public void xsetLastrun(org.apache.xmlbeans.XmlDateTime lastrun)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTRUN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(LASTRUN$10);
                }
                target.set(lastrun);
            }
        }
        
        /**
         * Unsets the "lastrun" attribute
         */
        public void unsetLastrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASTRUN$10);
            }
        }
        
        /**
         * Gets the "lastrunresult" attribute
         */
        public java.lang.String getLastrunresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUNRESULT$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastrunresult" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLastrunresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTRUNRESULT$12);
                return target;
            }
        }
        
        /**
         * True if has "lastrunresult" attribute
         */
        public boolean isSetLastrunresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASTRUNRESULT$12) != null;
            }
        }
        
        /**
         * Sets the "lastrunresult" attribute
         */
        public void setLastrunresult(java.lang.String lastrunresult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTRUNRESULT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTRUNRESULT$12);
                }
                target.setStringValue(lastrunresult);
            }
        }
        
        /**
         * Sets (as xml) the "lastrunresult" attribute
         */
        public void xsetLastrunresult(org.apache.xmlbeans.XmlString lastrunresult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTRUNRESULT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTRUNRESULT$12);
                }
                target.set(lastrunresult);
            }
        }
        
        /**
         * Unsets the "lastrunresult" attribute
         */
        public void unsetLastrunresult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASTRUNRESULT$12);
            }
        }
        
        /**
         * Gets the "nextrun" attribute
         */
        public java.util.Calendar getNextrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEXTRUN$14);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "nextrun" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetNextrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(NEXTRUN$14);
                return target;
            }
        }
        
        /**
         * True if has "nextrun" attribute
         */
        public boolean isSetNextrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NEXTRUN$14) != null;
            }
        }
        
        /**
         * Sets the "nextrun" attribute
         */
        public void setNextrun(java.util.Calendar nextrun)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEXTRUN$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEXTRUN$14);
                }
                target.setCalendarValue(nextrun);
            }
        }
        
        /**
         * Sets (as xml) the "nextrun" attribute
         */
        public void xsetNextrun(org.apache.xmlbeans.XmlDateTime nextrun)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(NEXTRUN$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(NEXTRUN$14);
                }
                target.set(nextrun);
            }
        }
        
        /**
         * Unsets the "nextrun" attribute
         */
        public void unsetNextrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NEXTRUN$14);
            }
        }
        
        /**
         * Gets the "currentrun" attribute
         */
        public java.lang.String getCurrentrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENTRUN$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "currentrun" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCurrentrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENTRUN$16);
                return target;
            }
        }
        
        /**
         * True if has "currentrun" attribute
         */
        public boolean isSetCurrentrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CURRENTRUN$16) != null;
            }
        }
        
        /**
         * Sets the "currentrun" attribute
         */
        public void setCurrentrun(java.lang.String currentrun)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENTRUN$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENTRUN$16);
                }
                target.setStringValue(currentrun);
            }
        }
        
        /**
         * Sets (as xml) the "currentrun" attribute
         */
        public void xsetCurrentrun(org.apache.xmlbeans.XmlString currentrun)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENTRUN$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CURRENTRUN$16);
                }
                target.set(currentrun);
            }
        }
        
        /**
         * Unsets the "currentrun" attribute
         */
        public void unsetCurrentrun()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CURRENTRUN$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$18);
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
                return get_store().find_attribute_user(DURATION$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATION$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DURATION$18);
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
                get_store().remove_attribute(DURATION$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$20);
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
                return get_store().find_attribute_user(DESCRIPTION$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$20);
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
                get_store().remove_attribute(DESCRIPTION$20);
            }
        }
        
        /**
         * Gets the "schedule" attribute
         */
        public java.lang.String getSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEDULE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "schedule" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEDULE$22);
                return target;
            }
        }
        
        /**
         * True if has "schedule" attribute
         */
        public boolean isSetSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCHEDULE$22) != null;
            }
        }
        
        /**
         * Sets the "schedule" attribute
         */
        public void setSchedule(java.lang.String schedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEDULE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEDULE$22);
                }
                target.setStringValue(schedule);
            }
        }
        
        /**
         * Sets (as xml) the "schedule" attribute
         */
        public void xsetSchedule(org.apache.xmlbeans.XmlString schedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEDULE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCHEDULE$22);
                }
                target.set(schedule);
            }
        }
        
        /**
         * Unsets the "schedule" attribute
         */
        public void unsetSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCHEDULE$22);
            }
        }
        
        /**
         * Gets the "target" attribute
         */
        public java.lang.String getTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$24);
                return target;
            }
        }
        
        /**
         * True if has "target" attribute
         */
        public boolean isSetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGET$24) != null;
            }
        }
        
        /**
         * Sets the "target" attribute
         */
        public void setTarget(java.lang.String targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$24);
                }
                target.setStringValue(targetValue);
            }
        }
        
        /**
         * Sets (as xml) the "target" attribute
         */
        public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$24);
                }
                target.set(targetValue);
            }
        }
        
        /**
         * Unsets the "target" attribute
         */
        public void unsetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGET$24);
            }
        }
        
        /**
         * Gets the "pluginstate" attribute
         */
        public java.lang.String getPluginstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLUGINSTATE$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pluginstate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPluginstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLUGINSTATE$26);
                return target;
            }
        }
        
        /**
         * True if has "pluginstate" attribute
         */
        public boolean isSetPluginstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PLUGINSTATE$26) != null;
            }
        }
        
        /**
         * Sets the "pluginstate" attribute
         */
        public void setPluginstate(java.lang.String pluginstate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLUGINSTATE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLUGINSTATE$26);
                }
                target.setStringValue(pluginstate);
            }
        }
        
        /**
         * Sets (as xml) the "pluginstate" attribute
         */
        public void xsetPluginstate(org.apache.xmlbeans.XmlString pluginstate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLUGINSTATE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLUGINSTATE$26);
                }
                target.set(pluginstate);
            }
        }
        
        /**
         * Unsets the "pluginstate" attribute
         */
        public void unsetPluginstate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PLUGINSTATE$26);
            }
        }
        
        /**
         * Gets the "businesshours" attribute
         */
        public java.lang.String getBusinesshours()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUSINESSHOURS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "businesshours" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBusinesshours()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUSINESSHOURS$28);
                return target;
            }
        }
        
        /**
         * True if has "businesshours" attribute
         */
        public boolean isSetBusinesshours()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BUSINESSHOURS$28) != null;
            }
        }
        
        /**
         * Sets the "businesshours" attribute
         */
        public void setBusinesshours(java.lang.String businesshours)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUSINESSHOURS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUSINESSHOURS$28);
                }
                target.setStringValue(businesshours);
            }
        }
        
        /**
         * Sets (as xml) the "businesshours" attribute
         */
        public void xsetBusinesshours(org.apache.xmlbeans.XmlString businesshours)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUSINESSHOURS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BUSINESSHOURS$28);
                }
                target.set(businesshours);
            }
        }
        
        /**
         * Unsets the "businesshours" attribute
         */
        public void unsetBusinesshours()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BUSINESSHOURS$28);
            }
        }
        
        /**
         * Gets the "system" attribute
         */
        public java.lang.String getSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "system" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEM$30);
                return target;
            }
        }
        
        /**
         * True if has "system" attribute
         */
        public boolean isSetSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SYSTEM$30) != null;
            }
        }
        
        /**
         * Sets the "system" attribute
         */
        public void setSystem(java.lang.String system)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEM$30);
                }
                target.setStringValue(system);
            }
        }
        
        /**
         * Sets (as xml) the "system" attribute
         */
        public void xsetSystem(org.apache.xmlbeans.XmlString system)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEM$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYSTEM$30);
                }
                target.set(system);
            }
        }
        
        /**
         * Unsets the "system" attribute
         */
        public void unsetSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SYSTEM$30);
            }
        }
    }
}
