package com.example.server.controllers;

import com.example.server.data.GetPetsBody;

import com.example.server.data.Types;
import com.example.server.helpers.AllPetsHelper;
import com.example.server.helpers.AllTypesHelper;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.Map;

@RequestMapping("/api")
@RestController()
public class MainController {


    private final String EXTERNAL_API="https://api.petfinder.com/v2/";

    private RestTemplate restTemplate=new RestTemplate();

    private HttpEntity entity= AllPetsHelper.createEntityHttpHeaders(restTemplate,EXTERNAL_API);

    @GetMapping("/pets")
    public GetPetsBody getPets(@RequestParam Map<String,String> allRequestParams){
        try {
            URI uriBuildWithParams= AllPetsHelper.buildURIWithQueryParams(EXTERNAL_API,allRequestParams);
            String responseBody = restTemplate.exchange(uriBuildWithParams, HttpMethod.GET, this.entity, String.class).getBody();
            return AllPetsHelper.buildResponseAccordingExternalResponse(responseBody);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Response Can't convert to json"
            );
        }
    }

    @GetMapping("/petTypes")
    public Types getTypes(){
        String url= this.EXTERNAL_API+ "types";
        try{
            String responseBody = restTemplate.exchange(url, HttpMethod.GET, this.entity, String.class).getBody();
            return AllTypesHelper.getAllTypesAccordingHttpResponse(responseBody);
        }
        catch(Exception e){
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Response Can't convert to json"
            );
        }

    }
}
