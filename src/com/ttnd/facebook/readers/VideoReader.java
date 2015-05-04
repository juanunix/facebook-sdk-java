package com.ttnd.facebook.readers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONObject;

import com.ttnd.facebook.entities.MinifiedProfile;
import com.ttnd.facebook.entities.Video;
import com.ttnd.facebook.entities.VideoFormat;
import com.ttnd.facebook.utils.network.SimpleHTTPClient;

/**
 * This class reads the facebook video and processes its information
 * @author Rishabh Jain
 */
public class VideoReader {
	private String mAccessToken;
	
	
	/**
	 * Instantiates a new facebook video reader.
	 *
	 * @param mAccessToken the access token of page/user which owns the video
	 */
	public VideoReader(String mAccessToken) {
		this.mAccessToken = mAccessToken;
	}
	
	
	/**
	 * Gets the facebook video details.
	 *
	 * @param mVideoID the video id to fetch its details
	 * @return Video Entity Object i.e. com.ttnd.facebook.upload.video.entities.Video
	 */
	public Video getVideoDetails(String mVideoID) {
		SimpleHTTPClient mHTTPClient = new SimpleHTTPClient();
		
		String response = mHTTPClient.getVideoDetails(mVideoID, mAccessToken);
		
		if (!response.contains("Error")) {
			JSONObject mJSonObject = new JSONObject(response);		// JSON parser
			
			DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ");	// format date time
			DateTime created_time = formatter.parseDateTime(mJSonObject.getString("created_time"));
			DateTime updated_time = formatter.parseDateTime(mJSonObject.getString("updated_time"));
			
			Video mVideo = new Video();		// parse data to Video Entity
			mVideo.setId(mJSonObject.getString("id"));
			mVideo.setCreated_time(created_time);
			mVideo.setDescription(mJSonObject.getString("description"));
			mVideo.setEmbed_html(mJSonObject.getString("embed_html"));
			
			JSONArray mFormatArray = mJSonObject.getJSONArray("format");
			
			List<VideoFormat> mVideoFormatList = new ArrayList<VideoFormat>();
			
			for (int loop = 0; loop < mFormatArray.length(); loop++) {
				JSONObject mFormatObject = mFormatArray.getJSONObject(loop);
				
				VideoFormat mVideoFormat = new VideoFormat();
				mVideoFormat.setmEmbedHTML(mFormatObject.getString("embed_html"));
				mVideoFormat.setmFilter(mFormatObject.getString("filter"));
				mVideoFormat.setmHeight(mFormatObject.getInt("height"));
				mVideoFormat.setmPicture(mFormatObject.getString("picture"));
				mVideoFormat.setmWidth(mFormatObject.getInt("width"));
				
				mVideoFormatList.add(mVideoFormat);
			}
			
			
			mVideo.setFormat(mVideoFormatList);
			
			JSONObject mProfileObject = mJSonObject.getJSONObject("from");
			
			MinifiedProfile mProfile = new MinifiedProfile();
			mProfile.setId(mProfileObject.getString("id"));
			mProfile.setName(mProfileObject.getString("name"));
			
			mVideo.setFrom(mProfile);
			mVideo.setIcon(mJSonObject.getString("icon"));
			mVideo.setName(mJSonObject.getString("name"));
			mVideo.setPicture(mJSonObject.getString("picture"));
			mVideo.setSource(mJSonObject.getString("source"));
			mVideo.setUpdated_time(updated_time);
			mVideo.setPublished(mJSonObject.getBoolean("published"));
			
			
			return mVideo;
		} else {
			return null;
		}
	}
}
