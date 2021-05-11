package com.example.server.externalResponses;

import java.io.Serializable;

public class Photo implements Serializable {
    private String small;
    private String medium;
    private String large;
    private String full;

    public Photo(String small, String medium, String large, String full) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.full = full;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }
}
