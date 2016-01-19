package com.digiwes.frameworkx.engagedparty.party;

import com.digiwes.frameworkx.common.TimePeriod;

import javax.persistence.*;

/**
 * A word, term, or phrase by which an organization is known and distinguished from other organizations.A name is an informal way of identifying an object [Fowler]An OrganizationName is a type of PartyName.
 */
public class OrganizationName extends PartyName {

	/**
	 * The name that the organization (unit) trades under
	 */

	private String tradingName;
	/**
	 * Co., Inc., Ltd., Pty Ltd. , Plc., Gmbh
	 */

	private String nameType;

	public OrganizationName(String tradingName,String nameType,TimePeriod validFor) {
		super(validFor);
		this.tradingName = tradingName;
		this.nameType = nameType;
	}
	public OrganizationName(){

	}

	public String getTradingName() {
		return this.tradingName;
	}

	public void setTradingName(String tradingName) {
		this.tradingName = tradingName;
	}

	public String getNameType() {
		return this.nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

}