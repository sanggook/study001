package com.study.study001.member;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.study001.domain.dto.Member;
import com.study.study001.service.MemberService;

@SpringBootTest
public class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Test
    @DisplayName("멤버 전체 조회")
    void testGetMemberList(){
        List<Member> memberList = memberService.getMemberList();
        memberList.stream().forEach(m -> System.out.println(m.toString()));
    }
    
}
