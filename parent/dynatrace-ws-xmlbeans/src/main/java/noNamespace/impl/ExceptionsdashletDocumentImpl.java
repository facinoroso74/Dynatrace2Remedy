/*
 * An XML document type.
 * Localname: exceptionsdashlet
 * Namespace: 
 * Java type: noNamespace.ExceptionsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one exceptionsdashlet(@) element.
 *
 * This is a complex type.
 */
public class ExceptionsdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ExceptionsdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExceptionsdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCEPTIONSDASHLET$0 = 
        new javax.xml.namespace.QName("", "exceptionsdashlet");
    
    
    /**
     * Gets the "exceptionsdashlet" element
     */
    public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet getExceptionsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ExceptionsdashletDocument.Exceptionsdashlet target = null;
            target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().find_element_user(EXCEPTIONSDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exceptionsdashlet" element
     */
    public void setExceptionsdashlet(noNamespace.ExceptionsdashletDocument.Exceptionsdashlet exceptionsdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ExceptionsdashletDocument.Exceptionsdashlet target = null;
            target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().find_element_user(EXCEPTIONSDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().add_element_user(EXCEPTIONSDASHLET$0);
            }
            target.set(exceptionsdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "exceptionsdashlet" element
     */
    public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet addNewExceptionsdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ExceptionsdashletDocument.Exceptionsdashlet target = null;
            target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet)get_store().add_element_user(EXCEPTIONSDASHLET$0);
            return target;
        }
    }
    /**
     * An XML exceptionsdashlet(@).
     *
     * This is a complex type.
     */
    public static class ExceptionsdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ExceptionsdashletDocument.Exceptionsdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public ExceptionsdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName EXCEPTIONS$4 = 
            new javax.xml.namespace.QName("", "exceptions");
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
         * Gets the "exceptions" element
         */
        public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions getExceptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions target = null;
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions)get_store().find_element_user(EXCEPTIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "exceptions" element
         */
        public boolean isSetExceptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCEPTIONS$4) != 0;
            }
        }
        
        /**
         * Sets the "exceptions" element
         */
        public void setExceptions(noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions exceptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions target = null;
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions)get_store().find_element_user(EXCEPTIONS$4, 0);
                if (target == null)
                {
                    target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions)get_store().add_element_user(EXCEPTIONS$4);
                }
                target.set(exceptions);
            }
        }
        
        /**
         * Appends and returns a new empty "exceptions" element
         */
        public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions addNewExceptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions target = null;
                target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions)get_store().add_element_user(EXCEPTIONS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "exceptions" element
         */
        public void unsetExceptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCEPTIONS$4, 0);
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
         * An XML exceptions(@).
         *
         * This is a complex type.
         */
        public static class ExceptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions
        {
            private static final long serialVersionUID = 1L;
            
            public ExceptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EXCEPTION$0 = 
                new javax.xml.namespace.QName("", "exception");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "exception" elements
             */
            public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception[] getExceptionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(EXCEPTION$0, targetList);
                    noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception[] result = new noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "exception" element
             */
            public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception getExceptionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception target = null;
                    target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception)get_store().find_element_user(EXCEPTION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "exception" element
             */
            public int sizeOfExceptionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EXCEPTION$0);
                }
            }
            
            /**
             * Sets array of all "exception" element
             */
            public void setExceptionArray(noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception[] exceptionArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(exceptionArray, EXCEPTION$0);
                }
            }
            
            /**
             * Sets ith "exception" element
             */
            public void setExceptionArray(int i, noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception exception)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception target = null;
                    target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception)get_store().find_element_user(EXCEPTION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(exception);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "exception" element
             */
            public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception insertNewException(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception target = null;
                    target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception)get_store().insert_element_user(EXCEPTION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "exception" element
             */
            public noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception addNewException()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception target = null;
                    target = (noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception)get_store().add_element_user(EXCEPTION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "exception" element
             */
            public void removeException(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EXCEPTION$0, i);
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
             * An XML exception(@).
             *
             * This is a complex type.
             */
            public static class ExceptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ExceptionsdashletDocument.Exceptionsdashlet.Exceptions.Exception
            {
                private static final long serialVersionUID = 1L;
                
                public ExceptionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName THROWABLE$0 = 
                    new javax.xml.namespace.QName("", "throwable");
                private static final javax.xml.namespace.QName MESSAGE$2 = 
                    new javax.xml.namespace.QName("", "message");
                private static final javax.xml.namespace.QName AGENT$4 = 
                    new javax.xml.namespace.QName("", "agent");
                private static final javax.xml.namespace.QName COUNT$6 = 
                    new javax.xml.namespace.QName("", "count");
                private static final javax.xml.namespace.QName CLASS1$8 = 
                    new javax.xml.namespace.QName("", "class");
                private static final javax.xml.namespace.QName METHOD$10 = 
                    new javax.xml.namespace.QName("", "method");
                
                
                /**
                 * Gets the "throwable" attribute
                 */
                public java.lang.String getThrowable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THROWABLE$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "throwable" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetThrowable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THROWABLE$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "throwable" attribute
                 */
                public boolean isSetThrowable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(THROWABLE$0) != null;
                    }
                }
                
                /**
                 * Sets the "throwable" attribute
                 */
                public void setThrowable(java.lang.String throwable)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THROWABLE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THROWABLE$0);
                      }
                      target.setStringValue(throwable);
                    }
                }
                
                /**
                 * Sets (as xml) the "throwable" attribute
                 */
                public void xsetThrowable(org.apache.xmlbeans.XmlString throwable)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THROWABLE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(THROWABLE$0);
                      }
                      target.set(throwable);
                    }
                }
                
                /**
                 * Unsets the "throwable" attribute
                 */
                public void unsetThrowable()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(THROWABLE$0);
                    }
                }
                
                /**
                 * Gets the "message" attribute
                 */
                public java.lang.String getMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "message" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "message" attribute
                 */
                public boolean isSetMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(MESSAGE$2) != null;
                    }
                }
                
                /**
                 * Sets the "message" attribute
                 */
                public void setMessage(java.lang.String message)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$2);
                      }
                      target.setStringValue(message);
                    }
                }
                
                /**
                 * Sets (as xml) the "message" attribute
                 */
                public void xsetMessage(org.apache.xmlbeans.XmlString message)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGE$2);
                      }
                      target.set(message);
                    }
                }
                
                /**
                 * Unsets the "message" attribute
                 */
                public void unsetMessage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(MESSAGE$2);
                    }
                }
                
                /**
                 * Gets the "agent" attribute
                 */
                public java.lang.String getAgent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "agent" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetAgent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "agent" attribute
                 */
                public boolean isSetAgent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(AGENT$4) != null;
                    }
                }
                
                /**
                 * Sets the "agent" attribute
                 */
                public void setAgent(java.lang.String agent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$4);
                      }
                      target.setStringValue(agent);
                    }
                }
                
                /**
                 * Sets (as xml) the "agent" attribute
                 */
                public void xsetAgent(org.apache.xmlbeans.XmlString agent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$4);
                      }
                      target.set(agent);
                    }
                }
                
                /**
                 * Unsets the "agent" attribute
                 */
                public void unsetAgent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(AGENT$4);
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
                 * Gets the "class" attribute
                 */
                public java.lang.String getClass1()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$8);
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
                      return get_store().find_attribute_user(CLASS1$8) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$8);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$8);
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
                      get_store().remove_attribute(CLASS1$8);
                    }
                }
                
                /**
                 * Gets the "method" attribute
                 */
                public java.lang.String getMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "method" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "method" attribute
                 */
                public boolean isSetMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(METHOD$10) != null;
                    }
                }
                
                /**
                 * Sets the "method" attribute
                 */
                public void setMethod(java.lang.String method)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$10);
                      }
                      target.setStringValue(method);
                    }
                }
                
                /**
                 * Sets (as xml) the "method" attribute
                 */
                public void xsetMethod(org.apache.xmlbeans.XmlString method)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$10);
                      }
                      target.set(method);
                    }
                }
                
                /**
                 * Unsets the "method" attribute
                 */
                public void unsetMethod()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(METHOD$10);
                    }
                }
            }
        }
    }
}
