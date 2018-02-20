/*
 * An XML document type.
 * Localname: entrypointsdashlet
 * Namespace: 
 * Java type: noNamespace.EntrypointsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one entrypointsdashlet(@) element.
 *
 * This is a complex type.
 */
public class EntrypointsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EntrypointsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntrypointsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRYPOINTSDASHLET$0 = 
        new javax.xml.namespace.QName("", "entrypointsdashlet");
    
    
    /**
     * Gets the "entrypointsdashlet" element
     */
    public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet getEntrypointsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntrypointsdashletDocument.Entrypointsdashlet target = null;
            target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().find_element_user(ENTRYPOINTSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entrypointsdashlet" element
     */
    public void setEntrypointsdashlet(noNamespace.EntrypointsdashletDocument.Entrypointsdashlet entrypointsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntrypointsdashletDocument.Entrypointsdashlet target = null;
            target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().find_element_user(ENTRYPOINTSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().add_element_user(ENTRYPOINTSDASHLET$0);
            }
            target.set(entrypointsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "entrypointsdashlet" element
     */
    public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet addNewEntrypointsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EntrypointsdashletDocument.Entrypointsdashlet target = null;
            target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().add_element_user(ENTRYPOINTSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML entrypointsdashlet(@).
     *
     * This is a complex type.
     */
    public static class EntrypointsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EntrypointsdashletDocument.Entrypointsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public EntrypointsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName ENTRYPOINTS$4 = 
            new javax.xml.namespace.QName("", "entrypoints");
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
         * Gets the "entrypoints" element
         */
        public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints getEntrypoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints target = null;
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints)get_store().find_element_user(ENTRYPOINTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "entrypoints" element
         */
        public boolean isSetEntrypoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTRYPOINTS$4) != 0;
            }
        }
        
        /**
         * Sets the "entrypoints" element
         */
        public void setEntrypoints(noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints entrypoints)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints target = null;
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints)get_store().find_element_user(ENTRYPOINTS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints)get_store().add_element_user(ENTRYPOINTS$4);
                }
                target.set(entrypoints);
            }
        }
        
        /**
         * Appends and returns a new empty "entrypoints" element
         */
        public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints addNewEntrypoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints target = null;
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints)get_store().add_element_user(ENTRYPOINTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "entrypoints" element
         */
        public void unsetEntrypoints()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTRYPOINTS$4, 0);
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
         * An XML entrypoints(@).
         *
         * This is a complex type.
         */
        public static class EntrypointsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints
        {
            private static final long serialVersionUID = 1L;
            
            public EntrypointsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ENTRYPOINT$0 = 
                new javax.xml.namespace.QName("", "entrypoint");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "entrypoint" elements
             */
            public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint[] getEntrypointArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ENTRYPOINT$0, targetList);
                    noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint[] result = new noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "entrypoint" element
             */
            public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint getEntrypointArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint target = null;
                    target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint)get_store().find_element_user(ENTRYPOINT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "entrypoint" element
             */
            public int sizeOfEntrypointArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ENTRYPOINT$0);
                }
            }
            
            /**
             * Sets array of all "entrypoint" element
             */
            public void setEntrypointArray(noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint[] entrypointArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(entrypointArray, ENTRYPOINT$0);
                }
            }
            
            /**
             * Sets ith "entrypoint" element
             */
            public void setEntrypointArray(int i, noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint entrypoint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint target = null;
                    target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint)get_store().find_element_user(ENTRYPOINT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(entrypoint);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "entrypoint" element
             */
            public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint insertNewEntrypoint(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint target = null;
                    target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint)get_store().insert_element_user(ENTRYPOINT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "entrypoint" element
             */
            public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint addNewEntrypoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint target = null;
                    target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint)get_store().add_element_user(ENTRYPOINT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "entrypoint" element
             */
            public void removeEntrypoint(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ENTRYPOINT$0, i);
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
             * An XML entrypoint(@).
             *
             * This is a complex type.
             */
            public static class EntrypointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EntrypointsdashletDocument.Entrypointsdashlet.Entrypoints.Entrypoint
            {
                private static final long serialVersionUID = 1L;
                
                public EntrypointImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName POINT$0 = 
                    new javax.xml.namespace.QName("", "point");
                private static final javax.xml.namespace.QName METHOD$2 = 
                    new javax.xml.namespace.QName("", "method");
                private static final javax.xml.namespace.QName CLASS1$4 = 
                    new javax.xml.namespace.QName("", "class");
                private static final javax.xml.namespace.QName AGENT$6 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName API$8 = 
                    new javax.xml.namespace.QName("", "api");
                private static final javax.xml.namespace.QName COUNT$10 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName EXECAVG$12 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$14 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$16 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$18 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName CPUAVG$20 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUMIN$22 = 
                    new javax.xml.namespace.QName("", "cpu_min");
                private static final javax.xml.namespace.QName CPUMAX$24 = 
                    new javax.xml.namespace.QName("", "cpu_max");
                private static final javax.xml.namespace.QName CPUSUM$26 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                private static final javax.xml.namespace.QName SYNCAVG$28 = 
                    new javax.xml.namespace.QName("", "sync_avg");
                private static final javax.xml.namespace.QName SYNCMIN$30 = 
                    new javax.xml.namespace.QName("", "sync_min");
                private static final javax.xml.namespace.QName SYNCMAX$32 = 
                    new javax.xml.namespace.QName("", "sync_max");
                private static final javax.xml.namespace.QName SYNCSUM$34 = 
                    new javax.xml.namespace.QName("", "sync_sum");
                private static final javax.xml.namespace.QName WAITAVG$36 = 
                    new javax.xml.namespace.QName("", "wait_avg");
                private static final javax.xml.namespace.QName WAITMIN$38 = 
                    new javax.xml.namespace.QName("", "wait_min");
                private static final javax.xml.namespace.QName WAITMAX$40 = 
                    new javax.xml.namespace.QName("", "wait_max");
                private static final javax.xml.namespace.QName WAITSUM$42 = 
                    new javax.xml.namespace.QName("", "wait_sum");
                private static final javax.xml.namespace.QName ERRORSTATE$44 = 
                    new javax.xml.namespace.QName("", "error_state");
                private static final javax.xml.namespace.QName FAILURERATE$46 = 
                    new javax.xml.namespace.QName("", "failure_rate");
                
                
                /**
                 * Gets the "point" attribute
                 */
                public java.lang.String getPoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINT$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "point" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POINT$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "point" attribute
                 */
                public boolean isSetPoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(POINT$0) != null;
                    }
                }
                
                /**
                 * Sets the "point" attribute
                 */
                public void setPoint(java.lang.String point)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POINT$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POINT$0);
                      }
                      target.setStringValue(point);
                    }
                }
                
                /**
                 * Sets (as xml) the "point" attribute
                 */
                public void xsetPoint(org.apache.xmlbeans.XmlString point)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POINT$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POINT$0);
                      }
                      target.set(point);
                    }
                }
                
                /**
                 * Unsets the "point" attribute
                 */
                public void unsetPoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(POINT$0);
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
                 * Gets the "agent" attribute
                 */
                public java.lang.String getAgent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$6);
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
                      return get_store().find_attribute_user(AGENT$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$6);
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
                      get_store().remove_attribute(AGENT$6);
                    }
                }
                
                /**
                 * Gets the "api" attribute
                 */
                public java.lang.String getApi()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(API$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "api" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetApi()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(API$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "api" attribute
                 */
                public boolean isSetApi()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(API$8) != null;
                    }
                }
                
                /**
                 * Sets the "api" attribute
                 */
                public void setApi(java.lang.String api)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(API$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(API$8);
                      }
                      target.setStringValue(api);
                    }
                }
                
                /**
                 * Sets (as xml) the "api" attribute
                 */
                public void xsetApi(org.apache.xmlbeans.XmlString api)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(API$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(API$8);
                      }
                      target.set(api);
                    }
                }
                
                /**
                 * Unsets the "api" attribute
                 */
                public void unsetApi()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(API$8);
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
                 * Gets the "exec_avg" attribute
                 */
                public double getExecAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$12);
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
                      return get_store().find_attribute_user(EXECAVG$12) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$12);
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
                      get_store().remove_attribute(EXECAVG$12);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$14);
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
                      return get_store().find_attribute_user(EXECMIN$14) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$14);
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
                      get_store().remove_attribute(EXECMIN$14);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$16);
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
                      return get_store().find_attribute_user(EXECMAX$16) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$16);
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
                      get_store().remove_attribute(EXECMAX$16);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$18);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$18);
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
                      return get_store().find_attribute_user(EXECSUM$18) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$18);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$18);
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
                      get_store().remove_attribute(EXECSUM$18);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$20);
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
                      return get_store().find_attribute_user(CPUAVG$20) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$20);
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
                      get_store().remove_attribute(CPUAVG$20);
                    }
                }
                
                /**
                 * Gets the "cpu_min" attribute
                 */
                public double getCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$22);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_min" attribute
                 */
                public boolean isSetCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUMIN$22) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_min" attribute
                 */
                public void setCpuMin(double cpuMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMIN$22);
                      }
                      target.setDoubleValue(cpuMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_min" attribute
                 */
                public void xsetCpuMin(org.apache.xmlbeans.XmlDouble cpuMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMIN$22);
                      }
                      target.set(cpuMin);
                    }
                }
                
                /**
                 * Unsets the "cpu_min" attribute
                 */
                public void unsetCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUMIN$22);
                    }
                }
                
                /**
                 * Gets the "cpu_max" attribute
                 */
                public double getCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$24);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_max" attribute
                 */
                public boolean isSetCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUMAX$24) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_max" attribute
                 */
                public void setCpuMax(double cpuMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMAX$24);
                      }
                      target.setDoubleValue(cpuMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_max" attribute
                 */
                public void xsetCpuMax(org.apache.xmlbeans.XmlDouble cpuMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMAX$24);
                      }
                      target.set(cpuMax);
                    }
                }
                
                /**
                 * Unsets the "cpu_max" attribute
                 */
                public void unsetCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUMAX$24);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$26);
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
                      return get_store().find_attribute_user(CPUSUM$26) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$26);
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
                      get_store().remove_attribute(CPUSUM$26);
                    }
                }
                
                /**
                 * Gets the "sync_avg" attribute
                 */
                public double getSyncAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCAVG$28);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sync_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSyncAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCAVG$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "sync_avg" attribute
                 */
                public boolean isSetSyncAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYNCAVG$28) != null;
                    }
                }
                
                /**
                 * Sets the "sync_avg" attribute
                 */
                public void setSyncAvg(double syncAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCAVG$28);
                      }
                      target.setDoubleValue(syncAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "sync_avg" attribute
                 */
                public void xsetSyncAvg(org.apache.xmlbeans.XmlDouble syncAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCAVG$28);
                      }
                      target.set(syncAvg);
                    }
                }
                
                /**
                 * Unsets the "sync_avg" attribute
                 */
                public void unsetSyncAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYNCAVG$28);
                    }
                }
                
                /**
                 * Gets the "sync_min" attribute
                 */
                public double getSyncMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMIN$30);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sync_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSyncMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMIN$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "sync_min" attribute
                 */
                public boolean isSetSyncMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYNCMIN$30) != null;
                    }
                }
                
                /**
                 * Sets the "sync_min" attribute
                 */
                public void setSyncMin(double syncMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMIN$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCMIN$30);
                      }
                      target.setDoubleValue(syncMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "sync_min" attribute
                 */
                public void xsetSyncMin(org.apache.xmlbeans.XmlDouble syncMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMIN$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCMIN$30);
                      }
                      target.set(syncMin);
                    }
                }
                
                /**
                 * Unsets the "sync_min" attribute
                 */
                public void unsetSyncMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYNCMIN$30);
                    }
                }
                
                /**
                 * Gets the "sync_max" attribute
                 */
                public double getSyncMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMAX$32);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sync_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSyncMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMAX$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "sync_max" attribute
                 */
                public boolean isSetSyncMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYNCMAX$32) != null;
                    }
                }
                
                /**
                 * Sets the "sync_max" attribute
                 */
                public void setSyncMax(double syncMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMAX$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCMAX$32);
                      }
                      target.setDoubleValue(syncMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "sync_max" attribute
                 */
                public void xsetSyncMax(org.apache.xmlbeans.XmlDouble syncMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMAX$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCMAX$32);
                      }
                      target.set(syncMax);
                    }
                }
                
                /**
                 * Unsets the "sync_max" attribute
                 */
                public void unsetSyncMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYNCMAX$32);
                    }
                }
                
                /**
                 * Gets the "sync_sum" attribute
                 */
                public double getSyncSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCSUM$34);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sync_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSyncSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCSUM$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "sync_sum" attribute
                 */
                public boolean isSetSyncSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYNCSUM$34) != null;
                    }
                }
                
                /**
                 * Sets the "sync_sum" attribute
                 */
                public void setSyncSum(double syncSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCSUM$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCSUM$34);
                      }
                      target.setDoubleValue(syncSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "sync_sum" attribute
                 */
                public void xsetSyncSum(org.apache.xmlbeans.XmlDouble syncSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCSUM$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCSUM$34);
                      }
                      target.set(syncSum);
                    }
                }
                
                /**
                 * Unsets the "sync_sum" attribute
                 */
                public void unsetSyncSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYNCSUM$34);
                    }
                }
                
                /**
                 * Gets the "wait_avg" attribute
                 */
                public double getWaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITAVG$36);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "wait_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITAVG$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "wait_avg" attribute
                 */
                public boolean isSetWaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WAITAVG$36) != null;
                    }
                }
                
                /**
                 * Sets the "wait_avg" attribute
                 */
                public void setWaitAvg(double waitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITAVG$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITAVG$36);
                      }
                      target.setDoubleValue(waitAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "wait_avg" attribute
                 */
                public void xsetWaitAvg(org.apache.xmlbeans.XmlDouble waitAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITAVG$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITAVG$36);
                      }
                      target.set(waitAvg);
                    }
                }
                
                /**
                 * Unsets the "wait_avg" attribute
                 */
                public void unsetWaitAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WAITAVG$36);
                    }
                }
                
                /**
                 * Gets the "wait_min" attribute
                 */
                public double getWaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMIN$38);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "wait_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMIN$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "wait_min" attribute
                 */
                public boolean isSetWaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WAITMIN$38) != null;
                    }
                }
                
                /**
                 * Sets the "wait_min" attribute
                 */
                public void setWaitMin(double waitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMIN$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITMIN$38);
                      }
                      target.setDoubleValue(waitMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "wait_min" attribute
                 */
                public void xsetWaitMin(org.apache.xmlbeans.XmlDouble waitMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMIN$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITMIN$38);
                      }
                      target.set(waitMin);
                    }
                }
                
                /**
                 * Unsets the "wait_min" attribute
                 */
                public void unsetWaitMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WAITMIN$38);
                    }
                }
                
                /**
                 * Gets the "wait_max" attribute
                 */
                public double getWaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMAX$40);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "wait_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMAX$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "wait_max" attribute
                 */
                public boolean isSetWaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WAITMAX$40) != null;
                    }
                }
                
                /**
                 * Sets the "wait_max" attribute
                 */
                public void setWaitMax(double waitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMAX$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITMAX$40);
                      }
                      target.setDoubleValue(waitMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "wait_max" attribute
                 */
                public void xsetWaitMax(org.apache.xmlbeans.XmlDouble waitMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMAX$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITMAX$40);
                      }
                      target.set(waitMax);
                    }
                }
                
                /**
                 * Unsets the "wait_max" attribute
                 */
                public void unsetWaitMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WAITMAX$40);
                    }
                }
                
                /**
                 * Gets the "wait_sum" attribute
                 */
                public double getWaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITSUM$42);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "wait_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITSUM$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "wait_sum" attribute
                 */
                public boolean isSetWaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WAITSUM$42) != null;
                    }
                }
                
                /**
                 * Sets the "wait_sum" attribute
                 */
                public void setWaitSum(double waitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITSUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITSUM$42);
                      }
                      target.setDoubleValue(waitSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "wait_sum" attribute
                 */
                public void xsetWaitSum(org.apache.xmlbeans.XmlDouble waitSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITSUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITSUM$42);
                      }
                      target.set(waitSum);
                    }
                }
                
                /**
                 * Unsets the "wait_sum" attribute
                 */
                public void unsetWaitSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WAITSUM$42);
                    }
                }
                
                /**
                 * Gets the "error_state" attribute
                 */
                public java.lang.String getErrorState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "error_state" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetErrorState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "error_state" attribute
                 */
                public boolean isSetErrorState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORSTATE$44) != null;
                    }
                }
                
                /**
                 * Sets the "error_state" attribute
                 */
                public void setErrorState(java.lang.String errorState)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTATE$44);
                      }
                      target.setStringValue(errorState);
                    }
                }
                
                /**
                 * Sets (as xml) the "error_state" attribute
                 */
                public void xsetErrorState(org.apache.xmlbeans.XmlString errorState)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORSTATE$44);
                      }
                      target.set(errorState);
                    }
                }
                
                /**
                 * Unsets the "error_state" attribute
                 */
                public void unsetErrorState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORSTATE$44);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$46);
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
                      return get_store().find_attribute_user(FAILURERATE$46) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$46);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$46);
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
                      get_store().remove_attribute(FAILURERATE$46);
                    }
                }
            }
        }
    }
}
