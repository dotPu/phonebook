<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h1>전화번호부</h1>
<form action="/insert">
이름:<input type="text" id="name" name="name"><br>
전화번호:<input type="text" id="hp" name="hp"><br>
메모:<input type="text" id="memo" name="memo"><br>
<input type="submit" value="전화번호입력">
</form>
<br>
<form action="/find">
검색:<input type="text" id="search" name="search">
<input type="submit" value="검색"><br>
</form>


<table border="1">
	<thead>
		<tr>
			<td>아이디번호</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>메모</td>
		</tr>
	</thead>
	
	<c:choose>
	<c:when test="${not empty findlist}">
	<c:forEach var="findlist" items="${findlist}">
	<tbody>
		<tr onclick="location.href='/findOne?idx=${findlist.idx}'">
			<td>${findlist.idx}</td>
			<td>${findlist.name}</td>
			<td>${findlist.hp}</td>
			<td>${findlist.memo}</td>
		</tr>
	</tbody>
	</c:forEach>
	</c:when>
	
	<c:otherwise>
	<c:forEach var="list" items="${list}">
	<tbody>
		<tr onclick="location.href='/findOne?idx=${list.idx}'">
			<td>${list.idx}</td>
			<td>${list.name}</td>
			<td>${list.hp}</td>
			<td>${list.memo}</td>
		</tr>
	</tbody>
	</c:forEach>
	</c:otherwise>
	</c:choose>

	
</table>
<br>
<form action="/update">
<input type="hidden" id="idx" name="idx" value="${phonebook.idx}">
이름:<input type="text" id="name" name="name" value="${phonebook.name}"><br>
전화번호:<input type="text" id="hp" name="hp" value="${phonebook.hp}"><br>
메모:<input type="text" id="memo" name="memo" value="${phonebook.memo}"><br>
<input type="submit" value="수정">
<button onclick="location.href='/delete?idx=${phonebook.idx}'">삭제</button>
</form>
</body>
</html>