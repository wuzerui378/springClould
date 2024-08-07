package com.example.servicea;
import com.example.servicea.client.ServiceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @Autowired
    private ServiceBClient serviceBClient;

    @GetMapping("/api/service-a")
    public String callServiceB() {
        return serviceBClient.getServiceBResponse();
    }
}