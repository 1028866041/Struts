package com.myself.vo;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/6/17 0017.
 */
public class UserVO extends ActionSupport {

        private String name="";
        private String passwd="";
        private String passwdconfirm="";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
            System.out.println("name="+name);
        }

        public String getPasswd() {
            return passwd;
        }

        public String getPasswdconfirm() {
            return passwdconfirm;
        }

        public void setPasswd(String passwd) {
            this.passwd = passwd;
            System.out.println("passwd="+passwd);
        }

        public void setPasswdconfirm(String passwdconfirm) {
            this.passwdconfirm = passwdconfirm;
        }
}
