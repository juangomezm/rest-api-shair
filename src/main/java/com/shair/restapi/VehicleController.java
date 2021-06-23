package com.shair.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/makes")
    public List<Make> getAllMakes(){
        return vehicleService.getAllMakes();
    }

    @GetMapping("/modelsformake")
    public List<Model> getModelsForMake(@RequestParam(value = "make") String make){
        return vehicleService.getModelsForMake(make);
    }

    @GetMapping("/vehiclebyvin")
    public Vehicle getVehicleByVin(@RequestParam(value = "vin") String vin){

        try {
            return vehicleService.getVehicleByVin(vin);
        } catch (RuntimeException exc){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, String.format("Vehicle with VIN %s not found", vin), exc);
        }
    }
}
