package httpclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			String ss="woshi hah";
//			String s=URLEncoder.encode(ss, "UTF-8");
//			System.out.println(s);
//			System.out.println(ss);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		 HttpClient client = new DefaultHttpClient();
	        // 发送get请求创建HttpGet对象
	        HttpGet getMethod = new HttpGet("http://192.168.1.103:1111/index");
	        try {
				HttpResponse response = client.execute(getMethod);
				System.out.println("============="+response.getStatusLine());
				HttpEntity entity=response.getEntity();
				System.out.println(EntityUtils.toString(entity));
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}
