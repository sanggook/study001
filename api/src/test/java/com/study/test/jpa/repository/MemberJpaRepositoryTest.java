package com.study.test.jpa.repository;

import com.study.TestConfiguration;
import com.study.jpa.entity.MemberEntity;
import com.study.jpa.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@ContextConfiguration(classes = TestConfiguration.class)
@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
public class MemberJpaRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("회원 등록 For JPA")
    @Transactional // 테스트 더미 데이터를 넣지 않으려고
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

    @Test
    @DisplayName("회원 조회 For JPA")
    void testFindById(){
        long t_mno = 1L;
        Optional<MemberEntity> result = memberRepository.findById(t_mno);

        System.out.println(result);

    }
}
