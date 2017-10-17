package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.customer.baseurl}")
    private String baseUrl;
    private String suffix = "customer";

    public String getCustomer() {
        return restTemplate.getForEntity( baseUrl + suffix, String.class).getBody();
    }
}
