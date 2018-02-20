/*
 * An XML document type.
 * Localname: incidentchartdashlet
 * Namespace: 
 * Java type: noNamespace.IncidentchartdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one incidentchartdashlet(@) element.
 *
 * This is a complex type.
 */
public class IncidentchartdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentchartdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentchartdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTCHARTDASHLET$0 = 
        new javax.xml.namespace.QName("", "incidentchartdashlet");
    
    
    /**
     * Gets the "incidentchartdashlet" element
     */
    public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet getIncidentchartdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentchartdashletDocument.Incidentchartdashlet target = null;
            target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().find_element_user(INCIDENTCHARTDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "incidentchartdashlet" element
     */
    public void setIncidentchartdashlet(noNamespace.IncidentchartdashletDocument.Incidentchartdashlet incidentchartdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentchartdashletDocument.Incidentchartdashlet target = null;
            target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().find_element_user(INCIDENTCHARTDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().add_element_user(INCIDENTCHARTDASHLET$0);
            }
            target.set(incidentchartdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "incidentchartdashlet" element
     */
    public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet addNewIncidentchartdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.IncidentchartdashletDocument.Incidentchartdashlet target = null;
            target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().add_element_user(INCIDENTCHARTDASHLET$0);
            return target;
        }
    }
    /**
     * An XML incidentchartdashlet(@).
     *
     * This is a complex type.
     */
    public static class IncidentchartdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentchartdashletDocument.Incidentchartdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public IncidentchartdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName INCIDENTCHARTRECORDS$4 = 
            new javax.xml.namespace.QName("", "incidentchartrecords");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName SHOWABSOLUTEVALUES$10 = 
            new javax.xml.namespace.QName("", "showabsolutevalues");
        
        
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
         * Gets the "incidentchartrecords" element
         */
        public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords getIncidentchartrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords target = null;
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords)get_store().find_element_user(INCIDENTCHARTRECORDS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "incidentchartrecords" element
         */
        public boolean isSetIncidentchartrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTCHARTRECORDS$4) != 0;
            }
        }
        
        /**
         * Sets the "incidentchartrecords" element
         */
        public void setIncidentchartrecords(noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords incidentchartrecords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords target = null;
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords)get_store().find_element_user(INCIDENTCHARTRECORDS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords)get_store().add_element_user(INCIDENTCHARTRECORDS$4);
                }
                target.set(incidentchartrecords);
            }
        }
        
        /**
         * Appends and returns a new empty "incidentchartrecords" element
         */
        public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords addNewIncidentchartrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords target = null;
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords)get_store().add_element_user(INCIDENTCHARTRECORDS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "incidentchartrecords" element
         */
        public void unsetIncidentchartrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTCHARTRECORDS$4, 0);
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
         * Gets the "showabsolutevalues" attribute
         */
        public java.lang.String getShowabsolutevalues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWABSOLUTEVALUES$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "showabsolutevalues" attribute
         */
        public org.apache.xmlbeans.XmlString xgetShowabsolutevalues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHOWABSOLUTEVALUES$10);
                return target;
            }
        }
        
        /**
         * True if has "showabsolutevalues" attribute
         */
        public boolean isSetShowabsolutevalues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHOWABSOLUTEVALUES$10) != null;
            }
        }
        
        /**
         * Sets the "showabsolutevalues" attribute
         */
        public void setShowabsolutevalues(java.lang.String showabsolutevalues)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWABSOLUTEVALUES$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWABSOLUTEVALUES$10);
                }
                target.setStringValue(showabsolutevalues);
            }
        }
        
        /**
         * Sets (as xml) the "showabsolutevalues" attribute
         */
        public void xsetShowabsolutevalues(org.apache.xmlbeans.XmlString showabsolutevalues)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHOWABSOLUTEVALUES$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SHOWABSOLUTEVALUES$10);
                }
                target.set(showabsolutevalues);
            }
        }
        
        /**
         * Unsets the "showabsolutevalues" attribute
         */
        public void unsetShowabsolutevalues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHOWABSOLUTEVALUES$10);
            }
        }
        /**
         * An XML incidentchartrecords(@).
         *
         * This is a complex type.
         */
        public static class IncidentchartrecordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords
        {
            private static final long serialVersionUID = 1L;
            
            public IncidentchartrecordsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INCIDENTCHARTRECORD$0 = 
                new javax.xml.namespace.QName("", "incidentchartrecord");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "incidentchartrecord" elements
             */
            public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord[] getIncidentchartrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INCIDENTCHARTRECORD$0, targetList);
                    noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord[] result = new noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "incidentchartrecord" element
             */
            public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord getIncidentchartrecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord target = null;
                    target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "incidentchartrecord" element
             */
            public int sizeOfIncidentchartrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INCIDENTCHARTRECORD$0);
                }
            }
            
            /**
             * Sets array of all "incidentchartrecord" element
             */
            public void setIncidentchartrecordArray(noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord[] incidentchartrecordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(incidentchartrecordArray, INCIDENTCHARTRECORD$0);
                }
            }
            
            /**
             * Sets ith "incidentchartrecord" element
             */
            public void setIncidentchartrecordArray(int i, noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord incidentchartrecord)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord target = null;
                    target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(incidentchartrecord);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "incidentchartrecord" element
             */
            public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord insertNewIncidentchartrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord target = null;
                    target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord)get_store().insert_element_user(INCIDENTCHARTRECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "incidentchartrecord" element
             */
            public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord addNewIncidentchartrecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord target = null;
                    target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord)get_store().add_element_user(INCIDENTCHARTRECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "incidentchartrecord" element
             */
            public void removeIncidentchartrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INCIDENTCHARTRECORD$0, i);
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
             * An XML incidentchartrecord(@).
             *
             * This is a complex type.
             */
            public static class IncidentchartrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.IncidentchartdashletDocument.Incidentchartdashlet.Incidentchartrecords.Incidentchartrecord
            {
                private static final long serialVersionUID = 1L;
                
                public IncidentchartrecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName INCIDENTCHARTRECORD$0 = 
                    new javax.xml.namespace.QName("", "incidentchartrecord");
                private static final javax.xml.namespace.QName RULE$2 = 
                    new javax.xml.namespace.QName("", "rule");
                private static final javax.xml.namespace.QName SEVERITY$4 = 
                    new javax.xml.namespace.QName("", "severity");
                private static final javax.xml.namespace.QName START$6 = 
                    new javax.xml.namespace.QName("", "start");
                private static final javax.xml.namespace.QName END$8 = 
                    new javax.xml.namespace.QName("", "end");
                private static final javax.xml.namespace.QName DURATION$10 = 
                    new javax.xml.namespace.QName("", "duration");
                private static final javax.xml.namespace.QName SYSTEMPROFILE$12 = 
                    new javax.xml.namespace.QName("", "systemprofile");
                private static final javax.xml.namespace.QName MESSAGE$14 = 
                    new javax.xml.namespace.QName("", "message");
                private static final javax.xml.namespace.QName DESCRIPTION$16 = 
                    new javax.xml.namespace.QName("", "description");
                
                
                /**
                 * Gets array of all "incidentchartrecord" elements
                 */
                public noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] getIncidentchartrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(INCIDENTCHARTRECORD$0, targetList);
                      noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] result = new noNamespace.IncidentchartrecordDocument.Incidentchartrecord[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "incidentchartrecord" element
                 */
                public noNamespace.IncidentchartrecordDocument.Incidentchartrecord getIncidentchartrecordArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                      target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "incidentchartrecord" element
                 */
                public int sizeOfIncidentchartrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INCIDENTCHARTRECORD$0);
                    }
                }
                
                /**
                 * Sets array of all "incidentchartrecord" element
                 */
                public void setIncidentchartrecordArray(noNamespace.IncidentchartrecordDocument.Incidentchartrecord[] incidentchartrecordArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(incidentchartrecordArray, INCIDENTCHARTRECORD$0);
                    }
                }
                
                /**
                 * Sets ith "incidentchartrecord" element
                 */
                public void setIncidentchartrecordArray(int i, noNamespace.IncidentchartrecordDocument.Incidentchartrecord incidentchartrecord)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                      target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().find_element_user(INCIDENTCHARTRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(incidentchartrecord);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "incidentchartrecord" element
                 */
                public noNamespace.IncidentchartrecordDocument.Incidentchartrecord insertNewIncidentchartrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                      target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().insert_element_user(INCIDENTCHARTRECORD$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "incidentchartrecord" element
                 */
                public noNamespace.IncidentchartrecordDocument.Incidentchartrecord addNewIncidentchartrecord()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.IncidentchartrecordDocument.Incidentchartrecord target = null;
                      target = (noNamespace.IncidentchartrecordDocument.Incidentchartrecord)get_store().add_element_user(INCIDENTCHARTRECORD$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "incidentchartrecord" element
                 */
                public void removeIncidentchartrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INCIDENTCHARTRECORD$0, i);
                    }
                }
                
                /**
                 * Gets the "rule" attribute
                 */
                public java.lang.String getRule()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rule" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetRule()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RULE$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "rule" attribute
                 */
                public boolean isSetRule()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RULE$2) != null;
                    }
                }
                
                /**
                 * Sets the "rule" attribute
                 */
                public void setRule(java.lang.String rule)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RULE$2);
                      }
                      target.setStringValue(rule);
                    }
                }
                
                /**
                 * Sets (as xml) the "rule" attribute
                 */
                public void xsetRule(org.apache.xmlbeans.XmlString rule)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RULE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RULE$2);
                      }
                      target.set(rule);
                    }
                }
                
                /**
                 * Unsets the "rule" attribute
                 */
                public void unsetRule()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RULE$2);
                    }
                }
                
                /**
                 * Gets the "severity" attribute
                 */
                public java.lang.String getSeverity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "severity" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSeverity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEVERITY$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "severity" attribute
                 */
                public boolean isSetSeverity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SEVERITY$4) != null;
                    }
                }
                
                /**
                 * Sets the "severity" attribute
                 */
                public void setSeverity(java.lang.String severity)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEVERITY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEVERITY$4);
                      }
                      target.setStringValue(severity);
                    }
                }
                
                /**
                 * Sets (as xml) the "severity" attribute
                 */
                public void xsetSeverity(org.apache.xmlbeans.XmlString severity)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEVERITY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEVERITY$4);
                      }
                      target.set(severity);
                    }
                }
                
                /**
                 * Unsets the "severity" attribute
                 */
                public void unsetSeverity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SEVERITY$4);
                    }
                }
                
                /**
                 * Gets the "start" attribute
                 */
                public java.util.Calendar getStart()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "start" attribute
                 */
                public org.apache.xmlbeans.XmlDateTime xgetStart()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(START$6);
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
                      return get_store().find_attribute_user(START$6) != null;
                    }
                }
                
                /**
                 * Sets the "start" attribute
                 */
                public void setStart(java.util.Calendar start)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$6);
                      }
                      target.setCalendarValue(start);
                    }
                }
                
                /**
                 * Sets (as xml) the "start" attribute
                 */
                public void xsetStart(org.apache.xmlbeans.XmlDateTime start)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(START$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(START$6);
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
                      get_store().remove_attribute(START$6);
                    }
                }
                
                /**
                 * Gets the "end" attribute
                 */
                public java.util.Calendar getEnd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "end" attribute
                 */
                public org.apache.xmlbeans.XmlDateTime xgetEnd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(END$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "end" attribute
                 */
                public boolean isSetEnd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(END$8) != null;
                    }
                }
                
                /**
                 * Sets the "end" attribute
                 */
                public void setEnd(java.util.Calendar end)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(END$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(END$8);
                      }
                      target.setCalendarValue(end);
                    }
                }
                
                /**
                 * Sets (as xml) the "end" attribute
                 */
                public void xsetEnd(org.apache.xmlbeans.XmlDateTime end)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(END$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(END$8);
                      }
                      target.set(end);
                    }
                }
                
                /**
                 * Unsets the "end" attribute
                 */
                public void unsetEnd()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(END$8);
                    }
                }
                
                /**
                 * Gets the "duration" attribute
                 */
                public java.lang.String getDuration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "duration" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDuration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "duration" attribute
                 */
                public boolean isSetDuration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DURATION$10) != null;
                    }
                }
                
                /**
                 * Sets the "duration" attribute
                 */
                public void setDuration(java.lang.String duration)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATION$10);
                      }
                      target.setStringValue(duration);
                    }
                }
                
                /**
                 * Sets (as xml) the "duration" attribute
                 */
                public void xsetDuration(org.apache.xmlbeans.XmlString duration)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DURATION$10);
                      }
                      target.set(duration);
                    }
                }
                
                /**
                 * Unsets the "duration" attribute
                 */
                public void unsetDuration()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DURATION$10);
                    }
                }
                
                /**
                 * Gets the "systemprofile" attribute
                 */
                public java.lang.String getSystemprofile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "systemprofile" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSystemprofile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "systemprofile" attribute
                 */
                public boolean isSetSystemprofile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYSTEMPROFILE$12) != null;
                    }
                }
                
                /**
                 * Sets the "systemprofile" attribute
                 */
                public void setSystemprofile(java.lang.String systemprofile)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYSTEMPROFILE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYSTEMPROFILE$12);
                      }
                      target.setStringValue(systemprofile);
                    }
                }
                
                /**
                 * Sets (as xml) the "systemprofile" attribute
                 */
                public void xsetSystemprofile(org.apache.xmlbeans.XmlString systemprofile)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYSTEMPROFILE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYSTEMPROFILE$12);
                      }
                      target.set(systemprofile);
                    }
                }
                
                /**
                 * Unsets the "systemprofile" attribute
                 */
                public void unsetSystemprofile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYSTEMPROFILE$12);
                    }
                }
                
                /**
                 * Gets the "message" attribute
                 */
                public java.lang.String getMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "message" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "message" attribute
                 */
                public boolean isSetMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MESSAGE$14) != null;
                    }
                }
                
                /**
                 * Sets the "message" attribute
                 */
                public void setMessage(java.lang.String message)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$14);
                      }
                      target.setStringValue(message);
                    }
                }
                
                /**
                 * Sets (as xml) the "message" attribute
                 */
                public void xsetMessage(org.apache.xmlbeans.XmlString message)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGE$14);
                      }
                      target.set(message);
                    }
                }
                
                /**
                 * Unsets the "message" attribute
                 */
                public void unsetMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MESSAGE$14);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$16);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$16);
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
                      return get_store().find_attribute_user(DESCRIPTION$16) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$16);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$16);
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
                      get_store().remove_attribute(DESCRIPTION$16);
                    }
                }
            }
        }
    }
}
