<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:form modelAttribute="userForm" method="post" action="/user_service/show">
    <spring:input path="id"/>
    <spring:button>Check</spring:button>
</spring:form>
</body>
</html>
