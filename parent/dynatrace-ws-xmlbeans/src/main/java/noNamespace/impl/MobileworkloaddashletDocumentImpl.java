/*
 * An XML document type.
 * Localname: mobileworkloaddashlet
 * Namespace: 
 * Java type: noNamespace.MobileworkloaddashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one mobileworkloaddashlet(@) element.
 *
 * This is a complex type.
 */
public class MobileworkloaddashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MobileworkloaddashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public MobileworkloaddashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOBILEWORKLOADDASHLET$0 = 
        new javax.xml.namespace.QName("", "mobileworkloaddashlet");
    
    
    /**
     * Gets the "mobileworkloaddashlet" element
     */
    public noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet getMobileworkloaddashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet target = null;
            target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().find_element_user(MOBILEWORKLOADDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mobileworkloaddashlet" element
     */
    public void setMobileworkloaddashlet(noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet mobileworkloaddashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet target = null;
            target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().find_element_user(MOBILEWORKLOADDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().add_element_user(MOBILEWORKLOADDASHLET$0);
            }
            target.set(mobileworkloaddashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "mobileworkloaddashlet" element
     */
    public noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet addNewMobileworkloaddashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet target = null;
            target = (noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet)get_store().add_element_user(MOBILEWORKLOADDASHLET$0);
            return target;
        }
    }
    /**
     * An XML mobileworkloaddashlet(@).
     *
     * This is a complex type.
     */
    public static class MobileworkloaddashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MobileworkloaddashletDocument.Mobileworkloaddashlet
    {
        private static final long serialVersionUID = 1L;
        
        public MobileworkloaddashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MSG$0 = 
            new javax.xml.namespace.QName("", "msg");
        
        
        /**
         * Gets the "msg" element
         */
        public java.lang.String getMsg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSG$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "msg" element
         */
        public org.apache.xmlbeans.XmlString xgetMsg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSG$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "msg" element
         */
        public void setMsg(java.lang.String msg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSG$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSG$0);
                }
                target.setStringValue(msg);
            }
        }
        
        /**
         * Sets (as xml) the "msg" element
         */
        public void xsetMsg(org.apache.xmlbeans.XmlString msg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MSG$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MSG$0);
                }
                target.set(msg);
            }
        }
    }
}
