/*
 * An XML document type.
 * Localname: processdashlet
 * Namespace: 
 * Java type: noNamespace.ProcessdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one processdashlet(@) element.
 *
 * This is a complex type.
 */
public class ProcessdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ProcessdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProcessdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSDASHLET$0 = 
        new javax.xml.namespace.QName("", "processdashlet");
    
    
    /**
     * Gets the "processdashlet" element
     */
    public noNamespace.ProcessdashletDocument.Processdashlet getProcessdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ProcessdashletDocument.Processdashlet target = null;
            target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().find_element_user(PROCESSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "processdashlet" element
     */
    public void setProcessdashlet(noNamespace.ProcessdashletDocument.Processdashlet processdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ProcessdashletDocument.Processdashlet target = null;
            target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().find_element_user(PROCESSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().add_element_user(PROCESSDASHLET$0);
            }
            target.set(processdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "processdashlet" element
     */
    public noNamespace.ProcessdashletDocument.Processdashlet addNewProcessdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ProcessdashletDocument.Processdashlet target = null;
            target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().add_element_user(PROCESSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML processdashlet(@).
     *
     * This is a complex type.
     */
    public static class ProcessdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ProcessdashletDocument.Processdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public ProcessdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName PROCESS$4 = 
            new javax.xml.namespace.QName("", "process");
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
         * Gets array of all "process" elements
         */
        public noNamespace.ProcessdashletDocument.Processdashlet.Process[] getProcessArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROCESS$4, targetList);
                noNamespace.ProcessdashletDocument.Processdashlet.Process[] result = new noNamespace.ProcessdashletDocument.Processdashlet.Process[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "process" element
         */
        public noNamespace.ProcessdashletDocument.Processdashlet.Process getProcessArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet.Process target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet.Process)get_store().find_element_user(PROCESS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "process" element
         */
        public int sizeOfProcessArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCESS$4);
            }
        }
        
        /**
         * Sets array of all "process" element
         */
        public void setProcessArray(noNamespace.ProcessdashletDocument.Processdashlet.Process[] processArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(processArray, PROCESS$4);
            }
        }
        
        /**
         * Sets ith "process" element
         */
        public void setProcessArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process process)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet.Process target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet.Process)get_store().find_element_user(PROCESS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(process);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "process" element
         */
        public noNamespace.ProcessdashletDocument.Processdashlet.Process insertNewProcess(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet.Process target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet.Process)get_store().insert_element_user(PROCESS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "process" element
         */
        public noNamespace.ProcessdashletDocument.Processdashlet.Process addNewProcess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet.Process target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet.Process)get_store().add_element_user(PROCESS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "process" element
         */
        public void removeProcess(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCESS$4, i);
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
         * An XML process(@).
         *
         * This is a complex type.
         */
        public static class ProcessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ProcessdashletDocument.Processdashlet.Process
        {
            private static final long serialVersionUID = 1L;
            
            public ProcessImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CHART$0 = 
                new javax.xml.namespace.QName("", "chart");
            private static final javax.xml.namespace.QName NAME$2 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("", "type");
            private static final javax.xml.namespace.QName HOST$6 = 
                new javax.xml.namespace.QName("", "host");
            private static final javax.xml.namespace.QName STATE$8 = 
                new javax.xml.namespace.QName("", "state");
            private static final javax.xml.namespace.QName OS$10 = 
                new javax.xml.namespace.QName("", "os");
            private static final javax.xml.namespace.QName INSTRUMENTATIONSTATE$12 = 
                new javax.xml.namespace.QName("", "instrumentationstate");
            private static final javax.xml.namespace.QName UPTIME$14 = 
                new javax.xml.namespace.QName("", "uptime");
            private static final javax.xml.namespace.QName HEALTH$16 = 
                new javax.xml.namespace.QName("", "health");
            
            
            /**
             * Gets array of all "chart" elements
             */
            public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart[] getChartArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CHART$0, targetList);
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart[] result = new noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "chart" element
             */
            public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart getChartArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart target = null;
                    target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart)get_store().find_element_user(CHART$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "chart" element
             */
            public int sizeOfChartArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CHART$0);
                }
            }
            
            /**
             * Sets array of all "chart" element
             */
            public void setChartArray(noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart[] chartArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(chartArray, CHART$0);
                }
            }
            
            /**
             * Sets ith "chart" element
             */
            public void setChartArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart chart)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart target = null;
                    target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart)get_store().find_element_user(CHART$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(chart);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "chart" element
             */
            public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart insertNewChart(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart target = null;
                    target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart)get_store().insert_element_user(CHART$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "chart" element
             */
            public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart addNewChart()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart target = null;
                    target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart)get_store().add_element_user(CHART$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "chart" element
             */
            public void removeChart(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CHART$0, i);
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
            
            /**
             * Gets the "type" attribute
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public org.apache.xmlbeans.XmlString xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                    return target;
                }
            }
            
            /**
             * True if has "type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$4) != null;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(java.lang.String type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                    }
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(org.apache.xmlbeans.XmlString type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$4);
                }
            }
            
            /**
             * Gets the "host" attribute
             */
            public java.lang.String getHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "host" attribute
             */
            public org.apache.xmlbeans.XmlString xgetHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$6);
                    return target;
                }
            }
            
            /**
             * True if has "host" attribute
             */
            public boolean isSetHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(HOST$6) != null;
                }
            }
            
            /**
             * Sets the "host" attribute
             */
            public void setHost(java.lang.String host)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOST$6);
                    }
                    target.setStringValue(host);
                }
            }
            
            /**
             * Sets (as xml) the "host" attribute
             */
            public void xsetHost(org.apache.xmlbeans.XmlString host)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOST$6);
                    }
                    target.set(host);
                }
            }
            
            /**
             * Unsets the "host" attribute
             */
            public void unsetHost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(HOST$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$8);
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
                    return get_store().find_attribute_user(STATE$8) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$8);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATE$8);
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
                    get_store().remove_attribute(STATE$8);
                }
            }
            
            /**
             * Gets the "os" attribute
             */
            public java.lang.String getOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "os" attribute
             */
            public org.apache.xmlbeans.XmlString xgetOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$10);
                    return target;
                }
            }
            
            /**
             * True if has "os" attribute
             */
            public boolean isSetOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(OS$10) != null;
                }
            }
            
            /**
             * Sets the "os" attribute
             */
            public void setOs(java.lang.String os)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OS$10);
                    }
                    target.setStringValue(os);
                }
            }
            
            /**
             * Sets (as xml) the "os" attribute
             */
            public void xsetOs(org.apache.xmlbeans.XmlString os)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OS$10);
                    }
                    target.set(os);
                }
            }
            
            /**
             * Unsets the "os" attribute
             */
            public void unsetOs()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(OS$10);
                }
            }
            
            /**
             * Gets the "instrumentationstate" attribute
             */
            public java.lang.String getInstrumentationstate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTATIONSTATE$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "instrumentationstate" attribute
             */
            public org.apache.xmlbeans.XmlString xgetInstrumentationstate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSTRUMENTATIONSTATE$12);
                    return target;
                }
            }
            
            /**
             * True if has "instrumentationstate" attribute
             */
            public boolean isSetInstrumentationstate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INSTRUMENTATIONSTATE$12) != null;
                }
            }
            
            /**
             * Sets the "instrumentationstate" attribute
             */
            public void setInstrumentationstate(java.lang.String instrumentationstate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTRUMENTATIONSTATE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTRUMENTATIONSTATE$12);
                    }
                    target.setStringValue(instrumentationstate);
                }
            }
            
            /**
             * Sets (as xml) the "instrumentationstate" attribute
             */
            public void xsetInstrumentationstate(org.apache.xmlbeans.XmlString instrumentationstate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSTRUMENTATIONSTATE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INSTRUMENTATIONSTATE$12);
                    }
                    target.set(instrumentationstate);
                }
            }
            
            /**
             * Unsets the "instrumentationstate" attribute
             */
            public void unsetInstrumentationstate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INSTRUMENTATIONSTATE$12);
                }
            }
            
            /**
             * Gets the "uptime" attribute
             */
            public java.lang.String getUptime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPTIME$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "uptime" attribute
             */
            public org.apache.xmlbeans.XmlString xgetUptime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UPTIME$14);
                    return target;
                }
            }
            
            /**
             * True if has "uptime" attribute
             */
            public boolean isSetUptime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(UPTIME$14) != null;
                }
            }
            
            /**
             * Sets the "uptime" attribute
             */
            public void setUptime(java.lang.String uptime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPTIME$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPTIME$14);
                    }
                    target.setStringValue(uptime);
                }
            }
            
            /**
             * Sets (as xml) the "uptime" attribute
             */
            public void xsetUptime(org.apache.xmlbeans.XmlString uptime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UPTIME$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UPTIME$14);
                    }
                    target.set(uptime);
                }
            }
            
            /**
             * Unsets the "uptime" attribute
             */
            public void unsetUptime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(UPTIME$14);
                }
            }
            
            /**
             * Gets the "health" attribute
             */
            public java.lang.String getHealth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$16);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "health" attribute
             */
            public org.apache.xmlbeans.XmlString xgetHealth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$16);
                    return target;
                }
            }
            
            /**
             * True if has "health" attribute
             */
            public boolean isSetHealth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(HEALTH$16) != null;
                }
            }
            
            /**
             * Sets the "health" attribute
             */
            public void setHealth(java.lang.String health)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTH$16);
                    }
                    target.setStringValue(health);
                }
            }
            
            /**
             * Sets (as xml) the "health" attribute
             */
            public void xsetHealth(org.apache.xmlbeans.XmlString health)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTH$16);
                    }
                    target.set(health);
                }
            }
            
            /**
             * Unsets the "health" attribute
             */
            public void unsetHealth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(HEALTH$16);
                }
            }
            /**
             * An XML chart(@).
             *
             * This is a complex type.
             */
            public static class ChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart
            {
                private static final long serialVersionUID = 1L;
                
                public ChartImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SERIES$0 = 
                    new javax.xml.namespace.QName("", "series");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName STARTDATE$4 = 
                    new javax.xml.namespace.QName("", "startdate");
                private static final javax.xml.namespace.QName ENDDATE$6 = 
                    new javax.xml.namespace.QName("", "enddate");
                
                
                /**
                 * Gets array of all "series" elements
                 */
                public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series[] getSeriesArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(SERIES$0, targetList);
                      noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series[] result = new noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "series" element
                 */
                public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series getSeriesArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series target = null;
                      target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series)get_store().find_element_user(SERIES$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "series" element
                 */
                public int sizeOfSeriesArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SERIES$0);
                    }
                }
                
                /**
                 * Sets array of all "series" element
                 */
                public void setSeriesArray(noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series[] seriesArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(seriesArray, SERIES$0);
                    }
                }
                
                /**
                 * Sets ith "series" element
                 */
                public void setSeriesArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series series)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series target = null;
                      target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series)get_store().find_element_user(SERIES$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(series);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "series" element
                 */
                public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series insertNewSeries(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series target = null;
                      target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series)get_store().insert_element_user(SERIES$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "series" element
                 */
                public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series addNewSeries()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series target = null;
                      target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series)get_store().add_element_user(SERIES$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "series" element
                 */
                public void removeSeries(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SERIES$0, i);
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
                
                /**
                 * Gets the "startdate" attribute
                 */
                public java.lang.String getStartdate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "startdate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStartdate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "startdate" attribute
                 */
                public boolean isSetStartdate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STARTDATE$4) != null;
                    }
                }
                
                /**
                 * Sets the "startdate" attribute
                 */
                public void setStartdate(java.lang.String startdate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$4);
                      }
                      target.setStringValue(startdate);
                    }
                }
                
                /**
                 * Sets (as xml) the "startdate" attribute
                 */
                public void xsetStartdate(org.apache.xmlbeans.XmlString startdate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTDATE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTDATE$4);
                      }
                      target.set(startdate);
                    }
                }
                
                /**
                 * Unsets the "startdate" attribute
                 */
                public void unsetStartdate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STARTDATE$4);
                    }
                }
                
                /**
                 * Gets the "enddate" attribute
                 */
                public java.lang.String getEnddate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "enddate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetEnddate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "enddate" attribute
                 */
                public boolean isSetEnddate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ENDDATE$6) != null;
                    }
                }
                
                /**
                 * Sets the "enddate" attribute
                 */
                public void setEnddate(java.lang.String enddate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$6);
                      }
                      target.setStringValue(enddate);
                    }
                }
                
                /**
                 * Sets (as xml) the "enddate" attribute
                 */
                public void xsetEnddate(org.apache.xmlbeans.XmlString enddate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDDATE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDDATE$6);
                      }
                      target.set(enddate);
                    }
                }
                
                /**
                 * Unsets the "enddate" attribute
                 */
                public void unsetEnddate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ENDDATE$6);
                    }
                }
                /**
                 * An XML series(@).
                 *
                 * This is a complex type.
                 */
                public static class SeriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series
                {
                    private static final long serialVersionUID = 1L;
                    
                    public SeriesImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName MEASUREMENT$0 = 
                      new javax.xml.namespace.QName("", "measurement");
                    private static final javax.xml.namespace.QName NAME$2 = 
                      new javax.xml.namespace.QName("", "name");
                    private static final javax.xml.namespace.QName DATASETNUMBER$4 = 
                      new javax.xml.namespace.QName("", "datasetnumber");
                    private static final javax.xml.namespace.QName SERIESNUMBER$6 = 
                      new javax.xml.namespace.QName("", "seriesnumber");
                    
                    
                    /**
                     * Gets array of all "measurement" elements
                     */
                    public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement[] getMeasurementArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(MEASUREMENT$0, targetList);
                        noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement[] result = new noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "measurement" element
                     */
                    public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement getMeasurementArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement target = null;
                        target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "measurement" element
                     */
                    public int sizeOfMeasurementArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(MEASUREMENT$0);
                      }
                    }
                    
                    /**
                     * Sets array of all "measurement" element
                     */
                    public void setMeasurementArray(noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement[] measurementArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(measurementArray, MEASUREMENT$0);
                      }
                    }
                    
                    /**
                     * Sets ith "measurement" element
                     */
                    public void setMeasurementArray(int i, noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement measurement)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement target = null;
                        target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(measurement);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "measurement" element
                     */
                    public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement insertNewMeasurement(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement target = null;
                        target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "measurement" element
                     */
                    public noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement addNewMeasurement()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement target = null;
                        target = (noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement)get_store().add_element_user(MEASUREMENT$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "measurement" element
                     */
                    public void removeMeasurement(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(MEASUREMENT$0, i);
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
                    
                    /**
                     * Gets the "datasetnumber" attribute
                     */
                    public java.lang.String getDatasetnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASETNUMBER$4);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "datasetnumber" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetDatasetnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATASETNUMBER$4);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "datasetnumber" attribute
                     */
                    public boolean isSetDatasetnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(DATASETNUMBER$4) != null;
                      }
                    }
                    
                    /**
                     * Sets the "datasetnumber" attribute
                     */
                    public void setDatasetnumber(java.lang.String datasetnumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASETNUMBER$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASETNUMBER$4);
                        }
                        target.setStringValue(datasetnumber);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "datasetnumber" attribute
                     */
                    public void xsetDatasetnumber(org.apache.xmlbeans.XmlString datasetnumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATASETNUMBER$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DATASETNUMBER$4);
                        }
                        target.set(datasetnumber);
                      }
                    }
                    
                    /**
                     * Unsets the "datasetnumber" attribute
                     */
                    public void unsetDatasetnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(DATASETNUMBER$4);
                      }
                    }
                    
                    /**
                     * Gets the "seriesnumber" attribute
                     */
                    public java.lang.String getSeriesnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIESNUMBER$6);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "seriesnumber" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetSeriesnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIESNUMBER$6);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "seriesnumber" attribute
                     */
                    public boolean isSetSeriesnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(SERIESNUMBER$6) != null;
                      }
                    }
                    
                    /**
                     * Sets the "seriesnumber" attribute
                     */
                    public void setSeriesnumber(java.lang.String seriesnumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIESNUMBER$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIESNUMBER$6);
                        }
                        target.setStringValue(seriesnumber);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "seriesnumber" attribute
                     */
                    public void xsetSeriesnumber(org.apache.xmlbeans.XmlString seriesnumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIESNUMBER$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERIESNUMBER$6);
                        }
                        target.set(seriesnumber);
                      }
                    }
                    
                    /**
                     * Unsets the "seriesnumber" attribute
                     */
                    public void unsetSeriesnumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(SERIESNUMBER$6);
                      }
                    }
                    /**
                     * An XML measurement(@).
                     *
                     * This is a complex type.
                     */
                    public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ProcessdashletDocument.Processdashlet.Process.Chart.Series.Measurement
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName TIMESTAMP$0 = 
                        new javax.xml.namespace.QName("", "timestamp");
                      private static final javax.xml.namespace.QName VALUE$2 = 
                        new javax.xml.namespace.QName("", "value");
                      
                      
                      /**
                       * Gets the "timestamp" attribute
                       */
                      public java.util.Calendar getTimestamp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getCalendarValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "timestamp" attribute
                       */
                      public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDateTime target = null;
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "timestamp" attribute
                       */
                      public void setTimestamp(java.util.Calendar timestamp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$0);
                          }
                          target.setCalendarValue(timestamp);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "timestamp" attribute
                       */
                      public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDateTime target = null;
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$0);
                          }
                          target.set(timestamp);
                        }
                      }
                      
                      /**
                       * Gets the "value" attribute
                       */
                      public double getValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                          if (target == null)
                          {
                            return 0.0;
                          }
                          return target.getDoubleValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "value" attribute
                       */
                      public org.apache.xmlbeans.XmlDouble xgetValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDouble target = null;
                          target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "value" attribute
                       */
                      public boolean isSetValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().find_attribute_user(VALUE$2) != null;
                        }
                      }
                      
                      /**
                       * Sets the "value" attribute
                       */
                      public void setValue(double value)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                          }
                          target.setDoubleValue(value);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "value" attribute
                       */
                      public void xsetValue(org.apache.xmlbeans.XmlDouble value)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDouble target = null;
                          target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$2);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$2);
                          }
                          target.set(value);
                        }
                      }
                      
                      /**
                       * Unsets the "value" attribute
                       */
                      public void unsetValue()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_attribute(VALUE$2);
                        }
                      }
                    }
                }
            }
        }
    }
}
