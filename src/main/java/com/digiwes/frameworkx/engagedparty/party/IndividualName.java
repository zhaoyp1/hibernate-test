package com.digiwes.frameworkx.engagedparty.party;

import com.digiwes.frameworkx.common.TimePeriod;

import javax.persistence.*;

/**
 * A word, term, or phrase by which an individual is known and distinguished from other individuals.A name is an informal way of identifying an object [Fowler]This entity allows for international naming variations. An IndividualName is a type of PartyName.
 */
public class IndividualName extends PartyName {

	/**
	 * Contains, in one string, a fully formatted name with all of its pieces in their proper place. This includes all of the necessary punctuation. This de-normalized form of the name cannot be easily parsed.
	 * 
	 * Note:
	 * if NULL, then derive from the other fields using name policy
	 */

	private String formattedName;
	/**
	 * Contains, in one string, a fully formatted name with all of its pieces in their proper place. This includes all of the necessary punctuation
	 * 
	 * Note:
	 * if NULL, then derive from the other fields using name policy
	 */

	private String legalName;

	public IndividualName(String formattedName,String legalName,TimePeriod validFor) {
		super(validFor);
		this.formattedName = formattedName ;
		this.legalName = legalName;
	}
	public IndividualName(){

	}

	/**
	 * A name that describes someone's aristocratic position, such as Baron, Graf, Earl, and so forth.
	 */
	public String getFormattedName() {
		return formattedName;
	}

	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
}