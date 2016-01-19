package com.digiwes.frameworkx.engagedparty.party.partyRole;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

public class Consumer extends PartyRole {



	public Consumer() {
	}

	/**
	 * 
	 * @param partyRoleId
	 * @param name
	 */
	public Consumer(int partyRoleId, String name) {
		super(partyRoleId,name);
	}
}