package com.txw.webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TestController {

    @RequestMapping("/v1")
    public String toV1(){
        return "v1";
    }
}
