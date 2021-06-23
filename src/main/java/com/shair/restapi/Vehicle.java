package com.shair.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Year;

public class Vehicle {

    @JsonProperty(value = "VIN")
    private String vin;
    @JsonProperty(value = "Manufacturer")
    private String manufacturer;
    @JsonProperty(value = "Make")
    private String make;
    @JsonProperty(value = "Model")
    private String model;
    @JsonProperty(value = "ModelYear")
    private Year year;

    public Vehicle(String vin, String manufacturer, String make, String model, Year year) {
        this.vin = vin;
        this.manufacturer = manufacturer;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
