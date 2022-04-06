package com.github.skjolber.bench.utils;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Date;
import java.util.Map;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JsonWebTokenGenerator {

	private final KeyPair keyPair;
	
	public JsonWebTokenGenerator() throws Exception {
	    KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
	    keyGen.initialize(2048);
	    
	    keyPair = keyGen.generateKeyPair();
	}
	
    public String createJsonWebToken(Map<String, Object> keys, String issuer, String audience) throws Exception {
        JwtBuilder builder = Jwts.builder()
          .setIssuer(issuer)
          .setAudience(audience)
          .setIssuedAt(new Date())
          .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))
          .signWith(SignatureAlgorithm.RS256, keyPair.getPrivate())
          ;
        
        for (Map.Entry<String, Object> entry : keys.entrySet()) {
            builder.claim(entry.getKey(), entry.getValue());
        }
        
        return builder.compact();
    }
    
    public KeyPair getKeyPair() {
		return keyPair;
	}
}
