package com.circuitBracker;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExternalService {
    public String callExternalApi() {
        if (new Random().nextInt(10) > 4) { // Simulate 50% chance of failure
//            throw new RuntimeException("External API failed!");
            return  "data failed";
        }
        return "External API call success!";
    }
}