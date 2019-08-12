<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String result = (String)request.getAttribute("result"); //메세지값 가져오기 
    String id = (String)session.getAttribute("id");
    %>
   
<!DOCTYPE html>
<html>

<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>  
    var result = "<%=result%>"
    if(result=="null"|| result==null){} else {alert(result);}
    
    
</script>
</head>
 
<meta charset="UTF-8">
   <!-- Font Awesome -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- Author Custom CSS -->
    <link rel="stylesheet" href="/resources//css/main.css" type="text/css" />
        
</head>

<body class='align'>
                                       

    <div class="site__container site__margin">
      <div class="grid__container">
        <div style="text-align:center;"><img id="logo-img" style="width: 100%;max-height: 100%" src="" /><span style="color: rgb(238, 130, 238);"><strong><span style="font-size: 24px;"></span></strong></span></div>
      </div>
      <div class="grid__container">
        <form class="form form--search" onSubmit="return false">
          <input id="keyword" type="text" autofocus placeholder="Search your fassion" onkeypress="if(isEnterPressed()){goCategoryPage();}"/>
          <span id="rec-button" class="rec--button"><i class="fa fa-microphone"></i></span>
        </form>
      </div>
      <div class="grid__container">
        <form class="form form--search" onSubmit="return false">
          <div class="form__field"><input type="submit" value="SEARCH" onclick="search(); return false"/></div>
        </form>
      </div>
      
      
      <div class="grid__container">
        <form class="form form--login" action="login" method="get">
        
        <%if(id==null){ %>
	<div class="form__field"><input type="submit" value="LOGIN" onclick="location.href='login'; return false" /></div>
		<%} else { %>

	<div class="form__field"><input type="submit" value="LOGOUT" onclick="location.href='logout'; return false" /></div>
		<%} %>
		
		
		<%if("admin".equals(id)){ %>
		<br>
		<div class="form__field"><input type="submit" value="상품업로드" onclick="location.href='upload'; return false" /></div>
		
		<%} %>


</form>
      </div>

      <div class="category__button">
        <a href="/list?cate=top"><img src="https://image-logo.alba.kr/data_image2/jobimg/201806/2018060217200649270_0.png" alt="top" ></a>
        <a href="/list?cate=bottom"><img src="https://image-logo.alba.kr/data_image2/jobimg/201806/2018060217215922063_0.png" alt="pants"></a>
        <a href="/list?cate=shoes"><img src="https://image-logo.alba.kr/data_image2/jobimg/201806/2018060217340466831_0.png" alt="shoes"></a>
        <a href="/list?cate=etc"><img src="https://image-logo.alba.kr/data_image2/jobimg/201806/2018060217223945248_0.png" alt="atc"></a>
      </div>
    </div>

   
    <script src="/resources/js/index.js"></script>
    
    <script>

function search(){

	var keyword = $("#keyword").val();
	location.href= "search?cate=all&keyword="+keyword;

}


</script>
  </body>
</html>