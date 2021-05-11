package com.example.server.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet {

    private static final String IMAGE_PROPERTY="image";
    private static final String PET_NAME_JSON_PROPERTY="name";
    private static final String PET_PRIMARY_BREED="primaryBreed";
    private static final String PET_GENDER_PROPERTY="gender";
    private static final String PET_AGE_PROPERTY= "age";
    private static final String PET_ANIMAL_TYPE= "type";

    private String image;
    private String name;
    private String primaryBreed;
    private String gender;
    private String age;
    private String type;

    public Pet(@JsonProperty(IMAGE_PROPERTY) String image,
               @JsonProperty(PET_NAME_JSON_PROPERTY) String name,
               @JsonProperty(PET_PRIMARY_BREED) String primaryBreed,
               @JsonProperty(PET_GENDER_PROPERTY) String gender,
               @JsonProperty(PET_AGE_PROPERTY) String age,
               @JsonProperty(PET_ANIMAL_TYPE) String type) {

        this.image = image;
        this.name = name;
        this.primaryBreed = primaryBreed;
        this.gender = gender;
        this.age = age;
        this.type=type;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrimaryBreed() {
        return primaryBreed;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryBreed(String primaryBreed) {
        this.primaryBreed = primaryBreed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
