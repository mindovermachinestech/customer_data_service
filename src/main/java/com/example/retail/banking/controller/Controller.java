package com.example.retail.banking.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
public class Controller {

    @GetMapping("/customer-data")
    public String generateCustomLog(@RequestParam String message) {
        log.info("Customer log message: {}", message);
        return "Log generated!";
    }

}
