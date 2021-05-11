package com.example.server.controllers;

import com.example.server.data.GetPetsBody;
import com.example.server.data.Pagination;
import com.example.server.data.Pet;
import com.example.server.externalResponses.Animal;
import com.example.server.externalResponses.GetAnimalsResponse;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/api")
@RestController()
public class MainController {

    private final String EXTERNAL_API="https://api.petfinder.com/v2/";

    @Value("${Secret}")
    private String token;

    private RestTemplate restTemplate=new RestTemplate();

    private HttpEntity createEntityHttpHeaders(){
        HttpHeaders headers= new HttpHeaders();
        headers.add("Authorization", "Bearer "+token);
        HttpEntity entity = new HttpEntity(headers);
        return entity;
    }

    private HttpEntity entity= createEntityHttpHeaders();

    @GetMapping("/getPets")
    public GetPetsBody getPets(@RequestParam Optional<Map<String, String>> allRequestParams){
        String getAnimalsAPI = this.EXTERNAL_API + "animals";
        GetAnimalsResponse response= restTemplate.exchange(getAnimalsAPI, HttpMethod.GET,this.entity,GetAnimalsResponse.class,allRequestParams).getBody();
        Pagination pagination=new Pagination(response.getPagination().getCount_per_page(),response.getPagination().getTotal_count(),response.getPagination().getCurrent_page(),response.getPagination().getTotal_pages());
        ArrayList<Pet> pets= new ArrayList<Pet>();
        for(int i=0; i<response.getAnimals().size(); i++){
            Animal animal= response.getAnimals().get(i);
            String image= animal.getPhotos().get(0).getMedium();
            Pet pet= new Pet(image,animal.getName(),animal.getBreeds().getPrimary(),animal.getGender(),animal.getAge(),animal.getAnimalType());
            pets.add(pet);
        }
        GetPetsBody body= new GetPetsBody(pets,pagination);
        return body;
    }
}
