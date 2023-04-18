package com.study.study001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.study.study001.constants.ServerStatusCode;
import com.study.study001.domain.dto.Product;
import com.study.study001.domain.response.ApiResponse;
import com.study.study001.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="/v1/product")
public class ProductV1Controller {
    
    @Autowired
    private ProductService productService;

    @GetMapping(value="/info")
    public ResponseEntity<ApiResponse<Product>> getProduct(
        @RequestParam("p") String pCode
    ) throws Exception{
        return ResponseEntity.ok().body(ApiResponse.success(productService.getProduct(pCode)));
    }

    // 이건 작동을 한다?
    @ExceptionHandler({Exception.class})
    protected ResponseEntity handleServerException(Exception e) {
        log.error("Product Controller Error!!", e);
        return new ResponseEntity(ApiResponse.fail(ServerStatusCode.PRODUCT_NOT_FOUND), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
