package com.ibrahimciftci.eCommerce.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String hellloWorld(){
        return "Hello World from private endpoint.";
    }

    @GetMapping("/user")
    public String hellloWorldUser(){
        return "Hello World from user private endpoint.";
    }

    @GetMapping("/admin")
    public String hellloWorldAdmin(){
        return "Hello World from admin private endpoint.";
    }
}
