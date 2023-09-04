package com.study.api.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;
    @Test
    @DisplayName("회원 검색")
    void testFindByMId() throws Exception {
        String userId = "kook";
        memberService.getMember(userId);
    }
}