<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
    <title></title>

    <!-- 부트스트랩 -->
    <link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- 메인css -->
    <link href="/resources/css/main.css" rel="stylesheet">

    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  
  </head>

<% String id = (String)session.getAttribute("id"); %>

<body style="padding-top:60px; background-color:#2c3338;">
<jsp:include page= "../include/navi.jsp"/> <!-- 상단바 -->
	 
	 
	<!-- 시작 -->
	
	
	
<!-- Main content -->

<div class="row">
	
	<div class="col-md-3"></div>
	
	<div class="col-md-6">
		<div class="box box-primary">
			
			<div class="box-header">
			<h3 class="box-title">Modify</h3>
			</div>
			

			<form role="form" method="post">
			<div class="box-body">
				
				<div class="form-group">
				<label for="exampleInputEmail1">Title</label> <input type="text" 
				name='title' class="form-control" value="${board.title}">
				</div>
		
				<div class="form-group">
					<label for="exampleInputPassword1">Content</label>
				<textarea class="form-control" name="content" rows="3">${board.content}</textarea>
				</div>
		
				<div class="form-group">
				<label for="exampleInputEmail1">PassWord</label> <input type="password" name="password" class="form-control">
				</div>

			</div>

			<input type = "hidden" name="page" value = "${cri.page}">
			<input type = "hidden" name="perPageNum" value = "${cri.perPageNum}">
			<input type = "hidden" name="searchType" value = "${cri.searchType}">
			<input type = "hidden" name="keyword" value = "${cri.keyword}">
	
			</form>



			<div class="box-footer">
			<button type="submit" class="btn btn-primary">SAVE</button>
			<button type="submit" class="btn btn-warning">CANCEL</button>
			</div>


		</div>
	</div>
	
	<div class="col-md-3"></div>
	
</div>





<script>
	$(document).ready(function() {

		var formObj = $("form[role='form']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
			self.location = "/board?page=${cri.page}&perPageNum=${cri.perPageNum}&searchType=${cri.searchType}&keyword=${cri.keyword}";
		});

		$(".btn-primary").on("click", function() {
			formObj.submit();
		});

	});
	
	
	
	function search(){

		var keyword = $("#keyword").val();
		location.href= "search?cate=all&keyword="+keyword;

	}
	
</script>


    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>  
</body>

</html>
