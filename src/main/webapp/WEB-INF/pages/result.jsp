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
        <th>id</th>
        <th>name</th>
        <th>address1</th>
        <th>address2</th>
        <th>phone</th>
        <th>city</th>
        <th>mail</th>
        <th>code</th>
        <th>fax</th>
        <th>credit limit</th>
    </tr>

    <c:forEach var="customer" items="${lines}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.address1}</td>
            <td>${customer.address2}</td>
            <td>${customer.phone}</td>
            <td>${customer.city}</td>
            <td>${customer.mail}</td>
            <td>${customer.zipCode}</td>
            <td>${customer.fax}</td>
            <td>${customer.creditLimit}</td>
        </tr>
    </c:forEach>
</table>

<form action="<c:url value="/find"/>">
    Input id: <input name="id"><br/>
    <input type="submit" value="find">
</form>

</body>
</html>
