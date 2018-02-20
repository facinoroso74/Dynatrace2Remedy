/*
 * An XML document type.
 * Localname: methodhotspotsdashlet
 * Namespace: 
 * Java type: noNamespace.MethodhotspotsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one methodhotspotsdashlet(@) element.
 *
 * This is a complex type.
 */
public class MethodhotspotsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MethodhotspotsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public MethodhotspotsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODHOTSPOTSDASHLET$0 = 
        new javax.xml.namespace.QName("", "methodhotspotsdashlet");
    
    
    /**
     * Gets the "methodhotspotsdashlet" element
     */
    public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet getMethodhotspotsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet target = null;
            target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().find_element_user(METHODHOTSPOTSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "methodhotspotsdashlet" element
     */
    public void setMethodhotspotsdashlet(noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet methodhotspotsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet target = null;
            target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().find_element_user(METHODHOTSPOTSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().add_element_user(METHODHOTSPOTSDASHLET$0);
            }
            target.set(methodhotspotsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "methodhotspotsdashlet" element
     */
    public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet addNewMethodhotspotsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet target = null;
            target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().add_element_user(METHODHOTSPOTSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML methodhotspotsdashlet(@).
     *
     * This is a complex type.
     */
    public static class MethodhotspotsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public MethodhotspotsdashletImpl(org.apache.xmlbeans.SchemaType sType)
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
         * Gets the "recordset" element
         */
        public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset getRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset target = null;
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset)get_store().find_element_user(RECORDSET$4, 0);
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
        public void setRecordset(noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset recordset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset target = null;
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset)get_store().find_element_user(RECORDSET$4, 0);
                if (target == null)
                {
                    target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset)get_store().add_element_user(RECORDSET$4);
                }
                target.set(recordset);
            }
        }
        
        /**
         * Appends and returns a new empty "recordset" element
         */
        public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset addNewRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset target = null;
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset)get_store().add_element_user(RECORDSET$4);
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
         * An XML recordset(@).
         *
         * This is a complex type.
         */
        public static class RecordsetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset
        {
            private static final long serialVersionUID = 1L;
            
            public RecordsetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RECORD$0 = 
                new javax.xml.namespace.QName("", "record");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "record" elements
             */
            public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record[] getRecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RECORD$0, targetList);
                    noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record[] result = new noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "record" element
             */
            public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record getRecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record target = null;
                    target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record)get_store().find_element_user(RECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "record" element
             */
            public int sizeOfRecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RECORD$0);
                }
            }
            
            /**
             * Sets array of all "record" element
             */
            public void setRecordArray(noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record[] recordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(recordArray, RECORD$0);
                }
            }
            
            /**
             * Sets ith "record" element
             */
            public void setRecordArray(int i, noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record record)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record target = null;
                    target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record)get_store().find_element_user(RECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(record);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "record" element
             */
            public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record insertNewRecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record target = null;
                    target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record)get_store().insert_element_user(RECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "record" element
             */
            public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record addNewRecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record target = null;
                    target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record)get_store().add_element_user(RECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "record" element
             */
            public void removeRecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RECORD$0, i);
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
             * An XML record(@).
             *
             * This is a complex type.
             */
            public static class RecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet.Recordset.Record
            {
                private static final long serialVersionUID = 1L;
                
                public RecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName METHOD$0 = 
                    new javax.xml.namespace.QName("", "method");
                private static final javax.xml.namespace.QName EXECTIME$2 = 
                    new javax.xml.namespace.QName("", "execTime");
                private static final javax.xml.namespace.QName CPUTIME$4 = 
                    new javax.xml.namespace.QName("", "cpuTime");
                private static final javax.xml.namespace.QName SYNCTIME$6 = 
                    new javax.xml.namespace.QName("", "syncTime");
                private static final javax.xml.namespace.QName WAITTIME$8 = 
                    new javax.xml.namespace.QName("", "waitTime");
                private static final javax.xml.namespace.QName BREAKDOWN$10 = 
                    new javax.xml.namespace.QName("", "breakdown");
                private static final javax.xml.namespace.QName CLASS1$12 = 
                    new javax.xml.namespace.QName("", "class");
                private static final javax.xml.namespace.QName APIS$14 = 
                    new javax.xml.namespace.QName("", "apis");
                
                
                /**
                 * Gets the "method" attribute
                 */
                public java.lang.String getMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$0);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$0);
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
                      return get_store().find_attribute_user(METHOD$0) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$0);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$0);
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
                      get_store().remove_attribute(METHOD$0);
                    }
                }
                
                /**
                 * Gets the "execTime" attribute
                 */
                public double getExecTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIME$2);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "execTime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "execTime" attribute
                 */
                public boolean isSetExecTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECTIME$2) != null;
                    }
                }
                
                /**
                 * Sets the "execTime" attribute
                 */
                public void setExecTime(double execTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIME$2);
                      }
                      target.setDoubleValue(execTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "execTime" attribute
                 */
                public void xsetExecTime(org.apache.xmlbeans.XmlDouble execTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIME$2);
                      }
                      target.set(execTime);
                    }
                }
                
                /**
                 * Unsets the "execTime" attribute
                 */
                public void unsetExecTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECTIME$2);
                    }
                }
                
                /**
                 * Gets the "cpuTime" attribute
                 */
                public double getCpuTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTIME$4);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpuTime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTIME$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpuTime" attribute
                 */
                public boolean isSetCpuTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUTIME$4) != null;
                    }
                }
                
                /**
                 * Sets the "cpuTime" attribute
                 */
                public void setCpuTime(double cpuTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTIME$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUTIME$4);
                      }
                      target.setDoubleValue(cpuTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpuTime" attribute
                 */
                public void xsetCpuTime(org.apache.xmlbeans.XmlDouble cpuTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTIME$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUTIME$4);
                      }
                      target.set(cpuTime);
                    }
                }
                
                /**
                 * Unsets the "cpuTime" attribute
                 */
                public void unsetCpuTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUTIME$4);
                    }
                }
                
                /**
                 * Gets the "syncTime" attribute
                 */
                public double getSyncTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTIME$6);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "syncTime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSyncTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCTIME$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "syncTime" attribute
                 */
                public boolean isSetSyncTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SYNCTIME$6) != null;
                    }
                }
                
                /**
                 * Sets the "syncTime" attribute
                 */
                public void setSyncTime(double syncTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTIME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCTIME$6);
                      }
                      target.setDoubleValue(syncTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "syncTime" attribute
                 */
                public void xsetSyncTime(org.apache.xmlbeans.XmlDouble syncTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCTIME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCTIME$6);
                      }
                      target.set(syncTime);
                    }
                }
                
                /**
                 * Unsets the "syncTime" attribute
                 */
                public void unsetSyncTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SYNCTIME$6);
                    }
                }
                
                /**
                 * Gets the "waitTime" attribute
                 */
                public double getWaitTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITTIME$8);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "waitTime" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWaitTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITTIME$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "waitTime" attribute
                 */
                public boolean isSetWaitTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WAITTIME$8) != null;
                    }
                }
                
                /**
                 * Sets the "waitTime" attribute
                 */
                public void setWaitTime(double waitTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITTIME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITTIME$8);
                      }
                      target.setDoubleValue(waitTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "waitTime" attribute
                 */
                public void xsetWaitTime(org.apache.xmlbeans.XmlDouble waitTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITTIME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITTIME$8);
                      }
                      target.set(waitTime);
                    }
                }
                
                /**
                 * Unsets the "waitTime" attribute
                 */
                public void unsetWaitTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WAITTIME$8);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BREAKDOWN$10);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BREAKDOWN$10);
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
                      return get_store().find_attribute_user(BREAKDOWN$10) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BREAKDOWN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BREAKDOWN$10);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BREAKDOWN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BREAKDOWN$10);
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
                      get_store().remove_attribute(BREAKDOWN$10);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$12);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$12);
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
                      return get_store().find_attribute_user(CLASS1$12) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$12);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$12);
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
                      get_store().remove_attribute(CLASS1$12);
                    }
                }
                
                /**
                 * Gets the "apis" attribute
                 */
                public java.lang.String getApis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APIS$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "apis" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetApis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APIS$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "apis" attribute
                 */
                public boolean isSetApis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(APIS$14) != null;
                    }
                }
                
                /**
                 * Sets the "apis" attribute
                 */
                public void setApis(java.lang.String apis)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APIS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APIS$14);
                      }
                      target.setStringValue(apis);
                    }
                }
                
                /**
                 * Sets (as xml) the "apis" attribute
                 */
                public void xsetApis(org.apache.xmlbeans.XmlString apis)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APIS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APIS$14);
                      }
                      target.set(apis);
                    }
                }
                
                /**
                 * Unsets the "apis" attribute
                 */
                public void unsetApis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(APIS$14);
                    }
                }
            }
        }
    }
}
