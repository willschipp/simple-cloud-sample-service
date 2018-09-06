package com.example.code.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class SampleEndpoint {

    @RequestMapping(method= RequestMethod.GET)
    public String hello() throws Exception {
        return "hello";
    }
}
