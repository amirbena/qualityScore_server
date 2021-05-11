package com.example.server.externalResponses;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

class AnimalLinks implements Serializable{
    private Link self;
    private Link type;
    private Link organization;

    public AnimalLinks(Link self, Link type, Link organization) {
        this.self = self;
        this.type = type;
        this.organization = organization;
    }

    public Link getSelf() {
        return self;
    }

    public void setSelf(Link self) {
        this.self = self;
    }

    public Link getType() {
        return type;
    }

    public void setType(Link type) {
        this.type = type;
    }

    public Link getOrganization() {
        return organization;
    }

    public void setOrganization(Link organization) {
        this.organization = organization;
    }
}

public class Animal implements Serializable {


    private int id;
    private String organizationId;
    private String externalUrl;
    private String animalType;
    private String species;
    private Breeds breeds;
    private Colors colors;
    private String age;
    private String gender;
    private String size;
    private String coat;
    private Attributes attributes;
    private Environment environment;
    private ArrayList<String> tags;
    private String name;
    private String description;
    private ArrayList<Photo> photos;
    private ArrayList<Video> videos;
    private String status;
    private Concat concat;
    private LocalDateTime published_at;
    private AnimalLinks _Animals_links;

    public Animal(int id, String organizationId, String externalUrl, String animalType, String species, Breeds breeds, Colors colors, String age, String gender, String size, String coat, Attributes attributes, Environment environment, ArrayList<String> tags, String name, String description, ArrayList<Photo> photos, ArrayList<Video> videos, String status, Concat concat, LocalDateTime published_at, AnimalLinks _Animals_links) {
        this.id = id;
        this.organizationId = organizationId;
        this.externalUrl = externalUrl;
        this.animalType = animalType;
        this.species = species;
        this.breeds = breeds;
        this.colors = colors;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.coat = coat;
        this.attributes = attributes;
        this.environment = environment;
        this.tags = tags;
        this.name = name;
        this.description = description;
        this.photos = photos;
        this.videos = videos;
        this.status = status;
        this.concat = concat;
        this.published_at = published_at;
        this._Animals_links = _Animals_links;
    }

    public int getId() {
        return id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Breeds getBreeds() {
        return breeds;
    }

    public void setBreeds(Breeds breeds) {
        this.breeds = breeds;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Concat getConcat() {
        return concat;
    }

    public void setConcat(Concat concat) {
        this.concat = concat;
    }

    public LocalDateTime getPublished_at() {
        return published_at;
    }

    public void setPublished_at(LocalDateTime published_at) {
        this.published_at = published_at;
    }

    public AnimalLinks get_links() {
        return _Animals_links;
    }

    public void set_links(AnimalLinks _Animals_links) {
        this._Animals_links = _Animals_links;
    }
}
