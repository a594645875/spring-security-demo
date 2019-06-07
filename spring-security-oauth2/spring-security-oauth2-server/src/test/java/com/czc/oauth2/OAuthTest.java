package com.czc.oauth2;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.*;

/**
 * @author czc
 * @date 2019/6/7 16:50
 */
public class OAuthTest {

    @Test
    public void main() {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}