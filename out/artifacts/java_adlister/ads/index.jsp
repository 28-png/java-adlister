<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mattmurphy
  Date: 2/27/20
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="ads" scope="request" type="java.util.List"/>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
       <p>Description: ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
