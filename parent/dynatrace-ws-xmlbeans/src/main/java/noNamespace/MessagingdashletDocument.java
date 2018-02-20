/*
 * An XML document type.
 * Localname: messagingdashlet
 * Namespace: 
 * Java type: noNamespace.MessagingdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one messagingdashlet(@) element.
 *
 * This is a complex type.
 */
public interface MessagingdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessagingdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("messagingdashlet443edoctype");
    
    /**
     * Gets the "messagingdashlet" element
     */
    noNamespace.MessagingdashletDocument.Messagingdashlet getMessagingdashlet();
    
    /**
     * Sets the "messagingdashlet" element
     */
    void setMessagingdashlet(noNamespace.MessagingdashletDocument.Messagingdashlet messagingdashlet);
    
    /**
     * Appends and returns a new empty "messagingdashlet" element
     */
    noNamespace.MessagingdashletDocument.Messagingdashlet addNewMessagingdashlet();
    
    /**
     * An XML messagingdashlet(@).
     *
     * This is a complex type.
     */
    public interface Messagingdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Messagingdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("messagingdashletd04delemtype");
        
        /**
         * Gets the "source" element
         */
        noNamespace.SourceType getSource();
        
        /**
         * True if has "source" element
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(noNamespace.SourceType source);
        
        /**
         * Appends and returns a new empty "source" element
         */
        noNamespace.SourceType addNewSource();
        
        /**
         * Unsets the "source" element
         */
        void unsetSource();
        
        /**
         * Gets the "comparesource" element
         */
        noNamespace.SourceType getComparesource();
        
        /**
         * True if has "comparesource" element
         */
        boolean isSetComparesource();
        
        /**
         * Sets the "comparesource" element
         */
        void setComparesource(noNamespace.SourceType comparesource);
        
        /**
         * Appends and returns a new empty "comparesource" element
         */
        noNamespace.SourceType addNewComparesource();
        
        /**
         * Unsets the "comparesource" element
         */
        void unsetComparesource();
        
        /**
         * Gets the "messages" element
         */
        noNamespace.MessagingdashletDocument.Messagingdashlet.Messages getMessages();
        
        /**
         * True if has "messages" element
         */
        boolean isSetMessages();
        
        /**
         * Sets the "messages" element
         */
        void setMessages(noNamespace.MessagingdashletDocument.Messagingdashlet.Messages messages);
        
        /**
         * Appends and returns a new empty "messages" element
         */
        noNamespace.MessagingdashletDocument.Messagingdashlet.Messages addNewMessages();
        
        /**
         * Unsets the "messages" element
         */
        void unsetMessages();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "displaysource" attribute
         */
        java.lang.String getDisplaysource();
        
        /**
         * Gets (as xml) the "displaysource" attribute
         */
        org.apache.xmlbeans.XmlString xgetDisplaysource();
        
        /**
         * Sets the "displaysource" attribute
         */
        void setDisplaysource(java.lang.String displaysource);
        
        /**
         * Sets (as xml) the "displaysource" attribute
         */
        void xsetDisplaysource(org.apache.xmlbeans.XmlString displaysource);
        
        /**
         * An XML messages(@).
         *
         * This is a complex type.
         */
        public interface Messages extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Messages.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("messages3225elemtype");
            
            /**
             * Gets array of all "message" elements
             */
            noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message[] getMessageArray();
            
            /**
             * Gets ith "message" element
             */
            noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message getMessageArray(int i);
            
            /**
             * Returns number of "message" element
             */
            int sizeOfMessageArray();
            
            /**
             * Sets array of all "message" element
             */
            void setMessageArray(noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message[] messageArray);
            
            /**
             * Sets ith "message" element
             */
            void setMessageArray(int i, noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message message);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "message" element
             */
            noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message insertNewMessage(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "message" element
             */
            noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message addNewMessage();
            
            /**
             * Removes the ith "message" element
             */
            void removeMessage(int i);
            
            /**
             * Gets the "structuretype" attribute
             */
            java.lang.String getStructuretype();
            
            /**
             * Gets (as xml) the "structuretype" attribute
             */
            org.apache.xmlbeans.XmlString xgetStructuretype();
            
            /**
             * Sets the "structuretype" attribute
             */
            void setStructuretype(java.lang.String structuretype);
            
            /**
             * Sets (as xml) the "structuretype" attribute
             */
            void xsetStructuretype(org.apache.xmlbeans.XmlString structuretype);
            
            /**
             * An XML message(@).
             *
             * This is a complex type.
             */
            public interface Message extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Message.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("message2802elemtype");
                
                /**
                 * Gets the "platform" attribute
                 */
                java.lang.String getPlatform();
                
                /**
                 * Gets (as xml) the "platform" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPlatform();
                
                /**
                 * True if has "platform" attribute
                 */
                boolean isSetPlatform();
                
                /**
                 * Sets the "platform" attribute
                 */
                void setPlatform(java.lang.String platform);
                
                /**
                 * Sets (as xml) the "platform" attribute
                 */
                void xsetPlatform(org.apache.xmlbeans.XmlString platform);
                
                /**
                 * Unsets the "platform" attribute
                 */
                void unsetPlatform();
                
                /**
                 * Gets the "destination" attribute
                 */
                java.lang.String getDestination();
                
                /**
                 * Gets (as xml) the "destination" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDestination();
                
                /**
                 * True if has "destination" attribute
                 */
                boolean isSetDestination();
                
                /**
                 * Sets the "destination" attribute
                 */
                void setDestination(java.lang.String destination);
                
                /**
                 * Sets (as xml) the "destination" attribute
                 */
                void xsetDestination(org.apache.xmlbeans.XmlString destination);
                
                /**
                 * Unsets the "destination" attribute
                 */
                void unsetDestination();
                
                /**
                 * Gets the "sent_count" attribute
                 */
                java.math.BigInteger getSentCount();
                
                /**
                 * Gets (as xml) the "sent_count" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSentCount();
                
                /**
                 * True if has "sent_count" attribute
                 */
                boolean isSetSentCount();
                
                /**
                 * Sets the "sent_count" attribute
                 */
                void setSentCount(java.math.BigInteger sentCount);
                
                /**
                 * Sets (as xml) the "sent_count" attribute
                 */
                void xsetSentCount(org.apache.xmlbeans.XmlInteger sentCount);
                
                /**
                 * Unsets the "sent_count" attribute
                 */
                void unsetSentCount();
                
                /**
                 * Gets the "sent_time_avg" attribute
                 */
                double getSentTimeAvg();
                
                /**
                 * Gets (as xml) the "sent_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentTimeAvg();
                
                /**
                 * True if has "sent_time_avg" attribute
                 */
                boolean isSetSentTimeAvg();
                
                /**
                 * Sets the "sent_time_avg" attribute
                 */
                void setSentTimeAvg(double sentTimeAvg);
                
                /**
                 * Sets (as xml) the "sent_time_avg" attribute
                 */
                void xsetSentTimeAvg(org.apache.xmlbeans.XmlDouble sentTimeAvg);
                
                /**
                 * Unsets the "sent_time_avg" attribute
                 */
                void unsetSentTimeAvg();
                
                /**
                 * Gets the "sent_time_min" attribute
                 */
                double getSentTimeMin();
                
                /**
                 * Gets (as xml) the "sent_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentTimeMin();
                
                /**
                 * True if has "sent_time_min" attribute
                 */
                boolean isSetSentTimeMin();
                
                /**
                 * Sets the "sent_time_min" attribute
                 */
                void setSentTimeMin(double sentTimeMin);
                
                /**
                 * Sets (as xml) the "sent_time_min" attribute
                 */
                void xsetSentTimeMin(org.apache.xmlbeans.XmlDouble sentTimeMin);
                
                /**
                 * Unsets the "sent_time_min" attribute
                 */
                void unsetSentTimeMin();
                
                /**
                 * Gets the "sent_time_max" attribute
                 */
                double getSentTimeMax();
                
                /**
                 * Gets (as xml) the "sent_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentTimeMax();
                
                /**
                 * True if has "sent_time_max" attribute
                 */
                boolean isSetSentTimeMax();
                
                /**
                 * Sets the "sent_time_max" attribute
                 */
                void setSentTimeMax(double sentTimeMax);
                
                /**
                 * Sets (as xml) the "sent_time_max" attribute
                 */
                void xsetSentTimeMax(org.apache.xmlbeans.XmlDouble sentTimeMax);
                
                /**
                 * Unsets the "sent_time_max" attribute
                 */
                void unsetSentTimeMax();
                
                /**
                 * Gets the "sent_time_sum" attribute
                 */
                double getSentTimeSum();
                
                /**
                 * Gets (as xml) the "sent_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentTimeSum();
                
                /**
                 * True if has "sent_time_sum" attribute
                 */
                boolean isSetSentTimeSum();
                
                /**
                 * Sets the "sent_time_sum" attribute
                 */
                void setSentTimeSum(double sentTimeSum);
                
                /**
                 * Sets (as xml) the "sent_time_sum" attribute
                 */
                void xsetSentTimeSum(org.apache.xmlbeans.XmlDouble sentTimeSum);
                
                /**
                 * Unsets the "sent_time_sum" attribute
                 */
                void unsetSentTimeSum();
                
                /**
                 * Gets the "sent_size_avg" attribute
                 */
                double getSentSizeAvg();
                
                /**
                 * Gets (as xml) the "sent_size_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentSizeAvg();
                
                /**
                 * True if has "sent_size_avg" attribute
                 */
                boolean isSetSentSizeAvg();
                
                /**
                 * Sets the "sent_size_avg" attribute
                 */
                void setSentSizeAvg(double sentSizeAvg);
                
                /**
                 * Sets (as xml) the "sent_size_avg" attribute
                 */
                void xsetSentSizeAvg(org.apache.xmlbeans.XmlDouble sentSizeAvg);
                
                /**
                 * Unsets the "sent_size_avg" attribute
                 */
                void unsetSentSizeAvg();
                
                /**
                 * Gets the "sent_size_min" attribute
                 */
                double getSentSizeMin();
                
                /**
                 * Gets (as xml) the "sent_size_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentSizeMin();
                
                /**
                 * True if has "sent_size_min" attribute
                 */
                boolean isSetSentSizeMin();
                
                /**
                 * Sets the "sent_size_min" attribute
                 */
                void setSentSizeMin(double sentSizeMin);
                
                /**
                 * Sets (as xml) the "sent_size_min" attribute
                 */
                void xsetSentSizeMin(org.apache.xmlbeans.XmlDouble sentSizeMin);
                
                /**
                 * Unsets the "sent_size_min" attribute
                 */
                void unsetSentSizeMin();
                
                /**
                 * Gets the "sent_size_max" attribute
                 */
                double getSentSizeMax();
                
                /**
                 * Gets (as xml) the "sent_size_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentSizeMax();
                
                /**
                 * True if has "sent_size_max" attribute
                 */
                boolean isSetSentSizeMax();
                
                /**
                 * Sets the "sent_size_max" attribute
                 */
                void setSentSizeMax(double sentSizeMax);
                
                /**
                 * Sets (as xml) the "sent_size_max" attribute
                 */
                void xsetSentSizeMax(org.apache.xmlbeans.XmlDouble sentSizeMax);
                
                /**
                 * Unsets the "sent_size_max" attribute
                 */
                void unsetSentSizeMax();
                
                /**
                 * Gets the "sent_size_sum" attribute
                 */
                double getSentSizeSum();
                
                /**
                 * Gets (as xml) the "sent_size_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSentSizeSum();
                
                /**
                 * True if has "sent_size_sum" attribute
                 */
                boolean isSetSentSizeSum();
                
                /**
                 * Sets the "sent_size_sum" attribute
                 */
                void setSentSizeSum(double sentSizeSum);
                
                /**
                 * Sets (as xml) the "sent_size_sum" attribute
                 */
                void xsetSentSizeSum(org.apache.xmlbeans.XmlDouble sentSizeSum);
                
                /**
                 * Unsets the "sent_size_sum" attribute
                 */
                void unsetSentSizeSum();
                
                /**
                 * Gets the "rcvd_count" attribute
                 */
                java.math.BigInteger getRcvdCount();
                
                /**
                 * Gets (as xml) the "rcvd_count" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRcvdCount();
                
                /**
                 * True if has "rcvd_count" attribute
                 */
                boolean isSetRcvdCount();
                
                /**
                 * Sets the "rcvd_count" attribute
                 */
                void setRcvdCount(java.math.BigInteger rcvdCount);
                
                /**
                 * Sets (as xml) the "rcvd_count" attribute
                 */
                void xsetRcvdCount(org.apache.xmlbeans.XmlInteger rcvdCount);
                
                /**
                 * Unsets the "rcvd_count" attribute
                 */
                void unsetRcvdCount();
                
                /**
                 * Gets the "rcvd_time_avg" attribute
                 */
                double getRcvdTimeAvg();
                
                /**
                 * Gets (as xml) the "rcvd_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdTimeAvg();
                
                /**
                 * True if has "rcvd_time_avg" attribute
                 */
                boolean isSetRcvdTimeAvg();
                
                /**
                 * Sets the "rcvd_time_avg" attribute
                 */
                void setRcvdTimeAvg(double rcvdTimeAvg);
                
                /**
                 * Sets (as xml) the "rcvd_time_avg" attribute
                 */
                void xsetRcvdTimeAvg(org.apache.xmlbeans.XmlDouble rcvdTimeAvg);
                
                /**
                 * Unsets the "rcvd_time_avg" attribute
                 */
                void unsetRcvdTimeAvg();
                
                /**
                 * Gets the "rcvd_time_min" attribute
                 */
                double getRcvdTimeMin();
                
                /**
                 * Gets (as xml) the "rcvd_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdTimeMin();
                
                /**
                 * True if has "rcvd_time_min" attribute
                 */
                boolean isSetRcvdTimeMin();
                
                /**
                 * Sets the "rcvd_time_min" attribute
                 */
                void setRcvdTimeMin(double rcvdTimeMin);
                
                /**
                 * Sets (as xml) the "rcvd_time_min" attribute
                 */
                void xsetRcvdTimeMin(org.apache.xmlbeans.XmlDouble rcvdTimeMin);
                
                /**
                 * Unsets the "rcvd_time_min" attribute
                 */
                void unsetRcvdTimeMin();
                
                /**
                 * Gets the "rcvd_time_max" attribute
                 */
                double getRcvdTimeMax();
                
                /**
                 * Gets (as xml) the "rcvd_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdTimeMax();
                
                /**
                 * True if has "rcvd_time_max" attribute
                 */
                boolean isSetRcvdTimeMax();
                
                /**
                 * Sets the "rcvd_time_max" attribute
                 */
                void setRcvdTimeMax(double rcvdTimeMax);
                
                /**
                 * Sets (as xml) the "rcvd_time_max" attribute
                 */
                void xsetRcvdTimeMax(org.apache.xmlbeans.XmlDouble rcvdTimeMax);
                
                /**
                 * Unsets the "rcvd_time_max" attribute
                 */
                void unsetRcvdTimeMax();
                
                /**
                 * Gets the "rcvd_time_sum" attribute
                 */
                double getRcvdTimeSum();
                
                /**
                 * Gets (as xml) the "rcvd_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdTimeSum();
                
                /**
                 * True if has "rcvd_time_sum" attribute
                 */
                boolean isSetRcvdTimeSum();
                
                /**
                 * Sets the "rcvd_time_sum" attribute
                 */
                void setRcvdTimeSum(double rcvdTimeSum);
                
                /**
                 * Sets (as xml) the "rcvd_time_sum" attribute
                 */
                void xsetRcvdTimeSum(org.apache.xmlbeans.XmlDouble rcvdTimeSum);
                
                /**
                 * Unsets the "rcvd_time_sum" attribute
                 */
                void unsetRcvdTimeSum();
                
                /**
                 * Gets the "rcvd_size_avg" attribute
                 */
                double getRcvdSizeAvg();
                
                /**
                 * Gets (as xml) the "rcvd_size_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdSizeAvg();
                
                /**
                 * True if has "rcvd_size_avg" attribute
                 */
                boolean isSetRcvdSizeAvg();
                
                /**
                 * Sets the "rcvd_size_avg" attribute
                 */
                void setRcvdSizeAvg(double rcvdSizeAvg);
                
                /**
                 * Sets (as xml) the "rcvd_size_avg" attribute
                 */
                void xsetRcvdSizeAvg(org.apache.xmlbeans.XmlDouble rcvdSizeAvg);
                
                /**
                 * Unsets the "rcvd_size_avg" attribute
                 */
                void unsetRcvdSizeAvg();
                
                /**
                 * Gets the "rcvd_size_min" attribute
                 */
                double getRcvdSizeMin();
                
                /**
                 * Gets (as xml) the "rcvd_size_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdSizeMin();
                
                /**
                 * True if has "rcvd_size_min" attribute
                 */
                boolean isSetRcvdSizeMin();
                
                /**
                 * Sets the "rcvd_size_min" attribute
                 */
                void setRcvdSizeMin(double rcvdSizeMin);
                
                /**
                 * Sets (as xml) the "rcvd_size_min" attribute
                 */
                void xsetRcvdSizeMin(org.apache.xmlbeans.XmlDouble rcvdSizeMin);
                
                /**
                 * Unsets the "rcvd_size_min" attribute
                 */
                void unsetRcvdSizeMin();
                
                /**
                 * Gets the "rcvd_size_max" attribute
                 */
                double getRcvdSizeMax();
                
                /**
                 * Gets (as xml) the "rcvd_size_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdSizeMax();
                
                /**
                 * True if has "rcvd_size_max" attribute
                 */
                boolean isSetRcvdSizeMax();
                
                /**
                 * Sets the "rcvd_size_max" attribute
                 */
                void setRcvdSizeMax(double rcvdSizeMax);
                
                /**
                 * Sets (as xml) the "rcvd_size_max" attribute
                 */
                void xsetRcvdSizeMax(org.apache.xmlbeans.XmlDouble rcvdSizeMax);
                
                /**
                 * Unsets the "rcvd_size_max" attribute
                 */
                void unsetRcvdSizeMax();
                
                /**
                 * Gets the "rcvd_size_sum" attribute
                 */
                double getRcvdSizeSum();
                
                /**
                 * Gets (as xml) the "rcvd_size_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetRcvdSizeSum();
                
                /**
                 * True if has "rcvd_size_sum" attribute
                 */
                boolean isSetRcvdSizeSum();
                
                /**
                 * Sets the "rcvd_size_sum" attribute
                 */
                void setRcvdSizeSum(double rcvdSizeSum);
                
                /**
                 * Sets (as xml) the "rcvd_size_sum" attribute
                 */
                void xsetRcvdSizeSum(org.apache.xmlbeans.XmlDouble rcvdSizeSum);
                
                /**
                 * Unsets the "rcvd_size_sum" attribute
                 */
                void unsetRcvdSizeSum();
                
                /**
                 * Gets the "peek_count" attribute
                 */
                java.math.BigInteger getPeekCount();
                
                /**
                 * Gets (as xml) the "peek_count" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPeekCount();
                
                /**
                 * True if has "peek_count" attribute
                 */
                boolean isSetPeekCount();
                
                /**
                 * Sets the "peek_count" attribute
                 */
                void setPeekCount(java.math.BigInteger peekCount);
                
                /**
                 * Sets (as xml) the "peek_count" attribute
                 */
                void xsetPeekCount(org.apache.xmlbeans.XmlInteger peekCount);
                
                /**
                 * Unsets the "peek_count" attribute
                 */
                void unsetPeekCount();
                
                /**
                 * Gets the "peek_time_avg" attribute
                 */
                double getPeekTimeAvg();
                
                /**
                 * Gets (as xml) the "peek_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekTimeAvg();
                
                /**
                 * True if has "peek_time_avg" attribute
                 */
                boolean isSetPeekTimeAvg();
                
                /**
                 * Sets the "peek_time_avg" attribute
                 */
                void setPeekTimeAvg(double peekTimeAvg);
                
                /**
                 * Sets (as xml) the "peek_time_avg" attribute
                 */
                void xsetPeekTimeAvg(org.apache.xmlbeans.XmlDouble peekTimeAvg);
                
                /**
                 * Unsets the "peek_time_avg" attribute
                 */
                void unsetPeekTimeAvg();
                
                /**
                 * Gets the "peek_time_min" attribute
                 */
                double getPeekTimeMin();
                
                /**
                 * Gets (as xml) the "peek_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekTimeMin();
                
                /**
                 * True if has "peek_time_min" attribute
                 */
                boolean isSetPeekTimeMin();
                
                /**
                 * Sets the "peek_time_min" attribute
                 */
                void setPeekTimeMin(double peekTimeMin);
                
                /**
                 * Sets (as xml) the "peek_time_min" attribute
                 */
                void xsetPeekTimeMin(org.apache.xmlbeans.XmlDouble peekTimeMin);
                
                /**
                 * Unsets the "peek_time_min" attribute
                 */
                void unsetPeekTimeMin();
                
                /**
                 * Gets the "peek_time_max" attribute
                 */
                double getPeekTimeMax();
                
                /**
                 * Gets (as xml) the "peek_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekTimeMax();
                
                /**
                 * True if has "peek_time_max" attribute
                 */
                boolean isSetPeekTimeMax();
                
                /**
                 * Sets the "peek_time_max" attribute
                 */
                void setPeekTimeMax(double peekTimeMax);
                
                /**
                 * Sets (as xml) the "peek_time_max" attribute
                 */
                void xsetPeekTimeMax(org.apache.xmlbeans.XmlDouble peekTimeMax);
                
                /**
                 * Unsets the "peek_time_max" attribute
                 */
                void unsetPeekTimeMax();
                
                /**
                 * Gets the "peek_time_sum" attribute
                 */
                double getPeekTimeSum();
                
                /**
                 * Gets (as xml) the "peek_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekTimeSum();
                
                /**
                 * True if has "peek_time_sum" attribute
                 */
                boolean isSetPeekTimeSum();
                
                /**
                 * Sets the "peek_time_sum" attribute
                 */
                void setPeekTimeSum(double peekTimeSum);
                
                /**
                 * Sets (as xml) the "peek_time_sum" attribute
                 */
                void xsetPeekTimeSum(org.apache.xmlbeans.XmlDouble peekTimeSum);
                
                /**
                 * Unsets the "peek_time_sum" attribute
                 */
                void unsetPeekTimeSum();
                
                /**
                 * Gets the "peek_size_avg" attribute
                 */
                double getPeekSizeAvg();
                
                /**
                 * Gets (as xml) the "peek_size_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekSizeAvg();
                
                /**
                 * True if has "peek_size_avg" attribute
                 */
                boolean isSetPeekSizeAvg();
                
                /**
                 * Sets the "peek_size_avg" attribute
                 */
                void setPeekSizeAvg(double peekSizeAvg);
                
                /**
                 * Sets (as xml) the "peek_size_avg" attribute
                 */
                void xsetPeekSizeAvg(org.apache.xmlbeans.XmlDouble peekSizeAvg);
                
                /**
                 * Unsets the "peek_size_avg" attribute
                 */
                void unsetPeekSizeAvg();
                
                /**
                 * Gets the "peek_size_min" attribute
                 */
                double getPeekSizeMin();
                
                /**
                 * Gets (as xml) the "peek_size_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekSizeMin();
                
                /**
                 * True if has "peek_size_min" attribute
                 */
                boolean isSetPeekSizeMin();
                
                /**
                 * Sets the "peek_size_min" attribute
                 */
                void setPeekSizeMin(double peekSizeMin);
                
                /**
                 * Sets (as xml) the "peek_size_min" attribute
                 */
                void xsetPeekSizeMin(org.apache.xmlbeans.XmlDouble peekSizeMin);
                
                /**
                 * Unsets the "peek_size_min" attribute
                 */
                void unsetPeekSizeMin();
                
                /**
                 * Gets the "peek_size_max" attribute
                 */
                double getPeekSizeMax();
                
                /**
                 * Gets (as xml) the "peek_size_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekSizeMax();
                
                /**
                 * True if has "peek_size_max" attribute
                 */
                boolean isSetPeekSizeMax();
                
                /**
                 * Sets the "peek_size_max" attribute
                 */
                void setPeekSizeMax(double peekSizeMax);
                
                /**
                 * Sets (as xml) the "peek_size_max" attribute
                 */
                void xsetPeekSizeMax(org.apache.xmlbeans.XmlDouble peekSizeMax);
                
                /**
                 * Unsets the "peek_size_max" attribute
                 */
                void unsetPeekSizeMax();
                
                /**
                 * Gets the "peek_size_sum" attribute
                 */
                double getPeekSizeSum();
                
                /**
                 * Gets (as xml) the "peek_size_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPeekSizeSum();
                
                /**
                 * True if has "peek_size_sum" attribute
                 */
                boolean isSetPeekSizeSum();
                
                /**
                 * Sets the "peek_size_sum" attribute
                 */
                void setPeekSizeSum(double peekSizeSum);
                
                /**
                 * Sets (as xml) the "peek_size_sum" attribute
                 */
                void xsetPeekSizeSum(org.apache.xmlbeans.XmlDouble peekSizeSum);
                
                /**
                 * Unsets the "peek_size_sum" attribute
                 */
                void unsetPeekSizeSum();
                
                /**
                 * Gets the "queuemanager" attribute
                 */
                java.lang.String getQueuemanager();
                
                /**
                 * Gets (as xml) the "queuemanager" attribute
                 */
                org.apache.xmlbeans.XmlString xgetQueuemanager();
                
                /**
                 * True if has "queuemanager" attribute
                 */
                boolean isSetQueuemanager();
                
                /**
                 * Sets the "queuemanager" attribute
                 */
                void setQueuemanager(java.lang.String queuemanager);
                
                /**
                 * Sets (as xml) the "queuemanager" attribute
                 */
                void xsetQueuemanager(org.apache.xmlbeans.XmlString queuemanager);
                
                /**
                 * Unsets the "queuemanager" attribute
                 */
                void unsetQueuemanager();
                
                /**
                 * Gets the "error_state" attribute
                 */
                java.lang.String getErrorState();
                
                /**
                 * Gets (as xml) the "error_state" attribute
                 */
                org.apache.xmlbeans.XmlString xgetErrorState();
                
                /**
                 * True if has "error_state" attribute
                 */
                boolean isSetErrorState();
                
                /**
                 * Sets the "error_state" attribute
                 */
                void setErrorState(java.lang.String errorState);
                
                /**
                 * Sets (as xml) the "error_state" attribute
                 */
                void xsetErrorState(org.apache.xmlbeans.XmlString errorState);
                
                /**
                 * Unsets the "error_state" attribute
                 */
                void unsetErrorState();
                
                /**
                 * Gets the "send_failure_rate" attribute
                 */
                java.lang.String getSendFailureRate();
                
                /**
                 * Gets (as xml) the "send_failure_rate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSendFailureRate();
                
                /**
                 * True if has "send_failure_rate" attribute
                 */
                boolean isSetSendFailureRate();
                
                /**
                 * Sets the "send_failure_rate" attribute
                 */
                void setSendFailureRate(java.lang.String sendFailureRate);
                
                /**
                 * Sets (as xml) the "send_failure_rate" attribute
                 */
                void xsetSendFailureRate(org.apache.xmlbeans.XmlString sendFailureRate);
                
                /**
                 * Unsets the "send_failure_rate" attribute
                 */
                void unsetSendFailureRate();
                
                /**
                 * Gets the "rcv_failure_rate" attribute
                 */
                java.lang.String getRcvFailureRate();
                
                /**
                 * Gets (as xml) the "rcv_failure_rate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRcvFailureRate();
                
                /**
                 * True if has "rcv_failure_rate" attribute
                 */
                boolean isSetRcvFailureRate();
                
                /**
                 * Sets the "rcv_failure_rate" attribute
                 */
                void setRcvFailureRate(java.lang.String rcvFailureRate);
                
                /**
                 * Sets (as xml) the "rcv_failure_rate" attribute
                 */
                void xsetRcvFailureRate(org.apache.xmlbeans.XmlString rcvFailureRate);
                
                /**
                 * Unsets the "rcv_failure_rate" attribute
                 */
                void unsetRcvFailureRate();
                
                /**
                 * Gets the "peek_failure_rate" attribute
                 */
                java.lang.String getPeekFailureRate();
                
                /**
                 * Gets (as xml) the "peek_failure_rate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPeekFailureRate();
                
                /**
                 * True if has "peek_failure_rate" attribute
                 */
                boolean isSetPeekFailureRate();
                
                /**
                 * Sets the "peek_failure_rate" attribute
                 */
                void setPeekFailureRate(java.lang.String peekFailureRate);
                
                /**
                 * Sets (as xml) the "peek_failure_rate" attribute
                 */
                void xsetPeekFailureRate(org.apache.xmlbeans.XmlString peekFailureRate);
                
                /**
                 * Unsets the "peek_failure_rate" attribute
                 */
                void unsetPeekFailureRate();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message newInstance() {
                      return (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.MessagingdashletDocument.Messagingdashlet.Messages newInstance() {
                  return (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.MessagingdashletDocument.Messagingdashlet.Messages newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.MessagingdashletDocument.Messagingdashlet.Messages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.MessagingdashletDocument.Messagingdashlet newInstance() {
              return (noNamespace.MessagingdashletDocument.Messagingdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.MessagingdashletDocument.Messagingdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.MessagingdashletDocument.Messagingdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.MessagingdashletDocument newInstance() {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.MessagingdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.MessagingdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.MessagingdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.MessagingdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.MessagingdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.MessagingdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.MessagingdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.MessagingdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.MessagingdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.MessagingdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.MessagingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
