package com.ttnd.facebook.tests;

import java.util.List;

import com.ttnd.facebook.entities.Page;
import com.ttnd.facebook.readers.UserProfileReader;

public class UserProfileReaderTest {
	
	private static final String USER_ID = "1389979514662119";
	private static final String ACCESS_TOKEN = "CAAKgJH4rXWIBAKDstL9KcfFZBNXcoTj8QBYDq5yM9mCRPIK5gZBvb1cfZAWMsB89xkwHJ9x09iawTahU5IiahxA09uqxhA99VREO5KPBeTEZCaPi2zsfYP0ZCmwrBZB9izG5nE9BfOqY79IcTJ1littNI2AkCabO3OMRL9fJIOJCLUou1dZCBLfGL0oYXcSgyYZD";
	
	public static void main (String args[]) {
		UserProfileReader mUserProfileReader = UserProfileReader.getInstance(USER_ID, ACCESS_TOKEN);
		
		List<Page> mUserPages = mUserProfileReader.getUserPages();
		
		for (Page mUserPage : mUserPages) {
			System.out.println(mUserPage.getId());
			System.out.println(mUserPage.getAccess_token());
			System.out.println(mUserPage.getCategory());
			System.out.println(mUserPage.getName());
			System.out.println(mUserPage.getPerms());
		}
	
	}
}
