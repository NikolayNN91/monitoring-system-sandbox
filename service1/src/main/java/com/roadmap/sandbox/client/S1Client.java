package com.roadmap.sandbox.client;

import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class S1Client {

    @Autowired
    private RestTemplate restTemplate;

    @Timed
    public String getService2Resource() {
        return restTemplate.getForObject("http://service2:8081/service2", String.class);
    }
}
