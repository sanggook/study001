package com.study.study001.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.study.study001.constants.ServerStatusCode;
import com.study.study001.controller.ProductV1Controller;
import com.study.study001.domain.response.ApiResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice(basePackageClasses = {ProductV1Controller.class})
public class ProductExceptionHandler {
    
    // 이건 되지를 않는다? 왜? 
    @ExceptionHandler({Exception.class})
    public ResponseEntity handleServerException(Exception e) {
        log.error("Product Error!!", e);
        return new ResponseEntity(ApiResponse.fail(ServerStatusCode.PRODUCT_NOT_FOUND), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
