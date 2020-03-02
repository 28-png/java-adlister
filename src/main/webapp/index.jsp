<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<<<<<<< HEAD
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
=======
    <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Welcome to my site!" />
   </jsp:include>
</head>
<body>
   <jsp:include page="partials/navbar.jsp" />
>>>>>>> mvc-exercise
    <div class="container">
        <h1>Welcome to the Adlister!</h1>
    </div>
</body>
</html>