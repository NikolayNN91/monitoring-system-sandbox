package com.roadmap.sandbox.service;

import com.roadmap.sandbox.client.S1Client;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class S1Service {

    private final S1Client client;
    private final AtomicInteger coolnessLevel;

    public S1Service(S1Client client, MeterRegistry meterRegistry) {
        this.client = client;
        coolnessLevel = new AtomicInteger();
        meterRegistry.gauge("applicationCoolnessLevel", coolnessLevel);
    }

    public String getService2ResourceWithCoolnessLevel() {
        coolnessLevel.set(getApplicationCoolnessLevel());
        return client.getService2Resource() + ": " + coolnessLevel + "%";
    }

    @Timed
    public Integer getApplicationCoolnessLevel() {
        try {
            System.out.println(".zzZZ");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (int) (100 + Math.round(Math.random() * 100));
    }
}
