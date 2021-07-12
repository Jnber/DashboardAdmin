package com.example.admindashboard.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// making a custom endpoint

//the id gives you the name used in the path /actuator/custom
@Endpoint(id = "custom")
@Component
public class CustomActuator {

    @ReadOperation
    public Map<String, String> customEndpoint (String username){
        Map<String, String> map = new HashMap<>();
        map.put("state", "okay");
        map.put("name", username);
        return map;
    }
}
