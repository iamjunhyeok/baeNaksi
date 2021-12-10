package com.baeNaksi.service;

import com.baeNaksi.model.MemberVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<MemberVo> getMember() throws Exception {
        return sqlSession.selectList("MemberMapper.getMember");
    }

    @Override
    public MemberVo getMember(String id) throws Exception {
        return (MemberVo) sqlSession.selectList("MemberMapper.getMember", id).get(0);
    }
}
