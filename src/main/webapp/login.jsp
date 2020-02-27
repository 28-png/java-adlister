<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mattmurphy
  Date: 2/26/20
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:choose>
    <c:when test="${pageContext.request.isUserInRole('admin')}">
        <c:redirect url="/profile.jsp"/>
    </c:when>

</c:choose>



<form method="post" action="login.jsp" style="margin: 5px">
    <label for="username" style="margin: 2px">Username</label>
    <input id="username" type="text" style="margin:  2px" placeholder="Username"> <br>
    <label for="password" style="margin: 2px">Password</label>
    <input id="password" type="password" style="margin: 2px" placeholder="Password">
    <button type="submit">submit</button>
</form>
</body>
</html>
