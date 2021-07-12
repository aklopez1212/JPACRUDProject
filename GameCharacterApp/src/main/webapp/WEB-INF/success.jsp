<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success!</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
</head>
<body class="bg-dark">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">CRUD Project</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="home.do">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="create">Create Character</a></li>
			</ul>
		</div>
	</nav>


Success! You're character has been added to the database.<br>
<ul>
<li>Name: ${GameCharacter.name}</li>
<li>Race: ${GameCharacter.race}</li>
<li>Class: ${GameCharacter.charClass}</li>
<li>Faction: ${GameCharacter.faction}</li>
</ul>

<form action="delete.do" method="GET">
  <input type="hidden" name="id" value="${GameCharacter.id }"/> <input type="submit"
			value="Delete Character" />
	</form>
	
  <form action="updateChar.do" method="GET">
  <input type="hidden" name="id" value="${GameCharacter.id }"/> <input type="submit"
			value="Edit Character" />
	</form>

</body>
</html>