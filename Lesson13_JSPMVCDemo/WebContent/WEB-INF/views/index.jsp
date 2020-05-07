<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CS472-WAP-Lesson13 JSP-MVC-Demo</title>
<!--    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cosmo/bootstrap.min.css" rel="stylesheet" integrity="sha384-uhut8PejFZO8994oEgm/ZfAv0mW1/b83nczZzSwElbeILxwkN491YQXsCFTE6+nx" crossorigin="anonymous">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="/Lesson13_JSPMVCDemo/css/style.css">
</head>
<body>
	<%@include file="/WEB-INF/fragments/header.jsp"%>
	
    <div class="container">
        <div class="jumbotron">
            <h1 class="display-3">Hello, world of Model II MVC Architecture!</h1>
            <h3>Welcome to Lesson 13 - Using JSPs and Servlets in an MVC design</h3>
            <p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
            <hr class="my-4">
            <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
            <p class="lead">
                <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
            </p>
        </div>
    </div>
    <footer class="footer">
        <div id="footer-content">
            <span class="text-muted">O. Kalu : : : CS472-WAP</span>
            <span style="float:right;" class="text-muted">&copy; May 2020</span>
        </div>
    </footer>
</body>
</html>
