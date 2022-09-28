<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
        }

        td, th {
            padding: 5px;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h2>Customer details</h2>

<table>
    <tr>
        <th>Phone number</th>
        <th>Credit limit</th>
    </tr>

    <tr>
        <td>${res.phone}</td>
        <td>${res.creditLimit}</td>
    </tr>

</table>

<a href="<c:url value="/myServlet"/>">all</a>

</body>
</html>
