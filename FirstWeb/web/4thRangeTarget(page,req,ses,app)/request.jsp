<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request</title>
</head>
<body>
    <%
        request.setAttribute("hello","world");
        String name = (String)request.getAttribute("hello");
        System.out.println(name);
        //转发
        request.getRequestDispatcher("rq1.jsp").forward(request,response);
        //重定向还是会取到null
        //response.sendRedirect("rq1.jsp");
    %>
</body>
</html>
