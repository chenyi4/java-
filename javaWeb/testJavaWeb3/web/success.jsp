<%--
  Created by IntelliJ IDEA.
  User: chenyi
  Date: 2020/8/14
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>成功页面</title>
</head>
<body>
${xiaoxi} <br>
<a href="FindUserList">查看所有用户</a>
</body>
</html>