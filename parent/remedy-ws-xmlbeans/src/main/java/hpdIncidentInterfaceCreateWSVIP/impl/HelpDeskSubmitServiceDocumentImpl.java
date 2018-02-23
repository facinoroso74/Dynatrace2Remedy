/*
 * An XML document type.
 * Localname: HelpDesk_Submit_Service
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP.impl;
/**
 * A document containing one HelpDesk_Submit_Service(@urn:HPD_IncidentInterface_Create_WS_VIP) element.
 *
 * This is a complex type.
 */
public class HelpDeskSubmitServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskSubmitServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKSUBMITSERVICE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "HelpDesk_Submit_Service");
    
    
    /**
     * Gets the "HelpDesk_Submit_Service" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateInputMap getHelpDeskSubmitService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateInputMap target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateInputMap)get_store().find_element_user(HELPDESKSUBMITSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_Submit_Service" element
     */
    public void setHelpDeskSubmitService(hpdIncidentInterfaceCreateWSVIP.CreateInputMap helpDeskSubmitService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateInputMap target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateInputMap)get_store().find_element_user(HELPDESKSUBMITSERVICE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.CreateInputMap)get_store().add_element_user(HELPDESKSUBMITSERVICE$0);
            }
            target.set(helpDeskSubmitService);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_Submit_Service" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateInputMap addNewHelpDeskSubmitService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateInputMap target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateInputMap)get_store().add_element_user(HELPDESKSUBMITSERVICE$0);
            return target;
        }
    }
}
