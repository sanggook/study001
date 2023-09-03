package com.study.jpa.repository;

import com.study.jpa.entity.MemberEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("회원 등록 테스트")
    @Transactional
    void testSaveMember(){
        MemberEntity memberEntity = MemberEntity.builder()
                .mId("Kook3")
                .mPw("qwer1234")
                .mName("KOOK")
                .mTag("#8946")
                .joinDate(LocalDateTime.now())
                .build();
        memberRepository.save(memberEntity);
    }
}