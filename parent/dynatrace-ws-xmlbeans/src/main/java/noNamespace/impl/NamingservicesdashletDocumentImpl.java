/*
 * An XML document type.
 * Localname: namingservicesdashlet
 * Namespace: 
 * Java type: noNamespace.NamingservicesdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one namingservicesdashlet(@) element.
 *
 * This is a complex type.
 */
public class NamingservicesdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NamingservicesdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public NamingservicesdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMINGSERVICESDASHLET$0 = 
        new javax.xml.namespace.QName("", "namingservicesdashlet");
    
    
    /**
     * Gets the "namingservicesdashlet" element
     */
    public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet getNamingservicesdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NamingservicesdashletDocument.Namingservicesdashlet target = null;
            target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().find_element_user(NAMINGSERVICESDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "namingservicesdashlet" element
     */
    public void setNamingservicesdashlet(noNamespace.NamingservicesdashletDocument.Namingservicesdashlet namingservicesdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NamingservicesdashletDocument.Namingservicesdashlet target = null;
            target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().find_element_user(NAMINGSERVICESDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().add_element_user(NAMINGSERVICESDASHLET$0);
            }
            target.set(namingservicesdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "namingservicesdashlet" element
     */
    public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet addNewNamingservicesdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NamingservicesdashletDocument.Namingservicesdashlet target = null;
            target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().add_element_user(NAMINGSERVICESDASHLET$0);
            return target;
        }
    }
    /**
     * An XML namingservicesdashlet(@).
     *
     * This is a complex type.
     */
    public static class NamingservicesdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NamingservicesdashletDocument.Namingservicesdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public NamingservicesdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName LOOKUPS$4 = 
            new javax.xml.namespace.QName("", "lookups");
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
         * Gets the "lookups" element
         */
        public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups getLookups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups target = null;
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups)get_store().find_element_user(LOOKUPS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "lookups" element
         */
        public boolean isSetLookups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOOKUPS$4) != 0;
            }
        }
        
        /**
         * Sets the "lookups" element
         */
        public void setLookups(noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups lookups)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups target = null;
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups)get_store().find_element_user(LOOKUPS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups)get_store().add_element_user(LOOKUPS$4);
                }
                target.set(lookups);
            }
        }
        
        /**
         * Appends and returns a new empty "lookups" element
         */
        public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups addNewLookups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups target = null;
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups)get_store().add_element_user(LOOKUPS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "lookups" element
         */
        public void unsetLookups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOOKUPS$4, 0);
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
         * An XML lookups(@).
         *
         * This is a complex type.
         */
        public static class LookupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups
        {
            private static final long serialVersionUID = 1L;
            
            public LookupsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LOOKUP$0 = 
                new javax.xml.namespace.QName("", "lookup");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "lookup" elements
             */
            public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup[] getLookupArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(LOOKUP$0, targetList);
                    noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup[] result = new noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "lookup" element
             */
            public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup getLookupArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup target = null;
                    target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup)get_store().find_element_user(LOOKUP$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "lookup" element
             */
            public int sizeOfLookupArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LOOKUP$0);
                }
            }
            
            /**
             * Sets array of all "lookup" element
             */
            public void setLookupArray(noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup[] lookupArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(lookupArray, LOOKUP$0);
                }
            }
            
            /**
             * Sets ith "lookup" element
             */
            public void setLookupArray(int i, noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup lookup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup target = null;
                    target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup)get_store().find_element_user(LOOKUP$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(lookup);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "lookup" element
             */
            public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup insertNewLookup(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup target = null;
                    target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup)get_store().insert_element_user(LOOKUP$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "lookup" element
             */
            public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup addNewLookup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup target = null;
                    target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup)get_store().add_element_user(LOOKUP$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "lookup" element
             */
            public void removeLookup(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LOOKUP$0, i);
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
             * An XML lookup(@).
             *
             * This is a complex type.
             */
            public static class LookupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup
            {
                private static final long serialVersionUID = 1L;
                
                public LookupImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName METHOD$4 = 
                    new javax.xml.namespace.QName("", "method");
                private static final javax.xml.namespace.QName CLASS1$6 = 
                    new javax.xml.namespace.QName("", "class");
                private static final javax.xml.namespace.QName AGENT$8 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName COUNT$10 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName TIMEAVG$12 = 
                    new javax.xml.namespace.QName("", "time_avg");
                private static final javax.xml.namespace.QName TIMESUM$14 = 
                    new javax.xml.namespace.QName("", "time_sum");
                private static final javax.xml.namespace.QName CPUAVG$16 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUSUM$18 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                private static final javax.xml.namespace.QName EXECAVG$20 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECSUM$22 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName EXECCPUAVG$24 = 
                    new javax.xml.namespace.QName("", "exec_cpu_avg");
                private static final javax.xml.namespace.QName EXECCPUSUM$26 = 
                    new javax.xml.namespace.QName("", "exec_cpu_sum");
                
                
                /**
                 * Gets the "platform" attribute
                 */
                public java.lang.String getPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$0);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$0);
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
                      return get_store().find_attribute_user(PLATFORM$0) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$0);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORM$0);
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
                      get_store().remove_attribute(PLATFORM$0);
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
                 * Gets the "method" attribute
                 */
                public java.lang.String getMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "method" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "method" attribute
                 */
                public boolean isSetMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(METHOD$4) != null;
                    }
                }
                
                /**
                 * Sets the "method" attribute
                 */
                public void setMethod(java.lang.String method)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$4);
                      }
                      target.setStringValue(method);
                    }
                }
                
                /**
                 * Sets (as xml) the "method" attribute
                 */
                public void xsetMethod(org.apache.xmlbeans.XmlString method)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$4);
                      }
                      target.set(method);
                    }
                }
                
                /**
                 * Unsets the "method" attribute
                 */
                public void unsetMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(METHOD$4);
                    }
                }
                
                /**
                 * Gets the "class" attribute
                 */
                public java.lang.String getClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "class" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "class" attribute
                 */
                public boolean isSetClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLASS1$6) != null;
                    }
                }
                
                /**
                 * Sets the "class" attribute
                 */
                public void setClass1(java.lang.String class1)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$6);
                      }
                      target.setStringValue(class1);
                    }
                }
                
                /**
                 * Sets (as xml) the "class" attribute
                 */
                public void xsetClass1(org.apache.xmlbeans.XmlString class1)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$6);
                      }
                      target.set(class1);
                    }
                }
                
                /**
                 * Unsets the "class" attribute
                 */
                public void unsetClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLASS1$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$8);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$8);
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
                      return get_store().find_attribute_user(AGENT$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$8);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$8);
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
                      get_store().remove_attribute(AGENT$8);
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
                 * Gets the "time_avg" attribute
                 */
                public double getTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEAVG$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEAVG$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "time_avg" attribute
                 */
                public boolean isSetTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TIMEAVG$12) != null;
                    }
                }
                
                /**
                 * Sets the "time_avg" attribute
                 */
                public void setTimeAvg(double timeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEAVG$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEAVG$12);
                      }
                      target.setDoubleValue(timeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "time_avg" attribute
                 */
                public void xsetTimeAvg(org.apache.xmlbeans.XmlDouble timeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEAVG$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TIMEAVG$12);
                      }
                      target.set(timeAvg);
                    }
                }
                
                /**
                 * Unsets the "time_avg" attribute
                 */
                public void unsetTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TIMEAVG$12);
                    }
                }
                
                /**
                 * Gets the "time_sum" attribute
                 */
                public double getTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESUM$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMESUM$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "time_sum" attribute
                 */
                public boolean isSetTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TIMESUM$14) != null;
                    }
                }
                
                /**
                 * Sets the "time_sum" attribute
                 */
                public void setTimeSum(double timeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESUM$14);
                      }
                      target.setDoubleValue(timeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "time_sum" attribute
                 */
                public void xsetTimeSum(org.apache.xmlbeans.XmlDouble timeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMESUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TIMESUM$14);
                      }
                      target.set(timeSum);
                    }
                }
                
                /**
                 * Unsets the "time_sum" attribute
                 */
                public void unsetTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TIMESUM$14);
                    }
                }
                
                /**
                 * Gets the "cpu_avg" attribute
                 */
                public double getCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_avg" attribute
                 */
                public boolean isSetCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUAVG$16) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_avg" attribute
                 */
                public void setCpuAvg(double cpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$16);
                      }
                      target.setDoubleValue(cpuAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_avg" attribute
                 */
                public void xsetCpuAvg(org.apache.xmlbeans.XmlDouble cpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$16);
                      }
                      target.set(cpuAvg);
                    }
                }
                
                /**
                 * Unsets the "cpu_avg" attribute
                 */
                public void unsetCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUAVG$16);
                    }
                }
                
                /**
                 * Gets the "cpu_sum" attribute
                 */
                public double getCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_sum" attribute
                 */
                public boolean isSetCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUSUM$18) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_sum" attribute
                 */
                public void setCpuSum(double cpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$18);
                      }
                      target.setDoubleValue(cpuSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_sum" attribute
                 */
                public void xsetCpuSum(org.apache.xmlbeans.XmlDouble cpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$18);
                      }
                      target.set(cpuSum);
                    }
                }
                
                /**
                 * Unsets the "cpu_sum" attribute
                 */
                public void unsetCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUSUM$18);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$20);
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
                      return get_store().find_attribute_user(EXECAVG$20) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$20);
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
                      get_store().remove_attribute(EXECAVG$20);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$22);
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
                      return get_store().find_attribute_user(EXECSUM$22) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$22);
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
                      get_store().remove_attribute(EXECSUM$22);
                    }
                }
                
                /**
                 * Gets the "exec_cpu_avg" attribute
                 */
                public double getExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUAVG$24);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_cpu_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUAVG$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_cpu_avg" attribute
                 */
                public boolean isSetExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECCPUAVG$24) != null;
                    }
                }
                
                /**
                 * Sets the "exec_cpu_avg" attribute
                 */
                public void setExecCpuAvg(double execCpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECCPUAVG$24);
                      }
                      target.setDoubleValue(execCpuAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_cpu_avg" attribute
                 */
                public void xsetExecCpuAvg(org.apache.xmlbeans.XmlDouble execCpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECCPUAVG$24);
                      }
                      target.set(execCpuAvg);
                    }
                }
                
                /**
                 * Unsets the "exec_cpu_avg" attribute
                 */
                public void unsetExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECCPUAVG$24);
                    }
                }
                
                /**
                 * Gets the "exec_cpu_sum" attribute
                 */
                public double getExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUSUM$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_cpu_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUSUM$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_cpu_sum" attribute
                 */
                public boolean isSetExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECCPUSUM$26) != null;
                    }
                }
                
                /**
                 * Sets the "exec_cpu_sum" attribute
                 */
                public void setExecCpuSum(double execCpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUSUM$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECCPUSUM$26);
                      }
                      target.setDoubleValue(execCpuSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_cpu_sum" attribute
                 */
                public void xsetExecCpuSum(org.apache.xmlbeans.XmlDouble execCpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUSUM$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECCPUSUM$26);
                      }
                      target.set(execCpuSum);
                    }
                }
                
                /**
                 * Unsets the "exec_cpu_sum" attribute
                 */
                public void unsetExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECCPUSUM$26);
                    }
                }
            }
        }
    }
}
