package com.myself.element;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class UserLogin2 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {

    private Map<String,Object> request;
    private Map<String,Object> session;
    private Map<String,Object> application;

    public String login(){

        request.put("r","request");
        session.put("s","session");
        application.put("a","application");

        System.out.println("UserLogin1 login");
        return "success";
    }

    /*实现Request/Session/ApplicationAware接口由Strust2调用set方法*/
    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session= session;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }
}

