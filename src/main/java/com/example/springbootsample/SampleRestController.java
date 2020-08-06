package com.example.springbootsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!!";
    }
}
