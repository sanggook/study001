package com.study.study001.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.study001.domain.dto.Product;
import com.study.study001.service.ProductService;

@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    @DisplayName("상품 정보 조회")
    void productTest() throws Exception{
        Product info = productService.getProduct(null);
        System.out.println(info.toString());
    }
}
