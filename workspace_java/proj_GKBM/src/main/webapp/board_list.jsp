<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
<hr>
	<table>
	<tbody id="content"></tbody>
	
		<c:forEach var="dto" items="${resultList}">
			<tr>
				<form method="post" action="todo">
				<td><input type=checkbox name="done" value="Y"></td>
				<td>${dto.todo_id}</td>
				<td>${dto.todo}</td>
				<td>${dto.create_date}</td>
				<td>${dto.modify_date}</td>
				<td>${dto.done}</td>
				<td>
				<input type="hidden" name="command" value="update">
				<input type="submit" value="수정" style="border-radius: 4px; background-color: #28a745; color: white; border: none" >
				</td>
				</form>
			</tr>
			
		</c:forEach>
		</table>

</body>
</html>