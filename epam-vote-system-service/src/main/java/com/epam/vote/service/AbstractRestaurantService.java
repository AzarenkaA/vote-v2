package com.epam.vote.service;

import com.epam.vote.repository.IRestaurantDao;


/**
 * Restaurant abstract service contains common parameters.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/07/2022
 *
 * @author Dzianis Zatsiupa
 */
public abstract class AbstractRestaurantService {
    private IRestaurantDao restaurantDao;
    public IRestaurantDao getRestaurantDao() {
        return restaurantDao;
    }
    public void setRestaurantDao(IRestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }
}
