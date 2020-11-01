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
    <title>session</title>
</head>
<body>
<%
    session.setAttribute("hello","world");
    String name = (String)session.getAttribute("hello");
    System.out.println(name);
    //转发
    //request.getRequestDispatcher("se1.jsp").forward(request,response);
    //重定向还是会取到world
    //因为session是同一次对话有效，只有切换/关闭浏览器才会丢失数据
    response.sendRedirect("se1.jsp");
%>
</body>
</html>
