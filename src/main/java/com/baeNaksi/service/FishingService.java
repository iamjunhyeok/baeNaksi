package com.baeNaksi.service;

import com.baeNaksi.model.MemberVo;

import java.util.List;

public interface FishingService {
    List<MemberVo> getMember() throws Exception;
    MemberVo getMember(String id) throws Exception;
}
