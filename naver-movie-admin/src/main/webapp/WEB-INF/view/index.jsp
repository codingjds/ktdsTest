<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<c:set var="date" value="<%= new Random().nextInt() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="./include/stylescript.jsp" />
</head>
<body>
	<div class="main-layout">
		<jsp:include page="./include/header.jsp" />
		<!-- jsp파일로 따로 생성하여 불러오는 방식 -->
		<!-- <div class="header bg-black">
			<ul class="nav">
				<li class="nav-item active">회원관리</li>
				<li class="nav-item ">영화관리</li>
				<li class="nav-item ">시스템관리</li>
			</ul>
			<div class="inline profile">
				이름 (Logout)
			</div>
		</div> -->
		
		<div>
			<jsp:include page="./include/sidemenu.jsp" />
			
			<jsp:include page="./include/content.jsp" />
				안녕하세요! aaa ${context} ${date} bbb
			<jsp:include page="./include/footer.jsp" />
		</div>
	
	</div>
		
</body>
</html>