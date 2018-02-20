/*
 * An XML document type.
 * Localname: dynamicmeasurematrixdashlet
 * Namespace: 
 * Java type: noNamespace.DynamicmeasurematrixdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one dynamicmeasurematrixdashlet(@) element.
 *
 * This is a complex type.
 */
public class DynamicmeasurematrixdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DynamicmeasurematrixdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public DynamicmeasurematrixdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DYNAMICMEASUREMATRIXDASHLET$0 = 
        new javax.xml.namespace.QName("", "dynamicmeasurematrixdashlet");
    
    
    /**
     * Gets the "dynamicmeasurematrixdashlet" element
     */
    public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet getDynamicmeasurematrixdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet target = null;
            target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().find_element_user(DYNAMICMEASUREMATRIXDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dynamicmeasurematrixdashlet" element
     */
    public void setDynamicmeasurematrixdashlet(noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet dynamicmeasurematrixdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet target = null;
            target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().find_element_user(DYNAMICMEASUREMATRIXDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().add_element_user(DYNAMICMEASUREMATRIXDASHLET$0);
            }
            target.set(dynamicmeasurematrixdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "dynamicmeasurematrixdashlet" element
     */
    public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet addNewDynamicmeasurematrixdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet target = null;
            target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().add_element_user(DYNAMICMEASUREMATRIXDASHLET$0);
            return target;
        }
    }
    /**
     * An XML dynamicmeasurematrixdashlet(@).
     *
     * This is a complex type.
     */
    public static class DynamicmeasurematrixdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public DynamicmeasurematrixdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName RECORDSET$4 = 
            new javax.xml.namespace.QName("", "recordset");
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
         * Gets the "recordset" element
         */
        public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset getRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset target = null;
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset)get_store().find_element_user(RECORDSET$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "recordset" element
         */
        public boolean isSetRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDSET$4) != 0;
            }
        }
        
        /**
         * Sets the "recordset" element
         */
        public void setRecordset(noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset recordset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset target = null;
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset)get_store().find_element_user(RECORDSET$4, 0);
                if (target == null)
                {
                    target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset)get_store().add_element_user(RECORDSET$4);
                }
                target.set(recordset);
            }
        }
        
        /**
         * Appends and returns a new empty "recordset" element
         */
        public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset addNewRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset target = null;
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset)get_store().add_element_user(RECORDSET$4);
                return target;
            }
        }
        
        /**
         * Unsets the "recordset" element
         */
        public void unsetRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDSET$4, 0);
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
         * An XML recordset(@).
         *
         * This is a complex type.
         */
        public static class RecordsetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset
        {
            private static final long serialVersionUID = 1L;
            
            public RecordsetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DYNAMICMEASUREMATRIXRECORD$0 = 
                new javax.xml.namespace.QName("", "dynamicmeasurematrixrecord");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "dynamicmeasurematrixrecord" elements
             */
            public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord[] getDynamicmeasurematrixrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DYNAMICMEASUREMATRIXRECORD$0, targetList);
                    noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord[] result = new noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "dynamicmeasurematrixrecord" element
             */
            public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord target = null;
                    target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "dynamicmeasurematrixrecord" element
             */
            public int sizeOfDynamicmeasurematrixrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DYNAMICMEASUREMATRIXRECORD$0);
                }
            }
            
            /**
             * Sets array of all "dynamicmeasurematrixrecord" element
             */
            public void setDynamicmeasurematrixrecordArray(noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord[] dynamicmeasurematrixrecordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dynamicmeasurematrixrecordArray, DYNAMICMEASUREMATRIXRECORD$0);
                }
            }
            
            /**
             * Sets ith "dynamicmeasurematrixrecord" element
             */
            public void setDynamicmeasurematrixrecordArray(int i, noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord target = null;
                    target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dynamicmeasurematrixrecord);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "dynamicmeasurematrixrecord" element
             */
            public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord insertNewDynamicmeasurematrixrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord target = null;
                    target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord)get_store().insert_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "dynamicmeasurematrixrecord" element
             */
            public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord target = null;
                    target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord)get_store().add_element_user(DYNAMICMEASUREMATRIXRECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "dynamicmeasurematrixrecord" element
             */
            public void removeDynamicmeasurematrixrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DYNAMICMEASUREMATRIXRECORD$0, i);
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
             * An XML dynamicmeasurematrixrecord(@).
             *
             * This is a complex type.
             */
            public static class DynamicmeasurematrixrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet.Recordset.Dynamicmeasurematrixrecord
            {
                private static final long serialVersionUID = 1L;
                
                public DynamicmeasurematrixrecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DYNAMICMEASUREMATRIXRECORD$0 = 
                    new javax.xml.namespace.QName("", "dynamicmeasurematrixrecord");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                
                
                /**
                 * Gets array of all "dynamicmeasurematrixrecord" elements
                 */
                public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] getDynamicmeasurematrixrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DYNAMICMEASUREMATRIXRECORD$0, targetList);
                      noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] result = new noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "dynamicmeasurematrixrecord" element
                 */
                public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord getDynamicmeasurematrixrecordArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                      target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "dynamicmeasurematrixrecord" element
                 */
                public int sizeOfDynamicmeasurematrixrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DYNAMICMEASUREMATRIXRECORD$0);
                    }
                }
                
                /**
                 * Sets array of all "dynamicmeasurematrixrecord" element
                 */
                public void setDynamicmeasurematrixrecordArray(noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord[] dynamicmeasurematrixrecordArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(dynamicmeasurematrixrecordArray, DYNAMICMEASUREMATRIXRECORD$0);
                    }
                }
                
                /**
                 * Sets ith "dynamicmeasurematrixrecord" element
                 */
                public void setDynamicmeasurematrixrecordArray(int i, noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord dynamicmeasurematrixrecord)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                      target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().find_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(dynamicmeasurematrixrecord);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "dynamicmeasurematrixrecord" element
                 */
                public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord insertNewDynamicmeasurematrixrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                      target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().insert_element_user(DYNAMICMEASUREMATRIXRECORD$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "dynamicmeasurematrixrecord" element
                 */
                public noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord addNewDynamicmeasurematrixrecord()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord target = null;
                      target = (noNamespace.DynamicmeasurematrixrecordDocument.Dynamicmeasurematrixrecord)get_store().add_element_user(DYNAMICMEASUREMATRIXRECORD$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "dynamicmeasurematrixrecord" element
                 */
                public void removeDynamicmeasurematrixrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DYNAMICMEASUREMATRIXRECORD$0, i);
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
            }
        }
    }
}
