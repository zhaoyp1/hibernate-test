package com.digiwes.frameworkx.engagedparty.party;

import com.digiwes.frameworkx.common.TimePeriod;

import javax.persistence.*;

/**
 * A word, term, or phrase by which a party (individual or organization) is known and distinguished from other parties. A name is an informal way of identifying an object [Fowler].PartyName is an abstract concept that should be used in places where the business refers to an organization name, organization unit name or individual name
 */
public  class PartyName {


	private int partyNameId;
	/**
	 * The time period that the PartyName is applicable.
	 */

	private TimePeriod validFor;
	public PartyName() {

	}

	public PartyName(TimePeriod validFor) {
		this.validFor = validFor;
	}

	public TimePeriod getValidFor() {
		return this.validFor;
	}

	public void setValidFor(TimePeriod validFor) {
		this.validFor = validFor;
	}

	public int getPartyNameId() {
		return partyNameId;
	}

	public void setPartyNameId(int partyNameId) {
		this.partyNameId = partyNameId;
	}

}