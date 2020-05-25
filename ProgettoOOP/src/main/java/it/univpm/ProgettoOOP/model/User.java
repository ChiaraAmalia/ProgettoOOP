package it.univpm.ProgettoOOP.model;

public class User {
	
	private int id;
	private String name;
	private String ScreenName;
	private String description;
	private int FollowerCount;
	
	/**
	 * @param id
	 * @param name
	 * @param screenName
	 * @param description
	 * @param followerCount
	 * the constructor
	 */
	public User(int id, String name, String screenName, String description, int followerCount) {
		super();
		this.id = id;
		this.name = name;
		ScreenName = screenName;
		this.description = description;
		FollowerCount = followerCount;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the screenName
	 */
	public String getScreenName() {
		return ScreenName;
	}

	/**
	 * @param screenName the screenName to set
	 */
	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the followerCount
	 */
	public int getFollowerCount() {
		return FollowerCount;
	}

	/**
	 * @param followerCount the followerCount to set
	 */
	public void setFollowerCount(int followerCount) {
		FollowerCount = followerCount;
	}

	@Override
	public String toString() {
		return "User[\n id=" + id + "\n name=" + name + "\n ScreenName=" + ScreenName + "\n description=" + description
				+ "\n FollowerCount=" + FollowerCount + "\n ]";
	}
	
	
	
	
}