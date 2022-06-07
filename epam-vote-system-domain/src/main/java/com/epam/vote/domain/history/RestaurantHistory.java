package com.epam.vote.domain.history;

/**
 * Stores restaurant history data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class RestaurantHistory {
    private String restaurant_id;
    private String restaurantDataActionId;

    public String getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(String restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurantDataActionId() {
        return restaurantDataActionId;
    }

    public void setRestaurantDataActionId(String restaurantDataActionId) {
        this.restaurantDataActionId = restaurantDataActionId;
    }
}
