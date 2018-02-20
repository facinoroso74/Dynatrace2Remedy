/*
 * An XML document type.
 * Localname: HelpDesk_Submit_ServiceResponse
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP.impl;
/**
 * A document containing one HelpDesk_Submit_ServiceResponse(@urn:HPD_IncidentInterface_Create_WS_VIP) element.
 *
 * This is a complex type.
 */
public class HelpDeskSubmitServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskSubmitServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKSUBMITSERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "HelpDesk_Submit_ServiceResponse");
    
    
    /**
     * Gets the "HelpDesk_Submit_ServiceResponse" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateOutputMap getHelpDeskSubmitServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateOutputMap target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap)get_store().find_element_user(HELPDESKSUBMITSERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_Submit_ServiceResponse" element
     */
    public void setHelpDeskSubmitServiceResponse(hpdIncidentInterfaceCreateWSVIP.CreateOutputMap helpDeskSubmitServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateOutputMap target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap)get_store().find_element_user(HELPDESKSUBMITSERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap)get_store().add_element_user(HELPDESKSUBMITSERVICERESPONSE$0);
            }
            target.set(helpDeskSubmitServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_Submit_ServiceResponse" element
     */
    public hpdIncidentInterfaceCreateWSVIP.CreateOutputMap addNewHelpDeskSubmitServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.CreateOutputMap target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.CreateOutputMap)get_store().add_element_user(HELPDESKSUBMITSERVICERESPONSE$0);
            return target;
        }
    }
}
