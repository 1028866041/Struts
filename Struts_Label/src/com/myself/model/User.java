package com.myself.model;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
/**
 * Created by Administrator on 2017/7/8 0008.
 */

public class User {

    public User() {
    }

    private int id;
    private String name;

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
}
