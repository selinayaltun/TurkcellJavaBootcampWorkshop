package com.company.business.abstracts;

import com.company.entities.concrete.User;

public interface UserService {
    public void register(User user);
    public void login(String email,String password);
}
