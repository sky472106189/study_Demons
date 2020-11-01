<%--
  Created by IntelliJ IDEA.
  User: 15173
  Date: 2020/3/2
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>
    <%--比较特殊，虚拟路径为空，一般是/abcdef--%>
    <%="当前项目的虚拟路径："+application.getContextPath()+"<br/>"%>
    <%--查到虚拟路径后，再根据虚拟路径查绝对路径--%>
    <%="当前项目的绝对路径："+application.getRealPath("")%>
    <%--绝对路径：C:\Users\15173\IdeaProjects\com.demons\out\artifacts\FirstWeb_war_exploded\--%>
</body>
</html>
