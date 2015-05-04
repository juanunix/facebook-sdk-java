package com.ttnd.facebook.tests;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.ttnd.facebook.uploaders.VideoUploader;

public class FacebookVideoUploaderTest {
	private static final String PAGE_ID = "769856429713589";
	private static final String ACCESS_TOKEN = "CAAKgJH4rXWIBAMNppFWjiVY1H2ZAWTTxPZAJ0LDt40s59e1cBWRyJ0fmz9Br0ta9L16W85oPr9d4I3PRFZBYXglgaCtO61uEXbdL9vlHy4C3UhzFsAOuCT5BmUb1DAXXxGPFeii9YUazZCRZBpABEHd2Ht2BSZA2gqXJjZA5BalsoCjWf5AFQCM";
	private static final String FILE_PATH = System.getProperty("user.home") + "/Desktop/test/1mb.mp4";
	private static final String VIDEO_URL = "https://s3-ap-southeast-1.amazonaws.com/fame-w3-qa/videos/FMV00000001.avi";
	
	
	public static void main(String[] args) {
		//FacebookVideoUploader mUploader = new FacebookVideoUploader(PAGE_ID, ACCESS_TOKEN, FILE_PATH, 30L, null);
		VideoUploader mUploader = new VideoUploader(PAGE_ID, ACCESS_TOKEN);
		
//		mUploader.finishVideoUploadInParts(mUploader.uploadVideoInParts(mUploader.startVideoUpload()));		// starts resumable video upload, uploads video and finally publishes it.
		Map<String, String> mMap = mUploader.startVideoUpload("Title", "Test Title", VIDEO_URL, true, 123456L, 1L);
		
		Set<String> mKeys = mMap.keySet();
		
		if (mKeys.contains("video_id")) {
			System.out.println("Video ID : " + mMap.get("video_id"));
		}
		
	}

}
