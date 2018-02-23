/*
 * XML Type:  AuthenticationInfo
 * Namespace: urn:HPD_IncidentInterface_Create_WS_VIP
 * Java type: hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceCreateWSVIP.impl;
/**
 * An XML AuthenticationInfo(@urn:HPD_IncidentInterface_Create_WS_VIP).
 *
 * This is a complex type.
 */
public class AuthenticationInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo
{
    private static final long serialVersionUID = 1L;
    
    public AuthenticationInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "userName");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "password");
    private static final javax.xml.namespace.QName AUTHENTICATION$4 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "authentication");
    private static final javax.xml.namespace.QName LOCALE$6 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "locale");
    private static final javax.xml.namespace.QName TIMEZONE$8 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_Create_WS_VIP", "timeZone");
    
    
    /**
     * Gets the "userName" element
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userName" element
     */
    public org.apache.xmlbeans.XmlString xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userName" element
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "userName" element
     */
    public void xsetUserName(org.apache.xmlbeans.XmlString userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$0);
            }
            target.set(userName);
        }
    }
    
    /**
     * Gets the "password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$2);
            }
            target.set(password);
        }
    }
    
    /**
     * Gets the "authentication" element
     */
    public java.lang.String getAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "authentication" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "authentication" element
     */
    public boolean isSetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATION$4) != 0;
        }
    }
    
    /**
     * Sets the "authentication" element
     */
    public void setAuthentication(java.lang.String authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHENTICATION$4);
            }
            target.setStringValue(authentication);
        }
    }
    
    /**
     * Sets (as xml) the "authentication" element
     */
    public void xsetAuthentication(org.apache.xmlbeans.XmlString authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHENTICATION$4);
            }
            target.set(authentication);
        }
    }
    
    /**
     * Unsets the "authentication" element
     */
    public void unsetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATION$4, 0);
        }
    }
    
    /**
     * Gets the "locale" element
     */
    public java.lang.String getLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locale" element
     */
    public org.apache.xmlbeans.XmlString xgetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "locale" element
     */
    public boolean isSetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALE$6) != 0;
        }
    }
    
    /**
     * Sets the "locale" element
     */
    public void setLocale(java.lang.String locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALE$6);
            }
            target.setStringValue(locale);
        }
    }
    
    /**
     * Sets (as xml) the "locale" element
     */
    public void xsetLocale(org.apache.xmlbeans.XmlString locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALE$6);
            }
            target.set(locale);
        }
    }
    
    /**
     * Unsets the "locale" element
     */
    public void unsetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALE$6, 0);
        }
    }
    
    /**
     * Gets the "timeZone" element
     */
    public java.lang.String getTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeZone" element
     */
    public org.apache.xmlbeans.XmlString xgetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeZone" element
     */
    public boolean isSetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$8) != 0;
        }
    }
    
    /**
     * Sets the "timeZone" element
     */
    public void setTimeZone(java.lang.String timeZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONE$8);
            }
            target.setStringValue(timeZone);
        }
    }
    
    /**
     * Sets (as xml) the "timeZone" element
     */
    public void xsetTimeZone(org.apache.xmlbeans.XmlString timeZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEZONE$8);
            }
            target.set(timeZone);
        }
    }
    
    /**
     * Unsets the "timeZone" element
     */
    public void unsetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$8, 0);
        }
    }
}
