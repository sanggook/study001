package com.study.api.controller;

import com.study.common.utils.NetworkUtil;
import com.study.jpa.dto.MemberDTO;
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

@RestController
@RequestMapping(value="/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value="/list")
    public ResponseEntity<ApiResponse<MemberListDto>> getMemberList(){
        return ResponseEntity.ok().body(ApiResponse.success(memberService.getMemberList()));
    }
    @GetMapping(value="/{userId}")
    public ResponseEntity<ApiResponse<MemberDTO>> getMember(
        @PathVariable("userId") String userId
    ) {
        return ResponseEntity.ok().body(ApiResponse.success(memberService.getMember(userId)));
    }
}
