/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package httpclient.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.DigestScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * An example of HttpClient can be customized to authenticate
 * preemptively using DIGEST scheme.
 * <p/>
 * Generally, preemptive authentication can be considered less
 * secure than a response to an authentication challenge
 * and therefore discouraged.
 */
public class ClientPreemptiveDigestAuthentication {

    public static void main(String[] args) throws Exception {
        HttpHost targetHost = new HttpHost("localhost", 80, "http");
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope(targetHost.getHostName(), targetHost.getPort()),
                new UsernamePasswordCredentials("username", "password"));
        CloseableHttpClient httpclient = HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider).build();
        try {

            // Create AuthCache instance
            AuthCache authCache = new BasicAuthCache();
            // Generate DIGEST scheme object, initialize it and add it to the local
            // auth cache
            DigestScheme digestAuth = new DigestScheme();
            // Suppose we already know the realm name
            digestAuth.overrideParamter("realm", "some realm");
            // Suppose we already know the expected nonce value
            digestAuth.overrideParamter("nonce", "whatever");
            authCache.put(targetHost, digestAuth);

            // Add AuthCache to the execution context
            HttpClientContext localContext = HttpClientContext.create();
            localContext.setAuthCache(authCache);

            HttpGet httpget = new HttpGet("/");

            System.out.println("executing request: " + httpget.getRequestLine());
            System.out.println("to target: " + targetHost);

            for (int i = 0; i < 3; i++) {
                CloseableHttpResponse response = httpclient.execute(targetHost, httpget, localContext);
                try {
                    HttpEntity entity = response.getEntity();

                    System.out.println("----------------------------------------");
                    System.out.println(response.getStatusLine());
                    if (entity != null) {
                        System.out.println("Response content length: " + entity.getContentLength());
                    }
                    EntityUtils.consume(entity);
                } finally {
                    response.close();
                }
            }
        } finally {
            httpclient.close();
        }
    }

}
