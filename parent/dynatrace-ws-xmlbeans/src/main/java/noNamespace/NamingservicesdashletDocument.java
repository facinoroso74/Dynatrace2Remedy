/*
 * An XML document type.
 * Localname: namingservicesdashlet
 * Namespace: 
 * Java type: noNamespace.NamingservicesdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one namingservicesdashlet(@) element.
 *
 * This is a complex type.
 */
public interface NamingservicesdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NamingservicesdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("namingservicesdashlet06cadoctype");
    
    /**
     * Gets the "namingservicesdashlet" element
     */
    noNamespace.NamingservicesdashletDocument.Namingservicesdashlet getNamingservicesdashlet();
    
    /**
     * Sets the "namingservicesdashlet" element
     */
    void setNamingservicesdashlet(noNamespace.NamingservicesdashletDocument.Namingservicesdashlet namingservicesdashlet);
    
    /**
     * Appends and returns a new empty "namingservicesdashlet" element
     */
    noNamespace.NamingservicesdashletDocument.Namingservicesdashlet addNewNamingservicesdashlet();
    
    /**
     * An XML namingservicesdashlet(@).
     *
     * This is a complex type.
     */
    public interface Namingservicesdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Namingservicesdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("namingservicesdashlet8de9elemtype");
        
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
         * Gets the "lookups" element
         */
        noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups getLookups();
        
        /**
         * True if has "lookups" element
         */
        boolean isSetLookups();
        
        /**
         * Sets the "lookups" element
         */
        void setLookups(noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups lookups);
        
        /**
         * Appends and returns a new empty "lookups" element
         */
        noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups addNewLookups();
        
        /**
         * Unsets the "lookups" element
         */
        void unsetLookups();
        
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
         * An XML lookups(@).
         *
         * This is a complex type.
         */
        public interface Lookups extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Lookups.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("lookups829eelemtype");
            
            /**
             * Gets array of all "lookup" elements
             */
            noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup[] getLookupArray();
            
            /**
             * Gets ith "lookup" element
             */
            noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup getLookupArray(int i);
            
            /**
             * Returns number of "lookup" element
             */
            int sizeOfLookupArray();
            
            /**
             * Sets array of all "lookup" element
             */
            void setLookupArray(noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup[] lookupArray);
            
            /**
             * Sets ith "lookup" element
             */
            void setLookupArray(int i, noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup lookup);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "lookup" element
             */
            noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup insertNewLookup(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "lookup" element
             */
            noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup addNewLookup();
            
            /**
             * Removes the ith "lookup" element
             */
            void removeLookup(int i);
            
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
             * An XML lookup(@).
             *
             * This is a complex type.
             */
            public interface Lookup extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Lookup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("lookup7d24elemtype");
                
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
                 * Gets the "name" attribute
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * True if has "name" attribute
                 */
                boolean isSetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * Unsets the "name" attribute
                 */
                void unsetName();
                
                /**
                 * Gets the "method" attribute
                 */
                java.lang.String getMethod();
                
                /**
                 * Gets (as xml) the "method" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMethod();
                
                /**
                 * True if has "method" attribute
                 */
                boolean isSetMethod();
                
                /**
                 * Sets the "method" attribute
                 */
                void setMethod(java.lang.String method);
                
                /**
                 * Sets (as xml) the "method" attribute
                 */
                void xsetMethod(org.apache.xmlbeans.XmlString method);
                
                /**
                 * Unsets the "method" attribute
                 */
                void unsetMethod();
                
                /**
                 * Gets the "class" attribute
                 */
                java.lang.String getClass1();
                
                /**
                 * Gets (as xml) the "class" attribute
                 */
                org.apache.xmlbeans.XmlString xgetClass1();
                
                /**
                 * True if has "class" attribute
                 */
                boolean isSetClass1();
                
                /**
                 * Sets the "class" attribute
                 */
                void setClass1(java.lang.String class1);
                
                /**
                 * Sets (as xml) the "class" attribute
                 */
                void xsetClass1(org.apache.xmlbeans.XmlString class1);
                
                /**
                 * Unsets the "class" attribute
                 */
                void unsetClass1();
                
                /**
                 * Gets the "agent" attribute
                 */
                java.lang.String getAgent();
                
                /**
                 * Gets (as xml) the "agent" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgent();
                
                /**
                 * True if has "agent" attribute
                 */
                boolean isSetAgent();
                
                /**
                 * Sets the "agent" attribute
                 */
                void setAgent(java.lang.String agent);
                
                /**
                 * Sets (as xml) the "agent" attribute
                 */
                void xsetAgent(org.apache.xmlbeans.XmlString agent);
                
                /**
                 * Unsets the "agent" attribute
                 */
                void unsetAgent();
                
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
                 * Gets the "time_avg" attribute
                 */
                double getTimeAvg();
                
                /**
                 * Gets (as xml) the "time_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTimeAvg();
                
                /**
                 * True if has "time_avg" attribute
                 */
                boolean isSetTimeAvg();
                
                /**
                 * Sets the "time_avg" attribute
                 */
                void setTimeAvg(double timeAvg);
                
                /**
                 * Sets (as xml) the "time_avg" attribute
                 */
                void xsetTimeAvg(org.apache.xmlbeans.XmlDouble timeAvg);
                
                /**
                 * Unsets the "time_avg" attribute
                 */
                void unsetTimeAvg();
                
                /**
                 * Gets the "time_sum" attribute
                 */
                double getTimeSum();
                
                /**
                 * Gets (as xml) the "time_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTimeSum();
                
                /**
                 * True if has "time_sum" attribute
                 */
                boolean isSetTimeSum();
                
                /**
                 * Sets the "time_sum" attribute
                 */
                void setTimeSum(double timeSum);
                
                /**
                 * Sets (as xml) the "time_sum" attribute
                 */
                void xsetTimeSum(org.apache.xmlbeans.XmlDouble timeSum);
                
                /**
                 * Unsets the "time_sum" attribute
                 */
                void unsetTimeSum();
                
                /**
                 * Gets the "cpu_avg" attribute
                 */
                double getCpuAvg();
                
                /**
                 * Gets (as xml) the "cpu_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuAvg();
                
                /**
                 * True if has "cpu_avg" attribute
                 */
                boolean isSetCpuAvg();
                
                /**
                 * Sets the "cpu_avg" attribute
                 */
                void setCpuAvg(double cpuAvg);
                
                /**
                 * Sets (as xml) the "cpu_avg" attribute
                 */
                void xsetCpuAvg(org.apache.xmlbeans.XmlDouble cpuAvg);
                
                /**
                 * Unsets the "cpu_avg" attribute
                 */
                void unsetCpuAvg();
                
                /**
                 * Gets the "cpu_sum" attribute
                 */
                double getCpuSum();
                
                /**
                 * Gets (as xml) the "cpu_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuSum();
                
                /**
                 * True if has "cpu_sum" attribute
                 */
                boolean isSetCpuSum();
                
                /**
                 * Sets the "cpu_sum" attribute
                 */
                void setCpuSum(double cpuSum);
                
                /**
                 * Sets (as xml) the "cpu_sum" attribute
                 */
                void xsetCpuSum(org.apache.xmlbeans.XmlDouble cpuSum);
                
                /**
                 * Unsets the "cpu_sum" attribute
                 */
                void unsetCpuSum();
                
                /**
                 * Gets the "exec_avg" attribute
                 */
                double getExecAvg();
                
                /**
                 * Gets (as xml) the "exec_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecAvg();
                
                /**
                 * True if has "exec_avg" attribute
                 */
                boolean isSetExecAvg();
                
                /**
                 * Sets the "exec_avg" attribute
                 */
                void setExecAvg(double execAvg);
                
                /**
                 * Sets (as xml) the "exec_avg" attribute
                 */
                void xsetExecAvg(org.apache.xmlbeans.XmlDouble execAvg);
                
                /**
                 * Unsets the "exec_avg" attribute
                 */
                void unsetExecAvg();
                
                /**
                 * Gets the "exec_sum" attribute
                 */
                double getExecSum();
                
                /**
                 * Gets (as xml) the "exec_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecSum();
                
                /**
                 * True if has "exec_sum" attribute
                 */
                boolean isSetExecSum();
                
                /**
                 * Sets the "exec_sum" attribute
                 */
                void setExecSum(double execSum);
                
                /**
                 * Sets (as xml) the "exec_sum" attribute
                 */
                void xsetExecSum(org.apache.xmlbeans.XmlDouble execSum);
                
                /**
                 * Unsets the "exec_sum" attribute
                 */
                void unsetExecSum();
                
                /**
                 * Gets the "exec_cpu_avg" attribute
                 */
                double getExecCpuAvg();
                
                /**
                 * Gets (as xml) the "exec_cpu_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecCpuAvg();
                
                /**
                 * True if has "exec_cpu_avg" attribute
                 */
                boolean isSetExecCpuAvg();
                
                /**
                 * Sets the "exec_cpu_avg" attribute
                 */
                void setExecCpuAvg(double execCpuAvg);
                
                /**
                 * Sets (as xml) the "exec_cpu_avg" attribute
                 */
                void xsetExecCpuAvg(org.apache.xmlbeans.XmlDouble execCpuAvg);
                
                /**
                 * Unsets the "exec_cpu_avg" attribute
                 */
                void unsetExecCpuAvg();
                
                /**
                 * Gets the "exec_cpu_sum" attribute
                 */
                double getExecCpuSum();
                
                /**
                 * Gets (as xml) the "exec_cpu_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecCpuSum();
                
                /**
                 * True if has "exec_cpu_sum" attribute
                 */
                boolean isSetExecCpuSum();
                
                /**
                 * Sets the "exec_cpu_sum" attribute
                 */
                void setExecCpuSum(double execCpuSum);
                
                /**
                 * Sets (as xml) the "exec_cpu_sum" attribute
                 */
                void xsetExecCpuSum(org.apache.xmlbeans.XmlDouble execCpuSum);
                
                /**
                 * Unsets the "exec_cpu_sum" attribute
                 */
                void unsetExecCpuSum();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup newInstance() {
                      return (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups.Lookup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups newInstance() {
                  return (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet.Lookups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.NamingservicesdashletDocument.Namingservicesdashlet newInstance() {
              return (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.NamingservicesdashletDocument.Namingservicesdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.NamingservicesdashletDocument.Namingservicesdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.NamingservicesdashletDocument newInstance() {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.NamingservicesdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.NamingservicesdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.NamingservicesdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.NamingservicesdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.NamingservicesdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NamingservicesdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
