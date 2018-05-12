package com.myself.element;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/6/18 0018.
 */
public class UserLogin3 extends ActionSupport {

    private HttpServletRequest request;
    private HttpSession session;
    private ServletContext application;

    public UserLogin3() {
        /*依servlet依次找request/session/application*/
        request = ServletActionContext.getRequest();
        session = request.getSession();
        application = session.getServletContext();
    }

    public String login(){

        request.setAttribute("r","request");
        session.setAttribute("s","session");
        application.setAttribute("a","application");

        System.out.println("UserLogin1 login");
        return "success";
    }
}
