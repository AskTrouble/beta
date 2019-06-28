package com.mu.beta.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述: ${DESCRIPTION}</br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/6/28 10:10
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@SpringBootApplication(scanBasePackages = "com.mu")
@MapperScan("com.mu.beta.dao")
public class BetaWebApp {

    public static void main(String[] args) {

        SpringApplication.run(BetaWebApp.class, args);

    }

}
