package com.example.admindashboard.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class loggerService implements HealthIndicator {
    private final String LOGGER_SERVICE = "Logger service";

    @Override
    public Health health(){
        if (isLoggerHealthGood()) {
            return Health.up().withDetail(LOGGER_SERVICE, "service is running").build();
        }
        return Health.down().withDetail(LOGGER_SERVICE, "service is not available").build();
    }

    private boolean isLoggerHealthGood(){
        //logic
        return true;
    }
}
