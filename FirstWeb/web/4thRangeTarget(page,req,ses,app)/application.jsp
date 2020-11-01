<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>
<%
    application.setAttribute("hello","world");
    String name = (String)application.getAttribute("hello");
    System.out.println(name);
    //转发
    //request.getRequestDispatcher("se1.jsp").forward(request,response);
    //重定向还是会取到world
    //因为application是最大范围的对象,对同一个项目有效
    response.sendRedirect("ap1.jsp");
%>
</body>
</html>
