<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<style>
  .card-img-top {
    height: 180px; /* 원하는 이미지 높이로 조절하세요 */
    width: auto; /* 가로 너비 자동 조정 */
  }
  .text-center{
	margin-top :17px;
	margin-bottom : 17px;
  }
  #loadMoreButton {
  width: 140px;
  height: 45px;
  font-family: 'Roboto', sans-serif;
  font-size: 11px;
  text-transform: uppercase;
  letter-spacing: 2.5px;
  font-weight: 500;
  color: #000;
  background-color: #fff;
  border: none;
  border-radius: 45px;
  box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
  transition: all 0.3s ease 0s;
  cursor: pointer;
  outline: none;
}
/* 버튼 호버 스타일 */
#loadMoreButton:hover {
  background-color: #7ac8f5;
  box-shadow: 0px 15px 20px rgba(133, 205, 253, 0.4);
  color: #fff;
  transform: translateY(-7px);
}
</style>
<body> 
<%@include file="/WEB-INF/inc/hometop.jsp" %>

<div class="row row-cols-1 row-cols-md-3 g-4" style="max-width: 800px; margin: 0 auto;">
  <c:forEach items="${boardList2}" var="board" varStatus="loop">
    <div class="col" style="${loop.index > 8 ? 'display: none;' : ''}">
      <div class="card h-100">
        <img src="https://species.nibr.go.kr${board.url}" class="card-img-top" alt=".
        ..">
        <div class="card-body">
          <h5 class="card-title"><strong>${board.name}</strong></h5>
          <p class="card-text">${board.ename}</p>
          <p class="card-text">${board.rank}</p>
        </div>
        <div class="card-footer">
          <small class="text-body-secondary">${board.classes}</small>
        </div>
      </div>
    </div>
  </c:forEach>
</div>
<div class="text-center">
  <button id="loadMoreButton" class="btn btn-primary"><strong>더 보기</strong></button>
</div>
<!-- top point -->
  <a class="btn-top" href="#"><i class="xi-angle-up-thin"></i></a>		
 <%@include file="/WEB-INF/inc/footer.jsp" %>
</body>
<script>
  let currentPage = 1;
  const itemsPerPage = 9;

  document.getElementById('loadMoreButton').addEventListener('click', function() {
    loadMoreItems();
  });

  function loadMoreItems() {
    const hiddenItems = document.querySelectorAll('.col[style="display: none;"]');
    for (let i = 0; i < itemsPerPage; i++) {
      const item = hiddenItems[i];
      if (item) {
        item.style.display = 'block';
      }
    }
    currentPage++;
  }
</script>
</html>