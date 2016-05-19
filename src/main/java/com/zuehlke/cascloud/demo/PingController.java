package com.zuehlke.cascloud.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class PingController {
    @RequestMapping(method= RequestMethod.GET, value="/ping")
    public String ping() {
        return "empty pong";
    }

    @RequestMapping(method= RequestMethod.GET, value="/ping/{value}")
    public String ping(@PathVariable("value") String value) {
        return "pong: " + value;
    }
}