package com.circuitBracker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    private final CircuitBreakerService circuitBreakerService;

    public CircuitBreakerController(CircuitBreakerService circuitBreakerService) {
        this.circuitBreakerService = circuitBreakerService;
    }

    @GetMapping("/api/test")
    public String testCircuitBreaker() {
        return circuitBreakerService.getExternalData();
    }
}