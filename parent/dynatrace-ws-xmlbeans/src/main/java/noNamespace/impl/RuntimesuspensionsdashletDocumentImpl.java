/*
 * An XML document type.
 * Localname: runtimesuspensionsdashlet
 * Namespace: 
 * Java type: noNamespace.RuntimesuspensionsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one runtimesuspensionsdashlet(@) element.
 *
 * This is a complex type.
 */
public class RuntimesuspensionsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RuntimesuspensionsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public RuntimesuspensionsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNTIMESUSPENSIONSDASHLET$0 = 
        new javax.xml.namespace.QName("", "runtimesuspensionsdashlet");
    
    
    /**
     * Gets the "runtimesuspensionsdashlet" element
     */
    public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet getRuntimesuspensionsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet target = null;
            target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().find_element_user(RUNTIMESUSPENSIONSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "runtimesuspensionsdashlet" element
     */
    public void setRuntimesuspensionsdashlet(noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet runtimesuspensionsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet target = null;
            target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().find_element_user(RUNTIMESUSPENSIONSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().add_element_user(RUNTIMESUSPENSIONSDASHLET$0);
            }
            target.set(runtimesuspensionsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "runtimesuspensionsdashlet" element
     */
    public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet addNewRuntimesuspensionsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet target = null;
            target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().add_element_user(RUNTIMESUSPENSIONSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML runtimesuspensionsdashlet(@).
     *
     * This is a complex type.
     */
    public static class RuntimesuspensionsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public RuntimesuspensionsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName SUSPENSIONS$4 = 
            new javax.xml.namespace.QName("", "suspensions");
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
         * Gets the "suspensions" element
         */
        public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions getSuspensions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions target = null;
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions)get_store().find_element_user(SUSPENSIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "suspensions" element
         */
        public boolean isSetSuspensions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUSPENSIONS$4) != 0;
            }
        }
        
        /**
         * Sets the "suspensions" element
         */
        public void setSuspensions(noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions suspensions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions target = null;
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions)get_store().find_element_user(SUSPENSIONS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions)get_store().add_element_user(SUSPENSIONS$4);
                }
                target.set(suspensions);
            }
        }
        
        /**
         * Appends and returns a new empty "suspensions" element
         */
        public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions addNewSuspensions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions target = null;
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions)get_store().add_element_user(SUSPENSIONS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "suspensions" element
         */
        public void unsetSuspensions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUSPENSIONS$4, 0);
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
         * An XML suspensions(@).
         *
         * This is a complex type.
         */
        public static class SuspensionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions
        {
            private static final long serialVersionUID = 1L;
            
            public SuspensionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SUSPENSION$0 = 
                new javax.xml.namespace.QName("", "suspension");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "suspension" elements
             */
            public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension[] getSuspensionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SUSPENSION$0, targetList);
                    noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension[] result = new noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "suspension" element
             */
            public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension getSuspensionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension target = null;
                    target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension)get_store().find_element_user(SUSPENSION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "suspension" element
             */
            public int sizeOfSuspensionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUSPENSION$0);
                }
            }
            
            /**
             * Sets array of all "suspension" element
             */
            public void setSuspensionArray(noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension[] suspensionArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(suspensionArray, SUSPENSION$0);
                }
            }
            
            /**
             * Sets ith "suspension" element
             */
            public void setSuspensionArray(int i, noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension suspension)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension target = null;
                    target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension)get_store().find_element_user(SUSPENSION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(suspension);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "suspension" element
             */
            public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension insertNewSuspension(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension target = null;
                    target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension)get_store().insert_element_user(SUSPENSION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "suspension" element
             */
            public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension addNewSuspension()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension target = null;
                    target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension)get_store().add_element_user(SUSPENSION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "suspension" element
             */
            public void removeSuspension(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUSPENSION$0, i);
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
             * An XML suspension(@).
             *
             * This is a complex type.
             */
            public static class SuspensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension
            {
                private static final long serialVersionUID = 1L;
                
                public SuspensionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName METHOD$2 = 
                    new javax.xml.namespace.QName("", "method");
                private static final javax.xml.namespace.QName CLASS1$4 = 
                    new javax.xml.namespace.QName("", "class");
                private static final javax.xml.namespace.QName COUNT$6 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName TIMESUM$8 = 
                    new javax.xml.namespace.QName("", "time_sum");
                private static final javax.xml.namespace.QName TIMEAVG$10 = 
                    new javax.xml.namespace.QName("", "time_avg");
                private static final javax.xml.namespace.QName TIMEMAX$12 = 
                    new javax.xml.namespace.QName("", "time_max");
                private static final javax.xml.namespace.QName TIMEMIN$14 = 
                    new javax.xml.namespace.QName("", "time_min");
                private static final javax.xml.namespace.QName REASON$16 = 
                    new javax.xml.namespace.QName("", "reason");
                
                
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
                 * Gets the "method" attribute
                 */
                public java.lang.String getMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$2);
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
                      return get_store().find_attribute_user(METHOD$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$2);
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
                      get_store().remove_attribute(METHOD$2);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
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
                      return get_store().find_attribute_user(CLASS1$4) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$4);
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
                      get_store().remove_attribute(CLASS1$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$6);
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
                      return get_store().find_attribute_user(COUNT$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$6);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$6);
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
                      get_store().remove_attribute(COUNT$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESUM$8);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMESUM$8);
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
                      return get_store().find_attribute_user(TIMESUM$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESUM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESUM$8);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMESUM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TIMESUM$8);
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
                      get_store().remove_attribute(TIMESUM$8);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEAVG$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEAVG$10);
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
                      return get_store().find_attribute_user(TIMEAVG$10) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEAVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEAVG$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEAVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TIMEAVG$10);
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
                      get_store().remove_attribute(TIMEAVG$10);
                    }
                }
                
                /**
                 * Gets the "time_max" attribute
                 */
                public double getTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEMAX$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEMAX$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "time_max" attribute
                 */
                public boolean isSetTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TIMEMAX$12) != null;
                    }
                }
                
                /**
                 * Sets the "time_max" attribute
                 */
                public void setTimeMax(double timeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEMAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEMAX$12);
                      }
                      target.setDoubleValue(timeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "time_max" attribute
                 */
                public void xsetTimeMax(org.apache.xmlbeans.XmlDouble timeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEMAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TIMEMAX$12);
                      }
                      target.set(timeMax);
                    }
                }
                
                /**
                 * Unsets the "time_max" attribute
                 */
                public void unsetTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TIMEMAX$12);
                    }
                }
                
                /**
                 * Gets the "time_min" attribute
                 */
                public double getTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEMIN$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEMIN$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "time_min" attribute
                 */
                public boolean isSetTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TIMEMIN$14) != null;
                    }
                }
                
                /**
                 * Sets the "time_min" attribute
                 */
                public void setTimeMin(double timeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEMIN$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEMIN$14);
                      }
                      target.setDoubleValue(timeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "time_min" attribute
                 */
                public void xsetTimeMin(org.apache.xmlbeans.XmlDouble timeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TIMEMIN$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TIMEMIN$14);
                      }
                      target.set(timeMin);
                    }
                }
                
                /**
                 * Unsets the "time_min" attribute
                 */
                public void unsetTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TIMEMIN$14);
                    }
                }
                
                /**
                 * Gets the "reason" attribute
                 */
                public java.lang.String getReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REASON$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "reason" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REASON$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "reason" attribute
                 */
                public boolean isSetReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REASON$16) != null;
                    }
                }
                
                /**
                 * Sets the "reason" attribute
                 */
                public void setReason(java.lang.String reason)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REASON$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REASON$16);
                      }
                      target.setStringValue(reason);
                    }
                }
                
                /**
                 * Sets (as xml) the "reason" attribute
                 */
                public void xsetReason(org.apache.xmlbeans.XmlString reason)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REASON$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REASON$16);
                      }
                      target.set(reason);
                    }
                }
                
                /**
                 * Unsets the "reason" attribute
                 */
                public void unsetReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REASON$16);
                    }
                }
            }
        }
    }
}
