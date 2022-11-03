package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/hello/{name}")
    String helloName(@PathVariable("name") String name) {
        return "Hello, " + name;
    }

    @PostMapping("/hello")
    String helloNameBody(@RequestBody RequestData data) {
        return "Hello, " + data.name;
    }






}
