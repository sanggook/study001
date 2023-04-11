package com.study.study001.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.study001.domain.dto.Member;
import com.study.study001.repository.MemberMapper;

@Service
public class MemberService {
    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }

    public List<Member> getMemberList(){
        return memberMapper.getMemberList();
    }
}
