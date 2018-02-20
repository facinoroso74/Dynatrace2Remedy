/*
 * An XML document type.
 * Localname: clienterrorsdashlet
 * Namespace: 
 * Java type: noNamespace.ClienterrorsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one clienterrorsdashlet(@) element.
 *
 * This is a complex type.
 */
public class ClienterrorsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClienterrorsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClienterrorsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTERRORSDASHLET$0 = 
        new javax.xml.namespace.QName("", "clienterrorsdashlet");
    
    
    /**
     * Gets the "clienterrorsdashlet" element
     */
    public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet getClienterrorsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet target = null;
            target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().find_element_user(CLIENTERRORSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clienterrorsdashlet" element
     */
    public void setClienterrorsdashlet(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet clienterrorsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet target = null;
            target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().find_element_user(CLIENTERRORSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().add_element_user(CLIENTERRORSDASHLET$0);
            }
            target.set(clienterrorsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "clienterrorsdashlet" element
     */
    public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet addNewClienterrorsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet target = null;
            target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet)get_store().add_element_user(CLIENTERRORSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML clienterrorsdashlet(@).
     *
     * This is a complex type.
     */
    public static class ClienterrorsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public ClienterrorsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName ERRORTYPES$4 = 
            new javax.xml.namespace.QName("", "errortypes");
        private static final javax.xml.namespace.QName CLIENTERRORS$6 = 
            new javax.xml.namespace.QName("", "clienterrors");
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
         * Gets the "errortypes" element
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes getErrortypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes)get_store().find_element_user(ERRORTYPES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "errortypes" element
         */
        public boolean isSetErrortypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORTYPES$4) != 0;
            }
        }
        
        /**
         * Sets the "errortypes" element
         */
        public void setErrortypes(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes errortypes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes)get_store().find_element_user(ERRORTYPES$4, 0);
                if (target == null)
                {
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes)get_store().add_element_user(ERRORTYPES$4);
                }
                target.set(errortypes);
            }
        }
        
        /**
         * Appends and returns a new empty "errortypes" element
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes addNewErrortypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes)get_store().add_element_user(ERRORTYPES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "errortypes" element
         */
        public void unsetErrortypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORTYPES$4, 0);
            }
        }
        
        /**
         * Gets the "clienterrors" element
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors getClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors)get_store().find_element_user(CLIENTERRORS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "clienterrors" element
         */
        public boolean isSetClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLIENTERRORS$6) != 0;
            }
        }
        
        /**
         * Sets the "clienterrors" element
         */
        public void setClienterrors(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors clienterrors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors)get_store().find_element_user(CLIENTERRORS$6, 0);
                if (target == null)
                {
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors)get_store().add_element_user(CLIENTERRORS$6);
                }
                target.set(clienterrors);
            }
        }
        
        /**
         * Appends and returns a new empty "clienterrors" element
         */
        public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors addNewClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors target = null;
                target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors)get_store().add_element_user(CLIENTERRORS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "clienterrors" element
         */
        public void unsetClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLIENTERRORS$6, 0);
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
         * An XML errortypes(@).
         *
         * This is a complex type.
         */
        public static class ErrortypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes
        {
            private static final long serialVersionUID = 1L;
            
            public ErrortypesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ERRORTYPE$0 = 
                new javax.xml.namespace.QName("", "errortype");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "errortype" elements
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype[] getErrortypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ERRORTYPE$0, targetList);
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype[] result = new noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "errortype" element
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype getErrortypeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype)get_store().find_element_user(ERRORTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "errortype" element
             */
            public int sizeOfErrortypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ERRORTYPE$0);
                }
            }
            
            /**
             * Sets array of all "errortype" element
             */
            public void setErrortypeArray(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype[] errortypeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(errortypeArray, ERRORTYPE$0);
                }
            }
            
            /**
             * Sets ith "errortype" element
             */
            public void setErrortypeArray(int i, noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype errortype)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype)get_store().find_element_user(ERRORTYPE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(errortype);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "errortype" element
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype insertNewErrortype(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype)get_store().insert_element_user(ERRORTYPE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "errortype" element
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype addNewErrortype()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype)get_store().add_element_user(ERRORTYPE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "errortype" element
             */
            public void removeErrortype(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ERRORTYPE$0, i);
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
             * An XML errortype(@).
             *
             * This is a complex type.
             */
            public static class ErrortypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Errortypes.Errortype
            {
                private static final long serialVersionUID = 1L;
                
                public ErrortypeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName ERRORTYPE$0 = 
                    new javax.xml.namespace.QName("", "errortype");
                private static final javax.xml.namespace.QName ERRORTYPE2$2 = 
                    new javax.xml.namespace.QName("", "errortype");
                private static final javax.xml.namespace.QName ERRORCOUNT$4 = 
                    new javax.xml.namespace.QName("", "errorcount");
                
                
                /**
                 * Gets array of all "errortype" elements
                 */
                public noNamespace.ErrortypeDocument.Errortype[] getErrortypeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(ERRORTYPE2$2, targetList);
                      noNamespace.ErrortypeDocument.Errortype[] result = new noNamespace.ErrortypeDocument.Errortype[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "errortype" element
                 */
                public noNamespace.ErrortypeDocument.Errortype getErrortypeArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrortypeDocument.Errortype target = null;
                      target = (noNamespace.ErrortypeDocument.Errortype)get_store().find_element_user(ERRORTYPE2$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "errortype" element
                 */
                public int sizeOfErrortypeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ERRORTYPE2$2);
                    }
                }
                
                /**
                 * Sets array of all "errortype" element
                 */
                public void setErrortypeArray(noNamespace.ErrortypeDocument.Errortype[] errortypeArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(errortypeArray, ERRORTYPE2$2);
                    }
                }
                
                /**
                 * Sets ith "errortype" element
                 */
                public void setErrortypeArray(int i, noNamespace.ErrortypeDocument.Errortype errortype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrortypeDocument.Errortype target = null;
                      target = (noNamespace.ErrortypeDocument.Errortype)get_store().find_element_user(ERRORTYPE2$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(errortype);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "errortype" element
                 */
                public noNamespace.ErrortypeDocument.Errortype insertNewErrortype(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrortypeDocument.Errortype target = null;
                      target = (noNamespace.ErrortypeDocument.Errortype)get_store().insert_element_user(ERRORTYPE2$2, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "errortype" element
                 */
                public noNamespace.ErrortypeDocument.Errortype addNewErrortype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrortypeDocument.Errortype target = null;
                      target = (noNamespace.ErrortypeDocument.Errortype)get_store().add_element_user(ERRORTYPE2$2);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "errortype" element
                 */
                public void removeErrortype(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ERRORTYPE2$2, i);
                    }
                }
                
                /**
                 * Gets the "errortype" attribute
                 */
                public java.lang.String getErrortype2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORTYPE2$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "errortype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetErrortype2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORTYPE2$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "errortype" attribute
                 */
                public boolean isSetErrortype2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORTYPE2$2) != null;
                    }
                }
                
                /**
                 * Sets the "errortype" attribute
                 */
                public void setErrortype2(java.lang.String errortype2)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORTYPE2$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORTYPE2$2);
                      }
                      target.setStringValue(errortype2);
                    }
                }
                
                /**
                 * Sets (as xml) the "errortype" attribute
                 */
                public void xsetErrortype2(org.apache.xmlbeans.XmlString errortype2)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORTYPE2$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORTYPE2$2);
                      }
                      target.set(errortype2);
                    }
                }
                
                /**
                 * Unsets the "errortype" attribute
                 */
                public void unsetErrortype2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORTYPE2$2);
                    }
                }
                
                /**
                 * Gets the "errorcount" attribute
                 */
                public java.lang.String getErrorcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCOUNT$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "errorcount" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetErrorcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCOUNT$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "errorcount" attribute
                 */
                public boolean isSetErrorcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORCOUNT$4) != null;
                    }
                }
                
                /**
                 * Sets the "errorcount" attribute
                 */
                public void setErrorcount(java.lang.String errorcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORCOUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORCOUNT$4);
                      }
                      target.setStringValue(errorcount);
                    }
                }
                
                /**
                 * Sets (as xml) the "errorcount" attribute
                 */
                public void xsetErrorcount(org.apache.xmlbeans.XmlString errorcount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORCOUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORCOUNT$4);
                      }
                      target.set(errorcount);
                    }
                }
                
                /**
                 * Unsets the "errorcount" attribute
                 */
                public void unsetErrorcount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORCOUNT$4);
                    }
                }
            }
        }
        /**
         * An XML clienterrors(@).
         *
         * This is a complex type.
         */
        public static class ClienterrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors
        {
            private static final long serialVersionUID = 1L;
            
            public ClienterrorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CLIENTERROR$0 = 
                new javax.xml.namespace.QName("", "clienterror");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "clienterror" elements
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror[] getClienterrorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CLIENTERROR$0, targetList);
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror[] result = new noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "clienterror" element
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror getClienterrorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror)get_store().find_element_user(CLIENTERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "clienterror" element
             */
            public int sizeOfClienterrorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CLIENTERROR$0);
                }
            }
            
            /**
             * Sets array of all "clienterror" element
             */
            public void setClienterrorArray(noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror[] clienterrorArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(clienterrorArray, CLIENTERROR$0);
                }
            }
            
            /**
             * Sets ith "clienterror" element
             */
            public void setClienterrorArray(int i, noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror clienterror)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror)get_store().find_element_user(CLIENTERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(clienterror);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "clienterror" element
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror insertNewClienterror(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror)get_store().insert_element_user(CLIENTERROR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "clienterror" element
             */
            public noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror addNewClienterror()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror target = null;
                    target = (noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror)get_store().add_element_user(CLIENTERROR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "clienterror" element
             */
            public void removeClienterror(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CLIENTERROR$0, i);
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
             * An XML clienterror(@).
             *
             * This is a complex type.
             */
            public static class ClienterrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ClienterrorsdashletDocument.Clienterrorsdashlet.Clienterrors.Clienterror
            {
                private static final long serialVersionUID = 1L;
                
                public ClienterrorImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CLIENTERROR$0 = 
                    new javax.xml.namespace.QName("", "clienterror");
                private static final javax.xml.namespace.QName ERRORMESSAGE$2 = 
                    new javax.xml.namespace.QName("", "errormessage");
                private static final javax.xml.namespace.QName COUNT$4 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName WEBPAGETITLE$6 = 
                    new javax.xml.namespace.QName("", "webpagetitle");
                private static final javax.xml.namespace.QName URL$8 = 
                    new javax.xml.namespace.QName("", "url");
                private static final javax.xml.namespace.QName HOSTNAME$10 = 
                    new javax.xml.namespace.QName("", "hostname");
                private static final javax.xml.namespace.QName SERVERPATH$12 = 
                    new javax.xml.namespace.QName("", "serverpath");
                private static final javax.xml.namespace.QName QUERYSTRING$14 = 
                    new javax.xml.namespace.QName("", "querystring");
                private static final javax.xml.namespace.QName BROWSER$16 = 
                    new javax.xml.namespace.QName("", "browser");
                private static final javax.xml.namespace.QName CLIENTIP$18 = 
                    new javax.xml.namespace.QName("", "clientip");
                private static final javax.xml.namespace.QName SESSIONID$20 = 
                    new javax.xml.namespace.QName("", "sessionid");
                private static final javax.xml.namespace.QName PAGEID$22 = 
                    new javax.xml.namespace.QName("", "pageid");
                private static final javax.xml.namespace.QName FRAMEID$24 = 
                    new javax.xml.namespace.QName("", "frameid");
                private static final javax.xml.namespace.QName TIME$26 = 
                    new javax.xml.namespace.QName("", "time");
                private static final javax.xml.namespace.QName ERROR$28 = 
                    new javax.xml.namespace.QName("", "error");
                private static final javax.xml.namespace.QName FILE$30 = 
                    new javax.xml.namespace.QName("", "file");
                private static final javax.xml.namespace.QName LINE$32 = 
                    new javax.xml.namespace.QName("", "line");
                private static final javax.xml.namespace.QName CRASHSESSIONID$34 = 
                    new javax.xml.namespace.QName("", "crashsessionid");
                private static final javax.xml.namespace.QName CRASHTIMESTAMP$36 = 
                    new javax.xml.namespace.QName("", "crashtimestamp");
                private static final javax.xml.namespace.QName APPVERSION$38 = 
                    new javax.xml.namespace.QName("", "appversion");
                private static final javax.xml.namespace.QName BATTERYPERCENTAGE$40 = 
                    new javax.xml.namespace.QName("", "batterypercentage");
                private static final javax.xml.namespace.QName CONNECTIONTYPE$42 = 
                    new javax.xml.namespace.QName("", "connectiontype");
                private static final javax.xml.namespace.QName DEVICEMANUFACTURER$44 = 
                    new javax.xml.namespace.QName("", "devicemanufacturer");
                private static final javax.xml.namespace.QName DEVICENAME$46 = 
                    new javax.xml.namespace.QName("", "devicename");
                private static final javax.xml.namespace.QName DEVICEOS$48 = 
                    new javax.xml.namespace.QName("", "deviceos");
                private static final javax.xml.namespace.QName PHYSICALMEMORY$50 = 
                    new javax.xml.namespace.QName("", "physicalmemory");
                private static final javax.xml.namespace.QName RUNNINGPROCESSCOUNT$52 = 
                    new javax.xml.namespace.QName("", "runningprocesscount");
                private static final javax.xml.namespace.QName MEMORYFREEPERCENTAGE$54 = 
                    new javax.xml.namespace.QName("", "memoryfreepercentage");
                private static final javax.xml.namespace.QName APPLICATIONBUILDVERSION$56 = 
                    new javax.xml.namespace.QName("", "applicationbuildversion");
                private static final javax.xml.namespace.QName APPLICATIONID$58 = 
                    new javax.xml.namespace.QName("", "applicationid");
                private static final javax.xml.namespace.QName MODELID$60 = 
                    new javax.xml.namespace.QName("", "modelid");
                private static final javax.xml.namespace.QName CPU$62 = 
                    new javax.xml.namespace.QName("", "cpu");
                private static final javax.xml.namespace.QName RESOLUTION$64 = 
                    new javax.xml.namespace.QName("", "resolution");
                private static final javax.xml.namespace.QName ORIENTATION$66 = 
                    new javax.xml.namespace.QName("", "orientation");
                private static final javax.xml.namespace.QName CARRIER$68 = 
                    new javax.xml.namespace.QName("", "carrier");
                private static final javax.xml.namespace.QName SIGNALSTRENGTH$70 = 
                    new javax.xml.namespace.QName("", "signalstrength");
                private static final javax.xml.namespace.QName GPSLOCATION$72 = 
                    new javax.xml.namespace.QName("", "gpslocation");
                private static final javax.xml.namespace.QName ROOTED$74 = 
                    new javax.xml.namespace.QName("", "rooted");
                private static final javax.xml.namespace.QName ADKVERSION$76 = 
                    new javax.xml.namespace.QName("", "adkversion");
                private static final javax.xml.namespace.QName APPLICATION$78 = 
                    new javax.xml.namespace.QName("", "application");
                private static final javax.xml.namespace.QName NETWORKTECHNOLOGY$80 = 
                    new javax.xml.namespace.QName("", "networktechnology");
                private static final javax.xml.namespace.QName COLUMN$82 = 
                    new javax.xml.namespace.QName("", "column");
                private static final javax.xml.namespace.QName STACK$84 = 
                    new javax.xml.namespace.QName("", "stack");
                private static final javax.xml.namespace.QName CODE$86 = 
                    new javax.xml.namespace.QName("", "code");
                
                
                /**
                 * Gets array of all "clienterror" elements
                 */
                public noNamespace.ClienterrorDocument.Clienterror[] getClienterrorArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(CLIENTERROR$0, targetList);
                      noNamespace.ClienterrorDocument.Clienterror[] result = new noNamespace.ClienterrorDocument.Clienterror[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "clienterror" element
                 */
                public noNamespace.ClienterrorDocument.Clienterror getClienterrorArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ClienterrorDocument.Clienterror target = null;
                      target = (noNamespace.ClienterrorDocument.Clienterror)get_store().find_element_user(CLIENTERROR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "clienterror" element
                 */
                public int sizeOfClienterrorArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CLIENTERROR$0);
                    }
                }
                
                /**
                 * Sets array of all "clienterror" element
                 */
                public void setClienterrorArray(noNamespace.ClienterrorDocument.Clienterror[] clienterrorArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(clienterrorArray, CLIENTERROR$0);
                    }
                }
                
                /**
                 * Sets ith "clienterror" element
                 */
                public void setClienterrorArray(int i, noNamespace.ClienterrorDocument.Clienterror clienterror)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ClienterrorDocument.Clienterror target = null;
                      target = (noNamespace.ClienterrorDocument.Clienterror)get_store().find_element_user(CLIENTERROR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(clienterror);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "clienterror" element
                 */
                public noNamespace.ClienterrorDocument.Clienterror insertNewClienterror(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ClienterrorDocument.Clienterror target = null;
                      target = (noNamespace.ClienterrorDocument.Clienterror)get_store().insert_element_user(CLIENTERROR$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "clienterror" element
                 */
                public noNamespace.ClienterrorDocument.Clienterror addNewClienterror()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ClienterrorDocument.Clienterror target = null;
                      target = (noNamespace.ClienterrorDocument.Clienterror)get_store().add_element_user(CLIENTERROR$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "clienterror" element
                 */
                public void removeClienterror(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CLIENTERROR$0, i);
                    }
                }
                
                /**
                 * Gets the "errormessage" attribute
                 */
                public java.lang.String getErrormessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORMESSAGE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "errormessage" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetErrormessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORMESSAGE$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "errormessage" attribute
                 */
                public boolean isSetErrormessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORMESSAGE$2) != null;
                    }
                }
                
                /**
                 * Sets the "errormessage" attribute
                 */
                public void setErrormessage(java.lang.String errormessage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORMESSAGE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORMESSAGE$2);
                      }
                      target.setStringValue(errormessage);
                    }
                }
                
                /**
                 * Sets (as xml) the "errormessage" attribute
                 */
                public void xsetErrormessage(org.apache.xmlbeans.XmlString errormessage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORMESSAGE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORMESSAGE$2);
                      }
                      target.set(errormessage);
                    }
                }
                
                /**
                 * Unsets the "errormessage" attribute
                 */
                public void unsetErrormessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORMESSAGE$2);
                    }
                }
                
                /**
                 * Gets the "count" attribute
                 */
                public java.math.BigInteger getCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "count" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "count" attribute
                 */
                public boolean isSetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COUNT$4) != null;
                    }
                }
                
                /**
                 * Sets the "count" attribute
                 */
                public void setCount(java.math.BigInteger count)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$4);
                      }
                      target.setBigIntegerValue(count);
                    }
                }
                
                /**
                 * Sets (as xml) the "count" attribute
                 */
                public void xsetCount(org.apache.xmlbeans.XmlInteger count)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$4);
                      }
                      target.set(count);
                    }
                }
                
                /**
                 * Unsets the "count" attribute
                 */
                public void unsetCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COUNT$4);
                    }
                }
                
                /**
                 * Gets the "webpagetitle" attribute
                 */
                public java.lang.String getWebpagetitle()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBPAGETITLE$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "webpagetitle" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetWebpagetitle()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEBPAGETITLE$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "webpagetitle" attribute
                 */
                public boolean isSetWebpagetitle()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(WEBPAGETITLE$6) != null;
                    }
                }
                
                /**
                 * Sets the "webpagetitle" attribute
                 */
                public void setWebpagetitle(java.lang.String webpagetitle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEBPAGETITLE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEBPAGETITLE$6);
                      }
                      target.setStringValue(webpagetitle);
                    }
                }
                
                /**
                 * Sets (as xml) the "webpagetitle" attribute
                 */
                public void xsetWebpagetitle(org.apache.xmlbeans.XmlString webpagetitle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WEBPAGETITLE$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WEBPAGETITLE$6);
                      }
                      target.set(webpagetitle);
                    }
                }
                
                /**
                 * Unsets the "webpagetitle" attribute
                 */
                public void unsetWebpagetitle()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(WEBPAGETITLE$6);
                    }
                }
                
                /**
                 * Gets the "url" attribute
                 */
                public java.lang.String getUrl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "url" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetUrl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "url" attribute
                 */
                public boolean isSetUrl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(URL$8) != null;
                    }
                }
                
                /**
                 * Sets the "url" attribute
                 */
                public void setUrl(java.lang.String url)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$8);
                      }
                      target.setStringValue(url);
                    }
                }
                
                /**
                 * Sets (as xml) the "url" attribute
                 */
                public void xsetUrl(org.apache.xmlbeans.XmlString url)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URL$8);
                      }
                      target.set(url);
                    }
                }
                
                /**
                 * Unsets the "url" attribute
                 */
                public void unsetUrl()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(URL$8);
                    }
                }
                
                /**
                 * Gets the "hostname" attribute
                 */
                public java.lang.String getHostname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hostname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHostname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "hostname" attribute
                 */
                public boolean isSetHostname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOSTNAME$10) != null;
                    }
                }
                
                /**
                 * Sets the "hostname" attribute
                 */
                public void setHostname(java.lang.String hostname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$10);
                      }
                      target.setStringValue(hostname);
                    }
                }
                
                /**
                 * Sets (as xml) the "hostname" attribute
                 */
                public void xsetHostname(org.apache.xmlbeans.XmlString hostname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTNAME$10);
                      }
                      target.set(hostname);
                    }
                }
                
                /**
                 * Unsets the "hostname" attribute
                 */
                public void unsetHostname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOSTNAME$10);
                    }
                }
                
                /**
                 * Gets the "serverpath" attribute
                 */
                public java.lang.String getServerpath()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERPATH$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "serverpath" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetServerpath()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVERPATH$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "serverpath" attribute
                 */
                public boolean isSetServerpath()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SERVERPATH$12) != null;
                    }
                }
                
                /**
                 * Sets the "serverpath" attribute
                 */
                public void setServerpath(java.lang.String serverpath)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERPATH$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERPATH$12);
                      }
                      target.setStringValue(serverpath);
                    }
                }
                
                /**
                 * Sets (as xml) the "serverpath" attribute
                 */
                public void xsetServerpath(org.apache.xmlbeans.XmlString serverpath)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVERPATH$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVERPATH$12);
                      }
                      target.set(serverpath);
                    }
                }
                
                /**
                 * Unsets the "serverpath" attribute
                 */
                public void unsetServerpath()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SERVERPATH$12);
                    }
                }
                
                /**
                 * Gets the "querystring" attribute
                 */
                public java.lang.String getQuerystring()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYSTRING$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "querystring" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetQuerystring()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERYSTRING$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "querystring" attribute
                 */
                public boolean isSetQuerystring()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(QUERYSTRING$14) != null;
                    }
                }
                
                /**
                 * Sets the "querystring" attribute
                 */
                public void setQuerystring(java.lang.String querystring)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYSTRING$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERYSTRING$14);
                      }
                      target.setStringValue(querystring);
                    }
                }
                
                /**
                 * Sets (as xml) the "querystring" attribute
                 */
                public void xsetQuerystring(org.apache.xmlbeans.XmlString querystring)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERYSTRING$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QUERYSTRING$14);
                      }
                      target.set(querystring);
                    }
                }
                
                /**
                 * Unsets the "querystring" attribute
                 */
                public void unsetQuerystring()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(QUERYSTRING$14);
                    }
                }
                
                /**
                 * Gets the "browser" attribute
                 */
                public java.lang.String getBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BROWSER$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "browser" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BROWSER$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "browser" attribute
                 */
                public boolean isSetBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BROWSER$16) != null;
                    }
                }
                
                /**
                 * Sets the "browser" attribute
                 */
                public void setBrowser(java.lang.String browser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BROWSER$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BROWSER$16);
                      }
                      target.setStringValue(browser);
                    }
                }
                
                /**
                 * Sets (as xml) the "browser" attribute
                 */
                public void xsetBrowser(org.apache.xmlbeans.XmlString browser)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BROWSER$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BROWSER$16);
                      }
                      target.set(browser);
                    }
                }
                
                /**
                 * Unsets the "browser" attribute
                 */
                public void unsetBrowser()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BROWSER$16);
                    }
                }
                
                /**
                 * Gets the "clientip" attribute
                 */
                public java.lang.String getClientip()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$18);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "clientip" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetClientip()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "clientip" attribute
                 */
                public boolean isSetClientip()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLIENTIP$18) != null;
                    }
                }
                
                /**
                 * Sets the "clientip" attribute
                 */
                public void setClientip(java.lang.String clientip)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTIP$18);
                      }
                      target.setStringValue(clientip);
                    }
                }
                
                /**
                 * Sets (as xml) the "clientip" attribute
                 */
                public void xsetClientip(org.apache.xmlbeans.XmlString clientip)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTIP$18);
                      }
                      target.set(clientip);
                    }
                }
                
                /**
                 * Unsets the "clientip" attribute
                 */
                public void unsetClientip()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLIENTIP$18);
                    }
                }
                
                /**
                 * Gets the "sessionid" attribute
                 */
                public java.lang.String getSessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sessionid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "sessionid" attribute
                 */
                public boolean isSetSessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SESSIONID$20) != null;
                    }
                }
                
                /**
                 * Sets the "sessionid" attribute
                 */
                public void setSessionid(java.lang.String sessionid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSIONID$20);
                      }
                      target.setStringValue(sessionid);
                    }
                }
                
                /**
                 * Sets (as xml) the "sessionid" attribute
                 */
                public void xsetSessionid(org.apache.xmlbeans.XmlString sessionid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SESSIONID$20);
                      }
                      target.set(sessionid);
                    }
                }
                
                /**
                 * Unsets the "sessionid" attribute
                 */
                public void unsetSessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SESSIONID$20);
                    }
                }
                
                /**
                 * Gets the "pageid" attribute
                 */
                public java.lang.String getPageid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEID$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "pageid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPageid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGEID$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "pageid" attribute
                 */
                public boolean isSetPageid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PAGEID$22) != null;
                    }
                }
                
                /**
                 * Sets the "pageid" attribute
                 */
                public void setPageid(java.lang.String pageid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEID$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGEID$22);
                      }
                      target.setStringValue(pageid);
                    }
                }
                
                /**
                 * Sets (as xml) the "pageid" attribute
                 */
                public void xsetPageid(org.apache.xmlbeans.XmlString pageid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGEID$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGEID$22);
                      }
                      target.set(pageid);
                    }
                }
                
                /**
                 * Unsets the "pageid" attribute
                 */
                public void unsetPageid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PAGEID$22);
                    }
                }
                
                /**
                 * Gets the "frameid" attribute
                 */
                public java.lang.String getFrameid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAMEID$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "frameid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFrameid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FRAMEID$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "frameid" attribute
                 */
                public boolean isSetFrameid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(FRAMEID$24) != null;
                    }
                }
                
                /**
                 * Sets the "frameid" attribute
                 */
                public void setFrameid(java.lang.String frameid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAMEID$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAMEID$24);
                      }
                      target.setStringValue(frameid);
                    }
                }
                
                /**
                 * Sets (as xml) the "frameid" attribute
                 */
                public void xsetFrameid(org.apache.xmlbeans.XmlString frameid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FRAMEID$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FRAMEID$24);
                      }
                      target.set(frameid);
                    }
                }
                
                /**
                 * Unsets the "frameid" attribute
                 */
                public void unsetFrameid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(FRAMEID$24);
                    }
                }
                
                /**
                 * Gets the "time" attribute
                 */
                public java.lang.String getTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$26);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "time" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "time" attribute
                 */
                public boolean isSetTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TIME$26) != null;
                    }
                }
                
                /**
                 * Sets the "time" attribute
                 */
                public void setTime(java.lang.String time)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIME$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIME$26);
                      }
                      target.setStringValue(time);
                    }
                }
                
                /**
                 * Sets (as xml) the "time" attribute
                 */
                public void xsetTime(org.apache.xmlbeans.XmlString time)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIME$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIME$26);
                      }
                      target.set(time);
                    }
                }
                
                /**
                 * Unsets the "time" attribute
                 */
                public void unsetTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TIME$26);
                    }
                }
                
                /**
                 * Gets the "error" attribute
                 */
                public java.lang.String getError()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERROR$28);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "error" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetError()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERROR$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "error" attribute
                 */
                public boolean isSetError()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERROR$28) != null;
                    }
                }
                
                /**
                 * Sets the "error" attribute
                 */
                public void setError(java.lang.String error)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERROR$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERROR$28);
                      }
                      target.setStringValue(error);
                    }
                }
                
                /**
                 * Sets (as xml) the "error" attribute
                 */
                public void xsetError(org.apache.xmlbeans.XmlString error)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERROR$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERROR$28);
                      }
                      target.set(error);
                    }
                }
                
                /**
                 * Unsets the "error" attribute
                 */
                public void unsetError()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERROR$28);
                    }
                }
                
                /**
                 * Gets the "file" attribute
                 */
                public java.lang.String getFile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$30);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "file" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetFile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILE$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "file" attribute
                 */
                public boolean isSetFile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(FILE$30) != null;
                    }
                }
                
                /**
                 * Sets the "file" attribute
                 */
                public void setFile(java.lang.String file)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILE$30);
                      }
                      target.setStringValue(file);
                    }
                }
                
                /**
                 * Sets (as xml) the "file" attribute
                 */
                public void xsetFile(org.apache.xmlbeans.XmlString file)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILE$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILE$30);
                      }
                      target.set(file);
                    }
                }
                
                /**
                 * Unsets the "file" attribute
                 */
                public void unsetFile()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(FILE$30);
                    }
                }
                
                /**
                 * Gets the "line" attribute
                 */
                public java.math.BigInteger getLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINE$32);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "line" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LINE$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "line" attribute
                 */
                public boolean isSetLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LINE$32) != null;
                    }
                }
                
                /**
                 * Sets the "line" attribute
                 */
                public void setLine(java.math.BigInteger line)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINE$32);
                      }
                      target.setBigIntegerValue(line);
                    }
                }
                
                /**
                 * Sets (as xml) the "line" attribute
                 */
                public void xsetLine(org.apache.xmlbeans.XmlInteger line)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LINE$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LINE$32);
                      }
                      target.set(line);
                    }
                }
                
                /**
                 * Unsets the "line" attribute
                 */
                public void unsetLine()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LINE$32);
                    }
                }
                
                /**
                 * Gets the "crashsessionid" attribute
                 */
                public java.lang.String getCrashsessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHSESSIONID$34);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "crashsessionid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCrashsessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRASHSESSIONID$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "crashsessionid" attribute
                 */
                public boolean isSetCrashsessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CRASHSESSIONID$34) != null;
                    }
                }
                
                /**
                 * Sets the "crashsessionid" attribute
                 */
                public void setCrashsessionid(java.lang.String crashsessionid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHSESSIONID$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRASHSESSIONID$34);
                      }
                      target.setStringValue(crashsessionid);
                    }
                }
                
                /**
                 * Sets (as xml) the "crashsessionid" attribute
                 */
                public void xsetCrashsessionid(org.apache.xmlbeans.XmlString crashsessionid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRASHSESSIONID$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CRASHSESSIONID$34);
                      }
                      target.set(crashsessionid);
                    }
                }
                
                /**
                 * Unsets the "crashsessionid" attribute
                 */
                public void unsetCrashsessionid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CRASHSESSIONID$34);
                    }
                }
                
                /**
                 * Gets the "crashtimestamp" attribute
                 */
                public java.lang.String getCrashtimestamp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHTIMESTAMP$36);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "crashtimestamp" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCrashtimestamp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRASHTIMESTAMP$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "crashtimestamp" attribute
                 */
                public boolean isSetCrashtimestamp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CRASHTIMESTAMP$36) != null;
                    }
                }
                
                /**
                 * Sets the "crashtimestamp" attribute
                 */
                public void setCrashtimestamp(java.lang.String crashtimestamp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHTIMESTAMP$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRASHTIMESTAMP$36);
                      }
                      target.setStringValue(crashtimestamp);
                    }
                }
                
                /**
                 * Sets (as xml) the "crashtimestamp" attribute
                 */
                public void xsetCrashtimestamp(org.apache.xmlbeans.XmlString crashtimestamp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRASHTIMESTAMP$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CRASHTIMESTAMP$36);
                      }
                      target.set(crashtimestamp);
                    }
                }
                
                /**
                 * Unsets the "crashtimestamp" attribute
                 */
                public void unsetCrashtimestamp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CRASHTIMESTAMP$36);
                    }
                }
                
                /**
                 * Gets the "appversion" attribute
                 */
                public java.lang.String getAppversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPVERSION$38);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "appversion" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAppversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPVERSION$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "appversion" attribute
                 */
                public boolean isSetAppversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(APPVERSION$38) != null;
                    }
                }
                
                /**
                 * Sets the "appversion" attribute
                 */
                public void setAppversion(java.lang.String appversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPVERSION$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPVERSION$38);
                      }
                      target.setStringValue(appversion);
                    }
                }
                
                /**
                 * Sets (as xml) the "appversion" attribute
                 */
                public void xsetAppversion(org.apache.xmlbeans.XmlString appversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPVERSION$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPVERSION$38);
                      }
                      target.set(appversion);
                    }
                }
                
                /**
                 * Unsets the "appversion" attribute
                 */
                public void unsetAppversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(APPVERSION$38);
                    }
                }
                
                /**
                 * Gets the "batterypercentage" attribute
                 */
                public java.lang.String getBatterypercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BATTERYPERCENTAGE$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "batterypercentage" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetBatterypercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BATTERYPERCENTAGE$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "batterypercentage" attribute
                 */
                public boolean isSetBatterypercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(BATTERYPERCENTAGE$40) != null;
                    }
                }
                
                /**
                 * Sets the "batterypercentage" attribute
                 */
                public void setBatterypercentage(java.lang.String batterypercentage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BATTERYPERCENTAGE$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BATTERYPERCENTAGE$40);
                      }
                      target.setStringValue(batterypercentage);
                    }
                }
                
                /**
                 * Sets (as xml) the "batterypercentage" attribute
                 */
                public void xsetBatterypercentage(org.apache.xmlbeans.XmlString batterypercentage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BATTERYPERCENTAGE$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BATTERYPERCENTAGE$40);
                      }
                      target.set(batterypercentage);
                    }
                }
                
                /**
                 * Unsets the "batterypercentage" attribute
                 */
                public void unsetBatterypercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(BATTERYPERCENTAGE$40);
                    }
                }
                
                /**
                 * Gets the "connectiontype" attribute
                 */
                public java.lang.String getConnectiontype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONTYPE$42);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "connectiontype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetConnectiontype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTIONTYPE$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "connectiontype" attribute
                 */
                public boolean isSetConnectiontype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CONNECTIONTYPE$42) != null;
                    }
                }
                
                /**
                 * Sets the "connectiontype" attribute
                 */
                public void setConnectiontype(java.lang.String connectiontype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONTYPE$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONTYPE$42);
                      }
                      target.setStringValue(connectiontype);
                    }
                }
                
                /**
                 * Sets (as xml) the "connectiontype" attribute
                 */
                public void xsetConnectiontype(org.apache.xmlbeans.XmlString connectiontype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTIONTYPE$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTIONTYPE$42);
                      }
                      target.set(connectiontype);
                    }
                }
                
                /**
                 * Unsets the "connectiontype" attribute
                 */
                public void unsetConnectiontype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CONNECTIONTYPE$42);
                    }
                }
                
                /**
                 * Gets the "devicemanufacturer" attribute
                 */
                public java.lang.String getDevicemanufacturer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICEMANUFACTURER$44);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "devicemanufacturer" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDevicemanufacturer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICEMANUFACTURER$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "devicemanufacturer" attribute
                 */
                public boolean isSetDevicemanufacturer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DEVICEMANUFACTURER$44) != null;
                    }
                }
                
                /**
                 * Sets the "devicemanufacturer" attribute
                 */
                public void setDevicemanufacturer(java.lang.String devicemanufacturer)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICEMANUFACTURER$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEVICEMANUFACTURER$44);
                      }
                      target.setStringValue(devicemanufacturer);
                    }
                }
                
                /**
                 * Sets (as xml) the "devicemanufacturer" attribute
                 */
                public void xsetDevicemanufacturer(org.apache.xmlbeans.XmlString devicemanufacturer)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICEMANUFACTURER$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEVICEMANUFACTURER$44);
                      }
                      target.set(devicemanufacturer);
                    }
                }
                
                /**
                 * Unsets the "devicemanufacturer" attribute
                 */
                public void unsetDevicemanufacturer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DEVICEMANUFACTURER$44);
                    }
                }
                
                /**
                 * Gets the "devicename" attribute
                 */
                public java.lang.String getDevicename()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICENAME$46);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "devicename" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDevicename()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICENAME$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "devicename" attribute
                 */
                public boolean isSetDevicename()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DEVICENAME$46) != null;
                    }
                }
                
                /**
                 * Sets the "devicename" attribute
                 */
                public void setDevicename(java.lang.String devicename)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICENAME$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEVICENAME$46);
                      }
                      target.setStringValue(devicename);
                    }
                }
                
                /**
                 * Sets (as xml) the "devicename" attribute
                 */
                public void xsetDevicename(org.apache.xmlbeans.XmlString devicename)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICENAME$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEVICENAME$46);
                      }
                      target.set(devicename);
                    }
                }
                
                /**
                 * Unsets the "devicename" attribute
                 */
                public void unsetDevicename()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DEVICENAME$46);
                    }
                }
                
                /**
                 * Gets the "deviceos" attribute
                 */
                public java.lang.String getDeviceos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICEOS$48);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "deviceos" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDeviceos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICEOS$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "deviceos" attribute
                 */
                public boolean isSetDeviceos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DEVICEOS$48) != null;
                    }
                }
                
                /**
                 * Sets the "deviceos" attribute
                 */
                public void setDeviceos(java.lang.String deviceos)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICEOS$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEVICEOS$48);
                      }
                      target.setStringValue(deviceos);
                    }
                }
                
                /**
                 * Sets (as xml) the "deviceos" attribute
                 */
                public void xsetDeviceos(org.apache.xmlbeans.XmlString deviceos)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICEOS$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEVICEOS$48);
                      }
                      target.set(deviceos);
                    }
                }
                
                /**
                 * Unsets the "deviceos" attribute
                 */
                public void unsetDeviceos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DEVICEOS$48);
                    }
                }
                
                /**
                 * Gets the "physicalmemory" attribute
                 */
                public java.lang.String getPhysicalmemory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHYSICALMEMORY$50);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "physicalmemory" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPhysicalmemory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHYSICALMEMORY$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "physicalmemory" attribute
                 */
                public boolean isSetPhysicalmemory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PHYSICALMEMORY$50) != null;
                    }
                }
                
                /**
                 * Sets the "physicalmemory" attribute
                 */
                public void setPhysicalmemory(java.lang.String physicalmemory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHYSICALMEMORY$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHYSICALMEMORY$50);
                      }
                      target.setStringValue(physicalmemory);
                    }
                }
                
                /**
                 * Sets (as xml) the "physicalmemory" attribute
                 */
                public void xsetPhysicalmemory(org.apache.xmlbeans.XmlString physicalmemory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PHYSICALMEMORY$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PHYSICALMEMORY$50);
                      }
                      target.set(physicalmemory);
                    }
                }
                
                /**
                 * Unsets the "physicalmemory" attribute
                 */
                public void unsetPhysicalmemory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PHYSICALMEMORY$50);
                    }
                }
                
                /**
                 * Gets the "runningprocesscount" attribute
                 */
                public java.lang.String getRunningprocesscount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNNINGPROCESSCOUNT$52);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "runningprocesscount" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetRunningprocesscount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RUNNINGPROCESSCOUNT$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "runningprocesscount" attribute
                 */
                public boolean isSetRunningprocesscount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RUNNINGPROCESSCOUNT$52) != null;
                    }
                }
                
                /**
                 * Sets the "runningprocesscount" attribute
                 */
                public void setRunningprocesscount(java.lang.String runningprocesscount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNNINGPROCESSCOUNT$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNNINGPROCESSCOUNT$52);
                      }
                      target.setStringValue(runningprocesscount);
                    }
                }
                
                /**
                 * Sets (as xml) the "runningprocesscount" attribute
                 */
                public void xsetRunningprocesscount(org.apache.xmlbeans.XmlString runningprocesscount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RUNNINGPROCESSCOUNT$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RUNNINGPROCESSCOUNT$52);
                      }
                      target.set(runningprocesscount);
                    }
                }
                
                /**
                 * Unsets the "runningprocesscount" attribute
                 */
                public void unsetRunningprocesscount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RUNNINGPROCESSCOUNT$52);
                    }
                }
                
                /**
                 * Gets the "memoryfreepercentage" attribute
                 */
                public java.lang.String getMemoryfreepercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMORYFREEPERCENTAGE$54);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "memoryfreepercentage" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMemoryfreepercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEMORYFREEPERCENTAGE$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "memoryfreepercentage" attribute
                 */
                public boolean isSetMemoryfreepercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MEMORYFREEPERCENTAGE$54) != null;
                    }
                }
                
                /**
                 * Sets the "memoryfreepercentage" attribute
                 */
                public void setMemoryfreepercentage(java.lang.String memoryfreepercentage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMORYFREEPERCENTAGE$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEMORYFREEPERCENTAGE$54);
                      }
                      target.setStringValue(memoryfreepercentage);
                    }
                }
                
                /**
                 * Sets (as xml) the "memoryfreepercentage" attribute
                 */
                public void xsetMemoryfreepercentage(org.apache.xmlbeans.XmlString memoryfreepercentage)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEMORYFREEPERCENTAGE$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEMORYFREEPERCENTAGE$54);
                      }
                      target.set(memoryfreepercentage);
                    }
                }
                
                /**
                 * Unsets the "memoryfreepercentage" attribute
                 */
                public void unsetMemoryfreepercentage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MEMORYFREEPERCENTAGE$54);
                    }
                }
                
                /**
                 * Gets the "applicationbuildversion" attribute
                 */
                public java.lang.String getApplicationbuildversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONBUILDVERSION$56);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "applicationbuildversion" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetApplicationbuildversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONBUILDVERSION$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "applicationbuildversion" attribute
                 */
                public boolean isSetApplicationbuildversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(APPLICATIONBUILDVERSION$56) != null;
                    }
                }
                
                /**
                 * Sets the "applicationbuildversion" attribute
                 */
                public void setApplicationbuildversion(java.lang.String applicationbuildversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONBUILDVERSION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONBUILDVERSION$56);
                      }
                      target.setStringValue(applicationbuildversion);
                    }
                }
                
                /**
                 * Sets (as xml) the "applicationbuildversion" attribute
                 */
                public void xsetApplicationbuildversion(org.apache.xmlbeans.XmlString applicationbuildversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONBUILDVERSION$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATIONBUILDVERSION$56);
                      }
                      target.set(applicationbuildversion);
                    }
                }
                
                /**
                 * Unsets the "applicationbuildversion" attribute
                 */
                public void unsetApplicationbuildversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(APPLICATIONBUILDVERSION$56);
                    }
                }
                
                /**
                 * Gets the "applicationid" attribute
                 */
                public java.lang.String getApplicationid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$58);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "applicationid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetApplicationid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "applicationid" attribute
                 */
                public boolean isSetApplicationid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(APPLICATIONID$58) != null;
                    }
                }
                
                /**
                 * Sets the "applicationid" attribute
                 */
                public void setApplicationid(java.lang.String applicationid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONID$58);
                      }
                      target.setStringValue(applicationid);
                    }
                }
                
                /**
                 * Sets (as xml) the "applicationid" attribute
                 */
                public void xsetApplicationid(org.apache.xmlbeans.XmlString applicationid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATIONID$58);
                      }
                      target.set(applicationid);
                    }
                }
                
                /**
                 * Unsets the "applicationid" attribute
                 */
                public void unsetApplicationid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(APPLICATIONID$58);
                    }
                }
                
                /**
                 * Gets the "modelid" attribute
                 */
                public java.lang.String getModelid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$60);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "modelid" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetModelid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$60);
                      return target;
                    }
                }
                
                /**
                 * True if has "modelid" attribute
                 */
                public boolean isSetModelid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MODELID$60) != null;
                    }
                }
                
                /**
                 * Sets the "modelid" attribute
                 */
                public void setModelid(java.lang.String modelid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODELID$60);
                      }
                      target.setStringValue(modelid);
                    }
                }
                
                /**
                 * Sets (as xml) the "modelid" attribute
                 */
                public void xsetModelid(org.apache.xmlbeans.XmlString modelid)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODELID$60);
                      }
                      target.set(modelid);
                    }
                }
                
                /**
                 * Unsets the "modelid" attribute
                 */
                public void unsetModelid()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MODELID$60);
                    }
                }
                
                /**
                 * Gets the "cpu" attribute
                 */
                public java.lang.String getCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$62);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu" attribute
                 */
                public boolean isSetCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPU$62) != null;
                    }
                }
                
                /**
                 * Sets the "cpu" attribute
                 */
                public void setCpu(java.lang.String cpu)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPU$62);
                      }
                      target.setStringValue(cpu);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu" attribute
                 */
                public void xsetCpu(org.apache.xmlbeans.XmlString cpu)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CPU$62);
                      }
                      target.set(cpu);
                    }
                }
                
                /**
                 * Unsets the "cpu" attribute
                 */
                public void unsetCpu()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPU$62);
                    }
                }
                
                /**
                 * Gets the "resolution" attribute
                 */
                public java.lang.String getResolution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLUTION$64);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "resolution" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetResolution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOLUTION$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "resolution" attribute
                 */
                public boolean isSetResolution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RESOLUTION$64) != null;
                    }
                }
                
                /**
                 * Sets the "resolution" attribute
                 */
                public void setResolution(java.lang.String resolution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLUTION$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOLUTION$64);
                      }
                      target.setStringValue(resolution);
                    }
                }
                
                /**
                 * Sets (as xml) the "resolution" attribute
                 */
                public void xsetResolution(org.apache.xmlbeans.XmlString resolution)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOLUTION$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOLUTION$64);
                      }
                      target.set(resolution);
                    }
                }
                
                /**
                 * Unsets the "resolution" attribute
                 */
                public void unsetResolution()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RESOLUTION$64);
                    }
                }
                
                /**
                 * Gets the "orientation" attribute
                 */
                public java.lang.String getOrientation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$66);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "orientation" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetOrientation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIENTATION$66);
                      return target;
                    }
                }
                
                /**
                 * True if has "orientation" attribute
                 */
                public boolean isSetOrientation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ORIENTATION$66) != null;
                    }
                }
                
                /**
                 * Sets the "orientation" attribute
                 */
                public void setOrientation(java.lang.String orientation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$66);
                      }
                      target.setStringValue(orientation);
                    }
                }
                
                /**
                 * Sets (as xml) the "orientation" attribute
                 */
                public void xsetOrientation(org.apache.xmlbeans.XmlString orientation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIENTATION$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIENTATION$66);
                      }
                      target.set(orientation);
                    }
                }
                
                /**
                 * Unsets the "orientation" attribute
                 */
                public void unsetOrientation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ORIENTATION$66);
                    }
                }
                
                /**
                 * Gets the "carrier" attribute
                 */
                public java.lang.String getCarrier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIER$68);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "carrier" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCarrier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARRIER$68);
                      return target;
                    }
                }
                
                /**
                 * True if has "carrier" attribute
                 */
                public boolean isSetCarrier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CARRIER$68) != null;
                    }
                }
                
                /**
                 * Sets the "carrier" attribute
                 */
                public void setCarrier(java.lang.String carrier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIER$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARRIER$68);
                      }
                      target.setStringValue(carrier);
                    }
                }
                
                /**
                 * Sets (as xml) the "carrier" attribute
                 */
                public void xsetCarrier(org.apache.xmlbeans.XmlString carrier)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARRIER$68);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CARRIER$68);
                      }
                      target.set(carrier);
                    }
                }
                
                /**
                 * Unsets the "carrier" attribute
                 */
                public void unsetCarrier()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CARRIER$68);
                    }
                }
                
                /**
                 * Gets the "signalstrength" attribute
                 */
                public java.lang.String getSignalstrength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALSTRENGTH$70);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "signalstrength" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSignalstrength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGNALSTRENGTH$70);
                      return target;
                    }
                }
                
                /**
                 * True if has "signalstrength" attribute
                 */
                public boolean isSetSignalstrength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SIGNALSTRENGTH$70) != null;
                    }
                }
                
                /**
                 * Sets the "signalstrength" attribute
                 */
                public void setSignalstrength(java.lang.String signalstrength)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALSTRENGTH$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGNALSTRENGTH$70);
                      }
                      target.setStringValue(signalstrength);
                    }
                }
                
                /**
                 * Sets (as xml) the "signalstrength" attribute
                 */
                public void xsetSignalstrength(org.apache.xmlbeans.XmlString signalstrength)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGNALSTRENGTH$70);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIGNALSTRENGTH$70);
                      }
                      target.set(signalstrength);
                    }
                }
                
                /**
                 * Unsets the "signalstrength" attribute
                 */
                public void unsetSignalstrength()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SIGNALSTRENGTH$70);
                    }
                }
                
                /**
                 * Gets the "gpslocation" attribute
                 */
                public java.lang.String getGpslocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSLOCATION$72);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "gpslocation" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetGpslocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GPSLOCATION$72);
                      return target;
                    }
                }
                
                /**
                 * True if has "gpslocation" attribute
                 */
                public boolean isSetGpslocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(GPSLOCATION$72) != null;
                    }
                }
                
                /**
                 * Sets the "gpslocation" attribute
                 */
                public void setGpslocation(java.lang.String gpslocation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSLOCATION$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSLOCATION$72);
                      }
                      target.setStringValue(gpslocation);
                    }
                }
                
                /**
                 * Sets (as xml) the "gpslocation" attribute
                 */
                public void xsetGpslocation(org.apache.xmlbeans.XmlString gpslocation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GPSLOCATION$72);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GPSLOCATION$72);
                      }
                      target.set(gpslocation);
                    }
                }
                
                /**
                 * Unsets the "gpslocation" attribute
                 */
                public void unsetGpslocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(GPSLOCATION$72);
                    }
                }
                
                /**
                 * Gets the "rooted" attribute
                 */
                public java.lang.String getRooted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTED$74);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rooted" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetRooted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTED$74);
                      return target;
                    }
                }
                
                /**
                 * True if has "rooted" attribute
                 */
                public boolean isSetRooted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ROOTED$74) != null;
                    }
                }
                
                /**
                 * Sets the "rooted" attribute
                 */
                public void setRooted(java.lang.String rooted)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTED$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOTED$74);
                      }
                      target.setStringValue(rooted);
                    }
                }
                
                /**
                 * Sets (as xml) the "rooted" attribute
                 */
                public void xsetRooted(org.apache.xmlbeans.XmlString rooted)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTED$74);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROOTED$74);
                      }
                      target.set(rooted);
                    }
                }
                
                /**
                 * Unsets the "rooted" attribute
                 */
                public void unsetRooted()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ROOTED$74);
                    }
                }
                
                /**
                 * Gets the "adkversion" attribute
                 */
                public java.lang.String getAdkversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADKVERSION$76);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "adkversion" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAdkversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADKVERSION$76);
                      return target;
                    }
                }
                
                /**
                 * True if has "adkversion" attribute
                 */
                public boolean isSetAdkversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ADKVERSION$76) != null;
                    }
                }
                
                /**
                 * Sets the "adkversion" attribute
                 */
                public void setAdkversion(java.lang.String adkversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADKVERSION$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADKVERSION$76);
                      }
                      target.setStringValue(adkversion);
                    }
                }
                
                /**
                 * Sets (as xml) the "adkversion" attribute
                 */
                public void xsetAdkversion(org.apache.xmlbeans.XmlString adkversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADKVERSION$76);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADKVERSION$76);
                      }
                      target.set(adkversion);
                    }
                }
                
                /**
                 * Unsets the "adkversion" attribute
                 */
                public void unsetAdkversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ADKVERSION$76);
                    }
                }
                
                /**
                 * Gets the "application" attribute
                 */
                public java.lang.String getApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$78);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "application" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$78);
                      return target;
                    }
                }
                
                /**
                 * True if has "application" attribute
                 */
                public boolean isSetApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(APPLICATION$78) != null;
                    }
                }
                
                /**
                 * Sets the "application" attribute
                 */
                public void setApplication(java.lang.String application)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATION$78);
                      }
                      target.setStringValue(application);
                    }
                }
                
                /**
                 * Sets (as xml) the "application" attribute
                 */
                public void xsetApplication(org.apache.xmlbeans.XmlString application)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$78);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATION$78);
                      }
                      target.set(application);
                    }
                }
                
                /**
                 * Unsets the "application" attribute
                 */
                public void unsetApplication()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(APPLICATION$78);
                    }
                }
                
                /**
                 * Gets the "networktechnology" attribute
                 */
                public java.lang.String getNetworktechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKTECHNOLOGY$80);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "networktechnology" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetNetworktechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NETWORKTECHNOLOGY$80);
                      return target;
                    }
                }
                
                /**
                 * True if has "networktechnology" attribute
                 */
                public boolean isSetNetworktechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NETWORKTECHNOLOGY$80) != null;
                    }
                }
                
                /**
                 * Sets the "networktechnology" attribute
                 */
                public void setNetworktechnology(java.lang.String networktechnology)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKTECHNOLOGY$80);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NETWORKTECHNOLOGY$80);
                      }
                      target.setStringValue(networktechnology);
                    }
                }
                
                /**
                 * Sets (as xml) the "networktechnology" attribute
                 */
                public void xsetNetworktechnology(org.apache.xmlbeans.XmlString networktechnology)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NETWORKTECHNOLOGY$80);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NETWORKTECHNOLOGY$80);
                      }
                      target.set(networktechnology);
                    }
                }
                
                /**
                 * Unsets the "networktechnology" attribute
                 */
                public void unsetNetworktechnology()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NETWORKTECHNOLOGY$80);
                    }
                }
                
                /**
                 * Gets the "column" attribute
                 */
                public java.math.BigInteger getColumn()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMN$82);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "column" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetColumn()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COLUMN$82);
                      return target;
                    }
                }
                
                /**
                 * True if has "column" attribute
                 */
                public boolean isSetColumn()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(COLUMN$82) != null;
                    }
                }
                
                /**
                 * Sets the "column" attribute
                 */
                public void setColumn(java.math.BigInteger column)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLUMN$82);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLUMN$82);
                      }
                      target.setBigIntegerValue(column);
                    }
                }
                
                /**
                 * Sets (as xml) the "column" attribute
                 */
                public void xsetColumn(org.apache.xmlbeans.XmlInteger column)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COLUMN$82);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COLUMN$82);
                      }
                      target.set(column);
                    }
                }
                
                /**
                 * Unsets the "column" attribute
                 */
                public void unsetColumn()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(COLUMN$82);
                    }
                }
                
                /**
                 * Gets the "stack" attribute
                 */
                public java.lang.String getStack()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STACK$84);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "stack" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStack()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STACK$84);
                      return target;
                    }
                }
                
                /**
                 * True if has "stack" attribute
                 */
                public boolean isSetStack()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STACK$84) != null;
                    }
                }
                
                /**
                 * Sets the "stack" attribute
                 */
                public void setStack(java.lang.String stack)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STACK$84);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STACK$84);
                      }
                      target.setStringValue(stack);
                    }
                }
                
                /**
                 * Sets (as xml) the "stack" attribute
                 */
                public void xsetStack(org.apache.xmlbeans.XmlString stack)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STACK$84);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STACK$84);
                      }
                      target.set(stack);
                    }
                }
                
                /**
                 * Unsets the "stack" attribute
                 */
                public void unsetStack()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STACK$84);
                    }
                }
                
                /**
                 * Gets the "code" attribute
                 */
                public java.math.BigInteger getCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$86);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "code" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CODE$86);
                      return target;
                    }
                }
                
                /**
                 * True if has "code" attribute
                 */
                public boolean isSetCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CODE$86) != null;
                    }
                }
                
                /**
                 * Sets the "code" attribute
                 */
                public void setCode(java.math.BigInteger code)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$86);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$86);
                      }
                      target.setBigIntegerValue(code);
                    }
                }
                
                /**
                 * Sets (as xml) the "code" attribute
                 */
                public void xsetCode(org.apache.xmlbeans.XmlInteger code)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CODE$86);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CODE$86);
                      }
                      target.set(code);
                    }
                }
                
                /**
                 * Unsets the "code" attribute
                 */
                public void unsetCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CODE$86);
                    }
                }
            }
        }
    }
}
