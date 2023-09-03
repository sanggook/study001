package com.study.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.mybatis.dto.Member;

@Mapper
public interface MemberMapper {
    List<Member> getMemberList();

    Member getMember(String mId);
}
