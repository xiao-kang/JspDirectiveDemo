<%@page isELIgnored="false"%>
<%@ page language="java"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="connor" uri="http://connor.com/jsp/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>JSP DIRECTIVES DEMO</title>
</head>
<body>
<%
    request.setAttribute("students",new String[]{"jack","lily","lilei"});
%>
<connor:now/>
<br>
<h2>迭代指令</h2>
<connor:iterator items="${students}" var="name">
    当前学生为：${name}<br>
</connor:iterator>
<br>
<h2>判定指令1</h2>
<connor:choose>
    <connor:if test="${1==1}">
        <div>1==1</div>
    </connor:if>
    <connor:if test="${2==2}">
        <div>2==2</div>
    </connor:if>
   <connor:otherwise>
       <div>没有选中</div>
   </connor:otherwise>
</connor:choose>
<h2>判定指令2</h2>
<connor:choose>
    <connor:if test="${1==2}">
        <div>1==2</div>
    </connor:if>
   <connor:otherwise>
       <div>没有选中</div>
   </connor:otherwise>
</connor:choose>
<br>
<h2>修改子标签</h2>
<connor:change>
    <strong>修改前</strong>
</connor:change>
</body>
</html>
