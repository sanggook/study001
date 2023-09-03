package com.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.study.jpa.repository")
@EntityScan(basePackages = "com.study.jpa.entity")
@SpringBootApplication
public class TestConfiguration {
}
