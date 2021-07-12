package com.example.admindashboard.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

//adding details to the Health indicator
@Component
public class dataBaseService implements HealthIndicator {
    private final String DATABASE_SERVICE = "DataBase service";

    @Override
    public Health health(){
        if (isDataBaseHealthGood()) {
            return Health.up().withDetail(DATABASE_SERVICE, "service is running").build();
        }
        return Health.down().withDetail(DATABASE_SERVICE, "service is not available").build();
    }

    private boolean isDataBaseHealthGood(){
        //logic
        return true;
    }
}
