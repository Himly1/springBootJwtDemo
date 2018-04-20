package com.himly.jwt.util;

import com.auth0.jwt.JWTVerifier;

/**
 * create_at:MaZheng
 * create_by:${date} ${time}
 */
public class JwtUtil {
    private static final Long EXPIRE_TIME = 10L*60L*1000L;


    /**
     *
     * @param token 密匙
     * @param userName
     * @param secret 用户密码
     * @return
     */
    public static boolean verify(String token,String userName,String secret) {

        return true;
    }
}

