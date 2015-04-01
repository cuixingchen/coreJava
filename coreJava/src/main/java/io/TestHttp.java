package io;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestHttp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url_address="http://user.tover.net/reg.php?cont=store_user";
		URL url;
		try {
			url = new URL(url_address);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			//
			connection.setDoOutput(true);
//			connection.set
		} catch (Exception e) {
			e.printStackTrace();
		}  

	}

}
