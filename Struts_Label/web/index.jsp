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
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>

<html>
  <head>
    <title>$Title$</title>
    <base href="<%=basepath%>"/>
  </head>
  <body>
  <p>This is index</p>
  <a href="label?user.id=1&user.name=mc">user</a>
  <a href="index.jsp">back</a><br/>

  <a href="label?username=zhangsan">username</a>
  <a href="index.jsp">back</a><br/>
  <li>
    <li>username:<s:property  value="username"/></li>
    <li>username string:<s:property value="'username'"/></li>
    <li>default:<s:property value="admin" default="username"/></li>
    <li>HTML set:<s:property value="'<hr/>'" escape="true"/></li>

    <li>set:<s:set var="admin" value="admin"/></li>
    <!--#request同时放入request与context栈-->
    <li>context statck:<s:property value="#request.username"/></li>
    <li>get #key:<s:property value="#admin"/></li>

    <li>set context:<%=pageContext.getAttribute("username")%></li>
    <li>set scope:<s:set var="admin" value="username" scope="application"/><%--<s:debug/>--%></li>

    <!--s:bean对象在ContextStack创建到标签结束即出栈-->
    <li>s:bean<s:bean name="com.myself.service.UserLabel" var="user">
      <s:param name="admin" value="username"></s:param>
      <s:property value="admin"/><s:debug/>
    </s:bean></li>

    <li>fielderror:<s:fielderror fieldName="fielderror.test" theme="simple"></s:fielderror></li>
    <li>iteraor:
      <s:iterator value="#{1:'a',2:'b',3:'c'}" var="x">
        <s:property value="#x.key"/>|<s:property value="#x.value"/>
      </s:iterator></li><br/>

    <li>s:form
      <s:form>
        <s:textfield name="form"></s:textfield>
      </s:form>
    </li>

  </ol>
  <s:debug/>
</html>
