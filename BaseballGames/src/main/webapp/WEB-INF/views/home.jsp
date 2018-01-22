<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Baseball Games</h1>

	<p>type: ${type}</p>

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

	<ul>
		<li>id: ${id}</li>
		<li>Kanji: ${name_kanji}</li>
		<li>Kana: ${name_kana}</li>
	</ul>

	<P>The time on the server is ${serverTime}.</P>
</body>
</html>
