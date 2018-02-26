/*
 * $Header:
 * /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//httpclient/src/contrib/org/apache/commons/httpclient/contrib/ssl/AuthSSLProtocolSocketFactory.java,v
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
import it.reply.sytel.adr.common.ws.exc.SSLConfigurationException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.apache.log4j.Logger;

public class AuthSSLProtocolSocketFactory {

    private Logger logger = EtlLogger.getLogger(AuthSSLProtocolSocketFactory.class);

    /**
     * @param keystoreUrl
     * @param keystorePassword
     * @param keyPassword
     * @param truststoreUrl
     * @param truststorePassword
     * @return
     * @throws SSLConfigurationException if any error occurs when creating SSL context
     */
    public SSLContext createSSLContext(URL    keystoreUrl,
                                       String keystorePassword,
                                       String keyPassword,
                                       URL    truststoreUrl,
                                       String truststorePassword,
                                       String protocolHandShake)
                                       throws SSLConfigurationException {
        try {
            KeyManager[] keymanagers = null;
            TrustManager[] trustmanagers = null;
            if(keystoreUrl != null) {
                KeyStore keystore = createKeyStore(keystoreUrl, keystorePassword);
                keymanagers = createKeyManagers(keystore, keyPassword);
            }
            
            if(truststoreUrl != null) {
                KeyStore keystore = createKeyStore(truststoreUrl, truststorePassword);
                trustmanagers = createTrustManagers(keystore);
            }
            
            
            //String protocolHandShake="TLSv1";
            //TLSv1,TLSv1.1,TLSv1.2,SSLv2Hello"
            //String protocolHandShake="TLSv1.2";
            //String protocolHandShake="TLSv1.2";
            logger.debug("--------- protocolHandShake:["+protocolHandShake+"]--------");
            
            SSLContext sslcontext = SSLContext.getInstance(protocolHandShake);
            
            sslcontext.init(keymanagers, trustmanagers, null);
            return sslcontext;
            
        } catch(NoSuchAlgorithmException e) {
            logger.error(e.getMessage(), e);
            throw new SSLConfigurationException("Unsupported algorithm exception: " + e.getMessage(), e);
            
        } catch(KeyStoreException e) {
            logger.error(e.getMessage(), e);
            throw new SSLConfigurationException("Keystore exception: " + e.getMessage(), e);
            
        } catch(GeneralSecurityException e) {
            logger.error(e.getMessage(), e);
            throw new SSLConfigurationException("Key management exception: " + e.getMessage(), e);
            
        } catch(IOException e) {
            logger.error(e.getMessage(), e);
            throw new SSLConfigurationException("I/O error reading keystore/truststore file: " + e.getMessage(), e);
        }
    }

    //-----------------------------------
    // PRIVATE METHODS
    //-----------------------------------  
    
    private KeyStore createKeyStore(final URL    url,
                                    final String password)
                                    throws KeyStoreException,
                                           NoSuchAlgorithmException,
                                           CertificateException,
                                           IOException {
        if(url == null) {
            throw new IllegalArgumentException("Keystore url may not be null");
        }

        KeyStore keystore = KeyStore.getInstance("jks");
        InputStream is = null;
        try {
            is = url.openStream();
            keystore.load(is, password != null ? password.toCharArray() : null);
            
        } finally {
            if(is != null) {
                is.close();
            }
        }
        
        return keystore;
    }

    private KeyManager[] createKeyManagers(final KeyStore keystore,
                                           final String   password)
                                           throws KeyStoreException,
                                                  NoSuchAlgorithmException,
                                                  UnrecoverableKeyException {
        if(keystore == null) {
            throw new IllegalArgumentException("Keystore may not be null");
        }
        
        logger.debug("Initializing key manager");
        KeyManagerFactory kmfactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmfactory.init(keystore, password != null ? password.toCharArray() : null);
        return kmfactory.getKeyManagers();
    }

    private TrustManager[] createTrustManagers(final KeyStore keystore)
                                               throws KeyStoreException,
                                                      NoSuchAlgorithmException {
        if(keystore == null) {
            throw new IllegalArgumentException("Keystore may not be null");
        }
        
        logger.debug("createTrustManagers - Initializing trust manager: " + keystore.aliases().nextElement());
        logger.debug("Initializing trust manager");
        TrustManagerFactory tmfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmfactory.init(keystore);
        TrustManager[] trustmanagers = tmfactory.getTrustManagers();
        for(int i = 0; i < trustmanagers.length; i++) {
            if(trustmanagers[i] instanceof X509TrustManager) {
                trustmanagers[i] = new AuthSSLX509TrustManager((X509TrustManager)trustmanagers[i]);
            }
        }
        
        return trustmanagers;
    }
}
