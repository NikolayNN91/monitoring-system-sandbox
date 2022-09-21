package com.roadmap.sandbox.service;

import com.roadmap.sandbox.client.S1Client;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.cloud.sleuth.instrument.async.TraceableExecutorService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class S1ClintService {

    private static final Logger LOG = LoggerFactory.getLogger(S1Service.class);

    @Autowired
    private TraceableExecutorService traceableExecutorService;

    @NewSpan
    public void methodWithNewThread(@SpanTag("testTag") String param) {
        LOG.info("starting methodWithNewThread");
        Runnable run = () -> {
            try {
                Thread.sleep(1000);
                LOG.info("run method with param: " + param);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        traceableExecutorService.execute(run);
    }
}
