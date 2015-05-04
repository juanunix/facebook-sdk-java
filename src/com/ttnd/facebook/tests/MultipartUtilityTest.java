package com.ttnd.facebook.tests;
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.ttnd.facebook.utils.network.MultipartHTTPClient;
 
/**
 * This program demonstrates a usage of the MultipartUtility class.
 * @author Rishabh Jain
 *
 */
public class MultipartUtilityTest {
	private static final String PAGE_ID = "769856429713589";
	private static final String ACCESS_TOKEN = "CAAKgJH4rXWIBAMNppFWjiVY1H2ZAWTTxPZAJ0LDt40s59e1cBWRyJ0fmz9Br0ta9L16W85oPr9d4I3PRFZBYXglgaCtO61uEXbdL9vlHy4C3UhzFsAOuCT5BmUb1DAXXxGPFeii9YUazZCRZBpABEHd2Ht2BSZA2gqXJjZA5BalsoCjWf5AFQCM";
	private static final String FILE_PATH = System.getProperty("user.home") + "/Desktop/test/1mb.mp4";
    public static void main(String[] args) {
    	String requestURL = "https://graph-video.facebook.com/v2.3/" + PAGE_ID + "/videos";
    	File mFile = new File(FILE_PATH);
    	
    	MultipartHTTPClient mMultipartUtility = new MultipartHTTPClient();
    	mMultipartUtility.getStartResumableUploadResponse(requestURL, ACCESS_TOKEN, mFile.length());
    }
}