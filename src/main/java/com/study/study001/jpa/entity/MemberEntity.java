package com.study.study001.jpa.entity;

import lombok.*;


import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MEMBER_T")
@Entity
public class MemberEntity {

    @Id
    @Column(name = "MNO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mNo;

    @Column(name = "MID")
    private String mId;

    @Column(name = "PASSWORD")
    private String mPw;

    @Column(name = "MNAME")
    private String mName;

    @Column(name = "MTAG")
    private String mTag;

    @Column(name = "JOIN_DATE")
    private LocalDateTime joinDate;
}
