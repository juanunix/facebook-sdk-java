package com.ttnd.facebook.entities;

import com.ttnd.facebook.enums.VideoStatusEnum;

// TODO: Auto-generated Javadoc
/**
 * This class represents Video Status Object in Facebook SDK;
 * https://developers.facebook.com/docs/graph-api/reference/video-status/
 * @author Rishabh Jain
 */
public class VideoStatus {
	
	/** The video_status. */
	private VideoStatusEnum video_status;
	
	/** The processing_progress. */
	private Integer processing_progress;

	/**
	 * Gets the video_status.
	 *
	 * @return the video_status
	 */
	public VideoStatusEnum getVideo_status() {
		return video_status;
	}

	/**
	 * Sets the video_status.
	 *
	 * @param video_status the new video_status
	 */
	public void setVideo_status(VideoStatusEnum video_status) {
		this.video_status = video_status;
	}

	/**
	 * Gets the processing_progress.
	 *
	 * @return the processing_progress
	 */
	public Integer getProcessing_progress() {
		return processing_progress;
	}

	/**
	 * Sets the processing_progress.
	 *
	 * @param processing_progress the new processing_progress
	 */
	public void setProcessing_progress(Integer processing_progress) {
		this.processing_progress = processing_progress;
	}
}
