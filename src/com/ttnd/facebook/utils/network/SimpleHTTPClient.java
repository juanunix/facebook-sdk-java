package com.ttnd.facebook.utils.network;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

// TODO: Auto-generated Javadoc
/**
 * This utility class provides an abstraction layer for sending simple HTTP
 * GET requests to facebook.
 * @author Rishabh Jain
 *
 */
public class SimpleHTTPClient {
	
	/** The base url for facebook graph API */
	private final String BASE_URL = "https://graph-video.facebook.com/v2.3/"; 
	
	/**
	 * Gets the video details.
	 *
	 * @return the video details
	 */
	public String getVideoDetails(String mVideoID, String mAccessToken) {
		String requestURL = BASE_URL + mVideoID + "?access_token=" + mAccessToken;
		System.out.println("Request URL : " + requestURL);
		
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(requestURL);

		try {
			HttpResponse response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);
			return responseString;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error :" + e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error : " + e.getMessage();
		}
	}
	
	public String getUserAccountDetails(String mUserID, String mAccessToken) {
		String requestURL = BASE_URL + mUserID + "/accounts?access_token=" + mAccessToken;
		System.out.println("Request URL : " + requestURL);
		
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(requestURL);

		try {
			HttpResponse response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);
			return responseString;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error :" + e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error : " + e.getMessage();
		}
	}
}
