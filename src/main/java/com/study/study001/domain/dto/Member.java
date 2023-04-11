package com.study.study001.domain.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Member {
    private int seq;
    private String id;
    private String memberName;
    private int memberTag;
}
