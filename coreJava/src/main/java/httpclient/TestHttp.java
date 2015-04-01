package httpclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class TestHttp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String TEST = "{\"state\":1,\"result\":{\"orderId\":1381469237310,\"userId\":13613613666,\"nickName\":\"刘亚辉\",\"sex\":0,\"commonAddressId\":0,\"commonAddressLongitude\":0.0,\"commonAddressLatitude\":0.0,\"getOnTime\":\"Sep 28, 2013 5:00:00 PM\",\"lastReplTime\":\"Sep 28, 2013 6:00:00 PM\",\"contractTaxi\":0,\"vipMark\":\"1\",\"takeTaxiType\":1,\"serverLevel\":1,\"firstChoiceCompany\":\"大众\",\"personCount\":3,\"getOnLon\":116.257555,\"getOnLat\":39.974400,\"getOffLon\":3333333.0,\"getOffLat\":4444444.0,\"getOnPlaceName\":\"上车地点\",\"getOffPlaceName\":\"下车地点\",\"notes\":\"还想说点啥\",\"motorcycleType\":\"现代\",\"anotherCellPhoneNo\":0,\"taxiId\":\"6408:8613436342645\",\"taxiColor\":\"绿色\",\"taxiPlateNumber\":\"京B12345\",\"taxiCompany\":\"北汽公司\",\"taxiDriverName\":\"李师傅\",\"taxiDriverCellPhoneNo\":\"13810195316\",\"acceptLon\":0,\"acceptLat\":0,\"currentTime\":\"2013-10-11 13:27:17\",\"finishMark\":\"-1\",\"cancelMark\":\"-1\",\"cityResponse2CenterTime\":\"2013-10-11 13:27:22\",\"center2CityState\":\"1\",\"city2SchedulingState\":\"-1\",\"succeedMark\":\"1\",\"subscribeMark\":\"1\"}}";
//		String uri="http://192.168.5.6:8080/apn/notification.do?action=send&broadcast=n&title=xxxx";
		String uri="http://192.168.5.6:9090/plugins/push/pushservlet";
//		String uri="http://192.168.0.127:8080/testpush/push";
		 BasicCookieStore cookieStore = new BasicCookieStore();
	     CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
		HttpPost post=new HttpPost(uri);
		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
		nvps.add(new BasicNameValuePair("username", "15611352304"));
		nvps.add(new BasicNameValuePair("message", TEST));
		nvps.add(new BasicNameValuePair("type", "order"));
		post.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
		try {
			CloseableHttpResponse response=httpclient.execute(post);
			HttpEntity entity = response.getEntity();

            System.out.println("Login form get: " + response.getStatusLine());
            EntityUtils.consume(entity);

            System.out.println("Post logon cookies:");
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
		

	}

}
