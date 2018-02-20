/*
 * An XML document type.
 * Localname: apibreakdowndashlet
 * Namespace: 
 * Java type: noNamespace.ApibreakdowndashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one apibreakdowndashlet(@) element.
 *
 * This is a complex type.
 */
public class ApibreakdowndashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ApibreakdowndashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApibreakdowndashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APIBREAKDOWNDASHLET$0 = 
        new javax.xml.namespace.QName("", "apibreakdowndashlet");
    
    
    /**
     * Gets the "apibreakdowndashlet" element
     */
    public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet getApibreakdowndashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet target = null;
            target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().find_element_user(APIBREAKDOWNDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "apibreakdowndashlet" element
     */
    public void setApibreakdowndashlet(noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet apibreakdowndashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet target = null;
            target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().find_element_user(APIBREAKDOWNDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().add_element_user(APIBREAKDOWNDASHLET$0);
            }
            target.set(apibreakdowndashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "apibreakdowndashlet" element
     */
    public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet addNewApibreakdowndashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet target = null;
            target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().add_element_user(APIBREAKDOWNDASHLET$0);
            return target;
        }
    }
    /**
     * An XML apibreakdowndashlet(@).
     *
     * This is a complex type.
     */
    public static class ApibreakdowndashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet
    {
        private static final long serialVersionUID = 1L;
        
        public ApibreakdowndashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName APIS$4 = 
            new javax.xml.namespace.QName("", "apis");
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
         * Gets the "apis" element
         */
        public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis getApis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis target = null;
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis)get_store().find_element_user(APIS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "apis" element
         */
        public boolean isSetApis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APIS$4) != 0;
            }
        }
        
        /**
         * Sets the "apis" element
         */
        public void setApis(noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis apis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis target = null;
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis)get_store().find_element_user(APIS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis)get_store().add_element_user(APIS$4);
                }
                target.set(apis);
            }
        }
        
        /**
         * Appends and returns a new empty "apis" element
         */
        public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis addNewApis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis target = null;
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis)get_store().add_element_user(APIS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "apis" element
         */
        public void unsetApis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APIS$4, 0);
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
         * An XML apis(@).
         *
         * This is a complex type.
         */
        public static class ApisImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis
        {
            private static final long serialVersionUID = 1L;
            
            public ApisImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName API$0 = 
                new javax.xml.namespace.QName("", "api");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "api" elements
             */
            public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api[] getApiArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(API$0, targetList);
                    noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api[] result = new noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "api" element
             */
            public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api getApiArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api target = null;
                    target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api)get_store().find_element_user(API$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "api" element
             */
            public int sizeOfApiArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(API$0);
                }
            }
            
            /**
             * Sets array of all "api" element
             */
            public void setApiArray(noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api[] apiArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(apiArray, API$0);
                }
            }
            
            /**
             * Sets ith "api" element
             */
            public void setApiArray(int i, noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api api)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api target = null;
                    target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api)get_store().find_element_user(API$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(api);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "api" element
             */
            public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api insertNewApi(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api target = null;
                    target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api)get_store().insert_element_user(API$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "api" element
             */
            public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api addNewApi()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api target = null;
                    target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api)get_store().add_element_user(API$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "api" element
             */
            public void removeApi(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(API$0, i);
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
             * An XML api(@).
             *
             * This is a complex type.
             */
            public static class ApiImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet.Apis.Api
            {
                private static final long serialVersionUID = 1L;
                
                public ApiImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName EXECAVG$2 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$4 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$6 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$8 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName CPUAVG$10 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUMIN$12 = 
                    new javax.xml.namespace.QName("", "cpu_min");
                private static final javax.xml.namespace.QName CPUMAX$14 = 
                    new javax.xml.namespace.QName("", "cpu_max");
                private static final javax.xml.namespace.QName CPUSUM$16 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                private static final javax.xml.namespace.QName SYNCAVG$18 = 
                    new javax.xml.namespace.QName("", "sync_avg");
                private static final javax.xml.namespace.QName SYNCMIN$20 = 
                    new javax.xml.namespace.QName("", "sync_min");
                private static final javax.xml.namespace.QName SYNCMAX$22 = 
                    new javax.xml.namespace.QName("", "sync_max");
                private static final javax.xml.namespace.QName SYNCSUM$24 = 
                    new javax.xml.namespace.QName("", "sync_sum");
                private static final javax.xml.namespace.QName WAITAVG$26 = 
                    new javax.xml.namespace.QName("", "wait_avg");
                private static final javax.xml.namespace.QName WAITMIN$28 = 
                    new javax.xml.namespace.QName("", "wait_min");
                private static final javax.xml.namespace.QName WAITMAX$30 = 
                    new javax.xml.namespace.QName("", "wait_max");
                private static final javax.xml.namespace.QName WAITSUM$32 = 
                    new javax.xml.namespace.QName("", "wait_sum");
                private static final javax.xml.namespace.QName SUSPENSIONAVG$34 = 
                    new javax.xml.namespace.QName("", "suspension_avg");
                private static final javax.xml.namespace.QName SUSPENSIONMIN$36 = 
                    new javax.xml.namespace.QName("", "suspension_min");
                private static final javax.xml.namespace.QName SUSPENSIONMAX$38 = 
                    new javax.xml.namespace.QName("", "suspension_max");
                private static final javax.xml.namespace.QName SUSPENSIONSUM$40 = 
                    new javax.xml.namespace.QName("", "suspension_sum");
                
                
                /**
                 * Gets the "name" attribute
                 */
                public java.lang.String getName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                      return get_store().find_attribute_user(NAME$0) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
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
                      get_store().remove_attribute(NAME$0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$2);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$2);
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
                      return get_store().find_attribute_user(EXECAVG$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$2);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$2);
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
                      get_store().remove_attribute(EXECAVG$2);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$4);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$4);
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
                      return get_store().find_attribute_user(EXECMIN$4) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$4);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$4);
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
                      get_store().remove_attribute(EXECMIN$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$6);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$6);
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
                      return get_store().find_attribute_user(EXECMAX$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$6);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$6);
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
                      get_store().remove_attribute(EXECMAX$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$8);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$8);
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
                      return get_store().find_attribute_user(EXECSUM$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$8);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$8);
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
                      get_store().remove_attribute(EXECSUM$8);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$10);
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
                      return get_store().find_attribute_user(CPUAVG$10) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$10);
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
                      get_store().remove_attribute(CPUAVG$10);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$12);
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
                      return get_store().find_attribute_user(CPUMIN$12) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMIN$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMIN$12);
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
                      get_store().remove_attribute(CPUMIN$12);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$14);
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
                      return get_store().find_attribute_user(CPUMAX$14) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMAX$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMAX$14);
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
                      get_store().remove_attribute(CPUMAX$14);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$16);
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
                      return get_store().find_attribute_user(CPUSUM$16) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$16);
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
                      get_store().remove_attribute(CPUSUM$16);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCAVG$18);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCAVG$18);
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
                      return get_store().find_attribute_user(SYNCAVG$18) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCAVG$18);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCAVG$18);
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
                      get_store().remove_attribute(SYNCAVG$18);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMIN$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMIN$20);
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
                      return get_store().find_attribute_user(SYNCMIN$20) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMIN$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCMIN$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMIN$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCMIN$20);
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
                      get_store().remove_attribute(SYNCMIN$20);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMAX$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMAX$22);
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
                      return get_store().find_attribute_user(SYNCMAX$22) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCMAX$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCMAX$22);
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
                      get_store().remove_attribute(SYNCMAX$22);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCSUM$24);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCSUM$24);
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
                      return get_store().find_attribute_user(SYNCSUM$24) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCSUM$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCSUM$24);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCSUM$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCSUM$24);
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
                      get_store().remove_attribute(SYNCSUM$24);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITAVG$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITAVG$26);
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
                      return get_store().find_attribute_user(WAITAVG$26) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITAVG$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITAVG$26);
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
                      get_store().remove_attribute(WAITAVG$26);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMIN$28);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMIN$28);
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
                      return get_store().find_attribute_user(WAITMIN$28) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMIN$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITMIN$28);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMIN$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITMIN$28);
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
                      get_store().remove_attribute(WAITMIN$28);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMAX$30);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMAX$30);
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
                      return get_store().find_attribute_user(WAITMAX$30) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMAX$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITMAX$30);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMAX$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITMAX$30);
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
                      get_store().remove_attribute(WAITMAX$30);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITSUM$32);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITSUM$32);
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
                      return get_store().find_attribute_user(WAITSUM$32) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITSUM$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITSUM$32);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITSUM$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITSUM$32);
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
                      get_store().remove_attribute(WAITSUM$32);
                    }
                }
                
                /**
                 * Gets the "suspension_avg" attribute
                 */
                public double getSuspensionAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONAVG$34);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "suspension_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSuspensionAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONAVG$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "suspension_avg" attribute
                 */
                public boolean isSetSuspensionAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUSPENSIONAVG$34) != null;
                    }
                }
                
                /**
                 * Sets the "suspension_avg" attribute
                 */
                public void setSuspensionAvg(double suspensionAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONAVG$34);
                      }
                      target.setDoubleValue(suspensionAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "suspension_avg" attribute
                 */
                public void xsetSuspensionAvg(org.apache.xmlbeans.XmlDouble suspensionAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONAVG$34);
                      }
                      target.set(suspensionAvg);
                    }
                }
                
                /**
                 * Unsets the "suspension_avg" attribute
                 */
                public void unsetSuspensionAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUSPENSIONAVG$34);
                    }
                }
                
                /**
                 * Gets the "suspension_min" attribute
                 */
                public double getSuspensionMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMIN$36);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "suspension_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSuspensionMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMIN$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "suspension_min" attribute
                 */
                public boolean isSetSuspensionMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUSPENSIONMIN$36) != null;
                    }
                }
                
                /**
                 * Sets the "suspension_min" attribute
                 */
                public void setSuspensionMin(double suspensionMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMIN$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONMIN$36);
                      }
                      target.setDoubleValue(suspensionMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "suspension_min" attribute
                 */
                public void xsetSuspensionMin(org.apache.xmlbeans.XmlDouble suspensionMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMIN$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONMIN$36);
                      }
                      target.set(suspensionMin);
                    }
                }
                
                /**
                 * Unsets the "suspension_min" attribute
                 */
                public void unsetSuspensionMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUSPENSIONMIN$36);
                    }
                }
                
                /**
                 * Gets the "suspension_max" attribute
                 */
                public double getSuspensionMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMAX$38);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "suspension_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSuspensionMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMAX$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "suspension_max" attribute
                 */
                public boolean isSetSuspensionMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUSPENSIONMAX$38) != null;
                    }
                }
                
                /**
                 * Sets the "suspension_max" attribute
                 */
                public void setSuspensionMax(double suspensionMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMAX$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONMAX$38);
                      }
                      target.setDoubleValue(suspensionMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "suspension_max" attribute
                 */
                public void xsetSuspensionMax(org.apache.xmlbeans.XmlDouble suspensionMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMAX$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONMAX$38);
                      }
                      target.set(suspensionMax);
                    }
                }
                
                /**
                 * Unsets the "suspension_max" attribute
                 */
                public void unsetSuspensionMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUSPENSIONMAX$38);
                    }
                }
                
                /**
                 * Gets the "suspension_sum" attribute
                 */
                public double getSuspensionSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONSUM$40);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "suspension_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSuspensionSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONSUM$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "suspension_sum" attribute
                 */
                public boolean isSetSuspensionSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUSPENSIONSUM$40) != null;
                    }
                }
                
                /**
                 * Sets the "suspension_sum" attribute
                 */
                public void setSuspensionSum(double suspensionSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONSUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONSUM$40);
                      }
                      target.setDoubleValue(suspensionSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "suspension_sum" attribute
                 */
                public void xsetSuspensionSum(org.apache.xmlbeans.XmlDouble suspensionSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONSUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONSUM$40);
                      }
                      target.set(suspensionSum);
                    }
                }
                
                /**
                 * Unsets the "suspension_sum" attribute
                 */
                public void unsetSuspensionSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUSPENSIONSUM$40);
                    }
                }
            }
        }
    }
}
