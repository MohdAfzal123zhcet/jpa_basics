package com.example.jpa_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {
    @Autowired
    userrepository ur;
    public String adduser(user u)
    {
       ur.save(u);
       return "user added";
    }
    public List<user> getAllUsers(user u)
    {
        return ur.findAll();
    }
    public user getuser(int userid)
    {
       return ur.findById(userid).get();
    }
}
