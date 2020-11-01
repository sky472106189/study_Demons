<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    欢迎您：
        <%
            //通过session拿到用户名
            String name = (String)session.getAttribute("session_name");
            //如果用户没有登录，而是直接通过地址栏访问welcome.jsp则必然获取到的name是null
            //如果没有登录，应该跳转登录页面
            //当用户登陆成功后，比如用Chrome登录成功，此时在地址栏访问welcome.jsp则访问到的name是zs
            //如果此时用户切换浏览器（IE），并且没有登录，而是直接在地址栏访问welcome.jsp
            //则访问到的name必然是null.
            if(name!=null) {
                out.println(name);
                System.out.println();
        %>
            <a href="logout.jsp" >注销</a>
        <%

            }else{
                response.sendRedirect("login.jsp"); //重定向
            }

        %>
</body>
</html>
