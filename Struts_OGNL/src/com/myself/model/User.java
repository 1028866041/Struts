package com.myself.model;

/**
 * Created by Administrator on 2017/7/8 0008.
 */

public class User {

    /*Srping初始化user时Reflector使用无参构造器*/
    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }

    public User(User friend) {
        this.friend = friend;
    }

    private int id;
    private String name;
    private User friend;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }
}
