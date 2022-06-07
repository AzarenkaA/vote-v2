package com.epam.vote.domain.history;

/**
 * Stores user history data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class UserHistory {
    private String user_id;
    private String userDataActionId;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUserDataActionId() {
        return userDataActionId;
    }

    public void setUserDataActionId(String userDataActionId) {
        this.userDataActionId = userDataActionId;
    }
}
