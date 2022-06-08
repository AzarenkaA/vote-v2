package com.epam.vote.service;

import com.epam.vote.domain.Restaurant;

import java.util.List;

/**
 * Implements restaurant service.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/07/2022
 *
 * @author Dzianis Zatsiupa
 */
public class RestaurantService  extends AbstractRestaurantService{

    public Restaurant getById(String id){
        return this.getRestaurantDao().getById(id);
    }
    public List<Restaurant> getAll(){
        return this.getRestaurantDao().getAll();
    }
}
