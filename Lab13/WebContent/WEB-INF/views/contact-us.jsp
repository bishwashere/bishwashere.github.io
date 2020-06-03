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

	<div class="w-75 m-auto">
		<h4 class="mt-3 mb-3">Customer Contact Form</h4>
		
		<c:forEach var="error" items="${errors}">
				<div class="d-block invalid-feedback">${error}</div>
		</c:forEach>
		
		<form action="process-contact-form"  method="POST" >
			<div class="form-group">
				<label for="name">*Name</label>
				<input type="text" class="form-control" id="name" name="name"
					 placeholder="John H Smith" value="${customerName}">
			</div>
			<div class="form-group">
				<label>*Gender</label>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="gender-male" value="Male" ${gender=='Male'?'checked':''} >
					<label class="form-check-label mr-5" for="gender-male">Male</label>

					<input class="form-check-input" type="radio" name="gender"
						id="gender-female" value="Female" ${gender=='Female'?'checked':''}>
					<label class="form-check-label" for="gender-female">Female</label>
				</div>
			</div>
			<div class="form-group">
				<label for="category">*Category</label>
				<select class="form-control" id="category" name="category">
				<option value="" <c:if test="${category == ''}"> <c:out value= "selected=selected"/></c:if>>select</option>
		    	<option value="Feedback" <c:if test="${category == 'Feedback'}"> <c:out value= "selected=selected"/></c:if>>Feedback</option>
				<option value="Inquiry" <c:if test="${category == 'Inquiry'}"> <c:out value= "selected=selected"/></c:if>>Inquiry</option>
				<option value="Complaint" <c:if test="${category == 'Complaint'}"> <c:out value= "selected=selected"/></c:if>>Complaint</option>
				
				</select>
			</div>
			<div class="form-group">
				<label for="message">*Message</label>
				<textarea class="form-control" id="message" name="message" rows="3"><c:out value="${message}"></c:out></textarea>
			</div>
			<div class="form-group">
				<button type="submit" class=" w-100 btn btn-primary">Submit</button>
			</div>
		</form>
		
	<div class="container">
		<span class="text-muted">Hit Count for this page:  <c:out value="${contactHitCount}"></c:out> </span><span style="float:right;" class="text-muted">Total Hit Count for the entire WebApp: <c:out value="${totalHitCount}"></c:out></span>
	</div>

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