/*
 * An XML document type.
 * Localname: guicontrolsdashlet
 * Namespace: 
 * Java type: noNamespace.GuicontrolsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one guicontrolsdashlet(@) element.
 *
 * This is a complex type.
 */
public class GuicontrolsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GuicontrolsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public GuicontrolsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GUICONTROLSDASHLET$0 = 
        new javax.xml.namespace.QName("", "guicontrolsdashlet");
    
    
    /**
     * Gets the "guicontrolsdashlet" element
     */
    public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet getGuicontrolsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet target = null;
            target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().find_element_user(GUICONTROLSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "guicontrolsdashlet" element
     */
    public void setGuicontrolsdashlet(noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet guicontrolsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet target = null;
            target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().find_element_user(GUICONTROLSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().add_element_user(GUICONTROLSDASHLET$0);
            }
            target.set(guicontrolsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "guicontrolsdashlet" element
     */
    public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet addNewGuicontrolsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet target = null;
            target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet)get_store().add_element_user(GUICONTROLSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML guicontrolsdashlet(@).
     *
     * This is a complex type.
     */
    public static class GuicontrolsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public GuicontrolsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName GUICONTROLS$4 = 
            new javax.xml.namespace.QName("", "guicontrols");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName DISPLAYSOURCE$10 = 
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
         * Gets the "guicontrols" element
         */
        public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols getGuicontrols()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols target = null;
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols)get_store().find_element_user(GUICONTROLS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "guicontrols" element
         */
        public boolean isSetGuicontrols()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GUICONTROLS$4) != 0;
            }
        }
        
        /**
         * Sets the "guicontrols" element
         */
        public void setGuicontrols(noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols guicontrols)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols target = null;
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols)get_store().find_element_user(GUICONTROLS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols)get_store().add_element_user(GUICONTROLS$4);
                }
                target.set(guicontrols);
            }
        }
        
        /**
         * Appends and returns a new empty "guicontrols" element
         */
        public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols addNewGuicontrols()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols target = null;
                target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols)get_store().add_element_user(GUICONTROLS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "guicontrols" element
         */
        public void unsetGuicontrols()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GUICONTROLS$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
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
                return get_store().find_attribute_user(DESCRIPTION$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$8);
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
                get_store().remove_attribute(DESCRIPTION$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYSOURCE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYSOURCE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISPLAYSOURCE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISPLAYSOURCE$10);
                }
                target.set(displaysource);
            }
        }
        /**
         * An XML guicontrols(@).
         *
         * This is a complex type.
         */
        public static class GuicontrolsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols
        {
            private static final long serialVersionUID = 1L;
            
            public GuicontrolsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GUICONTROL$0 = 
                new javax.xml.namespace.QName("", "guicontrol");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "guicontrol" elements
             */
            public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol[] getGuicontrolArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(GUICONTROL$0, targetList);
                    noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol[] result = new noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "guicontrol" element
             */
            public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol getGuicontrolArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol target = null;
                    target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol)get_store().find_element_user(GUICONTROL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "guicontrol" element
             */
            public int sizeOfGuicontrolArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GUICONTROL$0);
                }
            }
            
            /**
             * Sets array of all "guicontrol" element
             */
            public void setGuicontrolArray(noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol[] guicontrolArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(guicontrolArray, GUICONTROL$0);
                }
            }
            
            /**
             * Sets ith "guicontrol" element
             */
            public void setGuicontrolArray(int i, noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol guicontrol)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol target = null;
                    target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol)get_store().find_element_user(GUICONTROL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(guicontrol);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "guicontrol" element
             */
            public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol insertNewGuicontrol(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol target = null;
                    target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol)get_store().insert_element_user(GUICONTROL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "guicontrol" element
             */
            public noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol addNewGuicontrol()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol target = null;
                    target = (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol)get_store().add_element_user(GUICONTROL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "guicontrol" element
             */
            public void removeGuicontrol(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GUICONTROL$0, i);
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
             * An XML guicontrol(@).
             *
             * This is a complex type.
             */
            public static class GuicontrolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol
            {
                private static final long serialVersionUID = 1L;
                
                public GuicontrolImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName LABEL$2 = 
                    new javax.xml.namespace.QName("", "label");
                private static final javax.xml.namespace.QName CLASS1$4 = 
                    new javax.xml.namespace.QName("", "class");
                private static final javax.xml.namespace.QName COUNT$6 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName AVG$8 = 
                    new javax.xml.namespace.QName("", "avg");
                private static final javax.xml.namespace.QName MIN$10 = 
                    new javax.xml.namespace.QName("", "min");
                private static final javax.xml.namespace.QName MAX$12 = 
                    new javax.xml.namespace.QName("", "max");
                private static final javax.xml.namespace.QName SUM$14 = 
                    new javax.xml.namespace.QName("", "sum");
                private static final javax.xml.namespace.QName CPUAVG$16 = 
                    new javax.xml.namespace.QName("", "cpu_avg");
                private static final javax.xml.namespace.QName CPUMIN$18 = 
                    new javax.xml.namespace.QName("", "cpu_min");
                private static final javax.xml.namespace.QName CPUMAX$20 = 
                    new javax.xml.namespace.QName("", "cpu_max");
                private static final javax.xml.namespace.QName CPUSUM$22 = 
                    new javax.xml.namespace.QName("", "cpu_sum");
                
                
                /**
                 * Gets the "platform" attribute
                 */
                public java.lang.String getPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "platform" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "platform" attribute
                 */
                public boolean isSetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PLATFORM$0) != null;
                    }
                }
                
                /**
                 * Sets the "platform" attribute
                 */
                public void setPlatform(java.lang.String platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLATFORM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLATFORM$0);
                      }
                      target.setStringValue(platform);
                    }
                }
                
                /**
                 * Sets (as xml) the "platform" attribute
                 */
                public void xsetPlatform(org.apache.xmlbeans.XmlString platform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PLATFORM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PLATFORM$0);
                      }
                      target.set(platform);
                    }
                }
                
                /**
                 * Unsets the "platform" attribute
                 */
                public void unsetPlatform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PLATFORM$0);
                    }
                }
                
                /**
                 * Gets the "label" attribute
                 */
                public java.lang.String getLabel()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "label" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetLabel()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "label" attribute
                 */
                public boolean isSetLabel()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(LABEL$2) != null;
                    }
                }
                
                /**
                 * Sets the "label" attribute
                 */
                public void setLabel(java.lang.String label)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$2);
                      }
                      target.setStringValue(label);
                    }
                }
                
                /**
                 * Sets (as xml) the "label" attribute
                 */
                public void xsetLabel(org.apache.xmlbeans.XmlString label)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$2);
                      }
                      target.set(label);
                    }
                }
                
                /**
                 * Unsets the "label" attribute
                 */
                public void unsetLabel()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(LABEL$2);
                    }
                }
                
                /**
                 * Gets the "class" attribute
                 */
                public java.lang.String getClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "class" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "class" attribute
                 */
                public boolean isSetClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CLASS1$4) != null;
                    }
                }
                
                /**
                 * Sets the "class" attribute
                 */
                public void setClass1(java.lang.String class1)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$4);
                      }
                      target.setStringValue(class1);
                    }
                }
                
                /**
                 * Sets (as xml) the "class" attribute
                 */
                public void xsetClass1(org.apache.xmlbeans.XmlString class1)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$4);
                      }
                      target.set(class1);
                    }
                }
                
                /**
                 * Unsets the "class" attribute
                 */
                public void unsetClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CLASS1$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$6);
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
                      return get_store().find_attribute_user(COUNT$6) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$6);
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
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$6);
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
                      get_store().remove_attribute(COUNT$6);
                    }
                }
                
                /**
                 * Gets the "avg" attribute
                 */
                public double getAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$8);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "avg" attribute
                 */
                public boolean isSetAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AVG$8) != null;
                    }
                }
                
                /**
                 * Sets the "avg" attribute
                 */
                public void setAvg(double avg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVG$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVG$8);
                      }
                      target.setDoubleValue(avg);
                    }
                }
                
                /**
                 * Sets (as xml) the "avg" attribute
                 */
                public void xsetAvg(org.apache.xmlbeans.XmlDouble avg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(AVG$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(AVG$8);
                      }
                      target.set(avg);
                    }
                }
                
                /**
                 * Unsets the "avg" attribute
                 */
                public void unsetAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AVG$8);
                    }
                }
                
                /**
                 * Gets the "min" attribute
                 */
                public double getMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$10);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "min" attribute
                 */
                public boolean isSetMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MIN$10) != null;
                    }
                }
                
                /**
                 * Sets the "min" attribute
                 */
                public void setMin(double min)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$10);
                      }
                      target.setDoubleValue(min);
                    }
                }
                
                /**
                 * Sets (as xml) the "min" attribute
                 */
                public void xsetMin(org.apache.xmlbeans.XmlDouble min)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MIN$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MIN$10);
                      }
                      target.set(min);
                    }
                }
                
                /**
                 * Unsets the "min" attribute
                 */
                public void unsetMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MIN$10);
                    }
                }
                
                /**
                 * Gets the "max" attribute
                 */
                public double getMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "max" attribute
                 */
                public boolean isSetMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MAX$12) != null;
                    }
                }
                
                /**
                 * Sets the "max" attribute
                 */
                public void setMax(double max)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$12);
                      }
                      target.setDoubleValue(max);
                    }
                }
                
                /**
                 * Sets (as xml) the "max" attribute
                 */
                public void xsetMax(org.apache.xmlbeans.XmlDouble max)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MAX$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MAX$12);
                      }
                      target.set(max);
                    }
                }
                
                /**
                 * Unsets the "max" attribute
                 */
                public void unsetMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MAX$12);
                    }
                }
                
                /**
                 * Gets the "sum" attribute
                 */
                public double getSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "sum" attribute
                 */
                public boolean isSetSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SUM$14) != null;
                    }
                }
                
                /**
                 * Sets the "sum" attribute
                 */
                public void setSum(double sum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUM$14);
                      }
                      target.setDoubleValue(sum);
                    }
                }
                
                /**
                 * Sets (as xml) the "sum" attribute
                 */
                public void xsetSum(org.apache.xmlbeans.XmlDouble sum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUM$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUM$14);
                      }
                      target.set(sum);
                    }
                }
                
                /**
                 * Unsets the "sum" attribute
                 */
                public void unsetSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SUM$14);
                    }
                }
                
                /**
                 * Gets the "cpu_avg" attribute
                 */
                public double getCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_avg" attribute
                 */
                public boolean isSetCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUAVG$16) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_avg" attribute
                 */
                public void setCpuAvg(double cpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUAVG$16);
                      }
                      target.setDoubleValue(cpuAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_avg" attribute
                 */
                public void xsetCpuAvg(org.apache.xmlbeans.XmlDouble cpuAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUAVG$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUAVG$16);
                      }
                      target.set(cpuAvg);
                    }
                }
                
                /**
                 * Unsets the "cpu_avg" attribute
                 */
                public void unsetCpuAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUAVG$16);
                    }
                }
                
                /**
                 * Gets the "cpu_min" attribute
                 */
                public double getCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_min" attribute
                 */
                public boolean isSetCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUMIN$18) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_min" attribute
                 */
                public void setCpuMin(double cpuMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMIN$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMIN$18);
                      }
                      target.setDoubleValue(cpuMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_min" attribute
                 */
                public void xsetCpuMin(org.apache.xmlbeans.XmlDouble cpuMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMIN$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMIN$18);
                      }
                      target.set(cpuMin);
                    }
                }
                
                /**
                 * Unsets the "cpu_min" attribute
                 */
                public void unsetCpuMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUMIN$18);
                    }
                }
                
                /**
                 * Gets the "cpu_max" attribute
                 */
                public double getCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_max" attribute
                 */
                public boolean isSetCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUMAX$20) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_max" attribute
                 */
                public void setCpuMax(double cpuMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUMAX$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUMAX$20);
                      }
                      target.setDoubleValue(cpuMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_max" attribute
                 */
                public void xsetCpuMax(org.apache.xmlbeans.XmlDouble cpuMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUMAX$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUMAX$20);
                      }
                      target.set(cpuMax);
                    }
                }
                
                /**
                 * Unsets the "cpu_max" attribute
                 */
                public void unsetCpuMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUMAX$20);
                    }
                }
                
                /**
                 * Gets the "cpu_sum" attribute
                 */
                public double getCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$22);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "cpu_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "cpu_sum" attribute
                 */
                public boolean isSetCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(CPUSUM$22) != null;
                    }
                }
                
                /**
                 * Sets the "cpu_sum" attribute
                 */
                public void setCpuSum(double cpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUSUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUSUM$22);
                      }
                      target.setDoubleValue(cpuSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "cpu_sum" attribute
                 */
                public void xsetCpuSum(org.apache.xmlbeans.XmlDouble cpuSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUSUM$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUSUM$22);
                      }
                      target.set(cpuSum);
                    }
                }
                
                /**
                 * Unsets the "cpu_sum" attribute
                 */
                public void unsetCpuSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(CPUSUM$22);
                    }
                }
            }
        }
    }
}
