package com.epam.vote.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * "Show hello world message"
 *
 * Copyright (C) 2021
 *
 * Date:"04.06.2022"
 * @author Dzianis Zatsiupa
 * */

@RestController
public class TestController {

    @RequestMapping("*")
    public String helloWorld(){
        return "<h2 style=\"width:100%; padding:50px 0; text-align:center;\">Hello world</h2>";
    }
}
