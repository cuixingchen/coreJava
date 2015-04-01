package httpclient;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

public class TestHttpGet {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String TEST = "{\"state\":1,\"result\":{\"orderId\":1381469237310,\"userId\":13613613666,\"nickName\":\"刘亚辉\",\"sex\":0,\"commonAddressId\":0,\"commonAddressLongitude\":0.0,\"commonAddressLatitude\":0.0,\"getOnTime\":\"Sep 28, 2013 5:00:00 PM\",\"lastReplTime\":\"Sep 28, 2013 6:00:00 PM\",\"contractTaxi\":0,\"vipMark\":\"1\",\"takeTaxiType\":1,\"serverLevel\":1,\"firstChoiceCompany\":\"大众\",\"personCount\":3,\"getOnLon\":116.257555,\"getOnLat\":39.974400,\"getOffLon\":3333333.0,\"getOffLat\":4444444.0,\"getOnPlaceName\":\"上车地点\",\"getOffPlaceName\":\"下车地点\",\"notes\":\"还想说点啥\",\"motorcycleType\":\"现代\",\"anotherCellPhoneNo\":0,\"taxiId\":\"6408:8613436342645\",\"taxiColor\":\"绿色\",\"taxiPlateNumber\":\"京B12345\",\"taxiCompany\":\"北汽公司\",\"taxiDriverName\":\"李师傅\",\"taxiDriverCellPhoneNo\":\"13810195316\",\"acceptLon\":0,\"acceptLat\":0,\"currentTime\":\"2013-10-11 13:27:17\",\"finishMark\":\"-1\",\"cancelMark\":\"-1\",\"cityResponse2CenterTime\":\"2013-10-11 13:27:22\",\"center2CityState\":\"1\",\"city2SchedulingState\":\"-1\",\"succeedMark\":\"1\",\"subscribeMark\":\"1\"}}";
		String uri="http://192.168.5.6:9090/plugins/push/pushservlet";
		 BasicCookieStore cookieStore = new BasicCookieStore();
	     CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
	     Map<String,String> params=new HashMap<String,String>();
	     params.put("username", "15611352304");
	     params.put("message", TEST);
	     StringBuilder urlBuilder = new StringBuilder();
         urlBuilder.append(uri);

         if (null != params) {

             urlBuilder.append("?");

             Iterator<Entry<String, String>> iterator = params.entrySet()
                     .iterator();

             while (iterator.hasNext()) {
                 Entry<String, String> param = iterator.next();
                 urlBuilder
                         .append(URLEncoder.encode(param.getKey(), "UTF-8"))
                         .append('=')
                         .append(URLEncoder.encode(param.getValue(), "UTF-8"));
                 if (iterator.hasNext()) {
                     urlBuilder.append('&');
                 }
             }
         }
		try {
            HttpGet httpget = new HttpGet(urlBuilder.toString());
            CloseableHttpResponse response1 = httpclient.execute(httpget);
            if(response1!=null){
            	try {
            		HttpEntity entity = response1.getEntity();
            		
            		
            		System.out.println("Login form get: ====null" + response1.getStatusLine());
            		EntityUtils.consume(entity);
            		
            		System.out.println("Initial set of cookies:");
            		List<Cookie> cookies = cookieStore.getCookies();
            		if (cookies.isEmpty()) {
            			System.out.println("None");
            		} else {
            			for (int i = 0; i < cookies.size(); i++) {
            				System.out.println("- " + cookies.get(i).toString());
            			}
            		}
            	} finally {
            		response1.close();
            	}

            }else{
            	
            	try {
            		HttpEntity entity = response1.getEntity();
            		
            		
            		System.out.println("Login form get: " + response1.getStatusLine());
            		EntityUtils.consume(entity);
            		
            		System.out.println("Initial set of cookies:");
            		List<Cookie> cookies = cookieStore.getCookies();
            		if (cookies.isEmpty()) {
            			System.out.println("None");
            		} else {
            			for (int i = 0; i < cookies.size(); i++) {
            				System.out.println("- " + cookies.get(i).toString());
            			}
            		}
            	} finally {
            		response1.close();
            	}
            }
		} finally {
            httpclient.close();
        }
	}

}
