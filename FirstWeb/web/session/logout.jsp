<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注销页面</title>
</head>
<body>
    <%
        session.invalidate();//注销全部（常用）
        // session.removeAttribute("session_name")//注销指定内容
        // 这个语句相当于只删除了session_name,还有session_pwd;

        response.sendRedirect("login.jsp");
    %>
</body>
</html>
