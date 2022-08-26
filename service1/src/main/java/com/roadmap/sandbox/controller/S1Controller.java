package com.roadmap.sandbox.controller;

import com.roadmap.sandbox.service.S1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class S1Controller {

    @Autowired
    private S1Service service;

    @GetMapping
    public String getService2Resource() {
        return service.getService2ResourceWithCoolnessLevel();
    }
}
