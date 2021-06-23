package com.shair.restapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleList {

    @JsonProperty(value = "Results")
    private List<Vehicle> vehicles;

    public VehicleList() {
        vehicles = new ArrayList<>();
    }

    public VehicleList(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
