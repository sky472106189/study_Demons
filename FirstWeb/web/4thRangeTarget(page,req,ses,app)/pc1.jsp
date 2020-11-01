<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=pageContext.getAttribute("hello")%>
    <%--得null是因为pageContext是当前页面有效，跳转后无效--%>
</body>
</html>
