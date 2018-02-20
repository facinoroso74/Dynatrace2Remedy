/*
 * An XML document type.
 * Localname: taggedwebrequestsdashlet
 * Namespace: 
 * Java type: noNamespace.TaggedwebrequestsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one taggedwebrequestsdashlet(@) element.
 *
 * This is a complex type.
 */
public class TaggedwebrequestsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TaggedwebrequestsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaggedwebrequestsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAGGEDWEBREQUESTSDASHLET$0 = 
        new javax.xml.namespace.QName("", "taggedwebrequestsdashlet");
    
    
    /**
     * Gets the "taggedwebrequestsdashlet" element
     */
    public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet getTaggedwebrequestsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet target = null;
            target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().find_element_user(TAGGEDWEBREQUESTSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taggedwebrequestsdashlet" element
     */
    public void setTaggedwebrequestsdashlet(noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet taggedwebrequestsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet target = null;
            target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().find_element_user(TAGGEDWEBREQUESTSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().add_element_user(TAGGEDWEBREQUESTSDASHLET$0);
            }
            target.set(taggedwebrequestsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "taggedwebrequestsdashlet" element
     */
    public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet addNewTaggedwebrequestsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet target = null;
            target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().add_element_user(TAGGEDWEBREQUESTSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML taggedwebrequestsdashlet(@).
     *
     * This is a complex type.
     */
    public static class TaggedwebrequestsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public TaggedwebrequestsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName TAGGEDWEBREQUESTS$4 = 
            new javax.xml.namespace.QName("", "taggedwebrequests");
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
         * Gets the "taggedwebrequests" element
         */
        public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests getTaggedwebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests target = null;
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests)get_store().find_element_user(TAGGEDWEBREQUESTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "taggedwebrequests" element
         */
        public boolean isSetTaggedwebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAGGEDWEBREQUESTS$4) != 0;
            }
        }
        
        /**
         * Sets the "taggedwebrequests" element
         */
        public void setTaggedwebrequests(noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests taggedwebrequests)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests target = null;
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests)get_store().find_element_user(TAGGEDWEBREQUESTS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests)get_store().add_element_user(TAGGEDWEBREQUESTS$4);
                }
                target.set(taggedwebrequests);
            }
        }
        
        /**
         * Appends and returns a new empty "taggedwebrequests" element
         */
        public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests addNewTaggedwebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests target = null;
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests)get_store().add_element_user(TAGGEDWEBREQUESTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "taggedwebrequests" element
         */
        public void unsetTaggedwebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAGGEDWEBREQUESTS$4, 0);
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
         * An XML taggedwebrequests(@).
         *
         * This is a complex type.
         */
        public static class TaggedwebrequestsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests
        {
            private static final long serialVersionUID = 1L;
            
            public TaggedwebrequestsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TAGGEDWEBREQUEST$0 = 
                new javax.xml.namespace.QName("", "taggedwebrequest");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "taggedwebrequest" elements
             */
            public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest[] getTaggedwebrequestArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(TAGGEDWEBREQUEST$0, targetList);
                    noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest[] result = new noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "taggedwebrequest" element
             */
            public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest getTaggedwebrequestArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest target = null;
                    target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest)get_store().find_element_user(TAGGEDWEBREQUEST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "taggedwebrequest" element
             */
            public int sizeOfTaggedwebrequestArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TAGGEDWEBREQUEST$0);
                }
            }
            
            /**
             * Sets array of all "taggedwebrequest" element
             */
            public void setTaggedwebrequestArray(noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest[] taggedwebrequestArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(taggedwebrequestArray, TAGGEDWEBREQUEST$0);
                }
            }
            
            /**
             * Sets ith "taggedwebrequest" element
             */
            public void setTaggedwebrequestArray(int i, noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest taggedwebrequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest target = null;
                    target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest)get_store().find_element_user(TAGGEDWEBREQUEST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(taggedwebrequest);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "taggedwebrequest" element
             */
            public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest insertNewTaggedwebrequest(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest target = null;
                    target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest)get_store().insert_element_user(TAGGEDWEBREQUEST$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "taggedwebrequest" element
             */
            public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest addNewTaggedwebrequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest target = null;
                    target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest)get_store().add_element_user(TAGGEDWEBREQUEST$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "taggedwebrequest" element
             */
            public void removeTaggedwebrequest(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TAGGEDWEBREQUEST$0, i);
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
             * An XML taggedwebrequest(@).
             *
             * This is a complex type.
             */
            public static class TaggedwebrequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet.Taggedwebrequests.Taggedwebrequest
            {
                private static final long serialVersionUID = 1L;
                
                public TaggedwebrequestImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName TIMERNAME$2 = 
                    new javax.xml.namespace.QName("", "timername");
                private static final javax.xml.namespace.QName VIRTUALUSER$4 = 
                    new javax.xml.namespace.QName("", "virtualuser");
                private static final javax.xml.namespace.QName PAGECONTEXT$6 = 
                    new javax.xml.namespace.QName("", "pagecontext");
                private static final javax.xml.namespace.QName COUNT$8 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName AVG$10 = 
                    new javax.xml.namespace.QName("", "avg");
                private static final javax.xml.namespace.QName MIN$12 = 
                    new javax.xml.namespace.QName("", "min");
                private static final javax.xml.namespace.QName MAX$14 = 
                    new javax.xml.namespace.QName("", "max");
                private static final javax.xml.namespace.QName SUM$16 = 
                    new javax.xml.namespace.QName("", "sum");
                private static final javax.xml.namespace.QName SENTSIZEAVG$18 = 
                    new javax.xml.namespace.QName("", "sent_size_avg");
                private static final javax.xml.namespace.QName SENTSIZEMIN$20 = 
                    new javax.xml.namespace.QName("", "sent_size_min");
                private static final javax.xml.namespace.QName SENTSIZEMAX$22 = 
                    new javax.xml.namespace.QName("", "sent_size_max");
                private static final javax.xml.namespace.QName SENTSIZESUM$24 = 
                    new javax.xml.namespace.QName("", "sent_size_sum");
                private static final javax.xml.namespace.QName RCVDSIZEAVG$26 = 
                    new javax.xml.namespace.QName("", "rcvd_size_avg");
                private static final javax.xml.namespace.QName RCVDSIZEMIN$28 = 
                    new javax.xml.namespace.QName("", "rcvd_size_min");
                private static final javax.xml.namespace.QName RCVDSIZEMAX$30 = 
                    new javax.xml.namespace.QName("", "rcvd_size_max");
                private static final javax.xml.namespace.QName RCVDSIZESUM$32 = 
                    new javax.xml.namespace.QName("", "rcvd_size_sum");
                private static final javax.xml.namespace.QName CPUAVG$34 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUMIN$36 = 
                    new javax.xml.namespace.QName("", "cpu_min");
                private static final javax.xml.namespace.QName CPUMAX$38 = 
                    new javax.xml.namespace.QName("", "cpu_max");
                private static final javax.xml.namespace.QName CPUSUM$40 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                private static final javax.xml.namespace.QName SOURCEID$42 = 
                    new javax.xml.namespace.QName("", "sourceid");
                private static final javax.xml.namespace.QName GEOREGION$44 = 
                    new javax.xml.namespace.QName("", "georegion");
                private static final javax.xml.namespace.QName AGENTNAME$46 = 
                    new javax.xml.namespace.QName("", "agentname");
                private static final javax.xml.namespace.QName SCRIPTNAME$48 = 
                    new javax.xml.namespace.QName("", "scriptname");
                private static final javax.xml.namespace.QName TESTNAME$50 = 
                    new javax.xml.namespace.QName("", "testname");
                private static final javax.xml.namespace.QName ERRORSTATE$52 = 
                    new javax.xml.namespace.QName("", "error_state");
                private static final javax.xml.namespace.QName FAILURERATE$54 = 
                    new javax.xml.namespace.QName("", "failure_rate");
                
                
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
                 * Gets the "timername" attribute
                 */
                public java.lang.String getTimername()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMERNAME$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "timername" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTimername()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMERNAME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "timername" attribute
                 */
                public boolean isSetTimername()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TIMERNAME$2) != null;
                    }
                }
                
                /**
                 * Sets the "timername" attribute
                 */
                public void setTimername(java.lang.String timername)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMERNAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMERNAME$2);
                      }
                      target.setStringValue(timername);
                    }
                }
                
                /**
                 * Sets (as xml) the "timername" attribute
                 */
                public void xsetTimername(org.apache.xmlbeans.XmlString timername)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMERNAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMERNAME$2);
                      }
                      target.set(timername);
                    }
                }
                
                /**
                 * Unsets the "timername" attribute
                 */
                public void unsetTimername()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TIMERNAME$2);
                    }
                }
                
                /**
                 * Gets the "virtualuser" attribute
                 */
                public java.lang.String getVirtualuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALUSER$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "virtualuser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetVirtualuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIRTUALUSER$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "virtualuser" attribute
                 */
                public boolean isSetVirtualuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(VIRTUALUSER$4) != null;
                    }
                }
                
                /**
                 * Sets the "virtualuser" attribute
                 */
                public void setVirtualuser(java.lang.String virtualuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALUSER$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIRTUALUSER$4);
                      }
                      target.setStringValue(virtualuser);
                    }
                }
                
                /**
                 * Sets (as xml) the "virtualuser" attribute
                 */
                public void xsetVirtualuser(org.apache.xmlbeans.XmlString virtualuser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIRTUALUSER$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIRTUALUSER$4);
                      }
                      target.set(virtualuser);
                    }
                }
                
                /**
                 * Unsets the "virtualuser" attribute
                 */
                public void unsetVirtualuser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(VIRTUALUSER$4);
                    }
                }
                
                /**
                 * Gets the "pagecontext" attribute
                 */
                public java.lang.String getPagecontext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGECONTEXT$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pagecontext" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPagecontext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGECONTEXT$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "pagecontext" attribute
                 */
                public boolean isSetPagecontext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PAGECONTEXT$6) != null;
                    }
                }
                
                /**
                 * Sets the "pagecontext" attribute
                 */
                public void setPagecontext(java.lang.String pagecontext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGECONTEXT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGECONTEXT$6);
                      }
                      target.setStringValue(pagecontext);
                    }
                }
                
                /**
                 * Sets (as xml) the "pagecontext" attribute
                 */
                public void xsetPagecontext(org.apache.xmlbeans.XmlString pagecontext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGECONTEXT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGECONTEXT$6);
                      }
                      target.set(pagecontext);
                    }
                }
                
                /**
                 * Unsets the "pagecontext" attribute
                 */
                public void unsetPagecontext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PAGECONTEXT$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$8);
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
                      return get_store().find_attribute_user(COUNT$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$8);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$8);
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
                      get_store().remove_attribute(COUNT$8);
                    }
                }
                
                /**
                 * Gets the "avg" attribute
                 */
                public double getAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$10);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "avg" attribute
                 */
                public boolean isSetAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AVG$10) != null;
                    }
                }
                
                /**
                 * Sets the "avg" attribute
                 */
                public void setAvg(double avg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVG$10);
                      }
                      target.setDoubleValue(avg);
                    }
                }
                
                /**
                 * Sets (as xml) the "avg" attribute
                 */
                public void xsetAvg(org.apache.xmlbeans.XmlDouble avg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AVG$10);
                      }
                      target.set(avg);
                    }
                }
                
                /**
                 * Unsets the "avg" attribute
                 */
                public void unsetAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AVG$10);
                    }
                }
                
                /**
                 * Gets the "min" attribute
                 */
                public double getMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "min" attribute
                 */
                public boolean isSetMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MIN$12) != null;
                    }
                }
                
                /**
                 * Sets the "min" attribute
                 */
                public void setMin(double min)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$12);
                      }
                      target.setDoubleValue(min);
                    }
                }
                
                /**
                 * Sets (as xml) the "min" attribute
                 */
                public void xsetMin(org.apache.xmlbeans.XmlDouble min)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MIN$12);
                      }
                      target.set(min);
                    }
                }
                
                /**
                 * Unsets the "min" attribute
                 */
                public void unsetMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MIN$12);
                    }
                }
                
                /**
                 * Gets the "max" attribute
                 */
                public double getMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "max" attribute
                 */
                public boolean isSetMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MAX$14) != null;
                    }
                }
                
                /**
                 * Sets the "max" attribute
                 */
                public void setMax(double max)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$14);
                      }
                      target.setDoubleValue(max);
                    }
                }
                
                /**
                 * Sets (as xml) the "max" attribute
                 */
                public void xsetMax(org.apache.xmlbeans.XmlDouble max)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAX$14);
                      }
                      target.set(max);
                    }
                }
                
                /**
                 * Unsets the "max" attribute
                 */
                public void unsetMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MAX$14);
                    }
                }
                
                /**
                 * Gets the "sum" attribute
                 */
                public double getSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "sum" attribute
                 */
                public boolean isSetSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUM$16) != null;
                    }
                }
                
                /**
                 * Sets the "sum" attribute
                 */
                public void setSum(double sum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUM$16);
                      }
                      target.setDoubleValue(sum);
                    }
                }
                
                /**
                 * Sets (as xml) the "sum" attribute
                 */
                public void xsetSum(org.apache.xmlbeans.XmlDouble sum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUM$16);
                      }
                      target.set(sum);
                    }
                }
                
                /**
                 * Unsets the "sum" attribute
                 */
                public void unsetSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUM$16);
                    }
                }
                
                /**
                 * Gets the "sent_size_avg" attribute
                 */
                public java.math.BigInteger getSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEAVG$18);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZEAVG$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_avg" attribute
                 */
                public boolean isSetSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZEAVG$18) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_avg" attribute
                 */
                public void setSentSizeAvg(java.math.BigInteger sentSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZEAVG$18);
                      }
                      target.setBigIntegerValue(sentSizeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_avg" attribute
                 */
                public void xsetSentSizeAvg(org.apache.xmlbeans.XmlInteger sentSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZEAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTSIZEAVG$18);
                      }
                      target.set(sentSizeAvg);
                    }
                }
                
                /**
                 * Unsets the "sent_size_avg" attribute
                 */
                public void unsetSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZEAVG$18);
                    }
                }
                
                /**
                 * Gets the "sent_size_min" attribute
                 */
                public java.math.BigInteger getSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMIN$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZEMIN$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_min" attribute
                 */
                public boolean isSetSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZEMIN$20) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_min" attribute
                 */
                public void setSentSizeMin(java.math.BigInteger sentSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMIN$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZEMIN$20);
                      }
                      target.setBigIntegerValue(sentSizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_min" attribute
                 */
                public void xsetSentSizeMin(org.apache.xmlbeans.XmlInteger sentSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZEMIN$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTSIZEMIN$20);
                      }
                      target.set(sentSizeMin);
                    }
                }
                
                /**
                 * Unsets the "sent_size_min" attribute
                 */
                public void unsetSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZEMIN$20);
                    }
                }
                
                /**
                 * Gets the "sent_size_max" attribute
                 */
                public java.math.BigInteger getSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMAX$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZEMAX$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_max" attribute
                 */
                public boolean isSetSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZEMAX$22) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_max" attribute
                 */
                public void setSentSizeMax(java.math.BigInteger sentSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZEMAX$22);
                      }
                      target.setBigIntegerValue(sentSizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_max" attribute
                 */
                public void xsetSentSizeMax(org.apache.xmlbeans.XmlInteger sentSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZEMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTSIZEMAX$22);
                      }
                      target.set(sentSizeMax);
                    }
                }
                
                /**
                 * Unsets the "sent_size_max" attribute
                 */
                public void unsetSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZEMAX$22);
                    }
                }
                
                /**
                 * Gets the "sent_size_sum" attribute
                 */
                public java.math.BigInteger getSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZESUM$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZESUM$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_sum" attribute
                 */
                public boolean isSetSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZESUM$24) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_sum" attribute
                 */
                public void setSentSizeSum(java.math.BigInteger sentSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZESUM$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZESUM$24);
                      }
                      target.setBigIntegerValue(sentSizeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_sum" attribute
                 */
                public void xsetSentSizeSum(org.apache.xmlbeans.XmlInteger sentSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSIZESUM$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTSIZESUM$24);
                      }
                      target.set(sentSizeSum);
                    }
                }
                
                /**
                 * Unsets the "sent_size_sum" attribute
                 */
                public void unsetSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZESUM$24);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_avg" attribute
                 */
                public java.math.BigInteger getRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEAVG$26);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZEAVG$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_avg" attribute
                 */
                public boolean isSetRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZEAVG$26) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_avg" attribute
                 */
                public void setRcvdSizeAvg(java.math.BigInteger rcvdSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZEAVG$26);
                      }
                      target.setBigIntegerValue(rcvdSizeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_avg" attribute
                 */
                public void xsetRcvdSizeAvg(org.apache.xmlbeans.XmlInteger rcvdSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZEAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDSIZEAVG$26);
                      }
                      target.set(rcvdSizeAvg);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_avg" attribute
                 */
                public void unsetRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZEAVG$26);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_min" attribute
                 */
                public java.math.BigInteger getRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMIN$28);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZEMIN$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_min" attribute
                 */
                public boolean isSetRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZEMIN$28) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_min" attribute
                 */
                public void setRcvdSizeMin(java.math.BigInteger rcvdSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMIN$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZEMIN$28);
                      }
                      target.setBigIntegerValue(rcvdSizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_min" attribute
                 */
                public void xsetRcvdSizeMin(org.apache.xmlbeans.XmlInteger rcvdSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZEMIN$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDSIZEMIN$28);
                      }
                      target.set(rcvdSizeMin);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_min" attribute
                 */
                public void unsetRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZEMIN$28);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_max" attribute
                 */
                public java.math.BigInteger getRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMAX$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZEMAX$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_max" attribute
                 */
                public boolean isSetRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZEMAX$30) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_max" attribute
                 */
                public void setRcvdSizeMax(java.math.BigInteger rcvdSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMAX$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZEMAX$30);
                      }
                      target.setBigIntegerValue(rcvdSizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_max" attribute
                 */
                public void xsetRcvdSizeMax(org.apache.xmlbeans.XmlInteger rcvdSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZEMAX$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDSIZEMAX$30);
                      }
                      target.set(rcvdSizeMax);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_max" attribute
                 */
                public void unsetRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZEMAX$30);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_sum" attribute
                 */
                public java.math.BigInteger getRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZESUM$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZESUM$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_sum" attribute
                 */
                public boolean isSetRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZESUM$32) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_sum" attribute
                 */
                public void setRcvdSizeSum(java.math.BigInteger rcvdSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZESUM$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZESUM$32);
                      }
                      target.setBigIntegerValue(rcvdSizeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_sum" attribute
                 */
                public void xsetRcvdSizeSum(org.apache.xmlbeans.XmlInteger rcvdSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSIZESUM$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDSIZESUM$32);
                      }
                      target.set(rcvdSizeSum);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_sum" attribute
                 */
                public void unsetRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZESUM$32);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$34);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$34);
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
                      return get_store().find_attribute_user(CPUAVG$34) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$34);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$34);
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
                      get_store().remove_attribute(CPUAVG$34);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$36);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$36);
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
                      return get_store().find_attribute_user(CPUMIN$36) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMIN$36);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMIN$36);
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
                      get_store().remove_attribute(CPUMIN$36);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$38);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$38);
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
                      return get_store().find_attribute_user(CPUMAX$38) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMAX$38);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMAX$38);
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
                      get_store().remove_attribute(CPUMAX$38);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$40);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$40);
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
                      return get_store().find_attribute_user(CPUSUM$40) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$40);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$40);
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
                      get_store().remove_attribute(CPUSUM$40);
                    }
                }
                
                /**
                 * Gets the "sourceid" attribute
                 */
                public java.lang.String getSourceid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEID$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sourceid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSourceid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCEID$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "sourceid" attribute
                 */
                public boolean isSetSourceid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SOURCEID$42) != null;
                    }
                }
                
                /**
                 * Sets the "sourceid" attribute
                 */
                public void setSourceid(java.lang.String sourceid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEID$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEID$42);
                      }
                      target.setStringValue(sourceid);
                    }
                }
                
                /**
                 * Sets (as xml) the "sourceid" attribute
                 */
                public void xsetSourceid(org.apache.xmlbeans.XmlString sourceid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCEID$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCEID$42);
                      }
                      target.set(sourceid);
                    }
                }
                
                /**
                 * Unsets the "sourceid" attribute
                 */
                public void unsetSourceid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SOURCEID$42);
                    }
                }
                
                /**
                 * Gets the "georegion" attribute
                 */
                public java.lang.String getGeoregion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOREGION$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "georegion" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetGeoregion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOREGION$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "georegion" attribute
                 */
                public boolean isSetGeoregion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(GEOREGION$44) != null;
                    }
                }
                
                /**
                 * Sets the "georegion" attribute
                 */
                public void setGeoregion(java.lang.String georegion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOREGION$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOREGION$44);
                      }
                      target.setStringValue(georegion);
                    }
                }
                
                /**
                 * Sets (as xml) the "georegion" attribute
                 */
                public void xsetGeoregion(org.apache.xmlbeans.XmlString georegion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOREGION$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOREGION$44);
                      }
                      target.set(georegion);
                    }
                }
                
                /**
                 * Unsets the "georegion" attribute
                 */
                public void unsetGeoregion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(GEOREGION$44);
                    }
                }
                
                /**
                 * Gets the "agentname" attribute
                 */
                public java.lang.String getAgentname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTNAME$46);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "agentname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAgentname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTNAME$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "agentname" attribute
                 */
                public boolean isSetAgentname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AGENTNAME$46) != null;
                    }
                }
                
                /**
                 * Sets the "agentname" attribute
                 */
                public void setAgentname(java.lang.String agentname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTNAME$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTNAME$46);
                      }
                      target.setStringValue(agentname);
                    }
                }
                
                /**
                 * Sets (as xml) the "agentname" attribute
                 */
                public void xsetAgentname(org.apache.xmlbeans.XmlString agentname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTNAME$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTNAME$46);
                      }
                      target.set(agentname);
                    }
                }
                
                /**
                 * Unsets the "agentname" attribute
                 */
                public void unsetAgentname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AGENTNAME$46);
                    }
                }
                
                /**
                 * Gets the "scriptname" attribute
                 */
                public java.lang.String getScriptname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTNAME$48);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "scriptname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetScriptname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPTNAME$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "scriptname" attribute
                 */
                public boolean isSetScriptname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SCRIPTNAME$48) != null;
                    }
                }
                
                /**
                 * Sets the "scriptname" attribute
                 */
                public void setScriptname(java.lang.String scriptname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPTNAME$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCRIPTNAME$48);
                      }
                      target.setStringValue(scriptname);
                    }
                }
                
                /**
                 * Sets (as xml) the "scriptname" attribute
                 */
                public void xsetScriptname(org.apache.xmlbeans.XmlString scriptname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPTNAME$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCRIPTNAME$48);
                      }
                      target.set(scriptname);
                    }
                }
                
                /**
                 * Unsets the "scriptname" attribute
                 */
                public void unsetScriptname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SCRIPTNAME$48);
                    }
                }
                
                /**
                 * Gets the "testname" attribute
                 */
                public java.lang.String getTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTNAME$50);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "testname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTNAME$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "testname" attribute
                 */
                public boolean isSetTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TESTNAME$50) != null;
                    }
                }
                
                /**
                 * Sets the "testname" attribute
                 */
                public void setTestname(java.lang.String testname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTNAME$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TESTNAME$50);
                      }
                      target.setStringValue(testname);
                    }
                }
                
                /**
                 * Sets (as xml) the "testname" attribute
                 */
                public void xsetTestname(org.apache.xmlbeans.XmlString testname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTNAME$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TESTNAME$50);
                      }
                      target.set(testname);
                    }
                }
                
                /**
                 * Unsets the "testname" attribute
                 */
                public void unsetTestname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TESTNAME$50);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$52);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$52);
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
                      return get_store().find_attribute_user(ERRORSTATE$52) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTATE$52);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORSTATE$52);
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
                      get_store().remove_attribute(ERRORSTATE$52);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$54);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$54);
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
                      return get_store().find_attribute_user(FAILURERATE$54) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$54);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$54);
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
                      get_store().remove_attribute(FAILURERATE$54);
                    }
                }
            }
        }
    }
}
