package com.circuitBracker;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class CircuitBreakerService {

    private final ExternalService externalService;

    public CircuitBreakerService(ExternalService externalService) {
        this.externalService = externalService;
    }

    @CircuitBreaker(name = "externalService", fallbackMethod = "fallbackResponse")
    public String getExternalData() {
        return externalService.callExternalApi();
    }

    public String fallbackResponse(Throwable t) {
        return "Fallback response: " + t.getMessage();
    }
}

