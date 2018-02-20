/*
 * An XML document type.
 * Localname: webrequestsdashlet
 * Namespace: 
 * Java type: noNamespace.WebrequestsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one webrequestsdashlet(@) element.
 *
 * This is a complex type.
 */
public class WebrequestsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebrequestsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public WebrequestsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBREQUESTSDASHLET$0 = 
        new javax.xml.namespace.QName("", "webrequestsdashlet");
    
    
    /**
     * Gets the "webrequestsdashlet" element
     */
    public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet getWebrequestsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WebrequestsdashletDocument.Webrequestsdashlet target = null;
            target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().find_element_user(WEBREQUESTSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "webrequestsdashlet" element
     */
    public void setWebrequestsdashlet(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet webrequestsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WebrequestsdashletDocument.Webrequestsdashlet target = null;
            target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().find_element_user(WEBREQUESTSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().add_element_user(WEBREQUESTSDASHLET$0);
            }
            target.set(webrequestsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "webrequestsdashlet" element
     */
    public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet addNewWebrequestsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WebrequestsdashletDocument.Webrequestsdashlet target = null;
            target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().add_element_user(WEBREQUESTSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML webrequestsdashlet(@).
     *
     * This is a complex type.
     */
    public static class WebrequestsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebrequestsdashletDocument.Webrequestsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public WebrequestsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName GROUPING$4 = 
            new javax.xml.namespace.QName("", "grouping");
        private static final javax.xml.namespace.QName WEBREQUESTS$6 = 
            new javax.xml.namespace.QName("", "webrequests");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$10 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName DISPLAYSOURCE$12 = 
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
         * Gets the "grouping" element
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping getGrouping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping)get_store().find_element_user(GROUPING$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "grouping" element
         */
        public boolean isSetGrouping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUPING$4) != 0;
            }
        }
        
        /**
         * Sets the "grouping" element
         */
        public void setGrouping(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping grouping)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping)get_store().find_element_user(GROUPING$4, 0);
                if (target == null)
                {
                    target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping)get_store().add_element_user(GROUPING$4);
                }
                target.set(grouping);
            }
        }
        
        /**
         * Appends and returns a new empty "grouping" element
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping addNewGrouping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping)get_store().add_element_user(GROUPING$4);
                return target;
            }
        }
        
        /**
         * Unsets the "grouping" element
         */
        public void unsetGrouping()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUPING$4, 0);
            }
        }
        
        /**
         * Gets the "webrequests" element
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests getWebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests)get_store().find_element_user(WEBREQUESTS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "webrequests" element
         */
        public boolean isSetWebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBREQUESTS$6) != 0;
            }
        }
        
        /**
         * Sets the "webrequests" element
         */
        public void setWebrequests(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests webrequests)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests)get_store().find_element_user(WEBREQUESTS$6, 0);
                if (target == null)
                {
                    target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests)get_store().add_element_user(WEBREQUESTS$6);
                }
                target.set(webrequests);
            }
        }
        
        /**
         * Appends and returns a new empty "webrequests" element
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests addNewWebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests)get_store().add_element_user(WEBREQUESTS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "webrequests" element
         */
        public void unsetWebrequests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBREQUESTS$6, 0);
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
         * Gets the "displaysource" attribute
         */
        public java.lang.String getDisplaysource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYSOURCE$12);
                }
                target.set(displaysource);
            }
        }
        /**
         * An XML grouping(@).
         *
         * This is a complex type.
         */
        public static class GroupingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Grouping
        {
            private static final long serialVersionUID = 1L;
            
            public GroupingImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GROUPEDBY$0 = 
                new javax.xml.namespace.QName("", "groupedby");
            
            
            /**
             * Gets the "groupedby" attribute
             */
            public java.lang.String getGroupedby()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPEDBY$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "groupedby" attribute
             */
            public org.apache.xmlbeans.XmlString xgetGroupedby()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPEDBY$0);
                    return target;
                }
            }
            
            /**
             * Sets the "groupedby" attribute
             */
            public void setGroupedby(java.lang.String groupedby)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPEDBY$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPEDBY$0);
                    }
                    target.setStringValue(groupedby);
                }
            }
            
            /**
             * Sets (as xml) the "groupedby" attribute
             */
            public void xsetGroupedby(org.apache.xmlbeans.XmlString groupedby)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPEDBY$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUPEDBY$0);
                    }
                    target.set(groupedby);
                }
            }
        }
        /**
         * An XML webrequests(@).
         *
         * This is a complex type.
         */
        public static class WebrequestsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests
        {
            private static final long serialVersionUID = 1L;
            
            public WebrequestsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName WEBREQUEST$0 = 
                new javax.xml.namespace.QName("", "webrequest");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "webrequest" elements
             */
            public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest[] getWebrequestArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(WEBREQUEST$0, targetList);
                    noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest[] result = new noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "webrequest" element
             */
            public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest getWebrequestArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest target = null;
                    target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest)get_store().find_element_user(WEBREQUEST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "webrequest" element
             */
            public int sizeOfWebrequestArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WEBREQUEST$0);
                }
            }
            
            /**
             * Sets array of all "webrequest" element
             */
            public void setWebrequestArray(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest[] webrequestArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(webrequestArray, WEBREQUEST$0);
                }
            }
            
            /**
             * Sets ith "webrequest" element
             */
            public void setWebrequestArray(int i, noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest webrequest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest target = null;
                    target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest)get_store().find_element_user(WEBREQUEST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(webrequest);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "webrequest" element
             */
            public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest insertNewWebrequest(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest target = null;
                    target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest)get_store().insert_element_user(WEBREQUEST$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "webrequest" element
             */
            public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest addNewWebrequest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest target = null;
                    target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest)get_store().add_element_user(WEBREQUEST$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "webrequest" element
             */
            public void removeWebrequest(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WEBREQUEST$0, i);
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
             * An XML webrequest(@).
             *
             * This is a complex type.
             */
            public static class WebrequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebrequestsdashletDocument.Webrequestsdashlet.Webrequests.Webrequest
            {
                private static final long serialVersionUID = 1L;
                
                public WebrequestImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName URI$2 = 
                    new javax.xml.namespace.QName("", "uri");
                private static final javax.xml.namespace.QName QUERY$4 = 
                    new javax.xml.namespace.QName("", "query");
                private static final javax.xml.namespace.QName APPLICATIONID$6 = 
                    new javax.xml.namespace.QName("", "application_id");
                private static final javax.xml.namespace.QName SERVLETNAME$8 = 
                    new javax.xml.namespace.QName("", "servlet_name");
                private static final javax.xml.namespace.QName COUNT$10 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName TOTALAVG$12 = 
                    new javax.xml.namespace.QName("", "total_avg");
                private static final javax.xml.namespace.QName TOTALMIN$14 = 
                    new javax.xml.namespace.QName("", "total_min");
                private static final javax.xml.namespace.QName TOTALMAX$16 = 
                    new javax.xml.namespace.QName("", "total_max");
                private static final javax.xml.namespace.QName TOTALSUM$18 = 
                    new javax.xml.namespace.QName("", "total_sum");
                private static final javax.xml.namespace.QName EXECAVG$20 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$22 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$24 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$26 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName SENTAVG$28 = 
                    new javax.xml.namespace.QName("", "sent_avg");
                private static final javax.xml.namespace.QName SENTMIN$30 = 
                    new javax.xml.namespace.QName("", "sent_min");
                private static final javax.xml.namespace.QName SENTMAX$32 = 
                    new javax.xml.namespace.QName("", "sent_max");
                private static final javax.xml.namespace.QName SENTSUM$34 = 
                    new javax.xml.namespace.QName("", "sent_sum");
                private static final javax.xml.namespace.QName RCVDAVG$36 = 
                    new javax.xml.namespace.QName("", "rcvd_avg");
                private static final javax.xml.namespace.QName RCVDMIN$38 = 
                    new javax.xml.namespace.QName("", "rcvd_min");
                private static final javax.xml.namespace.QName RCVDMAX$40 = 
                    new javax.xml.namespace.QName("", "rcvd_max");
                private static final javax.xml.namespace.QName RCVDSUM$42 = 
                    new javax.xml.namespace.QName("", "rcvd_sum");
                private static final javax.xml.namespace.QName CPUAVG$44 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUMIN$46 = 
                    new javax.xml.namespace.QName("", "cpu_min");
                private static final javax.xml.namespace.QName CPUMAX$48 = 
                    new javax.xml.namespace.QName("", "cpu_max");
                private static final javax.xml.namespace.QName CPUSUM$50 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                private static final javax.xml.namespace.QName ERRORSTATE$52 = 
                    new javax.xml.namespace.QName("", "error_state");
                private static final javax.xml.namespace.QName FAILURERATE$54 = 
                    new javax.xml.namespace.QName("", "failure_rate");
                private static final javax.xml.namespace.QName APPLICATION$56 = 
                    new javax.xml.namespace.QName("", "application");
                private static final javax.xml.namespace.QName AGENTGROUP$58 = 
                    new javax.xml.namespace.QName("", "agent_group");
                private static final javax.xml.namespace.QName SIDE$60 = 
                    new javax.xml.namespace.QName("", "side");
                private static final javax.xml.namespace.QName WEBREQUESTRESPONSETIMEAVG$62 = 
                    new javax.xml.namespace.QName("", "web_request_response_time_avg");
                private static final javax.xml.namespace.QName WEBREQUESTRESPONSETIMEMIN$64 = 
                    new javax.xml.namespace.QName("", "web_request_response_time_min");
                private static final javax.xml.namespace.QName WEBREQUESTRESPONSETIMEMAX$66 = 
                    new javax.xml.namespace.QName("", "web_request_response_time_max");
                private static final javax.xml.namespace.QName WEBREQUESTRESPONSETIMESUM$68 = 
                    new javax.xml.namespace.QName("", "web_request_response_time_sum");
                
                
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
                 * Gets the "uri" attribute
                 */
                public java.lang.String getUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "uri" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "uri" attribute
                 */
                public boolean isSetUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(URI$2) != null;
                    }
                }
                
                /**
                 * Sets the "uri" attribute
                 */
                public void setUri(java.lang.String uri)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$2);
                      }
                      target.setStringValue(uri);
                    }
                }
                
                /**
                 * Sets (as xml) the "uri" attribute
                 */
                public void xsetUri(org.apache.xmlbeans.XmlString uri)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URI$2);
                      }
                      target.set(uri);
                    }
                }
                
                /**
                 * Unsets the "uri" attribute
                 */
                public void unsetUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(URI$2);
                    }
                }
                
                /**
                 * Gets the "query" attribute
                 */
                public java.lang.String getQuery()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERY$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "query" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetQuery()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERY$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "query" attribute
                 */
                public boolean isSetQuery()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(QUERY$4) != null;
                    }
                }
                
                /**
                 * Sets the "query" attribute
                 */
                public void setQuery(java.lang.String query)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERY$4);
                      }
                      target.setStringValue(query);
                    }
                }
                
                /**
                 * Sets (as xml) the "query" attribute
                 */
                public void xsetQuery(org.apache.xmlbeans.XmlString query)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QUERY$4);
                      }
                      target.set(query);
                    }
                }
                
                /**
                 * Unsets the "query" attribute
                 */
                public void unsetQuery()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(QUERY$4);
                    }
                }
                
                /**
                 * Gets the "application_id" attribute
                 */
                public java.lang.String getApplicationId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "application_id" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetApplicationId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "application_id" attribute
                 */
                public boolean isSetApplicationId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(APPLICATIONID$6) != null;
                    }
                }
                
                /**
                 * Sets the "application_id" attribute
                 */
                public void setApplicationId(java.lang.String applicationId)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONID$6);
                      }
                      target.setStringValue(applicationId);
                    }
                }
                
                /**
                 * Sets (as xml) the "application_id" attribute
                 */
                public void xsetApplicationId(org.apache.xmlbeans.XmlString applicationId)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATIONID$6);
                      }
                      target.set(applicationId);
                    }
                }
                
                /**
                 * Unsets the "application_id" attribute
                 */
                public void unsetApplicationId()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(APPLICATIONID$6);
                    }
                }
                
                /**
                 * Gets the "servlet_name" attribute
                 */
                public java.lang.String getServletName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVLETNAME$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "servlet_name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetServletName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVLETNAME$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "servlet_name" attribute
                 */
                public boolean isSetServletName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERVLETNAME$8) != null;
                    }
                }
                
                /**
                 * Sets the "servlet_name" attribute
                 */
                public void setServletName(java.lang.String servletName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVLETNAME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVLETNAME$8);
                      }
                      target.setStringValue(servletName);
                    }
                }
                
                /**
                 * Sets (as xml) the "servlet_name" attribute
                 */
                public void xsetServletName(org.apache.xmlbeans.XmlString servletName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVLETNAME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVLETNAME$8);
                      }
                      target.set(servletName);
                    }
                }
                
                /**
                 * Unsets the "servlet_name" attribute
                 */
                public void unsetServletName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERVLETNAME$8);
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
                 * Gets the "total_avg" attribute
                 */
                public double getTotalAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALAVG$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALAVG$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_avg" attribute
                 */
                public boolean isSetTotalAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALAVG$12) != null;
                    }
                }
                
                /**
                 * Sets the "total_avg" attribute
                 */
                public void setTotalAvg(double totalAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALAVG$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALAVG$12);
                      }
                      target.setDoubleValue(totalAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_avg" attribute
                 */
                public void xsetTotalAvg(org.apache.xmlbeans.XmlDouble totalAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALAVG$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALAVG$12);
                      }
                      target.set(totalAvg);
                    }
                }
                
                /**
                 * Unsets the "total_avg" attribute
                 */
                public void unsetTotalAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALAVG$12);
                    }
                }
                
                /**
                 * Gets the "total_min" attribute
                 */
                public double getTotalMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMIN$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMIN$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_min" attribute
                 */
                public boolean isSetTotalMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALMIN$14) != null;
                    }
                }
                
                /**
                 * Sets the "total_min" attribute
                 */
                public void setTotalMin(double totalMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMIN$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALMIN$14);
                      }
                      target.setDoubleValue(totalMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_min" attribute
                 */
                public void xsetTotalMin(org.apache.xmlbeans.XmlDouble totalMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMIN$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALMIN$14);
                      }
                      target.set(totalMin);
                    }
                }
                
                /**
                 * Unsets the "total_min" attribute
                 */
                public void unsetTotalMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALMIN$14);
                    }
                }
                
                /**
                 * Gets the "total_max" attribute
                 */
                public double getTotalMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMAX$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMAX$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_max" attribute
                 */
                public boolean isSetTotalMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALMAX$16) != null;
                    }
                }
                
                /**
                 * Sets the "total_max" attribute
                 */
                public void setTotalMax(double totalMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMAX$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALMAX$16);
                      }
                      target.setDoubleValue(totalMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_max" attribute
                 */
                public void xsetTotalMax(org.apache.xmlbeans.XmlDouble totalMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMAX$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALMAX$16);
                      }
                      target.set(totalMax);
                    }
                }
                
                /**
                 * Unsets the "total_max" attribute
                 */
                public void unsetTotalMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALMAX$16);
                    }
                }
                
                /**
                 * Gets the "total_sum" attribute
                 */
                public double getTotalSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSUM$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALSUM$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_sum" attribute
                 */
                public boolean isSetTotalSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALSUM$18) != null;
                    }
                }
                
                /**
                 * Sets the "total_sum" attribute
                 */
                public void setTotalSum(double totalSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSUM$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSUM$18);
                      }
                      target.setDoubleValue(totalSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_sum" attribute
                 */
                public void xsetTotalSum(org.apache.xmlbeans.XmlDouble totalSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALSUM$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALSUM$18);
                      }
                      target.set(totalSum);
                    }
                }
                
                /**
                 * Unsets the "total_sum" attribute
                 */
                public void unsetTotalSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALSUM$18);
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
                 * Gets the "exec_min" attribute
                 */
                public double getExecMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$22);
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
                      return get_store().find_attribute_user(EXECMIN$22) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$22);
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
                      get_store().remove_attribute(EXECMIN$22);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$24);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$24);
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
                      return get_store().find_attribute_user(EXECMAX$24) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$24);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$24);
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
                      get_store().remove_attribute(EXECMAX$24);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$26);
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
                      return get_store().find_attribute_user(EXECSUM$26) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$26);
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
                      get_store().remove_attribute(EXECSUM$26);
                    }
                }
                
                /**
                 * Gets the "sent_avg" attribute
                 */
                public java.math.BigInteger getSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTAVG$28);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTAVG$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_avg" attribute
                 */
                public boolean isSetSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTAVG$28) != null;
                    }
                }
                
                /**
                 * Sets the "sent_avg" attribute
                 */
                public void setSentAvg(java.math.BigInteger sentAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTAVG$28);
                      }
                      target.setBigIntegerValue(sentAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_avg" attribute
                 */
                public void xsetSentAvg(org.apache.xmlbeans.XmlInteger sentAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTAVG$28);
                      }
                      target.set(sentAvg);
                    }
                }
                
                /**
                 * Unsets the "sent_avg" attribute
                 */
                public void unsetSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTAVG$28);
                    }
                }
                
                /**
                 * Gets the "sent_min" attribute
                 */
                public java.math.BigInteger getSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTMIN$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTMIN$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_min" attribute
                 */
                public boolean isSetSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTMIN$30) != null;
                    }
                }
                
                /**
                 * Sets the "sent_min" attribute
                 */
                public void setSentMin(java.math.BigInteger sentMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTMIN$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTMIN$30);
                      }
                      target.setBigIntegerValue(sentMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_min" attribute
                 */
                public void xsetSentMin(org.apache.xmlbeans.XmlInteger sentMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTMIN$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTMIN$30);
                      }
                      target.set(sentMin);
                    }
                }
                
                /**
                 * Unsets the "sent_min" attribute
                 */
                public void unsetSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTMIN$30);
                    }
                }
                
                /**
                 * Gets the "sent_max" attribute
                 */
                public java.math.BigInteger getSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTMAX$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTMAX$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_max" attribute
                 */
                public boolean isSetSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTMAX$32) != null;
                    }
                }
                
                /**
                 * Sets the "sent_max" attribute
                 */
                public void setSentMax(java.math.BigInteger sentMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTMAX$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTMAX$32);
                      }
                      target.setBigIntegerValue(sentMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_max" attribute
                 */
                public void xsetSentMax(org.apache.xmlbeans.XmlInteger sentMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTMAX$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTMAX$32);
                      }
                      target.set(sentMax);
                    }
                }
                
                /**
                 * Unsets the "sent_max" attribute
                 */
                public void unsetSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTMAX$32);
                    }
                }
                
                /**
                 * Gets the "sent_sum" attribute
                 */
                public java.math.BigInteger getSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSUM$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSUM$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_sum" attribute
                 */
                public boolean isSetSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSUM$34) != null;
                    }
                }
                
                /**
                 * Sets the "sent_sum" attribute
                 */
                public void setSentSum(java.math.BigInteger sentSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSUM$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSUM$34);
                      }
                      target.setBigIntegerValue(sentSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_sum" attribute
                 */
                public void xsetSentSum(org.apache.xmlbeans.XmlInteger sentSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTSUM$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTSUM$34);
                      }
                      target.set(sentSum);
                    }
                }
                
                /**
                 * Unsets the "sent_sum" attribute
                 */
                public void unsetSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSUM$34);
                    }
                }
                
                /**
                 * Gets the "rcvd_avg" attribute
                 */
                public java.math.BigInteger getRcvdAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDAVG$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDAVG$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_avg" attribute
                 */
                public boolean isSetRcvdAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDAVG$36) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_avg" attribute
                 */
                public void setRcvdAvg(java.math.BigInteger rcvdAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDAVG$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDAVG$36);
                      }
                      target.setBigIntegerValue(rcvdAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_avg" attribute
                 */
                public void xsetRcvdAvg(org.apache.xmlbeans.XmlInteger rcvdAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDAVG$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDAVG$36);
                      }
                      target.set(rcvdAvg);
                    }
                }
                
                /**
                 * Unsets the "rcvd_avg" attribute
                 */
                public void unsetRcvdAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDAVG$36);
                    }
                }
                
                /**
                 * Gets the "rcvd_min" attribute
                 */
                public java.math.BigInteger getRcvdMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDMIN$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDMIN$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_min" attribute
                 */
                public boolean isSetRcvdMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDMIN$38) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_min" attribute
                 */
                public void setRcvdMin(java.math.BigInteger rcvdMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDMIN$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDMIN$38);
                      }
                      target.setBigIntegerValue(rcvdMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_min" attribute
                 */
                public void xsetRcvdMin(org.apache.xmlbeans.XmlInteger rcvdMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDMIN$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDMIN$38);
                      }
                      target.set(rcvdMin);
                    }
                }
                
                /**
                 * Unsets the "rcvd_min" attribute
                 */
                public void unsetRcvdMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDMIN$38);
                    }
                }
                
                /**
                 * Gets the "rcvd_max" attribute
                 */
                public java.math.BigInteger getRcvdMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDMAX$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDMAX$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_max" attribute
                 */
                public boolean isSetRcvdMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDMAX$40) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_max" attribute
                 */
                public void setRcvdMax(java.math.BigInteger rcvdMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDMAX$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDMAX$40);
                      }
                      target.setBigIntegerValue(rcvdMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_max" attribute
                 */
                public void xsetRcvdMax(org.apache.xmlbeans.XmlInteger rcvdMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDMAX$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDMAX$40);
                      }
                      target.set(rcvdMax);
                    }
                }
                
                /**
                 * Unsets the "rcvd_max" attribute
                 */
                public void unsetRcvdMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDMAX$40);
                    }
                }
                
                /**
                 * Gets the "rcvd_sum" attribute
                 */
                public java.math.BigInteger getRcvdSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSUM$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSUM$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_sum" attribute
                 */
                public boolean isSetRcvdSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSUM$42) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_sum" attribute
                 */
                public void setRcvdSum(java.math.BigInteger rcvdSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSUM$42);
                      }
                      target.setBigIntegerValue(rcvdSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_sum" attribute
                 */
                public void xsetRcvdSum(org.apache.xmlbeans.XmlInteger rcvdSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDSUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDSUM$42);
                      }
                      target.set(rcvdSum);
                    }
                }
                
                /**
                 * Unsets the "rcvd_sum" attribute
                 */
                public void unsetRcvdSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSUM$42);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$44);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$44);
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
                      return get_store().find_attribute_user(CPUAVG$44) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$44);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$44);
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
                      get_store().remove_attribute(CPUAVG$44);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$46);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$46);
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
                      return get_store().find_attribute_user(CPUMIN$46) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMIN$46);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMIN$46);
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
                      get_store().remove_attribute(CPUMIN$46);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$48);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$48);
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
                      return get_store().find_attribute_user(CPUMAX$48) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMAX$48);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMAX$48);
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
                      get_store().remove_attribute(CPUMAX$48);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$50);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$50);
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
                      return get_store().find_attribute_user(CPUSUM$50) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$50);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$50);
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
                      get_store().remove_attribute(CPUSUM$50);
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
                
                /**
                 * Gets the "application" attribute
                 */
                public java.lang.String getApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$56);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$56);
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
                      return get_store().find_attribute_user(APPLICATION$56) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATION$56);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATION$56);
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
                      get_store().remove_attribute(APPLICATION$56);
                    }
                }
                
                /**
                 * Gets the "agent_group" attribute
                 */
                public java.lang.String getAgentGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTGROUP$58);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "agent_group" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAgentGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTGROUP$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "agent_group" attribute
                 */
                public boolean isSetAgentGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AGENTGROUP$58) != null;
                    }
                }
                
                /**
                 * Sets the "agent_group" attribute
                 */
                public void setAgentGroup(java.lang.String agentGroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENTGROUP$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENTGROUP$58);
                      }
                      target.setStringValue(agentGroup);
                    }
                }
                
                /**
                 * Sets (as xml) the "agent_group" attribute
                 */
                public void xsetAgentGroup(org.apache.xmlbeans.XmlString agentGroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENTGROUP$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENTGROUP$58);
                      }
                      target.set(agentGroup);
                    }
                }
                
                /**
                 * Unsets the "agent_group" attribute
                 */
                public void unsetAgentGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AGENTGROUP$58);
                    }
                }
                
                /**
                 * Gets the "side" attribute
                 */
                public java.lang.String getSide()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$60);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "side" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSide()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIDE$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "side" attribute
                 */
                public boolean isSetSide()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SIDE$60) != null;
                    }
                }
                
                /**
                 * Sets the "side" attribute
                 */
                public void setSide(java.lang.String side)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDE$60);
                      }
                      target.setStringValue(side);
                    }
                }
                
                /**
                 * Sets (as xml) the "side" attribute
                 */
                public void xsetSide(org.apache.xmlbeans.XmlString side)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIDE$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIDE$60);
                      }
                      target.set(side);
                    }
                }
                
                /**
                 * Unsets the "side" attribute
                 */
                public void unsetSide()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SIDE$60);
                    }
                }
                
                /**
                 * Gets the "web_request_response_time_avg" attribute
                 */
                public double getWebRequestResponseTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEAVG$62);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "web_request_response_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEAVG$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "web_request_response_time_avg" attribute
                 */
                public boolean isSetWebRequestResponseTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WEBREQUESTRESPONSETIMEAVG$62) != null;
                    }
                }
                
                /**
                 * Sets the "web_request_response_time_avg" attribute
                 */
                public void setWebRequestResponseTimeAvg(double webRequestResponseTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEAVG$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBREQUESTRESPONSETIMEAVG$62);
                      }
                      target.setDoubleValue(webRequestResponseTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "web_request_response_time_avg" attribute
                 */
                public void xsetWebRequestResponseTimeAvg(org.apache.xmlbeans.XmlDouble webRequestResponseTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEAVG$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WEBREQUESTRESPONSETIMEAVG$62);
                      }
                      target.set(webRequestResponseTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "web_request_response_time_avg" attribute
                 */
                public void unsetWebRequestResponseTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WEBREQUESTRESPONSETIMEAVG$62);
                    }
                }
                
                /**
                 * Gets the "web_request_response_time_min" attribute
                 */
                public double getWebRequestResponseTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMIN$64);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "web_request_response_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMIN$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "web_request_response_time_min" attribute
                 */
                public boolean isSetWebRequestResponseTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMIN$64) != null;
                    }
                }
                
                /**
                 * Sets the "web_request_response_time_min" attribute
                 */
                public void setWebRequestResponseTimeMin(double webRequestResponseTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMIN$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBREQUESTRESPONSETIMEMIN$64);
                      }
                      target.setDoubleValue(webRequestResponseTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "web_request_response_time_min" attribute
                 */
                public void xsetWebRequestResponseTimeMin(org.apache.xmlbeans.XmlDouble webRequestResponseTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMIN$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WEBREQUESTRESPONSETIMEMIN$64);
                      }
                      target.set(webRequestResponseTimeMin);
                    }
                }
                
                /**
                 * Unsets the "web_request_response_time_min" attribute
                 */
                public void unsetWebRequestResponseTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WEBREQUESTRESPONSETIMEMIN$64);
                    }
                }
                
                /**
                 * Gets the "web_request_response_time_max" attribute
                 */
                public double getWebRequestResponseTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMAX$66);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "web_request_response_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMAX$66);
                      return target;
                    }
                }
                
                /**
                 * True if has "web_request_response_time_max" attribute
                 */
                public boolean isSetWebRequestResponseTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMAX$66) != null;
                    }
                }
                
                /**
                 * Sets the "web_request_response_time_max" attribute
                 */
                public void setWebRequestResponseTimeMax(double webRequestResponseTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMAX$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBREQUESTRESPONSETIMEMAX$66);
                      }
                      target.setDoubleValue(webRequestResponseTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "web_request_response_time_max" attribute
                 */
                public void xsetWebRequestResponseTimeMax(org.apache.xmlbeans.XmlDouble webRequestResponseTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMEMAX$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WEBREQUESTRESPONSETIMEMAX$66);
                      }
                      target.set(webRequestResponseTimeMax);
                    }
                }
                
                /**
                 * Unsets the "web_request_response_time_max" attribute
                 */
                public void unsetWebRequestResponseTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WEBREQUESTRESPONSETIMEMAX$66);
                    }
                }
                
                /**
                 * Gets the "web_request_response_time_sum" attribute
                 */
                public double getWebRequestResponseTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMESUM$68);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "web_request_response_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWebRequestResponseTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMESUM$68);
                      return target;
                    }
                }
                
                /**
                 * True if has "web_request_response_time_sum" attribute
                 */
                public boolean isSetWebRequestResponseTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WEBREQUESTRESPONSETIMESUM$68) != null;
                    }
                }
                
                /**
                 * Sets the "web_request_response_time_sum" attribute
                 */
                public void setWebRequestResponseTimeSum(double webRequestResponseTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBREQUESTRESPONSETIMESUM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBREQUESTRESPONSETIMESUM$68);
                      }
                      target.setDoubleValue(webRequestResponseTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "web_request_response_time_sum" attribute
                 */
                public void xsetWebRequestResponseTimeSum(org.apache.xmlbeans.XmlDouble webRequestResponseTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEBREQUESTRESPONSETIMESUM$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WEBREQUESTRESPONSETIMESUM$68);
                      }
                      target.set(webRequestResponseTimeSum);
                    }
                }
                
                /**
                 * Unsets the "web_request_response_time_sum" attribute
                 */
                public void unsetWebRequestResponseTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WEBREQUESTRESPONSETIMESUM$68);
                    }
                }
            }
        }
    }
}
