/*
 * An XML document type.
 * Localname: AuthenticationInfo
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP.impl;
/**
 * A document containing one AuthenticationInfo(@urn:HPD_IncidentInterface_Create_WS_VIP) element.
 *
 * This is a complex type.
 */
public class AuthenticationInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthenticationInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONINFO$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "AuthenticationInfo");
    
    
    /**
     * Gets the "AuthenticationInfo" element
     */
    public hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo getAuthenticationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo)get_store().find_element_user(AUTHENTICATIONINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthenticationInfo" element
     */
    public void setAuthenticationInfo(hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo authenticationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo)get_store().find_element_user(AUTHENTICATIONINFO$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo)get_store().add_element_user(AUTHENTICATIONINFO$0);
            }
            target.set(authenticationInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "AuthenticationInfo" element
     */
    public hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo addNewAuthenticationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo target = null;
            target = (hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo)get_store().add_element_user(AUTHENTICATIONINFO$0);
            return target;
        }
    }
}
