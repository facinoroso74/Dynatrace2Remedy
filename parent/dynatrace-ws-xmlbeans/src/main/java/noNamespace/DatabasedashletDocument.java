/*
 * An XML document type.
 * Localname: databasedashlet
 * Namespace: 
 * Java type: noNamespace.DatabasedashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one databasedashlet(@) element.
 *
 * This is a complex type.
 */
public interface DatabasedashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabasedashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasedashlete5d5doctype");
    
    /**
     * Gets the "databasedashlet" element
     */
    noNamespace.DatabasedashletDocument.Databasedashlet getDatabasedashlet();
    
    /**
     * Sets the "databasedashlet" element
     */
    void setDatabasedashlet(noNamespace.DatabasedashletDocument.Databasedashlet databasedashlet);
    
    /**
     * Appends and returns a new empty "databasedashlet" element
     */
    noNamespace.DatabasedashletDocument.Databasedashlet addNewDatabasedashlet();
    
    /**
     * An XML databasedashlet(@).
     *
     * This is a complex type.
     */
    public interface Databasedashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Databasedashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasedashlet233felemtype");
        
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
         * Gets the "database_topresponsetimes" element
         */
        noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes getDatabaseTopresponsetimes();
        
        /**
         * True if has "database_topresponsetimes" element
         */
        boolean isSetDatabaseTopresponsetimes();
        
        /**
         * Sets the "database_topresponsetimes" element
         */
        void setDatabaseTopresponsetimes(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes databaseTopresponsetimes);
        
        /**
         * Appends and returns a new empty "database_topresponsetimes" element
         */
        noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes addNewDatabaseTopresponsetimes();
        
        /**
         * Unsets the "database_topresponsetimes" element
         */
        void unsetDatabaseTopresponsetimes();
        
        /**
         * Gets the "database_topcounts" element
         */
        noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts getDatabaseTopcounts();
        
        /**
         * True if has "database_topcounts" element
         */
        boolean isSetDatabaseTopcounts();
        
        /**
         * Sets the "database_topcounts" element
         */
        void setDatabaseTopcounts(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts databaseTopcounts);
        
        /**
         * Appends and returns a new empty "database_topcounts" element
         */
        noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts addNewDatabaseTopcounts();
        
        /**
         * Unsets the "database_topcounts" element
         */
        void unsetDatabaseTopcounts();
        
        /**
         * Gets the "database_poolusages" element
         */
        noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages getDatabasePoolusages();
        
        /**
         * True if has "database_poolusages" element
         */
        boolean isSetDatabasePoolusages();
        
        /**
         * Sets the "database_poolusages" element
         */
        void setDatabasePoolusages(noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages databasePoolusages);
        
        /**
         * Appends and returns a new empty "database_poolusages" element
         */
        noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages addNewDatabasePoolusages();
        
        /**
         * Unsets the "database_poolusages" element
         */
        void unsetDatabasePoolusages();
        
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
         * An XML database_topresponsetimes(@).
         *
         * This is a complex type.
         */
        public interface DatabaseTopresponsetimes extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabaseTopresponsetimes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasetopresponsetimes046felemtype");
            
            /**
             * Gets array of all "database_topresponsetime" elements
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime[] getDatabaseTopresponsetimeArray();
            
            /**
             * Gets ith "database_topresponsetime" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime getDatabaseTopresponsetimeArray(int i);
            
            /**
             * Returns number of "database_topresponsetime" element
             */
            int sizeOfDatabaseTopresponsetimeArray();
            
            /**
             * Sets array of all "database_topresponsetime" element
             */
            void setDatabaseTopresponsetimeArray(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime[] databaseTopresponsetimeArray);
            
            /**
             * Sets ith "database_topresponsetime" element
             */
            void setDatabaseTopresponsetimeArray(int i, noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime databaseTopresponsetime);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "database_topresponsetime" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime insertNewDatabaseTopresponsetime(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "database_topresponsetime" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime addNewDatabaseTopresponsetime();
            
            /**
             * Removes the ith "database_topresponsetime" element
             */
            void removeDatabaseTopresponsetime(int i);
            
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
             * An XML database_topresponsetime(@).
             *
             * This is a complex type.
             */
            public interface DatabaseTopresponsetime extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabaseTopresponsetime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasetopresponsetimef89aelemtype");
                
                /**
                 * Gets array of all "database_topresponsetime" elements
                 */
                noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime[] getDatabaseTopresponsetimeArray();
                
                /**
                 * Gets ith "database_topresponsetime" element
                 */
                noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime getDatabaseTopresponsetimeArray(int i);
                
                /**
                 * Returns number of "database_topresponsetime" element
                 */
                int sizeOfDatabaseTopresponsetimeArray();
                
                /**
                 * Sets array of all "database_topresponsetime" element
                 */
                void setDatabaseTopresponsetimeArray(noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime[] databaseTopresponsetimeArray);
                
                /**
                 * Sets ith "database_topresponsetime" element
                 */
                void setDatabaseTopresponsetimeArray(int i, noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime databaseTopresponsetime);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "database_topresponsetime" element
                 */
                noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime insertNewDatabaseTopresponsetime(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "database_topresponsetime" element
                 */
                noNamespace.DatabaseTopresponsetimeDocument.DatabaseTopresponsetime addNewDatabaseTopresponsetime();
                
                /**
                 * Removes the ith "database_topresponsetime" element
                 */
                void removeDatabaseTopresponsetime(int i);
                
                /**
                 * Gets the "dbsource_pool" attribute
                 */
                java.lang.String getDbsourcePool();
                
                /**
                 * Gets (as xml) the "dbsource_pool" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbsourcePool();
                
                /**
                 * True if has "dbsource_pool" attribute
                 */
                boolean isSetDbsourcePool();
                
                /**
                 * Sets the "dbsource_pool" attribute
                 */
                void setDbsourcePool(java.lang.String dbsourcePool);
                
                /**
                 * Sets (as xml) the "dbsource_pool" attribute
                 */
                void xsetDbsourcePool(org.apache.xmlbeans.XmlString dbsourcePool);
                
                /**
                 * Unsets the "dbsource_pool" attribute
                 */
                void unsetDbsourcePool();
                
                /**
                 * Gets the "dbsource_sql" attribute
                 */
                java.lang.String getDbsourceSql();
                
                /**
                 * Gets (as xml) the "dbsource_sql" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbsourceSql();
                
                /**
                 * True if has "dbsource_sql" attribute
                 */
                boolean isSetDbsourceSql();
                
                /**
                 * Sets the "dbsource_sql" attribute
                 */
                void setDbsourceSql(java.lang.String dbsourceSql);
                
                /**
                 * Sets (as xml) the "dbsource_sql" attribute
                 */
                void xsetDbsourceSql(org.apache.xmlbeans.XmlString dbsourceSql);
                
                /**
                 * Unsets the "dbsource_sql" attribute
                 */
                void unsetDbsourceSql();
                
                /**
                 * Gets the "poolname" attribute
                 */
                java.lang.String getPoolname();
                
                /**
                 * Gets (as xml) the "poolname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPoolname();
                
                /**
                 * True if has "poolname" attribute
                 */
                boolean isSetPoolname();
                
                /**
                 * Sets the "poolname" attribute
                 */
                void setPoolname(java.lang.String poolname);
                
                /**
                 * Sets (as xml) the "poolname" attribute
                 */
                void xsetPoolname(org.apache.xmlbeans.XmlString poolname);
                
                /**
                 * Unsets the "poolname" attribute
                 */
                void unsetPoolname();
                
                /**
                 * Gets the "bindvalues" attribute
                 */
                java.lang.String getBindvalues();
                
                /**
                 * Gets (as xml) the "bindvalues" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBindvalues();
                
                /**
                 * True if has "bindvalues" attribute
                 */
                boolean isSetBindvalues();
                
                /**
                 * Sets the "bindvalues" attribute
                 */
                void setBindvalues(java.lang.String bindvalues);
                
                /**
                 * Sets (as xml) the "bindvalues" attribute
                 */
                void xsetBindvalues(org.apache.xmlbeans.XmlString bindvalues);
                
                /**
                 * Unsets the "bindvalues" attribute
                 */
                void unsetBindvalues();
                
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
                 * Gets the "preparations" attribute
                 */
                java.math.BigInteger getPreparations();
                
                /**
                 * Gets (as xml) the "preparations" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPreparations();
                
                /**
                 * True if has "preparations" attribute
                 */
                boolean isSetPreparations();
                
                /**
                 * Sets the "preparations" attribute
                 */
                void setPreparations(java.math.BigInteger preparations);
                
                /**
                 * Sets (as xml) the "preparations" attribute
                 */
                void xsetPreparations(org.apache.xmlbeans.XmlInteger preparations);
                
                /**
                 * Unsets the "preparations" attribute
                 */
                void unsetPreparations();
                
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
                 * Gets the "usedpoolsize_max" attribute
                 */
                java.lang.String getUsedpoolsizeMax();
                
                /**
                 * Gets (as xml) the "usedpoolsize_max" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUsedpoolsizeMax();
                
                /**
                 * True if has "usedpoolsize_max" attribute
                 */
                boolean isSetUsedpoolsizeMax();
                
                /**
                 * Sets the "usedpoolsize_max" attribute
                 */
                void setUsedpoolsizeMax(java.lang.String usedpoolsizeMax);
                
                /**
                 * Sets (as xml) the "usedpoolsize_max" attribute
                 */
                void xsetUsedpoolsizeMax(org.apache.xmlbeans.XmlString usedpoolsizeMax);
                
                /**
                 * Unsets the "usedpoolsize_max" attribute
                 */
                void unsetUsedpoolsizeMax();
                
                /**
                 * Gets the "usedpoolsize_min" attribute
                 */
                java.lang.String getUsedpoolsizeMin();
                
                /**
                 * Gets (as xml) the "usedpoolsize_min" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUsedpoolsizeMin();
                
                /**
                 * True if has "usedpoolsize_min" attribute
                 */
                boolean isSetUsedpoolsizeMin();
                
                /**
                 * Sets the "usedpoolsize_min" attribute
                 */
                void setUsedpoolsizeMin(java.lang.String usedpoolsizeMin);
                
                /**
                 * Sets (as xml) the "usedpoolsize_min" attribute
                 */
                void xsetUsedpoolsizeMin(org.apache.xmlbeans.XmlString usedpoolsizeMin);
                
                /**
                 * Unsets the "usedpoolsize_min" attribute
                 */
                void unsetUsedpoolsizeMin();
                
                /**
                 * Gets the "poolwait_max" attribute
                 */
                double getPoolwaitMax();
                
                /**
                 * Gets (as xml) the "poolwait_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitMax();
                
                /**
                 * True if has "poolwait_max" attribute
                 */
                boolean isSetPoolwaitMax();
                
                /**
                 * Sets the "poolwait_max" attribute
                 */
                void setPoolwaitMax(double poolwaitMax);
                
                /**
                 * Sets (as xml) the "poolwait_max" attribute
                 */
                void xsetPoolwaitMax(org.apache.xmlbeans.XmlDouble poolwaitMax);
                
                /**
                 * Unsets the "poolwait_max" attribute
                 */
                void unsetPoolwaitMax();
                
                /**
                 * Gets the "poolwait_avg" attribute
                 */
                double getPoolwaitAvg();
                
                /**
                 * Gets (as xml) the "poolwait_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitAvg();
                
                /**
                 * True if has "poolwait_avg" attribute
                 */
                boolean isSetPoolwaitAvg();
                
                /**
                 * Sets the "poolwait_avg" attribute
                 */
                void setPoolwaitAvg(double poolwaitAvg);
                
                /**
                 * Sets (as xml) the "poolwait_avg" attribute
                 */
                void xsetPoolwaitAvg(org.apache.xmlbeans.XmlDouble poolwaitAvg);
                
                /**
                 * Unsets the "poolwait_avg" attribute
                 */
                void unsetPoolwaitAvg();
                
                /**
                 * Gets the "last_pool_usage" attribute
                 */
                java.lang.String getLastPoolUsage();
                
                /**
                 * Gets (as xml) the "last_pool_usage" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLastPoolUsage();
                
                /**
                 * True if has "last_pool_usage" attribute
                 */
                boolean isSetLastPoolUsage();
                
                /**
                 * Sets the "last_pool_usage" attribute
                 */
                void setLastPoolUsage(java.lang.String lastPoolUsage);
                
                /**
                 * Sets (as xml) the "last_pool_usage" attribute
                 */
                void xsetLastPoolUsage(org.apache.xmlbeans.XmlString lastPoolUsage);
                
                /**
                 * Unsets the "last_pool_usage" attribute
                 */
                void unsetLastPoolUsage();
                
                /**
                 * Gets the "poolsize" attribute
                 */
                java.math.BigInteger getPoolsize();
                
                /**
                 * Gets (as xml) the "poolsize" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPoolsize();
                
                /**
                 * True if has "poolsize" attribute
                 */
                boolean isSetPoolsize();
                
                /**
                 * Sets the "poolsize" attribute
                 */
                void setPoolsize(java.math.BigInteger poolsize);
                
                /**
                 * Sets (as xml) the "poolsize" attribute
                 */
                void xsetPoolsize(org.apache.xmlbeans.XmlInteger poolsize);
                
                /**
                 * Unsets the "poolsize" attribute
                 */
                void unsetPoolsize();
                
                /**
                 * Gets the "dbtype" attribute
                 */
                java.lang.String getDbtype();
                
                /**
                 * Gets (as xml) the "dbtype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbtype();
                
                /**
                 * True if has "dbtype" attribute
                 */
                boolean isSetDbtype();
                
                /**
                 * Sets the "dbtype" attribute
                 */
                void setDbtype(java.lang.String dbtype);
                
                /**
                 * Sets (as xml) the "dbtype" attribute
                 */
                void xsetDbtype(org.apache.xmlbeans.XmlString dbtype);
                
                /**
                 * Unsets the "dbtype" attribute
                 */
                void unsetDbtype();
                
                /**
                 * Gets the "dbname" attribute
                 */
                java.lang.String getDbname();
                
                /**
                 * Gets (as xml) the "dbname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbname();
                
                /**
                 * True if has "dbname" attribute
                 */
                boolean isSetDbname();
                
                /**
                 * Sets the "dbname" attribute
                 */
                void setDbname(java.lang.String dbname);
                
                /**
                 * Sets (as xml) the "dbname" attribute
                 */
                void xsetDbname(org.apache.xmlbeans.XmlString dbname);
                
                /**
                 * Unsets the "dbname" attribute
                 */
                void unsetDbname();
                
                /**
                 * Gets the "dbhost" attribute
                 */
                java.lang.String getDbhost();
                
                /**
                 * Gets (as xml) the "dbhost" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbhost();
                
                /**
                 * True if has "dbhost" attribute
                 */
                boolean isSetDbhost();
                
                /**
                 * Sets the "dbhost" attribute
                 */
                void setDbhost(java.lang.String dbhost);
                
                /**
                 * Sets (as xml) the "dbhost" attribute
                 */
                void xsetDbhost(org.apache.xmlbeans.XmlString dbhost);
                
                /**
                 * Unsets the "dbhost" attribute
                 */
                void unsetDbhost();
                
                /**
                 * Gets the "dbuser" attribute
                 */
                java.lang.String getDbuser();
                
                /**
                 * Gets (as xml) the "dbuser" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbuser();
                
                /**
                 * True if has "dbuser" attribute
                 */
                boolean isSetDbuser();
                
                /**
                 * Sets the "dbuser" attribute
                 */
                void setDbuser(java.lang.String dbuser);
                
                /**
                 * Sets (as xml) the "dbuser" attribute
                 */
                void xsetDbuser(org.apache.xmlbeans.XmlString dbuser);
                
                /**
                 * Unsets the "dbuser" attribute
                 */
                void unsetDbuser();
                
                /**
                 * Gets the "pooluser" attribute
                 */
                java.lang.String getPooluser();
                
                /**
                 * Gets (as xml) the "pooluser" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPooluser();
                
                /**
                 * True if has "pooluser" attribute
                 */
                boolean isSetPooluser();
                
                /**
                 * Sets the "pooluser" attribute
                 */
                void setPooluser(java.lang.String pooluser);
                
                /**
                 * Sets (as xml) the "pooluser" attribute
                 */
                void xsetPooluser(org.apache.xmlbeans.XmlString pooluser);
                
                /**
                 * Unsets the "pooluser" attribute
                 */
                void unsetPooluser();
                
                /**
                 * Gets the "dburl" attribute
                 */
                java.lang.String getDburl();
                
                /**
                 * Gets (as xml) the "dburl" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDburl();
                
                /**
                 * True if has "dburl" attribute
                 */
                boolean isSetDburl();
                
                /**
                 * Sets the "dburl" attribute
                 */
                void setDburl(java.lang.String dburl);
                
                /**
                 * Sets (as xml) the "dburl" attribute
                 */
                void xsetDburl(org.apache.xmlbeans.XmlString dburl);
                
                /**
                 * Unsets the "dburl" attribute
                 */
                void unsetDburl();
                
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
                 * Gets the "poolwait_sum" attribute
                 */
                double getPoolwaitSum();
                
                /**
                 * Gets (as xml) the "poolwait_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitSum();
                
                /**
                 * True if has "poolwait_sum" attribute
                 */
                boolean isSetPoolwaitSum();
                
                /**
                 * Sets the "poolwait_sum" attribute
                 */
                void setPoolwaitSum(double poolwaitSum);
                
                /**
                 * Sets (as xml) the "poolwait_sum" attribute
                 */
                void xsetPoolwaitSum(org.apache.xmlbeans.XmlDouble poolwaitSum);
                
                /**
                 * Unsets the "poolwait_sum" attribute
                 */
                void unsetPoolwaitSum();
                
                /**
                 * Gets the "poolwait_min" attribute
                 */
                double getPoolwaitMin();
                
                /**
                 * Gets (as xml) the "poolwait_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitMin();
                
                /**
                 * True if has "poolwait_min" attribute
                 */
                boolean isSetPoolwaitMin();
                
                /**
                 * Sets the "poolwait_min" attribute
                 */
                void setPoolwaitMin(double poolwaitMin);
                
                /**
                 * Sets (as xml) the "poolwait_min" attribute
                 */
                void xsetPoolwaitMin(org.apache.xmlbeans.XmlDouble poolwaitMin);
                
                /**
                 * Unsets the "poolwait_min" attribute
                 */
                void unsetPoolwaitMin();
                
                /**
                 * Gets the "response_time" attribute
                 */
                double getResponseTime();
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTime();
                
                /**
                 * True if has "response_time" attribute
                 */
                boolean isSetResponseTime();
                
                /**
                 * Sets the "response_time" attribute
                 */
                void setResponseTime(double responseTime);
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                void xsetResponseTime(org.apache.xmlbeans.XmlDouble responseTime);
                
                /**
                 * Unsets the "response_time" attribute
                 */
                void unsetResponseTime();
                
                /**
                 * Gets the "response_time_per_execution" attribute
                 */
                double getResponseTimePerExecution();
                
                /**
                 * Gets (as xml) the "response_time_per_execution" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerExecution();
                
                /**
                 * True if has "response_time_per_execution" attribute
                 */
                boolean isSetResponseTimePerExecution();
                
                /**
                 * Sets the "response_time_per_execution" attribute
                 */
                void setResponseTimePerExecution(double responseTimePerExecution);
                
                /**
                 * Sets (as xml) the "response_time_per_execution" attribute
                 */
                void xsetResponseTimePerExecution(org.apache.xmlbeans.XmlDouble responseTimePerExecution);
                
                /**
                 * Unsets the "response_time_per_execution" attribute
                 */
                void unsetResponseTimePerExecution();
                
                /**
                 * Gets the "response_time_per_transaction" attribute
                 */
                double getResponseTimePerTransaction();
                
                /**
                 * Gets (as xml) the "response_time_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerTransaction();
                
                /**
                 * True if has "response_time_per_transaction" attribute
                 */
                boolean isSetResponseTimePerTransaction();
                
                /**
                 * Sets the "response_time_per_transaction" attribute
                 */
                void setResponseTimePerTransaction(double responseTimePerTransaction);
                
                /**
                 * Sets (as xml) the "response_time_per_transaction" attribute
                 */
                void xsetResponseTimePerTransaction(org.apache.xmlbeans.XmlDouble responseTimePerTransaction);
                
                /**
                 * Unsets the "response_time_per_transaction" attribute
                 */
                void unsetResponseTimePerTransaction();
                
                /**
                 * Gets the "response_time_per_passing_transaction" attribute
                 */
                double getResponseTimePerPassingTransaction();
                
                /**
                 * Gets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerPassingTransaction();
                
                /**
                 * True if has "response_time_per_passing_transaction" attribute
                 */
                boolean isSetResponseTimePerPassingTransaction();
                
                /**
                 * Sets the "response_time_per_passing_transaction" attribute
                 */
                void setResponseTimePerPassingTransaction(double responseTimePerPassingTransaction);
                
                /**
                 * Sets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                void xsetResponseTimePerPassingTransaction(org.apache.xmlbeans.XmlDouble responseTimePerPassingTransaction);
                
                /**
                 * Unsets the "response_time_per_passing_transaction" attribute
                 */
                void unsetResponseTimePerPassingTransaction();
                
                /**
                 * Gets the "executions_per_transaction" attribute
                 */
                double getExecutionsPerTransaction();
                
                /**
                 * Gets (as xml) the "executions_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecutionsPerTransaction();
                
                /**
                 * True if has "executions_per_transaction" attribute
                 */
                boolean isSetExecutionsPerTransaction();
                
                /**
                 * Sets the "executions_per_transaction" attribute
                 */
                void setExecutionsPerTransaction(double executionsPerTransaction);
                
                /**
                 * Sets (as xml) the "executions_per_transaction" attribute
                 */
                void xsetExecutionsPerTransaction(org.apache.xmlbeans.XmlDouble executionsPerTransaction);
                
                /**
                 * Unsets the "executions_per_transaction" attribute
                 */
                void unsetExecutionsPerTransaction();
                
                /**
                 * Gets the "executions_per_passing_transaction" attribute
                 */
                double getExecutionsPerPassingTransaction();
                
                /**
                 * Gets (as xml) the "executions_per_passing_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecutionsPerPassingTransaction();
                
                /**
                 * True if has "executions_per_passing_transaction" attribute
                 */
                boolean isSetExecutionsPerPassingTransaction();
                
                /**
                 * Sets the "executions_per_passing_transaction" attribute
                 */
                void setExecutionsPerPassingTransaction(double executionsPerPassingTransaction);
                
                /**
                 * Sets (as xml) the "executions_per_passing_transaction" attribute
                 */
                void xsetExecutionsPerPassingTransaction(org.apache.xmlbeans.XmlDouble executionsPerPassingTransaction);
                
                /**
                 * Unsets the "executions_per_passing_transaction" attribute
                 */
                void unsetExecutionsPerPassingTransaction();
                
                /**
                 * Gets the "pct_of_transactions_calling" attribute
                 */
                java.lang.String getPctOfTransactionsCalling();
                
                /**
                 * Gets (as xml) the "pct_of_transactions_calling" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPctOfTransactionsCalling();
                
                /**
                 * True if has "pct_of_transactions_calling" attribute
                 */
                boolean isSetPctOfTransactionsCalling();
                
                /**
                 * Sets the "pct_of_transactions_calling" attribute
                 */
                void setPctOfTransactionsCalling(java.lang.String pctOfTransactionsCalling);
                
                /**
                 * Sets (as xml) the "pct_of_transactions_calling" attribute
                 */
                void xsetPctOfTransactionsCalling(org.apache.xmlbeans.XmlString pctOfTransactionsCalling);
                
                /**
                 * Unsets the "pct_of_transactions_calling" attribute
                 */
                void unsetPctOfTransactionsCalling();
                
                /**
                 * Gets the "pool_wait_time_per_transaction" attribute
                 */
                double getPoolWaitTimePerTransaction();
                
                /**
                 * Gets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolWaitTimePerTransaction();
                
                /**
                 * True if has "pool_wait_time_per_transaction" attribute
                 */
                boolean isSetPoolWaitTimePerTransaction();
                
                /**
                 * Sets the "pool_wait_time_per_transaction" attribute
                 */
                void setPoolWaitTimePerTransaction(double poolWaitTimePerTransaction);
                
                /**
                 * Sets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                void xsetPoolWaitTimePerTransaction(org.apache.xmlbeans.XmlDouble poolWaitTimePerTransaction);
                
                /**
                 * Unsets the "pool_wait_time_per_transaction" attribute
                 */
                void unsetPoolWaitTimePerTransaction();
                
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
                 * Gets the "response_time_contribution" attribute
                 */
                java.lang.String getResponseTimeContribution();
                
                /**
                 * Gets (as xml) the "response_time_contribution" attribute
                 */
                org.apache.xmlbeans.XmlString xgetResponseTimeContribution();
                
                /**
                 * True if has "response_time_contribution" attribute
                 */
                boolean isSetResponseTimeContribution();
                
                /**
                 * Sets the "response_time_contribution" attribute
                 */
                void setResponseTimeContribution(java.lang.String responseTimeContribution);
                
                /**
                 * Sets (as xml) the "response_time_contribution" attribute
                 */
                void xsetResponseTimeContribution(org.apache.xmlbeans.XmlString responseTimeContribution);
                
                /**
                 * Unsets the "response_time_contribution" attribute
                 */
                void unsetResponseTimeContribution();
                
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
                 * Gets the "rowcount" attribute
                 */
                java.math.BigInteger getRowcount();
                
                /**
                 * Gets (as xml) the "rowcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRowcount();
                
                /**
                 * True if has "rowcount" attribute
                 */
                boolean isSetRowcount();
                
                /**
                 * Sets the "rowcount" attribute
                 */
                void setRowcount(java.math.BigInteger rowcount);
                
                /**
                 * Sets (as xml) the "rowcount" attribute
                 */
                void xsetRowcount(org.apache.xmlbeans.XmlInteger rowcount);
                
                /**
                 * Unsets the "rowcount" attribute
                 */
                void unsetRowcount();
                
                /**
                 * Gets the "roundtrips" attribute
                 */
                java.math.BigInteger getRoundtrips();
                
                /**
                 * Gets (as xml) the "roundtrips" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRoundtrips();
                
                /**
                 * True if has "roundtrips" attribute
                 */
                boolean isSetRoundtrips();
                
                /**
                 * Sets the "roundtrips" attribute
                 */
                void setRoundtrips(java.math.BigInteger roundtrips);
                
                /**
                 * Sets (as xml) the "roundtrips" attribute
                 */
                void xsetRoundtrips(org.apache.xmlbeans.XmlInteger roundtrips);
                
                /**
                 * Unsets the "roundtrips" attribute
                 */
                void unsetRoundtrips();
                
                /**
                 * Gets the "pooltype" attribute
                 */
                java.lang.String getPooltype();
                
                /**
                 * Gets (as xml) the "pooltype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPooltype();
                
                /**
                 * True if has "pooltype" attribute
                 */
                boolean isSetPooltype();
                
                /**
                 * Sets the "pooltype" attribute
                 */
                void setPooltype(java.lang.String pooltype);
                
                /**
                 * Sets (as xml) the "pooltype" attribute
                 */
                void xsetPooltype(org.apache.xmlbeans.XmlString pooltype);
                
                /**
                 * Unsets the "pooltype" attribute
                 */
                void unsetPooltype();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime newInstance() {
                      return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes.DatabaseTopresponsetime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes newInstance() {
                  return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopresponsetimes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML database_topcounts(@).
         *
         * This is a complex type.
         */
        public interface DatabaseTopcounts extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabaseTopcounts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasetopcounts4c60elemtype");
            
            /**
             * Gets array of all "database_topcount" elements
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount[] getDatabaseTopcountArray();
            
            /**
             * Gets ith "database_topcount" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount getDatabaseTopcountArray(int i);
            
            /**
             * Returns number of "database_topcount" element
             */
            int sizeOfDatabaseTopcountArray();
            
            /**
             * Sets array of all "database_topcount" element
             */
            void setDatabaseTopcountArray(noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount[] databaseTopcountArray);
            
            /**
             * Sets ith "database_topcount" element
             */
            void setDatabaseTopcountArray(int i, noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount databaseTopcount);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "database_topcount" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount insertNewDatabaseTopcount(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "database_topcount" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount addNewDatabaseTopcount();
            
            /**
             * Removes the ith "database_topcount" element
             */
            void removeDatabaseTopcount(int i);
            
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
             * An XML database_topcount(@).
             *
             * This is a complex type.
             */
            public interface DatabaseTopcount extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabaseTopcount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasetopcountc806elemtype");
                
                /**
                 * Gets array of all "database_topcount" elements
                 */
                noNamespace.DatabaseTopcountDocument.DatabaseTopcount[] getDatabaseTopcountArray();
                
                /**
                 * Gets ith "database_topcount" element
                 */
                noNamespace.DatabaseTopcountDocument.DatabaseTopcount getDatabaseTopcountArray(int i);
                
                /**
                 * Returns number of "database_topcount" element
                 */
                int sizeOfDatabaseTopcountArray();
                
                /**
                 * Sets array of all "database_topcount" element
                 */
                void setDatabaseTopcountArray(noNamespace.DatabaseTopcountDocument.DatabaseTopcount[] databaseTopcountArray);
                
                /**
                 * Sets ith "database_topcount" element
                 */
                void setDatabaseTopcountArray(int i, noNamespace.DatabaseTopcountDocument.DatabaseTopcount databaseTopcount);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "database_topcount" element
                 */
                noNamespace.DatabaseTopcountDocument.DatabaseTopcount insertNewDatabaseTopcount(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "database_topcount" element
                 */
                noNamespace.DatabaseTopcountDocument.DatabaseTopcount addNewDatabaseTopcount();
                
                /**
                 * Removes the ith "database_topcount" element
                 */
                void removeDatabaseTopcount(int i);
                
                /**
                 * Gets the "dbsource_pool" attribute
                 */
                java.lang.String getDbsourcePool();
                
                /**
                 * Gets (as xml) the "dbsource_pool" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbsourcePool();
                
                /**
                 * True if has "dbsource_pool" attribute
                 */
                boolean isSetDbsourcePool();
                
                /**
                 * Sets the "dbsource_pool" attribute
                 */
                void setDbsourcePool(java.lang.String dbsourcePool);
                
                /**
                 * Sets (as xml) the "dbsource_pool" attribute
                 */
                void xsetDbsourcePool(org.apache.xmlbeans.XmlString dbsourcePool);
                
                /**
                 * Unsets the "dbsource_pool" attribute
                 */
                void unsetDbsourcePool();
                
                /**
                 * Gets the "dbsource_sql" attribute
                 */
                java.lang.String getDbsourceSql();
                
                /**
                 * Gets (as xml) the "dbsource_sql" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbsourceSql();
                
                /**
                 * True if has "dbsource_sql" attribute
                 */
                boolean isSetDbsourceSql();
                
                /**
                 * Sets the "dbsource_sql" attribute
                 */
                void setDbsourceSql(java.lang.String dbsourceSql);
                
                /**
                 * Sets (as xml) the "dbsource_sql" attribute
                 */
                void xsetDbsourceSql(org.apache.xmlbeans.XmlString dbsourceSql);
                
                /**
                 * Unsets the "dbsource_sql" attribute
                 */
                void unsetDbsourceSql();
                
                /**
                 * Gets the "poolname" attribute
                 */
                java.lang.String getPoolname();
                
                /**
                 * Gets (as xml) the "poolname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPoolname();
                
                /**
                 * True if has "poolname" attribute
                 */
                boolean isSetPoolname();
                
                /**
                 * Sets the "poolname" attribute
                 */
                void setPoolname(java.lang.String poolname);
                
                /**
                 * Sets (as xml) the "poolname" attribute
                 */
                void xsetPoolname(org.apache.xmlbeans.XmlString poolname);
                
                /**
                 * Unsets the "poolname" attribute
                 */
                void unsetPoolname();
                
                /**
                 * Gets the "bindvalues" attribute
                 */
                java.lang.String getBindvalues();
                
                /**
                 * Gets (as xml) the "bindvalues" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBindvalues();
                
                /**
                 * True if has "bindvalues" attribute
                 */
                boolean isSetBindvalues();
                
                /**
                 * Sets the "bindvalues" attribute
                 */
                void setBindvalues(java.lang.String bindvalues);
                
                /**
                 * Sets (as xml) the "bindvalues" attribute
                 */
                void xsetBindvalues(org.apache.xmlbeans.XmlString bindvalues);
                
                /**
                 * Unsets the "bindvalues" attribute
                 */
                void unsetBindvalues();
                
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
                 * Gets the "preparations" attribute
                 */
                java.math.BigInteger getPreparations();
                
                /**
                 * Gets (as xml) the "preparations" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPreparations();
                
                /**
                 * True if has "preparations" attribute
                 */
                boolean isSetPreparations();
                
                /**
                 * Sets the "preparations" attribute
                 */
                void setPreparations(java.math.BigInteger preparations);
                
                /**
                 * Sets (as xml) the "preparations" attribute
                 */
                void xsetPreparations(org.apache.xmlbeans.XmlInteger preparations);
                
                /**
                 * Unsets the "preparations" attribute
                 */
                void unsetPreparations();
                
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
                 * Gets the "usedpoolsize_max" attribute
                 */
                java.lang.String getUsedpoolsizeMax();
                
                /**
                 * Gets (as xml) the "usedpoolsize_max" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUsedpoolsizeMax();
                
                /**
                 * True if has "usedpoolsize_max" attribute
                 */
                boolean isSetUsedpoolsizeMax();
                
                /**
                 * Sets the "usedpoolsize_max" attribute
                 */
                void setUsedpoolsizeMax(java.lang.String usedpoolsizeMax);
                
                /**
                 * Sets (as xml) the "usedpoolsize_max" attribute
                 */
                void xsetUsedpoolsizeMax(org.apache.xmlbeans.XmlString usedpoolsizeMax);
                
                /**
                 * Unsets the "usedpoolsize_max" attribute
                 */
                void unsetUsedpoolsizeMax();
                
                /**
                 * Gets the "usedpoolsize_min" attribute
                 */
                java.lang.String getUsedpoolsizeMin();
                
                /**
                 * Gets (as xml) the "usedpoolsize_min" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUsedpoolsizeMin();
                
                /**
                 * True if has "usedpoolsize_min" attribute
                 */
                boolean isSetUsedpoolsizeMin();
                
                /**
                 * Sets the "usedpoolsize_min" attribute
                 */
                void setUsedpoolsizeMin(java.lang.String usedpoolsizeMin);
                
                /**
                 * Sets (as xml) the "usedpoolsize_min" attribute
                 */
                void xsetUsedpoolsizeMin(org.apache.xmlbeans.XmlString usedpoolsizeMin);
                
                /**
                 * Unsets the "usedpoolsize_min" attribute
                 */
                void unsetUsedpoolsizeMin();
                
                /**
                 * Gets the "poolwait_max" attribute
                 */
                double getPoolwaitMax();
                
                /**
                 * Gets (as xml) the "poolwait_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitMax();
                
                /**
                 * True if has "poolwait_max" attribute
                 */
                boolean isSetPoolwaitMax();
                
                /**
                 * Sets the "poolwait_max" attribute
                 */
                void setPoolwaitMax(double poolwaitMax);
                
                /**
                 * Sets (as xml) the "poolwait_max" attribute
                 */
                void xsetPoolwaitMax(org.apache.xmlbeans.XmlDouble poolwaitMax);
                
                /**
                 * Unsets the "poolwait_max" attribute
                 */
                void unsetPoolwaitMax();
                
                /**
                 * Gets the "poolwait_avg" attribute
                 */
                double getPoolwaitAvg();
                
                /**
                 * Gets (as xml) the "poolwait_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitAvg();
                
                /**
                 * True if has "poolwait_avg" attribute
                 */
                boolean isSetPoolwaitAvg();
                
                /**
                 * Sets the "poolwait_avg" attribute
                 */
                void setPoolwaitAvg(double poolwaitAvg);
                
                /**
                 * Sets (as xml) the "poolwait_avg" attribute
                 */
                void xsetPoolwaitAvg(org.apache.xmlbeans.XmlDouble poolwaitAvg);
                
                /**
                 * Unsets the "poolwait_avg" attribute
                 */
                void unsetPoolwaitAvg();
                
                /**
                 * Gets the "last_pool_usage" attribute
                 */
                java.lang.String getLastPoolUsage();
                
                /**
                 * Gets (as xml) the "last_pool_usage" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLastPoolUsage();
                
                /**
                 * True if has "last_pool_usage" attribute
                 */
                boolean isSetLastPoolUsage();
                
                /**
                 * Sets the "last_pool_usage" attribute
                 */
                void setLastPoolUsage(java.lang.String lastPoolUsage);
                
                /**
                 * Sets (as xml) the "last_pool_usage" attribute
                 */
                void xsetLastPoolUsage(org.apache.xmlbeans.XmlString lastPoolUsage);
                
                /**
                 * Unsets the "last_pool_usage" attribute
                 */
                void unsetLastPoolUsage();
                
                /**
                 * Gets the "poolsize" attribute
                 */
                java.math.BigInteger getPoolsize();
                
                /**
                 * Gets (as xml) the "poolsize" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPoolsize();
                
                /**
                 * True if has "poolsize" attribute
                 */
                boolean isSetPoolsize();
                
                /**
                 * Sets the "poolsize" attribute
                 */
                void setPoolsize(java.math.BigInteger poolsize);
                
                /**
                 * Sets (as xml) the "poolsize" attribute
                 */
                void xsetPoolsize(org.apache.xmlbeans.XmlInteger poolsize);
                
                /**
                 * Unsets the "poolsize" attribute
                 */
                void unsetPoolsize();
                
                /**
                 * Gets the "dbtype" attribute
                 */
                java.lang.String getDbtype();
                
                /**
                 * Gets (as xml) the "dbtype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbtype();
                
                /**
                 * True if has "dbtype" attribute
                 */
                boolean isSetDbtype();
                
                /**
                 * Sets the "dbtype" attribute
                 */
                void setDbtype(java.lang.String dbtype);
                
                /**
                 * Sets (as xml) the "dbtype" attribute
                 */
                void xsetDbtype(org.apache.xmlbeans.XmlString dbtype);
                
                /**
                 * Unsets the "dbtype" attribute
                 */
                void unsetDbtype();
                
                /**
                 * Gets the "dbname" attribute
                 */
                java.lang.String getDbname();
                
                /**
                 * Gets (as xml) the "dbname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbname();
                
                /**
                 * True if has "dbname" attribute
                 */
                boolean isSetDbname();
                
                /**
                 * Sets the "dbname" attribute
                 */
                void setDbname(java.lang.String dbname);
                
                /**
                 * Sets (as xml) the "dbname" attribute
                 */
                void xsetDbname(org.apache.xmlbeans.XmlString dbname);
                
                /**
                 * Unsets the "dbname" attribute
                 */
                void unsetDbname();
                
                /**
                 * Gets the "dbhost" attribute
                 */
                java.lang.String getDbhost();
                
                /**
                 * Gets (as xml) the "dbhost" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbhost();
                
                /**
                 * True if has "dbhost" attribute
                 */
                boolean isSetDbhost();
                
                /**
                 * Sets the "dbhost" attribute
                 */
                void setDbhost(java.lang.String dbhost);
                
                /**
                 * Sets (as xml) the "dbhost" attribute
                 */
                void xsetDbhost(org.apache.xmlbeans.XmlString dbhost);
                
                /**
                 * Unsets the "dbhost" attribute
                 */
                void unsetDbhost();
                
                /**
                 * Gets the "dbuser" attribute
                 */
                java.lang.String getDbuser();
                
                /**
                 * Gets (as xml) the "dbuser" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbuser();
                
                /**
                 * True if has "dbuser" attribute
                 */
                boolean isSetDbuser();
                
                /**
                 * Sets the "dbuser" attribute
                 */
                void setDbuser(java.lang.String dbuser);
                
                /**
                 * Sets (as xml) the "dbuser" attribute
                 */
                void xsetDbuser(org.apache.xmlbeans.XmlString dbuser);
                
                /**
                 * Unsets the "dbuser" attribute
                 */
                void unsetDbuser();
                
                /**
                 * Gets the "pooluser" attribute
                 */
                java.lang.String getPooluser();
                
                /**
                 * Gets (as xml) the "pooluser" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPooluser();
                
                /**
                 * True if has "pooluser" attribute
                 */
                boolean isSetPooluser();
                
                /**
                 * Sets the "pooluser" attribute
                 */
                void setPooluser(java.lang.String pooluser);
                
                /**
                 * Sets (as xml) the "pooluser" attribute
                 */
                void xsetPooluser(org.apache.xmlbeans.XmlString pooluser);
                
                /**
                 * Unsets the "pooluser" attribute
                 */
                void unsetPooluser();
                
                /**
                 * Gets the "dburl" attribute
                 */
                java.lang.String getDburl();
                
                /**
                 * Gets (as xml) the "dburl" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDburl();
                
                /**
                 * True if has "dburl" attribute
                 */
                boolean isSetDburl();
                
                /**
                 * Sets the "dburl" attribute
                 */
                void setDburl(java.lang.String dburl);
                
                /**
                 * Sets (as xml) the "dburl" attribute
                 */
                void xsetDburl(org.apache.xmlbeans.XmlString dburl);
                
                /**
                 * Unsets the "dburl" attribute
                 */
                void unsetDburl();
                
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
                 * Gets the "poolwait_sum" attribute
                 */
                double getPoolwaitSum();
                
                /**
                 * Gets (as xml) the "poolwait_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitSum();
                
                /**
                 * True if has "poolwait_sum" attribute
                 */
                boolean isSetPoolwaitSum();
                
                /**
                 * Sets the "poolwait_sum" attribute
                 */
                void setPoolwaitSum(double poolwaitSum);
                
                /**
                 * Sets (as xml) the "poolwait_sum" attribute
                 */
                void xsetPoolwaitSum(org.apache.xmlbeans.XmlDouble poolwaitSum);
                
                /**
                 * Unsets the "poolwait_sum" attribute
                 */
                void unsetPoolwaitSum();
                
                /**
                 * Gets the "poolwait_min" attribute
                 */
                double getPoolwaitMin();
                
                /**
                 * Gets (as xml) the "poolwait_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitMin();
                
                /**
                 * True if has "poolwait_min" attribute
                 */
                boolean isSetPoolwaitMin();
                
                /**
                 * Sets the "poolwait_min" attribute
                 */
                void setPoolwaitMin(double poolwaitMin);
                
                /**
                 * Sets (as xml) the "poolwait_min" attribute
                 */
                void xsetPoolwaitMin(org.apache.xmlbeans.XmlDouble poolwaitMin);
                
                /**
                 * Unsets the "poolwait_min" attribute
                 */
                void unsetPoolwaitMin();
                
                /**
                 * Gets the "response_time" attribute
                 */
                double getResponseTime();
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTime();
                
                /**
                 * True if has "response_time" attribute
                 */
                boolean isSetResponseTime();
                
                /**
                 * Sets the "response_time" attribute
                 */
                void setResponseTime(double responseTime);
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                void xsetResponseTime(org.apache.xmlbeans.XmlDouble responseTime);
                
                /**
                 * Unsets the "response_time" attribute
                 */
                void unsetResponseTime();
                
                /**
                 * Gets the "response_time_per_execution" attribute
                 */
                double getResponseTimePerExecution();
                
                /**
                 * Gets (as xml) the "response_time_per_execution" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerExecution();
                
                /**
                 * True if has "response_time_per_execution" attribute
                 */
                boolean isSetResponseTimePerExecution();
                
                /**
                 * Sets the "response_time_per_execution" attribute
                 */
                void setResponseTimePerExecution(double responseTimePerExecution);
                
                /**
                 * Sets (as xml) the "response_time_per_execution" attribute
                 */
                void xsetResponseTimePerExecution(org.apache.xmlbeans.XmlDouble responseTimePerExecution);
                
                /**
                 * Unsets the "response_time_per_execution" attribute
                 */
                void unsetResponseTimePerExecution();
                
                /**
                 * Gets the "response_time_per_transaction" attribute
                 */
                double getResponseTimePerTransaction();
                
                /**
                 * Gets (as xml) the "response_time_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerTransaction();
                
                /**
                 * True if has "response_time_per_transaction" attribute
                 */
                boolean isSetResponseTimePerTransaction();
                
                /**
                 * Sets the "response_time_per_transaction" attribute
                 */
                void setResponseTimePerTransaction(double responseTimePerTransaction);
                
                /**
                 * Sets (as xml) the "response_time_per_transaction" attribute
                 */
                void xsetResponseTimePerTransaction(org.apache.xmlbeans.XmlDouble responseTimePerTransaction);
                
                /**
                 * Unsets the "response_time_per_transaction" attribute
                 */
                void unsetResponseTimePerTransaction();
                
                /**
                 * Gets the "response_time_per_passing_transaction" attribute
                 */
                double getResponseTimePerPassingTransaction();
                
                /**
                 * Gets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerPassingTransaction();
                
                /**
                 * True if has "response_time_per_passing_transaction" attribute
                 */
                boolean isSetResponseTimePerPassingTransaction();
                
                /**
                 * Sets the "response_time_per_passing_transaction" attribute
                 */
                void setResponseTimePerPassingTransaction(double responseTimePerPassingTransaction);
                
                /**
                 * Sets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                void xsetResponseTimePerPassingTransaction(org.apache.xmlbeans.XmlDouble responseTimePerPassingTransaction);
                
                /**
                 * Unsets the "response_time_per_passing_transaction" attribute
                 */
                void unsetResponseTimePerPassingTransaction();
                
                /**
                 * Gets the "executions_per_transaction" attribute
                 */
                double getExecutionsPerTransaction();
                
                /**
                 * Gets (as xml) the "executions_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecutionsPerTransaction();
                
                /**
                 * True if has "executions_per_transaction" attribute
                 */
                boolean isSetExecutionsPerTransaction();
                
                /**
                 * Sets the "executions_per_transaction" attribute
                 */
                void setExecutionsPerTransaction(double executionsPerTransaction);
                
                /**
                 * Sets (as xml) the "executions_per_transaction" attribute
                 */
                void xsetExecutionsPerTransaction(org.apache.xmlbeans.XmlDouble executionsPerTransaction);
                
                /**
                 * Unsets the "executions_per_transaction" attribute
                 */
                void unsetExecutionsPerTransaction();
                
                /**
                 * Gets the "executions_per_passing_transaction" attribute
                 */
                double getExecutionsPerPassingTransaction();
                
                /**
                 * Gets (as xml) the "executions_per_passing_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecutionsPerPassingTransaction();
                
                /**
                 * True if has "executions_per_passing_transaction" attribute
                 */
                boolean isSetExecutionsPerPassingTransaction();
                
                /**
                 * Sets the "executions_per_passing_transaction" attribute
                 */
                void setExecutionsPerPassingTransaction(double executionsPerPassingTransaction);
                
                /**
                 * Sets (as xml) the "executions_per_passing_transaction" attribute
                 */
                void xsetExecutionsPerPassingTransaction(org.apache.xmlbeans.XmlDouble executionsPerPassingTransaction);
                
                /**
                 * Unsets the "executions_per_passing_transaction" attribute
                 */
                void unsetExecutionsPerPassingTransaction();
                
                /**
                 * Gets the "pct_of_transactions_calling" attribute
                 */
                java.lang.String getPctOfTransactionsCalling();
                
                /**
                 * Gets (as xml) the "pct_of_transactions_calling" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPctOfTransactionsCalling();
                
                /**
                 * True if has "pct_of_transactions_calling" attribute
                 */
                boolean isSetPctOfTransactionsCalling();
                
                /**
                 * Sets the "pct_of_transactions_calling" attribute
                 */
                void setPctOfTransactionsCalling(java.lang.String pctOfTransactionsCalling);
                
                /**
                 * Sets (as xml) the "pct_of_transactions_calling" attribute
                 */
                void xsetPctOfTransactionsCalling(org.apache.xmlbeans.XmlString pctOfTransactionsCalling);
                
                /**
                 * Unsets the "pct_of_transactions_calling" attribute
                 */
                void unsetPctOfTransactionsCalling();
                
                /**
                 * Gets the "pool_wait_time_per_transaction" attribute
                 */
                double getPoolWaitTimePerTransaction();
                
                /**
                 * Gets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolWaitTimePerTransaction();
                
                /**
                 * True if has "pool_wait_time_per_transaction" attribute
                 */
                boolean isSetPoolWaitTimePerTransaction();
                
                /**
                 * Sets the "pool_wait_time_per_transaction" attribute
                 */
                void setPoolWaitTimePerTransaction(double poolWaitTimePerTransaction);
                
                /**
                 * Sets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                void xsetPoolWaitTimePerTransaction(org.apache.xmlbeans.XmlDouble poolWaitTimePerTransaction);
                
                /**
                 * Unsets the "pool_wait_time_per_transaction" attribute
                 */
                void unsetPoolWaitTimePerTransaction();
                
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
                 * Gets the "response_time_contribution" attribute
                 */
                java.lang.String getResponseTimeContribution();
                
                /**
                 * Gets (as xml) the "response_time_contribution" attribute
                 */
                org.apache.xmlbeans.XmlString xgetResponseTimeContribution();
                
                /**
                 * True if has "response_time_contribution" attribute
                 */
                boolean isSetResponseTimeContribution();
                
                /**
                 * Sets the "response_time_contribution" attribute
                 */
                void setResponseTimeContribution(java.lang.String responseTimeContribution);
                
                /**
                 * Sets (as xml) the "response_time_contribution" attribute
                 */
                void xsetResponseTimeContribution(org.apache.xmlbeans.XmlString responseTimeContribution);
                
                /**
                 * Unsets the "response_time_contribution" attribute
                 */
                void unsetResponseTimeContribution();
                
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
                 * Gets the "rowcount" attribute
                 */
                java.math.BigInteger getRowcount();
                
                /**
                 * Gets (as xml) the "rowcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRowcount();
                
                /**
                 * True if has "rowcount" attribute
                 */
                boolean isSetRowcount();
                
                /**
                 * Sets the "rowcount" attribute
                 */
                void setRowcount(java.math.BigInteger rowcount);
                
                /**
                 * Sets (as xml) the "rowcount" attribute
                 */
                void xsetRowcount(org.apache.xmlbeans.XmlInteger rowcount);
                
                /**
                 * Unsets the "rowcount" attribute
                 */
                void unsetRowcount();
                
                /**
                 * Gets the "roundtrips" attribute
                 */
                java.math.BigInteger getRoundtrips();
                
                /**
                 * Gets (as xml) the "roundtrips" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRoundtrips();
                
                /**
                 * True if has "roundtrips" attribute
                 */
                boolean isSetRoundtrips();
                
                /**
                 * Sets the "roundtrips" attribute
                 */
                void setRoundtrips(java.math.BigInteger roundtrips);
                
                /**
                 * Sets (as xml) the "roundtrips" attribute
                 */
                void xsetRoundtrips(org.apache.xmlbeans.XmlInteger roundtrips);
                
                /**
                 * Unsets the "roundtrips" attribute
                 */
                void unsetRoundtrips();
                
                /**
                 * Gets the "pooltype" attribute
                 */
                java.lang.String getPooltype();
                
                /**
                 * Gets (as xml) the "pooltype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPooltype();
                
                /**
                 * True if has "pooltype" attribute
                 */
                boolean isSetPooltype();
                
                /**
                 * Sets the "pooltype" attribute
                 */
                void setPooltype(java.lang.String pooltype);
                
                /**
                 * Sets (as xml) the "pooltype" attribute
                 */
                void xsetPooltype(org.apache.xmlbeans.XmlString pooltype);
                
                /**
                 * Unsets the "pooltype" attribute
                 */
                void unsetPooltype();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount newInstance() {
                      return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts.DatabaseTopcount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts newInstance() {
                  return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabaseTopcounts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML database_poolusages(@).
         *
         * This is a complex type.
         */
        public interface DatabasePoolusages extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabasePoolusages.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasepoolusagesd00delemtype");
            
            /**
             * Gets array of all "database_poolusage" elements
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage[] getDatabasePoolusageArray();
            
            /**
             * Gets ith "database_poolusage" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage getDatabasePoolusageArray(int i);
            
            /**
             * Returns number of "database_poolusage" element
             */
            int sizeOfDatabasePoolusageArray();
            
            /**
             * Sets array of all "database_poolusage" element
             */
            void setDatabasePoolusageArray(noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage[] databasePoolusageArray);
            
            /**
             * Sets ith "database_poolusage" element
             */
            void setDatabasePoolusageArray(int i, noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage databasePoolusage);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "database_poolusage" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage insertNewDatabasePoolusage(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "database_poolusage" element
             */
            noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage addNewDatabasePoolusage();
            
            /**
             * Removes the ith "database_poolusage" element
             */
            void removeDatabasePoolusage(int i);
            
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
             * An XML database_poolusage(@).
             *
             * This is a complex type.
             */
            public interface DatabasePoolusage extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatabasePoolusage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("databasepoolusage439aelemtype");
                
                /**
                 * Gets array of all "database_poolusage" elements
                 */
                noNamespace.DatabasePoolusageDocument.DatabasePoolusage[] getDatabasePoolusageArray();
                
                /**
                 * Gets ith "database_poolusage" element
                 */
                noNamespace.DatabasePoolusageDocument.DatabasePoolusage getDatabasePoolusageArray(int i);
                
                /**
                 * Returns number of "database_poolusage" element
                 */
                int sizeOfDatabasePoolusageArray();
                
                /**
                 * Sets array of all "database_poolusage" element
                 */
                void setDatabasePoolusageArray(noNamespace.DatabasePoolusageDocument.DatabasePoolusage[] databasePoolusageArray);
                
                /**
                 * Sets ith "database_poolusage" element
                 */
                void setDatabasePoolusageArray(int i, noNamespace.DatabasePoolusageDocument.DatabasePoolusage databasePoolusage);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "database_poolusage" element
                 */
                noNamespace.DatabasePoolusageDocument.DatabasePoolusage insertNewDatabasePoolusage(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "database_poolusage" element
                 */
                noNamespace.DatabasePoolusageDocument.DatabasePoolusage addNewDatabasePoolusage();
                
                /**
                 * Removes the ith "database_poolusage" element
                 */
                void removeDatabasePoolusage(int i);
                
                /**
                 * Gets the "dbsource_pool" attribute
                 */
                java.lang.String getDbsourcePool();
                
                /**
                 * Gets (as xml) the "dbsource_pool" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbsourcePool();
                
                /**
                 * True if has "dbsource_pool" attribute
                 */
                boolean isSetDbsourcePool();
                
                /**
                 * Sets the "dbsource_pool" attribute
                 */
                void setDbsourcePool(java.lang.String dbsourcePool);
                
                /**
                 * Sets (as xml) the "dbsource_pool" attribute
                 */
                void xsetDbsourcePool(org.apache.xmlbeans.XmlString dbsourcePool);
                
                /**
                 * Unsets the "dbsource_pool" attribute
                 */
                void unsetDbsourcePool();
                
                /**
                 * Gets the "dbsource_sql" attribute
                 */
                java.lang.String getDbsourceSql();
                
                /**
                 * Gets (as xml) the "dbsource_sql" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbsourceSql();
                
                /**
                 * True if has "dbsource_sql" attribute
                 */
                boolean isSetDbsourceSql();
                
                /**
                 * Sets the "dbsource_sql" attribute
                 */
                void setDbsourceSql(java.lang.String dbsourceSql);
                
                /**
                 * Sets (as xml) the "dbsource_sql" attribute
                 */
                void xsetDbsourceSql(org.apache.xmlbeans.XmlString dbsourceSql);
                
                /**
                 * Unsets the "dbsource_sql" attribute
                 */
                void unsetDbsourceSql();
                
                /**
                 * Gets the "poolname" attribute
                 */
                java.lang.String getPoolname();
                
                /**
                 * Gets (as xml) the "poolname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPoolname();
                
                /**
                 * True if has "poolname" attribute
                 */
                boolean isSetPoolname();
                
                /**
                 * Sets the "poolname" attribute
                 */
                void setPoolname(java.lang.String poolname);
                
                /**
                 * Sets (as xml) the "poolname" attribute
                 */
                void xsetPoolname(org.apache.xmlbeans.XmlString poolname);
                
                /**
                 * Unsets the "poolname" attribute
                 */
                void unsetPoolname();
                
                /**
                 * Gets the "bindvalues" attribute
                 */
                java.lang.String getBindvalues();
                
                /**
                 * Gets (as xml) the "bindvalues" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBindvalues();
                
                /**
                 * True if has "bindvalues" attribute
                 */
                boolean isSetBindvalues();
                
                /**
                 * Sets the "bindvalues" attribute
                 */
                void setBindvalues(java.lang.String bindvalues);
                
                /**
                 * Sets (as xml) the "bindvalues" attribute
                 */
                void xsetBindvalues(org.apache.xmlbeans.XmlString bindvalues);
                
                /**
                 * Unsets the "bindvalues" attribute
                 */
                void unsetBindvalues();
                
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
                 * Gets the "preparations" attribute
                 */
                java.math.BigInteger getPreparations();
                
                /**
                 * Gets (as xml) the "preparations" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPreparations();
                
                /**
                 * True if has "preparations" attribute
                 */
                boolean isSetPreparations();
                
                /**
                 * Sets the "preparations" attribute
                 */
                void setPreparations(java.math.BigInteger preparations);
                
                /**
                 * Sets (as xml) the "preparations" attribute
                 */
                void xsetPreparations(org.apache.xmlbeans.XmlInteger preparations);
                
                /**
                 * Unsets the "preparations" attribute
                 */
                void unsetPreparations();
                
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
                 * Gets the "usedpoolsize_max" attribute
                 */
                java.lang.String getUsedpoolsizeMax();
                
                /**
                 * Gets (as xml) the "usedpoolsize_max" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUsedpoolsizeMax();
                
                /**
                 * True if has "usedpoolsize_max" attribute
                 */
                boolean isSetUsedpoolsizeMax();
                
                /**
                 * Sets the "usedpoolsize_max" attribute
                 */
                void setUsedpoolsizeMax(java.lang.String usedpoolsizeMax);
                
                /**
                 * Sets (as xml) the "usedpoolsize_max" attribute
                 */
                void xsetUsedpoolsizeMax(org.apache.xmlbeans.XmlString usedpoolsizeMax);
                
                /**
                 * Unsets the "usedpoolsize_max" attribute
                 */
                void unsetUsedpoolsizeMax();
                
                /**
                 * Gets the "usedpoolsize_min" attribute
                 */
                java.lang.String getUsedpoolsizeMin();
                
                /**
                 * Gets (as xml) the "usedpoolsize_min" attribute
                 */
                org.apache.xmlbeans.XmlString xgetUsedpoolsizeMin();
                
                /**
                 * True if has "usedpoolsize_min" attribute
                 */
                boolean isSetUsedpoolsizeMin();
                
                /**
                 * Sets the "usedpoolsize_min" attribute
                 */
                void setUsedpoolsizeMin(java.lang.String usedpoolsizeMin);
                
                /**
                 * Sets (as xml) the "usedpoolsize_min" attribute
                 */
                void xsetUsedpoolsizeMin(org.apache.xmlbeans.XmlString usedpoolsizeMin);
                
                /**
                 * Unsets the "usedpoolsize_min" attribute
                 */
                void unsetUsedpoolsizeMin();
                
                /**
                 * Gets the "poolwait_max" attribute
                 */
                double getPoolwaitMax();
                
                /**
                 * Gets (as xml) the "poolwait_max" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitMax();
                
                /**
                 * True if has "poolwait_max" attribute
                 */
                boolean isSetPoolwaitMax();
                
                /**
                 * Sets the "poolwait_max" attribute
                 */
                void setPoolwaitMax(double poolwaitMax);
                
                /**
                 * Sets (as xml) the "poolwait_max" attribute
                 */
                void xsetPoolwaitMax(org.apache.xmlbeans.XmlDouble poolwaitMax);
                
                /**
                 * Unsets the "poolwait_max" attribute
                 */
                void unsetPoolwaitMax();
                
                /**
                 * Gets the "poolwait_avg" attribute
                 */
                double getPoolwaitAvg();
                
                /**
                 * Gets (as xml) the "poolwait_avg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitAvg();
                
                /**
                 * True if has "poolwait_avg" attribute
                 */
                boolean isSetPoolwaitAvg();
                
                /**
                 * Sets the "poolwait_avg" attribute
                 */
                void setPoolwaitAvg(double poolwaitAvg);
                
                /**
                 * Sets (as xml) the "poolwait_avg" attribute
                 */
                void xsetPoolwaitAvg(org.apache.xmlbeans.XmlDouble poolwaitAvg);
                
                /**
                 * Unsets the "poolwait_avg" attribute
                 */
                void unsetPoolwaitAvg();
                
                /**
                 * Gets the "last_pool_usage" attribute
                 */
                java.lang.String getLastPoolUsage();
                
                /**
                 * Gets (as xml) the "last_pool_usage" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLastPoolUsage();
                
                /**
                 * True if has "last_pool_usage" attribute
                 */
                boolean isSetLastPoolUsage();
                
                /**
                 * Sets the "last_pool_usage" attribute
                 */
                void setLastPoolUsage(java.lang.String lastPoolUsage);
                
                /**
                 * Sets (as xml) the "last_pool_usage" attribute
                 */
                void xsetLastPoolUsage(org.apache.xmlbeans.XmlString lastPoolUsage);
                
                /**
                 * Unsets the "last_pool_usage" attribute
                 */
                void unsetLastPoolUsage();
                
                /**
                 * Gets the "poolsize" attribute
                 */
                java.math.BigInteger getPoolsize();
                
                /**
                 * Gets (as xml) the "poolsize" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPoolsize();
                
                /**
                 * True if has "poolsize" attribute
                 */
                boolean isSetPoolsize();
                
                /**
                 * Sets the "poolsize" attribute
                 */
                void setPoolsize(java.math.BigInteger poolsize);
                
                /**
                 * Sets (as xml) the "poolsize" attribute
                 */
                void xsetPoolsize(org.apache.xmlbeans.XmlInteger poolsize);
                
                /**
                 * Unsets the "poolsize" attribute
                 */
                void unsetPoolsize();
                
                /**
                 * Gets the "dbtype" attribute
                 */
                java.lang.String getDbtype();
                
                /**
                 * Gets (as xml) the "dbtype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbtype();
                
                /**
                 * True if has "dbtype" attribute
                 */
                boolean isSetDbtype();
                
                /**
                 * Sets the "dbtype" attribute
                 */
                void setDbtype(java.lang.String dbtype);
                
                /**
                 * Sets (as xml) the "dbtype" attribute
                 */
                void xsetDbtype(org.apache.xmlbeans.XmlString dbtype);
                
                /**
                 * Unsets the "dbtype" attribute
                 */
                void unsetDbtype();
                
                /**
                 * Gets the "dbname" attribute
                 */
                java.lang.String getDbname();
                
                /**
                 * Gets (as xml) the "dbname" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbname();
                
                /**
                 * True if has "dbname" attribute
                 */
                boolean isSetDbname();
                
                /**
                 * Sets the "dbname" attribute
                 */
                void setDbname(java.lang.String dbname);
                
                /**
                 * Sets (as xml) the "dbname" attribute
                 */
                void xsetDbname(org.apache.xmlbeans.XmlString dbname);
                
                /**
                 * Unsets the "dbname" attribute
                 */
                void unsetDbname();
                
                /**
                 * Gets the "dbhost" attribute
                 */
                java.lang.String getDbhost();
                
                /**
                 * Gets (as xml) the "dbhost" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbhost();
                
                /**
                 * True if has "dbhost" attribute
                 */
                boolean isSetDbhost();
                
                /**
                 * Sets the "dbhost" attribute
                 */
                void setDbhost(java.lang.String dbhost);
                
                /**
                 * Sets (as xml) the "dbhost" attribute
                 */
                void xsetDbhost(org.apache.xmlbeans.XmlString dbhost);
                
                /**
                 * Unsets the "dbhost" attribute
                 */
                void unsetDbhost();
                
                /**
                 * Gets the "dbuser" attribute
                 */
                java.lang.String getDbuser();
                
                /**
                 * Gets (as xml) the "dbuser" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDbuser();
                
                /**
                 * True if has "dbuser" attribute
                 */
                boolean isSetDbuser();
                
                /**
                 * Sets the "dbuser" attribute
                 */
                void setDbuser(java.lang.String dbuser);
                
                /**
                 * Sets (as xml) the "dbuser" attribute
                 */
                void xsetDbuser(org.apache.xmlbeans.XmlString dbuser);
                
                /**
                 * Unsets the "dbuser" attribute
                 */
                void unsetDbuser();
                
                /**
                 * Gets the "pooluser" attribute
                 */
                java.lang.String getPooluser();
                
                /**
                 * Gets (as xml) the "pooluser" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPooluser();
                
                /**
                 * True if has "pooluser" attribute
                 */
                boolean isSetPooluser();
                
                /**
                 * Sets the "pooluser" attribute
                 */
                void setPooluser(java.lang.String pooluser);
                
                /**
                 * Sets (as xml) the "pooluser" attribute
                 */
                void xsetPooluser(org.apache.xmlbeans.XmlString pooluser);
                
                /**
                 * Unsets the "pooluser" attribute
                 */
                void unsetPooluser();
                
                /**
                 * Gets the "dburl" attribute
                 */
                java.lang.String getDburl();
                
                /**
                 * Gets (as xml) the "dburl" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDburl();
                
                /**
                 * True if has "dburl" attribute
                 */
                boolean isSetDburl();
                
                /**
                 * Sets the "dburl" attribute
                 */
                void setDburl(java.lang.String dburl);
                
                /**
                 * Sets (as xml) the "dburl" attribute
                 */
                void xsetDburl(org.apache.xmlbeans.XmlString dburl);
                
                /**
                 * Unsets the "dburl" attribute
                 */
                void unsetDburl();
                
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
                 * Gets the "poolwait_sum" attribute
                 */
                double getPoolwaitSum();
                
                /**
                 * Gets (as xml) the "poolwait_sum" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitSum();
                
                /**
                 * True if has "poolwait_sum" attribute
                 */
                boolean isSetPoolwaitSum();
                
                /**
                 * Sets the "poolwait_sum" attribute
                 */
                void setPoolwaitSum(double poolwaitSum);
                
                /**
                 * Sets (as xml) the "poolwait_sum" attribute
                 */
                void xsetPoolwaitSum(org.apache.xmlbeans.XmlDouble poolwaitSum);
                
                /**
                 * Unsets the "poolwait_sum" attribute
                 */
                void unsetPoolwaitSum();
                
                /**
                 * Gets the "poolwait_min" attribute
                 */
                double getPoolwaitMin();
                
                /**
                 * Gets (as xml) the "poolwait_min" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolwaitMin();
                
                /**
                 * True if has "poolwait_min" attribute
                 */
                boolean isSetPoolwaitMin();
                
                /**
                 * Sets the "poolwait_min" attribute
                 */
                void setPoolwaitMin(double poolwaitMin);
                
                /**
                 * Sets (as xml) the "poolwait_min" attribute
                 */
                void xsetPoolwaitMin(org.apache.xmlbeans.XmlDouble poolwaitMin);
                
                /**
                 * Unsets the "poolwait_min" attribute
                 */
                void unsetPoolwaitMin();
                
                /**
                 * Gets the "response_time" attribute
                 */
                double getResponseTime();
                
                /**
                 * Gets (as xml) the "response_time" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTime();
                
                /**
                 * True if has "response_time" attribute
                 */
                boolean isSetResponseTime();
                
                /**
                 * Sets the "response_time" attribute
                 */
                void setResponseTime(double responseTime);
                
                /**
                 * Sets (as xml) the "response_time" attribute
                 */
                void xsetResponseTime(org.apache.xmlbeans.XmlDouble responseTime);
                
                /**
                 * Unsets the "response_time" attribute
                 */
                void unsetResponseTime();
                
                /**
                 * Gets the "response_time_per_execution" attribute
                 */
                double getResponseTimePerExecution();
                
                /**
                 * Gets (as xml) the "response_time_per_execution" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerExecution();
                
                /**
                 * True if has "response_time_per_execution" attribute
                 */
                boolean isSetResponseTimePerExecution();
                
                /**
                 * Sets the "response_time_per_execution" attribute
                 */
                void setResponseTimePerExecution(double responseTimePerExecution);
                
                /**
                 * Sets (as xml) the "response_time_per_execution" attribute
                 */
                void xsetResponseTimePerExecution(org.apache.xmlbeans.XmlDouble responseTimePerExecution);
                
                /**
                 * Unsets the "response_time_per_execution" attribute
                 */
                void unsetResponseTimePerExecution();
                
                /**
                 * Gets the "response_time_per_transaction" attribute
                 */
                double getResponseTimePerTransaction();
                
                /**
                 * Gets (as xml) the "response_time_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerTransaction();
                
                /**
                 * True if has "response_time_per_transaction" attribute
                 */
                boolean isSetResponseTimePerTransaction();
                
                /**
                 * Sets the "response_time_per_transaction" attribute
                 */
                void setResponseTimePerTransaction(double responseTimePerTransaction);
                
                /**
                 * Sets (as xml) the "response_time_per_transaction" attribute
                 */
                void xsetResponseTimePerTransaction(org.apache.xmlbeans.XmlDouble responseTimePerTransaction);
                
                /**
                 * Unsets the "response_time_per_transaction" attribute
                 */
                void unsetResponseTimePerTransaction();
                
                /**
                 * Gets the "response_time_per_passing_transaction" attribute
                 */
                double getResponseTimePerPassingTransaction();
                
                /**
                 * Gets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetResponseTimePerPassingTransaction();
                
                /**
                 * True if has "response_time_per_passing_transaction" attribute
                 */
                boolean isSetResponseTimePerPassingTransaction();
                
                /**
                 * Sets the "response_time_per_passing_transaction" attribute
                 */
                void setResponseTimePerPassingTransaction(double responseTimePerPassingTransaction);
                
                /**
                 * Sets (as xml) the "response_time_per_passing_transaction" attribute
                 */
                void xsetResponseTimePerPassingTransaction(org.apache.xmlbeans.XmlDouble responseTimePerPassingTransaction);
                
                /**
                 * Unsets the "response_time_per_passing_transaction" attribute
                 */
                void unsetResponseTimePerPassingTransaction();
                
                /**
                 * Gets the "executions_per_transaction" attribute
                 */
                double getExecutionsPerTransaction();
                
                /**
                 * Gets (as xml) the "executions_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecutionsPerTransaction();
                
                /**
                 * True if has "executions_per_transaction" attribute
                 */
                boolean isSetExecutionsPerTransaction();
                
                /**
                 * Sets the "executions_per_transaction" attribute
                 */
                void setExecutionsPerTransaction(double executionsPerTransaction);
                
                /**
                 * Sets (as xml) the "executions_per_transaction" attribute
                 */
                void xsetExecutionsPerTransaction(org.apache.xmlbeans.XmlDouble executionsPerTransaction);
                
                /**
                 * Unsets the "executions_per_transaction" attribute
                 */
                void unsetExecutionsPerTransaction();
                
                /**
                 * Gets the "executions_per_passing_transaction" attribute
                 */
                double getExecutionsPerPassingTransaction();
                
                /**
                 * Gets (as xml) the "executions_per_passing_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetExecutionsPerPassingTransaction();
                
                /**
                 * True if has "executions_per_passing_transaction" attribute
                 */
                boolean isSetExecutionsPerPassingTransaction();
                
                /**
                 * Sets the "executions_per_passing_transaction" attribute
                 */
                void setExecutionsPerPassingTransaction(double executionsPerPassingTransaction);
                
                /**
                 * Sets (as xml) the "executions_per_passing_transaction" attribute
                 */
                void xsetExecutionsPerPassingTransaction(org.apache.xmlbeans.XmlDouble executionsPerPassingTransaction);
                
                /**
                 * Unsets the "executions_per_passing_transaction" attribute
                 */
                void unsetExecutionsPerPassingTransaction();
                
                /**
                 * Gets the "pct_of_transactions_calling" attribute
                 */
                java.lang.String getPctOfTransactionsCalling();
                
                /**
                 * Gets (as xml) the "pct_of_transactions_calling" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPctOfTransactionsCalling();
                
                /**
                 * True if has "pct_of_transactions_calling" attribute
                 */
                boolean isSetPctOfTransactionsCalling();
                
                /**
                 * Sets the "pct_of_transactions_calling" attribute
                 */
                void setPctOfTransactionsCalling(java.lang.String pctOfTransactionsCalling);
                
                /**
                 * Sets (as xml) the "pct_of_transactions_calling" attribute
                 */
                void xsetPctOfTransactionsCalling(org.apache.xmlbeans.XmlString pctOfTransactionsCalling);
                
                /**
                 * Unsets the "pct_of_transactions_calling" attribute
                 */
                void unsetPctOfTransactionsCalling();
                
                /**
                 * Gets the "pool_wait_time_per_transaction" attribute
                 */
                double getPoolWaitTimePerTransaction();
                
                /**
                 * Gets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPoolWaitTimePerTransaction();
                
                /**
                 * True if has "pool_wait_time_per_transaction" attribute
                 */
                boolean isSetPoolWaitTimePerTransaction();
                
                /**
                 * Sets the "pool_wait_time_per_transaction" attribute
                 */
                void setPoolWaitTimePerTransaction(double poolWaitTimePerTransaction);
                
                /**
                 * Sets (as xml) the "pool_wait_time_per_transaction" attribute
                 */
                void xsetPoolWaitTimePerTransaction(org.apache.xmlbeans.XmlDouble poolWaitTimePerTransaction);
                
                /**
                 * Unsets the "pool_wait_time_per_transaction" attribute
                 */
                void unsetPoolWaitTimePerTransaction();
                
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
                 * Gets the "response_time_contribution" attribute
                 */
                java.lang.String getResponseTimeContribution();
                
                /**
                 * Gets (as xml) the "response_time_contribution" attribute
                 */
                org.apache.xmlbeans.XmlString xgetResponseTimeContribution();
                
                /**
                 * True if has "response_time_contribution" attribute
                 */
                boolean isSetResponseTimeContribution();
                
                /**
                 * Sets the "response_time_contribution" attribute
                 */
                void setResponseTimeContribution(java.lang.String responseTimeContribution);
                
                /**
                 * Sets (as xml) the "response_time_contribution" attribute
                 */
                void xsetResponseTimeContribution(org.apache.xmlbeans.XmlString responseTimeContribution);
                
                /**
                 * Unsets the "response_time_contribution" attribute
                 */
                void unsetResponseTimeContribution();
                
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
                 * Gets the "rowcount" attribute
                 */
                java.math.BigInteger getRowcount();
                
                /**
                 * Gets (as xml) the "rowcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRowcount();
                
                /**
                 * True if has "rowcount" attribute
                 */
                boolean isSetRowcount();
                
                /**
                 * Sets the "rowcount" attribute
                 */
                void setRowcount(java.math.BigInteger rowcount);
                
                /**
                 * Sets (as xml) the "rowcount" attribute
                 */
                void xsetRowcount(org.apache.xmlbeans.XmlInteger rowcount);
                
                /**
                 * Unsets the "rowcount" attribute
                 */
                void unsetRowcount();
                
                /**
                 * Gets the "roundtrips" attribute
                 */
                java.math.BigInteger getRoundtrips();
                
                /**
                 * Gets (as xml) the "roundtrips" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetRoundtrips();
                
                /**
                 * True if has "roundtrips" attribute
                 */
                boolean isSetRoundtrips();
                
                /**
                 * Sets the "roundtrips" attribute
                 */
                void setRoundtrips(java.math.BigInteger roundtrips);
                
                /**
                 * Sets (as xml) the "roundtrips" attribute
                 */
                void xsetRoundtrips(org.apache.xmlbeans.XmlInteger roundtrips);
                
                /**
                 * Unsets the "roundtrips" attribute
                 */
                void unsetRoundtrips();
                
                /**
                 * Gets the "pooltype" attribute
                 */
                java.lang.String getPooltype();
                
                /**
                 * Gets (as xml) the "pooltype" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPooltype();
                
                /**
                 * True if has "pooltype" attribute
                 */
                boolean isSetPooltype();
                
                /**
                 * Sets the "pooltype" attribute
                 */
                void setPooltype(java.lang.String pooltype);
                
                /**
                 * Sets (as xml) the "pooltype" attribute
                 */
                void xsetPooltype(org.apache.xmlbeans.XmlString pooltype);
                
                /**
                 * Unsets the "pooltype" attribute
                 */
                void unsetPooltype();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage newInstance() {
                      return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages.DatabasePoolusage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages newInstance() {
                  return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.DatabasedashletDocument.Databasedashlet.DatabasePoolusages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.DatabasedashletDocument.Databasedashlet newInstance() {
              return (noNamespace.DatabasedashletDocument.Databasedashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.DatabasedashletDocument.Databasedashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.DatabasedashletDocument.Databasedashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.DatabasedashletDocument newInstance() {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.DatabasedashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.DatabasedashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.DatabasedashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.DatabasedashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.DatabasedashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.DatabasedashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.DatabasedashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.DatabasedashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DatabasedashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.DatabasedashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.DatabasedashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
