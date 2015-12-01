package theBeastiary;

public class Action {
	private String monsterID;
	private String actionName;
	private String actionText;
	public Action(String monsterID, String actionName, String actionText) {
		super();
		this.monsterID = monsterID;
		this.actionName = actionName;
		this.actionText = actionText;
	}
	/**
	 * @return the monsterID
	 */
	public String getMonsterID() {
		return monsterID;
	}
	/**
	 * @param monsterID the monsterID to set
	 */
	public void setMonsterID(String monsterID) {
		this.monsterID = monsterID;
	}
	/**
	 * @return the actionName
	 */
	public String getActionName() {
		return actionName;
	}
	/**
	 * @param actionName the actionName to set
	 */
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	/**
	 * @return the actionText
	 */
	public String getActionText() {
		return actionText;
	}
	/**
	 * @param actionText the actionText to set
	 */
	public void setActionText(String actionText) {
		this.actionText = actionText;
	}
	
}
