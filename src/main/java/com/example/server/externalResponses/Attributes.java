package com.example.server.externalResponses;

import java.io.Serializable;

public class Attributes implements Serializable {
    private boolean spayed_neutered;
    private boolean house_trained;
    private String declawed;
    private boolean special_needs;
    private boolean shots_current;

    public Attributes(boolean spayed_neutered, boolean house_trained, String declawed, boolean special_needs, boolean shots_current) {
        this.spayed_neutered = spayed_neutered;
        this.house_trained = house_trained;
        this.declawed = declawed;
        this.special_needs = special_needs;
        this.shots_current = shots_current;
    }

    public boolean isSpayed_neutered() {
        return spayed_neutered;
    }

    public void setSpayed_neutered(boolean spayed_neutered) {
        this.spayed_neutered = spayed_neutered;
    }

    public boolean isHouse_trained() {
        return house_trained;
    }

    public void setHouse_trained(boolean house_trained) {
        this.house_trained = house_trained;
    }

    public String getDeclawed() {
        return declawed;
    }

    public void setDeclawed(String declawed) {
        this.declawed = declawed;
    }

    public boolean isSpecial_needs() {
        return special_needs;
    }

    public void setSpecial_needs(boolean special_needs) {
        this.special_needs = special_needs;
    }

    public boolean isShots_current() {
        return shots_current;
    }

    public void setShots_current(boolean shots_current) {
        this.shots_current = shots_current;
    }
}
