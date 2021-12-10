package com.baeNaksi.model;

public class MemberVo extends CommonVo {
    public String memberId;
    public String password;
    public String name;
    public String phoneNumber;
    public String memberType;
    public boolean tempPasswordFlag;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public boolean isTempPasswordFlag() {
        return tempPasswordFlag;
    }

    public void setTempPasswordFlag(boolean tempPasswordFlag) {
        this.tempPasswordFlag = tempPasswordFlag;
    }
}
