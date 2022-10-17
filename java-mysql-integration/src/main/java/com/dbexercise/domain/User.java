package com.dbexercise.domain;

import java.sql.*;
import java.util.Map;

public class User {
    private String id, name, password;


    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

}
