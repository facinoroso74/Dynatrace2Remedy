/*
 * An XML document type.
 * Localname: admdashlet
 * Namespace: 
 * Java type: noNamespace.AdmdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one admdashlet(@) element.
 *
 * This is a complex type.
 */
public class AdmdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AdmdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdmdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMDASHLET$0 = 
        new javax.xml.namespace.QName("", "admdashlet");
    
    
    /**
     * Gets the "admdashlet" element
     */
    public noNamespace.AdmdashletDocument.Admdashlet getAdmdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AdmdashletDocument.Admdashlet target = null;
            target = (noNamespace.AdmdashletDocument.Admdashlet)get_store().find_element_user(ADMDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "admdashlet" element
     */
    public void setAdmdashlet(noNamespace.AdmdashletDocument.Admdashlet admdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AdmdashletDocument.Admdashlet target = null;
            target = (noNamespace.AdmdashletDocument.Admdashlet)get_store().find_element_user(ADMDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.AdmdashletDocument.Admdashlet)get_store().add_element_user(ADMDASHLET$0);
            }
            target.set(admdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "admdashlet" element
     */
    public noNamespace.AdmdashletDocument.Admdashlet addNewAdmdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AdmdashletDocument.Admdashlet target = null;
            target = (noNamespace.AdmdashletDocument.Admdashlet)get_store().add_element_user(ADMDASHLET$0);
            return target;
        }
    }
    /**
     * An XML admdashlet(@).
     *
     * This is a complex type.
     */
    public static class AdmdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AdmdashletDocument.Admdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public AdmdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName ADM$4 = 
            new javax.xml.namespace.QName("", "adm");
        private static final javax.xml.namespace.QName ADMLINKS$6 = 
            new javax.xml.namespace.QName("", "adm_links");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$10 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName DISPLAYSOURCE$12 = 
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
         * Gets the "adm" element
         */
        public noNamespace.AdmdashletDocument.Admdashlet.Adm getAdm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet.Adm target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet.Adm)get_store().find_element_user(ADM$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "adm" element
         */
        public boolean isSetAdm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADM$4) != 0;
            }
        }
        
        /**
         * Sets the "adm" element
         */
        public void setAdm(noNamespace.AdmdashletDocument.Admdashlet.Adm adm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet.Adm target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet.Adm)get_store().find_element_user(ADM$4, 0);
                if (target == null)
                {
                    target = (noNamespace.AdmdashletDocument.Admdashlet.Adm)get_store().add_element_user(ADM$4);
                }
                target.set(adm);
            }
        }
        
        /**
         * Appends and returns a new empty "adm" element
         */
        public noNamespace.AdmdashletDocument.Admdashlet.Adm addNewAdm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet.Adm target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet.Adm)get_store().add_element_user(ADM$4);
                return target;
            }
        }
        
        /**
         * Unsets the "adm" element
         */
        public void unsetAdm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADM$4, 0);
            }
        }
        
        /**
         * Gets the "adm_links" element
         */
        public noNamespace.AdmdashletDocument.Admdashlet.AdmLinks getAdmLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet.AdmLinks target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks)get_store().find_element_user(ADMLINKS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "adm_links" element
         */
        public boolean isSetAdmLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMLINKS$6) != 0;
            }
        }
        
        /**
         * Sets the "adm_links" element
         */
        public void setAdmLinks(noNamespace.AdmdashletDocument.Admdashlet.AdmLinks admLinks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet.AdmLinks target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks)get_store().find_element_user(ADMLINKS$6, 0);
                if (target == null)
                {
                    target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks)get_store().add_element_user(ADMLINKS$6);
                }
                target.set(admLinks);
            }
        }
        
        /**
         * Appends and returns a new empty "adm_links" element
         */
        public noNamespace.AdmdashletDocument.Admdashlet.AdmLinks addNewAdmLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet.AdmLinks target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks)get_store().add_element_user(ADMLINKS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "adm_links" element
         */
        public void unsetAdmLinks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMLINKS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
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
                return get_store().find_attribute_user(DESCRIPTION$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$10);
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
                get_store().remove_attribute(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYSOURCE$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYSOURCE$12);
                }
                target.set(displaysource);
            }
        }
        /**
         * An XML adm(@).
         *
         * This is a complex type.
         */
        public static class AdmImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AdmdashletDocument.Admdashlet.Adm
        {
            private static final long serialVersionUID = 1L;
            
            public AdmImpl(org.apache.xmlbeans.SchemaType sType)
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
            public noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent[] getAgentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(AGENT$0, targetList);
                    noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent[] result = new noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "agent" element
             */
            public noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent getAgentArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent)get_store().find_element_user(AGENT$0, i);
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
            public void setAgentArray(noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent[] agentArray)
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
            public void setAgentArray(int i, noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent agent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent)get_store().find_element_user(AGENT$0, i);
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
            public noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent insertNewAgent(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent)get_store().insert_element_user(AGENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "agent" element
             */
            public noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent addNewAgent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent)get_store().add_element_user(AGENT$0);
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
            public static class AgentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AdmdashletDocument.Admdashlet.Adm.Agent
            {
                private static final long serialVersionUID = 1L;
                
                public AgentImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName HOST$2 = 
                    new javax.xml.namespace.QName("", "host");
                private static final javax.xml.namespace.QName GROUP$4 = 
                    new javax.xml.namespace.QName("", "group");
                private static final javax.xml.namespace.QName TECHNOLOGY$6 = 
                    new javax.xml.namespace.QName("", "technology");
                private static final javax.xml.namespace.QName RESPONSEAVG$8 = 
                    new javax.xml.namespace.QName("", "response_avg");
                private static final javax.xml.namespace.QName RESPONSEMIN$10 = 
                    new javax.xml.namespace.QName("", "response_min");
                private static final javax.xml.namespace.QName RESPONSEMAX$12 = 
                    new javax.xml.namespace.QName("", "response_max");
                private static final javax.xml.namespace.QName RESPONSESUM$14 = 
                    new javax.xml.namespace.QName("", "response_sum");
                private static final javax.xml.namespace.QName EXECAVG$16 = 
                    new javax.xml.namespace.QName("", "exec_avg");
                private static final javax.xml.namespace.QName EXECMIN$18 = 
                    new javax.xml.namespace.QName("", "exec_min");
                private static final javax.xml.namespace.QName EXECMAX$20 = 
                    new javax.xml.namespace.QName("", "exec_max");
                private static final javax.xml.namespace.QName EXECSUM$22 = 
                    new javax.xml.namespace.QName("", "exec_sum");
                private static final javax.xml.namespace.QName EXECCPUAVG$24 = 
                    new javax.xml.namespace.QName("", "exec_cpu_avg");
                private static final javax.xml.namespace.QName EXECCPUMIN$26 = 
                    new javax.xml.namespace.QName("", "exec_cpu_min");
                private static final javax.xml.namespace.QName EXECCPUMAX$28 = 
                    new javax.xml.namespace.QName("", "exec_cpu_max");
                private static final javax.xml.namespace.QName EXECCPUSUM$30 = 
                    new javax.xml.namespace.QName("", "exec_cpu_sum");
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
                private static final javax.xml.namespace.QName DBAVG$48 = 
                    new javax.xml.namespace.QName("", "db_avg");
                private static final javax.xml.namespace.QName DBMIN$50 = 
                    new javax.xml.namespace.QName("", "db_min");
                private static final javax.xml.namespace.QName DBMAX$52 = 
                    new javax.xml.namespace.QName("", "db_max");
                private static final javax.xml.namespace.QName DBSUM$54 = 
                    new javax.xml.namespace.QName("", "db_sum");
                private static final javax.xml.namespace.QName ACQAVG$56 = 
                    new javax.xml.namespace.QName("", "acq_avg");
                private static final javax.xml.namespace.QName ACQMIN$58 = 
                    new javax.xml.namespace.QName("", "acq_min");
                private static final javax.xml.namespace.QName ACQMAX$60 = 
                    new javax.xml.namespace.QName("", "acq_max");
                private static final javax.xml.namespace.QName ACQSUM$62 = 
                    new javax.xml.namespace.QName("", "acq_sum");
                
                
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
                 * Gets the "host" attribute
                 */
                public java.lang.String getHost()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$2);
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
                      return get_store().find_attribute_user(HOST$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOST$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOST$2);
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
                      get_store().remove_attribute(HOST$2);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$4);
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
                      return get_store().find_attribute_user(GROUP$4) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$4);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$4);
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
                      get_store().remove_attribute(GROUP$4);
                    }
                }
                
                /**
                 * Gets the "technology" attribute
                 */
                public java.lang.String getTechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGY$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGY$6);
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
                      return get_store().find_attribute_user(TECHNOLOGY$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHNOLOGY$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TECHNOLOGY$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHNOLOGY$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TECHNOLOGY$6);
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
                      get_store().remove_attribute(TECHNOLOGY$6);
                    }
                }
                
                /**
                 * Gets the "response_avg" attribute
                 */
                public double getResponseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEAVG$8);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSEAVG$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_avg" attribute
                 */
                public boolean isSetResponseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSEAVG$8) != null;
                    }
                }
                
                /**
                 * Sets the "response_avg" attribute
                 */
                public void setResponseAvg(double responseAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEAVG$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSEAVG$8);
                      }
                      target.setDoubleValue(responseAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_avg" attribute
                 */
                public void xsetResponseAvg(org.apache.xmlbeans.XmlDouble responseAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSEAVG$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSEAVG$8);
                      }
                      target.set(responseAvg);
                    }
                }
                
                /**
                 * Unsets the "response_avg" attribute
                 */
                public void unsetResponseAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSEAVG$8);
                    }
                }
                
                /**
                 * Gets the "response_min" attribute
                 */
                public double getResponseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEMIN$10);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSEMIN$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_min" attribute
                 */
                public boolean isSetResponseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSEMIN$10) != null;
                    }
                }
                
                /**
                 * Sets the "response_min" attribute
                 */
                public void setResponseMin(double responseMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEMIN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSEMIN$10);
                      }
                      target.setDoubleValue(responseMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_min" attribute
                 */
                public void xsetResponseMin(org.apache.xmlbeans.XmlDouble responseMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSEMIN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSEMIN$10);
                      }
                      target.set(responseMin);
                    }
                }
                
                /**
                 * Unsets the "response_min" attribute
                 */
                public void unsetResponseMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSEMIN$10);
                    }
                }
                
                /**
                 * Gets the "response_max" attribute
                 */
                public double getResponseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEMAX$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSEMAX$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_max" attribute
                 */
                public boolean isSetResponseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSEMAX$12) != null;
                    }
                }
                
                /**
                 * Sets the "response_max" attribute
                 */
                public void setResponseMax(double responseMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSEMAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSEMAX$12);
                      }
                      target.setDoubleValue(responseMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_max" attribute
                 */
                public void xsetResponseMax(org.apache.xmlbeans.XmlDouble responseMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSEMAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSEMAX$12);
                      }
                      target.set(responseMax);
                    }
                }
                
                /**
                 * Unsets the "response_max" attribute
                 */
                public void unsetResponseMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSEMAX$12);
                    }
                }
                
                /**
                 * Gets the "response_sum" attribute
                 */
                public double getResponseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESUM$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "response_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetResponseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSESUM$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "response_sum" attribute
                 */
                public boolean isSetResponseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESPONSESUM$14) != null;
                    }
                }
                
                /**
                 * Sets the "response_sum" attribute
                 */
                public void setResponseSum(double responseSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSESUM$14);
                      }
                      target.setDoubleValue(responseSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "response_sum" attribute
                 */
                public void xsetResponseSum(org.apache.xmlbeans.XmlDouble responseSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSESUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSESUM$14);
                      }
                      target.set(responseSum);
                    }
                }
                
                /**
                 * Unsets the "response_sum" attribute
                 */
                public void unsetResponseSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESPONSESUM$14);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$16);
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
                      return get_store().find_attribute_user(EXECAVG$16) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECAVG$16);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECAVG$16);
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
                      get_store().remove_attribute(EXECAVG$16);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$18);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$18);
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
                      return get_store().find_attribute_user(EXECMIN$18) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMIN$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMIN$18);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMIN$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMIN$18);
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
                      get_store().remove_attribute(EXECMIN$18);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$20);
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
                      return get_store().find_attribute_user(EXECMAX$20) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECMAX$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECMAX$20);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECMAX$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECMAX$20);
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
                      get_store().remove_attribute(EXECMAX$20);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$22);
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
                      return get_store().find_attribute_user(EXECSUM$22) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECSUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECSUM$22);
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
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECSUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECSUM$22);
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
                      get_store().remove_attribute(EXECSUM$22);
                    }
                }
                
                /**
                 * Gets the "exec_cpu_avg" attribute
                 */
                public double getExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUAVG$24);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_cpu_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUAVG$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_cpu_avg" attribute
                 */
                public boolean isSetExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECCPUAVG$24) != null;
                    }
                }
                
                /**
                 * Sets the "exec_cpu_avg" attribute
                 */
                public void setExecCpuAvg(double execCpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECCPUAVG$24);
                      }
                      target.setDoubleValue(execCpuAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_cpu_avg" attribute
                 */
                public void xsetExecCpuAvg(org.apache.xmlbeans.XmlDouble execCpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECCPUAVG$24);
                      }
                      target.set(execCpuAvg);
                    }
                }
                
                /**
                 * Unsets the "exec_cpu_avg" attribute
                 */
                public void unsetExecCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECCPUAVG$24);
                    }
                }
                
                /**
                 * Gets the "exec_cpu_min" attribute
                 */
                public double getExecCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUMIN$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_cpu_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUMIN$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_cpu_min" attribute
                 */
                public boolean isSetExecCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECCPUMIN$26) != null;
                    }
                }
                
                /**
                 * Sets the "exec_cpu_min" attribute
                 */
                public void setExecCpuMin(double execCpuMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUMIN$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECCPUMIN$26);
                      }
                      target.setDoubleValue(execCpuMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_cpu_min" attribute
                 */
                public void xsetExecCpuMin(org.apache.xmlbeans.XmlDouble execCpuMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUMIN$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECCPUMIN$26);
                      }
                      target.set(execCpuMin);
                    }
                }
                
                /**
                 * Unsets the "exec_cpu_min" attribute
                 */
                public void unsetExecCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECCPUMIN$26);
                    }
                }
                
                /**
                 * Gets the "exec_cpu_max" attribute
                 */
                public double getExecCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUMAX$28);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_cpu_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUMAX$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_cpu_max" attribute
                 */
                public boolean isSetExecCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECCPUMAX$28) != null;
                    }
                }
                
                /**
                 * Sets the "exec_cpu_max" attribute
                 */
                public void setExecCpuMax(double execCpuMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUMAX$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECCPUMAX$28);
                      }
                      target.setDoubleValue(execCpuMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_cpu_max" attribute
                 */
                public void xsetExecCpuMax(org.apache.xmlbeans.XmlDouble execCpuMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUMAX$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECCPUMAX$28);
                      }
                      target.set(execCpuMax);
                    }
                }
                
                /**
                 * Unsets the "exec_cpu_max" attribute
                 */
                public void unsetExecCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECCPUMAX$28);
                    }
                }
                
                /**
                 * Gets the "exec_cpu_sum" attribute
                 */
                public double getExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUSUM$30);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "exec_cpu_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUSUM$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "exec_cpu_sum" attribute
                 */
                public boolean isSetExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(EXECCPUSUM$30) != null;
                    }
                }
                
                /**
                 * Sets the "exec_cpu_sum" attribute
                 */
                public void setExecCpuSum(double execCpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECCPUSUM$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECCPUSUM$30);
                      }
                      target.setDoubleValue(execCpuSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "exec_cpu_sum" attribute
                 */
                public void xsetExecCpuSum(org.apache.xmlbeans.XmlDouble execCpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECCPUSUM$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECCPUSUM$30);
                      }
                      target.set(execCpuSum);
                    }
                }
                
                /**
                 * Unsets the "exec_cpu_sum" attribute
                 */
                public void unsetExecCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(EXECCPUSUM$30);
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
                 * Gets the "db_avg" attribute
                 */
                public double getDbAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBAVG$48);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "db_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDbAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBAVG$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "db_avg" attribute
                 */
                public boolean isSetDbAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBAVG$48) != null;
                    }
                }
                
                /**
                 * Sets the "db_avg" attribute
                 */
                public void setDbAvg(double dbAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBAVG$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBAVG$48);
                      }
                      target.setDoubleValue(dbAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "db_avg" attribute
                 */
                public void xsetDbAvg(org.apache.xmlbeans.XmlDouble dbAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBAVG$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DBAVG$48);
                      }
                      target.set(dbAvg);
                    }
                }
                
                /**
                 * Unsets the "db_avg" attribute
                 */
                public void unsetDbAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBAVG$48);
                    }
                }
                
                /**
                 * Gets the "db_min" attribute
                 */
                public double getDbMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBMIN$50);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "db_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDbMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBMIN$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "db_min" attribute
                 */
                public boolean isSetDbMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBMIN$50) != null;
                    }
                }
                
                /**
                 * Sets the "db_min" attribute
                 */
                public void setDbMin(double dbMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBMIN$50);
                      }
                      target.setDoubleValue(dbMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "db_min" attribute
                 */
                public void xsetDbMin(org.apache.xmlbeans.XmlDouble dbMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBMIN$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DBMIN$50);
                      }
                      target.set(dbMin);
                    }
                }
                
                /**
                 * Unsets the "db_min" attribute
                 */
                public void unsetDbMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBMIN$50);
                    }
                }
                
                /**
                 * Gets the "db_max" attribute
                 */
                public double getDbMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBMAX$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "db_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDbMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBMAX$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "db_max" attribute
                 */
                public boolean isSetDbMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBMAX$52) != null;
                    }
                }
                
                /**
                 * Sets the "db_max" attribute
                 */
                public void setDbMax(double dbMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBMAX$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBMAX$52);
                      }
                      target.setDoubleValue(dbMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "db_max" attribute
                 */
                public void xsetDbMax(org.apache.xmlbeans.XmlDouble dbMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBMAX$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DBMAX$52);
                      }
                      target.set(dbMax);
                    }
                }
                
                /**
                 * Unsets the "db_max" attribute
                 */
                public void unsetDbMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBMAX$52);
                    }
                }
                
                /**
                 * Gets the "db_sum" attribute
                 */
                public double getDbSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSUM$54);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "db_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetDbSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBSUM$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "db_sum" attribute
                 */
                public boolean isSetDbSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DBSUM$54) != null;
                    }
                }
                
                /**
                 * Sets the "db_sum" attribute
                 */
                public void setDbSum(double dbSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DBSUM$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DBSUM$54);
                      }
                      target.setDoubleValue(dbSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "db_sum" attribute
                 */
                public void xsetDbSum(org.apache.xmlbeans.XmlDouble dbSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DBSUM$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DBSUM$54);
                      }
                      target.set(dbSum);
                    }
                }
                
                /**
                 * Unsets the "db_sum" attribute
                 */
                public void unsetDbSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DBSUM$54);
                    }
                }
                
                /**
                 * Gets the "acq_avg" attribute
                 */
                public double getAcqAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQAVG$56);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "acq_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetAcqAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQAVG$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "acq_avg" attribute
                 */
                public boolean isSetAcqAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ACQAVG$56) != null;
                    }
                }
                
                /**
                 * Sets the "acq_avg" attribute
                 */
                public void setAcqAvg(double acqAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQAVG$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACQAVG$56);
                      }
                      target.setDoubleValue(acqAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "acq_avg" attribute
                 */
                public void xsetAcqAvg(org.apache.xmlbeans.XmlDouble acqAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQAVG$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ACQAVG$56);
                      }
                      target.set(acqAvg);
                    }
                }
                
                /**
                 * Unsets the "acq_avg" attribute
                 */
                public void unsetAcqAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ACQAVG$56);
                    }
                }
                
                /**
                 * Gets the "acq_min" attribute
                 */
                public double getAcqMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQMIN$58);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "acq_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetAcqMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQMIN$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "acq_min" attribute
                 */
                public boolean isSetAcqMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ACQMIN$58) != null;
                    }
                }
                
                /**
                 * Sets the "acq_min" attribute
                 */
                public void setAcqMin(double acqMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQMIN$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACQMIN$58);
                      }
                      target.setDoubleValue(acqMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "acq_min" attribute
                 */
                public void xsetAcqMin(org.apache.xmlbeans.XmlDouble acqMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQMIN$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ACQMIN$58);
                      }
                      target.set(acqMin);
                    }
                }
                
                /**
                 * Unsets the "acq_min" attribute
                 */
                public void unsetAcqMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ACQMIN$58);
                    }
                }
                
                /**
                 * Gets the "acq_max" attribute
                 */
                public double getAcqMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQMAX$60);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "acq_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetAcqMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQMAX$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "acq_max" attribute
                 */
                public boolean isSetAcqMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ACQMAX$60) != null;
                    }
                }
                
                /**
                 * Sets the "acq_max" attribute
                 */
                public void setAcqMax(double acqMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQMAX$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACQMAX$60);
                      }
                      target.setDoubleValue(acqMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "acq_max" attribute
                 */
                public void xsetAcqMax(org.apache.xmlbeans.XmlDouble acqMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQMAX$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ACQMAX$60);
                      }
                      target.set(acqMax);
                    }
                }
                
                /**
                 * Unsets the "acq_max" attribute
                 */
                public void unsetAcqMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ACQMAX$60);
                    }
                }
                
                /**
                 * Gets the "acq_sum" attribute
                 */
                public double getAcqSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQSUM$62);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "acq_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetAcqSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQSUM$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "acq_sum" attribute
                 */
                public boolean isSetAcqSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ACQSUM$62) != null;
                    }
                }
                
                /**
                 * Sets the "acq_sum" attribute
                 */
                public void setAcqSum(double acqSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACQSUM$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACQSUM$62);
                      }
                      target.setDoubleValue(acqSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "acq_sum" attribute
                 */
                public void xsetAcqSum(org.apache.xmlbeans.XmlDouble acqSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ACQSUM$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ACQSUM$62);
                      }
                      target.set(acqSum);
                    }
                }
                
                /**
                 * Unsets the "acq_sum" attribute
                 */
                public void unsetAcqSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ACQSUM$62);
                    }
                }
            }
        }
        /**
         * An XML adm_links(@).
         *
         * This is a complex type.
         */
        public static class AdmLinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AdmdashletDocument.Admdashlet.AdmLinks
        {
            private static final long serialVersionUID = 1L;
            
            public AdmLinksImpl(org.apache.xmlbeans.SchemaType sType)
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
            public noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent[] getAgentArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(AGENT$0, targetList);
                    noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent[] result = new noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "agent" element
             */
            public noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent getAgentArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent)get_store().find_element_user(AGENT$0, i);
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
            public void setAgentArray(noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent[] agentArray)
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
            public void setAgentArray(int i, noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent agent)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent)get_store().find_element_user(AGENT$0, i);
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
            public noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent insertNewAgent(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent)get_store().insert_element_user(AGENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "agent" element
             */
            public noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent addNewAgent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent target = null;
                    target = (noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent)get_store().add_element_user(AGENT$0);
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
            public static class AgentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AdmdashletDocument.Admdashlet.AdmLinks.Agent
            {
                private static final long serialVersionUID = 1L;
                
                public AgentImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName FROM$0 = 
                    new javax.xml.namespace.QName("", "from");
                private static final javax.xml.namespace.QName GROUP$2 = 
                    new javax.xml.namespace.QName("", "group");
                private static final javax.xml.namespace.QName TO$4 = 
                    new javax.xml.namespace.QName("", "to");
                private static final javax.xml.namespace.QName REMOTINGCOUNT$6 = 
                    new javax.xml.namespace.QName("", "remoting_count");
                
                
                /**
                 * Gets the "from" attribute
                 */
                public java.lang.String getFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "from" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "from" attribute
                 */
                public boolean isSetFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(FROM$0) != null;
                    }
                }
                
                /**
                 * Sets the "from" attribute
                 */
                public void setFrom(java.lang.String from)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROM$0);
                      }
                      target.setStringValue(from);
                    }
                }
                
                /**
                 * Sets (as xml) the "from" attribute
                 */
                public void xsetFrom(org.apache.xmlbeans.XmlString from)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROM$0);
                      }
                      target.set(from);
                    }
                }
                
                /**
                 * Unsets the "from" attribute
                 */
                public void unsetFrom()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(FROM$0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$2);
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
                      return get_store().find_attribute_user(GROUP$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$2);
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
                      get_store().remove_attribute(GROUP$2);
                    }
                }
                
                /**
                 * Gets the "to" attribute
                 */
                public java.lang.String getTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "to" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "to" attribute
                 */
                public boolean isSetTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TO$4) != null;
                    }
                }
                
                /**
                 * Sets the "to" attribute
                 */
                public void setTo(java.lang.String to)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$4);
                      }
                      target.setStringValue(to);
                    }
                }
                
                /**
                 * Sets (as xml) the "to" attribute
                 */
                public void xsetTo(org.apache.xmlbeans.XmlString to)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$4);
                      }
                      target.set(to);
                    }
                }
                
                /**
                 * Unsets the "to" attribute
                 */
                public void unsetTo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TO$4);
                    }
                }
                
                /**
                 * Gets the "remoting_count" attribute
                 */
                public java.math.BigInteger getRemotingCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTINGCOUNT$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "remoting_count" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRemotingCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REMOTINGCOUNT$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "remoting_count" attribute
                 */
                public boolean isSetRemotingCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(REMOTINGCOUNT$6) != null;
                    }
                }
                
                /**
                 * Sets the "remoting_count" attribute
                 */
                public void setRemotingCount(java.math.BigInteger remotingCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTINGCOUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOTINGCOUNT$6);
                      }
                      target.setBigIntegerValue(remotingCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "remoting_count" attribute
                 */
                public void xsetRemotingCount(org.apache.xmlbeans.XmlInteger remotingCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REMOTINGCOUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REMOTINGCOUNT$6);
                      }
                      target.set(remotingCount);
                    }
                }
                
                /**
                 * Unsets the "remoting_count" attribute
                 */
                public void unsetRemotingCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(REMOTINGCOUNT$6);
                    }
                }
            }
        }
    }
}
