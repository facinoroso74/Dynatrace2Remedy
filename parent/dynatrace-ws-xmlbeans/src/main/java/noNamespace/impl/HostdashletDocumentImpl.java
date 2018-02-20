/*
 * An XML document type.
 * Localname: hostdashlet
 * Namespace: 
 * Java type: noNamespace.HostdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one hostdashlet(@) element.
 *
 * This is a complex type.
 */
public class HostdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTDASHLET$0 = 
        new javax.xml.namespace.QName("", "hostdashlet");
    
    
    /**
     * Gets the "hostdashlet" element
     */
    public noNamespace.HostdashletDocument.Hostdashlet getHostdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HostdashletDocument.Hostdashlet target = null;
            target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().find_element_user(HOSTDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hostdashlet" element
     */
    public void setHostdashlet(noNamespace.HostdashletDocument.Hostdashlet hostdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HostdashletDocument.Hostdashlet target = null;
            target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().find_element_user(HOSTDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().add_element_user(HOSTDASHLET$0);
            }
            target.set(hostdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "hostdashlet" element
     */
    public noNamespace.HostdashletDocument.Hostdashlet addNewHostdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HostdashletDocument.Hostdashlet target = null;
            target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().add_element_user(HOSTDASHLET$0);
            return target;
        }
    }
    /**
     * An XML hostdashlet(@).
     *
     * This is a complex type.
     */
    public static class HostdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public HostdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName HOST$4 = 
            new javax.xml.namespace.QName("", "host");
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
         * Gets array of all "host" elements
         */
        public noNamespace.HostdashletDocument.Hostdashlet.Host[] getHostArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HOST$4, targetList);
                noNamespace.HostdashletDocument.Hostdashlet.Host[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "host" element
         */
        public noNamespace.HostdashletDocument.Hostdashlet.Host getHostArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet.Host target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet.Host)get_store().find_element_user(HOST$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "host" element
         */
        public int sizeOfHostArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOST$4);
            }
        }
        
        /**
         * Sets array of all "host" element
         */
        public void setHostArray(noNamespace.HostdashletDocument.Hostdashlet.Host[] hostArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hostArray, HOST$4);
            }
        }
        
        /**
         * Sets ith "host" element
         */
        public void setHostArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host host)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet.Host target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet.Host)get_store().find_element_user(HOST$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(host);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "host" element
         */
        public noNamespace.HostdashletDocument.Hostdashlet.Host insertNewHost(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet.Host target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet.Host)get_store().insert_element_user(HOST$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "host" element
         */
        public noNamespace.HostdashletDocument.Hostdashlet.Host addNewHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet.Host target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet.Host)get_store().add_element_user(HOST$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "host" element
         */
        public void removeHost(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOST$4, i);
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
         * An XML host(@).
         *
         * This is a complex type.
         */
        public static class HostImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host
        {
            private static final long serialVersionUID = 1L;
            
            public HostImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CHARTS$0 = 
                new javax.xml.namespace.QName("", "charts");
            private static final javax.xml.namespace.QName PROCESSES$2 = 
                new javax.xml.namespace.QName("", "processes");
            private static final javax.xml.namespace.QName HOSTNAME$4 = 
                new javax.xml.namespace.QName("", "hostname");
            private static final javax.xml.namespace.QName OS$6 = 
                new javax.xml.namespace.QName("", "os");
            private static final javax.xml.namespace.QName OSARCHITECTURE$8 = 
                new javax.xml.namespace.QName("", "osarchitecture");
            private static final javax.xml.namespace.QName VERSION$10 = 
                new javax.xml.namespace.QName("", "version");
            private static final javax.xml.namespace.QName APPLICATIONPROCESSES$12 = 
                new javax.xml.namespace.QName("", "applicationprocesses");
            private static final javax.xml.namespace.QName WEBSERVERS$14 = 
                new javax.xml.namespace.QName("", "webservers");
            private static final javax.xml.namespace.QName IPADDRESS$16 = 
                new javax.xml.namespace.QName("", "ipaddress");
            private static final javax.xml.namespace.QName CPUCORES$18 = 
                new javax.xml.namespace.QName("", "cpucores");
            private static final javax.xml.namespace.QName PHYSICALMEMORY$20 = 
                new javax.xml.namespace.QName("", "physicalmemory");
            private static final javax.xml.namespace.QName VIRTUALIZED$22 = 
                new javax.xml.namespace.QName("", "virtualized");
            private static final javax.xml.namespace.QName CLOUD$24 = 
                new javax.xml.namespace.QName("", "cloud");
            
            
            /**
             * Gets array of all "charts" elements
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts[] getChartsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CHARTS$0, targetList);
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "charts" element
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts getChartsArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts)get_store().find_element_user(CHARTS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "charts" element
             */
            public int sizeOfChartsArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CHARTS$0);
                }
            }
            
            /**
             * Sets array of all "charts" element
             */
            public void setChartsArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts[] chartsArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(chartsArray, CHARTS$0);
                }
            }
            
            /**
             * Sets ith "charts" element
             */
            public void setChartsArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts charts)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts)get_store().find_element_user(CHARTS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(charts);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "charts" element
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts insertNewCharts(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts)get_store().insert_element_user(CHARTS$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "charts" element
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts addNewCharts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Charts target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts)get_store().add_element_user(CHARTS$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "charts" element
             */
            public void removeCharts(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CHARTS$0, i);
                }
            }
            
            /**
             * Gets array of all "processes" elements
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes[] getProcessesArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PROCESSES$2, targetList);
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Processes[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Processes[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "processes" element
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes getProcessesArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Processes target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes)get_store().find_element_user(PROCESSES$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "processes" element
             */
            public int sizeOfProcessesArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROCESSES$2);
                }
            }
            
            /**
             * Sets array of all "processes" element
             */
            public void setProcessesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Processes[] processesArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(processesArray, PROCESSES$2);
                }
            }
            
            /**
             * Sets ith "processes" element
             */
            public void setProcessesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Processes processes)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Processes target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes)get_store().find_element_user(PROCESSES$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(processes);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "processes" element
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes insertNewProcesses(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Processes target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes)get_store().insert_element_user(PROCESSES$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "processes" element
             */
            public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes addNewProcesses()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.HostdashletDocument.Hostdashlet.Host.Processes target = null;
                    target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes)get_store().add_element_user(PROCESSES$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "processes" element
             */
            public void removeProcesses(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROCESSES$2, i);
                }
            }
            
            /**
             * Gets the "hostname" attribute
             */
            public java.lang.String getHostname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "hostname" attribute
             */
            public org.apache.xmlbeans.XmlString xgetHostname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$4);
                    return target;
                }
            }
            
            /**
             * Sets the "hostname" attribute
             */
            public void setHostname(java.lang.String hostname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$4);
                    }
                    target.setStringValue(hostname);
                }
            }
            
            /**
             * Sets (as xml) the "hostname" attribute
             */
            public void xsetHostname(org.apache.xmlbeans.XmlString hostname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTNAME$4);
                    }
                    target.set(hostname);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$6);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$6);
                    return target;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OS$6);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OS$6);
                    }
                    target.set(os);
                }
            }
            
            /**
             * Gets the "osarchitecture" attribute
             */
            public java.lang.String getOsarchitecture()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSARCHITECTURE$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "osarchitecture" attribute
             */
            public org.apache.xmlbeans.XmlString xgetOsarchitecture()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSARCHITECTURE$8);
                    return target;
                }
            }
            
            /**
             * Sets the "osarchitecture" attribute
             */
            public void setOsarchitecture(java.lang.String osarchitecture)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSARCHITECTURE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OSARCHITECTURE$8);
                    }
                    target.setStringValue(osarchitecture);
                }
            }
            
            /**
             * Sets (as xml) the "osarchitecture" attribute
             */
            public void xsetOsarchitecture(org.apache.xmlbeans.XmlString osarchitecture)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSARCHITECTURE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OSARCHITECTURE$8);
                    }
                    target.set(osarchitecture);
                }
            }
            
            /**
             * Gets the "version" attribute
             */
            public java.lang.String getVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "version" attribute
             */
            public org.apache.xmlbeans.XmlString xgetVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$10);
                    return target;
                }
            }
            
            /**
             * Sets the "version" attribute
             */
            public void setVersion(java.lang.String version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$10);
                    }
                    target.setStringValue(version);
                }
            }
            
            /**
             * Sets (as xml) the "version" attribute
             */
            public void xsetVersion(org.apache.xmlbeans.XmlString version)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$10);
                    }
                    target.set(version);
                }
            }
            
            /**
             * Gets the "applicationprocesses" attribute
             */
            public java.math.BigInteger getApplicationprocesses()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONPROCESSES$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "applicationprocesses" attribute
             */
            public org.apache.xmlbeans.XmlInteger xgetApplicationprocesses()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(APPLICATIONPROCESSES$12);
                    return target;
                }
            }
            
            /**
             * Sets the "applicationprocesses" attribute
             */
            public void setApplicationprocesses(java.math.BigInteger applicationprocesses)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONPROCESSES$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONPROCESSES$12);
                    }
                    target.setBigIntegerValue(applicationprocesses);
                }
            }
            
            /**
             * Sets (as xml) the "applicationprocesses" attribute
             */
            public void xsetApplicationprocesses(org.apache.xmlbeans.XmlInteger applicationprocesses)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(APPLICATIONPROCESSES$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(APPLICATIONPROCESSES$12);
                    }
                    target.set(applicationprocesses);
                }
            }
            
            /**
             * Gets the "webservers" attribute
             */
            public java.lang.String getWebservers()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBSERVERS$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "webservers" attribute
             */
            public org.apache.xmlbeans.XmlString xgetWebservers()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEBSERVERS$14);
                    return target;
                }
            }
            
            /**
             * Sets the "webservers" attribute
             */
            public void setWebservers(java.lang.String webservers)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBSERVERS$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBSERVERS$14);
                    }
                    target.setStringValue(webservers);
                }
            }
            
            /**
             * Sets (as xml) the "webservers" attribute
             */
            public void xsetWebservers(org.apache.xmlbeans.XmlString webservers)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEBSERVERS$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WEBSERVERS$14);
                    }
                    target.set(webservers);
                }
            }
            
            /**
             * Gets the "ipaddress" attribute
             */
            public java.lang.String getIpaddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$16);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ipaddress" attribute
             */
            public org.apache.xmlbeans.XmlString xgetIpaddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IPADDRESS$16);
                    return target;
                }
            }
            
            /**
             * Sets the "ipaddress" attribute
             */
            public void setIpaddress(java.lang.String ipaddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IPADDRESS$16);
                    }
                    target.setStringValue(ipaddress);
                }
            }
            
            /**
             * Sets (as xml) the "ipaddress" attribute
             */
            public void xsetIpaddress(org.apache.xmlbeans.XmlString ipaddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IPADDRESS$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IPADDRESS$16);
                    }
                    target.set(ipaddress);
                }
            }
            
            /**
             * Gets the "cpucores" attribute
             */
            public java.lang.String getCpucores()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUCORES$18);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "cpucores" attribute
             */
            public org.apache.xmlbeans.XmlString xgetCpucores()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPUCORES$18);
                    return target;
                }
            }
            
            /**
             * Sets the "cpucores" attribute
             */
            public void setCpucores(java.lang.String cpucores)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUCORES$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUCORES$18);
                    }
                    target.setStringValue(cpucores);
                }
            }
            
            /**
             * Sets (as xml) the "cpucores" attribute
             */
            public void xsetCpucores(org.apache.xmlbeans.XmlString cpucores)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPUCORES$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CPUCORES$18);
                    }
                    target.set(cpucores);
                }
            }
            
            /**
             * Gets the "physicalmemory" attribute
             */
            public java.lang.String getPhysicalmemory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHYSICALMEMORY$20);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "physicalmemory" attribute
             */
            public org.apache.xmlbeans.XmlString xgetPhysicalmemory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHYSICALMEMORY$20);
                    return target;
                }
            }
            
            /**
             * Sets the "physicalmemory" attribute
             */
            public void setPhysicalmemory(java.lang.String physicalmemory)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHYSICALMEMORY$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHYSICALMEMORY$20);
                    }
                    target.setStringValue(physicalmemory);
                }
            }
            
            /**
             * Sets (as xml) the "physicalmemory" attribute
             */
            public void xsetPhysicalmemory(org.apache.xmlbeans.XmlString physicalmemory)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHYSICALMEMORY$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PHYSICALMEMORY$20);
                    }
                    target.set(physicalmemory);
                }
            }
            
            /**
             * Gets the "virtualized" attribute
             */
            public java.lang.String getVirtualized()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALIZED$22);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "virtualized" attribute
             */
            public org.apache.xmlbeans.XmlString xgetVirtualized()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIRTUALIZED$22);
                    return target;
                }
            }
            
            /**
             * True if has "virtualized" attribute
             */
            public boolean isSetVirtualized()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VIRTUALIZED$22) != null;
                }
            }
            
            /**
             * Sets the "virtualized" attribute
             */
            public void setVirtualized(java.lang.String virtualized)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIRTUALIZED$22);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIRTUALIZED$22);
                    }
                    target.setStringValue(virtualized);
                }
            }
            
            /**
             * Sets (as xml) the "virtualized" attribute
             */
            public void xsetVirtualized(org.apache.xmlbeans.XmlString virtualized)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIRTUALIZED$22);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIRTUALIZED$22);
                    }
                    target.set(virtualized);
                }
            }
            
            /**
             * Unsets the "virtualized" attribute
             */
            public void unsetVirtualized()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VIRTUALIZED$22);
                }
            }
            
            /**
             * Gets the "cloud" attribute
             */
            public java.lang.String getCloud()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOUD$24);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "cloud" attribute
             */
            public org.apache.xmlbeans.XmlString xgetCloud()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLOUD$24);
                    return target;
                }
            }
            
            /**
             * True if has "cloud" attribute
             */
            public boolean isSetCloud()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CLOUD$24) != null;
                }
            }
            
            /**
             * Sets the "cloud" attribute
             */
            public void setCloud(java.lang.String cloud)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOUD$24);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLOUD$24);
                    }
                    target.setStringValue(cloud);
                }
            }
            
            /**
             * Sets (as xml) the "cloud" attribute
             */
            public void xsetCloud(org.apache.xmlbeans.XmlString cloud)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLOUD$24);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLOUD$24);
                    }
                    target.set(cloud);
                }
            }
            
            /**
             * Unsets the "cloud" attribute
             */
            public void unsetCloud()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CLOUD$24);
                }
            }
            /**
             * An XML charts(@).
             *
             * This is a complex type.
             */
            public static class ChartsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts
            {
                private static final long serialVersionUID = 1L;
                
                public ChartsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CHART$0 = 
                    new javax.xml.namespace.QName("", "chart");
                
                
                /**
                 * Gets array of all "chart" elements
                 */
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart[] getChartArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(CHART$0, targetList);
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "chart" element
                 */
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart getChartArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart)get_store().find_element_user(CHART$0, i);
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
                public void setChartArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart[] chartArray)
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
                public void setChartArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart chart)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart)get_store().find_element_user(CHART$0, i);
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
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart insertNewChart(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart)get_store().insert_element_user(CHART$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "chart" element
                 */
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart addNewChart()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart)get_store().add_element_user(CHART$0);
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
                 * An XML chart(@).
                 *
                 * This is a complex type.
                 */
                public static class ChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ChartImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName SERIES$0 = 
                      new javax.xml.namespace.QName("", "series");
                    private static final javax.xml.namespace.QName NIC$2 = 
                      new javax.xml.namespace.QName("", "nic");
                    private static final javax.xml.namespace.QName DISKS$4 = 
                      new javax.xml.namespace.QName("", "disks");
                    private static final javax.xml.namespace.QName NAME$6 = 
                      new javax.xml.namespace.QName("", "name");
                    private static final javax.xml.namespace.QName STARTDATE$8 = 
                      new javax.xml.namespace.QName("", "startdate");
                    private static final javax.xml.namespace.QName ENDDATE$10 = 
                      new javax.xml.namespace.QName("", "enddate");
                    private static final javax.xml.namespace.QName HEALTH$12 = 
                      new javax.xml.namespace.QName("", "health");
                    
                    
                    /**
                     * Gets array of all "series" elements
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series[] getSeriesArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(SERIES$0, targetList);
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "series" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series getSeriesArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series)get_store().find_element_user(SERIES$0, i);
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
                    public void setSeriesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series[] seriesArray)
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
                    public void setSeriesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series series)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series)get_store().find_element_user(SERIES$0, i);
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
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series insertNewSeries(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series)get_store().insert_element_user(SERIES$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "series" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series addNewSeries()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series)get_store().add_element_user(SERIES$0);
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
                     * Gets array of all "nic" elements
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic[] getNicArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(NIC$2, targetList);
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "nic" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic getNicArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic)get_store().find_element_user(NIC$2, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "nic" element
                     */
                    public int sizeOfNicArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(NIC$2);
                      }
                    }
                    
                    /**
                     * Sets array of all "nic" element
                     */
                    public void setNicArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic[] nicArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(nicArray, NIC$2);
                      }
                    }
                    
                    /**
                     * Sets ith "nic" element
                     */
                    public void setNicArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic nic)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic)get_store().find_element_user(NIC$2, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(nic);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "nic" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic insertNewNic(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic)get_store().insert_element_user(NIC$2, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "nic" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic addNewNic()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic)get_store().add_element_user(NIC$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "nic" element
                     */
                    public void removeNic(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(NIC$2, i);
                      }
                    }
                    
                    /**
                     * Gets array of all "disks" elements
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks[] getDisksArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(DISKS$4, targetList);
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "disks" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks getDisksArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks)get_store().find_element_user(DISKS$4, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "disks" element
                     */
                    public int sizeOfDisksArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(DISKS$4);
                      }
                    }
                    
                    /**
                     * Sets array of all "disks" element
                     */
                    public void setDisksArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks[] disksArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(disksArray, DISKS$4);
                      }
                    }
                    
                    /**
                     * Sets ith "disks" element
                     */
                    public void setDisksArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks disks)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks)get_store().find_element_user(DISKS$4, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(disks);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "disks" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks insertNewDisks(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks)get_store().insert_element_user(DISKS$4, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "disks" element
                     */
                    public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks addNewDisks()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks target = null;
                        target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks)get_store().add_element_user(DISKS$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "disks" element
                     */
                    public void removeDisks(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(DISKS$4, i);
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
                     * Gets the "startdate" attribute
                     */
                    public java.util.Calendar getStartdate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$8);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "startdate" attribute
                     */
                    public org.apache.xmlbeans.XmlDateTime xgetStartdate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATE$8);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "startdate" attribute
                     */
                    public void setStartdate(java.util.Calendar startdate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTDATE$8);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTDATE$8);
                        }
                        target.setCalendarValue(startdate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "startdate" attribute
                     */
                    public void xsetStartdate(org.apache.xmlbeans.XmlDateTime startdate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTDATE$8);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTDATE$8);
                        }
                        target.set(startdate);
                      }
                    }
                    
                    /**
                     * Gets the "enddate" attribute
                     */
                    public java.util.Calendar getEnddate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$10);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "enddate" attribute
                     */
                    public org.apache.xmlbeans.XmlDateTime xgetEnddate()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATE$10);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "enddate" attribute
                     */
                    public void setEnddate(java.util.Calendar enddate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDDATE$10);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDDATE$10);
                        }
                        target.setCalendarValue(enddate);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "enddate" attribute
                     */
                    public void xsetEnddate(org.apache.xmlbeans.XmlDateTime enddate)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(ENDDATE$10);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(ENDDATE$10);
                        }
                        target.set(enddate);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$12);
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
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$12);
                        return target;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$12);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTH$12);
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
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$12);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTH$12);
                        }
                        target.set(health);
                      }
                    }
                    /**
                     * An XML series(@).
                     *
                     * This is a complex type.
                     */
                    public static class SeriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series
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
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement[] getMeasurementArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          java.util.List targetList = new java.util.ArrayList();
                          get_store().find_all_element_users(MEASUREMENT$0, targetList);
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement[targetList.size()];
                          targetList.toArray(result);
                          return result;
                        }
                      }
                      
                      /**
                       * Gets ith "measurement" element
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement getMeasurementArray(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                      public void setMeasurementArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement[] measurementArray)
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
                      public void setMeasurementArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement measurement)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement insertNewMeasurement(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                          return target;
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "measurement" element
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement addNewMeasurement()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement)get_store().add_element_user(MEASUREMENT$0);
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
                       * Gets the "datasetnumber" attribute
                       */
                      public java.math.BigInteger getDatasetnumber()
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
                          return target.getBigIntegerValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "datasetnumber" attribute
                       */
                      public org.apache.xmlbeans.XmlInteger xgetDatasetnumber()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlInteger target = null;
                          target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DATASETNUMBER$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "datasetnumber" attribute
                       */
                      public void setDatasetnumber(java.math.BigInteger datasetnumber)
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
                          target.setBigIntegerValue(datasetnumber);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "datasetnumber" attribute
                       */
                      public void xsetDatasetnumber(org.apache.xmlbeans.XmlInteger datasetnumber)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlInteger target = null;
                          target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DATASETNUMBER$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DATASETNUMBER$4);
                          }
                          target.set(datasetnumber);
                        }
                      }
                      
                      /**
                       * Gets the "seriesnumber" attribute
                       */
                      public java.math.BigInteger getSeriesnumber()
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
                          return target.getBigIntegerValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "seriesnumber" attribute
                       */
                      public org.apache.xmlbeans.XmlInteger xgetSeriesnumber()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlInteger target = null;
                          target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIESNUMBER$6);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "seriesnumber" attribute
                       */
                      public void setSeriesnumber(java.math.BigInteger seriesnumber)
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
                          target.setBigIntegerValue(seriesnumber);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "seriesnumber" attribute
                       */
                      public void xsetSeriesnumber(org.apache.xmlbeans.XmlInteger seriesnumber)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlInteger target = null;
                          target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIESNUMBER$6);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SERIESNUMBER$6);
                          }
                          target.set(seriesnumber);
                        }
                      }
                      /**
                       * An XML measurement(@).
                       *
                       * This is a complex type.
                       */
                      public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Series.Measurement
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName VALUE$0 = 
                          new javax.xml.namespace.QName("", "value");
                        private static final javax.xml.namespace.QName TIMESTAMP$2 = 
                          new javax.xml.namespace.QName("", "timestamp");
                        
                        
                        /**
                         * Gets the "value" attribute
                         */
                        public double getValue()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
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
                            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
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
                            return get_store().find_attribute_user(VALUE$0) != null;
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
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
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
                            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$0);
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
                            get_store().remove_attribute(VALUE$0);
                          }
                        }
                        
                        /**
                         * Gets the "timestamp" attribute
                         */
                        public java.util.Calendar getTimestamp()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
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
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
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
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$2);
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
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$2);
                            }
                            target.set(timestamp);
                          }
                        }
                      }
                    }
                    /**
                     * An XML nic(@).
                     *
                     * This is a complex type.
                     */
                    public static class NicImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NicImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName SERIES$0 = 
                        new javax.xml.namespace.QName("", "series");
                      private static final javax.xml.namespace.QName NAME$2 = 
                        new javax.xml.namespace.QName("", "name");
                      private static final javax.xml.namespace.QName BANDWIDTH$4 = 
                        new javax.xml.namespace.QName("", "bandwidth");
                      
                      
                      /**
                       * Gets array of all "series" elements
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series[] getSeriesArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          java.util.List targetList = new java.util.ArrayList();
                          get_store().find_all_element_users(SERIES$0, targetList);
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series[targetList.size()];
                          targetList.toArray(result);
                          return result;
                        }
                      }
                      
                      /**
                       * Gets ith "series" element
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series getSeriesArray(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series)get_store().find_element_user(SERIES$0, i);
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
                      public void setSeriesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series[] seriesArray)
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
                      public void setSeriesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series series)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series)get_store().find_element_user(SERIES$0, i);
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
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series insertNewSeries(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series)get_store().insert_element_user(SERIES$0, i);
                          return target;
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "series" element
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series addNewSeries()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series)get_store().add_element_user(SERIES$0);
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
                       * Gets the "bandwidth" attribute
                       */
                      public java.lang.String getBandwidth()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWIDTH$4);
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
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWIDTH$4);
                          return target;
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
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWIDTH$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANDWIDTH$4);
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
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWIDTH$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BANDWIDTH$4);
                          }
                          target.set(bandwidth);
                        }
                      }
                      /**
                       * An XML series(@).
                       *
                       * This is a complex type.
                       */
                      public static class SeriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series
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
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement[] getMeasurementArray()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            java.util.List targetList = new java.util.ArrayList();
                            get_store().find_all_element_users(MEASUREMENT$0, targetList);
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement[targetList.size()];
                            targetList.toArray(result);
                            return result;
                          }
                        }
                        
                        /**
                         * Gets ith "measurement" element
                         */
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement getMeasurementArray(int i)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                        public void setMeasurementArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement[] measurementArray)
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
                        public void setMeasurementArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement measurement)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement insertNewMeasurement(int i)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                            return target;
                          }
                        }
                        
                        /**
                         * Appends and returns a new empty value (as xml) as the last "measurement" element
                         */
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement addNewMeasurement()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement)get_store().add_element_user(MEASUREMENT$0);
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
                         * Gets the "datasetnumber" attribute
                         */
                        public java.math.BigInteger getDatasetnumber()
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
                            return target.getBigIntegerValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "datasetnumber" attribute
                         */
                        public org.apache.xmlbeans.XmlInteger xgetDatasetnumber()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DATASETNUMBER$4);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "datasetnumber" attribute
                         */
                        public void setDatasetnumber(java.math.BigInteger datasetnumber)
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
                            target.setBigIntegerValue(datasetnumber);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "datasetnumber" attribute
                         */
                        public void xsetDatasetnumber(org.apache.xmlbeans.XmlInteger datasetnumber)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DATASETNUMBER$4);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DATASETNUMBER$4);
                            }
                            target.set(datasetnumber);
                          }
                        }
                        
                        /**
                         * Gets the "seriesnumber" attribute
                         */
                        public java.math.BigInteger getSeriesnumber()
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
                            return target.getBigIntegerValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "seriesnumber" attribute
                         */
                        public org.apache.xmlbeans.XmlInteger xgetSeriesnumber()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIESNUMBER$6);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "seriesnumber" attribute
                         */
                        public void setSeriesnumber(java.math.BigInteger seriesnumber)
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
                            target.setBigIntegerValue(seriesnumber);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "seriesnumber" attribute
                         */
                        public void xsetSeriesnumber(org.apache.xmlbeans.XmlInteger seriesnumber)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIESNUMBER$6);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SERIESNUMBER$6);
                            }
                            target.set(seriesnumber);
                          }
                        }
                        /**
                         * An XML measurement(@).
                         *
                         * This is a complex type.
                         */
                        public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Nic.Series.Measurement
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName VALUE$0 = 
                            new javax.xml.namespace.QName("", "value");
                          private static final javax.xml.namespace.QName TIMESTAMP$2 = 
                            new javax.xml.namespace.QName("", "timestamp");
                          
                          
                          /**
                           * Gets the "value" attribute
                           */
                          public double getValue()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
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
                              target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
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
                              return get_store().find_attribute_user(VALUE$0) != null;
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
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
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
                              target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$0);
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
                              get_store().remove_attribute(VALUE$0);
                            }
                          }
                          
                          /**
                           * Gets the "timestamp" attribute
                           */
                          public java.util.Calendar getTimestamp()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
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
                              target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
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
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$2);
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
                              target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$2);
                              }
                              target.set(timestamp);
                            }
                          }
                        }
                      }
                    }
                    /**
                     * An XML disks(@).
                     *
                     * This is a complex type.
                     */
                    public static class DisksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public DisksImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName SERIES$0 = 
                        new javax.xml.namespace.QName("", "series");
                      private static final javax.xml.namespace.QName NAME$2 = 
                        new javax.xml.namespace.QName("", "name");
                      private static final javax.xml.namespace.QName TOTALSPACE$4 = 
                        new javax.xml.namespace.QName("", "totalspace");
                      private static final javax.xml.namespace.QName FREESPACE$6 = 
                        new javax.xml.namespace.QName("", "freespace");
                      private static final javax.xml.namespace.QName USEDSPACE$8 = 
                        new javax.xml.namespace.QName("", "usedspace");
                      
                      
                      /**
                       * Gets array of all "series" elements
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series[] getSeriesArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          java.util.List targetList = new java.util.ArrayList();
                          get_store().find_all_element_users(SERIES$0, targetList);
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series[targetList.size()];
                          targetList.toArray(result);
                          return result;
                        }
                      }
                      
                      /**
                       * Gets ith "series" element
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series getSeriesArray(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series)get_store().find_element_user(SERIES$0, i);
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
                      public void setSeriesArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series[] seriesArray)
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
                      public void setSeriesArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series series)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series)get_store().find_element_user(SERIES$0, i);
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
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series insertNewSeries(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series)get_store().insert_element_user(SERIES$0, i);
                          return target;
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "series" element
                       */
                      public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series addNewSeries()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series target = null;
                          target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series)get_store().add_element_user(SERIES$0);
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
                       * Gets the "totalspace" attribute
                       */
                      public java.lang.String getTotalspace()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSPACE$4);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "totalspace" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetTotalspace()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOTALSPACE$4);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "totalspace" attribute
                       */
                      public void setTotalspace(java.lang.String totalspace)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSPACE$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSPACE$4);
                          }
                          target.setStringValue(totalspace);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "totalspace" attribute
                       */
                      public void xsetTotalspace(org.apache.xmlbeans.XmlString totalspace)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOTALSPACE$4);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOTALSPACE$4);
                          }
                          target.set(totalspace);
                        }
                      }
                      
                      /**
                       * Gets the "freespace" attribute
                       */
                      public java.lang.String getFreespace()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREESPACE$6);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "freespace" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetFreespace()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FREESPACE$6);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "freespace" attribute
                       */
                      public void setFreespace(java.lang.String freespace)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREESPACE$6);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FREESPACE$6);
                          }
                          target.setStringValue(freespace);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "freespace" attribute
                       */
                      public void xsetFreespace(org.apache.xmlbeans.XmlString freespace)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FREESPACE$6);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FREESPACE$6);
                          }
                          target.set(freespace);
                        }
                      }
                      
                      /**
                       * Gets the "usedspace" attribute
                       */
                      public java.lang.String getUsedspace()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDSPACE$8);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "usedspace" attribute
                       */
                      public org.apache.xmlbeans.XmlString xgetUsedspace()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDSPACE$8);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "usedspace" attribute
                       */
                      public void setUsedspace(java.lang.String usedspace)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEDSPACE$8);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEDSPACE$8);
                          }
                          target.setStringValue(usedspace);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "usedspace" attribute
                       */
                      public void xsetUsedspace(org.apache.xmlbeans.XmlString usedspace)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEDSPACE$8);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEDSPACE$8);
                          }
                          target.set(usedspace);
                        }
                      }
                      /**
                       * An XML series(@).
                       *
                       * This is a complex type.
                       */
                      public static class SeriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series
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
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement[] getMeasurementArray()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            java.util.List targetList = new java.util.ArrayList();
                            get_store().find_all_element_users(MEASUREMENT$0, targetList);
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement[targetList.size()];
                            targetList.toArray(result);
                            return result;
                          }
                        }
                        
                        /**
                         * Gets ith "measurement" element
                         */
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement getMeasurementArray(int i)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                        public void setMeasurementArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement[] measurementArray)
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
                        public void setMeasurementArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement measurement)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement)get_store().find_element_user(MEASUREMENT$0, i);
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
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement insertNewMeasurement(int i)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement)get_store().insert_element_user(MEASUREMENT$0, i);
                            return target;
                          }
                        }
                        
                        /**
                         * Appends and returns a new empty value (as xml) as the last "measurement" element
                         */
                        public noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement addNewMeasurement()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement target = null;
                            target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement)get_store().add_element_user(MEASUREMENT$0);
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
                         * Gets the "datasetnumber" attribute
                         */
                        public java.math.BigInteger getDatasetnumber()
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
                            return target.getBigIntegerValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "datasetnumber" attribute
                         */
                        public org.apache.xmlbeans.XmlInteger xgetDatasetnumber()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DATASETNUMBER$4);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "datasetnumber" attribute
                         */
                        public void setDatasetnumber(java.math.BigInteger datasetnumber)
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
                            target.setBigIntegerValue(datasetnumber);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "datasetnumber" attribute
                         */
                        public void xsetDatasetnumber(org.apache.xmlbeans.XmlInteger datasetnumber)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DATASETNUMBER$4);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DATASETNUMBER$4);
                            }
                            target.set(datasetnumber);
                          }
                        }
                        
                        /**
                         * Gets the "seriesnumber" attribute
                         */
                        public java.math.BigInteger getSeriesnumber()
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
                            return target.getBigIntegerValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "seriesnumber" attribute
                         */
                        public org.apache.xmlbeans.XmlInteger xgetSeriesnumber()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIESNUMBER$6);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "seriesnumber" attribute
                         */
                        public void setSeriesnumber(java.math.BigInteger seriesnumber)
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
                            target.setBigIntegerValue(seriesnumber);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "seriesnumber" attribute
                         */
                        public void xsetSeriesnumber(org.apache.xmlbeans.XmlInteger seriesnumber)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlInteger target = null;
                            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIESNUMBER$6);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SERIESNUMBER$6);
                            }
                            target.set(seriesnumber);
                          }
                        }
                        /**
                         * An XML measurement(@).
                         *
                         * This is a complex type.
                         */
                        public static class MeasurementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Charts.Chart.Disks.Series.Measurement
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public MeasurementImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName VALUE$0 = 
                            new javax.xml.namespace.QName("", "value");
                          private static final javax.xml.namespace.QName TIMESTAMP$2 = 
                            new javax.xml.namespace.QName("", "timestamp");
                          
                          
                          /**
                           * Gets the "value" attribute
                           */
                          public double getValue()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
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
                              target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
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
                              return get_store().find_attribute_user(VALUE$0) != null;
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
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
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
                              target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(VALUE$0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(VALUE$0);
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
                              get_store().remove_attribute(VALUE$0);
                            }
                          }
                          
                          /**
                           * Gets the "timestamp" attribute
                           */
                          public java.util.Calendar getTimestamp()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
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
                              target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
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
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$2);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$2);
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
                              target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(TIMESTAMP$2);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(TIMESTAMP$2);
                              }
                              target.set(timestamp);
                            }
                          }
                        }
                      }
                    }
                }
            }
            /**
             * An XML processes(@).
             *
             * This is a complex type.
             */
            public static class ProcessesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Processes
            {
                private static final long serialVersionUID = 1L;
                
                public ProcessesImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PROCESS$0 = 
                    new javax.xml.namespace.QName("", "process");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                
                
                /**
                 * Gets array of all "process" elements
                 */
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process[] getProcessArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PROCESS$0, targetList);
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process[] result = new noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "process" element
                 */
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process getProcessArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process)get_store().find_element_user(PROCESS$0, i);
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
                      return get_store().count_elements(PROCESS$0);
                    }
                }
                
                /**
                 * Sets array of all "process" element
                 */
                public void setProcessArray(noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process[] processArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(processArray, PROCESS$0);
                    }
                }
                
                /**
                 * Sets ith "process" element
                 */
                public void setProcessArray(int i, noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process process)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process)get_store().find_element_user(PROCESS$0, i);
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
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process insertNewProcess(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process)get_store().insert_element_user(PROCESS$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "process" element
                 */
                public noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process addNewProcess()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process target = null;
                      target = (noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process)get_store().add_element_user(PROCESS$0);
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
                      get_store().remove_element(PROCESS$0, i);
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
                 * An XML process(@).
                 *
                 * This is a complex type.
                 */
                public static class ProcessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HostdashletDocument.Hostdashlet.Host.Processes.Process
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ProcessImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NAME$0 = 
                      new javax.xml.namespace.QName("", "name");
                    private static final javax.xml.namespace.QName HEALTH$2 = 
                      new javax.xml.namespace.QName("", "health");
                    private static final javax.xml.namespace.QName CPU$4 = 
                      new javax.xml.namespace.QName("", "cpu");
                    private static final javax.xml.namespace.QName MEMORY$6 = 
                      new javax.xml.namespace.QName("", "memory");
                    
                    
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
                     * Gets the "health" attribute
                     */
                    public java.lang.String getHealth()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$2);
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
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$2);
                        return target;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTH$2);
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
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$2);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTH$2);
                        }
                        target.set(health);
                      }
                    }
                    
                    /**
                     * Gets the "cpu" attribute
                     */
                    public java.lang.String getCpu()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$4);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "cpu" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetCpu()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$4);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "cpu" attribute
                     */
                    public boolean isSetCpu()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(CPU$4) != null;
                      }
                    }
                    
                    /**
                     * Sets the "cpu" attribute
                     */
                    public void setCpu(java.lang.String cpu)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPU$4);
                        }
                        target.setStringValue(cpu);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "cpu" attribute
                     */
                    public void xsetCpu(org.apache.xmlbeans.XmlString cpu)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$4);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CPU$4);
                        }
                        target.set(cpu);
                      }
                    }
                    
                    /**
                     * Unsets the "cpu" attribute
                     */
                    public void unsetCpu()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(CPU$4);
                      }
                    }
                    
                    /**
                     * Gets the "memory" attribute
                     */
                    public java.lang.String getMemory()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMORY$6);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "memory" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetMemory()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEMORY$6);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "memory" attribute
                     */
                    public boolean isSetMemory()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(MEMORY$6) != null;
                      }
                    }
                    
                    /**
                     * Sets the "memory" attribute
                     */
                    public void setMemory(java.lang.String memory)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMORY$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEMORY$6);
                        }
                        target.setStringValue(memory);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "memory" attribute
                     */
                    public void xsetMemory(org.apache.xmlbeans.XmlString memory)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEMORY$6);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEMORY$6);
                        }
                        target.set(memory);
                      }
                    }
                    
                    /**
                     * Unsets the "memory" attribute
                     */
                    public void unsetMemory()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(MEMORY$6);
                      }
                    }
                }
            }
        }
    }
}
