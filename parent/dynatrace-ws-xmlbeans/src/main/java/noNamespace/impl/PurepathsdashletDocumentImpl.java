/*
 * An XML document type.
 * Localname: purepathsdashlet
 * Namespace: 
 * Java type: noNamespace.PurepathsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one purepathsdashlet(@) element.
 *
 * This is a complex type.
 */
public class PurepathsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.PurepathsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public PurepathsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUREPATHSDASHLET$0 = 
        new javax.xml.namespace.QName("", "purepathsdashlet");
    
    
    /**
     * Gets the "purepathsdashlet" element
     */
    public noNamespace.PurepathsdashletDocument.Purepathsdashlet getPurepathsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.PurepathsdashletDocument.Purepathsdashlet target = null;
            target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().find_element_user(PUREPATHSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "purepathsdashlet" element
     */
    public void setPurepathsdashlet(noNamespace.PurepathsdashletDocument.Purepathsdashlet purepathsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.PurepathsdashletDocument.Purepathsdashlet target = null;
            target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().find_element_user(PUREPATHSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().add_element_user(PUREPATHSDASHLET$0);
            }
            target.set(purepathsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "purepathsdashlet" element
     */
    public noNamespace.PurepathsdashletDocument.Purepathsdashlet addNewPurepathsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.PurepathsdashletDocument.Purepathsdashlet target = null;
            target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().add_element_user(PUREPATHSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML purepathsdashlet(@).
     *
     * This is a complex type.
     */
    public static class PurepathsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.PurepathsdashletDocument.Purepathsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public PurepathsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName PUREPATHS$4 = 
            new javax.xml.namespace.QName("", "purepaths");
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
         * Gets the "purepaths" element
         */
        public noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths getPurepaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths target = null;
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths)get_store().find_element_user(PUREPATHS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "purepaths" element
         */
        public boolean isSetPurepaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUREPATHS$4) != 0;
            }
        }
        
        /**
         * Sets the "purepaths" element
         */
        public void setPurepaths(noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths purepaths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths target = null;
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths)get_store().find_element_user(PUREPATHS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths)get_store().add_element_user(PUREPATHS$4);
                }
                target.set(purepaths);
            }
        }
        
        /**
         * Appends and returns a new empty "purepaths" element
         */
        public noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths addNewPurepaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths target = null;
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths)get_store().add_element_user(PUREPATHS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "purepaths" element
         */
        public void unsetPurepaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUREPATHS$4, 0);
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
         * An XML purepaths(@).
         *
         * This is a complex type.
         */
        public static class PurepathsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths
        {
            private static final long serialVersionUID = 1L;
            
            public PurepathsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PUREPATH$0 = 
                new javax.xml.namespace.QName("", "purepath");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "purepath" elements
             */
            public noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath[] getPurepathArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUREPATH$0, targetList);
                    noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath[] result = new noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "purepath" element
             */
            public noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath getPurepathArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath)get_store().find_element_user(PUREPATH$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "purepath" element
             */
            public int sizeOfPurepathArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PUREPATH$0);
                }
            }
            
            /**
             * Sets array of all "purepath" element
             */
            public void setPurepathArray(noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath[] purepathArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(purepathArray, PUREPATH$0);
                }
            }
            
            /**
             * Sets ith "purepath" element
             */
            public void setPurepathArray(int i, noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath purepath)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath)get_store().find_element_user(PUREPATH$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(purepath);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "purepath" element
             */
            public noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath insertNewPurepath(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath)get_store().insert_element_user(PUREPATH$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "purepath" element
             */
            public noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath addNewPurepath()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath)get_store().add_element_user(PUREPATH$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "purepath" element
             */
            public void removePurepath(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PUREPATH$0, i);
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
             * An XML purepath(@).
             *
             * This is a complex type.
             */
            public static class PurepathImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.PurepathsdashletDocument.Purepathsdashlet.Purepaths.Purepath
            {
                private static final long serialVersionUID = 1L;
                
                public PurepathImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NODE$0 = 
                    new javax.xml.namespace.QName("", "node");
                private static final javax.xml.namespace.QName STATE$2 = 
                    new javax.xml.namespace.QName("", "state");
                private static final javax.xml.namespace.QName NAME$4 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName BUSINESSTRANSACTIONS$6 = 
                    new javax.xml.namespace.QName("", "businesstransactions");
                private static final javax.xml.namespace.QName AGENT$8 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName NODECOUNT$10 = 
                    new javax.xml.namespace.QName("", "node_count");
                private static final javax.xml.namespace.QName EXEC$12 = 
                    new javax.xml.namespace.QName("", "exec");
                private static final javax.xml.namespace.QName CPU$14 = 
                    new javax.xml.namespace.QName("", "cpu");
                private static final javax.xml.namespace.QName SYNC$16 = 
                    new javax.xml.namespace.QName("", "sync");
                private static final javax.xml.namespace.QName WAIT$18 = 
                    new javax.xml.namespace.QName("", "wait");
                private static final javax.xml.namespace.QName SUSPENSION$20 = 
                    new javax.xml.namespace.QName("", "suspension");
                private static final javax.xml.namespace.QName DESCHEDULED$22 = 
                    new javax.xml.namespace.QName("", "descheduled");
                private static final javax.xml.namespace.QName START$24 = 
                    new javax.xml.namespace.QName("", "start");
                private static final javax.xml.namespace.QName AGENTID$26 = 
                    new javax.xml.namespace.QName("", "agentid");
                private static final javax.xml.namespace.QName TAGID$28 = 
                    new javax.xml.namespace.QName("", "tagid");
                private static final javax.xml.namespace.QName SKIPPEDEVENTS$30 = 
                    new javax.xml.namespace.QName("", "skippedevents");
                private static final javax.xml.namespace.QName INTERNALSTATE$32 = 
                    new javax.xml.namespace.QName("", "internal_state");
                private static final javax.xml.namespace.QName EXTENDEDRECORDCOUNT$34 = 
                    new javax.xml.namespace.QName("", "extended_record_count");
                private static final javax.xml.namespace.QName ROOTPATHTHREADNAME$36 = 
                    new javax.xml.namespace.QName("", "root_path_thread_name");
                private static final javax.xml.namespace.QName APPLICATION$38 = 
                    new javax.xml.namespace.QName("", "application");
                private static final javax.xml.namespace.QName BREAKDOWN$40 = 
                    new javax.xml.namespace.QName("", "breakdown");
                private static final javax.xml.namespace.QName EXECSUM$42 = 
                    new javax.xml.namespace.QName("", "execsum");
                private static final javax.xml.namespace.QName RESPONSETIME$44 = 
                    new javax.xml.namespace.QName("", "response_time");
                private static final javax.xml.namespace.QName VISITID$46 = 
                    new javax.xml.namespace.QName("", "visitid");
                private static final javax.xml.namespace.QName UPLINKS$48 = 
                    new javax.xml.namespace.QName("", "uplinks");
                private static final javax.xml.namespace.QName ENDTIME$50 = 
                    new javax.xml.namespace.QName("", "endtime");
                private static final javax.xml.namespace.QName WEBREQUESTRESPONSETIME$52 = 
                    new javax.xml.namespace.QName("", "web_request_response_time");
                private static final javax.xml.namespace.QName CLIENTIP$54 = 
                    new javax.xml.namespace.QName("", "client_ip");
                private static final javax.xml.namespace.QName CROSSSERVERTAG$56 = 
                    new javax.xml.namespace.QName("", "cross_server_tag");
                private static final javax.xml.namespace.QName DETECTEDPROBLEMPATTERNS$58 = 
                    new javax.xml.namespace.QName("", "detected_problem_patterns");
                
                
                /**
                 * Gets array of all "node" elements
                 */
                public noNamespace.NodeDocument.Node[] getNodeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(NODE$0, targetList);
                      noNamespace.NodeDocument.Node[] result = new noNamespace.NodeDocument.Node[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "node" element
                 */
                public noNamespace.NodeDocument.Node getNodeArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.NodeDocument.Node target = null;
                      target = (noNamespace.NodeDocument.Node)get_store().find_element_user(NODE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "node" element
                 */
                public int sizeOfNodeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NODE$0);
                    }
                }
                
                /**
                 * Sets array of all "node" element
                 */
                public void setNodeArray(noNamespace.NodeDocument.Node[] nodeArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(nodeArray, NODE$0);
                    }
                }
                
                /**
                 * Sets ith "node" element
                 */
                public void setNodeArray(int i, noNamespace.NodeDocument.Node node)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.NodeDocument.Node target = null;
                      target = (noNamespace.NodeDocument.Node)get_store().find_element_user(NODE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(node);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "node" element
                 */
                public noNamespace.NodeDocument.Node insertNewNode(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.NodeDocument.Node target = null;
                      target = (noNamespace.NodeDocument.Node)get_store().insert_element_user(NODE$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "node" element
                 */
                public noNamespace.NodeDocument.Node addNewNode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.NodeDocument.Node target = null;
                      target = (noNamespace.NodeDocument.Node)get_store().add_element_user(NODE$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "node" element
                 */
                public void removeNode(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NODE$0, i);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$2);
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
                      return get_store().find_attribute_user(STATE$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATE$2);
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
                      get_store().remove_attribute(STATE$2);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                      return get_store().find_attribute_user(NAME$4) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
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
                      get_store().remove_attribute(NAME$4);
                    }
                }
                
                /**
                 * Gets the "businesstransactions" attribute
                 */
                public java.lang.String getBusinesstransactions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUSINESSTRANSACTIONS$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "businesstransactions" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBusinesstransactions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUSINESSTRANSACTIONS$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "businesstransactions" attribute
                 */
                public boolean isSetBusinesstransactions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BUSINESSTRANSACTIONS$6) != null;
                    }
                }
                
                /**
                 * Sets the "businesstransactions" attribute
                 */
                public void setBusinesstransactions(java.lang.String businesstransactions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUSINESSTRANSACTIONS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUSINESSTRANSACTIONS$6);
                      }
                      target.setStringValue(businesstransactions);
                    }
                }
                
                /**
                 * Sets (as xml) the "businesstransactions" attribute
                 */
                public void xsetBusinesstransactions(org.apache.xmlbeans.XmlString businesstransactions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BUSINESSTRANSACTIONS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BUSINESSTRANSACTIONS$6);
                      }
                      target.set(businesstransactions);
                    }
                }
                
                /**
                 * Unsets the "businesstransactions" attribute
                 */
                public void unsetBusinesstransactions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BUSINESSTRANSACTIONS$6);
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
                 * Gets the "node_count" attribute
                 */
                public java.math.BigInteger getNodeCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODECOUNT$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "node_count" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetNodeCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NODECOUNT$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "node_count" attribute
                 */
                public boolean isSetNodeCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NODECOUNT$10) != null;
                    }
                }
                
                /**
                 * Sets the "node_count" attribute
                 */
                public void setNodeCount(java.math.BigInteger nodeCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODECOUNT$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODECOUNT$10);
                      }
                      target.setBigIntegerValue(nodeCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "node_count" attribute
                 */
                public void xsetNodeCount(org.apache.xmlbeans.XmlInteger nodeCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NODECOUNT$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NODECOUNT$10);
                      }
                      target.set(nodeCount);
                    }
                }
                
                /**
                 * Unsets the "node_count" attribute
                 */
                public void unsetNodeCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NODECOUNT$10);
                    }
                }
                
                /**
                 * Gets the "exec" attribute
                 */
                public double getExec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXEC$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXEC$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec" attribute
                 */
                public boolean isSetExec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXEC$12) != null;
                    }
                }
                
                /**
                 * Sets the "exec" attribute
                 */
                public void setExec(double exec)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXEC$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXEC$12);
                      }
                      target.setDoubleValue(exec);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec" attribute
                 */
                public void xsetExec(org.apache.xmlbeans.XmlDouble exec)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXEC$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXEC$12);
                      }
                      target.set(exec);
                    }
                }
                
                /**
                 * Unsets the "exec" attribute
                 */
                public void unsetExec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXEC$12);
                    }
                }
                
                /**
                 * Gets the "cpu" attribute
                 */
                public double getCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPU$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu" attribute
                 */
                public boolean isSetCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPU$14) != null;
                    }
                }
                
                /**
                 * Sets the "cpu" attribute
                 */
                public void setCpu(double cpu)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPU$14);
                      }
                      target.setDoubleValue(cpu);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu" attribute
                 */
                public void xsetCpu(org.apache.xmlbeans.XmlDouble cpu)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPU$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPU$14);
                      }
                      target.set(cpu);
                    }
                }
                
                /**
                 * Unsets the "cpu" attribute
                 */
                public void unsetCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPU$14);
                    }
                }
                
                /**
                 * Gets the "sync" attribute
                 */
                public double getSync()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNC$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sync" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSync()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNC$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "sync" attribute
                 */
                public boolean isSetSync()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYNC$16) != null;
                    }
                }
                
                /**
                 * Sets the "sync" attribute
                 */
                public void setSync(double sync)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNC$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNC$16);
                      }
                      target.setDoubleValue(sync);
                    }
                }
                
                /**
                 * Sets (as xml) the "sync" attribute
                 */
                public void xsetSync(org.apache.xmlbeans.XmlDouble sync)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNC$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNC$16);
                      }
                      target.set(sync);
                    }
                }
                
                /**
                 * Unsets the "sync" attribute
                 */
                public void unsetSync()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYNC$16);
                    }
                }
                
                /**
                 * Gets the "wait" attribute
                 */
                public double getWait()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAIT$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "wait" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWait()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAIT$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "wait" attribute
                 */
                public boolean isSetWait()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WAIT$18) != null;
                    }
                }
                
                /**
                 * Sets the "wait" attribute
                 */
                public void setWait(double wait)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAIT$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAIT$18);
                      }
                      target.setDoubleValue(wait);
                    }
                }
                
                /**
                 * Sets (as xml) the "wait" attribute
                 */
                public void xsetWait(org.apache.xmlbeans.XmlDouble wait)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAIT$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAIT$18);
                      }
                      target.set(wait);
                    }
                }
                
                /**
                 * Unsets the "wait" attribute
                 */
                public void unsetWait()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WAIT$18);
                    }
                }
                
                /**
                 * Gets the "suspension" attribute
                 */
                public double getSuspension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSION$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "suspension" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSuspension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSION$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "suspension" attribute
                 */
                public boolean isSetSuspension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUSPENSION$20) != null;
                    }
                }
                
                /**
                 * Sets the "suspension" attribute
                 */
                public void setSuspension(double suspension)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSION$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSION$20);
                      }
                      target.setDoubleValue(suspension);
                    }
                }
                
                /**
                 * Sets (as xml) the "suspension" attribute
                 */
                public void xsetSuspension(org.apache.xmlbeans.XmlDouble suspension)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSION$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSION$20);
                      }
                      target.set(suspension);
                    }
                }
                
                /**
                 * Unsets the "suspension" attribute
                 */
                public void unsetSuspension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUSPENSION$20);
                    }
                }
                
                /**
                 * Gets the "descheduled" attribute
                 */
                public double getDescheduled()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULED$22);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "descheduled" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDescheduled()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULED$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "descheduled" attribute
                 */
                public boolean isSetDescheduled()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESCHEDULED$22) != null;
                    }
                }
                
                /**
                 * Sets the "descheduled" attribute
                 */
                public void setDescheduled(double descheduled)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULED$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCHEDULED$22);
                      }
                      target.setDoubleValue(descheduled);
                    }
                }
                
                /**
                 * Sets (as xml) the "descheduled" attribute
                 */
                public void xsetDescheduled(org.apache.xmlbeans.XmlDouble descheduled)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULED$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESCHEDULED$22);
                      }
                      target.set(descheduled);
                    }
                }
                
                /**
                 * Unsets the "descheduled" attribute
                 */
                public void unsetDescheduled()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESCHEDULED$22);
                    }
                }
                
                /**
                 * Gets the "start" attribute
                 */
                public java.lang.String getStart()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "start" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStart()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "start" attribute
                 */
                public boolean isSetStart()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(START$24) != null;
                    }
                }
                
                /**
                 * Sets the "start" attribute
                 */
                public void setStart(java.lang.String start)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$24);
                      }
                      target.setStringValue(start);
                    }
                }
                
                /**
                 * Sets (as xml) the "start" attribute
                 */
                public void xsetStart(org.apache.xmlbeans.XmlString start)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(START$24);
                      }
                      target.set(start);
                    }
                }
                
                /**
                 * Unsets the "start" attribute
                 */
                public void unsetStart()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(START$24);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTID$26);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTID$26);
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
                      return get_store().find_attribute_user(AGENTID$26) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTID$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTID$26);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTID$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTID$26);
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
                      get_store().remove_attribute(AGENTID$26);
                    }
                }
                
                /**
                 * Gets the "tagid" attribute
                 */
                public java.math.BigInteger getTagid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAGID$28);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "tagid" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetTagid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TAGID$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "tagid" attribute
                 */
                public boolean isSetTagid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TAGID$28) != null;
                    }
                }
                
                /**
                 * Sets the "tagid" attribute
                 */
                public void setTagid(java.math.BigInteger tagid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAGID$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TAGID$28);
                      }
                      target.setBigIntegerValue(tagid);
                    }
                }
                
                /**
                 * Sets (as xml) the "tagid" attribute
                 */
                public void xsetTagid(org.apache.xmlbeans.XmlInteger tagid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TAGID$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TAGID$28);
                      }
                      target.set(tagid);
                    }
                }
                
                /**
                 * Unsets the "tagid" attribute
                 */
                public void unsetTagid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TAGID$28);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPPEDEVENTS$30);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SKIPPEDEVENTS$30);
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
                      return get_store().find_attribute_user(SKIPPEDEVENTS$30) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPPEDEVENTS$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKIPPEDEVENTS$30);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SKIPPEDEVENTS$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SKIPPEDEVENTS$30);
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
                      get_store().remove_attribute(SKIPPEDEVENTS$30);
                    }
                }
                
                /**
                 * Gets the "internal_state" attribute
                 */
                public java.lang.String getInternalState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALSTATE$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "internal_state" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetInternalState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNALSTATE$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "internal_state" attribute
                 */
                public boolean isSetInternalState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(INTERNALSTATE$32) != null;
                    }
                }
                
                /**
                 * Sets the "internal_state" attribute
                 */
                public void setInternalState(java.lang.String internalState)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALSTATE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNALSTATE$32);
                      }
                      target.setStringValue(internalState);
                    }
                }
                
                /**
                 * Sets (as xml) the "internal_state" attribute
                 */
                public void xsetInternalState(org.apache.xmlbeans.XmlString internalState)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNALSTATE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INTERNALSTATE$32);
                      }
                      target.set(internalState);
                    }
                }
                
                /**
                 * Unsets the "internal_state" attribute
                 */
                public void unsetInternalState()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(INTERNALSTATE$32);
                    }
                }
                
                /**
                 * Gets the "extended_record_count" attribute
                 */
                public java.lang.String getExtendedRecordCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDEDRECORDCOUNT$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "extended_record_count" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetExtendedRecordCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDEDRECORDCOUNT$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "extended_record_count" attribute
                 */
                public boolean isSetExtendedRecordCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXTENDEDRECORDCOUNT$34) != null;
                    }
                }
                
                /**
                 * Sets the "extended_record_count" attribute
                 */
                public void setExtendedRecordCount(java.lang.String extendedRecordCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDEDRECORDCOUNT$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDEDRECORDCOUNT$34);
                      }
                      target.setStringValue(extendedRecordCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "extended_record_count" attribute
                 */
                public void xsetExtendedRecordCount(org.apache.xmlbeans.XmlString extendedRecordCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDEDRECORDCOUNT$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXTENDEDRECORDCOUNT$34);
                      }
                      target.set(extendedRecordCount);
                    }
                }
                
                /**
                 * Unsets the "extended_record_count" attribute
                 */
                public void unsetExtendedRecordCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXTENDEDRECORDCOUNT$34);
                    }
                }
                
                /**
                 * Gets the "root_path_thread_name" attribute
                 */
                public java.lang.String getRootPathThreadName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTPATHTHREADNAME$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "root_path_thread_name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetRootPathThreadName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTPATHTHREADNAME$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "root_path_thread_name" attribute
                 */
                public boolean isSetRootPathThreadName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROOTPATHTHREADNAME$36) != null;
                    }
                }
                
                /**
                 * Sets the "root_path_thread_name" attribute
                 */
                public void setRootPathThreadName(java.lang.String rootPathThreadName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTPATHTHREADNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOTPATHTHREADNAME$36);
                      }
                      target.setStringValue(rootPathThreadName);
                    }
                }
                
                /**
                 * Sets (as xml) the "root_path_thread_name" attribute
                 */
                public void xsetRootPathThreadName(org.apache.xmlbeans.XmlString rootPathThreadName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTPATHTHREADNAME$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROOTPATHTHREADNAME$36);
                      }
                      target.set(rootPathThreadName);
                    }
                }
                
                /**
                 * Unsets the "root_path_thread_name" attribute
                 */
                public void unsetRootPathThreadName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROOTPATHTHREADNAME$36);
                    }
                }
                
                /**
                 * Gets the "application" attribute
                 */
                public java.lang.String getApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "application" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "application" attribute
                 */
                public boolean isSetApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(APPLICATION$38) != null;
                    }
                }
                
                /**
                 * Sets the "application" attribute
                 */
                public void setApplication(java.lang.String application)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATION$38);
                      }
                      target.setStringValue(application);
                    }
                }
                
                /**
                 * Sets (as xml) the "application" attribute
                 */
                public void xsetApplication(org.apache.xmlbeans.XmlString application)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATION$38);
                      }
                      target.set(application);
                    }
                }
                
                /**
                 * Unsets the "application" attribute
                 */
                public void unsetApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(APPLICATION$38);
                    }
                }
                
                /**
                 * Gets the "breakdown" attribute
                 */
                public java.lang.String getBreakdown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BREAKDOWN$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "breakdown" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBreakdown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BREAKDOWN$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "breakdown" attribute
                 */
                public boolean isSetBreakdown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BREAKDOWN$40) != null;
                    }
                }
                
                /**
                 * Sets the "breakdown" attribute
                 */
                public void setBreakdown(java.lang.String breakdown)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BREAKDOWN$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BREAKDOWN$40);
                      }
                      target.setStringValue(breakdown);
                    }
                }
                
                /**
                 * Sets (as xml) the "breakdown" attribute
                 */
                public void xsetBreakdown(org.apache.xmlbeans.XmlString breakdown)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BREAKDOWN$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BREAKDOWN$40);
                      }
                      target.set(breakdown);
                    }
                }
                
                /**
                 * Unsets the "breakdown" attribute
                 */
                public void unsetBreakdown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BREAKDOWN$40);
                    }
                }
                
                /**
                 * Gets the "execsum" attribute
                 */
                public double getExecsum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$42);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "execsum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecsum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "execsum" attribute
                 */
                public boolean isSetExecsum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECSUM$42) != null;
                    }
                }
                
                /**
                 * Sets the "execsum" attribute
                 */
                public void setExecsum(double execsum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$42);
                      }
                      target.setDoubleValue(execsum);
                    }
                }
                
                /**
                 * Sets (as xml) the "execsum" attribute
                 */
                public void xsetExecsum(org.apache.xmlbeans.XmlDouble execsum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$42);
                      }
                      target.set(execsum);
                    }
                }
                
                /**
                 * Unsets the "execsum" attribute
                 */
                public void unsetExecsum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECSUM$42);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$44);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$44);
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
                      return get_store().find_attribute_user(RESPONSETIME$44) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIME$44);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIME$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIME$44);
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
                      get_store().remove_attribute(RESPONSETIME$44);
                    }
                }
                
                /**
                 * Gets the "visitid" attribute
                 */
                public java.lang.String getVisitid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$46);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "visitid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVisitid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "visitid" attribute
                 */
                public boolean isSetVisitid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VISITID$46) != null;
                    }
                }
                
                /**
                 * Sets the "visitid" attribute
                 */
                public void setVisitid(java.lang.String visitid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISITID$46);
                      }
                      target.setStringValue(visitid);
                    }
                }
                
                /**
                 * Sets (as xml) the "visitid" attribute
                 */
                public void xsetVisitid(org.apache.xmlbeans.XmlString visitid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISITID$46);
                      }
                      target.set(visitid);
                    }
                }
                
                /**
                 * Unsets the "visitid" attribute
                 */
                public void unsetVisitid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VISITID$46);
                    }
                }
                
                /**
                 * Gets the "uplinks" attribute
                 */
                public java.lang.String getUplinks()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPLINKS$48);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "uplinks" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUplinks()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UPLINKS$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "uplinks" attribute
                 */
                public boolean isSetUplinks()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(UPLINKS$48) != null;
                    }
                }
                
                /**
                 * Sets the "uplinks" attribute
                 */
                public void setUplinks(java.lang.String uplinks)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPLINKS$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPLINKS$48);
                      }
                      target.setStringValue(uplinks);
                    }
                }
                
                /**
                 * Sets (as xml) the "uplinks" attribute
                 */
                public void xsetUplinks(org.apache.xmlbeans.XmlString uplinks)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UPLINKS$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UPLINKS$48);
                      }
                      target.set(uplinks);
                    }
                }
                
                /**
                 * Unsets the "uplinks" attribute
                 */
                public void unsetUplinks()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(UPLINKS$48);
                    }
                }
                
                /**
                 * Gets the "endtime" attribute
                 */
                public java.lang.String getEndtime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$50);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "endtime" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetEndtime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDTIME$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "endtime" attribute
                 */
                public boolean isSetEndtime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ENDTIME$50) != null;
                    }
                }
                
                /**
                 * Sets the "endtime" attribute
                 */
                public void setEndtime(java.lang.String endtime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTIME$50);
                      }
                      target.setStringValue(endtime);
                    }
                }
                
                /**
                 * Sets (as xml) the "endtime" attribute
                 */
                public void xsetEndtime(org.apache.xmlbeans.XmlString endtime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDTIME$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDTIME$50);
                      }
                      target.set(endtime);
                    }
                }
                
                /**
                 * Unsets the "endtime" attribute
                 */
                public void unsetEndtime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ENDTIME$50);
                    }
                }
                
                /**
                 * Gets the "web_request_response_time" attribute
                 */
                public double getWebRequestResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIME$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "web_request_response_time" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIME$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "web_request_response_time" attribute
                 */
                public boolean isSetWebRequestResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WEBREQUESTRESPONSETIME$52) != null;
                    }
                }
                
                /**
                 * Sets the "web_request_response_time" attribute
                 */
                public void setWebRequestResponseTime(double webRequestResponseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBREQUESTRESPONSETIME$52);
                      }
                      target.setDoubleValue(webRequestResponseTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "web_request_response_time" attribute
                 */
                public void xsetWebRequestResponseTime(org.apache.xmlbeans.XmlDouble webRequestResponseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIME$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WEBREQUESTRESPONSETIME$52);
                      }
                      target.set(webRequestResponseTime);
                    }
                }
                
                /**
                 * Unsets the "web_request_response_time" attribute
                 */
                public void unsetWebRequestResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WEBREQUESTRESPONSETIME$52);
                    }
                }
                
                /**
                 * Gets the "client_ip" attribute
                 */
                public java.lang.String getClientIp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$54);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "client_ip" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetClientIp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "client_ip" attribute
                 */
                public boolean isSetClientIp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLIENTIP$54) != null;
                    }
                }
                
                /**
                 * Sets the "client_ip" attribute
                 */
                public void setClientIp(java.lang.String clientIp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTIP$54);
                      }
                      target.setStringValue(clientIp);
                    }
                }
                
                /**
                 * Sets (as xml) the "client_ip" attribute
                 */
                public void xsetClientIp(org.apache.xmlbeans.XmlString clientIp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTIP$54);
                      }
                      target.set(clientIp);
                    }
                }
                
                /**
                 * Unsets the "client_ip" attribute
                 */
                public void unsetClientIp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLIENTIP$54);
                    }
                }
                
                /**
                 * Gets the "cross_server_tag" attribute
                 */
                public java.lang.String getCrossServerTag()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSERVERTAG$56);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cross_server_tag" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCrossServerTag()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CROSSSERVERTAG$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "cross_server_tag" attribute
                 */
                public boolean isSetCrossServerTag()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CROSSSERVERTAG$56) != null;
                    }
                }
                
                /**
                 * Sets the "cross_server_tag" attribute
                 */
                public void setCrossServerTag(java.lang.String crossServerTag)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSERVERTAG$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSERVERTAG$56);
                      }
                      target.setStringValue(crossServerTag);
                    }
                }
                
                /**
                 * Sets (as xml) the "cross_server_tag" attribute
                 */
                public void xsetCrossServerTag(org.apache.xmlbeans.XmlString crossServerTag)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CROSSSERVERTAG$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CROSSSERVERTAG$56);
                      }
                      target.set(crossServerTag);
                    }
                }
                
                /**
                 * Unsets the "cross_server_tag" attribute
                 */
                public void unsetCrossServerTag()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CROSSSERVERTAG$56);
                    }
                }
                
                /**
                 * Gets the "detected_problem_patterns" attribute
                 */
                public java.lang.String getDetectedProblemPatterns()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETECTEDPROBLEMPATTERNS$58);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "detected_problem_patterns" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDetectedProblemPatterns()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETECTEDPROBLEMPATTERNS$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "detected_problem_patterns" attribute
                 */
                public boolean isSetDetectedProblemPatterns()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DETECTEDPROBLEMPATTERNS$58) != null;
                    }
                }
                
                /**
                 * Sets the "detected_problem_patterns" attribute
                 */
                public void setDetectedProblemPatterns(java.lang.String detectedProblemPatterns)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETECTEDPROBLEMPATTERNS$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETECTEDPROBLEMPATTERNS$58);
                      }
                      target.setStringValue(detectedProblemPatterns);
                    }
                }
                
                /**
                 * Sets (as xml) the "detected_problem_patterns" attribute
                 */
                public void xsetDetectedProblemPatterns(org.apache.xmlbeans.XmlString detectedProblemPatterns)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETECTEDPROBLEMPATTERNS$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DETECTEDPROBLEMPATTERNS$58);
                      }
                      target.set(detectedProblemPatterns);
                    }
                }
                
                /**
                 * Unsets the "detected_problem_patterns" attribute
                 */
                public void unsetDetectedProblemPatterns()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DETECTEDPROBLEMPATTERNS$58);
                    }
                }
            }
        }
    }
}
