package com.study.jpa.domain.repository;

import com.study.jpa.domain.entity.MemberTEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@TestPropertySource("classpath:application-test.properties")
class MemberTRepositoryTest {

    @Autowired
    private com.study.jpa.domain.repository.MemberTRepository memberTRepository;

    @Test
    @DisplayName("회원 등록 테스트")
    void testSaveMember(){
        MemberTEntity memberEntity = MemberTEntity.builder()
                .mId("Kook3")
                .mPw("qwer1234")
                .mName("KOOK")
                .mTag("#8946")
                .joinDate(LocalDateTime.now())
                .build();
        memberTRepository.save(memberEntity);
    }

    @Test
    @DisplayName("회원 검색")
    void testGetMember(){
        memberTRepository.findBymId("kook");
    }
}