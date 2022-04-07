package com.epam.vote.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Shows hello world message.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:04/07/2022
 *
 * @author Dzianis Zatsiupa
 */

@RestController
public class TestController {

    @RequestMapping("/*")
    public String helloWorld(){
        return "<h2 style=\"width:100%; padding:50px 0; text-align:center;\">Hello world</h2>";
    }
}
