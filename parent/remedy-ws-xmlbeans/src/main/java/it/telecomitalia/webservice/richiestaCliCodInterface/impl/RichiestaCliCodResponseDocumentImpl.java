/*
 * An XML document type.
 * Localname: RichiestaCliCodResponse
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface.impl;
/**
 * A document containing one RichiestaCliCodResponse(@RichiestaCliCodInterface.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class RichiestaCliCodResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RichiestaCliCodResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RICHIESTACLICODRESPONSE$0 = 
        new javax.xml.namespace.QName("RichiestaCliCodInterface.webservice.telecomitalia.it", "RichiestaCliCodResponse");
    
    
    /**
     * Gets the "RichiestaCliCodResponse" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse getRichiestaCliCodResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse)get_store().find_element_user(RICHIESTACLICODRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RichiestaCliCodResponse" element
     */
    public void setRichiestaCliCodResponse(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse richiestaCliCodResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse)get_store().find_element_user(RICHIESTACLICODRESPONSE$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse)get_store().add_element_user(RICHIESTACLICODRESPONSE$0);
            }
            target.set(richiestaCliCodResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RichiestaCliCodResponse" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse addNewRichiestaCliCodResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse)get_store().add_element_user(RICHIESTACLICODRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RichiestaCliCodResponse(@RichiestaCliCodInterface.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class RichiestaCliCodResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodResponseDocument.RichiestaCliCodResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RichiestaCliCodResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RICHIESTACLICODOUT$0 = 
            new javax.xml.namespace.QName("", "RichiestaCliCodOUT");
        private static final javax.xml.namespace.QName RICHIESTACLICODFAULT$2 = 
            new javax.xml.namespace.QName("", "RichiestaCliCodFault");
        
        
        /**
         * Gets the "RichiestaCliCodOUT" element
         */
        public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType getRichiestaCliCodOUT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType)get_store().find_element_user(RICHIESTACLICODOUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RichiestaCliCodOUT" element
         */
        public boolean isSetRichiestaCliCodOUT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RICHIESTACLICODOUT$0) != 0;
            }
        }
        
        /**
         * Sets the "RichiestaCliCodOUT" element
         */
        public void setRichiestaCliCodOUT(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType richiestaCliCodOUT)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType)get_store().find_element_user(RICHIESTACLICODOUT$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType)get_store().add_element_user(RICHIESTACLICODOUT$0);
                }
                target.set(richiestaCliCodOUT);
            }
        }
        
        /**
         * Appends and returns a new empty "RichiestaCliCodOUT" element
         */
        public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType addNewRichiestaCliCodOUT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodOutType)get_store().add_element_user(RICHIESTACLICODOUT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "RichiestaCliCodOUT" element
         */
        public void unsetRichiestaCliCodOUT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RICHIESTACLICODOUT$0, 0);
            }
        }
        
        /**
         * Gets the "RichiestaCliCodFault" element
         */
        public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault getRichiestaCliCodFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault)get_store().find_element_user(RICHIESTACLICODFAULT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RichiestaCliCodFault" element
         */
        public boolean isSetRichiestaCliCodFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RICHIESTACLICODFAULT$2) != 0;
            }
        }
        
        /**
         * Sets the "RichiestaCliCodFault" element
         */
        public void setRichiestaCliCodFault(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault richiestaCliCodFault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault)get_store().find_element_user(RICHIESTACLICODFAULT$2, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault)get_store().add_element_user(RICHIESTACLICODFAULT$2);
                }
                target.set(richiestaCliCodFault);
            }
        }
        
        /**
         * Appends and returns a new empty "RichiestaCliCodFault" element
         */
        public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault addNewRichiestaCliCodFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodFault)get_store().add_element_user(RICHIESTACLICODFAULT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "RichiestaCliCodFault" element
         */
        public void unsetRichiestaCliCodFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RICHIESTACLICODFAULT$2, 0);
            }
        }
    }
}
