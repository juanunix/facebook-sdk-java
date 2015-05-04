package com.ttnd.facebook.entities;

import java.util.List;

import org.joda.time.DateTime;

// TODO: Auto-generated Javadoc
/**
 * This class represents Video Object in Facebook SDK;
 * https://developers.facebook.com/docs/graph-api/reference/video/
 * @author Rishabh Jain
 */
public class Video {
	
	/** The video ID. */
	private String id;
	
	/** The time the video was initially published. */
	private DateTime created_time;
	
	/** The description of the video. */
	private String description;
	
	/** The HTML element that may be embedded in a Web page to play the video. */
	private String embed_html;
	
	/** The different formats of the video. */
	private List<VideoFormat> format;
	
	/** The profile that created the video. */
	private MinifiedProfile from;
	
	/** The icon that Facebook displays when videos are published to the feed. */
	private String icon;
	
	/** Duration of this video. */
	private Float length;
	
	/** The video title or caption. */
	private String name;
	
	/** Object describing the status attributes of a video. */
	private VideoStatus status;
	
	/** A URL to the raw, playable video file. */
	private String source;
	
	/** The last time the video or its caption was updated. */
	private DateTime updated_time;
	
	/** Whether a post about this video is published. */
	private Boolean published;
	
	/** The URL for the thumbnail picture of the video. */
	private String picture;
	
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
	 * Gets the created_time.
	 *
	 * @return the created_time
	 */
	public DateTime getCreated_time() {
		return created_time;
	}
	
	/**
	 * Sets the created_time.
	 *
	 * @param created_time the new created_time
	 */
	public void setCreated_time(DateTime created_time) {
		this.created_time = created_time;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the embed_html.
	 *
	 * @return the embed_html
	 */
	public String getEmbed_html() {
		return embed_html;
	}
	
	/**
	 * Sets the embed_html.
	 *
	 * @param embed_html the new embed_html
	 */
	public void setEmbed_html(String embed_html) {
		this.embed_html = embed_html;
	}
	
	/**
	 * Gets the format.
	 *
	 * @return the format
	 */
	public List<VideoFormat> getFormat() {
		return format;
	}
	
	/**
	 * Sets the format.
	 *
	 * @param format the new format
	 */
	public void setFormat(List<VideoFormat> format) {
		this.format = format;
	}
	
	/**
	 * Gets the from.
	 *
	 * @return the from
	 */
	public MinifiedProfile getFrom() {
		return from;
	}
	
	/**
	 * Sets the from.
	 *
	 * @param from the new from
	 */
	public void setFrom(MinifiedProfile from) {
		this.from = from;
	}
	
	/**
	 * Gets the icon.
	 *
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	
	/**
	 * Sets the icon.
	 *
	 * @param icon the new icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	public Float getLength() {
		return length;
	}
	
	/**
	 * Sets the length.
	 *
	 * @param length the new length
	 */
	public void setLength(Float length) {
		this.length = length;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public VideoStatus getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(VideoStatus status) {
		this.status = status;
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
	
	/**
	 * Gets the updated_time.
	 *
	 * @return the updated_time
	 */
	public DateTime getUpdated_time() {
		return updated_time;
	}
	
	/**
	 * Sets the updated_time.
	 *
	 * @param updated_time the new updated_time
	 */
	public void setUpdated_time(DateTime updated_time) {
		this.updated_time = updated_time;
	}
	
	/**
	 * Gets the published.
	 *
	 * @return the published
	 */
	public Boolean getPublished() {
		return published;
	}
	
	/**
	 * Sets the published.
	 *
	 * @param published the new published
	 */
	public void setPublished(Boolean published) {
		this.published = published;
	}

	/**
	 * Gets the picture.
	 *
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * Sets the picture.
	 *
	 * @param picture the new picture
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
