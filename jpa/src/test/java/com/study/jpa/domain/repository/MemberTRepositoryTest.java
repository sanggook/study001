package com.study.jpa.domain.repository;

import com.study.jpa.domain.entity.MemberTEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

//@DataJpaTest
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
class MemberTRepositoryTest {

    @Autowired
    private MemberTRepository memberTRepository;

    @Test
    @DisplayName("회원 등록")
    @Order(1)
    void save(){
        // given
        String userId = "Kook";
        String pw = " qwer1234";
        String name = "KOOK";
        String tag = "#8946";
        LocalDateTime joinDate = LocalDateTime.now();

        MemberTEntity memberEntity = MemberTEntity.builder()
                .mId(userId)
                .mPw(pw)
                .mName(name)
                .mTag(tag)
                .joinDate(joinDate)
                .build();

        // when
        MemberTEntity memberT = memberTRepository.save(memberEntity);

        // assert
        System.out.println(memberT);
    }

    @Test
    @DisplayName("회원 검색")
    @Order(2)
    void findBymId(){
        // given
        String userId = "Kook";

        // when
        MemberTEntity memberT = memberTRepository.findBymId(userId);

        // assert
        System.out.println(memberT);
    }
}