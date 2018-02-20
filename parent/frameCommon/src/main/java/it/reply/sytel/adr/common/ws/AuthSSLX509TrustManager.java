/*
 * $Header:
 * /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//httpclient/src/contrib/org/apache/commons/httpclient/contrib/ssl/AuthSSLX509TrustManager.java,v
 * 1.2 2004/06/10 18:25:24 olegk Exp $ $Revision: 1.1.2.1 $ $Date: 2011/02/18 14:16:40 $
 * ==================================================================== Licensed to the Apache
 * Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in
 * writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * ==================================================================== This software consists of
 * voluntary contributions made by many individuals on behalf of the Apache Software Foundation. For
 * more information on the Apache Software Foundation, please see <http://www.apache.org/>.
 */
package it.reply.sytel.adr.common.ws;

import it.reply.sytel.adr.common.log.EtlLogger;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

import org.apache.log4j.Logger;


/**
 * <p>
 * AuthSSLX509TrustManager can be used to extend the default
 * {@link X509TrustManager} with additional trust decisions.
 * </p>
 * 
 * @author <a href="mailto:oleg@ural.ru">Oleg Kalnichevski</a>
 * 
 *         <p>
 *         DISCLAIMER: HttpClient developers DO NOT actively support this
 *         component. The component is provided as a reference material, which
 *         may be inappropriate for use without additional customization.
 *         </p>
 */
public class AuthSSLX509TrustManager implements X509TrustManager {
    
    /**
     * GateSender <i>application logger</i>.
     */
    private Logger appLogger   = EtlLogger.getLogger(AuthSSLX509TrustManager.class);

    /**
     * Constructor for AuthSSLX509TrustManager.
     */
    public AuthSSLX509TrustManager(final X509TrustManager defaultTrustManager) {
        super();
        if(defaultTrustManager == null) {
            throw new IllegalArgumentException("Trust manager may not be null");
        }
        
        this.defaultTrustManager = defaultTrustManager;
    }

    /**
     * @see javax.net.ssl.X509TrustManager#checkClientTrusted(X509Certificate[],
     *      String authType)
     */
    @Override
    public void checkClientTrusted(X509Certificate[] certificates, String authType) throws CertificateException {
        if(appLogger.isInfoEnabled() && certificates != null) {
            for(int c = 0; c < certificates.length; c++) {
                X509Certificate cert = certificates[c];
                appLogger.info(" Client certificate " + (c + 1) + ":");
                appLogger.info("  Subject DN: " + cert.getSubjectDN());
                appLogger.info("  Signature Algorithm: " + cert.getSigAlgName());
                appLogger.info("  Valid from: " + cert.getNotBefore());
                appLogger.info("  Valid until: " + cert.getNotAfter());
                appLogger.info("  Issuer: " + cert.getIssuerDN());
            }
        }
        
        defaultTrustManager.checkClientTrusted(certificates, authType);
    }

    /**
     * @see javax.net.ssl.X509TrustManager#checkServerTrusted(X509Certificate[],
     *      String authType)
     */
    @Override
    public void checkServerTrusted(X509Certificate[] certificates, String authType) throws CertificateException {
        if(appLogger.isInfoEnabled() && certificates != null) {
            for(int c = 0; c < certificates.length; c++) {
                X509Certificate cert = certificates[c];
                appLogger.info(" Server certificate " + (c + 1) + ":");
                appLogger.info("  Subject DN: " + cert.getSubjectDN());
                appLogger.info("  Signature Algorithm: " + cert.getSigAlgName());
                appLogger.info("  Valid from: " + cert.getNotBefore());
                appLogger.info("  Valid until: " + cert.getNotAfter());
                appLogger.info("  Issuer: " + cert.getIssuerDN());
            }
        }
        
        defaultTrustManager.checkServerTrusted(certificates, authType);
    }

    /**
     * @see javax.net.ssl.X509TrustManager#getAcceptedIssuers()
     */
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return this.defaultTrustManager.getAcceptedIssuers();
    }
    
    //-----------------------------------
    // PRIVATE SECTION
    //-----------------------------------  
    private X509TrustManager defaultTrustManager;    
}
