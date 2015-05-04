package com.ttnd.facebook.entities;

/**
 * This class represents the minified profile;
 * Contains only id and name of user on Facebook.
 *
 * @author Rishabh Jain
 */
public class MinifiedProfile {
	
	/** Facebook User id. */
	private String id;
	
	/** Facebook User name. */
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
