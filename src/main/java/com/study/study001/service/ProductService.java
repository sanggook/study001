package com.study.study001.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.study.study001.domain.dto.Product;

@Service
public class ProductService {

    // TODO 상품 디비 설계 후 디비 조회로 변경 및 캐싱 처리
    public Product getProduct(String pCode) throws Exception{
        if(StringUtils.isEmpty(pCode)){
            throw new Exception(); 
        }
        return Product.builder().pCode(pCode).pName("상품 번호 : "+pCode).build();
    }
}
