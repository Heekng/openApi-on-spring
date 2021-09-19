package com.heekng.springOpenApiTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/api/sum.do")
    public String sum(
            @RequestParam String num1,
            @RequestParam String num2
    ){
        return Integer.parseInt(num1) + Integer.parseInt(num2) + "";
    }
}
