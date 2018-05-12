<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/16 0016
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
    <title>Title</title>
</head>

<p>user_success</p>
<br/>

    <!--对contextStack用#key方式获得value/或从r\s\a获取-->
    <!--而实际测试request/session/application.getAttribute()不可行-->
    <s:property value="#request.r"></s:property>| <s:property value="#attr.r"></s:property>
    <s:property value="#session.s"></s:property>| <s:property value="#attr.s"></s:property>
    <s:property value="#application.a"></s:property>| <s:property value="#attr.a"></s:property>

    <br/>
    <s:debug></s:debug>
</body>
</html>
