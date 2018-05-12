<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/16 0016
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix=""%>
<head>
    <title>Title</title>
</head>

<p>user_login</p>

<ol>
    <li>ActionSupport上下文</li>
    <li>IOC方式 ..Aware</li>
    <li>容器 HttpServletRequest..</li>
    <li>IOC方式 ServletRequestAware..</li>

</ol>
<form name="f" action="user_login.jsp" method="post">
    name:<input type="text" name="name"><br/>
    password:<input type="password" name="password"/>
<br/>

<input type="button" value="submit1" onclick="javascript:document.f.action='/login1';document.f.submit()">
<input type="button" value="submit2" onclick="javascript:document.f.action='/login2';document.f.submit()">
<input type="button" value="submit3" onclick="javascript:document.f.action='/login3';document.f.submit()">
<input type="button" value="submit4" onclick="javascript:document.f.action='/login4';document.f.submit()">
</form>

<br/><br/>
<s:debug></s:debug>

</body>
</html>
