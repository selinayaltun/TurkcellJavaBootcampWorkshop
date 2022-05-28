package com.company.dataAccess.concrete;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concrete.User;

import java.util.ArrayList;

public class UserHibernateDao implements UserDao {

    ArrayList<User> arrayList = new ArrayList<>();

    @Override
    public void add(User user) {
        arrayList.add(user);
    }

    @Override
    public ArrayList<User> getUsers() {
        return arrayList;
    }
}
