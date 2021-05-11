package com.example.server.externalResponses;

import java.io.Serializable;

class Link implements Serializable {
    private String href;

    public Link(String href) {
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}

