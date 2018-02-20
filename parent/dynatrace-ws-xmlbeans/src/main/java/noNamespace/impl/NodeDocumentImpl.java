/*
 * An XML document type.
 * Localname: node
 * Namespace: 
 * Java type: noNamespace.NodeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one node(@) element.
 *
 * This is a complex type.
 */
public class NodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public NodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NODE$0 = 
        new javax.xml.namespace.QName("", "node");
    
    
    /**
     * Gets the "node" element
     */
    public noNamespace.NodeDocument.Node getNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NodeDocument.Node target = null;
            target = (noNamespace.NodeDocument.Node)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "node" element
     */
    public void setNode(noNamespace.NodeDocument.Node node)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NodeDocument.Node target = null;
            target = (noNamespace.NodeDocument.Node)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                target = (noNamespace.NodeDocument.Node)get_store().add_element_user(NODE$0);
            }
            target.set(node);
        }
    }
    
    /**
     * Appends and returns a new empty "node" element
     */
    public noNamespace.NodeDocument.Node addNewNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NodeDocument.Node target = null;
            target = (noNamespace.NodeDocument.Node)get_store().add_element_user(NODE$0);
            return target;
        }
    }
    /**
     * An XML node(@).
     *
     * This is a complex type.
     */
    public static class NodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NodeDocument.Node
    {
        private static final long serialVersionUID = 1L;
        
        public NodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTACHMENT$0 = 
            new javax.xml.namespace.QName("", "attachment");
        private static final javax.xml.namespace.QName NODE$2 = 
            new javax.xml.namespace.QName("", "node");
        private static final javax.xml.namespace.QName METHOD$4 = 
            new javax.xml.namespace.QName("", "method");
        private static final javax.xml.namespace.QName CLASS1$6 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName ARGUMENT$8 = 
            new javax.xml.namespace.QName("", "argument");
        private static final javax.xml.namespace.QName RETURN$10 = 
            new javax.xml.namespace.QName("", "return");
        private static final javax.xml.namespace.QName AGENT$12 = 
            new javax.xml.namespace.QName("", "agent");
        private static final javax.xml.namespace.QName API$14 = 
            new javax.xml.namespace.QName("", "api");
        private static final javax.xml.namespace.QName TOTALTIME$16 = 
            new javax.xml.namespace.QName("", "totaltime");
        private static final javax.xml.namespace.QName EXECTIME$18 = 
            new javax.xml.namespace.QName("", "exectime");
        private static final javax.xml.namespace.QName EXECTIMEPERCENTAGE$20 = 
            new javax.xml.namespace.QName("", "exectimepercentage");
        private static final javax.xml.namespace.QName CPUTOTALTIME$22 = 
            new javax.xml.namespace.QName("", "cputotaltime");
        private static final javax.xml.namespace.QName CPUEXECTIME$24 = 
            new javax.xml.namespace.QName("", "cpuexectime");
        private static final javax.xml.namespace.QName CPUPERCENTAGE$26 = 
            new javax.xml.namespace.QName("", "cpupercentage");
        private static final javax.xml.namespace.QName SYNCTOTALTIME$28 = 
            new javax.xml.namespace.QName("", "synctotaltime");
        private static final javax.xml.namespace.QName SYNCTIME$30 = 
            new javax.xml.namespace.QName("", "synctime");
        private static final javax.xml.namespace.QName SYNCPERCENTAGE$32 = 
            new javax.xml.namespace.QName("", "syncpercentage");
        private static final javax.xml.namespace.QName WAITTOTALTIME$34 = 
            new javax.xml.namespace.QName("", "waittotaltime");
        private static final javax.xml.namespace.QName WAITTIME$36 = 
            new javax.xml.namespace.QName("", "waittime");
        private static final javax.xml.namespace.QName WAITPERCENTAGE$38 = 
            new javax.xml.namespace.QName("", "waitpercentage");
        private static final javax.xml.namespace.QName SUSPENSIONTOTALTIME$40 = 
            new javax.xml.namespace.QName("", "suspensiontotaltime");
        private static final javax.xml.namespace.QName SUSPENSIONTIME$42 = 
            new javax.xml.namespace.QName("", "suspensiontime");
        private static final javax.xml.namespace.QName SUSPENSIONPERCENTAGE$44 = 
            new javax.xml.namespace.QName("", "suspensionpercentage");
        private static final javax.xml.namespace.QName DESCHEDULEDTOTALTIME$46 = 
            new javax.xml.namespace.QName("", "descheduledtotaltime");
        private static final javax.xml.namespace.QName DESCHEDULEDTIME$48 = 
            new javax.xml.namespace.QName("", "descheduledtime");
        private static final javax.xml.namespace.QName DESCHEDULEDPERCENTAGE$50 = 
            new javax.xml.namespace.QName("", "descheduledpercentage");
        private static final javax.xml.namespace.QName THREAD$52 = 
            new javax.xml.namespace.QName("", "thread");
        private static final javax.xml.namespace.QName RELATIVESTART$54 = 
            new javax.xml.namespace.QName("", "relativestart");
        private static final javax.xml.namespace.QName LEVEL$56 = 
            new javax.xml.namespace.QName("", "level");
        private static final javax.xml.namespace.QName ENTRYHOPCOUNT$58 = 
            new javax.xml.namespace.QName("", "entryhopcount");
        private static final javax.xml.namespace.QName EXITHOPCOUNT$60 = 
            new javax.xml.namespace.QName("", "exithopcount");
        private static final javax.xml.namespace.QName STITCHINGINFO$62 = 
            new javax.xml.namespace.QName("", "stitchinginfo");
        private static final javax.xml.namespace.QName ERRORSTATE$64 = 
            new javax.xml.namespace.QName("", "error_state");
        private static final javax.xml.namespace.QName BREAKDOWN$66 = 
            new javax.xml.namespace.QName("", "breakdown");
        private static final javax.xml.namespace.QName FQCLASS$68 = 
            new javax.xml.namespace.QName("", "fqclass");
        
        
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
         * Gets array of all "node" elements
         */
        public noNamespace.NodeDocument.Node[] getNodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NODE$2, targetList);
                noNamespace.NodeDocument.Node[] result = new noNamespace.NodeDocument.Node[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "node" element
         */
        public noNamespace.NodeDocument.Node getNodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NodeDocument.Node target = null;
                target = (noNamespace.NodeDocument.Node)get_store().find_element_user(NODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "node" element
         */
        public int sizeOfNodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NODE$2);
            }
        }
        
        /**
         * Sets array of all "node" element
         */
        public void setNodeArray(noNamespace.NodeDocument.Node[] nodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nodeArray, NODE$2);
            }
        }
        
        /**
         * Sets ith "node" element
         */
        public void setNodeArray(int i, noNamespace.NodeDocument.Node node)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NodeDocument.Node target = null;
                target = (noNamespace.NodeDocument.Node)get_store().find_element_user(NODE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(node);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "node" element
         */
        public noNamespace.NodeDocument.Node insertNewNode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NodeDocument.Node target = null;
                target = (noNamespace.NodeDocument.Node)get_store().insert_element_user(NODE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "node" element
         */
        public noNamespace.NodeDocument.Node addNewNode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NodeDocument.Node target = null;
                target = (noNamespace.NodeDocument.Node)get_store().add_element_user(NODE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "node" element
         */
        public void removeNode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NODE$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
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
                return get_store().find_attribute_user(METHOD$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$4);
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
                get_store().remove_attribute(METHOD$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$6);
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
                return get_store().find_attribute_user(CLASS1$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$6);
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
                get_store().remove_attribute(CLASS1$6);
            }
        }
        
        /**
         * Gets the "argument" attribute
         */
        public java.lang.String getArgument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGUMENT$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "argument" attribute
         */
        public org.apache.xmlbeans.XmlString xgetArgument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARGUMENT$8);
                return target;
            }
        }
        
        /**
         * True if has "argument" attribute
         */
        public boolean isSetArgument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARGUMENT$8) != null;
            }
        }
        
        /**
         * Sets the "argument" attribute
         */
        public void setArgument(java.lang.String argument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGUMENT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARGUMENT$8);
                }
                target.setStringValue(argument);
            }
        }
        
        /**
         * Sets (as xml) the "argument" attribute
         */
        public void xsetArgument(org.apache.xmlbeans.XmlString argument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARGUMENT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ARGUMENT$8);
                }
                target.set(argument);
            }
        }
        
        /**
         * Unsets the "argument" attribute
         */
        public void unsetArgument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARGUMENT$8);
            }
        }
        
        /**
         * Gets the "return" attribute
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURN$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" attribute
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RETURN$10);
                return target;
            }
        }
        
        /**
         * True if has "return" attribute
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RETURN$10) != null;
            }
        }
        
        /**
         * Sets the "return" attribute
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURN$10);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" attribute
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RETURN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RETURN$10);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Unsets the "return" attribute
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RETURN$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$12);
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
                return get_store().find_attribute_user(AGENT$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENT$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AGENT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AGENT$12);
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
                get_store().remove_attribute(AGENT$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(API$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(API$14);
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
                return get_store().find_attribute_user(API$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(API$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(API$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(API$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(API$14);
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
                get_store().remove_attribute(API$14);
            }
        }
        
        /**
         * Gets the "totaltime" attribute
         */
        public double getTotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIME$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "totaltime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIME$16);
                return target;
            }
        }
        
        /**
         * True if has "totaltime" attribute
         */
        public boolean isSetTotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOTALTIME$16) != null;
            }
        }
        
        /**
         * Sets the "totaltime" attribute
         */
        public void setTotaltime(double totaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALTIME$16);
                }
                target.setDoubleValue(totaltime);
            }
        }
        
        /**
         * Sets (as xml) the "totaltime" attribute
         */
        public void xsetTotaltime(org.apache.xmlbeans.XmlDouble totaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TOTALTIME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TOTALTIME$16);
                }
                target.set(totaltime);
            }
        }
        
        /**
         * Unsets the "totaltime" attribute
         */
        public void unsetTotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOTALTIME$16);
            }
        }
        
        /**
         * Gets the "exectime" attribute
         */
        public double getExectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIME$18);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "exectime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetExectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIME$18);
                return target;
            }
        }
        
        /**
         * True if has "exectime" attribute
         */
        public boolean isSetExectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXECTIME$18) != null;
            }
        }
        
        /**
         * Sets the "exectime" attribute
         */
        public void setExectime(double exectime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIME$18);
                }
                target.setDoubleValue(exectime);
            }
        }
        
        /**
         * Sets (as xml) the "exectime" attribute
         */
        public void xsetExectime(org.apache.xmlbeans.XmlDouble exectime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIME$18);
                }
                target.set(exectime);
            }
        }
        
        /**
         * Unsets the "exectime" attribute
         */
        public void unsetExectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXECTIME$18);
            }
        }
        
        /**
         * Gets the "exectimepercentage" attribute
         */
        public double getExectimepercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEPERCENTAGE$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "exectimepercentage" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetExectimepercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEPERCENTAGE$20);
                return target;
            }
        }
        
        /**
         * True if has "exectimepercentage" attribute
         */
        public boolean isSetExectimepercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXECTIMEPERCENTAGE$20) != null;
            }
        }
        
        /**
         * Sets the "exectimepercentage" attribute
         */
        public void setExectimepercentage(double exectimepercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXECTIMEPERCENTAGE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXECTIMEPERCENTAGE$20);
                }
                target.setDoubleValue(exectimepercentage);
            }
        }
        
        /**
         * Sets (as xml) the "exectimepercentage" attribute
         */
        public void xsetExectimepercentage(org.apache.xmlbeans.XmlDouble exectimepercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EXECTIMEPERCENTAGE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EXECTIMEPERCENTAGE$20);
                }
                target.set(exectimepercentage);
            }
        }
        
        /**
         * Unsets the "exectimepercentage" attribute
         */
        public void unsetExectimepercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXECTIMEPERCENTAGE$20);
            }
        }
        
        /**
         * Gets the "cputotaltime" attribute
         */
        public double getCputotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIME$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "cputotaltime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCputotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIME$22);
                return target;
            }
        }
        
        /**
         * True if has "cputotaltime" attribute
         */
        public boolean isSetCputotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CPUTOTALTIME$22) != null;
            }
        }
        
        /**
         * Sets the "cputotaltime" attribute
         */
        public void setCputotaltime(double cputotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUTOTALTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUTOTALTIME$22);
                }
                target.setDoubleValue(cputotaltime);
            }
        }
        
        /**
         * Sets (as xml) the "cputotaltime" attribute
         */
        public void xsetCputotaltime(org.apache.xmlbeans.XmlDouble cputotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUTOTALTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUTOTALTIME$22);
                }
                target.set(cputotaltime);
            }
        }
        
        /**
         * Unsets the "cputotaltime" attribute
         */
        public void unsetCputotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CPUTOTALTIME$22);
            }
        }
        
        /**
         * Gets the "cpuexectime" attribute
         */
        public double getCpuexectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIME$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "cpuexectime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCpuexectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIME$24);
                return target;
            }
        }
        
        /**
         * True if has "cpuexectime" attribute
         */
        public boolean isSetCpuexectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CPUEXECTIME$24) != null;
            }
        }
        
        /**
         * Sets the "cpuexectime" attribute
         */
        public void setCpuexectime(double cpuexectime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUEXECTIME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUEXECTIME$24);
                }
                target.setDoubleValue(cpuexectime);
            }
        }
        
        /**
         * Sets (as xml) the "cpuexectime" attribute
         */
        public void xsetCpuexectime(org.apache.xmlbeans.XmlDouble cpuexectime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUEXECTIME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUEXECTIME$24);
                }
                target.set(cpuexectime);
            }
        }
        
        /**
         * Unsets the "cpuexectime" attribute
         */
        public void unsetCpuexectime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CPUEXECTIME$24);
            }
        }
        
        /**
         * Gets the "cpupercentage" attribute
         */
        public double getCpupercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUPERCENTAGE$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "cpupercentage" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetCpupercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUPERCENTAGE$26);
                return target;
            }
        }
        
        /**
         * True if has "cpupercentage" attribute
         */
        public boolean isSetCpupercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CPUPERCENTAGE$26) != null;
            }
        }
        
        /**
         * Sets the "cpupercentage" attribute
         */
        public void setCpupercentage(double cpupercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPUPERCENTAGE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPUPERCENTAGE$26);
                }
                target.setDoubleValue(cpupercentage);
            }
        }
        
        /**
         * Sets (as xml) the "cpupercentage" attribute
         */
        public void xsetCpupercentage(org.apache.xmlbeans.XmlDouble cpupercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CPUPERCENTAGE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CPUPERCENTAGE$26);
                }
                target.set(cpupercentage);
            }
        }
        
        /**
         * Unsets the "cpupercentage" attribute
         */
        public void unsetCpupercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CPUPERCENTAGE$26);
            }
        }
        
        /**
         * Gets the "synctotaltime" attribute
         */
        public double getSynctotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTOTALTIME$28);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "synctotaltime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSynctotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCTOTALTIME$28);
                return target;
            }
        }
        
        /**
         * True if has "synctotaltime" attribute
         */
        public boolean isSetSynctotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SYNCTOTALTIME$28) != null;
            }
        }
        
        /**
         * Sets the "synctotaltime" attribute
         */
        public void setSynctotaltime(double synctotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTOTALTIME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCTOTALTIME$28);
                }
                target.setDoubleValue(synctotaltime);
            }
        }
        
        /**
         * Sets (as xml) the "synctotaltime" attribute
         */
        public void xsetSynctotaltime(org.apache.xmlbeans.XmlDouble synctotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCTOTALTIME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCTOTALTIME$28);
                }
                target.set(synctotaltime);
            }
        }
        
        /**
         * Unsets the "synctotaltime" attribute
         */
        public void unsetSynctotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SYNCTOTALTIME$28);
            }
        }
        
        /**
         * Gets the "synctime" attribute
         */
        public double getSynctime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTIME$30);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "synctime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSynctime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCTIME$30);
                return target;
            }
        }
        
        /**
         * True if has "synctime" attribute
         */
        public boolean isSetSynctime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SYNCTIME$30) != null;
            }
        }
        
        /**
         * Sets the "synctime" attribute
         */
        public void setSynctime(double synctime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCTIME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCTIME$30);
                }
                target.setDoubleValue(synctime);
            }
        }
        
        /**
         * Sets (as xml) the "synctime" attribute
         */
        public void xsetSynctime(org.apache.xmlbeans.XmlDouble synctime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCTIME$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCTIME$30);
                }
                target.set(synctime);
            }
        }
        
        /**
         * Unsets the "synctime" attribute
         */
        public void unsetSynctime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SYNCTIME$30);
            }
        }
        
        /**
         * Gets the "syncpercentage" attribute
         */
        public double getSyncpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCPERCENTAGE$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "syncpercentage" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSyncpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCPERCENTAGE$32);
                return target;
            }
        }
        
        /**
         * True if has "syncpercentage" attribute
         */
        public boolean isSetSyncpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SYNCPERCENTAGE$32) != null;
            }
        }
        
        /**
         * Sets the "syncpercentage" attribute
         */
        public void setSyncpercentage(double syncpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCPERCENTAGE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCPERCENTAGE$32);
                }
                target.setDoubleValue(syncpercentage);
            }
        }
        
        /**
         * Sets (as xml) the "syncpercentage" attribute
         */
        public void xsetSyncpercentage(org.apache.xmlbeans.XmlDouble syncpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SYNCPERCENTAGE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SYNCPERCENTAGE$32);
                }
                target.set(syncpercentage);
            }
        }
        
        /**
         * Unsets the "syncpercentage" attribute
         */
        public void unsetSyncpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SYNCPERCENTAGE$32);
            }
        }
        
        /**
         * Gets the "waittotaltime" attribute
         */
        public double getWaittotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITTOTALTIME$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "waittotaltime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWaittotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITTOTALTIME$34);
                return target;
            }
        }
        
        /**
         * True if has "waittotaltime" attribute
         */
        public boolean isSetWaittotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WAITTOTALTIME$34) != null;
            }
        }
        
        /**
         * Sets the "waittotaltime" attribute
         */
        public void setWaittotaltime(double waittotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITTOTALTIME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITTOTALTIME$34);
                }
                target.setDoubleValue(waittotaltime);
            }
        }
        
        /**
         * Sets (as xml) the "waittotaltime" attribute
         */
        public void xsetWaittotaltime(org.apache.xmlbeans.XmlDouble waittotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITTOTALTIME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITTOTALTIME$34);
                }
                target.set(waittotaltime);
            }
        }
        
        /**
         * Unsets the "waittotaltime" attribute
         */
        public void unsetWaittotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WAITTOTALTIME$34);
            }
        }
        
        /**
         * Gets the "waittime" attribute
         */
        public double getWaittime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITTIME$36);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "waittime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWaittime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITTIME$36);
                return target;
            }
        }
        
        /**
         * True if has "waittime" attribute
         */
        public boolean isSetWaittime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WAITTIME$36) != null;
            }
        }
        
        /**
         * Sets the "waittime" attribute
         */
        public void setWaittime(double waittime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITTIME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITTIME$36);
                }
                target.setDoubleValue(waittime);
            }
        }
        
        /**
         * Sets (as xml) the "waittime" attribute
         */
        public void xsetWaittime(org.apache.xmlbeans.XmlDouble waittime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITTIME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITTIME$36);
                }
                target.set(waittime);
            }
        }
        
        /**
         * Unsets the "waittime" attribute
         */
        public void unsetWaittime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WAITTIME$36);
            }
        }
        
        /**
         * Gets the "waitpercentage" attribute
         */
        public double getWaitpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITPERCENTAGE$38);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "waitpercentage" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetWaitpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITPERCENTAGE$38);
                return target;
            }
        }
        
        /**
         * True if has "waitpercentage" attribute
         */
        public boolean isSetWaitpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WAITPERCENTAGE$38) != null;
            }
        }
        
        /**
         * Sets the "waitpercentage" attribute
         */
        public void setWaitpercentage(double waitpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITPERCENTAGE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITPERCENTAGE$38);
                }
                target.setDoubleValue(waitpercentage);
            }
        }
        
        /**
         * Sets (as xml) the "waitpercentage" attribute
         */
        public void xsetWaitpercentage(org.apache.xmlbeans.XmlDouble waitpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WAITPERCENTAGE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WAITPERCENTAGE$38);
                }
                target.set(waitpercentage);
            }
        }
        
        /**
         * Unsets the "waitpercentage" attribute
         */
        public void unsetWaitpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WAITPERCENTAGE$38);
            }
        }
        
        /**
         * Gets the "suspensiontotaltime" attribute
         */
        public double getSuspensiontotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONTOTALTIME$40);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "suspensiontotaltime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSuspensiontotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONTOTALTIME$40);
                return target;
            }
        }
        
        /**
         * True if has "suspensiontotaltime" attribute
         */
        public boolean isSetSuspensiontotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUSPENSIONTOTALTIME$40) != null;
            }
        }
        
        /**
         * Sets the "suspensiontotaltime" attribute
         */
        public void setSuspensiontotaltime(double suspensiontotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONTOTALTIME$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONTOTALTIME$40);
                }
                target.setDoubleValue(suspensiontotaltime);
            }
        }
        
        /**
         * Sets (as xml) the "suspensiontotaltime" attribute
         */
        public void xsetSuspensiontotaltime(org.apache.xmlbeans.XmlDouble suspensiontotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONTOTALTIME$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONTOTALTIME$40);
                }
                target.set(suspensiontotaltime);
            }
        }
        
        /**
         * Unsets the "suspensiontotaltime" attribute
         */
        public void unsetSuspensiontotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUSPENSIONTOTALTIME$40);
            }
        }
        
        /**
         * Gets the "suspensiontime" attribute
         */
        public double getSuspensiontime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONTIME$42);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "suspensiontime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSuspensiontime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONTIME$42);
                return target;
            }
        }
        
        /**
         * True if has "suspensiontime" attribute
         */
        public boolean isSetSuspensiontime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUSPENSIONTIME$42) != null;
            }
        }
        
        /**
         * Sets the "suspensiontime" attribute
         */
        public void setSuspensiontime(double suspensiontime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONTIME$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONTIME$42);
                }
                target.setDoubleValue(suspensiontime);
            }
        }
        
        /**
         * Sets (as xml) the "suspensiontime" attribute
         */
        public void xsetSuspensiontime(org.apache.xmlbeans.XmlDouble suspensiontime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONTIME$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONTIME$42);
                }
                target.set(suspensiontime);
            }
        }
        
        /**
         * Unsets the "suspensiontime" attribute
         */
        public void unsetSuspensiontime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUSPENSIONTIME$42);
            }
        }
        
        /**
         * Gets the "suspensionpercentage" attribute
         */
        public double getSuspensionpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONPERCENTAGE$44);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "suspensionpercentage" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSuspensionpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONPERCENTAGE$44);
                return target;
            }
        }
        
        /**
         * True if has "suspensionpercentage" attribute
         */
        public boolean isSetSuspensionpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUSPENSIONPERCENTAGE$44) != null;
            }
        }
        
        /**
         * Sets the "suspensionpercentage" attribute
         */
        public void setSuspensionpercentage(double suspensionpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUSPENSIONPERCENTAGE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUSPENSIONPERCENTAGE$44);
                }
                target.setDoubleValue(suspensionpercentage);
            }
        }
        
        /**
         * Sets (as xml) the "suspensionpercentage" attribute
         */
        public void xsetSuspensionpercentage(org.apache.xmlbeans.XmlDouble suspensionpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SUSPENSIONPERCENTAGE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SUSPENSIONPERCENTAGE$44);
                }
                target.set(suspensionpercentage);
            }
        }
        
        /**
         * Unsets the "suspensionpercentage" attribute
         */
        public void unsetSuspensionpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUSPENSIONPERCENTAGE$44);
            }
        }
        
        /**
         * Gets the "descheduledtotaltime" attribute
         */
        public double getDescheduledtotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULEDTOTALTIME$46);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "descheduledtotaltime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDescheduledtotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULEDTOTALTIME$46);
                return target;
            }
        }
        
        /**
         * True if has "descheduledtotaltime" attribute
         */
        public boolean isSetDescheduledtotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESCHEDULEDTOTALTIME$46) != null;
            }
        }
        
        /**
         * Sets the "descheduledtotaltime" attribute
         */
        public void setDescheduledtotaltime(double descheduledtotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULEDTOTALTIME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCHEDULEDTOTALTIME$46);
                }
                target.setDoubleValue(descheduledtotaltime);
            }
        }
        
        /**
         * Sets (as xml) the "descheduledtotaltime" attribute
         */
        public void xsetDescheduledtotaltime(org.apache.xmlbeans.XmlDouble descheduledtotaltime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULEDTOTALTIME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESCHEDULEDTOTALTIME$46);
                }
                target.set(descheduledtotaltime);
            }
        }
        
        /**
         * Unsets the "descheduledtotaltime" attribute
         */
        public void unsetDescheduledtotaltime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESCHEDULEDTOTALTIME$46);
            }
        }
        
        /**
         * Gets the "descheduledtime" attribute
         */
        public double getDescheduledtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULEDTIME$48);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "descheduledtime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDescheduledtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULEDTIME$48);
                return target;
            }
        }
        
        /**
         * True if has "descheduledtime" attribute
         */
        public boolean isSetDescheduledtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESCHEDULEDTIME$48) != null;
            }
        }
        
        /**
         * Sets the "descheduledtime" attribute
         */
        public void setDescheduledtime(double descheduledtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULEDTIME$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCHEDULEDTIME$48);
                }
                target.setDoubleValue(descheduledtime);
            }
        }
        
        /**
         * Sets (as xml) the "descheduledtime" attribute
         */
        public void xsetDescheduledtime(org.apache.xmlbeans.XmlDouble descheduledtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULEDTIME$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESCHEDULEDTIME$48);
                }
                target.set(descheduledtime);
            }
        }
        
        /**
         * Unsets the "descheduledtime" attribute
         */
        public void unsetDescheduledtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESCHEDULEDTIME$48);
            }
        }
        
        /**
         * Gets the "descheduledpercentage" attribute
         */
        public double getDescheduledpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULEDPERCENTAGE$50);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "descheduledpercentage" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDescheduledpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULEDPERCENTAGE$50);
                return target;
            }
        }
        
        /**
         * True if has "descheduledpercentage" attribute
         */
        public boolean isSetDescheduledpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESCHEDULEDPERCENTAGE$50) != null;
            }
        }
        
        /**
         * Sets the "descheduledpercentage" attribute
         */
        public void setDescheduledpercentage(double descheduledpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCHEDULEDPERCENTAGE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCHEDULEDPERCENTAGE$50);
                }
                target.setDoubleValue(descheduledpercentage);
            }
        }
        
        /**
         * Sets (as xml) the "descheduledpercentage" attribute
         */
        public void xsetDescheduledpercentage(org.apache.xmlbeans.XmlDouble descheduledpercentage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DESCHEDULEDPERCENTAGE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DESCHEDULEDPERCENTAGE$50);
                }
                target.set(descheduledpercentage);
            }
        }
        
        /**
         * Unsets the "descheduledpercentage" attribute
         */
        public void unsetDescheduledpercentage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESCHEDULEDPERCENTAGE$50);
            }
        }
        
        /**
         * Gets the "thread" attribute
         */
        public java.lang.String getThread()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THREAD$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "thread" attribute
         */
        public org.apache.xmlbeans.XmlString xgetThread()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THREAD$52);
                return target;
            }
        }
        
        /**
         * True if has "thread" attribute
         */
        public boolean isSetThread()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THREAD$52) != null;
            }
        }
        
        /**
         * Sets the "thread" attribute
         */
        public void setThread(java.lang.String thread)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THREAD$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THREAD$52);
                }
                target.setStringValue(thread);
            }
        }
        
        /**
         * Sets (as xml) the "thread" attribute
         */
        public void xsetThread(org.apache.xmlbeans.XmlString thread)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THREAD$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(THREAD$52);
                }
                target.set(thread);
            }
        }
        
        /**
         * Unsets the "thread" attribute
         */
        public void unsetThread()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THREAD$52);
            }
        }
        
        /**
         * Gets the "relativestart" attribute
         */
        public double getRelativestart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVESTART$54);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "relativestart" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRelativestart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RELATIVESTART$54);
                return target;
            }
        }
        
        /**
         * True if has "relativestart" attribute
         */
        public boolean isSetRelativestart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELATIVESTART$54) != null;
            }
        }
        
        /**
         * Sets the "relativestart" attribute
         */
        public void setRelativestart(double relativestart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVESTART$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIVESTART$54);
                }
                target.setDoubleValue(relativestart);
            }
        }
        
        /**
         * Sets (as xml) the "relativestart" attribute
         */
        public void xsetRelativestart(org.apache.xmlbeans.XmlDouble relativestart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RELATIVESTART$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RELATIVESTART$54);
                }
                target.set(relativestart);
            }
        }
        
        /**
         * Unsets the "relativestart" attribute
         */
        public void unsetRelativestart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELATIVESTART$54);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$56);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LEVEL$56);
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
                return get_store().find_attribute_user(LEVEL$56) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$56);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(LEVEL$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(LEVEL$56);
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
                get_store().remove_attribute(LEVEL$56);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYHOPCOUNT$58);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ENTRYHOPCOUNT$58);
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
                return get_store().find_attribute_user(ENTRYHOPCOUNT$58) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYHOPCOUNT$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTRYHOPCOUNT$58);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(ENTRYHOPCOUNT$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(ENTRYHOPCOUNT$58);
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
                get_store().remove_attribute(ENTRYHOPCOUNT$58);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITHOPCOUNT$60);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXITHOPCOUNT$60);
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
                return get_store().find_attribute_user(EXITHOPCOUNT$60) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITHOPCOUNT$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXITHOPCOUNT$60);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(EXITHOPCOUNT$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(EXITHOPCOUNT$60);
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
                get_store().remove_attribute(EXITHOPCOUNT$60);
            }
        }
        
        /**
         * Gets the "stitchinginfo" attribute
         */
        public java.lang.String getStitchinginfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STITCHINGINFO$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stitchinginfo" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStitchinginfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STITCHINGINFO$62);
                return target;
            }
        }
        
        /**
         * True if has "stitchinginfo" attribute
         */
        public boolean isSetStitchinginfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STITCHINGINFO$62) != null;
            }
        }
        
        /**
         * Sets the "stitchinginfo" attribute
         */
        public void setStitchinginfo(java.lang.String stitchinginfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STITCHINGINFO$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STITCHINGINFO$62);
                }
                target.setStringValue(stitchinginfo);
            }
        }
        
        /**
         * Sets (as xml) the "stitchinginfo" attribute
         */
        public void xsetStitchinginfo(org.apache.xmlbeans.XmlString stitchinginfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STITCHINGINFO$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STITCHINGINFO$62);
                }
                target.set(stitchinginfo);
            }
        }
        
        /**
         * Unsets the "stitchinginfo" attribute
         */
        public void unsetStitchinginfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STITCHINGINFO$62);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$64);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$64);
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
                return get_store().find_attribute_user(ERRORSTATE$64) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTATE$64);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORSTATE$64);
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
                get_store().remove_attribute(ERRORSTATE$64);
            }
        }
        
        /**
         * Gets the "breakdown" attribute
         */
        public java.lang.String getBreakdown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BREAKDOWN$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "breakdown" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBreakdown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BREAKDOWN$66);
                return target;
            }
        }
        
        /**
         * True if has "breakdown" attribute
         */
        public boolean isSetBreakdown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BREAKDOWN$66) != null;
            }
        }
        
        /**
         * Sets the "breakdown" attribute
         */
        public void setBreakdown(java.lang.String breakdown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BREAKDOWN$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BREAKDOWN$66);
                }
                target.setStringValue(breakdown);
            }
        }
        
        /**
         * Sets (as xml) the "breakdown" attribute
         */
        public void xsetBreakdown(org.apache.xmlbeans.XmlString breakdown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BREAKDOWN$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BREAKDOWN$66);
                }
                target.set(breakdown);
            }
        }
        
        /**
         * Unsets the "breakdown" attribute
         */
        public void unsetBreakdown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BREAKDOWN$66);
            }
        }
        
        /**
         * Gets the "fqclass" attribute
         */
        public java.lang.String getFqclass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FQCLASS$68);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fqclass" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFqclass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FQCLASS$68);
                return target;
            }
        }
        
        /**
         * True if has "fqclass" attribute
         */
        public boolean isSetFqclass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FQCLASS$68) != null;
            }
        }
        
        /**
         * Sets the "fqclass" attribute
         */
        public void setFqclass(java.lang.String fqclass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FQCLASS$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FQCLASS$68);
                }
                target.setStringValue(fqclass);
            }
        }
        
        /**
         * Sets (as xml) the "fqclass" attribute
         */
        public void xsetFqclass(org.apache.xmlbeans.XmlString fqclass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FQCLASS$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FQCLASS$68);
                }
                target.set(fqclass);
            }
        }
        
        /**
         * Unsets the "fqclass" attribute
         */
        public void unsetFqclass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FQCLASS$68);
            }
        }
    }
}
