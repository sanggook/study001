package com.study.mybatis.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Schema(description = "회원 정보 Mybatis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @NotNull
    @Schema(description = "회원 번호", example = "12345")
    private Long memberNo;

    @Schema(description = "회원 아이디", example = "kook")
    private String mId;

    @Schema(description = "회원 이름", example = "이상국")
    private String mName;

    @Schema(description = "회원 태그", example = "#8946")
    private String mTag;

    @Schema(description = "회원 가입 시간", example = "2023-09-09T19:34:58.5373475")
    private LocalDateTime joinDate;

}
