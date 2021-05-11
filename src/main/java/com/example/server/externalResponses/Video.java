package com.example.server.externalResponses;

import java.io.Serializable;

public class Video  implements Serializable {
    private String embed;

    public Video(String embed) {
        this.embed = embed;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }
}
