package com.epam.vote.domain;

/**
 * Stores restaurant data.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/02/2022
 *
 * @author Dzianis Zatsiupa
 */
public class Restaurant extends Domain{
    private String id;
    private String name;
    private String address;
    private Integer places;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }
}
