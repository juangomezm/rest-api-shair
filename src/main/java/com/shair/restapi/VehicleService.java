package com.shair.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    public RestTemplate restTemplate;

    public List<Make> getAllMakes(){
        MakeList response = restTemplate.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json", MakeList.class);
        return response.getMakes();
    }

    public List<Model> getModelsForMake(String make){
        ModelList response = restTemplate.getForObject(String.format("https://vpic.nhtsa.dot.gov/api/vehicles/getmodelsformake/%s?format=json", make), ModelList.class);
        return response.getModels();
    }

    public Vehicle getVehicleByVin(String vin){
            VinValidator.isVinValid(vin);
            VehicleList response = restTemplate.getForObject(String.format("https://vpic.nhtsa.dot.gov/api/vehicles/decodevinvalues/%s?format=json", vin), VehicleList.class);
            return response.getVehicles().get(0);
//            ResponseEntity<VehicleList> response = restTemplate.getForEntity(String.format("https://vpic.nhtsa.dot.gov/api/vehicles/decodevinvalues/%s?format=json", vin), VehicleList.class);
//            return response.getStatusCode() == HttpStatus.OK ? response.getBody().getVehicles().get(0) : null;
    }
}
