/*
 * An XML document type.
 * Localname: databasedashlet
 * Namespace: 
 * Java type: noNamespace.DatabasedashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one databasedashlet(@) element.
 *
 * This is a complex type.
 */
public class DatabasedashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatabasedashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABASEDASHLET$0 = 
        new javax.xml.namespace.QName("", "databasedashlet");
    
    
    /**
     * Gets the "databasedashlet" element
     */
    public noNamespace.DatabasedashletDocument.Databasedashlet getDatabasedashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatabasedashletDocument.Databasedashlet target = null;
            target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().find_element_user(DATABASEDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "databasedashlet" element
     */
    public void setDatabasedashlet(noNamespace.DatabasedashletDocument.Databasedashlet databasedashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatabasedashletDocument.Databasedashlet target = null;
            target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().find_element_user(DATABASEDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().add_element_user(DATABASEDASHLET$0);
            }
            target.set(databasedashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "databasedashlet" element
     */
    public noNamespace.DatabasedashletDocument.Databasedashlet addNewDatabasedashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatabasedashletDocument.Databasedashlet target = null;
            target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().add_element_user(DATABASEDASHLET$0);
            return target;
        }
    }
    /**
     * An XML databasedashlet(@).
     *
     * This is a complex type.
     */
    public static class DatabasedashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument.Databasedashlet
    {
        private static final long serialVersionUID = 1L;
        
        public DatabasedashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName DATABASETOPRESPONSETIMES$4 = 
            new javax.xml.namespace.QName("", "database_topresponsetimes");
        private static final javax.xml.namespace.QName DATABASETOPCOUNTS$6 = 
            new javax.xml.namespace.QName("", "database_topcounts");
        private static final javax.xml.namespace.QName DATABASEPOOLUSAGES$8 = 
            new javax.xml.namespace.QName("", "database_poolusages");
        private static final javax.xml.namespace.QName NAME$10 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$12 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName DISPLAYSOURCE$14 = 
            new javax.xml.namespace.QName("", "displaysource");
        
        
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
         * Gets the "database_topresponsetimes" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes getDatabaseTopresponsetimes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes)get_store().find_element_user(DATABASETOPRESPONSETIMES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "database_topresponsetimes" element
         */
        public boolean isSetDatabaseTopresponsetimes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASETOPRESPONSETIMES$4) != 0;
            }
        }
        
        /**
         * Sets the "database_topresponsetimes" element
         */
        public void setDatabaseTopresponsetimes(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes databaseTopresponsetimes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes)get_store().find_element_user(DATABASETOPRESPONSETIMES$4, 0);
                if (target == null)
                {
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes)get_store().add_element_user(DATABASETOPRESPONSETIMES$4);
                }
                target.set(databaseTopresponsetimes);
            }
        }
        
        /**
         * Appends and returns a new empty "database_topresponsetimes" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes addNewDatabaseTopresponsetimes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes)get_store().add_element_user(DATABASETOPRESPONSETIMES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "database_topresponsetimes" element
         */
        public void unsetDatabaseTopresponsetimes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASETOPRESPONSETIMES$4, 0);
            }
        }
        
        /**
         * Gets the "database_topcounts" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts getDatabaseTopcounts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts)get_store().find_element_user(DATABASETOPCOUNTS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "database_topcounts" element
         */
        public boolean isSetDatabaseTopcounts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASETOPCOUNTS$6) != 0;
            }
        }
        
        /**
         * Sets the "database_topcounts" element
         */
        public void setDatabaseTopcounts(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts databaseTopcounts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts)get_store().find_element_user(DATABASETOPCOUNTS$6, 0);
                if (target == null)
                {
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts)get_store().add_element_user(DATABASETOPCOUNTS$6);
                }
                target.set(databaseTopcounts);
            }
        }
        
        /**
         * Appends and returns a new empty "database_topcounts" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts addNewDatabaseTopcounts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts)get_store().add_element_user(DATABASETOPCOUNTS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "database_topcounts" element
         */
        public void unsetDatabaseTopcounts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASETOPCOUNTS$6, 0);
            }
        }
        
        /**
         * Gets the "database_poolusages" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages getDatabasePoolusages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages)get_store().find_element_user(DATABASEPOOLUSAGES$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "database_poolusages" element
         */
        public boolean isSetDatabasePoolusages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASEPOOLUSAGES$8) != 0;
            }
        }
        
        /**
         * Sets the "database_poolusages" element
         */
        public void setDatabasePoolusages(noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages databasePoolusages)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages)get_store().find_element_user(DATABASEPOOLUSAGES$8, 0);
                if (target == null)
                {
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages)get_store().add_element_user(DATABASEPOOLUSAGES$8);
                }
                target.set(databasePoolusages);
            }
        }
        
        /**
         * Appends and returns a new empty "database_poolusages" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages addNewDatabasePoolusages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages)get_store().add_element_user(DATABASEPOOLUSAGES$8);
                return target;
            }
        }
        
        /**
         * Unsets the "database_poolusages" element
         */
        public void unsetDatabasePoolusages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASEPOOLUSAGES$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$12);
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
                return get_store().find_attribute_user(DESCRIPTION$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$12);
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
                get_store().remove_attribute(DESCRIPTION$12);
            }
        }
        
        /**
         * Gets the "displaysource" attribute
         */
        public java.lang.String getDisplaysource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displaysource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDisplaysource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$14);
                return target;
            }
        }
        
        /**
         * Sets the "displaysource" attribute
         */
        public void setDisplaysource(java.lang.String displaysource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYSOURCE$14);
                }
                target.setStringValue(displaysource);
            }
        }
        
        /**
         * Sets (as xml) the "displaysource" attribute
         */
        public void xsetDisplaysource(org.apache.xmlbeans.XmlString displaysource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYSOURCE$14);
                }
                target.set(displaysource);
            }
        }
        /**
         * An XML database_topresponsetimes(@).
         *
         * This is a complex type.
         */
        public static class DatabaseTopresponsetimesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes
        {
            private static final long serialVersionUID = 1L;
            
            public DatabaseTopresponsetimesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATABASETOPRESPONSETIME$0 = 
                new javax.xml.namespace.QName("", "database_topresponsetime");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "database_topresponsetime" elements
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime[] getDatabaseTopresponsetimeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DATABASETOPRESPONSETIME$0, targetList);
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime[] result = new noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "database_topresponsetime" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime getDatabaseTopresponsetimeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime)get_store().find_element_user(DATABASETOPRESPONSETIME$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "database_topresponsetime" element
             */
            public int sizeOfDatabaseTopresponsetimeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATABASETOPRESPONSETIME$0);
                }
            }
            
            /**
             * Sets array of all "database_topresponsetime" element
             */
            public void setDatabaseTopresponsetimeArray(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime[] databaseTopresponsetimeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(databaseTopresponsetimeArray, DATABASETOPRESPONSETIME$0);
                }
            }
            
            /**
             * Sets ith "database_topresponsetime" element
             */
            public void setDatabaseTopresponsetimeArray(int i, noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime databaseTopresponsetime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime)get_store().find_element_user(DATABASETOPRESPONSETIME$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(databaseTopresponsetime);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "database_topresponsetime" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime insertNewDatabaseTopresponsetime(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime)get_store().insert_element_user(DATABASETOPRESPONSETIME$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "database_topresponsetime" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime addNewDatabaseTopresponsetime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime)get_store().add_element_user(DATABASETOPRESPONSETIME$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "database_topresponsetime" element
             */
            public void removeDatabaseTopresponsetime(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATABASETOPRESPONSETIME$0, i);
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
             * An XML database_topresponsetime(@).
             *
             * This is a complex type.
             */
            public static class DatabaseTopresponsetimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime
            {
                private static final long serialVersionUID = 1L;
                
                public DatabaseTopresponsetimeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATABASETOPRESPONSETIME$0 = 
                    new javax.xml.namespace.QName("", "database_topresponsetime");
                private static final javax.xml.namespace.QName DBSOURCEPOOL$2 = 
                    new javax.xml.namespace.QName("", "dbsource_pool");
                private static final javax.xml.namespace.QName DBSOURCESQL$4 = 
                    new javax.xml.namespace.QName("", "dbsource_sql");
                private static final javax.xml.namespace.QName POOLNAME$6 = 
                    new javax.xml.namespace.QName("", "poolname");
                private static final javax.xml.namespace.QName BINDVALUES$8 = 
                    new javax.xml.namespace.QName("", "bindvalues");
                private static final javax.xml.namespace.QName COUNT$10 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName PREPARATIONS$12 = 
                    new javax.xml.namespace.QName("", "preparations");
                private static final javax.xml.namespace.QName EXECAVG$14 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$16 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$18 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$20 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName USEDPOOLSIZEMAX$22 = 
                    new javax.xml.namespace.QName("", "usedpoolsize_max");
                private static final javax.xml.namespace.QName USEDPOOLSIZEMIN$24 = 
                    new javax.xml.namespace.QName("", "usedpoolsize_min");
                private static final javax.xml.namespace.QName POOLWAITMAX$26 = 
                    new javax.xml.namespace.QName("", "poolwait_max");
                private static final javax.xml.namespace.QName POOLWAITAVG$28 = 
                    new javax.xml.namespace.QName("", "poolwait_avg");
                private static final javax.xml.namespace.QName LASTPOOLUSAGE$30 = 
                    new javax.xml.namespace.QName("", "last_pool_usage");
                private static final javax.xml.namespace.QName POOLSIZE$32 = 
                    new javax.xml.namespace.QName("", "poolsize");
                private static final javax.xml.namespace.QName DBTYPE$34 = 
                    new javax.xml.namespace.QName("", "dbtype");
                private static final javax.xml.namespace.QName DBNAME$36 = 
                    new javax.xml.namespace.QName("", "dbname");
                private static final javax.xml.namespace.QName DBHOST$38 = 
                    new javax.xml.namespace.QName("", "dbhost");
                private static final javax.xml.namespace.QName DBUSER$40 = 
                    new javax.xml.namespace.QName("", "dbuser");
                private static final javax.xml.namespace.QName POOLUSER$42 = 
                    new javax.xml.namespace.QName("", "pooluser");
                private static final javax.xml.namespace.QName DBURL$44 = 
                    new javax.xml.namespace.QName("", "dburl");
                private static final javax.xml.namespace.QName AGENT$46 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName POOLWAITSUM$48 = 
                    new javax.xml.namespace.QName("", "poolwait_sum");
                private static final javax.xml.namespace.QName POOLWAITMIN$50 = 
                    new javax.xml.namespace.QName("", "poolwait_min");
                private static final javax.xml.namespace.QName RESPONSETIME$52 = 
                    new javax.xml.namespace.QName("", "response_time");
                private static final javax.xml.namespace.QName RESPONSETIMEPEREXECUTION$54 = 
                    new javax.xml.namespace.QName("", "response_time_per_execution");
                private static final javax.xml.namespace.QName RESPONSETIMEPERTRANSACTION$56 = 
                    new javax.xml.namespace.QName("", "response_time_per_transaction");
                private static final javax.xml.namespace.QName RESPONSETIMEPERPASSINGTRANSACTION$58 = 
                    new javax.xml.namespace.QName("", "response_time_per_passing_transaction");
                private static final javax.xml.namespace.QName EXECUTIONSPERTRANSACTION$60 = 
                    new javax.xml.namespace.QName("", "executions_per_transaction");
                private static final javax.xml.namespace.QName EXECUTIONSPERPASSINGTRANSACTION$62 = 
                    new javax.xml.namespace.QName("", "executions_per_passing_transaction");
                private static final javax.xml.namespace.QName PCTOFTRANSACTIONSCALLING$64 = 
                    new javax.xml.namespace.QName("", "pct_of_transactions_calling");
                private static final javax.xml.namespace.QName POOLWAITTIMEPERTRANSACTION$66 = 
                    new javax.xml.namespace.QName("", "pool_wait_time_per_transaction");
                private static final javax.xml.namespace.QName PLATFORM$68 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName RESPONSETIMECONTRIBUTION$70 = 
                    new javax.xml.namespace.QName("", "response_time_contribution");
                private static final javax.xml.namespace.QName FAILURERATE$72 = 
                    new javax.xml.namespace.QName("", "failure_rate");
                private static final javax.xml.namespace.QName ROWCOUNT$74 = 
                    new javax.xml.namespace.QName("", "rowcount");
                private static final javax.xml.namespace.QName ROUNDTRIPS$76 = 
                    new javax.xml.namespace.QName("", "roundtrips");
                private static final javax.xml.namespace.QName POOLTYPE$78 = 
                    new javax.xml.namespace.QName("", "pooltype");
                
                
                /**
                 * Gets array of all "database_topresponsetime" elements
                 */
                public noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime[] getDatabaseTopresponsetimeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DATABASETOPRESPONSETIME$0, targetList);
                      noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime[] result = new noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "database_topresponsetime" element
                 */
                public noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime getDatabaseTopresponsetimeArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime target = null;
                      target = (noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime)get_store().find_element_user(DATABASETOPRESPONSETIME$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "database_topresponsetime" element
                 */
                public int sizeOfDatabaseTopresponsetimeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DATABASETOPRESPONSETIME$0);
                    }
                }
                
                /**
                 * Sets array of all "database_topresponsetime" element
                 */
                public void setDatabaseTopresponsetimeArray(noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime[] databaseTopresponsetimeArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(databaseTopresponsetimeArray, DATABASETOPRESPONSETIME$0);
                    }
                }
                
                /**
                 * Sets ith "database_topresponsetime" element
                 */
                public void setDatabaseTopresponsetimeArray(int i, noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime databaseTopresponsetime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime target = null;
                      target = (noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime)get_store().find_element_user(DATABASETOPRESPONSETIME$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(databaseTopresponsetime);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "database_topresponsetime" element
                 */
                public noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime insertNewDatabaseTopresponsetime(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime target = null;
                      target = (noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime)get_store().insert_element_user(DATABASETOPRESPONSETIME$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "database_topresponsetime" element
                 */
                public noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime addNewDatabaseTopresponsetime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime target = null;
                      target = (noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime)get_store().add_element_user(DATABASETOPRESPONSETIME$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "database_topresponsetime" element
                 */
                public void removeDatabaseTopresponsetime(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DATABASETOPRESPONSETIME$0, i);
                    }
                }
                
                /**
                 * Gets the "dbsource_pool" attribute
                 */
                public java.lang.String getDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbsource_pool" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbsource_pool" attribute
                 */
                public boolean isSetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBSOURCEPOOL$2) != null;
                    }
                }
                
                /**
                 * Sets the "dbsource_pool" attribute
                 */
                public void setDbsourcePool(java.lang.String dbsourcePool)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBSOURCEPOOL$2);
                      }
                      target.setStringValue(dbsourcePool);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbsource_pool" attribute
                 */
                public void xsetDbsourcePool(org.apache.xmlbeans.XmlString dbsourcePool)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBSOURCEPOOL$2);
                      }
                      target.set(dbsourcePool);
                    }
                }
                
                /**
                 * Unsets the "dbsource_pool" attribute
                 */
                public void unsetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBSOURCEPOOL$2);
                    }
                }
                
                /**
                 * Gets the "dbsource_sql" attribute
                 */
                public java.lang.String getDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbsource_sql" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCESQL$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbsource_sql" attribute
                 */
                public boolean isSetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBSOURCESQL$4) != null;
                    }
                }
                
                /**
                 * Sets the "dbsource_sql" attribute
                 */
                public void setDbsourceSql(java.lang.String dbsourceSql)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBSOURCESQL$4);
                      }
                      target.setStringValue(dbsourceSql);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbsource_sql" attribute
                 */
                public void xsetDbsourceSql(org.apache.xmlbeans.XmlString dbsourceSql)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBSOURCESQL$4);
                      }
                      target.set(dbsourceSql);
                    }
                }
                
                /**
                 * Unsets the "dbsource_sql" attribute
                 */
                public void unsetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBSOURCESQL$4);
                    }
                }
                
                /**
                 * Gets the "poolname" attribute
                 */
                public java.lang.String getPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLNAME$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolname" attribute
                 */
                public boolean isSetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLNAME$6) != null;
                    }
                }
                
                /**
                 * Sets the "poolname" attribute
                 */
                public void setPoolname(java.lang.String poolname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLNAME$6);
                      }
                      target.setStringValue(poolname);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolname" attribute
                 */
                public void xsetPoolname(org.apache.xmlbeans.XmlString poolname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLNAME$6);
                      }
                      target.set(poolname);
                    }
                }
                
                /**
                 * Unsets the "poolname" attribute
                 */
                public void unsetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLNAME$6);
                    }
                }
                
                /**
                 * Gets the "bindvalues" attribute
                 */
                public java.lang.String getBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bindvalues" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDVALUES$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "bindvalues" attribute
                 */
                public boolean isSetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BINDVALUES$8) != null;
                    }
                }
                
                /**
                 * Sets the "bindvalues" attribute
                 */
                public void setBindvalues(java.lang.String bindvalues)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BINDVALUES$8);
                      }
                      target.setStringValue(bindvalues);
                    }
                }
                
                /**
                 * Sets (as xml) the "bindvalues" attribute
                 */
                public void xsetBindvalues(org.apache.xmlbeans.XmlString bindvalues)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BINDVALUES$8);
                      }
                      target.set(bindvalues);
                    }
                }
                
                /**
                 * Unsets the "bindvalues" attribute
                 */
                public void unsetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BINDVALUES$8);
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
                 * True if has "count" attribute
                 */
                public boolean isSetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COUNT$10) != null;
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
                
                /**
                 * Unsets the "count" attribute
                 */
                public void unsetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COUNT$10);
                    }
                }
                
                /**
                 * Gets the "preparations" attribute
                 */
                public java.math.BigInteger getPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "preparations" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PREPARATIONS$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "preparations" attribute
                 */
                public boolean isSetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PREPARATIONS$12) != null;
                    }
                }
                
                /**
                 * Sets the "preparations" attribute
                 */
                public void setPreparations(java.math.BigInteger preparations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREPARATIONS$12);
                      }
                      target.setBigIntegerValue(preparations);
                    }
                }
                
                /**
                 * Sets (as xml) the "preparations" attribute
                 */
                public void xsetPreparations(org.apache.xmlbeans.XmlInteger preparations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PREPARATIONS$12);
                      }
                      target.set(preparations);
                    }
                }
                
                /**
                 * Unsets the "preparations" attribute
                 */
                public void unsetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PREPARATIONS$12);
                    }
                }
                
                /**
                 * Gets the "exec_avg" attribute
                 */
                public double getExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_avg" attribute
                 */
                public boolean isSetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECAVG$14) != null;
                    }
                }
                
                /**
                 * Sets the "exec_avg" attribute
                 */
                public void setExecAvg(double execAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$14);
                      }
                      target.setDoubleValue(execAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_avg" attribute
                 */
                public void xsetExecAvg(org.apache.xmlbeans.XmlDouble execAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$14);
                      }
                      target.set(execAvg);
                    }
                }
                
                /**
                 * Unsets the "exec_avg" attribute
                 */
                public void unsetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECAVG$14);
                    }
                }
                
                /**
                 * Gets the "exec_min" attribute
                 */
                public double getExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_min" attribute
                 */
                public boolean isSetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECMIN$16) != null;
                    }
                }
                
                /**
                 * Sets the "exec_min" attribute
                 */
                public void setExecMin(double execMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$16);
                      }
                      target.setDoubleValue(execMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_min" attribute
                 */
                public void xsetExecMin(org.apache.xmlbeans.XmlDouble execMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$16);
                      }
                      target.set(execMin);
                    }
                }
                
                /**
                 * Unsets the "exec_min" attribute
                 */
                public void unsetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECMIN$16);
                    }
                }
                
                /**
                 * Gets the "exec_max" attribute
                 */
                public double getExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_max" attribute
                 */
                public boolean isSetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECMAX$18) != null;
                    }
                }
                
                /**
                 * Sets the "exec_max" attribute
                 */
                public void setExecMax(double execMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$18);
                      }
                      target.setDoubleValue(execMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_max" attribute
                 */
                public void xsetExecMax(org.apache.xmlbeans.XmlDouble execMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$18);
                      }
                      target.set(execMax);
                    }
                }
                
                /**
                 * Unsets the "exec_max" attribute
                 */
                public void unsetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECMAX$18);
                    }
                }
                
                /**
                 * Gets the "exec_sum" attribute
                 */
                public double getExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_sum" attribute
                 */
                public boolean isSetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECSUM$20) != null;
                    }
                }
                
                /**
                 * Sets the "exec_sum" attribute
                 */
                public void setExecSum(double execSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$20);
                      }
                      target.setDoubleValue(execSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_sum" attribute
                 */
                public void xsetExecSum(org.apache.xmlbeans.XmlDouble execSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$20);
                      }
                      target.set(execSum);
                    }
                }
                
                /**
                 * Unsets the "exec_sum" attribute
                 */
                public void unsetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECSUM$20);
                    }
                }
                
                /**
                 * Gets the "usedpoolsize_max" attribute
                 */
                public java.lang.String getUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "usedpoolsize_max" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "usedpoolsize_max" attribute
                 */
                public boolean isSetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(USEDPOOLSIZEMAX$22) != null;
                    }
                }
                
                /**
                 * Sets the "usedpoolsize_max" attribute
                 */
                public void setUsedpoolsizeMax(java.lang.String usedpoolsizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDPOOLSIZEMAX$22);
                      }
                      target.setStringValue(usedpoolsizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "usedpoolsize_max" attribute
                 */
                public void xsetUsedpoolsizeMax(org.apache.xmlbeans.XmlString usedpoolsizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEDPOOLSIZEMAX$22);
                      }
                      target.set(usedpoolsizeMax);
                    }
                }
                
                /**
                 * Unsets the "usedpoolsize_max" attribute
                 */
                public void unsetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(USEDPOOLSIZEMAX$22);
                    }
                }
                
                /**
                 * Gets the "usedpoolsize_min" attribute
                 */
                public java.lang.String getUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "usedpoolsize_min" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "usedpoolsize_min" attribute
                 */
                public boolean isSetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(USEDPOOLSIZEMIN$24) != null;
                    }
                }
                
                /**
                 * Sets the "usedpoolsize_min" attribute
                 */
                public void setUsedpoolsizeMin(java.lang.String usedpoolsizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDPOOLSIZEMIN$24);
                      }
                      target.setStringValue(usedpoolsizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "usedpoolsize_min" attribute
                 */
                public void xsetUsedpoolsizeMin(org.apache.xmlbeans.XmlString usedpoolsizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEDPOOLSIZEMIN$24);
                      }
                      target.set(usedpoolsizeMin);
                    }
                }
                
                /**
                 * Unsets the "usedpoolsize_min" attribute
                 */
                public void unsetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(USEDPOOLSIZEMIN$24);
                    }
                }
                
                /**
                 * Gets the "poolwait_max" attribute
                 */
                public double getPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMAX$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_max" attribute
                 */
                public boolean isSetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITMAX$26) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_max" attribute
                 */
                public void setPoolwaitMax(double poolwaitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITMAX$26);
                      }
                      target.setDoubleValue(poolwaitMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_max" attribute
                 */
                public void xsetPoolwaitMax(org.apache.xmlbeans.XmlDouble poolwaitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITMAX$26);
                      }
                      target.set(poolwaitMax);
                    }
                }
                
                /**
                 * Unsets the "poolwait_max" attribute
                 */
                public void unsetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITMAX$26);
                    }
                }
                
                /**
                 * Gets the "poolwait_avg" attribute
                 */
                public double getPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITAVG$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_avg" attribute
                 */
                public boolean isSetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITAVG$28) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_avg" attribute
                 */
                public void setPoolwaitAvg(double poolwaitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITAVG$28);
                      }
                      target.setDoubleValue(poolwaitAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_avg" attribute
                 */
                public void xsetPoolwaitAvg(org.apache.xmlbeans.XmlDouble poolwaitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITAVG$28);
                      }
                      target.set(poolwaitAvg);
                    }
                }
                
                /**
                 * Unsets the "poolwait_avg" attribute
                 */
                public void unsetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITAVG$28);
                    }
                }
                
                /**
                 * Gets the "last_pool_usage" attribute
                 */
                public java.lang.String getLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "last_pool_usage" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "last_pool_usage" attribute
                 */
                public boolean isSetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LASTPOOLUSAGE$30) != null;
                    }
                }
                
                /**
                 * Sets the "last_pool_usage" attribute
                 */
                public void setLastPoolUsage(java.lang.String lastPoolUsage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTPOOLUSAGE$30);
                      }
                      target.setStringValue(lastPoolUsage);
                    }
                }
                
                /**
                 * Sets (as xml) the "last_pool_usage" attribute
                 */
                public void xsetLastPoolUsage(org.apache.xmlbeans.XmlString lastPoolUsage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTPOOLUSAGE$30);
                      }
                      target.set(lastPoolUsage);
                    }
                }
                
                /**
                 * Unsets the "last_pool_usage" attribute
                 */
                public void unsetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LASTPOOLUSAGE$30);
                    }
                }
                
                /**
                 * Gets the "poolsize" attribute
                 */
                public java.math.BigInteger getPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolsize" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POOLSIZE$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolsize" attribute
                 */
                public boolean isSetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLSIZE$32) != null;
                    }
                }
                
                /**
                 * Sets the "poolsize" attribute
                 */
                public void setPoolsize(java.math.BigInteger poolsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLSIZE$32);
                      }
                      target.setBigIntegerValue(poolsize);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolsize" attribute
                 */
                public void xsetPoolsize(org.apache.xmlbeans.XmlInteger poolsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(POOLSIZE$32);
                      }
                      target.set(poolsize);
                    }
                }
                
                /**
                 * Unsets the "poolsize" attribute
                 */
                public void unsetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLSIZE$32);
                    }
                }
                
                /**
                 * Gets the "dbtype" attribute
                 */
                public java.lang.String getDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbtype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBTYPE$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbtype" attribute
                 */
                public boolean isSetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBTYPE$34) != null;
                    }
                }
                
                /**
                 * Sets the "dbtype" attribute
                 */
                public void setDbtype(java.lang.String dbtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBTYPE$34);
                      }
                      target.setStringValue(dbtype);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbtype" attribute
                 */
                public void xsetDbtype(org.apache.xmlbeans.XmlString dbtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBTYPE$34);
                      }
                      target.set(dbtype);
                    }
                }
                
                /**
                 * Unsets the "dbtype" attribute
                 */
                public void unsetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBTYPE$34);
                    }
                }
                
                /**
                 * Gets the "dbname" attribute
                 */
                public java.lang.String getDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBNAME$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbname" attribute
                 */
                public boolean isSetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBNAME$36) != null;
                    }
                }
                
                /**
                 * Sets the "dbname" attribute
                 */
                public void setDbname(java.lang.String dbname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBNAME$36);
                      }
                      target.setStringValue(dbname);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbname" attribute
                 */
                public void xsetDbname(org.apache.xmlbeans.XmlString dbname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBNAME$36);
                      }
                      target.set(dbname);
                    }
                }
                
                /**
                 * Unsets the "dbname" attribute
                 */
                public void unsetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBNAME$36);
                    }
                }
                
                /**
                 * Gets the "dbhost" attribute
                 */
                public java.lang.String getDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbhost" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBHOST$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbhost" attribute
                 */
                public boolean isSetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBHOST$38) != null;
                    }
                }
                
                /**
                 * Sets the "dbhost" attribute
                 */
                public void setDbhost(java.lang.String dbhost)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBHOST$38);
                      }
                      target.setStringValue(dbhost);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbhost" attribute
                 */
                public void xsetDbhost(org.apache.xmlbeans.XmlString dbhost)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBHOST$38);
                      }
                      target.set(dbhost);
                    }
                }
                
                /**
                 * Unsets the "dbhost" attribute
                 */
                public void unsetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBHOST$38);
                    }
                }
                
                /**
                 * Gets the "dbuser" attribute
                 */
                public java.lang.String getDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbuser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBUSER$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbuser" attribute
                 */
                public boolean isSetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBUSER$40) != null;
                    }
                }
                
                /**
                 * Sets the "dbuser" attribute
                 */
                public void setDbuser(java.lang.String dbuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBUSER$40);
                      }
                      target.setStringValue(dbuser);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbuser" attribute
                 */
                public void xsetDbuser(org.apache.xmlbeans.XmlString dbuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBUSER$40);
                      }
                      target.set(dbuser);
                    }
                }
                
                /**
                 * Unsets the "dbuser" attribute
                 */
                public void unsetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBUSER$40);
                    }
                }
                
                /**
                 * Gets the "pooluser" attribute
                 */
                public java.lang.String getPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pooluser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLUSER$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "pooluser" attribute
                 */
                public boolean isSetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLUSER$42) != null;
                    }
                }
                
                /**
                 * Sets the "pooluser" attribute
                 */
                public void setPooluser(java.lang.String pooluser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLUSER$42);
                      }
                      target.setStringValue(pooluser);
                    }
                }
                
                /**
                 * Sets (as xml) the "pooluser" attribute
                 */
                public void xsetPooluser(org.apache.xmlbeans.XmlString pooluser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLUSER$42);
                      }
                      target.set(pooluser);
                    }
                }
                
                /**
                 * Unsets the "pooluser" attribute
                 */
                public void unsetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLUSER$42);
                    }
                }
                
                /**
                 * Gets the "dburl" attribute
                 */
                public java.lang.String getDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dburl" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBURL$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "dburl" attribute
                 */
                public boolean isSetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBURL$44) != null;
                    }
                }
                
                /**
                 * Sets the "dburl" attribute
                 */
                public void setDburl(java.lang.String dburl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBURL$44);
                      }
                      target.setStringValue(dburl);
                    }
                }
                
                /**
                 * Sets (as xml) the "dburl" attribute
                 */
                public void xsetDburl(org.apache.xmlbeans.XmlString dburl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBURL$44);
                      }
                      target.set(dburl);
                    }
                }
                
                /**
                 * Unsets the "dburl" attribute
                 */
                public void unsetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBURL$44);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$46);
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
                      return get_store().find_attribute_user(AGENT$46) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$46);
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
                      get_store().remove_attribute(AGENT$46);
                    }
                }
                
                /**
                 * Gets the "poolwait_sum" attribute
                 */
                public double getPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITSUM$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_sum" attribute
                 */
                public boolean isSetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITSUM$48) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_sum" attribute
                 */
                public void setPoolwaitSum(double poolwaitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITSUM$48);
                      }
                      target.setDoubleValue(poolwaitSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_sum" attribute
                 */
                public void xsetPoolwaitSum(org.apache.xmlbeans.XmlDouble poolwaitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITSUM$48);
                      }
                      target.set(poolwaitSum);
                    }
                }
                
                /**
                 * Unsets the "poolwait_sum" attribute
                 */
                public void unsetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITSUM$48);
                    }
                }
                
                /**
                 * Gets the "poolwait_min" attribute
                 */
                public double getPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMIN$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_min" attribute
                 */
                public boolean isSetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITMIN$50) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_min" attribute
                 */
                public void setPoolwaitMin(double poolwaitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITMIN$50);
                      }
                      target.setDoubleValue(poolwaitMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_min" attribute
                 */
                public void xsetPoolwaitMin(org.apache.xmlbeans.XmlDouble poolwaitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITMIN$50);
                      }
                      target.set(poolwaitMin);
                    }
                }
                
                /**
                 * Unsets the "poolwait_min" attribute
                 */
                public void unsetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITMIN$50);
                    }
                }
                
                /**
                 * Gets the "response_time" attribute
                 */
                public double getResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time" attribute
                 */
                public boolean isSetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIME$52) != null;
                    }
                }
                
                /**
                 * Sets the "response_time" attribute
                 */
                public void setResponseTime(double responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIME$52);
                      }
                      target.setDoubleValue(responseTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                public void xsetResponseTime(org.apache.xmlbeans.XmlDouble responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIME$52);
                      }
                      target.set(responseTime);
                    }
                }
                
                /**
                 * Unsets the "response_time" attribute
                 */
                public void unsetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIME$52);
                    }
                }
                
                /**
                 * Gets the "response_time_per_execution" attribute
                 */
                public double getResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_execution" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_execution" attribute
                 */
                public boolean isSetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_execution" attribute
                 */
                public void setResponseTimePerExecution(double responseTimePerExecution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      }
                      target.setDoubleValue(responseTimePerExecution);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_execution" attribute
                 */
                public void xsetResponseTimePerExecution(org.apache.xmlbeans.XmlDouble responseTimePerExecution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      }
                      target.set(responseTimePerExecution);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_execution" attribute
                 */
                public void unsetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPEREXECUTION$54);
                    }
                }
                
                /**
                 * Gets the "response_time_per_transaction" attribute
                 */
                public double getResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_transaction" attribute
                 */
                public boolean isSetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_transaction" attribute
                 */
                public void setResponseTimePerTransaction(double responseTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      }
                      target.setDoubleValue(responseTimePerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_transaction" attribute
                 */
                public void xsetResponseTimePerTransaction(org.apache.xmlbeans.XmlDouble responseTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      }
                      target.set(responseTimePerTransaction);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_transaction" attribute
                 */
                public void unsetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPERTRANSACTION$56);
                    }
                }
                
                /**
                 * Gets the "response_time_per_passing_transaction" attribute
                 */
                public double getResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_passing_transaction" attribute
                 */
                public boolean isSetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_passing_transaction" attribute
                 */
                public void setResponseTimePerPassingTransaction(double responseTimePerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      }
                      target.setDoubleValue(responseTimePerPassingTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                public void xsetResponseTimePerPassingTransaction(org.apache.xmlbeans.XmlDouble responseTimePerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      }
                      target.set(responseTimePerPassingTransaction);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_passing_transaction" attribute
                 */
                public void unsetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPERPASSINGTRANSACTION$58);
                    }
                }
                
                /**
                 * Gets the "executions_per_transaction" attribute
                 */
                public double getExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "executions_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "executions_per_transaction" attribute
                 */
                public boolean isSetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60) != null;
                    }
                }
                
                /**
                 * Sets the "executions_per_transaction" attribute
                 */
                public void setExecutionsPerTransaction(double executionsPerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      }
                      target.setDoubleValue(executionsPerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "executions_per_transaction" attribute
                 */
                public void xsetExecutionsPerTransaction(org.apache.xmlbeans.XmlDouble executionsPerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      }
                      target.set(executionsPerTransaction);
                    }
                }
                
                /**
                 * Unsets the "executions_per_transaction" attribute
                 */
                public void unsetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECUTIONSPERTRANSACTION$60);
                    }
                }
                
                /**
                 * Gets the "executions_per_passing_transaction" attribute
                 */
                public double getExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "executions_per_passing_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "executions_per_passing_transaction" attribute
                 */
                public boolean isSetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62) != null;
                    }
                }
                
                /**
                 * Sets the "executions_per_passing_transaction" attribute
                 */
                public void setExecutionsPerPassingTransaction(double executionsPerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      }
                      target.setDoubleValue(executionsPerPassingTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "executions_per_passing_transaction" attribute
                 */
                public void xsetExecutionsPerPassingTransaction(org.apache.xmlbeans.XmlDouble executionsPerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      }
                      target.set(executionsPerPassingTransaction);
                    }
                }
                
                /**
                 * Unsets the "executions_per_passing_transaction" attribute
                 */
                public void unsetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECUTIONSPERPASSINGTRANSACTION$62);
                    }
                }
                
                /**
                 * Gets the "pct_of_transactions_calling" attribute
                 */
                public java.lang.String getPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pct_of_transactions_calling" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "pct_of_transactions_calling" attribute
                 */
                public boolean isSetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64) != null;
                    }
                }
                
                /**
                 * Sets the "pct_of_transactions_calling" attribute
                 */
                public void setPctOfTransactionsCalling(java.lang.String pctOfTransactionsCalling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      }
                      target.setStringValue(pctOfTransactionsCalling);
                    }
                }
                
                /**
                 * Sets (as xml) the "pct_of_transactions_calling" attribute
                 */
                public void xsetPctOfTransactionsCalling(org.apache.xmlbeans.XmlString pctOfTransactionsCalling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      }
                      target.set(pctOfTransactionsCalling);
                    }
                }
                
                /**
                 * Unsets the "pct_of_transactions_calling" attribute
                 */
                public void unsetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PCTOFTRANSACTIONSCALLING$64);
                    }
                }
                
                /**
                 * Gets the "pool_wait_time_per_transaction" attribute
                 */
                public double getPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      return target;
                    }
                }
                
                /**
                 * True if has "pool_wait_time_per_transaction" attribute
                 */
                public boolean isSetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66) != null;
                    }
                }
                
                /**
                 * Sets the "pool_wait_time_per_transaction" attribute
                 */
                public void setPoolWaitTimePerTransaction(double poolWaitTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      }
                      target.setDoubleValue(poolWaitTimePerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                public void xsetPoolWaitTimePerTransaction(org.apache.xmlbeans.XmlDouble poolWaitTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      }
                      target.set(poolWaitTimePerTransaction);
                    }
                }
                
                /**
                 * Unsets the "pool_wait_time_per_transaction" attribute
                 */
                public void unsetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITTIMEPERTRANSACTION$66);
                    }
                }
                
                /**
                 * Gets the "platform" attribute
                 */
                public java.lang.String getPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "platform" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$68);
                      return target;
                    }
                }
                
                /**
                 * True if has "platform" attribute
                 */
                public boolean isSetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PLATFORM$68) != null;
                    }
                }
                
                /**
                 * Sets the "platform" attribute
                 */
                public void setPlatform(java.lang.String platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$68);
                      }
                      target.setStringValue(platform);
                    }
                }
                
                /**
                 * Sets (as xml) the "platform" attribute
                 */
                public void xsetPlatform(org.apache.xmlbeans.XmlString platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORM$68);
                      }
                      target.set(platform);
                    }
                }
                
                /**
                 * Unsets the "platform" attribute
                 */
                public void unsetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PLATFORM$68);
                    }
                }
                
                /**
                 * Gets the "response_time_contribution" attribute
                 */
                public java.lang.String getResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_contribution" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_contribution" attribute
                 */
                public boolean isSetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_contribution" attribute
                 */
                public void setResponseTimeContribution(java.lang.String responseTimeContribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      }
                      target.setStringValue(responseTimeContribution);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_contribution" attribute
                 */
                public void xsetResponseTimeContribution(org.apache.xmlbeans.XmlString responseTimeContribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      }
                      target.set(responseTimeContribution);
                    }
                }
                
                /**
                 * Unsets the "response_time_contribution" attribute
                 */
                public void unsetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMECONTRIBUTION$70);
                    }
                }
                
                /**
                 * Gets the "failure_rate" attribute
                 */
                public java.lang.String getFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "failure_rate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$72);
                      return target;
                    }
                }
                
                /**
                 * True if has "failure_rate" attribute
                 */
                public boolean isSetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(FAILURERATE$72) != null;
                    }
                }
                
                /**
                 * Sets the "failure_rate" attribute
                 */
                public void setFailureRate(java.lang.String failureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$72);
                      }
                      target.setStringValue(failureRate);
                    }
                }
                
                /**
                 * Sets (as xml) the "failure_rate" attribute
                 */
                public void xsetFailureRate(org.apache.xmlbeans.XmlString failureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$72);
                      }
                      target.set(failureRate);
                    }
                }
                
                /**
                 * Unsets the "failure_rate" attribute
                 */
                public void unsetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(FAILURERATE$72);
                    }
                }
                
                /**
                 * Gets the "rowcount" attribute
                 */
                public java.math.BigInteger getRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rowcount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWCOUNT$74);
                      return target;
                    }
                }
                
                /**
                 * True if has "rowcount" attribute
                 */
                public boolean isSetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROWCOUNT$74) != null;
                    }
                }
                
                /**
                 * Sets the "rowcount" attribute
                 */
                public void setRowcount(java.math.BigInteger rowcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWCOUNT$74);
                      }
                      target.setBigIntegerValue(rowcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "rowcount" attribute
                 */
                public void xsetRowcount(org.apache.xmlbeans.XmlInteger rowcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROWCOUNT$74);
                      }
                      target.set(rowcount);
                    }
                }
                
                /**
                 * Unsets the "rowcount" attribute
                 */
                public void unsetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROWCOUNT$74);
                    }
                }
                
                /**
                 * Gets the "roundtrips" attribute
                 */
                public java.math.BigInteger getRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "roundtrips" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROUNDTRIPS$76);
                      return target;
                    }
                }
                
                /**
                 * True if has "roundtrips" attribute
                 */
                public boolean isSetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROUNDTRIPS$76) != null;
                    }
                }
                
                /**
                 * Sets the "roundtrips" attribute
                 */
                public void setRoundtrips(java.math.BigInteger roundtrips)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROUNDTRIPS$76);
                      }
                      target.setBigIntegerValue(roundtrips);
                    }
                }
                
                /**
                 * Sets (as xml) the "roundtrips" attribute
                 */
                public void xsetRoundtrips(org.apache.xmlbeans.XmlInteger roundtrips)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROUNDTRIPS$76);
                      }
                      target.set(roundtrips);
                    }
                }
                
                /**
                 * Unsets the "roundtrips" attribute
                 */
                public void unsetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROUNDTRIPS$76);
                    }
                }
                
                /**
                 * Gets the "pooltype" attribute
                 */
                public java.lang.String getPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pooltype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$78);
                      return target;
                    }
                }
                
                /**
                 * True if has "pooltype" attribute
                 */
                public boolean isSetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLTYPE$78) != null;
                    }
                }
                
                /**
                 * Sets the "pooltype" attribute
                 */
                public void setPooltype(java.lang.String pooltype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLTYPE$78);
                      }
                      target.setStringValue(pooltype);
                    }
                }
                
                /**
                 * Sets (as xml) the "pooltype" attribute
                 */
                public void xsetPooltype(org.apache.xmlbeans.XmlString pooltype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLTYPE$78);
                      }
                      target.set(pooltype);
                    }
                }
                
                /**
                 * Unsets the "pooltype" attribute
                 */
                public void unsetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLTYPE$78);
                    }
                }
            }
        }
        /**
         * An XML database_topcounts(@).
         *
         * This is a complex type.
         */
        public static class DatabaseTopcountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts
        {
            private static final long serialVersionUID = 1L;
            
            public DatabaseTopcountsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATABASETOPCOUNT$0 = 
                new javax.xml.namespace.QName("", "database_topcount");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "database_topcount" elements
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount[] getDatabaseTopcountArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DATABASETOPCOUNT$0, targetList);
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount[] result = new noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "database_topcount" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount getDatabaseTopcountArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount)get_store().find_element_user(DATABASETOPCOUNT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "database_topcount" element
             */
            public int sizeOfDatabaseTopcountArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATABASETOPCOUNT$0);
                }
            }
            
            /**
             * Sets array of all "database_topcount" element
             */
            public void setDatabaseTopcountArray(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount[] databaseTopcountArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(databaseTopcountArray, DATABASETOPCOUNT$0);
                }
            }
            
            /**
             * Sets ith "database_topcount" element
             */
            public void setDatabaseTopcountArray(int i, noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount databaseTopcount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount)get_store().find_element_user(DATABASETOPCOUNT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(databaseTopcount);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "database_topcount" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount insertNewDatabaseTopcount(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount)get_store().insert_element_user(DATABASETOPCOUNT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "database_topcount" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount addNewDatabaseTopcount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount)get_store().add_element_user(DATABASETOPCOUNT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "database_topcount" element
             */
            public void removeDatabaseTopcount(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATABASETOPCOUNT$0, i);
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
             * An XML database_topcount(@).
             *
             * This is a complex type.
             */
            public static class DatabaseTopcountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount
            {
                private static final long serialVersionUID = 1L;
                
                public DatabaseTopcountImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATABASETOPCOUNT$0 = 
                    new javax.xml.namespace.QName("", "database_topcount");
                private static final javax.xml.namespace.QName DBSOURCEPOOL$2 = 
                    new javax.xml.namespace.QName("", "dbsource_pool");
                private static final javax.xml.namespace.QName DBSOURCESQL$4 = 
                    new javax.xml.namespace.QName("", "dbsource_sql");
                private static final javax.xml.namespace.QName POOLNAME$6 = 
                    new javax.xml.namespace.QName("", "poolname");
                private static final javax.xml.namespace.QName BINDVALUES$8 = 
                    new javax.xml.namespace.QName("", "bindvalues");
                private static final javax.xml.namespace.QName COUNT$10 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName PREPARATIONS$12 = 
                    new javax.xml.namespace.QName("", "preparations");
                private static final javax.xml.namespace.QName EXECAVG$14 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$16 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$18 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$20 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName USEDPOOLSIZEMAX$22 = 
                    new javax.xml.namespace.QName("", "usedpoolsize_max");
                private static final javax.xml.namespace.QName USEDPOOLSIZEMIN$24 = 
                    new javax.xml.namespace.QName("", "usedpoolsize_min");
                private static final javax.xml.namespace.QName POOLWAITMAX$26 = 
                    new javax.xml.namespace.QName("", "poolwait_max");
                private static final javax.xml.namespace.QName POOLWAITAVG$28 = 
                    new javax.xml.namespace.QName("", "poolwait_avg");
                private static final javax.xml.namespace.QName LASTPOOLUSAGE$30 = 
                    new javax.xml.namespace.QName("", "last_pool_usage");
                private static final javax.xml.namespace.QName POOLSIZE$32 = 
                    new javax.xml.namespace.QName("", "poolsize");
                private static final javax.xml.namespace.QName DBTYPE$34 = 
                    new javax.xml.namespace.QName("", "dbtype");
                private static final javax.xml.namespace.QName DBNAME$36 = 
                    new javax.xml.namespace.QName("", "dbname");
                private static final javax.xml.namespace.QName DBHOST$38 = 
                    new javax.xml.namespace.QName("", "dbhost");
                private static final javax.xml.namespace.QName DBUSER$40 = 
                    new javax.xml.namespace.QName("", "dbuser");
                private static final javax.xml.namespace.QName POOLUSER$42 = 
                    new javax.xml.namespace.QName("", "pooluser");
                private static final javax.xml.namespace.QName DBURL$44 = 
                    new javax.xml.namespace.QName("", "dburl");
                private static final javax.xml.namespace.QName AGENT$46 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName POOLWAITSUM$48 = 
                    new javax.xml.namespace.QName("", "poolwait_sum");
                private static final javax.xml.namespace.QName POOLWAITMIN$50 = 
                    new javax.xml.namespace.QName("", "poolwait_min");
                private static final javax.xml.namespace.QName RESPONSETIME$52 = 
                    new javax.xml.namespace.QName("", "response_time");
                private static final javax.xml.namespace.QName RESPONSETIMEPEREXECUTION$54 = 
                    new javax.xml.namespace.QName("", "response_time_per_execution");
                private static final javax.xml.namespace.QName RESPONSETIMEPERTRANSACTION$56 = 
                    new javax.xml.namespace.QName("", "response_time_per_transaction");
                private static final javax.xml.namespace.QName RESPONSETIMEPERPASSINGTRANSACTION$58 = 
                    new javax.xml.namespace.QName("", "response_time_per_passing_transaction");
                private static final javax.xml.namespace.QName EXECUTIONSPERTRANSACTION$60 = 
                    new javax.xml.namespace.QName("", "executions_per_transaction");
                private static final javax.xml.namespace.QName EXECUTIONSPERPASSINGTRANSACTION$62 = 
                    new javax.xml.namespace.QName("", "executions_per_passing_transaction");
                private static final javax.xml.namespace.QName PCTOFTRANSACTIONSCALLING$64 = 
                    new javax.xml.namespace.QName("", "pct_of_transactions_calling");
                private static final javax.xml.namespace.QName POOLWAITTIMEPERTRANSACTION$66 = 
                    new javax.xml.namespace.QName("", "pool_wait_time_per_transaction");
                private static final javax.xml.namespace.QName PLATFORM$68 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName RESPONSETIMECONTRIBUTION$70 = 
                    new javax.xml.namespace.QName("", "response_time_contribution");
                private static final javax.xml.namespace.QName FAILURERATE$72 = 
                    new javax.xml.namespace.QName("", "failure_rate");
                private static final javax.xml.namespace.QName ROWCOUNT$74 = 
                    new javax.xml.namespace.QName("", "rowcount");
                private static final javax.xml.namespace.QName ROUNDTRIPS$76 = 
                    new javax.xml.namespace.QName("", "roundtrips");
                private static final javax.xml.namespace.QName POOLTYPE$78 = 
                    new javax.xml.namespace.QName("", "pooltype");
                
                
                /**
                 * Gets array of all "database_topcount" elements
                 */
                public noNamespace.DatabaseTopcountDocument.DatabaseTopcount[] getDatabaseTopcountArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DATABASETOPCOUNT$0, targetList);
                      noNamespace.DatabaseTopcountDocument.DatabaseTopcount[] result = new noNamespace.DatabaseTopcountDocument.DatabaseTopcount[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "database_topcount" element
                 */
                public noNamespace.DatabaseTopcountDocument.DatabaseTopcount getDatabaseTopcountArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopcountDocument.DatabaseTopcount target = null;
                      target = (noNamespace.DatabaseTopcountDocument.DatabaseTopcount)get_store().find_element_user(DATABASETOPCOUNT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "database_topcount" element
                 */
                public int sizeOfDatabaseTopcountArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DATABASETOPCOUNT$0);
                    }
                }
                
                /**
                 * Sets array of all "database_topcount" element
                 */
                public void setDatabaseTopcountArray(noNamespace.DatabaseTopcountDocument.DatabaseTopcount[] databaseTopcountArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(databaseTopcountArray, DATABASETOPCOUNT$0);
                    }
                }
                
                /**
                 * Sets ith "database_topcount" element
                 */
                public void setDatabaseTopcountArray(int i, noNamespace.DatabaseTopcountDocument.DatabaseTopcount databaseTopcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopcountDocument.DatabaseTopcount target = null;
                      target = (noNamespace.DatabaseTopcountDocument.DatabaseTopcount)get_store().find_element_user(DATABASETOPCOUNT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(databaseTopcount);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "database_topcount" element
                 */
                public noNamespace.DatabaseTopcountDocument.DatabaseTopcount insertNewDatabaseTopcount(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopcountDocument.DatabaseTopcount target = null;
                      target = (noNamespace.DatabaseTopcountDocument.DatabaseTopcount)get_store().insert_element_user(DATABASETOPCOUNT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "database_topcount" element
                 */
                public noNamespace.DatabaseTopcountDocument.DatabaseTopcount addNewDatabaseTopcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabaseTopcountDocument.DatabaseTopcount target = null;
                      target = (noNamespace.DatabaseTopcountDocument.DatabaseTopcount)get_store().add_element_user(DATABASETOPCOUNT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "database_topcount" element
                 */
                public void removeDatabaseTopcount(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DATABASETOPCOUNT$0, i);
                    }
                }
                
                /**
                 * Gets the "dbsource_pool" attribute
                 */
                public java.lang.String getDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbsource_pool" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbsource_pool" attribute
                 */
                public boolean isSetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBSOURCEPOOL$2) != null;
                    }
                }
                
                /**
                 * Sets the "dbsource_pool" attribute
                 */
                public void setDbsourcePool(java.lang.String dbsourcePool)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBSOURCEPOOL$2);
                      }
                      target.setStringValue(dbsourcePool);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbsource_pool" attribute
                 */
                public void xsetDbsourcePool(org.apache.xmlbeans.XmlString dbsourcePool)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBSOURCEPOOL$2);
                      }
                      target.set(dbsourcePool);
                    }
                }
                
                /**
                 * Unsets the "dbsource_pool" attribute
                 */
                public void unsetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBSOURCEPOOL$2);
                    }
                }
                
                /**
                 * Gets the "dbsource_sql" attribute
                 */
                public java.lang.String getDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbsource_sql" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCESQL$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbsource_sql" attribute
                 */
                public boolean isSetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBSOURCESQL$4) != null;
                    }
                }
                
                /**
                 * Sets the "dbsource_sql" attribute
                 */
                public void setDbsourceSql(java.lang.String dbsourceSql)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBSOURCESQL$4);
                      }
                      target.setStringValue(dbsourceSql);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbsource_sql" attribute
                 */
                public void xsetDbsourceSql(org.apache.xmlbeans.XmlString dbsourceSql)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBSOURCESQL$4);
                      }
                      target.set(dbsourceSql);
                    }
                }
                
                /**
                 * Unsets the "dbsource_sql" attribute
                 */
                public void unsetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBSOURCESQL$4);
                    }
                }
                
                /**
                 * Gets the "poolname" attribute
                 */
                public java.lang.String getPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLNAME$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolname" attribute
                 */
                public boolean isSetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLNAME$6) != null;
                    }
                }
                
                /**
                 * Sets the "poolname" attribute
                 */
                public void setPoolname(java.lang.String poolname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLNAME$6);
                      }
                      target.setStringValue(poolname);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolname" attribute
                 */
                public void xsetPoolname(org.apache.xmlbeans.XmlString poolname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLNAME$6);
                      }
                      target.set(poolname);
                    }
                }
                
                /**
                 * Unsets the "poolname" attribute
                 */
                public void unsetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLNAME$6);
                    }
                }
                
                /**
                 * Gets the "bindvalues" attribute
                 */
                public java.lang.String getBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bindvalues" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDVALUES$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "bindvalues" attribute
                 */
                public boolean isSetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BINDVALUES$8) != null;
                    }
                }
                
                /**
                 * Sets the "bindvalues" attribute
                 */
                public void setBindvalues(java.lang.String bindvalues)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BINDVALUES$8);
                      }
                      target.setStringValue(bindvalues);
                    }
                }
                
                /**
                 * Sets (as xml) the "bindvalues" attribute
                 */
                public void xsetBindvalues(org.apache.xmlbeans.XmlString bindvalues)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BINDVALUES$8);
                      }
                      target.set(bindvalues);
                    }
                }
                
                /**
                 * Unsets the "bindvalues" attribute
                 */
                public void unsetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BINDVALUES$8);
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
                 * True if has "count" attribute
                 */
                public boolean isSetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COUNT$10) != null;
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
                
                /**
                 * Unsets the "count" attribute
                 */
                public void unsetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COUNT$10);
                    }
                }
                
                /**
                 * Gets the "preparations" attribute
                 */
                public java.math.BigInteger getPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "preparations" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PREPARATIONS$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "preparations" attribute
                 */
                public boolean isSetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PREPARATIONS$12) != null;
                    }
                }
                
                /**
                 * Sets the "preparations" attribute
                 */
                public void setPreparations(java.math.BigInteger preparations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREPARATIONS$12);
                      }
                      target.setBigIntegerValue(preparations);
                    }
                }
                
                /**
                 * Sets (as xml) the "preparations" attribute
                 */
                public void xsetPreparations(org.apache.xmlbeans.XmlInteger preparations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PREPARATIONS$12);
                      }
                      target.set(preparations);
                    }
                }
                
                /**
                 * Unsets the "preparations" attribute
                 */
                public void unsetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PREPARATIONS$12);
                    }
                }
                
                /**
                 * Gets the "exec_avg" attribute
                 */
                public double getExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_avg" attribute
                 */
                public boolean isSetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECAVG$14) != null;
                    }
                }
                
                /**
                 * Sets the "exec_avg" attribute
                 */
                public void setExecAvg(double execAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$14);
                      }
                      target.setDoubleValue(execAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_avg" attribute
                 */
                public void xsetExecAvg(org.apache.xmlbeans.XmlDouble execAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$14);
                      }
                      target.set(execAvg);
                    }
                }
                
                /**
                 * Unsets the "exec_avg" attribute
                 */
                public void unsetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECAVG$14);
                    }
                }
                
                /**
                 * Gets the "exec_min" attribute
                 */
                public double getExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_min" attribute
                 */
                public boolean isSetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECMIN$16) != null;
                    }
                }
                
                /**
                 * Sets the "exec_min" attribute
                 */
                public void setExecMin(double execMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$16);
                      }
                      target.setDoubleValue(execMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_min" attribute
                 */
                public void xsetExecMin(org.apache.xmlbeans.XmlDouble execMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$16);
                      }
                      target.set(execMin);
                    }
                }
                
                /**
                 * Unsets the "exec_min" attribute
                 */
                public void unsetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECMIN$16);
                    }
                }
                
                /**
                 * Gets the "exec_max" attribute
                 */
                public double getExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_max" attribute
                 */
                public boolean isSetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECMAX$18) != null;
                    }
                }
                
                /**
                 * Sets the "exec_max" attribute
                 */
                public void setExecMax(double execMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$18);
                      }
                      target.setDoubleValue(execMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_max" attribute
                 */
                public void xsetExecMax(org.apache.xmlbeans.XmlDouble execMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$18);
                      }
                      target.set(execMax);
                    }
                }
                
                /**
                 * Unsets the "exec_max" attribute
                 */
                public void unsetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECMAX$18);
                    }
                }
                
                /**
                 * Gets the "exec_sum" attribute
                 */
                public double getExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_sum" attribute
                 */
                public boolean isSetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECSUM$20) != null;
                    }
                }
                
                /**
                 * Sets the "exec_sum" attribute
                 */
                public void setExecSum(double execSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$20);
                      }
                      target.setDoubleValue(execSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_sum" attribute
                 */
                public void xsetExecSum(org.apache.xmlbeans.XmlDouble execSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$20);
                      }
                      target.set(execSum);
                    }
                }
                
                /**
                 * Unsets the "exec_sum" attribute
                 */
                public void unsetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECSUM$20);
                    }
                }
                
                /**
                 * Gets the "usedpoolsize_max" attribute
                 */
                public java.lang.String getUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "usedpoolsize_max" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "usedpoolsize_max" attribute
                 */
                public boolean isSetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(USEDPOOLSIZEMAX$22) != null;
                    }
                }
                
                /**
                 * Sets the "usedpoolsize_max" attribute
                 */
                public void setUsedpoolsizeMax(java.lang.String usedpoolsizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDPOOLSIZEMAX$22);
                      }
                      target.setStringValue(usedpoolsizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "usedpoolsize_max" attribute
                 */
                public void xsetUsedpoolsizeMax(org.apache.xmlbeans.XmlString usedpoolsizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEDPOOLSIZEMAX$22);
                      }
                      target.set(usedpoolsizeMax);
                    }
                }
                
                /**
                 * Unsets the "usedpoolsize_max" attribute
                 */
                public void unsetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(USEDPOOLSIZEMAX$22);
                    }
                }
                
                /**
                 * Gets the "usedpoolsize_min" attribute
                 */
                public java.lang.String getUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "usedpoolsize_min" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "usedpoolsize_min" attribute
                 */
                public boolean isSetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(USEDPOOLSIZEMIN$24) != null;
                    }
                }
                
                /**
                 * Sets the "usedpoolsize_min" attribute
                 */
                public void setUsedpoolsizeMin(java.lang.String usedpoolsizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDPOOLSIZEMIN$24);
                      }
                      target.setStringValue(usedpoolsizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "usedpoolsize_min" attribute
                 */
                public void xsetUsedpoolsizeMin(org.apache.xmlbeans.XmlString usedpoolsizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEDPOOLSIZEMIN$24);
                      }
                      target.set(usedpoolsizeMin);
                    }
                }
                
                /**
                 * Unsets the "usedpoolsize_min" attribute
                 */
                public void unsetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(USEDPOOLSIZEMIN$24);
                    }
                }
                
                /**
                 * Gets the "poolwait_max" attribute
                 */
                public double getPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMAX$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_max" attribute
                 */
                public boolean isSetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITMAX$26) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_max" attribute
                 */
                public void setPoolwaitMax(double poolwaitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITMAX$26);
                      }
                      target.setDoubleValue(poolwaitMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_max" attribute
                 */
                public void xsetPoolwaitMax(org.apache.xmlbeans.XmlDouble poolwaitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITMAX$26);
                      }
                      target.set(poolwaitMax);
                    }
                }
                
                /**
                 * Unsets the "poolwait_max" attribute
                 */
                public void unsetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITMAX$26);
                    }
                }
                
                /**
                 * Gets the "poolwait_avg" attribute
                 */
                public double getPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITAVG$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_avg" attribute
                 */
                public boolean isSetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITAVG$28) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_avg" attribute
                 */
                public void setPoolwaitAvg(double poolwaitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITAVG$28);
                      }
                      target.setDoubleValue(poolwaitAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_avg" attribute
                 */
                public void xsetPoolwaitAvg(org.apache.xmlbeans.XmlDouble poolwaitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITAVG$28);
                      }
                      target.set(poolwaitAvg);
                    }
                }
                
                /**
                 * Unsets the "poolwait_avg" attribute
                 */
                public void unsetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITAVG$28);
                    }
                }
                
                /**
                 * Gets the "last_pool_usage" attribute
                 */
                public java.lang.String getLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "last_pool_usage" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "last_pool_usage" attribute
                 */
                public boolean isSetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LASTPOOLUSAGE$30) != null;
                    }
                }
                
                /**
                 * Sets the "last_pool_usage" attribute
                 */
                public void setLastPoolUsage(java.lang.String lastPoolUsage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTPOOLUSAGE$30);
                      }
                      target.setStringValue(lastPoolUsage);
                    }
                }
                
                /**
                 * Sets (as xml) the "last_pool_usage" attribute
                 */
                public void xsetLastPoolUsage(org.apache.xmlbeans.XmlString lastPoolUsage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTPOOLUSAGE$30);
                      }
                      target.set(lastPoolUsage);
                    }
                }
                
                /**
                 * Unsets the "last_pool_usage" attribute
                 */
                public void unsetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LASTPOOLUSAGE$30);
                    }
                }
                
                /**
                 * Gets the "poolsize" attribute
                 */
                public java.math.BigInteger getPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolsize" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POOLSIZE$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolsize" attribute
                 */
                public boolean isSetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLSIZE$32) != null;
                    }
                }
                
                /**
                 * Sets the "poolsize" attribute
                 */
                public void setPoolsize(java.math.BigInteger poolsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLSIZE$32);
                      }
                      target.setBigIntegerValue(poolsize);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolsize" attribute
                 */
                public void xsetPoolsize(org.apache.xmlbeans.XmlInteger poolsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(POOLSIZE$32);
                      }
                      target.set(poolsize);
                    }
                }
                
                /**
                 * Unsets the "poolsize" attribute
                 */
                public void unsetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLSIZE$32);
                    }
                }
                
                /**
                 * Gets the "dbtype" attribute
                 */
                public java.lang.String getDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbtype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBTYPE$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbtype" attribute
                 */
                public boolean isSetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBTYPE$34) != null;
                    }
                }
                
                /**
                 * Sets the "dbtype" attribute
                 */
                public void setDbtype(java.lang.String dbtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBTYPE$34);
                      }
                      target.setStringValue(dbtype);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbtype" attribute
                 */
                public void xsetDbtype(org.apache.xmlbeans.XmlString dbtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBTYPE$34);
                      }
                      target.set(dbtype);
                    }
                }
                
                /**
                 * Unsets the "dbtype" attribute
                 */
                public void unsetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBTYPE$34);
                    }
                }
                
                /**
                 * Gets the "dbname" attribute
                 */
                public java.lang.String getDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBNAME$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbname" attribute
                 */
                public boolean isSetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBNAME$36) != null;
                    }
                }
                
                /**
                 * Sets the "dbname" attribute
                 */
                public void setDbname(java.lang.String dbname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBNAME$36);
                      }
                      target.setStringValue(dbname);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbname" attribute
                 */
                public void xsetDbname(org.apache.xmlbeans.XmlString dbname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBNAME$36);
                      }
                      target.set(dbname);
                    }
                }
                
                /**
                 * Unsets the "dbname" attribute
                 */
                public void unsetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBNAME$36);
                    }
                }
                
                /**
                 * Gets the "dbhost" attribute
                 */
                public java.lang.String getDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbhost" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBHOST$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbhost" attribute
                 */
                public boolean isSetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBHOST$38) != null;
                    }
                }
                
                /**
                 * Sets the "dbhost" attribute
                 */
                public void setDbhost(java.lang.String dbhost)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBHOST$38);
                      }
                      target.setStringValue(dbhost);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbhost" attribute
                 */
                public void xsetDbhost(org.apache.xmlbeans.XmlString dbhost)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBHOST$38);
                      }
                      target.set(dbhost);
                    }
                }
                
                /**
                 * Unsets the "dbhost" attribute
                 */
                public void unsetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBHOST$38);
                    }
                }
                
                /**
                 * Gets the "dbuser" attribute
                 */
                public java.lang.String getDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbuser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBUSER$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbuser" attribute
                 */
                public boolean isSetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBUSER$40) != null;
                    }
                }
                
                /**
                 * Sets the "dbuser" attribute
                 */
                public void setDbuser(java.lang.String dbuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBUSER$40);
                      }
                      target.setStringValue(dbuser);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbuser" attribute
                 */
                public void xsetDbuser(org.apache.xmlbeans.XmlString dbuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBUSER$40);
                      }
                      target.set(dbuser);
                    }
                }
                
                /**
                 * Unsets the "dbuser" attribute
                 */
                public void unsetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBUSER$40);
                    }
                }
                
                /**
                 * Gets the "pooluser" attribute
                 */
                public java.lang.String getPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pooluser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLUSER$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "pooluser" attribute
                 */
                public boolean isSetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLUSER$42) != null;
                    }
                }
                
                /**
                 * Sets the "pooluser" attribute
                 */
                public void setPooluser(java.lang.String pooluser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLUSER$42);
                      }
                      target.setStringValue(pooluser);
                    }
                }
                
                /**
                 * Sets (as xml) the "pooluser" attribute
                 */
                public void xsetPooluser(org.apache.xmlbeans.XmlString pooluser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLUSER$42);
                      }
                      target.set(pooluser);
                    }
                }
                
                /**
                 * Unsets the "pooluser" attribute
                 */
                public void unsetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLUSER$42);
                    }
                }
                
                /**
                 * Gets the "dburl" attribute
                 */
                public java.lang.String getDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dburl" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBURL$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "dburl" attribute
                 */
                public boolean isSetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBURL$44) != null;
                    }
                }
                
                /**
                 * Sets the "dburl" attribute
                 */
                public void setDburl(java.lang.String dburl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBURL$44);
                      }
                      target.setStringValue(dburl);
                    }
                }
                
                /**
                 * Sets (as xml) the "dburl" attribute
                 */
                public void xsetDburl(org.apache.xmlbeans.XmlString dburl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBURL$44);
                      }
                      target.set(dburl);
                    }
                }
                
                /**
                 * Unsets the "dburl" attribute
                 */
                public void unsetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBURL$44);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$46);
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
                      return get_store().find_attribute_user(AGENT$46) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$46);
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
                      get_store().remove_attribute(AGENT$46);
                    }
                }
                
                /**
                 * Gets the "poolwait_sum" attribute
                 */
                public double getPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITSUM$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_sum" attribute
                 */
                public boolean isSetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITSUM$48) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_sum" attribute
                 */
                public void setPoolwaitSum(double poolwaitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITSUM$48);
                      }
                      target.setDoubleValue(poolwaitSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_sum" attribute
                 */
                public void xsetPoolwaitSum(org.apache.xmlbeans.XmlDouble poolwaitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITSUM$48);
                      }
                      target.set(poolwaitSum);
                    }
                }
                
                /**
                 * Unsets the "poolwait_sum" attribute
                 */
                public void unsetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITSUM$48);
                    }
                }
                
                /**
                 * Gets the "poolwait_min" attribute
                 */
                public double getPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMIN$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_min" attribute
                 */
                public boolean isSetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITMIN$50) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_min" attribute
                 */
                public void setPoolwaitMin(double poolwaitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITMIN$50);
                      }
                      target.setDoubleValue(poolwaitMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_min" attribute
                 */
                public void xsetPoolwaitMin(org.apache.xmlbeans.XmlDouble poolwaitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITMIN$50);
                      }
                      target.set(poolwaitMin);
                    }
                }
                
                /**
                 * Unsets the "poolwait_min" attribute
                 */
                public void unsetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITMIN$50);
                    }
                }
                
                /**
                 * Gets the "response_time" attribute
                 */
                public double getResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time" attribute
                 */
                public boolean isSetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIME$52) != null;
                    }
                }
                
                /**
                 * Sets the "response_time" attribute
                 */
                public void setResponseTime(double responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIME$52);
                      }
                      target.setDoubleValue(responseTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                public void xsetResponseTime(org.apache.xmlbeans.XmlDouble responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIME$52);
                      }
                      target.set(responseTime);
                    }
                }
                
                /**
                 * Unsets the "response_time" attribute
                 */
                public void unsetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIME$52);
                    }
                }
                
                /**
                 * Gets the "response_time_per_execution" attribute
                 */
                public double getResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_execution" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_execution" attribute
                 */
                public boolean isSetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_execution" attribute
                 */
                public void setResponseTimePerExecution(double responseTimePerExecution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      }
                      target.setDoubleValue(responseTimePerExecution);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_execution" attribute
                 */
                public void xsetResponseTimePerExecution(org.apache.xmlbeans.XmlDouble responseTimePerExecution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      }
                      target.set(responseTimePerExecution);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_execution" attribute
                 */
                public void unsetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPEREXECUTION$54);
                    }
                }
                
                /**
                 * Gets the "response_time_per_transaction" attribute
                 */
                public double getResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_transaction" attribute
                 */
                public boolean isSetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_transaction" attribute
                 */
                public void setResponseTimePerTransaction(double responseTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      }
                      target.setDoubleValue(responseTimePerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_transaction" attribute
                 */
                public void xsetResponseTimePerTransaction(org.apache.xmlbeans.XmlDouble responseTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      }
                      target.set(responseTimePerTransaction);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_transaction" attribute
                 */
                public void unsetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPERTRANSACTION$56);
                    }
                }
                
                /**
                 * Gets the "response_time_per_passing_transaction" attribute
                 */
                public double getResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_passing_transaction" attribute
                 */
                public boolean isSetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_passing_transaction" attribute
                 */
                public void setResponseTimePerPassingTransaction(double responseTimePerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      }
                      target.setDoubleValue(responseTimePerPassingTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                public void xsetResponseTimePerPassingTransaction(org.apache.xmlbeans.XmlDouble responseTimePerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      }
                      target.set(responseTimePerPassingTransaction);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_passing_transaction" attribute
                 */
                public void unsetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPERPASSINGTRANSACTION$58);
                    }
                }
                
                /**
                 * Gets the "executions_per_transaction" attribute
                 */
                public double getExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "executions_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "executions_per_transaction" attribute
                 */
                public boolean isSetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60) != null;
                    }
                }
                
                /**
                 * Sets the "executions_per_transaction" attribute
                 */
                public void setExecutionsPerTransaction(double executionsPerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      }
                      target.setDoubleValue(executionsPerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "executions_per_transaction" attribute
                 */
                public void xsetExecutionsPerTransaction(org.apache.xmlbeans.XmlDouble executionsPerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      }
                      target.set(executionsPerTransaction);
                    }
                }
                
                /**
                 * Unsets the "executions_per_transaction" attribute
                 */
                public void unsetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECUTIONSPERTRANSACTION$60);
                    }
                }
                
                /**
                 * Gets the "executions_per_passing_transaction" attribute
                 */
                public double getExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "executions_per_passing_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "executions_per_passing_transaction" attribute
                 */
                public boolean isSetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62) != null;
                    }
                }
                
                /**
                 * Sets the "executions_per_passing_transaction" attribute
                 */
                public void setExecutionsPerPassingTransaction(double executionsPerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      }
                      target.setDoubleValue(executionsPerPassingTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "executions_per_passing_transaction" attribute
                 */
                public void xsetExecutionsPerPassingTransaction(org.apache.xmlbeans.XmlDouble executionsPerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      }
                      target.set(executionsPerPassingTransaction);
                    }
                }
                
                /**
                 * Unsets the "executions_per_passing_transaction" attribute
                 */
                public void unsetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECUTIONSPERPASSINGTRANSACTION$62);
                    }
                }
                
                /**
                 * Gets the "pct_of_transactions_calling" attribute
                 */
                public java.lang.String getPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pct_of_transactions_calling" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "pct_of_transactions_calling" attribute
                 */
                public boolean isSetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64) != null;
                    }
                }
                
                /**
                 * Sets the "pct_of_transactions_calling" attribute
                 */
                public void setPctOfTransactionsCalling(java.lang.String pctOfTransactionsCalling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      }
                      target.setStringValue(pctOfTransactionsCalling);
                    }
                }
                
                /**
                 * Sets (as xml) the "pct_of_transactions_calling" attribute
                 */
                public void xsetPctOfTransactionsCalling(org.apache.xmlbeans.XmlString pctOfTransactionsCalling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      }
                      target.set(pctOfTransactionsCalling);
                    }
                }
                
                /**
                 * Unsets the "pct_of_transactions_calling" attribute
                 */
                public void unsetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PCTOFTRANSACTIONSCALLING$64);
                    }
                }
                
                /**
                 * Gets the "pool_wait_time_per_transaction" attribute
                 */
                public double getPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      return target;
                    }
                }
                
                /**
                 * True if has "pool_wait_time_per_transaction" attribute
                 */
                public boolean isSetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66) != null;
                    }
                }
                
                /**
                 * Sets the "pool_wait_time_per_transaction" attribute
                 */
                public void setPoolWaitTimePerTransaction(double poolWaitTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      }
                      target.setDoubleValue(poolWaitTimePerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                public void xsetPoolWaitTimePerTransaction(org.apache.xmlbeans.XmlDouble poolWaitTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      }
                      target.set(poolWaitTimePerTransaction);
                    }
                }
                
                /**
                 * Unsets the "pool_wait_time_per_transaction" attribute
                 */
                public void unsetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITTIMEPERTRANSACTION$66);
                    }
                }
                
                /**
                 * Gets the "platform" attribute
                 */
                public java.lang.String getPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "platform" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$68);
                      return target;
                    }
                }
                
                /**
                 * True if has "platform" attribute
                 */
                public boolean isSetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PLATFORM$68) != null;
                    }
                }
                
                /**
                 * Sets the "platform" attribute
                 */
                public void setPlatform(java.lang.String platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$68);
                      }
                      target.setStringValue(platform);
                    }
                }
                
                /**
                 * Sets (as xml) the "platform" attribute
                 */
                public void xsetPlatform(org.apache.xmlbeans.XmlString platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORM$68);
                      }
                      target.set(platform);
                    }
                }
                
                /**
                 * Unsets the "platform" attribute
                 */
                public void unsetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PLATFORM$68);
                    }
                }
                
                /**
                 * Gets the "response_time_contribution" attribute
                 */
                public java.lang.String getResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_contribution" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_contribution" attribute
                 */
                public boolean isSetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_contribution" attribute
                 */
                public void setResponseTimeContribution(java.lang.String responseTimeContribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      }
                      target.setStringValue(responseTimeContribution);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_contribution" attribute
                 */
                public void xsetResponseTimeContribution(org.apache.xmlbeans.XmlString responseTimeContribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      }
                      target.set(responseTimeContribution);
                    }
                }
                
                /**
                 * Unsets the "response_time_contribution" attribute
                 */
                public void unsetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMECONTRIBUTION$70);
                    }
                }
                
                /**
                 * Gets the "failure_rate" attribute
                 */
                public java.lang.String getFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "failure_rate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$72);
                      return target;
                    }
                }
                
                /**
                 * True if has "failure_rate" attribute
                 */
                public boolean isSetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(FAILURERATE$72) != null;
                    }
                }
                
                /**
                 * Sets the "failure_rate" attribute
                 */
                public void setFailureRate(java.lang.String failureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$72);
                      }
                      target.setStringValue(failureRate);
                    }
                }
                
                /**
                 * Sets (as xml) the "failure_rate" attribute
                 */
                public void xsetFailureRate(org.apache.xmlbeans.XmlString failureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$72);
                      }
                      target.set(failureRate);
                    }
                }
                
                /**
                 * Unsets the "failure_rate" attribute
                 */
                public void unsetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(FAILURERATE$72);
                    }
                }
                
                /**
                 * Gets the "rowcount" attribute
                 */
                public java.math.BigInteger getRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rowcount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWCOUNT$74);
                      return target;
                    }
                }
                
                /**
                 * True if has "rowcount" attribute
                 */
                public boolean isSetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROWCOUNT$74) != null;
                    }
                }
                
                /**
                 * Sets the "rowcount" attribute
                 */
                public void setRowcount(java.math.BigInteger rowcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWCOUNT$74);
                      }
                      target.setBigIntegerValue(rowcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "rowcount" attribute
                 */
                public void xsetRowcount(org.apache.xmlbeans.XmlInteger rowcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROWCOUNT$74);
                      }
                      target.set(rowcount);
                    }
                }
                
                /**
                 * Unsets the "rowcount" attribute
                 */
                public void unsetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROWCOUNT$74);
                    }
                }
                
                /**
                 * Gets the "roundtrips" attribute
                 */
                public java.math.BigInteger getRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "roundtrips" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROUNDTRIPS$76);
                      return target;
                    }
                }
                
                /**
                 * True if has "roundtrips" attribute
                 */
                public boolean isSetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROUNDTRIPS$76) != null;
                    }
                }
                
                /**
                 * Sets the "roundtrips" attribute
                 */
                public void setRoundtrips(java.math.BigInteger roundtrips)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROUNDTRIPS$76);
                      }
                      target.setBigIntegerValue(roundtrips);
                    }
                }
                
                /**
                 * Sets (as xml) the "roundtrips" attribute
                 */
                public void xsetRoundtrips(org.apache.xmlbeans.XmlInteger roundtrips)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROUNDTRIPS$76);
                      }
                      target.set(roundtrips);
                    }
                }
                
                /**
                 * Unsets the "roundtrips" attribute
                 */
                public void unsetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROUNDTRIPS$76);
                    }
                }
                
                /**
                 * Gets the "pooltype" attribute
                 */
                public java.lang.String getPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pooltype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$78);
                      return target;
                    }
                }
                
                /**
                 * True if has "pooltype" attribute
                 */
                public boolean isSetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLTYPE$78) != null;
                    }
                }
                
                /**
                 * Sets the "pooltype" attribute
                 */
                public void setPooltype(java.lang.String pooltype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLTYPE$78);
                      }
                      target.setStringValue(pooltype);
                    }
                }
                
                /**
                 * Sets (as xml) the "pooltype" attribute
                 */
                public void xsetPooltype(org.apache.xmlbeans.XmlString pooltype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLTYPE$78);
                      }
                      target.set(pooltype);
                    }
                }
                
                /**
                 * Unsets the "pooltype" attribute
                 */
                public void unsetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLTYPE$78);
                    }
                }
            }
        }
        /**
         * An XML database_poolusages(@).
         *
         * This is a complex type.
         */
        public static class DatabasePoolusagesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages
        {
            private static final long serialVersionUID = 1L;
            
            public DatabasePoolusagesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATABASEPOOLUSAGE$0 = 
                new javax.xml.namespace.QName("", "database_poolusage");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "database_poolusage" elements
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage[] getDatabasePoolusageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DATABASEPOOLUSAGE$0, targetList);
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage[] result = new noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "database_poolusage" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage getDatabasePoolusageArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage)get_store().find_element_user(DATABASEPOOLUSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "database_poolusage" element
             */
            public int sizeOfDatabasePoolusageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATABASEPOOLUSAGE$0);
                }
            }
            
            /**
             * Sets array of all "database_poolusage" element
             */
            public void setDatabasePoolusageArray(noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage[] databasePoolusageArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(databasePoolusageArray, DATABASEPOOLUSAGE$0);
                }
            }
            
            /**
             * Sets ith "database_poolusage" element
             */
            public void setDatabasePoolusageArray(int i, noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage databasePoolusage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage)get_store().find_element_user(DATABASEPOOLUSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(databasePoolusage);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "database_poolusage" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage insertNewDatabasePoolusage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage)get_store().insert_element_user(DATABASEPOOLUSAGE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "database_poolusage" element
             */
            public noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage addNewDatabasePoolusage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage target = null;
                    target = (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage)get_store().add_element_user(DATABASEPOOLUSAGE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "database_poolusage" element
             */
            public void removeDatabasePoolusage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATABASEPOOLUSAGE$0, i);
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
             * An XML database_poolusage(@).
             *
             * This is a complex type.
             */
            public static class DatabasePoolusageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage
            {
                private static final long serialVersionUID = 1L;
                
                public DatabasePoolusageImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATABASEPOOLUSAGE$0 = 
                    new javax.xml.namespace.QName("", "database_poolusage");
                private static final javax.xml.namespace.QName DBSOURCEPOOL$2 = 
                    new javax.xml.namespace.QName("", "dbsource_pool");
                private static final javax.xml.namespace.QName DBSOURCESQL$4 = 
                    new javax.xml.namespace.QName("", "dbsource_sql");
                private static final javax.xml.namespace.QName POOLNAME$6 = 
                    new javax.xml.namespace.QName("", "poolname");
                private static final javax.xml.namespace.QName BINDVALUES$8 = 
                    new javax.xml.namespace.QName("", "bindvalues");
                private static final javax.xml.namespace.QName COUNT$10 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName PREPARATIONS$12 = 
                    new javax.xml.namespace.QName("", "preparations");
                private static final javax.xml.namespace.QName EXECAVG$14 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$16 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$18 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$20 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName USEDPOOLSIZEMAX$22 = 
                    new javax.xml.namespace.QName("", "usedpoolsize_max");
                private static final javax.xml.namespace.QName USEDPOOLSIZEMIN$24 = 
                    new javax.xml.namespace.QName("", "usedpoolsize_min");
                private static final javax.xml.namespace.QName POOLWAITMAX$26 = 
                    new javax.xml.namespace.QName("", "poolwait_max");
                private static final javax.xml.namespace.QName POOLWAITAVG$28 = 
                    new javax.xml.namespace.QName("", "poolwait_avg");
                private static final javax.xml.namespace.QName LASTPOOLUSAGE$30 = 
                    new javax.xml.namespace.QName("", "last_pool_usage");
                private static final javax.xml.namespace.QName POOLSIZE$32 = 
                    new javax.xml.namespace.QName("", "poolsize");
                private static final javax.xml.namespace.QName DBTYPE$34 = 
                    new javax.xml.namespace.QName("", "dbtype");
                private static final javax.xml.namespace.QName DBNAME$36 = 
                    new javax.xml.namespace.QName("", "dbname");
                private static final javax.xml.namespace.QName DBHOST$38 = 
                    new javax.xml.namespace.QName("", "dbhost");
                private static final javax.xml.namespace.QName DBUSER$40 = 
                    new javax.xml.namespace.QName("", "dbuser");
                private static final javax.xml.namespace.QName POOLUSER$42 = 
                    new javax.xml.namespace.QName("", "pooluser");
                private static final javax.xml.namespace.QName DBURL$44 = 
                    new javax.xml.namespace.QName("", "dburl");
                private static final javax.xml.namespace.QName AGENT$46 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName POOLWAITSUM$48 = 
                    new javax.xml.namespace.QName("", "poolwait_sum");
                private static final javax.xml.namespace.QName POOLWAITMIN$50 = 
                    new javax.xml.namespace.QName("", "poolwait_min");
                private static final javax.xml.namespace.QName RESPONSETIME$52 = 
                    new javax.xml.namespace.QName("", "response_time");
                private static final javax.xml.namespace.QName RESPONSETIMEPEREXECUTION$54 = 
                    new javax.xml.namespace.QName("", "response_time_per_execution");
                private static final javax.xml.namespace.QName RESPONSETIMEPERTRANSACTION$56 = 
                    new javax.xml.namespace.QName("", "response_time_per_transaction");
                private static final javax.xml.namespace.QName RESPONSETIMEPERPASSINGTRANSACTION$58 = 
                    new javax.xml.namespace.QName("", "response_time_per_passing_transaction");
                private static final javax.xml.namespace.QName EXECUTIONSPERTRANSACTION$60 = 
                    new javax.xml.namespace.QName("", "executions_per_transaction");
                private static final javax.xml.namespace.QName EXECUTIONSPERPASSINGTRANSACTION$62 = 
                    new javax.xml.namespace.QName("", "executions_per_passing_transaction");
                private static final javax.xml.namespace.QName PCTOFTRANSACTIONSCALLING$64 = 
                    new javax.xml.namespace.QName("", "pct_of_transactions_calling");
                private static final javax.xml.namespace.QName POOLWAITTIMEPERTRANSACTION$66 = 
                    new javax.xml.namespace.QName("", "pool_wait_time_per_transaction");
                private static final javax.xml.namespace.QName PLATFORM$68 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName RESPONSETIMECONTRIBUTION$70 = 
                    new javax.xml.namespace.QName("", "response_time_contribution");
                private static final javax.xml.namespace.QName FAILURERATE$72 = 
                    new javax.xml.namespace.QName("", "failure_rate");
                private static final javax.xml.namespace.QName ROWCOUNT$74 = 
                    new javax.xml.namespace.QName("", "rowcount");
                private static final javax.xml.namespace.QName ROUNDTRIPS$76 = 
                    new javax.xml.namespace.QName("", "roundtrips");
                private static final javax.xml.namespace.QName POOLTYPE$78 = 
                    new javax.xml.namespace.QName("", "pooltype");
                
                
                /**
                 * Gets array of all "database_poolusage" elements
                 */
                public noNamespace.DatabasePoolusageDocument.DatabasePoolusage[] getDatabasePoolusageArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DATABASEPOOLUSAGE$0, targetList);
                      noNamespace.DatabasePoolusageDocument.DatabasePoolusage[] result = new noNamespace.DatabasePoolusageDocument.DatabasePoolusage[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "database_poolusage" element
                 */
                public noNamespace.DatabasePoolusageDocument.DatabasePoolusage getDatabasePoolusageArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasePoolusageDocument.DatabasePoolusage target = null;
                      target = (noNamespace.DatabasePoolusageDocument.DatabasePoolusage)get_store().find_element_user(DATABASEPOOLUSAGE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "database_poolusage" element
                 */
                public int sizeOfDatabasePoolusageArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DATABASEPOOLUSAGE$0);
                    }
                }
                
                /**
                 * Sets array of all "database_poolusage" element
                 */
                public void setDatabasePoolusageArray(noNamespace.DatabasePoolusageDocument.DatabasePoolusage[] databasePoolusageArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(databasePoolusageArray, DATABASEPOOLUSAGE$0);
                    }
                }
                
                /**
                 * Sets ith "database_poolusage" element
                 */
                public void setDatabasePoolusageArray(int i, noNamespace.DatabasePoolusageDocument.DatabasePoolusage databasePoolusage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasePoolusageDocument.DatabasePoolusage target = null;
                      target = (noNamespace.DatabasePoolusageDocument.DatabasePoolusage)get_store().find_element_user(DATABASEPOOLUSAGE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(databasePoolusage);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "database_poolusage" element
                 */
                public noNamespace.DatabasePoolusageDocument.DatabasePoolusage insertNewDatabasePoolusage(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasePoolusageDocument.DatabasePoolusage target = null;
                      target = (noNamespace.DatabasePoolusageDocument.DatabasePoolusage)get_store().insert_element_user(DATABASEPOOLUSAGE$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "database_poolusage" element
                 */
                public noNamespace.DatabasePoolusageDocument.DatabasePoolusage addNewDatabasePoolusage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasePoolusageDocument.DatabasePoolusage target = null;
                      target = (noNamespace.DatabasePoolusageDocument.DatabasePoolusage)get_store().add_element_user(DATABASEPOOLUSAGE$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "database_poolusage" element
                 */
                public void removeDatabasePoolusage(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DATABASEPOOLUSAGE$0, i);
                    }
                }
                
                /**
                 * Gets the "dbsource_pool" attribute
                 */
                public java.lang.String getDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbsource_pool" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbsource_pool" attribute
                 */
                public boolean isSetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBSOURCEPOOL$2) != null;
                    }
                }
                
                /**
                 * Sets the "dbsource_pool" attribute
                 */
                public void setDbsourcePool(java.lang.String dbsourcePool)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBSOURCEPOOL$2);
                      }
                      target.setStringValue(dbsourcePool);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbsource_pool" attribute
                 */
                public void xsetDbsourcePool(org.apache.xmlbeans.XmlString dbsourcePool)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCEPOOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBSOURCEPOOL$2);
                      }
                      target.set(dbsourcePool);
                    }
                }
                
                /**
                 * Unsets the "dbsource_pool" attribute
                 */
                public void unsetDbsourcePool()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBSOURCEPOOL$2);
                    }
                }
                
                /**
                 * Gets the "dbsource_sql" attribute
                 */
                public java.lang.String getDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbsource_sql" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCESQL$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbsource_sql" attribute
                 */
                public boolean isSetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBSOURCESQL$4) != null;
                    }
                }
                
                /**
                 * Sets the "dbsource_sql" attribute
                 */
                public void setDbsourceSql(java.lang.String dbsourceSql)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBSOURCESQL$4);
                      }
                      target.setStringValue(dbsourceSql);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbsource_sql" attribute
                 */
                public void xsetDbsourceSql(org.apache.xmlbeans.XmlString dbsourceSql)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBSOURCESQL$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBSOURCESQL$4);
                      }
                      target.set(dbsourceSql);
                    }
                }
                
                /**
                 * Unsets the "dbsource_sql" attribute
                 */
                public void unsetDbsourceSql()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBSOURCESQL$4);
                    }
                }
                
                /**
                 * Gets the "poolname" attribute
                 */
                public java.lang.String getPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLNAME$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolname" attribute
                 */
                public boolean isSetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLNAME$6) != null;
                    }
                }
                
                /**
                 * Sets the "poolname" attribute
                 */
                public void setPoolname(java.lang.String poolname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLNAME$6);
                      }
                      target.setStringValue(poolname);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolname" attribute
                 */
                public void xsetPoolname(org.apache.xmlbeans.XmlString poolname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLNAME$6);
                      }
                      target.set(poolname);
                    }
                }
                
                /**
                 * Unsets the "poolname" attribute
                 */
                public void unsetPoolname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLNAME$6);
                    }
                }
                
                /**
                 * Gets the "bindvalues" attribute
                 */
                public java.lang.String getBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bindvalues" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDVALUES$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "bindvalues" attribute
                 */
                public boolean isSetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BINDVALUES$8) != null;
                    }
                }
                
                /**
                 * Sets the "bindvalues" attribute
                 */
                public void setBindvalues(java.lang.String bindvalues)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BINDVALUES$8);
                      }
                      target.setStringValue(bindvalues);
                    }
                }
                
                /**
                 * Sets (as xml) the "bindvalues" attribute
                 */
                public void xsetBindvalues(org.apache.xmlbeans.XmlString bindvalues)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDVALUES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BINDVALUES$8);
                      }
                      target.set(bindvalues);
                    }
                }
                
                /**
                 * Unsets the "bindvalues" attribute
                 */
                public void unsetBindvalues()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BINDVALUES$8);
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
                 * True if has "count" attribute
                 */
                public boolean isSetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COUNT$10) != null;
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
                
                /**
                 * Unsets the "count" attribute
                 */
                public void unsetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COUNT$10);
                    }
                }
                
                /**
                 * Gets the "preparations" attribute
                 */
                public java.math.BigInteger getPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "preparations" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PREPARATIONS$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "preparations" attribute
                 */
                public boolean isSetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PREPARATIONS$12) != null;
                    }
                }
                
                /**
                 * Sets the "preparations" attribute
                 */
                public void setPreparations(java.math.BigInteger preparations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREPARATIONS$12);
                      }
                      target.setBigIntegerValue(preparations);
                    }
                }
                
                /**
                 * Sets (as xml) the "preparations" attribute
                 */
                public void xsetPreparations(org.apache.xmlbeans.XmlInteger preparations)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PREPARATIONS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PREPARATIONS$12);
                      }
                      target.set(preparations);
                    }
                }
                
                /**
                 * Unsets the "preparations" attribute
                 */
                public void unsetPreparations()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PREPARATIONS$12);
                    }
                }
                
                /**
                 * Gets the "exec_avg" attribute
                 */
                public double getExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_avg" attribute
                 */
                public boolean isSetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECAVG$14) != null;
                    }
                }
                
                /**
                 * Sets the "exec_avg" attribute
                 */
                public void setExecAvg(double execAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$14);
                      }
                      target.setDoubleValue(execAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_avg" attribute
                 */
                public void xsetExecAvg(org.apache.xmlbeans.XmlDouble execAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$14);
                      }
                      target.set(execAvg);
                    }
                }
                
                /**
                 * Unsets the "exec_avg" attribute
                 */
                public void unsetExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECAVG$14);
                    }
                }
                
                /**
                 * Gets the "exec_min" attribute
                 */
                public double getExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_min" attribute
                 */
                public boolean isSetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECMIN$16) != null;
                    }
                }
                
                /**
                 * Sets the "exec_min" attribute
                 */
                public void setExecMin(double execMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$16);
                      }
                      target.setDoubleValue(execMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_min" attribute
                 */
                public void xsetExecMin(org.apache.xmlbeans.XmlDouble execMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$16);
                      }
                      target.set(execMin);
                    }
                }
                
                /**
                 * Unsets the "exec_min" attribute
                 */
                public void unsetExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECMIN$16);
                    }
                }
                
                /**
                 * Gets the "exec_max" attribute
                 */
                public double getExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_max" attribute
                 */
                public boolean isSetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECMAX$18) != null;
                    }
                }
                
                /**
                 * Sets the "exec_max" attribute
                 */
                public void setExecMax(double execMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$18);
                      }
                      target.setDoubleValue(execMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_max" attribute
                 */
                public void xsetExecMax(org.apache.xmlbeans.XmlDouble execMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$18);
                      }
                      target.set(execMax);
                    }
                }
                
                /**
                 * Unsets the "exec_max" attribute
                 */
                public void unsetExecMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECMAX$18);
                    }
                }
                
                /**
                 * Gets the "exec_sum" attribute
                 */
                public double getExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_sum" attribute
                 */
                public boolean isSetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECSUM$20) != null;
                    }
                }
                
                /**
                 * Sets the "exec_sum" attribute
                 */
                public void setExecSum(double execSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$20);
                      }
                      target.setDoubleValue(execSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_sum" attribute
                 */
                public void xsetExecSum(org.apache.xmlbeans.XmlDouble execSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$20);
                      }
                      target.set(execSum);
                    }
                }
                
                /**
                 * Unsets the "exec_sum" attribute
                 */
                public void unsetExecSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECSUM$20);
                    }
                }
                
                /**
                 * Gets the "usedpoolsize_max" attribute
                 */
                public java.lang.String getUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "usedpoolsize_max" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "usedpoolsize_max" attribute
                 */
                public boolean isSetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(USEDPOOLSIZEMAX$22) != null;
                    }
                }
                
                /**
                 * Sets the "usedpoolsize_max" attribute
                 */
                public void setUsedpoolsizeMax(java.lang.String usedpoolsizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDPOOLSIZEMAX$22);
                      }
                      target.setStringValue(usedpoolsizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "usedpoolsize_max" attribute
                 */
                public void xsetUsedpoolsizeMax(org.apache.xmlbeans.XmlString usedpoolsizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEDPOOLSIZEMAX$22);
                      }
                      target.set(usedpoolsizeMax);
                    }
                }
                
                /**
                 * Unsets the "usedpoolsize_max" attribute
                 */
                public void unsetUsedpoolsizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(USEDPOOLSIZEMAX$22);
                    }
                }
                
                /**
                 * Gets the "usedpoolsize_min" attribute
                 */
                public java.lang.String getUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "usedpoolsize_min" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "usedpoolsize_min" attribute
                 */
                public boolean isSetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(USEDPOOLSIZEMIN$24) != null;
                    }
                }
                
                /**
                 * Sets the "usedpoolsize_min" attribute
                 */
                public void setUsedpoolsizeMin(java.lang.String usedpoolsizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDPOOLSIZEMIN$24);
                      }
                      target.setStringValue(usedpoolsizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "usedpoolsize_min" attribute
                 */
                public void xsetUsedpoolsizeMin(org.apache.xmlbeans.XmlString usedpoolsizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDPOOLSIZEMIN$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEDPOOLSIZEMIN$24);
                      }
                      target.set(usedpoolsizeMin);
                    }
                }
                
                /**
                 * Unsets the "usedpoolsize_min" attribute
                 */
                public void unsetUsedpoolsizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(USEDPOOLSIZEMIN$24);
                    }
                }
                
                /**
                 * Gets the "poolwait_max" attribute
                 */
                public double getPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMAX$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_max" attribute
                 */
                public boolean isSetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITMAX$26) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_max" attribute
                 */
                public void setPoolwaitMax(double poolwaitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITMAX$26);
                      }
                      target.setDoubleValue(poolwaitMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_max" attribute
                 */
                public void xsetPoolwaitMax(org.apache.xmlbeans.XmlDouble poolwaitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMAX$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITMAX$26);
                      }
                      target.set(poolwaitMax);
                    }
                }
                
                /**
                 * Unsets the "poolwait_max" attribute
                 */
                public void unsetPoolwaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITMAX$26);
                    }
                }
                
                /**
                 * Gets the "poolwait_avg" attribute
                 */
                public double getPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITAVG$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_avg" attribute
                 */
                public boolean isSetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITAVG$28) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_avg" attribute
                 */
                public void setPoolwaitAvg(double poolwaitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITAVG$28);
                      }
                      target.setDoubleValue(poolwaitAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_avg" attribute
                 */
                public void xsetPoolwaitAvg(org.apache.xmlbeans.XmlDouble poolwaitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITAVG$28);
                      }
                      target.set(poolwaitAvg);
                    }
                }
                
                /**
                 * Unsets the "poolwait_avg" attribute
                 */
                public void unsetPoolwaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITAVG$28);
                    }
                }
                
                /**
                 * Gets the "last_pool_usage" attribute
                 */
                public java.lang.String getLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "last_pool_usage" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "last_pool_usage" attribute
                 */
                public boolean isSetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LASTPOOLUSAGE$30) != null;
                    }
                }
                
                /**
                 * Sets the "last_pool_usage" attribute
                 */
                public void setLastPoolUsage(java.lang.String lastPoolUsage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTPOOLUSAGE$30);
                      }
                      target.setStringValue(lastPoolUsage);
                    }
                }
                
                /**
                 * Sets (as xml) the "last_pool_usage" attribute
                 */
                public void xsetLastPoolUsage(org.apache.xmlbeans.XmlString lastPoolUsage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTPOOLUSAGE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTPOOLUSAGE$30);
                      }
                      target.set(lastPoolUsage);
                    }
                }
                
                /**
                 * Unsets the "last_pool_usage" attribute
                 */
                public void unsetLastPoolUsage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LASTPOOLUSAGE$30);
                    }
                }
                
                /**
                 * Gets the "poolsize" attribute
                 */
                public java.math.BigInteger getPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolsize" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POOLSIZE$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolsize" attribute
                 */
                public boolean isSetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLSIZE$32) != null;
                    }
                }
                
                /**
                 * Sets the "poolsize" attribute
                 */
                public void setPoolsize(java.math.BigInteger poolsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLSIZE$32);
                      }
                      target.setBigIntegerValue(poolsize);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolsize" attribute
                 */
                public void xsetPoolsize(org.apache.xmlbeans.XmlInteger poolsize)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(POOLSIZE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(POOLSIZE$32);
                      }
                      target.set(poolsize);
                    }
                }
                
                /**
                 * Unsets the "poolsize" attribute
                 */
                public void unsetPoolsize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLSIZE$32);
                    }
                }
                
                /**
                 * Gets the "dbtype" attribute
                 */
                public java.lang.String getDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbtype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBTYPE$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbtype" attribute
                 */
                public boolean isSetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBTYPE$34) != null;
                    }
                }
                
                /**
                 * Sets the "dbtype" attribute
                 */
                public void setDbtype(java.lang.String dbtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBTYPE$34);
                      }
                      target.setStringValue(dbtype);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbtype" attribute
                 */
                public void xsetDbtype(org.apache.xmlbeans.XmlString dbtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBTYPE$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBTYPE$34);
                      }
                      target.set(dbtype);
                    }
                }
                
                /**
                 * Unsets the "dbtype" attribute
                 */
                public void unsetDbtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBTYPE$34);
                    }
                }
                
                /**
                 * Gets the "dbname" attribute
                 */
                public java.lang.String getDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBNAME$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbname" attribute
                 */
                public boolean isSetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBNAME$36) != null;
                    }
                }
                
                /**
                 * Sets the "dbname" attribute
                 */
                public void setDbname(java.lang.String dbname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBNAME$36);
                      }
                      target.setStringValue(dbname);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbname" attribute
                 */
                public void xsetDbname(org.apache.xmlbeans.XmlString dbname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBNAME$36);
                      }
                      target.set(dbname);
                    }
                }
                
                /**
                 * Unsets the "dbname" attribute
                 */
                public void unsetDbname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBNAME$36);
                    }
                }
                
                /**
                 * Gets the "dbhost" attribute
                 */
                public java.lang.String getDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbhost" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBHOST$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbhost" attribute
                 */
                public boolean isSetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBHOST$38) != null;
                    }
                }
                
                /**
                 * Sets the "dbhost" attribute
                 */
                public void setDbhost(java.lang.String dbhost)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBHOST$38);
                      }
                      target.setStringValue(dbhost);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbhost" attribute
                 */
                public void xsetDbhost(org.apache.xmlbeans.XmlString dbhost)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBHOST$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBHOST$38);
                      }
                      target.set(dbhost);
                    }
                }
                
                /**
                 * Unsets the "dbhost" attribute
                 */
                public void unsetDbhost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBHOST$38);
                    }
                }
                
                /**
                 * Gets the "dbuser" attribute
                 */
                public java.lang.String getDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dbuser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBUSER$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "dbuser" attribute
                 */
                public boolean isSetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBUSER$40) != null;
                    }
                }
                
                /**
                 * Sets the "dbuser" attribute
                 */
                public void setDbuser(java.lang.String dbuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBUSER$40);
                      }
                      target.setStringValue(dbuser);
                    }
                }
                
                /**
                 * Sets (as xml) the "dbuser" attribute
                 */
                public void xsetDbuser(org.apache.xmlbeans.XmlString dbuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBUSER$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBUSER$40);
                      }
                      target.set(dbuser);
                    }
                }
                
                /**
                 * Unsets the "dbuser" attribute
                 */
                public void unsetDbuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBUSER$40);
                    }
                }
                
                /**
                 * Gets the "pooluser" attribute
                 */
                public java.lang.String getPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pooluser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLUSER$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "pooluser" attribute
                 */
                public boolean isSetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLUSER$42) != null;
                    }
                }
                
                /**
                 * Sets the "pooluser" attribute
                 */
                public void setPooluser(java.lang.String pooluser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLUSER$42);
                      }
                      target.setStringValue(pooluser);
                    }
                }
                
                /**
                 * Sets (as xml) the "pooluser" attribute
                 */
                public void xsetPooluser(org.apache.xmlbeans.XmlString pooluser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLUSER$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLUSER$42);
                      }
                      target.set(pooluser);
                    }
                }
                
                /**
                 * Unsets the "pooluser" attribute
                 */
                public void unsetPooluser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLUSER$42);
                    }
                }
                
                /**
                 * Gets the "dburl" attribute
                 */
                public java.lang.String getDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "dburl" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBURL$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "dburl" attribute
                 */
                public boolean isSetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBURL$44) != null;
                    }
                }
                
                /**
                 * Sets the "dburl" attribute
                 */
                public void setDburl(java.lang.String dburl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBURL$44);
                      }
                      target.setStringValue(dburl);
                    }
                }
                
                /**
                 * Sets (as xml) the "dburl" attribute
                 */
                public void xsetDburl(org.apache.xmlbeans.XmlString dburl)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DBURL$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DBURL$44);
                      }
                      target.set(dburl);
                    }
                }
                
                /**
                 * Unsets the "dburl" attribute
                 */
                public void unsetDburl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBURL$44);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$46);
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
                      return get_store().find_attribute_user(AGENT$46) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$46);
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
                      get_store().remove_attribute(AGENT$46);
                    }
                }
                
                /**
                 * Gets the "poolwait_sum" attribute
                 */
                public double getPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITSUM$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_sum" attribute
                 */
                public boolean isSetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITSUM$48) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_sum" attribute
                 */
                public void setPoolwaitSum(double poolwaitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITSUM$48);
                      }
                      target.setDoubleValue(poolwaitSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_sum" attribute
                 */
                public void xsetPoolwaitSum(org.apache.xmlbeans.XmlDouble poolwaitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITSUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITSUM$48);
                      }
                      target.set(poolwaitSum);
                    }
                }
                
                /**
                 * Unsets the "poolwait_sum" attribute
                 */
                public void unsetPoolwaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITSUM$48);
                    }
                }
                
                /**
                 * Gets the "poolwait_min" attribute
                 */
                public double getPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "poolwait_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMIN$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "poolwait_min" attribute
                 */
                public boolean isSetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITMIN$50) != null;
                    }
                }
                
                /**
                 * Sets the "poolwait_min" attribute
                 */
                public void setPoolwaitMin(double poolwaitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITMIN$50);
                      }
                      target.setDoubleValue(poolwaitMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "poolwait_min" attribute
                 */
                public void xsetPoolwaitMin(org.apache.xmlbeans.XmlDouble poolwaitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITMIN$50);
                      }
                      target.set(poolwaitMin);
                    }
                }
                
                /**
                 * Unsets the "poolwait_min" attribute
                 */
                public void unsetPoolwaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITMIN$50);
                    }
                }
                
                /**
                 * Gets the "response_time" attribute
                 */
                public double getResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time" attribute
                 */
                public boolean isSetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIME$52) != null;
                    }
                }
                
                /**
                 * Sets the "response_time" attribute
                 */
                public void setResponseTime(double responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIME$52);
                      }
                      target.setDoubleValue(responseTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                public void xsetResponseTime(org.apache.xmlbeans.XmlDouble responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIME$52);
                      }
                      target.set(responseTime);
                    }
                }
                
                /**
                 * Unsets the "response_time" attribute
                 */
                public void unsetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIME$52);
                    }
                }
                
                /**
                 * Gets the "response_time_per_execution" attribute
                 */
                public double getResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_execution" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_execution" attribute
                 */
                public boolean isSetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_execution" attribute
                 */
                public void setResponseTimePerExecution(double responseTimePerExecution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      }
                      target.setDoubleValue(responseTimePerExecution);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_execution" attribute
                 */
                public void xsetResponseTimePerExecution(org.apache.xmlbeans.XmlDouble responseTimePerExecution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPEREXECUTION$54);
                      }
                      target.set(responseTimePerExecution);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_execution" attribute
                 */
                public void unsetResponseTimePerExecution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPEREXECUTION$54);
                    }
                }
                
                /**
                 * Gets the "response_time_per_transaction" attribute
                 */
                public double getResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_transaction" attribute
                 */
                public boolean isSetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_transaction" attribute
                 */
                public void setResponseTimePerTransaction(double responseTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      }
                      target.setDoubleValue(responseTimePerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_transaction" attribute
                 */
                public void xsetResponseTimePerTransaction(org.apache.xmlbeans.XmlDouble responseTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPERTRANSACTION$56);
                      }
                      target.set(responseTimePerTransaction);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_transaction" attribute
                 */
                public void unsetResponseTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPERTRANSACTION$56);
                    }
                }
                
                /**
                 * Gets the "response_time_per_passing_transaction" attribute
                 */
                public double getResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_per_passing_transaction" attribute
                 */
                public boolean isSetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_per_passing_transaction" attribute
                 */
                public void setResponseTimePerPassingTransaction(double responseTimePerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      }
                      target.setDoubleValue(responseTimePerPassingTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                public void xsetResponseTimePerPassingTransaction(org.apache.xmlbeans.XmlDouble responseTimePerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEPERPASSINGTRANSACTION$58);
                      }
                      target.set(responseTimePerPassingTransaction);
                    }
                }
                
                /**
                 * Unsets the "response_time_per_passing_transaction" attribute
                 */
                public void unsetResponseTimePerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMEPERPASSINGTRANSACTION$58);
                    }
                }
                
                /**
                 * Gets the "executions_per_transaction" attribute
                 */
                public double getExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "executions_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "executions_per_transaction" attribute
                 */
                public boolean isSetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60) != null;
                    }
                }
                
                /**
                 * Sets the "executions_per_transaction" attribute
                 */
                public void setExecutionsPerTransaction(double executionsPerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      }
                      target.setDoubleValue(executionsPerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "executions_per_transaction" attribute
                 */
                public void xsetExecutionsPerTransaction(org.apache.xmlbeans.XmlDouble executionsPerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECUTIONSPERTRANSACTION$60);
                      }
                      target.set(executionsPerTransaction);
                    }
                }
                
                /**
                 * Unsets the "executions_per_transaction" attribute
                 */
                public void unsetExecutionsPerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECUTIONSPERTRANSACTION$60);
                    }
                }
                
                /**
                 * Gets the "executions_per_passing_transaction" attribute
                 */
                public double getExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "executions_per_passing_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "executions_per_passing_transaction" attribute
                 */
                public boolean isSetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62) != null;
                    }
                }
                
                /**
                 * Sets the "executions_per_passing_transaction" attribute
                 */
                public void setExecutionsPerPassingTransaction(double executionsPerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      }
                      target.setDoubleValue(executionsPerPassingTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "executions_per_passing_transaction" attribute
                 */
                public void xsetExecutionsPerPassingTransaction(org.apache.xmlbeans.XmlDouble executionsPerPassingTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECUTIONSPERPASSINGTRANSACTION$62);
                      }
                      target.set(executionsPerPassingTransaction);
                    }
                }
                
                /**
                 * Unsets the "executions_per_passing_transaction" attribute
                 */
                public void unsetExecutionsPerPassingTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECUTIONSPERPASSINGTRANSACTION$62);
                    }
                }
                
                /**
                 * Gets the "pct_of_transactions_calling" attribute
                 */
                public java.lang.String getPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pct_of_transactions_calling" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "pct_of_transactions_calling" attribute
                 */
                public boolean isSetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64) != null;
                    }
                }
                
                /**
                 * Sets the "pct_of_transactions_calling" attribute
                 */
                public void setPctOfTransactionsCalling(java.lang.String pctOfTransactionsCalling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      }
                      target.setStringValue(pctOfTransactionsCalling);
                    }
                }
                
                /**
                 * Sets (as xml) the "pct_of_transactions_calling" attribute
                 */
                public void xsetPctOfTransactionsCalling(org.apache.xmlbeans.XmlString pctOfTransactionsCalling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PCTOFTRANSACTIONSCALLING$64);
                      }
                      target.set(pctOfTransactionsCalling);
                    }
                }
                
                /**
                 * Unsets the "pct_of_transactions_calling" attribute
                 */
                public void unsetPctOfTransactionsCalling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PCTOFTRANSACTIONSCALLING$64);
                    }
                }
                
                /**
                 * Gets the "pool_wait_time_per_transaction" attribute
                 */
                public double getPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      return target;
                    }
                }
                
                /**
                 * True if has "pool_wait_time_per_transaction" attribute
                 */
                public boolean isSetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66) != null;
                    }
                }
                
                /**
                 * Sets the "pool_wait_time_per_transaction" attribute
                 */
                public void setPoolWaitTimePerTransaction(double poolWaitTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      }
                      target.setDoubleValue(poolWaitTimePerTransaction);
                    }
                }
                
                /**
                 * Sets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                public void xsetPoolWaitTimePerTransaction(org.apache.xmlbeans.XmlDouble poolWaitTimePerTransaction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POOLWAITTIMEPERTRANSACTION$66);
                      }
                      target.set(poolWaitTimePerTransaction);
                    }
                }
                
                /**
                 * Unsets the "pool_wait_time_per_transaction" attribute
                 */
                public void unsetPoolWaitTimePerTransaction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLWAITTIMEPERTRANSACTION$66);
                    }
                }
                
                /**
                 * Gets the "platform" attribute
                 */
                public java.lang.String getPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "platform" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$68);
                      return target;
                    }
                }
                
                /**
                 * True if has "platform" attribute
                 */
                public boolean isSetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PLATFORM$68) != null;
                    }
                }
                
                /**
                 * Sets the "platform" attribute
                 */
                public void setPlatform(java.lang.String platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$68);
                      }
                      target.setStringValue(platform);
                    }
                }
                
                /**
                 * Sets (as xml) the "platform" attribute
                 */
                public void xsetPlatform(org.apache.xmlbeans.XmlString platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORM$68);
                      }
                      target.set(platform);
                    }
                }
                
                /**
                 * Unsets the "platform" attribute
                 */
                public void unsetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PLATFORM$68);
                    }
                }
                
                /**
                 * Gets the "response_time_contribution" attribute
                 */
                public java.lang.String getResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time_contribution" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_time_contribution" attribute
                 */
                public boolean isSetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70) != null;
                    }
                }
                
                /**
                 * Sets the "response_time_contribution" attribute
                 */
                public void setResponseTimeContribution(java.lang.String responseTimeContribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      }
                      target.setStringValue(responseTimeContribution);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time_contribution" attribute
                 */
                public void xsetResponseTimeContribution(org.apache.xmlbeans.XmlString responseTimeContribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESPONSETIMECONTRIBUTION$70);
                      }
                      target.set(responseTimeContribution);
                    }
                }
                
                /**
                 * Unsets the "response_time_contribution" attribute
                 */
                public void unsetResponseTimeContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSETIMECONTRIBUTION$70);
                    }
                }
                
                /**
                 * Gets the "failure_rate" attribute
                 */
                public java.lang.String getFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "failure_rate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$72);
                      return target;
                    }
                }
                
                /**
                 * True if has "failure_rate" attribute
                 */
                public boolean isSetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(FAILURERATE$72) != null;
                    }
                }
                
                /**
                 * Sets the "failure_rate" attribute
                 */
                public void setFailureRate(java.lang.String failureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$72);
                      }
                      target.setStringValue(failureRate);
                    }
                }
                
                /**
                 * Sets (as xml) the "failure_rate" attribute
                 */
                public void xsetFailureRate(org.apache.xmlbeans.XmlString failureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$72);
                      }
                      target.set(failureRate);
                    }
                }
                
                /**
                 * Unsets the "failure_rate" attribute
                 */
                public void unsetFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(FAILURERATE$72);
                    }
                }
                
                /**
                 * Gets the "rowcount" attribute
                 */
                public java.math.BigInteger getRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rowcount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWCOUNT$74);
                      return target;
                    }
                }
                
                /**
                 * True if has "rowcount" attribute
                 */
                public boolean isSetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROWCOUNT$74) != null;
                    }
                }
                
                /**
                 * Sets the "rowcount" attribute
                 */
                public void setRowcount(java.math.BigInteger rowcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWCOUNT$74);
                      }
                      target.setBigIntegerValue(rowcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "rowcount" attribute
                 */
                public void xsetRowcount(org.apache.xmlbeans.XmlInteger rowcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROWCOUNT$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROWCOUNT$74);
                      }
                      target.set(rowcount);
                    }
                }
                
                /**
                 * Unsets the "rowcount" attribute
                 */
                public void unsetRowcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROWCOUNT$74);
                    }
                }
                
                /**
                 * Gets the "roundtrips" attribute
                 */
                public java.math.BigInteger getRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "roundtrips" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROUNDTRIPS$76);
                      return target;
                    }
                }
                
                /**
                 * True if has "roundtrips" attribute
                 */
                public boolean isSetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROUNDTRIPS$76) != null;
                    }
                }
                
                /**
                 * Sets the "roundtrips" attribute
                 */
                public void setRoundtrips(java.math.BigInteger roundtrips)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROUNDTRIPS$76);
                      }
                      target.setBigIntegerValue(roundtrips);
                    }
                }
                
                /**
                 * Sets (as xml) the "roundtrips" attribute
                 */
                public void xsetRoundtrips(org.apache.xmlbeans.XmlInteger roundtrips)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ROUNDTRIPS$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ROUNDTRIPS$76);
                      }
                      target.set(roundtrips);
                    }
                }
                
                /**
                 * Unsets the "roundtrips" attribute
                 */
                public void unsetRoundtrips()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROUNDTRIPS$76);
                    }
                }
                
                /**
                 * Gets the "pooltype" attribute
                 */
                public java.lang.String getPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pooltype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$78);
                      return target;
                    }
                }
                
                /**
                 * True if has "pooltype" attribute
                 */
                public boolean isSetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POOLTYPE$78) != null;
                    }
                }
                
                /**
                 * Sets the "pooltype" attribute
                 */
                public void setPooltype(java.lang.String pooltype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLTYPE$78);
                      }
                      target.setStringValue(pooltype);
                    }
                }
                
                /**
                 * Sets (as xml) the "pooltype" attribute
                 */
                public void xsetPooltype(org.apache.xmlbeans.XmlString pooltype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLTYPE$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLTYPE$78);
                      }
                      target.set(pooltype);
                    }
                }
                
                /**
                 * Unsets the "pooltype" attribute
                 */
                public void unsetPooltype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POOLTYPE$78);
                    }
                }
            }
        }
    }
}
