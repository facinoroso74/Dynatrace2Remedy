/*
 * An XML document type.
 * Localname: storedsession
 * Namespace: 
 * Java type: noNamespace.StoredsessionDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one storedsession(@) element.
 *
 * This is a complex type.
 */
public class StoredsessionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StoredsessionDocument
{
    private static final long serialVersionUID = 1L;
    
    public StoredsessionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOREDSESSION$0 = 
        new javax.xml.namespace.QName("", "storedsession");
    
    
    /**
     * Gets the "storedsession" element
     */
    public noNamespace.StoredsessionDocument.Storedsession getStoredsession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StoredsessionDocument.Storedsession target = null;
            target = (noNamespace.StoredsessionDocument.Storedsession)get_store().find_element_user(STOREDSESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "storedsession" element
     */
    public void setStoredsession(noNamespace.StoredsessionDocument.Storedsession storedsession)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StoredsessionDocument.Storedsession target = null;
            target = (noNamespace.StoredsessionDocument.Storedsession)get_store().find_element_user(STOREDSESSION$0, 0);
            if (target == null)
            {
                target = (noNamespace.StoredsessionDocument.Storedsession)get_store().add_element_user(STOREDSESSION$0);
            }
            target.set(storedsession);
        }
    }
    
    /**
     * Appends and returns a new empty "storedsession" element
     */
    public noNamespace.StoredsessionDocument.Storedsession addNewStoredsession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StoredsessionDocument.Storedsession target = null;
            target = (noNamespace.StoredsessionDocument.Storedsession)get_store().add_element_user(STOREDSESSION$0);
            return target;
        }
    }
    /**
     * An XML storedsession(@).
     *
     * This is a complex type.
     */
    public static class StoredsessionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StoredsessionDocument.Storedsession
    {
        private static final long serialVersionUID = 1L;
        
        public StoredsessionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STOREDSESSION$0 = 
            new javax.xml.namespace.QName("", "storedsession");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$4 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName SYSTEMPROFILE$8 = 
            new javax.xml.namespace.QName("", "system_profile");
        private static final javax.xml.namespace.QName SIZE$10 = 
            new javax.xml.namespace.QName("", "size");
        private static final javax.xml.namespace.QName DELLOCK$12 = 
            new javax.xml.namespace.QName("", "del_lock");
        private static final javax.xml.namespace.QName DIRECTORY$14 = 
            new javax.xml.namespace.QName("", "directory");
        private static final javax.xml.namespace.QName STATE$16 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName BEGINDATE$18 = 
            new javax.xml.namespace.QName("", "begin_date");
        private static final javax.xml.namespace.QName DURATION$20 = 
            new javax.xml.namespace.QName("", "duration");
        private static final javax.xml.namespace.QName VERSION$22 = 
            new javax.xml.namespace.QName("", "version");
        private static final javax.xml.namespace.QName LABELS$24 = 
            new javax.xml.namespace.QName("", "labels");
        private static final javax.xml.namespace.QName RECORDINGTYPE$26 = 
            new javax.xml.namespace.QName("", "recording_type");
        private static final javax.xml.namespace.QName AGENT$28 = 
            new javax.xml.namespace.QName("", "agent");
        private static final javax.xml.namespace.QName NUMPUREPATHS$30 = 
            new javax.xml.namespace.QName("", "numPurePaths");
        
        
        /**
         * Gets array of all "storedsession" elements
         */
        public noNamespace.StoredsessionDocument.Storedsession[] getStoredsessionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STOREDSESSION$0, targetList);
                noNamespace.StoredsessionDocument.Storedsession[] result = new noNamespace.StoredsessionDocument.Storedsession[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "storedsession" element
         */
        public noNamespace.StoredsessionDocument.Storedsession getStoredsessionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StoredsessionDocument.Storedsession target = null;
                target = (noNamespace.StoredsessionDocument.Storedsession)get_store().find_element_user(STOREDSESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "storedsession" element
         */
        public int sizeOfStoredsessionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STOREDSESSION$0);
            }
        }
        
        /**
         * Sets array of all "storedsession" element
         */
        public void setStoredsessionArray(noNamespace.StoredsessionDocument.Storedsession[] storedsessionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(storedsessionArray, STOREDSESSION$0);
            }
        }
        
        /**
         * Sets ith "storedsession" element
         */
        public void setStoredsessionArray(int i, noNamespace.StoredsessionDocument.Storedsession storedsession)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StoredsessionDocument.Storedsession target = null;
                target = (noNamespace.StoredsessionDocument.Storedsession)get_store().find_element_user(STOREDSESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(storedsession);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "storedsession" element
         */
        public noNamespace.StoredsessionDocument.Storedsession insertNewStoredsession(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StoredsessionDocument.Storedsession target = null;
                target = (noNamespace.StoredsessionDocument.Storedsession)get_store().insert_element_user(STOREDSESSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "storedsession" element
         */
        public noNamespace.StoredsessionDocument.Storedsession addNewStoredsession()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StoredsessionDocument.Storedsession target = null;
                target = (noNamespace.StoredsessionDocument.Storedsession)get_store().add_element_user(STOREDSESSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "storedsession" element
         */
        public void removeStoredsession(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STOREDSESSION$0, i);
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
         * Gets the "description" attribute
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
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
                return get_store().find_attribute_user(DESCRIPTION$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$4);
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
                get_store().remove_attribute(DESCRIPTION$4);
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
         * Gets the "system_profile" attribute
         */
        public java.lang.String getSystemProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "system_profile" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSystemProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$8);
                return target;
            }
        }
        
        /**
         * True if has "system_profile" attribute
         */
        public boolean isSetSystemProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SYSTEMPROFILE$8) != null;
            }
        }
        
        /**
         * Sets the "system_profile" attribute
         */
        public void setSystemProfile(java.lang.String systemProfile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEMPROFILE$8);
                }
                target.setStringValue(systemProfile);
            }
        }
        
        /**
         * Sets (as xml) the "system_profile" attribute
         */
        public void xsetSystemProfile(org.apache.xmlbeans.XmlString systemProfile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYSTEMPROFILE$8);
                }
                target.set(systemProfile);
            }
        }
        
        /**
         * Unsets the "system_profile" attribute
         */
        public void unsetSystemProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SYSTEMPROFILE$8);
            }
        }
        
        /**
         * Gets the "size" attribute
         */
        public java.lang.String getSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "size" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$10);
                return target;
            }
        }
        
        /**
         * True if has "size" attribute
         */
        public boolean isSetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIZE$10) != null;
            }
        }
        
        /**
         * Sets the "size" attribute
         */
        public void setSize(java.lang.String size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$10);
                }
                target.setStringValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "size" attribute
         */
        public void xsetSize(org.apache.xmlbeans.XmlString size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIZE$10);
                }
                target.set(size);
            }
        }
        
        /**
         * Unsets the "size" attribute
         */
        public void unsetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIZE$10);
            }
        }
        
        /**
         * Gets the "del_lock" attribute
         */
        public java.lang.String getDelLock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELLOCK$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "del_lock" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDelLock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELLOCK$12);
                return target;
            }
        }
        
        /**
         * True if has "del_lock" attribute
         */
        public boolean isSetDelLock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DELLOCK$12) != null;
            }
        }
        
        /**
         * Sets the "del_lock" attribute
         */
        public void setDelLock(java.lang.String delLock)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELLOCK$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELLOCK$12);
                }
                target.setStringValue(delLock);
            }
        }
        
        /**
         * Sets (as xml) the "del_lock" attribute
         */
        public void xsetDelLock(org.apache.xmlbeans.XmlString delLock)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELLOCK$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DELLOCK$12);
                }
                target.set(delLock);
            }
        }
        
        /**
         * Unsets the "del_lock" attribute
         */
        public void unsetDelLock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DELLOCK$12);
            }
        }
        
        /**
         * Gets the "directory" attribute
         */
        public java.lang.String getDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTORY$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "directory" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTORY$14);
                return target;
            }
        }
        
        /**
         * True if has "directory" attribute
         */
        public boolean isSetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIRECTORY$14) != null;
            }
        }
        
        /**
         * Sets the "directory" attribute
         */
        public void setDirectory(java.lang.String directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTORY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTORY$14);
                }
                target.setStringValue(directory);
            }
        }
        
        /**
         * Sets (as xml) the "directory" attribute
         */
        public void xsetDirectory(org.apache.xmlbeans.XmlString directory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DIRECTORY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DIRECTORY$14);
                }
                target.set(directory);
            }
        }
        
        /**
         * Unsets the "directory" attribute
         */
        public void unsetDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIRECTORY$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$16);
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
                return get_store().find_attribute_user(STATE$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATE$16);
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
                get_store().remove_attribute(STATE$16);
            }
        }
        
        /**
         * Gets the "begin_date" attribute
         */
        public java.util.Calendar getBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGINDATE$18);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "begin_date" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(BEGINDATE$18);
                return target;
            }
        }
        
        /**
         * True if has "begin_date" attribute
         */
        public boolean isSetBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BEGINDATE$18) != null;
            }
        }
        
        /**
         * Sets the "begin_date" attribute
         */
        public void setBeginDate(java.util.Calendar beginDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGINDATE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEGINDATE$18);
                }
                target.setCalendarValue(beginDate);
            }
        }
        
        /**
         * Sets (as xml) the "begin_date" attribute
         */
        public void xsetBeginDate(org.apache.xmlbeans.XmlDateTime beginDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(BEGINDATE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(BEGINDATE$18);
                }
                target.set(beginDate);
            }
        }
        
        /**
         * Unsets the "begin_date" attribute
         */
        public void unsetBeginDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BEGINDATE$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$20);
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
                return get_store().find_attribute_user(DURATION$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATION$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DURATION$20);
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
                get_store().remove_attribute(DURATION$20);
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$22);
                return target;
            }
        }
        
        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$22) != null;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$22);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$22);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$24);
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
                return get_store().find_attribute_user(LABELS$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABELS$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABELS$24);
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
                get_store().remove_attribute(LABELS$24);
            }
        }
        
        /**
         * Gets the "recording_type" attribute
         */
        public java.lang.String getRecordingType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDINGTYPE$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "recording_type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRecordingType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECORDINGTYPE$26);
                return target;
            }
        }
        
        /**
         * True if has "recording_type" attribute
         */
        public boolean isSetRecordingType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RECORDINGTYPE$26) != null;
            }
        }
        
        /**
         * Sets the "recording_type" attribute
         */
        public void setRecordingType(java.lang.String recordingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDINGTYPE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDINGTYPE$26);
                }
                target.setStringValue(recordingType);
            }
        }
        
        /**
         * Sets (as xml) the "recording_type" attribute
         */
        public void xsetRecordingType(org.apache.xmlbeans.XmlString recordingType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECORDINGTYPE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RECORDINGTYPE$26);
                }
                target.set(recordingType);
            }
        }
        
        /**
         * Unsets the "recording_type" attribute
         */
        public void unsetRecordingType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RECORDINGTYPE$26);
            }
        }
        
        /**
         * Gets the "agent" attribute
         */
        public java.lang.String getAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "agent" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$28);
                return target;
            }
        }
        
        /**
         * True if has "agent" attribute
         */
        public boolean isSetAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AGENT$28) != null;
            }
        }
        
        /**
         * Sets the "agent" attribute
         */
        public void setAgent(java.lang.String agent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$28);
                }
                target.setStringValue(agent);
            }
        }
        
        /**
         * Sets (as xml) the "agent" attribute
         */
        public void xsetAgent(org.apache.xmlbeans.XmlString agent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$28);
                }
                target.set(agent);
            }
        }
        
        /**
         * Unsets the "agent" attribute
         */
        public void unsetAgent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AGENT$28);
            }
        }
        
        /**
         * Gets the "numPurePaths" attribute
         */
        public java.math.BigInteger getNumPurePaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMPUREPATHS$30);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "numPurePaths" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetNumPurePaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMPUREPATHS$30);
                return target;
            }
        }
        
        /**
         * True if has "numPurePaths" attribute
         */
        public boolean isSetNumPurePaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMPUREPATHS$30) != null;
            }
        }
        
        /**
         * Sets the "numPurePaths" attribute
         */
        public void setNumPurePaths(java.math.BigInteger numPurePaths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMPUREPATHS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMPUREPATHS$30);
                }
                target.setBigIntegerValue(numPurePaths);
            }
        }
        
        /**
         * Sets (as xml) the "numPurePaths" attribute
         */
        public void xsetNumPurePaths(org.apache.xmlbeans.XmlInteger numPurePaths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMPUREPATHS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMPUREPATHS$30);
                }
                target.set(numPurePaths);
            }
        }
        
        /**
         * Unsets the "numPurePaths" attribute
         */
        public void unsetNumPurePaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMPUREPATHS$30);
            }
        }
    }
}
