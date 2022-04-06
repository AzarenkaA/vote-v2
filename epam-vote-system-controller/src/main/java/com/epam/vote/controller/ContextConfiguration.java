package com.epam.vote.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Dzianis Zatsiupa
 *
 * */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.epam.vote.controller"})
public class ContextConfiguration {

}
