package com.study.study001.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.study001.domain.dto.Member;

@Mapper
public interface MemberMapper {
    List<Member> getMemberList();

    Member getMember(String mId);
}
