package theBeastiary;

public class User {
	private String userid;
	private String displayname;
	private String datejoined;
	private String passwords;
	private String email;
	
	public User(String userid, String displayname, String datejoined, String passwords, String email) {
		this.userid = userid;
		this.displayname = displayname;
		this.datejoined = datejoined;
		this.passwords = passwords;
		this.email = email;
	}
	
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the displayname
	 */
	public String getDisplayname() {
		return displayname;
	}
	/**
	 * @param displayname the displayname to set
	 */
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	/**
	 * @return the datejoined
	 */
	public String getDatejoined() {
		return datejoined;
	}
	/**
	 * @param datejoined the datejoined to set
	 */
	public void setDatejoined(String datejoined) {
		this.datejoined = datejoined;
	}
	/**
	 * @return the passwords
	 */
	public String getPasswords() {
		return passwords;
	}
	/**
	 * @param passwords the passwords to set
	 */
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
