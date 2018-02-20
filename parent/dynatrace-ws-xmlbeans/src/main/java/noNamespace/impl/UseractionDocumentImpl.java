/*
 * An XML document type.
 * Localname: useraction
 * Namespace: 
 * Java type: noNamespace.UseractionDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one useraction(@) element.
 *
 * This is a complex type.
 */
public class UseractionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UseractionDocument
{
    private static final long serialVersionUID = 1L;
    
    public UseractionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERACTION$0 = 
        new javax.xml.namespace.QName("", "useraction");
    
    
    /**
     * Gets the "useraction" element
     */
    public noNamespace.UseractionDocument.Useraction getUseraction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UseractionDocument.Useraction target = null;
            target = (noNamespace.UseractionDocument.Useraction)get_store().find_element_user(USERACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "useraction" element
     */
    public void setUseraction(noNamespace.UseractionDocument.Useraction useraction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UseractionDocument.Useraction target = null;
            target = (noNamespace.UseractionDocument.Useraction)get_store().find_element_user(USERACTION$0, 0);
            if (target == null)
            {
                target = (noNamespace.UseractionDocument.Useraction)get_store().add_element_user(USERACTION$0);
            }
            target.set(useraction);
        }
    }
    
    /**
     * Appends and returns a new empty "useraction" element
     */
    public noNamespace.UseractionDocument.Useraction addNewUseraction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UseractionDocument.Useraction target = null;
            target = (noNamespace.UseractionDocument.Useraction)get_store().add_element_user(USERACTION$0);
            return target;
        }
    }
    /**
     * An XML useraction(@).
     *
     * This is a complex type.
     */
    public static class UseractionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UseractionDocument.Useraction
    {
        private static final long serialVersionUID = 1L;
        
        public UseractionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERACTION$0 = 
            new javax.xml.namespace.QName("", "useraction");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName COUNT$4 = 
            new javax.xml.namespace.QName("", "count");
        private static final javax.xml.namespace.QName RESPONSETIMESUM$6 = 
            new javax.xml.namespace.QName("", "responsetimesum");
        private static final javax.xml.namespace.QName RESPONSETIMEAVG$8 = 
            new javax.xml.namespace.QName("", "responsetimeavg");
        private static final javax.xml.namespace.QName DOMLOADTOTAL$10 = 
            new javax.xml.namespace.QName("", "domloadtotal");
        private static final javax.xml.namespace.QName DOMLOADAVG$12 = 
            new javax.xml.namespace.QName("", "domloadavg");
        private static final javax.xml.namespace.QName ACTIONTYPE$14 = 
            new javax.xml.namespace.QName("", "actiontype");
        private static final javax.xml.namespace.QName PAGETITLE$16 = 
            new javax.xml.namespace.QName("", "pagetitle");
        private static final javax.xml.namespace.QName URL$18 = 
            new javax.xml.namespace.QName("", "url");
        private static final javax.xml.namespace.QName HOST$20 = 
            new javax.xml.namespace.QName("", "host");
        private static final javax.xml.namespace.QName PATH$22 = 
            new javax.xml.namespace.QName("", "path");
        private static final javax.xml.namespace.QName QUERY$24 = 
            new javax.xml.namespace.QName("", "query");
        private static final javax.xml.namespace.QName CLIENTIP$26 = 
            new javax.xml.namespace.QName("", "clientip");
        private static final javax.xml.namespace.QName USERAGENT$28 = 
            new javax.xml.namespace.QName("", "useragent");
        private static final javax.xml.namespace.QName VISITOR$30 = 
            new javax.xml.namespace.QName("", "visitor");
        private static final javax.xml.namespace.QName PAGEID$32 = 
            new javax.xml.namespace.QName("", "pageid");
        private static final javax.xml.namespace.QName FRAMEID$34 = 
            new javax.xml.namespace.QName("", "frameid");
        private static final javax.xml.namespace.QName STARTTIME$36 = 
            new javax.xml.namespace.QName("", "starttime");
        private static final javax.xml.namespace.QName CLIENTERRORS$38 = 
            new javax.xml.namespace.QName("", "clienterrors");
        private static final javax.xml.namespace.QName FAILEDACTIONS$40 = 
            new javax.xml.namespace.QName("", "failedactions");
        private static final javax.xml.namespace.QName REQUESTSSUM$42 = 
            new javax.xml.namespace.QName("", "requestssum");
        private static final javax.xml.namespace.QName REQUESTSPERACTIONAVG$44 = 
            new javax.xml.namespace.QName("", "requestsperactionavg");
        private static final javax.xml.namespace.QName REQUESTSIZESUM$46 = 
            new javax.xml.namespace.QName("", "requestsizesum");
        private static final javax.xml.namespace.QName REQUESTSIZEAVG$48 = 
            new javax.xml.namespace.QName("", "requestsizeavg");
        private static final javax.xml.namespace.QName RESPONSESIZESUM$50 = 
            new javax.xml.namespace.QName("", "responsesizesum");
        private static final javax.xml.namespace.QName RESPONSESIZEAVG$52 = 
            new javax.xml.namespace.QName("", "responsesizeavg");
        private static final javax.xml.namespace.QName APDEXZONE$54 = 
            new javax.xml.namespace.QName("", "apdexzone");
        private static final javax.xml.namespace.QName APDEX$56 = 
            new javax.xml.namespace.QName("", "apdex");
        private static final javax.xml.namespace.QName VISITCOUNT$58 = 
            new javax.xml.namespace.QName("", "visitcount");
        private static final javax.xml.namespace.QName NETWORKTIME$60 = 
            new javax.xml.namespace.QName("", "networktime");
        private static final javax.xml.namespace.QName SERVERTIME$62 = 
            new javax.xml.namespace.QName("", "servertime");
        private static final javax.xml.namespace.QName ENDTOEND$64 = 
            new javax.xml.namespace.QName("", "endtoend");
        private static final javax.xml.namespace.QName BANDWIDTH$66 = 
            new javax.xml.namespace.QName("", "bandwidth");
        private static final javax.xml.namespace.QName APPLICATION$68 = 
            new javax.xml.namespace.QName("", "application");
        private static final javax.xml.namespace.QName VISITID$70 = 
            new javax.xml.namespace.QName("", "visitid");
        private static final javax.xml.namespace.QName DEVICENAME$72 = 
            new javax.xml.namespace.QName("", "devicename");
        private static final javax.xml.namespace.QName MOBILEAPPNAME$74 = 
            new javax.xml.namespace.QName("", "mobileappname");
        private static final javax.xml.namespace.QName MOBILEAPPID$76 = 
            new javax.xml.namespace.QName("", "mobileappid");
        private static final javax.xml.namespace.QName SCREENRESOLUTION$78 = 
            new javax.xml.namespace.QName("", "screenresolution");
        private static final javax.xml.namespace.QName CONNECTIONTYPE$80 = 
            new javax.xml.namespace.QName("", "connectiontype");
        private static final javax.xml.namespace.QName CARRIER$82 = 
            new javax.xml.namespace.QName("", "carrier");
        private static final javax.xml.namespace.QName GPSLOCATION$84 = 
            new javax.xml.namespace.QName("", "gpslocation");
        private static final javax.xml.namespace.QName APPVERSION$86 = 
            new javax.xml.namespace.QName("", "appversion");
        private static final javax.xml.namespace.QName APPBUILD$88 = 
            new javax.xml.namespace.QName("", "appbuild");
        private static final javax.xml.namespace.QName MANUFACTURER$90 = 
            new javax.xml.namespace.QName("", "manufacturer");
        private static final javax.xml.namespace.QName MODELID$92 = 
            new javax.xml.namespace.QName("", "modelid");
        private static final javax.xml.namespace.QName CPU$94 = 
            new javax.xml.namespace.QName("", "cpu");
        private static final javax.xml.namespace.QName ROOTED$96 = 
            new javax.xml.namespace.QName("", "rooted");
        private static final javax.xml.namespace.QName ADKVERSION$98 = 
            new javax.xml.namespace.QName("", "adkversion");
        private static final javax.xml.namespace.QName ORIENTATION$100 = 
            new javax.xml.namespace.QName("", "orientation");
        private static final javax.xml.namespace.QName SIGNALSTRENGTH$102 = 
            new javax.xml.namespace.QName("", "signalstrength");
        private static final javax.xml.namespace.QName NETWORKTECHNOLOGY$104 = 
            new javax.xml.namespace.QName("", "networktechnology");
        private static final javax.xml.namespace.QName SOURCETITLE$106 = 
            new javax.xml.namespace.QName("", "sourcetitle");
        private static final javax.xml.namespace.QName SOURCEURL$108 = 
            new javax.xml.namespace.QName("", "sourceurl");
        private static final javax.xml.namespace.QName VIEWDURATION$110 = 
            new javax.xml.namespace.QName("", "viewduration");
        private static final javax.xml.namespace.QName PERFORMANCEMETRIC$112 = 
            new javax.xml.namespace.QName("", "performancemetric");
        private static final javax.xml.namespace.QName PERFORMANCEMETRICVALUE$114 = 
            new javax.xml.namespace.QName("", "performancemetricvalue");
        private static final javax.xml.namespace.QName PERFORMANCEMETRICTHRESHOLD$116 = 
            new javax.xml.namespace.QName("", "performancemetricthreshold");
        private static final javax.xml.namespace.QName PERFORMANCEMETRICFACTOR$118 = 
            new javax.xml.namespace.QName("", "performancemetricfactor");
        private static final javax.xml.namespace.QName PERFORMANCEMETRICFACTORREASON$120 = 
            new javax.xml.namespace.QName("", "performancemetricfactorreason");
        
        
        /**
         * Gets array of all "useraction" elements
         */
        public noNamespace.UseractionDocument.Useraction[] getUseractionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(USERACTION$0, targetList);
                noNamespace.UseractionDocument.Useraction[] result = new noNamespace.UseractionDocument.Useraction[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "useraction" element
         */
        public noNamespace.UseractionDocument.Useraction getUseractionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionDocument.Useraction target = null;
                target = (noNamespace.UseractionDocument.Useraction)get_store().find_element_user(USERACTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "useraction" element
         */
        public int sizeOfUseractionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USERACTION$0);
            }
        }
        
        /**
         * Sets array of all "useraction" element
         */
        public void setUseractionArray(noNamespace.UseractionDocument.Useraction[] useractionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(useractionArray, USERACTION$0);
            }
        }
        
        /**
         * Sets ith "useraction" element
         */
        public void setUseractionArray(int i, noNamespace.UseractionDocument.Useraction useraction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionDocument.Useraction target = null;
                target = (noNamespace.UseractionDocument.Useraction)get_store().find_element_user(USERACTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(useraction);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "useraction" element
         */
        public noNamespace.UseractionDocument.Useraction insertNewUseraction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionDocument.Useraction target = null;
                target = (noNamespace.UseractionDocument.Useraction)get_store().insert_element_user(USERACTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "useraction" element
         */
        public noNamespace.UseractionDocument.Useraction addNewUseraction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.UseractionDocument.Useraction target = null;
                target = (noNamespace.UseractionDocument.Useraction)get_store().add_element_user(USERACTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "useraction" element
         */
        public void removeUseraction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USERACTION$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$2) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$2);
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
         * Gets the "responsetimesum" attribute
         */
        public double getResponsetimesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMESUM$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "responsetimesum" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetResponsetimesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMESUM$6);
                return target;
            }
        }
        
        /**
         * True if has "responsetimesum" attribute
         */
        public boolean isSetResponsetimesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESPONSETIMESUM$6) != null;
            }
        }
        
        /**
         * Sets the "responsetimesum" attribute
         */
        public void setResponsetimesum(double responsetimesum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMESUM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMESUM$6);
                }
                target.setDoubleValue(responsetimesum);
            }
        }
        
        /**
         * Sets (as xml) the "responsetimesum" attribute
         */
        public void xsetResponsetimesum(org.apache.xmlbeans.XmlDouble responsetimesum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMESUM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMESUM$6);
                }
                target.set(responsetimesum);
            }
        }
        
        /**
         * Unsets the "responsetimesum" attribute
         */
        public void unsetResponsetimesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESPONSETIMESUM$6);
            }
        }
        
        /**
         * Gets the "responsetimeavg" attribute
         */
        public double getResponsetimeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEAVG$8);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "responsetimeavg" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetResponsetimeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEAVG$8);
                return target;
            }
        }
        
        /**
         * True if has "responsetimeavg" attribute
         */
        public boolean isSetResponsetimeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESPONSETIMEAVG$8) != null;
            }
        }
        
        /**
         * Sets the "responsetimeavg" attribute
         */
        public void setResponsetimeavg(double responsetimeavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSETIMEAVG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSETIMEAVG$8);
                }
                target.setDoubleValue(responsetimeavg);
            }
        }
        
        /**
         * Sets (as xml) the "responsetimeavg" attribute
         */
        public void xsetResponsetimeavg(org.apache.xmlbeans.XmlDouble responsetimeavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RESPONSETIMEAVG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RESPONSETIMEAVG$8);
                }
                target.set(responsetimeavg);
            }
        }
        
        /**
         * Unsets the "responsetimeavg" attribute
         */
        public void unsetResponsetimeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESPONSETIMEAVG$8);
            }
        }
        
        /**
         * Gets the "domloadtotal" attribute
         */
        public double getDomloadtotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMLOADTOTAL$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "domloadtotal" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDomloadtotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DOMLOADTOTAL$10);
                return target;
            }
        }
        
        /**
         * True if has "domloadtotal" attribute
         */
        public boolean isSetDomloadtotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DOMLOADTOTAL$10) != null;
            }
        }
        
        /**
         * Sets the "domloadtotal" attribute
         */
        public void setDomloadtotal(double domloadtotal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMLOADTOTAL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMLOADTOTAL$10);
                }
                target.setDoubleValue(domloadtotal);
            }
        }
        
        /**
         * Sets (as xml) the "domloadtotal" attribute
         */
        public void xsetDomloadtotal(org.apache.xmlbeans.XmlDouble domloadtotal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DOMLOADTOTAL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DOMLOADTOTAL$10);
                }
                target.set(domloadtotal);
            }
        }
        
        /**
         * Unsets the "domloadtotal" attribute
         */
        public void unsetDomloadtotal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DOMLOADTOTAL$10);
            }
        }
        
        /**
         * Gets the "domloadavg" attribute
         */
        public double getDomloadavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMLOADAVG$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "domloadavg" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDomloadavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DOMLOADAVG$12);
                return target;
            }
        }
        
        /**
         * True if has "domloadavg" attribute
         */
        public boolean isSetDomloadavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DOMLOADAVG$12) != null;
            }
        }
        
        /**
         * Sets the "domloadavg" attribute
         */
        public void setDomloadavg(double domloadavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMLOADAVG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMLOADAVG$12);
                }
                target.setDoubleValue(domloadavg);
            }
        }
        
        /**
         * Sets (as xml) the "domloadavg" attribute
         */
        public void xsetDomloadavg(org.apache.xmlbeans.XmlDouble domloadavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DOMLOADAVG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DOMLOADAVG$12);
                }
                target.set(domloadavg);
            }
        }
        
        /**
         * Unsets the "domloadavg" attribute
         */
        public void unsetDomloadavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DOMLOADAVG$12);
            }
        }
        
        /**
         * Gets the "actiontype" attribute
         */
        public java.lang.String getActiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONTYPE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "actiontype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetActiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONTYPE$14);
                return target;
            }
        }
        
        /**
         * True if has "actiontype" attribute
         */
        public boolean isSetActiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ACTIONTYPE$14) != null;
            }
        }
        
        /**
         * Sets the "actiontype" attribute
         */
        public void setActiontype(java.lang.String actiontype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONTYPE$14);
                }
                target.setStringValue(actiontype);
            }
        }
        
        /**
         * Sets (as xml) the "actiontype" attribute
         */
        public void xsetActiontype(org.apache.xmlbeans.XmlString actiontype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTIONTYPE$14);
                }
                target.set(actiontype);
            }
        }
        
        /**
         * Unsets the "actiontype" attribute
         */
        public void unsetActiontype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ACTIONTYPE$14);
            }
        }
        
        /**
         * Gets the "pagetitle" attribute
         */
        public java.lang.String getPagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGETITLE$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pagetitle" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGETITLE$16);
                return target;
            }
        }
        
        /**
         * True if has "pagetitle" attribute
         */
        public boolean isSetPagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGETITLE$16) != null;
            }
        }
        
        /**
         * Sets the "pagetitle" attribute
         */
        public void setPagetitle(java.lang.String pagetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGETITLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGETITLE$16);
                }
                target.setStringValue(pagetitle);
            }
        }
        
        /**
         * Sets (as xml) the "pagetitle" attribute
         */
        public void xsetPagetitle(org.apache.xmlbeans.XmlString pagetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGETITLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGETITLE$16);
                }
                target.set(pagetitle);
            }
        }
        
        /**
         * Unsets the "pagetitle" attribute
         */
        public void unsetPagetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGETITLE$16);
            }
        }
        
        /**
         * Gets the "url" attribute
         */
        public java.lang.String getUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "url" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$18);
                return target;
            }
        }
        
        /**
         * True if has "url" attribute
         */
        public boolean isSetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(URL$18) != null;
            }
        }
        
        /**
         * Sets the "url" attribute
         */
        public void setUrl(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$18);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "url" attribute
         */
        public void xsetUrl(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URL$18);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "url" attribute
         */
        public void unsetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(URL$18);
            }
        }
        
        /**
         * Gets the "host" attribute
         */
        public java.lang.String getHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "host" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$20);
                return target;
            }
        }
        
        /**
         * True if has "host" attribute
         */
        public boolean isSetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HOST$20) != null;
            }
        }
        
        /**
         * Sets the "host" attribute
         */
        public void setHost(java.lang.String host)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOST$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOST$20);
                }
                target.setStringValue(host);
            }
        }
        
        /**
         * Sets (as xml) the "host" attribute
         */
        public void xsetHost(org.apache.xmlbeans.XmlString host)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOST$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOST$20);
                }
                target.set(host);
            }
        }
        
        /**
         * Unsets the "host" attribute
         */
        public void unsetHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HOST$20);
            }
        }
        
        /**
         * Gets the "path" attribute
         */
        public java.lang.String getPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "path" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$22);
                return target;
            }
        }
        
        /**
         * True if has "path" attribute
         */
        public boolean isSetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PATH$22) != null;
            }
        }
        
        /**
         * Sets the "path" attribute
         */
        public void setPath(java.lang.String path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$22);
                }
                target.setStringValue(path);
            }
        }
        
        /**
         * Sets (as xml) the "path" attribute
         */
        public void xsetPath(org.apache.xmlbeans.XmlString path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATH$22);
                }
                target.set(path);
            }
        }
        
        /**
         * Unsets the "path" attribute
         */
        public void unsetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PATH$22);
            }
        }
        
        /**
         * Gets the "query" attribute
         */
        public java.lang.String getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERY$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "query" attribute
         */
        public org.apache.xmlbeans.XmlString xgetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERY$24);
                return target;
            }
        }
        
        /**
         * True if has "query" attribute
         */
        public boolean isSetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(QUERY$24) != null;
            }
        }
        
        /**
         * Sets the "query" attribute
         */
        public void setQuery(java.lang.String query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERY$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERY$24);
                }
                target.setStringValue(query);
            }
        }
        
        /**
         * Sets (as xml) the "query" attribute
         */
        public void xsetQuery(org.apache.xmlbeans.XmlString query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUERY$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QUERY$24);
                }
                target.set(query);
            }
        }
        
        /**
         * Unsets the "query" attribute
         */
        public void unsetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(QUERY$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$26);
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
                return get_store().find_attribute_user(CLIENTIP$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTIP$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTIP$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTIP$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTIP$26);
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
                get_store().remove_attribute(CLIENTIP$26);
            }
        }
        
        /**
         * Gets the "useragent" attribute
         */
        public java.lang.String getUseragent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERAGENT$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "useragent" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUseragent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERAGENT$28);
                return target;
            }
        }
        
        /**
         * True if has "useragent" attribute
         */
        public boolean isSetUseragent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USERAGENT$28) != null;
            }
        }
        
        /**
         * Sets the "useragent" attribute
         */
        public void setUseragent(java.lang.String useragent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERAGENT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERAGENT$28);
                }
                target.setStringValue(useragent);
            }
        }
        
        /**
         * Sets (as xml) the "useragent" attribute
         */
        public void xsetUseragent(org.apache.xmlbeans.XmlString useragent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERAGENT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERAGENT$28);
                }
                target.set(useragent);
            }
        }
        
        /**
         * Unsets the "useragent" attribute
         */
        public void unsetUseragent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USERAGENT$28);
            }
        }
        
        /**
         * Gets the "visitor" attribute
         */
        public java.lang.String getVisitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITOR$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "visitor" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVisitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITOR$30);
                return target;
            }
        }
        
        /**
         * True if has "visitor" attribute
         */
        public boolean isSetVisitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VISITOR$30) != null;
            }
        }
        
        /**
         * Sets the "visitor" attribute
         */
        public void setVisitor(java.lang.String visitor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITOR$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISITOR$30);
                }
                target.setStringValue(visitor);
            }
        }
        
        /**
         * Sets (as xml) the "visitor" attribute
         */
        public void xsetVisitor(org.apache.xmlbeans.XmlString visitor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITOR$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISITOR$30);
                }
                target.set(visitor);
            }
        }
        
        /**
         * Unsets the "visitor" attribute
         */
        public void unsetVisitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VISITOR$30);
            }
        }
        
        /**
         * Gets the "pageid" attribute
         */
        public double getPageid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEID$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "pageid" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetPageid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PAGEID$32);
                return target;
            }
        }
        
        /**
         * True if has "pageid" attribute
         */
        public boolean isSetPageid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGEID$32) != null;
            }
        }
        
        /**
         * Sets the "pageid" attribute
         */
        public void setPageid(double pageid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGEID$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGEID$32);
                }
                target.setDoubleValue(pageid);
            }
        }
        
        /**
         * Sets (as xml) the "pageid" attribute
         */
        public void xsetPageid(org.apache.xmlbeans.XmlDouble pageid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PAGEID$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PAGEID$32);
                }
                target.set(pageid);
            }
        }
        
        /**
         * Unsets the "pageid" attribute
         */
        public void unsetPageid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGEID$32);
            }
        }
        
        /**
         * Gets the "frameid" attribute
         */
        public double getFrameid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAMEID$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "frameid" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetFrameid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FRAMEID$34);
                return target;
            }
        }
        
        /**
         * True if has "frameid" attribute
         */
        public boolean isSetFrameid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FRAMEID$34) != null;
            }
        }
        
        /**
         * Sets the "frameid" attribute
         */
        public void setFrameid(double frameid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAMEID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAMEID$34);
                }
                target.setDoubleValue(frameid);
            }
        }
        
        /**
         * Sets (as xml) the "frameid" attribute
         */
        public void xsetFrameid(org.apache.xmlbeans.XmlDouble frameid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FRAMEID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(FRAMEID$34);
                }
                target.set(frameid);
            }
        }
        
        /**
         * Unsets the "frameid" attribute
         */
        public void unsetFrameid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FRAMEID$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$36);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTTIME$36);
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
                return get_store().find_attribute_user(STARTTIME$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$36);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTTIME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTTIME$36);
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
                get_store().remove_attribute(STARTTIME$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTERRORS$38);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTERRORS$38);
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
                return get_store().find_attribute_user(CLIENTERRORS$38) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTERRORS$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTERRORS$38);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLIENTERRORS$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLIENTERRORS$38);
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
                get_store().remove_attribute(CLIENTERRORS$38);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILEDACTIONS$40);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILEDACTIONS$40);
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
                return get_store().find_attribute_user(FAILEDACTIONS$40) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILEDACTIONS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILEDACTIONS$40);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAILEDACTIONS$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAILEDACTIONS$40);
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
                get_store().remove_attribute(FAILEDACTIONS$40);
            }
        }
        
        /**
         * Gets the "requestssum" attribute
         */
        public java.math.BigInteger getRequestssum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSSUM$42);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestssum" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRequestssum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSSUM$42);
                return target;
            }
        }
        
        /**
         * True if has "requestssum" attribute
         */
        public boolean isSetRequestssum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUESTSSUM$42) != null;
            }
        }
        
        /**
         * Sets the "requestssum" attribute
         */
        public void setRequestssum(java.math.BigInteger requestssum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSSUM$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSSUM$42);
                }
                target.setBigIntegerValue(requestssum);
            }
        }
        
        /**
         * Sets (as xml) the "requestssum" attribute
         */
        public void xsetRequestssum(org.apache.xmlbeans.XmlInteger requestssum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSSUM$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTSSUM$42);
                }
                target.set(requestssum);
            }
        }
        
        /**
         * Unsets the "requestssum" attribute
         */
        public void unsetRequestssum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUESTSSUM$42);
            }
        }
        
        /**
         * Gets the "requestsperactionavg" attribute
         */
        public java.math.BigInteger getRequestsperactionavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSPERACTIONAVG$44);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestsperactionavg" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetRequestsperactionavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSPERACTIONAVG$44);
                return target;
            }
        }
        
        /**
         * True if has "requestsperactionavg" attribute
         */
        public boolean isSetRequestsperactionavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUESTSPERACTIONAVG$44) != null;
            }
        }
        
        /**
         * Sets the "requestsperactionavg" attribute
         */
        public void setRequestsperactionavg(java.math.BigInteger requestsperactionavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSPERACTIONAVG$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSPERACTIONAVG$44);
                }
                target.setBigIntegerValue(requestsperactionavg);
            }
        }
        
        /**
         * Sets (as xml) the "requestsperactionavg" attribute
         */
        public void xsetRequestsperactionavg(org.apache.xmlbeans.XmlInteger requestsperactionavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REQUESTSPERACTIONAVG$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REQUESTSPERACTIONAVG$44);
                }
                target.set(requestsperactionavg);
            }
        }
        
        /**
         * Unsets the "requestsperactionavg" attribute
         */
        public void unsetRequestsperactionavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUESTSPERACTIONAVG$44);
            }
        }
        
        /**
         * Gets the "requestsizesum" attribute
         */
        public java.lang.String getRequestsizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZESUM$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestsizesum" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRequestsizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTSIZESUM$46);
                return target;
            }
        }
        
        /**
         * True if has "requestsizesum" attribute
         */
        public boolean isSetRequestsizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUESTSIZESUM$46) != null;
            }
        }
        
        /**
         * Sets the "requestsizesum" attribute
         */
        public void setRequestsizesum(java.lang.String requestsizesum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZESUM$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSIZESUM$46);
                }
                target.setStringValue(requestsizesum);
            }
        }
        
        /**
         * Sets (as xml) the "requestsizesum" attribute
         */
        public void xsetRequestsizesum(org.apache.xmlbeans.XmlString requestsizesum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTSIZESUM$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUESTSIZESUM$46);
                }
                target.set(requestsizesum);
            }
        }
        
        /**
         * Unsets the "requestsizesum" attribute
         */
        public void unsetRequestsizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUESTSIZESUM$46);
            }
        }
        
        /**
         * Gets the "requestsizeavg" attribute
         */
        public java.lang.String getRequestsizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEAVG$48);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "requestsizeavg" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRequestsizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTSIZEAVG$48);
                return target;
            }
        }
        
        /**
         * True if has "requestsizeavg" attribute
         */
        public boolean isSetRequestsizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUESTSIZEAVG$48) != null;
            }
        }
        
        /**
         * Sets the "requestsizeavg" attribute
         */
        public void setRequestsizeavg(java.lang.String requestsizeavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTSIZEAVG$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTSIZEAVG$48);
                }
                target.setStringValue(requestsizeavg);
            }
        }
        
        /**
         * Sets (as xml) the "requestsizeavg" attribute
         */
        public void xsetRequestsizeavg(org.apache.xmlbeans.XmlString requestsizeavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTSIZEAVG$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUESTSIZEAVG$48);
                }
                target.set(requestsizeavg);
            }
        }
        
        /**
         * Unsets the "requestsizeavg" attribute
         */
        public void unsetRequestsizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUESTSIZEAVG$48);
            }
        }
        
        /**
         * Gets the "responsesizesum" attribute
         */
        public java.lang.String getResponsesizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZESUM$50);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "responsesizesum" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResponsesizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSESIZESUM$50);
                return target;
            }
        }
        
        /**
         * True if has "responsesizesum" attribute
         */
        public boolean isSetResponsesizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESPONSESIZESUM$50) != null;
            }
        }
        
        /**
         * Sets the "responsesizesum" attribute
         */
        public void setResponsesizesum(java.lang.String responsesizesum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZESUM$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSESIZESUM$50);
                }
                target.setStringValue(responsesizesum);
            }
        }
        
        /**
         * Sets (as xml) the "responsesizesum" attribute
         */
        public void xsetResponsesizesum(org.apache.xmlbeans.XmlString responsesizesum)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSESIZESUM$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESPONSESIZESUM$50);
                }
                target.set(responsesizesum);
            }
        }
        
        /**
         * Unsets the "responsesizesum" attribute
         */
        public void unsetResponsesizesum()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESPONSESIZESUM$50);
            }
        }
        
        /**
         * Gets the "responsesizeavg" attribute
         */
        public java.lang.String getResponsesizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEAVG$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "responsesizeavg" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResponsesizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSESIZEAVG$52);
                return target;
            }
        }
        
        /**
         * True if has "responsesizeavg" attribute
         */
        public boolean isSetResponsesizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESPONSESIZEAVG$52) != null;
            }
        }
        
        /**
         * Sets the "responsesizeavg" attribute
         */
        public void setResponsesizeavg(java.lang.String responsesizeavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESPONSESIZEAVG$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESPONSESIZEAVG$52);
                }
                target.setStringValue(responsesizeavg);
            }
        }
        
        /**
         * Sets (as xml) the "responsesizeavg" attribute
         */
        public void xsetResponsesizeavg(org.apache.xmlbeans.XmlString responsesizeavg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESPONSESIZEAVG$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESPONSESIZEAVG$52);
                }
                target.set(responsesizeavg);
            }
        }
        
        /**
         * Unsets the "responsesizeavg" attribute
         */
        public void unsetResponsesizeavg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESPONSESIZEAVG$52);
            }
        }
        
        /**
         * Gets the "apdexzone" attribute
         */
        public java.lang.String getApdexzone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APDEXZONE$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "apdexzone" attribute
         */
        public org.apache.xmlbeans.XmlString xgetApdexzone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APDEXZONE$54);
                return target;
            }
        }
        
        /**
         * True if has "apdexzone" attribute
         */
        public boolean isSetApdexzone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APDEXZONE$54) != null;
            }
        }
        
        /**
         * Sets the "apdexzone" attribute
         */
        public void setApdexzone(java.lang.String apdexzone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APDEXZONE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APDEXZONE$54);
                }
                target.setStringValue(apdexzone);
            }
        }
        
        /**
         * Sets (as xml) the "apdexzone" attribute
         */
        public void xsetApdexzone(org.apache.xmlbeans.XmlString apdexzone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APDEXZONE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APDEXZONE$54);
                }
                target.set(apdexzone);
            }
        }
        
        /**
         * Unsets the "apdexzone" attribute
         */
        public void unsetApdexzone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APDEXZONE$54);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APDEX$56);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APDEX$56);
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
                return get_store().find_attribute_user(APDEX$56) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APDEX$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APDEX$56);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APDEX$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APDEX$56);
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
                get_store().remove_attribute(APDEX$56);
            }
        }
        
        /**
         * Gets the "visitcount" attribute
         */
        public java.math.BigInteger getVisitcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITCOUNT$58);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "visitcount" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetVisitcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISITCOUNT$58);
                return target;
            }
        }
        
        /**
         * True if has "visitcount" attribute
         */
        public boolean isSetVisitcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VISITCOUNT$58) != null;
            }
        }
        
        /**
         * Sets the "visitcount" attribute
         */
        public void setVisitcount(java.math.BigInteger visitcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITCOUNT$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISITCOUNT$58);
                }
                target.setBigIntegerValue(visitcount);
            }
        }
        
        /**
         * Sets (as xml) the "visitcount" attribute
         */
        public void xsetVisitcount(org.apache.xmlbeans.XmlInteger visitcount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VISITCOUNT$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VISITCOUNT$58);
                }
                target.set(visitcount);
            }
        }
        
        /**
         * Unsets the "visitcount" attribute
         */
        public void unsetVisitcount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VISITCOUNT$58);
            }
        }
        
        /**
         * Gets the "networktime" attribute
         */
        public double getNetworktime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKTIME$60);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "networktime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetNetworktime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(NETWORKTIME$60);
                return target;
            }
        }
        
        /**
         * True if has "networktime" attribute
         */
        public boolean isSetNetworktime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NETWORKTIME$60) != null;
            }
        }
        
        /**
         * Sets the "networktime" attribute
         */
        public void setNetworktime(double networktime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKTIME$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NETWORKTIME$60);
                }
                target.setDoubleValue(networktime);
            }
        }
        
        /**
         * Sets (as xml) the "networktime" attribute
         */
        public void xsetNetworktime(org.apache.xmlbeans.XmlDouble networktime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(NETWORKTIME$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(NETWORKTIME$60);
                }
                target.set(networktime);
            }
        }
        
        /**
         * Unsets the "networktime" attribute
         */
        public void unsetNetworktime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NETWORKTIME$60);
            }
        }
        
        /**
         * Gets the "servertime" attribute
         */
        public double getServertime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERTIME$62);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "servertime" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetServertime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERVERTIME$62);
                return target;
            }
        }
        
        /**
         * True if has "servertime" attribute
         */
        public boolean isSetServertime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SERVERTIME$62) != null;
            }
        }
        
        /**
         * Sets the "servertime" attribute
         */
        public void setServertime(double servertime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERTIME$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERTIME$62);
                }
                target.setDoubleValue(servertime);
            }
        }
        
        /**
         * Sets (as xml) the "servertime" attribute
         */
        public void xsetServertime(org.apache.xmlbeans.XmlDouble servertime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SERVERTIME$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SERVERTIME$62);
                }
                target.set(servertime);
            }
        }
        
        /**
         * Unsets the "servertime" attribute
         */
        public void unsetServertime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SERVERTIME$62);
            }
        }
        
        /**
         * Gets the "endtoend" attribute
         */
        public java.lang.String getEndtoend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTOEND$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "endtoend" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEndtoend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDTOEND$64);
                return target;
            }
        }
        
        /**
         * True if has "endtoend" attribute
         */
        public boolean isSetEndtoend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENDTOEND$64) != null;
            }
        }
        
        /**
         * Sets the "endtoend" attribute
         */
        public void setEndtoend(java.lang.String endtoend)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTOEND$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTOEND$64);
                }
                target.setStringValue(endtoend);
            }
        }
        
        /**
         * Sets (as xml) the "endtoend" attribute
         */
        public void xsetEndtoend(org.apache.xmlbeans.XmlString endtoend)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDTOEND$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDTOEND$64);
                }
                target.set(endtoend);
            }
        }
        
        /**
         * Unsets the "endtoend" attribute
         */
        public void unsetEndtoend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENDTOEND$64);
            }
        }
        
        /**
         * Gets the "bandwidth" attribute
         */
        public java.lang.String getBandwidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWIDTH$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bandwidth" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBandwidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWIDTH$66);
                return target;
            }
        }
        
        /**
         * True if has "bandwidth" attribute
         */
        public boolean isSetBandwidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BANDWIDTH$66) != null;
            }
        }
        
        /**
         * Sets the "bandwidth" attribute
         */
        public void setBandwidth(java.lang.String bandwidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BANDWIDTH$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BANDWIDTH$66);
                }
                target.setStringValue(bandwidth);
            }
        }
        
        /**
         * Sets (as xml) the "bandwidth" attribute
         */
        public void xsetBandwidth(org.apache.xmlbeans.XmlString bandwidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BANDWIDTH$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BANDWIDTH$66);
                }
                target.set(bandwidth);
            }
        }
        
        /**
         * Unsets the "bandwidth" attribute
         */
        public void unsetBandwidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BANDWIDTH$66);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$68);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$68);
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
                return get_store().find_attribute_user(APPLICATION$68) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPLICATION$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPLICATION$68);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPLICATION$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPLICATION$68);
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
                get_store().remove_attribute(APPLICATION$68);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$70);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$70);
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
                return get_store().find_attribute_user(VISITID$70) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISITID$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISITID$70);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISITID$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISITID$70);
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
                get_store().remove_attribute(VISITID$70);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICENAME$72);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICENAME$72);
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
                return get_store().find_attribute_user(DEVICENAME$72) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICENAME$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEVICENAME$72);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEVICENAME$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEVICENAME$72);
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
                get_store().remove_attribute(DEVICENAME$72);
            }
        }
        
        /**
         * Gets the "mobileappname" attribute
         */
        public java.lang.String getMobileappname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOBILEAPPNAME$74);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mobileappname" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMobileappname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOBILEAPPNAME$74);
                return target;
            }
        }
        
        /**
         * True if has "mobileappname" attribute
         */
        public boolean isSetMobileappname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MOBILEAPPNAME$74) != null;
            }
        }
        
        /**
         * Sets the "mobileappname" attribute
         */
        public void setMobileappname(java.lang.String mobileappname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOBILEAPPNAME$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOBILEAPPNAME$74);
                }
                target.setStringValue(mobileappname);
            }
        }
        
        /**
         * Sets (as xml) the "mobileappname" attribute
         */
        public void xsetMobileappname(org.apache.xmlbeans.XmlString mobileappname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOBILEAPPNAME$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MOBILEAPPNAME$74);
                }
                target.set(mobileappname);
            }
        }
        
        /**
         * Unsets the "mobileappname" attribute
         */
        public void unsetMobileappname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MOBILEAPPNAME$74);
            }
        }
        
        /**
         * Gets the "mobileappid" attribute
         */
        public java.lang.String getMobileappid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOBILEAPPID$76);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mobileappid" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMobileappid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOBILEAPPID$76);
                return target;
            }
        }
        
        /**
         * True if has "mobileappid" attribute
         */
        public boolean isSetMobileappid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MOBILEAPPID$76) != null;
            }
        }
        
        /**
         * Sets the "mobileappid" attribute
         */
        public void setMobileappid(java.lang.String mobileappid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOBILEAPPID$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOBILEAPPID$76);
                }
                target.setStringValue(mobileappid);
            }
        }
        
        /**
         * Sets (as xml) the "mobileappid" attribute
         */
        public void xsetMobileappid(org.apache.xmlbeans.XmlString mobileappid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOBILEAPPID$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MOBILEAPPID$76);
                }
                target.set(mobileappid);
            }
        }
        
        /**
         * Unsets the "mobileappid" attribute
         */
        public void unsetMobileappid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MOBILEAPPID$76);
            }
        }
        
        /**
         * Gets the "screenresolution" attribute
         */
        public java.lang.String getScreenresolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCREENRESOLUTION$78);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "screenresolution" attribute
         */
        public org.apache.xmlbeans.XmlString xgetScreenresolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCREENRESOLUTION$78);
                return target;
            }
        }
        
        /**
         * True if has "screenresolution" attribute
         */
        public boolean isSetScreenresolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCREENRESOLUTION$78) != null;
            }
        }
        
        /**
         * Sets the "screenresolution" attribute
         */
        public void setScreenresolution(java.lang.String screenresolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCREENRESOLUTION$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCREENRESOLUTION$78);
                }
                target.setStringValue(screenresolution);
            }
        }
        
        /**
         * Sets (as xml) the "screenresolution" attribute
         */
        public void xsetScreenresolution(org.apache.xmlbeans.XmlString screenresolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCREENRESOLUTION$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCREENRESOLUTION$78);
                }
                target.set(screenresolution);
            }
        }
        
        /**
         * Unsets the "screenresolution" attribute
         */
        public void unsetScreenresolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCREENRESOLUTION$78);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONTYPE$80);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTIONTYPE$80);
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
                return get_store().find_attribute_user(CONNECTIONTYPE$80) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONTYPE$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONTYPE$80);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTIONTYPE$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTIONTYPE$80);
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
                get_store().remove_attribute(CONNECTIONTYPE$80);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIER$82);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARRIER$82);
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
                return get_store().find_attribute_user(CARRIER$82) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CARRIER$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CARRIER$82);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CARRIER$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CARRIER$82);
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
                get_store().remove_attribute(CARRIER$82);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSLOCATION$84);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GPSLOCATION$84);
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
                return get_store().find_attribute_user(GPSLOCATION$84) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GPSLOCATION$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GPSLOCATION$84);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GPSLOCATION$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GPSLOCATION$84);
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
                get_store().remove_attribute(GPSLOCATION$84);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPVERSION$86);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPVERSION$86);
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
                return get_store().find_attribute_user(APPVERSION$86) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPVERSION$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPVERSION$86);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPVERSION$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPVERSION$86);
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
                get_store().remove_attribute(APPVERSION$86);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPBUILD$88);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPBUILD$88);
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
                return get_store().find_attribute_user(APPBUILD$88) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPBUILD$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPBUILD$88);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APPBUILD$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APPBUILD$88);
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
                get_store().remove_attribute(APPBUILD$88);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$90);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$90);
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
                return get_store().find_attribute_user(MANUFACTURER$90) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MANUFACTURER$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MANUFACTURER$90);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MANUFACTURER$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MANUFACTURER$90);
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
                get_store().remove_attribute(MANUFACTURER$90);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$92);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$92);
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
                return get_store().find_attribute_user(MODELID$92) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODELID$92);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODELID$92);
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
                get_store().remove_attribute(MODELID$92);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$94);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$94);
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
                return get_store().find_attribute_user(CPU$94) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CPU$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CPU$94);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CPU$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CPU$94);
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
                get_store().remove_attribute(CPU$94);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTED$96);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTED$96);
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
                return get_store().find_attribute_user(ROOTED$96) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTED$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOTED$96);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTED$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROOTED$96);
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
                get_store().remove_attribute(ROOTED$96);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADKVERSION$98);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADKVERSION$98);
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
                return get_store().find_attribute_user(ADKVERSION$98) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADKVERSION$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADKVERSION$98);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADKVERSION$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADKVERSION$98);
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
                get_store().remove_attribute(ADKVERSION$98);
            }
        }
        
        /**
         * Gets the "orientation" attribute
         */
        public java.lang.String getOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$100);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "orientation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIENTATION$100);
                return target;
            }
        }
        
        /**
         * True if has "orientation" attribute
         */
        public boolean isSetOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORIENTATION$100) != null;
            }
        }
        
        /**
         * Sets the "orientation" attribute
         */
        public void setOrientation(java.lang.String orientation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$100);
                }
                target.setStringValue(orientation);
            }
        }
        
        /**
         * Sets (as xml) the "orientation" attribute
         */
        public void xsetOrientation(org.apache.xmlbeans.XmlString orientation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIENTATION$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIENTATION$100);
                }
                target.set(orientation);
            }
        }
        
        /**
         * Unsets the "orientation" attribute
         */
        public void unsetOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORIENTATION$100);
            }
        }
        
        /**
         * Gets the "signalstrength" attribute
         */
        public java.lang.String getSignalstrength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALSTRENGTH$102);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "signalstrength" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSignalstrength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGNALSTRENGTH$102);
                return target;
            }
        }
        
        /**
         * True if has "signalstrength" attribute
         */
        public boolean isSetSignalstrength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIGNALSTRENGTH$102) != null;
            }
        }
        
        /**
         * Sets the "signalstrength" attribute
         */
        public void setSignalstrength(java.lang.String signalstrength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIGNALSTRENGTH$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIGNALSTRENGTH$102);
                }
                target.setStringValue(signalstrength);
            }
        }
        
        /**
         * Sets (as xml) the "signalstrength" attribute
         */
        public void xsetSignalstrength(org.apache.xmlbeans.XmlString signalstrength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIGNALSTRENGTH$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIGNALSTRENGTH$102);
                }
                target.set(signalstrength);
            }
        }
        
        /**
         * Unsets the "signalstrength" attribute
         */
        public void unsetSignalstrength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIGNALSTRENGTH$102);
            }
        }
        
        /**
         * Gets the "networktechnology" attribute
         */
        public java.lang.String getNetworktechnology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKTECHNOLOGY$104);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "networktechnology" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNetworktechnology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NETWORKTECHNOLOGY$104);
                return target;
            }
        }
        
        /**
         * True if has "networktechnology" attribute
         */
        public boolean isSetNetworktechnology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NETWORKTECHNOLOGY$104) != null;
            }
        }
        
        /**
         * Sets the "networktechnology" attribute
         */
        public void setNetworktechnology(java.lang.String networktechnology)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NETWORKTECHNOLOGY$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NETWORKTECHNOLOGY$104);
                }
                target.setStringValue(networktechnology);
            }
        }
        
        /**
         * Sets (as xml) the "networktechnology" attribute
         */
        public void xsetNetworktechnology(org.apache.xmlbeans.XmlString networktechnology)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NETWORKTECHNOLOGY$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NETWORKTECHNOLOGY$104);
                }
                target.set(networktechnology);
            }
        }
        
        /**
         * Unsets the "networktechnology" attribute
         */
        public void unsetNetworktechnology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NETWORKTECHNOLOGY$104);
            }
        }
        
        /**
         * Gets the "sourcetitle" attribute
         */
        public java.lang.String getSourcetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCETITLE$106);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sourcetitle" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSourcetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCETITLE$106);
                return target;
            }
        }
        
        /**
         * True if has "sourcetitle" attribute
         */
        public boolean isSetSourcetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOURCETITLE$106) != null;
            }
        }
        
        /**
         * Sets the "sourcetitle" attribute
         */
        public void setSourcetitle(java.lang.String sourcetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCETITLE$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCETITLE$106);
                }
                target.setStringValue(sourcetitle);
            }
        }
        
        /**
         * Sets (as xml) the "sourcetitle" attribute
         */
        public void xsetSourcetitle(org.apache.xmlbeans.XmlString sourcetitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCETITLE$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCETITLE$106);
                }
                target.set(sourcetitle);
            }
        }
        
        /**
         * Unsets the "sourcetitle" attribute
         */
        public void unsetSourcetitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOURCETITLE$106);
            }
        }
        
        /**
         * Gets the "sourceurl" attribute
         */
        public java.lang.String getSourceurl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEURL$108);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sourceurl" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSourceurl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCEURL$108);
                return target;
            }
        }
        
        /**
         * True if has "sourceurl" attribute
         */
        public boolean isSetSourceurl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOURCEURL$108) != null;
            }
        }
        
        /**
         * Sets the "sourceurl" attribute
         */
        public void setSourceurl(java.lang.String sourceurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCEURL$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCEURL$108);
                }
                target.setStringValue(sourceurl);
            }
        }
        
        /**
         * Sets (as xml) the "sourceurl" attribute
         */
        public void xsetSourceurl(org.apache.xmlbeans.XmlString sourceurl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCEURL$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCEURL$108);
                }
                target.set(sourceurl);
            }
        }
        
        /**
         * Unsets the "sourceurl" attribute
         */
        public void unsetSourceurl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOURCEURL$108);
            }
        }
        
        /**
         * Gets the "viewduration" attribute
         */
        public java.lang.String getViewduration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWDURATION$110);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "viewduration" attribute
         */
        public org.apache.xmlbeans.XmlString xgetViewduration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWDURATION$110);
                return target;
            }
        }
        
        /**
         * True if has "viewduration" attribute
         */
        public boolean isSetViewduration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIEWDURATION$110) != null;
            }
        }
        
        /**
         * Sets the "viewduration" attribute
         */
        public void setViewduration(java.lang.String viewduration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWDURATION$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEWDURATION$110);
                }
                target.setStringValue(viewduration);
            }
        }
        
        /**
         * Sets (as xml) the "viewduration" attribute
         */
        public void xsetViewduration(org.apache.xmlbeans.XmlString viewduration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWDURATION$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIEWDURATION$110);
                }
                target.set(viewduration);
            }
        }
        
        /**
         * Unsets the "viewduration" attribute
         */
        public void unsetViewduration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIEWDURATION$110);
            }
        }
        
        /**
         * Gets the "performancemetric" attribute
         */
        public java.lang.String getPerformancemetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRIC$112);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "performancemetric" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPerformancemetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFORMANCEMETRIC$112);
                return target;
            }
        }
        
        /**
         * True if has "performancemetric" attribute
         */
        public boolean isSetPerformancemetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERFORMANCEMETRIC$112) != null;
            }
        }
        
        /**
         * Sets the "performancemetric" attribute
         */
        public void setPerformancemetric(java.lang.String performancemetric)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRIC$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFORMANCEMETRIC$112);
                }
                target.setStringValue(performancemetric);
            }
        }
        
        /**
         * Sets (as xml) the "performancemetric" attribute
         */
        public void xsetPerformancemetric(org.apache.xmlbeans.XmlString performancemetric)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFORMANCEMETRIC$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERFORMANCEMETRIC$112);
                }
                target.set(performancemetric);
            }
        }
        
        /**
         * Unsets the "performancemetric" attribute
         */
        public void unsetPerformancemetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERFORMANCEMETRIC$112);
            }
        }
        
        /**
         * Gets the "performancemetricvalue" attribute
         */
        public java.math.BigInteger getPerformancemetricvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICVALUE$114);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "performancemetricvalue" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPerformancemetricvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PERFORMANCEMETRICVALUE$114);
                return target;
            }
        }
        
        /**
         * True if has "performancemetricvalue" attribute
         */
        public boolean isSetPerformancemetricvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERFORMANCEMETRICVALUE$114) != null;
            }
        }
        
        /**
         * Sets the "performancemetricvalue" attribute
         */
        public void setPerformancemetricvalue(java.math.BigInteger performancemetricvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICVALUE$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFORMANCEMETRICVALUE$114);
                }
                target.setBigIntegerValue(performancemetricvalue);
            }
        }
        
        /**
         * Sets (as xml) the "performancemetricvalue" attribute
         */
        public void xsetPerformancemetricvalue(org.apache.xmlbeans.XmlInteger performancemetricvalue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PERFORMANCEMETRICVALUE$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PERFORMANCEMETRICVALUE$114);
                }
                target.set(performancemetricvalue);
            }
        }
        
        /**
         * Unsets the "performancemetricvalue" attribute
         */
        public void unsetPerformancemetricvalue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERFORMANCEMETRICVALUE$114);
            }
        }
        
        /**
         * Gets the "performancemetricthreshold" attribute
         */
        public java.math.BigInteger getPerformancemetricthreshold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICTHRESHOLD$116);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "performancemetricthreshold" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPerformancemetricthreshold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PERFORMANCEMETRICTHRESHOLD$116);
                return target;
            }
        }
        
        /**
         * True if has "performancemetricthreshold" attribute
         */
        public boolean isSetPerformancemetricthreshold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERFORMANCEMETRICTHRESHOLD$116) != null;
            }
        }
        
        /**
         * Sets the "performancemetricthreshold" attribute
         */
        public void setPerformancemetricthreshold(java.math.BigInteger performancemetricthreshold)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICTHRESHOLD$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFORMANCEMETRICTHRESHOLD$116);
                }
                target.setBigIntegerValue(performancemetricthreshold);
            }
        }
        
        /**
         * Sets (as xml) the "performancemetricthreshold" attribute
         */
        public void xsetPerformancemetricthreshold(org.apache.xmlbeans.XmlInteger performancemetricthreshold)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PERFORMANCEMETRICTHRESHOLD$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PERFORMANCEMETRICTHRESHOLD$116);
                }
                target.set(performancemetricthreshold);
            }
        }
        
        /**
         * Unsets the "performancemetricthreshold" attribute
         */
        public void unsetPerformancemetricthreshold()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERFORMANCEMETRICTHRESHOLD$116);
            }
        }
        
        /**
         * Gets the "performancemetricfactor" attribute
         */
        public java.math.BigInteger getPerformancemetricfactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICFACTOR$118);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "performancemetricfactor" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetPerformancemetricfactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PERFORMANCEMETRICFACTOR$118);
                return target;
            }
        }
        
        /**
         * True if has "performancemetricfactor" attribute
         */
        public boolean isSetPerformancemetricfactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERFORMANCEMETRICFACTOR$118) != null;
            }
        }
        
        /**
         * Sets the "performancemetricfactor" attribute
         */
        public void setPerformancemetricfactor(java.math.BigInteger performancemetricfactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICFACTOR$118);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFORMANCEMETRICFACTOR$118);
                }
                target.setBigIntegerValue(performancemetricfactor);
            }
        }
        
        /**
         * Sets (as xml) the "performancemetricfactor" attribute
         */
        public void xsetPerformancemetricfactor(org.apache.xmlbeans.XmlInteger performancemetricfactor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PERFORMANCEMETRICFACTOR$118);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PERFORMANCEMETRICFACTOR$118);
                }
                target.set(performancemetricfactor);
            }
        }
        
        /**
         * Unsets the "performancemetricfactor" attribute
         */
        public void unsetPerformancemetricfactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERFORMANCEMETRICFACTOR$118);
            }
        }
        
        /**
         * Gets the "performancemetricfactorreason" attribute
         */
        public java.lang.String getPerformancemetricfactorreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICFACTORREASON$120);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "performancemetricfactorreason" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPerformancemetricfactorreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFORMANCEMETRICFACTORREASON$120);
                return target;
            }
        }
        
        /**
         * True if has "performancemetricfactorreason" attribute
         */
        public boolean isSetPerformancemetricfactorreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERFORMANCEMETRICFACTORREASON$120) != null;
            }
        }
        
        /**
         * Sets the "performancemetricfactorreason" attribute
         */
        public void setPerformancemetricfactorreason(java.lang.String performancemetricfactorreason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERFORMANCEMETRICFACTORREASON$120);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERFORMANCEMETRICFACTORREASON$120);
                }
                target.setStringValue(performancemetricfactorreason);
            }
        }
        
        /**
         * Sets (as xml) the "performancemetricfactorreason" attribute
         */
        public void xsetPerformancemetricfactorreason(org.apache.xmlbeans.XmlString performancemetricfactorreason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERFORMANCEMETRICFACTORREASON$120);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERFORMANCEMETRICFACTORREASON$120);
                }
                target.set(performancemetricfactorreason);
            }
        }
        
        /**
         * Unsets the "performancemetricfactorreason" attribute
         */
        public void unsetPerformancemetricfactorreason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERFORMANCEMETRICFACTORREASON$120);
            }
        }
    }
}
