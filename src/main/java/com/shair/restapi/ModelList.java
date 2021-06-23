package com.shair.restapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelList {

    @JsonProperty(value = "Results")
    private List<Model> models;

    public ModelList() {
        models = new ArrayList<>();
    }

    public List<Model> getModels() {
        return models;
    }
}
