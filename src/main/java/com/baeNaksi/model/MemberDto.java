package com.baeNaksi.model;

public class MemberDto extends CommonDto {
    public MemberVo memberVo = new MemberVo();

    public MemberVo getMemberVo() {
        return memberVo;
    }

    public void setMemberVo(MemberVo memberVo) {
        this.memberVo = memberVo;
    }
}
