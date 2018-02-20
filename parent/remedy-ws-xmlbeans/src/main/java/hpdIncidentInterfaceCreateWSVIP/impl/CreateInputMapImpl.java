/*
 * XML Type:  CreateInputMap
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.CreateInputMap
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP.impl;
/**
 * An XML CreateInputMap(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is a complex type.
 */
public class CreateInputMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceCreateWSVIP.CreateInputMap
{
    private static final long serialVersionUID = 1L;
    
    public CreateInputMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGNEDGROUP$0 = 
        new javax.xml.namespace.QName("", "Assigned_Group");
    private static final javax.xml.namespace.QName ASSIGNEDGROUPSHIFTNAME$2 = 
        new javax.xml.namespace.QName("", "Assigned_Group_Shift_Name");
    private static final javax.xml.namespace.QName ASSIGNEDSUPPORTCOMPANY$4 = 
        new javax.xml.namespace.QName("", "Assigned_Support_Company");
    private static final javax.xml.namespace.QName ASSIGNEDSUPPORTORGANIZATION$6 = 
        new javax.xml.namespace.QName("", "Assigned_Support_Organization");
    private static final javax.xml.namespace.QName ASSIGNEE$8 = 
        new javax.xml.namespace.QName("", "Assignee");
    private static final javax.xml.namespace.QName CATEGORIZATIONTIER1$10 = 
        new javax.xml.namespace.QName("", "Categorization_Tier_1");
    private static final javax.xml.namespace.QName CATEGORIZATIONTIER2$12 = 
        new javax.xml.namespace.QName("", "Categorization_Tier_2");
    private static final javax.xml.namespace.QName CATEGORIZATIONTIER3$14 = 
        new javax.xml.namespace.QName("", "Categorization_Tier_3");
    private static final javax.xml.namespace.QName CINAME$16 = 
        new javax.xml.namespace.QName("", "CI_Name");
    private static final javax.xml.namespace.QName CLOSUREMANUFACTURER$18 = 
        new javax.xml.namespace.QName("", "Closure_Manufacturer");
    private static final javax.xml.namespace.QName CLOSUREPRODUCTCATEGORYTIER1$20 = 
        new javax.xml.namespace.QName("", "Closure_Product_Category_Tier1");
    private static final javax.xml.namespace.QName CLOSUREPRODUCTCATEGORYTIER2$22 = 
        new javax.xml.namespace.QName("", "Closure_Product_Category_Tier2");
    private static final javax.xml.namespace.QName CLOSUREPRODUCTCATEGORYTIER3$24 = 
        new javax.xml.namespace.QName("", "Closure_Product_Category_Tier3");
    private static final javax.xml.namespace.QName CLOSUREPRODUCTMODELVERSION$26 = 
        new javax.xml.namespace.QName("", "Closure_Product_Model_Version");
    private static final javax.xml.namespace.QName CLOSUREPRODUCTNAME$28 = 
        new javax.xml.namespace.QName("", "Closure_Product_Name");
    private static final javax.xml.namespace.QName DEPARTMENT$30 = 
        new javax.xml.namespace.QName("", "Department");
    private static final javax.xml.namespace.QName FIRSTNAME$32 = 
        new javax.xml.namespace.QName("", "First_Name");
    private static final javax.xml.namespace.QName IMPACT$34 = 
        new javax.xml.namespace.QName("", "Impact");
    private static final javax.xml.namespace.QName LASTNAME$36 = 
        new javax.xml.namespace.QName("", "Last_Name");
    private static final javax.xml.namespace.QName LOOKUPKEYWORD$38 = 
        new javax.xml.namespace.QName("", "Lookup_Keyword");
    private static final javax.xml.namespace.QName MANUFACTURER$40 = 
        new javax.xml.namespace.QName("", "Manufacturer");
    private static final javax.xml.namespace.QName PRODUCTCATEGORIZATIONTIER1$42 = 
        new javax.xml.namespace.QName("", "Product_Categorization_Tier_1");
    private static final javax.xml.namespace.QName PRODUCTCATEGORIZATIONTIER2$44 = 
        new javax.xml.namespace.QName("", "Product_Categorization_Tier_2");
    private static final javax.xml.namespace.QName PRODUCTCATEGORIZATIONTIER3$46 = 
        new javax.xml.namespace.QName("", "Product_Categorization_Tier_3");
    private static final javax.xml.namespace.QName PRODUCTMODELVERSION$48 = 
        new javax.xml.namespace.QName("", "Product_Model_Version");
    private static final javax.xml.namespace.QName PRODUCTNAME$50 = 
        new javax.xml.namespace.QName("", "Product_Name");
    private static final javax.xml.namespace.QName REPORTEDSOURCE$52 = 
        new javax.xml.namespace.QName("", "Reported_Source");
    private static final javax.xml.namespace.QName RESOLUTION$54 = 
        new javax.xml.namespace.QName("", "Resolution");
    private static final javax.xml.namespace.QName RESOLUTIONCATEGORYTIER1$56 = 
        new javax.xml.namespace.QName("", "Resolution_Category_Tier_1");
    private static final javax.xml.namespace.QName RESOLUTIONCATEGORYTIER2$58 = 
        new javax.xml.namespace.QName("", "Resolution_Category_Tier_2");
    private static final javax.xml.namespace.QName RESOLUTIONCATEGORYTIER3$60 = 
        new javax.xml.namespace.QName("", "Resolution_Category_Tier_3");
    private static final javax.xml.namespace.QName SERVICETYPE$62 = 
        new javax.xml.namespace.QName("", "Service_Type");
    private static final javax.xml.namespace.QName STATUS$64 = 
        new javax.xml.namespace.QName("", "Status");
    private static final javax.xml.namespace.QName ACTION$66 = 
        new javax.xml.namespace.QName("", "Action");
    private static final javax.xml.namespace.QName CREATEREQUEST$68 = 
        new javax.xml.namespace.QName("", "Create_Request");
    private static final javax.xml.namespace.QName SUMMARY$70 = 
        new javax.xml.namespace.QName("", "Summary");
    private static final javax.xml.namespace.QName NOTES$72 = 
        new javax.xml.namespace.QName("", "Notes");
    private static final javax.xml.namespace.QName URGENCY$74 = 
        new javax.xml.namespace.QName("", "Urgency");
    private static final javax.xml.namespace.QName WORKINFOSUMMARY$76 = 
        new javax.xml.namespace.QName("", "Work_Info_Summary");
    private static final javax.xml.namespace.QName WORKINFONOTES$78 = 
        new javax.xml.namespace.QName("", "Work_Info_Notes");
    private static final javax.xml.namespace.QName WORKINFOTYPE$80 = 
        new javax.xml.namespace.QName("", "Work_Info_Type");
    private static final javax.xml.namespace.QName WORKINFODATE$82 = 
        new javax.xml.namespace.QName("", "Work_Info_Date");
    private static final javax.xml.namespace.QName WORKINFOSOURCE$84 = 
        new javax.xml.namespace.QName("", "Work_Info_Source");
    private static final javax.xml.namespace.QName WORKINFOLOCKED$86 = 
        new javax.xml.namespace.QName("", "Work_Info_Locked");
    private static final javax.xml.namespace.QName WORKINFOVIEWACCESS$88 = 
        new javax.xml.namespace.QName("", "Work_Info_View_Access");
    private static final javax.xml.namespace.QName MIDDLEINITIAL$90 = 
        new javax.xml.namespace.QName("", "Middle_Initial");
    private static final javax.xml.namespace.QName STATUSREASON$92 = 
        new javax.xml.namespace.QName("", "Status_Reason");
    private static final javax.xml.namespace.QName DIRECTCONTACTFIRSTNAME$94 = 
        new javax.xml.namespace.QName("", "Direct_Contact_First_Name");
    private static final javax.xml.namespace.QName DIRECTCONTACTMIDDLEINITIAL$96 = 
        new javax.xml.namespace.QName("", "Direct_Contact_Middle_Initial");
    private static final javax.xml.namespace.QName DIRECTCONTACTLASTNAME$98 = 
        new javax.xml.namespace.QName("", "Direct_Contact_Last_Name");
    private static final javax.xml.namespace.QName TEMPLATEID$100 = 
        new javax.xml.namespace.QName("", "TemplateID");
    private static final javax.xml.namespace.QName SERVICECI$102 = 
        new javax.xml.namespace.QName("", "ServiceCI");
    private static final javax.xml.namespace.QName SERVICECIRECONID$104 = 
        new javax.xml.namespace.QName("", "ServiceCI_ReconID");
    private static final javax.xml.namespace.QName HPDCI$106 = 
        new javax.xml.namespace.QName("", "HPD_CI");
    private static final javax.xml.namespace.QName HPDCIRECONID$108 = 
        new javax.xml.namespace.QName("", "HPD_CI_ReconID");
    private static final javax.xml.namespace.QName HPDCIFORMNAME$110 = 
        new javax.xml.namespace.QName("", "HPD_CI_FormName");
    private static final javax.xml.namespace.QName WORKINFOATTACHMENT1NAME$112 = 
        new javax.xml.namespace.QName("", "WorkInfoAttachment1Name");
    private static final javax.xml.namespace.QName WORKINFOATTACHMENT1DATA$114 = 
        new javax.xml.namespace.QName("", "WorkInfoAttachment1Data");
    private static final javax.xml.namespace.QName WORKINFOATTACHMENT1ORIGSIZE$116 = 
        new javax.xml.namespace.QName("", "WorkInfoAttachment1OrigSize");
    private static final javax.xml.namespace.QName SEDEINT$118 = 
        new javax.xml.namespace.QName("", "Sede_Int");
    private static final javax.xml.namespace.QName CLASSIFICAZIONE$120 = 
        new javax.xml.namespace.QName("", "Classificazione");
    private static final javax.xml.namespace.QName ADRBE$122 = 
        new javax.xml.namespace.QName("", "ADR_BE");
    private static final javax.xml.namespace.QName CLASSE$124 = 
        new javax.xml.namespace.QName("", "Classe");
    private static final javax.xml.namespace.QName PIN$126 = 
        new javax.xml.namespace.QName("", "PIN");
    private static final javax.xml.namespace.QName NUMEROCHIAMANTE$128 = 
        new javax.xml.namespace.QName("", "Numero_Chiamante");
    private static final javax.xml.namespace.QName TIPOASSISTENZA$130 = 
        new javax.xml.namespace.QName("", "TipoAssistenza");
    private static final javax.xml.namespace.QName SISTEMASORGENTE$132 = 
        new javax.xml.namespace.QName("", "Sistema_sorgente");
    
    
    /**
     * Gets the "Assigned_Group" element
     */
    public java.lang.String getAssignedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Assigned_Group" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Assigned_Group" element
     */
    public boolean isSetAssignedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEDGROUP$0) != 0;
        }
    }
    
    /**
     * Sets the "Assigned_Group" element
     */
    public void setAssignedGroup(java.lang.String assignedGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDGROUP$0);
            }
            target.setStringValue(assignedGroup);
        }
    }
    
    /**
     * Sets (as xml) the "Assigned_Group" element
     */
    public void xsetAssignedGroup(org.apache.xmlbeans.XmlString assignedGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDGROUP$0);
            }
            target.set(assignedGroup);
        }
    }
    
    /**
     * Unsets the "Assigned_Group" element
     */
    public void unsetAssignedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEDGROUP$0, 0);
        }
    }
    
    /**
     * Gets the "Assigned_Group_Shift_Name" element
     */
    public java.lang.String getAssignedGroupShiftName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Assigned_Group_Shift_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignedGroupShiftName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Assigned_Group_Shift_Name" element
     */
    public boolean isSetAssignedGroupShiftName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEDGROUPSHIFTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Assigned_Group_Shift_Name" element
     */
    public void setAssignedGroupShiftName(java.lang.String assignedGroupShiftName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDGROUPSHIFTNAME$2);
            }
            target.setStringValue(assignedGroupShiftName);
        }
    }
    
    /**
     * Sets (as xml) the "Assigned_Group_Shift_Name" element
     */
    public void xsetAssignedGroupShiftName(org.apache.xmlbeans.XmlString assignedGroupShiftName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDGROUPSHIFTNAME$2);
            }
            target.set(assignedGroupShiftName);
        }
    }
    
    /**
     * Unsets the "Assigned_Group_Shift_Name" element
     */
    public void unsetAssignedGroupShiftName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEDGROUPSHIFTNAME$2, 0);
        }
    }
    
    /**
     * Gets the "Assigned_Support_Company" element
     */
    public java.lang.String getAssignedSupportCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Assigned_Support_Company" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignedSupportCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Assigned_Support_Company" element
     */
    public boolean isSetAssignedSupportCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEDSUPPORTCOMPANY$4) != 0;
        }
    }
    
    /**
     * Sets the "Assigned_Support_Company" element
     */
    public void setAssignedSupportCompany(java.lang.String assignedSupportCompany)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDSUPPORTCOMPANY$4);
            }
            target.setStringValue(assignedSupportCompany);
        }
    }
    
    /**
     * Sets (as xml) the "Assigned_Support_Company" element
     */
    public void xsetAssignedSupportCompany(org.apache.xmlbeans.XmlString assignedSupportCompany)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDSUPPORTCOMPANY$4);
            }
            target.set(assignedSupportCompany);
        }
    }
    
    /**
     * Unsets the "Assigned_Support_Company" element
     */
    public void unsetAssignedSupportCompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEDSUPPORTCOMPANY$4, 0);
        }
    }
    
    /**
     * Gets the "Assigned_Support_Organization" element
     */
    public java.lang.String getAssignedSupportOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Assigned_Support_Organization" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignedSupportOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Assigned_Support_Organization" element
     */
    public boolean isSetAssignedSupportOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEDSUPPORTORGANIZATION$6) != 0;
        }
    }
    
    /**
     * Sets the "Assigned_Support_Organization" element
     */
    public void setAssignedSupportOrganization(java.lang.String assignedSupportOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDSUPPORTORGANIZATION$6);
            }
            target.setStringValue(assignedSupportOrganization);
        }
    }
    
    /**
     * Sets (as xml) the "Assigned_Support_Organization" element
     */
    public void xsetAssignedSupportOrganization(org.apache.xmlbeans.XmlString assignedSupportOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDSUPPORTORGANIZATION$6);
            }
            target.set(assignedSupportOrganization);
        }
    }
    
    /**
     * Unsets the "Assigned_Support_Organization" element
     */
    public void unsetAssignedSupportOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEDSUPPORTORGANIZATION$6, 0);
        }
    }
    
    /**
     * Gets the "Assignee" element
     */
    public java.lang.String getAssignee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Assignee" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Assignee" element
     */
    public boolean isSetAssignee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEE$8) != 0;
        }
    }
    
    /**
     * Sets the "Assignee" element
     */
    public void setAssignee(java.lang.String assignee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEE$8);
            }
            target.setStringValue(assignee);
        }
    }
    
    /**
     * Sets (as xml) the "Assignee" element
     */
    public void xsetAssignee(org.apache.xmlbeans.XmlString assignee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEE$8);
            }
            target.set(assignee);
        }
    }
    
    /**
     * Unsets the "Assignee" element
     */
    public void unsetAssignee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEE$8, 0);
        }
    }
    
    /**
     * Gets the "Categorization_Tier_1" element
     */
    public java.lang.String getCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Categorization_Tier_1" element
     */
    public org.apache.xmlbeans.XmlString xgetCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Categorization_Tier_1" element
     */
    public boolean isSetCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORIZATIONTIER1$10) != 0;
        }
    }
    
    /**
     * Sets the "Categorization_Tier_1" element
     */
    public void setCategorizationTier1(java.lang.String categorizationTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIZATIONTIER1$10);
            }
            target.setStringValue(categorizationTier1);
        }
    }
    
    /**
     * Sets (as xml) the "Categorization_Tier_1" element
     */
    public void xsetCategorizationTier1(org.apache.xmlbeans.XmlString categorizationTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIZATIONTIER1$10);
            }
            target.set(categorizationTier1);
        }
    }
    
    /**
     * Unsets the "Categorization_Tier_1" element
     */
    public void unsetCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORIZATIONTIER1$10, 0);
        }
    }
    
    /**
     * Gets the "Categorization_Tier_2" element
     */
    public java.lang.String getCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Categorization_Tier_2" element
     */
    public org.apache.xmlbeans.XmlString xgetCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Categorization_Tier_2" element
     */
    public boolean isSetCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORIZATIONTIER2$12) != 0;
        }
    }
    
    /**
     * Sets the "Categorization_Tier_2" element
     */
    public void setCategorizationTier2(java.lang.String categorizationTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIZATIONTIER2$12);
            }
            target.setStringValue(categorizationTier2);
        }
    }
    
    /**
     * Sets (as xml) the "Categorization_Tier_2" element
     */
    public void xsetCategorizationTier2(org.apache.xmlbeans.XmlString categorizationTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIZATIONTIER2$12);
            }
            target.set(categorizationTier2);
        }
    }
    
    /**
     * Unsets the "Categorization_Tier_2" element
     */
    public void unsetCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORIZATIONTIER2$12, 0);
        }
    }
    
    /**
     * Gets the "Categorization_Tier_3" element
     */
    public java.lang.String getCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Categorization_Tier_3" element
     */
    public org.apache.xmlbeans.XmlString xgetCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Categorization_Tier_3" element
     */
    public boolean isSetCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORIZATIONTIER3$14) != 0;
        }
    }
    
    /**
     * Sets the "Categorization_Tier_3" element
     */
    public void setCategorizationTier3(java.lang.String categorizationTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIZATIONTIER3$14);
            }
            target.setStringValue(categorizationTier3);
        }
    }
    
    /**
     * Sets (as xml) the "Categorization_Tier_3" element
     */
    public void xsetCategorizationTier3(org.apache.xmlbeans.XmlString categorizationTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIZATIONTIER3$14);
            }
            target.set(categorizationTier3);
        }
    }
    
    /**
     * Unsets the "Categorization_Tier_3" element
     */
    public void unsetCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORIZATIONTIER3$14, 0);
        }
    }
    
    /**
     * Gets the "CI_Name" element
     */
    public java.lang.String getCIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CINAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CI_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetCIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CINAME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "CI_Name" element
     */
    public boolean isSetCIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CINAME$16) != 0;
        }
    }
    
    /**
     * Sets the "CI_Name" element
     */
    public void setCIName(java.lang.String ciName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CINAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CINAME$16);
            }
            target.setStringValue(ciName);
        }
    }
    
    /**
     * Sets (as xml) the "CI_Name" element
     */
    public void xsetCIName(org.apache.xmlbeans.XmlString ciName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CINAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CINAME$16);
            }
            target.set(ciName);
        }
    }
    
    /**
     * Unsets the "CI_Name" element
     */
    public void unsetCIName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CINAME$16, 0);
        }
    }
    
    /**
     * Gets the "Closure_Manufacturer" element
     */
    public java.lang.String getClosureManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Closure_Manufacturer" element
     */
    public org.apache.xmlbeans.XmlString xgetClosureManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "Closure_Manufacturer" element
     */
    public boolean isSetClosureManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSUREMANUFACTURER$18) != 0;
        }
    }
    
    /**
     * Sets the "Closure_Manufacturer" element
     */
    public void setClosureManufacturer(java.lang.String closureManufacturer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREMANUFACTURER$18);
            }
            target.setStringValue(closureManufacturer);
        }
    }
    
    /**
     * Sets (as xml) the "Closure_Manufacturer" element
     */
    public void xsetClosureManufacturer(org.apache.xmlbeans.XmlString closureManufacturer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREMANUFACTURER$18);
            }
            target.set(closureManufacturer);
        }
    }
    
    /**
     * Unsets the "Closure_Manufacturer" element
     */
    public void unsetClosureManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSUREMANUFACTURER$18, 0);
        }
    }
    
    /**
     * Gets the "Closure_Product_Category_Tier1" element
     */
    public java.lang.String getClosureProductCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Closure_Product_Category_Tier1" element
     */
    public org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Closure_Product_Category_Tier1" element
     */
    public boolean isSetClosureProductCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSUREPRODUCTCATEGORYTIER1$20) != 0;
        }
    }
    
    /**
     * Sets the "Closure_Product_Category_Tier1" element
     */
    public void setClosureProductCategoryTier1(java.lang.String closureProductCategoryTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER1$20);
            }
            target.setStringValue(closureProductCategoryTier1);
        }
    }
    
    /**
     * Sets (as xml) the "Closure_Product_Category_Tier1" element
     */
    public void xsetClosureProductCategoryTier1(org.apache.xmlbeans.XmlString closureProductCategoryTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER1$20);
            }
            target.set(closureProductCategoryTier1);
        }
    }
    
    /**
     * Unsets the "Closure_Product_Category_Tier1" element
     */
    public void unsetClosureProductCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
        }
    }
    
    /**
     * Gets the "Closure_Product_Category_Tier2" element
     */
    public java.lang.String getClosureProductCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Closure_Product_Category_Tier2" element
     */
    public org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "Closure_Product_Category_Tier2" element
     */
    public boolean isSetClosureProductCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSUREPRODUCTCATEGORYTIER2$22) != 0;
        }
    }
    
    /**
     * Sets the "Closure_Product_Category_Tier2" element
     */
    public void setClosureProductCategoryTier2(java.lang.String closureProductCategoryTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER2$22);
            }
            target.setStringValue(closureProductCategoryTier2);
        }
    }
    
    /**
     * Sets (as xml) the "Closure_Product_Category_Tier2" element
     */
    public void xsetClosureProductCategoryTier2(org.apache.xmlbeans.XmlString closureProductCategoryTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER2$22);
            }
            target.set(closureProductCategoryTier2);
        }
    }
    
    /**
     * Unsets the "Closure_Product_Category_Tier2" element
     */
    public void unsetClosureProductCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
        }
    }
    
    /**
     * Gets the "Closure_Product_Category_Tier3" element
     */
    public java.lang.String getClosureProductCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Closure_Product_Category_Tier3" element
     */
    public org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "Closure_Product_Category_Tier3" element
     */
    public boolean isSetClosureProductCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSUREPRODUCTCATEGORYTIER3$24) != 0;
        }
    }
    
    /**
     * Sets the "Closure_Product_Category_Tier3" element
     */
    public void setClosureProductCategoryTier3(java.lang.String closureProductCategoryTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER3$24);
            }
            target.setStringValue(closureProductCategoryTier3);
        }
    }
    
    /**
     * Sets (as xml) the "Closure_Product_Category_Tier3" element
     */
    public void xsetClosureProductCategoryTier3(org.apache.xmlbeans.XmlString closureProductCategoryTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER3$24);
            }
            target.set(closureProductCategoryTier3);
        }
    }
    
    /**
     * Unsets the "Closure_Product_Category_Tier3" element
     */
    public void unsetClosureProductCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
        }
    }
    
    /**
     * Gets the "Closure_Product_Model_Version" element
     */
    public java.lang.String getClosureProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Closure_Product_Model_Version" element
     */
    public org.apache.xmlbeans.XmlString xgetClosureProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "Closure_Product_Model_Version" element
     */
    public boolean isSetClosureProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSUREPRODUCTMODELVERSION$26) != 0;
        }
    }
    
    /**
     * Sets the "Closure_Product_Model_Version" element
     */
    public void setClosureProductModelVersion(java.lang.String closureProductModelVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTMODELVERSION$26);
            }
            target.setStringValue(closureProductModelVersion);
        }
    }
    
    /**
     * Sets (as xml) the "Closure_Product_Model_Version" element
     */
    public void xsetClosureProductModelVersion(org.apache.xmlbeans.XmlString closureProductModelVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTMODELVERSION$26);
            }
            target.set(closureProductModelVersion);
        }
    }
    
    /**
     * Unsets the "Closure_Product_Model_Version" element
     */
    public void unsetClosureProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSUREPRODUCTMODELVERSION$26, 0);
        }
    }
    
    /**
     * Gets the "Closure_Product_Name" element
     */
    public java.lang.String getClosureProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Closure_Product_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetClosureProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "Closure_Product_Name" element
     */
    public boolean isSetClosureProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSUREPRODUCTNAME$28) != 0;
        }
    }
    
    /**
     * Sets the "Closure_Product_Name" element
     */
    public void setClosureProductName(java.lang.String closureProductName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTNAME$28);
            }
            target.setStringValue(closureProductName);
        }
    }
    
    /**
     * Sets (as xml) the "Closure_Product_Name" element
     */
    public void xsetClosureProductName(org.apache.xmlbeans.XmlString closureProductName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTNAME$28);
            }
            target.set(closureProductName);
        }
    }
    
    /**
     * Unsets the "Closure_Product_Name" element
     */
    public void unsetClosureProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSUREPRODUCTNAME$28, 0);
        }
    }
    
    /**
     * Gets the "Department" element
     */
    public java.lang.String getDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTMENT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Department" element
     */
    public org.apache.xmlbeans.XmlString xgetDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTMENT$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "Department" element
     */
    public boolean isSetDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTMENT$30) != 0;
        }
    }
    
    /**
     * Sets the "Department" element
     */
    public void setDepartment(java.lang.String department)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTMENT$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTMENT$30);
            }
            target.setStringValue(department);
        }
    }
    
    /**
     * Sets (as xml) the "Department" element
     */
    public void xsetDepartment(org.apache.xmlbeans.XmlString department)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTMENT$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPARTMENT$30);
            }
            target.set(department);
        }
    }
    
    /**
     * Unsets the "Department" element
     */
    public void unsetDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTMENT$30, 0);
        }
    }
    
    /**
     * Gets the "First_Name" element
     */
    public java.lang.String getFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "First_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "First_Name" element
     */
    public void setFirstName(java.lang.String firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$32);
            }
            target.setStringValue(firstName);
        }
    }
    
    /**
     * Sets (as xml) the "First_Name" element
     */
    public void xsetFirstName(org.apache.xmlbeans.XmlString firstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$32);
            }
            target.set(firstName);
        }
    }
    
    /**
     * Gets the "Impact" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ImpactType.Enum getImpact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPACT$34, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.ImpactType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Impact" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ImpactType xgetImpact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ImpactType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ImpactType)get_store().find_element_user(IMPACT$34, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Impact" element
     */
    public boolean isNilImpact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ImpactType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ImpactType)get_store().find_element_user(IMPACT$34, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Impact" element
     */
    public void setImpact(hpdIncidentInterfaceCreateWSVIP.ImpactType.Enum impact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPACT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPACT$34);
            }
            target.setEnumValue(impact);
        }
    }
    
    /**
     * Sets (as xml) the "Impact" element
     */
    public void xsetImpact(hpdIncidentInterfaceCreateWSVIP.ImpactType impact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ImpactType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ImpactType)get_store().find_element_user(IMPACT$34, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ImpactType)get_store().add_element_user(IMPACT$34);
            }
            target.set(impact);
        }
    }
    
    /**
     * Nils the "Impact" element
     */
    public void setNilImpact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ImpactType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ImpactType)get_store().find_element_user(IMPACT$34, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ImpactType)get_store().add_element_user(IMPACT$34);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Last_Name" element
     */
    public java.lang.String getLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Last_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Last_Name" element
     */
    public void setLastName(java.lang.String lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$36);
            }
            target.setStringValue(lastName);
        }
    }
    
    /**
     * Sets (as xml) the "Last_Name" element
     */
    public void xsetLastName(org.apache.xmlbeans.XmlString lastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$36);
            }
            target.set(lastName);
        }
    }
    
    /**
     * Gets the "Lookup_Keyword" element
     */
    public java.lang.String getLookupKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPKEYWORD$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Lookup_Keyword" element
     */
    public org.apache.xmlbeans.XmlString xgetLookupKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOOKUPKEYWORD$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "Lookup_Keyword" element
     */
    public boolean isSetLookupKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOKUPKEYWORD$38) != 0;
        }
    }
    
    /**
     * Sets the "Lookup_Keyword" element
     */
    public void setLookupKeyword(java.lang.String lookupKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPKEYWORD$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOOKUPKEYWORD$38);
            }
            target.setStringValue(lookupKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "Lookup_Keyword" element
     */
    public void xsetLookupKeyword(org.apache.xmlbeans.XmlString lookupKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOOKUPKEYWORD$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOOKUPKEYWORD$38);
            }
            target.set(lookupKeyword);
        }
    }
    
    /**
     * Unsets the "Lookup_Keyword" element
     */
    public void unsetLookupKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOKUPKEYWORD$38, 0);
        }
    }
    
    /**
     * Gets the "Manufacturer" element
     */
    public java.lang.String getManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURER$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Manufacturer" element
     */
    public org.apache.xmlbeans.XmlString xgetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURER$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "Manufacturer" element
     */
    public boolean isSetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURER$40) != 0;
        }
    }
    
    /**
     * Sets the "Manufacturer" element
     */
    public void setManufacturer(java.lang.String manufacturer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURER$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUFACTURER$40);
            }
            target.setStringValue(manufacturer);
        }
    }
    
    /**
     * Sets (as xml) the "Manufacturer" element
     */
    public void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURER$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUFACTURER$40);
            }
            target.set(manufacturer);
        }
    }
    
    /**
     * Unsets the "Manufacturer" element
     */
    public void unsetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURER$40, 0);
        }
    }
    
    /**
     * Gets the "Product_Categorization_Tier_1" element
     */
    public java.lang.String getProductCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Product_Categorization_Tier_1" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "Product_Categorization_Tier_1" element
     */
    public boolean isSetProductCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCATEGORIZATIONTIER1$42) != 0;
        }
    }
    
    /**
     * Sets the "Product_Categorization_Tier_1" element
     */
    public void setProductCategorizationTier1(java.lang.String productCategorizationTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER1$42);
            }
            target.setStringValue(productCategorizationTier1);
        }
    }
    
    /**
     * Sets (as xml) the "Product_Categorization_Tier_1" element
     */
    public void xsetProductCategorizationTier1(org.apache.xmlbeans.XmlString productCategorizationTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER1$42);
            }
            target.set(productCategorizationTier1);
        }
    }
    
    /**
     * Unsets the "Product_Categorization_Tier_1" element
     */
    public void unsetProductCategorizationTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCATEGORIZATIONTIER1$42, 0);
        }
    }
    
    /**
     * Gets the "Product_Categorization_Tier_2" element
     */
    public java.lang.String getProductCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Product_Categorization_Tier_2" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "Product_Categorization_Tier_2" element
     */
    public boolean isSetProductCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCATEGORIZATIONTIER2$44) != 0;
        }
    }
    
    /**
     * Sets the "Product_Categorization_Tier_2" element
     */
    public void setProductCategorizationTier2(java.lang.String productCategorizationTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER2$44);
            }
            target.setStringValue(productCategorizationTier2);
        }
    }
    
    /**
     * Sets (as xml) the "Product_Categorization_Tier_2" element
     */
    public void xsetProductCategorizationTier2(org.apache.xmlbeans.XmlString productCategorizationTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER2$44);
            }
            target.set(productCategorizationTier2);
        }
    }
    
    /**
     * Unsets the "Product_Categorization_Tier_2" element
     */
    public void unsetProductCategorizationTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCATEGORIZATIONTIER2$44, 0);
        }
    }
    
    /**
     * Gets the "Product_Categorization_Tier_3" element
     */
    public java.lang.String getProductCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Product_Categorization_Tier_3" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "Product_Categorization_Tier_3" element
     */
    public boolean isSetProductCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCATEGORIZATIONTIER3$46) != 0;
        }
    }
    
    /**
     * Sets the "Product_Categorization_Tier_3" element
     */
    public void setProductCategorizationTier3(java.lang.String productCategorizationTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER3$46);
            }
            target.setStringValue(productCategorizationTier3);
        }
    }
    
    /**
     * Sets (as xml) the "Product_Categorization_Tier_3" element
     */
    public void xsetProductCategorizationTier3(org.apache.xmlbeans.XmlString productCategorizationTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER3$46);
            }
            target.set(productCategorizationTier3);
        }
    }
    
    /**
     * Unsets the "Product_Categorization_Tier_3" element
     */
    public void unsetProductCategorizationTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCATEGORIZATIONTIER3$46, 0);
        }
    }
    
    /**
     * Gets the "Product_Model_Version" element
     */
    public java.lang.String getProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTMODELVERSION$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Product_Model_Version" element
     */
    public org.apache.xmlbeans.XmlString xgetProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTMODELVERSION$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "Product_Model_Version" element
     */
    public boolean isSetProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTMODELVERSION$48) != 0;
        }
    }
    
    /**
     * Sets the "Product_Model_Version" element
     */
    public void setProductModelVersion(java.lang.String productModelVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTMODELVERSION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTMODELVERSION$48);
            }
            target.setStringValue(productModelVersion);
        }
    }
    
    /**
     * Sets (as xml) the "Product_Model_Version" element
     */
    public void xsetProductModelVersion(org.apache.xmlbeans.XmlString productModelVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTMODELVERSION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTMODELVERSION$48);
            }
            target.set(productModelVersion);
        }
    }
    
    /**
     * Unsets the "Product_Model_Version" element
     */
    public void unsetProductModelVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTMODELVERSION$48, 0);
        }
    }
    
    /**
     * Gets the "Product_Name" element
     */
    public java.lang.String getProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Product_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "Product_Name" element
     */
    public boolean isSetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTNAME$50) != 0;
        }
    }
    
    /**
     * Sets the "Product_Name" element
     */
    public void setProductName(java.lang.String productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$50);
            }
            target.setStringValue(productName);
        }
    }
    
    /**
     * Sets (as xml) the "Product_Name" element
     */
    public void xsetProductName(org.apache.xmlbeans.XmlString productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$50);
            }
            target.set(productName);
        }
    }
    
    /**
     * Unsets the "Product_Name" element
     */
    public void unsetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTNAME$50, 0);
        }
    }
    
    /**
     * Gets the "Reported_Source" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ReportedSourceType.Enum getReportedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTEDSOURCE$52, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Reported_Source" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ReportedSourceType xgetReportedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ReportedSourceType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$52, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Reported_Source" element
     */
    public boolean isNilReportedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ReportedSourceType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$52, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Reported_Source" element
     */
    public void setReportedSource(hpdIncidentInterfaceCreateWSVIP.ReportedSourceType.Enum reportedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTEDSOURCE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTEDSOURCE$52);
            }
            target.setEnumValue(reportedSource);
        }
    }
    
    /**
     * Sets (as xml) the "Reported_Source" element
     */
    public void xsetReportedSource(hpdIncidentInterfaceCreateWSVIP.ReportedSourceType reportedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ReportedSourceType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$52, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType)get_store().add_element_user(REPORTEDSOURCE$52);
            }
            target.set(reportedSource);
        }
    }
    
    /**
     * Nils the "Reported_Source" element
     */
    public void setNilReportedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ReportedSourceType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$52, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ReportedSourceType)get_store().add_element_user(REPORTEDSOURCE$52);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Resolution" element
     */
    public java.lang.String getResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$54, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Resolution" element
     */
    public org.apache.xmlbeans.XmlString xgetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTION$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "Resolution" element
     */
    public boolean isSetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOLUTION$54) != 0;
        }
    }
    
    /**
     * Sets the "Resolution" element
     */
    public void setResolution(java.lang.String resolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTION$54);
            }
            target.setStringValue(resolution);
        }
    }
    
    /**
     * Sets (as xml) the "Resolution" element
     */
    public void xsetResolution(org.apache.xmlbeans.XmlString resolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTION$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTION$54);
            }
            target.set(resolution);
        }
    }
    
    /**
     * Unsets the "Resolution" element
     */
    public void unsetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOLUTION$54, 0);
        }
    }
    
    /**
     * Gets the "Resolution_Category_Tier_1" element
     */
    public java.lang.String getResolutionCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER1$56, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Resolution_Category_Tier_1" element
     */
    public org.apache.xmlbeans.XmlString xgetResolutionCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER1$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "Resolution_Category_Tier_1" element
     */
    public boolean isSetResolutionCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOLUTIONCATEGORYTIER1$56) != 0;
        }
    }
    
    /**
     * Sets the "Resolution_Category_Tier_1" element
     */
    public void setResolutionCategoryTier1(java.lang.String resolutionCategoryTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER1$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTIONCATEGORYTIER1$56);
            }
            target.setStringValue(resolutionCategoryTier1);
        }
    }
    
    /**
     * Sets (as xml) the "Resolution_Category_Tier_1" element
     */
    public void xsetResolutionCategoryTier1(org.apache.xmlbeans.XmlString resolutionCategoryTier1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER1$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTIONCATEGORYTIER1$56);
            }
            target.set(resolutionCategoryTier1);
        }
    }
    
    /**
     * Unsets the "Resolution_Category_Tier_1" element
     */
    public void unsetResolutionCategoryTier1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOLUTIONCATEGORYTIER1$56, 0);
        }
    }
    
    /**
     * Gets the "Resolution_Category_Tier_2" element
     */
    public java.lang.String getResolutionCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$58, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Resolution_Category_Tier_2" element
     */
    public org.apache.xmlbeans.XmlString xgetResolutionCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "Resolution_Category_Tier_2" element
     */
    public boolean isSetResolutionCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOLUTIONCATEGORYTIER2$58) != 0;
        }
    }
    
    /**
     * Sets the "Resolution_Category_Tier_2" element
     */
    public void setResolutionCategoryTier2(java.lang.String resolutionCategoryTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTIONCATEGORYTIER2$58);
            }
            target.setStringValue(resolutionCategoryTier2);
        }
    }
    
    /**
     * Sets (as xml) the "Resolution_Category_Tier_2" element
     */
    public void xsetResolutionCategoryTier2(org.apache.xmlbeans.XmlString resolutionCategoryTier2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTIONCATEGORYTIER2$58);
            }
            target.set(resolutionCategoryTier2);
        }
    }
    
    /**
     * Unsets the "Resolution_Category_Tier_2" element
     */
    public void unsetResolutionCategoryTier2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOLUTIONCATEGORYTIER2$58, 0);
        }
    }
    
    /**
     * Gets the "Resolution_Category_Tier_3" element
     */
    public java.lang.String getResolutionCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$60, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Resolution_Category_Tier_3" element
     */
    public org.apache.xmlbeans.XmlString xgetResolutionCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "Resolution_Category_Tier_3" element
     */
    public boolean isSetResolutionCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOLUTIONCATEGORYTIER3$60) != 0;
        }
    }
    
    /**
     * Sets the "Resolution_Category_Tier_3" element
     */
    public void setResolutionCategoryTier3(java.lang.String resolutionCategoryTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTIONCATEGORYTIER3$60);
            }
            target.setStringValue(resolutionCategoryTier3);
        }
    }
    
    /**
     * Sets (as xml) the "Resolution_Category_Tier_3" element
     */
    public void xsetResolutionCategoryTier3(org.apache.xmlbeans.XmlString resolutionCategoryTier3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTIONCATEGORYTIER3$60);
            }
            target.set(resolutionCategoryTier3);
        }
    }
    
    /**
     * Unsets the "Resolution_Category_Tier_3" element
     */
    public void unsetResolutionCategoryTier3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOLUTIONCATEGORYTIER3$60, 0);
        }
    }
    
    /**
     * Gets the "Service_Type" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ServiceTypeType.Enum getServiceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPE$62, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.ServiceTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Service_Type" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ServiceTypeType xgetServiceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ServiceTypeType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ServiceTypeType)get_store().find_element_user(SERVICETYPE$62, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Service_Type" element
     */
    public boolean isNilServiceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ServiceTypeType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ServiceTypeType)get_store().find_element_user(SERVICETYPE$62, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Service_Type" element
     */
    public void setServiceType(hpdIncidentInterfaceCreateWSVIP.ServiceTypeType.Enum serviceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPE$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICETYPE$62);
            }
            target.setEnumValue(serviceType);
        }
    }
    
    /**
     * Sets (as xml) the "Service_Type" element
     */
    public void xsetServiceType(hpdIncidentInterfaceCreateWSVIP.ServiceTypeType serviceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ServiceTypeType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ServiceTypeType)get_store().find_element_user(SERVICETYPE$62, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ServiceTypeType)get_store().add_element_user(SERVICETYPE$62);
            }
            target.set(serviceType);
        }
    }
    
    /**
     * Nils the "Service_Type" element
     */
    public void setNilServiceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ServiceTypeType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ServiceTypeType)get_store().find_element_user(SERVICETYPE$62, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ServiceTypeType)get_store().add_element_user(SERVICETYPE$62);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public hpdIncidentInterfaceCreateWSVIP.StatusType.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$64, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.StatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public hpdIncidentInterfaceCreateWSVIP.StatusType xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.StatusType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.StatusType)get_store().find_element_user(STATUS$64, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(hpdIncidentInterfaceCreateWSVIP.StatusType.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$64);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(hpdIncidentInterfaceCreateWSVIP.StatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.StatusType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.StatusType)get_store().find_element_user(STATUS$64, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.StatusType)get_store().add_element_user(STATUS$64);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "Action" element
     */
    public java.lang.String getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$66, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Action" element
     */
    public org.apache.xmlbeans.XmlString xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$66, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Action" element
     */
    public void setAction(java.lang.String action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$66);
            }
            target.setStringValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "Action" element
     */
    public void xsetAction(org.apache.xmlbeans.XmlString action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTION$66);
            }
            target.set(action);
        }
    }
    
    /**
     * Gets the "Create_Request" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateRequestType.Enum getCreateRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEREQUEST$68, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.CreateRequestType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Create_Request" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateRequestType xgetCreateRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateRequestType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateRequestType)get_store().find_element_user(CREATEREQUEST$68, 0);
            return target;
        }
    }
    
    /**
     * True if has "Create_Request" element
     */
    public boolean isSetCreateRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEREQUEST$68) != 0;
        }
    }
    
    /**
     * Sets the "Create_Request" element
     */
    public void setCreateRequest(hpdIncidentInterfaceCreateWSVIP.CreateRequestType.Enum createRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEREQUEST$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEREQUEST$68);
            }
            target.setEnumValue(createRequest);
        }
    }
    
    /**
     * Sets (as xml) the "Create_Request" element
     */
    public void xsetCreateRequest(hpdIncidentInterfaceCreateWSVIP.CreateRequestType createRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateRequestType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateRequestType)get_store().find_element_user(CREATEREQUEST$68, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.CreateRequestType)get_store().add_element_user(CREATEREQUEST$68);
            }
            target.set(createRequest);
        }
    }
    
    /**
     * Unsets the "Create_Request" element
     */
    public void unsetCreateRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEREQUEST$68, 0);
        }
    }
    
    /**
     * Gets the "Summary" element
     */
    public java.lang.String getSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$70, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Summary" element
     */
    public org.apache.xmlbeans.XmlString xgetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$70, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Summary" element
     */
    public void setSummary(java.lang.String summary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUMMARY$70);
            }
            target.setStringValue(summary);
        }
    }
    
    /**
     * Sets (as xml) the "Summary" element
     */
    public void xsetSummary(org.apache.xmlbeans.XmlString summary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUMMARY$70);
            }
            target.set(summary);
        }
    }
    
    /**
     * Gets the "Notes" element
     */
    public java.lang.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$72, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Notes" element
     */
    public org.apache.xmlbeans.XmlString xgetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$72, 0);
            return target;
        }
    }
    
    /**
     * True if has "Notes" element
     */
    public boolean isSetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$72) != 0;
        }
    }
    
    /**
     * Sets the "Notes" element
     */
    public void setNotes(java.lang.String notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTES$72);
            }
            target.setStringValue(notes);
        }
    }
    
    /**
     * Sets (as xml) the "Notes" element
     */
    public void xsetNotes(org.apache.xmlbeans.XmlString notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTES$72);
            }
            target.set(notes);
        }
    }
    
    /**
     * Unsets the "Notes" element
     */
    public void unsetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$72, 0);
        }
    }
    
    /**
     * Gets the "Urgency" element
     */
    public hpdIncidentInterfaceCreateWSVIP.UrgencyType.Enum getUrgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URGENCY$74, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.UrgencyType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Urgency" element
     */
    public hpdIncidentInterfaceCreateWSVIP.UrgencyType xgetUrgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.UrgencyType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.UrgencyType)get_store().find_element_user(URGENCY$74, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Urgency" element
     */
    public boolean isNilUrgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.UrgencyType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.UrgencyType)get_store().find_element_user(URGENCY$74, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Urgency" element
     */
    public void setUrgency(hpdIncidentInterfaceCreateWSVIP.UrgencyType.Enum urgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URGENCY$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URGENCY$74);
            }
            target.setEnumValue(urgency);
        }
    }
    
    /**
     * Sets (as xml) the "Urgency" element
     */
    public void xsetUrgency(hpdIncidentInterfaceCreateWSVIP.UrgencyType urgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.UrgencyType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.UrgencyType)get_store().find_element_user(URGENCY$74, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.UrgencyType)get_store().add_element_user(URGENCY$74);
            }
            target.set(urgency);
        }
    }
    
    /**
     * Nils the "Urgency" element
     */
    public void setNilUrgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.UrgencyType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.UrgencyType)get_store().find_element_user(URGENCY$74, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.UrgencyType)get_store().add_element_user(URGENCY$74);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "Work_Info_Summary" element
     */
    public java.lang.String getWorkInfoSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSUMMARY$76, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Work_Info_Summary" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkInfoSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOSUMMARY$76, 0);
            return target;
        }
    }
    
    /**
     * True if has "Work_Info_Summary" element
     */
    public boolean isSetWorkInfoSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOSUMMARY$76) != 0;
        }
    }
    
    /**
     * Sets the "Work_Info_Summary" element
     */
    public void setWorkInfoSummary(java.lang.String workInfoSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSUMMARY$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOSUMMARY$76);
            }
            target.setStringValue(workInfoSummary);
        }
    }
    
    /**
     * Sets (as xml) the "Work_Info_Summary" element
     */
    public void xsetWorkInfoSummary(org.apache.xmlbeans.XmlString workInfoSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOSUMMARY$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFOSUMMARY$76);
            }
            target.set(workInfoSummary);
        }
    }
    
    /**
     * Unsets the "Work_Info_Summary" element
     */
    public void unsetWorkInfoSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOSUMMARY$76, 0);
        }
    }
    
    /**
     * Gets the "Work_Info_Notes" element
     */
    public java.lang.String getWorkInfoNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFONOTES$78, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Work_Info_Notes" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkInfoNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFONOTES$78, 0);
            return target;
        }
    }
    
    /**
     * True if has "Work_Info_Notes" element
     */
    public boolean isSetWorkInfoNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFONOTES$78) != 0;
        }
    }
    
    /**
     * Sets the "Work_Info_Notes" element
     */
    public void setWorkInfoNotes(java.lang.String workInfoNotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFONOTES$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFONOTES$78);
            }
            target.setStringValue(workInfoNotes);
        }
    }
    
    /**
     * Sets (as xml) the "Work_Info_Notes" element
     */
    public void xsetWorkInfoNotes(org.apache.xmlbeans.XmlString workInfoNotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFONOTES$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFONOTES$78);
            }
            target.set(workInfoNotes);
        }
    }
    
    /**
     * Unsets the "Work_Info_Notes" element
     */
    public void unsetWorkInfoNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFONOTES$78, 0);
        }
    }
    
    /**
     * Gets the "Work_Info_Type" element
     */
    public hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType.Enum getWorkInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOTYPE$80, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Work_Info_Type" element
     */
    public hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType xgetWorkInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType)get_store().find_element_user(WORKINFOTYPE$80, 0);
            return target;
        }
    }
    
    /**
     * True if has "Work_Info_Type" element
     */
    public boolean isSetWorkInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOTYPE$80) != 0;
        }
    }
    
    /**
     * Sets the "Work_Info_Type" element
     */
    public void setWorkInfoType(hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType.Enum workInfoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOTYPE$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOTYPE$80);
            }
            target.setEnumValue(workInfoType);
        }
    }
    
    /**
     * Sets (as xml) the "Work_Info_Type" element
     */
    public void xsetWorkInfoType(hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType workInfoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType)get_store().find_element_user(WORKINFOTYPE$80, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoTypeType)get_store().add_element_user(WORKINFOTYPE$80);
            }
            target.set(workInfoType);
        }
    }
    
    /**
     * Unsets the "Work_Info_Type" element
     */
    public void unsetWorkInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOTYPE$80, 0);
        }
    }
    
    /**
     * Gets the "Work_Info_Date" element
     */
    public java.util.Calendar getWorkInfoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFODATE$82, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Work_Info_Date" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetWorkInfoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WORKINFODATE$82, 0);
            return target;
        }
    }
    
    /**
     * True if has "Work_Info_Date" element
     */
    public boolean isSetWorkInfoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFODATE$82) != 0;
        }
    }
    
    /**
     * Sets the "Work_Info_Date" element
     */
    public void setWorkInfoDate(java.util.Calendar workInfoDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFODATE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFODATE$82);
            }
            target.setCalendarValue(workInfoDate);
        }
    }
    
    /**
     * Sets (as xml) the "Work_Info_Date" element
     */
    public void xsetWorkInfoDate(org.apache.xmlbeans.XmlDateTime workInfoDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WORKINFODATE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WORKINFODATE$82);
            }
            target.set(workInfoDate);
        }
    }
    
    /**
     * Unsets the "Work_Info_Date" element
     */
    public void unsetWorkInfoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFODATE$82, 0);
        }
    }
    
    /**
     * Gets the "Work_Info_Source" element
     */
    public hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType.Enum getWorkInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSOURCE$84, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Work_Info_Source" element
     */
    public hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType xgetWorkInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType)get_store().find_element_user(WORKINFOSOURCE$84, 0);
            return target;
        }
    }
    
    /**
     * True if has "Work_Info_Source" element
     */
    public boolean isSetWorkInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOSOURCE$84) != 0;
        }
    }
    
    /**
     * Sets the "Work_Info_Source" element
     */
    public void setWorkInfoSource(hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType.Enum workInfoSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSOURCE$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOSOURCE$84);
            }
            target.setEnumValue(workInfoSource);
        }
    }
    
    /**
     * Sets (as xml) the "Work_Info_Source" element
     */
    public void xsetWorkInfoSource(hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType workInfoSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType)get_store().find_element_user(WORKINFOSOURCE$84, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoSourceType)get_store().add_element_user(WORKINFOSOURCE$84);
            }
            target.set(workInfoSource);
        }
    }
    
    /**
     * Unsets the "Work_Info_Source" element
     */
    public void unsetWorkInfoSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOSOURCE$84, 0);
        }
    }
    
    /**
     * Gets the "Work_Info_Locked" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateRequestType.Enum getWorkInfoLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOLOCKED$86, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.CreateRequestType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Work_Info_Locked" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateRequestType xgetWorkInfoLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateRequestType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateRequestType)get_store().find_element_user(WORKINFOLOCKED$86, 0);
            return target;
        }
    }
    
    /**
     * True if has "Work_Info_Locked" element
     */
    public boolean isSetWorkInfoLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOLOCKED$86) != 0;
        }
    }
    
    /**
     * Sets the "Work_Info_Locked" element
     */
    public void setWorkInfoLocked(hpdIncidentInterfaceCreateWSVIP.CreateRequestType.Enum workInfoLocked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOLOCKED$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOLOCKED$86);
            }
            target.setEnumValue(workInfoLocked);
        }
    }
    
    /**
     * Sets (as xml) the "Work_Info_Locked" element
     */
    public void xsetWorkInfoLocked(hpdIncidentInterfaceCreateWSVIP.CreateRequestType workInfoLocked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateRequestType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateRequestType)get_store().find_element_user(WORKINFOLOCKED$86, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.CreateRequestType)get_store().add_element_user(WORKINFOLOCKED$86);
            }
            target.set(workInfoLocked);
        }
    }
    
    /**
     * Unsets the "Work_Info_Locked" element
     */
    public void unsetWorkInfoLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOLOCKED$86, 0);
        }
    }
    
    /**
     * Gets the "Work_Info_View_Access" element
     */
    public hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType.Enum getWorkInfoViewAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOVIEWACCESS$88, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Work_Info_View_Access" element
     */
    public hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType xgetWorkInfoViewAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType)get_store().find_element_user(WORKINFOVIEWACCESS$88, 0);
            return target;
        }
    }
    
    /**
     * True if has "Work_Info_View_Access" element
     */
    public boolean isSetWorkInfoViewAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOVIEWACCESS$88) != 0;
        }
    }
    
    /**
     * Sets the "Work_Info_View_Access" element
     */
    public void setWorkInfoViewAccess(hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType.Enum workInfoViewAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOVIEWACCESS$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOVIEWACCESS$88);
            }
            target.setEnumValue(workInfoViewAccess);
        }
    }
    
    /**
     * Sets (as xml) the "Work_Info_View_Access" element
     */
    public void xsetWorkInfoViewAccess(hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType workInfoViewAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType)get_store().find_element_user(WORKINFOVIEWACCESS$88, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.WorkInfoViewAccessType)get_store().add_element_user(WORKINFOVIEWACCESS$88);
            }
            target.set(workInfoViewAccess);
        }
    }
    
    /**
     * Unsets the "Work_Info_View_Access" element
     */
    public void unsetWorkInfoViewAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOVIEWACCESS$88, 0);
        }
    }
    
    /**
     * Gets the "Middle_Initial" element
     */
    public java.lang.String getMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLEINITIAL$90, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Middle_Initial" element
     */
    public org.apache.xmlbeans.XmlString xgetMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLEINITIAL$90, 0);
            return target;
        }
    }
    
    /**
     * True if has "Middle_Initial" element
     */
    public boolean isSetMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIDDLEINITIAL$90) != 0;
        }
    }
    
    /**
     * Sets the "Middle_Initial" element
     */
    public void setMiddleInitial(java.lang.String middleInitial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLEINITIAL$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLEINITIAL$90);
            }
            target.setStringValue(middleInitial);
        }
    }
    
    /**
     * Sets (as xml) the "Middle_Initial" element
     */
    public void xsetMiddleInitial(org.apache.xmlbeans.XmlString middleInitial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLEINITIAL$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDDLEINITIAL$90);
            }
            target.set(middleInitial);
        }
    }
    
    /**
     * Unsets the "Middle_Initial" element
     */
    public void unsetMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIDDLEINITIAL$90, 0);
        }
    }
    
    /**
     * Gets the "Status_Reason" element
     */
    public hpdIncidentInterfaceCreateWSVIP.StatusReasonType.Enum getStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSREASON$92, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.StatusReasonType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status_Reason" element
     */
    public hpdIncidentInterfaceCreateWSVIP.StatusReasonType xgetStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.StatusReasonType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.StatusReasonType)get_store().find_element_user(STATUSREASON$92, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status_Reason" element
     */
    public boolean isSetStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSREASON$92) != 0;
        }
    }
    
    /**
     * Sets the "Status_Reason" element
     */
    public void setStatusReason(hpdIncidentInterfaceCreateWSVIP.StatusReasonType.Enum statusReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSREASON$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSREASON$92);
            }
            target.setEnumValue(statusReason);
        }
    }
    
    /**
     * Sets (as xml) the "Status_Reason" element
     */
    public void xsetStatusReason(hpdIncidentInterfaceCreateWSVIP.StatusReasonType statusReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.StatusReasonType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.StatusReasonType)get_store().find_element_user(STATUSREASON$92, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.StatusReasonType)get_store().add_element_user(STATUSREASON$92);
            }
            target.set(statusReason);
        }
    }
    
    /**
     * Unsets the "Status_Reason" element
     */
    public void unsetStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSREASON$92, 0);
        }
    }
    
    /**
     * Gets the "Direct_Contact_First_Name" element
     */
    public java.lang.String getDirectContactFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTCONTACTFIRSTNAME$94, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Direct_Contact_First_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetDirectContactFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTCONTACTFIRSTNAME$94, 0);
            return target;
        }
    }
    
    /**
     * True if has "Direct_Contact_First_Name" element
     */
    public boolean isSetDirectContactFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTCONTACTFIRSTNAME$94) != 0;
        }
    }
    
    /**
     * Sets the "Direct_Contact_First_Name" element
     */
    public void setDirectContactFirstName(java.lang.String directContactFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTCONTACTFIRSTNAME$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTCONTACTFIRSTNAME$94);
            }
            target.setStringValue(directContactFirstName);
        }
    }
    
    /**
     * Sets (as xml) the "Direct_Contact_First_Name" element
     */
    public void xsetDirectContactFirstName(org.apache.xmlbeans.XmlString directContactFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTCONTACTFIRSTNAME$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTCONTACTFIRSTNAME$94);
            }
            target.set(directContactFirstName);
        }
    }
    
    /**
     * Unsets the "Direct_Contact_First_Name" element
     */
    public void unsetDirectContactFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTCONTACTFIRSTNAME$94, 0);
        }
    }
    
    /**
     * Gets the "Direct_Contact_Middle_Initial" element
     */
    public java.lang.String getDirectContactMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTCONTACTMIDDLEINITIAL$96, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Direct_Contact_Middle_Initial" element
     */
    public org.apache.xmlbeans.XmlString xgetDirectContactMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTCONTACTMIDDLEINITIAL$96, 0);
            return target;
        }
    }
    
    /**
     * True if has "Direct_Contact_Middle_Initial" element
     */
    public boolean isSetDirectContactMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTCONTACTMIDDLEINITIAL$96) != 0;
        }
    }
    
    /**
     * Sets the "Direct_Contact_Middle_Initial" element
     */
    public void setDirectContactMiddleInitial(java.lang.String directContactMiddleInitial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTCONTACTMIDDLEINITIAL$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTCONTACTMIDDLEINITIAL$96);
            }
            target.setStringValue(directContactMiddleInitial);
        }
    }
    
    /**
     * Sets (as xml) the "Direct_Contact_Middle_Initial" element
     */
    public void xsetDirectContactMiddleInitial(org.apache.xmlbeans.XmlString directContactMiddleInitial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTCONTACTMIDDLEINITIAL$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTCONTACTMIDDLEINITIAL$96);
            }
            target.set(directContactMiddleInitial);
        }
    }
    
    /**
     * Unsets the "Direct_Contact_Middle_Initial" element
     */
    public void unsetDirectContactMiddleInitial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTCONTACTMIDDLEINITIAL$96, 0);
        }
    }
    
    /**
     * Gets the "Direct_Contact_Last_Name" element
     */
    public java.lang.String getDirectContactLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTCONTACTLASTNAME$98, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Direct_Contact_Last_Name" element
     */
    public org.apache.xmlbeans.XmlString xgetDirectContactLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTCONTACTLASTNAME$98, 0);
            return target;
        }
    }
    
    /**
     * True if has "Direct_Contact_Last_Name" element
     */
    public boolean isSetDirectContactLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTCONTACTLASTNAME$98) != 0;
        }
    }
    
    /**
     * Sets the "Direct_Contact_Last_Name" element
     */
    public void setDirectContactLastName(java.lang.String directContactLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTCONTACTLASTNAME$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTCONTACTLASTNAME$98);
            }
            target.setStringValue(directContactLastName);
        }
    }
    
    /**
     * Sets (as xml) the "Direct_Contact_Last_Name" element
     */
    public void xsetDirectContactLastName(org.apache.xmlbeans.XmlString directContactLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTCONTACTLASTNAME$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTCONTACTLASTNAME$98);
            }
            target.set(directContactLastName);
        }
    }
    
    /**
     * Unsets the "Direct_Contact_Last_Name" element
     */
    public void unsetDirectContactLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTCONTACTLASTNAME$98, 0);
        }
    }
    
    /**
     * Gets the "TemplateID" element
     */
    public java.lang.String getTemplateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$100, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TemplateID" element
     */
    public org.apache.xmlbeans.XmlString xgetTemplateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPLATEID$100, 0);
            return target;
        }
    }
    
    /**
     * True if has "TemplateID" element
     */
    public boolean isSetTemplateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPLATEID$100) != 0;
        }
    }
    
    /**
     * Sets the "TemplateID" element
     */
    public void setTemplateID(java.lang.String templateID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATEID$100);
            }
            target.setStringValue(templateID);
        }
    }
    
    /**
     * Sets (as xml) the "TemplateID" element
     */
    public void xsetTemplateID(org.apache.xmlbeans.XmlString templateID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPLATEID$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEMPLATEID$100);
            }
            target.set(templateID);
        }
    }
    
    /**
     * Unsets the "TemplateID" element
     */
    public void unsetTemplateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPLATEID$100, 0);
        }
    }
    
    /**
     * Gets the "ServiceCI" element
     */
    public java.lang.String getServiceCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECI$102, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceCI" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECI$102, 0);
            return target;
        }
    }
    
    /**
     * True if has "ServiceCI" element
     */
    public boolean isSetServiceCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECI$102) != 0;
        }
    }
    
    /**
     * Sets the "ServiceCI" element
     */
    public void setServiceCI(java.lang.String serviceCI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECI$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECI$102);
            }
            target.setStringValue(serviceCI);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceCI" element
     */
    public void xsetServiceCI(org.apache.xmlbeans.XmlString serviceCI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECI$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECI$102);
            }
            target.set(serviceCI);
        }
    }
    
    /**
     * Unsets the "ServiceCI" element
     */
    public void unsetServiceCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECI$102, 0);
        }
    }
    
    /**
     * Gets the "ServiceCI_ReconID" element
     */
    public java.lang.String getServiceCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECIRECONID$104, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceCI_ReconID" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECIRECONID$104, 0);
            return target;
        }
    }
    
    /**
     * True if has "ServiceCI_ReconID" element
     */
    public boolean isSetServiceCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECIRECONID$104) != 0;
        }
    }
    
    /**
     * Sets the "ServiceCI_ReconID" element
     */
    public void setServiceCIReconID(java.lang.String serviceCIReconID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECIRECONID$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECIRECONID$104);
            }
            target.setStringValue(serviceCIReconID);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceCI_ReconID" element
     */
    public void xsetServiceCIReconID(org.apache.xmlbeans.XmlString serviceCIReconID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECIRECONID$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECIRECONID$104);
            }
            target.set(serviceCIReconID);
        }
    }
    
    /**
     * Unsets the "ServiceCI_ReconID" element
     */
    public void unsetServiceCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECIRECONID$104, 0);
        }
    }
    
    /**
     * Gets the "HPD_CI" element
     */
    public java.lang.String getHPDCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCI$106, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HPD_CI" element
     */
    public org.apache.xmlbeans.XmlString xgetHPDCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCI$106, 0);
            return target;
        }
    }
    
    /**
     * True if has "HPD_CI" element
     */
    public boolean isSetHPDCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HPDCI$106) != 0;
        }
    }
    
    /**
     * Sets the "HPD_CI" element
     */
    public void setHPDCI(java.lang.String hpdci)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCI$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HPDCI$106);
            }
            target.setStringValue(hpdci);
        }
    }
    
    /**
     * Sets (as xml) the "HPD_CI" element
     */
    public void xsetHPDCI(org.apache.xmlbeans.XmlString hpdci)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCI$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HPDCI$106);
            }
            target.set(hpdci);
        }
    }
    
    /**
     * Unsets the "HPD_CI" element
     */
    public void unsetHPDCI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HPDCI$106, 0);
        }
    }
    
    /**
     * Gets the "HPD_CI_ReconID" element
     */
    public java.lang.String getHPDCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIRECONID$108, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HPD_CI_ReconID" element
     */
    public org.apache.xmlbeans.XmlString xgetHPDCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIRECONID$108, 0);
            return target;
        }
    }
    
    /**
     * True if has "HPD_CI_ReconID" element
     */
    public boolean isSetHPDCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HPDCIRECONID$108) != 0;
        }
    }
    
    /**
     * Sets the "HPD_CI_ReconID" element
     */
    public void setHPDCIReconID(java.lang.String hpdciReconID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIRECONID$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HPDCIRECONID$108);
            }
            target.setStringValue(hpdciReconID);
        }
    }
    
    /**
     * Sets (as xml) the "HPD_CI_ReconID" element
     */
    public void xsetHPDCIReconID(org.apache.xmlbeans.XmlString hpdciReconID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIRECONID$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HPDCIRECONID$108);
            }
            target.set(hpdciReconID);
        }
    }
    
    /**
     * Unsets the "HPD_CI_ReconID" element
     */
    public void unsetHPDCIReconID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HPDCIRECONID$108, 0);
        }
    }
    
    /**
     * Gets the "HPD_CI_FormName" element
     */
    public java.lang.String getHPDCIFormName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIFORMNAME$110, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HPD_CI_FormName" element
     */
    public org.apache.xmlbeans.XmlString xgetHPDCIFormName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIFORMNAME$110, 0);
            return target;
        }
    }
    
    /**
     * True if has "HPD_CI_FormName" element
     */
    public boolean isSetHPDCIFormName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HPDCIFORMNAME$110) != 0;
        }
    }
    
    /**
     * Sets the "HPD_CI_FormName" element
     */
    public void setHPDCIFormName(java.lang.String hpdciFormName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIFORMNAME$110, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HPDCIFORMNAME$110);
            }
            target.setStringValue(hpdciFormName);
        }
    }
    
    /**
     * Sets (as xml) the "HPD_CI_FormName" element
     */
    public void xsetHPDCIFormName(org.apache.xmlbeans.XmlString hpdciFormName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIFORMNAME$110, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HPDCIFORMNAME$110);
            }
            target.set(hpdciFormName);
        }
    }
    
    /**
     * Unsets the "HPD_CI_FormName" element
     */
    public void unsetHPDCIFormName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HPDCIFORMNAME$110, 0);
        }
    }
    
    /**
     * Gets the "WorkInfoAttachment1Name" element
     */
    public java.lang.String getWorkInfoAttachment1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1NAME$112, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkInfoAttachment1Name" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkInfoAttachment1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT1NAME$112, 0);
            return target;
        }
    }
    
    /**
     * True if has "WorkInfoAttachment1Name" element
     */
    public boolean isSetWorkInfoAttachment1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOATTACHMENT1NAME$112) != 0;
        }
    }
    
    /**
     * Sets the "WorkInfoAttachment1Name" element
     */
    public void setWorkInfoAttachment1Name(java.lang.String workInfoAttachment1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1NAME$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT1NAME$112);
            }
            target.setStringValue(workInfoAttachment1Name);
        }
    }
    
    /**
     * Sets (as xml) the "WorkInfoAttachment1Name" element
     */
    public void xsetWorkInfoAttachment1Name(org.apache.xmlbeans.XmlString workInfoAttachment1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT1NAME$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFOATTACHMENT1NAME$112);
            }
            target.set(workInfoAttachment1Name);
        }
    }
    
    /**
     * Unsets the "WorkInfoAttachment1Name" element
     */
    public void unsetWorkInfoAttachment1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOATTACHMENT1NAME$112, 0);
        }
    }
    
    /**
     * Gets the "WorkInfoAttachment1Data" element
     */
    public byte[] getWorkInfoAttachment1Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1DATA$114, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkInfoAttachment1Data" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetWorkInfoAttachment1Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT1DATA$114, 0);
            return target;
        }
    }
    
    /**
     * True if has "WorkInfoAttachment1Data" element
     */
    public boolean isSetWorkInfoAttachment1Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOATTACHMENT1DATA$114) != 0;
        }
    }
    
    /**
     * Sets the "WorkInfoAttachment1Data" element
     */
    public void setWorkInfoAttachment1Data(byte[] workInfoAttachment1Data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1DATA$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT1DATA$114);
            }
            target.setByteArrayValue(workInfoAttachment1Data);
        }
    }
    
    /**
     * Sets (as xml) the "WorkInfoAttachment1Data" element
     */
    public void xsetWorkInfoAttachment1Data(org.apache.xmlbeans.XmlBase64Binary workInfoAttachment1Data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT1DATA$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(WORKINFOATTACHMENT1DATA$114);
            }
            target.set(workInfoAttachment1Data);
        }
    }
    
    /**
     * Unsets the "WorkInfoAttachment1Data" element
     */
    public void unsetWorkInfoAttachment1Data()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOATTACHMENT1DATA$114, 0);
        }
    }
    
    /**
     * Gets the "WorkInfoAttachment1OrigSize" element
     */
    public int getWorkInfoAttachment1OrigSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$116, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkInfoAttachment1OrigSize" element
     */
    public org.apache.xmlbeans.XmlInt xgetWorkInfoAttachment1OrigSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$116, 0);
            return target;
        }
    }
    
    /**
     * True if has "WorkInfoAttachment1OrigSize" element
     */
    public boolean isSetWorkInfoAttachment1OrigSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKINFOATTACHMENT1ORIGSIZE$116) != 0;
        }
    }
    
    /**
     * Sets the "WorkInfoAttachment1OrigSize" element
     */
    public void setWorkInfoAttachment1OrigSize(int workInfoAttachment1OrigSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$116, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT1ORIGSIZE$116);
            }
            target.setIntValue(workInfoAttachment1OrigSize);
        }
    }
    
    /**
     * Sets (as xml) the "WorkInfoAttachment1OrigSize" element
     */
    public void xsetWorkInfoAttachment1OrigSize(org.apache.xmlbeans.XmlInt workInfoAttachment1OrigSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$116, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WORKINFOATTACHMENT1ORIGSIZE$116);
            }
            target.set(workInfoAttachment1OrigSize);
        }
    }
    
    /**
     * Unsets the "WorkInfoAttachment1OrigSize" element
     */
    public void unsetWorkInfoAttachment1OrigSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKINFOATTACHMENT1ORIGSIZE$116, 0);
        }
    }
    
    /**
     * Gets the "Sede_Int" element
     */
    public hpdIncidentInterfaceCreateWSVIP.SedeIntType.Enum getSedeInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEDEINT$118, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.SedeIntType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sede_Int" element
     */
    public hpdIncidentInterfaceCreateWSVIP.SedeIntType xgetSedeInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.SedeIntType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.SedeIntType)get_store().find_element_user(SEDEINT$118, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Sede_Int" element
     */
    public boolean isNilSedeInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.SedeIntType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.SedeIntType)get_store().find_element_user(SEDEINT$118, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Sede_Int" element
     */
    public boolean isSetSedeInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEDEINT$118) != 0;
        }
    }
    
    /**
     * Sets the "Sede_Int" element
     */
    public void setSedeInt(hpdIncidentInterfaceCreateWSVIP.SedeIntType.Enum sedeInt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEDEINT$118, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEDEINT$118);
            }
            target.setEnumValue(sedeInt);
        }
    }
    
    /**
     * Sets (as xml) the "Sede_Int" element
     */
    public void xsetSedeInt(hpdIncidentInterfaceCreateWSVIP.SedeIntType sedeInt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.SedeIntType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.SedeIntType)get_store().find_element_user(SEDEINT$118, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.SedeIntType)get_store().add_element_user(SEDEINT$118);
            }
            target.set(sedeInt);
        }
    }
    
    /**
     * Nils the "Sede_Int" element
     */
    public void setNilSedeInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.SedeIntType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.SedeIntType)get_store().find_element_user(SEDEINT$118, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.SedeIntType)get_store().add_element_user(SEDEINT$118);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Sede_Int" element
     */
    public void unsetSedeInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEDEINT$118, 0);
        }
    }
    
    /**
     * Gets the "Classificazione" element
     */
    public java.lang.String getClassificazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSIFICAZIONE$120, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Classificazione" element
     */
    public org.apache.xmlbeans.XmlString xgetClassificazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSIFICAZIONE$120, 0);
            return target;
        }
    }
    
    /**
     * True if has "Classificazione" element
     */
    public boolean isSetClassificazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSIFICAZIONE$120) != 0;
        }
    }
    
    /**
     * Sets the "Classificazione" element
     */
    public void setClassificazione(java.lang.String classificazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSIFICAZIONE$120, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSIFICAZIONE$120);
            }
            target.setStringValue(classificazione);
        }
    }
    
    /**
     * Sets (as xml) the "Classificazione" element
     */
    public void xsetClassificazione(org.apache.xmlbeans.XmlString classificazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSIFICAZIONE$120, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSIFICAZIONE$120);
            }
            target.set(classificazione);
        }
    }
    
    /**
     * Unsets the "Classificazione" element
     */
    public void unsetClassificazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSIFICAZIONE$120, 0);
        }
    }
    
    /**
     * Gets the "ADR_BE" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ADRBEType.Enum getADRBE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRBE$122, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.ADRBEType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ADR_BE" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ADRBEType xgetADRBE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ADRBEType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ADRBEType)get_store().find_element_user(ADRBE$122, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ADR_BE" element
     */
    public boolean isNilADRBE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ADRBEType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ADRBEType)get_store().find_element_user(ADRBE$122, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ADR_BE" element
     */
    public boolean isSetADRBE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADRBE$122) != 0;
        }
    }
    
    /**
     * Sets the "ADR_BE" element
     */
    public void setADRBE(hpdIncidentInterfaceCreateWSVIP.ADRBEType.Enum adrbe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRBE$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADRBE$122);
            }
            target.setEnumValue(adrbe);
        }
    }
    
    /**
     * Sets (as xml) the "ADR_BE" element
     */
    public void xsetADRBE(hpdIncidentInterfaceCreateWSVIP.ADRBEType adrbe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ADRBEType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ADRBEType)get_store().find_element_user(ADRBE$122, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ADRBEType)get_store().add_element_user(ADRBE$122);
            }
            target.set(adrbe);
        }
    }
    
    /**
     * Nils the "ADR_BE" element
     */
    public void setNilADRBE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ADRBEType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ADRBEType)get_store().find_element_user(ADRBE$122, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ADRBEType)get_store().add_element_user(ADRBE$122);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ADR_BE" element
     */
    public void unsetADRBE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADRBE$122, 0);
        }
    }
    
    /**
     * Gets the "Classe" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ClasseType.Enum getClasse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSE$124, 0);
            if (target == null)
            {
                return null;
            }
            return (hpdIncidentInterfaceCreateWSVIP.ClasseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Classe" element
     */
    public hpdIncidentInterfaceCreateWSVIP.ClasseType xgetClasse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ClasseType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ClasseType)get_store().find_element_user(CLASSE$124, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "Classe" element
     */
    public boolean isNilClasse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ClasseType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ClasseType)get_store().find_element_user(CLASSE$124, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Classe" element
     */
    public boolean isSetClasse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASSE$124) != 0;
        }
    }
    
    /**
     * Sets the "Classe" element
     */
    public void setClasse(hpdIncidentInterfaceCreateWSVIP.ClasseType.Enum classe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSE$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSE$124);
            }
            target.setEnumValue(classe);
        }
    }
    
    /**
     * Sets (as xml) the "Classe" element
     */
    public void xsetClasse(hpdIncidentInterfaceCreateWSVIP.ClasseType classe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ClasseType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ClasseType)get_store().find_element_user(CLASSE$124, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ClasseType)get_store().add_element_user(CLASSE$124);
            }
            target.set(classe);
        }
    }
    
    /**
     * Nils the "Classe" element
     */
    public void setNilClasse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.ClasseType target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.ClasseType)get_store().find_element_user(CLASSE$124, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.ClasseType)get_store().add_element_user(CLASSE$124);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Classe" element
     */
    public void unsetClasse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASSE$124, 0);
        }
    }
    
    /**
     * Gets the "PIN" element
     */
    public java.lang.String getPIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIN$126, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PIN" element
     */
    public org.apache.xmlbeans.XmlString xgetPIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PIN$126, 0);
            return target;
        }
    }
    
    /**
     * True if has "PIN" element
     */
    public boolean isSetPIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIN$126) != 0;
        }
    }
    
    /**
     * Sets the "PIN" element
     */
    public void setPIN(java.lang.String pin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIN$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PIN$126);
            }
            target.setStringValue(pin);
        }
    }
    
    /**
     * Sets (as xml) the "PIN" element
     */
    public void xsetPIN(org.apache.xmlbeans.XmlString pin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PIN$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PIN$126);
            }
            target.set(pin);
        }
    }
    
    /**
     * Unsets the "PIN" element
     */
    public void unsetPIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIN$126, 0);
        }
    }
    
    /**
     * Gets the "Numero_Chiamante" element
     */
    public java.lang.String getNumeroChiamante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCHIAMANTE$128, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Numero_Chiamante" element
     */
    public org.apache.xmlbeans.XmlString xgetNumeroChiamante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROCHIAMANTE$128, 0);
            return target;
        }
    }
    
    /**
     * True if has "Numero_Chiamante" element
     */
    public boolean isSetNumeroChiamante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMEROCHIAMANTE$128) != 0;
        }
    }
    
    /**
     * Sets the "Numero_Chiamante" element
     */
    public void setNumeroChiamante(java.lang.String numeroChiamante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCHIAMANTE$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROCHIAMANTE$128);
            }
            target.setStringValue(numeroChiamante);
        }
    }
    
    /**
     * Sets (as xml) the "Numero_Chiamante" element
     */
    public void xsetNumeroChiamante(org.apache.xmlbeans.XmlString numeroChiamante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROCHIAMANTE$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMEROCHIAMANTE$128);
            }
            target.set(numeroChiamante);
        }
    }
    
    /**
     * Unsets the "Numero_Chiamante" element
     */
    public void unsetNumeroChiamante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMEROCHIAMANTE$128, 0);
        }
    }
    
    /**
     * Gets the "TipoAssistenza" element
     */
    public java.lang.String getTipoAssistenza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOASSISTENZA$130, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoAssistenza" element
     */
    public org.apache.xmlbeans.XmlString xgetTipoAssistenza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOASSISTENZA$130, 0);
            return target;
        }
    }
    
    /**
     * True if has "TipoAssistenza" element
     */
    public boolean isSetTipoAssistenza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOASSISTENZA$130) != 0;
        }
    }
    
    /**
     * Sets the "TipoAssistenza" element
     */
    public void setTipoAssistenza(java.lang.String tipoAssistenza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOASSISTENZA$130, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOASSISTENZA$130);
            }
            target.setStringValue(tipoAssistenza);
        }
    }
    
    /**
     * Sets (as xml) the "TipoAssistenza" element
     */
    public void xsetTipoAssistenza(org.apache.xmlbeans.XmlString tipoAssistenza)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIPOASSISTENZA$130, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIPOASSISTENZA$130);
            }
            target.set(tipoAssistenza);
        }
    }
    
    /**
     * Unsets the "TipoAssistenza" element
     */
    public void unsetTipoAssistenza()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOASSISTENZA$130, 0);
        }
    }
    
    /**
     * Gets the "Sistema_sorgente" element
     */
    public java.lang.String getSistemaSorgente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SISTEMASORGENTE$132, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sistema_sorgente" element
     */
    public org.apache.xmlbeans.XmlString xgetSistemaSorgente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SISTEMASORGENTE$132, 0);
            return target;
        }
    }
    
    /**
     * True if has "Sistema_sorgente" element
     */
    public boolean isSetSistemaSorgente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SISTEMASORGENTE$132) != 0;
        }
    }
    
    /**
     * Sets the "Sistema_sorgente" element
     */
    public void setSistemaSorgente(java.lang.String sistemaSorgente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SISTEMASORGENTE$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SISTEMASORGENTE$132);
            }
            target.setStringValue(sistemaSorgente);
        }
    }
    
    /**
     * Sets (as xml) the "Sistema_sorgente" element
     */
    public void xsetSistemaSorgente(org.apache.xmlbeans.XmlString sistemaSorgente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SISTEMASORGENTE$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SISTEMASORGENTE$132);
            }
            target.set(sistemaSorgente);
        }
    }
    
    /**
     * Unsets the "Sistema_sorgente" element
     */
    public void unsetSistemaSorgente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SISTEMASORGENTE$132, 0);
        }
    }
}
