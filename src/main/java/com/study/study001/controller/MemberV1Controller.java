package com.study.study001.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.study001.domain.dto.Member;
import com.study.study001.domain.dto.MemberListDto;
import com.study.study001.domain.response.ApiResponse;
import com.study.study001.service.MemberService;

@RestController
@RequestMapping(value="/v1/member")
public class MemberV1Controller {
    
    @Autowired
    MemberService memberService;

    @GetMapping(value="/list")
    public ResponseEntity<ApiResponse<MemberListDto>> getMemberList(){
        return ResponseEntity.ok().body(ApiResponse.success(memberService.getMemberList()));
    }
    @GetMapping(value="/info")
    public ResponseEntity<ApiResponse<Member>> getMember(
        @RequestParam("id") String userId
    ) throws Exception {
        return ResponseEntity.ok().body(ApiResponse.success(memberService.getMember(userId)));
    }
}
