/*
 * An XML document type.
 * Localname: testmetrics
 * Namespace: 
 * Java type: noNamespace.TestmetricsDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one testmetrics(@) element.
 *
 * This is a complex type.
 */
public interface TestmetricsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestmetricsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testmetricsb5d8doctype");
    
    /**
     * Gets the "testmetrics" element
     */
    noNamespace.TestmetricsDocument.Testmetrics getTestmetrics();
    
    /**
     * Sets the "testmetrics" element
     */
    void setTestmetrics(noNamespace.TestmetricsDocument.Testmetrics testmetrics);
    
    /**
     * Appends and returns a new empty "testmetrics" element
     */
    noNamespace.TestmetricsDocument.Testmetrics addNewTestmetrics();
    
    /**
     * An XML testmetrics(@).
     *
     * This is a complex type.
     */
    public interface Testmetrics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testmetrics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testmetrics1785elemtype");
        
        /**
         * Gets array of all "testmetric" elements
         */
        noNamespace.TestmetricsDocument.Testmetrics.Testmetric[] getTestmetricArray();
        
        /**
         * Gets ith "testmetric" element
         */
        noNamespace.TestmetricsDocument.Testmetrics.Testmetric getTestmetricArray(int i);
        
        /**
         * Returns number of "testmetric" element
         */
        int sizeOfTestmetricArray();
        
        /**
         * Sets array of all "testmetric" element
         */
        void setTestmetricArray(noNamespace.TestmetricsDocument.Testmetrics.Testmetric[] testmetricArray);
        
        /**
         * Sets ith "testmetric" element
         */
        void setTestmetricArray(int i, noNamespace.TestmetricsDocument.Testmetrics.Testmetric testmetric);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testmetric" element
         */
        noNamespace.TestmetricsDocument.Testmetrics.Testmetric insertNewTestmetric(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testmetric" element
         */
        noNamespace.TestmetricsDocument.Testmetrics.Testmetric addNewTestmetric();
        
        /**
         * Removes the ith "testmetric" element
         */
        void removeTestmetric(int i);
        
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
         * An XML testmetric(@).
         *
         * This is a complex type.
         */
        public interface Testmetric extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testmetric.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testmetricbbd3elemtype");
            
            /**
             * Gets array of all "testrun" elements
             */
            noNamespace.TestrunDocument.Testrun[] getTestrunArray();
            
            /**
             * Gets ith "testrun" element
             */
            noNamespace.TestrunDocument.Testrun getTestrunArray(int i);
            
            /**
             * Returns number of "testrun" element
             */
            int sizeOfTestrunArray();
            
            /**
             * Sets array of all "testrun" element
             */
            void setTestrunArray(noNamespace.TestrunDocument.Testrun[] testrunArray);
            
            /**
             * Sets ith "testrun" element
             */
            void setTestrunArray(int i, noNamespace.TestrunDocument.Testrun testrun);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "testrun" element
             */
            noNamespace.TestrunDocument.Testrun insertNewTestrun(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "testrun" element
             */
            noNamespace.TestrunDocument.Testrun addNewTestrun();
            
            /**
             * Removes the ith "testrun" element
             */
            void removeTestrun(int i);
            
            /**
             * Gets the "violationpercent" attribute
             */
            java.lang.String getViolationpercent();
            
            /**
             * Gets (as xml) the "violationpercent" attribute
             */
            org.apache.xmlbeans.XmlString xgetViolationpercent();
            
            /**
             * True if has "violationpercent" attribute
             */
            boolean isSetViolationpercent();
            
            /**
             * Sets the "violationpercent" attribute
             */
            void setViolationpercent(java.lang.String violationpercent);
            
            /**
             * Sets (as xml) the "violationpercent" attribute
             */
            void xsetViolationpercent(org.apache.xmlbeans.XmlString violationpercent);
            
            /**
             * Unsets the "violationpercent" attribute
             */
            void unsetViolationpercent();
            
            /**
             * Gets the "violatedabove" attribute
             */
            java.math.BigInteger getViolatedabove();
            
            /**
             * Gets (as xml) the "violatedabove" attribute
             */
            org.apache.xmlbeans.XmlInteger xgetViolatedabove();
            
            /**
             * True if has "violatedabove" attribute
             */
            boolean isSetViolatedabove();
            
            /**
             * Sets the "violatedabove" attribute
             */
            void setViolatedabove(java.math.BigInteger violatedabove);
            
            /**
             * Sets (as xml) the "violatedabove" attribute
             */
            void xsetViolatedabove(org.apache.xmlbeans.XmlInteger violatedabove);
            
            /**
             * Unsets the "violatedabove" attribute
             */
            void unsetViolatedabove();
            
            /**
             * Gets the "testname" attribute
             */
            java.lang.String getTestname();
            
            /**
             * Gets (as xml) the "testname" attribute
             */
            org.apache.xmlbeans.XmlString xgetTestname();
            
            /**
             * True if has "testname" attribute
             */
            boolean isSetTestname();
            
            /**
             * Sets the "testname" attribute
             */
            void setTestname(java.lang.String testname);
            
            /**
             * Sets (as xml) the "testname" attribute
             */
            void xsetTestname(org.apache.xmlbeans.XmlString testname);
            
            /**
             * Unsets the "testname" attribute
             */
            void unsetTestname();
            
            /**
             * Gets the "shorttestname" attribute
             */
            java.lang.String getShorttestname();
            
            /**
             * Gets (as xml) the "shorttestname" attribute
             */
            org.apache.xmlbeans.XmlString xgetShorttestname();
            
            /**
             * True if has "shorttestname" attribute
             */
            boolean isSetShorttestname();
            
            /**
             * Sets the "shorttestname" attribute
             */
            void setShorttestname(java.lang.String shorttestname);
            
            /**
             * Sets (as xml) the "shorttestname" attribute
             */
            void xsetShorttestname(org.apache.xmlbeans.XmlString shorttestname);
            
            /**
             * Unsets the "shorttestname" attribute
             */
            void unsetShorttestname();
            
            /**
             * Gets the "metricgroup" attribute
             */
            java.lang.String getMetricgroup();
            
            /**
             * Gets (as xml) the "metricgroup" attribute
             */
            org.apache.xmlbeans.XmlString xgetMetricgroup();
            
            /**
             * True if has "metricgroup" attribute
             */
            boolean isSetMetricgroup();
            
            /**
             * Sets the "metricgroup" attribute
             */
            void setMetricgroup(java.lang.String metricgroup);
            
            /**
             * Sets (as xml) the "metricgroup" attribute
             */
            void xsetMetricgroup(org.apache.xmlbeans.XmlString metricgroup);
            
            /**
             * Unsets the "metricgroup" attribute
             */
            void unsetMetricgroup();
            
            /**
             * Gets the "measure" attribute
             */
            java.lang.String getMeasure();
            
            /**
             * Gets (as xml) the "measure" attribute
             */
            org.apache.xmlbeans.XmlString xgetMeasure();
            
            /**
             * True if has "measure" attribute
             */
            boolean isSetMeasure();
            
            /**
             * Sets the "measure" attribute
             */
            void setMeasure(java.lang.String measure);
            
            /**
             * Sets (as xml) the "measure" attribute
             */
            void xsetMeasure(org.apache.xmlbeans.XmlString measure);
            
            /**
             * Unsets the "measure" attribute
             */
            void unsetMeasure();
            
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
             * Gets the "high" attribute
             */
            double getHigh();
            
            /**
             * Gets (as xml) the "high" attribute
             */
            org.apache.xmlbeans.XmlDouble xgetHigh();
            
            /**
             * True if has "high" attribute
             */
            boolean isSetHigh();
            
            /**
             * Sets the "high" attribute
             */
            void setHigh(double high);
            
            /**
             * Sets (as xml) the "high" attribute
             */
            void xsetHigh(org.apache.xmlbeans.XmlDouble high);
            
            /**
             * Unsets the "high" attribute
             */
            void unsetHigh();
            
            /**
             * Gets the "last" attribute
             */
            double getLast();
            
            /**
             * Gets (as xml) the "last" attribute
             */
            org.apache.xmlbeans.XmlDouble xgetLast();
            
            /**
             * True if has "last" attribute
             */
            boolean isSetLast();
            
            /**
             * Sets the "last" attribute
             */
            void setLast(double last);
            
            /**
             * Sets (as xml) the "last" attribute
             */
            void xsetLast(org.apache.xmlbeans.XmlDouble last);
            
            /**
             * Unsets the "last" attribute
             */
            void unsetLast();
            
            /**
             * Gets the "unit" attribute
             */
            java.lang.String getUnit();
            
            /**
             * Gets (as xml) the "unit" attribute
             */
            org.apache.xmlbeans.XmlString xgetUnit();
            
            /**
             * True if has "unit" attribute
             */
            boolean isSetUnit();
            
            /**
             * Sets the "unit" attribute
             */
            void setUnit(java.lang.String unit);
            
            /**
             * Sets (as xml) the "unit" attribute
             */
            void xsetUnit(org.apache.xmlbeans.XmlString unit);
            
            /**
             * Unsets the "unit" attribute
             */
            void unsetUnit();
            
            /**
             * Gets the "volatility" attribute
             */
            java.lang.String getVolatility();
            
            /**
             * Gets (as xml) the "volatility" attribute
             */
            org.apache.xmlbeans.XmlString xgetVolatility();
            
            /**
             * True if has "volatility" attribute
             */
            boolean isSetVolatility();
            
            /**
             * Sets the "volatility" attribute
             */
            void setVolatility(java.lang.String volatility);
            
            /**
             * Sets (as xml) the "volatility" attribute
             */
            void xsetVolatility(org.apache.xmlbeans.XmlString volatility);
            
            /**
             * Unsets the "volatility" attribute
             */
            void unsetVolatility();
            
            /**
             * Gets the "failed" attribute
             */
            java.math.BigInteger getFailed();
            
            /**
             * Gets (as xml) the "failed" attribute
             */
            org.apache.xmlbeans.XmlInteger xgetFailed();
            
            /**
             * True if has "failed" attribute
             */
            boolean isSetFailed();
            
            /**
             * Sets the "failed" attribute
             */
            void setFailed(java.math.BigInteger failed);
            
            /**
             * Sets (as xml) the "failed" attribute
             */
            void xsetFailed(org.apache.xmlbeans.XmlInteger failed);
            
            /**
             * Unsets the "failed" attribute
             */
            void unsetFailed();
            
            /**
             * Gets the "host" attribute
             */
            java.lang.String getHost();
            
            /**
             * Gets (as xml) the "host" attribute
             */
            org.apache.xmlbeans.XmlString xgetHost();
            
            /**
             * True if has "host" attribute
             */
            boolean isSetHost();
            
            /**
             * Sets the "host" attribute
             */
            void setHost(java.lang.String host);
            
            /**
             * Sets (as xml) the "host" attribute
             */
            void xsetHost(org.apache.xmlbeans.XmlString host);
            
            /**
             * Unsets the "host" attribute
             */
            void unsetHost();
            
            /**
             * Gets the "low" attribute
             */
            double getLow();
            
            /**
             * Gets (as xml) the "low" attribute
             */
            org.apache.xmlbeans.XmlDouble xgetLow();
            
            /**
             * True if has "low" attribute
             */
            boolean isSetLow();
            
            /**
             * Sets the "low" attribute
             */
            void setLow(double low);
            
            /**
             * Sets (as xml) the "low" attribute
             */
            void xsetLow(org.apache.xmlbeans.XmlDouble low);
            
            /**
             * Unsets the "low" attribute
             */
            void unsetLow();
            
            /**
             * Gets the "validruns" attribute
             */
            java.math.BigInteger getValidruns();
            
            /**
             * Gets (as xml) the "validruns" attribute
             */
            org.apache.xmlbeans.XmlInteger xgetValidruns();
            
            /**
             * True if has "validruns" attribute
             */
            boolean isSetValidruns();
            
            /**
             * Sets the "validruns" attribute
             */
            void setValidruns(java.math.BigInteger validruns);
            
            /**
             * Sets (as xml) the "validruns" attribute
             */
            void xsetValidruns(org.apache.xmlbeans.XmlInteger validruns);
            
            /**
             * Unsets the "validruns" attribute
             */
            void unsetValidruns();
            
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
             * Gets the "package" attribute
             */
            java.lang.String getPackage();
            
            /**
             * Gets (as xml) the "package" attribute
             */
            org.apache.xmlbeans.XmlString xgetPackage();
            
            /**
             * True if has "package" attribute
             */
            boolean isSetPackage();
            
            /**
             * Sets the "package" attribute
             */
            void setPackage(java.lang.String xpackage);
            
            /**
             * Sets (as xml) the "package" attribute
             */
            void xsetPackage(org.apache.xmlbeans.XmlString xpackage);
            
            /**
             * Unsets the "package" attribute
             */
            void unsetPackage();
            
            /**
             * Gets the "violatedbelow" attribute
             */
            java.math.BigInteger getViolatedbelow();
            
            /**
             * Gets (as xml) the "violatedbelow" attribute
             */
            org.apache.xmlbeans.XmlInteger xgetViolatedbelow();
            
            /**
             * True if has "violatedbelow" attribute
             */
            boolean isSetViolatedbelow();
            
            /**
             * Sets the "violatedbelow" attribute
             */
            void setViolatedbelow(java.math.BigInteger violatedbelow);
            
            /**
             * Sets (as xml) the "violatedbelow" attribute
             */
            void xsetViolatedbelow(org.apache.xmlbeans.XmlInteger violatedbelow);
            
            /**
             * Unsets the "violatedbelow" attribute
             */
            void unsetViolatedbelow();
            
            /**
             * Gets the "color" attribute
             */
            java.lang.String getColor();
            
            /**
             * Gets (as xml) the "color" attribute
             */
            org.apache.xmlbeans.XmlString xgetColor();
            
            /**
             * True if has "color" attribute
             */
            boolean isSetColor();
            
            /**
             * Sets the "color" attribute
             */
            void setColor(java.lang.String color);
            
            /**
             * Sets (as xml) the "color" attribute
             */
            void xsetColor(org.apache.xmlbeans.XmlString color);
            
            /**
             * Unsets the "color" attribute
             */
            void unsetColor();
            
            /**
             * Gets the "status" attribute
             */
            java.lang.String getStatus();
            
            /**
             * Gets (as xml) the "status" attribute
             */
            org.apache.xmlbeans.XmlString xgetStatus();
            
            /**
             * True if has "status" attribute
             */
            boolean isSetStatus();
            
            /**
             * Sets the "status" attribute
             */
            void setStatus(java.lang.String status);
            
            /**
             * Sets (as xml) the "status" attribute
             */
            void xsetStatus(org.apache.xmlbeans.XmlString status);
            
            /**
             * Unsets the "status" attribute
             */
            void unsetStatus();
            
            /**
             * Gets the "lastrun" attribute
             */
            java.lang.String getLastrun();
            
            /**
             * Gets (as xml) the "lastrun" attribute
             */
            org.apache.xmlbeans.XmlString xgetLastrun();
            
            /**
             * True if has "lastrun" attribute
             */
            boolean isSetLastrun();
            
            /**
             * Sets the "lastrun" attribute
             */
            void setLastrun(java.lang.String lastrun);
            
            /**
             * Sets (as xml) the "lastrun" attribute
             */
            void xsetLastrun(org.apache.xmlbeans.XmlString lastrun);
            
            /**
             * Unsets the "lastrun" attribute
             */
            void unsetLastrun();
            
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
             * Gets the "collector" attribute
             */
            java.lang.String getCollector();
            
            /**
             * Gets (as xml) the "collector" attribute
             */
            org.apache.xmlbeans.XmlString xgetCollector();
            
            /**
             * True if has "collector" attribute
             */
            boolean isSetCollector();
            
            /**
             * Sets the "collector" attribute
             */
            void setCollector(java.lang.String collector);
            
            /**
             * Sets (as xml) the "collector" attribute
             */
            void xsetCollector(org.apache.xmlbeans.XmlString collector);
            
            /**
             * Unsets the "collector" attribute
             */
            void unsetCollector();
            
            /**
             * Gets the "assignees" attribute
             */
            java.lang.String getAssignees();
            
            /**
             * Gets (as xml) the "assignees" attribute
             */
            org.apache.xmlbeans.XmlString xgetAssignees();
            
            /**
             * True if has "assignees" attribute
             */
            boolean isSetAssignees();
            
            /**
             * Sets the "assignees" attribute
             */
            void setAssignees(java.lang.String assignees);
            
            /**
             * Sets (as xml) the "assignees" attribute
             */
            void xsetAssignees(org.apache.xmlbeans.XmlString assignees);
            
            /**
             * Unsets the "assignees" attribute
             */
            void unsetAssignees();
            
            /**
             * Gets the "trend" attribute
             */
            java.lang.String getTrend();
            
            /**
             * Gets (as xml) the "trend" attribute
             */
            org.apache.xmlbeans.XmlString xgetTrend();
            
            /**
             * True if has "trend" attribute
             */
            boolean isSetTrend();
            
            /**
             * Sets the "trend" attribute
             */
            void setTrend(java.lang.String trend);
            
            /**
             * Sets (as xml) the "trend" attribute
             */
            void xsetTrend(org.apache.xmlbeans.XmlString trend);
            
            /**
             * Unsets the "trend" attribute
             */
            void unsetTrend();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.TestmetricsDocument.Testmetrics.Testmetric newInstance() {
                  return (noNamespace.TestmetricsDocument.Testmetrics.Testmetric) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.TestmetricsDocument.Testmetrics.Testmetric newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.TestmetricsDocument.Testmetrics.Testmetric) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.TestmetricsDocument.Testmetrics newInstance() {
              return (noNamespace.TestmetricsDocument.Testmetrics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.TestmetricsDocument.Testmetrics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.TestmetricsDocument.Testmetrics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.TestmetricsDocument newInstance() {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.TestmetricsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.TestmetricsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.TestmetricsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.TestmetricsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.TestmetricsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.TestmetricsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.TestmetricsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.TestmetricsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.TestmetricsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.TestmetricsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.TestmetricsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.TestmetricsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.TestmetricsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.TestmetricsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.TestmetricsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TestmetricsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TestmetricsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TestmetricsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
