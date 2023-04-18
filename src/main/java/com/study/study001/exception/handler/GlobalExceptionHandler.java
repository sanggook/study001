package com.study.study001.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.study.study001.constants.ServerStatusCode;
import com.study.study001.domain.response.ApiResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
 
    // 커스텀 예외를 만들어서 각 서비스별로 구분하도록 한다?
    // 모든 핸들러의 범위를 지정하도록 한다.
    
    @ExceptionHandler({Exception.class})
    protected ResponseEntity handleServerException(Exception e) {
        log.error("Global Error!!", e);
        return new ResponseEntity(ApiResponse.fail(ServerStatusCode.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
