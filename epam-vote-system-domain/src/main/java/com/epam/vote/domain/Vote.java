package com.epam.vote.domain;

import java.util.Date;

/**
 * Stores vote data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class Vote extends Domain{
    private String userId;
    private String restaurantId;
    private Date date;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
