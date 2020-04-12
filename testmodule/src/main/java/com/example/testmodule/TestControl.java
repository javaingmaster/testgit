package com.example.testmodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {
    @GetMapping("/test")
    public String test() {
        System.out.println("shit!");
        return "OK!";
    }
}
