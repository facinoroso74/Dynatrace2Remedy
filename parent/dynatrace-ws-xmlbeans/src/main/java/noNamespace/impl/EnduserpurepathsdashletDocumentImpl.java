/*
 * An XML document type.
 * Localname: enduserpurepathsdashlet
 * Namespace: 
 * Java type: noNamespace.EnduserpurepathsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one enduserpurepathsdashlet(@) element.
 *
 * This is a complex type.
 */
public class EnduserpurepathsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EnduserpurepathsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnduserpurepathsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDUSERPUREPATHSDASHLET$0 = 
        new javax.xml.namespace.QName("", "enduserpurepathsdashlet");
    
    
    /**
     * Gets the "enduserpurepathsdashlet" element
     */
    public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet getEnduserpurepathsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet target = null;
            target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().find_element_user(ENDUSERPUREPATHSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "enduserpurepathsdashlet" element
     */
    public void setEnduserpurepathsdashlet(noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet enduserpurepathsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet target = null;
            target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().find_element_user(ENDUSERPUREPATHSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().add_element_user(ENDUSERPUREPATHSDASHLET$0);
            }
            target.set(enduserpurepathsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "enduserpurepathsdashlet" element
     */
    public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet addNewEnduserpurepathsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet target = null;
            target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().add_element_user(ENDUSERPUREPATHSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML enduserpurepathsdashlet(@).
     *
     * This is a complex type.
     */
    public static class EnduserpurepathsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public EnduserpurepathsdashletImpl(org.apache.xmlbeans.SchemaType sType)
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
        public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths getPurepaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths target = null;
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths)get_store().find_element_user(PUREPATHS$4, 0);
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
        public void setPurepaths(noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths purepaths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths target = null;
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths)get_store().find_element_user(PUREPATHS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths)get_store().add_element_user(PUREPATHS$4);
                }
                target.set(purepaths);
            }
        }
        
        /**
         * Appends and returns a new empty "purepaths" element
         */
        public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths addNewPurepaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths target = null;
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths)get_store().add_element_user(PUREPATHS$4);
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
        public static class PurepathsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths
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
            public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath[] getPurepathArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PUREPATH$0, targetList);
                    noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath[] result = new noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "purepath" element
             */
            public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath getPurepathArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath)get_store().find_element_user(PUREPATH$0, i);
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
            public void setPurepathArray(noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath[] purepathArray)
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
            public void setPurepathArray(int i, noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath purepath)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath)get_store().find_element_user(PUREPATH$0, i);
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
            public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath insertNewPurepath(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath)get_store().insert_element_user(PUREPATH$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "purepath" element
             */
            public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath addNewPurepath()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath target = null;
                    target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath)get_store().add_element_user(PUREPATH$0);
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
            public static class PurepathImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet.Purepaths.Purepath
            {
                private static final long serialVersionUID = 1L;
                
                public PurepathImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName UEMNODE$0 = 
                    new javax.xml.namespace.QName("", "uemnode");
                private static final javax.xml.namespace.QName STATE$2 = 
                    new javax.xml.namespace.QName("", "state");
                private static final javax.xml.namespace.QName NAME$4 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName BUSINESSTRANSACTIONS$6 = 
                    new javax.xml.namespace.QName("", "businesstransactions");
                private static final javax.xml.namespace.QName NODECOUNT$8 = 
                    new javax.xml.namespace.QName("", "node_count");
                private static final javax.xml.namespace.QName EXEC$10 = 
                    new javax.xml.namespace.QName("", "exec");
                private static final javax.xml.namespace.QName COMPAREBASELINE$12 = 
                    new javax.xml.namespace.QName("", "compare_baseline");
                private static final javax.xml.namespace.QName START$14 = 
                    new javax.xml.namespace.QName("", "start");
                private static final javax.xml.namespace.QName REQUESTS$16 = 
                    new javax.xml.namespace.QName("", "requests");
                private static final javax.xml.namespace.QName ERRORS$18 = 
                    new javax.xml.namespace.QName("", "errors");
                private static final javax.xml.namespace.QName LOCATION$20 = 
                    new javax.xml.namespace.QName("", "location");
                private static final javax.xml.namespace.QName BROWSER$22 = 
                    new javax.xml.namespace.QName("", "browser");
                private static final javax.xml.namespace.QName TAGID$24 = 
                    new javax.xml.namespace.QName("", "tagid");
                private static final javax.xml.namespace.QName SKIPPEDEVENTS$26 = 
                    new javax.xml.namespace.QName("", "skippedevents");
                private static final javax.xml.namespace.QName INTERNALSTATE$28 = 
                    new javax.xml.namespace.QName("", "internal_state");
                private static final javax.xml.namespace.QName NETWORKDURATION$30 = 
                    new javax.xml.namespace.QName("", "networkduration");
                private static final javax.xml.namespace.QName SERVERDURATION$32 = 
                    new javax.xml.namespace.QName("", "serverduration");
                private static final javax.xml.namespace.QName RESPONSETIME$34 = 
                    new javax.xml.namespace.QName("", "response_time");
                private static final javax.xml.namespace.QName CLIENTIP$36 = 
                    new javax.xml.namespace.QName("", "client_ip");
                private static final javax.xml.namespace.QName BROWSERERRORS$38 = 
                    new javax.xml.namespace.QName("", "browser_errors");
                private static final javax.xml.namespace.QName APPLICATION$40 = 
                    new javax.xml.namespace.QName("", "application");
                private static final javax.xml.namespace.QName BANDWIDTH$42 = 
                    new javax.xml.namespace.QName("", "bandwidth");
                private static final javax.xml.namespace.QName VISITID$44 = 
                    new javax.xml.namespace.QName("", "visitid");
                private static final javax.xml.namespace.QName DOMAIN$46 = 
                    new javax.xml.namespace.QName("", "domain");
                private static final javax.xml.namespace.QName PUREPATHUSEREXPERIENCE$48 = 
                    new javax.xml.namespace.QName("", "purepath_user_experience");
                private static final javax.xml.namespace.QName ACTIONGROUP$50 = 
                    new javax.xml.namespace.QName("", "action_group");
                private static final javax.xml.namespace.QName BASELINE$52 = 
                    new javax.xml.namespace.QName("", "baseline");
                private static final javax.xml.namespace.QName PERFMETRIC$54 = 
                    new javax.xml.namespace.QName("", "perf_metric");
                private static final javax.xml.namespace.QName PERFMETRICVALUE$56 = 
                    new javax.xml.namespace.QName("", "perf_metric_value");
                private static final javax.xml.namespace.QName UXTHRESHOLDFACTORREASON$58 = 
                    new javax.xml.namespace.QName("", "ux_threshold_factor_reason");
                private static final javax.xml.namespace.QName UXTHRESHOLDFACTOR$60 = 
                    new javax.xml.namespace.QName("", "ux_threshold_factor");
                private static final javax.xml.namespace.QName VISUALLYCOMPLETETIME$62 = 
                    new javax.xml.namespace.QName("", "visually_complete_time");
                private static final javax.xml.namespace.QName SPEEDINDEX$64 = 
                    new javax.xml.namespace.QName("", "speed_index");
                
                
                /**
                 * Gets array of all "uemnode" elements
                 */
                public noNamespace.UemnodeDocument.Uemnode[] getUemnodeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(UEMNODE$0, targetList);
                      noNamespace.UemnodeDocument.Uemnode[] result = new noNamespace.UemnodeDocument.Uemnode[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "uemnode" element
                 */
                public noNamespace.UemnodeDocument.Uemnode getUemnodeArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.UemnodeDocument.Uemnode target = null;
                      target = (noNamespace.UemnodeDocument.Uemnode)get_store().find_element_user(UEMNODE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "uemnode" element
                 */
                public int sizeOfUemnodeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(UEMNODE$0);
                    }
                }
                
                /**
                 * Sets array of all "uemnode" element
                 */
                public void setUemnodeArray(noNamespace.UemnodeDocument.Uemnode[] uemnodeArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(uemnodeArray, UEMNODE$0);
                    }
                }
                
                /**
                 * Sets ith "uemnode" element
                 */
                public void setUemnodeArray(int i, noNamespace.UemnodeDocument.Uemnode uemnode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.UemnodeDocument.Uemnode target = null;
                      target = (noNamespace.UemnodeDocument.Uemnode)get_store().find_element_user(UEMNODE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(uemnode);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "uemnode" element
                 */
                public noNamespace.UemnodeDocument.Uemnode insertNewUemnode(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.UemnodeDocument.Uemnode target = null;
                      target = (noNamespace.UemnodeDocument.Uemnode)get_store().insert_element_user(UEMNODE$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "uemnode" element
                 */
                public noNamespace.UemnodeDocument.Uemnode addNewUemnode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.UemnodeDocument.Uemnode target = null;
                      target = (noNamespace.UemnodeDocument.Uemnode)get_store().add_element_user(UEMNODE$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "uemnode" element
                 */
                public void removeUemnode(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(UEMNODE$0, i);
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
                 * Gets the "node_count" attribute
                 */
                public java.math.BigInteger getNodeCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODECOUNT$8);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NODECOUNT$8);
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
                      return get_store().find_attribute_user(NODECOUNT$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODECOUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODECOUNT$8);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NODECOUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NODECOUNT$8);
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
                      get_store().remove_attribute(NODECOUNT$8);
                    }
                }
                
                /**
                 * Gets the "exec" attribute
                 */
                public java.math.BigInteger getExec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXEC$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetExec()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXEC$10);
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
                      return get_store().find_attribute_user(EXEC$10) != null;
                    }
                }
                
                /**
                 * Sets the "exec" attribute
                 */
                public void setExec(java.math.BigInteger exec)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXEC$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXEC$10);
                      }
                      target.setBigIntegerValue(exec);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec" attribute
                 */
                public void xsetExec(org.apache.xmlbeans.XmlInteger exec)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXEC$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(EXEC$10);
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
                      get_store().remove_attribute(EXEC$10);
                    }
                }
                
                /**
                 * Gets the "compare_baseline" attribute
                 */
                public java.lang.String getCompareBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPAREBASELINE$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "compare_baseline" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCompareBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPAREBASELINE$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "compare_baseline" attribute
                 */
                public boolean isSetCompareBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COMPAREBASELINE$12) != null;
                    }
                }
                
                /**
                 * Sets the "compare_baseline" attribute
                 */
                public void setCompareBaseline(java.lang.String compareBaseline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPAREBASELINE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPAREBASELINE$12);
                      }
                      target.setStringValue(compareBaseline);
                    }
                }
                
                /**
                 * Sets (as xml) the "compare_baseline" attribute
                 */
                public void xsetCompareBaseline(org.apache.xmlbeans.XmlString compareBaseline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPAREBASELINE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMPAREBASELINE$12);
                      }
                      target.set(compareBaseline);
                    }
                }
                
                /**
                 * Unsets the "compare_baseline" attribute
                 */
                public void unsetCompareBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COMPAREBASELINE$12);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$14);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$14);
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
                      return get_store().find_attribute_user(START$14) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$14);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(START$14);
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
                      get_store().remove_attribute(START$14);
                    }
                }
                
                /**
                 * Gets the "requests" attribute
                 */
                public java.math.BigInteger getRequests()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTS$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "requests" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRequests()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTS$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "requests" attribute
                 */
                public boolean isSetRequests()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REQUESTS$16) != null;
                    }
                }
                
                /**
                 * Sets the "requests" attribute
                 */
                public void setRequests(java.math.BigInteger requests)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTS$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTS$16);
                      }
                      target.setBigIntegerValue(requests);
                    }
                }
                
                /**
                 * Sets (as xml) the "requests" attribute
                 */
                public void xsetRequests(org.apache.xmlbeans.XmlInteger requests)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTS$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTS$16);
                      }
                      target.set(requests);
                    }
                }
                
                /**
                 * Unsets the "requests" attribute
                 */
                public void unsetRequests()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REQUESTS$16);
                    }
                }
                
                /**
                 * Gets the "errors" attribute
                 */
                public java.math.BigInteger getErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORS$18);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "errors" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ERRORS$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "errors" attribute
                 */
                public boolean isSetErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORS$18) != null;
                    }
                }
                
                /**
                 * Sets the "errors" attribute
                 */
                public void setErrors(java.math.BigInteger errors)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORS$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORS$18);
                      }
                      target.setBigIntegerValue(errors);
                    }
                }
                
                /**
                 * Sets (as xml) the "errors" attribute
                 */
                public void xsetErrors(org.apache.xmlbeans.XmlInteger errors)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ERRORS$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ERRORS$18);
                      }
                      target.set(errors);
                    }
                }
                
                /**
                 * Unsets the "errors" attribute
                 */
                public void unsetErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORS$18);
                    }
                }
                
                /**
                 * Gets the "location" attribute
                 */
                public java.lang.String getLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "location" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "location" attribute
                 */
                public boolean isSetLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LOCATION$20) != null;
                    }
                }
                
                /**
                 * Sets the "location" attribute
                 */
                public void setLocation(java.lang.String location)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$20);
                      }
                      target.setStringValue(location);
                    }
                }
                
                /**
                 * Sets (as xml) the "location" attribute
                 */
                public void xsetLocation(org.apache.xmlbeans.XmlString location)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$20);
                      }
                      target.set(location);
                    }
                }
                
                /**
                 * Unsets the "location" attribute
                 */
                public void unsetLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LOCATION$20);
                    }
                }
                
                /**
                 * Gets the "browser" attribute
                 */
                public java.lang.String getBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BROWSER$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "browser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BROWSER$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "browser" attribute
                 */
                public boolean isSetBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BROWSER$22) != null;
                    }
                }
                
                /**
                 * Sets the "browser" attribute
                 */
                public void setBrowser(java.lang.String browser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BROWSER$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BROWSER$22);
                      }
                      target.setStringValue(browser);
                    }
                }
                
                /**
                 * Sets (as xml) the "browser" attribute
                 */
                public void xsetBrowser(org.apache.xmlbeans.XmlString browser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BROWSER$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BROWSER$22);
                      }
                      target.set(browser);
                    }
                }
                
                /**
                 * Unsets the "browser" attribute
                 */
                public void unsetBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BROWSER$22);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAGID$24);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TAGID$24);
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
                      return get_store().find_attribute_user(TAGID$24) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAGID$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TAGID$24);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(TAGID$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(TAGID$24);
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
                      get_store().remove_attribute(TAGID$24);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPPEDEVENTS$26);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SKIPPEDEVENTS$26);
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
                      return get_store().find_attribute_user(SKIPPEDEVENTS$26) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPPEDEVENTS$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKIPPEDEVENTS$26);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SKIPPEDEVENTS$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SKIPPEDEVENTS$26);
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
                      get_store().remove_attribute(SKIPPEDEVENTS$26);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALSTATE$28);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNALSTATE$28);
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
                      return get_store().find_attribute_user(INTERNALSTATE$28) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERNALSTATE$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERNALSTATE$28);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERNALSTATE$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INTERNALSTATE$28);
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
                      get_store().remove_attribute(INTERNALSTATE$28);
                    }
                }
                
                /**
                 * Gets the "networkduration" attribute
                 */
                public double getNetworkduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKDURATION$30);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "networkduration" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetNetworkduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(NETWORKDURATION$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "networkduration" attribute
                 */
                public boolean isSetNetworkduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NETWORKDURATION$30) != null;
                    }
                }
                
                /**
                 * Sets the "networkduration" attribute
                 */
                public void setNetworkduration(double networkduration)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKDURATION$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NETWORKDURATION$30);
                      }
                      target.setDoubleValue(networkduration);
                    }
                }
                
                /**
                 * Sets (as xml) the "networkduration" attribute
                 */
                public void xsetNetworkduration(org.apache.xmlbeans.XmlDouble networkduration)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(NETWORKDURATION$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(NETWORKDURATION$30);
                      }
                      target.set(networkduration);
                    }
                }
                
                /**
                 * Unsets the "networkduration" attribute
                 */
                public void unsetNetworkduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NETWORKDURATION$30);
                    }
                }
                
                /**
                 * Gets the "serverduration" attribute
                 */
                public double getServerduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERDURATION$32);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serverduration" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetServerduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERVERDURATION$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "serverduration" attribute
                 */
                public boolean isSetServerduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERVERDURATION$32) != null;
                    }
                }
                
                /**
                 * Sets the "serverduration" attribute
                 */
                public void setServerduration(double serverduration)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERDURATION$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERDURATION$32);
                      }
                      target.setDoubleValue(serverduration);
                    }
                }
                
                /**
                 * Sets (as xml) the "serverduration" attribute
                 */
                public void xsetServerduration(org.apache.xmlbeans.XmlDouble serverduration)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERVERDURATION$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SERVERDURATION$32);
                      }
                      target.set(serverduration);
                    }
                }
                
                /**
                 * Unsets the "serverduration" attribute
                 */
                public void unsetServerduration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERVERDURATION$32);
                    }
                }
                
                /**
                 * Gets the "response_time" attribute
                 */
                public java.lang.String getResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetResponseTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIME$34);
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
                      return get_store().find_attribute_user(RESPONSETIME$34) != null;
                    }
                }
                
                /**
                 * Sets the "response_time" attribute
                 */
                public void setResponseTime(java.lang.String responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIME$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIME$34);
                      }
                      target.setStringValue(responseTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                public void xsetResponseTime(org.apache.xmlbeans.XmlString responseTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSETIME$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESPONSETIME$34);
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
                      get_store().remove_attribute(RESPONSETIME$34);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$36);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$36);
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
                      return get_store().find_attribute_user(CLIENTIP$36) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTIP$36);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTIP$36);
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
                      get_store().remove_attribute(CLIENTIP$36);
                    }
                }
                
                /**
                 * Gets the "browser_errors" attribute
                 */
                public java.math.BigInteger getBrowserErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BROWSERERRORS$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "browser_errors" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBrowserErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BROWSERERRORS$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "browser_errors" attribute
                 */
                public boolean isSetBrowserErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BROWSERERRORS$38) != null;
                    }
                }
                
                /**
                 * Sets the "browser_errors" attribute
                 */
                public void setBrowserErrors(java.math.BigInteger browserErrors)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BROWSERERRORS$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BROWSERERRORS$38);
                      }
                      target.setBigIntegerValue(browserErrors);
                    }
                }
                
                /**
                 * Sets (as xml) the "browser_errors" attribute
                 */
                public void xsetBrowserErrors(org.apache.xmlbeans.XmlInteger browserErrors)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BROWSERERRORS$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BROWSERERRORS$38);
                      }
                      target.set(browserErrors);
                    }
                }
                
                /**
                 * Unsets the "browser_errors" attribute
                 */
                public void unsetBrowserErrors()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BROWSERERRORS$38);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$40);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$40);
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
                      return get_store().find_attribute_user(APPLICATION$40) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATION$40);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATION$40);
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
                      get_store().remove_attribute(APPLICATION$40);
                    }
                }
                
                /**
                 * Gets the "bandwidth" attribute
                 */
                public java.lang.String getBandwidth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWIDTH$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bandwidth" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBandwidth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWIDTH$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "bandwidth" attribute
                 */
                public boolean isSetBandwidth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BANDWIDTH$42) != null;
                    }
                }
                
                /**
                 * Sets the "bandwidth" attribute
                 */
                public void setBandwidth(java.lang.String bandwidth)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWIDTH$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANDWIDTH$42);
                      }
                      target.setStringValue(bandwidth);
                    }
                }
                
                /**
                 * Sets (as xml) the "bandwidth" attribute
                 */
                public void xsetBandwidth(org.apache.xmlbeans.XmlString bandwidth)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWIDTH$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BANDWIDTH$42);
                      }
                      target.set(bandwidth);
                    }
                }
                
                /**
                 * Unsets the "bandwidth" attribute
                 */
                public void unsetBandwidth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BANDWIDTH$42);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$44);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$44);
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
                      return get_store().find_attribute_user(VISITID$44) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISITID$44);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISITID$44);
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
                      get_store().remove_attribute(VISITID$44);
                    }
                }
                
                /**
                 * Gets the "domain" attribute
                 */
                public java.lang.String getDomain()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$46);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "domain" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDomain()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "domain" attribute
                 */
                public boolean isSetDomain()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DOMAIN$46) != null;
                    }
                }
                
                /**
                 * Sets the "domain" attribute
                 */
                public void setDomain(java.lang.String domain)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMAIN$46);
                      }
                      target.setStringValue(domain);
                    }
                }
                
                /**
                 * Sets (as xml) the "domain" attribute
                 */
                public void xsetDomain(org.apache.xmlbeans.XmlString domain)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOMAIN$46);
                      }
                      target.set(domain);
                    }
                }
                
                /**
                 * Unsets the "domain" attribute
                 */
                public void unsetDomain()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DOMAIN$46);
                    }
                }
                
                /**
                 * Gets the "purepath_user_experience" attribute
                 */
                public java.lang.String getPurepathUserExperience()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUREPATHUSEREXPERIENCE$48);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "purepath_user_experience" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPurepathUserExperience()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUREPATHUSEREXPERIENCE$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "purepath_user_experience" attribute
                 */
                public boolean isSetPurepathUserExperience()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PUREPATHUSEREXPERIENCE$48) != null;
                    }
                }
                
                /**
                 * Sets the "purepath_user_experience" attribute
                 */
                public void setPurepathUserExperience(java.lang.String purepathUserExperience)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUREPATHUSEREXPERIENCE$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUREPATHUSEREXPERIENCE$48);
                      }
                      target.setStringValue(purepathUserExperience);
                    }
                }
                
                /**
                 * Sets (as xml) the "purepath_user_experience" attribute
                 */
                public void xsetPurepathUserExperience(org.apache.xmlbeans.XmlString purepathUserExperience)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PUREPATHUSEREXPERIENCE$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PUREPATHUSEREXPERIENCE$48);
                      }
                      target.set(purepathUserExperience);
                    }
                }
                
                /**
                 * Unsets the "purepath_user_experience" attribute
                 */
                public void unsetPurepathUserExperience()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PUREPATHUSEREXPERIENCE$48);
                    }
                }
                
                /**
                 * Gets the "action_group" attribute
                 */
                public java.lang.String getActionGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONGROUP$50);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "action_group" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetActionGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONGROUP$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "action_group" attribute
                 */
                public boolean isSetActionGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ACTIONGROUP$50) != null;
                    }
                }
                
                /**
                 * Sets the "action_group" attribute
                 */
                public void setActionGroup(java.lang.String actionGroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONGROUP$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONGROUP$50);
                      }
                      target.setStringValue(actionGroup);
                    }
                }
                
                /**
                 * Sets (as xml) the "action_group" attribute
                 */
                public void xsetActionGroup(org.apache.xmlbeans.XmlString actionGroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONGROUP$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTIONGROUP$50);
                      }
                      target.set(actionGroup);
                    }
                }
                
                /**
                 * Unsets the "action_group" attribute
                 */
                public void unsetActionGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ACTIONGROUP$50);
                    }
                }
                
                /**
                 * Gets the "baseline" attribute
                 */
                public double getBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASELINE$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "baseline" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BASELINE$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "baseline" attribute
                 */
                public boolean isSetBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BASELINE$52) != null;
                    }
                }
                
                /**
                 * Sets the "baseline" attribute
                 */
                public void setBaseline(double baseline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASELINE$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASELINE$52);
                      }
                      target.setDoubleValue(baseline);
                    }
                }
                
                /**
                 * Sets (as xml) the "baseline" attribute
                 */
                public void xsetBaseline(org.apache.xmlbeans.XmlDouble baseline)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(BASELINE$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(BASELINE$52);
                      }
                      target.set(baseline);
                    }
                }
                
                /**
                 * Unsets the "baseline" attribute
                 */
                public void unsetBaseline()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BASELINE$52);
                    }
                }
                
                /**
                 * Gets the "perf_metric" attribute
                 */
                public java.lang.String getPerfMetric()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFMETRIC$54);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "perf_metric" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPerfMetric()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFMETRIC$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "perf_metric" attribute
                 */
                public boolean isSetPerfMetric()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PERFMETRIC$54) != null;
                    }
                }
                
                /**
                 * Sets the "perf_metric" attribute
                 */
                public void setPerfMetric(java.lang.String perfMetric)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFMETRIC$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFMETRIC$54);
                      }
                      target.setStringValue(perfMetric);
                    }
                }
                
                /**
                 * Sets (as xml) the "perf_metric" attribute
                 */
                public void xsetPerfMetric(org.apache.xmlbeans.XmlString perfMetric)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFMETRIC$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERFMETRIC$54);
                      }
                      target.set(perfMetric);
                    }
                }
                
                /**
                 * Unsets the "perf_metric" attribute
                 */
                public void unsetPerfMetric()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PERFMETRIC$54);
                    }
                }
                
                /**
                 * Gets the "perf_metric_value" attribute
                 */
                public double getPerfMetricValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFMETRICVALUE$56);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "perf_metric_value" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPerfMetricValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PERFMETRICVALUE$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "perf_metric_value" attribute
                 */
                public boolean isSetPerfMetricValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PERFMETRICVALUE$56) != null;
                    }
                }
                
                /**
                 * Sets the "perf_metric_value" attribute
                 */
                public void setPerfMetricValue(double perfMetricValue)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFMETRICVALUE$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFMETRICVALUE$56);
                      }
                      target.setDoubleValue(perfMetricValue);
                    }
                }
                
                /**
                 * Sets (as xml) the "perf_metric_value" attribute
                 */
                public void xsetPerfMetricValue(org.apache.xmlbeans.XmlDouble perfMetricValue)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PERFMETRICVALUE$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PERFMETRICVALUE$56);
                      }
                      target.set(perfMetricValue);
                    }
                }
                
                /**
                 * Unsets the "perf_metric_value" attribute
                 */
                public void unsetPerfMetricValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PERFMETRICVALUE$56);
                    }
                }
                
                /**
                 * Gets the "ux_threshold_factor_reason" attribute
                 */
                public java.lang.String getUxThresholdFactorReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UXTHRESHOLDFACTORREASON$58);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ux_threshold_factor_reason" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUxThresholdFactorReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UXTHRESHOLDFACTORREASON$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "ux_threshold_factor_reason" attribute
                 */
                public boolean isSetUxThresholdFactorReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(UXTHRESHOLDFACTORREASON$58) != null;
                    }
                }
                
                /**
                 * Sets the "ux_threshold_factor_reason" attribute
                 */
                public void setUxThresholdFactorReason(java.lang.String uxThresholdFactorReason)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UXTHRESHOLDFACTORREASON$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UXTHRESHOLDFACTORREASON$58);
                      }
                      target.setStringValue(uxThresholdFactorReason);
                    }
                }
                
                /**
                 * Sets (as xml) the "ux_threshold_factor_reason" attribute
                 */
                public void xsetUxThresholdFactorReason(org.apache.xmlbeans.XmlString uxThresholdFactorReason)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UXTHRESHOLDFACTORREASON$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UXTHRESHOLDFACTORREASON$58);
                      }
                      target.set(uxThresholdFactorReason);
                    }
                }
                
                /**
                 * Unsets the "ux_threshold_factor_reason" attribute
                 */
                public void unsetUxThresholdFactorReason()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(UXTHRESHOLDFACTORREASON$58);
                    }
                }
                
                /**
                 * Gets the "ux_threshold_factor" attribute
                 */
                public double getUxThresholdFactor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UXTHRESHOLDFACTOR$60);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ux_threshold_factor" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetUxThresholdFactor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(UXTHRESHOLDFACTOR$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "ux_threshold_factor" attribute
                 */
                public boolean isSetUxThresholdFactor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(UXTHRESHOLDFACTOR$60) != null;
                    }
                }
                
                /**
                 * Sets the "ux_threshold_factor" attribute
                 */
                public void setUxThresholdFactor(double uxThresholdFactor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UXTHRESHOLDFACTOR$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UXTHRESHOLDFACTOR$60);
                      }
                      target.setDoubleValue(uxThresholdFactor);
                    }
                }
                
                /**
                 * Sets (as xml) the "ux_threshold_factor" attribute
                 */
                public void xsetUxThresholdFactor(org.apache.xmlbeans.XmlDouble uxThresholdFactor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(UXTHRESHOLDFACTOR$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(UXTHRESHOLDFACTOR$60);
                      }
                      target.set(uxThresholdFactor);
                    }
                }
                
                /**
                 * Unsets the "ux_threshold_factor" attribute
                 */
                public void unsetUxThresholdFactor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(UXTHRESHOLDFACTOR$60);
                    }
                }
                
                /**
                 * Gets the "visually_complete_time" attribute
                 */
                public java.math.BigInteger getVisuallyCompleteTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISUALLYCOMPLETETIME$62);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "visually_complete_time" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetVisuallyCompleteTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISUALLYCOMPLETETIME$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "visually_complete_time" attribute
                 */
                public boolean isSetVisuallyCompleteTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VISUALLYCOMPLETETIME$62) != null;
                    }
                }
                
                /**
                 * Sets the "visually_complete_time" attribute
                 */
                public void setVisuallyCompleteTime(java.math.BigInteger visuallyCompleteTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISUALLYCOMPLETETIME$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISUALLYCOMPLETETIME$62);
                      }
                      target.setBigIntegerValue(visuallyCompleteTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "visually_complete_time" attribute
                 */
                public void xsetVisuallyCompleteTime(org.apache.xmlbeans.XmlInteger visuallyCompleteTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISUALLYCOMPLETETIME$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VISUALLYCOMPLETETIME$62);
                      }
                      target.set(visuallyCompleteTime);
                    }
                }
                
                /**
                 * Unsets the "visually_complete_time" attribute
                 */
                public void unsetVisuallyCompleteTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VISUALLYCOMPLETETIME$62);
                    }
                }
                
                /**
                 * Gets the "speed_index" attribute
                 */
                public java.math.BigInteger getSpeedIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEEDINDEX$64);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "speed_index" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSpeedIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SPEEDINDEX$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "speed_index" attribute
                 */
                public boolean isSetSpeedIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SPEEDINDEX$64) != null;
                    }
                }
                
                /**
                 * Sets the "speed_index" attribute
                 */
                public void setSpeedIndex(java.math.BigInteger speedIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEEDINDEX$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPEEDINDEX$64);
                      }
                      target.setBigIntegerValue(speedIndex);
                    }
                }
                
                /**
                 * Sets (as xml) the "speed_index" attribute
                 */
                public void xsetSpeedIndex(org.apache.xmlbeans.XmlInteger speedIndex)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SPEEDINDEX$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SPEEDINDEX$64);
                      }
                      target.set(speedIndex);
                    }
                }
                
                /**
                 * Unsets the "speed_index" attribute
                 */
                public void unsetSpeedIndex()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SPEEDINDEX$64);
                    }
                }
            }
        }
    }
}
