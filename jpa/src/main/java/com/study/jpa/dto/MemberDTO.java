package com.study.jpa.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "회원 DTO JPA")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

    @Schema(description = "회원 번호")
    private String mNo;

    @Schema(description = "회원 아이디")
    private String mId;

    @Schema(description = "회원 이름")
    private String mName;

    @Schema(description = "회원 태그")
    private String mTag;

}
