/*
 * An XML document type.
 * Localname: testautomation
 * Namespace: 
 * Java type: noNamespace.TestautomationDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one testautomation(@) element.
 *
 * This is a complex type.
 */
public interface TestautomationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestautomationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testautomation8be2doctype");
    
    /**
     * Gets the "testautomation" element
     */
    noNamespace.TestautomationDocument.Testautomation getTestautomation();
    
    /**
     * Sets the "testautomation" element
     */
    void setTestautomation(noNamespace.TestautomationDocument.Testautomation testautomation);
    
    /**
     * Appends and returns a new empty "testautomation" element
     */
    noNamespace.TestautomationDocument.Testautomation addNewTestautomation();
    
    /**
     * An XML testautomation(@).
     *
     * This is a complex type.
     */
    public interface Testautomation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testautomation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testautomation04cdelemtype");
        
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
         * Gets array of all "testcases" elements
         */
        noNamespace.TestautomationDocument.Testautomation.Testcases[] getTestcasesArray();
        
        /**
         * Gets ith "testcases" element
         */
        noNamespace.TestautomationDocument.Testautomation.Testcases getTestcasesArray(int i);
        
        /**
         * Returns number of "testcases" element
         */
        int sizeOfTestcasesArray();
        
        /**
         * Sets array of all "testcases" element
         */
        void setTestcasesArray(noNamespace.TestautomationDocument.Testautomation.Testcases[] testcasesArray);
        
        /**
         * Sets ith "testcases" element
         */
        void setTestcasesArray(int i, noNamespace.TestautomationDocument.Testautomation.Testcases testcases);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testcases" element
         */
        noNamespace.TestautomationDocument.Testautomation.Testcases insertNewTestcases(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testcases" element
         */
        noNamespace.TestautomationDocument.Testautomation.Testcases addNewTestcases();
        
        /**
         * Removes the ith "testcases" element
         */
        void removeTestcases(int i);
        
        /**
         * Gets the "testruninfos" element
         */
        noNamespace.TestautomationDocument.Testautomation.Testruninfos getTestruninfos();
        
        /**
         * True if has "testruninfos" element
         */
        boolean isSetTestruninfos();
        
        /**
         * Sets the "testruninfos" element
         */
        void setTestruninfos(noNamespace.TestautomationDocument.Testautomation.Testruninfos testruninfos);
        
        /**
         * Appends and returns a new empty "testruninfos" element
         */
        noNamespace.TestautomationDocument.Testautomation.Testruninfos addNewTestruninfos();
        
        /**
         * Unsets the "testruninfos" element
         */
        void unsetTestruninfos();
        
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
         * An XML testcases(@).
         *
         * This is a complex type.
         */
        public interface Testcases extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testcases.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testcasesa9faelemtype");
            
            /**
             * Gets array of all "testcase" elements
             */
            noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase[] getTestcaseArray();
            
            /**
             * Gets ith "testcase" element
             */
            noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase getTestcaseArray(int i);
            
            /**
             * Returns number of "testcase" element
             */
            int sizeOfTestcaseArray();
            
            /**
             * Sets array of all "testcase" element
             */
            void setTestcaseArray(noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase[] testcaseArray);
            
            /**
             * Sets ith "testcase" element
             */
            void setTestcaseArray(int i, noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase testcase);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "testcase" element
             */
            noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase insertNewTestcase(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "testcase" element
             */
            noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase addNewTestcase();
            
            /**
             * Removes the ith "testcase" element
             */
            void removeTestcase(int i);
            
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
             * An XML testcase(@).
             *
             * This is a complex type.
             */
            public interface Testcase extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testcase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testcasebac8elemtype");
                
                /**
                 * Gets array of all "testmetrics" elements
                 */
                noNamespace.TestmetricsDocument.Testmetrics[] getTestmetricsArray();
                
                /**
                 * Gets ith "testmetrics" element
                 */
                noNamespace.TestmetricsDocument.Testmetrics getTestmetricsArray(int i);
                
                /**
                 * Returns number of "testmetrics" element
                 */
                int sizeOfTestmetricsArray();
                
                /**
                 * Sets array of all "testmetrics" element
                 */
                void setTestmetricsArray(noNamespace.TestmetricsDocument.Testmetrics[] testmetricsArray);
                
                /**
                 * Sets ith "testmetrics" element
                 */
                void setTestmetricsArray(int i, noNamespace.TestmetricsDocument.Testmetrics testmetrics);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "testmetrics" element
                 */
                noNamespace.TestmetricsDocument.Testmetrics insertNewTestmetrics(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "testmetrics" element
                 */
                noNamespace.TestmetricsDocument.Testmetrics addNewTestmetrics();
                
                /**
                 * Removes the ith "testmetrics" element
                 */
                void removeTestmetrics(int i);
                
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
                 * Gets the "prevstatus" attribute
                 */
                java.lang.String getPrevstatus();
                
                /**
                 * Gets (as xml) the "prevstatus" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPrevstatus();
                
                /**
                 * True if has "prevstatus" attribute
                 */
                boolean isSetPrevstatus();
                
                /**
                 * Sets the "prevstatus" attribute
                 */
                void setPrevstatus(java.lang.String prevstatus);
                
                /**
                 * Sets (as xml) the "prevstatus" attribute
                 */
                void xsetPrevstatus(org.apache.xmlbeans.XmlString prevstatus);
                
                /**
                 * Unsets the "prevstatus" attribute
                 */
                void unsetPrevstatus();
                
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
                 * Gets the "lastrun" attribute
                 */
                java.util.Calendar getLastrun();
                
                /**
                 * Gets (as xml) the "lastrun" attribute
                 */
                org.apache.xmlbeans.XmlDateTime xgetLastrun();
                
                /**
                 * True if has "lastrun" attribute
                 */
                boolean isSetLastrun();
                
                /**
                 * Sets the "lastrun" attribute
                 */
                void setLastrun(java.util.Calendar lastrun);
                
                /**
                 * Sets (as xml) the "lastrun" attribute
                 */
                void xsetLastrun(org.apache.xmlbeans.XmlDateTime lastrun);
                
                /**
                 * Unsets the "lastrun" attribute
                 */
                void unsetLastrun();
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase newInstance() {
                      return (noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.TestautomationDocument.Testautomation.Testcases.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.TestautomationDocument.Testautomation.Testcases newInstance() {
                  return (noNamespace.TestautomationDocument.Testautomation.Testcases) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.TestautomationDocument.Testautomation.Testcases newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.TestautomationDocument.Testautomation.Testcases) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML testruninfos(@).
         *
         * This is a complex type.
         */
        public interface Testruninfos extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testruninfos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testruninfosadc5elemtype");
            
            /**
             * Gets array of all "testruninfo" elements
             */
            noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo[] getTestruninfoArray();
            
            /**
             * Gets ith "testruninfo" element
             */
            noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo getTestruninfoArray(int i);
            
            /**
             * Returns number of "testruninfo" element
             */
            int sizeOfTestruninfoArray();
            
            /**
             * Sets array of all "testruninfo" element
             */
            void setTestruninfoArray(noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo[] testruninfoArray);
            
            /**
             * Sets ith "testruninfo" element
             */
            void setTestruninfoArray(int i, noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo testruninfo);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "testruninfo" element
             */
            noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo insertNewTestruninfo(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "testruninfo" element
             */
            noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo addNewTestruninfo();
            
            /**
             * Removes the ith "testruninfo" element
             */
            void removeTestruninfo(int i);
            
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
             * An XML testruninfo(@).
             *
             * This is a complex type.
             */
            public interface Testruninfo extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testruninfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("testruninfo46c2elemtype");
                
                /**
                 * Gets array of all "customproperty" elements
                 */
                noNamespace.CustompropertyDocument.Customproperty[] getCustompropertyArray();
                
                /**
                 * Gets ith "customproperty" element
                 */
                noNamespace.CustompropertyDocument.Customproperty getCustompropertyArray(int i);
                
                /**
                 * Returns number of "customproperty" element
                 */
                int sizeOfCustompropertyArray();
                
                /**
                 * Sets array of all "customproperty" element
                 */
                void setCustompropertyArray(noNamespace.CustompropertyDocument.Customproperty[] custompropertyArray);
                
                /**
                 * Sets ith "customproperty" element
                 */
                void setCustompropertyArray(int i, noNamespace.CustompropertyDocument.Customproperty customproperty);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "customproperty" element
                 */
                noNamespace.CustompropertyDocument.Customproperty insertNewCustomproperty(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "customproperty" element
                 */
                noNamespace.CustompropertyDocument.Customproperty addNewCustomproperty();
                
                /**
                 * Removes the ith "customproperty" element
                 */
                void removeCustomproperty(int i);
                
                /**
                 * Gets the "id" attribute
                 */
                java.lang.String getId();
                
                /**
                 * Gets (as xml) the "id" attribute
                 */
                org.apache.xmlbeans.XmlString xgetId();
                
                /**
                 * True if has "id" attribute
                 */
                boolean isSetId();
                
                /**
                 * Sets the "id" attribute
                 */
                void setId(java.lang.String id);
                
                /**
                 * Sets (as xml) the "id" attribute
                 */
                void xsetId(org.apache.xmlbeans.XmlString id);
                
                /**
                 * Unsets the "id" attribute
                 */
                void unsetId();
                
                /**
                 * Gets the "versionmajor" attribute
                 */
                java.lang.String getVersionmajor();
                
                /**
                 * Gets (as xml) the "versionmajor" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVersionmajor();
                
                /**
                 * True if has "versionmajor" attribute
                 */
                boolean isSetVersionmajor();
                
                /**
                 * Sets the "versionmajor" attribute
                 */
                void setVersionmajor(java.lang.String versionmajor);
                
                /**
                 * Sets (as xml) the "versionmajor" attribute
                 */
                void xsetVersionmajor(org.apache.xmlbeans.XmlString versionmajor);
                
                /**
                 * Unsets the "versionmajor" attribute
                 */
                void unsetVersionmajor();
                
                /**
                 * Gets the "versionminor" attribute
                 */
                java.lang.String getVersionminor();
                
                /**
                 * Gets (as xml) the "versionminor" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVersionminor();
                
                /**
                 * True if has "versionminor" attribute
                 */
                boolean isSetVersionminor();
                
                /**
                 * Sets the "versionminor" attribute
                 */
                void setVersionminor(java.lang.String versionminor);
                
                /**
                 * Sets (as xml) the "versionminor" attribute
                 */
                void xsetVersionminor(org.apache.xmlbeans.XmlString versionminor);
                
                /**
                 * Unsets the "versionminor" attribute
                 */
                void unsetVersionminor();
                
                /**
                 * Gets the "versionrevision" attribute
                 */
                java.lang.String getVersionrevision();
                
                /**
                 * Gets (as xml) the "versionrevision" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVersionrevision();
                
                /**
                 * True if has "versionrevision" attribute
                 */
                boolean isSetVersionrevision();
                
                /**
                 * Sets the "versionrevision" attribute
                 */
                void setVersionrevision(java.lang.String versionrevision);
                
                /**
                 * Sets (as xml) the "versionrevision" attribute
                 */
                void xsetVersionrevision(org.apache.xmlbeans.XmlString versionrevision);
                
                /**
                 * Unsets the "versionrevision" attribute
                 */
                void unsetVersionrevision();
                
                /**
                 * Gets the "versionbuild" attribute
                 */
                java.lang.String getVersionbuild();
                
                /**
                 * Gets (as xml) the "versionbuild" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVersionbuild();
                
                /**
                 * True if has "versionbuild" attribute
                 */
                boolean isSetVersionbuild();
                
                /**
                 * Sets the "versionbuild" attribute
                 */
                void setVersionbuild(java.lang.String versionbuild);
                
                /**
                 * Sets (as xml) the "versionbuild" attribute
                 */
                void xsetVersionbuild(org.apache.xmlbeans.XmlString versionbuild);
                
                /**
                 * Unsets the "versionbuild" attribute
                 */
                void unsetVersionbuild();
                
                /**
                 * Gets the "versionmilestone" attribute
                 */
                java.lang.String getVersionmilestone();
                
                /**
                 * Gets (as xml) the "versionmilestone" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVersionmilestone();
                
                /**
                 * True if has "versionmilestone" attribute
                 */
                boolean isSetVersionmilestone();
                
                /**
                 * Sets the "versionmilestone" attribute
                 */
                void setVersionmilestone(java.lang.String versionmilestone);
                
                /**
                 * Sets (as xml) the "versionmilestone" attribute
                 */
                void xsetVersionmilestone(org.apache.xmlbeans.XmlString versionmilestone);
                
                /**
                 * Unsets the "versionmilestone" attribute
                 */
                void unsetVersionmilestone();
                
                /**
                 * Gets the "session" attribute
                 */
                java.lang.String getSession();
                
                /**
                 * Gets (as xml) the "session" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSession();
                
                /**
                 * True if has "session" attribute
                 */
                boolean isSetSession();
                
                /**
                 * Sets the "session" attribute
                 */
                void setSession(java.lang.String session);
                
                /**
                 * Sets (as xml) the "session" attribute
                 */
                void xsetSession(org.apache.xmlbeans.XmlString session);
                
                /**
                 * Unsets the "session" attribute
                 */
                void unsetSession();
                
                /**
                 * Gets the "marker" attribute
                 */
                java.lang.String getMarker();
                
                /**
                 * Gets (as xml) the "marker" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMarker();
                
                /**
                 * True if has "marker" attribute
                 */
                boolean isSetMarker();
                
                /**
                 * Sets the "marker" attribute
                 */
                void setMarker(java.lang.String marker);
                
                /**
                 * Sets (as xml) the "marker" attribute
                 */
                void xsetMarker(org.apache.xmlbeans.XmlString marker);
                
                /**
                 * Unsets the "marker" attribute
                 */
                void unsetMarker();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo newInstance() {
                      return (noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.TestautomationDocument.Testautomation.Testruninfos.Testruninfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.TestautomationDocument.Testautomation.Testruninfos newInstance() {
                  return (noNamespace.TestautomationDocument.Testautomation.Testruninfos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.TestautomationDocument.Testautomation.Testruninfos newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.TestautomationDocument.Testautomation.Testruninfos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.TestautomationDocument.Testautomation newInstance() {
              return (noNamespace.TestautomationDocument.Testautomation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.TestautomationDocument.Testautomation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.TestautomationDocument.Testautomation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.TestautomationDocument newInstance() {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.TestautomationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.TestautomationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.TestautomationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.TestautomationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.TestautomationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.TestautomationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.TestautomationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.TestautomationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.TestautomationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.TestautomationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.TestautomationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.TestautomationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.TestautomationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.TestautomationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.TestautomationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TestautomationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TestautomationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TestautomationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
