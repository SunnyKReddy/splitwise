package com.mskprojects.splitwise.controller;

import com.mskprojects.splitwise.services.InitService;
import com.mskprojects.splitwise.services.InitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitializeSplitwiseController {
    @Autowired
    private InitService initService;
    @GetMapping("/initsplitwise")
    public ResponseEntity initializesw() {
        initService.initializeSplitwise();
        return ResponseEntity.ok("<h1> Initialized Splitwise Successfully! </h1>");
    }
}
