package com.mskprojects.splitwise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity testResponse() {
        return ResponseEntity.ok("<h1> Splitwise </h1>" + " << Test Response >>");
    }
}
