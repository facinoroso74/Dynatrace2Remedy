/*
 * An XML document type.
 * Localname: RichiestaCliCod
 * Namespace: RichiestaCliCodInterface.webservice.telecomitalia.it
 * Java type: it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument
 *
 * Automatically generated - do not modify.
 */
package it.telecomitalia.webservice.richiestaCliCodInterface.impl;
/**
 * A document containing one RichiestaCliCod(@RichiestaCliCodInterface.webservice.telecomitalia.it) element.
 *
 * This is a complex type.
 */
public class RichiestaCliCodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument
{
    private static final long serialVersionUID = 1L;
    
    public RichiestaCliCodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RICHIESTACLICOD$0 = 
        new javax.xml.namespace.QName("RichiestaCliCodInterface.webservice.telecomitalia.it", "RichiestaCliCod");
    
    
    /**
     * Gets the "RichiestaCliCod" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod getRichiestaCliCod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod)get_store().find_element_user(RICHIESTACLICOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RichiestaCliCod" element
     */
    public void setRichiestaCliCod(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod richiestaCliCod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod)get_store().find_element_user(RICHIESTACLICOD$0, 0);
            if (target == null)
            {
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod)get_store().add_element_user(RICHIESTACLICOD$0);
            }
            target.set(richiestaCliCod);
        }
    }
    
    /**
     * Appends and returns a new empty "RichiestaCliCod" element
     */
    public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod addNewRichiestaCliCod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod target = null;
            target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod)get_store().add_element_user(RICHIESTACLICOD$0);
            return target;
        }
    }
    /**
     * An XML RichiestaCliCod(@RichiestaCliCodInterface.webservice.telecomitalia.it).
     *
     * This is a complex type.
     */
    public static class RichiestaCliCodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodDocument.RichiestaCliCod
    {
        private static final long serialVersionUID = 1L;
        
        public RichiestaCliCodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RICHIESTACLICODIN$0 = 
            new javax.xml.namespace.QName("", "RichiestaCliCodIN");
        
        
        /**
         * Gets the "RichiestaCliCodIN" element
         */
        public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType getRichiestaCliCodIN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType)get_store().find_element_user(RICHIESTACLICODIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RichiestaCliCodIN" element
         */
        public void setRichiestaCliCodIN(it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType richiestaCliCodIN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType)get_store().find_element_user(RICHIESTACLICODIN$0, 0);
                if (target == null)
                {
                    target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType)get_store().add_element_user(RICHIESTACLICODIN$0);
                }
                target.set(richiestaCliCodIN);
            }
        }
        
        /**
         * Appends and returns a new empty "RichiestaCliCodIN" element
         */
        public it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType addNewRichiestaCliCodIN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType target = null;
                target = (it.telecomitalia.webservice.richiestaCliCodInterface.RichiestaCliCodInType)get_store().add_element_user(RICHIESTACLICODIN$0);
                return target;
            }
        }
    }
}
