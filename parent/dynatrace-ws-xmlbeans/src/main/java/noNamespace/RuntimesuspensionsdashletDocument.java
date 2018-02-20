/*
 * An XML document type.
 * Localname: runtimesuspensionsdashlet
 * Namespace: 
 * Java type: noNamespace.RuntimesuspensionsdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one runtimesuspensionsdashlet(@) element.
 *
 * This is a complex type.
 */
public interface RuntimesuspensionsdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RuntimesuspensionsdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("runtimesuspensionsdashlet87d2doctype");
    
    /**
     * Gets the "runtimesuspensionsdashlet" element
     */
    noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet getRuntimesuspensionsdashlet();
    
    /**
     * Sets the "runtimesuspensionsdashlet" element
     */
    void setRuntimesuspensionsdashlet(noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet runtimesuspensionsdashlet);
    
    /**
     * Appends and returns a new empty "runtimesuspensionsdashlet" element
     */
    noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet addNewRuntimesuspensionsdashlet();
    
    /**
     * An XML runtimesuspensionsdashlet(@).
     *
     * This is a complex type.
     */
    public interface Runtimesuspensionsdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Runtimesuspensionsdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("runtimesuspensionsdashlet3bf9elemtype");
        
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
         * Gets the "suspensions" element
         */
        noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions getSuspensions();
        
        /**
         * True if has "suspensions" element
         */
        boolean isSetSuspensions();
        
        /**
         * Sets the "suspensions" element
         */
        void setSuspensions(noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions suspensions);
        
        /**
         * Appends and returns a new empty "suspensions" element
         */
        noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions addNewSuspensions();
        
        /**
         * Unsets the "suspensions" element
         */
        void unsetSuspensions();
        
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
         * An XML suspensions(@).
         *
         * This is a complex type.
         */
        public interface Suspensions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Suspensions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("suspensionsfaabelemtype");
            
            /**
             * Gets array of all "suspension" elements
             */
            noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension[] getSuspensionArray();
            
            /**
             * Gets ith "suspension" element
             */
            noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension getSuspensionArray(int i);
            
            /**
             * Returns number of "suspension" element
             */
            int sizeOfSuspensionArray();
            
            /**
             * Sets array of all "suspension" element
             */
            void setSuspensionArray(noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension[] suspensionArray);
            
            /**
             * Sets ith "suspension" element
             */
            void setSuspensionArray(int i, noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension suspension);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "suspension" element
             */
            noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension insertNewSuspension(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "suspension" element
             */
            noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension addNewSuspension();
            
            /**
             * Removes the ith "suspension" element
             */
            void removeSuspension(int i);
            
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
             * An XML suspension(@).
             *
             * This is a complex type.
             */
            public interface Suspension extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Suspension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("suspension1054elemtype");
                
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
                 * Gets the "time_max" attribute
                 */
                double getTimeMax();
                
                /**
                 * Gets (as xml) the "time_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTimeMax();
                
                /**
                 * True if has "time_max" attribute
                 */
                boolean isSetTimeMax();
                
                /**
                 * Sets the "time_max" attribute
                 */
                void setTimeMax(double timeMax);
                
                /**
                 * Sets (as xml) the "time_max" attribute
                 */
                void xsetTimeMax(org.apache.xmlbeans.XmlDouble timeMax);
                
                /**
                 * Unsets the "time_max" attribute
                 */
                void unsetTimeMax();
                
                /**
                 * Gets the "time_min" attribute
                 */
                double getTimeMin();
                
                /**
                 * Gets (as xml) the "time_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTimeMin();
                
                /**
                 * True if has "time_min" attribute
                 */
                boolean isSetTimeMin();
                
                /**
                 * Sets the "time_min" attribute
                 */
                void setTimeMin(double timeMin);
                
                /**
                 * Sets (as xml) the "time_min" attribute
                 */
                void xsetTimeMin(org.apache.xmlbeans.XmlDouble timeMin);
                
                /**
                 * Unsets the "time_min" attribute
                 */
                void unsetTimeMin();
                
                /**
                 * Gets the "reason" attribute
                 */
                java.lang.String getReason();
                
                /**
                 * Gets (as xml) the "reason" attribute
                 */
                org.apache.xmlbeans.XmlString xgetReason();
                
                /**
                 * True if has "reason" attribute
                 */
                boolean isSetReason();
                
                /**
                 * Sets the "reason" attribute
                 */
                void setReason(java.lang.String reason);
                
                /**
                 * Sets (as xml) the "reason" attribute
                 */
                void xsetReason(org.apache.xmlbeans.XmlString reason);
                
                /**
                 * Unsets the "reason" attribute
                 */
                void unsetReason();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension newInstance() {
                      return (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions.Suspension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions newInstance() {
                  return (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet.Suspensions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet newInstance() {
              return (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.RuntimesuspensionsdashletDocument.Runtimesuspensionsdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.RuntimesuspensionsdashletDocument newInstance() {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.RuntimesuspensionsdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RuntimesuspensionsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RuntimesuspensionsdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RuntimesuspensionsdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
