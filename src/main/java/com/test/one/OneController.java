package com.test.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {
	@RequestMapping("/hello")
    public String hello() {
        return "Hello India";
    }
}
