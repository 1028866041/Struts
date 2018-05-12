package com.myself.dto;

import com.myself.model.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/6/17 0017.
 */
public class UserDTO extends ActionSupport{

    /*Struts自动new USer()/jsp url->user.*/
    private User user;

    public String add(){

        System.out.println("name="+user.getName());
        System.out.println("age="+user.getAge());
        return "success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
