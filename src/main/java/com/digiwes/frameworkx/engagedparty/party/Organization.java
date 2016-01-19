package com.digiwes.frameworkx.engagedparty.party;

import com.digiwes.frameworkx.common.TimePeriod;

/**
 * Created by zhaoyp-pc on 2016/1/18.
 */
public class Organization extends Party{


    private boolean isLegalEntity ;

    private TimePeriod existsDuring;


    public boolean getIsLegalEntity() {
        return isLegalEntity;
    }

    public void setIsLegalEntity (boolean isLegalEntity) {
        this.isLegalEntity = isLegalEntity;
    }

    public TimePeriod getExistsDuring() {
        return existsDuring;
    }

    public void setExistsDuring(TimePeriod existsDuring) {
        this.existsDuring = existsDuring;
    }
}
