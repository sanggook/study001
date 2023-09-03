package com.study.api.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import com.study.api.vo.HealthCheckInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.common.utils.NetworkUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HealthController {
    
    @GetMapping("/hc")
    public ResponseEntity<String> healthCheck(HttpServletRequest request) {
        HealthCheckInfo info = HealthCheckInfo.builder()
            .clientIp(NetworkUtil.getClientIp(request))
            .currentTime(LocalDateTime.now())
            .isHealth(true)
            .build();
        log.debug("health check!!");
        return ResponseEntity.ok().body(info.toString());
    }
}
