<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/16 0016
  Time: 7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
String path= request.getContextPath();
String basepath=  request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <title>$Title$</title>
    <base href="<%=basepath%>"/>
  </head>
  <p>This is index</p><br/>
  <a href="<%=basepath %>index.jsp">index.jsp</a><br/>

</html>
