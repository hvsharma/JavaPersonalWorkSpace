package com.harsh.jwtexploration;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	
	private static String secret = "SecretKeyToGenJWTs";
	private static long expirationTime = 864000000;
	private static String tokenPrefix = "Bearer";
    private static String headerString = "Authorization";
	private static String issuer = "Xerox Corporation";

	public static void main(String[] args) throws Exception {
		
		List<Role> roles = new ArrayList<>();
		
		roles.add(new Role("142b2f48-01cd-4603-9f60-6e7262e768ad", "Admin", "ADM"));
		roles.add(new Role("6517ac94-908c-4ce7-b9b7-d217caedaef1", "Asset Officer", "AAO"));				
		User user = new User("2b680267-b529-402a-a968-f1b18ad45cd9", "Jude Adami", "jadami0@constantcontact.com", roles);
		String token = generateJWTToken(user);
		System.out.println(token);
		createAuthenticationObjectFromToken(token);
	}
	
	 private static String generateJWTToken(User user) throws Exception {
	    	
    	StringBuilder token = new StringBuilder();
    	
    	try {
    		
    		Algorithm algorithm = Algorithm.HMAC256(secret);
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			long time = System.currentTimeMillis();
			
			token.append(JWT.create()
					.withIssuer(issuer)
					.withIssuedAt(new Date(time))
					.withExpiresAt((new Date(time + expirationTime)))
					.withClaim("roles", objectMapper.writeValueAsString(user.getRoles().stream()
			     			.map(Role::getRoleShortName).collect(Collectors.toList())))
					.withClaim("email", user.getEmail())
					.withClaim("name", user.getName())
					.withClaim("userGUID", user.getUserGUID())
					.sign(algorithm));
			
		} catch (IllegalArgumentException | UnsupportedEncodingException | JWTCreationException | JsonProcessingException e) {
			throw e;
		}
    	
    	return getTokenWithTokenPrefix(token).toString();
	 }
	 
	 private static StringBuilder getTokenWithTokenPrefix(StringBuilder rawToken) {
	    	
    	if(rawToken == null) {
    		return null;
    	}
    	
    	rawToken.insert(0, " ").insert(0, tokenPrefix);
    	
    	return rawToken;
    	
	 }
	 
	 private static Object createAuthenticationObjectFromToken(String jwtToken) {     	          
	    	
	    	if(jwtToken == null) {
	    		return null;
	    	}
	    	
	     	jwtToken = getTokenWithoutTokenPrefix(jwtToken);
	        
	     	ObjectMapper objectMapper = new ObjectMapper();
	     	DecodedJWT decodedJwtToken;
	     	
			try {
				
				decodedJwtToken = JWT.decode(jwtToken);
				
			} catch (JWTDecodeException e1) {
				
				
				return null;
				
			}
				
			List<String> roles = null;
	     	
			try {
				roles = objectMapper.readValue(decodedJwtToken.getClaim("roles").asString(),
						new TypeReference<List<String>>(){});
			} catch (IOException e) {
				
			}
	     	
	     	User user = new User(decodedJwtToken.getClaim("userGUID").toString(), 
	     			decodedJwtToken.getClaim("name").toString(), 
	     			decodedJwtToken.getClaim("email").toString(), 
	     			null);
	     	
	     	List<String> authorities = null;
	     	
	     	if(roles!=null)
	     	{
	     		authorities = roles.stream()
		     			.map(String::new).collect(Collectors.toList());
	     	}
	         
	     	return null;
	         
	    }
	 
	 	private static String getTokenWithoutTokenPrefix(String rawToken) {
	    	
	    	if(rawToken == null) {
	    		return null;
	    	}
	    	
	    	StringBuilder stringBuilder = new StringBuilder(rawToken);
	    	
	    	stringBuilder.replace(0, tokenPrefix.length() + 1, "");    	
	    	return stringBuilder.toString();
	    	
	    }
	
}
