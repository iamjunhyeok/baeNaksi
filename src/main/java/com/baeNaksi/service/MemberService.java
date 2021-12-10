package com.baeNaksi.service;

import com.baeNaksi.model.MemberDto;
import com.baeNaksi.model.MemberVo;

import java.util.List;

public interface MemberService {
    void createMember(MemberDto dto) throws Exception;
    List<MemberVo> getMember() throws Exception;
    MemberVo getMember(String id) throws Exception;
}
