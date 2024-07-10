package com.example.jpa_basics;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    private int userid;
    private String name;
   private  int age;
    private String mobile;
 user()
{
}

    public user(int userid, String name, int age, String mobile) {
        this.userid = userid;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}



