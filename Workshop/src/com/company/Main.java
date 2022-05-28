package com.company;

import com.company.business.concrete.UserManager;
import com.company.dataAccess.concrete.UserHibernateDao;
import com.company.entities.concrete.User;

public class Main {

    public static void main(String[] args) {
        User user = new User(1,"Hakan","Durmaz","hakan@mail.com","156234327");
        User user2 = new User(1,"Selinay","Yılmaz","selinay@mail.com","156234327");
        UserManager userManager = new UserManager(new UserHibernateDao());
        userManager.register(user);
        userManager.register(user2);

        userManager.login( "selinay@mail.com","156234327");
        userManager.login( "seliay@mail.com","15234327");
        userManager.login( "hakan@mail.com","156234327");

    }
}
