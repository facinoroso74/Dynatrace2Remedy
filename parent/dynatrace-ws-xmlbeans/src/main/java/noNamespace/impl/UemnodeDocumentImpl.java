/*
 * An XML document type.
 * Localname: uemnode
 * Namespace: 
 * Java type: noNamespace.UemnodeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one uemnode(@) element.
 *
 * This is a complex type.
 */
public class UemnodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UemnodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public UemnodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UEMNODE$0 = 
        new javax.xml.namespace.QName("", "uemnode");
    
    
    /**
     * Gets the "uemnode" element
     */
    public noNamespace.UemnodeDocument.Uemnode getUemnode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UemnodeDocument.Uemnode target = null;
            target = (noNamespace.UemnodeDocument.Uemnode)get_store().find_element_user(UEMNODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "uemnode" element
     */
    public void setUemnode(noNamespace.UemnodeDocument.Uemnode uemnode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UemnodeDocument.Uemnode target = null;
            target = (noNamespace.UemnodeDocument.Uemnode)get_store().find_element_user(UEMNODE$0, 0);
            if (target == null)
            {
                target = (noNamespace.UemnodeDocument.Uemnode)get_store().add_element_user(UEMNODE$0);
            }
            target.set(uemnode);
        }
    }
    
    /**
     * Appends and returns a new empty "uemnode" element
     */
    public noNamespace.UemnodeDocument.Uemnode addNewUemnode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UemnodeDocument.Uemnode target = null;
            target = (noNamespace.UemnodeDocument.Uemnode)get_store().add_element_user(UEMNODE$0);
            return target;
        }
    }
    /**
     * An XML uemnode(@).
     *
     * This is a complex type.
     */
    public static class UemnodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UemnodeDocument.Uemnode
    {
        private static final long serialVersionUID = 1L;
        
        public UemnodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTACHMENT$0 = 
            new javax.xml.namespace.QName("", "attachment");
        private static final javax.xml.namespace.QName UEMNODE$2 = 
            new javax.xml.namespace.QName("", "uemnode");
        private static final javax.xml.namespace.QName NODE$4 = 
            new javax.xml.namespace.QName("", "node");
        private static final javax.xml.namespace.QName DETAIL$6 = 
            new javax.xml.namespace.QName("", "detail");
        private static final javax.xml.namespace.QName EXECTOTALTIME$8 = 
            new javax.xml.namespace.QName("", "exectotaltime");
        private static final javax.xml.namespace.QName ELAPSEDTIME$10 = 
            new javax.xml.namespace.QName("", "elapsedtime");
        private static final javax.xml.namespace.QName API$12 = 
            new javax.xml.namespace.QName("", "api");
        private static final javax.xml.namespace.QName AGENT$14 = 
            new javax.xml.namespace.QName("", "agent");
        private static final javax.xml.namespace.QName LEVEL$16 = 
            new javax.xml.namespace.QName("", "level");
        private static final javax.xml.namespace.QName ENTRYHOPCOUNT$18 = 
            new javax.xml.namespace.QName("", "entryhopcount");
        private static final javax.xml.namespace.QName EXITHOPCOUNT$20 = 
            new javax.xml.namespace.QName("", "exithopcount");
        private static final javax.xml.namespace.QName ERRORSTATE$22 = 
            new javax.xml.namespace.QName("", "error_state");
        
        
        /**
         * Gets array of all "attachment" elements
         */
        public noNamespace.AttachmentDocument.Attachment[] getAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTACHMENT$0, targetList);
                noNamespace.AttachmentDocument.Attachment[] result = new noNamespace.AttachmentDocument.Attachment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "attachment" element
         */
        public noNamespace.AttachmentDocument.Attachment getAttachmentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment target = null;
                target = (noNamespace.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "attachment" element
         */
        public int sizeOfAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENT$0);
            }
        }
        
        /**
         * Sets array of all "attachment" element
         */
        public void setAttachmentArray(noNamespace.AttachmentDocument.Attachment[] attachmentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attachmentArray, ATTACHMENT$0);
            }
        }
        
        /**
         * Sets ith "attachment" element
         */
        public void setAttachmentArray(int i, noNamespace.AttachmentDocument.Attachment attachment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment target = null;
                target = (noNamespace.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attachment);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attachment" element
         */
        public noNamespace.AttachmentDocument.Attachment insertNewAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment target = null;
                target = (noNamespace.AttachmentDocument.Attachment)get_store().insert_element_user(ATTACHMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attachment" element
         */
        public noNamespace.AttachmentDocument.Attachment addNewAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment target = null;
                target = (noNamespace.AttachmentDocument.Attachment)get_store().add_element_user(ATTACHMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "attachment" element
         */
        public void removeAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENT$0, i);
            }
        }
        
        /**
         * Gets array of all "uemnode" elements
         */
        public noNamespace.UemnodeDocument.Uemnode[] getUemnodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UEMNODE$2, targetList);
                noNamespace.UemnodeDocument.Uemnode[] result = new noNamespace.UemnodeDocument.Uemnode[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "uemnode" element
         */
        public noNamespace.UemnodeDocument.Uemnode getUemnodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UemnodeDocument.Uemnode target = null;
                target = (noNamespace.UemnodeDocument.Uemnode)get_store().find_element_user(UEMNODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "uemnode" element
         */
        public int sizeOfUemnodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UEMNODE$2);
            }
        }
        
        /**
         * Sets array of all "uemnode" element
         */
        public void setUemnodeArray(noNamespace.UemnodeDocument.Uemnode[] uemnodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(uemnodeArray, UEMNODE$2);
            }
        }
        
        /**
         * Sets ith "uemnode" element
         */
        public void setUemnodeArray(int i, noNamespace.UemnodeDocument.Uemnode uemnode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UemnodeDocument.Uemnode target = null;
                target = (noNamespace.UemnodeDocument.Uemnode)get_store().find_element_user(UEMNODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(uemnode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "uemnode" element
         */
        public noNamespace.UemnodeDocument.Uemnode insertNewUemnode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UemnodeDocument.Uemnode target = null;
                target = (noNamespace.UemnodeDocument.Uemnode)get_store().insert_element_user(UEMNODE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "uemnode" element
         */
        public noNamespace.UemnodeDocument.Uemnode addNewUemnode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UemnodeDocument.Uemnode target = null;
                target = (noNamespace.UemnodeDocument.Uemnode)get_store().add_element_user(UEMNODE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "uemnode" element
         */
        public void removeUemnode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UEMNODE$2, i);
            }
        }
        
        /**
         * Gets the "node" attribute
         */
        public java.lang.String getNode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "node" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NODE$4);
                return target;
            }
        }
        
        /**
         * True if has "node" attribute
         */
        public boolean isSetNode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NODE$4) != null;
            }
        }
        
        /**
         * Sets the "node" attribute
         */
        public void setNode(java.lang.String node)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODE$4);
                }
                target.setStringValue(node);
            }
        }
        
        /**
         * Sets (as xml) the "node" attribute
         */
        public void xsetNode(org.apache.xmlbeans.XmlString node)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NODE$4);
                }
                target.set(node);
            }
        }
        
        /**
         * Unsets the "node" attribute
         */
        public void unsetNode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NODE$4);
            }
        }
        
        /**
         * Gets the "detail" attribute
         */
        public java.lang.String getDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "detail" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAIL$6);
                return target;
            }
        }
        
        /**
         * True if has "detail" attribute
         */
        public boolean isSetDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DETAIL$6) != null;
            }
        }
        
        /**
         * Sets the "detail" attribute
         */
        public void setDetail(java.lang.String detail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAIL$6);
                }
                target.setStringValue(detail);
            }
        }
        
        /**
         * Sets (as xml) the "detail" attribute
         */
        public void xsetDetail(org.apache.xmlbeans.XmlString detail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAIL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DETAIL$6);
                }
                target.set(detail);
            }
        }
        
        /**
         * Unsets the "detail" attribute
         */
        public void unsetDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DETAIL$6);
            }
        }
        
        /**
         * Gets the "exectotaltime" attribute
         */
        public double getExectotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTOTALTIME$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "exectotaltime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetExectotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTOTALTIME$8);
                return target;
            }
        }
        
        /**
         * True if has "exectotaltime" attribute
         */
        public boolean isSetExectotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXECTOTALTIME$8) != null;
            }
        }
        
        /**
         * Sets the "exectotaltime" attribute
         */
        public void setExectotaltime(double exectotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTOTALTIME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTOTALTIME$8);
                }
                target.setDoubleValue(exectotaltime);
            }
        }
        
        /**
         * Sets (as xml) the "exectotaltime" attribute
         */
        public void xsetExectotaltime(org.apache.xmlbeans.XmlDouble exectotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTOTALTIME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTOTALTIME$8);
                }
                target.set(exectotaltime);
            }
        }
        
        /**
         * Unsets the "exectotaltime" attribute
         */
        public void unsetExectotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXECTOTALTIME$8);
            }
        }
        
        /**
         * Gets the "elapsedtime" attribute
         */
        public double getElapsedtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELAPSEDTIME$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "elapsedtime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetElapsedtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELAPSEDTIME$10);
                return target;
            }
        }
        
        /**
         * True if has "elapsedtime" attribute
         */
        public boolean isSetElapsedtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELAPSEDTIME$10) != null;
            }
        }
        
        /**
         * Sets the "elapsedtime" attribute
         */
        public void setElapsedtime(double elapsedtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELAPSEDTIME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELAPSEDTIME$10);
                }
                target.setDoubleValue(elapsedtime);
            }
        }
        
        /**
         * Sets (as xml) the "elapsedtime" attribute
         */
        public void xsetElapsedtime(org.apache.xmlbeans.XmlDouble elapsedtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELAPSEDTIME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELAPSEDTIME$10);
                }
                target.set(elapsedtime);
            }
        }
        
        /**
         * Unsets the "elapsedtime" attribute
         */
        public void unsetElapsedtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELAPSEDTIME$10);
            }
        }
        
        /**
         * Gets the "api" attribute
         */
        public java.lang.String getApi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(API$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "api" attribute
         */
        public org.apache.xmlbeans.XmlString xgetApi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(API$12);
                return target;
            }
        }
        
        /**
         * True if has "api" attribute
         */
        public boolean isSetApi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(API$12) != null;
            }
        }
        
        /**
         * Sets the "api" attribute
         */
        public void setApi(java.lang.String api)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(API$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(API$12);
                }
                target.setStringValue(api);
            }
        }
        
        /**
         * Sets (as xml) the "api" attribute
         */
        public void xsetApi(org.apache.xmlbeans.XmlString api)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(API$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(API$12);
                }
                target.set(api);
            }
        }
        
        /**
         * Unsets the "api" attribute
         */
        public void unsetApi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(API$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$14);
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
                return get_store().find_attribute_user(AGENT$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$14);
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
                get_store().remove_attribute(AGENT$14);
            }
        }
        
        /**
         * Gets the "level" attribute
         */
        public java.math.BigInteger getLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$16);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "level" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LEVEL$16);
                return target;
            }
        }
        
        /**
         * True if has "level" attribute
         */
        public boolean isSetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LEVEL$16) != null;
            }
        }
        
        /**
         * Sets the "level" attribute
         */
        public void setLevel(java.math.BigInteger level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$16);
                }
                target.setBigIntegerValue(level);
            }
        }
        
        /**
         * Sets (as xml) the "level" attribute
         */
        public void xsetLevel(org.apache.xmlbeans.XmlInteger level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LEVEL$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LEVEL$16);
                }
                target.set(level);
            }
        }
        
        /**
         * Unsets the "level" attribute
         */
        public void unsetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LEVEL$16);
            }
        }
        
        /**
         * Gets the "entryhopcount" attribute
         */
        public java.math.BigInteger getEntryhopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYHOPCOUNT$18);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "entryhopcount" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetEntryhopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ENTRYHOPCOUNT$18);
                return target;
            }
        }
        
        /**
         * True if has "entryhopcount" attribute
         */
        public boolean isSetEntryhopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTRYHOPCOUNT$18) != null;
            }
        }
        
        /**
         * Sets the "entryhopcount" attribute
         */
        public void setEntryhopcount(java.math.BigInteger entryhopcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYHOPCOUNT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTRYHOPCOUNT$18);
                }
                target.setBigIntegerValue(entryhopcount);
            }
        }
        
        /**
         * Sets (as xml) the "entryhopcount" attribute
         */
        public void xsetEntryhopcount(org.apache.xmlbeans.XmlInteger entryhopcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ENTRYHOPCOUNT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ENTRYHOPCOUNT$18);
                }
                target.set(entryhopcount);
            }
        }
        
        /**
         * Unsets the "entryhopcount" attribute
         */
        public void unsetEntryhopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTRYHOPCOUNT$18);
            }
        }
        
        /**
         * Gets the "exithopcount" attribute
         */
        public java.math.BigInteger getExithopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITHOPCOUNT$20);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "exithopcount" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetExithopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXITHOPCOUNT$20);
                return target;
            }
        }
        
        /**
         * True if has "exithopcount" attribute
         */
        public boolean isSetExithopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXITHOPCOUNT$20) != null;
            }
        }
        
        /**
         * Sets the "exithopcount" attribute
         */
        public void setExithopcount(java.math.BigInteger exithopcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITHOPCOUNT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXITHOPCOUNT$20);
                }
                target.setBigIntegerValue(exithopcount);
            }
        }
        
        /**
         * Sets (as xml) the "exithopcount" attribute
         */
        public void xsetExithopcount(org.apache.xmlbeans.XmlInteger exithopcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXITHOPCOUNT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(EXITHOPCOUNT$20);
                }
                target.set(exithopcount);
            }
        }
        
        /**
         * Unsets the "exithopcount" attribute
         */
        public void unsetExithopcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXITHOPCOUNT$20);
            }
        }
        
        /**
         * Gets the "error_state" attribute
         */
        public java.lang.String getErrorState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "error_state" attribute
         */
        public org.apache.xmlbeans.XmlString xgetErrorState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$22);
                return target;
            }
        }
        
        /**
         * True if has "error_state" attribute
         */
        public boolean isSetErrorState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORSTATE$22) != null;
            }
        }
        
        /**
         * Sets the "error_state" attribute
         */
        public void setErrorState(java.lang.String errorState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTATE$22);
                }
                target.setStringValue(errorState);
            }
        }
        
        /**
         * Sets (as xml) the "error_state" attribute
         */
        public void xsetErrorState(org.apache.xmlbeans.XmlString errorState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORSTATE$22);
                }
                target.set(errorState);
            }
        }
        
        /**
         * Unsets the "error_state" attribute
         */
        public void unsetErrorState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORSTATE$22);
            }
        }
    }
}
