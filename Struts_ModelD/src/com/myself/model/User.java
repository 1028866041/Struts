package com.myself.model;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
public class User {

    private String name ="";
    private int age;

    public String add(){
        return "success";
    }

    public String delete(){
        return "success";
    }

    public void setName(String name){
        this.name = name;
        System.out.println("name="+name);
    }

    public void setAge(int age){
        this.age = age;
        System.out.println("age="+age);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
