package com.example.server.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Types{
    private ArrayList<String> types;

    public Types(@JsonProperty("types") ArrayList<String> types) {
        this.types = types;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }
}