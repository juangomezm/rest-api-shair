package com.shair.restapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MakeList {

    @JsonProperty(value = "Results")
    private List<Make> makes;

    public MakeList() {
        makes = new ArrayList<>();
    }

    public List<Make> getMakes() {
        return makes;
    }

}
