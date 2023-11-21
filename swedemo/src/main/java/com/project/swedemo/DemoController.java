package com.project.swedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
		return "hello";
    }
    @GetMapping("/hello2")
    public String err() {
		return "error";
    }
}