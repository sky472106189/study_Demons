<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext</title>
</head>
<body>
    <%
        pageContext.setAttribute("hello","world");
        String name = (String)request.getAttribute("hello");
        System.out.println(name);
        //转发

    %>


</body>
</html>
