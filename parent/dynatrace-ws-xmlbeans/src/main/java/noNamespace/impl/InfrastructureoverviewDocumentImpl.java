/*
 * An XML document type.
 * Localname: infrastructureoverview
 * Namespace: 
 * Java type: noNamespace.InfrastructureoverviewDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one infrastructureoverview(@) element.
 *
 * This is a complex type.
 */
public class InfrastructureoverviewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument
{
    private static final long serialVersionUID = 1L;
    
    public InfrastructureoverviewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INFRASTRUCTUREOVERVIEW$0 = 
        new javax.xml.namespace.QName("", "infrastructureoverview");
    
    
    /**
     * Gets the "infrastructureoverview" element
     */
    public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview getInfrastructureoverview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructureoverviewDocument.Infrastructureoverview target = null;
            target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().find_element_user(INFRASTRUCTUREOVERVIEW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "infrastructureoverview" element
     */
    public void setInfrastructureoverview(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview infrastructureoverview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructureoverviewDocument.Infrastructureoverview target = null;
            target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().find_element_user(INFRASTRUCTUREOVERVIEW$0, 0);
            if (target == null)
            {
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().add_element_user(INFRASTRUCTUREOVERVIEW$0);
            }
            target.set(infrastructureoverview);
        }
    }
    
    /**
     * Appends and returns a new empty "infrastructureoverview" element
     */
    public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview addNewInfrastructureoverview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.InfrastructureoverviewDocument.Infrastructureoverview target = null;
            target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview)get_store().add_element_user(INFRASTRUCTUREOVERVIEW$0);
            return target;
        }
    }
    /**
     * An XML infrastructureoverview(@).
     *
     * This is a complex type.
     */
    public static class InfrastructureoverviewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview
    {
        private static final long serialVersionUID = 1L;
        
        public InfrastructureoverviewImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName INFRASTRUCTUREHOSTS$4 = 
            new javax.xml.namespace.QName("", "infrastructurehosts");
        private static final javax.xml.namespace.QName INFRASTRUCTUREPROCESSES$6 = 
            new javax.xml.namespace.QName("", "infrastructureprocesses");
        private static final javax.xml.namespace.QName INFRASTRUCTURETOPOLOGYRECORDS$8 = 
            new javax.xml.namespace.QName("", "infrastructuretopologyrecords");
        private static final javax.xml.namespace.QName INFRASTRUCTUREBYLABELRECORDS$10 = 
            new javax.xml.namespace.QName("", "infrastructurebylabelrecords");
        private static final javax.xml.namespace.QName NAME$12 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$14 = 
            new javax.xml.namespace.QName("", "description");
        
        
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
         * Gets the "infrastructurehosts" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts getInfrastructurehosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts)get_store().find_element_user(INFRASTRUCTUREHOSTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "infrastructurehosts" element
         */
        public boolean isSetInfrastructurehosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFRASTRUCTUREHOSTS$4) != 0;
            }
        }
        
        /**
         * Sets the "infrastructurehosts" element
         */
        public void setInfrastructurehosts(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts infrastructurehosts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts)get_store().find_element_user(INFRASTRUCTUREHOSTS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts)get_store().add_element_user(INFRASTRUCTUREHOSTS$4);
                }
                target.set(infrastructurehosts);
            }
        }
        
        /**
         * Appends and returns a new empty "infrastructurehosts" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts addNewInfrastructurehosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts)get_store().add_element_user(INFRASTRUCTUREHOSTS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "infrastructurehosts" element
         */
        public void unsetInfrastructurehosts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFRASTRUCTUREHOSTS$4, 0);
            }
        }
        
        /**
         * Gets the "infrastructureprocesses" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses getInfrastructureprocesses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses)get_store().find_element_user(INFRASTRUCTUREPROCESSES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "infrastructureprocesses" element
         */
        public boolean isSetInfrastructureprocesses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFRASTRUCTUREPROCESSES$6) != 0;
            }
        }
        
        /**
         * Sets the "infrastructureprocesses" element
         */
        public void setInfrastructureprocesses(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses infrastructureprocesses)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses)get_store().find_element_user(INFRASTRUCTUREPROCESSES$6, 0);
                if (target == null)
                {
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses)get_store().add_element_user(INFRASTRUCTUREPROCESSES$6);
                }
                target.set(infrastructureprocesses);
            }
        }
        
        /**
         * Appends and returns a new empty "infrastructureprocesses" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses addNewInfrastructureprocesses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses)get_store().add_element_user(INFRASTRUCTUREPROCESSES$6);
                return target;
            }
        }
        
        /**
         * Unsets the "infrastructureprocesses" element
         */
        public void unsetInfrastructureprocesses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFRASTRUCTUREPROCESSES$6, 0);
            }
        }
        
        /**
         * Gets the "infrastructuretopologyrecords" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords getInfrastructuretopologyrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORDS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "infrastructuretopologyrecords" element
         */
        public boolean isSetInfrastructuretopologyrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFRASTRUCTURETOPOLOGYRECORDS$8) != 0;
            }
        }
        
        /**
         * Sets the "infrastructuretopologyrecords" element
         */
        public void setInfrastructuretopologyrecords(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords infrastructuretopologyrecords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORDS$8, 0);
                if (target == null)
                {
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords)get_store().add_element_user(INFRASTRUCTURETOPOLOGYRECORDS$8);
                }
                target.set(infrastructuretopologyrecords);
            }
        }
        
        /**
         * Appends and returns a new empty "infrastructuretopologyrecords" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords addNewInfrastructuretopologyrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords)get_store().add_element_user(INFRASTRUCTURETOPOLOGYRECORDS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "infrastructuretopologyrecords" element
         */
        public void unsetInfrastructuretopologyrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFRASTRUCTURETOPOLOGYRECORDS$8, 0);
            }
        }
        
        /**
         * Gets the "infrastructurebylabelrecords" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords getInfrastructurebylabelrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORDS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "infrastructurebylabelrecords" element
         */
        public boolean isSetInfrastructurebylabelrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFRASTRUCTUREBYLABELRECORDS$10) != 0;
            }
        }
        
        /**
         * Sets the "infrastructurebylabelrecords" element
         */
        public void setInfrastructurebylabelrecords(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords infrastructurebylabelrecords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORDS$10, 0);
                if (target == null)
                {
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords)get_store().add_element_user(INFRASTRUCTUREBYLABELRECORDS$10);
                }
                target.set(infrastructurebylabelrecords);
            }
        }
        
        /**
         * Appends and returns a new empty "infrastructurebylabelrecords" element
         */
        public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords addNewInfrastructurebylabelrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords target = null;
                target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords)get_store().add_element_user(INFRASTRUCTUREBYLABELRECORDS$10);
                return target;
            }
        }
        
        /**
         * Unsets the "infrastructurebylabelrecords" element
         */
        public void unsetInfrastructurebylabelrecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFRASTRUCTUREBYLABELRECORDS$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$14);
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
                return get_store().find_attribute_user(DESCRIPTION$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$14);
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
                get_store().remove_attribute(DESCRIPTION$14);
            }
        }
        /**
         * An XML infrastructurehosts(@).
         *
         * This is a complex type.
         */
        public static class InfrastructurehostsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts
        {
            private static final long serialVersionUID = 1L;
            
            public InfrastructurehostsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INFRASTRUCTUREHOST$0 = 
                new javax.xml.namespace.QName("", "infrastructurehost");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "infrastructurehost" elements
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost[] getInfrastructurehostArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INFRASTRUCTUREHOST$0, targetList);
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost[] result = new noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "infrastructurehost" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost getInfrastructurehostArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost)get_store().find_element_user(INFRASTRUCTUREHOST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "infrastructurehost" element
             */
            public int sizeOfInfrastructurehostArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INFRASTRUCTUREHOST$0);
                }
            }
            
            /**
             * Sets array of all "infrastructurehost" element
             */
            public void setInfrastructurehostArray(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost[] infrastructurehostArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(infrastructurehostArray, INFRASTRUCTUREHOST$0);
                }
            }
            
            /**
             * Sets ith "infrastructurehost" element
             */
            public void setInfrastructurehostArray(int i, noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost infrastructurehost)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost)get_store().find_element_user(INFRASTRUCTUREHOST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(infrastructurehost);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "infrastructurehost" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost insertNewInfrastructurehost(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost)get_store().insert_element_user(INFRASTRUCTUREHOST$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "infrastructurehost" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost addNewInfrastructurehost()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost)get_store().add_element_user(INFRASTRUCTUREHOST$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "infrastructurehost" element
             */
            public void removeInfrastructurehost(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INFRASTRUCTUREHOST$0, i);
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
             * An XML infrastructurehost(@).
             *
             * This is a complex type.
             */
            public static class InfrastructurehostImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurehosts.Infrastructurehost
            {
                private static final long serialVersionUID = 1L;
                
                public InfrastructurehostImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName HEALTH$0 = 
                    new javax.xml.namespace.QName("", "health");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName HEALTHHISTORY$4 = 
                    new javax.xml.namespace.QName("", "healthhistory");
                private static final javax.xml.namespace.QName STATUS$6 = 
                    new javax.xml.namespace.QName("", "status");
                private static final javax.xml.namespace.QName ASSIGNEES$8 = 
                    new javax.xml.namespace.QName("", "assignees");
                private static final javax.xml.namespace.QName SITE$10 = 
                    new javax.xml.namespace.QName("", "site");
                private static final javax.xml.namespace.QName HOSTGROUPS$12 = 
                    new javax.xml.namespace.QName("", "hostgroups");
                private static final javax.xml.namespace.QName LABELS$14 = 
                    new javax.xml.namespace.QName("", "labels");
                private static final javax.xml.namespace.QName ADDRESS$16 = 
                    new javax.xml.namespace.QName("", "address");
                private static final javax.xml.namespace.QName OSNAME$18 = 
                    new javax.xml.namespace.QName("", "osname");
                private static final javax.xml.namespace.QName OSVERSION$20 = 
                    new javax.xml.namespace.QName("", "osversion");
                private static final javax.xml.namespace.QName HYPERVISORTYPE$22 = 
                    new javax.xml.namespace.QName("", "hypervisortype");
                private static final javax.xml.namespace.QName CLOUDTYPE$24 = 
                    new javax.xml.namespace.QName("", "cloudtype");
                private static final javax.xml.namespace.QName STATUSTEXT$26 = 
                    new javax.xml.namespace.QName("", "statustext");
                private static final javax.xml.namespace.QName CONTAINER$28 = 
                    new javax.xml.namespace.QName("", "container");
                
                
                /**
                 * Gets the "health" attribute
                 */
                public java.lang.String getHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "health" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "health" attribute
                 */
                public boolean isSetHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HEALTH$0) != null;
                    }
                }
                
                /**
                 * Sets the "health" attribute
                 */
                public void setHealth(java.lang.String health)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTH$0);
                      }
                      target.setStringValue(health);
                    }
                }
                
                /**
                 * Sets (as xml) the "health" attribute
                 */
                public void xsetHealth(org.apache.xmlbeans.XmlString health)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTH$0);
                      }
                      target.set(health);
                    }
                }
                
                /**
                 * Unsets the "health" attribute
                 */
                public void unsetHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HEALTH$0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "name" attribute
                 */
                public boolean isSetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAME$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Unsets the "name" attribute
                 */
                public void unsetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAME$2);
                    }
                }
                
                /**
                 * Gets the "healthhistory" attribute
                 */
                public java.lang.String getHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "healthhistory" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "healthhistory" attribute
                 */
                public boolean isSetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HEALTHHISTORY$4) != null;
                    }
                }
                
                /**
                 * Sets the "healthhistory" attribute
                 */
                public void setHealthhistory(java.lang.String healthhistory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTHHISTORY$4);
                      }
                      target.setStringValue(healthhistory);
                    }
                }
                
                /**
                 * Sets (as xml) the "healthhistory" attribute
                 */
                public void xsetHealthhistory(org.apache.xmlbeans.XmlString healthhistory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTHHISTORY$4);
                      }
                      target.set(healthhistory);
                    }
                }
                
                /**
                 * Unsets the "healthhistory" attribute
                 */
                public void unsetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HEALTHHISTORY$4);
                    }
                }
                
                /**
                 * Gets the "status" attribute
                 */
                public java.lang.String getStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "status" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "status" attribute
                 */
                public boolean isSetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATUS$6) != null;
                    }
                }
                
                /**
                 * Sets the "status" attribute
                 */
                public void setStatus(java.lang.String status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$6);
                      }
                      target.setStringValue(status);
                    }
                }
                
                /**
                 * Sets (as xml) the "status" attribute
                 */
                public void xsetStatus(org.apache.xmlbeans.XmlString status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$6);
                      }
                      target.set(status);
                    }
                }
                
                /**
                 * Unsets the "status" attribute
                 */
                public void unsetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATUS$6);
                    }
                }
                
                /**
                 * Gets the "assignees" attribute
                 */
                public java.lang.String getAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "assignees" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "assignees" attribute
                 */
                public boolean isSetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ASSIGNEES$8) != null;
                    }
                }
                
                /**
                 * Sets the "assignees" attribute
                 */
                public void setAssignees(java.lang.String assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNEES$8);
                      }
                      target.setStringValue(assignees);
                    }
                }
                
                /**
                 * Sets (as xml) the "assignees" attribute
                 */
                public void xsetAssignees(org.apache.xmlbeans.XmlString assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ASSIGNEES$8);
                      }
                      target.set(assignees);
                    }
                }
                
                /**
                 * Unsets the "assignees" attribute
                 */
                public void unsetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ASSIGNEES$8);
                    }
                }
                
                /**
                 * Gets the "site" attribute
                 */
                public java.lang.String getSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "site" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "site" attribute
                 */
                public boolean isSetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SITE$10) != null;
                    }
                }
                
                /**
                 * Sets the "site" attribute
                 */
                public void setSite(java.lang.String site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SITE$10);
                      }
                      target.setStringValue(site);
                    }
                }
                
                /**
                 * Sets (as xml) the "site" attribute
                 */
                public void xsetSite(org.apache.xmlbeans.XmlString site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SITE$10);
                      }
                      target.set(site);
                    }
                }
                
                /**
                 * Unsets the "site" attribute
                 */
                public void unsetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SITE$10);
                    }
                }
                
                /**
                 * Gets the "hostgroups" attribute
                 */
                public java.lang.String getHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUPS$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hostgroups" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUPS$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "hostgroups" attribute
                 */
                public boolean isSetHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOSTGROUPS$12) != null;
                    }
                }
                
                /**
                 * Sets the "hostgroups" attribute
                 */
                public void setHostgroups(java.lang.String hostgroups)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUPS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTGROUPS$12);
                      }
                      target.setStringValue(hostgroups);
                    }
                }
                
                /**
                 * Sets (as xml) the "hostgroups" attribute
                 */
                public void xsetHostgroups(org.apache.xmlbeans.XmlString hostgroups)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUPS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTGROUPS$12);
                      }
                      target.set(hostgroups);
                    }
                }
                
                /**
                 * Unsets the "hostgroups" attribute
                 */
                public void unsetHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOSTGROUPS$12);
                    }
                }
                
                /**
                 * Gets the "labels" attribute
                 */
                public java.lang.String getLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "labels" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "labels" attribute
                 */
                public boolean isSetLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LABELS$14) != null;
                    }
                }
                
                /**
                 * Sets the "labels" attribute
                 */
                public void setLabels(java.lang.String labels)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABELS$14);
                      }
                      target.setStringValue(labels);
                    }
                }
                
                /**
                 * Sets (as xml) the "labels" attribute
                 */
                public void xsetLabels(org.apache.xmlbeans.XmlString labels)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABELS$14);
                      }
                      target.set(labels);
                    }
                }
                
                /**
                 * Unsets the "labels" attribute
                 */
                public void unsetLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LABELS$14);
                    }
                }
                
                /**
                 * Gets the "address" attribute
                 */
                public java.lang.String getAddress()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "address" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAddress()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "address" attribute
                 */
                public boolean isSetAddress()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ADDRESS$16) != null;
                    }
                }
                
                /**
                 * Sets the "address" attribute
                 */
                public void setAddress(java.lang.String address)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESS$16);
                      }
                      target.setStringValue(address);
                    }
                }
                
                /**
                 * Sets (as xml) the "address" attribute
                 */
                public void xsetAddress(org.apache.xmlbeans.XmlString address)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESS$16);
                      }
                      target.set(address);
                    }
                }
                
                /**
                 * Unsets the "address" attribute
                 */
                public void unsetAddress()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ADDRESS$16);
                    }
                }
                
                /**
                 * Gets the "osname" attribute
                 */
                public java.lang.String getOsname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSNAME$18);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "osname" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetOsname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSNAME$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "osname" attribute
                 */
                public boolean isSetOsname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OSNAME$18) != null;
                    }
                }
                
                /**
                 * Sets the "osname" attribute
                 */
                public void setOsname(java.lang.String osname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSNAME$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OSNAME$18);
                      }
                      target.setStringValue(osname);
                    }
                }
                
                /**
                 * Sets (as xml) the "osname" attribute
                 */
                public void xsetOsname(org.apache.xmlbeans.XmlString osname)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSNAME$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OSNAME$18);
                      }
                      target.set(osname);
                    }
                }
                
                /**
                 * Unsets the "osname" attribute
                 */
                public void unsetOsname()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OSNAME$18);
                    }
                }
                
                /**
                 * Gets the "osversion" attribute
                 */
                public java.lang.String getOsversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSVERSION$20);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "osversion" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetOsversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSVERSION$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "osversion" attribute
                 */
                public boolean isSetOsversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OSVERSION$20) != null;
                    }
                }
                
                /**
                 * Sets the "osversion" attribute
                 */
                public void setOsversion(java.lang.String osversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSVERSION$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OSVERSION$20);
                      }
                      target.setStringValue(osversion);
                    }
                }
                
                /**
                 * Sets (as xml) the "osversion" attribute
                 */
                public void xsetOsversion(org.apache.xmlbeans.XmlString osversion)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSVERSION$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OSVERSION$20);
                      }
                      target.set(osversion);
                    }
                }
                
                /**
                 * Unsets the "osversion" attribute
                 */
                public void unsetOsversion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OSVERSION$20);
                    }
                }
                
                /**
                 * Gets the "hypervisortype" attribute
                 */
                public java.lang.String getHypervisortype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HYPERVISORTYPE$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hypervisortype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHypervisortype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HYPERVISORTYPE$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "hypervisortype" attribute
                 */
                public boolean isSetHypervisortype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HYPERVISORTYPE$22) != null;
                    }
                }
                
                /**
                 * Sets the "hypervisortype" attribute
                 */
                public void setHypervisortype(java.lang.String hypervisortype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HYPERVISORTYPE$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HYPERVISORTYPE$22);
                      }
                      target.setStringValue(hypervisortype);
                    }
                }
                
                /**
                 * Sets (as xml) the "hypervisortype" attribute
                 */
                public void xsetHypervisortype(org.apache.xmlbeans.XmlString hypervisortype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HYPERVISORTYPE$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HYPERVISORTYPE$22);
                      }
                      target.set(hypervisortype);
                    }
                }
                
                /**
                 * Unsets the "hypervisortype" attribute
                 */
                public void unsetHypervisortype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HYPERVISORTYPE$22);
                    }
                }
                
                /**
                 * Gets the "cloudtype" attribute
                 */
                public java.lang.String getCloudtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOUDTYPE$24);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cloudtype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetCloudtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLOUDTYPE$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "cloudtype" attribute
                 */
                public boolean isSetCloudtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLOUDTYPE$24) != null;
                    }
                }
                
                /**
                 * Sets the "cloudtype" attribute
                 */
                public void setCloudtype(java.lang.String cloudtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOUDTYPE$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLOUDTYPE$24);
                      }
                      target.setStringValue(cloudtype);
                    }
                }
                
                /**
                 * Sets (as xml) the "cloudtype" attribute
                 */
                public void xsetCloudtype(org.apache.xmlbeans.XmlString cloudtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLOUDTYPE$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLOUDTYPE$24);
                      }
                      target.set(cloudtype);
                    }
                }
                
                /**
                 * Unsets the "cloudtype" attribute
                 */
                public void unsetCloudtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLOUDTYPE$24);
                    }
                }
                
                /**
                 * Gets the "statustext" attribute
                 */
                public java.lang.String getStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSTEXT$26);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "statustext" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUSTEXT$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "statustext" attribute
                 */
                public boolean isSetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATUSTEXT$26) != null;
                    }
                }
                
                /**
                 * Sets the "statustext" attribute
                 */
                public void setStatustext(java.lang.String statustext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSTEXT$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUSTEXT$26);
                      }
                      target.setStringValue(statustext);
                    }
                }
                
                /**
                 * Sets (as xml) the "statustext" attribute
                 */
                public void xsetStatustext(org.apache.xmlbeans.XmlString statustext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUSTEXT$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUSTEXT$26);
                      }
                      target.set(statustext);
                    }
                }
                
                /**
                 * Unsets the "statustext" attribute
                 */
                public void unsetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATUSTEXT$26);
                    }
                }
                
                /**
                 * Gets the "container" attribute
                 */
                public java.lang.String getContainer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINER$28);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "container" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetContainer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTAINER$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "container" attribute
                 */
                public boolean isSetContainer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CONTAINER$28) != null;
                    }
                }
                
                /**
                 * Sets the "container" attribute
                 */
                public void setContainer(java.lang.String container)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINER$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINER$28);
                      }
                      target.setStringValue(container);
                    }
                }
                
                /**
                 * Sets (as xml) the "container" attribute
                 */
                public void xsetContainer(org.apache.xmlbeans.XmlString container)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTAINER$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTAINER$28);
                      }
                      target.set(container);
                    }
                }
                
                /**
                 * Unsets the "container" attribute
                 */
                public void unsetContainer()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CONTAINER$28);
                    }
                }
            }
        }
        /**
         * An XML infrastructureprocesses(@).
         *
         * This is a complex type.
         */
        public static class InfrastructureprocessesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses
        {
            private static final long serialVersionUID = 1L;
            
            public InfrastructureprocessesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INFRASTRUCTUREPROCESS$0 = 
                new javax.xml.namespace.QName("", "infrastructureprocess");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "infrastructureprocess" elements
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess[] getInfrastructureprocessArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INFRASTRUCTUREPROCESS$0, targetList);
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess[] result = new noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "infrastructureprocess" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess getInfrastructureprocessArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess)get_store().find_element_user(INFRASTRUCTUREPROCESS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "infrastructureprocess" element
             */
            public int sizeOfInfrastructureprocessArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INFRASTRUCTUREPROCESS$0);
                }
            }
            
            /**
             * Sets array of all "infrastructureprocess" element
             */
            public void setInfrastructureprocessArray(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess[] infrastructureprocessArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(infrastructureprocessArray, INFRASTRUCTUREPROCESS$0);
                }
            }
            
            /**
             * Sets ith "infrastructureprocess" element
             */
            public void setInfrastructureprocessArray(int i, noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess infrastructureprocess)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess)get_store().find_element_user(INFRASTRUCTUREPROCESS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(infrastructureprocess);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "infrastructureprocess" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess insertNewInfrastructureprocess(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess)get_store().insert_element_user(INFRASTRUCTUREPROCESS$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "infrastructureprocess" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess addNewInfrastructureprocess()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess)get_store().add_element_user(INFRASTRUCTUREPROCESS$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "infrastructureprocess" element
             */
            public void removeInfrastructureprocess(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INFRASTRUCTUREPROCESS$0, i);
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
             * An XML infrastructureprocess(@).
             *
             * This is a complex type.
             */
            public static class InfrastructureprocessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructureprocesses.Infrastructureprocess
            {
                private static final long serialVersionUID = 1L;
                
                public InfrastructureprocessImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName HEALTH$0 = 
                    new javax.xml.namespace.QName("", "health");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName TECHTYPE$4 = 
                    new javax.xml.namespace.QName("", "techtype");
                private static final javax.xml.namespace.QName HOSTNAME$6 = 
                    new javax.xml.namespace.QName("", "hostname");
                private static final javax.xml.namespace.QName STATUSTEXT$8 = 
                    new javax.xml.namespace.QName("", "statustext");
                private static final javax.xml.namespace.QName SITE$10 = 
                    new javax.xml.namespace.QName("", "site");
                private static final javax.xml.namespace.QName HOSTGROUPS$12 = 
                    new javax.xml.namespace.QName("", "hostgroups");
                private static final javax.xml.namespace.QName HOSTLABELS$14 = 
                    new javax.xml.namespace.QName("", "hostlabels");
                
                
                /**
                 * Gets the "health" attribute
                 */
                public java.lang.String getHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "health" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "health" attribute
                 */
                public boolean isSetHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HEALTH$0) != null;
                    }
                }
                
                /**
                 * Sets the "health" attribute
                 */
                public void setHealth(java.lang.String health)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTH$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTH$0);
                      }
                      target.setStringValue(health);
                    }
                }
                
                /**
                 * Sets (as xml) the "health" attribute
                 */
                public void xsetHealth(org.apache.xmlbeans.XmlString health)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTH$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTH$0);
                      }
                      target.set(health);
                    }
                }
                
                /**
                 * Unsets the "health" attribute
                 */
                public void unsetHealth()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HEALTH$0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "name" attribute
                 */
                public boolean isSetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAME$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Unsets the "name" attribute
                 */
                public void unsetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAME$2);
                    }
                }
                
                /**
                 * Gets the "techtype" attribute
                 */
                public java.lang.String getTechtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHTYPE$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "techtype" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetTechtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHTYPE$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "techtype" attribute
                 */
                public boolean isSetTechtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TECHTYPE$4) != null;
                    }
                }
                
                /**
                 * Sets the "techtype" attribute
                 */
                public void setTechtype(java.lang.String techtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TECHTYPE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TECHTYPE$4);
                      }
                      target.setStringValue(techtype);
                    }
                }
                
                /**
                 * Sets (as xml) the "techtype" attribute
                 */
                public void xsetTechtype(org.apache.xmlbeans.XmlString techtype)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TECHTYPE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TECHTYPE$4);
                      }
                      target.set(techtype);
                    }
                }
                
                /**
                 * Unsets the "techtype" attribute
                 */
                public void unsetTechtype()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TECHTYPE$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$6);
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
                      return get_store().find_attribute_user(HOSTNAME$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$6);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTNAME$6);
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
                      get_store().remove_attribute(HOSTNAME$6);
                    }
                }
                
                /**
                 * Gets the "statustext" attribute
                 */
                public java.lang.String getStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSTEXT$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "statustext" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUSTEXT$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "statustext" attribute
                 */
                public boolean isSetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATUSTEXT$8) != null;
                    }
                }
                
                /**
                 * Sets the "statustext" attribute
                 */
                public void setStatustext(java.lang.String statustext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUSTEXT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUSTEXT$8);
                      }
                      target.setStringValue(statustext);
                    }
                }
                
                /**
                 * Sets (as xml) the "statustext" attribute
                 */
                public void xsetStatustext(org.apache.xmlbeans.XmlString statustext)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUSTEXT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUSTEXT$8);
                      }
                      target.set(statustext);
                    }
                }
                
                /**
                 * Unsets the "statustext" attribute
                 */
                public void unsetStatustext()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATUSTEXT$8);
                    }
                }
                
                /**
                 * Gets the "site" attribute
                 */
                public java.lang.String getSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "site" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "site" attribute
                 */
                public boolean isSetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SITE$10) != null;
                    }
                }
                
                /**
                 * Sets the "site" attribute
                 */
                public void setSite(java.lang.String site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SITE$10);
                      }
                      target.setStringValue(site);
                    }
                }
                
                /**
                 * Sets (as xml) the "site" attribute
                 */
                public void xsetSite(org.apache.xmlbeans.XmlString site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SITE$10);
                      }
                      target.set(site);
                    }
                }
                
                /**
                 * Unsets the "site" attribute
                 */
                public void unsetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SITE$10);
                    }
                }
                
                /**
                 * Gets the "hostgroups" attribute
                 */
                public java.lang.String getHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUPS$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hostgroups" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUPS$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "hostgroups" attribute
                 */
                public boolean isSetHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOSTGROUPS$12) != null;
                    }
                }
                
                /**
                 * Sets the "hostgroups" attribute
                 */
                public void setHostgroups(java.lang.String hostgroups)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUPS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTGROUPS$12);
                      }
                      target.setStringValue(hostgroups);
                    }
                }
                
                /**
                 * Sets (as xml) the "hostgroups" attribute
                 */
                public void xsetHostgroups(org.apache.xmlbeans.XmlString hostgroups)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUPS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTGROUPS$12);
                      }
                      target.set(hostgroups);
                    }
                }
                
                /**
                 * Unsets the "hostgroups" attribute
                 */
                public void unsetHostgroups()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOSTGROUPS$12);
                    }
                }
                
                /**
                 * Gets the "hostlabels" attribute
                 */
                public java.lang.String getHostlabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTLABELS$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hostlabels" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHostlabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTLABELS$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "hostlabels" attribute
                 */
                public boolean isSetHostlabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOSTLABELS$14) != null;
                    }
                }
                
                /**
                 * Sets the "hostlabels" attribute
                 */
                public void setHostlabels(java.lang.String hostlabels)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTLABELS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTLABELS$14);
                      }
                      target.setStringValue(hostlabels);
                    }
                }
                
                /**
                 * Sets (as xml) the "hostlabels" attribute
                 */
                public void xsetHostlabels(org.apache.xmlbeans.XmlString hostlabels)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTLABELS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTLABELS$14);
                      }
                      target.set(hostlabels);
                    }
                }
                
                /**
                 * Unsets the "hostlabels" attribute
                 */
                public void unsetHostlabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOSTLABELS$14);
                    }
                }
            }
        }
        /**
         * An XML infrastructuretopologyrecords(@).
         *
         * This is a complex type.
         */
        public static class InfrastructuretopologyrecordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords
        {
            private static final long serialVersionUID = 1L;
            
            public InfrastructuretopologyrecordsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INFRASTRUCTURETOPOLOGYRECORD$0 = 
                new javax.xml.namespace.QName("", "infrastructuretopologyrecord");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "infrastructuretopologyrecord" elements
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord[] getInfrastructuretopologyrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INFRASTRUCTURETOPOLOGYRECORD$0, targetList);
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord[] result = new noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "infrastructuretopologyrecord" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord getInfrastructuretopologyrecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "infrastructuretopologyrecord" element
             */
            public int sizeOfInfrastructuretopologyrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INFRASTRUCTURETOPOLOGYRECORD$0);
                }
            }
            
            /**
             * Sets array of all "infrastructuretopologyrecord" element
             */
            public void setInfrastructuretopologyrecordArray(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord[] infrastructuretopologyrecordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(infrastructuretopologyrecordArray, INFRASTRUCTURETOPOLOGYRECORD$0);
                }
            }
            
            /**
             * Sets ith "infrastructuretopologyrecord" element
             */
            public void setInfrastructuretopologyrecordArray(int i, noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord infrastructuretopologyrecord)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(infrastructuretopologyrecord);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "infrastructuretopologyrecord" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord insertNewInfrastructuretopologyrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord)get_store().insert_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "infrastructuretopologyrecord" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord addNewInfrastructuretopologyrecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord)get_store().add_element_user(INFRASTRUCTURETOPOLOGYRECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "infrastructuretopologyrecord" element
             */
            public void removeInfrastructuretopologyrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INFRASTRUCTURETOPOLOGYRECORD$0, i);
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
             * An XML infrastructuretopologyrecord(@).
             *
             * This is a complex type.
             */
            public static class InfrastructuretopologyrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructuretopologyrecords.Infrastructuretopologyrecord
            {
                private static final long serialVersionUID = 1L;
                
                public InfrastructuretopologyrecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName INFRASTRUCTURETOPOLOGYRECORD$0 = 
                    new javax.xml.namespace.QName("", "infrastructuretopologyrecord");
                private static final javax.xml.namespace.QName STRUCTURE$2 = 
                    new javax.xml.namespace.QName("", "structure");
                private static final javax.xml.namespace.QName HEALTHHISTORY$4 = 
                    new javax.xml.namespace.QName("", "healthhistory");
                private static final javax.xml.namespace.QName DETAILS$6 = 
                    new javax.xml.namespace.QName("", "details");
                private static final javax.xml.namespace.QName STATUS$8 = 
                    new javax.xml.namespace.QName("", "status");
                private static final javax.xml.namespace.QName ASSIGNEES$10 = 
                    new javax.xml.namespace.QName("", "assignees");
                private static final javax.xml.namespace.QName LABELS$12 = 
                    new javax.xml.namespace.QName("", "labels");
                private static final javax.xml.namespace.QName OS$14 = 
                    new javax.xml.namespace.QName("", "os");
                
                
                /**
                 * Gets array of all "infrastructuretopologyrecord" elements
                 */
                public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] getInfrastructuretopologyrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(INFRASTRUCTURETOPOLOGYRECORD$0, targetList);
                      noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] result = new noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "infrastructuretopologyrecord" element
                 */
                public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord getInfrastructuretopologyrecordArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                      target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "infrastructuretopologyrecord" element
                 */
                public int sizeOfInfrastructuretopologyrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INFRASTRUCTURETOPOLOGYRECORD$0);
                    }
                }
                
                /**
                 * Sets array of all "infrastructuretopologyrecord" element
                 */
                public void setInfrastructuretopologyrecordArray(noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord[] infrastructuretopologyrecordArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(infrastructuretopologyrecordArray, INFRASTRUCTURETOPOLOGYRECORD$0);
                    }
                }
                
                /**
                 * Sets ith "infrastructuretopologyrecord" element
                 */
                public void setInfrastructuretopologyrecordArray(int i, noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord infrastructuretopologyrecord)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                      target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().find_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(infrastructuretopologyrecord);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "infrastructuretopologyrecord" element
                 */
                public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord insertNewInfrastructuretopologyrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                      target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().insert_element_user(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "infrastructuretopologyrecord" element
                 */
                public noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord addNewInfrastructuretopologyrecord()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord target = null;
                      target = (noNamespace.InfrastructuretopologyrecordDocument.Infrastructuretopologyrecord)get_store().add_element_user(INFRASTRUCTURETOPOLOGYRECORD$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "infrastructuretopologyrecord" element
                 */
                public void removeInfrastructuretopologyrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INFRASTRUCTURETOPOLOGYRECORD$0, i);
                    }
                }
                
                /**
                 * Gets the "structure" attribute
                 */
                public java.lang.String getStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "structure" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURE$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "structure" attribute
                 */
                public boolean isSetStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STRUCTURE$2) != null;
                    }
                }
                
                /**
                 * Sets the "structure" attribute
                 */
                public void setStructure(java.lang.String structure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTURE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTURE$2);
                      }
                      target.setStringValue(structure);
                    }
                }
                
                /**
                 * Sets (as xml) the "structure" attribute
                 */
                public void xsetStructure(org.apache.xmlbeans.XmlString structure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRUCTURE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRUCTURE$2);
                      }
                      target.set(structure);
                    }
                }
                
                /**
                 * Unsets the "structure" attribute
                 */
                public void unsetStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STRUCTURE$2);
                    }
                }
                
                /**
                 * Gets the "healthhistory" attribute
                 */
                public java.lang.String getHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "healthhistory" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "healthhistory" attribute
                 */
                public boolean isSetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HEALTHHISTORY$4) != null;
                    }
                }
                
                /**
                 * Sets the "healthhistory" attribute
                 */
                public void setHealthhistory(java.lang.String healthhistory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTHHISTORY$4);
                      }
                      target.setStringValue(healthhistory);
                    }
                }
                
                /**
                 * Sets (as xml) the "healthhistory" attribute
                 */
                public void xsetHealthhistory(org.apache.xmlbeans.XmlString healthhistory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTHHISTORY$4);
                      }
                      target.set(healthhistory);
                    }
                }
                
                /**
                 * Unsets the "healthhistory" attribute
                 */
                public void unsetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HEALTHHISTORY$4);
                    }
                }
                
                /**
                 * Gets the "details" attribute
                 */
                public java.lang.String getDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILS$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "details" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAILS$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "details" attribute
                 */
                public boolean isSetDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DETAILS$6) != null;
                    }
                }
                
                /**
                 * Sets the "details" attribute
                 */
                public void setDetails(java.lang.String details)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAILS$6);
                      }
                      target.setStringValue(details);
                    }
                }
                
                /**
                 * Sets (as xml) the "details" attribute
                 */
                public void xsetDetails(org.apache.xmlbeans.XmlString details)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAILS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DETAILS$6);
                      }
                      target.set(details);
                    }
                }
                
                /**
                 * Unsets the "details" attribute
                 */
                public void unsetDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DETAILS$6);
                    }
                }
                
                /**
                 * Gets the "status" attribute
                 */
                public java.lang.String getStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "status" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "status" attribute
                 */
                public boolean isSetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATUS$8) != null;
                    }
                }
                
                /**
                 * Sets the "status" attribute
                 */
                public void setStatus(java.lang.String status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$8);
                      }
                      target.setStringValue(status);
                    }
                }
                
                /**
                 * Sets (as xml) the "status" attribute
                 */
                public void xsetStatus(org.apache.xmlbeans.XmlString status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$8);
                      }
                      target.set(status);
                    }
                }
                
                /**
                 * Unsets the "status" attribute
                 */
                public void unsetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATUS$8);
                    }
                }
                
                /**
                 * Gets the "assignees" attribute
                 */
                public java.lang.String getAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "assignees" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "assignees" attribute
                 */
                public boolean isSetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ASSIGNEES$10) != null;
                    }
                }
                
                /**
                 * Sets the "assignees" attribute
                 */
                public void setAssignees(java.lang.String assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNEES$10);
                      }
                      target.setStringValue(assignees);
                    }
                }
                
                /**
                 * Sets (as xml) the "assignees" attribute
                 */
                public void xsetAssignees(org.apache.xmlbeans.XmlString assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ASSIGNEES$10);
                      }
                      target.set(assignees);
                    }
                }
                
                /**
                 * Unsets the "assignees" attribute
                 */
                public void unsetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ASSIGNEES$10);
                    }
                }
                
                /**
                 * Gets the "labels" attribute
                 */
                public java.lang.String getLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "labels" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "labels" attribute
                 */
                public boolean isSetLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LABELS$12) != null;
                    }
                }
                
                /**
                 * Sets the "labels" attribute
                 */
                public void setLabels(java.lang.String labels)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABELS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABELS$12);
                      }
                      target.setStringValue(labels);
                    }
                }
                
                /**
                 * Sets (as xml) the "labels" attribute
                 */
                public void xsetLabels(org.apache.xmlbeans.XmlString labels)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABELS$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABELS$12);
                      }
                      target.set(labels);
                    }
                }
                
                /**
                 * Unsets the "labels" attribute
                 */
                public void unsetLabels()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LABELS$12);
                    }
                }
                
                /**
                 * Gets the "os" attribute
                 */
                public java.lang.String getOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "os" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "os" attribute
                 */
                public boolean isSetOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OS$14) != null;
                    }
                }
                
                /**
                 * Sets the "os" attribute
                 */
                public void setOs(java.lang.String os)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OS$14);
                      }
                      target.setStringValue(os);
                    }
                }
                
                /**
                 * Sets (as xml) the "os" attribute
                 */
                public void xsetOs(org.apache.xmlbeans.XmlString os)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OS$14);
                      }
                      target.set(os);
                    }
                }
                
                /**
                 * Unsets the "os" attribute
                 */
                public void unsetOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OS$14);
                    }
                }
            }
        }
        /**
         * An XML infrastructurebylabelrecords(@).
         *
         * This is a complex type.
         */
        public static class InfrastructurebylabelrecordsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords
        {
            private static final long serialVersionUID = 1L;
            
            public InfrastructurebylabelrecordsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INFRASTRUCTUREBYLABELRECORD$0 = 
                new javax.xml.namespace.QName("", "infrastructurebylabelrecord");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "infrastructurebylabelrecord" elements
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord[] getInfrastructurebylabelrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INFRASTRUCTUREBYLABELRECORD$0, targetList);
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord[] result = new noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "infrastructurebylabelrecord" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord getInfrastructurebylabelrecordArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "infrastructurebylabelrecord" element
             */
            public int sizeOfInfrastructurebylabelrecordArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INFRASTRUCTUREBYLABELRECORD$0);
                }
            }
            
            /**
             * Sets array of all "infrastructurebylabelrecord" element
             */
            public void setInfrastructurebylabelrecordArray(noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord[] infrastructurebylabelrecordArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(infrastructurebylabelrecordArray, INFRASTRUCTUREBYLABELRECORD$0);
                }
            }
            
            /**
             * Sets ith "infrastructurebylabelrecord" element
             */
            public void setInfrastructurebylabelrecordArray(int i, noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord infrastructurebylabelrecord)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(infrastructurebylabelrecord);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "infrastructurebylabelrecord" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord insertNewInfrastructurebylabelrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord)get_store().insert_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "infrastructurebylabelrecord" element
             */
            public noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord addNewInfrastructurebylabelrecord()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord target = null;
                    target = (noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord)get_store().add_element_user(INFRASTRUCTUREBYLABELRECORD$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "infrastructurebylabelrecord" element
             */
            public void removeInfrastructurebylabelrecord(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INFRASTRUCTUREBYLABELRECORD$0, i);
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
             * An XML infrastructurebylabelrecord(@).
             *
             * This is a complex type.
             */
            public static class InfrastructurebylabelrecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InfrastructureoverviewDocument.Infrastructureoverview.Infrastructurebylabelrecords.Infrastructurebylabelrecord
            {
                private static final long serialVersionUID = 1L;
                
                public InfrastructurebylabelrecordImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName INFRASTRUCTUREBYLABELRECORD$0 = 
                    new javax.xml.namespace.QName("", "infrastructurebylabelrecord");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName HEALTHHISTORY$4 = 
                    new javax.xml.namespace.QName("", "healthhistory");
                private static final javax.xml.namespace.QName DETAILS$6 = 
                    new javax.xml.namespace.QName("", "details");
                private static final javax.xml.namespace.QName STATUS$8 = 
                    new javax.xml.namespace.QName("", "status");
                private static final javax.xml.namespace.QName ASSIGNEES$10 = 
                    new javax.xml.namespace.QName("", "assignees");
                private static final javax.xml.namespace.QName SITE$12 = 
                    new javax.xml.namespace.QName("", "site");
                private static final javax.xml.namespace.QName HOSTGROUP$14 = 
                    new javax.xml.namespace.QName("", "hostgroup");
                private static final javax.xml.namespace.QName OS$16 = 
                    new javax.xml.namespace.QName("", "os");
                
                
                /**
                 * Gets array of all "infrastructurebylabelrecord" elements
                 */
                public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[] getInfrastructurebylabelrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(INFRASTRUCTUREBYLABELRECORD$0, targetList);
                      noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[] result = new noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "infrastructurebylabelrecord" element
                 */
                public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord getInfrastructurebylabelrecordArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                      target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "infrastructurebylabelrecord" element
                 */
                public int sizeOfInfrastructurebylabelrecordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(INFRASTRUCTUREBYLABELRECORD$0);
                    }
                }
                
                /**
                 * Sets array of all "infrastructurebylabelrecord" element
                 */
                public void setInfrastructurebylabelrecordArray(noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord[] infrastructurebylabelrecordArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(infrastructurebylabelrecordArray, INFRASTRUCTUREBYLABELRECORD$0);
                    }
                }
                
                /**
                 * Sets ith "infrastructurebylabelrecord" element
                 */
                public void setInfrastructurebylabelrecordArray(int i, noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord infrastructurebylabelrecord)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                      target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().find_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(infrastructurebylabelrecord);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "infrastructurebylabelrecord" element
                 */
                public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord insertNewInfrastructurebylabelrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                      target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().insert_element_user(INFRASTRUCTUREBYLABELRECORD$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "infrastructurebylabelrecord" element
                 */
                public noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord addNewInfrastructurebylabelrecord()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord target = null;
                      target = (noNamespace.InfrastructurebylabelrecordDocument.Infrastructurebylabelrecord)get_store().add_element_user(INFRASTRUCTUREBYLABELRECORD$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "infrastructurebylabelrecord" element
                 */
                public void removeInfrastructurebylabelrecord(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(INFRASTRUCTUREBYLABELRECORD$0, i);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "name" attribute
                 */
                public boolean isSetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(NAME$2) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Unsets the "name" attribute
                 */
                public void unsetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(NAME$2);
                    }
                }
                
                /**
                 * Gets the "healthhistory" attribute
                 */
                public java.lang.String getHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "healthhistory" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "healthhistory" attribute
                 */
                public boolean isSetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HEALTHHISTORY$4) != null;
                    }
                }
                
                /**
                 * Sets the "healthhistory" attribute
                 */
                public void setHealthhistory(java.lang.String healthhistory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEALTHHISTORY$4);
                      }
                      target.setStringValue(healthhistory);
                    }
                }
                
                /**
                 * Sets (as xml) the "healthhistory" attribute
                 */
                public void xsetHealthhistory(org.apache.xmlbeans.XmlString healthhistory)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEALTHHISTORY$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEALTHHISTORY$4);
                      }
                      target.set(healthhistory);
                    }
                }
                
                /**
                 * Unsets the "healthhistory" attribute
                 */
                public void unsetHealthhistory()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HEALTHHISTORY$4);
                    }
                }
                
                /**
                 * Gets the "details" attribute
                 */
                public java.lang.String getDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILS$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "details" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAILS$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "details" attribute
                 */
                public boolean isSetDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DETAILS$6) != null;
                    }
                }
                
                /**
                 * Sets the "details" attribute
                 */
                public void setDetails(java.lang.String details)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAILS$6);
                      }
                      target.setStringValue(details);
                    }
                }
                
                /**
                 * Sets (as xml) the "details" attribute
                 */
                public void xsetDetails(org.apache.xmlbeans.XmlString details)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAILS$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DETAILS$6);
                      }
                      target.set(details);
                    }
                }
                
                /**
                 * Unsets the "details" attribute
                 */
                public void unsetDetails()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DETAILS$6);
                    }
                }
                
                /**
                 * Gets the "status" attribute
                 */
                public java.lang.String getStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "status" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "status" attribute
                 */
                public boolean isSetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(STATUS$8) != null;
                    }
                }
                
                /**
                 * Sets the "status" attribute
                 */
                public void setStatus(java.lang.String status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$8);
                      }
                      target.setStringValue(status);
                    }
                }
                
                /**
                 * Sets (as xml) the "status" attribute
                 */
                public void xsetStatus(org.apache.xmlbeans.XmlString status)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$8);
                      }
                      target.set(status);
                    }
                }
                
                /**
                 * Unsets the "status" attribute
                 */
                public void unsetStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(STATUS$8);
                    }
                }
                
                /**
                 * Gets the "assignees" attribute
                 */
                public java.lang.String getAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "assignees" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "assignees" attribute
                 */
                public boolean isSetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ASSIGNEES$10) != null;
                    }
                }
                
                /**
                 * Sets the "assignees" attribute
                 */
                public void setAssignees(java.lang.String assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNEES$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNEES$10);
                      }
                      target.setStringValue(assignees);
                    }
                }
                
                /**
                 * Sets (as xml) the "assignees" attribute
                 */
                public void xsetAssignees(org.apache.xmlbeans.XmlString assignees)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ASSIGNEES$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ASSIGNEES$10);
                      }
                      target.set(assignees);
                    }
                }
                
                /**
                 * Unsets the "assignees" attribute
                 */
                public void unsetAssignees()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ASSIGNEES$10);
                    }
                }
                
                /**
                 * Gets the "site" attribute
                 */
                public java.lang.String getSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "site" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "site" attribute
                 */
                public boolean isSetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SITE$12) != null;
                    }
                }
                
                /**
                 * Sets the "site" attribute
                 */
                public void setSite(java.lang.String site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SITE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SITE$12);
                      }
                      target.setStringValue(site);
                    }
                }
                
                /**
                 * Sets (as xml) the "site" attribute
                 */
                public void xsetSite(org.apache.xmlbeans.XmlString site)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SITE$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SITE$12);
                      }
                      target.set(site);
                    }
                }
                
                /**
                 * Unsets the "site" attribute
                 */
                public void unsetSite()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SITE$12);
                    }
                }
                
                /**
                 * Gets the "hostgroup" attribute
                 */
                public java.lang.String getHostgroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUP$14);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "hostgroup" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetHostgroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUP$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "hostgroup" attribute
                 */
                public boolean isSetHostgroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(HOSTGROUP$14) != null;
                    }
                }
                
                /**
                 * Sets the "hostgroup" attribute
                 */
                public void setHostgroup(java.lang.String hostgroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTGROUP$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTGROUP$14);
                      }
                      target.setStringValue(hostgroup);
                    }
                }
                
                /**
                 * Sets (as xml) the "hostgroup" attribute
                 */
                public void xsetHostgroup(org.apache.xmlbeans.XmlString hostgroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTGROUP$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTGROUP$14);
                      }
                      target.set(hostgroup);
                    }
                }
                
                /**
                 * Unsets the "hostgroup" attribute
                 */
                public void unsetHostgroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(HOSTGROUP$14);
                    }
                }
                
                /**
                 * Gets the "os" attribute
                 */
                public java.lang.String getOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$16);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "os" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "os" attribute
                 */
                public boolean isSetOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(OS$16) != null;
                    }
                }
                
                /**
                 * Sets the "os" attribute
                 */
                public void setOs(java.lang.String os)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OS$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OS$16);
                      }
                      target.setStringValue(os);
                    }
                }
                
                /**
                 * Sets (as xml) the "os" attribute
                 */
                public void xsetOs(org.apache.xmlbeans.XmlString os)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OS$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OS$16);
                      }
                      target.set(os);
                    }
                }
                
                /**
                 * Unsets the "os" attribute
                 */
                public void unsetOs()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(OS$16);
                    }
                }
            }
        }
    }
}
