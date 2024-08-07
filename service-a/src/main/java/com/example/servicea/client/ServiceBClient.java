package com.example.servicea.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b", fallback = ServiceBClientFallback.class)
public interface ServiceBClient {
    @GetMapping("/api/service-b")
    String getServiceBResponse();
}
