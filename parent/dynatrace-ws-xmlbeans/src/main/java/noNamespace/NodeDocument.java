/*
 * An XML document type.
 * Localname: node
 * Namespace: 
 * Java type: noNamespace.NodeDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one node(@) element.
 *
 * This is a complex type.
 */
public interface NodeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NodeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("noded1fbdoctype");
    
    /**
     * Gets the "node" element
     */
    noNamespace.NodeDocument.Node getNode();
    
    /**
     * Sets the "node" element
     */
    void setNode(noNamespace.NodeDocument.Node node);
    
    /**
     * Appends and returns a new empty "node" element
     */
    noNamespace.NodeDocument.Node addNewNode();
    
    /**
     * An XML node(@).
     *
     * This is a complex type.
     */
    public interface Node extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Node.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("node01adelemtype");
        
        /**
         * Gets array of all "attachment" elements
         */
        noNamespace.AttachmentDocument.Attachment[] getAttachmentArray();
        
        /**
         * Gets ith "attachment" element
         */
        noNamespace.AttachmentDocument.Attachment getAttachmentArray(int i);
        
        /**
         * Returns number of "attachment" element
         */
        int sizeOfAttachmentArray();
        
        /**
         * Sets array of all "attachment" element
         */
        void setAttachmentArray(noNamespace.AttachmentDocument.Attachment[] attachmentArray);
        
        /**
         * Sets ith "attachment" element
         */
        void setAttachmentArray(int i, noNamespace.AttachmentDocument.Attachment attachment);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attachment" element
         */
        noNamespace.AttachmentDocument.Attachment insertNewAttachment(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attachment" element
         */
        noNamespace.AttachmentDocument.Attachment addNewAttachment();
        
        /**
         * Removes the ith "attachment" element
         */
        void removeAttachment(int i);
        
        /**
         * Gets array of all "node" elements
         */
        noNamespace.NodeDocument.Node[] getNodeArray();
        
        /**
         * Gets ith "node" element
         */
        noNamespace.NodeDocument.Node getNodeArray(int i);
        
        /**
         * Returns number of "node" element
         */
        int sizeOfNodeArray();
        
        /**
         * Sets array of all "node" element
         */
        void setNodeArray(noNamespace.NodeDocument.Node[] nodeArray);
        
        /**
         * Sets ith "node" element
         */
        void setNodeArray(int i, noNamespace.NodeDocument.Node node);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "node" element
         */
        noNamespace.NodeDocument.Node insertNewNode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "node" element
         */
        noNamespace.NodeDocument.Node addNewNode();
        
        /**
         * Removes the ith "node" element
         */
        void removeNode(int i);
        
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
         * Gets the "argument" attribute
         */
        java.lang.String getArgument();
        
        /**
         * Gets (as xml) the "argument" attribute
         */
        org.apache.xmlbeans.XmlString xgetArgument();
        
        /**
         * True if has "argument" attribute
         */
        boolean isSetArgument();
        
        /**
         * Sets the "argument" attribute
         */
        void setArgument(java.lang.String argument);
        
        /**
         * Sets (as xml) the "argument" attribute
         */
        void xsetArgument(org.apache.xmlbeans.XmlString argument);
        
        /**
         * Unsets the "argument" attribute
         */
        void unsetArgument();
        
        /**
         * Gets the "return" attribute
         */
        java.lang.String getReturn();
        
        /**
         * Gets (as xml) the "return" attribute
         */
        org.apache.xmlbeans.XmlString xgetReturn();
        
        /**
         * True if has "return" attribute
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" attribute
         */
        void setReturn(java.lang.String xreturn);
        
        /**
         * Sets (as xml) the "return" attribute
         */
        void xsetReturn(org.apache.xmlbeans.XmlString xreturn);
        
        /**
         * Unsets the "return" attribute
         */
        void unsetReturn();
        
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
         * Gets the "api" attribute
         */
        java.lang.String getApi();
        
        /**
         * Gets (as xml) the "api" attribute
         */
        org.apache.xmlbeans.XmlString xgetApi();
        
        /**
         * True if has "api" attribute
         */
        boolean isSetApi();
        
        /**
         * Sets the "api" attribute
         */
        void setApi(java.lang.String api);
        
        /**
         * Sets (as xml) the "api" attribute
         */
        void xsetApi(org.apache.xmlbeans.XmlString api);
        
        /**
         * Unsets the "api" attribute
         */
        void unsetApi();
        
        /**
         * Gets the "totaltime" attribute
         */
        double getTotaltime();
        
        /**
         * Gets (as xml) the "totaltime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTotaltime();
        
        /**
         * True if has "totaltime" attribute
         */
        boolean isSetTotaltime();
        
        /**
         * Sets the "totaltime" attribute
         */
        void setTotaltime(double totaltime);
        
        /**
         * Sets (as xml) the "totaltime" attribute
         */
        void xsetTotaltime(org.apache.xmlbeans.XmlDouble totaltime);
        
        /**
         * Unsets the "totaltime" attribute
         */
        void unsetTotaltime();
        
        /**
         * Gets the "exectime" attribute
         */
        double getExectime();
        
        /**
         * Gets (as xml) the "exectime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetExectime();
        
        /**
         * True if has "exectime" attribute
         */
        boolean isSetExectime();
        
        /**
         * Sets the "exectime" attribute
         */
        void setExectime(double exectime);
        
        /**
         * Sets (as xml) the "exectime" attribute
         */
        void xsetExectime(org.apache.xmlbeans.XmlDouble exectime);
        
        /**
         * Unsets the "exectime" attribute
         */
        void unsetExectime();
        
        /**
         * Gets the "exectimepercentage" attribute
         */
        double getExectimepercentage();
        
        /**
         * Gets (as xml) the "exectimepercentage" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetExectimepercentage();
        
        /**
         * True if has "exectimepercentage" attribute
         */
        boolean isSetExectimepercentage();
        
        /**
         * Sets the "exectimepercentage" attribute
         */
        void setExectimepercentage(double exectimepercentage);
        
        /**
         * Sets (as xml) the "exectimepercentage" attribute
         */
        void xsetExectimepercentage(org.apache.xmlbeans.XmlDouble exectimepercentage);
        
        /**
         * Unsets the "exectimepercentage" attribute
         */
        void unsetExectimepercentage();
        
        /**
         * Gets the "cputotaltime" attribute
         */
        double getCputotaltime();
        
        /**
         * Gets (as xml) the "cputotaltime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCputotaltime();
        
        /**
         * True if has "cputotaltime" attribute
         */
        boolean isSetCputotaltime();
        
        /**
         * Sets the "cputotaltime" attribute
         */
        void setCputotaltime(double cputotaltime);
        
        /**
         * Sets (as xml) the "cputotaltime" attribute
         */
        void xsetCputotaltime(org.apache.xmlbeans.XmlDouble cputotaltime);
        
        /**
         * Unsets the "cputotaltime" attribute
         */
        void unsetCputotaltime();
        
        /**
         * Gets the "cpuexectime" attribute
         */
        double getCpuexectime();
        
        /**
         * Gets (as xml) the "cpuexectime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCpuexectime();
        
        /**
         * True if has "cpuexectime" attribute
         */
        boolean isSetCpuexectime();
        
        /**
         * Sets the "cpuexectime" attribute
         */
        void setCpuexectime(double cpuexectime);
        
        /**
         * Sets (as xml) the "cpuexectime" attribute
         */
        void xsetCpuexectime(org.apache.xmlbeans.XmlDouble cpuexectime);
        
        /**
         * Unsets the "cpuexectime" attribute
         */
        void unsetCpuexectime();
        
        /**
         * Gets the "cpupercentage" attribute
         */
        double getCpupercentage();
        
        /**
         * Gets (as xml) the "cpupercentage" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetCpupercentage();
        
        /**
         * True if has "cpupercentage" attribute
         */
        boolean isSetCpupercentage();
        
        /**
         * Sets the "cpupercentage" attribute
         */
        void setCpupercentage(double cpupercentage);
        
        /**
         * Sets (as xml) the "cpupercentage" attribute
         */
        void xsetCpupercentage(org.apache.xmlbeans.XmlDouble cpupercentage);
        
        /**
         * Unsets the "cpupercentage" attribute
         */
        void unsetCpupercentage();
        
        /**
         * Gets the "synctotaltime" attribute
         */
        double getSynctotaltime();
        
        /**
         * Gets (as xml) the "synctotaltime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSynctotaltime();
        
        /**
         * True if has "synctotaltime" attribute
         */
        boolean isSetSynctotaltime();
        
        /**
         * Sets the "synctotaltime" attribute
         */
        void setSynctotaltime(double synctotaltime);
        
        /**
         * Sets (as xml) the "synctotaltime" attribute
         */
        void xsetSynctotaltime(org.apache.xmlbeans.XmlDouble synctotaltime);
        
        /**
         * Unsets the "synctotaltime" attribute
         */
        void unsetSynctotaltime();
        
        /**
         * Gets the "synctime" attribute
         */
        double getSynctime();
        
        /**
         * Gets (as xml) the "synctime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSynctime();
        
        /**
         * True if has "synctime" attribute
         */
        boolean isSetSynctime();
        
        /**
         * Sets the "synctime" attribute
         */
        void setSynctime(double synctime);
        
        /**
         * Sets (as xml) the "synctime" attribute
         */
        void xsetSynctime(org.apache.xmlbeans.XmlDouble synctime);
        
        /**
         * Unsets the "synctime" attribute
         */
        void unsetSynctime();
        
        /**
         * Gets the "syncpercentage" attribute
         */
        double getSyncpercentage();
        
        /**
         * Gets (as xml) the "syncpercentage" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSyncpercentage();
        
        /**
         * True if has "syncpercentage" attribute
         */
        boolean isSetSyncpercentage();
        
        /**
         * Sets the "syncpercentage" attribute
         */
        void setSyncpercentage(double syncpercentage);
        
        /**
         * Sets (as xml) the "syncpercentage" attribute
         */
        void xsetSyncpercentage(org.apache.xmlbeans.XmlDouble syncpercentage);
        
        /**
         * Unsets the "syncpercentage" attribute
         */
        void unsetSyncpercentage();
        
        /**
         * Gets the "waittotaltime" attribute
         */
        double getWaittotaltime();
        
        /**
         * Gets (as xml) the "waittotaltime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWaittotaltime();
        
        /**
         * True if has "waittotaltime" attribute
         */
        boolean isSetWaittotaltime();
        
        /**
         * Sets the "waittotaltime" attribute
         */
        void setWaittotaltime(double waittotaltime);
        
        /**
         * Sets (as xml) the "waittotaltime" attribute
         */
        void xsetWaittotaltime(org.apache.xmlbeans.XmlDouble waittotaltime);
        
        /**
         * Unsets the "waittotaltime" attribute
         */
        void unsetWaittotaltime();
        
        /**
         * Gets the "waittime" attribute
         */
        double getWaittime();
        
        /**
         * Gets (as xml) the "waittime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWaittime();
        
        /**
         * True if has "waittime" attribute
         */
        boolean isSetWaittime();
        
        /**
         * Sets the "waittime" attribute
         */
        void setWaittime(double waittime);
        
        /**
         * Sets (as xml) the "waittime" attribute
         */
        void xsetWaittime(org.apache.xmlbeans.XmlDouble waittime);
        
        /**
         * Unsets the "waittime" attribute
         */
        void unsetWaittime();
        
        /**
         * Gets the "waitpercentage" attribute
         */
        double getWaitpercentage();
        
        /**
         * Gets (as xml) the "waitpercentage" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetWaitpercentage();
        
        /**
         * True if has "waitpercentage" attribute
         */
        boolean isSetWaitpercentage();
        
        /**
         * Sets the "waitpercentage" attribute
         */
        void setWaitpercentage(double waitpercentage);
        
        /**
         * Sets (as xml) the "waitpercentage" attribute
         */
        void xsetWaitpercentage(org.apache.xmlbeans.XmlDouble waitpercentage);
        
        /**
         * Unsets the "waitpercentage" attribute
         */
        void unsetWaitpercentage();
        
        /**
         * Gets the "suspensiontotaltime" attribute
         */
        double getSuspensiontotaltime();
        
        /**
         * Gets (as xml) the "suspensiontotaltime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSuspensiontotaltime();
        
        /**
         * True if has "suspensiontotaltime" attribute
         */
        boolean isSetSuspensiontotaltime();
        
        /**
         * Sets the "suspensiontotaltime" attribute
         */
        void setSuspensiontotaltime(double suspensiontotaltime);
        
        /**
         * Sets (as xml) the "suspensiontotaltime" attribute
         */
        void xsetSuspensiontotaltime(org.apache.xmlbeans.XmlDouble suspensiontotaltime);
        
        /**
         * Unsets the "suspensiontotaltime" attribute
         */
        void unsetSuspensiontotaltime();
        
        /**
         * Gets the "suspensiontime" attribute
         */
        double getSuspensiontime();
        
        /**
         * Gets (as xml) the "suspensiontime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSuspensiontime();
        
        /**
         * True if has "suspensiontime" attribute
         */
        boolean isSetSuspensiontime();
        
        /**
         * Sets the "suspensiontime" attribute
         */
        void setSuspensiontime(double suspensiontime);
        
        /**
         * Sets (as xml) the "suspensiontime" attribute
         */
        void xsetSuspensiontime(org.apache.xmlbeans.XmlDouble suspensiontime);
        
        /**
         * Unsets the "suspensiontime" attribute
         */
        void unsetSuspensiontime();
        
        /**
         * Gets the "suspensionpercentage" attribute
         */
        double getSuspensionpercentage();
        
        /**
         * Gets (as xml) the "suspensionpercentage" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSuspensionpercentage();
        
        /**
         * True if has "suspensionpercentage" attribute
         */
        boolean isSetSuspensionpercentage();
        
        /**
         * Sets the "suspensionpercentage" attribute
         */
        void setSuspensionpercentage(double suspensionpercentage);
        
        /**
         * Sets (as xml) the "suspensionpercentage" attribute
         */
        void xsetSuspensionpercentage(org.apache.xmlbeans.XmlDouble suspensionpercentage);
        
        /**
         * Unsets the "suspensionpercentage" attribute
         */
        void unsetSuspensionpercentage();
        
        /**
         * Gets the "descheduledtotaltime" attribute
         */
        double getDescheduledtotaltime();
        
        /**
         * Gets (as xml) the "descheduledtotaltime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDescheduledtotaltime();
        
        /**
         * True if has "descheduledtotaltime" attribute
         */
        boolean isSetDescheduledtotaltime();
        
        /**
         * Sets the "descheduledtotaltime" attribute
         */
        void setDescheduledtotaltime(double descheduledtotaltime);
        
        /**
         * Sets (as xml) the "descheduledtotaltime" attribute
         */
        void xsetDescheduledtotaltime(org.apache.xmlbeans.XmlDouble descheduledtotaltime);
        
        /**
         * Unsets the "descheduledtotaltime" attribute
         */
        void unsetDescheduledtotaltime();
        
        /**
         * Gets the "descheduledtime" attribute
         */
        double getDescheduledtime();
        
        /**
         * Gets (as xml) the "descheduledtime" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDescheduledtime();
        
        /**
         * True if has "descheduledtime" attribute
         */
        boolean isSetDescheduledtime();
        
        /**
         * Sets the "descheduledtime" attribute
         */
        void setDescheduledtime(double descheduledtime);
        
        /**
         * Sets (as xml) the "descheduledtime" attribute
         */
        void xsetDescheduledtime(org.apache.xmlbeans.XmlDouble descheduledtime);
        
        /**
         * Unsets the "descheduledtime" attribute
         */
        void unsetDescheduledtime();
        
        /**
         * Gets the "descheduledpercentage" attribute
         */
        double getDescheduledpercentage();
        
        /**
         * Gets (as xml) the "descheduledpercentage" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDescheduledpercentage();
        
        /**
         * True if has "descheduledpercentage" attribute
         */
        boolean isSetDescheduledpercentage();
        
        /**
         * Sets the "descheduledpercentage" attribute
         */
        void setDescheduledpercentage(double descheduledpercentage);
        
        /**
         * Sets (as xml) the "descheduledpercentage" attribute
         */
        void xsetDescheduledpercentage(org.apache.xmlbeans.XmlDouble descheduledpercentage);
        
        /**
         * Unsets the "descheduledpercentage" attribute
         */
        void unsetDescheduledpercentage();
        
        /**
         * Gets the "thread" attribute
         */
        java.lang.String getThread();
        
        /**
         * Gets (as xml) the "thread" attribute
         */
        org.apache.xmlbeans.XmlString xgetThread();
        
        /**
         * True if has "thread" attribute
         */
        boolean isSetThread();
        
        /**
         * Sets the "thread" attribute
         */
        void setThread(java.lang.String thread);
        
        /**
         * Sets (as xml) the "thread" attribute
         */
        void xsetThread(org.apache.xmlbeans.XmlString thread);
        
        /**
         * Unsets the "thread" attribute
         */
        void unsetThread();
        
        /**
         * Gets the "relativestart" attribute
         */
        double getRelativestart();
        
        /**
         * Gets (as xml) the "relativestart" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRelativestart();
        
        /**
         * True if has "relativestart" attribute
         */
        boolean isSetRelativestart();
        
        /**
         * Sets the "relativestart" attribute
         */
        void setRelativestart(double relativestart);
        
        /**
         * Sets (as xml) the "relativestart" attribute
         */
        void xsetRelativestart(org.apache.xmlbeans.XmlDouble relativestart);
        
        /**
         * Unsets the "relativestart" attribute
         */
        void unsetRelativestart();
        
        /**
         * Gets the "level" attribute
         */
        java.math.BigInteger getLevel();
        
        /**
         * Gets (as xml) the "level" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetLevel();
        
        /**
         * True if has "level" attribute
         */
        boolean isSetLevel();
        
        /**
         * Sets the "level" attribute
         */
        void setLevel(java.math.BigInteger level);
        
        /**
         * Sets (as xml) the "level" attribute
         */
        void xsetLevel(org.apache.xmlbeans.XmlInteger level);
        
        /**
         * Unsets the "level" attribute
         */
        void unsetLevel();
        
        /**
         * Gets the "entryhopcount" attribute
         */
        java.math.BigInteger getEntryhopcount();
        
        /**
         * Gets (as xml) the "entryhopcount" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetEntryhopcount();
        
        /**
         * True if has "entryhopcount" attribute
         */
        boolean isSetEntryhopcount();
        
        /**
         * Sets the "entryhopcount" attribute
         */
        void setEntryhopcount(java.math.BigInteger entryhopcount);
        
        /**
         * Sets (as xml) the "entryhopcount" attribute
         */
        void xsetEntryhopcount(org.apache.xmlbeans.XmlInteger entryhopcount);
        
        /**
         * Unsets the "entryhopcount" attribute
         */
        void unsetEntryhopcount();
        
        /**
         * Gets the "exithopcount" attribute
         */
        java.math.BigInteger getExithopcount();
        
        /**
         * Gets (as xml) the "exithopcount" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetExithopcount();
        
        /**
         * True if has "exithopcount" attribute
         */
        boolean isSetExithopcount();
        
        /**
         * Sets the "exithopcount" attribute
         */
        void setExithopcount(java.math.BigInteger exithopcount);
        
        /**
         * Sets (as xml) the "exithopcount" attribute
         */
        void xsetExithopcount(org.apache.xmlbeans.XmlInteger exithopcount);
        
        /**
         * Unsets the "exithopcount" attribute
         */
        void unsetExithopcount();
        
        /**
         * Gets the "stitchinginfo" attribute
         */
        java.lang.String getStitchinginfo();
        
        /**
         * Gets (as xml) the "stitchinginfo" attribute
         */
        org.apache.xmlbeans.XmlString xgetStitchinginfo();
        
        /**
         * True if has "stitchinginfo" attribute
         */
        boolean isSetStitchinginfo();
        
        /**
         * Sets the "stitchinginfo" attribute
         */
        void setStitchinginfo(java.lang.String stitchinginfo);
        
        /**
         * Sets (as xml) the "stitchinginfo" attribute
         */
        void xsetStitchinginfo(org.apache.xmlbeans.XmlString stitchinginfo);
        
        /**
         * Unsets the "stitchinginfo" attribute
         */
        void unsetStitchinginfo();
        
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
         * Gets the "breakdown" attribute
         */
        java.lang.String getBreakdown();
        
        /**
         * Gets (as xml) the "breakdown" attribute
         */
        org.apache.xmlbeans.XmlString xgetBreakdown();
        
        /**
         * True if has "breakdown" attribute
         */
        boolean isSetBreakdown();
        
        /**
         * Sets the "breakdown" attribute
         */
        void setBreakdown(java.lang.String breakdown);
        
        /**
         * Sets (as xml) the "breakdown" attribute
         */
        void xsetBreakdown(org.apache.xmlbeans.XmlString breakdown);
        
        /**
         * Unsets the "breakdown" attribute
         */
        void unsetBreakdown();
        
        /**
         * Gets the "fqclass" attribute
         */
        java.lang.String getFqclass();
        
        /**
         * Gets (as xml) the "fqclass" attribute
         */
        org.apache.xmlbeans.XmlString xgetFqclass();
        
        /**
         * True if has "fqclass" attribute
         */
        boolean isSetFqclass();
        
        /**
         * Sets the "fqclass" attribute
         */
        void setFqclass(java.lang.String fqclass);
        
        /**
         * Sets (as xml) the "fqclass" attribute
         */
        void xsetFqclass(org.apache.xmlbeans.XmlString fqclass);
        
        /**
         * Unsets the "fqclass" attribute
         */
        void unsetFqclass();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.NodeDocument.Node newInstance() {
              return (noNamespace.NodeDocument.Node) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.NodeDocument.Node newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.NodeDocument.Node) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.NodeDocument newInstance() {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.NodeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.NodeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.NodeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.NodeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.NodeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.NodeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.NodeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.NodeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.NodeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.NodeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.NodeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.NodeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.NodeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.NodeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.NodeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.NodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.NodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
