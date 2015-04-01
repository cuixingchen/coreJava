package httpclient;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class TestOa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String uri_login="http://oa.hdsxtech.com:8080/logincheck.php";
		String uri_getDuty="http://oa.hdsxtech.com:8080/general/attendance/personal/duty/";
		BasicCookieStore cookieStore;
		cookieStore = new BasicCookieStore();
		CloseableHttpClient httpclient;
	    httpclient = HttpClients.custom().setDefaultCookieStore(getCookie()).build();
//		httpclient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
//		login(uri_login,httpclient);
		getDuty(uri_getDuty,httpclient);
		
	}
	
	public static BasicCookieStore getCookie(){
		BasicCookieStore cookieStore= new BasicCookieStore();
		BasicClientCookie cookie;
		cookie=new BasicClientCookie("USER_NAME_COOKIE", "cuipf");
//		cookie.setVersion(0);
//		cookie.setDomain("oa.hdsxtech.com");
//		cookie.setPath("/");
//		cookie.setExpiryDate(null);
		cookieStore.addCookie(cookie);
		
		cookie=new BasicClientCookie("PHPSESSID", "92a03025a809f103119969a0e380ec93");
//		cookie.setVersion(0);
		cookie.setDomain("oa.hdsxtech.com");
//		cookie.setPath("/");
//		cookie.setExpiryDate(null);
		cookieStore.addCookie(cookie);
		
		
		cookie=new BasicClientCookie("SID_39", "375f040c");
//		cookie.setVersion(0);
//		cookie.setDomain("oa.hdsxtech.com");
//		cookie.setPath("/");
//		cookie.setExpiryDate(null);
		cookieStore.addCookie(cookie);
		
		cookie=new BasicClientCookie("UI_COOKIE", "0");
//		cookie.setVersion(0);
//		cookie.setDomain("oa.hdsxtech.com");
//		cookie.setPath("/");
//		cookie.setExpiryDate(null);
		cookieStore.addCookie(cookie);
		
		cookie=new BasicClientCookie("USER_NAME_COOKIE", "cuipf");
//		cookie.setVersion(0);
//		cookie.setDomain("oa.hdsxtech.com");
//		cookie.setPath("/");
//		cookie.setExpiryDate(null);
		cookieStore.addCookie(cookie);
		return cookieStore;
	}
	
	public static void getDuty(String uri,CloseableHttpClient httpclient){
		HttpGet httpget = new HttpGet(uri);

        CloseableHttpResponse response1;
		try {
			response1 = httpclient.execute(httpget);
			HttpEntity entity = response1.getEntity();

            System.out.println("Login form get: " + response1.getStatusLine());
//            EntityUtils.consume(entity);
            System.out.println(EntityUtils.toString(entity,"x-EUC-CN"));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static BasicCookieStore login(String uri,CloseableHttpClient httpclient){
		BasicCookieStore cookieStore = new BasicCookieStore();
	    httpclient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
		HttpPost post=new HttpPost(uri);
		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
		nvps.add(new BasicNameValuePair("UNAME", "cuipf"));
		nvps.add(new BasicNameValuePair("PASSWORD", "cuipf1007"));
		post.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
		try {
			CloseableHttpResponse response=httpclient.execute(post);
			HttpEntity entity = response.getEntity();

          System.out.println("Login form get: " + response.getStatusLine());
          EntityUtils.consume(entity);
          List<Cookie> cookies = cookieStore.getCookies();
          if (cookies.isEmpty()) {
              System.out.println("None");
          } else {
              for (int i = 0; i < cookies.size(); i++) {
                  System.out.println("- " + cookies.get(i).toString());
              }
          }
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return cookieStore;
	}

}
