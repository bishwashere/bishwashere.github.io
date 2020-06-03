<%--
  Created by IntelliJ IDEA.
  User: Owais Awan
  Date: 5/8/2020
  Time: 10:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!doctype html>
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

<title>CS472-W3D1 - Assignment 11 - Java Servlet</title>
</head>
<body>

<%@include file="/WEB-INF/fragments/header.jsp"%>


	<div class="card w-75 mt-3 ml-auto mr-auto">
		<h5 class="card-header">Thank you! Your message has been received as follows</h5>
		<div class="card-body">
			<h5 class="card-title">Name: <c:out value="${contactDetail.customerName}"></c:out></h5>
			<p class="card-text">Gender: <c:out value="${contactDetail.gender}"></c:out></p>
			<p class="card-text">Category: <c:out value="${contactDetail.category}"></c:out> </p>
			<p class="card-text">Message: <c:out value="${contactDetail.message}"></c:out> </p>
			Please feel free to <a href="contact-form" >Contact Us</a> again
		</div>
	</div>
	
	<div class="container">
		<span class="text-muted">Hit Count for this page:  <c:out value="${thankHitCount}"></c:out> </span><span style="float:right;" class="text-muted">Total Hit Count for the entire WebApp: <c:out value="${totalHitCount}"></c:out></span>
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