package com.ttnd.facebook.tests;

import com.ttnd.facebook.utils.FileSplitter;

public class FileSplitterTest {

	private static final String FILE_PATH = System.getProperty("user.home") + "/Desktop/test/1mb.mp4";
	private static final Integer CHUNK_SIZE = 1048576;
	
	public static void main(String[] args) {
		System.out.println(FileSplitter.splitFile(FILE_PATH, CHUNK_SIZE));
	}

}
