package com.epam.vote.repository;

import com.epam.vote.domain.Restaurant;

import java.util.List;
/**
 * Mybatis restaurant mapper interface.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/07/2022
 *
 * @author Dzianis Zatsiupa
 */
public interface IRestaurantMapper {
    public Restaurant getRestaurantById(String id);
    public List<Restaurant> getAllRestaurants();
}
