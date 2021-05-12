package com.example.server.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenResponse {

    private static final String TOKEN_TYPE= "token_type";
    private static final String EXPIRES_IN= "expires_in";
    private static final String ACCESS_TOKEN= "access_token";

    private String tokenType;
    private int expiresIn;
    private String accessToken;

    public TokenResponse(@JsonProperty(TOKEN_TYPE) String tokenType, @JsonProperty(EXPIRES_IN) int expiresIn,@JsonProperty(ACCESS_TOKEN) String accessToken) {
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }
}
