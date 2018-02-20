/*
 * An XML document type.
 * Localname: memoryallocationsdashlet
 * Namespace: 
 * Java type: noNamespace.MemoryallocationsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one memoryallocationsdashlet(@) element.
 *
 * This is a complex type.
 */
public class MemoryallocationsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MemoryallocationsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemoryallocationsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMORYALLOCATIONSDASHLET$0 = 
        new javax.xml.namespace.QName("", "memoryallocationsdashlet");
    
    
    /**
     * Gets the "memoryallocationsdashlet" element
     */
    public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet getMemoryallocationsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet target = null;
            target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().find_element_user(MEMORYALLOCATIONSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "memoryallocationsdashlet" element
     */
    public void setMemoryallocationsdashlet(noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet memoryallocationsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet target = null;
            target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().find_element_user(MEMORYALLOCATIONSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().add_element_user(MEMORYALLOCATIONSDASHLET$0);
            }
            target.set(memoryallocationsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "memoryallocationsdashlet" element
     */
    public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet addNewMemoryallocationsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet target = null;
            target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().add_element_user(MEMORYALLOCATIONSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML memoryallocationsdashlet(@).
     *
     * This is a complex type.
     */
    public static class MemoryallocationsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public MemoryallocationsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName ALLOCATIONS$4 = 
            new javax.xml.namespace.QName("", "allocations");
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
         * Gets the "allocations" element
         */
        public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations getAllocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations target = null;
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations)get_store().find_element_user(ALLOCATIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "allocations" element
         */
        public boolean isSetAllocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLOCATIONS$4) != 0;
            }
        }
        
        /**
         * Sets the "allocations" element
         */
        public void setAllocations(noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations allocations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations target = null;
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations)get_store().find_element_user(ALLOCATIONS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations)get_store().add_element_user(ALLOCATIONS$4);
                }
                target.set(allocations);
            }
        }
        
        /**
         * Appends and returns a new empty "allocations" element
         */
        public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations addNewAllocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations target = null;
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations)get_store().add_element_user(ALLOCATIONS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "allocations" element
         */
        public void unsetAllocations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLOCATIONS$4, 0);
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
         * An XML allocations(@).
         *
         * This is a complex type.
         */
        public static class AllocationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations
        {
            private static final long serialVersionUID = 1L;
            
            public AllocationsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ALLOCATION$0 = 
                new javax.xml.namespace.QName("", "allocation");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "allocation" elements
             */
            public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation[] getAllocationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ALLOCATION$0, targetList);
                    noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation[] result = new noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "allocation" element
             */
            public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation getAllocationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation target = null;
                    target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation)get_store().find_element_user(ALLOCATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "allocation" element
             */
            public int sizeOfAllocationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ALLOCATION$0);
                }
            }
            
            /**
             * Sets array of all "allocation" element
             */
            public void setAllocationArray(noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation[] allocationArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(allocationArray, ALLOCATION$0);
                }
            }
            
            /**
             * Sets ith "allocation" element
             */
            public void setAllocationArray(int i, noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation allocation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation target = null;
                    target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation)get_store().find_element_user(ALLOCATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(allocation);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "allocation" element
             */
            public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation insertNewAllocation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation target = null;
                    target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation)get_store().insert_element_user(ALLOCATION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "allocation" element
             */
            public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation addNewAllocation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation target = null;
                    target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation)get_store().add_element_user(ALLOCATION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "allocation" element
             */
            public void removeAllocation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ALLOCATION$0, i);
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
             * An XML allocation(@).
             *
             * This is a complex type.
             */
            public static class AllocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation
            {
                private static final long serialVersionUID = 1L;
                
                public AllocationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName TYPE$2 = 
                    new javax.xml.namespace.QName("", "type");
                private static final javax.xml.namespace.QName CLASSNAME$4 = 
                    new javax.xml.namespace.QName("", "class_name");
                private static final javax.xml.namespace.QName NUMBEROFINSTANCES$6 = 
                    new javax.xml.namespace.QName("", "number_of_instances");
                private static final javax.xml.namespace.QName ALLOCATIONCLASSNAME$8 = 
                    new javax.xml.namespace.QName("", "allocation_class_name");
                private static final javax.xml.namespace.QName ALLOCATIONMETHODNAME$10 = 
                    new javax.xml.namespace.QName("", "allocation_method_name");
                private static final javax.xml.namespace.QName FILENAME$12 = 
                    new javax.xml.namespace.QName("", "file_name");
                private static final javax.xml.namespace.QName LINENUMBER$14 = 
                    new javax.xml.namespace.QName("", "line_number");
                private static final javax.xml.namespace.QName AGENTNAME$16 = 
                    new javax.xml.namespace.QName("", "agent_name");
                
                
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
                 * Gets the "type" attribute
                 */
                public java.lang.String getType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
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
                      return get_store().find_attribute_user(TYPE$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
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
                      get_store().remove_attribute(TYPE$2);
                    }
                }
                
                /**
                 * Gets the "class_name" attribute
                 */
                public java.lang.String getClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "class_name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "class_name" attribute
                 */
                public boolean isSetClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLASSNAME$4) != null;
                    }
                }
                
                /**
                 * Sets the "class_name" attribute
                 */
                public void setClassName(java.lang.String className)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$4);
                      }
                      target.setStringValue(className);
                    }
                }
                
                /**
                 * Sets (as xml) the "class_name" attribute
                 */
                public void xsetClassName(org.apache.xmlbeans.XmlString className)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSNAME$4);
                      }
                      target.set(className);
                    }
                }
                
                /**
                 * Unsets the "class_name" attribute
                 */
                public void unsetClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLASSNAME$4);
                    }
                }
                
                /**
                 * Gets the "number_of_instances" attribute
                 */
                public java.math.BigInteger getNumberOfInstances()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFINSTANCES$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "number_of_instances" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetNumberOfInstances()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMBEROFINSTANCES$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "number_of_instances" attribute
                 */
                public boolean isSetNumberOfInstances()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NUMBEROFINSTANCES$6) != null;
                    }
                }
                
                /**
                 * Sets the "number_of_instances" attribute
                 */
                public void setNumberOfInstances(java.math.BigInteger numberOfInstances)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFINSTANCES$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBEROFINSTANCES$6);
                      }
                      target.setBigIntegerValue(numberOfInstances);
                    }
                }
                
                /**
                 * Sets (as xml) the "number_of_instances" attribute
                 */
                public void xsetNumberOfInstances(org.apache.xmlbeans.XmlInteger numberOfInstances)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMBEROFINSTANCES$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMBEROFINSTANCES$6);
                      }
                      target.set(numberOfInstances);
                    }
                }
                
                /**
                 * Unsets the "number_of_instances" attribute
                 */
                public void unsetNumberOfInstances()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NUMBEROFINSTANCES$6);
                    }
                }
                
                /**
                 * Gets the "allocation_class_name" attribute
                 */
                public java.lang.String getAllocationClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOCATIONCLASSNAME$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "allocation_class_name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAllocationClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALLOCATIONCLASSNAME$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "allocation_class_name" attribute
                 */
                public boolean isSetAllocationClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ALLOCATIONCLASSNAME$8) != null;
                    }
                }
                
                /**
                 * Sets the "allocation_class_name" attribute
                 */
                public void setAllocationClassName(java.lang.String allocationClassName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOCATIONCLASSNAME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOCATIONCLASSNAME$8);
                      }
                      target.setStringValue(allocationClassName);
                    }
                }
                
                /**
                 * Sets (as xml) the "allocation_class_name" attribute
                 */
                public void xsetAllocationClassName(org.apache.xmlbeans.XmlString allocationClassName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALLOCATIONCLASSNAME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALLOCATIONCLASSNAME$8);
                      }
                      target.set(allocationClassName);
                    }
                }
                
                /**
                 * Unsets the "allocation_class_name" attribute
                 */
                public void unsetAllocationClassName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ALLOCATIONCLASSNAME$8);
                    }
                }
                
                /**
                 * Gets the "allocation_method_name" attribute
                 */
                public java.lang.String getAllocationMethodName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOCATIONMETHODNAME$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "allocation_method_name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAllocationMethodName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALLOCATIONMETHODNAME$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "allocation_method_name" attribute
                 */
                public boolean isSetAllocationMethodName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ALLOCATIONMETHODNAME$10) != null;
                    }
                }
                
                /**
                 * Sets the "allocation_method_name" attribute
                 */
                public void setAllocationMethodName(java.lang.String allocationMethodName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOCATIONMETHODNAME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOCATIONMETHODNAME$10);
                      }
                      target.setStringValue(allocationMethodName);
                    }
                }
                
                /**
                 * Sets (as xml) the "allocation_method_name" attribute
                 */
                public void xsetAllocationMethodName(org.apache.xmlbeans.XmlString allocationMethodName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALLOCATIONMETHODNAME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALLOCATIONMETHODNAME$10);
                      }
                      target.set(allocationMethodName);
                    }
                }
                
                /**
                 * Unsets the "allocation_method_name" attribute
                 */
                public void unsetAllocationMethodName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ALLOCATIONMETHODNAME$10);
                    }
                }
                
                /**
                 * Gets the "file_name" attribute
                 */
                public java.lang.String getFileName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "file_name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFileName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "file_name" attribute
                 */
                public boolean isSetFileName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(FILENAME$12) != null;
                    }
                }
                
                /**
                 * Sets the "file_name" attribute
                 */
                public void setFileName(java.lang.String fileName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILENAME$12);
                      }
                      target.setStringValue(fileName);
                    }
                }
                
                /**
                 * Sets (as xml) the "file_name" attribute
                 */
                public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILENAME$12);
                      }
                      target.set(fileName);
                    }
                }
                
                /**
                 * Unsets the "file_name" attribute
                 */
                public void unsetFileName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(FILENAME$12);
                    }
                }
                
                /**
                 * Gets the "line_number" attribute
                 */
                public java.math.BigInteger getLineNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINENUMBER$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "line_number" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetLineNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LINENUMBER$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "line_number" attribute
                 */
                public boolean isSetLineNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LINENUMBER$14) != null;
                    }
                }
                
                /**
                 * Sets the "line_number" attribute
                 */
                public void setLineNumber(java.math.BigInteger lineNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINENUMBER$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINENUMBER$14);
                      }
                      target.setBigIntegerValue(lineNumber);
                    }
                }
                
                /**
                 * Sets (as xml) the "line_number" attribute
                 */
                public void xsetLineNumber(org.apache.xmlbeans.XmlInteger lineNumber)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LINENUMBER$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LINENUMBER$14);
                      }
                      target.set(lineNumber);
                    }
                }
                
                /**
                 * Unsets the "line_number" attribute
                 */
                public void unsetLineNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LINENUMBER$14);
                    }
                }
                
                /**
                 * Gets the "agent_name" attribute
                 */
                public java.lang.String getAgentName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTNAME$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "agent_name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAgentName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTNAME$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "agent_name" attribute
                 */
                public boolean isSetAgentName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AGENTNAME$16) != null;
                    }
                }
                
                /**
                 * Sets the "agent_name" attribute
                 */
                public void setAgentName(java.lang.String agentName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTNAME$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTNAME$16);
                      }
                      target.setStringValue(agentName);
                    }
                }
                
                /**
                 * Sets (as xml) the "agent_name" attribute
                 */
                public void xsetAgentName(org.apache.xmlbeans.XmlString agentName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTNAME$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTNAME$16);
                      }
                      target.set(agentName);
                    }
                }
                
                /**
                 * Unsets the "agent_name" attribute
                 */
                public void unsetAgentName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AGENTNAME$16);
                    }
                }
            }
        }
    }
}
