package com.digiwes.frameworkx.engagedparty.party.partyRole;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

public class Producer extends PartyRole {

	public Producer() {
	}

	/**
	 * 
	 * @param partyRoleId
	 * @param name
	 */
	public Producer(int partyRoleId, String name) {
		super(partyRoleId,name);
	}
}