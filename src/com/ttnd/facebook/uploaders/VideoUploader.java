package com.ttnd.facebook.uploaders;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.ttnd.facebook.utils.FileSplitter;
import com.ttnd.facebook.utils.network.MultipartHTTPClient;

// TODO: Auto-generated Javadoc
/**
 * Uploads videos on Facebook with access token, page_id; For more info refer
 * Facebook Graph API at
 * https://developers.facebook.com/docs/graph-api/reference/page/videos/
 * 
 */
public class VideoUploader {

	String mPageId;
	String mAccessToken;
	String requestURL;
	String charset;
	Long mFileSize;
	String mFilePath;
	Long mVideoDuration;
	Boolean isResumable;
	String mURL;

	/**
	 * Instantiates a new facebook video uploader.
	 *
	 * @param mPageId
	 *            the page id
	 * @param mAccessToken
	 *            the access token
	 */
	public VideoUploader(String mPageId, String mAccessToken) {
		this.mAccessToken = mAccessToken;
		this.mPageId = mPageId;
		this.charset = "UTF-8";
		this.requestURL = "https://graph-video.facebook.com/v2.3/" + mPageId
				+ "/videos";
	}

	/**
	 * Start non-resumable video upload;
	 * Use this method if video is less than 1GB in size or 20 minutes in duration
	 *
	 * @param mTitle
	 *            the video title
	 * @param mDescription
	 *            the video description
	 * @param mURL
	 *            the public video url
	 * @param isPublished
	 *            is to be published or not
	 * @param mFileSize
	 *            the file size
	 * @param mDurationInMinutes
	 *            the duration in minutes
	 * @return the map of values returned by post request i.e. id of video
	 */
	public Map<String, String> startVideoUpload(String mTitle,
			String mDescription, String mURL, Boolean isPublished,
			Long mFileSize, Long mDurationInMinutes) {
		Map<String, String> mResponseMap = new HashMap<String, String>();
		MultipartHTTPClient mMultipartUtility = new MultipartHTTPClient();

		System.out.println("mTitle:\t" + mTitle);
		System.out.println("mDescription:\t" + mDescription);
		System.out.println("mURL:\t" + mURL);
		System.out.println("isPublished:\t" + isPublished);
		System.out.println("mFileSize:\t" + mFileSize);
		System.out.println("mDurationInMinutes:\t" + mDurationInMinutes);

		if ((mFileSize > 1000000000 && mFileSize < 1750000000)
				|| mDurationInMinutes > 20) { // file size is more than 1GB and
												// less than 1.75 GB or Duration
												// in Minutes is more than 20
												// minutes

			System.out.println();
			mResponseMap
					.put("error",
							"use resumable upload method i.e. startResumableVideoUpload()");
			System.out.println(mResponseMap.get("error"));
			return mResponseMap;
		} else if (mFileSize > 1750000000 || mDurationInMinutes > 45) { // file
																		// size
																		// more
																		// than
																		// 1.75
																		// GB or
																		// Duration
																		// is
																		// more
																		// than
																		// 45
																		// minutes
			mResponseMap
					.put("upload_not_possible",
							"Upload of this size not possible. Keep video size less than 1.75 GB and video duration less than 45 minutes");
			System.out.println(mResponseMap.get("upload_not_possible"));
			return mResponseMap;
		}

		String response = mMultipartUtility.getVideoUploadResponse(requestURL,
				mAccessToken, mTitle, mDescription, mURL, isPublished);
		if (!response.contains("Error")) {
			JSONObject mJSonObject = new JSONObject(response);
			mResponseMap.put("video_id", mJSonObject.getString("id"));
			return mResponseMap;
		} else {
			return null;
		}
	}

	/**
	 * Initiates resumable video upload session.;
	 * If video is more than 1GB in size and less than 1.75GB or duration is more than 20 minutes and less than 45 minutes
	 * @return Map of Values returned by start request i.e. video_id,
	 *         start_offset, end_offset, upload_session_id
	 */
	public Map<String, String> startResumableVideoUpload(String mFilePath,
			Long mDurationInMinutes) {
		Map<String, String> mResponseMap = new HashMap<String, String>();
		MultipartHTTPClient mMultipartUtility = new MultipartHTTPClient();
		File mFile = new File(mFilePath);
		this.mFileSize = mFile.length();

		if (mFileSize < 1000000000 || mDurationInMinutes < 20) { // file size is
																	// less than
																	// 1GB or
																	// Duration
																	// in
																	// Minutes
																	// is less
																	// than 20
																	// minutes
			mResponseMap
					.put("error",
							"use resumable upload method i.e. startResumableVideoUpload()");
			System.out.println(mResponseMap.get("error"));

			return mResponseMap;
		} else if (mFileSize > 1750000000 || mDurationInMinutes > 45) { // file
																		// size
																		// more
																		// than
																		// 1.75
																		// GB or
																		// Duration
																		// is
																		// more
																		// than
																		// 45
																		// minutes
			mResponseMap
					.put("upload_not_possible",
							"Upload of this size not possible. Keep video size less than 1.75 GB and video duration less than 45 minutes");
			System.out.println(mResponseMap.get("upload_not_possible"));
			return mResponseMap;
		} else {
			String response = mMultipartUtility
					.getStartResumableUploadResponse(requestURL, mAccessToken,
							mFileSize);
			if (!response.contains("Error")) {
				JSONObject mJSonObject = new JSONObject(response);
				mResponseMap.put("video_id", mJSonObject.getString("video_id"));
				mResponseMap.put("start_offset",
						mJSonObject.getString("start_offset"));
				mResponseMap.put("end_offset",
						mJSonObject.getString("end_offset"));
				mResponseMap.put("upload_session_id",
						mJSonObject.getString("upload_session_id"));
				return mResponseMap;
			} else {
				return null;
			}
		}
	}

	/**
	 * Uploads video in resumable format by splitting it in parts or smaller
	 * chunks
	 *
	 * @param mResponseMap
	 *            the response map
	 * @return Map of Values returned by start request if successful, otherwise
	 *         null
	 */
	public Map<String, String> uploadVideoInParts(
			Map<String, String> mResponseMap) {
		List<String> mFileList = FileSplitter.splitFile(mFilePath,
				Long.parseLong(mResponseMap.get("end_offset"))); // gets list of
																	// files
																	// created
																	// after
																	// splitting
																	// according
																	// to size
																	// requested
																	// by
																	// facebook
		System.out.println(mFileList);

		for (String mFile : mFileList) {
			MultipartHTTPClient mMultipartUtility = new MultipartHTTPClient();
			String response = mMultipartUtility.getResumableUploadResponse(
					requestURL, mAccessToken,
					Long.parseLong(mResponseMap.get("start_offset")),
					mResponseMap.get("upload_session_id"), mFile); // uploads
																	// file on
																	// facebook

			if (!response.contains("Error")) {
				JSONObject mJSonObject = new JSONObject(response);
				mResponseMap.put("start_offset",
						mJSonObject.getString("start_offset")); // updates
																// response map
				mResponseMap.put("end_offset",
						mJSonObject.getString("end_offset"));

				System.out.println("Upload Successful");
			} else {
				System.out.println("ERROR");
				return null;
			}

		}
		return mResponseMap;
	}

	/**
	 * Finish resumable video upload session and post on page.
	 *
	 * @param mResponseMap
	 *            the m response map
	 * @return Response String
	 */
	public String finishVideoUploadInParts(Map<String, String> mResponseMap) {
		MultipartHTTPClient mMultipartUtility = new MultipartHTTPClient();
		String response = mMultipartUtility
				.getFinishResumableUploadResponse(requestURL, mAccessToken,
						mResponseMap.get("upload_session_id"));
		if (!response.contains("Error")) {
			System.out.println(response);
			return "Success";
		} else {
			System.out.println("ERROR");
			return null;
		}
	}

}
