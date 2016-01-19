package com.digiwes.frameworkx.engagedparty.party.partyRole;

import java.util.*;
import com.digiwes.frameworkx.common.TimePeriod;

import javax.persistence.*;

/**
 * The part played by a party in a given context with any characteristics, such as expected pattern of behavior, attributes, and/or associations that it entails. PartyRole is an abstract concept that should be used in places where the business refers to a Party playing a Role
 */
public class PartyRole {


	//private Party _party;

	//private Set<ContactMedium> _contactMedium = new HashSet<ContactMedium>();
	/**
	 * Unique identifier for PartyRoles
	 */
	private int partyRoleId;
	/**
	 * Used to track the lifecycle status, e.g. existing, prospective or former customers.
	 */
	private String status;
	/**
	 * The time period that the PartyRole is valid for
	 */

	private TimePeriod validFor;
	/**
	 * A word, term, or phrase by which the PartyRole is known and distinguished from other PartyRoles.
	 */

	private String name;

	public int getPartyRoleId() {
		return this.partyRoleId;
	}

	public void setPartyRoleId(int partyRoleId) {
		this.partyRoleId = partyRoleId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TimePeriod getValidFor() {
		return this.validFor;
	}

	public void setValidFor(TimePeriod validFor) {
		this.validFor = validFor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Party get_party() {
		return _party;
	}

	public void set_party(Party _party) {
		this._party = _party;
	}

	public Set<ContactMedium> get_contactMedium() {
		return _contactMedium;
	}

	public void set_contactMedium(Set<ContactMedium> _contactMedium) {
		this._contactMedium = _contactMedium;
	}*/

	public PartyRole() {
	}

	/**
	 * 
	 * @param partyRoleId
	 * @param name
	 */
	public PartyRole(int partyRoleId, String name) {
		this.partyRoleId = partyRoleId;
		this.name = name;
	}

	/**
	 * 
	 * @param contactMedium
	 *//*
	public void contactVia(ContactMedium contactMedium) {
		if (null == contactMedium) {
			return;
		}
		if (null == _contactMedium) {
			_contactMedium = new HashSet<ContactMedium>();
		}
		_contactMedium.add(contactMedium);
	}

	@Override
	public String toString() {
		return "PartyRole{" +
				"_party=" + _party.getPartyId() +
				", _contactMedium=" + _contactMedium +
				", partyRoleId='" + partyRoleId + '\'' +
				", status='" + status + '\'' +
				", validFor=" + validFor +
				", name='" + name + '\'' +
				'}';
	}*/
}