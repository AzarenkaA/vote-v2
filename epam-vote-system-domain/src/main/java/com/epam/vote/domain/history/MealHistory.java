package com.epam.vote.domain.history;

/**
 * Stores meal history data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class MealHistory {
    private String mealId;
    private String mailDataActionId;

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public String getMailDataActionId() {
        return mailDataActionId;
    }

    public void setMailDataActionId(String mailDataActionId) {
        this.mailDataActionId = mailDataActionId;
    }
}
