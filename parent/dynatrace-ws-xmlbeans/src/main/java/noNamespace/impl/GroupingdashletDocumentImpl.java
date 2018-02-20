/*
 * An XML document type.
 * Localname: groupingdashlet
 * Namespace: 
 * Java type: noNamespace.GroupingdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one groupingdashlet(@) element.
 *
 * This is a complex type.
 */
public class GroupingdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GroupingdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupingdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPINGDASHLET$0 = 
        new javax.xml.namespace.QName("", "groupingdashlet");
    
    
    /**
     * Gets the "groupingdashlet" element
     */
    public noNamespace.GroupingdashletDocument.Groupingdashlet getGroupingdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GroupingdashletDocument.Groupingdashlet target = null;
            target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().find_element_user(GROUPINGDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "groupingdashlet" element
     */
    public void setGroupingdashlet(noNamespace.GroupingdashletDocument.Groupingdashlet groupingdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GroupingdashletDocument.Groupingdashlet target = null;
            target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().find_element_user(GROUPINGDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().add_element_user(GROUPINGDASHLET$0);
            }
            target.set(groupingdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "groupingdashlet" element
     */
    public noNamespace.GroupingdashletDocument.Groupingdashlet addNewGroupingdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GroupingdashletDocument.Groupingdashlet target = null;
            target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().add_element_user(GROUPINGDASHLET$0);
            return target;
        }
    }
    /**
     * An XML groupingdashlet(@).
     *
     * This is a complex type.
     */
    public static class GroupingdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GroupingdashletDocument.Groupingdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public GroupingdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADMDASHLET$0 = 
            new javax.xml.namespace.QName("", "admdashlet");
        private static final javax.xml.namespace.QName AGENTBREAKDOWNDASHLET$2 = 
            new javax.xml.namespace.QName("", "agentbreakdowndashlet");
        private static final javax.xml.namespace.QName AGENTSOVERVIEWDASHLET$4 = 
            new javax.xml.namespace.QName("", "agentsoverviewdashlet");
        private static final javax.xml.namespace.QName APIBREAKDOWNDASHLET$6 = 
            new javax.xml.namespace.QName("", "apibreakdowndashlet");
        private static final javax.xml.namespace.QName BASELINECHART$8 = 
            new javax.xml.namespace.QName("", "baselinechart");
        private static final javax.xml.namespace.QName BTHISTORICALCOMPARISONDASHLET$10 = 
            new javax.xml.namespace.QName("", "bthistoricalcomparisondashlet");
        private static final javax.xml.namespace.QName BUSINESSTRANSACTIONSDASHLET$12 = 
            new javax.xml.namespace.QName("", "businesstransactionsdashlet");
        private static final javax.xml.namespace.QName CHARTDASHLET$14 = 
            new javax.xml.namespace.QName("", "chartdashlet");
        private static final javax.xml.namespace.QName CLIENTERRORSDASHLET$16 = 
            new javax.xml.namespace.QName("", "clienterrorsdashlet");
        private static final javax.xml.namespace.QName COMPONENTSDASHLET$18 = 
            new javax.xml.namespace.QName("", "componentsdashlet");
        private static final javax.xml.namespace.QName DATABASEDASHLET$20 = 
            new javax.xml.namespace.QName("", "databasedashlet");
        private static final javax.xml.namespace.QName DATABASESTATEMENTSDASHLET$22 = 
            new javax.xml.namespace.QName("", "databasestatementsdashlet");
        private static final javax.xml.namespace.QName DUALAXISCHARTDASHLET$24 = 
            new javax.xml.namespace.QName("", "dualaxischartdashlet");
        private static final javax.xml.namespace.QName DYNAMICMEASUREMATRIXDASHLET$26 = 
            new javax.xml.namespace.QName("", "dynamicmeasurematrixdashlet");
        private static final javax.xml.namespace.QName ENDUSERPUREPATHSDASHLET$28 = 
            new javax.xml.namespace.QName("", "enduserpurepathsdashlet");
        private static final javax.xml.namespace.QName ENTRYPOINTSDASHLET$30 = 
            new javax.xml.namespace.QName("", "entrypointsdashlet");
        private static final javax.xml.namespace.QName ERRORDETECTIONDASHLET$32 = 
            new javax.xml.namespace.QName("", "errordetectiondashlet");
        private static final javax.xml.namespace.QName EXCEPTIONSDASHLET$34 = 
            new javax.xml.namespace.QName("", "exceptionsdashlet");
        private static final javax.xml.namespace.QName FUNCTIONALHEALTHDASHLET$36 = 
            new javax.xml.namespace.QName("", "functionalhealthdashlet");
        private static final javax.xml.namespace.QName GROUPINGDASHLET$38 = 
            new javax.xml.namespace.QName("", "groupingdashlet");
        private static final javax.xml.namespace.QName GUICONTROLSDASHLET$40 = 
            new javax.xml.namespace.QName("", "guicontrolsdashlet");
        private static final javax.xml.namespace.QName HOSTDASHLET$42 = 
            new javax.xml.namespace.QName("", "hostdashlet");
        private static final javax.xml.namespace.QName INCIDENTCHARTDASHLET$44 = 
            new javax.xml.namespace.QName("", "incidentchartdashlet");
        private static final javax.xml.namespace.QName INCIDENTSOVERVIEWDASHLET$46 = 
            new javax.xml.namespace.QName("", "incidentsoverviewdashlet");
        private static final javax.xml.namespace.QName INFRASTRUCTUREOVERVIEW$48 = 
            new javax.xml.namespace.QName("", "infrastructureoverview");
        private static final javax.xml.namespace.QName LAYERBREAKDOWNDASHLET$50 = 
            new javax.xml.namespace.QName("", "layerbreakdowndashlet");
        private static final javax.xml.namespace.QName LICENSEOVERVIEW$52 = 
            new javax.xml.namespace.QName("", "licenseoverview");
        private static final javax.xml.namespace.QName LOGGINGDASHLET$54 = 
            new javax.xml.namespace.QName("", "loggingdashlet");
        private static final javax.xml.namespace.QName MEMORYALLOCATIONSDASHLET$56 = 
            new javax.xml.namespace.QName("", "memoryallocationsdashlet");
        private static final javax.xml.namespace.QName MESSAGINGDASHLET$58 = 
            new javax.xml.namespace.QName("", "messagingdashlet");
        private static final javax.xml.namespace.QName METHODHOTSPOTSDASHLET$60 = 
            new javax.xml.namespace.QName("", "methodhotspotsdashlet");
        private static final javax.xml.namespace.QName METHODSDASHLET$62 = 
            new javax.xml.namespace.QName("", "methodsdashlet");
        private static final javax.xml.namespace.QName MOBILEWORKLOADDASHLET$64 = 
            new javax.xml.namespace.QName("", "mobileworkloaddashlet");
        private static final javax.xml.namespace.QName NAMINGSERVICESDASHLET$66 = 
            new javax.xml.namespace.QName("", "namingservicesdashlet");
        private static final javax.xml.namespace.QName PAGEACTIONSHEALTHDASHLET$68 = 
            new javax.xml.namespace.QName("", "pageactionshealthdashlet");
        private static final javax.xml.namespace.QName PROCESSDASHLET$70 = 
            new javax.xml.namespace.QName("", "processdashlet");
        private static final javax.xml.namespace.QName PUREPATHSDASHLET$72 = 
            new javax.xml.namespace.QName("", "purepathsdashlet");
        private static final javax.xml.namespace.QName REMOTINGDASHLET$74 = 
            new javax.xml.namespace.QName("", "remotingdashlet");
        private static final javax.xml.namespace.QName RUNTIMESUSPENSIONSDASHLET$76 = 
            new javax.xml.namespace.QName("", "runtimesuspensionsdashlet");
        private static final javax.xml.namespace.QName SESSIONBROWSERDASHLET$78 = 
            new javax.xml.namespace.QName("", "sessionbrowserdashlet");
        private static final javax.xml.namespace.QName STATUSOVERVIEWDASHLET$80 = 
            new javax.xml.namespace.QName("", "statusoverviewdashlet");
        private static final javax.xml.namespace.QName TAGGEDWEBREQUESTSDASHLET$82 = 
            new javax.xml.namespace.QName("", "taggedwebrequestsdashlet");
        private static final javax.xml.namespace.QName TASKSMONITORSDASHLET$84 = 
            new javax.xml.namespace.QName("", "tasksmonitorsdashlet");
        private static final javax.xml.namespace.QName TESTAUTOMATION$86 = 
            new javax.xml.namespace.QName("", "testautomation");
        private static final javax.xml.namespace.QName TEXTANDMEASURE$88 = 
            new javax.xml.namespace.QName("", "textandmeasure");
        private static final javax.xml.namespace.QName TEXTDASHLET$90 = 
            new javax.xml.namespace.QName("", "textdashlet");
        private static final javax.xml.namespace.QName USERACTIONSDASHLET$92 = 
            new javax.xml.namespace.QName("", "useractionsdashlet");
        private static final javax.xml.namespace.QName VISITSDASHLET$94 = 
            new javax.xml.namespace.QName("", "visitsdashlet");
        private static final javax.xml.namespace.QName WEBREQUESTSDASHLET$96 = 
            new javax.xml.namespace.QName("", "webrequestsdashlet");
        private static final javax.xml.namespace.QName WEBSERVICESDASHLET$98 = 
            new javax.xml.namespace.QName("", "webservicesdashlet");
        private static final javax.xml.namespace.QName WORLDMAPDASHLET$100 = 
            new javax.xml.namespace.QName("", "worldmapdashlet");
        private static final javax.xml.namespace.QName NAME$102 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$104 = 
            new javax.xml.namespace.QName("", "description");
        
        
        /**
         * Gets array of all "admdashlet" elements
         */
        public noNamespace.AdmdashletDocument.Admdashlet[] getAdmdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADMDASHLET$0, targetList);
                noNamespace.AdmdashletDocument.Admdashlet[] result = new noNamespace.AdmdashletDocument.Admdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "admdashlet" element
         */
        public noNamespace.AdmdashletDocument.Admdashlet getAdmdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet)get_store().find_element_user(ADMDASHLET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "admdashlet" element
         */
        public int sizeOfAdmdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMDASHLET$0);
            }
        }
        
        /**
         * Sets array of all "admdashlet" element
         */
        public void setAdmdashletArray(noNamespace.AdmdashletDocument.Admdashlet[] admdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(admdashletArray, ADMDASHLET$0);
            }
        }
        
        /**
         * Sets ith "admdashlet" element
         */
        public void setAdmdashletArray(int i, noNamespace.AdmdashletDocument.Admdashlet admdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet)get_store().find_element_user(ADMDASHLET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(admdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "admdashlet" element
         */
        public noNamespace.AdmdashletDocument.Admdashlet insertNewAdmdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AdmdashletDocument.Admdashlet target = null;
                target = (noNamespace.AdmdashletDocument.Admdashlet)get_store().insert_element_user(ADMDASHLET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "admdashlet" element
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
         * Removes the ith "admdashlet" element
         */
        public void removeAdmdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMDASHLET$0, i);
            }
        }
        
        /**
         * Gets array of all "agentbreakdowndashlet" elements
         */
        public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet[] getAgentbreakdowndashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AGENTBREAKDOWNDASHLET$2, targetList);
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet[] result = new noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "agentbreakdowndashlet" element
         */
        public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet getAgentbreakdowndashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet target = null;
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().find_element_user(AGENTBREAKDOWNDASHLET$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "agentbreakdowndashlet" element
         */
        public int sizeOfAgentbreakdowndashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AGENTBREAKDOWNDASHLET$2);
            }
        }
        
        /**
         * Sets array of all "agentbreakdowndashlet" element
         */
        public void setAgentbreakdowndashletArray(noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet[] agentbreakdowndashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(agentbreakdowndashletArray, AGENTBREAKDOWNDASHLET$2);
            }
        }
        
        /**
         * Sets ith "agentbreakdowndashlet" element
         */
        public void setAgentbreakdowndashletArray(int i, noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet agentbreakdowndashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet target = null;
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().find_element_user(AGENTBREAKDOWNDASHLET$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(agentbreakdowndashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "agentbreakdowndashlet" element
         */
        public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet insertNewAgentbreakdowndashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet target = null;
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().insert_element_user(AGENTBREAKDOWNDASHLET$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "agentbreakdowndashlet" element
         */
        public noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet addNewAgentbreakdowndashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet target = null;
                target = (noNamespace.AgentbreakdowndashletDocument.Agentbreakdowndashlet)get_store().add_element_user(AGENTBREAKDOWNDASHLET$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "agentbreakdowndashlet" element
         */
        public void removeAgentbreakdowndashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AGENTBREAKDOWNDASHLET$2, i);
            }
        }
        
        /**
         * Gets array of all "agentsoverviewdashlet" elements
         */
        public noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet[] getAgentsoverviewdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AGENTSOVERVIEWDASHLET$4, targetList);
                noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet[] result = new noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "agentsoverviewdashlet" element
         */
        public noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet getAgentsoverviewdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet target = null;
                target = (noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet)get_store().find_element_user(AGENTSOVERVIEWDASHLET$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "agentsoverviewdashlet" element
         */
        public int sizeOfAgentsoverviewdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AGENTSOVERVIEWDASHLET$4);
            }
        }
        
        /**
         * Sets array of all "agentsoverviewdashlet" element
         */
        public void setAgentsoverviewdashletArray(noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet[] agentsoverviewdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(agentsoverviewdashletArray, AGENTSOVERVIEWDASHLET$4);
            }
        }
        
        /**
         * Sets ith "agentsoverviewdashlet" element
         */
        public void setAgentsoverviewdashletArray(int i, noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet agentsoverviewdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet target = null;
                target = (noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet)get_store().find_element_user(AGENTSOVERVIEWDASHLET$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(agentsoverviewdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "agentsoverviewdashlet" element
         */
        public noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet insertNewAgentsoverviewdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet target = null;
                target = (noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet)get_store().insert_element_user(AGENTSOVERVIEWDASHLET$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "agentsoverviewdashlet" element
         */
        public noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet addNewAgentsoverviewdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet target = null;
                target = (noNamespace.AgentsoverviewdashletDocument.Agentsoverviewdashlet)get_store().add_element_user(AGENTSOVERVIEWDASHLET$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "agentsoverviewdashlet" element
         */
        public void removeAgentsoverviewdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AGENTSOVERVIEWDASHLET$4, i);
            }
        }
        
        /**
         * Gets array of all "apibreakdowndashlet" elements
         */
        public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet[] getApibreakdowndashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(APIBREAKDOWNDASHLET$6, targetList);
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet[] result = new noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "apibreakdowndashlet" element
         */
        public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet getApibreakdowndashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet target = null;
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().find_element_user(APIBREAKDOWNDASHLET$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "apibreakdowndashlet" element
         */
        public int sizeOfApibreakdowndashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APIBREAKDOWNDASHLET$6);
            }
        }
        
        /**
         * Sets array of all "apibreakdowndashlet" element
         */
        public void setApibreakdowndashletArray(noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet[] apibreakdowndashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(apibreakdowndashletArray, APIBREAKDOWNDASHLET$6);
            }
        }
        
        /**
         * Sets ith "apibreakdowndashlet" element
         */
        public void setApibreakdowndashletArray(int i, noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet apibreakdowndashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet target = null;
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().find_element_user(APIBREAKDOWNDASHLET$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(apibreakdowndashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "apibreakdowndashlet" element
         */
        public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet insertNewApibreakdowndashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet target = null;
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().insert_element_user(APIBREAKDOWNDASHLET$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "apibreakdowndashlet" element
         */
        public noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet addNewApibreakdowndashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet target = null;
                target = (noNamespace.ApibreakdowndashletDocument.Apibreakdowndashlet)get_store().add_element_user(APIBREAKDOWNDASHLET$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "apibreakdowndashlet" element
         */
        public void removeApibreakdowndashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APIBREAKDOWNDASHLET$6, i);
            }
        }
        
        /**
         * Gets array of all "baselinechart" elements
         */
        public noNamespace.BaselinechartDocument.Baselinechart[] getBaselinechartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BASELINECHART$8, targetList);
                noNamespace.BaselinechartDocument.Baselinechart[] result = new noNamespace.BaselinechartDocument.Baselinechart[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "baselinechart" element
         */
        public noNamespace.BaselinechartDocument.Baselinechart getBaselinechartArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BaselinechartDocument.Baselinechart target = null;
                target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().find_element_user(BASELINECHART$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "baselinechart" element
         */
        public int sizeOfBaselinechartArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASELINECHART$8);
            }
        }
        
        /**
         * Sets array of all "baselinechart" element
         */
        public void setBaselinechartArray(noNamespace.BaselinechartDocument.Baselinechart[] baselinechartArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(baselinechartArray, BASELINECHART$8);
            }
        }
        
        /**
         * Sets ith "baselinechart" element
         */
        public void setBaselinechartArray(int i, noNamespace.BaselinechartDocument.Baselinechart baselinechart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BaselinechartDocument.Baselinechart target = null;
                target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().find_element_user(BASELINECHART$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(baselinechart);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "baselinechart" element
         */
        public noNamespace.BaselinechartDocument.Baselinechart insertNewBaselinechart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BaselinechartDocument.Baselinechart target = null;
                target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().insert_element_user(BASELINECHART$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "baselinechart" element
         */
        public noNamespace.BaselinechartDocument.Baselinechart addNewBaselinechart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BaselinechartDocument.Baselinechart target = null;
                target = (noNamespace.BaselinechartDocument.Baselinechart)get_store().add_element_user(BASELINECHART$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "baselinechart" element
         */
        public void removeBaselinechart(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASELINECHART$8, i);
            }
        }
        
        /**
         * Gets array of all "bthistoricalcomparisondashlet" elements
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet[] getBthistoricalcomparisondashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BTHISTORICALCOMPARISONDASHLET$10, targetList);
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet[] result = new noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "bthistoricalcomparisondashlet" element
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet getBthistoricalcomparisondashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().find_element_user(BTHISTORICALCOMPARISONDASHLET$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "bthistoricalcomparisondashlet" element
         */
        public int sizeOfBthistoricalcomparisondashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BTHISTORICALCOMPARISONDASHLET$10);
            }
        }
        
        /**
         * Sets array of all "bthistoricalcomparisondashlet" element
         */
        public void setBthistoricalcomparisondashletArray(noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet[] bthistoricalcomparisondashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bthistoricalcomparisondashletArray, BTHISTORICALCOMPARISONDASHLET$10);
            }
        }
        
        /**
         * Sets ith "bthistoricalcomparisondashlet" element
         */
        public void setBthistoricalcomparisondashletArray(int i, noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet bthistoricalcomparisondashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().find_element_user(BTHISTORICALCOMPARISONDASHLET$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bthistoricalcomparisondashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bthistoricalcomparisondashlet" element
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet insertNewBthistoricalcomparisondashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().insert_element_user(BTHISTORICALCOMPARISONDASHLET$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bthistoricalcomparisondashlet" element
         */
        public noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet addNewBthistoricalcomparisondashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet target = null;
                target = (noNamespace.BthistoricalcomparisondashletDocument.Bthistoricalcomparisondashlet)get_store().add_element_user(BTHISTORICALCOMPARISONDASHLET$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "bthistoricalcomparisondashlet" element
         */
        public void removeBthistoricalcomparisondashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BTHISTORICALCOMPARISONDASHLET$10, i);
            }
        }
        
        /**
         * Gets array of all "businesstransactionsdashlet" elements
         */
        public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet[] getBusinesstransactionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BUSINESSTRANSACTIONSDASHLET$12, targetList);
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet[] result = new noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "businesstransactionsdashlet" element
         */
        public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet getBusinesstransactionsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet target = null;
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().find_element_user(BUSINESSTRANSACTIONSDASHLET$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "businesstransactionsdashlet" element
         */
        public int sizeOfBusinesstransactionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUSINESSTRANSACTIONSDASHLET$12);
            }
        }
        
        /**
         * Sets array of all "businesstransactionsdashlet" element
         */
        public void setBusinesstransactionsdashletArray(noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet[] businesstransactionsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(businesstransactionsdashletArray, BUSINESSTRANSACTIONSDASHLET$12);
            }
        }
        
        /**
         * Sets ith "businesstransactionsdashlet" element
         */
        public void setBusinesstransactionsdashletArray(int i, noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet businesstransactionsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet target = null;
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().find_element_user(BUSINESSTRANSACTIONSDASHLET$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(businesstransactionsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "businesstransactionsdashlet" element
         */
        public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet insertNewBusinesstransactionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet target = null;
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().insert_element_user(BUSINESSTRANSACTIONSDASHLET$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "businesstransactionsdashlet" element
         */
        public noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet addNewBusinesstransactionsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet target = null;
                target = (noNamespace.BusinesstransactionsdashletDocument.Businesstransactionsdashlet)get_store().add_element_user(BUSINESSTRANSACTIONSDASHLET$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "businesstransactionsdashlet" element
         */
        public void removeBusinesstransactionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUSINESSTRANSACTIONSDASHLET$12, i);
            }
        }
        
        /**
         * Gets array of all "chartdashlet" elements
         */
        public noNamespace.ChartdashletDocument.Chartdashlet[] getChartdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHARTDASHLET$14, targetList);
                noNamespace.ChartdashletDocument.Chartdashlet[] result = new noNamespace.ChartdashletDocument.Chartdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "chartdashlet" element
         */
        public noNamespace.ChartdashletDocument.Chartdashlet getChartdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ChartdashletDocument.Chartdashlet target = null;
                target = (noNamespace.ChartdashletDocument.Chartdashlet)get_store().find_element_user(CHARTDASHLET$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "chartdashlet" element
         */
        public int sizeOfChartdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHARTDASHLET$14);
            }
        }
        
        /**
         * Sets array of all "chartdashlet" element
         */
        public void setChartdashletArray(noNamespace.ChartdashletDocument.Chartdashlet[] chartdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(chartdashletArray, CHARTDASHLET$14);
            }
        }
        
        /**
         * Sets ith "chartdashlet" element
         */
        public void setChartdashletArray(int i, noNamespace.ChartdashletDocument.Chartdashlet chartdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ChartdashletDocument.Chartdashlet target = null;
                target = (noNamespace.ChartdashletDocument.Chartdashlet)get_store().find_element_user(CHARTDASHLET$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(chartdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "chartdashlet" element
         */
        public noNamespace.ChartdashletDocument.Chartdashlet insertNewChartdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ChartdashletDocument.Chartdashlet target = null;
                target = (noNamespace.ChartdashletDocument.Chartdashlet)get_store().insert_element_user(CHARTDASHLET$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "chartdashlet" element
         */
        public noNamespace.ChartdashletDocument.Chartdashlet addNewChartdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ChartdashletDocument.Chartdashlet target = null;
                target = (noNamespace.ChartdashletDocument.Chartdashlet)get_store().add_element_user(CHARTDASHLET$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "chartdashlet" element
         */
        public void removeChartdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHARTDASHLET$14, i);
            }
        }
        
        /**
         * Gets array of all "clienterrorsdashlet" elements
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet[] getClienterrorsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLIENTERRORSDASHLET$16, targetList);
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet[] result = new noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "clienterrorsdashlet" element
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet getClienterrorsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().find_element_user(CLIENTERRORSDASHLET$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "clienterrorsdashlet" element
         */
        public int sizeOfClienterrorsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLIENTERRORSDASHLET$16);
            }
        }
        
        /**
         * Sets array of all "clienterrorsdashlet" element
         */
        public void setClienterrorsdashletArray(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet[] clienterrorsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(clienterrorsdashletArray, CLIENTERRORSDASHLET$16);
            }
        }
        
        /**
         * Sets ith "clienterrorsdashlet" element
         */
        public void setClienterrorsdashletArray(int i, noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet clienterrorsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().find_element_user(CLIENTERRORSDASHLET$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(clienterrorsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "clienterrorsdashlet" element
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet insertNewClienterrorsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().insert_element_user(CLIENTERRORSDASHLET$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "clienterrorsdashlet" element
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet addNewClienterrorsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().add_element_user(CLIENTERRORSDASHLET$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "clienterrorsdashlet" element
         */
        public void removeClienterrorsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLIENTERRORSDASHLET$16, i);
            }
        }
        
        /**
         * Gets array of all "componentsdashlet" elements
         */
        public noNamespace.ComponentsdashletDocument.Componentsdashlet[] getComponentsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPONENTSDASHLET$18, targetList);
                noNamespace.ComponentsdashletDocument.Componentsdashlet[] result = new noNamespace.ComponentsdashletDocument.Componentsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "componentsdashlet" element
         */
        public noNamespace.ComponentsdashletDocument.Componentsdashlet getComponentsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ComponentsdashletDocument.Componentsdashlet target = null;
                target = (noNamespace.ComponentsdashletDocument.Componentsdashlet)get_store().find_element_user(COMPONENTSDASHLET$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "componentsdashlet" element
         */
        public int sizeOfComponentsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPONENTSDASHLET$18);
            }
        }
        
        /**
         * Sets array of all "componentsdashlet" element
         */
        public void setComponentsdashletArray(noNamespace.ComponentsdashletDocument.Componentsdashlet[] componentsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(componentsdashletArray, COMPONENTSDASHLET$18);
            }
        }
        
        /**
         * Sets ith "componentsdashlet" element
         */
        public void setComponentsdashletArray(int i, noNamespace.ComponentsdashletDocument.Componentsdashlet componentsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ComponentsdashletDocument.Componentsdashlet target = null;
                target = (noNamespace.ComponentsdashletDocument.Componentsdashlet)get_store().find_element_user(COMPONENTSDASHLET$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(componentsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "componentsdashlet" element
         */
        public noNamespace.ComponentsdashletDocument.Componentsdashlet insertNewComponentsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ComponentsdashletDocument.Componentsdashlet target = null;
                target = (noNamespace.ComponentsdashletDocument.Componentsdashlet)get_store().insert_element_user(COMPONENTSDASHLET$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "componentsdashlet" element
         */
        public noNamespace.ComponentsdashletDocument.Componentsdashlet addNewComponentsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ComponentsdashletDocument.Componentsdashlet target = null;
                target = (noNamespace.ComponentsdashletDocument.Componentsdashlet)get_store().add_element_user(COMPONENTSDASHLET$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "componentsdashlet" element
         */
        public void removeComponentsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPONENTSDASHLET$18, i);
            }
        }
        
        /**
         * Gets array of all "databasedashlet" elements
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet[] getDatabasedashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATABASEDASHLET$20, targetList);
                noNamespace.DatabasedashletDocument.Databasedashlet[] result = new noNamespace.DatabasedashletDocument.Databasedashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "databasedashlet" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet getDatabasedashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().find_element_user(DATABASEDASHLET$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "databasedashlet" element
         */
        public int sizeOfDatabasedashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASEDASHLET$20);
            }
        }
        
        /**
         * Sets array of all "databasedashlet" element
         */
        public void setDatabasedashletArray(noNamespace.DatabasedashletDocument.Databasedashlet[] databasedashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(databasedashletArray, DATABASEDASHLET$20);
            }
        }
        
        /**
         * Sets ith "databasedashlet" element
         */
        public void setDatabasedashletArray(int i, noNamespace.DatabasedashletDocument.Databasedashlet databasedashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().find_element_user(DATABASEDASHLET$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(databasedashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "databasedashlet" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet insertNewDatabasedashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().insert_element_user(DATABASEDASHLET$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "databasedashlet" element
         */
        public noNamespace.DatabasedashletDocument.Databasedashlet addNewDatabasedashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasedashletDocument.Databasedashlet target = null;
                target = (noNamespace.DatabasedashletDocument.Databasedashlet)get_store().add_element_user(DATABASEDASHLET$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "databasedashlet" element
         */
        public void removeDatabasedashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASEDASHLET$20, i);
            }
        }
        
        /**
         * Gets array of all "databasestatementsdashlet" elements
         */
        public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet[] getDatabasestatementsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATABASESTATEMENTSDASHLET$22, targetList);
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet[] result = new noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "databasestatementsdashlet" element
         */
        public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet getDatabasestatementsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet target = null;
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().find_element_user(DATABASESTATEMENTSDASHLET$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "databasestatementsdashlet" element
         */
        public int sizeOfDatabasestatementsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATABASESTATEMENTSDASHLET$22);
            }
        }
        
        /**
         * Sets array of all "databasestatementsdashlet" element
         */
        public void setDatabasestatementsdashletArray(noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet[] databasestatementsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(databasestatementsdashletArray, DATABASESTATEMENTSDASHLET$22);
            }
        }
        
        /**
         * Sets ith "databasestatementsdashlet" element
         */
        public void setDatabasestatementsdashletArray(int i, noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet databasestatementsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet target = null;
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().find_element_user(DATABASESTATEMENTSDASHLET$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(databasestatementsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "databasestatementsdashlet" element
         */
        public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet insertNewDatabasestatementsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet target = null;
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().insert_element_user(DATABASESTATEMENTSDASHLET$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "databasestatementsdashlet" element
         */
        public noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet addNewDatabasestatementsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet target = null;
                target = (noNamespace.DatabasestatementsdashletDocument.Databasestatementsdashlet)get_store().add_element_user(DATABASESTATEMENTSDASHLET$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "databasestatementsdashlet" element
         */
        public void removeDatabasestatementsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATABASESTATEMENTSDASHLET$22, i);
            }
        }
        
        /**
         * Gets array of all "dualaxischartdashlet" elements
         */
        public noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet[] getDualaxischartdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DUALAXISCHARTDASHLET$24, targetList);
                noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet[] result = new noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dualaxischartdashlet" element
         */
        public noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet getDualaxischartdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet target = null;
                target = (noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet)get_store().find_element_user(DUALAXISCHARTDASHLET$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dualaxischartdashlet" element
         */
        public int sizeOfDualaxischartdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DUALAXISCHARTDASHLET$24);
            }
        }
        
        /**
         * Sets array of all "dualaxischartdashlet" element
         */
        public void setDualaxischartdashletArray(noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet[] dualaxischartdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dualaxischartdashletArray, DUALAXISCHARTDASHLET$24);
            }
        }
        
        /**
         * Sets ith "dualaxischartdashlet" element
         */
        public void setDualaxischartdashletArray(int i, noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet dualaxischartdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet target = null;
                target = (noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet)get_store().find_element_user(DUALAXISCHARTDASHLET$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dualaxischartdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dualaxischartdashlet" element
         */
        public noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet insertNewDualaxischartdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet target = null;
                target = (noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet)get_store().insert_element_user(DUALAXISCHARTDASHLET$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dualaxischartdashlet" element
         */
        public noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet addNewDualaxischartdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet target = null;
                target = (noNamespace.DualaxischartdashletDocument.Dualaxischartdashlet)get_store().add_element_user(DUALAXISCHARTDASHLET$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "dualaxischartdashlet" element
         */
        public void removeDualaxischartdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DUALAXISCHARTDASHLET$24, i);
            }
        }
        
        /**
         * Gets array of all "dynamicmeasurematrixdashlet" elements
         */
        public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet[] getDynamicmeasurematrixdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DYNAMICMEASUREMATRIXDASHLET$26, targetList);
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet[] result = new noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dynamicmeasurematrixdashlet" element
         */
        public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet getDynamicmeasurematrixdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet target = null;
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().find_element_user(DYNAMICMEASUREMATRIXDASHLET$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dynamicmeasurematrixdashlet" element
         */
        public int sizeOfDynamicmeasurematrixdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DYNAMICMEASUREMATRIXDASHLET$26);
            }
        }
        
        /**
         * Sets array of all "dynamicmeasurematrixdashlet" element
         */
        public void setDynamicmeasurematrixdashletArray(noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet[] dynamicmeasurematrixdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dynamicmeasurematrixdashletArray, DYNAMICMEASUREMATRIXDASHLET$26);
            }
        }
        
        /**
         * Sets ith "dynamicmeasurematrixdashlet" element
         */
        public void setDynamicmeasurematrixdashletArray(int i, noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet dynamicmeasurematrixdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet target = null;
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().find_element_user(DYNAMICMEASUREMATRIXDASHLET$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dynamicmeasurematrixdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dynamicmeasurematrixdashlet" element
         */
        public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet insertNewDynamicmeasurematrixdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet target = null;
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().insert_element_user(DYNAMICMEASUREMATRIXDASHLET$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dynamicmeasurematrixdashlet" element
         */
        public noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet addNewDynamicmeasurematrixdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet target = null;
                target = (noNamespace.DynamicmeasurematrixdashletDocument.Dynamicmeasurematrixdashlet)get_store().add_element_user(DYNAMICMEASUREMATRIXDASHLET$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "dynamicmeasurematrixdashlet" element
         */
        public void removeDynamicmeasurematrixdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DYNAMICMEASUREMATRIXDASHLET$26, i);
            }
        }
        
        /**
         * Gets array of all "enduserpurepathsdashlet" elements
         */
        public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet[] getEnduserpurepathsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENDUSERPUREPATHSDASHLET$28, targetList);
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet[] result = new noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "enduserpurepathsdashlet" element
         */
        public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet getEnduserpurepathsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet target = null;
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().find_element_user(ENDUSERPUREPATHSDASHLET$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "enduserpurepathsdashlet" element
         */
        public int sizeOfEnduserpurepathsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDUSERPUREPATHSDASHLET$28);
            }
        }
        
        /**
         * Sets array of all "enduserpurepathsdashlet" element
         */
        public void setEnduserpurepathsdashletArray(noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet[] enduserpurepathsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(enduserpurepathsdashletArray, ENDUSERPUREPATHSDASHLET$28);
            }
        }
        
        /**
         * Sets ith "enduserpurepathsdashlet" element
         */
        public void setEnduserpurepathsdashletArray(int i, noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet enduserpurepathsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet target = null;
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().find_element_user(ENDUSERPUREPATHSDASHLET$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(enduserpurepathsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "enduserpurepathsdashlet" element
         */
        public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet insertNewEnduserpurepathsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet target = null;
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().insert_element_user(ENDUSERPUREPATHSDASHLET$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "enduserpurepathsdashlet" element
         */
        public noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet addNewEnduserpurepathsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet target = null;
                target = (noNamespace.EnduserpurepathsdashletDocument.Enduserpurepathsdashlet)get_store().add_element_user(ENDUSERPUREPATHSDASHLET$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "enduserpurepathsdashlet" element
         */
        public void removeEnduserpurepathsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDUSERPUREPATHSDASHLET$28, i);
            }
        }
        
        /**
         * Gets array of all "entrypointsdashlet" elements
         */
        public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet[] getEntrypointsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTRYPOINTSDASHLET$30, targetList);
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet[] result = new noNamespace.EntrypointsdashletDocument.Entrypointsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entrypointsdashlet" element
         */
        public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet getEntrypointsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet target = null;
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().find_element_user(ENTRYPOINTSDASHLET$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entrypointsdashlet" element
         */
        public int sizeOfEntrypointsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTRYPOINTSDASHLET$30);
            }
        }
        
        /**
         * Sets array of all "entrypointsdashlet" element
         */
        public void setEntrypointsdashletArray(noNamespace.EntrypointsdashletDocument.Entrypointsdashlet[] entrypointsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(entrypointsdashletArray, ENTRYPOINTSDASHLET$30);
            }
        }
        
        /**
         * Sets ith "entrypointsdashlet" element
         */
        public void setEntrypointsdashletArray(int i, noNamespace.EntrypointsdashletDocument.Entrypointsdashlet entrypointsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet target = null;
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().find_element_user(ENTRYPOINTSDASHLET$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(entrypointsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entrypointsdashlet" element
         */
        public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet insertNewEntrypointsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet target = null;
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().insert_element_user(ENTRYPOINTSDASHLET$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entrypointsdashlet" element
         */
        public noNamespace.EntrypointsdashletDocument.Entrypointsdashlet addNewEntrypointsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EntrypointsdashletDocument.Entrypointsdashlet target = null;
                target = (noNamespace.EntrypointsdashletDocument.Entrypointsdashlet)get_store().add_element_user(ENTRYPOINTSDASHLET$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "entrypointsdashlet" element
         */
        public void removeEntrypointsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTRYPOINTSDASHLET$30, i);
            }
        }
        
        /**
         * Gets array of all "errordetectiondashlet" elements
         */
        public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet[] getErrordetectiondashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ERRORDETECTIONDASHLET$32, targetList);
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet[] result = new noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "errordetectiondashlet" element
         */
        public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet getErrordetectiondashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet target = null;
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().find_element_user(ERRORDETECTIONDASHLET$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "errordetectiondashlet" element
         */
        public int sizeOfErrordetectiondashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORDETECTIONDASHLET$32);
            }
        }
        
        /**
         * Sets array of all "errordetectiondashlet" element
         */
        public void setErrordetectiondashletArray(noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet[] errordetectiondashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(errordetectiondashletArray, ERRORDETECTIONDASHLET$32);
            }
        }
        
        /**
         * Sets ith "errordetectiondashlet" element
         */
        public void setErrordetectiondashletArray(int i, noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet errordetectiondashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet target = null;
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().find_element_user(ERRORDETECTIONDASHLET$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(errordetectiondashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "errordetectiondashlet" element
         */
        public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet insertNewErrordetectiondashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet target = null;
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().insert_element_user(ERRORDETECTIONDASHLET$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "errordetectiondashlet" element
         */
        public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet addNewErrordetectiondashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet target = null;
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().add_element_user(ERRORDETECTIONDASHLET$32);
                return target;
            }
        }
        
        /**
         * Removes the ith "errordetectiondashlet" element
         */
        public void removeErrordetectiondashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORDETECTIONDASHLET$32, i);
            }
        }
        
        /**
         * Gets array of all "exceptionsdashlet" elements
         */
        public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet[] getExceptionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCEPTIONSDASHLET$34, targetList);
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet[] result = new noNamespace.ExceptionsdashletDocument.Exceptionsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "exceptionsdashlet" element
         */
        public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet getExceptionsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet target = null;
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().find_element_user(EXCEPTIONSDASHLET$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "exceptionsdashlet" element
         */
        public int sizeOfExceptionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCEPTIONSDASHLET$34);
            }
        }
        
        /**
         * Sets array of all "exceptionsdashlet" element
         */
        public void setExceptionsdashletArray(noNamespace.ExceptionsdashletDocument.Exceptionsdashlet[] exceptionsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(exceptionsdashletArray, EXCEPTIONSDASHLET$34);
            }
        }
        
        /**
         * Sets ith "exceptionsdashlet" element
         */
        public void setExceptionsdashletArray(int i, noNamespace.ExceptionsdashletDocument.Exceptionsdashlet exceptionsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet target = null;
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().find_element_user(EXCEPTIONSDASHLET$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(exceptionsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exceptionsdashlet" element
         */
        public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet insertNewExceptionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet target = null;
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().insert_element_user(EXCEPTIONSDASHLET$34, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exceptionsdashlet" element
         */
        public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet addNewExceptionsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet target = null;
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().add_element_user(EXCEPTIONSDASHLET$34);
                return target;
            }
        }
        
        /**
         * Removes the ith "exceptionsdashlet" element
         */
        public void removeExceptionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCEPTIONSDASHLET$34, i);
            }
        }
        
        /**
         * Gets array of all "functionalhealthdashlet" elements
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet[] getFunctionalhealthdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FUNCTIONALHEALTHDASHLET$36, targetList);
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet[] result = new noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "functionalhealthdashlet" element
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet getFunctionalhealthdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().find_element_user(FUNCTIONALHEALTHDASHLET$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "functionalhealthdashlet" element
         */
        public int sizeOfFunctionalhealthdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUNCTIONALHEALTHDASHLET$36);
            }
        }
        
        /**
         * Sets array of all "functionalhealthdashlet" element
         */
        public void setFunctionalhealthdashletArray(noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet[] functionalhealthdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(functionalhealthdashletArray, FUNCTIONALHEALTHDASHLET$36);
            }
        }
        
        /**
         * Sets ith "functionalhealthdashlet" element
         */
        public void setFunctionalhealthdashletArray(int i, noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet functionalhealthdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().find_element_user(FUNCTIONALHEALTHDASHLET$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(functionalhealthdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "functionalhealthdashlet" element
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet insertNewFunctionalhealthdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().insert_element_user(FUNCTIONALHEALTHDASHLET$36, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "functionalhealthdashlet" element
         */
        public noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet addNewFunctionalhealthdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet target = null;
                target = (noNamespace.FunctionalhealthdashletDocument.Functionalhealthdashlet)get_store().add_element_user(FUNCTIONALHEALTHDASHLET$36);
                return target;
            }
        }
        
        /**
         * Removes the ith "functionalhealthdashlet" element
         */
        public void removeFunctionalhealthdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUNCTIONALHEALTHDASHLET$36, i);
            }
        }
        
        /**
         * Gets array of all "groupingdashlet" elements
         */
        public noNamespace.GroupingdashletDocument.Groupingdashlet[] getGroupingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GROUPINGDASHLET$38, targetList);
                noNamespace.GroupingdashletDocument.Groupingdashlet[] result = new noNamespace.GroupingdashletDocument.Groupingdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "groupingdashlet" element
         */
        public noNamespace.GroupingdashletDocument.Groupingdashlet getGroupingdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GroupingdashletDocument.Groupingdashlet target = null;
                target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().find_element_user(GROUPINGDASHLET$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "groupingdashlet" element
         */
        public int sizeOfGroupingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUPINGDASHLET$38);
            }
        }
        
        /**
         * Sets array of all "groupingdashlet" element
         */
        public void setGroupingdashletArray(noNamespace.GroupingdashletDocument.Groupingdashlet[] groupingdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(groupingdashletArray, GROUPINGDASHLET$38);
            }
        }
        
        /**
         * Sets ith "groupingdashlet" element
         */
        public void setGroupingdashletArray(int i, noNamespace.GroupingdashletDocument.Groupingdashlet groupingdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GroupingdashletDocument.Groupingdashlet target = null;
                target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().find_element_user(GROUPINGDASHLET$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(groupingdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "groupingdashlet" element
         */
        public noNamespace.GroupingdashletDocument.Groupingdashlet insertNewGroupingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GroupingdashletDocument.Groupingdashlet target = null;
                target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().insert_element_user(GROUPINGDASHLET$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "groupingdashlet" element
         */
        public noNamespace.GroupingdashletDocument.Groupingdashlet addNewGroupingdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GroupingdashletDocument.Groupingdashlet target = null;
                target = (noNamespace.GroupingdashletDocument.Groupingdashlet)get_store().add_element_user(GROUPINGDASHLET$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "groupingdashlet" element
         */
        public void removeGroupingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUPINGDASHLET$38, i);
            }
        }
        
        /**
         * Gets array of all "guicontrolsdashlet" elements
         */
        public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet[] getGuicontrolsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GUICONTROLSDASHLET$40, targetList);
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet[] result = new noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "guicontrolsdashlet" element
         */
        public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet getGuicontrolsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet target = null;
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().find_element_user(GUICONTROLSDASHLET$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "guicontrolsdashlet" element
         */
        public int sizeOfGuicontrolsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GUICONTROLSDASHLET$40);
            }
        }
        
        /**
         * Sets array of all "guicontrolsdashlet" element
         */
        public void setGuicontrolsdashletArray(noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet[] guicontrolsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(guicontrolsdashletArray, GUICONTROLSDASHLET$40);
            }
        }
        
        /**
         * Sets ith "guicontrolsdashlet" element
         */
        public void setGuicontrolsdashletArray(int i, noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet guicontrolsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet target = null;
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().find_element_user(GUICONTROLSDASHLET$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(guicontrolsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "guicontrolsdashlet" element
         */
        public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet insertNewGuicontrolsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet target = null;
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().insert_element_user(GUICONTROLSDASHLET$40, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "guicontrolsdashlet" element
         */
        public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet addNewGuicontrolsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet target = null;
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().add_element_user(GUICONTROLSDASHLET$40);
                return target;
            }
        }
        
        /**
         * Removes the ith "guicontrolsdashlet" element
         */
        public void removeGuicontrolsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GUICONTROLSDASHLET$40, i);
            }
        }
        
        /**
         * Gets array of all "hostdashlet" elements
         */
        public noNamespace.HostdashletDocument.Hostdashlet[] getHostdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HOSTDASHLET$42, targetList);
                noNamespace.HostdashletDocument.Hostdashlet[] result = new noNamespace.HostdashletDocument.Hostdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "hostdashlet" element
         */
        public noNamespace.HostdashletDocument.Hostdashlet getHostdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().find_element_user(HOSTDASHLET$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "hostdashlet" element
         */
        public int sizeOfHostdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOSTDASHLET$42);
            }
        }
        
        /**
         * Sets array of all "hostdashlet" element
         */
        public void setHostdashletArray(noNamespace.HostdashletDocument.Hostdashlet[] hostdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hostdashletArray, HOSTDASHLET$42);
            }
        }
        
        /**
         * Sets ith "hostdashlet" element
         */
        public void setHostdashletArray(int i, noNamespace.HostdashletDocument.Hostdashlet hostdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().find_element_user(HOSTDASHLET$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hostdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "hostdashlet" element
         */
        public noNamespace.HostdashletDocument.Hostdashlet insertNewHostdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().insert_element_user(HOSTDASHLET$42, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hostdashlet" element
         */
        public noNamespace.HostdashletDocument.Hostdashlet addNewHostdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.HostdashletDocument.Hostdashlet target = null;
                target = (noNamespace.HostdashletDocument.Hostdashlet)get_store().add_element_user(HOSTDASHLET$42);
                return target;
            }
        }
        
        /**
         * Removes the ith "hostdashlet" element
         */
        public void removeHostdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOSTDASHLET$42, i);
            }
        }
        
        /**
         * Gets array of all "incidentchartdashlet" elements
         */
        public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet[] getIncidentchartdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCIDENTCHARTDASHLET$44, targetList);
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet[] result = new noNamespace.IncidentchartdashletDocument.Incidentchartdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "incidentchartdashlet" element
         */
        public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet getIncidentchartdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet target = null;
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().find_element_user(INCIDENTCHARTDASHLET$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "incidentchartdashlet" element
         */
        public int sizeOfIncidentchartdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTCHARTDASHLET$44);
            }
        }
        
        /**
         * Sets array of all "incidentchartdashlet" element
         */
        public void setIncidentchartdashletArray(noNamespace.IncidentchartdashletDocument.Incidentchartdashlet[] incidentchartdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(incidentchartdashletArray, INCIDENTCHARTDASHLET$44);
            }
        }
        
        /**
         * Sets ith "incidentchartdashlet" element
         */
        public void setIncidentchartdashletArray(int i, noNamespace.IncidentchartdashletDocument.Incidentchartdashlet incidentchartdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet target = null;
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().find_element_user(INCIDENTCHARTDASHLET$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(incidentchartdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "incidentchartdashlet" element
         */
        public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet insertNewIncidentchartdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet target = null;
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().insert_element_user(INCIDENTCHARTDASHLET$44, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "incidentchartdashlet" element
         */
        public noNamespace.IncidentchartdashletDocument.Incidentchartdashlet addNewIncidentchartdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentchartdashletDocument.Incidentchartdashlet target = null;
                target = (noNamespace.IncidentchartdashletDocument.Incidentchartdashlet)get_store().add_element_user(INCIDENTCHARTDASHLET$44);
                return target;
            }
        }
        
        /**
         * Removes the ith "incidentchartdashlet" element
         */
        public void removeIncidentchartdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTCHARTDASHLET$44, i);
            }
        }
        
        /**
         * Gets array of all "incidentsoverviewdashlet" elements
         */
        public noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet[] getIncidentsoverviewdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCIDENTSOVERVIEWDASHLET$46, targetList);
                noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet[] result = new noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "incidentsoverviewdashlet" element
         */
        public noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet getIncidentsoverviewdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet target = null;
                target = (noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet)get_store().find_element_user(INCIDENTSOVERVIEWDASHLET$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "incidentsoverviewdashlet" element
         */
        public int sizeOfIncidentsoverviewdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTSOVERVIEWDASHLET$46);
            }
        }
        
        /**
         * Sets array of all "incidentsoverviewdashlet" element
         */
        public void setIncidentsoverviewdashletArray(noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet[] incidentsoverviewdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(incidentsoverviewdashletArray, INCIDENTSOVERVIEWDASHLET$46);
            }
        }
        
        /**
         * Sets ith "incidentsoverviewdashlet" element
         */
        public void setIncidentsoverviewdashletArray(int i, noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet incidentsoverviewdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet target = null;
                target = (noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet)get_store().find_element_user(INCIDENTSOVERVIEWDASHLET$46, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(incidentsoverviewdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "incidentsoverviewdashlet" element
         */
        public noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet insertNewIncidentsoverviewdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet target = null;
                target = (noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet)get_store().insert_element_user(INCIDENTSOVERVIEWDASHLET$46, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "incidentsoverviewdashlet" element
         */
        public noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet addNewIncidentsoverviewdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet target = null;
                target = (noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet)get_store().add_element_user(INCIDENTSOVERVIEWDASHLET$46);
                return target;
            }
        }
        
        /**
         * Removes the ith "incidentsoverviewdashlet" element
         */
        public void removeIncidentsoverviewdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTSOVERVIEWDASHLET$46, i);
            }
        }
        
        /**
         * Gets array of all "infrastructureoverview" elements
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview[] getInfrastructureoverviewArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INFRASTRUCTUREOVERVIEW$48, targetList);
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview[] result = new noNamespace.InfrastructureoverviewDocument.Infrastructureoverview[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "infrastructureoverview" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview getInfrastructureoverviewArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().find_element_user(INFRASTRUCTUREOVERVIEW$48, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "infrastructureoverview" element
         */
        public int sizeOfInfrastructureoverviewArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFRASTRUCTUREOVERVIEW$48);
            }
        }
        
        /**
         * Sets array of all "infrastructureoverview" element
         */
        public void setInfrastructureoverviewArray(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview[] infrastructureoverviewArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(infrastructureoverviewArray, INFRASTRUCTUREOVERVIEW$48);
            }
        }
        
        /**
         * Sets ith "infrastructureoverview" element
         */
        public void setInfrastructureoverviewArray(int i, noNamespace.InfrastructureoverviewDocument.Infrastructureoverview infrastructureoverview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().find_element_user(INFRASTRUCTUREOVERVIEW$48, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(infrastructureoverview);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "infrastructureoverview" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview insertNewInfrastructureoverview(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().insert_element_user(INFRASTRUCTUREOVERVIEW$48, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "infrastructureoverview" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview addNewInfrastructureoverview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().add_element_user(INFRASTRUCTUREOVERVIEW$48);
                return target;
            }
        }
        
        /**
         * Removes the ith "infrastructureoverview" element
         */
        public void removeInfrastructureoverview(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFRASTRUCTUREOVERVIEW$48, i);
            }
        }
        
        /**
         * Gets array of all "layerbreakdowndashlet" elements
         */
        public noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet[] getLayerbreakdowndashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LAYERBREAKDOWNDASHLET$50, targetList);
                noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet[] result = new noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "layerbreakdowndashlet" element
         */
        public noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet getLayerbreakdowndashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet target = null;
                target = (noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet)get_store().find_element_user(LAYERBREAKDOWNDASHLET$50, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "layerbreakdowndashlet" element
         */
        public int sizeOfLayerbreakdowndashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LAYERBREAKDOWNDASHLET$50);
            }
        }
        
        /**
         * Sets array of all "layerbreakdowndashlet" element
         */
        public void setLayerbreakdowndashletArray(noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet[] layerbreakdowndashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(layerbreakdowndashletArray, LAYERBREAKDOWNDASHLET$50);
            }
        }
        
        /**
         * Sets ith "layerbreakdowndashlet" element
         */
        public void setLayerbreakdowndashletArray(int i, noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet layerbreakdowndashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet target = null;
                target = (noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet)get_store().find_element_user(LAYERBREAKDOWNDASHLET$50, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(layerbreakdowndashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "layerbreakdowndashlet" element
         */
        public noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet insertNewLayerbreakdowndashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet target = null;
                target = (noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet)get_store().insert_element_user(LAYERBREAKDOWNDASHLET$50, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "layerbreakdowndashlet" element
         */
        public noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet addNewLayerbreakdowndashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet target = null;
                target = (noNamespace.LayerbreakdowndashletDocument.Layerbreakdowndashlet)get_store().add_element_user(LAYERBREAKDOWNDASHLET$50);
                return target;
            }
        }
        
        /**
         * Removes the ith "layerbreakdowndashlet" element
         */
        public void removeLayerbreakdowndashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LAYERBREAKDOWNDASHLET$50, i);
            }
        }
        
        /**
         * Gets array of all "licenseoverview" elements
         */
        public noNamespace.LicenseoverviewDocument.Licenseoverview[] getLicenseoverviewArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LICENSEOVERVIEW$52, targetList);
                noNamespace.LicenseoverviewDocument.Licenseoverview[] result = new noNamespace.LicenseoverviewDocument.Licenseoverview[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "licenseoverview" element
         */
        public noNamespace.LicenseoverviewDocument.Licenseoverview getLicenseoverviewArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LicenseoverviewDocument.Licenseoverview target = null;
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().find_element_user(LICENSEOVERVIEW$52, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "licenseoverview" element
         */
        public int sizeOfLicenseoverviewArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LICENSEOVERVIEW$52);
            }
        }
        
        /**
         * Sets array of all "licenseoverview" element
         */
        public void setLicenseoverviewArray(noNamespace.LicenseoverviewDocument.Licenseoverview[] licenseoverviewArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(licenseoverviewArray, LICENSEOVERVIEW$52);
            }
        }
        
        /**
         * Sets ith "licenseoverview" element
         */
        public void setLicenseoverviewArray(int i, noNamespace.LicenseoverviewDocument.Licenseoverview licenseoverview)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LicenseoverviewDocument.Licenseoverview target = null;
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().find_element_user(LICENSEOVERVIEW$52, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(licenseoverview);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "licenseoverview" element
         */
        public noNamespace.LicenseoverviewDocument.Licenseoverview insertNewLicenseoverview(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LicenseoverviewDocument.Licenseoverview target = null;
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().insert_element_user(LICENSEOVERVIEW$52, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "licenseoverview" element
         */
        public noNamespace.LicenseoverviewDocument.Licenseoverview addNewLicenseoverview()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LicenseoverviewDocument.Licenseoverview target = null;
                target = (noNamespace.LicenseoverviewDocument.Licenseoverview)get_store().add_element_user(LICENSEOVERVIEW$52);
                return target;
            }
        }
        
        /**
         * Removes the ith "licenseoverview" element
         */
        public void removeLicenseoverview(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LICENSEOVERVIEW$52, i);
            }
        }
        
        /**
         * Gets array of all "loggingdashlet" elements
         */
        public noNamespace.LoggingdashletDocument.Loggingdashlet[] getLoggingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOGGINGDASHLET$54, targetList);
                noNamespace.LoggingdashletDocument.Loggingdashlet[] result = new noNamespace.LoggingdashletDocument.Loggingdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "loggingdashlet" element
         */
        public noNamespace.LoggingdashletDocument.Loggingdashlet getLoggingdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LoggingdashletDocument.Loggingdashlet target = null;
                target = (noNamespace.LoggingdashletDocument.Loggingdashlet)get_store().find_element_user(LOGGINGDASHLET$54, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "loggingdashlet" element
         */
        public int sizeOfLoggingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOGGINGDASHLET$54);
            }
        }
        
        /**
         * Sets array of all "loggingdashlet" element
         */
        public void setLoggingdashletArray(noNamespace.LoggingdashletDocument.Loggingdashlet[] loggingdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(loggingdashletArray, LOGGINGDASHLET$54);
            }
        }
        
        /**
         * Sets ith "loggingdashlet" element
         */
        public void setLoggingdashletArray(int i, noNamespace.LoggingdashletDocument.Loggingdashlet loggingdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LoggingdashletDocument.Loggingdashlet target = null;
                target = (noNamespace.LoggingdashletDocument.Loggingdashlet)get_store().find_element_user(LOGGINGDASHLET$54, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(loggingdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "loggingdashlet" element
         */
        public noNamespace.LoggingdashletDocument.Loggingdashlet insertNewLoggingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LoggingdashletDocument.Loggingdashlet target = null;
                target = (noNamespace.LoggingdashletDocument.Loggingdashlet)get_store().insert_element_user(LOGGINGDASHLET$54, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "loggingdashlet" element
         */
        public noNamespace.LoggingdashletDocument.Loggingdashlet addNewLoggingdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.LoggingdashletDocument.Loggingdashlet target = null;
                target = (noNamespace.LoggingdashletDocument.Loggingdashlet)get_store().add_element_user(LOGGINGDASHLET$54);
                return target;
            }
        }
        
        /**
         * Removes the ith "loggingdashlet" element
         */
        public void removeLoggingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOGGINGDASHLET$54, i);
            }
        }
        
        /**
         * Gets array of all "memoryallocationsdashlet" elements
         */
        public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet[] getMemoryallocationsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEMORYALLOCATIONSDASHLET$56, targetList);
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet[] result = new noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "memoryallocationsdashlet" element
         */
        public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet getMemoryallocationsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet target = null;
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().find_element_user(MEMORYALLOCATIONSDASHLET$56, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "memoryallocationsdashlet" element
         */
        public int sizeOfMemoryallocationsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEMORYALLOCATIONSDASHLET$56);
            }
        }
        
        /**
         * Sets array of all "memoryallocationsdashlet" element
         */
        public void setMemoryallocationsdashletArray(noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet[] memoryallocationsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(memoryallocationsdashletArray, MEMORYALLOCATIONSDASHLET$56);
            }
        }
        
        /**
         * Sets ith "memoryallocationsdashlet" element
         */
        public void setMemoryallocationsdashletArray(int i, noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet memoryallocationsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet target = null;
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().find_element_user(MEMORYALLOCATIONSDASHLET$56, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(memoryallocationsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "memoryallocationsdashlet" element
         */
        public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet insertNewMemoryallocationsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet target = null;
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().insert_element_user(MEMORYALLOCATIONSDASHLET$56, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "memoryallocationsdashlet" element
         */
        public noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet addNewMemoryallocationsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet target = null;
                target = (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet)get_store().add_element_user(MEMORYALLOCATIONSDASHLET$56);
                return target;
            }
        }
        
        /**
         * Removes the ith "memoryallocationsdashlet" element
         */
        public void removeMemoryallocationsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEMORYALLOCATIONSDASHLET$56, i);
            }
        }
        
        /**
         * Gets array of all "messagingdashlet" elements
         */
        public noNamespace.MessagingdashletDocument.Messagingdashlet[] getMessagingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MESSAGINGDASHLET$58, targetList);
                noNamespace.MessagingdashletDocument.Messagingdashlet[] result = new noNamespace.MessagingdashletDocument.Messagingdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "messagingdashlet" element
         */
        public noNamespace.MessagingdashletDocument.Messagingdashlet getMessagingdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MessagingdashletDocument.Messagingdashlet target = null;
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().find_element_user(MESSAGINGDASHLET$58, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "messagingdashlet" element
         */
        public int sizeOfMessagingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGINGDASHLET$58);
            }
        }
        
        /**
         * Sets array of all "messagingdashlet" element
         */
        public void setMessagingdashletArray(noNamespace.MessagingdashletDocument.Messagingdashlet[] messagingdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(messagingdashletArray, MESSAGINGDASHLET$58);
            }
        }
        
        /**
         * Sets ith "messagingdashlet" element
         */
        public void setMessagingdashletArray(int i, noNamespace.MessagingdashletDocument.Messagingdashlet messagingdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MessagingdashletDocument.Messagingdashlet target = null;
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().find_element_user(MESSAGINGDASHLET$58, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(messagingdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "messagingdashlet" element
         */
        public noNamespace.MessagingdashletDocument.Messagingdashlet insertNewMessagingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MessagingdashletDocument.Messagingdashlet target = null;
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().insert_element_user(MESSAGINGDASHLET$58, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "messagingdashlet" element
         */
        public noNamespace.MessagingdashletDocument.Messagingdashlet addNewMessagingdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MessagingdashletDocument.Messagingdashlet target = null;
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().add_element_user(MESSAGINGDASHLET$58);
                return target;
            }
        }
        
        /**
         * Removes the ith "messagingdashlet" element
         */
        public void removeMessagingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGINGDASHLET$58, i);
            }
        }
        
        /**
         * Gets array of all "methodhotspotsdashlet" elements
         */
        public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet[] getMethodhotspotsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(METHODHOTSPOTSDASHLET$60, targetList);
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet[] result = new noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "methodhotspotsdashlet" element
         */
        public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet getMethodhotspotsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet target = null;
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().find_element_user(METHODHOTSPOTSDASHLET$60, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "methodhotspotsdashlet" element
         */
        public int sizeOfMethodhotspotsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METHODHOTSPOTSDASHLET$60);
            }
        }
        
        /**
         * Sets array of all "methodhotspotsdashlet" element
         */
        public void setMethodhotspotsdashletArray(noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet[] methodhotspotsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(methodhotspotsdashletArray, METHODHOTSPOTSDASHLET$60);
            }
        }
        
        /**
         * Sets ith "methodhotspotsdashlet" element
         */
        public void setMethodhotspotsdashletArray(int i, noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet methodhotspotsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet target = null;
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().find_element_user(METHODHOTSPOTSDASHLET$60, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(methodhotspotsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "methodhotspotsdashlet" element
         */
        public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet insertNewMethodhotspotsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet target = null;
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().insert_element_user(METHODHOTSPOTSDASHLET$60, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "methodhotspotsdashlet" element
         */
        public noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet addNewMethodhotspotsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet target = null;
                target = (noNamespace.MethodhotspotsdashletDocument.Methodhotspotsdashlet)get_store().add_element_user(METHODHOTSPOTSDASHLET$60);
                return target;
            }
        }
        
        /**
         * Removes the ith "methodhotspotsdashlet" element
         */
        public void removeMethodhotspotsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METHODHOTSPOTSDASHLET$60, i);
            }
        }
        
        /**
         * Gets array of all "methodsdashlet" elements
         */
        public noNamespace.MethodsdashletDocument.Methodsdashlet[] getMethodsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(METHODSDASHLET$62, targetList);
                noNamespace.MethodsdashletDocument.Methodsdashlet[] result = new noNamespace.MethodsdashletDocument.Methodsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "methodsdashlet" element
         */
        public noNamespace.MethodsdashletDocument.Methodsdashlet getMethodsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodsdashletDocument.Methodsdashlet target = null;
                target = (noNamespace.MethodsdashletDocument.Methodsdashlet)get_store().find_element_user(METHODSDASHLET$62, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "methodsdashlet" element
         */
        public int sizeOfMethodsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METHODSDASHLET$62);
            }
        }
        
        /**
         * Sets array of all "methodsdashlet" element
         */
        public void setMethodsdashletArray(noNamespace.MethodsdashletDocument.Methodsdashlet[] methodsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(methodsdashletArray, METHODSDASHLET$62);
            }
        }
        
        /**
         * Sets ith "methodsdashlet" element
         */
        public void setMethodsdashletArray(int i, noNamespace.MethodsdashletDocument.Methodsdashlet methodsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodsdashletDocument.Methodsdashlet target = null;
                target = (noNamespace.MethodsdashletDocument.Methodsdashlet)get_store().find_element_user(METHODSDASHLET$62, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(methodsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "methodsdashlet" element
         */
        public noNamespace.MethodsdashletDocument.Methodsdashlet insertNewMethodsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodsdashletDocument.Methodsdashlet target = null;
                target = (noNamespace.MethodsdashletDocument.Methodsdashlet)get_store().insert_element_user(METHODSDASHLET$62, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "methodsdashlet" element
         */
        public noNamespace.MethodsdashletDocument.Methodsdashlet addNewMethodsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MethodsdashletDocument.Methodsdashlet target = null;
                target = (noNamespace.MethodsdashletDocument.Methodsdashlet)get_store().add_element_user(METHODSDASHLET$62);
                return target;
            }
        }
        
        /**
         * Removes the ith "methodsdashlet" element
         */
        public void removeMethodsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METHODSDASHLET$62, i);
            }
        }
        
        /**
         * Gets array of all "mobileworkloaddashlet" elements
         */
        public noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet[] getMobileworkloaddashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MOBILEWORKLOADDASHLET$64, targetList);
                noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet[] result = new noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "mobileworkloaddashlet" element
         */
        public noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet getMobileworkloaddashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet target = null;
                target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().find_element_user(MOBILEWORKLOADDASHLET$64, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "mobileworkloaddashlet" element
         */
        public int sizeOfMobileworkloaddashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOBILEWORKLOADDASHLET$64);
            }
        }
        
        /**
         * Sets array of all "mobileworkloaddashlet" element
         */
        public void setMobileworkloaddashletArray(noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet[] mobileworkloaddashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(mobileworkloaddashletArray, MOBILEWORKLOADDASHLET$64);
            }
        }
        
        /**
         * Sets ith "mobileworkloaddashlet" element
         */
        public void setMobileworkloaddashletArray(int i, noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet mobileworkloaddashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet target = null;
                target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().find_element_user(MOBILEWORKLOADDASHLET$64, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(mobileworkloaddashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mobileworkloaddashlet" element
         */
        public noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet insertNewMobileworkloaddashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet target = null;
                target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().insert_element_user(MOBILEWORKLOADDASHLET$64, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mobileworkloaddashlet" element
         */
        public noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet addNewMobileworkloaddashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet target = null;
                target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().add_element_user(MOBILEWORKLOADDASHLET$64);
                return target;
            }
        }
        
        /**
         * Removes the ith "mobileworkloaddashlet" element
         */
        public void removeMobileworkloaddashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOBILEWORKLOADDASHLET$64, i);
            }
        }
        
        /**
         * Gets array of all "namingservicesdashlet" elements
         */
        public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet[] getNamingservicesdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAMINGSERVICESDASHLET$66, targetList);
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet[] result = new noNamespace.NamingservicesdashletDocument.Namingservicesdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "namingservicesdashlet" element
         */
        public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet getNamingservicesdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet target = null;
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().find_element_user(NAMINGSERVICESDASHLET$66, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "namingservicesdashlet" element
         */
        public int sizeOfNamingservicesdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMINGSERVICESDASHLET$66);
            }
        }
        
        /**
         * Sets array of all "namingservicesdashlet" element
         */
        public void setNamingservicesdashletArray(noNamespace.NamingservicesdashletDocument.Namingservicesdashlet[] namingservicesdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(namingservicesdashletArray, NAMINGSERVICESDASHLET$66);
            }
        }
        
        /**
         * Sets ith "namingservicesdashlet" element
         */
        public void setNamingservicesdashletArray(int i, noNamespace.NamingservicesdashletDocument.Namingservicesdashlet namingservicesdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet target = null;
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().find_element_user(NAMINGSERVICESDASHLET$66, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(namingservicesdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "namingservicesdashlet" element
         */
        public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet insertNewNamingservicesdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet target = null;
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().insert_element_user(NAMINGSERVICESDASHLET$66, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "namingservicesdashlet" element
         */
        public noNamespace.NamingservicesdashletDocument.Namingservicesdashlet addNewNamingservicesdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NamingservicesdashletDocument.Namingservicesdashlet target = null;
                target = (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet)get_store().add_element_user(NAMINGSERVICESDASHLET$66);
                return target;
            }
        }
        
        /**
         * Removes the ith "namingservicesdashlet" element
         */
        public void removeNamingservicesdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMINGSERVICESDASHLET$66, i);
            }
        }
        
        /**
         * Gets array of all "pageactionshealthdashlet" elements
         */
        public noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet[] getPageactionshealthdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PAGEACTIONSHEALTHDASHLET$68, targetList);
                noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet[] result = new noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "pageactionshealthdashlet" element
         */
        public noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet getPageactionshealthdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet target = null;
                target = (noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet)get_store().find_element_user(PAGEACTIONSHEALTHDASHLET$68, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "pageactionshealthdashlet" element
         */
        public int sizeOfPageactionshealthdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PAGEACTIONSHEALTHDASHLET$68);
            }
        }
        
        /**
         * Sets array of all "pageactionshealthdashlet" element
         */
        public void setPageactionshealthdashletArray(noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet[] pageactionshealthdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(pageactionshealthdashletArray, PAGEACTIONSHEALTHDASHLET$68);
            }
        }
        
        /**
         * Sets ith "pageactionshealthdashlet" element
         */
        public void setPageactionshealthdashletArray(int i, noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet pageactionshealthdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet target = null;
                target = (noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet)get_store().find_element_user(PAGEACTIONSHEALTHDASHLET$68, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pageactionshealthdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pageactionshealthdashlet" element
         */
        public noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet insertNewPageactionshealthdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet target = null;
                target = (noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet)get_store().insert_element_user(PAGEACTIONSHEALTHDASHLET$68, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pageactionshealthdashlet" element
         */
        public noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet addNewPageactionshealthdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet target = null;
                target = (noNamespace.PageactionshealthdashletDocument.Pageactionshealthdashlet)get_store().add_element_user(PAGEACTIONSHEALTHDASHLET$68);
                return target;
            }
        }
        
        /**
         * Removes the ith "pageactionshealthdashlet" element
         */
        public void removePageactionshealthdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PAGEACTIONSHEALTHDASHLET$68, i);
            }
        }
        
        /**
         * Gets array of all "processdashlet" elements
         */
        public noNamespace.ProcessdashletDocument.Processdashlet[] getProcessdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROCESSDASHLET$70, targetList);
                noNamespace.ProcessdashletDocument.Processdashlet[] result = new noNamespace.ProcessdashletDocument.Processdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "processdashlet" element
         */
        public noNamespace.ProcessdashletDocument.Processdashlet getProcessdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().find_element_user(PROCESSDASHLET$70, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "processdashlet" element
         */
        public int sizeOfProcessdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCESSDASHLET$70);
            }
        }
        
        /**
         * Sets array of all "processdashlet" element
         */
        public void setProcessdashletArray(noNamespace.ProcessdashletDocument.Processdashlet[] processdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(processdashletArray, PROCESSDASHLET$70);
            }
        }
        
        /**
         * Sets ith "processdashlet" element
         */
        public void setProcessdashletArray(int i, noNamespace.ProcessdashletDocument.Processdashlet processdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().find_element_user(PROCESSDASHLET$70, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(processdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "processdashlet" element
         */
        public noNamespace.ProcessdashletDocument.Processdashlet insertNewProcessdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().insert_element_user(PROCESSDASHLET$70, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "processdashlet" element
         */
        public noNamespace.ProcessdashletDocument.Processdashlet addNewProcessdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ProcessdashletDocument.Processdashlet target = null;
                target = (noNamespace.ProcessdashletDocument.Processdashlet)get_store().add_element_user(PROCESSDASHLET$70);
                return target;
            }
        }
        
        /**
         * Removes the ith "processdashlet" element
         */
        public void removeProcessdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCESSDASHLET$70, i);
            }
        }
        
        /**
         * Gets array of all "purepathsdashlet" elements
         */
        public noNamespace.PurepathsdashletDocument.Purepathsdashlet[] getPurepathsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PUREPATHSDASHLET$72, targetList);
                noNamespace.PurepathsdashletDocument.Purepathsdashlet[] result = new noNamespace.PurepathsdashletDocument.Purepathsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "purepathsdashlet" element
         */
        public noNamespace.PurepathsdashletDocument.Purepathsdashlet getPurepathsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PurepathsdashletDocument.Purepathsdashlet target = null;
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().find_element_user(PUREPATHSDASHLET$72, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "purepathsdashlet" element
         */
        public int sizeOfPurepathsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PUREPATHSDASHLET$72);
            }
        }
        
        /**
         * Sets array of all "purepathsdashlet" element
         */
        public void setPurepathsdashletArray(noNamespace.PurepathsdashletDocument.Purepathsdashlet[] purepathsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(purepathsdashletArray, PUREPATHSDASHLET$72);
            }
        }
        
        /**
         * Sets ith "purepathsdashlet" element
         */
        public void setPurepathsdashletArray(int i, noNamespace.PurepathsdashletDocument.Purepathsdashlet purepathsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PurepathsdashletDocument.Purepathsdashlet target = null;
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().find_element_user(PUREPATHSDASHLET$72, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(purepathsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "purepathsdashlet" element
         */
        public noNamespace.PurepathsdashletDocument.Purepathsdashlet insertNewPurepathsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PurepathsdashletDocument.Purepathsdashlet target = null;
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().insert_element_user(PUREPATHSDASHLET$72, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "purepathsdashlet" element
         */
        public noNamespace.PurepathsdashletDocument.Purepathsdashlet addNewPurepathsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PurepathsdashletDocument.Purepathsdashlet target = null;
                target = (noNamespace.PurepathsdashletDocument.Purepathsdashlet)get_store().add_element_user(PUREPATHSDASHLET$72);
                return target;
            }
        }
        
        /**
         * Removes the ith "purepathsdashlet" element
         */
        public void removePurepathsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PUREPATHSDASHLET$72, i);
            }
        }
        
        /**
         * Gets array of all "remotingdashlet" elements
         */
        public noNamespace.RemotingdashletDocument.Remotingdashlet[] getRemotingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REMOTINGDASHLET$74, targetList);
                noNamespace.RemotingdashletDocument.Remotingdashlet[] result = new noNamespace.RemotingdashletDocument.Remotingdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "remotingdashlet" element
         */
        public noNamespace.RemotingdashletDocument.Remotingdashlet getRemotingdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RemotingdashletDocument.Remotingdashlet target = null;
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().find_element_user(REMOTINGDASHLET$74, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "remotingdashlet" element
         */
        public int sizeOfRemotingdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REMOTINGDASHLET$74);
            }
        }
        
        /**
         * Sets array of all "remotingdashlet" element
         */
        public void setRemotingdashletArray(noNamespace.RemotingdashletDocument.Remotingdashlet[] remotingdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(remotingdashletArray, REMOTINGDASHLET$74);
            }
        }
        
        /**
         * Sets ith "remotingdashlet" element
         */
        public void setRemotingdashletArray(int i, noNamespace.RemotingdashletDocument.Remotingdashlet remotingdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RemotingdashletDocument.Remotingdashlet target = null;
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().find_element_user(REMOTINGDASHLET$74, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(remotingdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "remotingdashlet" element
         */
        public noNamespace.RemotingdashletDocument.Remotingdashlet insertNewRemotingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RemotingdashletDocument.Remotingdashlet target = null;
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().insert_element_user(REMOTINGDASHLET$74, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "remotingdashlet" element
         */
        public noNamespace.RemotingdashletDocument.Remotingdashlet addNewRemotingdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RemotingdashletDocument.Remotingdashlet target = null;
                target = (noNamespace.RemotingdashletDocument.Remotingdashlet)get_store().add_element_user(REMOTINGDASHLET$74);
                return target;
            }
        }
        
        /**
         * Removes the ith "remotingdashlet" element
         */
        public void removeRemotingdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REMOTINGDASHLET$74, i);
            }
        }
        
        /**
         * Gets array of all "runtimesuspensionsdashlet" elements
         */
        public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet[] getRuntimesuspensionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RUNTIMESUSPENSIONSDASHLET$76, targetList);
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet[] result = new noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "runtimesuspensionsdashlet" element
         */
        public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet getRuntimesuspensionsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet target = null;
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().find_element_user(RUNTIMESUSPENSIONSDASHLET$76, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "runtimesuspensionsdashlet" element
         */
        public int sizeOfRuntimesuspensionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RUNTIMESUSPENSIONSDASHLET$76);
            }
        }
        
        /**
         * Sets array of all "runtimesuspensionsdashlet" element
         */
        public void setRuntimesuspensionsdashletArray(noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet[] runtimesuspensionsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(runtimesuspensionsdashletArray, RUNTIMESUSPENSIONSDASHLET$76);
            }
        }
        
        /**
         * Sets ith "runtimesuspensionsdashlet" element
         */
        public void setRuntimesuspensionsdashletArray(int i, noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet runtimesuspensionsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet target = null;
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().find_element_user(RUNTIMESUSPENSIONSDASHLET$76, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(runtimesuspensionsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "runtimesuspensionsdashlet" element
         */
        public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet insertNewRuntimesuspensionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet target = null;
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().insert_element_user(RUNTIMESUSPENSIONSDASHLET$76, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "runtimesuspensionsdashlet" element
         */
        public noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet addNewRuntimesuspensionsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet target = null;
                target = (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet)get_store().add_element_user(RUNTIMESUSPENSIONSDASHLET$76);
                return target;
            }
        }
        
        /**
         * Removes the ith "runtimesuspensionsdashlet" element
         */
        public void removeRuntimesuspensionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RUNTIMESUSPENSIONSDASHLET$76, i);
            }
        }
        
        /**
         * Gets array of all "sessionbrowserdashlet" elements
         */
        public noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet[] getSessionbrowserdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SESSIONBROWSERDASHLET$78, targetList);
                noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet[] result = new noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sessionbrowserdashlet" element
         */
        public noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet getSessionbrowserdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet target = null;
                target = (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet)get_store().find_element_user(SESSIONBROWSERDASHLET$78, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sessionbrowserdashlet" element
         */
        public int sizeOfSessionbrowserdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SESSIONBROWSERDASHLET$78);
            }
        }
        
        /**
         * Sets array of all "sessionbrowserdashlet" element
         */
        public void setSessionbrowserdashletArray(noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet[] sessionbrowserdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sessionbrowserdashletArray, SESSIONBROWSERDASHLET$78);
            }
        }
        
        /**
         * Sets ith "sessionbrowserdashlet" element
         */
        public void setSessionbrowserdashletArray(int i, noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet sessionbrowserdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet target = null;
                target = (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet)get_store().find_element_user(SESSIONBROWSERDASHLET$78, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sessionbrowserdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sessionbrowserdashlet" element
         */
        public noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet insertNewSessionbrowserdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet target = null;
                target = (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet)get_store().insert_element_user(SESSIONBROWSERDASHLET$78, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sessionbrowserdashlet" element
         */
        public noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet addNewSessionbrowserdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet target = null;
                target = (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet)get_store().add_element_user(SESSIONBROWSERDASHLET$78);
                return target;
            }
        }
        
        /**
         * Removes the ith "sessionbrowserdashlet" element
         */
        public void removeSessionbrowserdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SESSIONBROWSERDASHLET$78, i);
            }
        }
        
        /**
         * Gets array of all "statusoverviewdashlet" elements
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet[] getStatusoverviewdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUSOVERVIEWDASHLET$80, targetList);
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet[] result = new noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "statusoverviewdashlet" element
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet getStatusoverviewdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().find_element_user(STATUSOVERVIEWDASHLET$80, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "statusoverviewdashlet" element
         */
        public int sizeOfStatusoverviewdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSOVERVIEWDASHLET$80);
            }
        }
        
        /**
         * Sets array of all "statusoverviewdashlet" element
         */
        public void setStatusoverviewdashletArray(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet[] statusoverviewdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(statusoverviewdashletArray, STATUSOVERVIEWDASHLET$80);
            }
        }
        
        /**
         * Sets ith "statusoverviewdashlet" element
         */
        public void setStatusoverviewdashletArray(int i, noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet statusoverviewdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().find_element_user(STATUSOVERVIEWDASHLET$80, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(statusoverviewdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "statusoverviewdashlet" element
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet insertNewStatusoverviewdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().insert_element_user(STATUSOVERVIEWDASHLET$80, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "statusoverviewdashlet" element
         */
        public noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet addNewStatusoverviewdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet target = null;
                target = (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet)get_store().add_element_user(STATUSOVERVIEWDASHLET$80);
                return target;
            }
        }
        
        /**
         * Removes the ith "statusoverviewdashlet" element
         */
        public void removeStatusoverviewdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSOVERVIEWDASHLET$80, i);
            }
        }
        
        /**
         * Gets array of all "taggedwebrequestsdashlet" elements
         */
        public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet[] getTaggedwebrequestsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TAGGEDWEBREQUESTSDASHLET$82, targetList);
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet[] result = new noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "taggedwebrequestsdashlet" element
         */
        public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet getTaggedwebrequestsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet target = null;
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().find_element_user(TAGGEDWEBREQUESTSDASHLET$82, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "taggedwebrequestsdashlet" element
         */
        public int sizeOfTaggedwebrequestsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAGGEDWEBREQUESTSDASHLET$82);
            }
        }
        
        /**
         * Sets array of all "taggedwebrequestsdashlet" element
         */
        public void setTaggedwebrequestsdashletArray(noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet[] taggedwebrequestsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(taggedwebrequestsdashletArray, TAGGEDWEBREQUESTSDASHLET$82);
            }
        }
        
        /**
         * Sets ith "taggedwebrequestsdashlet" element
         */
        public void setTaggedwebrequestsdashletArray(int i, noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet taggedwebrequestsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet target = null;
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().find_element_user(TAGGEDWEBREQUESTSDASHLET$82, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(taggedwebrequestsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "taggedwebrequestsdashlet" element
         */
        public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet insertNewTaggedwebrequestsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet target = null;
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().insert_element_user(TAGGEDWEBREQUESTSDASHLET$82, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "taggedwebrequestsdashlet" element
         */
        public noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet addNewTaggedwebrequestsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet target = null;
                target = (noNamespace.TaggedwebrequestsdashletDocument.Taggedwebrequestsdashlet)get_store().add_element_user(TAGGEDWEBREQUESTSDASHLET$82);
                return target;
            }
        }
        
        /**
         * Removes the ith "taggedwebrequestsdashlet" element
         */
        public void removeTaggedwebrequestsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAGGEDWEBREQUESTSDASHLET$82, i);
            }
        }
        
        /**
         * Gets array of all "tasksmonitorsdashlet" elements
         */
        public noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet[] getTasksmonitorsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TASKSMONITORSDASHLET$84, targetList);
                noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet[] result = new noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tasksmonitorsdashlet" element
         */
        public noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet getTasksmonitorsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet target = null;
                target = (noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet)get_store().find_element_user(TASKSMONITORSDASHLET$84, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tasksmonitorsdashlet" element
         */
        public int sizeOfTasksmonitorsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TASKSMONITORSDASHLET$84);
            }
        }
        
        /**
         * Sets array of all "tasksmonitorsdashlet" element
         */
        public void setTasksmonitorsdashletArray(noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet[] tasksmonitorsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tasksmonitorsdashletArray, TASKSMONITORSDASHLET$84);
            }
        }
        
        /**
         * Sets ith "tasksmonitorsdashlet" element
         */
        public void setTasksmonitorsdashletArray(int i, noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet tasksmonitorsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet target = null;
                target = (noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet)get_store().find_element_user(TASKSMONITORSDASHLET$84, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tasksmonitorsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tasksmonitorsdashlet" element
         */
        public noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet insertNewTasksmonitorsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet target = null;
                target = (noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet)get_store().insert_element_user(TASKSMONITORSDASHLET$84, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tasksmonitorsdashlet" element
         */
        public noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet addNewTasksmonitorsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet target = null;
                target = (noNamespace.TasksmonitorsdashletDocument.Tasksmonitorsdashlet)get_store().add_element_user(TASKSMONITORSDASHLET$84);
                return target;
            }
        }
        
        /**
         * Removes the ith "tasksmonitorsdashlet" element
         */
        public void removeTasksmonitorsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TASKSMONITORSDASHLET$84, i);
            }
        }
        
        /**
         * Gets array of all "testautomation" elements
         */
        public noNamespace.TestautomationDocument.Testautomation[] getTestautomationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TESTAUTOMATION$86, targetList);
                noNamespace.TestautomationDocument.Testautomation[] result = new noNamespace.TestautomationDocument.Testautomation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "testautomation" element
         */
        public noNamespace.TestautomationDocument.Testautomation getTestautomationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation target = null;
                target = (noNamespace.TestautomationDocument.Testautomation)get_store().find_element_user(TESTAUTOMATION$86, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "testautomation" element
         */
        public int sizeOfTestautomationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTAUTOMATION$86);
            }
        }
        
        /**
         * Sets array of all "testautomation" element
         */
        public void setTestautomationArray(noNamespace.TestautomationDocument.Testautomation[] testautomationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(testautomationArray, TESTAUTOMATION$86);
            }
        }
        
        /**
         * Sets ith "testautomation" element
         */
        public void setTestautomationArray(int i, noNamespace.TestautomationDocument.Testautomation testautomation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation target = null;
                target = (noNamespace.TestautomationDocument.Testautomation)get_store().find_element_user(TESTAUTOMATION$86, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(testautomation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testautomation" element
         */
        public noNamespace.TestautomationDocument.Testautomation insertNewTestautomation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation target = null;
                target = (noNamespace.TestautomationDocument.Testautomation)get_store().insert_element_user(TESTAUTOMATION$86, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testautomation" element
         */
        public noNamespace.TestautomationDocument.Testautomation addNewTestautomation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TestautomationDocument.Testautomation target = null;
                target = (noNamespace.TestautomationDocument.Testautomation)get_store().add_element_user(TESTAUTOMATION$86);
                return target;
            }
        }
        
        /**
         * Removes the ith "testautomation" element
         */
        public void removeTestautomation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTAUTOMATION$86, i);
            }
        }
        
        /**
         * Gets array of all "textandmeasure" elements
         */
        public noNamespace.TextandmeasureDocument.Textandmeasure[] getTextandmeasureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXTANDMEASURE$88, targetList);
                noNamespace.TextandmeasureDocument.Textandmeasure[] result = new noNamespace.TextandmeasureDocument.Textandmeasure[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "textandmeasure" element
         */
        public noNamespace.TextandmeasureDocument.Textandmeasure getTextandmeasureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextandmeasureDocument.Textandmeasure target = null;
                target = (noNamespace.TextandmeasureDocument.Textandmeasure)get_store().find_element_user(TEXTANDMEASURE$88, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "textandmeasure" element
         */
        public int sizeOfTextandmeasureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTANDMEASURE$88);
            }
        }
        
        /**
         * Sets array of all "textandmeasure" element
         */
        public void setTextandmeasureArray(noNamespace.TextandmeasureDocument.Textandmeasure[] textandmeasureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textandmeasureArray, TEXTANDMEASURE$88);
            }
        }
        
        /**
         * Sets ith "textandmeasure" element
         */
        public void setTextandmeasureArray(int i, noNamespace.TextandmeasureDocument.Textandmeasure textandmeasure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextandmeasureDocument.Textandmeasure target = null;
                target = (noNamespace.TextandmeasureDocument.Textandmeasure)get_store().find_element_user(TEXTANDMEASURE$88, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(textandmeasure);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "textandmeasure" element
         */
        public noNamespace.TextandmeasureDocument.Textandmeasure insertNewTextandmeasure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextandmeasureDocument.Textandmeasure target = null;
                target = (noNamespace.TextandmeasureDocument.Textandmeasure)get_store().insert_element_user(TEXTANDMEASURE$88, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "textandmeasure" element
         */
        public noNamespace.TextandmeasureDocument.Textandmeasure addNewTextandmeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextandmeasureDocument.Textandmeasure target = null;
                target = (noNamespace.TextandmeasureDocument.Textandmeasure)get_store().add_element_user(TEXTANDMEASURE$88);
                return target;
            }
        }
        
        /**
         * Removes the ith "textandmeasure" element
         */
        public void removeTextandmeasure(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTANDMEASURE$88, i);
            }
        }
        
        /**
         * Gets array of all "textdashlet" elements
         */
        public noNamespace.TextdashletDocument.Textdashlet[] getTextdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXTDASHLET$90, targetList);
                noNamespace.TextdashletDocument.Textdashlet[] result = new noNamespace.TextdashletDocument.Textdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "textdashlet" element
         */
        public noNamespace.TextdashletDocument.Textdashlet getTextdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextdashletDocument.Textdashlet target = null;
                target = (noNamespace.TextdashletDocument.Textdashlet)get_store().find_element_user(TEXTDASHLET$90, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "textdashlet" element
         */
        public int sizeOfTextdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTDASHLET$90);
            }
        }
        
        /**
         * Sets array of all "textdashlet" element
         */
        public void setTextdashletArray(noNamespace.TextdashletDocument.Textdashlet[] textdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(textdashletArray, TEXTDASHLET$90);
            }
        }
        
        /**
         * Sets ith "textdashlet" element
         */
        public void setTextdashletArray(int i, noNamespace.TextdashletDocument.Textdashlet textdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextdashletDocument.Textdashlet target = null;
                target = (noNamespace.TextdashletDocument.Textdashlet)get_store().find_element_user(TEXTDASHLET$90, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(textdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "textdashlet" element
         */
        public noNamespace.TextdashletDocument.Textdashlet insertNewTextdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextdashletDocument.Textdashlet target = null;
                target = (noNamespace.TextdashletDocument.Textdashlet)get_store().insert_element_user(TEXTDASHLET$90, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "textdashlet" element
         */
        public noNamespace.TextdashletDocument.Textdashlet addNewTextdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextdashletDocument.Textdashlet target = null;
                target = (noNamespace.TextdashletDocument.Textdashlet)get_store().add_element_user(TEXTDASHLET$90);
                return target;
            }
        }
        
        /**
         * Removes the ith "textdashlet" element
         */
        public void removeTextdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTDASHLET$90, i);
            }
        }
        
        /**
         * Gets array of all "useractionsdashlet" elements
         */
        public noNamespace.UseractionsdashletDocument.Useractionsdashlet[] getUseractionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(USERACTIONSDASHLET$92, targetList);
                noNamespace.UseractionsdashletDocument.Useractionsdashlet[] result = new noNamespace.UseractionsdashletDocument.Useractionsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "useractionsdashlet" element
         */
        public noNamespace.UseractionsdashletDocument.Useractionsdashlet getUseractionsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionsdashletDocument.Useractionsdashlet target = null;
                target = (noNamespace.UseractionsdashletDocument.Useractionsdashlet)get_store().find_element_user(USERACTIONSDASHLET$92, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "useractionsdashlet" element
         */
        public int sizeOfUseractionsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USERACTIONSDASHLET$92);
            }
        }
        
        /**
         * Sets array of all "useractionsdashlet" element
         */
        public void setUseractionsdashletArray(noNamespace.UseractionsdashletDocument.Useractionsdashlet[] useractionsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(useractionsdashletArray, USERACTIONSDASHLET$92);
            }
        }
        
        /**
         * Sets ith "useractionsdashlet" element
         */
        public void setUseractionsdashletArray(int i, noNamespace.UseractionsdashletDocument.Useractionsdashlet useractionsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionsdashletDocument.Useractionsdashlet target = null;
                target = (noNamespace.UseractionsdashletDocument.Useractionsdashlet)get_store().find_element_user(USERACTIONSDASHLET$92, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(useractionsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "useractionsdashlet" element
         */
        public noNamespace.UseractionsdashletDocument.Useractionsdashlet insertNewUseractionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionsdashletDocument.Useractionsdashlet target = null;
                target = (noNamespace.UseractionsdashletDocument.Useractionsdashlet)get_store().insert_element_user(USERACTIONSDASHLET$92, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "useractionsdashlet" element
         */
        public noNamespace.UseractionsdashletDocument.Useractionsdashlet addNewUseractionsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionsdashletDocument.Useractionsdashlet target = null;
                target = (noNamespace.UseractionsdashletDocument.Useractionsdashlet)get_store().add_element_user(USERACTIONSDASHLET$92);
                return target;
            }
        }
        
        /**
         * Removes the ith "useractionsdashlet" element
         */
        public void removeUseractionsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USERACTIONSDASHLET$92, i);
            }
        }
        
        /**
         * Gets array of all "visitsdashlet" elements
         */
        public noNamespace.VisitsdashletDocument.Visitsdashlet[] getVisitsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VISITSDASHLET$94, targetList);
                noNamespace.VisitsdashletDocument.Visitsdashlet[] result = new noNamespace.VisitsdashletDocument.Visitsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "visitsdashlet" element
         */
        public noNamespace.VisitsdashletDocument.Visitsdashlet getVisitsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitsdashletDocument.Visitsdashlet target = null;
                target = (noNamespace.VisitsdashletDocument.Visitsdashlet)get_store().find_element_user(VISITSDASHLET$94, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "visitsdashlet" element
         */
        public int sizeOfVisitsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VISITSDASHLET$94);
            }
        }
        
        /**
         * Sets array of all "visitsdashlet" element
         */
        public void setVisitsdashletArray(noNamespace.VisitsdashletDocument.Visitsdashlet[] visitsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(visitsdashletArray, VISITSDASHLET$94);
            }
        }
        
        /**
         * Sets ith "visitsdashlet" element
         */
        public void setVisitsdashletArray(int i, noNamespace.VisitsdashletDocument.Visitsdashlet visitsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitsdashletDocument.Visitsdashlet target = null;
                target = (noNamespace.VisitsdashletDocument.Visitsdashlet)get_store().find_element_user(VISITSDASHLET$94, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(visitsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "visitsdashlet" element
         */
        public noNamespace.VisitsdashletDocument.Visitsdashlet insertNewVisitsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitsdashletDocument.Visitsdashlet target = null;
                target = (noNamespace.VisitsdashletDocument.Visitsdashlet)get_store().insert_element_user(VISITSDASHLET$94, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "visitsdashlet" element
         */
        public noNamespace.VisitsdashletDocument.Visitsdashlet addNewVisitsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitsdashletDocument.Visitsdashlet target = null;
                target = (noNamespace.VisitsdashletDocument.Visitsdashlet)get_store().add_element_user(VISITSDASHLET$94);
                return target;
            }
        }
        
        /**
         * Removes the ith "visitsdashlet" element
         */
        public void removeVisitsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VISITSDASHLET$94, i);
            }
        }
        
        /**
         * Gets array of all "webrequestsdashlet" elements
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet[] getWebrequestsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WEBREQUESTSDASHLET$96, targetList);
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet[] result = new noNamespace.WebrequestsdashletDocument.Webrequestsdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "webrequestsdashlet" element
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet getWebrequestsdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().find_element_user(WEBREQUESTSDASHLET$96, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "webrequestsdashlet" element
         */
        public int sizeOfWebrequestsdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBREQUESTSDASHLET$96);
            }
        }
        
        /**
         * Sets array of all "webrequestsdashlet" element
         */
        public void setWebrequestsdashletArray(noNamespace.WebrequestsdashletDocument.Webrequestsdashlet[] webrequestsdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(webrequestsdashletArray, WEBREQUESTSDASHLET$96);
            }
        }
        
        /**
         * Sets ith "webrequestsdashlet" element
         */
        public void setWebrequestsdashletArray(int i, noNamespace.WebrequestsdashletDocument.Webrequestsdashlet webrequestsdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().find_element_user(WEBREQUESTSDASHLET$96, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(webrequestsdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "webrequestsdashlet" element
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet insertNewWebrequestsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().insert_element_user(WEBREQUESTSDASHLET$96, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "webrequestsdashlet" element
         */
        public noNamespace.WebrequestsdashletDocument.Webrequestsdashlet addNewWebrequestsdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebrequestsdashletDocument.Webrequestsdashlet target = null;
                target = (noNamespace.WebrequestsdashletDocument.Webrequestsdashlet)get_store().add_element_user(WEBREQUESTSDASHLET$96);
                return target;
            }
        }
        
        /**
         * Removes the ith "webrequestsdashlet" element
         */
        public void removeWebrequestsdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBREQUESTSDASHLET$96, i);
            }
        }
        
        /**
         * Gets array of all "webservicesdashlet" elements
         */
        public noNamespace.WebservicesdashletDocument.Webservicesdashlet[] getWebservicesdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WEBSERVICESDASHLET$98, targetList);
                noNamespace.WebservicesdashletDocument.Webservicesdashlet[] result = new noNamespace.WebservicesdashletDocument.Webservicesdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "webservicesdashlet" element
         */
        public noNamespace.WebservicesdashletDocument.Webservicesdashlet getWebservicesdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebservicesdashletDocument.Webservicesdashlet target = null;
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().find_element_user(WEBSERVICESDASHLET$98, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "webservicesdashlet" element
         */
        public int sizeOfWebservicesdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBSERVICESDASHLET$98);
            }
        }
        
        /**
         * Sets array of all "webservicesdashlet" element
         */
        public void setWebservicesdashletArray(noNamespace.WebservicesdashletDocument.Webservicesdashlet[] webservicesdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(webservicesdashletArray, WEBSERVICESDASHLET$98);
            }
        }
        
        /**
         * Sets ith "webservicesdashlet" element
         */
        public void setWebservicesdashletArray(int i, noNamespace.WebservicesdashletDocument.Webservicesdashlet webservicesdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebservicesdashletDocument.Webservicesdashlet target = null;
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().find_element_user(WEBSERVICESDASHLET$98, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(webservicesdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "webservicesdashlet" element
         */
        public noNamespace.WebservicesdashletDocument.Webservicesdashlet insertNewWebservicesdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebservicesdashletDocument.Webservicesdashlet target = null;
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().insert_element_user(WEBSERVICESDASHLET$98, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "webservicesdashlet" element
         */
        public noNamespace.WebservicesdashletDocument.Webservicesdashlet addNewWebservicesdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WebservicesdashletDocument.Webservicesdashlet target = null;
                target = (noNamespace.WebservicesdashletDocument.Webservicesdashlet)get_store().add_element_user(WEBSERVICESDASHLET$98);
                return target;
            }
        }
        
        /**
         * Removes the ith "webservicesdashlet" element
         */
        public void removeWebservicesdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBSERVICESDASHLET$98, i);
            }
        }
        
        /**
         * Gets array of all "worldmapdashlet" elements
         */
        public noNamespace.WorldmapdashletDocument.Worldmapdashlet[] getWorldmapdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WORLDMAPDASHLET$100, targetList);
                noNamespace.WorldmapdashletDocument.Worldmapdashlet[] result = new noNamespace.WorldmapdashletDocument.Worldmapdashlet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "worldmapdashlet" element
         */
        public noNamespace.WorldmapdashletDocument.Worldmapdashlet getWorldmapdashletArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WorldmapdashletDocument.Worldmapdashlet target = null;
                target = (noNamespace.WorldmapdashletDocument.Worldmapdashlet)get_store().find_element_user(WORLDMAPDASHLET$100, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "worldmapdashlet" element
         */
        public int sizeOfWorldmapdashletArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORLDMAPDASHLET$100);
            }
        }
        
        /**
         * Sets array of all "worldmapdashlet" element
         */
        public void setWorldmapdashletArray(noNamespace.WorldmapdashletDocument.Worldmapdashlet[] worldmapdashletArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(worldmapdashletArray, WORLDMAPDASHLET$100);
            }
        }
        
        /**
         * Sets ith "worldmapdashlet" element
         */
        public void setWorldmapdashletArray(int i, noNamespace.WorldmapdashletDocument.Worldmapdashlet worldmapdashlet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WorldmapdashletDocument.Worldmapdashlet target = null;
                target = (noNamespace.WorldmapdashletDocument.Worldmapdashlet)get_store().find_element_user(WORLDMAPDASHLET$100, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(worldmapdashlet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "worldmapdashlet" element
         */
        public noNamespace.WorldmapdashletDocument.Worldmapdashlet insertNewWorldmapdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WorldmapdashletDocument.Worldmapdashlet target = null;
                target = (noNamespace.WorldmapdashletDocument.Worldmapdashlet)get_store().insert_element_user(WORLDMAPDASHLET$100, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "worldmapdashlet" element
         */
        public noNamespace.WorldmapdashletDocument.Worldmapdashlet addNewWorldmapdashlet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.WorldmapdashletDocument.Worldmapdashlet target = null;
                target = (noNamespace.WorldmapdashletDocument.Worldmapdashlet)get_store().add_element_user(WORLDMAPDASHLET$100);
                return target;
            }
        }
        
        /**
         * Removes the ith "worldmapdashlet" element
         */
        public void removeWorldmapdashlet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORLDMAPDASHLET$100, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$102);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$102);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$102);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$102);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$104);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$104);
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
                return get_store().find_attribute_user(DESCRIPTION$104) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$104);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$104);
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
                get_store().remove_attribute(DESCRIPTION$104);
            }
        }
    }
}
