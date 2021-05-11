package com.example.server.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class GetPetsBody {
    private static final String PETS_PROPERTY="pets";
    private static final String PAGINATION_PROPERTY= "pagination";

    private ArrayList<Pet> pets;
    private Pagination pagination;

    public GetPetsBody(@JsonProperty(PETS_PROPERTY) ArrayList<Pet> pets, @JsonProperty(PAGINATION_PROPERTY) Pagination pagination) {
        this.pets = pets;
        this.pagination = pagination;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
