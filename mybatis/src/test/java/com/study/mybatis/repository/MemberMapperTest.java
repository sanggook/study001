package com.study.mybatis.repository;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void getMember(){
        String mId =  "kook";
        memberMapper.getMember(mId);
    }
}