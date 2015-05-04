package com.ttnd.facebook.readers;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONObject;

import com.ttnd.facebook.entities.MinifiedProfile;
import com.ttnd.facebook.entities.Page;
import com.ttnd.facebook.entities.Video;
import com.ttnd.facebook.entities.VideoFormat;
import com.ttnd.facebook.enums.PermissionEnum;
import com.ttnd.facebook.utils.network.SimpleHTTPClient;

/**
 * This class reads the facebook user profile and processes its information
 * 
 * @author Rishabh Jain
 */
public class UserProfileReader {

	private static UserProfileReader _me;

	private String mUserID;
	private String mAccessToken;

	private UserProfileReader(String mUserID, String mAccessToken) {
		this.mUserID = mUserID;
		this.mAccessToken = mAccessToken;
	}

	public static UserProfileReader getInstance(String mUserID, String mAccessToken) {
		if (_me == null) {
			_me = new UserProfileReader(mUserID, mAccessToken);
		}
		return _me;
	}

	public List<Page> getUserPages() {
		SimpleHTTPClient mHTTPClient = new SimpleHTTPClient();

		String response = mHTTPClient.getUserAccountDetails(mUserID, mAccessToken);
		
		if (!response.contains("Error")) {
			JSONObject mJSonObject = new JSONObject(response);		// JSON parser
			
		
			List<Page> mUserPagesList = new ArrayList<Page>();
			
			JSONArray mDataArray = mJSonObject.getJSONArray("data");
			
			for (int loop = 0; loop < mDataArray.length(); loop++) {
				JSONObject mDataObject = mDataArray.getJSONObject(loop);
				
				Page mUserPage = new Page();
//				mUserPage.setAccess_token((mDataObject.getString("access_token").equals(null))? mDataObject.getString("access_token") : null );
				mUserPage.setAccess_token((mDataObject.has("access_token")) ? mDataObject.getString("access_token") : null);
				mUserPage.setName(mDataObject.getString("name"));
				mUserPage.setCategory(mDataObject.getString("category"));
				mUserPage.setId(mDataObject.getString("id"));
				
				List<PermissionEnum> mPermissionsList = new ArrayList<PermissionEnum>();
				
				JSONArray mPermissionsArray = mDataObject.getJSONArray("perms");
				
				for (int loopx = 0; loopx < mPermissionsArray.length(); loopx++) {
					PermissionEnum perm = PermissionEnum.valueOf(mPermissionsArray.getString(loopx));
					mPermissionsList.add(perm);
				}
				
				mUserPage.setPerms(mPermissionsList);
				mUserPagesList.add(mUserPage);
			}
				
			return mUserPagesList;
		} else {
			return null;
		}
		
	}
}
