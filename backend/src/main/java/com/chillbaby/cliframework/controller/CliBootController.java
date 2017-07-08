package com.chillbaby.cliframework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gaurav Rai Mazra
 * <a href="http://www.gauravbytes.com">Catch me</a>
 */
@RestController
public class CliBootController {
    @GetMapping
    public String welcomeMessage() {
        return "CliBoot up and running ...";
    }
}