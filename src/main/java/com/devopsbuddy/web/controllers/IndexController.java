package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cpatel on 9/19/17.
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
