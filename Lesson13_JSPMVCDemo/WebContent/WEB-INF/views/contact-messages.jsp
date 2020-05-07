<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>CS472-WAP-Lesson13 JSP-MVC-Demo</title>
<!--    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cosmo/bootstrap.min.css" rel="stylesheet" integrity="sha384-uhut8PejFZO8994oEgm/ZfAv0mW1/b83nczZzSwElbeILxwkN491YQXsCFTE6+nx" crossorigin="anonymous">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="/Lesson13_JSPMVCDemo/css/style.css">
</head>
<body>
	<%@include file="/WEB-INF/fragments/header.jsp"%>
	
    <div class="container"><br>
	    <h2>List of Contact Messages</h2>
	    <br>
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Customer Name</th>
                <th scope="col">Gender</th>
                <th scope="col">Category</th>
                <th scope="col">Message</th>
                <th scope="col">&nbsp;</th>
                <th scope="col">&nbsp;</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="contactData" items="${contactMessages}" varStatus="iteration">
                    <tr>
                        <th scope="row"><c:out value="${iteration.index+1}"></c:out>.</th>
                        <td><c:out value="${contactData.customerName}"></c:out></td>
                        <td><c:out value="${contactData.gender}"></c:out></td>
                        <td><c:out value="${contactData.category}"></c:out></td>
                        <td><c:out value="${contactData.message}"></c:out></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <%-- <%= LocalDate.of(2020, 4,9) %>  Expression Language (EL) and JavaServerPages standard Tag Lib (JSTL) --%>
    </div>
    <footer class="footer">
        <div id="footer-content">
            <span class="text-muted">O. Kalu : : : CS472-WAP</span>
            <span style="float:right;" class="text-muted">&copy; May 2020</span>
        </div>
    </footer>
</body>
</html>