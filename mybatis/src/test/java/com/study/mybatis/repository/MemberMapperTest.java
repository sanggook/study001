package com.study.mybatis.repository;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@MybatisTest
class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void testGetMember(){
        String mId =  "Kook";
        memberMapper.getMember(mId);
    }
}