package com.digiwes.frameworkx.engagedparty.party;

import com.digiwes.frameworkx.common.TimePeriod;

/**
 * Created by zhaoyp-pc on 2016/1/18.
 */
public   class Party {
    private int partyId;
    private String name ;
    private TimePeriod validFor ;

    public int getPartyId() {
        return this.partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimePeriod getValidFor() {
        return this.validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }
}
