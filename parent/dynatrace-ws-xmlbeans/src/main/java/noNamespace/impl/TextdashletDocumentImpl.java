/*
 * An XML document type.
 * Localname: textdashlet
 * Namespace: 
 * Java type: noNamespace.TextdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one textdashlet(@) element.
 *
 * This is a complex type.
 */
public class TextdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TextdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTDASHLET$0 = 
        new javax.xml.namespace.QName("", "textdashlet");
    
    
    /**
     * Gets the "textdashlet" element
     */
    public noNamespace.TextdashletDocument.Textdashlet getTextdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TextdashletDocument.Textdashlet target = null;
            target = (noNamespace.TextdashletDocument.Textdashlet)get_store().find_element_user(TEXTDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "textdashlet" element
     */
    public void setTextdashlet(noNamespace.TextdashletDocument.Textdashlet textdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TextdashletDocument.Textdashlet target = null;
            target = (noNamespace.TextdashletDocument.Textdashlet)get_store().find_element_user(TEXTDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.TextdashletDocument.Textdashlet)get_store().add_element_user(TEXTDASHLET$0);
            }
            target.set(textdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "textdashlet" element
     */
    public noNamespace.TextdashletDocument.Textdashlet addNewTextdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TextdashletDocument.Textdashlet target = null;
            target = (noNamespace.TextdashletDocument.Textdashlet)get_store().add_element_user(TEXTDASHLET$0);
            return target;
        }
    }
    /**
     * An XML textdashlet(@).
     *
     * This is an atomic type that is a restriction of noNamespace.TextdashletDocument$Textdashlet.
     */
    public static class TextdashletImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.TextdashletDocument.Textdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public TextdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TextdashletImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("", "description");
        
        
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
         * Gets the "description" attribute
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$2);
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
                return get_store().find_attribute_user(DESCRIPTION$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$2);
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
                get_store().remove_attribute(DESCRIPTION$2);
            }
        }
    }
}
