/*
 * An XML document type.
 * Localname: agentbreakdowndashlet
 * Namespace: 
 * Java type: noNamespace.AgentbreakdowndashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one agentbreakdowndashlet(@) element.
 *
 * This is a complex type.
 */
public class AgentbreakdowndashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AgentbreakdowndashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgentbreakdowndashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENTBREAKDOWNDASHLET$0 = 
        new javax.xml.namespace.QName("", "agentbreakdowndashlet");
    
    
    /**
     * Gets the "agentbreakdowndashlet" element
     */
    public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet getAgentbreakdowndashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet target = null;
            target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().find_element_user(AGENTBREAKDOWNDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "agentbreakdowndashlet" element
     */
    public void setAgentbreakdowndashlet(noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet agentbreakdowndashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet target = null;
            target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().find_element_user(AGENTBREAKDOWNDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().add_element_user(AGENTBREAKDOWNDASHLET$0);
            }
            target.set(agentbreakdowndashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "agentbreakdowndashlet" element
     */
    public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet addNewAgentbreakdowndashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet target = null;
            target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().add_element_user(AGENTBREAKDOWNDASHLET$0);
            return target;
        }
    }
    /**
     * An XML agentbreakdowndashlet(@).
     *
     * This is a complex type.
     */
    public static class AgentbreakdowndashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet
    {
        private static final long serialVersionUID = 1L;
        
        public AgentbreakdowndashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName AGENTS$4 = 
            new javax.xml.namespace.QName("", "agents");
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
         * Gets the "agents" element
         */
        public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents getAgents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents target = null;
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents)get_store().find_element_user(AGENTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "agents" element
         */
        public boolean isSetAgents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AGENTS$4) != 0;
            }
        }
        
        /**
         * Sets the "agents" element
         */
        public void setAgents(noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents agents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents target = null;
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents)get_store().find_element_user(AGENTS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents)get_store().add_element_user(AGENTS$4);
                }
                target.set(agents);
            }
        }
        
        /**
         * Appends and returns a new empty "agents" element
         */
        public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents addNewAgents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents target = null;
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents)get_store().add_element_user(AGENTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "agents" element
         */
        public void unsetAgents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AGENTS$4, 0);
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
         * An XML agents(@).
         *
         * This is a complex type.
         */
        public static class AgentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents
        {
            private static final long serialVersionUID = 1L;
            
            public AgentsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AGENT$0 = 
                new javax.xml.namespace.QName("", "agent");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "agent" elements
             */
            public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent[] getAgentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(AGENT$0, targetList);
                    noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent[] result = new noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "agent" element
             */
            public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent getAgentArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent target = null;
                    target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent)get_store().find_element_user(AGENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "agent" element
             */
            public int sizeOfAgentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AGENT$0);
                }
            }
            
            /**
             * Sets array of all "agent" element
             */
            public void setAgentArray(noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent[] agentArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(agentArray, AGENT$0);
                }
            }
            
            /**
             * Sets ith "agent" element
             */
            public void setAgentArray(int i, noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent agent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent target = null;
                    target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent)get_store().find_element_user(AGENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(agent);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "agent" element
             */
            public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent insertNewAgent(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent target = null;
                    target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent)get_store().insert_element_user(AGENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "agent" element
             */
            public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent addNewAgent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent target = null;
                    target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent)get_store().add_element_user(AGENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "agent" element
             */
            public void removeAgent(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AGENT$0, i);
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
             * An XML agent(@).
             *
             * This is a complex type.
             */
            public static class AgentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet.Agents.Agent
            {
                private static final long serialVersionUID = 1L;
                
                public AgentImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AGENT$0 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName HOST$4 = 
                    new javax.xml.namespace.QName("", "host");
                private static final javax.xml.namespace.QName GROUP$6 = 
                    new javax.xml.namespace.QName("", "group");
                private static final javax.xml.namespace.QName EXECAVG$8 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$10 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$12 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$14 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName DATABASEAVG$16 = 
                    new javax.xml.namespace.QName("", "database_avg");
                private static final javax.xml.namespace.QName DATABASEMIN$18 = 
                    new javax.xml.namespace.QName("", "database_min");
                private static final javax.xml.namespace.QName DATABASEMAX$20 = 
                    new javax.xml.namespace.QName("", "database_max");
                private static final javax.xml.namespace.QName DATABASESUM$22 = 
                    new javax.xml.namespace.QName("", "database_sum");
                private static final javax.xml.namespace.QName CPUAVG$24 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUMIN$26 = 
                    new javax.xml.namespace.QName("", "cpu_min");
                private static final javax.xml.namespace.QName CPUMAX$28 = 
                    new javax.xml.namespace.QName("", "cpu_max");
                private static final javax.xml.namespace.QName CPUSUM$30 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                private static final javax.xml.namespace.QName SYNCAVG$32 = 
                    new javax.xml.namespace.QName("", "sync_avg");
                private static final javax.xml.namespace.QName SYNCMIN$34 = 
                    new javax.xml.namespace.QName("", "sync_min");
                private static final javax.xml.namespace.QName SYNCMAX$36 = 
                    new javax.xml.namespace.QName("", "sync_max");
                private static final javax.xml.namespace.QName SYNCSUM$38 = 
                    new javax.xml.namespace.QName("", "sync_sum");
                private static final javax.xml.namespace.QName WAITAVG$40 = 
                    new javax.xml.namespace.QName("", "wait_avg");
                private static final javax.xml.namespace.QName WAITMIN$42 = 
                    new javax.xml.namespace.QName("", "wait_min");
                private static final javax.xml.namespace.QName WAITMAX$44 = 
                    new javax.xml.namespace.QName("", "wait_max");
                private static final javax.xml.namespace.QName WAITSUM$46 = 
                    new javax.xml.namespace.QName("", "wait_sum");
                private static final javax.xml.namespace.QName FAILURERATE$48 = 
                    new javax.xml.namespace.QName("", "failure_rate");
                private static final javax.xml.namespace.QName SUSPENSIONAVG$50 = 
                    new javax.xml.namespace.QName("", "suspension_avg");
                private static final javax.xml.namespace.QName SUSPENSIONMIN$52 = 
                    new javax.xml.namespace.QName("", "suspension_min");
                private static final javax.xml.namespace.QName SUSPENSIONMAX$54 = 
                    new javax.xml.namespace.QName("", "suspension_max");
                private static final javax.xml.namespace.QName SUSPENSIONSUM$56 = 
                    new javax.xml.namespace.QName("", "suspension_sum");
                
                
                /**
                 * Gets array of all "agent" elements
                 */
                public noNamespace.AgentDocument.Agent[] getAgentArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(AGENT$0, targetList);
                      noNamespace.AgentDocument.Agent[] result = new noNamespace.AgentDocument.Agent[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "agent" element
                 */
                public noNamespace.AgentDocument.Agent getAgentArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentDocument.Agent target = null;
                      target = (noNamespace.AgentDocument.Agent)get_store().find_element_user(AGENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "agent" element
                 */
                public int sizeOfAgentArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AGENT$0);
                    }
                }
                
                /**
                 * Sets array of all "agent" element
                 */
                public void setAgentArray(noNamespace.AgentDocument.Agent[] agentArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(agentArray, AGENT$0);
                    }
                }
                
                /**
                 * Sets ith "agent" element
                 */
                public void setAgentArray(int i, noNamespace.AgentDocument.Agent agent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentDocument.Agent target = null;
                      target = (noNamespace.AgentDocument.Agent)get_store().find_element_user(AGENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(agent);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "agent" element
                 */
                public noNamespace.AgentDocument.Agent insertNewAgent(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentDocument.Agent target = null;
                      target = (noNamespace.AgentDocument.Agent)get_store().insert_element_user(AGENT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "agent" element
                 */
                public noNamespace.AgentDocument.Agent addNewAgent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.AgentDocument.Agent target = null;
                      target = (noNamespace.AgentDocument.Agent)get_store().add_element_user(AGENT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "agent" element
                 */
                public void removeAgent(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AGENT$0, i);
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
                 * Gets the "host" attribute
                 */
                public java.lang.String getHost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$4);
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
                      return get_store().find_attribute_user(HOST$4) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOST$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOST$4);
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
                      get_store().remove_attribute(HOST$4);
                    }
                }
                
                /**
                 * Gets the "group" attribute
                 */
                public java.lang.String getGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "group" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "group" attribute
                 */
                public boolean isSetGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(GROUP$6) != null;
                    }
                }
                
                /**
                 * Sets the "group" attribute
                 */
                public void setGroup(java.lang.String group)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$6);
                      }
                      target.setStringValue(group);
                    }
                }
                
                /**
                 * Sets (as xml) the "group" attribute
                 */
                public void xsetGroup(org.apache.xmlbeans.XmlString group)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$6);
                      }
                      target.set(group);
                    }
                }
                
                /**
                 * Unsets the "group" attribute
                 */
                public void unsetGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(GROUP$6);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$8);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$8);
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
                      return get_store().find_attribute_user(EXECAVG$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$8);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$8);
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
                      get_store().remove_attribute(EXECAVG$8);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$10);
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
                      return get_store().find_attribute_user(EXECMIN$10) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$10);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$10);
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
                      get_store().remove_attribute(EXECMIN$10);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$12);
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
                      return get_store().find_attribute_user(EXECMAX$12) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$12);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$12);
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
                      get_store().remove_attribute(EXECMAX$12);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$14);
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
                      return get_store().find_attribute_user(EXECSUM$14) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$14);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$14);
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
                      get_store().remove_attribute(EXECSUM$14);
                    }
                }
                
                /**
                 * Gets the "database_avg" attribute
                 */
                public double getDatabaseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEAVG$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "database_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDatabaseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASEAVG$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "database_avg" attribute
                 */
                public boolean isSetDatabaseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DATABASEAVG$16) != null;
                    }
                }
                
                /**
                 * Sets the "database_avg" attribute
                 */
                public void setDatabaseAvg(double databaseAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATABASEAVG$16);
                      }
                      target.setDoubleValue(databaseAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "database_avg" attribute
                 */
                public void xsetDatabaseAvg(org.apache.xmlbeans.XmlDouble databaseAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASEAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DATABASEAVG$16);
                      }
                      target.set(databaseAvg);
                    }
                }
                
                /**
                 * Unsets the "database_avg" attribute
                 */
                public void unsetDatabaseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DATABASEAVG$16);
                    }
                }
                
                /**
                 * Gets the "database_min" attribute
                 */
                public double getDatabaseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEMIN$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "database_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDatabaseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASEMIN$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "database_min" attribute
                 */
                public boolean isSetDatabaseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DATABASEMIN$18) != null;
                    }
                }
                
                /**
                 * Sets the "database_min" attribute
                 */
                public void setDatabaseMin(double databaseMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEMIN$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATABASEMIN$18);
                      }
                      target.setDoubleValue(databaseMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "database_min" attribute
                 */
                public void xsetDatabaseMin(org.apache.xmlbeans.XmlDouble databaseMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASEMIN$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DATABASEMIN$18);
                      }
                      target.set(databaseMin);
                    }
                }
                
                /**
                 * Unsets the "database_min" attribute
                 */
                public void unsetDatabaseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DATABASEMIN$18);
                    }
                }
                
                /**
                 * Gets the "database_max" attribute
                 */
                public double getDatabaseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEMAX$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "database_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDatabaseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASEMAX$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "database_max" attribute
                 */
                public boolean isSetDatabaseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DATABASEMAX$20) != null;
                    }
                }
                
                /**
                 * Sets the "database_max" attribute
                 */
                public void setDatabaseMax(double databaseMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEMAX$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATABASEMAX$20);
                      }
                      target.setDoubleValue(databaseMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "database_max" attribute
                 */
                public void xsetDatabaseMax(org.apache.xmlbeans.XmlDouble databaseMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASEMAX$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DATABASEMAX$20);
                      }
                      target.set(databaseMax);
                    }
                }
                
                /**
                 * Unsets the "database_max" attribute
                 */
                public void unsetDatabaseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DATABASEMAX$20);
                    }
                }
                
                /**
                 * Gets the "database_sum" attribute
                 */
                public double getDatabaseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASESUM$22);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "database_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDatabaseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASESUM$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "database_sum" attribute
                 */
                public boolean isSetDatabaseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DATABASESUM$22) != null;
                    }
                }
                
                /**
                 * Sets the "database_sum" attribute
                 */
                public void setDatabaseSum(double databaseSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASESUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATABASESUM$22);
                      }
                      target.setDoubleValue(databaseSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "database_sum" attribute
                 */
                public void xsetDatabaseSum(org.apache.xmlbeans.XmlDouble databaseSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DATABASESUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DATABASESUM$22);
                      }
                      target.set(databaseSum);
                    }
                }
                
                /**
                 * Unsets the "database_sum" attribute
                 */
                public void unsetDatabaseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DATABASESUM$22);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$24);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$24);
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
                      return get_store().find_attribute_user(CPUAVG$24) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$24);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$24);
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
                      get_store().remove_attribute(CPUAVG$24);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$26);
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
                      return get_store().find_attribute_user(CPUMIN$26) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMIN$26);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMIN$26);
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
                      get_store().remove_attribute(CPUMIN$26);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$28);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$28);
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
                      return get_store().find_attribute_user(CPUMAX$28) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMAX$28);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMAX$28);
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
                      get_store().remove_attribute(CPUMAX$28);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$30);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$30);
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
                      return get_store().find_attribute_user(CPUSUM$30) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$30);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$30);
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
                      get_store().remove_attribute(CPUSUM$30);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCAVG$32);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCAVG$32);
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
                      return get_store().find_attribute_user(SYNCAVG$32) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCAVG$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCAVG$32);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCAVG$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCAVG$32);
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
                      get_store().remove_attribute(SYNCAVG$32);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMIN$34);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMIN$34);
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
                      return get_store().find_attribute_user(SYNCMIN$34) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMIN$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCMIN$34);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMIN$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCMIN$34);
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
                      get_store().remove_attribute(SYNCMIN$34);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMAX$36);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMAX$36);
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
                      return get_store().find_attribute_user(SYNCMAX$36) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCMAX$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCMAX$36);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCMAX$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCMAX$36);
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
                      get_store().remove_attribute(SYNCMAX$36);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCSUM$38);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCSUM$38);
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
                      return get_store().find_attribute_user(SYNCSUM$38) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCSUM$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCSUM$38);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCSUM$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCSUM$38);
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
                      get_store().remove_attribute(SYNCSUM$38);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITAVG$40);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITAVG$40);
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
                      return get_store().find_attribute_user(WAITAVG$40) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITAVG$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITAVG$40);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITAVG$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITAVG$40);
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
                      get_store().remove_attribute(WAITAVG$40);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMIN$42);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMIN$42);
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
                      return get_store().find_attribute_user(WAITMIN$42) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMIN$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITMIN$42);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMIN$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITMIN$42);
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
                      get_store().remove_attribute(WAITMIN$42);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMAX$44);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMAX$44);
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
                      return get_store().find_attribute_user(WAITMAX$44) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITMAX$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITMAX$44);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITMAX$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITMAX$44);
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
                      get_store().remove_attribute(WAITMAX$44);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITSUM$46);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITSUM$46);
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
                      return get_store().find_attribute_user(WAITSUM$46) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITSUM$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITSUM$46);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITSUM$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITSUM$46);
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
                      get_store().remove_attribute(WAITSUM$46);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$48);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$48);
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
                      return get_store().find_attribute_user(FAILURERATE$48) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILURERATE$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILURERATE$48);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILURERATE$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILURERATE$48);
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
                      get_store().remove_attribute(FAILURERATE$48);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONAVG$50);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONAVG$50);
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
                      return get_store().find_attribute_user(SUSPENSIONAVG$50) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONAVG$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONAVG$50);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONAVG$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONAVG$50);
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
                      get_store().remove_attribute(SUSPENSIONAVG$50);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMIN$52);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMIN$52);
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
                      return get_store().find_attribute_user(SUSPENSIONMIN$52) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMIN$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONMIN$52);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMIN$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONMIN$52);
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
                      get_store().remove_attribute(SUSPENSIONMIN$52);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMAX$54);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMAX$54);
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
                      return get_store().find_attribute_user(SUSPENSIONMAX$54) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONMAX$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONMAX$54);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONMAX$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONMAX$54);
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
                      get_store().remove_attribute(SUSPENSIONMAX$54);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONSUM$56);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONSUM$56);
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
                      return get_store().find_attribute_user(SUSPENSIONSUM$56) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONSUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONSUM$56);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONSUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONSUM$56);
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
                      get_store().remove_attribute(SUSPENSIONSUM$56);
                    }
                }
            }
        }
    }
}
