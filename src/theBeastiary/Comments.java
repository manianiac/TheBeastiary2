package theBeastiary;

public class Comments {
	private String commentid;
	private String monsterid;
	private String userid;
	private String comment;
	private String datecreated;
	
	public Comments(String commentid, String monsterid, String userid, String comment, String datecreated) {
		this.commentid = commentid;
		this.monsterid = monsterid;
		this.userid = userid;
		this.comment = comment;
		this.datecreated = datecreated;
	}
	
	/**
	 * @return the commentid
	 */
	public String getCommentid() {
		return commentid;
	}
	/**
	 * @param commentid the commentid to set
	 */
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	/**
	 * @return the monsterid
	 */
	public String getMonsterid() {
		return monsterid;
	}
	/**
	 * @param monsterid the monsterid to set
	 */
	public void setMonsterid(String monsterid) {
		this.monsterid = monsterid;
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
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the datecreated
	 */
	public String getDatecreated() {
		return datecreated;
	}
	/**
	 * @param datecreated the datecreated to set
	 */
	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}
}
