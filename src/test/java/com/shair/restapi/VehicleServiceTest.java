package com.shair.restapi;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;

import java.time.Year;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private final VehicleService vehicleService = new VehicleService();

    @Test
    void getAllMakes() {
    }

    @Test
    void getModelsForMake() {
    }

    @Test
    void getVehicleByVin() {
        Vehicle vehicle1 = new Vehicle("V123", "SUZUKI MOTOR OF AMERICA, INC", "SUZUKI", "XL7", Year.of(2007));
        Mockito.when(restTemplate.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/decodevinvalues/V123?format=json", VehicleList.class))
                .thenReturn(new VehicleList(Collections.singletonList(vehicle1)));

        Vehicle vehicle = vehicleService.getVehicleByVin("V123");
        assertEquals(vehicle1, vehicle);

    }
}