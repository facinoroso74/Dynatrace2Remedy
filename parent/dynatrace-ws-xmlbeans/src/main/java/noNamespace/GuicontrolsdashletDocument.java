/*
 * An XML document type.
 * Localname: guicontrolsdashlet
 * Namespace: 
 * Java type: noNamespace.GuicontrolsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one guicontrolsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface GuicontrolsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GuicontrolsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("guicontrolsdashlet3f71doctype");
    
    /**
     * Gets the "guicontrolsdashlet" element
     */
    noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet getGuicontrolsdashlet();
    
    /**
     * Sets the "guicontrolsdashlet" element
     */
    void setGuicontrolsdashlet(noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet guicontrolsdashlet);
    
    /**
     * Appends and returns a new empty "guicontrolsdashlet" element
     */
    noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet addNewGuicontrolsdashlet();
    
    /**
     * An XML guicontrolsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Guicontrolsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Guicontrolsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("guicontrolsdashlet862delemtype");
        
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
         * Gets the "guicontrols" element
         */
        noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols getGuicontrols();
        
        /**
         * True if has "guicontrols" element
         */
        boolean isSetGuicontrols();
        
        /**
         * Sets the "guicontrols" element
         */
        void setGuicontrols(noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols guicontrols);
        
        /**
         * Appends and returns a new empty "guicontrols" element
         */
        noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols addNewGuicontrols();
        
        /**
         * Unsets the "guicontrols" element
         */
        void unsetGuicontrols();
        
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
         * An XML guicontrols(@).
         *
         * This is a complex type.
         */
        public interface Guicontrols extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Guicontrols.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("guicontrols6b5aelemtype");
            
            /**
             * Gets array of all "guicontrol" elements
             */
            noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol[] getGuicontrolArray();
            
            /**
             * Gets ith "guicontrol" element
             */
            noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol getGuicontrolArray(int i);
            
            /**
             * Returns number of "guicontrol" element
             */
            int sizeOfGuicontrolArray();
            
            /**
             * Sets array of all "guicontrol" element
             */
            void setGuicontrolArray(noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol[] guicontrolArray);
            
            /**
             * Sets ith "guicontrol" element
             */
            void setGuicontrolArray(int i, noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol guicontrol);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "guicontrol" element
             */
            noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol insertNewGuicontrol(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "guicontrol" element
             */
            noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol addNewGuicontrol();
            
            /**
             * Removes the ith "guicontrol" element
             */
            void removeGuicontrol(int i);
            
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
             * An XML guicontrol(@).
             *
             * This is a complex type.
             */
            public interface Guicontrol extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Guicontrol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("guicontrolb5a8elemtype");
                
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
                 * Gets the "label" attribute
                 */
                java.lang.String getLabel();
                
                /**
                 * Gets (as xml) the "label" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLabel();
                
                /**
                 * True if has "label" attribute
                 */
                boolean isSetLabel();
                
                /**
                 * Sets the "label" attribute
                 */
                void setLabel(java.lang.String label);
                
                /**
                 * Sets (as xml) the "label" attribute
                 */
                void xsetLabel(org.apache.xmlbeans.XmlString label);
                
                /**
                 * Unsets the "label" attribute
                 */
                void unsetLabel();
                
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
                    public static noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol newInstance() {
                      return (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols.Guicontrol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols newInstance() {
                  return (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet.Guicontrols) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet newInstance() {
              return (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.GuicontrolsdashletDocument.Guicontrolsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.GuicontrolsdashletDocument newInstance() {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.GuicontrolsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.GuicontrolsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.GuicontrolsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.GuicontrolsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.GuicontrolsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.GuicontrolsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
