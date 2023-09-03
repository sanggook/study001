package com.study.api.service;

import java.util.List;

import com.study.common.utils.NetworkUtil;
import com.study.jpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.study.mybatis.dto.Member;
import com.study.mybatis.dto.MemberListDto;
import com.study.mybatis.repository.MemberMapper;

@Service
@RequiredArgsConstructor
public class MemberService {

//    @Autowired
    private final MemberMapper memberMapper;

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
