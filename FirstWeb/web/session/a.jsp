<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第二次请求页面</title>
</head>
<body>
    <%
        out.print(session.getAttribute("session_name"));

        //验证登陆成功后sessionId=JSESSIONID
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies) {
            if(cookie.getName().equals("JSESSIONID")){//cookie中name:value对应.
                System.out.println("JSESSIONID"+cookie.getValue());//输出在DOS窗口
            }//JSESSIONB69F1C2123E60F0805A42C397C5002A5
        }

    %>
</body>
</html>
