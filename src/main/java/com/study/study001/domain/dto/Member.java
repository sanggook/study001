package com.study.study001.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Member {
    private long mNo;
    private String mId;
    private String mName;
    private String mTag;
    private LocalDateTime joinDate;

}
