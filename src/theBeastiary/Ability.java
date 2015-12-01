package theBeastiary;

public class Ability {
	private String monsterID;
	private String abilityName;
	private String abilityText;
	public Ability(String monsterID, String abilityName, String abilityText) {
		super();
		this.monsterID = monsterID;
		this.abilityName = abilityName;
		this.abilityText = abilityText;
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
	 * @return the abilityName
	 */
	public String getAbilityName() {
		return abilityName;
	}
	/**
	 * @param abilityName the abilityName to set
	 */
	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}
	/**
	 * @return the actionName
	 */
	public String getAbilityText() {
		return abilityText;
	}
	/**
	 * @param actionName the actionName to set
	 */
	public void getAbilityText(String abilityText) {
		this.abilityText = abilityText;
	}

}
