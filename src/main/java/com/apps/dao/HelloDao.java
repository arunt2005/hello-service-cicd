package com.apps.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

    public String getData() {
        return "Data returned from Dao";
    }

}
