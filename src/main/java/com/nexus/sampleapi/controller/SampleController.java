package com.nexus.sampleapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/v1")
    public ResponseEntity sample(){
        logger.info(" ### sample api");
        return new ResponseEntity("I'm aspyn", HttpStatus.OK);
    }
}
