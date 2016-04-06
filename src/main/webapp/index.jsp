<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h5>Time counter since application start to pressing button.</h5>
<jsp:useBean id="calendar" class="java.util.GregorianCalendar"/>
<form name="Simple" action="timeaction" method="post">
    <input type="hidden" name="time" value="${calendar.timeInMillis}"/>
    <input type="submit" name="button" value="Calculate time"/>
</form>
</body>
</html>
