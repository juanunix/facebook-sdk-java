package com.ttnd.facebook.entities;

// TODO: Auto-generated Javadoc
/**
 * This class represents Mailing Address Object in Facebook SDK;
 * https://developers.facebook.com/docs/graph-api/reference/mailing-address/
 * 
 * @author Rishabh Jain
 */
public class MailingAddress {

	/** The mailing address ID. */
	private String id;

	/** Address city name. */
	private String city;

	/** Page representing the address city. */
	private Page city_page;

	/** Country of the address. */
	private String country;

	/** Street address. */
	private String street1;

	/** Second part of the street address - apt, suite, etc. */
	private String street2;

	/** Region or state of the address. */
	private String region;

	/** Postal code of the address. */
	private String postal_code;

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
	 * @param id
	 *            the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city
	 *            the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the city_page.
	 *
	 * @return the city_page
	 */
	public Page getCity_page() {
		return city_page;
	}

	/**
	 * Sets the city_page.
	 *
	 * @param city_page
	 *            the new city_page
	 */
	public void setCity_page(Page city_page) {
		this.city_page = city_page;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country
	 *            the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the street1.
	 *
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * Sets the street1.
	 *
	 * @param street1
	 *            the new street1
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	/**
	 * Gets the street2.
	 *
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * Sets the street2.
	 *
	 * @param street2
	 *            the new street2
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * Gets the region.
	 *
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * Sets the region.
	 *
	 * @param region
	 *            the new region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * Gets the postal_code.
	 *
	 * @return the postal_code
	 */
	public String getPostal_code() {
		return postal_code;
	}

	/**
	 * Sets the postal_code.
	 *
	 * @param postal_code
	 *            the new postal_code
	 */
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
}
