package com.epam.vote.domain.history;

/**
 * Stores menu history data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class MenuHistory {
    private String restaurantId;
    private String mealId;
    private String menuDataActionId;

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

    public String getMenuDataActionId() {
        return menuDataActionId;
    }

    public void setMenuDataActionId(String menuDataActionId) {
        this.menuDataActionId = menuDataActionId;
    }
}
