/*
 * An XML document type.
 * Localname: visit
 * Namespace: 
 * Java type: noNamespace.VisitDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one visit(@) element.
 *
 * This is a complex type.
 */
public class VisitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.VisitDocument
{
    private static final long serialVersionUID = 1L;
    
    public VisitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISIT$0 = 
        new javax.xml.namespace.QName("", "visit");
    
    
    /**
     * Gets the "visit" element
     */
    public noNamespace.VisitDocument.Visit getVisit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.VisitDocument.Visit target = null;
            target = (noNamespace.VisitDocument.Visit)get_store().find_element_user(VISIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "visit" element
     */
    public void setVisit(noNamespace.VisitDocument.Visit visit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.VisitDocument.Visit target = null;
            target = (noNamespace.VisitDocument.Visit)get_store().find_element_user(VISIT$0, 0);
            if (target == null)
            {
                target = (noNamespace.VisitDocument.Visit)get_store().add_element_user(VISIT$0);
            }
            target.set(visit);
        }
    }
    
    /**
     * Appends and returns a new empty "visit" element
     */
    public noNamespace.VisitDocument.Visit addNewVisit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.VisitDocument.Visit target = null;
            target = (noNamespace.VisitDocument.Visit)get_store().add_element_user(VISIT$0);
            return target;
        }
    }
    /**
     * An XML visit(@).
     *
     * This is a complex type.
     */
    public static class VisitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.VisitDocument.Visit
    {
        private static final long serialVersionUID = 1L;
        
        public VisitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VISIT$0 = 
            new javax.xml.namespace.QName("", "visit");
        private static final javax.xml.namespace.QName HEADER$2 = 
            new javax.xml.namespace.QName("", "header");
        private static final javax.xml.namespace.QName COUNT$4 = 
            new javax.xml.namespace.QName("", "count");
        private static final javax.xml.namespace.QName USEREXPERIENCE$6 = 
            new javax.xml.namespace.QName("", "userexperience");
        private static final javax.xml.namespace.QName APDEX$8 = 
            new javax.xml.namespace.QName("", "apdex");
        private static final javax.xml.namespace.QName PAGEACTIONCOUNT$10 = 
            new javax.xml.namespace.QName("", "pageactioncount");
        private static final javax.xml.namespace.QName APPLICATION$12 = 
            new javax.xml.namespace.QName("", "application");
        private static final javax.xml.namespace.QName CLIENTTYPE$14 = 
            new javax.xml.namespace.QName("", "clienttype");
        private static final javax.xml.namespace.QName CLIENTIP$16 = 
            new javax.xml.namespace.QName("", "clientip");
        private static final javax.xml.namespace.QName CONTINENT$18 = 
            new javax.xml.namespace.QName("", "continent");
        private static final javax.xml.namespace.QName COUNTRY$20 = 
            new javax.xml.namespace.QName("", "country");
        private static final javax.xml.namespace.QName STARTTIME$22 = 
            new javax.xml.namespace.QName("", "starttime");
        private static final javax.xml.namespace.QName LASTMODIFIED$24 = 
            new javax.xml.namespace.QName("", "lastmodified");
        private static final javax.xml.namespace.QName DURATION$26 = 
            new javax.xml.namespace.QName("", "duration");
        private static final javax.xml.namespace.QName CLIENTERRORS$28 = 
            new javax.xml.namespace.QName("", "clienterrors");
        private static final javax.xml.namespace.QName FAILEDACTIONS$30 = 
            new javax.xml.namespace.QName("", "failedactions");
        private static final javax.xml.namespace.QName LASTACTIONFAILED$32 = 
            new javax.xml.namespace.QName("", "lastactionfailed");
        private static final javax.xml.namespace.QName BOUNCE$34 = 
            new javax.xml.namespace.QName("", "bounce");
        private static final javax.xml.namespace.QName OSFAMILY$36 = 
            new javax.xml.namespace.QName("", "osfamily");
        private static final javax.xml.namespace.QName OSNAME$38 = 
            new javax.xml.namespace.QName("", "osname");
        private static final javax.xml.namespace.QName USERID$40 = 
            new javax.xml.namespace.QName("", "userid");
        private static final javax.xml.namespace.QName BANDWITH$42 = 
            new javax.xml.namespace.QName("", "bandwith");
        private static final javax.xml.namespace.QName CONVERSION$44 = 
            new javax.xml.namespace.QName("", "conversion");
        private static final javax.xml.namespace.QName TRANSACTIONS$46 = 
            new javax.xml.namespace.QName("", "transactions");
        private static final javax.xml.namespace.QName VISITID$48 = 
            new javax.xml.namespace.QName("", "visitid");
        private static final javax.xml.namespace.QName SESSIONID$50 = 
            new javax.xml.namespace.QName("", "sessionid");
        private static final javax.xml.namespace.QName DEVICENAME$52 = 
            new javax.xml.namespace.QName("", "devicename");
        private static final javax.xml.namespace.QName APPLICATIONNAME$54 = 
            new javax.xml.namespace.QName("", "applicationname");
        private static final javax.xml.namespace.QName APPLICATIONID$56 = 
            new javax.xml.namespace.QName("", "applicationid");
        private static final javax.xml.namespace.QName RESOLUTION$58 = 
            new javax.xml.namespace.QName("", "resolution");
        private static final javax.xml.namespace.QName CONNECTIONTYPE$60 = 
            new javax.xml.namespace.QName("", "connectiontype");
        private static final javax.xml.namespace.QName MANUFACTURER$62 = 
            new javax.xml.namespace.QName("", "manufacturer");
        private static final javax.xml.namespace.QName STREAMMEDIATYPE$64 = 
            new javax.xml.namespace.QName("", "streammediatype");
        private static final javax.xml.namespace.QName STREAMCOUNT$66 = 
            new javax.xml.namespace.QName("", "streamcount");
        private static final javax.xml.namespace.QName AUDIOSTREAMCOUNT$68 = 
            new javax.xml.namespace.QName("", "audiostreamcount");
        private static final javax.xml.namespace.QName VIDEOSTREAMCOUNT$70 = 
            new javax.xml.namespace.QName("", "videostreamcount");
        private static final javax.xml.namespace.QName APPVERSION$72 = 
            new javax.xml.namespace.QName("", "appversion");
        private static final javax.xml.namespace.QName APPBUILD$74 = 
            new javax.xml.namespace.QName("", "appbuild");
        private static final javax.xml.namespace.QName CONVERTEDBY$76 = 
            new javax.xml.namespace.QName("", "convertedby");
        private static final javax.xml.namespace.QName ADKVERSION$78 = 
            new javax.xml.namespace.QName("", "adkversion");
        private static final javax.xml.namespace.QName REGION$80 = 
            new javax.xml.namespace.QName("", "region");
        private static final javax.xml.namespace.QName CITY$82 = 
            new javax.xml.namespace.QName("", "city");
        private static final javax.xml.namespace.QName CARRIER$84 = 
            new javax.xml.namespace.QName("", "carrier");
        private static final javax.xml.namespace.QName GPSLOCATION$86 = 
            new javax.xml.namespace.QName("", "gpslocation");
        private static final javax.xml.namespace.QName MODELID$88 = 
            new javax.xml.namespace.QName("", "modelid");
        private static final javax.xml.namespace.QName CPU$90 = 
            new javax.xml.namespace.QName("", "cpu");
        private static final javax.xml.namespace.QName ROOTED$92 = 
            new javax.xml.namespace.QName("", "rooted");
        private static final javax.xml.namespace.QName CRASHED$94 = 
            new javax.xml.namespace.QName("", "crashed");
        private static final javax.xml.namespace.QName USEREXPERIENCEREASON$96 = 
            new javax.xml.namespace.QName("", "userexperiencereason");
        private static final javax.xml.namespace.QName LANDINGPAGETITLE$98 = 
            new javax.xml.namespace.QName("", "landingpagetitle");
        private static final javax.xml.namespace.QName LANDINGPAGERESPONSETIME$100 = 
            new javax.xml.namespace.QName("", "landingpageresponsetime");
        private static final javax.xml.namespace.QName LANDINGPAGEFAILED$102 = 
            new javax.xml.namespace.QName("", "landingpagefailed");
        private static final javax.xml.namespace.QName EXITPAGETITLE$104 = 
            new javax.xml.namespace.QName("", "exitpagetitle");
        private static final javax.xml.namespace.QName EXITPAGERESPONSETIME$106 = 
            new javax.xml.namespace.QName("", "exitpageresponsetime");
        private static final javax.xml.namespace.QName EXITPAGEFAILED$108 = 
            new javax.xml.namespace.QName("", "exitpagefailed");
        private static final javax.xml.namespace.QName VISITTAGS$110 = 
            new javax.xml.namespace.QName("", "visittags");
        private static final javax.xml.namespace.QName ENDTIME$112 = 
            new javax.xml.namespace.QName("", "endtime");
        private static final javax.xml.namespace.QName ENDREASON$114 = 
            new javax.xml.namespace.QName("", "endreason");
        
        
        /**
         * Gets array of all "visit" elements
         */
        public noNamespace.VisitDocument.Visit[] getVisitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VISIT$0, targetList);
                noNamespace.VisitDocument.Visit[] result = new noNamespace.VisitDocument.Visit[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "visit" element
         */
        public noNamespace.VisitDocument.Visit getVisitArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitDocument.Visit target = null;
                target = (noNamespace.VisitDocument.Visit)get_store().find_element_user(VISIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "visit" element
         */
        public int sizeOfVisitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VISIT$0);
            }
        }
        
        /**
         * Sets array of all "visit" element
         */
        public void setVisitArray(noNamespace.VisitDocument.Visit[] visitArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(visitArray, VISIT$0);
            }
        }
        
        /**
         * Sets ith "visit" element
         */
        public void setVisitArray(int i, noNamespace.VisitDocument.Visit visit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitDocument.Visit target = null;
                target = (noNamespace.VisitDocument.Visit)get_store().find_element_user(VISIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(visit);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "visit" element
         */
        public noNamespace.VisitDocument.Visit insertNewVisit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitDocument.Visit target = null;
                target = (noNamespace.VisitDocument.Visit)get_store().insert_element_user(VISIT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "visit" element
         */
        public noNamespace.VisitDocument.Visit addNewVisit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.VisitDocument.Visit target = null;
                target = (noNamespace.VisitDocument.Visit)get_store().add_element_user(VISIT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "visit" element
         */
        public void removeVisit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VISIT$0, i);
            }
        }
        
        /**
         * Gets the "header" attribute
         */
        public java.lang.String getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "header" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADER$2);
                return target;
            }
        }
        
        /**
         * True if has "header" attribute
         */
        public boolean isSetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEADER$2) != null;
            }
        }
        
        /**
         * Sets the "header" attribute
         */
        public void setHeader(java.lang.String header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADER$2);
                }
                target.setStringValue(header);
            }
        }
        
        /**
         * Sets (as xml) the "header" attribute
         */
        public void xsetHeader(org.apache.xmlbeans.XmlString header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADER$2);
                }
                target.set(header);
            }
        }
        
        /**
         * Unsets the "header" attribute
         */
        public void unsetHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEADER$2);
            }
        }
        
        /**
         * Gets the "count" attribute
         */
        public java.math.BigInteger getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "count" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$4);
                return target;
            }
        }
        
        /**
         * True if has "count" attribute
         */
        public boolean isSetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNT$4) != null;
            }
        }
        
        /**
         * Sets the "count" attribute
         */
        public void setCount(java.math.BigInteger count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$4);
                }
                target.setBigIntegerValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "count" attribute
         */
        public void xsetCount(org.apache.xmlbeans.XmlInteger count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$4);
                }
                target.set(count);
            }
        }
        
        /**
         * Unsets the "count" attribute
         */
        public void unsetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNT$4);
            }
        }
        
        /**
         * Gets the "userexperience" attribute
         */
        public java.lang.String getUserexperience()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEREXPERIENCE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userexperience" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUserexperience()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEREXPERIENCE$6);
                return target;
            }
        }
        
        /**
         * True if has "userexperience" attribute
         */
        public boolean isSetUserexperience()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEREXPERIENCE$6) != null;
            }
        }
        
        /**
         * Sets the "userexperience" attribute
         */
        public void setUserexperience(java.lang.String userexperience)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEREXPERIENCE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEREXPERIENCE$6);
                }
                target.setStringValue(userexperience);
            }
        }
        
        /**
         * Sets (as xml) the "userexperience" attribute
         */
        public void xsetUserexperience(org.apache.xmlbeans.XmlString userexperience)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEREXPERIENCE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEREXPERIENCE$6);
                }
                target.set(userexperience);
            }
        }
        
        /**
         * Unsets the "userexperience" attribute
         */
        public void unsetUserexperience()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEREXPERIENCE$6);
            }
        }
        
        /**
         * Gets the "apdex" attribute
         */
        public java.lang.String getApdex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APDEX$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apdex" attribute
         */
        public org.apache.xmlbeans.XmlString xgetApdex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APDEX$8);
                return target;
            }
        }
        
        /**
         * True if has "apdex" attribute
         */
        public boolean isSetApdex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APDEX$8) != null;
            }
        }
        
        /**
         * Sets the "apdex" attribute
         */
        public void setApdex(java.lang.String apdex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APDEX$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APDEX$8);
                }
                target.setStringValue(apdex);
            }
        }
        
        /**
         * Sets (as xml) the "apdex" attribute
         */
        public void xsetApdex(org.apache.xmlbeans.XmlString apdex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APDEX$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APDEX$8);
                }
                target.set(apdex);
            }
        }
        
        /**
         * Unsets the "apdex" attribute
         */
        public void unsetApdex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APDEX$8);
            }
        }
        
        /**
         * Gets the "pageactioncount" attribute
         */
        public java.math.BigInteger getPageactioncount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEACTIONCOUNT$10);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pageactioncount" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPageactioncount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGEACTIONCOUNT$10);
                return target;
            }
        }
        
        /**
         * True if has "pageactioncount" attribute
         */
        public boolean isSetPageactioncount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGEACTIONCOUNT$10) != null;
            }
        }
        
        /**
         * Sets the "pageactioncount" attribute
         */
        public void setPageactioncount(java.math.BigInteger pageactioncount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEACTIONCOUNT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGEACTIONCOUNT$10);
                }
                target.setBigIntegerValue(pageactioncount);
            }
        }
        
        /**
         * Sets (as xml) the "pageactioncount" attribute
         */
        public void xsetPageactioncount(org.apache.xmlbeans.XmlInteger pageactioncount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PAGEACTIONCOUNT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PAGEACTIONCOUNT$10);
                }
                target.set(pageactioncount);
            }
        }
        
        /**
         * Unsets the "pageactioncount" attribute
         */
        public void unsetPageactioncount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGEACTIONCOUNT$10);
            }
        }
        
        /**
         * Gets the "application" attribute
         */
        public java.lang.String getApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "application" attribute
         */
        public org.apache.xmlbeans.XmlString xgetApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$12);
                return target;
            }
        }
        
        /**
         * True if has "application" attribute
         */
        public boolean isSetApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLICATION$12) != null;
            }
        }
        
        /**
         * Sets the "application" attribute
         */
        public void setApplication(java.lang.String application)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATION$12);
                }
                target.setStringValue(application);
            }
        }
        
        /**
         * Sets (as xml) the "application" attribute
         */
        public void xsetApplication(org.apache.xmlbeans.XmlString application)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATION$12);
                }
                target.set(application);
            }
        }
        
        /**
         * Unsets the "application" attribute
         */
        public void unsetApplication()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLICATION$12);
            }
        }
        
        /**
         * Gets the "clienttype" attribute
         */
        public java.lang.String getClienttype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTTYPE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clienttype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClienttype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTTYPE$14);
                return target;
            }
        }
        
        /**
         * True if has "clienttype" attribute
         */
        public boolean isSetClienttype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLIENTTYPE$14) != null;
            }
        }
        
        /**
         * Sets the "clienttype" attribute
         */
        public void setClienttype(java.lang.String clienttype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTTYPE$14);
                }
                target.setStringValue(clienttype);
            }
        }
        
        /**
         * Sets (as xml) the "clienttype" attribute
         */
        public void xsetClienttype(org.apache.xmlbeans.XmlString clienttype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTTYPE$14);
                }
                target.set(clienttype);
            }
        }
        
        /**
         * Unsets the "clienttype" attribute
         */
        public void unsetClienttype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLIENTTYPE$14);
            }
        }
        
        /**
         * Gets the "clientip" attribute
         */
        public java.lang.String getClientip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clientip" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClientip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$16);
                return target;
            }
        }
        
        /**
         * True if has "clientip" attribute
         */
        public boolean isSetClientip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLIENTIP$16) != null;
            }
        }
        
        /**
         * Sets the "clientip" attribute
         */
        public void setClientip(java.lang.String clientip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTIP$16);
                }
                target.setStringValue(clientip);
            }
        }
        
        /**
         * Sets (as xml) the "clientip" attribute
         */
        public void xsetClientip(org.apache.xmlbeans.XmlString clientip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTIP$16);
                }
                target.set(clientip);
            }
        }
        
        /**
         * Unsets the "clientip" attribute
         */
        public void unsetClientip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLIENTIP$16);
            }
        }
        
        /**
         * Gets the "continent" attribute
         */
        public java.lang.String getContinent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTINENT$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "continent" attribute
         */
        public org.apache.xmlbeans.XmlString xgetContinent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTINENT$18);
                return target;
            }
        }
        
        /**
         * True if has "continent" attribute
         */
        public boolean isSetContinent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTINENT$18) != null;
            }
        }
        
        /**
         * Sets the "continent" attribute
         */
        public void setContinent(java.lang.String continent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTINENT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTINENT$18);
                }
                target.setStringValue(continent);
            }
        }
        
        /**
         * Sets (as xml) the "continent" attribute
         */
        public void xsetContinent(org.apache.xmlbeans.XmlString continent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTINENT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTINENT$18);
                }
                target.set(continent);
            }
        }
        
        /**
         * Unsets the "continent" attribute
         */
        public void unsetContinent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTINENT$18);
            }
        }
        
        /**
         * Gets the "country" attribute
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "country" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$20);
                return target;
            }
        }
        
        /**
         * True if has "country" attribute
         */
        public boolean isSetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COUNTRY$20) != null;
            }
        }
        
        /**
         * Sets the "country" attribute
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRY$20);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "country" attribute
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRY$20);
                }
                target.set(country);
            }
        }
        
        /**
         * Unsets the "country" attribute
         */
        public void unsetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COUNTRY$20);
            }
        }
        
        /**
         * Gets the "starttime" attribute
         */
        public java.lang.String getStarttime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "starttime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStarttime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTTIME$22);
                return target;
            }
        }
        
        /**
         * True if has "starttime" attribute
         */
        public boolean isSetStarttime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STARTTIME$22) != null;
            }
        }
        
        /**
         * Sets the "starttime" attribute
         */
        public void setStarttime(java.lang.String starttime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$22);
                }
                target.setStringValue(starttime);
            }
        }
        
        /**
         * Sets (as xml) the "starttime" attribute
         */
        public void xsetStarttime(org.apache.xmlbeans.XmlString starttime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTTIME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTTIME$22);
                }
                target.set(starttime);
            }
        }
        
        /**
         * Unsets the "starttime" attribute
         */
        public void unsetStarttime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STARTTIME$22);
            }
        }
        
        /**
         * Gets the "lastmodified" attribute
         */
        public java.lang.String getLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTMODIFIED$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastmodified" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTMODIFIED$24);
                return target;
            }
        }
        
        /**
         * True if has "lastmodified" attribute
         */
        public boolean isSetLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASTMODIFIED$24) != null;
            }
        }
        
        /**
         * Sets the "lastmodified" attribute
         */
        public void setLastmodified(java.lang.String lastmodified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTMODIFIED$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTMODIFIED$24);
                }
                target.setStringValue(lastmodified);
            }
        }
        
        /**
         * Sets (as xml) the "lastmodified" attribute
         */
        public void xsetLastmodified(org.apache.xmlbeans.XmlString lastmodified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTMODIFIED$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTMODIFIED$24);
                }
                target.set(lastmodified);
            }
        }
        
        /**
         * Unsets the "lastmodified" attribute
         */
        public void unsetLastmodified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASTMODIFIED$24);
            }
        }
        
        /**
         * Gets the "duration" attribute
         */
        public java.lang.String getDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "duration" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$26);
                return target;
            }
        }
        
        /**
         * True if has "duration" attribute
         */
        public boolean isSetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DURATION$26) != null;
            }
        }
        
        /**
         * Sets the "duration" attribute
         */
        public void setDuration(java.lang.String duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DURATION$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DURATION$26);
                }
                target.setStringValue(duration);
            }
        }
        
        /**
         * Sets (as xml) the "duration" attribute
         */
        public void xsetDuration(org.apache.xmlbeans.XmlString duration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DURATION$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DURATION$26);
                }
                target.set(duration);
            }
        }
        
        /**
         * Unsets the "duration" attribute
         */
        public void unsetDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DURATION$26);
            }
        }
        
        /**
         * Gets the "clienterrors" attribute
         */
        public java.lang.String getClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTERRORS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "clienterrors" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTERRORS$28);
                return target;
            }
        }
        
        /**
         * True if has "clienterrors" attribute
         */
        public boolean isSetClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLIENTERRORS$28) != null;
            }
        }
        
        /**
         * Sets the "clienterrors" attribute
         */
        public void setClienterrors(java.lang.String clienterrors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTERRORS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTERRORS$28);
                }
                target.setStringValue(clienterrors);
            }
        }
        
        /**
         * Sets (as xml) the "clienterrors" attribute
         */
        public void xsetClienterrors(org.apache.xmlbeans.XmlString clienterrors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTERRORS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTERRORS$28);
                }
                target.set(clienterrors);
            }
        }
        
        /**
         * Unsets the "clienterrors" attribute
         */
        public void unsetClienterrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLIENTERRORS$28);
            }
        }
        
        /**
         * Gets the "failedactions" attribute
         */
        public java.lang.String getFailedactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILEDACTIONS$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "failedactions" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFailedactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILEDACTIONS$30);
                return target;
            }
        }
        
        /**
         * True if has "failedactions" attribute
         */
        public boolean isSetFailedactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FAILEDACTIONS$30) != null;
            }
        }
        
        /**
         * Sets the "failedactions" attribute
         */
        public void setFailedactions(java.lang.String failedactions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILEDACTIONS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILEDACTIONS$30);
                }
                target.setStringValue(failedactions);
            }
        }
        
        /**
         * Sets (as xml) the "failedactions" attribute
         */
        public void xsetFailedactions(org.apache.xmlbeans.XmlString failedactions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILEDACTIONS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILEDACTIONS$30);
                }
                target.set(failedactions);
            }
        }
        
        /**
         * Unsets the "failedactions" attribute
         */
        public void unsetFailedactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FAILEDACTIONS$30);
            }
        }
        
        /**
         * Gets the "lastactionfailed" attribute
         */
        public java.lang.String getLastactionfailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTACTIONFAILED$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastactionfailed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLastactionfailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTACTIONFAILED$32);
                return target;
            }
        }
        
        /**
         * True if has "lastactionfailed" attribute
         */
        public boolean isSetLastactionfailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LASTACTIONFAILED$32) != null;
            }
        }
        
        /**
         * Sets the "lastactionfailed" attribute
         */
        public void setLastactionfailed(java.lang.String lastactionfailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTACTIONFAILED$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTACTIONFAILED$32);
                }
                target.setStringValue(lastactionfailed);
            }
        }
        
        /**
         * Sets (as xml) the "lastactionfailed" attribute
         */
        public void xsetLastactionfailed(org.apache.xmlbeans.XmlString lastactionfailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LASTACTIONFAILED$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LASTACTIONFAILED$32);
                }
                target.set(lastactionfailed);
            }
        }
        
        /**
         * Unsets the "lastactionfailed" attribute
         */
        public void unsetLastactionfailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LASTACTIONFAILED$32);
            }
        }
        
        /**
         * Gets the "bounce" attribute
         */
        public java.lang.String getBounce()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOUNCE$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bounce" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBounce()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BOUNCE$34);
                return target;
            }
        }
        
        /**
         * True if has "bounce" attribute
         */
        public boolean isSetBounce()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BOUNCE$34) != null;
            }
        }
        
        /**
         * Sets the "bounce" attribute
         */
        public void setBounce(java.lang.String bounce)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOUNCE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOUNCE$34);
                }
                target.setStringValue(bounce);
            }
        }
        
        /**
         * Sets (as xml) the "bounce" attribute
         */
        public void xsetBounce(org.apache.xmlbeans.XmlString bounce)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BOUNCE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BOUNCE$34);
                }
                target.set(bounce);
            }
        }
        
        /**
         * Unsets the "bounce" attribute
         */
        public void unsetBounce()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BOUNCE$34);
            }
        }
        
        /**
         * Gets the "osfamily" attribute
         */
        public java.lang.String getOsfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSFAMILY$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "osfamily" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOsfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSFAMILY$36);
                return target;
            }
        }
        
        /**
         * True if has "osfamily" attribute
         */
        public boolean isSetOsfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OSFAMILY$36) != null;
            }
        }
        
        /**
         * Sets the "osfamily" attribute
         */
        public void setOsfamily(java.lang.String osfamily)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSFAMILY$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OSFAMILY$36);
                }
                target.setStringValue(osfamily);
            }
        }
        
        /**
         * Sets (as xml) the "osfamily" attribute
         */
        public void xsetOsfamily(org.apache.xmlbeans.XmlString osfamily)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSFAMILY$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OSFAMILY$36);
                }
                target.set(osfamily);
            }
        }
        
        /**
         * Unsets the "osfamily" attribute
         */
        public void unsetOsfamily()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OSFAMILY$36);
            }
        }
        
        /**
         * Gets the "osname" attribute
         */
        public java.lang.String getOsname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSNAME$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "osname" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOsname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSNAME$38);
                return target;
            }
        }
        
        /**
         * True if has "osname" attribute
         */
        public boolean isSetOsname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OSNAME$38) != null;
            }
        }
        
        /**
         * Sets the "osname" attribute
         */
        public void setOsname(java.lang.String osname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSNAME$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OSNAME$38);
                }
                target.setStringValue(osname);
            }
        }
        
        /**
         * Sets (as xml) the "osname" attribute
         */
        public void xsetOsname(org.apache.xmlbeans.XmlString osname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSNAME$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OSNAME$38);
                }
                target.set(osname);
            }
        }
        
        /**
         * Unsets the "osname" attribute
         */
        public void unsetOsname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OSNAME$38);
            }
        }
        
        /**
         * Gets the "userid" attribute
         */
        public java.lang.String getUserid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERID$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUserid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERID$40);
                return target;
            }
        }
        
        /**
         * True if has "userid" attribute
         */
        public boolean isSetUserid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USERID$40) != null;
            }
        }
        
        /**
         * Sets the "userid" attribute
         */
        public void setUserid(java.lang.String userid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERID$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERID$40);
                }
                target.setStringValue(userid);
            }
        }
        
        /**
         * Sets (as xml) the "userid" attribute
         */
        public void xsetUserid(org.apache.xmlbeans.XmlString userid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERID$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERID$40);
                }
                target.set(userid);
            }
        }
        
        /**
         * Unsets the "userid" attribute
         */
        public void unsetUserid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USERID$40);
            }
        }
        
        /**
         * Gets the "bandwith" attribute
         */
        public java.lang.String getBandwith()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWITH$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bandwith" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBandwith()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWITH$42);
                return target;
            }
        }
        
        /**
         * True if has "bandwith" attribute
         */
        public boolean isSetBandwith()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BANDWITH$42) != null;
            }
        }
        
        /**
         * Sets the "bandwith" attribute
         */
        public void setBandwith(java.lang.String bandwith)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWITH$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANDWITH$42);
                }
                target.setStringValue(bandwith);
            }
        }
        
        /**
         * Sets (as xml) the "bandwith" attribute
         */
        public void xsetBandwith(org.apache.xmlbeans.XmlString bandwith)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWITH$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BANDWITH$42);
                }
                target.set(bandwith);
            }
        }
        
        /**
         * Unsets the "bandwith" attribute
         */
        public void unsetBandwith()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BANDWITH$42);
            }
        }
        
        /**
         * Gets the "conversion" attribute
         */
        public java.lang.String getConversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSION$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "conversion" attribute
         */
        public org.apache.xmlbeans.XmlString xgetConversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONVERSION$44);
                return target;
            }
        }
        
        /**
         * True if has "conversion" attribute
         */
        public boolean isSetConversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONVERSION$44) != null;
            }
        }
        
        /**
         * Sets the "conversion" attribute
         */
        public void setConversion(java.lang.String conversion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERSION$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONVERSION$44);
                }
                target.setStringValue(conversion);
            }
        }
        
        /**
         * Sets (as xml) the "conversion" attribute
         */
        public void xsetConversion(org.apache.xmlbeans.XmlString conversion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONVERSION$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONVERSION$44);
                }
                target.set(conversion);
            }
        }
        
        /**
         * Unsets the "conversion" attribute
         */
        public void unsetConversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONVERSION$44);
            }
        }
        
        /**
         * Gets the "transactions" attribute
         */
        public java.lang.String getTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONS$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "transactions" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONS$46);
                return target;
            }
        }
        
        /**
         * True if has "transactions" attribute
         */
        public boolean isSetTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRANSACTIONS$46) != null;
            }
        }
        
        /**
         * Sets the "transactions" attribute
         */
        public void setTransactions(java.lang.String transactions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONS$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSACTIONS$46);
                }
                target.setStringValue(transactions);
            }
        }
        
        /**
         * Sets (as xml) the "transactions" attribute
         */
        public void xsetTransactions(org.apache.xmlbeans.XmlString transactions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONS$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TRANSACTIONS$46);
                }
                target.set(transactions);
            }
        }
        
        /**
         * Unsets the "transactions" attribute
         */
        public void unsetTransactions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRANSACTIONS$46);
            }
        }
        
        /**
         * Gets the "visitid" attribute
         */
        public java.lang.String getVisitid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$48);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "visitid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVisitid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$48);
                return target;
            }
        }
        
        /**
         * True if has "visitid" attribute
         */
        public boolean isSetVisitid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VISITID$48) != null;
            }
        }
        
        /**
         * Sets the "visitid" attribute
         */
        public void setVisitid(java.lang.String visitid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISITID$48);
                }
                target.setStringValue(visitid);
            }
        }
        
        /**
         * Sets (as xml) the "visitid" attribute
         */
        public void xsetVisitid(org.apache.xmlbeans.XmlString visitid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISITID$48);
                }
                target.set(visitid);
            }
        }
        
        /**
         * Unsets the "visitid" attribute
         */
        public void unsetVisitid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VISITID$48);
            }
        }
        
        /**
         * Gets the "sessionid" attribute
         */
        public java.lang.String getSessionid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$50);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sessionid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSessionid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$50);
                return target;
            }
        }
        
        /**
         * True if has "sessionid" attribute
         */
        public boolean isSetSessionid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SESSIONID$50) != null;
            }
        }
        
        /**
         * Sets the "sessionid" attribute
         */
        public void setSessionid(java.lang.String sessionid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONID$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSIONID$50);
                }
                target.setStringValue(sessionid);
            }
        }
        
        /**
         * Sets (as xml) the "sessionid" attribute
         */
        public void xsetSessionid(org.apache.xmlbeans.XmlString sessionid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONID$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SESSIONID$50);
                }
                target.set(sessionid);
            }
        }
        
        /**
         * Unsets the "sessionid" attribute
         */
        public void unsetSessionid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SESSIONID$50);
            }
        }
        
        /**
         * Gets the "devicename" attribute
         */
        public java.lang.String getDevicename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICENAME$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "devicename" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDevicename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICENAME$52);
                return target;
            }
        }
        
        /**
         * True if has "devicename" attribute
         */
        public boolean isSetDevicename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEVICENAME$52) != null;
            }
        }
        
        /**
         * Sets the "devicename" attribute
         */
        public void setDevicename(java.lang.String devicename)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICENAME$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEVICENAME$52);
                }
                target.setStringValue(devicename);
            }
        }
        
        /**
         * Sets (as xml) the "devicename" attribute
         */
        public void xsetDevicename(org.apache.xmlbeans.XmlString devicename)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICENAME$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEVICENAME$52);
                }
                target.set(devicename);
            }
        }
        
        /**
         * Unsets the "devicename" attribute
         */
        public void unsetDevicename()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEVICENAME$52);
            }
        }
        
        /**
         * Gets the "applicationname" attribute
         */
        public java.lang.String getApplicationname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONNAME$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "applicationname" attribute
         */
        public org.apache.xmlbeans.XmlString xgetApplicationname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONNAME$54);
                return target;
            }
        }
        
        /**
         * True if has "applicationname" attribute
         */
        public boolean isSetApplicationname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLICATIONNAME$54) != null;
            }
        }
        
        /**
         * Sets the "applicationname" attribute
         */
        public void setApplicationname(java.lang.String applicationname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONNAME$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONNAME$54);
                }
                target.setStringValue(applicationname);
            }
        }
        
        /**
         * Sets (as xml) the "applicationname" attribute
         */
        public void xsetApplicationname(org.apache.xmlbeans.XmlString applicationname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONNAME$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATIONNAME$54);
                }
                target.set(applicationname);
            }
        }
        
        /**
         * Unsets the "applicationname" attribute
         */
        public void unsetApplicationname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLICATIONNAME$54);
            }
        }
        
        /**
         * Gets the "applicationid" attribute
         */
        public java.lang.String getApplicationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$56);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "applicationid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetApplicationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$56);
                return target;
            }
        }
        
        /**
         * True if has "applicationid" attribute
         */
        public boolean isSetApplicationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPLICATIONID$56) != null;
            }
        }
        
        /**
         * Sets the "applicationid" attribute
         */
        public void setApplicationid(java.lang.String applicationid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATIONID$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATIONID$56);
                }
                target.setStringValue(applicationid);
            }
        }
        
        /**
         * Sets (as xml) the "applicationid" attribute
         */
        public void xsetApplicationid(org.apache.xmlbeans.XmlString applicationid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATIONID$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATIONID$56);
                }
                target.set(applicationid);
            }
        }
        
        /**
         * Unsets the "applicationid" attribute
         */
        public void unsetApplicationid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPLICATIONID$56);
            }
        }
        
        /**
         * Gets the "resolution" attribute
         */
        public java.lang.String getResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLUTION$58);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "resolution" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOLUTION$58);
                return target;
            }
        }
        
        /**
         * True if has "resolution" attribute
         */
        public boolean isSetResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESOLUTION$58) != null;
            }
        }
        
        /**
         * Sets the "resolution" attribute
         */
        public void setResolution(java.lang.String resolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLUTION$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOLUTION$58);
                }
                target.setStringValue(resolution);
            }
        }
        
        /**
         * Sets (as xml) the "resolution" attribute
         */
        public void xsetResolution(org.apache.xmlbeans.XmlString resolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOLUTION$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOLUTION$58);
                }
                target.set(resolution);
            }
        }
        
        /**
         * Unsets the "resolution" attribute
         */
        public void unsetResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESOLUTION$58);
            }
        }
        
        /**
         * Gets the "connectiontype" attribute
         */
        public java.lang.String getConnectiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONTYPE$60);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "connectiontype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetConnectiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTIONTYPE$60);
                return target;
            }
        }
        
        /**
         * True if has "connectiontype" attribute
         */
        public boolean isSetConnectiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONNECTIONTYPE$60) != null;
            }
        }
        
        /**
         * Sets the "connectiontype" attribute
         */
        public void setConnectiontype(java.lang.String connectiontype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONTYPE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONTYPE$60);
                }
                target.setStringValue(connectiontype);
            }
        }
        
        /**
         * Sets (as xml) the "connectiontype" attribute
         */
        public void xsetConnectiontype(org.apache.xmlbeans.XmlString connectiontype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTIONTYPE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTIONTYPE$60);
                }
                target.set(connectiontype);
            }
        }
        
        /**
         * Unsets the "connectiontype" attribute
         */
        public void unsetConnectiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONNECTIONTYPE$60);
            }
        }
        
        /**
         * Gets the "manufacturer" attribute
         */
        public java.lang.String getManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "manufacturer" attribute
         */
        public org.apache.xmlbeans.XmlString xgetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$62);
                return target;
            }
        }
        
        /**
         * True if has "manufacturer" attribute
         */
        public boolean isSetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MANUFACTURER$62) != null;
            }
        }
        
        /**
         * Sets the "manufacturer" attribute
         */
        public void setManufacturer(java.lang.String manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANUFACTURER$62);
                }
                target.setStringValue(manufacturer);
            }
        }
        
        /**
         * Sets (as xml) the "manufacturer" attribute
         */
        public void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MANUFACTURER$62);
                }
                target.set(manufacturer);
            }
        }
        
        /**
         * Unsets the "manufacturer" attribute
         */
        public void unsetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MANUFACTURER$62);
            }
        }
        
        /**
         * Gets the "streammediatype" attribute
         */
        public java.lang.String getStreammediatype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREAMMEDIATYPE$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "streammediatype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStreammediatype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STREAMMEDIATYPE$64);
                return target;
            }
        }
        
        /**
         * True if has "streammediatype" attribute
         */
        public boolean isSetStreammediatype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STREAMMEDIATYPE$64) != null;
            }
        }
        
        /**
         * Sets the "streammediatype" attribute
         */
        public void setStreammediatype(java.lang.String streammediatype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREAMMEDIATYPE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STREAMMEDIATYPE$64);
                }
                target.setStringValue(streammediatype);
            }
        }
        
        /**
         * Sets (as xml) the "streammediatype" attribute
         */
        public void xsetStreammediatype(org.apache.xmlbeans.XmlString streammediatype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STREAMMEDIATYPE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STREAMMEDIATYPE$64);
                }
                target.set(streammediatype);
            }
        }
        
        /**
         * Unsets the "streammediatype" attribute
         */
        public void unsetStreammediatype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STREAMMEDIATYPE$64);
            }
        }
        
        /**
         * Gets the "streamcount" attribute
         */
        public java.math.BigInteger getStreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREAMCOUNT$66);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "streamcount" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetStreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(STREAMCOUNT$66);
                return target;
            }
        }
        
        /**
         * True if has "streamcount" attribute
         */
        public boolean isSetStreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STREAMCOUNT$66) != null;
            }
        }
        
        /**
         * Sets the "streamcount" attribute
         */
        public void setStreamcount(java.math.BigInteger streamcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STREAMCOUNT$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STREAMCOUNT$66);
                }
                target.setBigIntegerValue(streamcount);
            }
        }
        
        /**
         * Sets (as xml) the "streamcount" attribute
         */
        public void xsetStreamcount(org.apache.xmlbeans.XmlInteger streamcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(STREAMCOUNT$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(STREAMCOUNT$66);
                }
                target.set(streamcount);
            }
        }
        
        /**
         * Unsets the "streamcount" attribute
         */
        public void unsetStreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STREAMCOUNT$66);
            }
        }
        
        /**
         * Gets the "audiostreamcount" attribute
         */
        public java.math.BigInteger getAudiostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUDIOSTREAMCOUNT$68);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "audiostreamcount" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetAudiostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AUDIOSTREAMCOUNT$68);
                return target;
            }
        }
        
        /**
         * True if has "audiostreamcount" attribute
         */
        public boolean isSetAudiostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUDIOSTREAMCOUNT$68) != null;
            }
        }
        
        /**
         * Sets the "audiostreamcount" attribute
         */
        public void setAudiostreamcount(java.math.BigInteger audiostreamcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUDIOSTREAMCOUNT$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUDIOSTREAMCOUNT$68);
                }
                target.setBigIntegerValue(audiostreamcount);
            }
        }
        
        /**
         * Sets (as xml) the "audiostreamcount" attribute
         */
        public void xsetAudiostreamcount(org.apache.xmlbeans.XmlInteger audiostreamcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(AUDIOSTREAMCOUNT$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(AUDIOSTREAMCOUNT$68);
                }
                target.set(audiostreamcount);
            }
        }
        
        /**
         * Unsets the "audiostreamcount" attribute
         */
        public void unsetAudiostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUDIOSTREAMCOUNT$68);
            }
        }
        
        /**
         * Gets the "videostreamcount" attribute
         */
        public java.math.BigInteger getVideostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIDEOSTREAMCOUNT$70);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "videostreamcount" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetVideostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIDEOSTREAMCOUNT$70);
                return target;
            }
        }
        
        /**
         * True if has "videostreamcount" attribute
         */
        public boolean isSetVideostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIDEOSTREAMCOUNT$70) != null;
            }
        }
        
        /**
         * Sets the "videostreamcount" attribute
         */
        public void setVideostreamcount(java.math.BigInteger videostreamcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIDEOSTREAMCOUNT$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIDEOSTREAMCOUNT$70);
                }
                target.setBigIntegerValue(videostreamcount);
            }
        }
        
        /**
         * Sets (as xml) the "videostreamcount" attribute
         */
        public void xsetVideostreamcount(org.apache.xmlbeans.XmlInteger videostreamcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIDEOSTREAMCOUNT$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIDEOSTREAMCOUNT$70);
                }
                target.set(videostreamcount);
            }
        }
        
        /**
         * Unsets the "videostreamcount" attribute
         */
        public void unsetVideostreamcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIDEOSTREAMCOUNT$70);
            }
        }
        
        /**
         * Gets the "appversion" attribute
         */
        public java.lang.String getAppversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPVERSION$72);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "appversion" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAppversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPVERSION$72);
                return target;
            }
        }
        
        /**
         * True if has "appversion" attribute
         */
        public boolean isSetAppversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPVERSION$72) != null;
            }
        }
        
        /**
         * Sets the "appversion" attribute
         */
        public void setAppversion(java.lang.String appversion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPVERSION$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPVERSION$72);
                }
                target.setStringValue(appversion);
            }
        }
        
        /**
         * Sets (as xml) the "appversion" attribute
         */
        public void xsetAppversion(org.apache.xmlbeans.XmlString appversion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPVERSION$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPVERSION$72);
                }
                target.set(appversion);
            }
        }
        
        /**
         * Unsets the "appversion" attribute
         */
        public void unsetAppversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPVERSION$72);
            }
        }
        
        /**
         * Gets the "appbuild" attribute
         */
        public java.lang.String getAppbuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPBUILD$74);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "appbuild" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAppbuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPBUILD$74);
                return target;
            }
        }
        
        /**
         * True if has "appbuild" attribute
         */
        public boolean isSetAppbuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPBUILD$74) != null;
            }
        }
        
        /**
         * Sets the "appbuild" attribute
         */
        public void setAppbuild(java.lang.String appbuild)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPBUILD$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPBUILD$74);
                }
                target.setStringValue(appbuild);
            }
        }
        
        /**
         * Sets (as xml) the "appbuild" attribute
         */
        public void xsetAppbuild(org.apache.xmlbeans.XmlString appbuild)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPBUILD$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPBUILD$74);
                }
                target.set(appbuild);
            }
        }
        
        /**
         * Unsets the "appbuild" attribute
         */
        public void unsetAppbuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPBUILD$74);
            }
        }
        
        /**
         * Gets the "convertedby" attribute
         */
        public java.lang.String getConvertedby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERTEDBY$76);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "convertedby" attribute
         */
        public org.apache.xmlbeans.XmlString xgetConvertedby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONVERTEDBY$76);
                return target;
            }
        }
        
        /**
         * True if has "convertedby" attribute
         */
        public boolean isSetConvertedby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONVERTEDBY$76) != null;
            }
        }
        
        /**
         * Sets the "convertedby" attribute
         */
        public void setConvertedby(java.lang.String convertedby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONVERTEDBY$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONVERTEDBY$76);
                }
                target.setStringValue(convertedby);
            }
        }
        
        /**
         * Sets (as xml) the "convertedby" attribute
         */
        public void xsetConvertedby(org.apache.xmlbeans.XmlString convertedby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONVERTEDBY$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONVERTEDBY$76);
                }
                target.set(convertedby);
            }
        }
        
        /**
         * Unsets the "convertedby" attribute
         */
        public void unsetConvertedby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONVERTEDBY$76);
            }
        }
        
        /**
         * Gets the "adkversion" attribute
         */
        public java.lang.String getAdkversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADKVERSION$78);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "adkversion" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAdkversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADKVERSION$78);
                return target;
            }
        }
        
        /**
         * True if has "adkversion" attribute
         */
        public boolean isSetAdkversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ADKVERSION$78) != null;
            }
        }
        
        /**
         * Sets the "adkversion" attribute
         */
        public void setAdkversion(java.lang.String adkversion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADKVERSION$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADKVERSION$78);
                }
                target.setStringValue(adkversion);
            }
        }
        
        /**
         * Sets (as xml) the "adkversion" attribute
         */
        public void xsetAdkversion(org.apache.xmlbeans.XmlString adkversion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADKVERSION$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADKVERSION$78);
                }
                target.set(adkversion);
            }
        }
        
        /**
         * Unsets the "adkversion" attribute
         */
        public void unsetAdkversion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ADKVERSION$78);
            }
        }
        
        /**
         * Gets the "region" attribute
         */
        public java.lang.String getRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGION$80);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "region" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REGION$80);
                return target;
            }
        }
        
        /**
         * True if has "region" attribute
         */
        public boolean isSetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REGION$80) != null;
            }
        }
        
        /**
         * Sets the "region" attribute
         */
        public void setRegion(java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGION$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REGION$80);
                }
                target.setStringValue(region);
            }
        }
        
        /**
         * Sets (as xml) the "region" attribute
         */
        public void xsetRegion(org.apache.xmlbeans.XmlString region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REGION$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REGION$80);
                }
                target.set(region);
            }
        }
        
        /**
         * Unsets the "region" attribute
         */
        public void unsetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REGION$80);
            }
        }
        
        /**
         * Gets the "city" attribute
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$82);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "city" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$82);
                return target;
            }
        }
        
        /**
         * True if has "city" attribute
         */
        public boolean isSetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CITY$82) != null;
            }
        }
        
        /**
         * Sets the "city" attribute
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CITY$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CITY$82);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "city" attribute
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CITY$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CITY$82);
                }
                target.set(city);
            }
        }
        
        /**
         * Unsets the "city" attribute
         */
        public void unsetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CITY$82);
            }
        }
        
        /**
         * Gets the "carrier" attribute
         */
        public java.lang.String getCarrier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIER$84);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "carrier" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCarrier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARRIER$84);
                return target;
            }
        }
        
        /**
         * True if has "carrier" attribute
         */
        public boolean isSetCarrier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CARRIER$84) != null;
            }
        }
        
        /**
         * Sets the "carrier" attribute
         */
        public void setCarrier(java.lang.String carrier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIER$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARRIER$84);
                }
                target.setStringValue(carrier);
            }
        }
        
        /**
         * Sets (as xml) the "carrier" attribute
         */
        public void xsetCarrier(org.apache.xmlbeans.XmlString carrier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARRIER$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CARRIER$84);
                }
                target.set(carrier);
            }
        }
        
        /**
         * Unsets the "carrier" attribute
         */
        public void unsetCarrier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CARRIER$84);
            }
        }
        
        /**
         * Gets the "gpslocation" attribute
         */
        public java.lang.String getGpslocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSLOCATION$86);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "gpslocation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGpslocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GPSLOCATION$86);
                return target;
            }
        }
        
        /**
         * True if has "gpslocation" attribute
         */
        public boolean isSetGpslocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GPSLOCATION$86) != null;
            }
        }
        
        /**
         * Sets the "gpslocation" attribute
         */
        public void setGpslocation(java.lang.String gpslocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSLOCATION$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSLOCATION$86);
                }
                target.setStringValue(gpslocation);
            }
        }
        
        /**
         * Sets (as xml) the "gpslocation" attribute
         */
        public void xsetGpslocation(org.apache.xmlbeans.XmlString gpslocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GPSLOCATION$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GPSLOCATION$86);
                }
                target.set(gpslocation);
            }
        }
        
        /**
         * Unsets the "gpslocation" attribute
         */
        public void unsetGpslocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GPSLOCATION$86);
            }
        }
        
        /**
         * Gets the "modelid" attribute
         */
        public java.lang.String getModelid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$88);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "modelid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetModelid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$88);
                return target;
            }
        }
        
        /**
         * True if has "modelid" attribute
         */
        public boolean isSetModelid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MODELID$88) != null;
            }
        }
        
        /**
         * Sets the "modelid" attribute
         */
        public void setModelid(java.lang.String modelid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODELID$88);
                }
                target.setStringValue(modelid);
            }
        }
        
        /**
         * Sets (as xml) the "modelid" attribute
         */
        public void xsetModelid(org.apache.xmlbeans.XmlString modelid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODELID$88);
                }
                target.set(modelid);
            }
        }
        
        /**
         * Unsets the "modelid" attribute
         */
        public void unsetModelid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MODELID$88);
            }
        }
        
        /**
         * Gets the "cpu" attribute
         */
        public java.lang.String getCpu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$90);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cpu" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCpu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$90);
                return target;
            }
        }
        
        /**
         * True if has "cpu" attribute
         */
        public boolean isSetCpu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CPU$90) != null;
            }
        }
        
        /**
         * Sets the "cpu" attribute
         */
        public void setCpu(java.lang.String cpu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPU$90);
                }
                target.setStringValue(cpu);
            }
        }
        
        /**
         * Sets (as xml) the "cpu" attribute
         */
        public void xsetCpu(org.apache.xmlbeans.XmlString cpu)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CPU$90);
                }
                target.set(cpu);
            }
        }
        
        /**
         * Unsets the "cpu" attribute
         */
        public void unsetCpu()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CPU$90);
            }
        }
        
        /**
         * Gets the "rooted" attribute
         */
        public java.lang.String getRooted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTED$92);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rooted" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRooted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTED$92);
                return target;
            }
        }
        
        /**
         * True if has "rooted" attribute
         */
        public boolean isSetRooted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROOTED$92) != null;
            }
        }
        
        /**
         * Sets the "rooted" attribute
         */
        public void setRooted(java.lang.String rooted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTED$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOTED$92);
                }
                target.setStringValue(rooted);
            }
        }
        
        /**
         * Sets (as xml) the "rooted" attribute
         */
        public void xsetRooted(org.apache.xmlbeans.XmlString rooted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTED$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROOTED$92);
                }
                target.set(rooted);
            }
        }
        
        /**
         * Unsets the "rooted" attribute
         */
        public void unsetRooted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROOTED$92);
            }
        }
        
        /**
         * Gets the "crashed" attribute
         */
        public java.lang.String getCrashed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHED$94);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "crashed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCrashed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRASHED$94);
                return target;
            }
        }
        
        /**
         * True if has "crashed" attribute
         */
        public boolean isSetCrashed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CRASHED$94) != null;
            }
        }
        
        /**
         * Sets the "crashed" attribute
         */
        public void setCrashed(java.lang.String crashed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CRASHED$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CRASHED$94);
                }
                target.setStringValue(crashed);
            }
        }
        
        /**
         * Sets (as xml) the "crashed" attribute
         */
        public void xsetCrashed(org.apache.xmlbeans.XmlString crashed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CRASHED$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CRASHED$94);
                }
                target.set(crashed);
            }
        }
        
        /**
         * Unsets the "crashed" attribute
         */
        public void unsetCrashed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CRASHED$94);
            }
        }
        
        /**
         * Gets the "userexperiencereason" attribute
         */
        public java.lang.String getUserexperiencereason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEREXPERIENCEREASON$96);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userexperiencereason" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUserexperiencereason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEREXPERIENCEREASON$96);
                return target;
            }
        }
        
        /**
         * True if has "userexperiencereason" attribute
         */
        public boolean isSetUserexperiencereason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEREXPERIENCEREASON$96) != null;
            }
        }
        
        /**
         * Sets the "userexperiencereason" attribute
         */
        public void setUserexperiencereason(java.lang.String userexperiencereason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEREXPERIENCEREASON$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEREXPERIENCEREASON$96);
                }
                target.setStringValue(userexperiencereason);
            }
        }
        
        /**
         * Sets (as xml) the "userexperiencereason" attribute
         */
        public void xsetUserexperiencereason(org.apache.xmlbeans.XmlString userexperiencereason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEREXPERIENCEREASON$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEREXPERIENCEREASON$96);
                }
                target.set(userexperiencereason);
            }
        }
        
        /**
         * Unsets the "userexperiencereason" attribute
         */
        public void unsetUserexperiencereason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEREXPERIENCEREASON$96);
            }
        }
        
        /**
         * Gets the "landingpagetitle" attribute
         */
        public java.lang.String getLandingpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDINGPAGETITLE$98);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "landingpagetitle" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLandingpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANDINGPAGETITLE$98);
                return target;
            }
        }
        
        /**
         * True if has "landingpagetitle" attribute
         */
        public boolean isSetLandingpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANDINGPAGETITLE$98) != null;
            }
        }
        
        /**
         * Sets the "landingpagetitle" attribute
         */
        public void setLandingpagetitle(java.lang.String landingpagetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDINGPAGETITLE$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANDINGPAGETITLE$98);
                }
                target.setStringValue(landingpagetitle);
            }
        }
        
        /**
         * Sets (as xml) the "landingpagetitle" attribute
         */
        public void xsetLandingpagetitle(org.apache.xmlbeans.XmlString landingpagetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANDINGPAGETITLE$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANDINGPAGETITLE$98);
                }
                target.set(landingpagetitle);
            }
        }
        
        /**
         * Unsets the "landingpagetitle" attribute
         */
        public void unsetLandingpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANDINGPAGETITLE$98);
            }
        }
        
        /**
         * Gets the "landingpageresponsetime" attribute
         */
        public java.lang.String getLandingpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDINGPAGERESPONSETIME$100);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "landingpageresponsetime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLandingpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANDINGPAGERESPONSETIME$100);
                return target;
            }
        }
        
        /**
         * True if has "landingpageresponsetime" attribute
         */
        public boolean isSetLandingpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANDINGPAGERESPONSETIME$100) != null;
            }
        }
        
        /**
         * Sets the "landingpageresponsetime" attribute
         */
        public void setLandingpageresponsetime(java.lang.String landingpageresponsetime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDINGPAGERESPONSETIME$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANDINGPAGERESPONSETIME$100);
                }
                target.setStringValue(landingpageresponsetime);
            }
        }
        
        /**
         * Sets (as xml) the "landingpageresponsetime" attribute
         */
        public void xsetLandingpageresponsetime(org.apache.xmlbeans.XmlString landingpageresponsetime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANDINGPAGERESPONSETIME$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANDINGPAGERESPONSETIME$100);
                }
                target.set(landingpageresponsetime);
            }
        }
        
        /**
         * Unsets the "landingpageresponsetime" attribute
         */
        public void unsetLandingpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANDINGPAGERESPONSETIME$100);
            }
        }
        
        /**
         * Gets the "landingpagefailed" attribute
         */
        public java.lang.String getLandingpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDINGPAGEFAILED$102);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "landingpagefailed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLandingpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANDINGPAGEFAILED$102);
                return target;
            }
        }
        
        /**
         * True if has "landingpagefailed" attribute
         */
        public boolean isSetLandingpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANDINGPAGEFAILED$102) != null;
            }
        }
        
        /**
         * Sets the "landingpagefailed" attribute
         */
        public void setLandingpagefailed(java.lang.String landingpagefailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDINGPAGEFAILED$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANDINGPAGEFAILED$102);
                }
                target.setStringValue(landingpagefailed);
            }
        }
        
        /**
         * Sets (as xml) the "landingpagefailed" attribute
         */
        public void xsetLandingpagefailed(org.apache.xmlbeans.XmlString landingpagefailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANDINGPAGEFAILED$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANDINGPAGEFAILED$102);
                }
                target.set(landingpagefailed);
            }
        }
        
        /**
         * Unsets the "landingpagefailed" attribute
         */
        public void unsetLandingpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANDINGPAGEFAILED$102);
            }
        }
        
        /**
         * Gets the "exitpagetitle" attribute
         */
        public java.lang.String getExitpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITPAGETITLE$104);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exitpagetitle" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExitpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXITPAGETITLE$104);
                return target;
            }
        }
        
        /**
         * True if has "exitpagetitle" attribute
         */
        public boolean isSetExitpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXITPAGETITLE$104) != null;
            }
        }
        
        /**
         * Sets the "exitpagetitle" attribute
         */
        public void setExitpagetitle(java.lang.String exitpagetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITPAGETITLE$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXITPAGETITLE$104);
                }
                target.setStringValue(exitpagetitle);
            }
        }
        
        /**
         * Sets (as xml) the "exitpagetitle" attribute
         */
        public void xsetExitpagetitle(org.apache.xmlbeans.XmlString exitpagetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXITPAGETITLE$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXITPAGETITLE$104);
                }
                target.set(exitpagetitle);
            }
        }
        
        /**
         * Unsets the "exitpagetitle" attribute
         */
        public void unsetExitpagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXITPAGETITLE$104);
            }
        }
        
        /**
         * Gets the "exitpageresponsetime" attribute
         */
        public java.lang.String getExitpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITPAGERESPONSETIME$106);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exitpageresponsetime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExitpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXITPAGERESPONSETIME$106);
                return target;
            }
        }
        
        /**
         * True if has "exitpageresponsetime" attribute
         */
        public boolean isSetExitpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXITPAGERESPONSETIME$106) != null;
            }
        }
        
        /**
         * Sets the "exitpageresponsetime" attribute
         */
        public void setExitpageresponsetime(java.lang.String exitpageresponsetime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITPAGERESPONSETIME$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXITPAGERESPONSETIME$106);
                }
                target.setStringValue(exitpageresponsetime);
            }
        }
        
        /**
         * Sets (as xml) the "exitpageresponsetime" attribute
         */
        public void xsetExitpageresponsetime(org.apache.xmlbeans.XmlString exitpageresponsetime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXITPAGERESPONSETIME$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXITPAGERESPONSETIME$106);
                }
                target.set(exitpageresponsetime);
            }
        }
        
        /**
         * Unsets the "exitpageresponsetime" attribute
         */
        public void unsetExitpageresponsetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXITPAGERESPONSETIME$106);
            }
        }
        
        /**
         * Gets the "exitpagefailed" attribute
         */
        public java.lang.String getExitpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITPAGEFAILED$108);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "exitpagefailed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExitpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXITPAGEFAILED$108);
                return target;
            }
        }
        
        /**
         * True if has "exitpagefailed" attribute
         */
        public boolean isSetExitpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXITPAGEFAILED$108) != null;
            }
        }
        
        /**
         * Sets the "exitpagefailed" attribute
         */
        public void setExitpagefailed(java.lang.String exitpagefailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXITPAGEFAILED$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXITPAGEFAILED$108);
                }
                target.setStringValue(exitpagefailed);
            }
        }
        
        /**
         * Sets (as xml) the "exitpagefailed" attribute
         */
        public void xsetExitpagefailed(org.apache.xmlbeans.XmlString exitpagefailed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXITPAGEFAILED$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXITPAGEFAILED$108);
                }
                target.set(exitpagefailed);
            }
        }
        
        /**
         * Unsets the "exitpagefailed" attribute
         */
        public void unsetExitpagefailed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXITPAGEFAILED$108);
            }
        }
        
        /**
         * Gets the "visittags" attribute
         */
        public java.lang.String getVisittags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITTAGS$110);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "visittags" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVisittags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITTAGS$110);
                return target;
            }
        }
        
        /**
         * True if has "visittags" attribute
         */
        public boolean isSetVisittags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VISITTAGS$110) != null;
            }
        }
        
        /**
         * Sets the "visittags" attribute
         */
        public void setVisittags(java.lang.String visittags)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITTAGS$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISITTAGS$110);
                }
                target.setStringValue(visittags);
            }
        }
        
        /**
         * Sets (as xml) the "visittags" attribute
         */
        public void xsetVisittags(org.apache.xmlbeans.XmlString visittags)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITTAGS$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISITTAGS$110);
                }
                target.set(visittags);
            }
        }
        
        /**
         * Unsets the "visittags" attribute
         */
        public void unsetVisittags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VISITTAGS$110);
            }
        }
        
        /**
         * Gets the "endtime" attribute
         */
        public java.lang.String getEndtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$112);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "endtime" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEndtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDTIME$112);
                return target;
            }
        }
        
        /**
         * True if has "endtime" attribute
         */
        public boolean isSetEndtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDTIME$112) != null;
            }
        }
        
        /**
         * Sets the "endtime" attribute
         */
        public void setEndtime(java.lang.String endtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTIME$112);
                }
                target.setStringValue(endtime);
            }
        }
        
        /**
         * Sets (as xml) the "endtime" attribute
         */
        public void xsetEndtime(org.apache.xmlbeans.XmlString endtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDTIME$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDTIME$112);
                }
                target.set(endtime);
            }
        }
        
        /**
         * Unsets the "endtime" attribute
         */
        public void unsetEndtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDTIME$112);
            }
        }
        
        /**
         * Gets the "endreason" attribute
         */
        public java.lang.String getEndreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDREASON$114);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "endreason" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEndreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDREASON$114);
                return target;
            }
        }
        
        /**
         * True if has "endreason" attribute
         */
        public boolean isSetEndreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDREASON$114) != null;
            }
        }
        
        /**
         * Sets the "endreason" attribute
         */
        public void setEndreason(java.lang.String endreason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDREASON$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDREASON$114);
                }
                target.setStringValue(endreason);
            }
        }
        
        /**
         * Sets (as xml) the "endreason" attribute
         */
        public void xsetEndreason(org.apache.xmlbeans.XmlString endreason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDREASON$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDREASON$114);
                }
                target.set(endreason);
            }
        }
        
        /**
         * Unsets the "endreason" attribute
         */
        public void unsetEndreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDREASON$114);
            }
        }
    }
}
