/*
 * An XML document type.
 * Localname: licenseoverview
 * Namespace: 
 * Java type: noNamespace.LicenseoverviewDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one licenseoverview(@) element.
 *
 * This is a complex type.
 */
public class LicenseoverviewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.LicenseoverviewDocument
{
    private static final long serialVersionUID = 1L;
    
    public LicenseoverviewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LICENSEOVERVIEW$0 = 
        new javax.xml.namespace.QName("", "licenseoverview");
    
    
    /**
     * Gets the "licenseoverview" element
     */
    public noNamespace.LicenseoverviewDocument.Licenseoverview getLicenseoverview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.LicenseoverviewDocument.Licenseoverview target = null;
            target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().find_element_user(LICENSEOVERVIEW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "licenseoverview" element
     */
    public void setLicenseoverview(noNamespace.LicenseoverviewDocument.Licenseoverview licenseoverview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.LicenseoverviewDocument.Licenseoverview target = null;
            target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().find_element_user(LICENSEOVERVIEW$0, 0);
            if (target == null)
            {
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().add_element_user(LICENSEOVERVIEW$0);
            }
            target.set(licenseoverview);
        }
    }
    
    /**
     * Appends and returns a new empty "licenseoverview" element
     */
    public noNamespace.LicenseoverviewDocument.Licenseoverview addNewLicenseoverview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.LicenseoverviewDocument.Licenseoverview target = null;
            target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().add_element_user(LICENSEOVERVIEW$0);
            return target;
        }
    }
    /**
     * An XML licenseoverview(@).
     *
     * This is a complex type.
     */
    public static class LicenseoverviewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.LicenseoverviewDocument.Licenseoverview
    {
        private static final long serialVersionUID = 1L;
        
        public LicenseoverviewImpl(org.apache.xmlbeans.SchemaType sType)
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
        public noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset getRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset target = null;
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset)get_store().find_element_user(RECORDSET$4, 0);
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
        public void setRecordset(noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset recordset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset target = null;
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset)get_store().find_element_user(RECORDSET$4, 0);
                if (target == null)
                {
                    target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset)get_store().add_element_user(RECORDSET$4);
                }
                target.set(recordset);
            }
        }
        
        /**
         * Appends and returns a new empty "recordset" element
         */
        public noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset addNewRecordset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset target = null;
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset)get_store().add_element_user(RECORDSET$4);
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
         * An XML recordset(@).
         *
         * This is a complex type.
         */
        public static class RecordsetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset
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
            public noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record[] getRecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RECORD$0, targetList);
                    noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record[] result = new noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "record" element
             */
            public noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record getRecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record target = null;
                    target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record)get_store().find_element_user(RECORD$0, i);
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
            public void setRecordArray(noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record[] recordArray)
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
            public void setRecordArray(int i, noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record record)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record target = null;
                    target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record)get_store().find_element_user(RECORD$0, i);
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
            public noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record insertNewRecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record target = null;
                    target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record)get_store().insert_element_user(RECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "record" element
             */
            public noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record addNewRecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record target = null;
                    target = (noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record)get_store().add_element_user(RECORD$0);
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
            public static class RecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.LicenseoverviewDocument.Licenseoverview.Recordset.Record
            {
                private static final long serialVersionUID = 1L;
                
                public RecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TECHNOLOGY$0 = 
                    new javax.xml.namespace.QName("", "technology");
                private static final javax.xml.namespace.QName LICENSECOUNT$2 = 
                    new javax.xml.namespace.QName("", "licensecount");
                private static final javax.xml.namespace.QName UNIT$4 = 
                    new javax.xml.namespace.QName("", "unit");
                private static final javax.xml.namespace.QName CONNECTEDAGENTS$6 = 
                    new javax.xml.namespace.QName("", "connectedagents");
                private static final javax.xml.namespace.QName REMAININGVOLUME$8 = 
                    new javax.xml.namespace.QName("", "remainingvolume");
                private static final javax.xml.namespace.QName OK$10 = 
                    new javax.xml.namespace.QName("", "ok");
                private static final javax.xml.namespace.QName CONSUMPTIONBASED$12 = 
                    new javax.xml.namespace.QName("", "consumptionbased");
                private static final javax.xml.namespace.QName WEIGHT$14 = 
                    new javax.xml.namespace.QName("", "weight");
                private static final javax.xml.namespace.QName NOTOK$16 = 
                    new javax.xml.namespace.QName("", "notok");
                
                
                /**
                 * Gets the "technology" attribute
                 */
                public java.lang.String getTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGY$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "technology" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGY$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "technology" attribute
                 */
                public boolean isSetTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TECHNOLOGY$0) != null;
                    }
                }
                
                /**
                 * Sets the "technology" attribute
                 */
                public void setTechnology(java.lang.String technology)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGY$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TECHNOLOGY$0);
                      }
                      target.setStringValue(technology);
                    }
                }
                
                /**
                 * Sets (as xml) the "technology" attribute
                 */
                public void xsetTechnology(org.apache.xmlbeans.XmlString technology)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGY$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TECHNOLOGY$0);
                      }
                      target.set(technology);
                    }
                }
                
                /**
                 * Unsets the "technology" attribute
                 */
                public void unsetTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TECHNOLOGY$0);
                    }
                }
                
                /**
                 * Gets the "licensecount" attribute
                 */
                public java.math.BigInteger getLicensecount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LICENSECOUNT$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "licensecount" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetLicensecount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LICENSECOUNT$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "licensecount" attribute
                 */
                public boolean isSetLicensecount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LICENSECOUNT$2) != null;
                    }
                }
                
                /**
                 * Sets the "licensecount" attribute
                 */
                public void setLicensecount(java.math.BigInteger licensecount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LICENSECOUNT$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LICENSECOUNT$2);
                      }
                      target.setBigIntegerValue(licensecount);
                    }
                }
                
                /**
                 * Sets (as xml) the "licensecount" attribute
                 */
                public void xsetLicensecount(org.apache.xmlbeans.XmlInteger licensecount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LICENSECOUNT$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LICENSECOUNT$2);
                      }
                      target.set(licensecount);
                    }
                }
                
                /**
                 * Unsets the "licensecount" attribute
                 */
                public void unsetLicensecount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LICENSECOUNT$2);
                    }
                }
                
                /**
                 * Gets the "unit" attribute
                 */
                public java.lang.String getUnit()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "unit" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUnit()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "unit" attribute
                 */
                public boolean isSetUnit()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(UNIT$4) != null;
                    }
                }
                
                /**
                 * Sets the "unit" attribute
                 */
                public void setUnit(java.lang.String unit)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$4);
                      }
                      target.setStringValue(unit);
                    }
                }
                
                /**
                 * Sets (as xml) the "unit" attribute
                 */
                public void xsetUnit(org.apache.xmlbeans.XmlString unit)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIT$4);
                      }
                      target.set(unit);
                    }
                }
                
                /**
                 * Unsets the "unit" attribute
                 */
                public void unsetUnit()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(UNIT$4);
                    }
                }
                
                /**
                 * Gets the "connectedagents" attribute
                 */
                public java.math.BigInteger getConnectedagents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTEDAGENTS$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "connectedagents" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetConnectedagents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CONNECTEDAGENTS$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "connectedagents" attribute
                 */
                public boolean isSetConnectedagents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CONNECTEDAGENTS$6) != null;
                    }
                }
                
                /**
                 * Sets the "connectedagents" attribute
                 */
                public void setConnectedagents(java.math.BigInteger connectedagents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTEDAGENTS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTEDAGENTS$6);
                      }
                      target.setBigIntegerValue(connectedagents);
                    }
                }
                
                /**
                 * Sets (as xml) the "connectedagents" attribute
                 */
                public void xsetConnectedagents(org.apache.xmlbeans.XmlInteger connectedagents)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CONNECTEDAGENTS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CONNECTEDAGENTS$6);
                      }
                      target.set(connectedagents);
                    }
                }
                
                /**
                 * Unsets the "connectedagents" attribute
                 */
                public void unsetConnectedagents()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CONNECTEDAGENTS$6);
                    }
                }
                
                /**
                 * Gets the "remainingvolume" attribute
                 */
                public java.math.BigInteger getRemainingvolume()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMAININGVOLUME$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "remainingvolume" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRemainingvolume()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REMAININGVOLUME$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "remainingvolume" attribute
                 */
                public boolean isSetRemainingvolume()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REMAININGVOLUME$8) != null;
                    }
                }
                
                /**
                 * Sets the "remainingvolume" attribute
                 */
                public void setRemainingvolume(java.math.BigInteger remainingvolume)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMAININGVOLUME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMAININGVOLUME$8);
                      }
                      target.setBigIntegerValue(remainingvolume);
                    }
                }
                
                /**
                 * Sets (as xml) the "remainingvolume" attribute
                 */
                public void xsetRemainingvolume(org.apache.xmlbeans.XmlInteger remainingvolume)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REMAININGVOLUME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REMAININGVOLUME$8);
                      }
                      target.set(remainingvolume);
                    }
                }
                
                /**
                 * Unsets the "remainingvolume" attribute
                 */
                public void unsetRemainingvolume()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REMAININGVOLUME$8);
                    }
                }
                
                /**
                 * Gets the "ok" attribute
                 */
                public java.math.BigInteger getOk()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OK$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ok" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetOk()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OK$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "ok" attribute
                 */
                public boolean isSetOk()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OK$10) != null;
                    }
                }
                
                /**
                 * Sets the "ok" attribute
                 */
                public void setOk(java.math.BigInteger ok)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OK$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OK$10);
                      }
                      target.setBigIntegerValue(ok);
                    }
                }
                
                /**
                 * Sets (as xml) the "ok" attribute
                 */
                public void xsetOk(org.apache.xmlbeans.XmlInteger ok)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OK$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OK$10);
                      }
                      target.set(ok);
                    }
                }
                
                /**
                 * Unsets the "ok" attribute
                 */
                public void unsetOk()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OK$10);
                    }
                }
                
                /**
                 * Gets the "consumptionbased" attribute
                 */
                public java.math.BigInteger getConsumptionbased()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSUMPTIONBASED$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "consumptionbased" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetConsumptionbased()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CONSUMPTIONBASED$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "consumptionbased" attribute
                 */
                public boolean isSetConsumptionbased()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CONSUMPTIONBASED$12) != null;
                    }
                }
                
                /**
                 * Sets the "consumptionbased" attribute
                 */
                public void setConsumptionbased(java.math.BigInteger consumptionbased)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSUMPTIONBASED$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSUMPTIONBASED$12);
                      }
                      target.setBigIntegerValue(consumptionbased);
                    }
                }
                
                /**
                 * Sets (as xml) the "consumptionbased" attribute
                 */
                public void xsetConsumptionbased(org.apache.xmlbeans.XmlInteger consumptionbased)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CONSUMPTIONBASED$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CONSUMPTIONBASED$12);
                      }
                      target.set(consumptionbased);
                    }
                }
                
                /**
                 * Unsets the "consumptionbased" attribute
                 */
                public void unsetConsumptionbased()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CONSUMPTIONBASED$12);
                    }
                }
                
                /**
                 * Gets the "weight" attribute
                 */
                public double getWeight()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "weight" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetWeight()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEIGHT$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "weight" attribute
                 */
                public boolean isSetWeight()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WEIGHT$14) != null;
                    }
                }
                
                /**
                 * Sets the "weight" attribute
                 */
                public void setWeight(double weight)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEIGHT$14);
                      }
                      target.setDoubleValue(weight);
                    }
                }
                
                /**
                 * Sets (as xml) the "weight" attribute
                 */
                public void xsetWeight(org.apache.xmlbeans.XmlDouble weight)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WEIGHT$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WEIGHT$14);
                      }
                      target.set(weight);
                    }
                }
                
                /**
                 * Unsets the "weight" attribute
                 */
                public void unsetWeight()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WEIGHT$14);
                    }
                }
                
                /**
                 * Gets the "notok" attribute
                 */
                public java.math.BigInteger getNotok()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTOK$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "notok" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetNotok()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NOTOK$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "notok" attribute
                 */
                public boolean isSetNotok()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NOTOK$16) != null;
                    }
                }
                
                /**
                 * Sets the "notok" attribute
                 */
                public void setNotok(java.math.BigInteger notok)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTOK$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOTOK$16);
                      }
                      target.setBigIntegerValue(notok);
                    }
                }
                
                /**
                 * Sets (as xml) the "notok" attribute
                 */
                public void xsetNotok(org.apache.xmlbeans.XmlInteger notok)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NOTOK$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NOTOK$16);
                      }
                      target.set(notok);
                    }
                }
                
                /**
                 * Unsets the "notok" attribute
                 */
                public void unsetNotok()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NOTOK$16);
                    }
                }
            }
        }
    }
}
