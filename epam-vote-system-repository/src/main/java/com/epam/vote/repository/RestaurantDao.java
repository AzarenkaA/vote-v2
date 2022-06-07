package com.epam.vote.repository;

import com.epam.vote.domain.Restaurant;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Get restaurant data from database.
 *<p/>
 * Copyright (C) 2017 epam.com
 *<p/>
 * Date:06/07/2022
 *
 * @author Dzianis Zatsiupa
 */
public class RestaurantDao implements IRestaurantDao{
    @Override
    public Restaurant getById(String id){
        SqlSessionFactory sqlSessionFactory;
        IRestaurantMapper restaurantMapper;
        Reader reader = null;
        Restaurant restaurant = null;
        try {
            //Читаем файл с настройками подключения и настройками MyBatis
            reader = Resources
                    .getResourceAsReader("mybatis/configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //Создаем маппер, из которого и будем вызывать методы getSubscriberById и getSubscribers
            restaurantMapper = sqlSessionFactory.openSession().getMapper(IRestaurantMapper.class);
            restaurant = restaurantMapper.getRestaurantById(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return restaurant;
    }
    @Override
    public List<Restaurant> getAll(){
        SqlSessionFactory sqlSessionFactory;
        IRestaurantMapper restaurantMapper;
        Reader reader = null;
        List<Restaurant> restaurants = null;
        try {
            //Читаем файл с настройками подключения и настройками MyBatis
            reader = Resources
                    .getResourceAsReader("mybatis/configuration.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //Создаем маппер, из которого и будем вызывать методы getSubscriberById и getSubscribers
            restaurantMapper = sqlSessionFactory.openSession().getMapper(IRestaurantMapper.class);
            restaurants = restaurantMapper.getAllRestaurants();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return restaurants;
    }
}
