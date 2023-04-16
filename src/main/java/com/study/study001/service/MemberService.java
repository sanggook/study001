package com.study.study001.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.study.study001.domain.dto.Member;
import com.study.study001.domain.dto.MemberListDto;
import com.study.study001.repository.MemberMapper;

@Service
public class MemberService {
    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }

    @Cacheable(value = "studyCache")
    public MemberListDto getMemberList(){
        List<Member> memberList = memberMapper.getMemberList();
        return MemberListDto.builder().listData(memberList).totalCount(memberList.size()).build();
    }

    @Cacheable(value="studyCache")
    public Member getMember(String userId) throws Exception {   
           return memberMapper.getMember(userId);
    }
}
