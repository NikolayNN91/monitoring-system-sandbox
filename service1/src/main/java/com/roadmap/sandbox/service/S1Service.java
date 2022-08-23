package com.roadmap.sandbox.service;

import com.roadmap.sandbox.client.S1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S1Service {

    @Autowired
    private S1Client client;

    public String getService2Resource() {
        return client.getService2Resource();
    }
}
