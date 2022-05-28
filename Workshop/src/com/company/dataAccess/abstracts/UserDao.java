package com.company.dataAccess.abstracts;

import com.company.entities.concrete.User;

import java.util.ArrayList;

public interface UserDao {
    public void add(User user);
    public ArrayList<User> getUsers();
}
