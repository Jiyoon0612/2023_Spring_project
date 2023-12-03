<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="icon" href="${pageContext.request.contextPath}/images/logo-favicon.png">
  <!-- jQuery -->
  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <!-- jquery slick 슬라이더 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/js/slick/slick-theme.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/js/slick/slick.css">
  <script src="${pageContext.request.contextPath}/js/slick/slick.min.js"></script>
  <!-- 스크롤 애니메이션 wow.js -->
  <script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
  <!-- css/js -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
  <script src="${pageContext.request.contextPath}/js/custom.js"></script>
</head>
<body>
 <header>
      <div class="header-inner">
        <div class="logo">
          <a href="${pageContext.request.contextPath}/home"><img src="${pageContext.request.contextPath}/images/logo.png" alt="logo"></a>
        </div>
        <div class="gnb">
          <a href="${pageContext.request.contextPath}/home#feature1">서비스 소개</a>
          <a href="${pageContext.request.contextPath}/home#feature2">서비스 특징</a>
          <a href="${pageContext.request.contextPath}/home#feature4">자주묻는질문</a>
          <a href="${pageContext.request.contextPath}/boardmain">관련 정보</a>
          <a href="${pageContext.request.contextPath}/report">신고 페이지</a>
     <c:if test="${sessionScope.login == null}">
          <a href="${pageContext.request.contextPath}/loginView"><strong>로그인</strong></a>
          <a href="${pageContext.request.contextPath}/registView"><strong>회원가입</strong></a>
       </c:if>
          <c:if test="${sessionScope.login != null}">
				<a href="#"><strong>${sessionScope.login.memId}님</strong></a>
					<a href="${pageContext.request.contextPath}/logoutDo"><strong>로그아웃</strong></a>
				</c:if>
        </div>
      </div>
    </header>

</body>
</html>