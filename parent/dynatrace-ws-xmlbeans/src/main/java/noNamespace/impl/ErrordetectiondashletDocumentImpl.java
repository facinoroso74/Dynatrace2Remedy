/*
 * An XML document type.
 * Localname: errordetectiondashlet
 * Namespace: 
 * Java type: noNamespace.ErrordetectiondashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one errordetectiondashlet(@) element.
 *
 * This is a complex type.
 */
public class ErrordetectiondashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrordetectiondashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrordetectiondashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORDETECTIONDASHLET$0 = 
        new javax.xml.namespace.QName("", "errordetectiondashlet");
    
    
    /**
     * Gets the "errordetectiondashlet" element
     */
    public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet getErrordetectiondashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet target = null;
            target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().find_element_user(ERRORDETECTIONDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errordetectiondashlet" element
     */
    public void setErrordetectiondashlet(noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet errordetectiondashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet target = null;
            target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().find_element_user(ERRORDETECTIONDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().add_element_user(ERRORDETECTIONDASHLET$0);
            }
            target.set(errordetectiondashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "errordetectiondashlet" element
     */
    public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet addNewErrordetectiondashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet target = null;
            target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet)get_store().add_element_user(ERRORDETECTIONDASHLET$0);
            return target;
        }
    }
    /**
     * An XML errordetectiondashlet(@).
     *
     * This is a complex type.
     */
    public static class ErrordetectiondashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet
    {
        private static final long serialVersionUID = 1L;
        
        public ErrordetectiondashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName ERRORS$4 = 
            new javax.xml.namespace.QName("", "errors");
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
         * Gets the "errors" element
         */
        public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors getErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors target = null;
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors)get_store().find_element_user(ERRORS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "errors" element
         */
        public boolean isSetErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORS$4) != 0;
            }
        }
        
        /**
         * Sets the "errors" element
         */
        public void setErrors(noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors errors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors target = null;
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors)get_store().find_element_user(ERRORS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors)get_store().add_element_user(ERRORS$4);
                }
                target.set(errors);
            }
        }
        
        /**
         * Appends and returns a new empty "errors" element
         */
        public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors addNewErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors target = null;
                target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors)get_store().add_element_user(ERRORS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "errors" element
         */
        public void unsetErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORS$4, 0);
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
         * An XML errors(@).
         *
         * This is a complex type.
         */
        public static class ErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors
        {
            private static final long serialVersionUID = 1L;
            
            public ErrorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ERROR$0 = 
                new javax.xml.namespace.QName("", "error");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "error" elements
             */
            public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error[] getErrorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ERROR$0, targetList);
                    noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error[] result = new noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "error" element
             */
            public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error getErrorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error target = null;
                    target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error)get_store().find_element_user(ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "error" element
             */
            public int sizeOfErrorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ERROR$0);
                }
            }
            
            /**
             * Sets array of all "error" element
             */
            public void setErrorArray(noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error[] errorArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(errorArray, ERROR$0);
                }
            }
            
            /**
             * Sets ith "error" element
             */
            public void setErrorArray(int i, noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error error)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error target = null;
                    target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error)get_store().find_element_user(ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(error);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "error" element
             */
            public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error insertNewError(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error target = null;
                    target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error)get_store().insert_element_user(ERROR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "error" element
             */
            public noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error addNewError()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error target = null;
                    target = (noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error)get_store().add_element_user(ERROR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "error" element
             */
            public void removeError(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ERROR$0, i);
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
             * An XML error(@).
             *
             * This is a complex type.
             */
            public static class ErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ErrordetectiondashletDocument.Errordetectiondashlet.Errors.Error
            {
                private static final long serialVersionUID = 1L;
                
                public ErrorImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName ERROR$0 = 
                    new javax.xml.namespace.QName("", "error");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("", "name");
                private static final javax.xml.namespace.QName ERRORCOUNT$4 = 
                    new javax.xml.namespace.QName("", "errorcount");
                private static final javax.xml.namespace.QName ERRORAFFECTEDTRANSACTIONCOUNT$6 = 
                    new javax.xml.namespace.QName("", "error_affected_transaction_count");
                private static final javax.xml.namespace.QName ERRORAFFECTEDPAGEACTIONCOUNT$8 = 
                    new javax.xml.namespace.QName("", "error_affected_pageaction_count");
                
                
                /**
                 * Gets array of all "error" elements
                 */
                public noNamespace.ErrorDocument.Error[] getErrorArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(ERROR$0, targetList);
                      noNamespace.ErrorDocument.Error[] result = new noNamespace.ErrorDocument.Error[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "error" element
                 */
                public noNamespace.ErrorDocument.Error getErrorArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrorDocument.Error target = null;
                      target = (noNamespace.ErrorDocument.Error)get_store().find_element_user(ERROR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "error" element
                 */
                public int sizeOfErrorArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ERROR$0);
                    }
                }
                
                /**
                 * Sets array of all "error" element
                 */
                public void setErrorArray(noNamespace.ErrorDocument.Error[] errorArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(errorArray, ERROR$0);
                    }
                }
                
                /**
                 * Sets ith "error" element
                 */
                public void setErrorArray(int i, noNamespace.ErrorDocument.Error error)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrorDocument.Error target = null;
                      target = (noNamespace.ErrorDocument.Error)get_store().find_element_user(ERROR$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(error);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "error" element
                 */
                public noNamespace.ErrorDocument.Error insertNewError(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrorDocument.Error target = null;
                      target = (noNamespace.ErrorDocument.Error)get_store().insert_element_user(ERROR$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "error" element
                 */
                public noNamespace.ErrorDocument.Error addNewError()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ErrorDocument.Error target = null;
                      target = (noNamespace.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "error" element
                 */
                public void removeError(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ERROR$0, i);
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
                
                /**
                 * Gets the "error_affected_transaction_count" attribute
                 */
                public java.lang.String getErrorAffectedTransactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "error_affected_transaction_count" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetErrorAffectedTransactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "error_affected_transaction_count" attribute
                 */
                public boolean isSetErrorAffectedTransactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6) != null;
                    }
                }
                
                /**
                 * Sets the "error_affected_transaction_count" attribute
                 */
                public void setErrorAffectedTransactionCount(java.lang.String errorAffectedTransactionCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                      }
                      target.setStringValue(errorAffectedTransactionCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "error_affected_transaction_count" attribute
                 */
                public void xsetErrorAffectedTransactionCount(org.apache.xmlbeans.XmlString errorAffectedTransactionCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                      }
                      target.set(errorAffectedTransactionCount);
                    }
                }
                
                /**
                 * Unsets the "error_affected_transaction_count" attribute
                 */
                public void unsetErrorAffectedTransactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORAFFECTEDTRANSACTIONCOUNT$6);
                    }
                }
                
                /**
                 * Gets the "error_affected_pageaction_count" attribute
                 */
                public java.lang.String getErrorAffectedPageactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "error_affected_pageaction_count" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetErrorAffectedPageactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "error_affected_pageaction_count" attribute
                 */
                public boolean isSetErrorAffectedPageactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8) != null;
                    }
                }
                
                /**
                 * Sets the "error_affected_pageaction_count" attribute
                 */
                public void setErrorAffectedPageactionCount(java.lang.String errorAffectedPageactionCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                      }
                      target.setStringValue(errorAffectedPageactionCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "error_affected_pageaction_count" attribute
                 */
                public void xsetErrorAffectedPageactionCount(org.apache.xmlbeans.XmlString errorAffectedPageactionCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                      }
                      target.set(errorAffectedPageactionCount);
                    }
                }
                
                /**
                 * Unsets the "error_affected_pageaction_count" attribute
                 */
                public void unsetErrorAffectedPageactionCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(ERRORAFFECTEDPAGEACTIONCOUNT$8);
                    }
                }
            }
        }
    }
}
