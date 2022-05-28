package com.company.business.concrete;

import com.company.business.abstracts.UserService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concrete.User;
import com.company.exceptions.BusinessException;

import java.util.Optional;

public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {

        if(!user.getEmail().isEmpty() &&
                user.getEmail().contains("@") &&
                !userDao.getUsers().contains(user) &&
                user.getFirstName().length()>=2 &&
                user.getLastName().length()>=2 &&
                user.getPassword().length()>=6
        ) {
            userDao.add(user);
            System.out.println("Kullanıcı eklendi: " + user.getEmail());
        }else {
            if(user.getEmail().isEmpty() ||
                    !user.getEmail().contains("@") ||
                    userDao.getUsers().contains(user) ) {
                throw new BusinessException("Email adresiniz geçersiz.");
            }
            if(user.getFirstName().length()<2) {
                throw new BusinessException("Adınız adınızı düzeltiniz.");
            }
            if(user.getLastName().length()<2) {
                throw new BusinessException("Soyadınız adınızı düzeltiniz.");
            }
            if(user.getPassword().length()<6){
                throw new BusinessException("Parolanız 6 karakterden kısa");
            }
            throw new BusinessException("Kayıt olunamadı");
        }
    }

    @Override
    public void login(String email, String password) {

        Optional<User> foundUser = userDao
                .getUsers()
                .stream()
                .filter(p -> p.getEmail().equals(email)).findFirst();

        if(!foundUser.isPresent()) {
            throw new BusinessException("Kullanıcı kayıtlı değil");
        }else {
            for (User user : userDao.getUsers()) {
                if(user.getEmail().equals(email)) {
                    if(user.getPassword().equals(password)) {
                        System.out.println("Giriş başarılı.");
                    }else {
                        throw new BusinessException("Kullanıcı adı şifre hatalı");
                    }
                }
            }
        }

    }


}
