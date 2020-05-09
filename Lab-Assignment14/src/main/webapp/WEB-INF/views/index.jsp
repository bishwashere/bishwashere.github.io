<%--
  Created by IntelliJ IDEA.
  User: Owais Awan
  Date: 5/8/2020
  Time: 10:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.*"  %>
<%@ taglib prefix="ct" uri="http://cs.mum.edu/cs472/jsp/custom/core"%>

<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport"
        content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
        crossorigin="anonymous">

  <title>W3D4 - Lab 14 - JSP Custom Tags</title>
</head>
<body>

<%@include file="/WEB-INF/fragments/header.jsp"%>
	

<div class="w-75 m-auto jumbotron">
  <h1 class="display-4">W3D4 - Lab 14 - JSP Custom Tags</h1>
  <p class="lead">
  <pre>
	  Implement code to create a custom tag, currentDateTime that accepts two attributes (color and size) and
	  it prints the server's current date and time and formats it using the specified attribute values.
  </pre>
  </p>
  <hr class="my-4">
  <h1>Current Date: </h1>
  <ct:currDate color="red" size="44px"/>
  <h1>Current Time: </h1>
  <ct:currTime color="blue" size="20px"/>
</div>

<%@include file="/WEB-INF/fragments/footer.jsp"%>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script
        src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script
        src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</body>
</html>
