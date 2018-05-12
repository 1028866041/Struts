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
<body>
<p>user_error</p>
    <s>
        <!--未指定tag struts2默认添加-->
        <s:fielderror fieldName="name" theme="simple"/></br>
    </s>

    <p>value stack</p><br/>
    <!--在值栈中以obj.key方式找到value/相同key不同value以index区分-->
    <!--field由addFieldError指定/errors是值栈固有属性-->
    <!--<s:property value="errors.name[0]"/></br>
        <s:property value="#model"/></br>-->

    <p>context stack</p><br/>
    <s:property value="#parameters.t"/><br/>
    <s:property value="#parameters.r"/><br/>

    <s:debug></s:debug>
</body>
</html>
