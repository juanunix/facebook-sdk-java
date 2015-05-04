package com.ttnd.facebook.entities;

import java.util.List;

import com.ttnd.facebook.enums.PermissionEnum;

// TODO: Auto-generated Javadoc
/**
 * This class represents Page Object in Facebook SDK;
 * https://developers.facebook.com/docs/graph-api/reference/page/
 * @author Rishabh Jain
 */
public class Page {
	
	/** Page ID. No access token is required to access this field */
	private String id;
	
	/**  Information about the Page. */
	private String about;
	
	/** The access token you can use to act as the Page. Only visible to Page Admins */
	private String access_token;
	
	/** Affiliation of this person. Applicable to Pages representing people */
	private String affiliation;
	
	/**  App ID for app-owned Pages and app Pages. */
	private String app_id;
	
	/** Artists the band likes. Applicable to Bands */
	private String artists_we_like;
	
	/** Dress code of the business. Applicable to Restaurants or Nightlife. Can be one of Casual, Dressy or Unspecified */
	private String attire;
	
	/** The awards information of the film. Applicable to Films */
	private String awards;
	
	/** Band interests. Applicable to Bands. */
	private String band_interests;
	
	/** Members of the band. Applicable to Bands */
	private String band_members;
	
	/** The best available Page on Facebook for the concept represented by this Page. The best available Page takes into account authenticity and the number of likes */
	private Page best_page;
	
	/** Biography of the band. Applicable to Bands */
	private String bio;
	
	/** Birthday of this person. Applicable to Pages representing people */
	private String birthday;
	
	/** Booking agent of the band. Applicable to Bands */
	private String booking_agent;
	
	/** Year vehicle was built. Applicable to Vehicles */
	private String built;
	
	/**  Whether the current session user can post on this Page. */
	private Boolean can_post;
	
	/** The Page's category. e.g. Product/Service, Computers/Technology */
	private String category;
	
	/**  The Page's sub-categories. */
	private List<PageCategory> category_list;
	
	/** The company overview. Applicable to Companies */
	private String company_overview;
	
	/** The mailing or contact address for this page. This field will be blank if the contact address is the same as the physical address */
	private MailingAddress contact_address;
	
	/** If this is a Page in a Global Pages hierarchy, the number of people who are being directed to this Page. */
	private Integer country_page_likes;
	
	/**  Information about the page's cover photo. */
	private CoverPhoto cover;
	
	/** Culinary team of the business. Applicable to Restaurants or Nightlife */
	private String link;
	
	/**  The name of the Page. */
	private String name;
	
	/**  Permissions of a person on a Page. */
	private List<PermissionEnum> perms;

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
	 * Gets the about.
	 *
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * Sets the about.
	 *
	 * @param about the new about
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * Gets the access_token.
	 *
	 * @return the access_token
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * Sets the access_token.
	 *
	 * @param access_token the new access_token
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	/**
	 * Gets the affiliation.
	 *
	 * @return the affiliation
	 */
	public String getAffiliation() {
		return affiliation;
	}

	/**
	 * Sets the affiliation.
	 *
	 * @param affiliation the new affiliation
	 */
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	/**
	 * Gets the app_id.
	 *
	 * @return the app_id
	 */
	public String getApp_id() {
		return app_id;
	}

	/**
	 * Sets the app_id.
	 *
	 * @param app_id the new app_id
	 */
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	/**
	 * Gets the artists_we_like.
	 *
	 * @return the artists_we_like
	 */
	public String getArtists_we_like() {
		return artists_we_like;
	}

	/**
	 * Sets the artists_we_like.
	 *
	 * @param artists_we_like the new artists_we_like
	 */
	public void setArtists_we_like(String artists_we_like) {
		this.artists_we_like = artists_we_like;
	}

	/**
	 * Gets the attire.
	 *
	 * @return the attire
	 */
	public String getAttire() {
		return attire;
	}

	/**
	 * Sets the attire.
	 *
	 * @param attire the new attire
	 */
	public void setAttire(String attire) {
		this.attire = attire;
	}

	/**
	 * Gets the awards.
	 *
	 * @return the awards
	 */
	public String getAwards() {
		return awards;
	}

	/**
	 * Sets the awards.
	 *
	 * @param awards the new awards
	 */
	public void setAwards(String awards) {
		this.awards = awards;
	}

	/**
	 * Gets the band_interests.
	 *
	 * @return the band_interests
	 */
	public String getBand_interests() {
		return band_interests;
	}

	/**
	 * Sets the band_interests.
	 *
	 * @param band_interests the new band_interests
	 */
	public void setBand_interests(String band_interests) {
		this.band_interests = band_interests;
	}

	/**
	 * Gets the band_members.
	 *
	 * @return the band_members
	 */
	public String getBand_members() {
		return band_members;
	}

	/**
	 * Sets the band_members.
	 *
	 * @param band_members the new band_members
	 */
	public void setBand_members(String band_members) {
		this.band_members = band_members;
	}

	/**
	 * Gets the best_page.
	 *
	 * @return the best_page
	 */
	public Page getBest_page() {
		return best_page;
	}

	/**
	 * Sets the best_page.
	 *
	 * @param best_page the new best_page
	 */
	public void setBest_page(Page best_page) {
		this.best_page = best_page;
	}

	/**
	 * Gets the bio.
	 *
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * Sets the bio.
	 *
	 * @param bio the new bio
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * Gets the birthday.
	 *
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * Sets the birthday.
	 *
	 * @param birthday the new birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * Gets the booking_agent.
	 *
	 * @return the booking_agent
	 */
	public String getBooking_agent() {
		return booking_agent;
	}

	/**
	 * Sets the booking_agent.
	 *
	 * @param booking_agent the new booking_agent
	 */
	public void setBooking_agent(String booking_agent) {
		this.booking_agent = booking_agent;
	}

	/**
	 * Gets the built.
	 *
	 * @return the built
	 */
	public String getBuilt() {
		return built;
	}

	/**
	 * Sets the built.
	 *
	 * @param built the new built
	 */
	public void setBuilt(String built) {
		this.built = built;
	}

	/**
	 * Gets the can_post.
	 *
	 * @return the can_post
	 */
	public Boolean getCan_post() {
		return can_post;
	}

	/**
	 * Sets the can_post.
	 *
	 * @param can_post the new can_post
	 */
	public void setCan_post(Boolean can_post) {
		this.can_post = can_post;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the category.
	 *
	 * @param category the new category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Gets the category_list.
	 *
	 * @return the category_list
	 */
	public List<PageCategory> getCategory_list() {
		return category_list;
	}

	/**
	 * Sets the category_list.
	 *
	 * @param category_list the new category_list
	 */
	public void setCategory_list(List<PageCategory> category_list) {
		this.category_list = category_list;
	}

	/**
	 * Gets the company_overview.
	 *
	 * @return the company_overview
	 */
	public String getCompany_overview() {
		return company_overview;
	}

	/**
	 * Sets the company_overview.
	 *
	 * @param company_overview the new company_overview
	 */
	public void setCompany_overview(String company_overview) {
		this.company_overview = company_overview;
	}

	/**
	 * Gets the contact_address.
	 *
	 * @return the contact_address
	 */
	public MailingAddress getContact_address() {
		return contact_address;
	}

	/**
	 * Sets the contact_address.
	 *
	 * @param contact_address the new contact_address
	 */
	public void setContact_address(MailingAddress contact_address) {
		this.contact_address = contact_address;
	}

	/**
	 * Gets the country_page_likes.
	 *
	 * @return the country_page_likes
	 */
	public Integer getCountry_page_likes() {
		return country_page_likes;
	}

	/**
	 * Sets the country_page_likes.
	 *
	 * @param country_page_likes the new country_page_likes
	 */
	public void setCountry_page_likes(Integer country_page_likes) {
		this.country_page_likes = country_page_likes;
	}

	/**
	 * Gets the cover.
	 *
	 * @return the cover
	 */
	public CoverPhoto getCover() {
		return cover;
	}

	/**
	 * Sets the cover.
	 *
	 * @param cover the new cover
	 */
	public void setCover(CoverPhoto cover) {
		this.cover = cover;
	}

	/**
	 * Gets the link.
	 *
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * Sets the link.
	 *
	 * @param link the new link
	 */
	public void setLink(String link) {
		this.link = link;
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
	 * Gets the perms.
	 *
	 * @return the perms
	 */
	public List<PermissionEnum> getPerms() {
		return perms;
	}

	/**
	 * Sets the perms.
	 *
	 * @param perms the new perms
	 */
	public void setPerms(List<PermissionEnum> perms) {
		this.perms = perms;
	}
	
	
}
