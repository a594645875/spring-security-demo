package com.czc.oauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author czc
 * @date 2019/6/6 18:14
 * 认证服务器，用于获取 Token
 * <p>
 * Description:
 * </p>
 */
@SpringBootApplication
@MapperScan("com.czc.oauth2.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }

}