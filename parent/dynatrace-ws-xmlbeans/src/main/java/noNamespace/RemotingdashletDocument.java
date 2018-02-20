/*
 * An XML document type.
 * Localname: remotingdashlet
 * Namespace: 
 * Java type: noNamespace.RemotingdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one remotingdashlet(@) element.
 *
 * This is a complex type.
 */
public interface RemotingdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemotingdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("remotingdashlet02cddoctype");
    
    /**
     * Gets the "remotingdashlet" element
     */
    noNamespace.RemotingdashletDocument.Remotingdashlet getRemotingdashlet();
    
    /**
     * Sets the "remotingdashlet" element
     */
    void setRemotingdashlet(noNamespace.RemotingdashletDocument.Remotingdashlet remotingdashlet);
    
    /**
     * Appends and returns a new empty "remotingdashlet" element
     */
    noNamespace.RemotingdashletDocument.Remotingdashlet addNewRemotingdashlet();
    
    /**
     * An XML remotingdashlet(@).
     *
     * This is a complex type.
     */
    public interface Remotingdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Remotingdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("remotingdashlet0f2felemtype");
        
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
         * Gets the "remotecalls" element
         */
        noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls getRemotecalls();
        
        /**
         * True if has "remotecalls" element
         */
        boolean isSetRemotecalls();
        
        /**
         * Sets the "remotecalls" element
         */
        void setRemotecalls(noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls remotecalls);
        
        /**
         * Appends and returns a new empty "remotecalls" element
         */
        noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls addNewRemotecalls();
        
        /**
         * Unsets the "remotecalls" element
         */
        void unsetRemotecalls();
        
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
         * An XML remotecalls(@).
         *
         * This is a complex type.
         */
        public interface Remotecalls extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Remotecalls.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("remotecallseb7aelemtype");
            
            /**
             * Gets array of all "remotecall" elements
             */
            noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall[] getRemotecallArray();
            
            /**
             * Gets ith "remotecall" element
             */
            noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall getRemotecallArray(int i);
            
            /**
             * Returns number of "remotecall" element
             */
            int sizeOfRemotecallArray();
            
            /**
             * Sets array of all "remotecall" element
             */
            void setRemotecallArray(noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall[] remotecallArray);
            
            /**
             * Sets ith "remotecall" element
             */
            void setRemotecallArray(int i, noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall remotecall);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "remotecall" element
             */
            noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall insertNewRemotecall(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "remotecall" element
             */
            noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall addNewRemotecall();
            
            /**
             * Removes the ith "remotecall" element
             */
            void removeRemotecall(int i);
            
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
             * An XML remotecall(@).
             *
             * This is a complex type.
             */
            public interface Remotecall extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Remotecall.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("remotecalldfaaelemtype");
                
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
                 * Gets the "protocol" attribute
                 */
                java.lang.String getProtocol();
                
                /**
                 * Gets (as xml) the "protocol" attribute
                 */
                org.apache.xmlbeans.XmlString xgetProtocol();
                
                /**
                 * True if has "protocol" attribute
                 */
                boolean isSetProtocol();
                
                /**
                 * Sets the "protocol" attribute
                 */
                void setProtocol(java.lang.String protocol);
                
                /**
                 * Sets (as xml) the "protocol" attribute
                 */
                void xsetProtocol(org.apache.xmlbeans.XmlString protocol);
                
                /**
                 * Unsets the "protocol" attribute
                 */
                void unsetProtocol();
                
                /**
                 * Gets the "side" attribute
                 */
                java.lang.String getSide();
                
                /**
                 * Gets (as xml) the "side" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSide();
                
                /**
                 * True if has "side" attribute
                 */
                boolean isSetSide();
                
                /**
                 * Sets the "side" attribute
                 */
                void setSide(java.lang.String side);
                
                /**
                 * Sets (as xml) the "side" attribute
                 */
                void xsetSide(org.apache.xmlbeans.XmlString side);
                
                /**
                 * Unsets the "side" attribute
                 */
                void unsetSide();
                
                /**
                 * Gets the "type" attribute
                 */
                java.lang.String getType();
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                org.apache.xmlbeans.XmlString xgetType();
                
                /**
                 * True if has "type" attribute
                 */
                boolean isSetType();
                
                /**
                 * Sets the "type" attribute
                 */
                void setType(java.lang.String type);
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                void xsetType(org.apache.xmlbeans.XmlString type);
                
                /**
                 * Unsets the "type" attribute
                 */
                void unsetType();
                
                /**
                 * Gets the "methodname" attribute
                 */
                java.lang.String getMethodname();
                
                /**
                 * Gets (as xml) the "methodname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMethodname();
                
                /**
                 * True if has "methodname" attribute
                 */
                boolean isSetMethodname();
                
                /**
                 * Sets the "methodname" attribute
                 */
                void setMethodname(java.lang.String methodname);
                
                /**
                 * Sets (as xml) the "methodname" attribute
                 */
                void xsetMethodname(org.apache.xmlbeans.XmlString methodname);
                
                /**
                 * Unsets the "methodname" attribute
                 */
                void unsetMethodname();
                
                /**
                 * Gets the "classname" attribute
                 */
                java.lang.String getClassname();
                
                /**
                 * Gets (as xml) the "classname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClassname();
                
                /**
                 * True if has "classname" attribute
                 */
                boolean isSetClassname();
                
                /**
                 * Sets the "classname" attribute
                 */
                void setClassname(java.lang.String classname);
                
                /**
                 * Sets (as xml) the "classname" attribute
                 */
                void xsetClassname(org.apache.xmlbeans.XmlString classname);
                
                /**
                 * Unsets the "classname" attribute
                 */
                void unsetClassname();
                
                /**
                 * Gets the "count" attribute
                 */
                java.math.BigInteger getCount();
                
                /**
                 * Gets (as xml) the "count" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetCount();
                
                /**
                 * True if has "count" attribute
                 */
                boolean isSetCount();
                
                /**
                 * Sets the "count" attribute
                 */
                void setCount(java.math.BigInteger count);
                
                /**
                 * Sets (as xml) the "count" attribute
                 */
                void xsetCount(org.apache.xmlbeans.XmlInteger count);
                
                /**
                 * Unsets the "count" attribute
                 */
                void unsetCount();
                
                /**
                 * Gets the "latency_avg" attribute
                 */
                double getLatencyAvg();
                
                /**
                 * Gets (as xml) the "latency_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencyAvg();
                
                /**
                 * True if has "latency_avg" attribute
                 */
                boolean isSetLatencyAvg();
                
                /**
                 * Sets the "latency_avg" attribute
                 */
                void setLatencyAvg(double latencyAvg);
                
                /**
                 * Sets (as xml) the "latency_avg" attribute
                 */
                void xsetLatencyAvg(org.apache.xmlbeans.XmlDouble latencyAvg);
                
                /**
                 * Unsets the "latency_avg" attribute
                 */
                void unsetLatencyAvg();
                
                /**
                 * Gets the "total_time_avg" attribute
                 */
                double getTotalTimeAvg();
                
                /**
                 * Gets (as xml) the "total_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalTimeAvg();
                
                /**
                 * True if has "total_time_avg" attribute
                 */
                boolean isSetTotalTimeAvg();
                
                /**
                 * Sets the "total_time_avg" attribute
                 */
                void setTotalTimeAvg(double totalTimeAvg);
                
                /**
                 * Sets (as xml) the "total_time_avg" attribute
                 */
                void xsetTotalTimeAvg(org.apache.xmlbeans.XmlDouble totalTimeAvg);
                
                /**
                 * Unsets the "total_time_avg" attribute
                 */
                void unsetTotalTimeAvg();
                
                /**
                 * Gets the "exec_time_avg" attribute
                 */
                double getExecTimeAvg();
                
                /**
                 * Gets (as xml) the "exec_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecTimeAvg();
                
                /**
                 * True if has "exec_time_avg" attribute
                 */
                boolean isSetExecTimeAvg();
                
                /**
                 * Sets the "exec_time_avg" attribute
                 */
                void setExecTimeAvg(double execTimeAvg);
                
                /**
                 * Sets (as xml) the "exec_time_avg" attribute
                 */
                void xsetExecTimeAvg(org.apache.xmlbeans.XmlDouble execTimeAvg);
                
                /**
                 * Unsets the "exec_time_avg" attribute
                 */
                void unsetExecTimeAvg();
                
                /**
                 * Gets the "cpu_total_time_avg" attribute
                 */
                double getCpuTotalTimeAvg();
                
                /**
                 * Gets (as xml) the "cpu_total_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeAvg();
                
                /**
                 * True if has "cpu_total_time_avg" attribute
                 */
                boolean isSetCpuTotalTimeAvg();
                
                /**
                 * Sets the "cpu_total_time_avg" attribute
                 */
                void setCpuTotalTimeAvg(double cpuTotalTimeAvg);
                
                /**
                 * Sets (as xml) the "cpu_total_time_avg" attribute
                 */
                void xsetCpuTotalTimeAvg(org.apache.xmlbeans.XmlDouble cpuTotalTimeAvg);
                
                /**
                 * Unsets the "cpu_total_time_avg" attribute
                 */
                void unsetCpuTotalTimeAvg();
                
                /**
                 * Gets the "cpu_exec_time_avg" attribute
                 */
                double getCpuExecTimeAvg();
                
                /**
                 * Gets (as xml) the "cpu_exec_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuExecTimeAvg();
                
                /**
                 * True if has "cpu_exec_time_avg" attribute
                 */
                boolean isSetCpuExecTimeAvg();
                
                /**
                 * Sets the "cpu_exec_time_avg" attribute
                 */
                void setCpuExecTimeAvg(double cpuExecTimeAvg);
                
                /**
                 * Sets (as xml) the "cpu_exec_time_avg" attribute
                 */
                void xsetCpuExecTimeAvg(org.apache.xmlbeans.XmlDouble cpuExecTimeAvg);
                
                /**
                 * Unsets the "cpu_exec_time_avg" attribute
                 */
                void unsetCpuExecTimeAvg();
                
                /**
                 * Gets the "serialization_time_avg" attribute
                 */
                double getSerializationTimeAvg();
                
                /**
                 * Gets (as xml) the "serialization_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSerializationTimeAvg();
                
                /**
                 * True if has "serialization_time_avg" attribute
                 */
                boolean isSetSerializationTimeAvg();
                
                /**
                 * Sets the "serialization_time_avg" attribute
                 */
                void setSerializationTimeAvg(double serializationTimeAvg);
                
                /**
                 * Sets (as xml) the "serialization_time_avg" attribute
                 */
                void xsetSerializationTimeAvg(org.apache.xmlbeans.XmlDouble serializationTimeAvg);
                
                /**
                 * Unsets the "serialization_time_avg" attribute
                 */
                void unsetSerializationTimeAvg();
                
                /**
                 * Gets the "deserialization_time_avg" attribute
                 */
                double getDeserializationTimeAvg();
                
                /**
                 * Gets (as xml) the "deserialization_time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDeserializationTimeAvg();
                
                /**
                 * True if has "deserialization_time_avg" attribute
                 */
                boolean isSetDeserializationTimeAvg();
                
                /**
                 * Sets the "deserialization_time_avg" attribute
                 */
                void setDeserializationTimeAvg(double deserializationTimeAvg);
                
                /**
                 * Sets (as xml) the "deserialization_time_avg" attribute
                 */
                void xsetDeserializationTimeAvg(org.apache.xmlbeans.XmlDouble deserializationTimeAvg);
                
                /**
                 * Unsets the "deserialization_time_avg" attribute
                 */
                void unsetDeserializationTimeAvg();
                
                /**
                 * Gets the "bytes_sent_avg" attribute
                 */
                java.math.BigInteger getBytesSentAvg();
                
                /**
                 * Gets (as xml) the "bytes_sent_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesSentAvg();
                
                /**
                 * True if has "bytes_sent_avg" attribute
                 */
                boolean isSetBytesSentAvg();
                
                /**
                 * Sets the "bytes_sent_avg" attribute
                 */
                void setBytesSentAvg(java.math.BigInteger bytesSentAvg);
                
                /**
                 * Sets (as xml) the "bytes_sent_avg" attribute
                 */
                void xsetBytesSentAvg(org.apache.xmlbeans.XmlInteger bytesSentAvg);
                
                /**
                 * Unsets the "bytes_sent_avg" attribute
                 */
                void unsetBytesSentAvg();
                
                /**
                 * Gets the "bytes_received_avg" attribute
                 */
                java.math.BigInteger getBytesReceivedAvg();
                
                /**
                 * Gets (as xml) the "bytes_received_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesReceivedAvg();
                
                /**
                 * True if has "bytes_received_avg" attribute
                 */
                boolean isSetBytesReceivedAvg();
                
                /**
                 * Sets the "bytes_received_avg" attribute
                 */
                void setBytesReceivedAvg(java.math.BigInteger bytesReceivedAvg);
                
                /**
                 * Sets (as xml) the "bytes_received_avg" attribute
                 */
                void xsetBytesReceivedAvg(org.apache.xmlbeans.XmlInteger bytesReceivedAvg);
                
                /**
                 * Unsets the "bytes_received_avg" attribute
                 */
                void unsetBytesReceivedAvg();
                
                /**
                 * Gets the "objects_sent_avg" attribute
                 */
                java.math.BigInteger getObjectsSentAvg();
                
                /**
                 * Gets (as xml) the "objects_sent_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsSentAvg();
                
                /**
                 * True if has "objects_sent_avg" attribute
                 */
                boolean isSetObjectsSentAvg();
                
                /**
                 * Sets the "objects_sent_avg" attribute
                 */
                void setObjectsSentAvg(java.math.BigInteger objectsSentAvg);
                
                /**
                 * Sets (as xml) the "objects_sent_avg" attribute
                 */
                void xsetObjectsSentAvg(org.apache.xmlbeans.XmlInteger objectsSentAvg);
                
                /**
                 * Unsets the "objects_sent_avg" attribute
                 */
                void unsetObjectsSentAvg();
                
                /**
                 * Gets the "objects_received_avg" attribute
                 */
                java.math.BigInteger getObjectsReceivedAvg();
                
                /**
                 * Gets (as xml) the "objects_received_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsReceivedAvg();
                
                /**
                 * True if has "objects_received_avg" attribute
                 */
                boolean isSetObjectsReceivedAvg();
                
                /**
                 * Sets the "objects_received_avg" attribute
                 */
                void setObjectsReceivedAvg(java.math.BigInteger objectsReceivedAvg);
                
                /**
                 * Sets (as xml) the "objects_received_avg" attribute
                 */
                void xsetObjectsReceivedAvg(org.apache.xmlbeans.XmlInteger objectsReceivedAvg);
                
                /**
                 * Unsets the "objects_received_avg" attribute
                 */
                void unsetObjectsReceivedAvg();
                
                /**
                 * Gets the "serialized_objects_avg" attribute
                 */
                java.math.BigInteger getSerializedObjectsAvg();
                
                /**
                 * Gets (as xml) the "serialized_objects_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSerializedObjectsAvg();
                
                /**
                 * True if has "serialized_objects_avg" attribute
                 */
                boolean isSetSerializedObjectsAvg();
                
                /**
                 * Sets the "serialized_objects_avg" attribute
                 */
                void setSerializedObjectsAvg(java.math.BigInteger serializedObjectsAvg);
                
                /**
                 * Sets (as xml) the "serialized_objects_avg" attribute
                 */
                void xsetSerializedObjectsAvg(org.apache.xmlbeans.XmlInteger serializedObjectsAvg);
                
                /**
                 * Unsets the "serialized_objects_avg" attribute
                 */
                void unsetSerializedObjectsAvg();
                
                /**
                 * Gets the "deserialized_objects_avg" attribute
                 */
                java.math.BigInteger getDeserializedObjectsAvg();
                
                /**
                 * Gets (as xml) the "deserialized_objects_avg" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsAvg();
                
                /**
                 * True if has "deserialized_objects_avg" attribute
                 */
                boolean isSetDeserializedObjectsAvg();
                
                /**
                 * Sets the "deserialized_objects_avg" attribute
                 */
                void setDeserializedObjectsAvg(java.math.BigInteger deserializedObjectsAvg);
                
                /**
                 * Sets (as xml) the "deserialized_objects_avg" attribute
                 */
                void xsetDeserializedObjectsAvg(org.apache.xmlbeans.XmlInteger deserializedObjectsAvg);
                
                /**
                 * Unsets the "deserialized_objects_avg" attribute
                 */
                void unsetDeserializedObjectsAvg();
                
                /**
                 * Gets the "latency_sum" attribute
                 */
                double getLatencySum();
                
                /**
                 * Gets (as xml) the "latency_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencySum();
                
                /**
                 * True if has "latency_sum" attribute
                 */
                boolean isSetLatencySum();
                
                /**
                 * Sets the "latency_sum" attribute
                 */
                void setLatencySum(double latencySum);
                
                /**
                 * Sets (as xml) the "latency_sum" attribute
                 */
                void xsetLatencySum(org.apache.xmlbeans.XmlDouble latencySum);
                
                /**
                 * Unsets the "latency_sum" attribute
                 */
                void unsetLatencySum();
                
                /**
                 * Gets the "total_time_sum" attribute
                 */
                double getTotalTimeSum();
                
                /**
                 * Gets (as xml) the "total_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalTimeSum();
                
                /**
                 * True if has "total_time_sum" attribute
                 */
                boolean isSetTotalTimeSum();
                
                /**
                 * Sets the "total_time_sum" attribute
                 */
                void setTotalTimeSum(double totalTimeSum);
                
                /**
                 * Sets (as xml) the "total_time_sum" attribute
                 */
                void xsetTotalTimeSum(org.apache.xmlbeans.XmlDouble totalTimeSum);
                
                /**
                 * Unsets the "total_time_sum" attribute
                 */
                void unsetTotalTimeSum();
                
                /**
                 * Gets the "exec_time_sum" attribute
                 */
                double getExecTimeSum();
                
                /**
                 * Gets (as xml) the "exec_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecTimeSum();
                
                /**
                 * True if has "exec_time_sum" attribute
                 */
                boolean isSetExecTimeSum();
                
                /**
                 * Sets the "exec_time_sum" attribute
                 */
                void setExecTimeSum(double execTimeSum);
                
                /**
                 * Sets (as xml) the "exec_time_sum" attribute
                 */
                void xsetExecTimeSum(org.apache.xmlbeans.XmlDouble execTimeSum);
                
                /**
                 * Unsets the "exec_time_sum" attribute
                 */
                void unsetExecTimeSum();
                
                /**
                 * Gets the "cpu_total_time_sum" attribute
                 */
                double getCpuTotalTimeSum();
                
                /**
                 * Gets (as xml) the "cpu_total_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeSum();
                
                /**
                 * True if has "cpu_total_time_sum" attribute
                 */
                boolean isSetCpuTotalTimeSum();
                
                /**
                 * Sets the "cpu_total_time_sum" attribute
                 */
                void setCpuTotalTimeSum(double cpuTotalTimeSum);
                
                /**
                 * Sets (as xml) the "cpu_total_time_sum" attribute
                 */
                void xsetCpuTotalTimeSum(org.apache.xmlbeans.XmlDouble cpuTotalTimeSum);
                
                /**
                 * Unsets the "cpu_total_time_sum" attribute
                 */
                void unsetCpuTotalTimeSum();
                
                /**
                 * Gets the "cpu_exec_time_sum" attribute
                 */
                double getCpuExecTimeSum();
                
                /**
                 * Gets (as xml) the "cpu_exec_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuExecTimeSum();
                
                /**
                 * True if has "cpu_exec_time_sum" attribute
                 */
                boolean isSetCpuExecTimeSum();
                
                /**
                 * Sets the "cpu_exec_time_sum" attribute
                 */
                void setCpuExecTimeSum(double cpuExecTimeSum);
                
                /**
                 * Sets (as xml) the "cpu_exec_time_sum" attribute
                 */
                void xsetCpuExecTimeSum(org.apache.xmlbeans.XmlDouble cpuExecTimeSum);
                
                /**
                 * Unsets the "cpu_exec_time_sum" attribute
                 */
                void unsetCpuExecTimeSum();
                
                /**
                 * Gets the "serialization_time_sum" attribute
                 */
                double getSerializationTimeSum();
                
                /**
                 * Gets (as xml) the "serialization_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSerializationTimeSum();
                
                /**
                 * True if has "serialization_time_sum" attribute
                 */
                boolean isSetSerializationTimeSum();
                
                /**
                 * Sets the "serialization_time_sum" attribute
                 */
                void setSerializationTimeSum(double serializationTimeSum);
                
                /**
                 * Sets (as xml) the "serialization_time_sum" attribute
                 */
                void xsetSerializationTimeSum(org.apache.xmlbeans.XmlDouble serializationTimeSum);
                
                /**
                 * Unsets the "serialization_time_sum" attribute
                 */
                void unsetSerializationTimeSum();
                
                /**
                 * Gets the "deserialization_time_sum" attribute
                 */
                double getDeserializationTimeSum();
                
                /**
                 * Gets (as xml) the "deserialization_time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDeserializationTimeSum();
                
                /**
                 * True if has "deserialization_time_sum" attribute
                 */
                boolean isSetDeserializationTimeSum();
                
                /**
                 * Sets the "deserialization_time_sum" attribute
                 */
                void setDeserializationTimeSum(double deserializationTimeSum);
                
                /**
                 * Sets (as xml) the "deserialization_time_sum" attribute
                 */
                void xsetDeserializationTimeSum(org.apache.xmlbeans.XmlDouble deserializationTimeSum);
                
                /**
                 * Unsets the "deserialization_time_sum" attribute
                 */
                void unsetDeserializationTimeSum();
                
                /**
                 * Gets the "bytes_sent_sum" attribute
                 */
                java.math.BigInteger getBytesSentSum();
                
                /**
                 * Gets (as xml) the "bytes_sent_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesSentSum();
                
                /**
                 * True if has "bytes_sent_sum" attribute
                 */
                boolean isSetBytesSentSum();
                
                /**
                 * Sets the "bytes_sent_sum" attribute
                 */
                void setBytesSentSum(java.math.BigInteger bytesSentSum);
                
                /**
                 * Sets (as xml) the "bytes_sent_sum" attribute
                 */
                void xsetBytesSentSum(org.apache.xmlbeans.XmlInteger bytesSentSum);
                
                /**
                 * Unsets the "bytes_sent_sum" attribute
                 */
                void unsetBytesSentSum();
                
                /**
                 * Gets the "bytes_received_sum" attribute
                 */
                java.math.BigInteger getBytesReceivedSum();
                
                /**
                 * Gets (as xml) the "bytes_received_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesReceivedSum();
                
                /**
                 * True if has "bytes_received_sum" attribute
                 */
                boolean isSetBytesReceivedSum();
                
                /**
                 * Sets the "bytes_received_sum" attribute
                 */
                void setBytesReceivedSum(java.math.BigInteger bytesReceivedSum);
                
                /**
                 * Sets (as xml) the "bytes_received_sum" attribute
                 */
                void xsetBytesReceivedSum(org.apache.xmlbeans.XmlInteger bytesReceivedSum);
                
                /**
                 * Unsets the "bytes_received_sum" attribute
                 */
                void unsetBytesReceivedSum();
                
                /**
                 * Gets the "objects_sent_sum" attribute
                 */
                java.math.BigInteger getObjectsSentSum();
                
                /**
                 * Gets (as xml) the "objects_sent_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsSentSum();
                
                /**
                 * True if has "objects_sent_sum" attribute
                 */
                boolean isSetObjectsSentSum();
                
                /**
                 * Sets the "objects_sent_sum" attribute
                 */
                void setObjectsSentSum(java.math.BigInteger objectsSentSum);
                
                /**
                 * Sets (as xml) the "objects_sent_sum" attribute
                 */
                void xsetObjectsSentSum(org.apache.xmlbeans.XmlInteger objectsSentSum);
                
                /**
                 * Unsets the "objects_sent_sum" attribute
                 */
                void unsetObjectsSentSum();
                
                /**
                 * Gets the "objects_received_sum" attribute
                 */
                java.math.BigInteger getObjectsReceivedSum();
                
                /**
                 * Gets (as xml) the "objects_received_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsReceivedSum();
                
                /**
                 * True if has "objects_received_sum" attribute
                 */
                boolean isSetObjectsReceivedSum();
                
                /**
                 * Sets the "objects_received_sum" attribute
                 */
                void setObjectsReceivedSum(java.math.BigInteger objectsReceivedSum);
                
                /**
                 * Sets (as xml) the "objects_received_sum" attribute
                 */
                void xsetObjectsReceivedSum(org.apache.xmlbeans.XmlInteger objectsReceivedSum);
                
                /**
                 * Unsets the "objects_received_sum" attribute
                 */
                void unsetObjectsReceivedSum();
                
                /**
                 * Gets the "serialized_objects_sum" attribute
                 */
                java.math.BigInteger getSerializedObjectsSum();
                
                /**
                 * Gets (as xml) the "serialized_objects_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSerializedObjectsSum();
                
                /**
                 * True if has "serialized_objects_sum" attribute
                 */
                boolean isSetSerializedObjectsSum();
                
                /**
                 * Sets the "serialized_objects_sum" attribute
                 */
                void setSerializedObjectsSum(java.math.BigInteger serializedObjectsSum);
                
                /**
                 * Sets (as xml) the "serialized_objects_sum" attribute
                 */
                void xsetSerializedObjectsSum(org.apache.xmlbeans.XmlInteger serializedObjectsSum);
                
                /**
                 * Unsets the "serialized_objects_sum" attribute
                 */
                void unsetSerializedObjectsSum();
                
                /**
                 * Gets the "deserialized_objects_sum" attribute
                 */
                java.math.BigInteger getDeserializedObjectsSum();
                
                /**
                 * Gets (as xml) the "deserialized_objects_sum" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsSum();
                
                /**
                 * True if has "deserialized_objects_sum" attribute
                 */
                boolean isSetDeserializedObjectsSum();
                
                /**
                 * Sets the "deserialized_objects_sum" attribute
                 */
                void setDeserializedObjectsSum(java.math.BigInteger deserializedObjectsSum);
                
                /**
                 * Sets (as xml) the "deserialized_objects_sum" attribute
                 */
                void xsetDeserializedObjectsSum(org.apache.xmlbeans.XmlInteger deserializedObjectsSum);
                
                /**
                 * Unsets the "deserialized_objects_sum" attribute
                 */
                void unsetDeserializedObjectsSum();
                
                /**
                 * Gets the "latency_min" attribute
                 */
                double getLatencyMin();
                
                /**
                 * Gets (as xml) the "latency_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencyMin();
                
                /**
                 * True if has "latency_min" attribute
                 */
                boolean isSetLatencyMin();
                
                /**
                 * Sets the "latency_min" attribute
                 */
                void setLatencyMin(double latencyMin);
                
                /**
                 * Sets (as xml) the "latency_min" attribute
                 */
                void xsetLatencyMin(org.apache.xmlbeans.XmlDouble latencyMin);
                
                /**
                 * Unsets the "latency_min" attribute
                 */
                void unsetLatencyMin();
                
                /**
                 * Gets the "total_time_min" attribute
                 */
                double getTotalTimeMin();
                
                /**
                 * Gets (as xml) the "total_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalTimeMin();
                
                /**
                 * True if has "total_time_min" attribute
                 */
                boolean isSetTotalTimeMin();
                
                /**
                 * Sets the "total_time_min" attribute
                 */
                void setTotalTimeMin(double totalTimeMin);
                
                /**
                 * Sets (as xml) the "total_time_min" attribute
                 */
                void xsetTotalTimeMin(org.apache.xmlbeans.XmlDouble totalTimeMin);
                
                /**
                 * Unsets the "total_time_min" attribute
                 */
                void unsetTotalTimeMin();
                
                /**
                 * Gets the "exec_time_min" attribute
                 */
                double getExecTimeMin();
                
                /**
                 * Gets (as xml) the "exec_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecTimeMin();
                
                /**
                 * True if has "exec_time_min" attribute
                 */
                boolean isSetExecTimeMin();
                
                /**
                 * Sets the "exec_time_min" attribute
                 */
                void setExecTimeMin(double execTimeMin);
                
                /**
                 * Sets (as xml) the "exec_time_min" attribute
                 */
                void xsetExecTimeMin(org.apache.xmlbeans.XmlDouble execTimeMin);
                
                /**
                 * Unsets the "exec_time_min" attribute
                 */
                void unsetExecTimeMin();
                
                /**
                 * Gets the "cpu_total_time_min" attribute
                 */
                double getCpuTotalTimeMin();
                
                /**
                 * Gets (as xml) the "cpu_total_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeMin();
                
                /**
                 * True if has "cpu_total_time_min" attribute
                 */
                boolean isSetCpuTotalTimeMin();
                
                /**
                 * Sets the "cpu_total_time_min" attribute
                 */
                void setCpuTotalTimeMin(double cpuTotalTimeMin);
                
                /**
                 * Sets (as xml) the "cpu_total_time_min" attribute
                 */
                void xsetCpuTotalTimeMin(org.apache.xmlbeans.XmlDouble cpuTotalTimeMin);
                
                /**
                 * Unsets the "cpu_total_time_min" attribute
                 */
                void unsetCpuTotalTimeMin();
                
                /**
                 * Gets the "cpu_exec_time_min" attribute
                 */
                double getCpuExecTimeMin();
                
                /**
                 * Gets (as xml) the "cpu_exec_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuExecTimeMin();
                
                /**
                 * True if has "cpu_exec_time_min" attribute
                 */
                boolean isSetCpuExecTimeMin();
                
                /**
                 * Sets the "cpu_exec_time_min" attribute
                 */
                void setCpuExecTimeMin(double cpuExecTimeMin);
                
                /**
                 * Sets (as xml) the "cpu_exec_time_min" attribute
                 */
                void xsetCpuExecTimeMin(org.apache.xmlbeans.XmlDouble cpuExecTimeMin);
                
                /**
                 * Unsets the "cpu_exec_time_min" attribute
                 */
                void unsetCpuExecTimeMin();
                
                /**
                 * Gets the "serialization_time_min" attribute
                 */
                double getSerializationTimeMin();
                
                /**
                 * Gets (as xml) the "serialization_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSerializationTimeMin();
                
                /**
                 * True if has "serialization_time_min" attribute
                 */
                boolean isSetSerializationTimeMin();
                
                /**
                 * Sets the "serialization_time_min" attribute
                 */
                void setSerializationTimeMin(double serializationTimeMin);
                
                /**
                 * Sets (as xml) the "serialization_time_min" attribute
                 */
                void xsetSerializationTimeMin(org.apache.xmlbeans.XmlDouble serializationTimeMin);
                
                /**
                 * Unsets the "serialization_time_min" attribute
                 */
                void unsetSerializationTimeMin();
                
                /**
                 * Gets the "deserialization_time_min" attribute
                 */
                double getDeserializationTimeMin();
                
                /**
                 * Gets (as xml) the "deserialization_time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDeserializationTimeMin();
                
                /**
                 * True if has "deserialization_time_min" attribute
                 */
                boolean isSetDeserializationTimeMin();
                
                /**
                 * Sets the "deserialization_time_min" attribute
                 */
                void setDeserializationTimeMin(double deserializationTimeMin);
                
                /**
                 * Sets (as xml) the "deserialization_time_min" attribute
                 */
                void xsetDeserializationTimeMin(org.apache.xmlbeans.XmlDouble deserializationTimeMin);
                
                /**
                 * Unsets the "deserialization_time_min" attribute
                 */
                void unsetDeserializationTimeMin();
                
                /**
                 * Gets the "bytes_sent_min" attribute
                 */
                java.math.BigInteger getBytesSentMin();
                
                /**
                 * Gets (as xml) the "bytes_sent_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesSentMin();
                
                /**
                 * True if has "bytes_sent_min" attribute
                 */
                boolean isSetBytesSentMin();
                
                /**
                 * Sets the "bytes_sent_min" attribute
                 */
                void setBytesSentMin(java.math.BigInteger bytesSentMin);
                
                /**
                 * Sets (as xml) the "bytes_sent_min" attribute
                 */
                void xsetBytesSentMin(org.apache.xmlbeans.XmlInteger bytesSentMin);
                
                /**
                 * Unsets the "bytes_sent_min" attribute
                 */
                void unsetBytesSentMin();
                
                /**
                 * Gets the "bytes_received_min" attribute
                 */
                java.math.BigInteger getBytesReceivedMin();
                
                /**
                 * Gets (as xml) the "bytes_received_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesReceivedMin();
                
                /**
                 * True if has "bytes_received_min" attribute
                 */
                boolean isSetBytesReceivedMin();
                
                /**
                 * Sets the "bytes_received_min" attribute
                 */
                void setBytesReceivedMin(java.math.BigInteger bytesReceivedMin);
                
                /**
                 * Sets (as xml) the "bytes_received_min" attribute
                 */
                void xsetBytesReceivedMin(org.apache.xmlbeans.XmlInteger bytesReceivedMin);
                
                /**
                 * Unsets the "bytes_received_min" attribute
                 */
                void unsetBytesReceivedMin();
                
                /**
                 * Gets the "objects_sent_min" attribute
                 */
                java.math.BigInteger getObjectsSentMin();
                
                /**
                 * Gets (as xml) the "objects_sent_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsSentMin();
                
                /**
                 * True if has "objects_sent_min" attribute
                 */
                boolean isSetObjectsSentMin();
                
                /**
                 * Sets the "objects_sent_min" attribute
                 */
                void setObjectsSentMin(java.math.BigInteger objectsSentMin);
                
                /**
                 * Sets (as xml) the "objects_sent_min" attribute
                 */
                void xsetObjectsSentMin(org.apache.xmlbeans.XmlInteger objectsSentMin);
                
                /**
                 * Unsets the "objects_sent_min" attribute
                 */
                void unsetObjectsSentMin();
                
                /**
                 * Gets the "objects_received_min" attribute
                 */
                java.math.BigInteger getObjectsReceivedMin();
                
                /**
                 * Gets (as xml) the "objects_received_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsReceivedMin();
                
                /**
                 * True if has "objects_received_min" attribute
                 */
                boolean isSetObjectsReceivedMin();
                
                /**
                 * Sets the "objects_received_min" attribute
                 */
                void setObjectsReceivedMin(java.math.BigInteger objectsReceivedMin);
                
                /**
                 * Sets (as xml) the "objects_received_min" attribute
                 */
                void xsetObjectsReceivedMin(org.apache.xmlbeans.XmlInteger objectsReceivedMin);
                
                /**
                 * Unsets the "objects_received_min" attribute
                 */
                void unsetObjectsReceivedMin();
                
                /**
                 * Gets the "serialized_objects_min" attribute
                 */
                java.math.BigInteger getSerializedObjectsMin();
                
                /**
                 * Gets (as xml) the "serialized_objects_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSerializedObjectsMin();
                
                /**
                 * True if has "serialized_objects_min" attribute
                 */
                boolean isSetSerializedObjectsMin();
                
                /**
                 * Sets the "serialized_objects_min" attribute
                 */
                void setSerializedObjectsMin(java.math.BigInteger serializedObjectsMin);
                
                /**
                 * Sets (as xml) the "serialized_objects_min" attribute
                 */
                void xsetSerializedObjectsMin(org.apache.xmlbeans.XmlInteger serializedObjectsMin);
                
                /**
                 * Unsets the "serialized_objects_min" attribute
                 */
                void unsetSerializedObjectsMin();
                
                /**
                 * Gets the "deserialized_objects_min" attribute
                 */
                java.math.BigInteger getDeserializedObjectsMin();
                
                /**
                 * Gets (as xml) the "deserialized_objects_min" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsMin();
                
                /**
                 * True if has "deserialized_objects_min" attribute
                 */
                boolean isSetDeserializedObjectsMin();
                
                /**
                 * Sets the "deserialized_objects_min" attribute
                 */
                void setDeserializedObjectsMin(java.math.BigInteger deserializedObjectsMin);
                
                /**
                 * Sets (as xml) the "deserialized_objects_min" attribute
                 */
                void xsetDeserializedObjectsMin(org.apache.xmlbeans.XmlInteger deserializedObjectsMin);
                
                /**
                 * Unsets the "deserialized_objects_min" attribute
                 */
                void unsetDeserializedObjectsMin();
                
                /**
                 * Gets the "latency_max" attribute
                 */
                double getLatencyMax();
                
                /**
                 * Gets (as xml) the "latency_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetLatencyMax();
                
                /**
                 * True if has "latency_max" attribute
                 */
                boolean isSetLatencyMax();
                
                /**
                 * Sets the "latency_max" attribute
                 */
                void setLatencyMax(double latencyMax);
                
                /**
                 * Sets (as xml) the "latency_max" attribute
                 */
                void xsetLatencyMax(org.apache.xmlbeans.XmlDouble latencyMax);
                
                /**
                 * Unsets the "latency_max" attribute
                 */
                void unsetLatencyMax();
                
                /**
                 * Gets the "total_time_max" attribute
                 */
                double getTotalTimeMax();
                
                /**
                 * Gets (as xml) the "total_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalTimeMax();
                
                /**
                 * True if has "total_time_max" attribute
                 */
                boolean isSetTotalTimeMax();
                
                /**
                 * Sets the "total_time_max" attribute
                 */
                void setTotalTimeMax(double totalTimeMax);
                
                /**
                 * Sets (as xml) the "total_time_max" attribute
                 */
                void xsetTotalTimeMax(org.apache.xmlbeans.XmlDouble totalTimeMax);
                
                /**
                 * Unsets the "total_time_max" attribute
                 */
                void unsetTotalTimeMax();
                
                /**
                 * Gets the "exec_time_max" attribute
                 */
                double getExecTimeMax();
                
                /**
                 * Gets (as xml) the "exec_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecTimeMax();
                
                /**
                 * True if has "exec_time_max" attribute
                 */
                boolean isSetExecTimeMax();
                
                /**
                 * Sets the "exec_time_max" attribute
                 */
                void setExecTimeMax(double execTimeMax);
                
                /**
                 * Sets (as xml) the "exec_time_max" attribute
                 */
                void xsetExecTimeMax(org.apache.xmlbeans.XmlDouble execTimeMax);
                
                /**
                 * Unsets the "exec_time_max" attribute
                 */
                void unsetExecTimeMax();
                
                /**
                 * Gets the "cpu_total_time_max" attribute
                 */
                double getCpuTotalTimeMax();
                
                /**
                 * Gets (as xml) the "cpu_total_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuTotalTimeMax();
                
                /**
                 * True if has "cpu_total_time_max" attribute
                 */
                boolean isSetCpuTotalTimeMax();
                
                /**
                 * Sets the "cpu_total_time_max" attribute
                 */
                void setCpuTotalTimeMax(double cpuTotalTimeMax);
                
                /**
                 * Sets (as xml) the "cpu_total_time_max" attribute
                 */
                void xsetCpuTotalTimeMax(org.apache.xmlbeans.XmlDouble cpuTotalTimeMax);
                
                /**
                 * Unsets the "cpu_total_time_max" attribute
                 */
                void unsetCpuTotalTimeMax();
                
                /**
                 * Gets the "cpu_exec_time_max" attribute
                 */
                double getCpuExecTimeMax();
                
                /**
                 * Gets (as xml) the "cpu_exec_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuExecTimeMax();
                
                /**
                 * True if has "cpu_exec_time_max" attribute
                 */
                boolean isSetCpuExecTimeMax();
                
                /**
                 * Sets the "cpu_exec_time_max" attribute
                 */
                void setCpuExecTimeMax(double cpuExecTimeMax);
                
                /**
                 * Sets (as xml) the "cpu_exec_time_max" attribute
                 */
                void xsetCpuExecTimeMax(org.apache.xmlbeans.XmlDouble cpuExecTimeMax);
                
                /**
                 * Unsets the "cpu_exec_time_max" attribute
                 */
                void unsetCpuExecTimeMax();
                
                /**
                 * Gets the "serialization_time_max" attribute
                 */
                double getSerializationTimeMax();
                
                /**
                 * Gets (as xml) the "serialization_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSerializationTimeMax();
                
                /**
                 * True if has "serialization_time_max" attribute
                 */
                boolean isSetSerializationTimeMax();
                
                /**
                 * Sets the "serialization_time_max" attribute
                 */
                void setSerializationTimeMax(double serializationTimeMax);
                
                /**
                 * Sets (as xml) the "serialization_time_max" attribute
                 */
                void xsetSerializationTimeMax(org.apache.xmlbeans.XmlDouble serializationTimeMax);
                
                /**
                 * Unsets the "serialization_time_max" attribute
                 */
                void unsetSerializationTimeMax();
                
                /**
                 * Gets the "deserialization_time_max" attribute
                 */
                double getDeserializationTimeMax();
                
                /**
                 * Gets (as xml) the "deserialization_time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetDeserializationTimeMax();
                
                /**
                 * True if has "deserialization_time_max" attribute
                 */
                boolean isSetDeserializationTimeMax();
                
                /**
                 * Sets the "deserialization_time_max" attribute
                 */
                void setDeserializationTimeMax(double deserializationTimeMax);
                
                /**
                 * Sets (as xml) the "deserialization_time_max" attribute
                 */
                void xsetDeserializationTimeMax(org.apache.xmlbeans.XmlDouble deserializationTimeMax);
                
                /**
                 * Unsets the "deserialization_time_max" attribute
                 */
                void unsetDeserializationTimeMax();
                
                /**
                 * Gets the "bytes_sent_max" attribute
                 */
                java.math.BigInteger getBytesSentMax();
                
                /**
                 * Gets (as xml) the "bytes_sent_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesSentMax();
                
                /**
                 * True if has "bytes_sent_max" attribute
                 */
                boolean isSetBytesSentMax();
                
                /**
                 * Sets the "bytes_sent_max" attribute
                 */
                void setBytesSentMax(java.math.BigInteger bytesSentMax);
                
                /**
                 * Sets (as xml) the "bytes_sent_max" attribute
                 */
                void xsetBytesSentMax(org.apache.xmlbeans.XmlInteger bytesSentMax);
                
                /**
                 * Unsets the "bytes_sent_max" attribute
                 */
                void unsetBytesSentMax();
                
                /**
                 * Gets the "bytes_received_max" attribute
                 */
                java.math.BigInteger getBytesReceivedMax();
                
                /**
                 * Gets (as xml) the "bytes_received_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesReceivedMax();
                
                /**
                 * True if has "bytes_received_max" attribute
                 */
                boolean isSetBytesReceivedMax();
                
                /**
                 * Sets the "bytes_received_max" attribute
                 */
                void setBytesReceivedMax(java.math.BigInteger bytesReceivedMax);
                
                /**
                 * Sets (as xml) the "bytes_received_max" attribute
                 */
                void xsetBytesReceivedMax(org.apache.xmlbeans.XmlInteger bytesReceivedMax);
                
                /**
                 * Unsets the "bytes_received_max" attribute
                 */
                void unsetBytesReceivedMax();
                
                /**
                 * Gets the "objects_sent_max" attribute
                 */
                java.math.BigInteger getObjectsSentMax();
                
                /**
                 * Gets (as xml) the "objects_sent_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsSentMax();
                
                /**
                 * True if has "objects_sent_max" attribute
                 */
                boolean isSetObjectsSentMax();
                
                /**
                 * Sets the "objects_sent_max" attribute
                 */
                void setObjectsSentMax(java.math.BigInteger objectsSentMax);
                
                /**
                 * Sets (as xml) the "objects_sent_max" attribute
                 */
                void xsetObjectsSentMax(org.apache.xmlbeans.XmlInteger objectsSentMax);
                
                /**
                 * Unsets the "objects_sent_max" attribute
                 */
                void unsetObjectsSentMax();
                
                /**
                 * Gets the "objects_received_max" attribute
                 */
                java.math.BigInteger getObjectsReceivedMax();
                
                /**
                 * Gets (as xml) the "objects_received_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetObjectsReceivedMax();
                
                /**
                 * True if has "objects_received_max" attribute
                 */
                boolean isSetObjectsReceivedMax();
                
                /**
                 * Sets the "objects_received_max" attribute
                 */
                void setObjectsReceivedMax(java.math.BigInteger objectsReceivedMax);
                
                /**
                 * Sets (as xml) the "objects_received_max" attribute
                 */
                void xsetObjectsReceivedMax(org.apache.xmlbeans.XmlInteger objectsReceivedMax);
                
                /**
                 * Unsets the "objects_received_max" attribute
                 */
                void unsetObjectsReceivedMax();
                
                /**
                 * Gets the "serialized_objects_max" attribute
                 */
                java.math.BigInteger getSerializedObjectsMax();
                
                /**
                 * Gets (as xml) the "serialized_objects_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSerializedObjectsMax();
                
                /**
                 * True if has "serialized_objects_max" attribute
                 */
                boolean isSetSerializedObjectsMax();
                
                /**
                 * Sets the "serialized_objects_max" attribute
                 */
                void setSerializedObjectsMax(java.math.BigInteger serializedObjectsMax);
                
                /**
                 * Sets (as xml) the "serialized_objects_max" attribute
                 */
                void xsetSerializedObjectsMax(org.apache.xmlbeans.XmlInteger serializedObjectsMax);
                
                /**
                 * Unsets the "serialized_objects_max" attribute
                 */
                void unsetSerializedObjectsMax();
                
                /**
                 * Gets the "deserialized_objects_max" attribute
                 */
                java.math.BigInteger getDeserializedObjectsMax();
                
                /**
                 * Gets (as xml) the "deserialized_objects_max" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetDeserializedObjectsMax();
                
                /**
                 * True if has "deserialized_objects_max" attribute
                 */
                boolean isSetDeserializedObjectsMax();
                
                /**
                 * Sets the "deserialized_objects_max" attribute
                 */
                void setDeserializedObjectsMax(java.math.BigInteger deserializedObjectsMax);
                
                /**
                 * Sets (as xml) the "deserialized_objects_max" attribute
                 */
                void xsetDeserializedObjectsMax(org.apache.xmlbeans.XmlInteger deserializedObjectsMax);
                
                /**
                 * Unsets the "deserialized_objects_max" attribute
                 */
                void unsetDeserializedObjectsMax();
                
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
                 * Gets the "failure_rate" attribute
                 */
                java.lang.String getFailureRate();
                
                /**
                 * Gets (as xml) the "failure_rate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFailureRate();
                
                /**
                 * True if has "failure_rate" attribute
                 */
                boolean isSetFailureRate();
                
                /**
                 * Sets the "failure_rate" attribute
                 */
                void setFailureRate(java.lang.String failureRate);
                
                /**
                 * Sets (as xml) the "failure_rate" attribute
                 */
                void xsetFailureRate(org.apache.xmlbeans.XmlString failureRate);
                
                /**
                 * Unsets the "failure_rate" attribute
                 */
                void unsetFailureRate();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall newInstance() {
                      return (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls.Remotecall) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls newInstance() {
                  return (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RemotingdashletDocument.Remotingdashlet.Remotecalls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.RemotingdashletDocument.Remotingdashlet newInstance() {
              return (noNamespace.RemotingdashletDocument.Remotingdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.RemotingdashletDocument.Remotingdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.RemotingdashletDocument.Remotingdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.RemotingdashletDocument newInstance() {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.RemotingdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.RemotingdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.RemotingdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.RemotingdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.RemotingdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.RemotingdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.RemotingdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.RemotingdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RemotingdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RemotingdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RemotingdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
