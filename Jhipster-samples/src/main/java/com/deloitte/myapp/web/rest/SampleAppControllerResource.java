package com.deloitte.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleAppControllerResource controller
 */
@RestController
@RequestMapping("/api/sample-app-controller")
public class SampleAppControllerResource {

    private final Logger log = LoggerFactory.getLogger(SampleAppControllerResource.class);

    /**
     * GET displayMessage
     */
    @GetMapping("/getMessage")
    public String displayMessage() {
        return "Welcome to Spring boot - Message from Service-1";
    }
}
