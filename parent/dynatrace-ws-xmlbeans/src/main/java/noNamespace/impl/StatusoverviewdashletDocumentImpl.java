/*
 * An XML document type.
 * Localname: statusoverviewdashlet
 * Namespace: 
 * Java type: noNamespace.StatusoverviewdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one statusoverviewdashlet(@) element.
 *
 * This is a complex type.
 */
public class StatusoverviewdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusoverviewdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusoverviewdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSOVERVIEWDASHLET$0 = 
        new javax.xml.namespace.QName("", "statusoverviewdashlet");
    
    
    /**
     * Gets the "statusoverviewdashlet" element
     */
    public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet getStatusoverviewdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet target = null;
            target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().find_element_user(STATUSOVERVIEWDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "statusoverviewdashlet" element
     */
    public void setStatusoverviewdashlet(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet statusoverviewdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet target = null;
            target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().find_element_user(STATUSOVERVIEWDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().add_element_user(STATUSOVERVIEWDASHLET$0);
            }
            target.set(statusoverviewdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "statusoverviewdashlet" element
     */
    public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet addNewStatusoverviewdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet target = null;
            target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().add_element_user(STATUSOVERVIEWDASHLET$0);
            return target;
        }
    }
    /**
     * An XML statusoverviewdashlet(@).
     *
     * This is a complex type.
     */
    public static class StatusoverviewdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public StatusoverviewdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName AGENTSOVERVIEWRECORDS$4 = 
            new javax.xml.namespace.QName("", "agentsoverviewrecords");
        private static final javax.xml.namespace.QName STATUSTASKMONITORRECORDS$6 = 
            new javax.xml.namespace.QName("", "statustaskmonitorrecords");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$10 = 
            new javax.xml.namespace.QName("", "description");
        
        
        /**
         * Gets the "source" element
         */
        public noNamespace.SourceType getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$0) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(noNamespace.SourceType source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    target = (noNamespace.SourceType)get_store().add_element_user(SOURCE$0);
                }
                target.set(source);
            }
        }
        
        /**
         * Appends and returns a new empty "source" element
         */
        public noNamespace.SourceType addNewSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().add_element_user(SOURCE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$0, 0);
            }
        }
        
        /**
         * Gets the "comparesource" element
         */
        public noNamespace.SourceType getComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(COMPARESOURCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "comparesource" element
         */
        public boolean isSetComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPARESOURCE$2) != 0;
            }
        }
        
        /**
         * Sets the "comparesource" element
         */
        public void setComparesource(noNamespace.SourceType comparesource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().find_element_user(COMPARESOURCE$2, 0);
                if (target == null)
                {
                    target = (noNamespace.SourceType)get_store().add_element_user(COMPARESOURCE$2);
                }
                target.set(comparesource);
            }
        }
        
        /**
         * Appends and returns a new empty "comparesource" element
         */
        public noNamespace.SourceType addNewComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SourceType target = null;
                target = (noNamespace.SourceType)get_store().add_element_user(COMPARESOURCE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "comparesource" element
         */
        public void unsetComparesource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPARESOURCE$2, 0);
            }
        }
        
        /**
         * Gets the "agentsoverviewrecords" element
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords getAgentsoverviewrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords)get_store().find_element_user(AGENTSOVERVIEWRECORDS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "agentsoverviewrecords" element
         */
        public boolean isSetAgentsoverviewrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AGENTSOVERVIEWRECORDS$4) != 0;
            }
        }
        
        /**
         * Sets the "agentsoverviewrecords" element
         */
        public void setAgentsoverviewrecords(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords agentsoverviewrecords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords)get_store().find_element_user(AGENTSOVERVIEWRECORDS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords)get_store().add_element_user(AGENTSOVERVIEWRECORDS$4);
                }
                target.set(agentsoverviewrecords);
            }
        }
        
        /**
         * Appends and returns a new empty "agentsoverviewrecords" element
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords addNewAgentsoverviewrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords)get_store().add_element_user(AGENTSOVERVIEWRECORDS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "agentsoverviewrecords" element
         */
        public void unsetAgentsoverviewrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AGENTSOVERVIEWRECORDS$4, 0);
            }
        }
        
        /**
         * Gets the "statustaskmonitorrecords" element
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords getStatustaskmonitorrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords)get_store().find_element_user(STATUSTASKMONITORRECORDS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "statustaskmonitorrecords" element
         */
        public boolean isSetStatustaskmonitorrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSTASKMONITORRECORDS$6) != 0;
            }
        }
        
        /**
         * Sets the "statustaskmonitorrecords" element
         */
        public void setStatustaskmonitorrecords(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords statustaskmonitorrecords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords)get_store().find_element_user(STATUSTASKMONITORRECORDS$6, 0);
                if (target == null)
                {
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords)get_store().add_element_user(STATUSTASKMONITORRECORDS$6);
                }
                target.set(statustaskmonitorrecords);
            }
        }
        
        /**
         * Appends and returns a new empty "statustaskmonitorrecords" element
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords addNewStatustaskmonitorrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords)get_store().add_element_user(STATUSTASKMONITORRECORDS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "statustaskmonitorrecords" element
         */
        public void unsetStatustaskmonitorrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSTASKMONITORRECORDS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
                }
                target.set(name);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
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
                return get_store().find_attribute_user(DESCRIPTION$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$10);
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
                get_store().remove_attribute(DESCRIPTION$10);
            }
        }
        /**
         * An XML agentsoverviewrecords(@).
         *
         * This is a complex type.
         */
        public static class AgentsoverviewrecordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords
        {
            private static final long serialVersionUID = 1L;
            
            public AgentsoverviewrecordsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AGENTSOVERVIEWRECORD$0 = 
                new javax.xml.namespace.QName("", "agentsoverviewrecord");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "agentsoverviewrecord" elements
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord[] getAgentsoverviewrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(AGENTSOVERVIEWRECORD$0, targetList);
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord[] result = new noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "agentsoverviewrecord" element
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord getAgentsoverviewrecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord)get_store().find_element_user(AGENTSOVERVIEWRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "agentsoverviewrecord" element
             */
            public int sizeOfAgentsoverviewrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AGENTSOVERVIEWRECORD$0);
                }
            }
            
            /**
             * Sets array of all "agentsoverviewrecord" element
             */
            public void setAgentsoverviewrecordArray(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord[] agentsoverviewrecordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(agentsoverviewrecordArray, AGENTSOVERVIEWRECORD$0);
                }
            }
            
            /**
             * Sets ith "agentsoverviewrecord" element
             */
            public void setAgentsoverviewrecordArray(int i, noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord agentsoverviewrecord)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord)get_store().find_element_user(AGENTSOVERVIEWRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(agentsoverviewrecord);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "agentsoverviewrecord" element
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord insertNewAgentsoverviewrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord)get_store().insert_element_user(AGENTSOVERVIEWRECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "agentsoverviewrecord" element
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord addNewAgentsoverviewrecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord)get_store().add_element_user(AGENTSOVERVIEWRECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "agentsoverviewrecord" element
             */
            public void removeAgentsoverviewrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AGENTSOVERVIEWRECORD$0, i);
                }
            }
            
            /**
             * Gets the "structuretype" attribute
             */
            public java.lang.String getStructuretype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "structuretype" attribute
             */
            public org.apache.xmlbeans.XmlString xgetStructuretype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURETYPE$2);
                    return target;
                }
            }
            
            /**
             * Sets the "structuretype" attribute
             */
            public void setStructuretype(java.lang.String structuretype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTURETYPE$2);
                    }
                    target.setStringValue(structuretype);
                }
            }
            
            /**
             * Sets (as xml) the "structuretype" attribute
             */
            public void xsetStructuretype(org.apache.xmlbeans.XmlString structuretype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRUCTURETYPE$2);
                    }
                    target.set(structuretype);
                }
            }
            /**
             * An XML agentsoverviewrecord(@).
             *
             * This is a complex type.
             */
            public static class AgentsoverviewrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord
            {
                private static final long serialVersionUID = 1L;
                
                public AgentsoverviewrecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AGENTSOVERVIEWRECORD$0 = 
                    new javax.xml.namespace.QName("", "agentsoverviewrecord");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName HOST$4 = 
                    new javax.xml.namespace.QName("", "host");
                private static final javax.xml.namespace.QName HOT$6 = 
                    new javax.xml.namespace.QName("", "hot");
                private static final javax.xml.namespace.QName SYSTEM$8 = 
                    new javax.xml.namespace.QName("", "system");
                private static final javax.xml.namespace.QName MAPPING$10 = 
                    new javax.xml.namespace.QName("", "mapping");
                private static final javax.xml.namespace.QName GROUP$12 = 
                    new javax.xml.namespace.QName("", "group");
                private static final javax.xml.namespace.QName TECHNOLOGY$14 = 
                    new javax.xml.namespace.QName("", "technology");
                private static final javax.xml.namespace.QName STARTED$16 = 
                    new javax.xml.namespace.QName("", "started");
                private static final javax.xml.namespace.QName EVENTCOUNT$18 = 
                    new javax.xml.namespace.QName("", "eventcount");
                private static final javax.xml.namespace.QName CLASSLOADCOUNT$20 = 
                    new javax.xml.namespace.QName("", "classloadcount");
                private static final javax.xml.namespace.QName TOTALCLASSLOADCOUNT$22 = 
                    new javax.xml.namespace.QName("", "totalclassloadcount");
                private static final javax.xml.namespace.QName TOTALEXECPATHS$24 = 
                    new javax.xml.namespace.QName("", "totalexecpaths");
                private static final javax.xml.namespace.QName TOTALEXECTIME$26 = 
                    new javax.xml.namespace.QName("", "totalexectime");
                private static final javax.xml.namespace.QName TOTALCPUTIME$28 = 
                    new javax.xml.namespace.QName("", "totalcputime");
                private static final javax.xml.namespace.QName CONNECTION$30 = 
                    new javax.xml.namespace.QName("", "connection");
                private static final javax.xml.namespace.QName LICENSE$32 = 
                    new javax.xml.namespace.QName("", "license");
                private static final javax.xml.namespace.QName CAPTURE$34 = 
                    new javax.xml.namespace.QName("", "capture");
                private static final javax.xml.namespace.QName TOTALSKIPPEDEVENTS$36 = 
                    new javax.xml.namespace.QName("", "totalskippedevents");
                private static final javax.xml.namespace.QName TOTALSKIPPEDPUREPATHS$38 = 
                    new javax.xml.namespace.QName("", "totalskippedpurepaths");
                private static final javax.xml.namespace.QName INSTRUMENTORTIMEMILLISAVG$40 = 
                    new javax.xml.namespace.QName("", "instrumentortimemillisavg");
                private static final javax.xml.namespace.QName INSTRUMENTORTIMEMILLISMAX$42 = 
                    new javax.xml.namespace.QName("", "instrumentortimemillismax");
                private static final javax.xml.namespace.QName COLLECTOR$44 = 
                    new javax.xml.namespace.QName("", "collector");
                private static final javax.xml.namespace.QName SYSTEMID$46 = 
                    new javax.xml.namespace.QName("", "systemid");
                private static final javax.xml.namespace.QName BYTESSENT$48 = 
                    new javax.xml.namespace.QName("", "bytessent");
                private static final javax.xml.namespace.QName BYTESRECEIVED$50 = 
                    new javax.xml.namespace.QName("", "bytesreceived");
                private static final javax.xml.namespace.QName MPS$52 = 
                    new javax.xml.namespace.QName("", "mps");
                private static final javax.xml.namespace.QName TPS$54 = 
                    new javax.xml.namespace.QName("", "tps");
                private static final javax.xml.namespace.QName PUREPATHLENGTH$56 = 
                    new javax.xml.namespace.QName("", "purepathlength");
                private static final javax.xml.namespace.QName COMPLETEDPUREPATHS$58 = 
                    new javax.xml.namespace.QName("", "completedpurepaths");
                private static final javax.xml.namespace.QName SKIPPEDEVENTS$60 = 
                    new javax.xml.namespace.QName("", "skippedevents");
                private static final javax.xml.namespace.QName QUEUEUSEDSIZE$62 = 
                    new javax.xml.namespace.QName("", "queueusedsize");
                private static final javax.xml.namespace.QName QUEUECOMMITTEDSIZE$64 = 
                    new javax.xml.namespace.QName("", "queuecommittedsize");
                private static final javax.xml.namespace.QName INSTRUMENTATIONOVERHEAD$66 = 
                    new javax.xml.namespace.QName("", "instrumentationoverhead");
                private static final javax.xml.namespace.QName BYTESREADFROMAGENT$68 = 
                    new javax.xml.namespace.QName("", "bytesreadfromagent");
                private static final javax.xml.namespace.QName PUREPATHLIFETIME$70 = 
                    new javax.xml.namespace.QName("", "purepathlifetime");
                private static final javax.xml.namespace.QName CONCURRENTPUREPATHS$72 = 
                    new javax.xml.namespace.QName("", "concurrentpurepaths");
                private static final javax.xml.namespace.QName VIRTUAL$74 = 
                    new javax.xml.namespace.QName("", "virtual");
                private static final javax.xml.namespace.QName VERSION$76 = 
                    new javax.xml.namespace.QName("", "version");
                private static final javax.xml.namespace.QName BOOTSTRAPPED$78 = 
                    new javax.xml.namespace.QName("", "bootstrapped");
                private static final javax.xml.namespace.QName AGENTID$80 = 
                    new javax.xml.namespace.QName("", "agentid");
                private static final javax.xml.namespace.QName CACHEHITS$82 = 
                    new javax.xml.namespace.QName("", "cache_hits");
                private static final javax.xml.namespace.QName CACHEMISSS$84 = 
                    new javax.xml.namespace.QName("", "cache_misss");
                private static final javax.xml.namespace.QName TECHNOLOGYDESC$86 = 
                    new javax.xml.namespace.QName("", "technologydesc");
                private static final javax.xml.namespace.QName HOTDESC$88 = 
                    new javax.xml.namespace.QName("", "hotdesc");
                private static final javax.xml.namespace.QName BOOSTRAPVERSION$90 = 
                    new javax.xml.namespace.QName("", "boostrapversion");
                private static final javax.xml.namespace.QName OS$92 = 
                    new javax.xml.namespace.QName("", "os");
                private static final javax.xml.namespace.QName OSARCH$94 = 
                    new javax.xml.namespace.QName("", "osarch");
                private static final javax.xml.namespace.QName TECHVERSION$96 = 
                    new javax.xml.namespace.QName("", "techversion");
                private static final javax.xml.namespace.QName EXTENDEDAGENTSTATE$98 = 
                    new javax.xml.namespace.QName("", "extended_agent_state");
                private static final javax.xml.namespace.QName STATUSTEXT$100 = 
                    new javax.xml.namespace.QName("", "statustext");
                private static final javax.xml.namespace.QName AGENTPLATFORM$102 = 
                    new javax.xml.namespace.QName("", "agent_platform");
                
                
                /**
                 * Gets array of all "agentsoverviewrecord" elements
                 */
                public noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord[] getAgentsoverviewrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(AGENTSOVERVIEWRECORD$0, targetList);
                      noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord[] result = new noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "agentsoverviewrecord" element
                 */
                public noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord getAgentsoverviewrecordArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord target = null;
                      target = (noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord)get_store().find_element_user(AGENTSOVERVIEWRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "agentsoverviewrecord" element
                 */
                public int sizeOfAgentsoverviewrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AGENTSOVERVIEWRECORD$0);
                    }
                }
                
                /**
                 * Sets array of all "agentsoverviewrecord" element
                 */
                public void setAgentsoverviewrecordArray(noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord[] agentsoverviewrecordArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(agentsoverviewrecordArray, AGENTSOVERVIEWRECORD$0);
                    }
                }
                
                /**
                 * Sets ith "agentsoverviewrecord" element
                 */
                public void setAgentsoverviewrecordArray(int i, noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord agentsoverviewrecord)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord target = null;
                      target = (noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord)get_store().find_element_user(AGENTSOVERVIEWRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(agentsoverviewrecord);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "agentsoverviewrecord" element
                 */
                public noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord insertNewAgentsoverviewrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord target = null;
                      target = (noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord)get_store().insert_element_user(AGENTSOVERVIEWRECORD$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "agentsoverviewrecord" element
                 */
                public noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord addNewAgentsoverviewrecord()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord target = null;
                      target = (noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord)get_store().add_element_user(AGENTSOVERVIEWRECORD$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "agentsoverviewrecord" element
                 */
                public void removeAgentsoverviewrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AGENTSOVERVIEWRECORD$0, i);
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
                 * Gets the "host" attribute
                 */
                public java.lang.String getHost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "host" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "host" attribute
                 */
                public boolean isSetHost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOST$4) != null;
                    }
                }
                
                /**
                 * Sets the "host" attribute
                 */
                public void setHost(java.lang.String host)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOST$4);
                      }
                      target.setStringValue(host);
                    }
                }
                
                /**
                 * Sets (as xml) the "host" attribute
                 */
                public void xsetHost(org.apache.xmlbeans.XmlString host)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOST$4);
                      }
                      target.set(host);
                    }
                }
                
                /**
                 * Unsets the "host" attribute
                 */
                public void unsetHost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOST$4);
                    }
                }
                
                /**
                 * Gets the "hot" attribute
                 */
                public java.lang.String getHot()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOT$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hot" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHot()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOT$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "hot" attribute
                 */
                public boolean isSetHot()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOT$6) != null;
                    }
                }
                
                /**
                 * Sets the "hot" attribute
                 */
                public void setHot(java.lang.String hot)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOT$6);
                      }
                      target.setStringValue(hot);
                    }
                }
                
                /**
                 * Sets (as xml) the "hot" attribute
                 */
                public void xsetHot(org.apache.xmlbeans.XmlString hot)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOT$6);
                      }
                      target.set(hot);
                    }
                }
                
                /**
                 * Unsets the "hot" attribute
                 */
                public void unsetHot()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOT$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$8);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEM$8);
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
                      return get_store().find_attribute_user(SYSTEM$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEM$8);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYSTEM$8);
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
                      get_store().remove_attribute(SYSTEM$8);
                    }
                }
                
                /**
                 * Gets the "mapping" attribute
                 */
                public java.lang.String getMapping()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPING$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "mapping" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMapping()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPPING$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "mapping" attribute
                 */
                public boolean isSetMapping()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MAPPING$10) != null;
                    }
                }
                
                /**
                 * Sets the "mapping" attribute
                 */
                public void setMapping(java.lang.String mapping)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPING$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAPPING$10);
                      }
                      target.setStringValue(mapping);
                    }
                }
                
                /**
                 * Sets (as xml) the "mapping" attribute
                 */
                public void xsetMapping(org.apache.xmlbeans.XmlString mapping)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPPING$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAPPING$10);
                      }
                      target.set(mapping);
                    }
                }
                
                /**
                 * Unsets the "mapping" attribute
                 */
                public void unsetMapping()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MAPPING$10);
                    }
                }
                
                /**
                 * Gets the "group" attribute
                 */
                public java.lang.String getGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "group" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "group" attribute
                 */
                public boolean isSetGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(GROUP$12) != null;
                    }
                }
                
                /**
                 * Sets the "group" attribute
                 */
                public void setGroup(java.lang.String group)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$12);
                      }
                      target.setStringValue(group);
                    }
                }
                
                /**
                 * Sets (as xml) the "group" attribute
                 */
                public void xsetGroup(org.apache.xmlbeans.XmlString group)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$12);
                      }
                      target.set(group);
                    }
                }
                
                /**
                 * Unsets the "group" attribute
                 */
                public void unsetGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(GROUP$12);
                    }
                }
                
                /**
                 * Gets the "technology" attribute
                 */
                public java.lang.String getTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGY$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "technology" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGY$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "technology" attribute
                 */
                public boolean isSetTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TECHNOLOGY$14) != null;
                    }
                }
                
                /**
                 * Sets the "technology" attribute
                 */
                public void setTechnology(java.lang.String technology)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGY$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TECHNOLOGY$14);
                      }
                      target.setStringValue(technology);
                    }
                }
                
                /**
                 * Sets (as xml) the "technology" attribute
                 */
                public void xsetTechnology(org.apache.xmlbeans.XmlString technology)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGY$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TECHNOLOGY$14);
                      }
                      target.set(technology);
                    }
                }
                
                /**
                 * Unsets the "technology" attribute
                 */
                public void unsetTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TECHNOLOGY$14);
                    }
                }
                
                /**
                 * Gets the "started" attribute
                 */
                public java.util.Calendar getStarted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTED$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "started" attribute
                 */
                public org.apache.xmlbeans.XmlDateTime xgetStarted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTED$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "started" attribute
                 */
                public boolean isSetStarted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STARTED$16) != null;
                    }
                }
                
                /**
                 * Sets the "started" attribute
                 */
                public void setStarted(java.util.Calendar started)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTED$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTED$16);
                      }
                      target.setCalendarValue(started);
                    }
                }
                
                /**
                 * Sets (as xml) the "started" attribute
                 */
                public void xsetStarted(org.apache.xmlbeans.XmlDateTime started)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTED$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTED$16);
                      }
                      target.set(started);
                    }
                }
                
                /**
                 * Unsets the "started" attribute
                 */
                public void unsetStarted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STARTED$16);
                    }
                }
                
                /**
                 * Gets the "eventcount" attribute
                 */
                public java.math.BigInteger getEventcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTCOUNT$18);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "eventcount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetEventcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EVENTCOUNT$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "eventcount" attribute
                 */
                public boolean isSetEventcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EVENTCOUNT$18) != null;
                    }
                }
                
                /**
                 * Sets the "eventcount" attribute
                 */
                public void setEventcount(java.math.BigInteger eventcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENTCOUNT$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVENTCOUNT$18);
                      }
                      target.setBigIntegerValue(eventcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "eventcount" attribute
                 */
                public void xsetEventcount(org.apache.xmlbeans.XmlInteger eventcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EVENTCOUNT$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(EVENTCOUNT$18);
                      }
                      target.set(eventcount);
                    }
                }
                
                /**
                 * Unsets the "eventcount" attribute
                 */
                public void unsetEventcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EVENTCOUNT$18);
                    }
                }
                
                /**
                 * Gets the "classloadcount" attribute
                 */
                public java.math.BigInteger getClassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSLOADCOUNT$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "classloadcount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetClassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CLASSLOADCOUNT$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "classloadcount" attribute
                 */
                public boolean isSetClassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLASSLOADCOUNT$20) != null;
                    }
                }
                
                /**
                 * Sets the "classloadcount" attribute
                 */
                public void setClassloadcount(java.math.BigInteger classloadcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSLOADCOUNT$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSLOADCOUNT$20);
                      }
                      target.setBigIntegerValue(classloadcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "classloadcount" attribute
                 */
                public void xsetClassloadcount(org.apache.xmlbeans.XmlInteger classloadcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CLASSLOADCOUNT$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CLASSLOADCOUNT$20);
                      }
                      target.set(classloadcount);
                    }
                }
                
                /**
                 * Unsets the "classloadcount" attribute
                 */
                public void unsetClassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLASSLOADCOUNT$20);
                    }
                }
                
                /**
                 * Gets the "totalclassloadcount" attribute
                 */
                public java.math.BigInteger getTotalclassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALCLASSLOADCOUNT$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "totalclassloadcount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetTotalclassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALCLASSLOADCOUNT$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "totalclassloadcount" attribute
                 */
                public boolean isSetTotalclassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALCLASSLOADCOUNT$22) != null;
                    }
                }
                
                /**
                 * Sets the "totalclassloadcount" attribute
                 */
                public void setTotalclassloadcount(java.math.BigInteger totalclassloadcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALCLASSLOADCOUNT$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALCLASSLOADCOUNT$22);
                      }
                      target.setBigIntegerValue(totalclassloadcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "totalclassloadcount" attribute
                 */
                public void xsetTotalclassloadcount(org.apache.xmlbeans.XmlInteger totalclassloadcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALCLASSLOADCOUNT$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOTALCLASSLOADCOUNT$22);
                      }
                      target.set(totalclassloadcount);
                    }
                }
                
                /**
                 * Unsets the "totalclassloadcount" attribute
                 */
                public void unsetTotalclassloadcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALCLASSLOADCOUNT$22);
                    }
                }
                
                /**
                 * Gets the "totalexecpaths" attribute
                 */
                public java.math.BigInteger getTotalexecpaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALEXECPATHS$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "totalexecpaths" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetTotalexecpaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALEXECPATHS$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "totalexecpaths" attribute
                 */
                public boolean isSetTotalexecpaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALEXECPATHS$24) != null;
                    }
                }
                
                /**
                 * Sets the "totalexecpaths" attribute
                 */
                public void setTotalexecpaths(java.math.BigInteger totalexecpaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALEXECPATHS$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALEXECPATHS$24);
                      }
                      target.setBigIntegerValue(totalexecpaths);
                    }
                }
                
                /**
                 * Sets (as xml) the "totalexecpaths" attribute
                 */
                public void xsetTotalexecpaths(org.apache.xmlbeans.XmlInteger totalexecpaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALEXECPATHS$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOTALEXECPATHS$24);
                      }
                      target.set(totalexecpaths);
                    }
                }
                
                /**
                 * Unsets the "totalexecpaths" attribute
                 */
                public void unsetTotalexecpaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALEXECPATHS$24);
                    }
                }
                
                /**
                 * Gets the "totalexectime" attribute
                 */
                public double getTotalexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALEXECTIME$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "totalexectime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALEXECTIME$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "totalexectime" attribute
                 */
                public boolean isSetTotalexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALEXECTIME$26) != null;
                    }
                }
                
                /**
                 * Sets the "totalexectime" attribute
                 */
                public void setTotalexectime(double totalexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALEXECTIME$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALEXECTIME$26);
                      }
                      target.setDoubleValue(totalexectime);
                    }
                }
                
                /**
                 * Sets (as xml) the "totalexectime" attribute
                 */
                public void xsetTotalexectime(org.apache.xmlbeans.XmlDouble totalexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALEXECTIME$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALEXECTIME$26);
                      }
                      target.set(totalexectime);
                    }
                }
                
                /**
                 * Unsets the "totalexectime" attribute
                 */
                public void unsetTotalexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALEXECTIME$26);
                    }
                }
                
                /**
                 * Gets the "totalcputime" attribute
                 */
                public double getTotalcputime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALCPUTIME$28);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "totalcputime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalcputime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALCPUTIME$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "totalcputime" attribute
                 */
                public boolean isSetTotalcputime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALCPUTIME$28) != null;
                    }
                }
                
                /**
                 * Sets the "totalcputime" attribute
                 */
                public void setTotalcputime(double totalcputime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALCPUTIME$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALCPUTIME$28);
                      }
                      target.setDoubleValue(totalcputime);
                    }
                }
                
                /**
                 * Sets (as xml) the "totalcputime" attribute
                 */
                public void xsetTotalcputime(org.apache.xmlbeans.XmlDouble totalcputime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALCPUTIME$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALCPUTIME$28);
                      }
                      target.set(totalcputime);
                    }
                }
                
                /**
                 * Unsets the "totalcputime" attribute
                 */
                public void unsetTotalcputime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALCPUTIME$28);
                    }
                }
                
                /**
                 * Gets the "connection" attribute
                 */
                public java.lang.String getConnection()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTION$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "connection" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetConnection()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTION$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "connection" attribute
                 */
                public boolean isSetConnection()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CONNECTION$30) != null;
                    }
                }
                
                /**
                 * Sets the "connection" attribute
                 */
                public void setConnection(java.lang.String connection)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTION$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTION$30);
                      }
                      target.setStringValue(connection);
                    }
                }
                
                /**
                 * Sets (as xml) the "connection" attribute
                 */
                public void xsetConnection(org.apache.xmlbeans.XmlString connection)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTION$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTION$30);
                      }
                      target.set(connection);
                    }
                }
                
                /**
                 * Unsets the "connection" attribute
                 */
                public void unsetConnection()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CONNECTION$30);
                    }
                }
                
                /**
                 * Gets the "license" attribute
                 */
                public java.lang.String getLicense()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LICENSE$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "license" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLicense()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LICENSE$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "license" attribute
                 */
                public boolean isSetLicense()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LICENSE$32) != null;
                    }
                }
                
                /**
                 * Sets the "license" attribute
                 */
                public void setLicense(java.lang.String license)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LICENSE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LICENSE$32);
                      }
                      target.setStringValue(license);
                    }
                }
                
                /**
                 * Sets (as xml) the "license" attribute
                 */
                public void xsetLicense(org.apache.xmlbeans.XmlString license)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LICENSE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LICENSE$32);
                      }
                      target.set(license);
                    }
                }
                
                /**
                 * Unsets the "license" attribute
                 */
                public void unsetLicense()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LICENSE$32);
                    }
                }
                
                /**
                 * Gets the "capture" attribute
                 */
                public java.lang.String getCapture()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTURE$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "capture" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCapture()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CAPTURE$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "capture" attribute
                 */
                public boolean isSetCapture()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CAPTURE$34) != null;
                    }
                }
                
                /**
                 * Sets the "capture" attribute
                 */
                public void setCapture(java.lang.String capture)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTURE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAPTURE$34);
                      }
                      target.setStringValue(capture);
                    }
                }
                
                /**
                 * Sets (as xml) the "capture" attribute
                 */
                public void xsetCapture(org.apache.xmlbeans.XmlString capture)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CAPTURE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CAPTURE$34);
                      }
                      target.set(capture);
                    }
                }
                
                /**
                 * Unsets the "capture" attribute
                 */
                public void unsetCapture()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CAPTURE$34);
                    }
                }
                
                /**
                 * Gets the "totalskippedevents" attribute
                 */
                public java.math.BigInteger getTotalskippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSKIPPEDEVENTS$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "totalskippedevents" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetTotalskippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALSKIPPEDEVENTS$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "totalskippedevents" attribute
                 */
                public boolean isSetTotalskippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALSKIPPEDEVENTS$36) != null;
                    }
                }
                
                /**
                 * Sets the "totalskippedevents" attribute
                 */
                public void setTotalskippedevents(java.math.BigInteger totalskippedevents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSKIPPEDEVENTS$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSKIPPEDEVENTS$36);
                      }
                      target.setBigIntegerValue(totalskippedevents);
                    }
                }
                
                /**
                 * Sets (as xml) the "totalskippedevents" attribute
                 */
                public void xsetTotalskippedevents(org.apache.xmlbeans.XmlInteger totalskippedevents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALSKIPPEDEVENTS$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOTALSKIPPEDEVENTS$36);
                      }
                      target.set(totalskippedevents);
                    }
                }
                
                /**
                 * Unsets the "totalskippedevents" attribute
                 */
                public void unsetTotalskippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALSKIPPEDEVENTS$36);
                    }
                }
                
                /**
                 * Gets the "totalskippedpurepaths" attribute
                 */
                public java.math.BigInteger getTotalskippedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSKIPPEDPUREPATHS$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "totalskippedpurepaths" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetTotalskippedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALSKIPPEDPUREPATHS$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "totalskippedpurepaths" attribute
                 */
                public boolean isSetTotalskippedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALSKIPPEDPUREPATHS$38) != null;
                    }
                }
                
                /**
                 * Sets the "totalskippedpurepaths" attribute
                 */
                public void setTotalskippedpurepaths(java.math.BigInteger totalskippedpurepaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSKIPPEDPUREPATHS$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSKIPPEDPUREPATHS$38);
                      }
                      target.setBigIntegerValue(totalskippedpurepaths);
                    }
                }
                
                /**
                 * Sets (as xml) the "totalskippedpurepaths" attribute
                 */
                public void xsetTotalskippedpurepaths(org.apache.xmlbeans.XmlInteger totalskippedpurepaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TOTALSKIPPEDPUREPATHS$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TOTALSKIPPEDPUREPATHS$38);
                      }
                      target.set(totalskippedpurepaths);
                    }
                }
                
                /**
                 * Unsets the "totalskippedpurepaths" attribute
                 */
                public void unsetTotalskippedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALSKIPPEDPUREPATHS$38);
                    }
                }
                
                /**
                 * Gets the "instrumentortimemillisavg" attribute
                 */
                public double getInstrumentortimemillisavg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISAVG$40);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "instrumentortimemillisavg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetInstrumentortimemillisavg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISAVG$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "instrumentortimemillisavg" attribute
                 */
                public boolean isSetInstrumentortimemillisavg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INSTRUMENTORTIMEMILLISAVG$40) != null;
                    }
                }
                
                /**
                 * Sets the "instrumentortimemillisavg" attribute
                 */
                public void setInstrumentortimemillisavg(double instrumentortimemillisavg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISAVG$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTORTIMEMILLISAVG$40);
                      }
                      target.setDoubleValue(instrumentortimemillisavg);
                    }
                }
                
                /**
                 * Sets (as xml) the "instrumentortimemillisavg" attribute
                 */
                public void xsetInstrumentortimemillisavg(org.apache.xmlbeans.XmlDouble instrumentortimemillisavg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISAVG$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INSTRUMENTORTIMEMILLISAVG$40);
                      }
                      target.set(instrumentortimemillisavg);
                    }
                }
                
                /**
                 * Unsets the "instrumentortimemillisavg" attribute
                 */
                public void unsetInstrumentortimemillisavg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INSTRUMENTORTIMEMILLISAVG$40);
                    }
                }
                
                /**
                 * Gets the "instrumentortimemillismax" attribute
                 */
                public double getInstrumentortimemillismax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISMAX$42);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "instrumentortimemillismax" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetInstrumentortimemillismax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISMAX$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "instrumentortimemillismax" attribute
                 */
                public boolean isSetInstrumentortimemillismax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INSTRUMENTORTIMEMILLISMAX$42) != null;
                    }
                }
                
                /**
                 * Sets the "instrumentortimemillismax" attribute
                 */
                public void setInstrumentortimemillismax(double instrumentortimemillismax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISMAX$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTORTIMEMILLISMAX$42);
                      }
                      target.setDoubleValue(instrumentortimemillismax);
                    }
                }
                
                /**
                 * Sets (as xml) the "instrumentortimemillismax" attribute
                 */
                public void xsetInstrumentortimemillismax(org.apache.xmlbeans.XmlDouble instrumentortimemillismax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INSTRUMENTORTIMEMILLISMAX$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INSTRUMENTORTIMEMILLISMAX$42);
                      }
                      target.set(instrumentortimemillismax);
                    }
                }
                
                /**
                 * Unsets the "instrumentortimemillismax" attribute
                 */
                public void unsetInstrumentortimemillismax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INSTRUMENTORTIMEMILLISMAX$42);
                    }
                }
                
                /**
                 * Gets the "collector" attribute
                 */
                public java.lang.String getCollector()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLECTOR$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "collector" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCollector()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLLECTOR$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "collector" attribute
                 */
                public boolean isSetCollector()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COLLECTOR$44) != null;
                    }
                }
                
                /**
                 * Sets the "collector" attribute
                 */
                public void setCollector(java.lang.String collector)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLECTOR$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLECTOR$44);
                      }
                      target.setStringValue(collector);
                    }
                }
                
                /**
                 * Sets (as xml) the "collector" attribute
                 */
                public void xsetCollector(org.apache.xmlbeans.XmlString collector)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLLECTOR$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLLECTOR$44);
                      }
                      target.set(collector);
                    }
                }
                
                /**
                 * Unsets the "collector" attribute
                 */
                public void unsetCollector()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COLLECTOR$44);
                    }
                }
                
                /**
                 * Gets the "systemid" attribute
                 */
                public java.math.BigInteger getSystemid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMID$46);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "systemid" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSystemid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SYSTEMID$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "systemid" attribute
                 */
                public boolean isSetSystemid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYSTEMID$46) != null;
                    }
                }
                
                /**
                 * Sets the "systemid" attribute
                 */
                public void setSystemid(java.math.BigInteger systemid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMID$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEMID$46);
                      }
                      target.setBigIntegerValue(systemid);
                    }
                }
                
                /**
                 * Sets (as xml) the "systemid" attribute
                 */
                public void xsetSystemid(org.apache.xmlbeans.XmlInteger systemid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SYSTEMID$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SYSTEMID$46);
                      }
                      target.set(systemid);
                    }
                }
                
                /**
                 * Unsets the "systemid" attribute
                 */
                public void unsetSystemid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYSTEMID$46);
                    }
                }
                
                /**
                 * Gets the "bytessent" attribute
                 */
                public java.math.BigInteger getBytessent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENT$48);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytessent" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytessent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENT$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytessent" attribute
                 */
                public boolean isSetBytessent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESSENT$48) != null;
                    }
                }
                
                /**
                 * Sets the "bytessent" attribute
                 */
                public void setBytessent(java.math.BigInteger bytessent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENT$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESSENT$48);
                      }
                      target.setBigIntegerValue(bytessent);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytessent" attribute
                 */
                public void xsetBytessent(org.apache.xmlbeans.XmlInteger bytessent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENT$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESSENT$48);
                      }
                      target.set(bytessent);
                    }
                }
                
                /**
                 * Unsets the "bytessent" attribute
                 */
                public void unsetBytessent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESSENT$48);
                    }
                }
                
                /**
                 * Gets the "bytesreceived" attribute
                 */
                public java.math.BigInteger getBytesreceived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVED$50);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytesreceived" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesreceived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVED$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytesreceived" attribute
                 */
                public boolean isSetBytesreceived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESRECEIVED$50) != null;
                    }
                }
                
                /**
                 * Sets the "bytesreceived" attribute
                 */
                public void setBytesreceived(java.math.BigInteger bytesreceived)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVED$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESRECEIVED$50);
                      }
                      target.setBigIntegerValue(bytesreceived);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytesreceived" attribute
                 */
                public void xsetBytesreceived(org.apache.xmlbeans.XmlInteger bytesreceived)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVED$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESRECEIVED$50);
                      }
                      target.set(bytesreceived);
                    }
                }
                
                /**
                 * Unsets the "bytesreceived" attribute
                 */
                public void unsetBytesreceived()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESRECEIVED$50);
                    }
                }
                
                /**
                 * Gets the "mps" attribute
                 */
                public java.lang.String getMps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MPS$52);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "mps" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MPS$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "mps" attribute
                 */
                public boolean isSetMps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MPS$52) != null;
                    }
                }
                
                /**
                 * Sets the "mps" attribute
                 */
                public void setMps(java.lang.String mps)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MPS$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MPS$52);
                      }
                      target.setStringValue(mps);
                    }
                }
                
                /**
                 * Sets (as xml) the "mps" attribute
                 */
                public void xsetMps(org.apache.xmlbeans.XmlString mps)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MPS$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MPS$52);
                      }
                      target.set(mps);
                    }
                }
                
                /**
                 * Unsets the "mps" attribute
                 */
                public void unsetMps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MPS$52);
                    }
                }
                
                /**
                 * Gets the "tps" attribute
                 */
                public java.lang.String getTps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TPS$54);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "tps" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TPS$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "tps" attribute
                 */
                public boolean isSetTps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TPS$54) != null;
                    }
                }
                
                /**
                 * Sets the "tps" attribute
                 */
                public void setTps(java.lang.String tps)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TPS$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TPS$54);
                      }
                      target.setStringValue(tps);
                    }
                }
                
                /**
                 * Sets (as xml) the "tps" attribute
                 */
                public void xsetTps(org.apache.xmlbeans.XmlString tps)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TPS$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TPS$54);
                      }
                      target.set(tps);
                    }
                }
                
                /**
                 * Unsets the "tps" attribute
                 */
                public void unsetTps()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TPS$54);
                    }
                }
                
                /**
                 * Gets the "purepathlength" attribute
                 */
                public java.math.BigInteger getPurepathlength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUREPATHLENGTH$56);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "purepathlength" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPurepathlength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PUREPATHLENGTH$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "purepathlength" attribute
                 */
                public boolean isSetPurepathlength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PUREPATHLENGTH$56) != null;
                    }
                }
                
                /**
                 * Sets the "purepathlength" attribute
                 */
                public void setPurepathlength(java.math.BigInteger purepathlength)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUREPATHLENGTH$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUREPATHLENGTH$56);
                      }
                      target.setBigIntegerValue(purepathlength);
                    }
                }
                
                /**
                 * Sets (as xml) the "purepathlength" attribute
                 */
                public void xsetPurepathlength(org.apache.xmlbeans.XmlInteger purepathlength)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PUREPATHLENGTH$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PUREPATHLENGTH$56);
                      }
                      target.set(purepathlength);
                    }
                }
                
                /**
                 * Unsets the "purepathlength" attribute
                 */
                public void unsetPurepathlength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PUREPATHLENGTH$56);
                    }
                }
                
                /**
                 * Gets the "completedpurepaths" attribute
                 */
                public java.math.BigInteger getCompletedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETEDPUREPATHS$58);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "completedpurepaths" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetCompletedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPLETEDPUREPATHS$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "completedpurepaths" attribute
                 */
                public boolean isSetCompletedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COMPLETEDPUREPATHS$58) != null;
                    }
                }
                
                /**
                 * Sets the "completedpurepaths" attribute
                 */
                public void setCompletedpurepaths(java.math.BigInteger completedpurepaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETEDPUREPATHS$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPLETEDPUREPATHS$58);
                      }
                      target.setBigIntegerValue(completedpurepaths);
                    }
                }
                
                /**
                 * Sets (as xml) the "completedpurepaths" attribute
                 */
                public void xsetCompletedpurepaths(org.apache.xmlbeans.XmlInteger completedpurepaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPLETEDPUREPATHS$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COMPLETEDPUREPATHS$58);
                      }
                      target.set(completedpurepaths);
                    }
                }
                
                /**
                 * Unsets the "completedpurepaths" attribute
                 */
                public void unsetCompletedpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COMPLETEDPUREPATHS$58);
                    }
                }
                
                /**
                 * Gets the "skippedevents" attribute
                 */
                public java.math.BigInteger getSkippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPPEDEVENTS$60);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "skippedevents" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSkippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SKIPPEDEVENTS$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "skippedevents" attribute
                 */
                public boolean isSetSkippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SKIPPEDEVENTS$60) != null;
                    }
                }
                
                /**
                 * Sets the "skippedevents" attribute
                 */
                public void setSkippedevents(java.math.BigInteger skippedevents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPPEDEVENTS$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKIPPEDEVENTS$60);
                      }
                      target.setBigIntegerValue(skippedevents);
                    }
                }
                
                /**
                 * Sets (as xml) the "skippedevents" attribute
                 */
                public void xsetSkippedevents(org.apache.xmlbeans.XmlInteger skippedevents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SKIPPEDEVENTS$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SKIPPEDEVENTS$60);
                      }
                      target.set(skippedevents);
                    }
                }
                
                /**
                 * Unsets the "skippedevents" attribute
                 */
                public void unsetSkippedevents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SKIPPEDEVENTS$60);
                    }
                }
                
                /**
                 * Gets the "queueusedsize" attribute
                 */
                public double getQueueusedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUEUEUSEDSIZE$62);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "queueusedsize" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetQueueusedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(QUEUEUSEDSIZE$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "queueusedsize" attribute
                 */
                public boolean isSetQueueusedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(QUEUEUSEDSIZE$62) != null;
                    }
                }
                
                /**
                 * Sets the "queueusedsize" attribute
                 */
                public void setQueueusedsize(double queueusedsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUEUEUSEDSIZE$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUEUEUSEDSIZE$62);
                      }
                      target.setDoubleValue(queueusedsize);
                    }
                }
                
                /**
                 * Sets (as xml) the "queueusedsize" attribute
                 */
                public void xsetQueueusedsize(org.apache.xmlbeans.XmlDouble queueusedsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(QUEUEUSEDSIZE$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(QUEUEUSEDSIZE$62);
                      }
                      target.set(queueusedsize);
                    }
                }
                
                /**
                 * Unsets the "queueusedsize" attribute
                 */
                public void unsetQueueusedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(QUEUEUSEDSIZE$62);
                    }
                }
                
                /**
                 * Gets the "queuecommittedsize" attribute
                 */
                public double getQueuecommittedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUEUECOMMITTEDSIZE$64);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "queuecommittedsize" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetQueuecommittedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(QUEUECOMMITTEDSIZE$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "queuecommittedsize" attribute
                 */
                public boolean isSetQueuecommittedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(QUEUECOMMITTEDSIZE$64) != null;
                    }
                }
                
                /**
                 * Sets the "queuecommittedsize" attribute
                 */
                public void setQueuecommittedsize(double queuecommittedsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUEUECOMMITTEDSIZE$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUEUECOMMITTEDSIZE$64);
                      }
                      target.setDoubleValue(queuecommittedsize);
                    }
                }
                
                /**
                 * Sets (as xml) the "queuecommittedsize" attribute
                 */
                public void xsetQueuecommittedsize(org.apache.xmlbeans.XmlDouble queuecommittedsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(QUEUECOMMITTEDSIZE$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(QUEUECOMMITTEDSIZE$64);
                      }
                      target.set(queuecommittedsize);
                    }
                }
                
                /**
                 * Unsets the "queuecommittedsize" attribute
                 */
                public void unsetQueuecommittedsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(QUEUECOMMITTEDSIZE$64);
                    }
                }
                
                /**
                 * Gets the "instrumentationoverhead" attribute
                 */
                public java.math.BigInteger getInstrumentationoverhead()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTATIONOVERHEAD$66);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "instrumentationoverhead" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetInstrumentationoverhead()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(INSTRUMENTATIONOVERHEAD$66);
                      return target;
                    }
                }
                
                /**
                 * True if has "instrumentationoverhead" attribute
                 */
                public boolean isSetInstrumentationoverhead()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INSTRUMENTATIONOVERHEAD$66) != null;
                    }
                }
                
                /**
                 * Sets the "instrumentationoverhead" attribute
                 */
                public void setInstrumentationoverhead(java.math.BigInteger instrumentationoverhead)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTATIONOVERHEAD$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTATIONOVERHEAD$66);
                      }
                      target.setBigIntegerValue(instrumentationoverhead);
                    }
                }
                
                /**
                 * Sets (as xml) the "instrumentationoverhead" attribute
                 */
                public void xsetInstrumentationoverhead(org.apache.xmlbeans.XmlInteger instrumentationoverhead)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(INSTRUMENTATIONOVERHEAD$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(INSTRUMENTATIONOVERHEAD$66);
                      }
                      target.set(instrumentationoverhead);
                    }
                }
                
                /**
                 * Unsets the "instrumentationoverhead" attribute
                 */
                public void unsetInstrumentationoverhead()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INSTRUMENTATIONOVERHEAD$66);
                    }
                }
                
                /**
                 * Gets the "bytesreadfromagent" attribute
                 */
                public java.math.BigInteger getBytesreadfromagent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESREADFROMAGENT$68);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytesreadfromagent" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesreadfromagent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESREADFROMAGENT$68);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytesreadfromagent" attribute
                 */
                public boolean isSetBytesreadfromagent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESREADFROMAGENT$68) != null;
                    }
                }
                
                /**
                 * Sets the "bytesreadfromagent" attribute
                 */
                public void setBytesreadfromagent(java.math.BigInteger bytesreadfromagent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESREADFROMAGENT$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESREADFROMAGENT$68);
                      }
                      target.setBigIntegerValue(bytesreadfromagent);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytesreadfromagent" attribute
                 */
                public void xsetBytesreadfromagent(org.apache.xmlbeans.XmlInteger bytesreadfromagent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESREADFROMAGENT$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESREADFROMAGENT$68);
                      }
                      target.set(bytesreadfromagent);
                    }
                }
                
                /**
                 * Unsets the "bytesreadfromagent" attribute
                 */
                public void unsetBytesreadfromagent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESREADFROMAGENT$68);
                    }
                }
                
                /**
                 * Gets the "purepathlifetime" attribute
                 */
                public double getPurepathlifetime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUREPATHLIFETIME$70);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "purepathlifetime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPurepathlifetime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PUREPATHLIFETIME$70);
                      return target;
                    }
                }
                
                /**
                 * True if has "purepathlifetime" attribute
                 */
                public boolean isSetPurepathlifetime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PUREPATHLIFETIME$70) != null;
                    }
                }
                
                /**
                 * Sets the "purepathlifetime" attribute
                 */
                public void setPurepathlifetime(double purepathlifetime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUREPATHLIFETIME$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUREPATHLIFETIME$70);
                      }
                      target.setDoubleValue(purepathlifetime);
                    }
                }
                
                /**
                 * Sets (as xml) the "purepathlifetime" attribute
                 */
                public void xsetPurepathlifetime(org.apache.xmlbeans.XmlDouble purepathlifetime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PUREPATHLIFETIME$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PUREPATHLIFETIME$70);
                      }
                      target.set(purepathlifetime);
                    }
                }
                
                /**
                 * Unsets the "purepathlifetime" attribute
                 */
                public void unsetPurepathlifetime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PUREPATHLIFETIME$70);
                    }
                }
                
                /**
                 * Gets the "concurrentpurepaths" attribute
                 */
                public java.math.BigInteger getConcurrentpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENTPUREPATHS$72);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "concurrentpurepaths" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetConcurrentpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CONCURRENTPUREPATHS$72);
                      return target;
                    }
                }
                
                /**
                 * True if has "concurrentpurepaths" attribute
                 */
                public boolean isSetConcurrentpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CONCURRENTPUREPATHS$72) != null;
                    }
                }
                
                /**
                 * Sets the "concurrentpurepaths" attribute
                 */
                public void setConcurrentpurepaths(java.math.BigInteger concurrentpurepaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCURRENTPUREPATHS$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCURRENTPUREPATHS$72);
                      }
                      target.setBigIntegerValue(concurrentpurepaths);
                    }
                }
                
                /**
                 * Sets (as xml) the "concurrentpurepaths" attribute
                 */
                public void xsetConcurrentpurepaths(org.apache.xmlbeans.XmlInteger concurrentpurepaths)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CONCURRENTPUREPATHS$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CONCURRENTPUREPATHS$72);
                      }
                      target.set(concurrentpurepaths);
                    }
                }
                
                /**
                 * Unsets the "concurrentpurepaths" attribute
                 */
                public void unsetConcurrentpurepaths()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CONCURRENTPUREPATHS$72);
                    }
                }
                
                /**
                 * Gets the "virtual" attribute
                 */
                public java.util.Calendar getVirtual()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUAL$74);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "virtual" attribute
                 */
                public org.apache.xmlbeans.XmlDateTime xgetVirtual()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VIRTUAL$74);
                      return target;
                    }
                }
                
                /**
                 * True if has "virtual" attribute
                 */
                public boolean isSetVirtual()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIRTUAL$74) != null;
                    }
                }
                
                /**
                 * Sets the "virtual" attribute
                 */
                public void setVirtual(java.util.Calendar virtual)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUAL$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIRTUAL$74);
                      }
                      target.setCalendarValue(virtual);
                    }
                }
                
                /**
                 * Sets (as xml) the "virtual" attribute
                 */
                public void xsetVirtual(org.apache.xmlbeans.XmlDateTime virtual)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VIRTUAL$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VIRTUAL$74);
                      }
                      target.set(virtual);
                    }
                }
                
                /**
                 * Unsets the "virtual" attribute
                 */
                public void unsetVirtual()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIRTUAL$74);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$76);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$76);
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
                      return get_store().find_attribute_user(VERSION$76) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$76);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$76);
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
                      get_store().remove_attribute(VERSION$76);
                    }
                }
                
                /**
                 * Gets the "bootstrapped" attribute
                 */
                public java.lang.String getBootstrapped()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOTSTRAPPED$78);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bootstrapped" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBootstrapped()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BOOTSTRAPPED$78);
                      return target;
                    }
                }
                
                /**
                 * True if has "bootstrapped" attribute
                 */
                public boolean isSetBootstrapped()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BOOTSTRAPPED$78) != null;
                    }
                }
                
                /**
                 * Sets the "bootstrapped" attribute
                 */
                public void setBootstrapped(java.lang.String bootstrapped)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOTSTRAPPED$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOOTSTRAPPED$78);
                      }
                      target.setStringValue(bootstrapped);
                    }
                }
                
                /**
                 * Sets (as xml) the "bootstrapped" attribute
                 */
                public void xsetBootstrapped(org.apache.xmlbeans.XmlString bootstrapped)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BOOTSTRAPPED$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BOOTSTRAPPED$78);
                      }
                      target.set(bootstrapped);
                    }
                }
                
                /**
                 * Unsets the "bootstrapped" attribute
                 */
                public void unsetBootstrapped()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BOOTSTRAPPED$78);
                    }
                }
                
                /**
                 * Gets the "agentid" attribute
                 */
                public java.lang.String getAgentid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTID$80);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "agentid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAgentid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTID$80);
                      return target;
                    }
                }
                
                /**
                 * True if has "agentid" attribute
                 */
                public boolean isSetAgentid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AGENTID$80) != null;
                    }
                }
                
                /**
                 * Sets the "agentid" attribute
                 */
                public void setAgentid(java.lang.String agentid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTID$80);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTID$80);
                      }
                      target.setStringValue(agentid);
                    }
                }
                
                /**
                 * Sets (as xml) the "agentid" attribute
                 */
                public void xsetAgentid(org.apache.xmlbeans.XmlString agentid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTID$80);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTID$80);
                      }
                      target.set(agentid);
                    }
                }
                
                /**
                 * Unsets the "agentid" attribute
                 */
                public void unsetAgentid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AGENTID$80);
                    }
                }
                
                /**
                 * Gets the "cache_hits" attribute
                 */
                public java.math.BigInteger getCacheHits()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEHITS$82);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cache_hits" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetCacheHits()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEHITS$82);
                      return target;
                    }
                }
                
                /**
                 * True if has "cache_hits" attribute
                 */
                public boolean isSetCacheHits()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CACHEHITS$82) != null;
                    }
                }
                
                /**
                 * Sets the "cache_hits" attribute
                 */
                public void setCacheHits(java.math.BigInteger cacheHits)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEHITS$82);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEHITS$82);
                      }
                      target.setBigIntegerValue(cacheHits);
                    }
                }
                
                /**
                 * Sets (as xml) the "cache_hits" attribute
                 */
                public void xsetCacheHits(org.apache.xmlbeans.XmlInteger cacheHits)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEHITS$82);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CACHEHITS$82);
                      }
                      target.set(cacheHits);
                    }
                }
                
                /**
                 * Unsets the "cache_hits" attribute
                 */
                public void unsetCacheHits()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CACHEHITS$82);
                    }
                }
                
                /**
                 * Gets the "cache_misss" attribute
                 */
                public java.math.BigInteger getCacheMisss()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEMISSS$84);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cache_misss" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetCacheMisss()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEMISSS$84);
                      return target;
                    }
                }
                
                /**
                 * True if has "cache_misss" attribute
                 */
                public boolean isSetCacheMisss()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CACHEMISSS$84) != null;
                    }
                }
                
                /**
                 * Sets the "cache_misss" attribute
                 */
                public void setCacheMisss(java.math.BigInteger cacheMisss)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHEMISSS$84);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHEMISSS$84);
                      }
                      target.setBigIntegerValue(cacheMisss);
                    }
                }
                
                /**
                 * Sets (as xml) the "cache_misss" attribute
                 */
                public void xsetCacheMisss(org.apache.xmlbeans.XmlInteger cacheMisss)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CACHEMISSS$84);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CACHEMISSS$84);
                      }
                      target.set(cacheMisss);
                    }
                }
                
                /**
                 * Unsets the "cache_misss" attribute
                 */
                public void unsetCacheMisss()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CACHEMISSS$84);
                    }
                }
                
                /**
                 * Gets the "technologydesc" attribute
                 */
                public java.lang.String getTechnologydesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGYDESC$86);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "technologydesc" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTechnologydesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGYDESC$86);
                      return target;
                    }
                }
                
                /**
                 * True if has "technologydesc" attribute
                 */
                public boolean isSetTechnologydesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TECHNOLOGYDESC$86) != null;
                    }
                }
                
                /**
                 * Sets the "technologydesc" attribute
                 */
                public void setTechnologydesc(java.lang.String technologydesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGYDESC$86);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TECHNOLOGYDESC$86);
                      }
                      target.setStringValue(technologydesc);
                    }
                }
                
                /**
                 * Sets (as xml) the "technologydesc" attribute
                 */
                public void xsetTechnologydesc(org.apache.xmlbeans.XmlString technologydesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGYDESC$86);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TECHNOLOGYDESC$86);
                      }
                      target.set(technologydesc);
                    }
                }
                
                /**
                 * Unsets the "technologydesc" attribute
                 */
                public void unsetTechnologydesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TECHNOLOGYDESC$86);
                    }
                }
                
                /**
                 * Gets the "hotdesc" attribute
                 */
                public java.lang.String getHotdesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOTDESC$88);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hotdesc" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHotdesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOTDESC$88);
                      return target;
                    }
                }
                
                /**
                 * True if has "hotdesc" attribute
                 */
                public boolean isSetHotdesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOTDESC$88) != null;
                    }
                }
                
                /**
                 * Sets the "hotdesc" attribute
                 */
                public void setHotdesc(java.lang.String hotdesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOTDESC$88);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOTDESC$88);
                      }
                      target.setStringValue(hotdesc);
                    }
                }
                
                /**
                 * Sets (as xml) the "hotdesc" attribute
                 */
                public void xsetHotdesc(org.apache.xmlbeans.XmlString hotdesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOTDESC$88);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOTDESC$88);
                      }
                      target.set(hotdesc);
                    }
                }
                
                /**
                 * Unsets the "hotdesc" attribute
                 */
                public void unsetHotdesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOTDESC$88);
                    }
                }
                
                /**
                 * Gets the "boostrapversion" attribute
                 */
                public java.lang.String getBoostrapversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOSTRAPVERSION$90);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "boostrapversion" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBoostrapversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BOOSTRAPVERSION$90);
                      return target;
                    }
                }
                
                /**
                 * True if has "boostrapversion" attribute
                 */
                public boolean isSetBoostrapversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BOOSTRAPVERSION$90) != null;
                    }
                }
                
                /**
                 * Sets the "boostrapversion" attribute
                 */
                public void setBoostrapversion(java.lang.String boostrapversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOOSTRAPVERSION$90);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOOSTRAPVERSION$90);
                      }
                      target.setStringValue(boostrapversion);
                    }
                }
                
                /**
                 * Sets (as xml) the "boostrapversion" attribute
                 */
                public void xsetBoostrapversion(org.apache.xmlbeans.XmlString boostrapversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BOOSTRAPVERSION$90);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BOOSTRAPVERSION$90);
                      }
                      target.set(boostrapversion);
                    }
                }
                
                /**
                 * Unsets the "boostrapversion" attribute
                 */
                public void unsetBoostrapversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BOOSTRAPVERSION$90);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$92);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$92);
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
                      return get_store().find_attribute_user(OS$92) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$92);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OS$92);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$92);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OS$92);
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
                      get_store().remove_attribute(OS$92);
                    }
                }
                
                /**
                 * Gets the "osarch" attribute
                 */
                public java.lang.String getOsarch()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSARCH$94);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "osarch" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetOsarch()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSARCH$94);
                      return target;
                    }
                }
                
                /**
                 * True if has "osarch" attribute
                 */
                public boolean isSetOsarch()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OSARCH$94) != null;
                    }
                }
                
                /**
                 * Sets the "osarch" attribute
                 */
                public void setOsarch(java.lang.String osarch)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSARCH$94);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OSARCH$94);
                      }
                      target.setStringValue(osarch);
                    }
                }
                
                /**
                 * Sets (as xml) the "osarch" attribute
                 */
                public void xsetOsarch(org.apache.xmlbeans.XmlString osarch)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSARCH$94);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OSARCH$94);
                      }
                      target.set(osarch);
                    }
                }
                
                /**
                 * Unsets the "osarch" attribute
                 */
                public void unsetOsarch()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OSARCH$94);
                    }
                }
                
                /**
                 * Gets the "techversion" attribute
                 */
                public java.lang.String getTechversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHVERSION$96);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "techversion" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTechversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHVERSION$96);
                      return target;
                    }
                }
                
                /**
                 * True if has "techversion" attribute
                 */
                public boolean isSetTechversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TECHVERSION$96) != null;
                    }
                }
                
                /**
                 * Sets the "techversion" attribute
                 */
                public void setTechversion(java.lang.String techversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHVERSION$96);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TECHVERSION$96);
                      }
                      target.setStringValue(techversion);
                    }
                }
                
                /**
                 * Sets (as xml) the "techversion" attribute
                 */
                public void xsetTechversion(org.apache.xmlbeans.XmlString techversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHVERSION$96);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TECHVERSION$96);
                      }
                      target.set(techversion);
                    }
                }
                
                /**
                 * Unsets the "techversion" attribute
                 */
                public void unsetTechversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TECHVERSION$96);
                    }
                }
                
                /**
                 * Gets the "extended_agent_state" attribute
                 */
                public java.lang.String getExtendedAgentState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDEDAGENTSTATE$98);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "extended_agent_state" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetExtendedAgentState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDEDAGENTSTATE$98);
                      return target;
                    }
                }
                
                /**
                 * True if has "extended_agent_state" attribute
                 */
                public boolean isSetExtendedAgentState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXTENDEDAGENTSTATE$98) != null;
                    }
                }
                
                /**
                 * Sets the "extended_agent_state" attribute
                 */
                public void setExtendedAgentState(java.lang.String extendedAgentState)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDEDAGENTSTATE$98);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDEDAGENTSTATE$98);
                      }
                      target.setStringValue(extendedAgentState);
                    }
                }
                
                /**
                 * Sets (as xml) the "extended_agent_state" attribute
                 */
                public void xsetExtendedAgentState(org.apache.xmlbeans.XmlString extendedAgentState)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDEDAGENTSTATE$98);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXTENDEDAGENTSTATE$98);
                      }
                      target.set(extendedAgentState);
                    }
                }
                
                /**
                 * Unsets the "extended_agent_state" attribute
                 */
                public void unsetExtendedAgentState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXTENDEDAGENTSTATE$98);
                    }
                }
                
                /**
                 * Gets the "statustext" attribute
                 */
                public java.lang.String getStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSTEXT$100);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "statustext" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUSTEXT$100);
                      return target;
                    }
                }
                
                /**
                 * True if has "statustext" attribute
                 */
                public boolean isSetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATUSTEXT$100) != null;
                    }
                }
                
                /**
                 * Sets the "statustext" attribute
                 */
                public void setStatustext(java.lang.String statustext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSTEXT$100);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUSTEXT$100);
                      }
                      target.setStringValue(statustext);
                    }
                }
                
                /**
                 * Sets (as xml) the "statustext" attribute
                 */
                public void xsetStatustext(org.apache.xmlbeans.XmlString statustext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUSTEXT$100);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUSTEXT$100);
                      }
                      target.set(statustext);
                    }
                }
                
                /**
                 * Unsets the "statustext" attribute
                 */
                public void unsetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATUSTEXT$100);
                    }
                }
                
                /**
                 * Gets the "agent_platform" attribute
                 */
                public java.lang.String getAgentPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTPLATFORM$102);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "agent_platform" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAgentPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTPLATFORM$102);
                      return target;
                    }
                }
                
                /**
                 * True if has "agent_platform" attribute
                 */
                public boolean isSetAgentPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AGENTPLATFORM$102) != null;
                    }
                }
                
                /**
                 * Sets the "agent_platform" attribute
                 */
                public void setAgentPlatform(java.lang.String agentPlatform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTPLATFORM$102);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTPLATFORM$102);
                      }
                      target.setStringValue(agentPlatform);
                    }
                }
                
                /**
                 * Sets (as xml) the "agent_platform" attribute
                 */
                public void xsetAgentPlatform(org.apache.xmlbeans.XmlString agentPlatform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTPLATFORM$102);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTPLATFORM$102);
                      }
                      target.set(agentPlatform);
                    }
                }
                
                /**
                 * Unsets the "agent_platform" attribute
                 */
                public void unsetAgentPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AGENTPLATFORM$102);
                    }
                }
            }
        }
        /**
         * An XML statustaskmonitorrecords(@).
         *
         * This is a complex type.
         */
        public static class StatustaskmonitorrecordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords
        {
            private static final long serialVersionUID = 1L;
            
            public StatustaskmonitorrecordsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName STATUSTASKMONITORRECORD$0 = 
                new javax.xml.namespace.QName("", "statustaskmonitorrecord");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "statustaskmonitorrecord" elements
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord[] getStatustaskmonitorrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(STATUSTASKMONITORRECORD$0, targetList);
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord[] result = new noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "statustaskmonitorrecord" element
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord getStatustaskmonitorrecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord)get_store().find_element_user(STATUSTASKMONITORRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "statustaskmonitorrecord" element
             */
            public int sizeOfStatustaskmonitorrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STATUSTASKMONITORRECORD$0);
                }
            }
            
            /**
             * Sets array of all "statustaskmonitorrecord" element
             */
            public void setStatustaskmonitorrecordArray(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord[] statustaskmonitorrecordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(statustaskmonitorrecordArray, STATUSTASKMONITORRECORD$0);
                }
            }
            
            /**
             * Sets ith "statustaskmonitorrecord" element
             */
            public void setStatustaskmonitorrecordArray(int i, noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord statustaskmonitorrecord)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord)get_store().find_element_user(STATUSTASKMONITORRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(statustaskmonitorrecord);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "statustaskmonitorrecord" element
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord insertNewStatustaskmonitorrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord)get_store().insert_element_user(STATUSTASKMONITORRECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "statustaskmonitorrecord" element
             */
            public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord addNewStatustaskmonitorrecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord target = null;
                    target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord)get_store().add_element_user(STATUSTASKMONITORRECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "statustaskmonitorrecord" element
             */
            public void removeStatustaskmonitorrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STATUSTASKMONITORRECORD$0, i);
                }
            }
            
            /**
             * Gets the "structuretype" attribute
             */
            public java.lang.String getStructuretype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "structuretype" attribute
             */
            public org.apache.xmlbeans.XmlString xgetStructuretype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURETYPE$2);
                    return target;
                }
            }
            
            /**
             * Sets the "structuretype" attribute
             */
            public void setStructuretype(java.lang.String structuretype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTURETYPE$2);
                    }
                    target.setStringValue(structuretype);
                }
            }
            
            /**
             * Sets (as xml) the "structuretype" attribute
             */
            public void xsetStructuretype(org.apache.xmlbeans.XmlString structuretype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURETYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRUCTURETYPE$2);
                    }
                    target.set(structuretype);
                }
            }
            /**
             * An XML statustaskmonitorrecord(@).
             *
             * This is a complex type.
             */
            public static class StatustaskmonitorrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord
            {
                private static final long serialVersionUID = 1L;
                
                public StatustaskmonitorrecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName STATUSTASKMONITORRECORD$0 = 
                    new javax.xml.namespace.QName("", "statustaskmonitorrecord");
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
                
                
                /**
                 * Gets array of all "statustaskmonitorrecord" elements
                 */
                public noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[] getStatustaskmonitorrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(STATUSTASKMONITORRECORD$0, targetList);
                      noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[] result = new noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "statustaskmonitorrecord" element
                 */
                public noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord getStatustaskmonitorrecordArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord target = null;
                      target = (noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord)get_store().find_element_user(STATUSTASKMONITORRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "statustaskmonitorrecord" element
                 */
                public int sizeOfStatustaskmonitorrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(STATUSTASKMONITORRECORD$0);
                    }
                }
                
                /**
                 * Sets array of all "statustaskmonitorrecord" element
                 */
                public void setStatustaskmonitorrecordArray(noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[] statustaskmonitorrecordArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(statustaskmonitorrecordArray, STATUSTASKMONITORRECORD$0);
                    }
                }
                
                /**
                 * Sets ith "statustaskmonitorrecord" element
                 */
                public void setStatustaskmonitorrecordArray(int i, noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord statustaskmonitorrecord)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord target = null;
                      target = (noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord)get_store().find_element_user(STATUSTASKMONITORRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(statustaskmonitorrecord);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "statustaskmonitorrecord" element
                 */
                public noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord insertNewStatustaskmonitorrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord target = null;
                      target = (noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord)get_store().insert_element_user(STATUSTASKMONITORRECORD$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "statustaskmonitorrecord" element
                 */
                public noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord addNewStatustaskmonitorrecord()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord target = null;
                      target = (noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord)get_store().add_element_user(STATUSTASKMONITORRECORD$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "statustaskmonitorrecord" element
                 */
                public void removeStatustaskmonitorrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(STATUSTASKMONITORRECORD$0, i);
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
            }
        }
    }
}
