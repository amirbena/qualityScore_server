package com.example.server.externalResponses;

import java.io.Serializable;

public class Environment implements Serializable {

    private boolean children;
    private boolean dogs;
    private boolean cats;

    public Environment(boolean children, boolean dogs, boolean cats) {
        this.children = children;
        this.dogs = dogs;
        this.cats = cats;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public boolean isDogs() {
        return dogs;
    }

    public void setDogs(boolean dogs) {
        this.dogs = dogs;
    }

    public boolean isCats() {
        return cats;
    }

    public void setCats(boolean cats) {
        this.cats = cats;
    }
}
