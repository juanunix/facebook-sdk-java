package com.ttnd.facebook.entities;

// TODO: Auto-generated Javadoc
/**
 * This class represents Page Category Object in Facebook SDK;
 * https://developers.facebook.com/docs/graph-api/reference/page-category/
 * @author Rishabh Jain
 */
public class PageCategory {
	
	/**  The id of the category. */
	private String id;
	
	/**  The name of the category. */
	private String name;

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
}
