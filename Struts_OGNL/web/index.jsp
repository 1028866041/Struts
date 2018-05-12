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

<html>
  <head>
    <title>$Title$</title>
    <base href="<%=basepath%>"/>
  </head>
  <body>
  <p>This is index</p>

  <%--只有传成员值User对象才会创建--%>
  <a href="ognl?user.id=1&user.name=zhangsan">user</a><br/>
  <a href="ognl?user.friend.id=2&user.friend.name=lisi">friend</a><br/>

  <ol>
    <%--访问成员变量、方法--%>
    <li>user.name:<s:property value="user.name"/></li>
    <li>friend.name:<s:property value="user.friend.name"/></li>
    <li>method get:<s:property value="user.friend.getName()"/></li>

    <%--静态成员--%>
    <li>static str:<s:property value="@com.myself.service.UserOGNL@str"/></li>
    <li>static method:<s:property value="@com.myself.service.UserOGNL@strmethod()"/></li>
    <li>math class:<s:property value="@@max{2,3}"/></li>

    <%--Map元组--%>
    <li>userMap:<s:property value="userMap"/></li>
    <li>userMap.user:<s:property value="userMap.user1"/>|<s:property value="userMap.friend.name"/></li>
    <%--<li>userMap.size:<s:property value="userMap.size()"/></li>--%>
    <li>userMap.key|values:<s:property value="userMap.keys"/>|<s:property value="userMap.values"/></li>

    <%--投影:即过滤器/其中过滤条件：
      (?#(满足条件所有项)、^#(满足条件第1个)、$#(满足条件最后一个))--%>
    <%--此处部署waring但可正常运行--%>
    <%--<li><a href="ognl?user.id=2&user.name=lisi">click</a><br/></li>
    <li>Filter:<s:property value="user.{?#this.name='lisi'}.{name}"/></li>
    <li>(^#):<s:property value="user.{^#this.id>1}.{name}"/></li>
    <li>($#):<s:property value="user.{$#this.id>1}.{name}"/></li>
    <li>(==):<s:property value="user.{$#this.id>0}.{name}==null"/></li>--%>

    <%--Struts.xml可能定义多个Action:
    <li>OGNL action[]:<s:property value="[0].user.name"></li>--%>
  </ol>

  <s:debug></s:debug>
</html>
