package com.epam.vote.domain;

import java.math.BigDecimal;

/**
 * Stores menu data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class Menu extends Domain{
    private String restaurantId;
    private String mealId;
    private BigDecimal cost;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
