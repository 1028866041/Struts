package com.myself.service;

import com.myself.model.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/7 0007.
 */
public class UserOGNL extends ActionSupport {

    User user;
    public static String str = "string";
    public Map<String, User> userMap = new HashMap<String, User>();

    public UserOGNL() {
        userMap.put("user1",new User("zhangsan"));
        userMap.put("user2",new User("lisi"));
        userMap.put("friend",userMap.get("user1").getFriend());

    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String excute(){

        return "success";
    }

    public String toString(){

        return user.getId()+" "+user.getName();
    }

    public static String strmethod(){

        return "strmethod";
    }
}
