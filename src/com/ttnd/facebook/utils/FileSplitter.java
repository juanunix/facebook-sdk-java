/*
 * 
 * 
 */

package com.ttnd.facebook.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * Splits the file into smaller chunks for resumable video uploads
 *
 * @author Rishabh Jain
 */
public class FileSplitter {
	
	/**
	 * Splits the file based on chunk size.
	 *
	 * @param mFilePath            the file path
	 * @param mChunkSize            chunk size in bytes
	 * @return List of Files created
	 * 			  List of file names - if file is split successfully;
	 * 			  null - if fails
	 */
	public static List<String> splitFile(String mFilePath, long mChunkSize) {
		BufferedInputStream in;
		List<String> mFilePathList = new ArrayList<String>();
		try {
			in = new BufferedInputStream(new FileInputStream(mFilePath));

			// get the file length
			File f = new File(mFilePath);
			long fileSize = f.length();

			// loop for each full chunk
			int subfile;
			for (subfile = 0; subfile < fileSize / mChunkSize; subfile++) {
				// open the output file
				String mSubFilePath = mFilePath + "." + subfile;
				BufferedOutputStream out = new BufferedOutputStream(
						new FileOutputStream(mSubFilePath));
				int byteCount = 0;
				// write the right amount of bytes
				for (int currentByte = 0; currentByte < mChunkSize; currentByte++) {
					// load one byte from the input file and write it to the
					// output
					// file
					out.write(in.read());
					
				}

				System.out.println("*****New File*******");
				System.out.println(mSubFilePath);
				System.out.println(byteCount);
				
				mFilePathList.add(mSubFilePath);
				// close the file
				out.close();
			}

			// loop for the last chunk (which may be smaller than the chunk
			// size)
			if (fileSize != mChunkSize * (subfile - 1)) {
				// open the output file
				String mSubFilePath = mFilePath + "." + subfile;
				BufferedOutputStream out = new BufferedOutputStream(
						new FileOutputStream(mSubFilePath));

				// write the rest of the file
				int b;
				while ((b = in.read()) != -1)
					out.write(b);

				
				System.out.println("*****New File*******");
				System.out.println(mSubFilePath);
				
				mFilePathList.add(mSubFilePath);
				// close the file
				out.close();
			}

			// close the file
			in.close();
			return mFilePathList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null; 
		} catch (IOException e) {
			e.printStackTrace();
			return null ;
		}

	}
}