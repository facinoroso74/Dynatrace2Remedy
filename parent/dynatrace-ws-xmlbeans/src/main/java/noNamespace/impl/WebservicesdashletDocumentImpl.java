/*
 * An XML document type.
 * Localname: webservicesdashlet
 * Namespace: 
 * Java type: noNamespace.WebservicesdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one webservicesdashlet(@) element.
 *
 * This is a complex type.
 */
public class WebservicesdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebservicesdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public WebservicesdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBSERVICESDASHLET$0 = 
        new javax.xml.namespace.QName("", "webservicesdashlet");
    
    
    /**
     * Gets the "webservicesdashlet" element
     */
    public noNamespace.WebservicesdashletDocument.Webservicesdashlet getWebservicesdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WebservicesdashletDocument.Webservicesdashlet target = null;
            target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().find_element_user(WEBSERVICESDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "webservicesdashlet" element
     */
    public void setWebservicesdashlet(noNamespace.WebservicesdashletDocument.Webservicesdashlet webservicesdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WebservicesdashletDocument.Webservicesdashlet target = null;
            target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().find_element_user(WEBSERVICESDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().add_element_user(WEBSERVICESDASHLET$0);
            }
            target.set(webservicesdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "webservicesdashlet" element
     */
    public noNamespace.WebservicesdashletDocument.Webservicesdashlet addNewWebservicesdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WebservicesdashletDocument.Webservicesdashlet target = null;
            target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().add_element_user(WEBSERVICESDASHLET$0);
            return target;
        }
    }
    /**
     * An XML webservicesdashlet(@).
     *
     * This is a complex type.
     */
    public static class WebservicesdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebservicesdashletDocument.Webservicesdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public WebservicesdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName WEBSERVICES$4 = 
            new javax.xml.namespace.QName("", "webservices");
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
         * Gets the "webservices" element
         */
        public noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices getWebservices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices target = null;
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices)get_store().find_element_user(WEBSERVICES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "webservices" element
         */
        public boolean isSetWebservices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBSERVICES$4) != 0;
            }
        }
        
        /**
         * Sets the "webservices" element
         */
        public void setWebservices(noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices webservices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices target = null;
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices)get_store().find_element_user(WEBSERVICES$4, 0);
                if (target == null)
                {
                    target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices)get_store().add_element_user(WEBSERVICES$4);
                }
                target.set(webservices);
            }
        }
        
        /**
         * Appends and returns a new empty "webservices" element
         */
        public noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices addNewWebservices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices target = null;
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices)get_store().add_element_user(WEBSERVICES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "webservices" element
         */
        public void unsetWebservices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBSERVICES$4, 0);
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
         * An XML webservices(@).
         *
         * This is a complex type.
         */
        public static class WebservicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices
        {
            private static final long serialVersionUID = 1L;
            
            public WebservicesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName WEBSERVICE$0 = 
                new javax.xml.namespace.QName("", "webservice");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "webservice" elements
             */
            public noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice[] getWebserviceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(WEBSERVICE$0, targetList);
                    noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice[] result = new noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "webservice" element
             */
            public noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice getWebserviceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice target = null;
                    target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice)get_store().find_element_user(WEBSERVICE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "webservice" element
             */
            public int sizeOfWebserviceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WEBSERVICE$0);
                }
            }
            
            /**
             * Sets array of all "webservice" element
             */
            public void setWebserviceArray(noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice[] webserviceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(webserviceArray, WEBSERVICE$0);
                }
            }
            
            /**
             * Sets ith "webservice" element
             */
            public void setWebserviceArray(int i, noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice webservice)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice target = null;
                    target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice)get_store().find_element_user(WEBSERVICE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(webservice);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "webservice" element
             */
            public noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice insertNewWebservice(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice target = null;
                    target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice)get_store().insert_element_user(WEBSERVICE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "webservice" element
             */
            public noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice addNewWebservice()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice target = null;
                    target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice)get_store().add_element_user(WEBSERVICE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "webservice" element
             */
            public void removeWebservice(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WEBSERVICE$0, i);
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
             * An XML webservice(@).
             *
             * This is a complex type.
             */
            public static class WebserviceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WebservicesdashletDocument.Webservicesdashlet.Webservices.Webservice
            {
                private static final long serialVersionUID = 1L;
                
                public WebserviceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName SIDE$2 = 
                    new javax.xml.namespace.QName("", "side");
                private static final javax.xml.namespace.QName ENDPOINT$4 = 
                    new javax.xml.namespace.QName("", "endpoint");
                private static final javax.xml.namespace.QName METHOD$6 = 
                    new javax.xml.namespace.QName("", "method");
                private static final javax.xml.namespace.QName COUNT$8 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName TOTALAVG$10 = 
                    new javax.xml.namespace.QName("", "total_avg");
                private static final javax.xml.namespace.QName TOTALMIN$12 = 
                    new javax.xml.namespace.QName("", "total_min");
                private static final javax.xml.namespace.QName TOTALMAX$14 = 
                    new javax.xml.namespace.QName("", "total_max");
                private static final javax.xml.namespace.QName TOTALSUM$16 = 
                    new javax.xml.namespace.QName("", "total_sum");
                private static final javax.xml.namespace.QName LATENCYAVG$18 = 
                    new javax.xml.namespace.QName("", "latency_avg");
                private static final javax.xml.namespace.QName LATENCYMIN$20 = 
                    new javax.xml.namespace.QName("", "latency_min");
                private static final javax.xml.namespace.QName LATENCYMAX$22 = 
                    new javax.xml.namespace.QName("", "latency_max");
                private static final javax.xml.namespace.QName LATENCYSUM$24 = 
                    new javax.xml.namespace.QName("", "latency_sum");
                private static final javax.xml.namespace.QName EXECAVG$26 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$28 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$30 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$32 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName REQUESTSIZEAVG$34 = 
                    new javax.xml.namespace.QName("", "request_size_avg");
                private static final javax.xml.namespace.QName REQUESTSIZEMIN$36 = 
                    new javax.xml.namespace.QName("", "request_size_min");
                private static final javax.xml.namespace.QName REQUESTSIZEMAX$38 = 
                    new javax.xml.namespace.QName("", "request_size_max");
                private static final javax.xml.namespace.QName REQUESTSIZESUM$40 = 
                    new javax.xml.namespace.QName("", "request_size_sum");
                private static final javax.xml.namespace.QName RESPONSESIZEAVG$42 = 
                    new javax.xml.namespace.QName("", "response_size_avg");
                private static final javax.xml.namespace.QName RESPONSESIZEMIN$44 = 
                    new javax.xml.namespace.QName("", "response_size_min");
                private static final javax.xml.namespace.QName RESPONSESIZEMAX$46 = 
                    new javax.xml.namespace.QName("", "response_size_max");
                private static final javax.xml.namespace.QName RESPONSESIZESUM$48 = 
                    new javax.xml.namespace.QName("", "response_size_sum");
                private static final javax.xml.namespace.QName CPUAVG$50 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUMIN$52 = 
                    new javax.xml.namespace.QName("", "cpu_min");
                private static final javax.xml.namespace.QName CPUMAX$54 = 
                    new javax.xml.namespace.QName("", "cpu_max");
                private static final javax.xml.namespace.QName CPUSUM$56 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                private static final javax.xml.namespace.QName APPLICATIONID$58 = 
                    new javax.xml.namespace.QName("", "application_id");
                private static final javax.xml.namespace.QName ERRORSTATE$60 = 
                    new javax.xml.namespace.QName("", "error_state");
                private static final javax.xml.namespace.QName FAILURERATE$62 = 
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
                 * Gets the "side" attribute
                 */
                public java.lang.String getSide()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIDE$2);
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
                      return get_store().find_attribute_user(SIDE$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDE$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIDE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIDE$2);
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
                      get_store().remove_attribute(SIDE$2);
                    }
                }
                
                /**
                 * Gets the "endpoint" attribute
                 */
                public java.lang.String getEndpoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINT$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "endpoint" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetEndpoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDPOINT$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "endpoint" attribute
                 */
                public boolean isSetEndpoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ENDPOINT$4) != null;
                    }
                }
                
                /**
                 * Sets the "endpoint" attribute
                 */
                public void setEndpoint(java.lang.String endpoint)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDPOINT$4);
                      }
                      target.setStringValue(endpoint);
                    }
                }
                
                /**
                 * Sets (as xml) the "endpoint" attribute
                 */
                public void xsetEndpoint(org.apache.xmlbeans.XmlString endpoint)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDPOINT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDPOINT$4);
                      }
                      target.set(endpoint);
                    }
                }
                
                /**
                 * Unsets the "endpoint" attribute
                 */
                public void unsetEndpoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ENDPOINT$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$6);
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
                      return get_store().find_attribute_user(METHOD$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$6);
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
                      get_store().remove_attribute(METHOD$6);
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
                 * Gets the "total_avg" attribute
                 */
                public double getTotalAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALAVG$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALAVG$10);
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
                      return get_store().find_attribute_user(TOTALAVG$10) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALAVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALAVG$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALAVG$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALAVG$10);
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
                      get_store().remove_attribute(TOTALAVG$10);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMIN$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMIN$12);
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
                      return get_store().find_attribute_user(TOTALMIN$12) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMIN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALMIN$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMIN$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALMIN$12);
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
                      get_store().remove_attribute(TOTALMIN$12);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMAX$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMAX$14);
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
                      return get_store().find_attribute_user(TOTALMAX$14) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALMAX$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALMAX$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALMAX$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALMAX$14);
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
                      get_store().remove_attribute(TOTALMAX$14);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSUM$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALSUM$16);
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
                      return get_store().find_attribute_user(TOTALSUM$16) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSUM$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSUM$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALSUM$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALSUM$16);
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
                      get_store().remove_attribute(TOTALSUM$16);
                    }
                }
                
                /**
                 * Gets the "latency_avg" attribute
                 */
                public double getLatencyAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYAVG$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "latency_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetLatencyAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYAVG$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "latency_avg" attribute
                 */
                public boolean isSetLatencyAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LATENCYAVG$18) != null;
                    }
                }
                
                /**
                 * Sets the "latency_avg" attribute
                 */
                public void setLatencyAvg(double latencyAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYAVG$18);
                      }
                      target.setDoubleValue(latencyAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "latency_avg" attribute
                 */
                public void xsetLatencyAvg(org.apache.xmlbeans.XmlDouble latencyAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYAVG$18);
                      }
                      target.set(latencyAvg);
                    }
                }
                
                /**
                 * Unsets the "latency_avg" attribute
                 */
                public void unsetLatencyAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LATENCYAVG$18);
                    }
                }
                
                /**
                 * Gets the "latency_min" attribute
                 */
                public double getLatencyMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMIN$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "latency_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetLatencyMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMIN$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "latency_min" attribute
                 */
                public boolean isSetLatencyMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LATENCYMIN$20) != null;
                    }
                }
                
                /**
                 * Sets the "latency_min" attribute
                 */
                public void setLatencyMin(double latencyMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMIN$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYMIN$20);
                      }
                      target.setDoubleValue(latencyMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "latency_min" attribute
                 */
                public void xsetLatencyMin(org.apache.xmlbeans.XmlDouble latencyMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMIN$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYMIN$20);
                      }
                      target.set(latencyMin);
                    }
                }
                
                /**
                 * Unsets the "latency_min" attribute
                 */
                public void unsetLatencyMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LATENCYMIN$20);
                    }
                }
                
                /**
                 * Gets the "latency_max" attribute
                 */
                public double getLatencyMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMAX$22);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "latency_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetLatencyMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMAX$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "latency_max" attribute
                 */
                public boolean isSetLatencyMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LATENCYMAX$22) != null;
                    }
                }
                
                /**
                 * Sets the "latency_max" attribute
                 */
                public void setLatencyMax(double latencyMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYMAX$22);
                      }
                      target.setDoubleValue(latencyMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "latency_max" attribute
                 */
                public void xsetLatencyMax(org.apache.xmlbeans.XmlDouble latencyMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMAX$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYMAX$22);
                      }
                      target.set(latencyMax);
                    }
                }
                
                /**
                 * Unsets the "latency_max" attribute
                 */
                public void unsetLatencyMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LATENCYMAX$22);
                    }
                }
                
                /**
                 * Gets the "latency_sum" attribute
                 */
                public double getLatencySum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYSUM$24);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "latency_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetLatencySum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYSUM$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "latency_sum" attribute
                 */
                public boolean isSetLatencySum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LATENCYSUM$24) != null;
                    }
                }
                
                /**
                 * Sets the "latency_sum" attribute
                 */
                public void setLatencySum(double latencySum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYSUM$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYSUM$24);
                      }
                      target.setDoubleValue(latencySum);
                    }
                }
                
                /**
                 * Sets (as xml) the "latency_sum" attribute
                 */
                public void xsetLatencySum(org.apache.xmlbeans.XmlDouble latencySum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYSUM$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYSUM$24);
                      }
                      target.set(latencySum);
                    }
                }
                
                /**
                 * Unsets the "latency_sum" attribute
                 */
                public void unsetLatencySum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LATENCYSUM$24);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$26);
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
                      return get_store().find_attribute_user(EXECAVG$26) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$26);
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
                      get_store().remove_attribute(EXECAVG$26);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$28);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$28);
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
                      return get_store().find_attribute_user(EXECMIN$28) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$28);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$28);
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
                      get_store().remove_attribute(EXECMIN$28);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$30);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$30);
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
                      return get_store().find_attribute_user(EXECMAX$30) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$30);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$30);
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
                      get_store().remove_attribute(EXECMAX$30);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$32);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$32);
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
                      return get_store().find_attribute_user(EXECSUM$32) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$32);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$32);
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
                      get_store().remove_attribute(EXECSUM$32);
                    }
                }
                
                /**
                 * Gets the "request_size_avg" attribute
                 */
                public java.math.BigInteger getRequestSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEAVG$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "request_size_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRequestSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZEAVG$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "request_size_avg" attribute
                 */
                public boolean isSetRequestSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REQUESTSIZEAVG$34) != null;
                    }
                }
                
                /**
                 * Sets the "request_size_avg" attribute
                 */
                public void setRequestSizeAvg(java.math.BigInteger requestSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSIZEAVG$34);
                      }
                      target.setBigIntegerValue(requestSizeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "request_size_avg" attribute
                 */
                public void xsetRequestSizeAvg(org.apache.xmlbeans.XmlInteger requestSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZEAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTSIZEAVG$34);
                      }
                      target.set(requestSizeAvg);
                    }
                }
                
                /**
                 * Unsets the "request_size_avg" attribute
                 */
                public void unsetRequestSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REQUESTSIZEAVG$34);
                    }
                }
                
                /**
                 * Gets the "request_size_min" attribute
                 */
                public java.math.BigInteger getRequestSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEMIN$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "request_size_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRequestSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZEMIN$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "request_size_min" attribute
                 */
                public boolean isSetRequestSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REQUESTSIZEMIN$36) != null;
                    }
                }
                
                /**
                 * Sets the "request_size_min" attribute
                 */
                public void setRequestSizeMin(java.math.BigInteger requestSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEMIN$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSIZEMIN$36);
                      }
                      target.setBigIntegerValue(requestSizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "request_size_min" attribute
                 */
                public void xsetRequestSizeMin(org.apache.xmlbeans.XmlInteger requestSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZEMIN$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTSIZEMIN$36);
                      }
                      target.set(requestSizeMin);
                    }
                }
                
                /**
                 * Unsets the "request_size_min" attribute
                 */
                public void unsetRequestSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REQUESTSIZEMIN$36);
                    }
                }
                
                /**
                 * Gets the "request_size_max" attribute
                 */
                public java.math.BigInteger getRequestSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEMAX$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "request_size_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRequestSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZEMAX$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "request_size_max" attribute
                 */
                public boolean isSetRequestSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REQUESTSIZEMAX$38) != null;
                    }
                }
                
                /**
                 * Sets the "request_size_max" attribute
                 */
                public void setRequestSizeMax(java.math.BigInteger requestSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEMAX$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSIZEMAX$38);
                      }
                      target.setBigIntegerValue(requestSizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "request_size_max" attribute
                 */
                public void xsetRequestSizeMax(org.apache.xmlbeans.XmlInteger requestSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZEMAX$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTSIZEMAX$38);
                      }
                      target.set(requestSizeMax);
                    }
                }
                
                /**
                 * Unsets the "request_size_max" attribute
                 */
                public void unsetRequestSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REQUESTSIZEMAX$38);
                    }
                }
                
                /**
                 * Gets the "request_size_sum" attribute
                 */
                public java.math.BigInteger getRequestSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZESUM$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "request_size_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRequestSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZESUM$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "request_size_sum" attribute
                 */
                public boolean isSetRequestSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REQUESTSIZESUM$40) != null;
                    }
                }
                
                /**
                 * Sets the "request_size_sum" attribute
                 */
                public void setRequestSizeSum(java.math.BigInteger requestSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZESUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSIZESUM$40);
                      }
                      target.setBigIntegerValue(requestSizeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "request_size_sum" attribute
                 */
                public void xsetRequestSizeSum(org.apache.xmlbeans.XmlInteger requestSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSIZESUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTSIZESUM$40);
                      }
                      target.set(requestSizeSum);
                    }
                }
                
                /**
                 * Unsets the "request_size_sum" attribute
                 */
                public void unsetRequestSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REQUESTSIZESUM$40);
                    }
                }
                
                /**
                 * Gets the "response_size_avg" attribute
                 */
                public java.math.BigInteger getResponseSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEAVG$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_size_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetResponseSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZEAVG$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_size_avg" attribute
                 */
                public boolean isSetResponseSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSESIZEAVG$42) != null;
                    }
                }
                
                /**
                 * Sets the "response_size_avg" attribute
                 */
                public void setResponseSizeAvg(java.math.BigInteger responseSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEAVG$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSESIZEAVG$42);
                      }
                      target.setBigIntegerValue(responseSizeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_size_avg" attribute
                 */
                public void xsetResponseSizeAvg(org.apache.xmlbeans.XmlInteger responseSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZEAVG$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RESPONSESIZEAVG$42);
                      }
                      target.set(responseSizeAvg);
                    }
                }
                
                /**
                 * Unsets the "response_size_avg" attribute
                 */
                public void unsetResponseSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSESIZEAVG$42);
                    }
                }
                
                /**
                 * Gets the "response_size_min" attribute
                 */
                public java.math.BigInteger getResponseSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEMIN$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_size_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetResponseSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZEMIN$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_size_min" attribute
                 */
                public boolean isSetResponseSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSESIZEMIN$44) != null;
                    }
                }
                
                /**
                 * Sets the "response_size_min" attribute
                 */
                public void setResponseSizeMin(java.math.BigInteger responseSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEMIN$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSESIZEMIN$44);
                      }
                      target.setBigIntegerValue(responseSizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_size_min" attribute
                 */
                public void xsetResponseSizeMin(org.apache.xmlbeans.XmlInteger responseSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZEMIN$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RESPONSESIZEMIN$44);
                      }
                      target.set(responseSizeMin);
                    }
                }
                
                /**
                 * Unsets the "response_size_min" attribute
                 */
                public void unsetResponseSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSESIZEMIN$44);
                    }
                }
                
                /**
                 * Gets the "response_size_max" attribute
                 */
                public java.math.BigInteger getResponseSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEMAX$46);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_size_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetResponseSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZEMAX$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_size_max" attribute
                 */
                public boolean isSetResponseSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSESIZEMAX$46) != null;
                    }
                }
                
                /**
                 * Sets the "response_size_max" attribute
                 */
                public void setResponseSizeMax(java.math.BigInteger responseSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEMAX$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSESIZEMAX$46);
                      }
                      target.setBigIntegerValue(responseSizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_size_max" attribute
                 */
                public void xsetResponseSizeMax(org.apache.xmlbeans.XmlInteger responseSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZEMAX$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RESPONSESIZEMAX$46);
                      }
                      target.set(responseSizeMax);
                    }
                }
                
                /**
                 * Unsets the "response_size_max" attribute
                 */
                public void unsetResponseSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSESIZEMAX$46);
                    }
                }
                
                /**
                 * Gets the "response_size_sum" attribute
                 */
                public java.math.BigInteger getResponseSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZESUM$48);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_size_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetResponseSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZESUM$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_size_sum" attribute
                 */
                public boolean isSetResponseSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSESIZESUM$48) != null;
                    }
                }
                
                /**
                 * Sets the "response_size_sum" attribute
                 */
                public void setResponseSizeSum(java.math.BigInteger responseSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZESUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSESIZESUM$48);
                      }
                      target.setBigIntegerValue(responseSizeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_size_sum" attribute
                 */
                public void xsetResponseSizeSum(org.apache.xmlbeans.XmlInteger responseSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RESPONSESIZESUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RESPONSESIZESUM$48);
                      }
                      target.set(responseSizeSum);
                    }
                }
                
                /**
                 * Unsets the "response_size_sum" attribute
                 */
                public void unsetResponseSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSESIZESUM$48);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$50);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$50);
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
                      return get_store().find_attribute_user(CPUAVG$50) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$50);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$50);
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
                      get_store().remove_attribute(CPUAVG$50);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$52);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$52);
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
                      return get_store().find_attribute_user(CPUMIN$52) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMIN$52);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMIN$52);
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
                      get_store().remove_attribute(CPUMIN$52);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$54);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$54);
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
                      return get_store().find_attribute_user(CPUMAX$54) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMAX$54);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMAX$54);
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
                      get_store().remove_attribute(CPUMAX$54);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$56);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$56);
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
                      return get_store().find_attribute_user(CPUSUM$56) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$56);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$56);
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
                      get_store().remove_attribute(CPUSUM$56);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$58);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$58);
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
                      return get_store().find_attribute_user(APPLICATIONID$58) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONID$58);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATIONID$58);
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
                      get_store().remove_attribute(APPLICATIONID$58);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$60);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$60);
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
                      return get_store().find_attribute_user(ERRORSTATE$60) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTATE$60);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORSTATE$60);
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
                      get_store().remove_attribute(ERRORSTATE$60);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$62);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$62);
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
                      return get_store().find_attribute_user(FAILURERATE$62) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$62);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$62);
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
                      get_store().remove_attribute(FAILURERATE$62);
                    }
                }
            }
        }
    }
}
