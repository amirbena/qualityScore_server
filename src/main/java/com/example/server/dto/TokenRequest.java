package com.example.server.dto;

public class TokenRequest {

    private String client_id="xhxgUDdxeLAHFGp0zml60cT4Pj8SRrIt5fhcusAFOt9NPZrGCs";
    private String client_secret= "2Zu2jzMqAey53iOxOGh4Qn2abEIXJF0VJY1F3kuH";
    private final String grant_type= "client_credentials";

    public TokenRequest() {
    }

    public String getClient_id() {
        return client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public String getGrant_type() {
        return grant_type;
    }
}
