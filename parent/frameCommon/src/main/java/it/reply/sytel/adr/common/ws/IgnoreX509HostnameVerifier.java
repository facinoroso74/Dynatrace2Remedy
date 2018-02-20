/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/06 14:12:02 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/XAwesCommon/src/java/it/reply/sytel/xawes/exception/XAwesCoreNestedException.java,v 1.4 2010/07/06 14:12:02 m.pantaleone Exp $
 * $Id: XAwesCoreNestedException.java,v 1.4 2010/07/06 14:12:02 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.4 $
 * $State: Exp $
 */
package it.reply.sytel.adr.common.ws;

import java.io.IOException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

import org.apache.http.conn.ssl.X509HostnameVerifier;

/**
 * @author m.pantaleone, g.serra
 */
public class IgnoreX509HostnameVerifier implements X509HostnameVerifier {

    @Override
    public void verify(String    paramString,
                       SSLSocket paramSSLSocket)
                       throws IOException {
        // Does nothing
    }

    @Override
    public void verify(String          paramString,
                       X509Certificate paramX509Certificate)
                       throws SSLException {
        // Does nothing
    }

    @Override
    public void verify(String   paramString,
                       String[] paramArrayOfString1,
                       String[] paramArrayOfString2)
                       throws SSLException {
        // Does nothing
    }

    @Override
    public boolean verify(String arg0, SSLSession arg1) {
        // ignore the hostname verification
        return true;
    }
}
