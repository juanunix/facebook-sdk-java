package com.ttnd.facebook.entities;

// TODO: Auto-generated Javadoc
/**
 * This class represents Video Format Object in Facebook SDK;
 * https://developers.facebook.com/docs/graph-api/reference/video-format/
 * 
 * @author Rishabh Jain
 */
public class VideoFormat {

	/** HTML to embed the video in this format. */
	private String mEmbedHTML;

	/** The filter applied to this video format. */
	private String mFilter;

	/** The height of the video in this format. */
	private Integer mHeight;

	/** The thumbnail for the video in this format. */
	private String mPicture;

	/** The width of the video in this format. */
	private Integer mWidth;

	/**
	 * Gets the m embed html.
	 *
	 * @return the m embed html
	 */
	public String getmEmbedHTML() {
		return mEmbedHTML;
	}

	/**
	 * Sets the m embed html.
	 *
	 * @param mEmbedHTML
	 *            the new m embed html
	 */
	public void setmEmbedHTML(String mEmbedHTML) {
		this.mEmbedHTML = mEmbedHTML;
	}

	/**
	 * Gets the m filter.
	 *
	 * @return the m filter
	 */
	public String getmFilter() {
		return mFilter;
	}

	/**
	 * Sets the m filter.
	 *
	 * @param mFilter
	 *            the new m filter
	 */
	public void setmFilter(String mFilter) {
		this.mFilter = mFilter;
	}

	/**
	 * Gets the m height.
	 *
	 * @return the m height
	 */
	public Integer getmHeight() {
		return mHeight;
	}

	/**
	 * Sets the m height.
	 *
	 * @param mHeight
	 *            the new m height
	 */
	public void setmHeight(Integer mHeight) {
		this.mHeight = mHeight;
	}

	/**
	 * Gets the m picture.
	 *
	 * @return the m picture
	 */
	public String getmPicture() {
		return mPicture;
	}

	/**
	 * Sets the m picture.
	 *
	 * @param mPicture
	 *            the new m picture
	 */
	public void setmPicture(String mPicture) {
		this.mPicture = mPicture;
	}

	/**
	 * Gets the m width.
	 *
	 * @return the m width
	 */
	public Integer getmWidth() {
		return mWidth;
	}

	/**
	 * Sets the m width.
	 *
	 * @param mWidth
	 *            the new m width
	 */
	public void setmWidth(Integer mWidth) {
		this.mWidth = mWidth;
	}
}
