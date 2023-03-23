package com.deloitte.myfeignapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FeignControllerResource controller
 */
@RestController
@RequestMapping("/api/feign-controller")
@EnableFeignClients
public class FeignControllerResource {

    @Autowired
    private FeignApiClient feignApiClient;

    private final Logger log = LoggerFactory.getLogger(FeignControllerResource.class);

    /**
     * GET getMessage
     */
    @GetMapping("/display-message")
    public String getMessage() {
        return "This message is from 2nd Springboot app";
    }

    @GetMapping(value="/getMessageFromRemoteService")
    public String getMessageFromRemoteService(){
        return feignApiClient.getMessage();
    }
}
