package com.roadmap.sandbox.client;

import com.roadmap.sandbox.service.S1ClintService;
import com.roadmap.sandbox.service.S1Service;
import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.cloud.sleuth.instrument.async.TraceRunnable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class S1Client {

    private static final Logger LOG = LoggerFactory.getLogger(S1Client.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private S1ClintService service;

    @Timed
    public String getService2Resource() {
        LOG.info("getService2Resource");
        service.methodWithNewThread("some param");
        return restTemplate.getForObject("http://service2:8081/service2", String.class);
    }


}
