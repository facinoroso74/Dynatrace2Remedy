/*
 * An XML document type.
 * Localname: remotingdashlet
 * Namespace: 
 * Java type: noNamespace.RemotingdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one remotingdashlet(@) element.
 *
 * This is a complex type.
 */
public class RemotingdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RemotingdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemotingdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOTINGDASHLET$0 = 
        new javax.xml.namespace.QName("", "remotingdashlet");
    
    
    /**
     * Gets the "remotingdashlet" element
     */
    public noNamespace.RemotingdashletDocument.Remotingdashlet getRemotingdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RemotingdashletDocument.Remotingdashlet target = null;
            target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().find_element_user(REMOTINGDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "remotingdashlet" element
     */
    public void setRemotingdashlet(noNamespace.RemotingdashletDocument.Remotingdashlet remotingdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RemotingdashletDocument.Remotingdashlet target = null;
            target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().find_element_user(REMOTINGDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().add_element_user(REMOTINGDASHLET$0);
            }
            target.set(remotingdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "remotingdashlet" element
     */
    public noNamespace.RemotingdashletDocument.Remotingdashlet addNewRemotingdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RemotingdashletDocument.Remotingdashlet target = null;
            target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().add_element_user(REMOTINGDASHLET$0);
            return target;
        }
    }
    /**
     * An XML remotingdashlet(@).
     *
     * This is a complex type.
     */
    public static class RemotingdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RemotingdashletDocument.Remotingdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public RemotingdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName REMOTECALLS$4 = 
            new javax.xml.namespace.QName("", "remotecalls");
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
         * Gets the "remotecalls" element
         */
        public noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls getRemotecalls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls target = null;
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls)get_store().find_element_user(REMOTECALLS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "remotecalls" element
         */
        public boolean isSetRemotecalls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMOTECALLS$4) != 0;
            }
        }
        
        /**
         * Sets the "remotecalls" element
         */
        public void setRemotecalls(noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls remotecalls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls target = null;
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls)get_store().find_element_user(REMOTECALLS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls)get_store().add_element_user(REMOTECALLS$4);
                }
                target.set(remotecalls);
            }
        }
        
        /**
         * Appends and returns a new empty "remotecalls" element
         */
        public noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls addNewRemotecalls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls target = null;
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls)get_store().add_element_user(REMOTECALLS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "remotecalls" element
         */
        public void unsetRemotecalls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMOTECALLS$4, 0);
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
         * An XML remotecalls(@).
         *
         * This is a complex type.
         */
        public static class RemotecallsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls
        {
            private static final long serialVersionUID = 1L;
            
            public RemotecallsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REMOTECALL$0 = 
                new javax.xml.namespace.QName("", "remotecall");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "remotecall" elements
             */
            public noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall[] getRemotecallArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(REMOTECALL$0, targetList);
                    noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall[] result = new noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "remotecall" element
             */
            public noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall getRemotecallArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall target = null;
                    target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall)get_store().find_element_user(REMOTECALL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "remotecall" element
             */
            public int sizeOfRemotecallArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REMOTECALL$0);
                }
            }
            
            /**
             * Sets array of all "remotecall" element
             */
            public void setRemotecallArray(noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall[] remotecallArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(remotecallArray, REMOTECALL$0);
                }
            }
            
            /**
             * Sets ith "remotecall" element
             */
            public void setRemotecallArray(int i, noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall remotecall)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall target = null;
                    target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall)get_store().find_element_user(REMOTECALL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(remotecall);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "remotecall" element
             */
            public noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall insertNewRemotecall(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall target = null;
                    target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall)get_store().insert_element_user(REMOTECALL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "remotecall" element
             */
            public noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall addNewRemotecall()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall target = null;
                    target = (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall)get_store().add_element_user(REMOTECALL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "remotecall" element
             */
            public void removeRemotecall(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REMOTECALL$0, i);
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
             * An XML remotecall(@).
             *
             * This is a complex type.
             */
            public static class RemotecallImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall
            {
                private static final long serialVersionUID = 1L;
                
                public RemotecallImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName PROTOCOL$2 = 
                    new javax.xml.namespace.QName("", "protocol");
                private static final javax.xml.namespace.QName SIDE$4 = 
                    new javax.xml.namespace.QName("", "side");
                private static final javax.xml.namespace.QName TYPE$6 = 
                    new javax.xml.namespace.QName("", "type");
                private static final javax.xml.namespace.QName METHODNAME$8 = 
                    new javax.xml.namespace.QName("", "methodname");
                private static final javax.xml.namespace.QName CLASSNAME$10 = 
                    new javax.xml.namespace.QName("", "classname");
                private static final javax.xml.namespace.QName COUNT$12 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName LATENCYAVG$14 = 
                    new javax.xml.namespace.QName("", "latency_avg");
                private static final javax.xml.namespace.QName TOTALTIMEAVG$16 = 
                    new javax.xml.namespace.QName("", "total_time_avg");
                private static final javax.xml.namespace.QName EXECTIMEAVG$18 = 
                    new javax.xml.namespace.QName("", "exec_time_avg");
                private static final javax.xml.namespace.QName CPUTOTALTIMEAVG$20 = 
                    new javax.xml.namespace.QName("", "cpu_total_time_avg");
                private static final javax.xml.namespace.QName CPUEXECTIMEAVG$22 = 
                    new javax.xml.namespace.QName("", "cpu_exec_time_avg");
                private static final javax.xml.namespace.QName SERIALIZATIONTIMEAVG$24 = 
                    new javax.xml.namespace.QName("", "serialization_time_avg");
                private static final javax.xml.namespace.QName DESERIALIZATIONTIMEAVG$26 = 
                    new javax.xml.namespace.QName("", "deserialization_time_avg");
                private static final javax.xml.namespace.QName BYTESSENTAVG$28 = 
                    new javax.xml.namespace.QName("", "bytes_sent_avg");
                private static final javax.xml.namespace.QName BYTESRECEIVEDAVG$30 = 
                    new javax.xml.namespace.QName("", "bytes_received_avg");
                private static final javax.xml.namespace.QName OBJECTSSENTAVG$32 = 
                    new javax.xml.namespace.QName("", "objects_sent_avg");
                private static final javax.xml.namespace.QName OBJECTSRECEIVEDAVG$34 = 
                    new javax.xml.namespace.QName("", "objects_received_avg");
                private static final javax.xml.namespace.QName SERIALIZEDOBJECTSAVG$36 = 
                    new javax.xml.namespace.QName("", "serialized_objects_avg");
                private static final javax.xml.namespace.QName DESERIALIZEDOBJECTSAVG$38 = 
                    new javax.xml.namespace.QName("", "deserialized_objects_avg");
                private static final javax.xml.namespace.QName LATENCYSUM$40 = 
                    new javax.xml.namespace.QName("", "latency_sum");
                private static final javax.xml.namespace.QName TOTALTIMESUM$42 = 
                    new javax.xml.namespace.QName("", "total_time_sum");
                private static final javax.xml.namespace.QName EXECTIMESUM$44 = 
                    new javax.xml.namespace.QName("", "exec_time_sum");
                private static final javax.xml.namespace.QName CPUTOTALTIMESUM$46 = 
                    new javax.xml.namespace.QName("", "cpu_total_time_sum");
                private static final javax.xml.namespace.QName CPUEXECTIMESUM$48 = 
                    new javax.xml.namespace.QName("", "cpu_exec_time_sum");
                private static final javax.xml.namespace.QName SERIALIZATIONTIMESUM$50 = 
                    new javax.xml.namespace.QName("", "serialization_time_sum");
                private static final javax.xml.namespace.QName DESERIALIZATIONTIMESUM$52 = 
                    new javax.xml.namespace.QName("", "deserialization_time_sum");
                private static final javax.xml.namespace.QName BYTESSENTSUM$54 = 
                    new javax.xml.namespace.QName("", "bytes_sent_sum");
                private static final javax.xml.namespace.QName BYTESRECEIVEDSUM$56 = 
                    new javax.xml.namespace.QName("", "bytes_received_sum");
                private static final javax.xml.namespace.QName OBJECTSSENTSUM$58 = 
                    new javax.xml.namespace.QName("", "objects_sent_sum");
                private static final javax.xml.namespace.QName OBJECTSRECEIVEDSUM$60 = 
                    new javax.xml.namespace.QName("", "objects_received_sum");
                private static final javax.xml.namespace.QName SERIALIZEDOBJECTSSUM$62 = 
                    new javax.xml.namespace.QName("", "serialized_objects_sum");
                private static final javax.xml.namespace.QName DESERIALIZEDOBJECTSSUM$64 = 
                    new javax.xml.namespace.QName("", "deserialized_objects_sum");
                private static final javax.xml.namespace.QName LATENCYMIN$66 = 
                    new javax.xml.namespace.QName("", "latency_min");
                private static final javax.xml.namespace.QName TOTALTIMEMIN$68 = 
                    new javax.xml.namespace.QName("", "total_time_min");
                private static final javax.xml.namespace.QName EXECTIMEMIN$70 = 
                    new javax.xml.namespace.QName("", "exec_time_min");
                private static final javax.xml.namespace.QName CPUTOTALTIMEMIN$72 = 
                    new javax.xml.namespace.QName("", "cpu_total_time_min");
                private static final javax.xml.namespace.QName CPUEXECTIMEMIN$74 = 
                    new javax.xml.namespace.QName("", "cpu_exec_time_min");
                private static final javax.xml.namespace.QName SERIALIZATIONTIMEMIN$76 = 
                    new javax.xml.namespace.QName("", "serialization_time_min");
                private static final javax.xml.namespace.QName DESERIALIZATIONTIMEMIN$78 = 
                    new javax.xml.namespace.QName("", "deserialization_time_min");
                private static final javax.xml.namespace.QName BYTESSENTMIN$80 = 
                    new javax.xml.namespace.QName("", "bytes_sent_min");
                private static final javax.xml.namespace.QName BYTESRECEIVEDMIN$82 = 
                    new javax.xml.namespace.QName("", "bytes_received_min");
                private static final javax.xml.namespace.QName OBJECTSSENTMIN$84 = 
                    new javax.xml.namespace.QName("", "objects_sent_min");
                private static final javax.xml.namespace.QName OBJECTSRECEIVEDMIN$86 = 
                    new javax.xml.namespace.QName("", "objects_received_min");
                private static final javax.xml.namespace.QName SERIALIZEDOBJECTSMIN$88 = 
                    new javax.xml.namespace.QName("", "serialized_objects_min");
                private static final javax.xml.namespace.QName DESERIALIZEDOBJECTSMIN$90 = 
                    new javax.xml.namespace.QName("", "deserialized_objects_min");
                private static final javax.xml.namespace.QName LATENCYMAX$92 = 
                    new javax.xml.namespace.QName("", "latency_max");
                private static final javax.xml.namespace.QName TOTALTIMEMAX$94 = 
                    new javax.xml.namespace.QName("", "total_time_max");
                private static final javax.xml.namespace.QName EXECTIMEMAX$96 = 
                    new javax.xml.namespace.QName("", "exec_time_max");
                private static final javax.xml.namespace.QName CPUTOTALTIMEMAX$98 = 
                    new javax.xml.namespace.QName("", "cpu_total_time_max");
                private static final javax.xml.namespace.QName CPUEXECTIMEMAX$100 = 
                    new javax.xml.namespace.QName("", "cpu_exec_time_max");
                private static final javax.xml.namespace.QName SERIALIZATIONTIMEMAX$102 = 
                    new javax.xml.namespace.QName("", "serialization_time_max");
                private static final javax.xml.namespace.QName DESERIALIZATIONTIMEMAX$104 = 
                    new javax.xml.namespace.QName("", "deserialization_time_max");
                private static final javax.xml.namespace.QName BYTESSENTMAX$106 = 
                    new javax.xml.namespace.QName("", "bytes_sent_max");
                private static final javax.xml.namespace.QName BYTESRECEIVEDMAX$108 = 
                    new javax.xml.namespace.QName("", "bytes_received_max");
                private static final javax.xml.namespace.QName OBJECTSSENTMAX$110 = 
                    new javax.xml.namespace.QName("", "objects_sent_max");
                private static final javax.xml.namespace.QName OBJECTSRECEIVEDMAX$112 = 
                    new javax.xml.namespace.QName("", "objects_received_max");
                private static final javax.xml.namespace.QName SERIALIZEDOBJECTSMAX$114 = 
                    new javax.xml.namespace.QName("", "serialized_objects_max");
                private static final javax.xml.namespace.QName DESERIALIZEDOBJECTSMAX$116 = 
                    new javax.xml.namespace.QName("", "deserialized_objects_max");
                private static final javax.xml.namespace.QName ERRORSTATE$118 = 
                    new javax.xml.namespace.QName("", "error_state");
                private static final javax.xml.namespace.QName FAILURERATE$120 = 
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
                 * Gets the "protocol" attribute
                 */
                public java.lang.String getProtocol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTOCOL$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "protocol" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetProtocol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROTOCOL$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "protocol" attribute
                 */
                public boolean isSetProtocol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PROTOCOL$2) != null;
                    }
                }
                
                /**
                 * Sets the "protocol" attribute
                 */
                public void setProtocol(java.lang.String protocol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTOCOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROTOCOL$2);
                      }
                      target.setStringValue(protocol);
                    }
                }
                
                /**
                 * Sets (as xml) the "protocol" attribute
                 */
                public void xsetProtocol(org.apache.xmlbeans.XmlString protocol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROTOCOL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROTOCOL$2);
                      }
                      target.set(protocol);
                    }
                }
                
                /**
                 * Unsets the "protocol" attribute
                 */
                public void unsetProtocol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PROTOCOL$2);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIDE$4);
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
                      return get_store().find_attribute_user(SIDE$4) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIDE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIDE$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIDE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIDE$4);
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
                      get_store().remove_attribute(SIDE$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
                      return get_store().find_attribute_user(TYPE$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
                      get_store().remove_attribute(TYPE$6);
                    }
                }
                
                /**
                 * Gets the "methodname" attribute
                 */
                public java.lang.String getMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "methodname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "methodname" attribute
                 */
                public boolean isSetMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(METHODNAME$8) != null;
                    }
                }
                
                /**
                 * Sets the "methodname" attribute
                 */
                public void setMethodname(java.lang.String methodname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHODNAME$8);
                      }
                      target.setStringValue(methodname);
                    }
                }
                
                /**
                 * Sets (as xml) the "methodname" attribute
                 */
                public void xsetMethodname(org.apache.xmlbeans.XmlString methodname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHODNAME$8);
                      }
                      target.set(methodname);
                    }
                }
                
                /**
                 * Unsets the "methodname" attribute
                 */
                public void unsetMethodname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(METHODNAME$8);
                    }
                }
                
                /**
                 * Gets the "classname" attribute
                 */
                public java.lang.String getClassname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "classname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetClassname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "classname" attribute
                 */
                public boolean isSetClassname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLASSNAME$10) != null;
                    }
                }
                
                /**
                 * Sets the "classname" attribute
                 */
                public void setClassname(java.lang.String classname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$10);
                      }
                      target.setStringValue(classname);
                    }
                }
                
                /**
                 * Sets (as xml) the "classname" attribute
                 */
                public void xsetClassname(org.apache.xmlbeans.XmlString classname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSNAME$10);
                      }
                      target.set(classname);
                    }
                }
                
                /**
                 * Unsets the "classname" attribute
                 */
                public void unsetClassname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLASSNAME$10);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$12);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$12);
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
                      return get_store().find_attribute_user(COUNT$12) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$12);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$12);
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
                      get_store().remove_attribute(COUNT$12);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYAVG$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYAVG$14);
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
                      return get_store().find_attribute_user(LATENCYAVG$14) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYAVG$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYAVG$14);
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
                      get_store().remove_attribute(LATENCYAVG$14);
                    }
                }
                
                /**
                 * Gets the "total_time_avg" attribute
                 */
                public double getTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMEAVG$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMEAVG$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_time_avg" attribute
                 */
                public boolean isSetTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALTIMEAVG$16) != null;
                    }
                }
                
                /**
                 * Sets the "total_time_avg" attribute
                 */
                public void setTotalTimeAvg(double totalTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMEAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALTIMEAVG$16);
                      }
                      target.setDoubleValue(totalTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_time_avg" attribute
                 */
                public void xsetTotalTimeAvg(org.apache.xmlbeans.XmlDouble totalTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMEAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALTIMEAVG$16);
                      }
                      target.set(totalTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "total_time_avg" attribute
                 */
                public void unsetTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALTIMEAVG$16);
                    }
                }
                
                /**
                 * Gets the "exec_time_avg" attribute
                 */
                public double getExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEAVG$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEAVG$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_time_avg" attribute
                 */
                public boolean isSetExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECTIMEAVG$18) != null;
                    }
                }
                
                /**
                 * Sets the "exec_time_avg" attribute
                 */
                public void setExecTimeAvg(double execTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIMEAVG$18);
                      }
                      target.setDoubleValue(execTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_time_avg" attribute
                 */
                public void xsetExecTimeAvg(org.apache.xmlbeans.XmlDouble execTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEAVG$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIMEAVG$18);
                      }
                      target.set(execTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "exec_time_avg" attribute
                 */
                public void unsetExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECTIMEAVG$18);
                    }
                }
                
                /**
                 * Gets the "cpu_total_time_avg" attribute
                 */
                public double getCpuTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMEAVG$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_total_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMEAVG$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_total_time_avg" attribute
                 */
                public boolean isSetCpuTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUTOTALTIMEAVG$20) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_total_time_avg" attribute
                 */
                public void setCpuTotalTimeAvg(double cpuTotalTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMEAVG$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUTOTALTIMEAVG$20);
                      }
                      target.setDoubleValue(cpuTotalTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_total_time_avg" attribute
                 */
                public void xsetCpuTotalTimeAvg(org.apache.xmlbeans.XmlDouble cpuTotalTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMEAVG$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUTOTALTIMEAVG$20);
                      }
                      target.set(cpuTotalTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "cpu_total_time_avg" attribute
                 */
                public void unsetCpuTotalTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUTOTALTIMEAVG$20);
                    }
                }
                
                /**
                 * Gets the "cpu_exec_time_avg" attribute
                 */
                public double getCpuExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMEAVG$22);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_exec_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMEAVG$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_exec_time_avg" attribute
                 */
                public boolean isSetCpuExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUEXECTIMEAVG$22) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_exec_time_avg" attribute
                 */
                public void setCpuExecTimeAvg(double cpuExecTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMEAVG$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUEXECTIMEAVG$22);
                      }
                      target.setDoubleValue(cpuExecTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_exec_time_avg" attribute
                 */
                public void xsetCpuExecTimeAvg(org.apache.xmlbeans.XmlDouble cpuExecTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMEAVG$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUEXECTIMEAVG$22);
                      }
                      target.set(cpuExecTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "cpu_exec_time_avg" attribute
                 */
                public void unsetCpuExecTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUEXECTIMEAVG$22);
                    }
                }
                
                /**
                 * Gets the "serialization_time_avg" attribute
                 */
                public double getSerializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMEAVG$24);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialization_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSerializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMEAVG$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialization_time_avg" attribute
                 */
                public boolean isSetSerializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZATIONTIMEAVG$24) != null;
                    }
                }
                
                /**
                 * Sets the "serialization_time_avg" attribute
                 */
                public void setSerializationTimeAvg(double serializationTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMEAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZATIONTIMEAVG$24);
                      }
                      target.setDoubleValue(serializationTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialization_time_avg" attribute
                 */
                public void xsetSerializationTimeAvg(org.apache.xmlbeans.XmlDouble serializationTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMEAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SERIALIZATIONTIMEAVG$24);
                      }
                      target.set(serializationTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "serialization_time_avg" attribute
                 */
                public void unsetSerializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZATIONTIMEAVG$24);
                    }
                }
                
                /**
                 * Gets the "deserialization_time_avg" attribute
                 */
                public double getDeserializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMEAVG$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialization_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDeserializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMEAVG$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialization_time_avg" attribute
                 */
                public boolean isSetDeserializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZATIONTIMEAVG$26) != null;
                    }
                }
                
                /**
                 * Sets the "deserialization_time_avg" attribute
                 */
                public void setDeserializationTimeAvg(double deserializationTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMEAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZATIONTIMEAVG$26);
                      }
                      target.setDoubleValue(deserializationTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialization_time_avg" attribute
                 */
                public void xsetDeserializationTimeAvg(org.apache.xmlbeans.XmlDouble deserializationTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMEAVG$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESERIALIZATIONTIMEAVG$26);
                      }
                      target.set(deserializationTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "deserialization_time_avg" attribute
                 */
                public void unsetDeserializationTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZATIONTIMEAVG$26);
                    }
                }
                
                /**
                 * Gets the "bytes_sent_avg" attribute
                 */
                public java.math.BigInteger getBytesSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTAVG$28);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_sent_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTAVG$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_sent_avg" attribute
                 */
                public boolean isSetBytesSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESSENTAVG$28) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_sent_avg" attribute
                 */
                public void setBytesSentAvg(java.math.BigInteger bytesSentAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESSENTAVG$28);
                      }
                      target.setBigIntegerValue(bytesSentAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_sent_avg" attribute
                 */
                public void xsetBytesSentAvg(org.apache.xmlbeans.XmlInteger bytesSentAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTAVG$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESSENTAVG$28);
                      }
                      target.set(bytesSentAvg);
                    }
                }
                
                /**
                 * Unsets the "bytes_sent_avg" attribute
                 */
                public void unsetBytesSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESSENTAVG$28);
                    }
                }
                
                /**
                 * Gets the "bytes_received_avg" attribute
                 */
                public java.math.BigInteger getBytesReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDAVG$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_received_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDAVG$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_received_avg" attribute
                 */
                public boolean isSetBytesReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESRECEIVEDAVG$30) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_received_avg" attribute
                 */
                public void setBytesReceivedAvg(java.math.BigInteger bytesReceivedAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDAVG$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESRECEIVEDAVG$30);
                      }
                      target.setBigIntegerValue(bytesReceivedAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_received_avg" attribute
                 */
                public void xsetBytesReceivedAvg(org.apache.xmlbeans.XmlInteger bytesReceivedAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDAVG$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESRECEIVEDAVG$30);
                      }
                      target.set(bytesReceivedAvg);
                    }
                }
                
                /**
                 * Unsets the "bytes_received_avg" attribute
                 */
                public void unsetBytesReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESRECEIVEDAVG$30);
                    }
                }
                
                /**
                 * Gets the "objects_sent_avg" attribute
                 */
                public java.math.BigInteger getObjectsSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTAVG$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_sent_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTAVG$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_sent_avg" attribute
                 */
                public boolean isSetObjectsSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSSENTAVG$32) != null;
                    }
                }
                
                /**
                 * Sets the "objects_sent_avg" attribute
                 */
                public void setObjectsSentAvg(java.math.BigInteger objectsSentAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTAVG$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSSENTAVG$32);
                      }
                      target.setBigIntegerValue(objectsSentAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_sent_avg" attribute
                 */
                public void xsetObjectsSentAvg(org.apache.xmlbeans.XmlInteger objectsSentAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTAVG$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSSENTAVG$32);
                      }
                      target.set(objectsSentAvg);
                    }
                }
                
                /**
                 * Unsets the "objects_sent_avg" attribute
                 */
                public void unsetObjectsSentAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSSENTAVG$32);
                    }
                }
                
                /**
                 * Gets the "objects_received_avg" attribute
                 */
                public java.math.BigInteger getObjectsReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDAVG$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_received_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDAVG$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_received_avg" attribute
                 */
                public boolean isSetObjectsReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSRECEIVEDAVG$34) != null;
                    }
                }
                
                /**
                 * Sets the "objects_received_avg" attribute
                 */
                public void setObjectsReceivedAvg(java.math.BigInteger objectsReceivedAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSRECEIVEDAVG$34);
                      }
                      target.setBigIntegerValue(objectsReceivedAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_received_avg" attribute
                 */
                public void xsetObjectsReceivedAvg(org.apache.xmlbeans.XmlInteger objectsReceivedAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDAVG$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSRECEIVEDAVG$34);
                      }
                      target.set(objectsReceivedAvg);
                    }
                }
                
                /**
                 * Unsets the "objects_received_avg" attribute
                 */
                public void unsetObjectsReceivedAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSRECEIVEDAVG$34);
                    }
                }
                
                /**
                 * Gets the "serialized_objects_avg" attribute
                 */
                public java.math.BigInteger getSerializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSAVG$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialized_objects_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSerializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSAVG$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialized_objects_avg" attribute
                 */
                public boolean isSetSerializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZEDOBJECTSAVG$36) != null;
                    }
                }
                
                /**
                 * Sets the "serialized_objects_avg" attribute
                 */
                public void setSerializedObjectsAvg(java.math.BigInteger serializedObjectsAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSAVG$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZEDOBJECTSAVG$36);
                      }
                      target.setBigIntegerValue(serializedObjectsAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialized_objects_avg" attribute
                 */
                public void xsetSerializedObjectsAvg(org.apache.xmlbeans.XmlInteger serializedObjectsAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSAVG$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SERIALIZEDOBJECTSAVG$36);
                      }
                      target.set(serializedObjectsAvg);
                    }
                }
                
                /**
                 * Unsets the "serialized_objects_avg" attribute
                 */
                public void unsetSerializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZEDOBJECTSAVG$36);
                    }
                }
                
                /**
                 * Gets the "deserialized_objects_avg" attribute
                 */
                public java.math.BigInteger getDeserializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSAVG$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialized_objects_avg" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSAVG$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialized_objects_avg" attribute
                 */
                public boolean isSetDeserializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZEDOBJECTSAVG$38) != null;
                    }
                }
                
                /**
                 * Sets the "deserialized_objects_avg" attribute
                 */
                public void setDeserializedObjectsAvg(java.math.BigInteger deserializedObjectsAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSAVG$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZEDOBJECTSAVG$38);
                      }
                      target.setBigIntegerValue(deserializedObjectsAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialized_objects_avg" attribute
                 */
                public void xsetDeserializedObjectsAvg(org.apache.xmlbeans.XmlInteger deserializedObjectsAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSAVG$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DESERIALIZEDOBJECTSAVG$38);
                      }
                      target.set(deserializedObjectsAvg);
                    }
                }
                
                /**
                 * Unsets the "deserialized_objects_avg" attribute
                 */
                public void unsetDeserializedObjectsAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZEDOBJECTSAVG$38);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYSUM$40);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYSUM$40);
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
                      return get_store().find_attribute_user(LATENCYSUM$40) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYSUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYSUM$40);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYSUM$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYSUM$40);
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
                      get_store().remove_attribute(LATENCYSUM$40);
                    }
                }
                
                /**
                 * Gets the "total_time_sum" attribute
                 */
                public double getTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMESUM$42);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMESUM$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_time_sum" attribute
                 */
                public boolean isSetTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALTIMESUM$42) != null;
                    }
                }
                
                /**
                 * Sets the "total_time_sum" attribute
                 */
                public void setTotalTimeSum(double totalTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMESUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALTIMESUM$42);
                      }
                      target.setDoubleValue(totalTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_time_sum" attribute
                 */
                public void xsetTotalTimeSum(org.apache.xmlbeans.XmlDouble totalTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMESUM$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALTIMESUM$42);
                      }
                      target.set(totalTimeSum);
                    }
                }
                
                /**
                 * Unsets the "total_time_sum" attribute
                 */
                public void unsetTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALTIMESUM$42);
                    }
                }
                
                /**
                 * Gets the "exec_time_sum" attribute
                 */
                public double getExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMESUM$44);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMESUM$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_time_sum" attribute
                 */
                public boolean isSetExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECTIMESUM$44) != null;
                    }
                }
                
                /**
                 * Sets the "exec_time_sum" attribute
                 */
                public void setExecTimeSum(double execTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMESUM$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIMESUM$44);
                      }
                      target.setDoubleValue(execTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_time_sum" attribute
                 */
                public void xsetExecTimeSum(org.apache.xmlbeans.XmlDouble execTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMESUM$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIMESUM$44);
                      }
                      target.set(execTimeSum);
                    }
                }
                
                /**
                 * Unsets the "exec_time_sum" attribute
                 */
                public void unsetExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECTIMESUM$44);
                    }
                }
                
                /**
                 * Gets the "cpu_total_time_sum" attribute
                 */
                public double getCpuTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMESUM$46);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_total_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMESUM$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_total_time_sum" attribute
                 */
                public boolean isSetCpuTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUTOTALTIMESUM$46) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_total_time_sum" attribute
                 */
                public void setCpuTotalTimeSum(double cpuTotalTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMESUM$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUTOTALTIMESUM$46);
                      }
                      target.setDoubleValue(cpuTotalTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_total_time_sum" attribute
                 */
                public void xsetCpuTotalTimeSum(org.apache.xmlbeans.XmlDouble cpuTotalTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMESUM$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUTOTALTIMESUM$46);
                      }
                      target.set(cpuTotalTimeSum);
                    }
                }
                
                /**
                 * Unsets the "cpu_total_time_sum" attribute
                 */
                public void unsetCpuTotalTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUTOTALTIMESUM$46);
                    }
                }
                
                /**
                 * Gets the "cpu_exec_time_sum" attribute
                 */
                public double getCpuExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMESUM$48);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_exec_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMESUM$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_exec_time_sum" attribute
                 */
                public boolean isSetCpuExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUEXECTIMESUM$48) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_exec_time_sum" attribute
                 */
                public void setCpuExecTimeSum(double cpuExecTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMESUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUEXECTIMESUM$48);
                      }
                      target.setDoubleValue(cpuExecTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_exec_time_sum" attribute
                 */
                public void xsetCpuExecTimeSum(org.apache.xmlbeans.XmlDouble cpuExecTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMESUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUEXECTIMESUM$48);
                      }
                      target.set(cpuExecTimeSum);
                    }
                }
                
                /**
                 * Unsets the "cpu_exec_time_sum" attribute
                 */
                public void unsetCpuExecTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUEXECTIMESUM$48);
                    }
                }
                
                /**
                 * Gets the "serialization_time_sum" attribute
                 */
                public double getSerializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMESUM$50);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialization_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSerializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMESUM$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialization_time_sum" attribute
                 */
                public boolean isSetSerializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZATIONTIMESUM$50) != null;
                    }
                }
                
                /**
                 * Sets the "serialization_time_sum" attribute
                 */
                public void setSerializationTimeSum(double serializationTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMESUM$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZATIONTIMESUM$50);
                      }
                      target.setDoubleValue(serializationTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialization_time_sum" attribute
                 */
                public void xsetSerializationTimeSum(org.apache.xmlbeans.XmlDouble serializationTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMESUM$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SERIALIZATIONTIMESUM$50);
                      }
                      target.set(serializationTimeSum);
                    }
                }
                
                /**
                 * Unsets the "serialization_time_sum" attribute
                 */
                public void unsetSerializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZATIONTIMESUM$50);
                    }
                }
                
                /**
                 * Gets the "deserialization_time_sum" attribute
                 */
                public double getDeserializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMESUM$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialization_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDeserializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMESUM$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialization_time_sum" attribute
                 */
                public boolean isSetDeserializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZATIONTIMESUM$52) != null;
                    }
                }
                
                /**
                 * Sets the "deserialization_time_sum" attribute
                 */
                public void setDeserializationTimeSum(double deserializationTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMESUM$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZATIONTIMESUM$52);
                      }
                      target.setDoubleValue(deserializationTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialization_time_sum" attribute
                 */
                public void xsetDeserializationTimeSum(org.apache.xmlbeans.XmlDouble deserializationTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMESUM$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESERIALIZATIONTIMESUM$52);
                      }
                      target.set(deserializationTimeSum);
                    }
                }
                
                /**
                 * Unsets the "deserialization_time_sum" attribute
                 */
                public void unsetDeserializationTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZATIONTIMESUM$52);
                    }
                }
                
                /**
                 * Gets the "bytes_sent_sum" attribute
                 */
                public java.math.BigInteger getBytesSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTSUM$54);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_sent_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTSUM$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_sent_sum" attribute
                 */
                public boolean isSetBytesSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESSENTSUM$54) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_sent_sum" attribute
                 */
                public void setBytesSentSum(java.math.BigInteger bytesSentSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTSUM$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESSENTSUM$54);
                      }
                      target.setBigIntegerValue(bytesSentSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_sent_sum" attribute
                 */
                public void xsetBytesSentSum(org.apache.xmlbeans.XmlInteger bytesSentSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTSUM$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESSENTSUM$54);
                      }
                      target.set(bytesSentSum);
                    }
                }
                
                /**
                 * Unsets the "bytes_sent_sum" attribute
                 */
                public void unsetBytesSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESSENTSUM$54);
                    }
                }
                
                /**
                 * Gets the "bytes_received_sum" attribute
                 */
                public java.math.BigInteger getBytesReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDSUM$56);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_received_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDSUM$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_received_sum" attribute
                 */
                public boolean isSetBytesReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESRECEIVEDSUM$56) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_received_sum" attribute
                 */
                public void setBytesReceivedSum(java.math.BigInteger bytesReceivedSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDSUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESRECEIVEDSUM$56);
                      }
                      target.setBigIntegerValue(bytesReceivedSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_received_sum" attribute
                 */
                public void xsetBytesReceivedSum(org.apache.xmlbeans.XmlInteger bytesReceivedSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDSUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESRECEIVEDSUM$56);
                      }
                      target.set(bytesReceivedSum);
                    }
                }
                
                /**
                 * Unsets the "bytes_received_sum" attribute
                 */
                public void unsetBytesReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESRECEIVEDSUM$56);
                    }
                }
                
                /**
                 * Gets the "objects_sent_sum" attribute
                 */
                public java.math.BigInteger getObjectsSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTSUM$58);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_sent_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTSUM$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_sent_sum" attribute
                 */
                public boolean isSetObjectsSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSSENTSUM$58) != null;
                    }
                }
                
                /**
                 * Sets the "objects_sent_sum" attribute
                 */
                public void setObjectsSentSum(java.math.BigInteger objectsSentSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTSUM$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSSENTSUM$58);
                      }
                      target.setBigIntegerValue(objectsSentSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_sent_sum" attribute
                 */
                public void xsetObjectsSentSum(org.apache.xmlbeans.XmlInteger objectsSentSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTSUM$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSSENTSUM$58);
                      }
                      target.set(objectsSentSum);
                    }
                }
                
                /**
                 * Unsets the "objects_sent_sum" attribute
                 */
                public void unsetObjectsSentSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSSENTSUM$58);
                    }
                }
                
                /**
                 * Gets the "objects_received_sum" attribute
                 */
                public java.math.BigInteger getObjectsReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDSUM$60);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_received_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDSUM$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_received_sum" attribute
                 */
                public boolean isSetObjectsReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSRECEIVEDSUM$60) != null;
                    }
                }
                
                /**
                 * Sets the "objects_received_sum" attribute
                 */
                public void setObjectsReceivedSum(java.math.BigInteger objectsReceivedSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDSUM$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSRECEIVEDSUM$60);
                      }
                      target.setBigIntegerValue(objectsReceivedSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_received_sum" attribute
                 */
                public void xsetObjectsReceivedSum(org.apache.xmlbeans.XmlInteger objectsReceivedSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDSUM$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSRECEIVEDSUM$60);
                      }
                      target.set(objectsReceivedSum);
                    }
                }
                
                /**
                 * Unsets the "objects_received_sum" attribute
                 */
                public void unsetObjectsReceivedSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSRECEIVEDSUM$60);
                    }
                }
                
                /**
                 * Gets the "serialized_objects_sum" attribute
                 */
                public java.math.BigInteger getSerializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSSUM$62);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialized_objects_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSerializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSSUM$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialized_objects_sum" attribute
                 */
                public boolean isSetSerializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZEDOBJECTSSUM$62) != null;
                    }
                }
                
                /**
                 * Sets the "serialized_objects_sum" attribute
                 */
                public void setSerializedObjectsSum(java.math.BigInteger serializedObjectsSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSSUM$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZEDOBJECTSSUM$62);
                      }
                      target.setBigIntegerValue(serializedObjectsSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialized_objects_sum" attribute
                 */
                public void xsetSerializedObjectsSum(org.apache.xmlbeans.XmlInteger serializedObjectsSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSSUM$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SERIALIZEDOBJECTSSUM$62);
                      }
                      target.set(serializedObjectsSum);
                    }
                }
                
                /**
                 * Unsets the "serialized_objects_sum" attribute
                 */
                public void unsetSerializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZEDOBJECTSSUM$62);
                    }
                }
                
                /**
                 * Gets the "deserialized_objects_sum" attribute
                 */
                public java.math.BigInteger getDeserializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSSUM$64);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialized_objects_sum" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSSUM$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialized_objects_sum" attribute
                 */
                public boolean isSetDeserializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZEDOBJECTSSUM$64) != null;
                    }
                }
                
                /**
                 * Sets the "deserialized_objects_sum" attribute
                 */
                public void setDeserializedObjectsSum(java.math.BigInteger deserializedObjectsSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSSUM$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZEDOBJECTSSUM$64);
                      }
                      target.setBigIntegerValue(deserializedObjectsSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialized_objects_sum" attribute
                 */
                public void xsetDeserializedObjectsSum(org.apache.xmlbeans.XmlInteger deserializedObjectsSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSSUM$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DESERIALIZEDOBJECTSSUM$64);
                      }
                      target.set(deserializedObjectsSum);
                    }
                }
                
                /**
                 * Unsets the "deserialized_objects_sum" attribute
                 */
                public void unsetDeserializedObjectsSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZEDOBJECTSSUM$64);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMIN$66);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMIN$66);
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
                      return get_store().find_attribute_user(LATENCYMIN$66) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMIN$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYMIN$66);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMIN$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYMIN$66);
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
                      get_store().remove_attribute(LATENCYMIN$66);
                    }
                }
                
                /**
                 * Gets the "total_time_min" attribute
                 */
                public double getTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMEMIN$68);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMEMIN$68);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_time_min" attribute
                 */
                public boolean isSetTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALTIMEMIN$68) != null;
                    }
                }
                
                /**
                 * Sets the "total_time_min" attribute
                 */
                public void setTotalTimeMin(double totalTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMEMIN$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALTIMEMIN$68);
                      }
                      target.setDoubleValue(totalTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_time_min" attribute
                 */
                public void xsetTotalTimeMin(org.apache.xmlbeans.XmlDouble totalTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMEMIN$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALTIMEMIN$68);
                      }
                      target.set(totalTimeMin);
                    }
                }
                
                /**
                 * Unsets the "total_time_min" attribute
                 */
                public void unsetTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALTIMEMIN$68);
                    }
                }
                
                /**
                 * Gets the "exec_time_min" attribute
                 */
                public double getExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEMIN$70);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEMIN$70);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_time_min" attribute
                 */
                public boolean isSetExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECTIMEMIN$70) != null;
                    }
                }
                
                /**
                 * Sets the "exec_time_min" attribute
                 */
                public void setExecTimeMin(double execTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEMIN$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIMEMIN$70);
                      }
                      target.setDoubleValue(execTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_time_min" attribute
                 */
                public void xsetExecTimeMin(org.apache.xmlbeans.XmlDouble execTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEMIN$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIMEMIN$70);
                      }
                      target.set(execTimeMin);
                    }
                }
                
                /**
                 * Unsets the "exec_time_min" attribute
                 */
                public void unsetExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECTIMEMIN$70);
                    }
                }
                
                /**
                 * Gets the "cpu_total_time_min" attribute
                 */
                public double getCpuTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMEMIN$72);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_total_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMEMIN$72);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_total_time_min" attribute
                 */
                public boolean isSetCpuTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUTOTALTIMEMIN$72) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_total_time_min" attribute
                 */
                public void setCpuTotalTimeMin(double cpuTotalTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMEMIN$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUTOTALTIMEMIN$72);
                      }
                      target.setDoubleValue(cpuTotalTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_total_time_min" attribute
                 */
                public void xsetCpuTotalTimeMin(org.apache.xmlbeans.XmlDouble cpuTotalTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMEMIN$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUTOTALTIMEMIN$72);
                      }
                      target.set(cpuTotalTimeMin);
                    }
                }
                
                /**
                 * Unsets the "cpu_total_time_min" attribute
                 */
                public void unsetCpuTotalTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUTOTALTIMEMIN$72);
                    }
                }
                
                /**
                 * Gets the "cpu_exec_time_min" attribute
                 */
                public double getCpuExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMEMIN$74);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_exec_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMEMIN$74);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_exec_time_min" attribute
                 */
                public boolean isSetCpuExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUEXECTIMEMIN$74) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_exec_time_min" attribute
                 */
                public void setCpuExecTimeMin(double cpuExecTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMEMIN$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUEXECTIMEMIN$74);
                      }
                      target.setDoubleValue(cpuExecTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_exec_time_min" attribute
                 */
                public void xsetCpuExecTimeMin(org.apache.xmlbeans.XmlDouble cpuExecTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMEMIN$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUEXECTIMEMIN$74);
                      }
                      target.set(cpuExecTimeMin);
                    }
                }
                
                /**
                 * Unsets the "cpu_exec_time_min" attribute
                 */
                public void unsetCpuExecTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUEXECTIMEMIN$74);
                    }
                }
                
                /**
                 * Gets the "serialization_time_min" attribute
                 */
                public double getSerializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMEMIN$76);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialization_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSerializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMEMIN$76);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialization_time_min" attribute
                 */
                public boolean isSetSerializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZATIONTIMEMIN$76) != null;
                    }
                }
                
                /**
                 * Sets the "serialization_time_min" attribute
                 */
                public void setSerializationTimeMin(double serializationTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMEMIN$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZATIONTIMEMIN$76);
                      }
                      target.setDoubleValue(serializationTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialization_time_min" attribute
                 */
                public void xsetSerializationTimeMin(org.apache.xmlbeans.XmlDouble serializationTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMEMIN$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SERIALIZATIONTIMEMIN$76);
                      }
                      target.set(serializationTimeMin);
                    }
                }
                
                /**
                 * Unsets the "serialization_time_min" attribute
                 */
                public void unsetSerializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZATIONTIMEMIN$76);
                    }
                }
                
                /**
                 * Gets the "deserialization_time_min" attribute
                 */
                public double getDeserializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMEMIN$78);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialization_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDeserializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMEMIN$78);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialization_time_min" attribute
                 */
                public boolean isSetDeserializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZATIONTIMEMIN$78) != null;
                    }
                }
                
                /**
                 * Sets the "deserialization_time_min" attribute
                 */
                public void setDeserializationTimeMin(double deserializationTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMEMIN$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZATIONTIMEMIN$78);
                      }
                      target.setDoubleValue(deserializationTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialization_time_min" attribute
                 */
                public void xsetDeserializationTimeMin(org.apache.xmlbeans.XmlDouble deserializationTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMEMIN$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESERIALIZATIONTIMEMIN$78);
                      }
                      target.set(deserializationTimeMin);
                    }
                }
                
                /**
                 * Unsets the "deserialization_time_min" attribute
                 */
                public void unsetDeserializationTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZATIONTIMEMIN$78);
                    }
                }
                
                /**
                 * Gets the "bytes_sent_min" attribute
                 */
                public java.math.BigInteger getBytesSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTMIN$80);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_sent_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTMIN$80);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_sent_min" attribute
                 */
                public boolean isSetBytesSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESSENTMIN$80) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_sent_min" attribute
                 */
                public void setBytesSentMin(java.math.BigInteger bytesSentMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTMIN$80);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESSENTMIN$80);
                      }
                      target.setBigIntegerValue(bytesSentMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_sent_min" attribute
                 */
                public void xsetBytesSentMin(org.apache.xmlbeans.XmlInteger bytesSentMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTMIN$80);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESSENTMIN$80);
                      }
                      target.set(bytesSentMin);
                    }
                }
                
                /**
                 * Unsets the "bytes_sent_min" attribute
                 */
                public void unsetBytesSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESSENTMIN$80);
                    }
                }
                
                /**
                 * Gets the "bytes_received_min" attribute
                 */
                public java.math.BigInteger getBytesReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDMIN$82);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_received_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDMIN$82);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_received_min" attribute
                 */
                public boolean isSetBytesReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESRECEIVEDMIN$82) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_received_min" attribute
                 */
                public void setBytesReceivedMin(java.math.BigInteger bytesReceivedMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDMIN$82);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESRECEIVEDMIN$82);
                      }
                      target.setBigIntegerValue(bytesReceivedMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_received_min" attribute
                 */
                public void xsetBytesReceivedMin(org.apache.xmlbeans.XmlInteger bytesReceivedMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDMIN$82);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESRECEIVEDMIN$82);
                      }
                      target.set(bytesReceivedMin);
                    }
                }
                
                /**
                 * Unsets the "bytes_received_min" attribute
                 */
                public void unsetBytesReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESRECEIVEDMIN$82);
                    }
                }
                
                /**
                 * Gets the "objects_sent_min" attribute
                 */
                public java.math.BigInteger getObjectsSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTMIN$84);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_sent_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTMIN$84);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_sent_min" attribute
                 */
                public boolean isSetObjectsSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSSENTMIN$84) != null;
                    }
                }
                
                /**
                 * Sets the "objects_sent_min" attribute
                 */
                public void setObjectsSentMin(java.math.BigInteger objectsSentMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTMIN$84);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSSENTMIN$84);
                      }
                      target.setBigIntegerValue(objectsSentMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_sent_min" attribute
                 */
                public void xsetObjectsSentMin(org.apache.xmlbeans.XmlInteger objectsSentMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTMIN$84);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSSENTMIN$84);
                      }
                      target.set(objectsSentMin);
                    }
                }
                
                /**
                 * Unsets the "objects_sent_min" attribute
                 */
                public void unsetObjectsSentMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSSENTMIN$84);
                    }
                }
                
                /**
                 * Gets the "objects_received_min" attribute
                 */
                public java.math.BigInteger getObjectsReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDMIN$86);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_received_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDMIN$86);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_received_min" attribute
                 */
                public boolean isSetObjectsReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSRECEIVEDMIN$86) != null;
                    }
                }
                
                /**
                 * Sets the "objects_received_min" attribute
                 */
                public void setObjectsReceivedMin(java.math.BigInteger objectsReceivedMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDMIN$86);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSRECEIVEDMIN$86);
                      }
                      target.setBigIntegerValue(objectsReceivedMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_received_min" attribute
                 */
                public void xsetObjectsReceivedMin(org.apache.xmlbeans.XmlInteger objectsReceivedMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDMIN$86);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSRECEIVEDMIN$86);
                      }
                      target.set(objectsReceivedMin);
                    }
                }
                
                /**
                 * Unsets the "objects_received_min" attribute
                 */
                public void unsetObjectsReceivedMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSRECEIVEDMIN$86);
                    }
                }
                
                /**
                 * Gets the "serialized_objects_min" attribute
                 */
                public java.math.BigInteger getSerializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSMIN$88);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialized_objects_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSerializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSMIN$88);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialized_objects_min" attribute
                 */
                public boolean isSetSerializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZEDOBJECTSMIN$88) != null;
                    }
                }
                
                /**
                 * Sets the "serialized_objects_min" attribute
                 */
                public void setSerializedObjectsMin(java.math.BigInteger serializedObjectsMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSMIN$88);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZEDOBJECTSMIN$88);
                      }
                      target.setBigIntegerValue(serializedObjectsMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialized_objects_min" attribute
                 */
                public void xsetSerializedObjectsMin(org.apache.xmlbeans.XmlInteger serializedObjectsMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSMIN$88);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SERIALIZEDOBJECTSMIN$88);
                      }
                      target.set(serializedObjectsMin);
                    }
                }
                
                /**
                 * Unsets the "serialized_objects_min" attribute
                 */
                public void unsetSerializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZEDOBJECTSMIN$88);
                    }
                }
                
                /**
                 * Gets the "deserialized_objects_min" attribute
                 */
                public java.math.BigInteger getDeserializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSMIN$90);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialized_objects_min" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSMIN$90);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialized_objects_min" attribute
                 */
                public boolean isSetDeserializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZEDOBJECTSMIN$90) != null;
                    }
                }
                
                /**
                 * Sets the "deserialized_objects_min" attribute
                 */
                public void setDeserializedObjectsMin(java.math.BigInteger deserializedObjectsMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSMIN$90);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZEDOBJECTSMIN$90);
                      }
                      target.setBigIntegerValue(deserializedObjectsMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialized_objects_min" attribute
                 */
                public void xsetDeserializedObjectsMin(org.apache.xmlbeans.XmlInteger deserializedObjectsMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSMIN$90);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DESERIALIZEDOBJECTSMIN$90);
                      }
                      target.set(deserializedObjectsMin);
                    }
                }
                
                /**
                 * Unsets the "deserialized_objects_min" attribute
                 */
                public void unsetDeserializedObjectsMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZEDOBJECTSMIN$90);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMAX$92);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMAX$92);
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
                      return get_store().find_attribute_user(LATENCYMAX$92) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATENCYMAX$92);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATENCYMAX$92);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(LATENCYMAX$92);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(LATENCYMAX$92);
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
                      get_store().remove_attribute(LATENCYMAX$92);
                    }
                }
                
                /**
                 * Gets the "total_time_max" attribute
                 */
                public double getTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMEMAX$94);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "total_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMEMAX$94);
                      return target;
                    }
                }
                
                /**
                 * True if has "total_time_max" attribute
                 */
                public boolean isSetTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TOTALTIMEMAX$94) != null;
                    }
                }
                
                /**
                 * Sets the "total_time_max" attribute
                 */
                public void setTotalTimeMax(double totalTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIMEMAX$94);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALTIMEMAX$94);
                      }
                      target.setDoubleValue(totalTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "total_time_max" attribute
                 */
                public void xsetTotalTimeMax(org.apache.xmlbeans.XmlDouble totalTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIMEMAX$94);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALTIMEMAX$94);
                      }
                      target.set(totalTimeMax);
                    }
                }
                
                /**
                 * Unsets the "total_time_max" attribute
                 */
                public void unsetTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TOTALTIMEMAX$94);
                    }
                }
                
                /**
                 * Gets the "exec_time_max" attribute
                 */
                public double getExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEMAX$96);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEMAX$96);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_time_max" attribute
                 */
                public boolean isSetExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECTIMEMAX$96) != null;
                    }
                }
                
                /**
                 * Sets the "exec_time_max" attribute
                 */
                public void setExecTimeMax(double execTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEMAX$96);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIMEMAX$96);
                      }
                      target.setDoubleValue(execTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_time_max" attribute
                 */
                public void xsetExecTimeMax(org.apache.xmlbeans.XmlDouble execTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEMAX$96);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIMEMAX$96);
                      }
                      target.set(execTimeMax);
                    }
                }
                
                /**
                 * Unsets the "exec_time_max" attribute
                 */
                public void unsetExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECTIMEMAX$96);
                    }
                }
                
                /**
                 * Gets the "cpu_total_time_max" attribute
                 */
                public double getCpuTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMEMAX$98);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_total_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMEMAX$98);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_total_time_max" attribute
                 */
                public boolean isSetCpuTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUTOTALTIMEMAX$98) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_total_time_max" attribute
                 */
                public void setCpuTotalTimeMax(double cpuTotalTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIMEMAX$98);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUTOTALTIMEMAX$98);
                      }
                      target.setDoubleValue(cpuTotalTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_total_time_max" attribute
                 */
                public void xsetCpuTotalTimeMax(org.apache.xmlbeans.XmlDouble cpuTotalTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIMEMAX$98);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUTOTALTIMEMAX$98);
                      }
                      target.set(cpuTotalTimeMax);
                    }
                }
                
                /**
                 * Unsets the "cpu_total_time_max" attribute
                 */
                public void unsetCpuTotalTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUTOTALTIMEMAX$98);
                    }
                }
                
                /**
                 * Gets the "cpu_exec_time_max" attribute
                 */
                public double getCpuExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMEMAX$100);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_exec_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMEMAX$100);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_exec_time_max" attribute
                 */
                public boolean isSetCpuExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUEXECTIMEMAX$100) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_exec_time_max" attribute
                 */
                public void setCpuExecTimeMax(double cpuExecTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIMEMAX$100);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUEXECTIMEMAX$100);
                      }
                      target.setDoubleValue(cpuExecTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_exec_time_max" attribute
                 */
                public void xsetCpuExecTimeMax(org.apache.xmlbeans.XmlDouble cpuExecTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIMEMAX$100);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUEXECTIMEMAX$100);
                      }
                      target.set(cpuExecTimeMax);
                    }
                }
                
                /**
                 * Unsets the "cpu_exec_time_max" attribute
                 */
                public void unsetCpuExecTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUEXECTIMEMAX$100);
                    }
                }
                
                /**
                 * Gets the "serialization_time_max" attribute
                 */
                public double getSerializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMEMAX$102);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialization_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSerializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMEMAX$102);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialization_time_max" attribute
                 */
                public boolean isSetSerializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZATIONTIMEMAX$102) != null;
                    }
                }
                
                /**
                 * Sets the "serialization_time_max" attribute
                 */
                public void setSerializationTimeMax(double serializationTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZATIONTIMEMAX$102);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZATIONTIMEMAX$102);
                      }
                      target.setDoubleValue(serializationTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialization_time_max" attribute
                 */
                public void xsetSerializationTimeMax(org.apache.xmlbeans.XmlDouble serializationTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERIALIZATIONTIMEMAX$102);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SERIALIZATIONTIMEMAX$102);
                      }
                      target.set(serializationTimeMax);
                    }
                }
                
                /**
                 * Unsets the "serialization_time_max" attribute
                 */
                public void unsetSerializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZATIONTIMEMAX$102);
                    }
                }
                
                /**
                 * Gets the "deserialization_time_max" attribute
                 */
                public double getDeserializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMEMAX$104);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialization_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDeserializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMEMAX$104);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialization_time_max" attribute
                 */
                public boolean isSetDeserializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZATIONTIMEMAX$104) != null;
                    }
                }
                
                /**
                 * Sets the "deserialization_time_max" attribute
                 */
                public void setDeserializationTimeMax(double deserializationTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZATIONTIMEMAX$104);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZATIONTIMEMAX$104);
                      }
                      target.setDoubleValue(deserializationTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialization_time_max" attribute
                 */
                public void xsetDeserializationTimeMax(org.apache.xmlbeans.XmlDouble deserializationTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESERIALIZATIONTIMEMAX$104);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESERIALIZATIONTIMEMAX$104);
                      }
                      target.set(deserializationTimeMax);
                    }
                }
                
                /**
                 * Unsets the "deserialization_time_max" attribute
                 */
                public void unsetDeserializationTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZATIONTIMEMAX$104);
                    }
                }
                
                /**
                 * Gets the "bytes_sent_max" attribute
                 */
                public java.math.BigInteger getBytesSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTMAX$106);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_sent_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTMAX$106);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_sent_max" attribute
                 */
                public boolean isSetBytesSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESSENTMAX$106) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_sent_max" attribute
                 */
                public void setBytesSentMax(java.math.BigInteger bytesSentMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESSENTMAX$106);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESSENTMAX$106);
                      }
                      target.setBigIntegerValue(bytesSentMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_sent_max" attribute
                 */
                public void xsetBytesSentMax(org.apache.xmlbeans.XmlInteger bytesSentMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESSENTMAX$106);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESSENTMAX$106);
                      }
                      target.set(bytesSentMax);
                    }
                }
                
                /**
                 * Unsets the "bytes_sent_max" attribute
                 */
                public void unsetBytesSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESSENTMAX$106);
                    }
                }
                
                /**
                 * Gets the "bytes_received_max" attribute
                 */
                public java.math.BigInteger getBytesReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDMAX$108);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "bytes_received_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetBytesReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDMAX$108);
                      return target;
                    }
                }
                
                /**
                 * True if has "bytes_received_max" attribute
                 */
                public boolean isSetBytesReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BYTESRECEIVEDMAX$108) != null;
                    }
                }
                
                /**
                 * Sets the "bytes_received_max" attribute
                 */
                public void setBytesReceivedMax(java.math.BigInteger bytesReceivedMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYTESRECEIVEDMAX$108);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYTESRECEIVEDMAX$108);
                      }
                      target.setBigIntegerValue(bytesReceivedMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "bytes_received_max" attribute
                 */
                public void xsetBytesReceivedMax(org.apache.xmlbeans.XmlInteger bytesReceivedMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(BYTESRECEIVEDMAX$108);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(BYTESRECEIVEDMAX$108);
                      }
                      target.set(bytesReceivedMax);
                    }
                }
                
                /**
                 * Unsets the "bytes_received_max" attribute
                 */
                public void unsetBytesReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BYTESRECEIVEDMAX$108);
                    }
                }
                
                /**
                 * Gets the "objects_sent_max" attribute
                 */
                public java.math.BigInteger getObjectsSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTMAX$110);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_sent_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTMAX$110);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_sent_max" attribute
                 */
                public boolean isSetObjectsSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSSENTMAX$110) != null;
                    }
                }
                
                /**
                 * Sets the "objects_sent_max" attribute
                 */
                public void setObjectsSentMax(java.math.BigInteger objectsSentMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSSENTMAX$110);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSSENTMAX$110);
                      }
                      target.setBigIntegerValue(objectsSentMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_sent_max" attribute
                 */
                public void xsetObjectsSentMax(org.apache.xmlbeans.XmlInteger objectsSentMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSSENTMAX$110);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSSENTMAX$110);
                      }
                      target.set(objectsSentMax);
                    }
                }
                
                /**
                 * Unsets the "objects_sent_max" attribute
                 */
                public void unsetObjectsSentMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSSENTMAX$110);
                    }
                }
                
                /**
                 * Gets the "objects_received_max" attribute
                 */
                public java.math.BigInteger getObjectsReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDMAX$112);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "objects_received_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetObjectsReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDMAX$112);
                      return target;
                    }
                }
                
                /**
                 * True if has "objects_received_max" attribute
                 */
                public boolean isSetObjectsReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OBJECTSRECEIVEDMAX$112) != null;
                    }
                }
                
                /**
                 * Sets the "objects_received_max" attribute
                 */
                public void setObjectsReceivedMax(java.math.BigInteger objectsReceivedMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTSRECEIVEDMAX$112);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTSRECEIVEDMAX$112);
                      }
                      target.setBigIntegerValue(objectsReceivedMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "objects_received_max" attribute
                 */
                public void xsetObjectsReceivedMax(org.apache.xmlbeans.XmlInteger objectsReceivedMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(OBJECTSRECEIVEDMAX$112);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(OBJECTSRECEIVEDMAX$112);
                      }
                      target.set(objectsReceivedMax);
                    }
                }
                
                /**
                 * Unsets the "objects_received_max" attribute
                 */
                public void unsetObjectsReceivedMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OBJECTSRECEIVEDMAX$112);
                    }
                }
                
                /**
                 * Gets the "serialized_objects_max" attribute
                 */
                public java.math.BigInteger getSerializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSMAX$114);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serialized_objects_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSerializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSMAX$114);
                      return target;
                    }
                }
                
                /**
                 * True if has "serialized_objects_max" attribute
                 */
                public boolean isSetSerializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERIALIZEDOBJECTSMAX$114) != null;
                    }
                }
                
                /**
                 * Sets the "serialized_objects_max" attribute
                 */
                public void setSerializedObjectsMax(java.math.BigInteger serializedObjectsMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZEDOBJECTSMAX$114);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZEDOBJECTSMAX$114);
                      }
                      target.setBigIntegerValue(serializedObjectsMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "serialized_objects_max" attribute
                 */
                public void xsetSerializedObjectsMax(org.apache.xmlbeans.XmlInteger serializedObjectsMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SERIALIZEDOBJECTSMAX$114);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SERIALIZEDOBJECTSMAX$114);
                      }
                      target.set(serializedObjectsMax);
                    }
                }
                
                /**
                 * Unsets the "serialized_objects_max" attribute
                 */
                public void unsetSerializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERIALIZEDOBJECTSMAX$114);
                    }
                }
                
                /**
                 * Gets the "deserialized_objects_max" attribute
                 */
                public java.math.BigInteger getDeserializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSMAX$116);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deserialized_objects_max" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSMAX$116);
                      return target;
                    }
                }
                
                /**
                 * True if has "deserialized_objects_max" attribute
                 */
                public boolean isSetDeserializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESERIALIZEDOBJECTSMAX$116) != null;
                    }
                }
                
                /**
                 * Sets the "deserialized_objects_max" attribute
                 */
                public void setDeserializedObjectsMax(java.math.BigInteger deserializedObjectsMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZEDOBJECTSMAX$116);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZEDOBJECTSMAX$116);
                      }
                      target.setBigIntegerValue(deserializedObjectsMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "deserialized_objects_max" attribute
                 */
                public void xsetDeserializedObjectsMax(org.apache.xmlbeans.XmlInteger deserializedObjectsMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DESERIALIZEDOBJECTSMAX$116);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DESERIALIZEDOBJECTSMAX$116);
                      }
                      target.set(deserializedObjectsMax);
                    }
                }
                
                /**
                 * Unsets the "deserialized_objects_max" attribute
                 */
                public void unsetDeserializedObjectsMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESERIALIZEDOBJECTSMAX$116);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$118);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$118);
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
                      return get_store().find_attribute_user(ERRORSTATE$118) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$118);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTATE$118);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$118);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORSTATE$118);
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
                      get_store().remove_attribute(ERRORSTATE$118);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$120);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$120);
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
                      return get_store().find_attribute_user(FAILURERATE$120) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$120);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$120);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$120);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$120);
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
                      get_store().remove_attribute(FAILURERATE$120);
                    }
                }
            }
        }
    }
}
