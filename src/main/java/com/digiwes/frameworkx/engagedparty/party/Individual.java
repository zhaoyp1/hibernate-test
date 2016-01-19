package com.digiwes.frameworkx.engagedparty.party;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhaoyp-pc on 2016/1/18.
 */
public class Individual extends Party {
    private String gender;
    private String placeOfBirth;
    private String nationality;
    private String maritalStatus;
    private String skills;
    private String disabilities;
    private Set<IndividualName> _individualName = new HashSet<IndividualName>();

    public Set<IndividualName> get_individualName() {
        return _individualName;
    }

    public void set_individualName(Set<IndividualName> _individualName) {
        this._individualName = _individualName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDisabilities() {
        return disabilities;
    }

    public void setDisabilities(String disabilities) {
        this.disabilities = disabilities;
    }
}
