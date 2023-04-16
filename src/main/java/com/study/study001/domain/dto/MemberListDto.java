package com.study.study001.domain.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class MemberListDto {
    private List<Member> listData = new ArrayList<>();
    private int totalCount;

}
