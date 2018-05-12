package com.myself.service;

import com.myself.model.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/7/7 0007.
 */
public class UserLabel extends ActionSupport {

    private User user;
    private String username;
    private String admin;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAdmin() {
        return admin;
    }

    public String excute(){

        return "success";
    }

    public String toString(){

        return user.getId()+" "+user.getName();
    }
}
