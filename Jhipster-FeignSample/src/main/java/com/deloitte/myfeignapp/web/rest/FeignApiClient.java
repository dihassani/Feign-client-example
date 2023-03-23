package com.deloitte.myfeignapp.web.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SAMPLEAPPWITHEUREKA", url = "http://localhost:9090")
public interface FeignApiClient {

    @GetMapping(value = "/api/sample-app-controller/getMessage")
    public String getMessage();
}
