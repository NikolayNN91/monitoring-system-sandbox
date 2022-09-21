package com.roadmap.sandbox.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class S2Controller {

    private static final Logger LOG = LoggerFactory.getLogger(S2Controller.class);

    @GetMapping
    public String getService2Resource() {
        try {
            LOG.info("getService2Resource");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Resource from Service2";
    }
}
