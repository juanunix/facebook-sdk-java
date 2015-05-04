package com.ttnd.facebook.tests;
import com.ttnd.facebook.entities.Video;
import com.ttnd.facebook.readers.VideoReader;

public class FacebookVideoReaderTest {

	private static final String ACCESS_TOKEN = "CAAKgJH4rXWIBAMNppFWjiVY1H2ZAWTTxPZAJ0LDt40s59e1cBWRyJ0fmz9Br0ta9L16W85oPr9d4I3PRFZBYXglgaCtO61uEXbdL9vlHy4C3UhzFsAOuCT5BmUb1DAXXxGPFeii9YUazZCRZBpABEHd2Ht2BSZA2gqXJjZA5BalsoCjWf5AFQCM";  
	private static final String VIDEO_ID = "1390997594560311";
	
	
	public static void main(String[] args) {
		VideoReader mVideoReader = new VideoReader(ACCESS_TOKEN);
		
		Video mVideo = mVideoReader.getVideoDetails(VIDEO_ID);

		
		System.out.println(mVideo.getId());
		System.out.println(mVideo.getDescription());
		System.out.println(mVideo.getCreated_time());
		System.out.println(mVideo.getStatus());
		System.out.println(mVideo.getFrom().getId());
		System.out.println(mVideo.getFrom().getName());
	}

}
