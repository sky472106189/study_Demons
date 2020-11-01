<%@ page import="java.net.CookieHandler" %><%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务端</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("uname");
        String pwd = request.getParameter("upwd");
        if (name.equals("zs")&&pwd.endsWith("abc")){
            //登陆成功
            //只有登录成功，session中才会存在session-name/pwd
            session.setAttribute("session_name",name);
            session.setAttribute("session_pwd",pwd );

            //此时已经登录成功，调用getId方法能够得到服务端的sessionId
            System.out.println("sessionId"+session.getId());
            //session中的sessionIdB69F1C2123E60F0805A42C397C5002A5
            //再去查看a.jsp中的JSESSIONID

//            Cookie cookie = new Cookie("uname",name);
//            response.addCookie(cookie);
            //服务端在第一次响应客户端时，会发送一个JSESSIONID的cookie.
            //所以上面两行代码不需要写

            //拓展说明，有效非活动时间指的是页面不在进行操作了
            //比如你在淘宝购物，登录成功后，一直在浏览商品
            //然后去上厕所，电脑2小时没操作，此时淘宝账号就会自动注销
            // session.setMaxInactiveInterval(10); //有效非活动时间10秒

            //转发
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }
        else{
            //登录失败
            response.sendRedirect("login.jsp");//重定向
        }
    %>
</body>
</html>
