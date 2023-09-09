package com.study.api.service;

import java.util.List;

import com.study.jpa.dto.MemberDTO;
import com.study.jpa.service.MemberTService;
import lombok.RequiredArgsConstructor;
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

    private final MemberTService memberTService;

    @Cacheable(value = "studyCache")
    public MemberListDto getMemberList(){


        List<Member> memberList = memberMapper.getMemberList();
        return MemberListDto.builder().listData(memberList).totalCount(memberList.size()).build();
    }

    @Cacheable(value="studyCache")
    public MemberDTO getMember(String userId) {
        return memberTService.selectMemberById(userId);
    //       return memberMapper.getMember(userId);
    }
}
