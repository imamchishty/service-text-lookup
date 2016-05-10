package com.demo.service.text.lookup.rest.controller;

import com.demo.service.text.lookup.rest.constant.ApiConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is an example controller with a feign client.
 */
@RestController
public class PingController {

    /**
     * Used to provide tools a HTTP 200 OK when service is running.
     */
    @RequestMapping(path = ApiConstants.API_PING)
    public ResponseEntity<String> ping(){
        return new ResponseEntity<>("Application is running.....", HttpStatus.OK);
    }


}