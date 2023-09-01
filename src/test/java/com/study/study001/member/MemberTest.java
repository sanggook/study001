package com.study.study001.member;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.study.study001.domain.dto.Member;
import com.study.study001.domain.dto.MemberListDto;
import com.study.study001.jpa.entity.MemberEntity;
import com.study.study001.jpa.repository.MemberRepository;
import com.study.study001.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class MemberTest {
    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("멤버 등록 JPA")
    void testInsertMemberForJPA(){

        MemberEntity member = MemberEntity.builder()
                .mId("kook3")
                .mPw("qwer1234")
                .mName("KOOK")
                .mTag("#8946")
                .joinDate(LocalDateTime.now())
                .build();
        memberRepository.save(member);
    }

    @Test
    @DisplayName("멤버 전체 조회 JPA")
    void testGetMemberListForJPA(){

        List<MemberEntity> result = memberRepository.findAll(Sort.by(Sort.Order.asc("mNo")));
        result.forEach(m -> System.out.println(m.toString()));
    }

    @Test
    @DisplayName("멤버 한건 조회 JPA")
    void testGetMemberForJPA() {
        long id = 1L;
        Optional<MemberEntity> member = memberRepository.findById(id);
        System.out.println(member);
    }

    @Test
    @DisplayName("멤버 한건 조회 Mybatis")
    void testGetMemberForMybatis() throws Exception {
        String userId = "kook";
        Member member = memberService.getMember(userId);
        System.out.println(member.toString());
    }

    @Test
    @DisplayName("멤버 전체 조회 Mybatis")
    void testGetMemberListForMybatis(){
        MemberListDto MemberListDto = memberService.getMemberList();
        MemberListDto.getListData().forEach(m -> System.out.println(m.toString()));
    }
}
