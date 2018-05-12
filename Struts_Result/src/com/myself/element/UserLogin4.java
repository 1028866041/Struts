package com.myself.element;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class UserLogin4 implements ServletRequestAware {

    private HttpServletRequest request;
    private HttpSession session;
    private ServletContext application;

    public String login(){

        request.setAttribute("r","request");
        session.setAttribute("s","session");
        application.setAttribute("a","application");

        System.out.println("UserLogin1 login");
        return "success";
    }

    @Override
    /*IOC方式注入*/
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
        this.session = request.getSession();
        this.application = session.getServletContext();
    }
}
