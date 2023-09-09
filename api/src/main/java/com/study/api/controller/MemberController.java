package com.study.api.controller;

import com.study.common.utils.NetworkUtil;
import com.study.jpa.dto.MemberDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.mybatis.dto.Member;
import com.study.mybatis.dto.MemberListDto;
import com.study.api.domain.response.ApiResponse;
import com.study.api.service.MemberService;

import javax.servlet.http.HttpServletRequest;

@Tag(name = "Member", description = "회원 API")
@RestController
@RequestMapping(value="/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @Operation(summary = "회원 목록 조회", description = "전체 회원 목록을 조회한다.")
    @GetMapping(value="/list")
    public ResponseEntity<ApiResponse<MemberListDto>> getMemberList(){
        return ResponseEntity.ok().body(ApiResponse.success(memberService.getMemberList()));
    }

    @Operation(summary = "회원 정보 조회", description = "아이디를 통해 회원 정보 또는 회원 페이지로 이동")
    @GetMapping(value="/{userId}")
    public ResponseEntity<ApiResponse<MemberDTO>> getMember(
        @PathVariable("userId") String userId
    ) {
        return ResponseEntity.ok().body(ApiResponse.success(memberService.getMember(userId)));
    }
}
