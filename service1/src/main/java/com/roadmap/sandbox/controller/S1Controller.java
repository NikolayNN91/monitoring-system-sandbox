package com.roadmap.sandbox.controller;

import com.roadmap.sandbox.client.S1Client;
import com.roadmap.sandbox.service.S1Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class S1Controller {

    private static final Logger LOG = LoggerFactory.getLogger(S1Controller.class);

    @Autowired
    private S1Service service;

    @GetMapping
    public String getService2Resource() {
        LOG.info("****getService2Resource in S1Controller****");
        return service.getService2ResourceWithCoolnessLevel();
    }
}
