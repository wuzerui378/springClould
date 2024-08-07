package com.example.servicea.client;

import org.springframework.stereotype.Component;

@Component
public class ServiceBClientFallback implements ServiceBClient {
    @Override
    public String getServiceBResponse() {
        return "Service B is unavailable. This is a fallback response.";
    }
}
