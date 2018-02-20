/*
 * XML Type:  CreateOutputMap
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.CreateOutputMap
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP.impl;
/**
 * An XML CreateOutputMap(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is a complex type.
 */
public class CreateOutputMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceCreateWSVIP.CreateOutputMap
{
    private static final long serialVersionUID = 1L;
    
    public CreateOutputMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTNUMBER$0 = 
        new javax.xml.namespace.QName("", "Incident_Number");
    
    
    /**
     * Gets the "Incident_Number" element
     */
    public java.lang.String getIncidentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Incident_Number" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Incident_Number" element
     */
    public void setIncidentNumber(java.lang.String incidentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNUMBER$0);
            }
            target.setStringValue(incidentNumber);
        }
    }
    
    /**
     * Sets (as xml) the "Incident_Number" element
     */
    public void xsetIncidentNumber(org.apache.xmlbeans.XmlString incidentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNUMBER$0);
            }
            target.set(incidentNumber);
        }
    }
}
