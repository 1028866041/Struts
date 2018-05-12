package com.myself.element;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class UserLogin1 extends ActionSupport {

    private Map request;
    private Map session;
    private Map application;

    public UserLogin1() {
        /*LocalTread方式*/
        this.request = (Map) ActionContext.getContext().get("request");
        this.session = ActionContext.getContext().getSession();
        this.application = ActionContext.getContext().getApplication();
    }

    public String login(){

        request.put("r","request");
        session.put("s","session");
        application.put("a","application");

        System.out.println("UserLogin1 login");
        return "success";
    }

}
