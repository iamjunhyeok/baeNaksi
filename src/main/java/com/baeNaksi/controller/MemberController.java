package com.baeNaksi.controller;

import com.baeNaksi.model.MemberVo;
import com.baeNaksi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<MemberVo> getMembers() throws Exception {
        return memberService.getMember();
    }

    @GetMapping("/{memberId}")
    public MemberVo getMember(@PathVariable("memberId") String memberId) throws Exception {
        return memberService.getMember(memberId);
    }

    @PostMapping(value = "/")
    public void createMember() {

    }

    @PatchMapping("/{memberId}")
    public void updateMember(@PathVariable("memberId") String memberId) {

    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable("memberId") String memberId) {

    }
}
