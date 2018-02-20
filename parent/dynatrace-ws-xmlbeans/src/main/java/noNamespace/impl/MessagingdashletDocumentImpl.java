/*
 * An XML document type.
 * Localname: messagingdashlet
 * Namespace: 
 * Java type: noNamespace.MessagingdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one messagingdashlet(@) element.
 *
 * This is a complex type.
 */
public class MessagingdashletDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MessagingdashletDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessagingdashletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGINGDASHLET$0 = 
        new javax.xml.namespace.QName("", "messagingdashlet");
    
    
    /**
     * Gets the "messagingdashlet" element
     */
    public noNamespace.MessagingdashletDocument.Messagingdashlet getMessagingdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MessagingdashletDocument.Messagingdashlet target = null;
            target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().find_element_user(MESSAGINGDASHLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messagingdashlet" element
     */
    public void setMessagingdashlet(noNamespace.MessagingdashletDocument.Messagingdashlet messagingdashlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MessagingdashletDocument.Messagingdashlet target = null;
            target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().find_element_user(MESSAGINGDASHLET$0, 0);
            if (target == null)
            {
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().add_element_user(MESSAGINGDASHLET$0);
            }
            target.set(messagingdashlet);
        }
    }
    
    /**
     * Appends and returns a new empty "messagingdashlet" element
     */
    public noNamespace.MessagingdashletDocument.Messagingdashlet addNewMessagingdashlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MessagingdashletDocument.Messagingdashlet target = null;
            target = (noNamespace.MessagingdashletDocument.Messagingdashlet)get_store().add_element_user(MESSAGINGDASHLET$0);
            return target;
        }
    }
    /**
     * An XML messagingdashlet(@).
     *
     * This is a complex type.
     */
    public static class MessagingdashletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MessagingdashletDocument.Messagingdashlet
    {
        private static final long serialVersionUID = 1L;
        
        public MessagingdashletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName COMPARESOURCE$2 = 
            new javax.xml.namespace.QName("", "comparesource");
        private static final javax.xml.namespace.QName MESSAGES$4 = 
            new javax.xml.namespace.QName("", "messages");
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
         * Gets the "messages" element
         */
        public noNamespace.MessagingdashletDocument.Messagingdashlet.Messages getMessages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MessagingdashletDocument.Messagingdashlet.Messages target = null;
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages)get_store().find_element_user(MESSAGES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "messages" element
         */
        public boolean isSetMessages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGES$4) != 0;
            }
        }
        
        /**
         * Sets the "messages" element
         */
        public void setMessages(noNamespace.MessagingdashletDocument.Messagingdashlet.Messages messages)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MessagingdashletDocument.Messagingdashlet.Messages target = null;
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages)get_store().find_element_user(MESSAGES$4, 0);
                if (target == null)
                {
                    target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages)get_store().add_element_user(MESSAGES$4);
                }
                target.set(messages);
            }
        }
        
        /**
         * Appends and returns a new empty "messages" element
         */
        public noNamespace.MessagingdashletDocument.Messagingdashlet.Messages addNewMessages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.MessagingdashletDocument.Messagingdashlet.Messages target = null;
                target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages)get_store().add_element_user(MESSAGES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "messages" element
         */
        public void unsetMessages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGES$4, 0);
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
         * An XML messages(@).
         *
         * This is a complex type.
         */
        public static class MessagesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MessagingdashletDocument.Messagingdashlet.Messages
        {
            private static final long serialVersionUID = 1L;
            
            public MessagesImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MESSAGE$0 = 
                new javax.xml.namespace.QName("", "message");
            private static final javax.xml.namespace.QName STRUCTURETYPE$2 = 
                new javax.xml.namespace.QName("", "structuretype");
            
            
            /**
             * Gets array of all "message" elements
             */
            public noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message[] getMessageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MESSAGE$0, targetList);
                    noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message[] result = new noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "message" element
             */
            public noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message getMessageArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message target = null;
                    target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message)get_store().find_element_user(MESSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "message" element
             */
            public int sizeOfMessageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MESSAGE$0);
                }
            }
            
            /**
             * Sets array of all "message" element
             */
            public void setMessageArray(noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message[] messageArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(messageArray, MESSAGE$0);
                }
            }
            
            /**
             * Sets ith "message" element
             */
            public void setMessageArray(int i, noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message message)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message target = null;
                    target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message)get_store().find_element_user(MESSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(message);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "message" element
             */
            public noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message insertNewMessage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message target = null;
                    target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message)get_store().insert_element_user(MESSAGE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "message" element
             */
            public noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message addNewMessage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message target = null;
                    target = (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message)get_store().add_element_user(MESSAGE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "message" element
             */
            public void removeMessage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MESSAGE$0, i);
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
             * An XML message(@).
             *
             * This is a complex type.
             */
            public static class MessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message
            {
                private static final long serialVersionUID = 1L;
                
                public MessageImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PLATFORM$0 = 
                    new javax.xml.namespace.QName("", "platform");
                private static final javax.xml.namespace.QName DESTINATION$2 = 
                    new javax.xml.namespace.QName("", "destination");
                private static final javax.xml.namespace.QName SENTCOUNT$4 = 
                    new javax.xml.namespace.QName("", "sent_count");
                private static final javax.xml.namespace.QName SENTTIMEAVG$6 = 
                    new javax.xml.namespace.QName("", "sent_time_avg");
                private static final javax.xml.namespace.QName SENTTIMEMIN$8 = 
                    new javax.xml.namespace.QName("", "sent_time_min");
                private static final javax.xml.namespace.QName SENTTIMEMAX$10 = 
                    new javax.xml.namespace.QName("", "sent_time_max");
                private static final javax.xml.namespace.QName SENTTIMESUM$12 = 
                    new javax.xml.namespace.QName("", "sent_time_sum");
                private static final javax.xml.namespace.QName SENTSIZEAVG$14 = 
                    new javax.xml.namespace.QName("", "sent_size_avg");
                private static final javax.xml.namespace.QName SENTSIZEMIN$16 = 
                    new javax.xml.namespace.QName("", "sent_size_min");
                private static final javax.xml.namespace.QName SENTSIZEMAX$18 = 
                    new javax.xml.namespace.QName("", "sent_size_max");
                private static final javax.xml.namespace.QName SENTSIZESUM$20 = 
                    new javax.xml.namespace.QName("", "sent_size_sum");
                private static final javax.xml.namespace.QName RCVDCOUNT$22 = 
                    new javax.xml.namespace.QName("", "rcvd_count");
                private static final javax.xml.namespace.QName RCVDTIMEAVG$24 = 
                    new javax.xml.namespace.QName("", "rcvd_time_avg");
                private static final javax.xml.namespace.QName RCVDTIMEMIN$26 = 
                    new javax.xml.namespace.QName("", "rcvd_time_min");
                private static final javax.xml.namespace.QName RCVDTIMEMAX$28 = 
                    new javax.xml.namespace.QName("", "rcvd_time_max");
                private static final javax.xml.namespace.QName RCVDTIMESUM$30 = 
                    new javax.xml.namespace.QName("", "rcvd_time_sum");
                private static final javax.xml.namespace.QName RCVDSIZEAVG$32 = 
                    new javax.xml.namespace.QName("", "rcvd_size_avg");
                private static final javax.xml.namespace.QName RCVDSIZEMIN$34 = 
                    new javax.xml.namespace.QName("", "rcvd_size_min");
                private static final javax.xml.namespace.QName RCVDSIZEMAX$36 = 
                    new javax.xml.namespace.QName("", "rcvd_size_max");
                private static final javax.xml.namespace.QName RCVDSIZESUM$38 = 
                    new javax.xml.namespace.QName("", "rcvd_size_sum");
                private static final javax.xml.namespace.QName PEEKCOUNT$40 = 
                    new javax.xml.namespace.QName("", "peek_count");
                private static final javax.xml.namespace.QName PEEKTIMEAVG$42 = 
                    new javax.xml.namespace.QName("", "peek_time_avg");
                private static final javax.xml.namespace.QName PEEKTIMEMIN$44 = 
                    new javax.xml.namespace.QName("", "peek_time_min");
                private static final javax.xml.namespace.QName PEEKTIMEMAX$46 = 
                    new javax.xml.namespace.QName("", "peek_time_max");
                private static final javax.xml.namespace.QName PEEKTIMESUM$48 = 
                    new javax.xml.namespace.QName("", "peek_time_sum");
                private static final javax.xml.namespace.QName PEEKSIZEAVG$50 = 
                    new javax.xml.namespace.QName("", "peek_size_avg");
                private static final javax.xml.namespace.QName PEEKSIZEMIN$52 = 
                    new javax.xml.namespace.QName("", "peek_size_min");
                private static final javax.xml.namespace.QName PEEKSIZEMAX$54 = 
                    new javax.xml.namespace.QName("", "peek_size_max");
                private static final javax.xml.namespace.QName PEEKSIZESUM$56 = 
                    new javax.xml.namespace.QName("", "peek_size_sum");
                private static final javax.xml.namespace.QName QUEUEMANAGER$58 = 
                    new javax.xml.namespace.QName("", "queuemanager");
                private static final javax.xml.namespace.QName ERRORSTATE$60 = 
                    new javax.xml.namespace.QName("", "error_state");
                private static final javax.xml.namespace.QName SENDFAILURERATE$62 = 
                    new javax.xml.namespace.QName("", "send_failure_rate");
                private static final javax.xml.namespace.QName RCVFAILURERATE$64 = 
                    new javax.xml.namespace.QName("", "rcv_failure_rate");
                private static final javax.xml.namespace.QName PEEKFAILURERATE$66 = 
                    new javax.xml.namespace.QName("", "peek_failure_rate");
                
                
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
                 * Gets the "destination" attribute
                 */
                public java.lang.String getDestination()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATION$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "destination" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetDestination()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTINATION$2);
                      return target;
                    }
                }
                
                /**
                 * True if has "destination" attribute
                 */
                public boolean isSetDestination()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(DESTINATION$2) != null;
                    }
                }
                
                /**
                 * Sets the "destination" attribute
                 */
                public void setDestination(java.lang.String destination)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESTINATION$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESTINATION$2);
                      }
                      target.setStringValue(destination);
                    }
                }
                
                /**
                 * Sets (as xml) the "destination" attribute
                 */
                public void xsetDestination(org.apache.xmlbeans.XmlString destination)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESTINATION$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESTINATION$2);
                      }
                      target.set(destination);
                    }
                }
                
                /**
                 * Unsets the "destination" attribute
                 */
                public void unsetDestination()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(DESTINATION$2);
                    }
                }
                
                /**
                 * Gets the "sent_count" attribute
                 */
                public java.math.BigInteger getSentCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTCOUNT$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_count" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetSentCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTCOUNT$4);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_count" attribute
                 */
                public boolean isSetSentCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTCOUNT$4) != null;
                    }
                }
                
                /**
                 * Sets the "sent_count" attribute
                 */
                public void setSentCount(java.math.BigInteger sentCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTCOUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTCOUNT$4);
                      }
                      target.setBigIntegerValue(sentCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_count" attribute
                 */
                public void xsetSentCount(org.apache.xmlbeans.XmlInteger sentCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SENTCOUNT$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SENTCOUNT$4);
                      }
                      target.set(sentCount);
                    }
                }
                
                /**
                 * Unsets the "sent_count" attribute
                 */
                public void unsetSentCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTCOUNT$4);
                    }
                }
                
                /**
                 * Gets the "sent_time_avg" attribute
                 */
                public double getSentTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMEAVG$6);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMEAVG$6);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_time_avg" attribute
                 */
                public boolean isSetSentTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTTIMEAVG$6) != null;
                    }
                }
                
                /**
                 * Sets the "sent_time_avg" attribute
                 */
                public void setSentTimeAvg(double sentTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMEAVG$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTTIMEAVG$6);
                      }
                      target.setDoubleValue(sentTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_time_avg" attribute
                 */
                public void xsetSentTimeAvg(org.apache.xmlbeans.XmlDouble sentTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMEAVG$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTTIMEAVG$6);
                      }
                      target.set(sentTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "sent_time_avg" attribute
                 */
                public void unsetSentTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTTIMEAVG$6);
                    }
                }
                
                /**
                 * Gets the "sent_time_min" attribute
                 */
                public double getSentTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMEMIN$8);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMEMIN$8);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_time_min" attribute
                 */
                public boolean isSetSentTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTTIMEMIN$8) != null;
                    }
                }
                
                /**
                 * Sets the "sent_time_min" attribute
                 */
                public void setSentTimeMin(double sentTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMEMIN$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTTIMEMIN$8);
                      }
                      target.setDoubleValue(sentTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_time_min" attribute
                 */
                public void xsetSentTimeMin(org.apache.xmlbeans.XmlDouble sentTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMEMIN$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTTIMEMIN$8);
                      }
                      target.set(sentTimeMin);
                    }
                }
                
                /**
                 * Unsets the "sent_time_min" attribute
                 */
                public void unsetSentTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTTIMEMIN$8);
                    }
                }
                
                /**
                 * Gets the "sent_time_max" attribute
                 */
                public double getSentTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMEMAX$10);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMEMAX$10);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_time_max" attribute
                 */
                public boolean isSetSentTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTTIMEMAX$10) != null;
                    }
                }
                
                /**
                 * Sets the "sent_time_max" attribute
                 */
                public void setSentTimeMax(double sentTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMEMAX$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTTIMEMAX$10);
                      }
                      target.setDoubleValue(sentTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_time_max" attribute
                 */
                public void xsetSentTimeMax(org.apache.xmlbeans.XmlDouble sentTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMEMAX$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTTIMEMAX$10);
                      }
                      target.set(sentTimeMax);
                    }
                }
                
                /**
                 * Unsets the "sent_time_max" attribute
                 */
                public void unsetSentTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTTIMEMAX$10);
                    }
                }
                
                /**
                 * Gets the "sent_time_sum" attribute
                 */
                public double getSentTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMESUM$12);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMESUM$12);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_time_sum" attribute
                 */
                public boolean isSetSentTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTTIMESUM$12) != null;
                    }
                }
                
                /**
                 * Sets the "sent_time_sum" attribute
                 */
                public void setSentTimeSum(double sentTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTTIMESUM$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTTIMESUM$12);
                      }
                      target.setDoubleValue(sentTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_time_sum" attribute
                 */
                public void xsetSentTimeSum(org.apache.xmlbeans.XmlDouble sentTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTTIMESUM$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTTIMESUM$12);
                      }
                      target.set(sentTimeSum);
                    }
                }
                
                /**
                 * Unsets the "sent_time_sum" attribute
                 */
                public void unsetSentTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTTIMESUM$12);
                    }
                }
                
                /**
                 * Gets the "sent_size_avg" attribute
                 */
                public double getSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEAVG$14);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZEAVG$14);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_avg" attribute
                 */
                public boolean isSetSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZEAVG$14) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_avg" attribute
                 */
                public void setSentSizeAvg(double sentSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZEAVG$14);
                      }
                      target.setDoubleValue(sentSizeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_avg" attribute
                 */
                public void xsetSentSizeAvg(org.apache.xmlbeans.XmlDouble sentSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZEAVG$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTSIZEAVG$14);
                      }
                      target.set(sentSizeAvg);
                    }
                }
                
                /**
                 * Unsets the "sent_size_avg" attribute
                 */
                public void unsetSentSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZEAVG$14);
                    }
                }
                
                /**
                 * Gets the "sent_size_min" attribute
                 */
                public double getSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMIN$16);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZEMIN$16);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_min" attribute
                 */
                public boolean isSetSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZEMIN$16) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_min" attribute
                 */
                public void setSentSizeMin(double sentSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZEMIN$16);
                      }
                      target.setDoubleValue(sentSizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_min" attribute
                 */
                public void xsetSentSizeMin(org.apache.xmlbeans.XmlDouble sentSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZEMIN$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTSIZEMIN$16);
                      }
                      target.set(sentSizeMin);
                    }
                }
                
                /**
                 * Unsets the "sent_size_min" attribute
                 */
                public void unsetSentSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZEMIN$16);
                    }
                }
                
                /**
                 * Gets the "sent_size_max" attribute
                 */
                public double getSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMAX$18);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZEMAX$18);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_max" attribute
                 */
                public boolean isSetSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZEMAX$18) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_max" attribute
                 */
                public void setSentSizeMax(double sentSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZEMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZEMAX$18);
                      }
                      target.setDoubleValue(sentSizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_max" attribute
                 */
                public void xsetSentSizeMax(org.apache.xmlbeans.XmlDouble sentSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZEMAX$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTSIZEMAX$18);
                      }
                      target.set(sentSizeMax);
                    }
                }
                
                /**
                 * Unsets the "sent_size_max" attribute
                 */
                public void unsetSentSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZEMAX$18);
                    }
                }
                
                /**
                 * Gets the "sent_size_sum" attribute
                 */
                public double getSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZESUM$20);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "sent_size_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZESUM$20);
                      return target;
                    }
                }
                
                /**
                 * True if has "sent_size_sum" attribute
                 */
                public boolean isSetSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENTSIZESUM$20) != null;
                    }
                }
                
                /**
                 * Sets the "sent_size_sum" attribute
                 */
                public void setSentSizeSum(double sentSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENTSIZESUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENTSIZESUM$20);
                      }
                      target.setDoubleValue(sentSizeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "sent_size_sum" attribute
                 */
                public void xsetSentSizeSum(org.apache.xmlbeans.XmlDouble sentSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SENTSIZESUM$20);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SENTSIZESUM$20);
                      }
                      target.set(sentSizeSum);
                    }
                }
                
                /**
                 * Unsets the "sent_size_sum" attribute
                 */
                public void unsetSentSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENTSIZESUM$20);
                    }
                }
                
                /**
                 * Gets the "rcvd_count" attribute
                 */
                public java.math.BigInteger getRcvdCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDCOUNT$22);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_count" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetRcvdCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDCOUNT$22);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_count" attribute
                 */
                public boolean isSetRcvdCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDCOUNT$22) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_count" attribute
                 */
                public void setRcvdCount(java.math.BigInteger rcvdCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDCOUNT$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDCOUNT$22);
                      }
                      target.setBigIntegerValue(rcvdCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_count" attribute
                 */
                public void xsetRcvdCount(org.apache.xmlbeans.XmlInteger rcvdCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(RCVDCOUNT$22);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(RCVDCOUNT$22);
                      }
                      target.set(rcvdCount);
                    }
                }
                
                /**
                 * Unsets the "rcvd_count" attribute
                 */
                public void unsetRcvdCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDCOUNT$22);
                    }
                }
                
                /**
                 * Gets the "rcvd_time_avg" attribute
                 */
                public double getRcvdTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMEAVG$24);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMEAVG$24);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_time_avg" attribute
                 */
                public boolean isSetRcvdTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDTIMEAVG$24) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_time_avg" attribute
                 */
                public void setRcvdTimeAvg(double rcvdTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMEAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDTIMEAVG$24);
                      }
                      target.setDoubleValue(rcvdTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_time_avg" attribute
                 */
                public void xsetRcvdTimeAvg(org.apache.xmlbeans.XmlDouble rcvdTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMEAVG$24);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDTIMEAVG$24);
                      }
                      target.set(rcvdTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "rcvd_time_avg" attribute
                 */
                public void unsetRcvdTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDTIMEAVG$24);
                    }
                }
                
                /**
                 * Gets the "rcvd_time_min" attribute
                 */
                public double getRcvdTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMEMIN$26);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMEMIN$26);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_time_min" attribute
                 */
                public boolean isSetRcvdTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDTIMEMIN$26) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_time_min" attribute
                 */
                public void setRcvdTimeMin(double rcvdTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMEMIN$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDTIMEMIN$26);
                      }
                      target.setDoubleValue(rcvdTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_time_min" attribute
                 */
                public void xsetRcvdTimeMin(org.apache.xmlbeans.XmlDouble rcvdTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMEMIN$26);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDTIMEMIN$26);
                      }
                      target.set(rcvdTimeMin);
                    }
                }
                
                /**
                 * Unsets the "rcvd_time_min" attribute
                 */
                public void unsetRcvdTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDTIMEMIN$26);
                    }
                }
                
                /**
                 * Gets the "rcvd_time_max" attribute
                 */
                public double getRcvdTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMEMAX$28);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMEMAX$28);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_time_max" attribute
                 */
                public boolean isSetRcvdTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDTIMEMAX$28) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_time_max" attribute
                 */
                public void setRcvdTimeMax(double rcvdTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMEMAX$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDTIMEMAX$28);
                      }
                      target.setDoubleValue(rcvdTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_time_max" attribute
                 */
                public void xsetRcvdTimeMax(org.apache.xmlbeans.XmlDouble rcvdTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMEMAX$28);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDTIMEMAX$28);
                      }
                      target.set(rcvdTimeMax);
                    }
                }
                
                /**
                 * Unsets the "rcvd_time_max" attribute
                 */
                public void unsetRcvdTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDTIMEMAX$28);
                    }
                }
                
                /**
                 * Gets the "rcvd_time_sum" attribute
                 */
                public double getRcvdTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMESUM$30);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMESUM$30);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_time_sum" attribute
                 */
                public boolean isSetRcvdTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDTIMESUM$30) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_time_sum" attribute
                 */
                public void setRcvdTimeSum(double rcvdTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDTIMESUM$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDTIMESUM$30);
                      }
                      target.setDoubleValue(rcvdTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_time_sum" attribute
                 */
                public void xsetRcvdTimeSum(org.apache.xmlbeans.XmlDouble rcvdTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDTIMESUM$30);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDTIMESUM$30);
                      }
                      target.set(rcvdTimeSum);
                    }
                }
                
                /**
                 * Unsets the "rcvd_time_sum" attribute
                 */
                public void unsetRcvdTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDTIMESUM$30);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_avg" attribute
                 */
                public double getRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEAVG$32);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZEAVG$32);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_avg" attribute
                 */
                public boolean isSetRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZEAVG$32) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_avg" attribute
                 */
                public void setRcvdSizeAvg(double rcvdSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEAVG$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZEAVG$32);
                      }
                      target.setDoubleValue(rcvdSizeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_avg" attribute
                 */
                public void xsetRcvdSizeAvg(org.apache.xmlbeans.XmlDouble rcvdSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZEAVG$32);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDSIZEAVG$32);
                      }
                      target.set(rcvdSizeAvg);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_avg" attribute
                 */
                public void unsetRcvdSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZEAVG$32);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_min" attribute
                 */
                public double getRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMIN$34);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZEMIN$34);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_min" attribute
                 */
                public boolean isSetRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZEMIN$34) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_min" attribute
                 */
                public void setRcvdSizeMin(double rcvdSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMIN$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZEMIN$34);
                      }
                      target.setDoubleValue(rcvdSizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_min" attribute
                 */
                public void xsetRcvdSizeMin(org.apache.xmlbeans.XmlDouble rcvdSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZEMIN$34);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDSIZEMIN$34);
                      }
                      target.set(rcvdSizeMin);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_min" attribute
                 */
                public void unsetRcvdSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZEMIN$34);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_max" attribute
                 */
                public double getRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMAX$36);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZEMAX$36);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_max" attribute
                 */
                public boolean isSetRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZEMAX$36) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_max" attribute
                 */
                public void setRcvdSizeMax(double rcvdSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZEMAX$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZEMAX$36);
                      }
                      target.setDoubleValue(rcvdSizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_max" attribute
                 */
                public void xsetRcvdSizeMax(org.apache.xmlbeans.XmlDouble rcvdSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZEMAX$36);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDSIZEMAX$36);
                      }
                      target.set(rcvdSizeMax);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_max" attribute
                 */
                public void unsetRcvdSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZEMAX$36);
                    }
                }
                
                /**
                 * Gets the "rcvd_size_sum" attribute
                 */
                public double getRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZESUM$38);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcvd_size_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZESUM$38);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcvd_size_sum" attribute
                 */
                public boolean isSetRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVDSIZESUM$38) != null;
                    }
                }
                
                /**
                 * Sets the "rcvd_size_sum" attribute
                 */
                public void setRcvdSizeSum(double rcvdSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVDSIZESUM$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVDSIZESUM$38);
                      }
                      target.setDoubleValue(rcvdSizeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcvd_size_sum" attribute
                 */
                public void xsetRcvdSizeSum(org.apache.xmlbeans.XmlDouble rcvdSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RCVDSIZESUM$38);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RCVDSIZESUM$38);
                      }
                      target.set(rcvdSizeSum);
                    }
                }
                
                /**
                 * Unsets the "rcvd_size_sum" attribute
                 */
                public void unsetRcvdSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVDSIZESUM$38);
                    }
                }
                
                /**
                 * Gets the "peek_count" attribute
                 */
                public java.math.BigInteger getPeekCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKCOUNT$40);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_count" attribute
                 */
                public org.apache.xmlbeans.XmlInteger xgetPeekCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PEEKCOUNT$40);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_count" attribute
                 */
                public boolean isSetPeekCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKCOUNT$40) != null;
                    }
                }
                
                /**
                 * Sets the "peek_count" attribute
                 */
                public void setPeekCount(java.math.BigInteger peekCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKCOUNT$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKCOUNT$40);
                      }
                      target.setBigIntegerValue(peekCount);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_count" attribute
                 */
                public void xsetPeekCount(org.apache.xmlbeans.XmlInteger peekCount)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PEEKCOUNT$40);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PEEKCOUNT$40);
                      }
                      target.set(peekCount);
                    }
                }
                
                /**
                 * Unsets the "peek_count" attribute
                 */
                public void unsetPeekCount()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKCOUNT$40);
                    }
                }
                
                /**
                 * Gets the "peek_time_avg" attribute
                 */
                public double getPeekTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMEAVG$42);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_time_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMEAVG$42);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_time_avg" attribute
                 */
                public boolean isSetPeekTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKTIMEAVG$42) != null;
                    }
                }
                
                /**
                 * Sets the "peek_time_avg" attribute
                 */
                public void setPeekTimeAvg(double peekTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMEAVG$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKTIMEAVG$42);
                      }
                      target.setDoubleValue(peekTimeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_time_avg" attribute
                 */
                public void xsetPeekTimeAvg(org.apache.xmlbeans.XmlDouble peekTimeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMEAVG$42);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKTIMEAVG$42);
                      }
                      target.set(peekTimeAvg);
                    }
                }
                
                /**
                 * Unsets the "peek_time_avg" attribute
                 */
                public void unsetPeekTimeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKTIMEAVG$42);
                    }
                }
                
                /**
                 * Gets the "peek_time_min" attribute
                 */
                public double getPeekTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMEMIN$44);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_time_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMEMIN$44);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_time_min" attribute
                 */
                public boolean isSetPeekTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKTIMEMIN$44) != null;
                    }
                }
                
                /**
                 * Sets the "peek_time_min" attribute
                 */
                public void setPeekTimeMin(double peekTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMEMIN$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKTIMEMIN$44);
                      }
                      target.setDoubleValue(peekTimeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_time_min" attribute
                 */
                public void xsetPeekTimeMin(org.apache.xmlbeans.XmlDouble peekTimeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMEMIN$44);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKTIMEMIN$44);
                      }
                      target.set(peekTimeMin);
                    }
                }
                
                /**
                 * Unsets the "peek_time_min" attribute
                 */
                public void unsetPeekTimeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKTIMEMIN$44);
                    }
                }
                
                /**
                 * Gets the "peek_time_max" attribute
                 */
                public double getPeekTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMEMAX$46);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_time_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMEMAX$46);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_time_max" attribute
                 */
                public boolean isSetPeekTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKTIMEMAX$46) != null;
                    }
                }
                
                /**
                 * Sets the "peek_time_max" attribute
                 */
                public void setPeekTimeMax(double peekTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMEMAX$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKTIMEMAX$46);
                      }
                      target.setDoubleValue(peekTimeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_time_max" attribute
                 */
                public void xsetPeekTimeMax(org.apache.xmlbeans.XmlDouble peekTimeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMEMAX$46);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKTIMEMAX$46);
                      }
                      target.set(peekTimeMax);
                    }
                }
                
                /**
                 * Unsets the "peek_time_max" attribute
                 */
                public void unsetPeekTimeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKTIMEMAX$46);
                    }
                }
                
                /**
                 * Gets the "peek_time_sum" attribute
                 */
                public double getPeekTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMESUM$48);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_time_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMESUM$48);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_time_sum" attribute
                 */
                public boolean isSetPeekTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKTIMESUM$48) != null;
                    }
                }
                
                /**
                 * Sets the "peek_time_sum" attribute
                 */
                public void setPeekTimeSum(double peekTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKTIMESUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKTIMESUM$48);
                      }
                      target.setDoubleValue(peekTimeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_time_sum" attribute
                 */
                public void xsetPeekTimeSum(org.apache.xmlbeans.XmlDouble peekTimeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKTIMESUM$48);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKTIMESUM$48);
                      }
                      target.set(peekTimeSum);
                    }
                }
                
                /**
                 * Unsets the "peek_time_sum" attribute
                 */
                public void unsetPeekTimeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKTIMESUM$48);
                    }
                }
                
                /**
                 * Gets the "peek_size_avg" attribute
                 */
                public double getPeekSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZEAVG$50);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_size_avg" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZEAVG$50);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_size_avg" attribute
                 */
                public boolean isSetPeekSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKSIZEAVG$50) != null;
                    }
                }
                
                /**
                 * Sets the "peek_size_avg" attribute
                 */
                public void setPeekSizeAvg(double peekSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZEAVG$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKSIZEAVG$50);
                      }
                      target.setDoubleValue(peekSizeAvg);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_size_avg" attribute
                 */
                public void xsetPeekSizeAvg(org.apache.xmlbeans.XmlDouble peekSizeAvg)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZEAVG$50);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKSIZEAVG$50);
                      }
                      target.set(peekSizeAvg);
                    }
                }
                
                /**
                 * Unsets the "peek_size_avg" attribute
                 */
                public void unsetPeekSizeAvg()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKSIZEAVG$50);
                    }
                }
                
                /**
                 * Gets the "peek_size_min" attribute
                 */
                public double getPeekSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZEMIN$52);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_size_min" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZEMIN$52);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_size_min" attribute
                 */
                public boolean isSetPeekSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKSIZEMIN$52) != null;
                    }
                }
                
                /**
                 * Sets the "peek_size_min" attribute
                 */
                public void setPeekSizeMin(double peekSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZEMIN$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKSIZEMIN$52);
                      }
                      target.setDoubleValue(peekSizeMin);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_size_min" attribute
                 */
                public void xsetPeekSizeMin(org.apache.xmlbeans.XmlDouble peekSizeMin)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZEMIN$52);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKSIZEMIN$52);
                      }
                      target.set(peekSizeMin);
                    }
                }
                
                /**
                 * Unsets the "peek_size_min" attribute
                 */
                public void unsetPeekSizeMin()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKSIZEMIN$52);
                    }
                }
                
                /**
                 * Gets the "peek_size_max" attribute
                 */
                public double getPeekSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZEMAX$54);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_size_max" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZEMAX$54);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_size_max" attribute
                 */
                public boolean isSetPeekSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKSIZEMAX$54) != null;
                    }
                }
                
                /**
                 * Sets the "peek_size_max" attribute
                 */
                public void setPeekSizeMax(double peekSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZEMAX$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKSIZEMAX$54);
                      }
                      target.setDoubleValue(peekSizeMax);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_size_max" attribute
                 */
                public void xsetPeekSizeMax(org.apache.xmlbeans.XmlDouble peekSizeMax)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZEMAX$54);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKSIZEMAX$54);
                      }
                      target.set(peekSizeMax);
                    }
                }
                
                /**
                 * Unsets the "peek_size_max" attribute
                 */
                public void unsetPeekSizeMax()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKSIZEMAX$54);
                    }
                }
                
                /**
                 * Gets the "peek_size_sum" attribute
                 */
                public double getPeekSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZESUM$56);
                      if (target == null)
                      {
                        return 0.0;
                      }
                      return target.getDoubleValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_size_sum" attribute
                 */
                public org.apache.xmlbeans.XmlDouble xgetPeekSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZESUM$56);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_size_sum" attribute
                 */
                public boolean isSetPeekSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKSIZESUM$56) != null;
                    }
                }
                
                /**
                 * Sets the "peek_size_sum" attribute
                 */
                public void setPeekSizeSum(double peekSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKSIZESUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKSIZESUM$56);
                      }
                      target.setDoubleValue(peekSizeSum);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_size_sum" attribute
                 */
                public void xsetPeekSizeSum(org.apache.xmlbeans.XmlDouble peekSizeSum)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDouble target = null;
                      target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PEEKSIZESUM$56);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PEEKSIZESUM$56);
                      }
                      target.set(peekSizeSum);
                    }
                }
                
                /**
                 * Unsets the "peek_size_sum" attribute
                 */
                public void unsetPeekSizeSum()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKSIZESUM$56);
                    }
                }
                
                /**
                 * Gets the "queuemanager" attribute
                 */
                public java.lang.String getQueuemanager()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUEUEMANAGER$58);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "queuemanager" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetQueuemanager()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUEUEMANAGER$58);
                      return target;
                    }
                }
                
                /**
                 * True if has "queuemanager" attribute
                 */
                public boolean isSetQueuemanager()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(QUEUEMANAGER$58) != null;
                    }
                }
                
                /**
                 * Sets the "queuemanager" attribute
                 */
                public void setQueuemanager(java.lang.String queuemanager)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUEUEMANAGER$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUEUEMANAGER$58);
                      }
                      target.setStringValue(queuemanager);
                    }
                }
                
                /**
                 * Sets (as xml) the "queuemanager" attribute
                 */
                public void xsetQueuemanager(org.apache.xmlbeans.XmlString queuemanager)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUEUEMANAGER$58);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QUEUEMANAGER$58);
                      }
                      target.set(queuemanager);
                    }
                }
                
                /**
                 * Unsets the "queuemanager" attribute
                 */
                public void unsetQueuemanager()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(QUEUEMANAGER$58);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$60);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$60);
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
                      return get_store().find_attribute_user(ERRORSTATE$60) != null;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORSTATE$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORSTATE$60);
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
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORSTATE$60);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORSTATE$60);
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
                      get_store().remove_attribute(ERRORSTATE$60);
                    }
                }
                
                /**
                 * Gets the "send_failure_rate" attribute
                 */
                public java.lang.String getSendFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDFAILURERATE$62);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "send_failure_rate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetSendFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SENDFAILURERATE$62);
                      return target;
                    }
                }
                
                /**
                 * True if has "send_failure_rate" attribute
                 */
                public boolean isSetSendFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(SENDFAILURERATE$62) != null;
                    }
                }
                
                /**
                 * Sets the "send_failure_rate" attribute
                 */
                public void setSendFailureRate(java.lang.String sendFailureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDFAILURERATE$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENDFAILURERATE$62);
                      }
                      target.setStringValue(sendFailureRate);
                    }
                }
                
                /**
                 * Sets (as xml) the "send_failure_rate" attribute
                 */
                public void xsetSendFailureRate(org.apache.xmlbeans.XmlString sendFailureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SENDFAILURERATE$62);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SENDFAILURERATE$62);
                      }
                      target.set(sendFailureRate);
                    }
                }
                
                /**
                 * Unsets the "send_failure_rate" attribute
                 */
                public void unsetSendFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(SENDFAILURERATE$62);
                    }
                }
                
                /**
                 * Gets the "rcv_failure_rate" attribute
                 */
                public java.lang.String getRcvFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVFAILURERATE$64);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "rcv_failure_rate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetRcvFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RCVFAILURERATE$64);
                      return target;
                    }
                }
                
                /**
                 * True if has "rcv_failure_rate" attribute
                 */
                public boolean isSetRcvFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(RCVFAILURERATE$64) != null;
                    }
                }
                
                /**
                 * Sets the "rcv_failure_rate" attribute
                 */
                public void setRcvFailureRate(java.lang.String rcvFailureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RCVFAILURERATE$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RCVFAILURERATE$64);
                      }
                      target.setStringValue(rcvFailureRate);
                    }
                }
                
                /**
                 * Sets (as xml) the "rcv_failure_rate" attribute
                 */
                public void xsetRcvFailureRate(org.apache.xmlbeans.XmlString rcvFailureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RCVFAILURERATE$64);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RCVFAILURERATE$64);
                      }
                      target.set(rcvFailureRate);
                    }
                }
                
                /**
                 * Unsets the "rcv_failure_rate" attribute
                 */
                public void unsetRcvFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(RCVFAILURERATE$64);
                    }
                }
                
                /**
                 * Gets the "peek_failure_rate" attribute
                 */
                public java.lang.String getPeekFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKFAILURERATE$66);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "peek_failure_rate" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetPeekFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PEEKFAILURERATE$66);
                      return target;
                    }
                }
                
                /**
                 * True if has "peek_failure_rate" attribute
                 */
                public boolean isSetPeekFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(PEEKFAILURERATE$66) != null;
                    }
                }
                
                /**
                 * Sets the "peek_failure_rate" attribute
                 */
                public void setPeekFailureRate(java.lang.String peekFailureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEEKFAILURERATE$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEEKFAILURERATE$66);
                      }
                      target.setStringValue(peekFailureRate);
                    }
                }
                
                /**
                 * Sets (as xml) the "peek_failure_rate" attribute
                 */
                public void xsetPeekFailureRate(org.apache.xmlbeans.XmlString peekFailureRate)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PEEKFAILURERATE$66);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PEEKFAILURERATE$66);
                      }
                      target.set(peekFailureRate);
                    }
                }
                
                /**
                 * Unsets the "peek_failure_rate" attribute
                 */
                public void unsetPeekFailureRate()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(PEEKFAILURERATE$66);
                    }
                }
            }
        }
    }
}
