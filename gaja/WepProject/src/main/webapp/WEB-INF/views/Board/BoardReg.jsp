<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
    <title>클라우스</title>

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



<body style="padding-top:60px; background-color:#2c3338;">

<jsp:include page= "../include/navi.jsp"/> <!-- 상단바 -->


<div class="row">
	
	<div class="col-md-3"></div>
		
	<div class="col-md-6">
			
			<div class="row">
				
				<div class="col-md-12">		
					
					<div class="box box-primary">
						
						<div class="box-header">
						<h3 class="box-title">글쓰기</h3>
						</div>
			

					<form role="form" method="post"> 
					
					<div class="box-body">
						
						<div class="form-group" >
						<label for="exampleInputEmail1">제목</label> 
						<input type="text" name='title' class="form-control" placeholder="Enter Title">
						</div>
						
						<div class="form-group" >
						<label for="exampleInputPassword1">내용</label>
						<textarea class="form-control" name="content" rows="20" placeholder="Enter ..."></textarea>
						</div>
		
						<div class="form-group">
						<label for="exampleInputEmail1">글쓴이</label> 
						<input type="text" name="writer" class="form-control" placeholder="Enter Writer">
						</div>
				
						<div class="form-group">
						<label for="exampleInputEmail1">비밀번호</label> 
						<input type="password"	name="password" class="form-control" placeholder="Enter Writer">
						</div>
					</div>
	
					<div class="box-footer">
					<button type="submit" class="btn btn-primary">확인</button>
					</div>
					
					</form>
					
					</div>
	
				</div>


			</div>
	</div>
		
	<div class="col-md-3"></div>

</div>
     
     <script>
     
     function search(){

    		var keyword = $("#keyword").val();
    		location.href= "search?cate=all&keyword="+keyword;

    	}
     
     </script>
     
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>  

</body>
</html>