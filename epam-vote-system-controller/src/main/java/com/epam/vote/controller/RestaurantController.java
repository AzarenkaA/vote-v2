package com.epam.vote.controller;

import com.epam.vote.service.RestaurantService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Process restaurant requests.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/07/2022
 *
 * @author Dzianis Zatsiupa
 */
@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    public void setRestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping(value =  "/restaurants", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllRestaurants(){
        ObjectMapper mapper = new ObjectMapper();

       try{
           return mapper.writeValueAsString(restaurantService.getAll());
       } catch (JsonProcessingException e) {
           throw new RuntimeException(e);
       }
    }
    @GetMapping(value =  "/restaurant.{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getRestaurantById(@PathVariable("id") String id){
        ObjectMapper mapper = new ObjectMapper();

        try{
            return mapper.writeValueAsString(restaurantService.getById(id));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
