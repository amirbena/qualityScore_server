package com.example.server.externalResponses;

import java.util.ArrayList;

public class GetAnimalsResponse {
    private ArrayList<Animal>animals;
    private  Pagination pagination;

    public GetAnimalsResponse(ArrayList<Animal> animals, Pagination pagination) {
        this.animals = animals;
        this.pagination = pagination;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
