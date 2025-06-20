package com.mvr.authservice.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    private static final long EXPIRATION_TIME = 1000*60*60;
    private static final String SECRET = "my_super_secret_mvr_key_for_jwt_##_22_32_143_Ss";

    private Key getKey(){
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }

    public  String generateToken(String userName) {
        return Jwts.builder()
                .setSubject(userName)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getKey(), SignatureAlgorithm.HS256).compact();
    }

    public String extractUserName(String token){
        return Jwts.parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJwt(token)
                .getBody()
                .getSubject();
    }

    public boolean isTokenValid(String token,String userName){
        String extracted = extractUserName(token);
        return (extracted.equals(userName) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        Date expiration = Jwts.parserBuilder()
                .setSigningKey(getKey())
                .build().parseClaimsJws(token)
                .getBody().getExpiration();
        return expiration.before(new Date());
    }

}
