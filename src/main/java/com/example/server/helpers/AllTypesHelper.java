package com.example.server.helpers;

import com.example.server.data.Types;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;



public class AllTypesHelper {

    private static final String BREEDS= "breeds";
    private static final String TYPE_NAME="name";
    public static Types getAllTypesAccordingHttpResponse(String externalResponse) throws JsonProcessingException {
        ObjectMapper mapper= new ObjectMapper();
        JsonNode node= mapper.readTree(externalResponse);

        JsonNode typesNodes= node.get(BREEDS);
        ArrayList<String>types= new ArrayList<>();
        for(JsonNode typeNode: typesNodes){
            String name= typeNode.get(TYPE_NAME).asText();
            types.add(name);
        }
        return new Types(types);
    }
}
