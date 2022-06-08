package com.epam.vote.repository;

import com.epam.vote.domain.Restaurant;

import java.util.List;

/**
 * Restaurant DAO interface.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/07/2022
 *
 * @author Dzianis Zatsiupa
 */
public interface IRestaurantDao {
    public Restaurant getById(String id);
    public List<Restaurant> getAll();
}
