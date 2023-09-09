package com.study.mybatis.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Schema(description = "회원 목록 DTO")
@Data
@Builder
@AllArgsConstructor
public class MemberListDto {
    @Schema(description = "회원 목록 DATA")
    private List<Member> listData = new ArrayList<>();

    @Schema(description = "전체 회원 수")
    private int totalCount;

}
