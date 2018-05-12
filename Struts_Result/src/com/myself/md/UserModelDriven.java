package com.myself.md;

import com.myself.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class UserModelDriven extends ActionSupport implements ModelDriven<User>{

    private String name;
    private User user = new User();
    private String r;
    private int type;

    public String add(){
        name = user.getName();

        if(name == null || name.equals("admin")){
            this.addFieldError("name", "user error");
            this.addFieldError("name", "user.name error");
            System.out.println("name error");
            return "error";
        }

        System.out.println("name="+user.getName());
        System.out.println("age="+user.getAge());
        return "success";
    }

    /*class接口ModelDriven<User>是泛型*/
    public User getModel() {
        return user;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getR() {
        return r;
    }

    public void setType(int t) {
        this.type = t;
    }

    public int getType() {
        return type;
    }

    /*测试global-results*/
    public String execute() throws Exception{

        if(0 == type)
        {
            r = "/user_error.jsp";
        }else{
            r = "/user_success.jsp";
        }
        return "defaultpage";
    }


}
