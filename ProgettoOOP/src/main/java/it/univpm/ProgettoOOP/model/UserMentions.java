package it.univpm.ProgettoOOP.model;

public class UserMentions implements ToString{
	
	private String ScreenName;
	private String name;
	private int id;
	
	/**
	 * @param screenName
	 * @param name
	 * @param id
	 * the constructor
	 */
	
	public UserMentions(String screenName, String name, int id) {
		super();
		ScreenName = screenName;
		this.name = name;
		this.id = id;
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
	
	@Override
	public String toString() {
		return "\nUserMentions[\n ScreenName=" + ScreenName + "\n name=" + name + "\n id=" + id + "\n ]";
	}
	
	
	
}
