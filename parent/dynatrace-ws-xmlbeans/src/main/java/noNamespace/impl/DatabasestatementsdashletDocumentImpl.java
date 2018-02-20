/*
 * An XML document type.
 * Localname: databasestatementsdashlet
 * Namespace: 
 * Java type: noNamespace.DatabasestatementsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one databasestatementsdashlet(@) element.
 *
 * This is a complex type.
 */
public class DatabasestatementsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasestatementsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatabasestatementsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATABASESTATEMENTSDASHLET$0 = 
        new javax.xml.namespace.QName("", "databasestatementsdashlet");
    
    
    /**
     * Gets the "databasestatementsdashlet" element
     */
    public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet getDatabasestatementsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet target = null;
            target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().find_element_user(DATABASESTATEMENTSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "databasestatementsdashlet" element
     */
    public void setDatabasestatementsdashlet(noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet databasestatementsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet target = null;
            target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().find_element_user(DATABASESTATEMENTSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().add_element_user(DATABASESTATEMENTSDASHLET$0);
            }
            target.set(databasestatementsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "databasestatementsdashlet" element
     */
    public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet addNewDatabasestatementsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet target = null;
            target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().add_element_user(DATABASESTATEMENTSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML databasestatementsdashlet(@).
     *
     * This is a complex type.
     */
    public static class DatabasestatementsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public DatabasestatementsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName DATABASEHOTSPOTS$4 = 
            new javax.xml.namespace.QName("", "databasehotspots");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName DISPLAYSOURCE$10 = 
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
         * Gets the "databasehotspots" element
         */
        public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots getDatabasehotspots()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots target = null;
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots)get_store().find_element_user(DATABASEHOTSPOTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "databasehotspots" element
         */
        public boolean isSetDatabasehotspots()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASEHOTSPOTS$4) != 0;
            }
        }
        
        /**
         * Sets the "databasehotspots" element
         */
        public void setDatabasehotspots(noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots databasehotspots)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots target = null;
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots)get_store().find_element_user(DATABASEHOTSPOTS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots)get_store().add_element_user(DATABASEHOTSPOTS$4);
                }
                target.set(databasehotspots);
            }
        }
        
        /**
         * Appends and returns a new empty "databasehotspots" element
         */
        public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots addNewDatabasehotspots()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots target = null;
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots)get_store().add_element_user(DATABASEHOTSPOTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "databasehotspots" element
         */
        public void unsetDatabasehotspots()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASEHOTSPOTS$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
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
                return get_store().find_attribute_user(DESCRIPTION$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$8);
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
                get_store().remove_attribute(DESCRIPTION$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYSOURCE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYSOURCE$10);
                }
                target.set(displaysource);
            }
        }
        /**
         * An XML databasehotspots(@).
         *
         * This is a complex type.
         */
        public static class DatabasehotspotsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots
        {
            private static final long serialVersionUID = 1L;
            
            public DatabasehotspotsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATABASEHOTSPOT$0 = 
                new javax.xml.namespace.QName("", "databasehotspot");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "databasehotspot" elements
             */
            public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot[] getDatabasehotspotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DATABASEHOTSPOT$0, targetList);
                    noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot[] result = new noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "databasehotspot" element
             */
            public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot getDatabasehotspotArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot target = null;
                    target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot)get_store().find_element_user(DATABASEHOTSPOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "databasehotspot" element
             */
            public int sizeOfDatabasehotspotArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATABASEHOTSPOT$0);
                }
            }
            
            /**
             * Sets array of all "databasehotspot" element
             */
            public void setDatabasehotspotArray(noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot[] databasehotspotArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(databasehotspotArray, DATABASEHOTSPOT$0);
                }
            }
            
            /**
             * Sets ith "databasehotspot" element
             */
            public void setDatabasehotspotArray(int i, noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot databasehotspot)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot target = null;
                    target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot)get_store().find_element_user(DATABASEHOTSPOT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(databasehotspot);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "databasehotspot" element
             */
            public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot insertNewDatabasehotspot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot target = null;
                    target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot)get_store().insert_element_user(DATABASEHOTSPOT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "databasehotspot" element
             */
            public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot addNewDatabasehotspot()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot target = null;
                    target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot)get_store().add_element_user(DATABASEHOTSPOT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "databasehotspot" element
             */
            public void removeDatabasehotspot(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATABASEHOTSPOT$0, i);
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
             * An XML databasehotspot(@).
             *
             * This is a complex type.
             */
            public static class DatabasehotspotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet.Databasehotspots.Databasehotspot
            {
                private static final long serialVersionUID = 1L;
                
                public DatabasehotspotImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATABASEHOTSPOT$0 = 
                    new javax.xml.namespace.QName("", "databasehotspot");
                private static final javax.xml.namespace.QName METHODNAME$2 = 
                    new javax.xml.namespace.QName("", "methodname");
                private static final javax.xml.namespace.QName CONTRIBUTION$4 = 
                    new javax.xml.namespace.QName("", "contribution");
                private static final javax.xml.namespace.QName AGGREGATEDCOUNT$6 = 
                    new javax.xml.namespace.QName("", "aggregatedcount");
                private static final javax.xml.namespace.QName AVGEXECTIME$8 = 
                    new javax.xml.namespace.QName("", "avgexectime");
                private static final javax.xml.namespace.QName MINEXECTIME$10 = 
                    new javax.xml.namespace.QName("", "minexectime");
                private static final javax.xml.namespace.QName MAXEXECTIME$12 = 
                    new javax.xml.namespace.QName("", "maxexectime");
                private static final javax.xml.namespace.QName EXECTIME$14 = 
                    new javax.xml.namespace.QName("", "exectime");
                
                
                /**
                 * Gets array of all "databasehotspot" elements
                 */
                public noNamespace.DatabasehotspotDocument.Databasehotspot[] getDatabasehotspotArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DATABASEHOTSPOT$0, targetList);
                      noNamespace.DatabasehotspotDocument.Databasehotspot[] result = new noNamespace.DatabasehotspotDocument.Databasehotspot[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "databasehotspot" element
                 */
                public noNamespace.DatabasehotspotDocument.Databasehotspot getDatabasehotspotArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasehotspotDocument.Databasehotspot target = null;
                      target = (noNamespace.DatabasehotspotDocument.Databasehotspot)get_store().find_element_user(DATABASEHOTSPOT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "databasehotspot" element
                 */
                public int sizeOfDatabasehotspotArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DATABASEHOTSPOT$0);
                    }
                }
                
                /**
                 * Sets array of all "databasehotspot" element
                 */
                public void setDatabasehotspotArray(noNamespace.DatabasehotspotDocument.Databasehotspot[] databasehotspotArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(databasehotspotArray, DATABASEHOTSPOT$0);
                    }
                }
                
                /**
                 * Sets ith "databasehotspot" element
                 */
                public void setDatabasehotspotArray(int i, noNamespace.DatabasehotspotDocument.Databasehotspot databasehotspot)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasehotspotDocument.Databasehotspot target = null;
                      target = (noNamespace.DatabasehotspotDocument.Databasehotspot)get_store().find_element_user(DATABASEHOTSPOT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(databasehotspot);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "databasehotspot" element
                 */
                public noNamespace.DatabasehotspotDocument.Databasehotspot insertNewDatabasehotspot(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasehotspotDocument.Databasehotspot target = null;
                      target = (noNamespace.DatabasehotspotDocument.Databasehotspot)get_store().insert_element_user(DATABASEHOTSPOT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "databasehotspot" element
                 */
                public noNamespace.DatabasehotspotDocument.Databasehotspot addNewDatabasehotspot()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DatabasehotspotDocument.Databasehotspot target = null;
                      target = (noNamespace.DatabasehotspotDocument.Databasehotspot)get_store().add_element_user(DATABASEHOTSPOT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "databasehotspot" element
                 */
                public void removeDatabasehotspot(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DATABASEHOTSPOT$0, i);
                    }
                }
                
                /**
                 * Gets the "methodname" attribute
                 */
                public java.lang.String getMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "methodname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "methodname" attribute
                 */
                public boolean isSetMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(METHODNAME$2) != null;
                    }
                }
                
                /**
                 * Sets the "methodname" attribute
                 */
                public void setMethodname(java.lang.String methodname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHODNAME$2);
                      }
                      target.setStringValue(methodname);
                    }
                }
                
                /**
                 * Sets (as xml) the "methodname" attribute
                 */
                public void xsetMethodname(org.apache.xmlbeans.XmlString methodname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHODNAME$2);
                      }
                      target.set(methodname);
                    }
                }
                
                /**
                 * Unsets the "methodname" attribute
                 */
                public void unsetMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(METHODNAME$2);
                    }
                }
                
                /**
                 * Gets the "contribution" attribute
                 */
                public java.lang.String getContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTRIBUTION$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "contribution" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTRIBUTION$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "contribution" attribute
                 */
                public boolean isSetContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CONTRIBUTION$4) != null;
                    }
                }
                
                /**
                 * Sets the "contribution" attribute
                 */
                public void setContribution(java.lang.String contribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTRIBUTION$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTRIBUTION$4);
                      }
                      target.setStringValue(contribution);
                    }
                }
                
                /**
                 * Sets (as xml) the "contribution" attribute
                 */
                public void xsetContribution(org.apache.xmlbeans.XmlString contribution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTRIBUTION$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTRIBUTION$4);
                      }
                      target.set(contribution);
                    }
                }
                
                /**
                 * Unsets the "contribution" attribute
                 */
                public void unsetContribution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CONTRIBUTION$4);
                    }
                }
                
                /**
                 * Gets the "aggregatedcount" attribute
                 */
                public java.math.BigInteger getAggregatedcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATEDCOUNT$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "aggregatedcount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetAggregatedcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AGGREGATEDCOUNT$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "aggregatedcount" attribute
                 */
                public boolean isSetAggregatedcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AGGREGATEDCOUNT$6) != null;
                    }
                }
                
                /**
                 * Sets the "aggregatedcount" attribute
                 */
                public void setAggregatedcount(java.math.BigInteger aggregatedcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATEDCOUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATEDCOUNT$6);
                      }
                      target.setBigIntegerValue(aggregatedcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "aggregatedcount" attribute
                 */
                public void xsetAggregatedcount(org.apache.xmlbeans.XmlInteger aggregatedcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AGGREGATEDCOUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(AGGREGATEDCOUNT$6);
                      }
                      target.set(aggregatedcount);
                    }
                }
                
                /**
                 * Unsets the "aggregatedcount" attribute
                 */
                public void unsetAggregatedcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AGGREGATEDCOUNT$6);
                    }
                }
                
                /**
                 * Gets the "avgexectime" attribute
                 */
                public double getAvgexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVGEXECTIME$8);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "avgexectime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetAvgexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVGEXECTIME$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "avgexectime" attribute
                 */
                public boolean isSetAvgexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AVGEXECTIME$8) != null;
                    }
                }
                
                /**
                 * Sets the "avgexectime" attribute
                 */
                public void setAvgexectime(double avgexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVGEXECTIME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVGEXECTIME$8);
                      }
                      target.setDoubleValue(avgexectime);
                    }
                }
                
                /**
                 * Sets (as xml) the "avgexectime" attribute
                 */
                public void xsetAvgexectime(org.apache.xmlbeans.XmlDouble avgexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVGEXECTIME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AVGEXECTIME$8);
                      }
                      target.set(avgexectime);
                    }
                }
                
                /**
                 * Unsets the "avgexectime" attribute
                 */
                public void unsetAvgexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AVGEXECTIME$8);
                    }
                }
                
                /**
                 * Gets the "minexectime" attribute
                 */
                public double getMinexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINEXECTIME$10);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "minexectime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetMinexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MINEXECTIME$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "minexectime" attribute
                 */
                public boolean isSetMinexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MINEXECTIME$10) != null;
                    }
                }
                
                /**
                 * Sets the "minexectime" attribute
                 */
                public void setMinexectime(double minexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINEXECTIME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINEXECTIME$10);
                      }
                      target.setDoubleValue(minexectime);
                    }
                }
                
                /**
                 * Sets (as xml) the "minexectime" attribute
                 */
                public void xsetMinexectime(org.apache.xmlbeans.XmlDouble minexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MINEXECTIME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MINEXECTIME$10);
                      }
                      target.set(minexectime);
                    }
                }
                
                /**
                 * Unsets the "minexectime" attribute
                 */
                public void unsetMinexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MINEXECTIME$10);
                    }
                }
                
                /**
                 * Gets the "maxexectime" attribute
                 */
                public double getMaxexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXEXECTIME$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "maxexectime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetMaxexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAXEXECTIME$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "maxexectime" attribute
                 */
                public boolean isSetMaxexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MAXEXECTIME$12) != null;
                    }
                }
                
                /**
                 * Sets the "maxexectime" attribute
                 */
                public void setMaxexectime(double maxexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXEXECTIME$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXEXECTIME$12);
                      }
                      target.setDoubleValue(maxexectime);
                    }
                }
                
                /**
                 * Sets (as xml) the "maxexectime" attribute
                 */
                public void xsetMaxexectime(org.apache.xmlbeans.XmlDouble maxexectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAXEXECTIME$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAXEXECTIME$12);
                      }
                      target.set(maxexectime);
                    }
                }
                
                /**
                 * Unsets the "maxexectime" attribute
                 */
                public void unsetMaxexectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MAXEXECTIME$12);
                    }
                }
                
                /**
                 * Gets the "exectime" attribute
                 */
                public double getExectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIME$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exectime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIME$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "exectime" attribute
                 */
                public boolean isSetExectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECTIME$14) != null;
                    }
                }
                
                /**
                 * Sets the "exectime" attribute
                 */
                public void setExectime(double exectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIME$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIME$14);
                      }
                      target.setDoubleValue(exectime);
                    }
                }
                
                /**
                 * Sets (as xml) the "exectime" attribute
                 */
                public void xsetExectime(org.apache.xmlbeans.XmlDouble exectime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIME$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIME$14);
                      }
                      target.set(exectime);
                    }
                }
                
                /**
                 * Unsets the "exectime" attribute
                 */
                public void unsetExectime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECTIME$14);
                    }
                }
            }
        }
    }
}
