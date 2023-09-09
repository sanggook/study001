package com.study.api.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import com.study.api.vo.HealthCheckInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.common.utils.NetworkUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Tag(name = "HealthCheck", description = "서버 상태 체크 API")
@RestController
public class HealthController {

    @Operation(summary = "서버 상태 체크")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공")
    })
    @GetMapping("/hc")
    public ResponseEntity<HealthCheckInfo> healthCheck(HttpServletRequest request) {
        HealthCheckInfo info = HealthCheckInfo.builder()
            .clientIp(NetworkUtil.getClientIp(request))
            .currentTime(LocalDateTime.now())
            .isHealth(true)
            .build();
        log.debug("health check!!");
        return ResponseEntity.ok().body(info);
    }
}
