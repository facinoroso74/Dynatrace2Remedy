/*
 * An XML document type.
 * Localname: memoryallocationsdashlet
 * Namespace: 
 * Java type: noNamespace.MemoryallocationsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one memoryallocationsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface MemoryallocationsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MemoryallocationsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("memoryallocationsdashlet9690doctype");
    
    /**
     * Gets the "memoryallocationsdashlet" element
     */
    noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet getMemoryallocationsdashlet();
    
    /**
     * Sets the "memoryallocationsdashlet" element
     */
    void setMemoryallocationsdashlet(noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet memoryallocationsdashlet);
    
    /**
     * Appends and returns a new empty "memoryallocationsdashlet" element
     */
    noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet addNewMemoryallocationsdashlet();
    
    /**
     * An XML memoryallocationsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Memoryallocationsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Memoryallocationsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("memoryallocationsdashlet4d0delemtype");
        
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
         * Gets the "allocations" element
         */
        noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations getAllocations();
        
        /**
         * True if has "allocations" element
         */
        boolean isSetAllocations();
        
        /**
         * Sets the "allocations" element
         */
        void setAllocations(noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations allocations);
        
        /**
         * Appends and returns a new empty "allocations" element
         */
        noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations addNewAllocations();
        
        /**
         * Unsets the "allocations" element
         */
        void unsetAllocations();
        
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
         * An XML allocations(@).
         *
         * This is a complex type.
         */
        public interface Allocations extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Allocations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("allocationsa7dcelemtype");
            
            /**
             * Gets array of all "allocation" elements
             */
            noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation[] getAllocationArray();
            
            /**
             * Gets ith "allocation" element
             */
            noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation getAllocationArray(int i);
            
            /**
             * Returns number of "allocation" element
             */
            int sizeOfAllocationArray();
            
            /**
             * Sets array of all "allocation" element
             */
            void setAllocationArray(noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation[] allocationArray);
            
            /**
             * Sets ith "allocation" element
             */
            void setAllocationArray(int i, noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation allocation);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "allocation" element
             */
            noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation insertNewAllocation(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "allocation" element
             */
            noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation addNewAllocation();
            
            /**
             * Removes the ith "allocation" element
             */
            void removeAllocation(int i);
            
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
             * An XML allocation(@).
             *
             * This is a complex type.
             */
            public interface Allocation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Allocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("allocation8348elemtype");
                
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
                 * Gets the "class_name" attribute
                 */
                java.lang.String getClassName();
                
                /**
                 * Gets (as xml) the "class_name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClassName();
                
                /**
                 * True if has "class_name" attribute
                 */
                boolean isSetClassName();
                
                /**
                 * Sets the "class_name" attribute
                 */
                void setClassName(java.lang.String className);
                
                /**
                 * Sets (as xml) the "class_name" attribute
                 */
                void xsetClassName(org.apache.xmlbeans.XmlString className);
                
                /**
                 * Unsets the "class_name" attribute
                 */
                void unsetClassName();
                
                /**
                 * Gets the "number_of_instances" attribute
                 */
                java.math.BigInteger getNumberOfInstances();
                
                /**
                 * Gets (as xml) the "number_of_instances" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetNumberOfInstances();
                
                /**
                 * True if has "number_of_instances" attribute
                 */
                boolean isSetNumberOfInstances();
                
                /**
                 * Sets the "number_of_instances" attribute
                 */
                void setNumberOfInstances(java.math.BigInteger numberOfInstances);
                
                /**
                 * Sets (as xml) the "number_of_instances" attribute
                 */
                void xsetNumberOfInstances(org.apache.xmlbeans.XmlInteger numberOfInstances);
                
                /**
                 * Unsets the "number_of_instances" attribute
                 */
                void unsetNumberOfInstances();
                
                /**
                 * Gets the "allocation_class_name" attribute
                 */
                java.lang.String getAllocationClassName();
                
                /**
                 * Gets (as xml) the "allocation_class_name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAllocationClassName();
                
                /**
                 * True if has "allocation_class_name" attribute
                 */
                boolean isSetAllocationClassName();
                
                /**
                 * Sets the "allocation_class_name" attribute
                 */
                void setAllocationClassName(java.lang.String allocationClassName);
                
                /**
                 * Sets (as xml) the "allocation_class_name" attribute
                 */
                void xsetAllocationClassName(org.apache.xmlbeans.XmlString allocationClassName);
                
                /**
                 * Unsets the "allocation_class_name" attribute
                 */
                void unsetAllocationClassName();
                
                /**
                 * Gets the "allocation_method_name" attribute
                 */
                java.lang.String getAllocationMethodName();
                
                /**
                 * Gets (as xml) the "allocation_method_name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAllocationMethodName();
                
                /**
                 * True if has "allocation_method_name" attribute
                 */
                boolean isSetAllocationMethodName();
                
                /**
                 * Sets the "allocation_method_name" attribute
                 */
                void setAllocationMethodName(java.lang.String allocationMethodName);
                
                /**
                 * Sets (as xml) the "allocation_method_name" attribute
                 */
                void xsetAllocationMethodName(org.apache.xmlbeans.XmlString allocationMethodName);
                
                /**
                 * Unsets the "allocation_method_name" attribute
                 */
                void unsetAllocationMethodName();
                
                /**
                 * Gets the "file_name" attribute
                 */
                java.lang.String getFileName();
                
                /**
                 * Gets (as xml) the "file_name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetFileName();
                
                /**
                 * True if has "file_name" attribute
                 */
                boolean isSetFileName();
                
                /**
                 * Sets the "file_name" attribute
                 */
                void setFileName(java.lang.String fileName);
                
                /**
                 * Sets (as xml) the "file_name" attribute
                 */
                void xsetFileName(org.apache.xmlbeans.XmlString fileName);
                
                /**
                 * Unsets the "file_name" attribute
                 */
                void unsetFileName();
                
                /**
                 * Gets the "line_number" attribute
                 */
                java.math.BigInteger getLineNumber();
                
                /**
                 * Gets (as xml) the "line_number" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetLineNumber();
                
                /**
                 * True if has "line_number" attribute
                 */
                boolean isSetLineNumber();
                
                /**
                 * Sets the "line_number" attribute
                 */
                void setLineNumber(java.math.BigInteger lineNumber);
                
                /**
                 * Sets (as xml) the "line_number" attribute
                 */
                void xsetLineNumber(org.apache.xmlbeans.XmlInteger lineNumber);
                
                /**
                 * Unsets the "line_number" attribute
                 */
                void unsetLineNumber();
                
                /**
                 * Gets the "agent_name" attribute
                 */
                java.lang.String getAgentName();
                
                /**
                 * Gets (as xml) the "agent_name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgentName();
                
                /**
                 * True if has "agent_name" attribute
                 */
                boolean isSetAgentName();
                
                /**
                 * Sets the "agent_name" attribute
                 */
                void setAgentName(java.lang.String agentName);
                
                /**
                 * Sets (as xml) the "agent_name" attribute
                 */
                void xsetAgentName(org.apache.xmlbeans.XmlString agentName);
                
                /**
                 * Unsets the "agent_name" attribute
                 */
                void unsetAgentName();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation newInstance() {
                      return (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations.Allocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations newInstance() {
                  return (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet.Allocations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet newInstance() {
              return (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.MemoryallocationsdashletDocument.Memoryallocationsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.MemoryallocationsdashletDocument newInstance() {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.MemoryallocationsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.MemoryallocationsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.MemoryallocationsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.MemoryallocationsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.MemoryallocationsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.MemoryallocationsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
