package com.example.server.externalResponses;


import java.io.Serializable;

public class Colors implements Serializable {

    private String primary;
    private String secondary;
    private String tertiary;

    public Colors(String primary,String secondary, String tertiary) {
        this.primary = primary;
        this.secondary = secondary;
        this.tertiary = tertiary;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getTertiary() {
        return tertiary;
    }

    public void setTertiary(String tertiary) {
        this.tertiary = tertiary;
    }
}
