<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/boardmain.css">
<title>분류 별 정보</title>

</head>
<body>
<div class="container">
<%@include file="/WEB-INF/inc/hometop.jsp" %>
</div>
<section class="welcome">
  <div class="wrapper" >
    <h1 class ="main-text">멸종 위기종</h1>
    <p>분류군 별 정보를 클릭해 주세요</p>
    <p></p>
    <div class="circle__row">
    <a href="${pageContext.request.contextPath}/boardView2">
      <div class="circle">
    	<img class="circle--image" src="${pageContext.request.contextPath}/images/animal_fox.png">
        <div class="circle--text">멸종 위기에 처한 동물 자세히보기</div>
    </div>
    </a>
    <a href="${pageContext.request.contextPath}/boardView">
    <div class="circle">
        <img class="circle--image" src="${pageContext.request.contextPath}/images/plant_icon.png">
        <div class="circle--text">멸종 위기에 처한 식물 자세히보기</div>
    </div>
     </a>
    <a href="${pageContext.request.contextPath}/boardView3">
    <div class="circle">
        <img class="circle--image" src="${pageContext.request.contextPath}/images/fish_icon.png" />
        <div class="circle--text">멸종 위기 양서류/어류 자세히보기</div>
    </div>
     </a>
  </div>
  </div>
  <hr>
  <div class="wrapper">
    <h1 class ="main-text2">외래생물, 생태계교란 생물</h1>
    <p>분류군 별 정보를 클릭해 주세요</p>
    <p></p>
    <div class="circle__row">
    <a href="${pageContext.request.contextPath}/rboardView">
      <div class="circle">
        <img class="circle--image" src="${pageContext.request.contextPath}/images/balckfish_icon.png"/>
        <div class="circle--text">생태계 교란 파괴 양서류&어류&파충류<br>자세히보기</div>
    </div>
    </a>
    <a href="${pageContext.request.contextPath}/rboardView2">
    <div class="circle">
        <img class="circle--image" src="${pageContext.request.contextPath}/images/plants.png" />
        <div class="circle--text">생태계 교란 파괴 식물 자세히보기</div>
    </div>
    </a>
    <a href="${pageContext.request.contextPath}/rboardView3">
    <div class="circle">
        <img class="circle--image" src="${pageContext.request.contextPath}/images/spider.png" />
        <div class="circle--text">생태계 교란 파괴 곤충&무척추동물<br>자세히보기</div>
    </div>
    </a>
  </div>
  </div>
  </section>

<%@include file="/WEB-INF/inc/footer.jsp" %>
</body>
</html>