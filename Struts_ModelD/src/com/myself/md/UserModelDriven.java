package com.myself.md;

import com.myself.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class UserModelDriven extends ActionSupport implements ModelDriven<User>{

    private User user = new User();

    public String add(){

        System.out.println("name="+user.getName());
        System.out.println("age="+user.getAge());
        return "success";
    }

    /*class接口ModelDriven<User>是泛型*/
    public User getModel() {
        return user;
    }

}
