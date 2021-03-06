<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Baseball Game</h1>

	<form action="friend_save.action" method="post">
		<fieldset>
			<legend>Register Player Name</legend>
			<label for="name">Name Kanji: </label> <input type="text"
				id="name_kanji" name="name_kanji" value="" tabindex="1"> <label
				for="age">Name Kana: </label><input type="text" id="name_kana"
				name="name_kana" tabindex="2">
			<div id="buttons">
				<label for="dummy"> </label> <input id="reset" type="reset"
					tabindex="4"> <input id="submit" type="submit" tabindex="5">
			</div>
		</fieldset>
	</form>

	<hr>
	<table>
		<tr>
			<th>id</th>
			<th>Name Kanji</th>
			<th>Name Kana</th>
		</tr>
		<c:forEach var="member" items="${members}">
			<tr>
				<td>${id}</td>
				<td>${name_kanji}</td>
				<td>${name_kana}</td>
			</tr>
		</c:forEach>

	</table>
	<hr>
	<P>The time on the server is ${serverTime}.</P>
</body>
</html>
