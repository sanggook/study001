package com.study.study001.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
    private int seq;
    private String id;
    
    private String memberName;
    private int memberTag;
}
