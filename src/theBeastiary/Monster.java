package theBeastiary;

public class Monster {
	private String monsterid;
	private String userid;
	private String datecreated;
	private String datelastedit;
	private String versionnumber;
	private String rating;
	private String picture;
	private String monstername;
	private String race;
	private String size;
	private String alignment;
	private String armorclass;
	private String armortype;
	private String hitdice;
	private String speed;
	private String str;
	private String dex;
	private String con;
	private String intelligence;
	private String wis;
	private String cha;
	private String damageresistance;
	private String damageimmunities;
	private String conditionimmunities;
	private String senses;
	private String languages;
	private String challenge;
	private String skills;
	private String saves;
	private String abililties;
	private String actions;
	private String legendaryactions;
	private String lairactions;
	private String fluff;

	public Monster(String monsterid, String userid, String datecreated, String datelastedit, String versionnumber,
			String rating, String picture, String monstername, String race, String size, String alignment,
			String armorclass, String armortype, String hitdice, String speed, String str, String dex, String con,
			String intelligence, String wis, String cha, String damageresistance, String damageimmunities,
			String conditionimmunities, String senses, String languages, String challenge, String skills, String saves,
			String abililties, String actions, String legendaryactions, String lairactions, String fluff) {
		this.monsterid = monsterid;
		this.userid = userid;
		this.datecreated = datecreated;
		this.datelastedit = datelastedit;
		this.versionnumber = versionnumber;
		this.rating = rating;
		this.picture = picture;
		this.monstername = monstername;
		this.race = race;
		this.size = size;
		this.alignment = alignment;
		this.armorclass = armorclass;
		this.armortype = armortype;
		this.hitdice = hitdice;
		this.speed = speed;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intelligence = intelligence;
		this.wis = wis;
		this.cha = cha;
		this.damageresistance = damageresistance;
		this.damageimmunities = damageimmunities;
		this.conditionimmunities = conditionimmunities;
		this.senses = senses;
		this.languages = languages;
		this.challenge = challenge;
		this.skills = skills;
		this.saves = saves;
		this.abililties = abililties;
		this.actions = actions;
		this.legendaryactions = legendaryactions;
		this.lairactions = lairactions;
		this.fluff = fluff;
	}

	/**
	 * @return the monsterid
	 */
	public String getMonsterid() {
		return monsterid;
	}

	/**
	 * @param monsterid
	 *            the monsterid to set
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
	 * @param userid
	 *            the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the datecreated
	 */
	public String getDatecreated() {
		return datecreated;
	}

	/**
	 * @param datecreated
	 *            the datecreated to set
	 */
	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	/**
	 * @return the datelastedit
	 */
	public String getDatelastedit() {
		return datelastedit;
	}

	/**
	 * @param datelastedit
	 *            the datelastedit to set
	 */
	public void setDatelastedit(String datelastedit) {
		this.datelastedit = datelastedit;
	}

	/**
	 * @return the versionnumber
	 */
	public String getVersionnumber() {
		return versionnumber;
	}

	/**
	 * @param versionnumber
	 *            the versionnumber to set
	 */
	public void setVersionnumber(String versionnumber) {
		this.versionnumber = versionnumber;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture
	 *            the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return the monstername
	 */
	public String getMonstername() {
		return monstername;
	}

	/**
	 * @param monstername
	 *            the monstername to set
	 */
	public void setMonstername(String monstername) {
		this.monstername = monstername;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race
	 *            the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the alignment
	 */
	public String getAlignment() {
		return alignment;
	}

	/**
	 * @param alignment
	 *            the alignment to set
	 */
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	/**
	 * @return the armorclass
	 */
	public String getArmorclass() {
		return armorclass;
	}

	/**
	 * @param armorclass
	 *            the armorclass to set
	 */
	public void setArmorclass(String armorclass) {
		this.armorclass = armorclass;
	}

	/**
	 * @return the armortype
	 */
	public String getArmortype() {
		return armortype;
	}

	/**
	 * @param armortype
	 *            the armortype to set
	 */
	public void setArmortype(String armortype) {
		this.armortype = armortype;
	}

	/**
	 * @return the hitdice
	 */
	public String getHitdice() {
		return hitdice;
	}

	/**
	 * @param hitdice
	 *            the hitdice to set
	 */
	public void setHitdice(String hitdice) {
		this.hitdice = hitdice;
	}

	/**
	 * @return the speed
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}

	/**
	 * @param str
	 *            the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}

	/**
	 * @return the dex
	 */
	public String getDex() {
		return dex;
	}

	/**
	 * @param dex
	 *            the dex to set
	 */
	public void setDex(String dex) {
		this.dex = dex;
	}

	/**
	 * @return the con
	 */
	public String getCon() {
		return con;
	}

	/**
	 * @param con
	 *            the con to set
	 */
	public void setCon(String con) {
		this.con = con;
	}

	/**
	 * @return the intelligence
	 */
	public String getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence
	 *            the intelligence to set
	 */
	public void setIntelligence(String intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the wis
	 */
	public String getWis() {
		return wis;
	}

	/**
	 * @param wis
	 *            the wis to set
	 */
	public void setWis(String wis) {
		this.wis = wis;
	}

	/**
	 * @return the cha
	 */
	public String getCha() {
		return cha;
	}

	/**
	 * @param cha
	 *            the cha to set
	 */
	public void setCha(String cha) {
		this.cha = cha;
	}

	/**
	 * @return the damageresistance
	 */
	public String getDamageresistance() {
		return damageresistance;
	}

	/**
	 * @param damageresistance
	 *            the damageresistance to set
	 */
	public void setDamageresistance(String damageresistance) {
		this.damageresistance = damageresistance;
	}

	/**
	 * @return the damageimmunities
	 */
	public String getDamageimmunities() {
		return damageimmunities;
	}

	/**
	 * @param damageimmunities
	 *            the damageimmunities to set
	 */
	public void setDamageimmunities(String damageimmunities) {
		this.damageimmunities = damageimmunities;
	}

	/**
	 * @return the conditionimmunities
	 */
	public String getConditionimmunities() {
		return conditionimmunities;
	}

	/**
	 * @param conditionimmunities
	 *            the conditionimmunities to set
	 */
	public void setConditionimmunities(String conditionimmunities) {
		this.conditionimmunities = conditionimmunities;
	}

	/**
	 * @return the senses
	 */
	public String getSenses() {
		return senses;
	}

	/**
	 * @param senses
	 *            the senses to set
	 */
	public void setSenses(String senses) {
		this.senses = senses;
	}

	/**
	 * @return the languages
	 */
	public String getLanguages() {
		return languages;
	}

	/**
	 * @param languages
	 *            the languages to set
	 */
	public void setLanguages(String languages) {
		this.languages = languages;
	}

	/**
	 * @return the challenge
	 */
	public String getChallenge() {
		return challenge;
	}

	/**
	 * @param challenge
	 *            the challenge to set
	 */
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * @return the saves
	 */
	public String getSaves() {
		return saves;
	}

	/**
	 * @param saves
	 *            the saves to set
	 */
	public void setSaves(String saves) {
		this.saves = saves;
	}

	/**
	 * @return the abililties
	 */
	public String getAbililties() {
		return abililties;
	}

	/**
	 * @param abililties
	 *            the abililties to set
	 */
	public void setAbililties(String abililties) {
		this.abililties = abililties;
	}

	/**
	 * @return the actions
	 */
	public String getActions() {
		return actions;
	}

	/**
	 * @param actions
	 *            the actions to set
	 */
	public void setActions(String actions) {
		this.actions = actions;
	}

	/**
	 * @return the legendaryactions
	 */
	public String getLegendaryactions() {
		return legendaryactions;
	}

	/**
	 * @param legendaryactions
	 *            the legendaryactions to set
	 */
	public void setLegendaryactions(String legendaryactions) {
		this.legendaryactions = legendaryactions;
	}

	/**
	 * @return the lairactions
	 */
	public String getLairactions() {
		return lairactions;
	}

	/**
	 * @param lairactions
	 *            the lairactions to set
	 */
	public void setLairactions(String lairactions) {
		this.lairactions = lairactions;
	}

	/**
	 * @return the fluff
	 */
	public String getFluff() {
		return fluff;
	}

	/**
	 * @param fluff
	 *            the fluff to set
	 */
	public void setFluff(String fluff) {
		this.fluff = fluff;
	}

}
