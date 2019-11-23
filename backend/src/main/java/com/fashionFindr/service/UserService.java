package com.fashionFindr.service;

import com.fashionFindr.dao.UserDao;
import com.fashionFindr.model.Post;
import com.fashionFindr.model.User;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
//    change the qualifieer to correct name when database is connected
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User addUser(User user){
//        return userDao.insertUser(user);
        System.out.println("insert user service");
        return userDao.save(user);
    }

    public void saveOrUpdateUser(User user){
        userDao.save(user);
    }
//
//    public List<User> getAllUser(){
//        return userDao.selectAllUser();
//    }
//
//    public int updateReputation(String username, int change_in_reputation){
//        return userDao.updateReputation(username, change_in_reputation);
//    }
//
//    public User getUserFromUsername(String username){
//        System.out.println("getting user with username");
//        return userDao.getUserByUsername(username);
//    }
//
//    public List<Post> getUserFavorites(User user){
//        return  userDao.getUserFavorites(user);
//    }
//
//    public List<Post> getUserMatches(User user){
//        return userDao.getUserMatches(user);
//    }
//
//    public List<Post> getUserPost(User user){
//        return userDao.getUserPost(user);
//    }

    public User getUserInfo(String username){
//        return userDao.getUserInfo(username);
        System.out.println("getuserinfo user service");

        return userDao.findByUsername(username);
    }


}
