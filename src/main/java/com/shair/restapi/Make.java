package com.shair.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Make {

    @JsonProperty(value = "Make_ID")
    private long id;
    @JsonProperty(value = "Make_Name")
    private String name;

    public Make(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
