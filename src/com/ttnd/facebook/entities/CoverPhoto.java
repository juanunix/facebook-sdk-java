package com.ttnd.facebook.entities;

// TODO: Auto-generated Javadoc
/**
 * This class represents Cover Photo Object in Facebook SDK;
 * https://developers.facebook.com/docs/graph-api/reference/cover-photo/
 * @author Rishabh Jain
 */
public class CoverPhoto {
	
	/**  The ID of the cover photo. */
	private String id;
	
	/** Deprecated. Please use the id field instead */
	@Deprecated
	private String cover_id;
	
	/** When non-zero, the cover image overflows horizontally. The value indicates the offset percentage of the total image width from the left [0-100] */
	private Float offset_x;
	
	/** When non-zero, the cover photo overflows vertically. The value indicates the offset percentage of the total image height from the top [0-100] */
	private Float offset_y;
	
	/**  Direct URL for the person's cover photo image. */
	private String source;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the cover_id;
	 * Deprecated. Please use the id field instead
	 * @return the cover_id
	 */
	@Deprecated
	public String getCover_id() {
		return cover_id;
	}

	/**
	 * Sets the cover_id;
	 * Deprecated. Please use the id field instead
	 * @param cover_id the new cover_id
	 */
	@Deprecated
	public void setCover_id(String cover_id) {
		this.cover_id = cover_id;
	}

	/**
	 * Gets the offset_x.
	 *
	 * @return the offset_x
	 */
	public Float getOffset_x() {
		return offset_x;
	}

	/**
	 * Sets the offset_x.
	 *
	 * @param offset_x the new offset_x
	 */
	public void setOffset_x(Float offset_x) {
		this.offset_x = offset_x;
	}

	/**
	 * Gets the offset_y.
	 *
	 * @return the offset_y
	 */
	public Float getOffset_y() {
		return offset_y;
	}

	/**
	 * Sets the offset_y.
	 *
	 * @param offset_y the new offset_y
	 */
	public void setOffset_y(Float offset_y) {
		this.offset_y = offset_y;
	}

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets the source.
	 *
	 * @param source the new source
	 */
	public void setSource(String source) {
		this.source = source;
	}
}
