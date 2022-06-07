package com.epam.vote.domain.history;

import java.util.Date;

/**
 * Stores vote history data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class VoteHistory {
    private String userId;
    private String restaurantId;
    private Date voteDate;
    private String voteDataActionId;

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

    public Date getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(Date voteDate) {
        this.voteDate = voteDate;
    }

    public String getVoteDataActionId() {
        return voteDataActionId;
    }

    public void setVoteDataActionId(String voteDataActionId) {
        this.voteDataActionId = voteDataActionId;
    }
}
