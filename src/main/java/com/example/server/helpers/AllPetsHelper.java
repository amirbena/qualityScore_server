package com.example.server.helpers;

import com.example.server.data.GetPetsBody;
import com.example.server.data.Pagination;
import com.example.server.data.Pet;
import com.example.server.dto.TokenRequest;
import com.example.server.dto.TokenResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Map;

public class AllPetsHelper {
    private static final String COUNT_PER_PAGE="count_per_page";
    private static final String TOTAL_COUNT= "total_count";
    private static final String CURRENT_PAGE="current_page";
    private static final String TOTAL_PAGES="total_pages";
    private static final String IMAGES="photos";
    private static final String NAME="name";
    private static final String BREEDS= "breeds";
    private static final String PRIMARY="primary";
    private static final String GENDER="gender";
    private static final String AGE="age";
    private static final String TYPE= "type";

    private static final String PAGINATION_BRANCH="pagination";
    private static final String PETS_BRANCH="animals";

    private static Pagination createPaginationFromPaginationNode(JsonNode paginationNode){
        int countPerPage= paginationNode.get(COUNT_PER_PAGE).asInt();
        int totalCount= paginationNode.get(TOTAL_COUNT).asInt();
        int currentPage= paginationNode.get(CURRENT_PAGE).asInt();
        int totalPages= paginationNode.get(TOTAL_PAGES).asInt();

        return new Pagination(countPerPage,totalCount,currentPage,totalPages);

    }

    private static ArrayList<Pet> createPetsArrayFromPetsNode(JsonNode petsNode){
        ArrayList<Pet> pets= new ArrayList<>();
        for (JsonNode petNode: petsNode) {
            JsonNode imagesArray=petNode.get(IMAGES);
            String image= imagesArray.size()> 0? imagesArray.get(0).get("medium").asText() :null;
            String name= petNode.get(NAME).asText();
            String primaryBreed= petNode.get(BREEDS).get(PRIMARY).asText();
            String gender= petNode.get(GENDER).asText();
            String age= petNode.get(AGE).asText();
            String type= petNode.get(TYPE).asText();
            pets.add(new Pet(image,name,primaryBreed,gender,age,type));
        }
        return pets;
    }

    public static HttpEntity createEntityHttpHeaders(RestTemplate restTemplate,String externalAPI){
        HttpHeaders tokenHeaders= new HttpHeaders();
        tokenHeaders.setContentType(MediaType.APPLICATION_JSON);
        TokenRequest tokenRequest= new TokenRequest();
        HttpEntity<TokenRequest> tokenEntity= new HttpEntity<TokenRequest>(tokenRequest,tokenHeaders);
        final String tokenUrl= externalAPI+ "oauth2/token";
        TokenResponse tokenResponse = restTemplate.postForObject(tokenUrl, tokenEntity, TokenResponse.class);
        HttpHeaders headers= new HttpHeaders();
        headers.add("Authorization", "Bearer "+tokenResponse.getAccessToken());

        HttpEntity entity = new HttpEntity(headers);
        return entity;
    }

    public static URI buildURIWithQueryParams(String baseUrl, Map<String,String> queryParams){
        String url= baseUrl+ "animals";
        URI uri=  UriComponentsBuilder.fromUriString(url)
                .buildAndExpand(queryParams).toUri();

       UriComponentsBuilder builder= UriComponentsBuilder.fromUri(uri);
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            builder= builder.queryParam(entry.getKey(),entry.getValue());
        }
        uri= builder.build().toUri();
        return uri;
    }
    public static GetPetsBody buildResponseAccordingExternalResponse(String externalResponse) throws JsonProcessingException {
        ObjectMapper mapper= new ObjectMapper();
        JsonNode node= mapper.readTree(externalResponse);

        JsonNode paginationNode= node.get(PAGINATION_BRANCH);
        JsonNode petsNode=node.get(PETS_BRANCH);
        Pagination pagination= createPaginationFromPaginationNode(paginationNode);
        ArrayList<Pet>pets= createPetsArrayFromPetsNode(petsNode);
        return new GetPetsBody(pets,pagination);
    }

}
