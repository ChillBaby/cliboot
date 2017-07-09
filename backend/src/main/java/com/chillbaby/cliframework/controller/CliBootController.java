package com.chillbaby.cliframework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliapi")
public class CliBootController {
    @GetMapping
    public String welcomeMessage() {
        return "CliBoot up and running ...";
    }
}