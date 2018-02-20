/*
 * An XML document type.
 * Localname: componentsdashlet
 * Namespace: 
 * Java type: noNamespace.ComponentsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one componentsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface ComponentsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComponentsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("componentsdashlet821adoctype");
    
    /**
     * Gets the "componentsdashlet" element
     */
    noNamespace.ComponentsdashletDocument.Componentsdashlet getComponentsdashlet();
    
    /**
     * Sets the "componentsdashlet" element
     */
    void setComponentsdashlet(noNamespace.ComponentsdashletDocument.Componentsdashlet componentsdashlet);
    
    /**
     * Appends and returns a new empty "componentsdashlet" element
     */
    noNamespace.ComponentsdashletDocument.Componentsdashlet addNewComponentsdashlet();
    
    /**
     * An XML componentsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Componentsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Componentsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("componentsdashlet3489elemtype");
        
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
         * Gets the "components" element
         */
        noNamespace.ComponentsdashletDocument.Componentsdashlet.Components getComponents();
        
        /**
         * True if has "components" element
         */
        boolean isSetComponents();
        
        /**
         * Sets the "components" element
         */
        void setComponents(noNamespace.ComponentsdashletDocument.Componentsdashlet.Components components);
        
        /**
         * Appends and returns a new empty "components" element
         */
        noNamespace.ComponentsdashletDocument.Componentsdashlet.Components addNewComponents();
        
        /**
         * Unsets the "components" element
         */
        void unsetComponents();
        
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
         * An XML components(@).
         *
         * This is a complex type.
         */
        public interface Components extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Components.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("components6e2belemtype");
            
            /**
             * Gets array of all "component" elements
             */
            noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component[] getComponentArray();
            
            /**
             * Gets ith "component" element
             */
            noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component getComponentArray(int i);
            
            /**
             * Returns number of "component" element
             */
            int sizeOfComponentArray();
            
            /**
             * Sets array of all "component" element
             */
            void setComponentArray(noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component[] componentArray);
            
            /**
             * Sets ith "component" element
             */
            void setComponentArray(int i, noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component component);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "component" element
             */
            noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component insertNewComponent(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "component" element
             */
            noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component addNewComponent();
            
            /**
             * Removes the ith "component" element
             */
            void removeComponent(int i);
            
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
             * An XML component(@).
             *
             * This is a complex type.
             */
            public interface Component extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Component.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("componentbc52elemtype");
                
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
                 * Gets the "avg" attribute
                 */
                double getAvg();
                
                /**
                 * Gets (as xml) the "avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetAvg();
                
                /**
                 * True if has "avg" attribute
                 */
                boolean isSetAvg();
                
                /**
                 * Sets the "avg" attribute
                 */
                void setAvg(double avg);
                
                /**
                 * Sets (as xml) the "avg" attribute
                 */
                void xsetAvg(org.apache.xmlbeans.XmlDouble avg);
                
                /**
                 * Unsets the "avg" attribute
                 */
                void unsetAvg();
                
                /**
                 * Gets the "min" attribute
                 */
                double getMin();
                
                /**
                 * Gets (as xml) the "min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetMin();
                
                /**
                 * True if has "min" attribute
                 */
                boolean isSetMin();
                
                /**
                 * Sets the "min" attribute
                 */
                void setMin(double min);
                
                /**
                 * Sets (as xml) the "min" attribute
                 */
                void xsetMin(org.apache.xmlbeans.XmlDouble min);
                
                /**
                 * Unsets the "min" attribute
                 */
                void unsetMin();
                
                /**
                 * Gets the "max" attribute
                 */
                double getMax();
                
                /**
                 * Gets (as xml) the "max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetMax();
                
                /**
                 * True if has "max" attribute
                 */
                boolean isSetMax();
                
                /**
                 * Sets the "max" attribute
                 */
                void setMax(double max);
                
                /**
                 * Sets (as xml) the "max" attribute
                 */
                void xsetMax(org.apache.xmlbeans.XmlDouble max);
                
                /**
                 * Unsets the "max" attribute
                 */
                void unsetMax();
                
                /**
                 * Gets the "sum" attribute
                 */
                double getSum();
                
                /**
                 * Gets (as xml) the "sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetSum();
                
                /**
                 * True if has "sum" attribute
                 */
                boolean isSetSum();
                
                /**
                 * Sets the "sum" attribute
                 */
                void setSum(double sum);
                
                /**
                 * Sets (as xml) the "sum" attribute
                 */
                void xsetSum(org.apache.xmlbeans.XmlDouble sum);
                
                /**
                 * Unsets the "sum" attribute
                 */
                void unsetSum();
                
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
                 * Gets the "exec_min" attribute
                 */
                double getExecMin();
                
                /**
                 * Gets (as xml) the "exec_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecMin();
                
                /**
                 * True if has "exec_min" attribute
                 */
                boolean isSetExecMin();
                
                /**
                 * Sets the "exec_min" attribute
                 */
                void setExecMin(double execMin);
                
                /**
                 * Sets (as xml) the "exec_min" attribute
                 */
                void xsetExecMin(org.apache.xmlbeans.XmlDouble execMin);
                
                /**
                 * Unsets the "exec_min" attribute
                 */
                void unsetExecMin();
                
                /**
                 * Gets the "exec_max" attribute
                 */
                double getExecMax();
                
                /**
                 * Gets (as xml) the "exec_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecMax();
                
                /**
                 * True if has "exec_max" attribute
                 */
                boolean isSetExecMax();
                
                /**
                 * Sets the "exec_max" attribute
                 */
                void setExecMax(double execMax);
                
                /**
                 * Sets (as xml) the "exec_max" attribute
                 */
                void xsetExecMax(org.apache.xmlbeans.XmlDouble execMax);
                
                /**
                 * Unsets the "exec_max" attribute
                 */
                void unsetExecMax();
                
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
                 * Gets the "cpu_min" attribute
                 */
                double getCpuMin();
                
                /**
                 * Gets (as xml) the "cpu_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuMin();
                
                /**
                 * True if has "cpu_min" attribute
                 */
                boolean isSetCpuMin();
                
                /**
                 * Sets the "cpu_min" attribute
                 */
                void setCpuMin(double cpuMin);
                
                /**
                 * Sets (as xml) the "cpu_min" attribute
                 */
                void xsetCpuMin(org.apache.xmlbeans.XmlDouble cpuMin);
                
                /**
                 * Unsets the "cpu_min" attribute
                 */
                void unsetCpuMin();
                
                /**
                 * Gets the "cpu_max" attribute
                 */
                double getCpuMax();
                
                /**
                 * Gets (as xml) the "cpu_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetCpuMax();
                
                /**
                 * True if has "cpu_max" attribute
                 */
                boolean isSetCpuMax();
                
                /**
                 * Sets the "cpu_max" attribute
                 */
                void setCpuMax(double cpuMax);
                
                /**
                 * Sets (as xml) the "cpu_max" attribute
                 */
                void xsetCpuMax(org.apache.xmlbeans.XmlDouble cpuMax);
                
                /**
                 * Unsets the "cpu_max" attribute
                 */
                void unsetCpuMax();
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component newInstance() {
                      return (noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ComponentsdashletDocument.Componentsdashlet.Components.Component) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ComponentsdashletDocument.Componentsdashlet.Components newInstance() {
                  return (noNamespace.ComponentsdashletDocument.Componentsdashlet.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ComponentsdashletDocument.Componentsdashlet.Components newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ComponentsdashletDocument.Componentsdashlet.Components) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ComponentsdashletDocument.Componentsdashlet newInstance() {
              return (noNamespace.ComponentsdashletDocument.Componentsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ComponentsdashletDocument.Componentsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ComponentsdashletDocument.Componentsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ComponentsdashletDocument newInstance() {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ComponentsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ComponentsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ComponentsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ComponentsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ComponentsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ComponentsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ComponentsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ComponentsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ComponentsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ComponentsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ComponentsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
