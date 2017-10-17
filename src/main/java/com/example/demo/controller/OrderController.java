package com.example.demo.controller;


import com.example.demo.service.CustomerService;
import com.example.demo.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private LogisticsService logisticsService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String getOrder() {
        return "Order id: XXX";
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET, headers = "api-version=2")
    public String getOrderV2() {
        return "V2: order id: XXX" + customerService.getCustomer() + ", " + logisticsService.getLogistics();
    }
}
