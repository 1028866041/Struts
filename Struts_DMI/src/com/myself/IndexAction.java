package com.myself;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
public class IndexAction extends ActionSupport{

    public String execute() throws Exception {
        return "success";
        //super.execute();
    }

    public String add() throws Exception {
        System.out.println("IndexAction add");
        return "success";
    }
}
