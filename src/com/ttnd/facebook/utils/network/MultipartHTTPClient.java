package com.ttnd.facebook.utils.network;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
 
/**
 * This utility class provides an abstraction layer for sending multipart HTTP
 * POST requests to facebook.
 * @author Rishabh Jain
 *
 */
public class MultipartHTTPClient {
	
	
	/**
	 * Gets the non-resumable video upload response.
	 *
	 * @param requestURL the request url
	 * @param mAccessToken the access token
	 * @param mVideoTitle the video title
	 * @param mVideoDescription the video description
	 * @param mPublicURL the public url of the video
	 * @param isPublished is to be published or not
	 * @return the video upload response
	 */
	public String getVideoUploadResponse(String requestURL, String mAccessToken, String mVideoTitle, String mVideoDescription, String mPublicURL, Boolean isPublished) {
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(requestURL);


		StringBody access_token;
		StringBody title;
		StringBody description;
		StringBody file_url;
		StringBody published;
		
		try {
			access_token = new StringBody(mAccessToken);
			title = new StringBody(mVideoTitle);
			description = new StringBody(mVideoDescription);
			file_url = new StringBody(mPublicURL);
			
			if (isPublished == true) {
				published = new StringBody("1");
			} else {
				published = new StringBody("0");
			}
			
			
			
			MultipartEntity reqEntity = new MultipartEntity();
			reqEntity.addPart("access_token", access_token);
			reqEntity.addPart("title", title);
			reqEntity.addPart("description", description);
			reqEntity.addPart("file_url", file_url);
			reqEntity.addPart("published", published);
			
			httpPost.setEntity(reqEntity);

			System.out.println("--------Uploading On Facebook-----------");
			
			HttpResponse response = httpclient.execute(httpPost);
			HttpParams params = response.getParams();
			System.out.println(response.getStatusLine());
			System.out.println("--------Uploading Completed-----------");
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);
			return responseString;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		}
	}
    
    /**
     * Gets the start resumable upload response.
     *
     * @param requestURL request url for facebook e.g. https://graph-video.facebook.com/v2.3/?????
     * @param mAccessToken the access token
     * @param mFileSize the file size
     * @return start upload response
     */
    public String getStartResumableUploadResponse(String requestURL, String mAccessToken, Long mFileSize) {
    	HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(requestURL);


		StringBody access_token;
		StringBody upload_phase;
		StringBody file_size;
		try {
			access_token = new StringBody(mAccessToken);
			upload_phase = new StringBody("start");
			file_size = new StringBody(mFileSize.toString());
			System.out.println("File Size :" + file_size.toString());
			MultipartEntity reqEntity = new MultipartEntity();
			reqEntity.addPart("access_token", access_token);
			reqEntity.addPart("upload_phase", upload_phase);
			reqEntity.addPart("file_size", file_size);
			httpPost.setEntity(reqEntity);

			HttpResponse response = httpclient.execute(httpPost);
			HttpParams params = response.getParams();
			System.out.println(response.getStatusLine());
			
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);
			return responseString;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		}
    }
    
    /**
     * Gets the resumable upload response.
     *
     * @param requestURL the request url
     * @param mAccessToken the  access token
     * @param mStartOffset the start offset
     * @param mUploadSessionId the upload session id
     * @param mFile the file
     * @return the upload response
     */
    public String getResumableUploadResponse(String requestURL, String mAccessToken, Long mStartOffset, String mUploadSessionId, String mFile) {
    	System.out.println("--------Uploading on Facebook-----------");
    	HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(requestURL);


		StringBody access_token;
		StringBody upload_phase;
		StringBody upload_session_id;
		StringBody start_offset;
		FileBody video_file_chunk;
		try {
			access_token = new StringBody(mAccessToken);
			upload_phase = new StringBody("transfer");
			upload_session_id = new StringBody(mUploadSessionId);
			start_offset = new StringBody(mStartOffset.toString());
			video_file_chunk = new FileBody(new File(mFile));
			
			MultipartEntity reqEntity = new MultipartEntity();
			reqEntity.addPart("access_token", access_token);
			reqEntity.addPart("upload_phase", upload_phase);
			reqEntity.addPart("upload_session_id", upload_session_id);
			reqEntity.addPart("start_offset", start_offset);
			reqEntity.addPart("video_file_chunk", video_file_chunk);
			
			httpPost.setEntity(reqEntity);

			HttpResponse response = httpclient.execute(httpPost);
			HttpParams params = response.getParams();
			System.out.println(response.getStatusLine());
			
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);
			return responseString;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		}
    }
    
    /**
     * Gets the finish resumable upload response.
     *
     * @param requestURL the request url
     * @param mAccessToken the access token
     * @param mUploadSessionId the upload session id
     * @return the finish upload response
     */
    public String getFinishResumableUploadResponse(String requestURL, String mAccessToken, String mUploadSessionId) {
    	HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(requestURL);


		StringBody access_token;
		StringBody upload_phase;
		StringBody upload_session_id;
		try {
			access_token = new StringBody(mAccessToken);
			upload_phase = new StringBody("finish");
			upload_session_id = new StringBody(mUploadSessionId);
			
			MultipartEntity reqEntity = new MultipartEntity();
			reqEntity.addPart("access_token", access_token);
			reqEntity.addPart("upload_phase", upload_phase);
			reqEntity.addPart("upload_session_id", upload_session_id);
			httpPost.setEntity(reqEntity);

			HttpResponse response = httpclient.execute(httpPost);
			HttpParams params = response.getParams();
			System.out.println(response.getStatusLine());
			
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);
			return responseString;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "Error ->" + e.getMessage();
		}
    }
}